package poly.service;

import poly.dto.ChatbotDTO;

public interface IChatbotService {
	

	int chatbotReceive(ChatbotDTO cDTO) throws Exception;

	int chatbot(ChatbotDTO cDTO) throws Exception;
	

}
