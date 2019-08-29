package poly.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import poly.service.IChatbotService;



@Controller
public class ChatbotController {
	
private Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="ChatbotService")
	private IChatbotService chatbotservice;

	@RequestMapping(value="/chatbotMain", method=RequestMethod.GET) 
	  public String chatbotMain() throws Exception { 
		log.info("test");
		
	return "/chatbot/chatbotMain";}
	  

}
