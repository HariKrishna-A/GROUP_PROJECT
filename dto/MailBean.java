package com.ustglobal.mailapp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "Mail_info")
public class MailBean {
	
	@Id
	@Column
	private int id;
	@Column
	private String subject;
	@Column
	private String message;
	@Column
	private String status; 
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id",nullable = false)
	private UserBean From_id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="id", nullable = false)
	private UserBean To_id;

}
