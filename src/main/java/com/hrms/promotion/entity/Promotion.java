package com.hrms.promotion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(schema = "promotion", name = "promotion")
public class Promotion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2921796712335297257L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;	

	private Integer userId;	

	@ManyToOne
	@JoinColumn(name = "designation_id", referencedColumnName = "id")
	private Designation designation;
	
	@CreatedDate
	private Date promotedDate;
	private String remark;
	private int salary;
	private String promotedBy;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public Date getPromotedDate() {
		return promotedDate;
	}
	public void setPromotedDate(Date promotedDate) {
		this.promotedDate = promotedDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPromotedBy() {
		return promotedBy;
	}
	public void setPromotedBy(String promotedBy) {
		this.promotedBy = promotedBy;
	}
	
	
	
	
}