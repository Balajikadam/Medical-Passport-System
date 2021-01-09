package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IDoctorsDao;
import com.app.pojos.Doctors;
import com.app.pojos.Users;

@Service
@Transactional
public class DoctorServiceImpl implements IDoctorService {

	
	@Autowired
	private IDoctorsDao dao;
	@Override
	public List<Doctors> listAllDoctors() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	

}
