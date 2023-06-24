package com.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "SHARE", uniqueConstraints = { @UniqueConstraint(columnNames = { "USER_ID", "VIDEO_ID" }) })
public class Share {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	private String EMAILS;
	@ManyToOne
	@JoinColumn(name = " USER_ID")
	User user;
	@ManyToOne
	@JoinColumn(name = "VIDEO_ID")
	Video video;
	@Temporal(TemporalType.DATE)
	private Date SHAREDATE;
	
	
	public Share() {

	}


	

	public Share( String eMAILS, User user, Video video, Date sHAREDATE) {
		EMAILS = eMAILS;
		this.user = user;
		this.video = video;
		SHAREDATE = sHAREDATE;
	}

	public String getEMAILS() {
		return EMAILS;
	}
	public void setEMAILS(String eMAILS) {
		EMAILS = eMAILS;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public Date getSHAREDATE() {
		return SHAREDATE;
	}
	public void setSHAREDATE(Date sHAREDATE) {
		SHAREDATE = sHAREDATE;
	}
}