package com.hrms.promotion.entity;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "promotion_request" , schema = "promotion")
public class PromotionRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Integer userId;
	
	@ManyToOne
	@JoinColumn(name = "designation_id" , referencedColumnName = "id")
	private Designation designation;
	
	private String remark;
	private String status;
	private String recommendedBy;
	@CreationTimestamp
	private Date created_At;
	
}
