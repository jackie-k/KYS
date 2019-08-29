package poly.persistance.mapper;

import config.Mapper;
import poly.dto.ChatbotDTO;

@Mapper ("ChatbotMapper")
public interface ChatbotMapper {
	
	public int chatbotReceive(ChatbotDTO cDTO) throws Exception;

}
