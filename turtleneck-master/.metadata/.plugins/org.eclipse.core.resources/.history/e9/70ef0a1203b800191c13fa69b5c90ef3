package poly.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import poly.dto.UserDTO;
import poly.service.IUserService;
import poly.util.CmmUtil;

@Controller
public class UserController {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="UserService")
	private IUserService userservice;

	@RequestMapping(value="/userReg")
	public String userReg() throws Exception{
		
		return "/user/userReg";
	}
	
	@RequestMapping(value="/index")
	public String index() throws Exception{
		return "/index";
	}
	
	@RequestMapping(value="/userRegProc")
	public String userRegProc(HttpServletRequest request,Model model) throws Exception{
	
		
		String userEmail = request.getParameter("userEmail");
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		String userBirth = request.getParameter("userBirth");
		String userPhone = request.getParameter("userPhone");
		String userGender = request.getParameter("userGender");
		String userQuestion = request.getParameter("userQuestion");
		String userAnswer = request.getParameter("userAnswer");
		log.info("userEmail 확인:"+userEmail);
		log.info("userName 확인:"+userName);
		log.info("userPassword 확인:"+userPassword);
		log.info("userBirth 확인:"+userBirth);
		log.info("userPhone 확인:"+userPhone);
		log.info("userGender 확인:"+userGender);
		log.info("userQuestion 확인:"+userQuestion);
		log.info("userAnswer 확인:"+userAnswer);
		
		UserDTO uDTO =new UserDTO();
		uDTO.setUserEmail(userEmail);
		uDTO.setUserName(userName);
		uDTO.setUserPassword(userPassword);
		uDTO.setUserBirth(userBirth);
		uDTO.setUserPhone(userPhone);
		uDTO.setUserGender(userGender);
		uDTO.setUserQuestion(userQuestion);
		uDTO.setUserAnswer(userAnswer);
		
		int result = 0;
		
		result=userservice.userRegProc(uDTO);
		log.info("결과값:"+result);
		
		String msg, url;
		if(result ==1) {
			msg="회원가입 성공";
			url="/index.do";
		}else {
			msg="회원가입 실패";
			url="/userReg.do";
		}
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		
		return "/redirect";
	}
	
	
	
	 @RequestMapping(value="/userReceive")
	 public String receive(HttpServletRequest request,Model model, HttpSession session) throws Exception {
		 String userEmail = request.getParameter("userEmail");
		 String userPassword = request.getParameter("userPassword");

		 log.info("userEmail 확인:"+userEmail);
		 log.info("userPassword 확인:"+userPassword);
		 
		 UserDTO uDTO = new UserDTO();
		 uDTO.setUserEmail(userEmail);
		 uDTO.setUserPassword(userPassword);
		 
		 // service -> mapper.xml에서 select query문으로 request로 받아온
		 // userEmail과 password가 모두 맞는지 확인하고
		 // 일치하는 갯수가 1이면  로그인 후 화면으로 넘기고 아니면 다시 원래 페이지로 돌아감
		 
		 uDTO = userservice.getUserInfo(uDTO);
		 
		 String msg,url;
		 if(uDTO==null) {
			 msg="로그인에 실패하였습니다.";
			 url="/index.do";
		 }else {
			 //session 객체에 유저의 DTO정보를 담음
			 session.setAttribute("userSeq", uDTO.getUserSeq());
			 session.setAttribute("userEmail", uDTO.getUserEmail());
			 session.setAttribute("userName", uDTO.getUserName());
			 session.setAttribute("userPhone", uDTO.getUserPhone());
			 session.setAttribute("userQuestion", uDTO.getUserQuestion());
			 session.setAttribute("userAnswer", uDTO.getUserAnswer());
			 session.setAttribute("userGender", uDTO.getUserGender());
			 session.setAttribute("userBirth", uDTO.getUserBirth());
			 session.setAttribute("userPassword", uDTO.getUserPassword());
			 
			 log.info(" session : " + session);
			 
			 
			 msg="로그인 성공하였습니다.";
			 url="/logcheck.do";
			 
		 }
		 
		 model.addAttribute("msg",msg);
		 model.addAttribute("url",url);
		 return "redirect";		 
	 }

	@RequestMapping(value="/pCheck.do", method=RequestMethod.POST) 
	public @ResponseBody int pCheck (HttpServletRequest request, HttpServletResponse response) throws Exception{
		String phone=CmmUtil.nvl(request.getParameter("phone"));
		int	count = userservice.pCheck(phone);
		return count;
	}
	@RequestMapping(value="/eCheck.do", method=RequestMethod.POST) 
	public @ResponseBody int eCheck (HttpServletRequest request, HttpServletResponse response) throws Exception{
		String email=CmmUtil.nvl(request.getParameter("email"));
		int	count = userservice.eCheck(email);
		return count;
	}
	 @RequestMapping(value="/logout")
	 public String logout(HttpSession session,Model model) throws Exception {
		 session.invalidate();
		 
		 String msg, url;
				msg="로그아웃에 성공하였습니다.";
				url="/index.do";
				
			model.addAttribute("msg",msg);
			model.addAttribute("url",url);
		 
		 return "redirect";
	 }
	 @RequestMapping(value="/userDelete")
	 public String userDelete(Model model,HttpSession session) throws Exception {
		 String userEmail=(String)session.getAttribute("userEmail");
		 
		 log.info(userEmail);
		 
		 UserDTO uDTO =new UserDTO();
		 uDTO.setUserEmail(userEmail);
		 
		 int result=0;
		 result=userservice.userDelete(uDTO);
		 log.info(result);
		 String msg, url;
			if(result ==1) {
				msg="회원탈퇴 성공";
				url="/index.do";
				session.invalidate();
			}else {
				msg="회원탈퇴 실패";
				url="/mainA.do";
			}
			model.addAttribute("msg",msg);
			model.addAttribute("url",url);
			
			return "/redirect";
		 
		
		
	 }
	  @RequestMapping(value="/forgetEmail")
	  public String forgetE (HttpServletRequest request, Model model) throws Exception {
		  
		  String userName = request.getParameter("userName");	 
		  String userPhone = request.getParameter("userPhone");
		 
		  log.info("userName 확인:"+userName);
		  log.info("userPhone 확인:"+userPhone);
		  
		  UserDTO uDTO =new UserDTO();
		  uDTO.setUserName(userName);
		  uDTO.setUserPhone(userPhone);
		  int result=0;
		  String email1,email2;
		  
		  result=userservice.forgetEmail(uDTO);
		  log.info("결과값:"+result);
		  
		  email1=userservice.email1(uDTO);
		  email2=userservice.email2(uDTO);
		  String msg,url;
		  if(result==0) {
			 msg="등록하신 정보의 회원이 없습니다.";
			 url="/forgetE.do";
		 }else {
			 msg="회원님의 아이디는 "+email1+"*****"+email2+ "입니다.";
			 url="/index.do";
		 }
		 model.addAttribute("msg",msg);
		 model.addAttribute("url",url);
		  
		  return "redirect"; 
	  }
	  @RequestMapping(value="forgetE", method=RequestMethod.GET)
	  public String forgetE (HttpServletRequest request, HttpServletResponse response, ModelMap
	  model) throws Exception {
	  return "/user/forgetE"; 
	  }
	
	  @RequestMapping(value="forgetP", method=RequestMethod.GET)
	  public String forgetP (HttpServletRequest request, HttpServletResponse response, ModelMap
	  model) throws Exception {
	  return "/user/forgetP"; 
	  }
	  
	  @RequestMapping(value="/forgetPassword")
	  public String forgetP (HttpServletRequest request, Model model) throws Exception {
		  
		  String userEmail = request.getParameter("userEmail");	 
		 
		  log.info("userEmail 확인:"+userEmail);
		  
		  UserDTO uDTO =new UserDTO();
		  uDTO.setUserEmail(userEmail);
		  
		  int result=0;
		  String que;
		  result=userservice.forgetPassword(uDTO);
		  log.info("결과값:"+result);
		  que=userservice.que(uDTO);
		  
		  String msg,url,as;
		  if(result==0) {
			 msg="등록하신 정보의 회원이 없습니다.";
			 url="/forgetP.do";
			 model.addAttribute("msg",msg);
			 model.addAttribute("url",url);
			 return "/redirect";			 
		 }else {
			 as=que;
			 msg="비밀번호 찾기 문제로 이동.";
			 url="/question.do";
			 model.addAttribute("as",as);
			 model.addAttribute("msg",msg);
			 model.addAttribute("url",url);
			 return "/user/question";
			 
		 }
		
	  }
	  @RequestMapping(value="/questionProc")
	  public String questionProc (HttpServletRequest request, Model model) throws Exception {
		  
		  String userAnswer = request.getParameter("userAnswer");	 
		  String userQuestion = request.getParameter("userQuestion");
		  
		  log.info("userAnswer 확인:"+userAnswer);
		  log.info("userQuestion 확인:"+userQuestion);
		  
		  UserDTO uDTO =new UserDTO();
		  uDTO.setUserAnswer(userAnswer);
		  uDTO.setUserQuestion(userQuestion);
		  
		  int result=0;
		  String pw;
		  
		  result=userservice.answer(uDTO);
		  log.info("결과값:"+result);
		  
		  pw=userservice.pw(uDTO);
		  String msg,url;
		  if(result==0) {
			 msg="문제의 답이 옳지 않습니다.";
			 url="/forgetP.do";
		 }else {
			 msg="회원님의 비밀번호는 "+pw+" 입니다.";
			 url="/index.do";
		 }
		 model.addAttribute("msg",msg);
		 model.addAttribute("url",url);
		  
		  return "redirect"; 
	  }
	  @RequestMapping(value="/mpaproc")
	  public String mpa1proc (HttpServletRequest request, Model model, HttpSession session) throws Exception{
		  String userPassword=request.getParameter("userPassword");
		  String userEmail=(String)session.getAttribute("userEmail");
		  
		  log.info("userPassword 확인: "+userPassword);
		  log.info("userEmail 확인: "+userEmail);
		  
		  UserDTO uDTO=new UserDTO();
		  uDTO.setUserPassword(userPassword);
		  uDTO.setUserEmail(userEmail);
		  
		  uDTO = userservice.getUserInfo(uDTO);
			 
			 String msg,url;
			 if(uDTO==null) {
				 msg="비밀번호가 옳지 않습니다.";
				 url="/mpa1.do";
			 }else { 
				 msg="회원정보 상세 페이지로 넘어갑니다.";
				 url="/mpa2.do";
				 
			 }
			 
			 model.addAttribute("msg",msg);
			 model.addAttribute("url",url);
			 return "redirect";	
	  }
	  @RequestMapping(value="/mpbproc")
	  public String mpb1proc (HttpServletRequest request, Model model, HttpSession session) throws Exception{
		  String userPassword=request.getParameter("userPassword");
		  String userEmail=(String)session.getAttribute("userEmail");
		  
		  log.info("userPassword 확인: "+userPassword);
		  log.info("userEmail 확인: "+userEmail);
		  
		  UserDTO uDTO=new UserDTO();
		  uDTO.setUserPassword(userPassword);
		  uDTO.setUserEmail(userEmail);
		  
		  uDTO = userservice.getUserInfo(uDTO);
			 
			 String msg,url;
			 if(uDTO==null) {
				 msg="비밀번호가 옳지 않습니다.";
				 url="/mpb1.do";
			 }else { 
				 msg="회원정보 수정 페이지로 넘어갑니다.";
				 url="/mpb2.do";
				 
			 }
			 
			 model.addAttribute("msg",msg);
			 model.addAttribute("url",url);
			 return "redirect";	
	  }
	  @RequestMapping(value="question", method=RequestMethod.GET)
	  public String question (HttpServletRequest request, HttpServletResponse response, ModelMap
	  model) throws Exception {
	  return "/user/question"; 
	  }
	  @RequestMapping(value="main", method=RequestMethod.GET)
	  public String main (HttpServletRequest request, HttpServletResponse response, ModelMap
	  model) throws Exception {
	  return "/user/main"; 
	  }
	  @RequestMapping(value="logcheck", method=RequestMethod.GET)
	  public String logcheck (HttpServletRequest request, HttpServletResponse response, ModelMap
	  model) throws Exception {
	  return "/user/logcheck"; 
	  }
	  @RequestMapping(value="mainA", method=RequestMethod.GET)
	  public String mainA (HttpServletRequest request, HttpServletResponse response, ModelMap
	  model) throws Exception {
	  return "/mainA"; 
	  }
	  @RequestMapping(value="/mpa1")
		public String mpa1() throws Exception{
			return "/mypage/mpa1";
		}
	  @RequestMapping(value="/mpa2")
		public String mpa2() throws Exception{
			return "/mypage/mpa2";
		}
	  @RequestMapping(value="/mpb1")
	  public String mpb1() throws Exception{
		  return "/mypage/mpb1";
	  }
	  @RequestMapping(value="/mpb2")
	  public String mpb2() throws Exception{
		  return "/mypage/mpb2";
	  }
	  @RequestMapping(value="/NAC")
	  public String NAC() throws Exception{
		  return "/mypage/NAC";
	  }
	  @RequestMapping(value="Nacproc")
	  public String Nacproc(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		  String userName = request.getParameter("userName");
		  String userEmail=(String) session.getAttribute("userEmail");
		  String username=(String) session.getAttribute("userName");
		  log.info("userName 확인: "+userName);
		  log.info("userEmail 확인: "+userEmail);
		  log.info("username 확인: "+username);
		  String msg,url;
		  if(username.equals(userName)) {
			msg="회원님(본인)이  이미 사용중인 이름입니다.";
			url="/NAC.do";
		  }else {
		  
		  UserDTO uDTO=new UserDTO();
		  uDTO.setUserName(userName);
		  uDTO.setUserEmail(userEmail);
		  
		  int result=0;
		  result = userservice.Nac(uDTO);
			 
			 if(result==1) {
				 msg="이름이 변경되었습니다.";
				 url="/mpb2.do";
				 session.setAttribute("userName", uDTO.getUserName());
				 log.info("userName 확인: "+session.getAttribute("userName"));
			 }else { 
				 msg="이름 변경이 실패하였습니다.";
				 url="/NAC.do";
			 }}
			 model.addAttribute("msg",msg);
			 model.addAttribute("url",url);
			 return "redirect";	
	  }
	  
	  @RequestMapping(value="/PHC")
	  public String PHC() throws Exception{
		  return "/mypage/PHC";
	  }
	  @RequestMapping(value="Phcproc")
	  public String Phcproc(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		  String userPhone = request.getParameter("userPhone");
		  String userEmail=(String) session.getAttribute("userEmail");
		  log.info("userPhone 확인: "+userPhone);
		  log.info("userEmail 확인: "+userEmail);
		  String msg,url;
		  
		  
		  UserDTO uDTO=new UserDTO();
		  uDTO.setUserPhone(userPhone);
		  uDTO.setUserEmail(userEmail);
		  
		  int result=0;
		  result = userservice.Phc(uDTO);
			 
			 if(result==1) {
				 msg="휴대폰 번호가 변경되었습니다.";
				 url="/mpb2.do";
				 session.setAttribute("userPhone", uDTO.getUserPhone());
				 log.info("userPhone 확인: "+session.getAttribute("userPhone"));
			 }else { 
				 msg="휴대폰 번호 변경이 실패하였습니다.";
				 url="/PHC.do";
			 }
			 model.addAttribute("msg",msg);
			 model.addAttribute("url",url);
			 return "redirect";	
	  }
	  @RequestMapping(value="/PWC")
	  public String PWC() throws Exception{
		  return "/mypage/PWC";
	  }
	  @RequestMapping(value="Pwcproc")
	  public String Pwcproc(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		  String userPassword = request.getParameter("userPassword");
		  String userEmail=(String) session.getAttribute("userEmail");
	
		  log.info("userEmail 확인: "+userEmail);
		  log.info("userPassword 확인: "+userPassword);
		  String msg,url;
		  
		  
		  UserDTO uDTO=new UserDTO();
		  uDTO.setUserPassword(userPassword);
		  uDTO.setUserEmail(userEmail);
		  
		  int result=0;
		  result = userservice.Pwc(uDTO);
			 
			 if(result==1) {
				 msg="비밀번호가 변경되었습니다.";
				 url="/mpb2.do";
				 session.setAttribute("userPassword", uDTO.getUserPassword());
				 log.info("userPassword 확인: "+session.getAttribute("userPassword"));
			 }else { 
				 msg="비밀번호 변경이 실패하였습니다.";
				 url="/PWC.do";
			 }
			 model.addAttribute("msg",msg);
			 model.addAttribute("url",url);
			 return "redirect";	
	  }
	  @RequestMapping(value="/QAC")
	  public String QAC() throws Exception{
		  return "/mypage/QAC";
	  }
	  @RequestMapping(value="Qacproc")
	  public String Qacproc(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		  String userQuestion = request.getParameter("userQuestion");
		  String userAnswer = request.getParameter("userAnswer");
		  String userEmail=(String) session.getAttribute("userEmail");
	
		  log.info("userQuestion 확인: "+userQuestion);
		  log.info("userAnswer 확인: "+userAnswer);
		  String msg,url;
		  
		  
		  UserDTO uDTO=new UserDTO();
		  uDTO.setUserQuestion(userQuestion);
		  uDTO.setUserAnswer(userAnswer);
		  uDTO.setUserEmail(userEmail);
		  
		  int result=0;
		  result = userservice.Qac(uDTO);
			 
			 if(result==1) {
				 msg="비밀번호 찾기 문제와 답이 변경되었습니다.";
				 url="/mpb2.do";
				 session.setAttribute("userQuestion", uDTO.getUserQuestion());
				 session.setAttribute("userAnswer", uDTO.getUserAnswer());

			 }else { 
				 msg="비밀번호 찾기 문제와 답 변경이 실패하였습니다.";
				 url="/QAC.do";
			 }
			 model.addAttribute("msg",msg);
			 model.addAttribute("url",url);
			 return "redirect";	
	  }
}
