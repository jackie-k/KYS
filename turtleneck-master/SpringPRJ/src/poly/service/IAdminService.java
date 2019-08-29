package poly.service;

import java.util.List;

import poly.dto.AdminDTO;

public interface IAdminService {

	public int adminReceive(AdminDTO aDTO) throws Exception;

	public List<AdminDTO> getMemberList() throws Exception;

	public AdminDTO getAdminDetail(String seq) throws Exception;

	public int updateMember(AdminDTO aDTO) throws Exception;

}
