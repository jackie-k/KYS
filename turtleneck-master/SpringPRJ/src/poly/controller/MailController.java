package poly.controller;

import java.util.Random;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import poly.util.CmmUtil;


@Controller
public class MailController {
	int sum=0;
	@Autowired
	private JavaMailSender mailSender;

	// 인증번호전송 코드
	@RequestMapping(value = "mailSending.do", method=RequestMethod.POST)
	public @ResponseBody int mailSending(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Random R = new Random();
		int[] nums=new int[6];
		int num;
		for(int i=0;i<6;i++) {
			num=R.nextInt(8)+1;
			nums[i]=num;
		}
		sum=nums[0]*100000+nums[1]*10000+nums[2]*1000+nums[3]*100+nums[4]*10+nums[5];
		String setfrom = "pch000720@gmail.com";
		String tomail=CmmUtil.nvl(request.getParameter("email"));// 받는 사람 이메일
		String title ="3S 회원가입 인증번호"; // 제목
		String content = "회원님이 입력하실 인증번호는 "+sum+"입니다."; // 내용

		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message,
					true, "UTF-8");

			messageHelper.setFrom(setfrom); // 보내는사람 생략하면 정상작동을 안함
			messageHelper.setTo(tomail); // 받는사람 이메일
			messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
			messageHelper.setText(content); // 메일 내용

			mailSender.send(message);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(sum);
		return sum;
	}
	@RequestMapping(value = "iCheck.do", method=RequestMethod.POST)
	public @ResponseBody int iCheck(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ib=CmmUtil.nvl(request.getParameter("ib"));
		String s=""+sum;
		int result=0;
		if(s.equals(ib)) {
		result=1;
		}
		System.out.println(sum);
		return result;
	}

}
