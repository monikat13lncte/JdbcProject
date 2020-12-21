package com.coforge.SpringEx.SpringJDBC.service;

import java.util.List;

import com.coforge.SpringEx.SpringJDBC.entity.Laptop;

public interface LaptopService {
	public void addLaptop(Laptop laptop);
	   public void editLaptop(Laptop laptop, int serialNo);
	   public List<Laptop> findAll();
}
