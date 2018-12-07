package com.needyou.NeedU.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "need")
public class Need {

	@Id  //primar'y key
	@Column(name="need_id")	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long needId;
	
	@Column(name="need_name")
	private String needName;

	@Column(name="need_details")
	private String needDetails;
	
	@Column(name="need_status")
	private String needStatus;

}
