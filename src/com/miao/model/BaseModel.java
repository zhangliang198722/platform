package com.miao.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public abstract class BaseModel {
	protected String id;
	
	public abstract String getId();
	
	public abstract void setId(String id);
	
}
