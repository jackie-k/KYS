package poly.persistance.mapper;

import java.util.List;

import config.Mapper;
import poly.dto.AdminDTO;

@Mapper("AdminMapper")
public interface AdminMapper {

	public int adminReceive(AdminDTO aDTO) throws Exception;

	public List<AdminDTO> getMemberList() throws Exception;

}
