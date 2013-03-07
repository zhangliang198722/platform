package com.miao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table
public class Demox extends BaseModel {
	
	
	private String name;
	private int age;
	private String sex;
	
	@Column(name="name",length=50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Column(name="sex",length=1)
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	@Id
	@GeneratedValue(generator = "paymentableGenerator")    
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")   
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
