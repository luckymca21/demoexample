package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tutorials_tbl")
public class Example {

	@Id
	@GeneratedValue
	private int id;

	public Example() {
		super();
	}

	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "submission")
	private Date submission;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getSubmission() {
		return submission;
	}

	public void setSubmission(Date submission) {
		this.submission = submission;
	}

	public Example(int id, String title, String author, Date submission) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.submission = submission;
	}

}
