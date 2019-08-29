package poly.persistance.mapper;

import config.Mapper;
import poly.dto.UserDTO;

@Mapper("UserMapper")
public interface UserMapper {

	int userRegProc(UserDTO uDTO) throws Exception;

	int userReceive(UserDTO uDTO) throws Exception;	
	
	int forgetEmail(UserDTO uDTO) throws Exception;

	String email1(UserDTO uDTO) throws Exception;

	int forgetPassword(UserDTO uDTO)throws Exception;

	String pw(UserDTO uDTO)throws Exception;

	String email2(UserDTO uDTO)throws Exception;

	String que(UserDTO uDTO)throws Exception;

	int answer(UserDTO uDTO)throws Exception;

	UserDTO getUserInfo(UserDTO uDTO) throws Exception;

	int pCheck(String phone)throws Exception;

	int eCheck(String email)throws Exception;

	int userDelete(UserDTO uDTO)throws Exception;

	int Nac(UserDTO uDTO) throws Exception;

	int Phc(UserDTO uDTO) throws Exception;

	int Pwc(UserDTO uDTO) throws Exception;

	int Qac(UserDTO uDTO) throws Exception;



	

}
