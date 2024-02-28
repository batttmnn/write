package com.boot.practice.write;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Write {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer no;
	
	@Column
	private String name;
	
	@Column
	private String title;
	
	@Column
	private String content;
	
	private LocalDateTime createDate;
	
	@OneToMany(mappedBy = "write" , cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	
	private List<Reply> replyList;
	@ManyToOne
	private String id;
	
	
}
