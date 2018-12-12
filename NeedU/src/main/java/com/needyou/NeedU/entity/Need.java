package com.needyou.NeedU.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "need")
public class Need {

	@Id  //primar'y key
	@Column(name="id")	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long needId;
	
	@Column(name="need_name")
	private String needName;

	@Column(name="need_details")
	private String needDetails;
	
	@Column(name="need_status")
	private String needStatus;
	
	@Column(name="helper")
	private String helper;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bneeder")
    public User getUser() {
        return getUser();
    }
	
//	 @OneToOne(fetch = FetchType.LAZY, optional = false)
//	    @JoinColumn(name = "id", nullable = false)
//	    private User user;
	 	
}
