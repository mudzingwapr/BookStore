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
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bid;
	@Column(name="tittle",length=100,nullable=false)
	private String tittle;
	@Column(name="author",length=100,nullable=false)
	private String author;
	@Column(name="descrip",length=100,nullable=false)
	private String description;
	@Column(name="price",length=100,nullable=false)
	private Double price;
	@Column(name="date",length=100,nullable=false)
	private LocalDateTime createdTime;

}
