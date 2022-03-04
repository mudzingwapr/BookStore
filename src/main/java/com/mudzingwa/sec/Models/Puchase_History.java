package com.mudzingwa.sec.Models;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Puchases")

public class Puchase_History {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
private Integer userid;
	@Column(name="bookid", nullable=false,length=50
			)
private String bookid;
	@Column(name="datepurchased",nullable=false)
private LocalDateTime datetime;
	@Column(name="price",nullable = false)
private Double price;
}
