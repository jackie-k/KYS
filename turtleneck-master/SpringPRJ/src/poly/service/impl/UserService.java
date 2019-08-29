package poly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.UserDTO;
import poly.persistance.mapper.UserMapper;
import poly.service.IUserService;

@Service("UserService")
public class UserService implements IUserService {
	
	@Resource(name="UserMapper")
	private UserMapper userMapper;

	@Override
	public int userRegProc(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.userRegProc(uDTO);
	}

	@Override
	public int userReceive(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.userReceive(uDTO);
	}

	@Override
	public int forgetEmail(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.forgetEmail(uDTO);
	}

	@Override
	public String email1(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.email1(uDTO);
	}

	@Override
	public int forgetPassword(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.forgetPassword(uDTO);
	}

	@Override
	public String pw(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.pw(uDTO);
	}

	@Override
	public String email2(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.email2(uDTO);
	}

	@Override
	public String que(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.que(uDTO);
	}

	@Override
	public int answer(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.answer(uDTO);
	}

	@Override
	public UserDTO getUserInfo(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getUserInfo(uDTO);
	}

	@Override
	public int pCheck(String phone) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.pCheck(phone);
	}

	@Override
	public int eCheck(String email) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.eCheck(email);
	}

	@Override
	public int userDelete(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.userDelete(uDTO);
	}

	@Override
	public int Nac(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.Nac(uDTO);
	}

	@Override
	public int Phc(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.Phc(uDTO);
	}

	@Override
	public int Pwc(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.Pwc(uDTO);
	}

	@Override
	public int Qac(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.Qac(uDTO);
	}

	



}
