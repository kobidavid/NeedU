package com.needyou.NeedU.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chat")
public class Chat {

	@Id  //primar'y key
	@Column(name="chat_id")	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long chatId;
	
	@Column(name="need_id")
	private long needId;
	
	@Column(name="helper_id")
	private long helperId;

	@Column(name="needer_id")
	private long neederId;
	
}
