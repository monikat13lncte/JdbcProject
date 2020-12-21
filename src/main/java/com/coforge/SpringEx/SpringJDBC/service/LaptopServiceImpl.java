package com.coforge.SpringEx.SpringJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.SpringEx.SpringJDBC.dao.Laptopdao;
import com.coforge.SpringEx.SpringJDBC.entity.Laptop;

@Service("laptopService")
public class LaptopServiceImpl implements LaptopService{
	@Autowired
    Laptopdao laptopDao;
	public void addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		laptopDao.addLaptop(laptop);
	}

	public void editLaptop(Laptop laptop, int serialNo) {
		// TODO Auto-generated method stub
		laptopDao.editLaptop(laptop, serialNo);
	}

	public List<Laptop> findAll() {
		// TODO Auto-generated method stub
		return laptopDao.findAll();
	}

}
