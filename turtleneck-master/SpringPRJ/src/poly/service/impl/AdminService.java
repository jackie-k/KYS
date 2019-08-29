package poly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.AdminDTO;
import poly.persistance.mapper.AdminMapper;
import poly.service.IAdminService;

@Service("AdminService")
public class AdminService implements IAdminService{
	
	@Resource(name="AdminMapper")
	private AdminMapper adminMapper;

	@Override
	public int adminReceive(AdminDTO aDTO) throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.adminReceive(aDTO);
	}

	public List<AdminDTO> getMemberList() throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.getMemberList();
	}

	@Override
	public AdminDTO getAdminDetail(String seq) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMember(AdminDTO aDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

}
