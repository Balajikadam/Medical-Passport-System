package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IUserDao;
import com.app.pojos.Users;

@Service
@Transactional
public class UserServicesImpl implements IUserService{
	
	  @Autowired 
	  private IUserDao dao;
	  
	  public UserServicesImpl() {
		System.out.println("in user services");
	}

	@Override
	public List<Users> getAllUsers() {
		return dao.findAll();
	}
	  
	 

}
