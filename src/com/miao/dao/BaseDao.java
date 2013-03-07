package com.miao.dao;

public interface BaseDao<E>  {
	
	void save(E model);
	void delete(E model);
	void update(E model);

}
