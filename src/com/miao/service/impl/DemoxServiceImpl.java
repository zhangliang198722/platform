package com.miao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miao.dao.DemoxDao;
import com.miao.model.Demox;
import com.miao.service.DemoxService;

@Service
public class DemoxServiceImpl implements DemoxService{
	
	@Autowired
	private DemoxDao demoxDao;
	public void save(Demox demox) {
		demoxDao.save(demox);
	}

}
