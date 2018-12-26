package com.needyou.NeedU.entity;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "need")
public class Need {

	@Id  //primar'y key
	@Column(name="id")	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long needId;

	@Column(name="need_title")
	private String needTitle;

	@Column(name="need_details")
	private String needDetails;

	@Column(name="need_status")
	private String needStatus;

	//@Column(name="need_owner_user_id")
	//private String needOwnerUserId;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="need_helper_user_id")
	private User helper;  //  helper is just a sign which should be also in User class

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="need_owner_user_id")
	private User owner;  //  owner is just a sign which should be also in User class
	
}



