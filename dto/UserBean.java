package com.ustglobal.mailapp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "User_info")
public class UserBean {
	
	@Id
	@Column
	private int id;
	@Column
	private String user_name;
	@Column
	private String email;
	@Column
	private String password;

	@Exclude
	@OneToMany(mappedBy = "From_id")
	private List<MailBean> mailBeans;
	
	@Exclude
	@OneToMany(mappedBy = "To_id")
	private List<MailBean> mailBeans1;
}
