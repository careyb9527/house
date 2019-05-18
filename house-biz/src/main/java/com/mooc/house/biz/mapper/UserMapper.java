package com.mooc.house.biz.mapper;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.ibatis.annotations.Mapper;

import com.mooc.house.common.model.User;


@Mapper
public interface UserMapper {

	public List<User>  selectUsers();
	
	public int insert(User account);

	public int delete(String email);

	public int update(Use updateUser);

	public List<User> selectUsersByQuery(User user);
}
