package poly.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import poly.dto.AdminDTO;
import poly.service.IAdminService;

@Controller
public class AdminController {
	
private Logger log = Logger.getLogger(this.getClass());


	@Resource(name="AdminService")
	private IAdminService adminservice;
		
	@RequestMapping(value="/admin/index")
	public String index() throws Exception{
		log.info(this.getClass().getName());
		
		return "/user/main";
	}
	
	@RequestMapping(value="/admin/adminReceive", method=RequestMethod.POST)
	public String adminReceive(HttpServletRequest request, Model model, HttpSession session ) throws Exception{
		
		String adminEmail = request.getParameter("adminEmail");
		String adminPassword = request.getParameter("adminPassword");

		
		log.info("adminEmail 확인:" + adminEmail);
		log.info("adminPassword 확인:" + adminPassword);

		
		AdminDTO aDTO = new AdminDTO();
		aDTO.setAdminEmail(adminEmail);
		aDTO.setAdminPassword(adminPassword);
		
		int result = 0;
		result = adminservice.adminReceive(aDTO);
		log.info("결과값:" + result);
		
		String msg, url;
		if (result==0) {
			msg = "로그인에 실패하셨습니다";
			url = "/index.do";
		}else {
			msg = "로그인 되었습니다";
			url = "/logcheck.do";
		}
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		
		return "/redirect";
	}
	
	@RequestMapping(value="/admin/memberList")
	public String MemberList(Model model) {
		log.info(this.getClass().getName());
		
		List<AdminDTO> mList = new ArrayList<>();
		
		try {
			mList = adminservice.getMemberList();
			log.info(mList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		model.addAttribute("mList",mList);

		
		return "/admin/memberList"; 
	}
	
	@RequestMapping(value="/admin/memberDetail")
	public String MemberDetail(HttpServletRequest request, Model model) {
		log.info(this.getClass().getName());
		
		String seq = request.getParameter("seq");
		
		AdminDTO aDTO = new AdminDTO();
		
		try {
			aDTO = adminservice.getAdminDetail(seq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("aDTO", aDTO);
		
		return "/admin/memberDetail";
	}
	
	@RequestMapping(value="/admin/memberModify")
	public String MemberModify(HttpServletRequest request, Model model) {
		log.info(this.getClass().getName());
		
		String seq = request.getParameter("seq");
		
		AdminDTO aDTO = new AdminDTO();
		
		try {
			aDTO = adminservice.getAdminDetail(seq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("aDTO",aDTO);
		
		return "/admin/memberModify";
	}
	
	@RequestMapping(value="/admin/memberModifyProc")
	public String MemberModifyProc(HttpServletRequest request, Model model) {
		log.info(this.getClass().getName());
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String seq = request.getParameter("seq");
		
		AdminDTO aDTO = new AdminDTO();
		aDTO.setEmail(email);
		aDTO.setSeq(seq);
		aDTO.setName(name);
		
		int result = 0;
		
		try {
			result = adminservice.updateMember(aDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(result >0) {
			model.addAttribute("msg","수정되었습니다.");
			model.addAttribute("url","/memberDetail.do?seq="+seq);
		}else {
			model.addAttribute("msg","수정에 실패했습니다");
			model.addAttribute("url","/memberDetail.do?seq="+seq);
		}
		
		return "/redirect";
	}
	
	

}
