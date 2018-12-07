package com.needyou.NeedU.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {

	@Id  //primar'y key
	@Column(name="feedback_id")	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long feedbackId;
	
	@Column(name="helper_id")
	private String helperId;

//	@Column(name="neder_id")
//	private String neederId;

}
