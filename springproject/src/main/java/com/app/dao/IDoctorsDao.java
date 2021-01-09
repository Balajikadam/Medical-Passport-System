package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Doctors;

public interface IDoctorsDao extends JpaRepository<Doctors, 	Integer>{

}
