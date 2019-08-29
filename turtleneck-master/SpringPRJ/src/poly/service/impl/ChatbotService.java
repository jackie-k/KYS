package poly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.ChatbotDTO;
import poly.persistance.mapper.ChatbotMapper;
import poly.service.IChatbotService;

@Service("ChatbotService")
public class ChatbotService implements IChatbotService{

	@Resource(name="ChatbotMapper")
	private ChatbotMapper ChatbotMapper;
	
	@Override
	public int chatbot(ChatbotDTO cDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int chatbotReceive(ChatbotDTO cDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}

