package com.ps20520;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;


@NamedStoredProcedureQuery(name = "spFavoriteByYear", 
procedureName = "spFavoriteByYear", resultClasses = Report.class,
parameters = {
    @StoredProcedureParameter(name = "Year", // this was wrong
                              mode = ParameterMode.IN, type = Integer.class) })

@Entity
public class Report {

	// Vì khi truy vấn ta có sử dụng group by cho thuộc tính title nên mỗi title là
	// diu nhất
	@Id
	Serializable group;
	// khi truy vấn sử dụng count() nên kiểu trả về là Long
	Long like;
	Date newest;
	Date olsest;

	public Report(Serializable group, Long like, Date newest, Date olsest) {

		this.group = group;
		this.like = like;
		this.newest = newest;
		this.olsest = olsest;
	}

	public Serializable getGroup() {
		return group;
	}

	public void setGroup(Serializable group) {
		this.group = group;
	}

	public Long getLike() {
		return like;
	}

	public void setLike(Long like) {
		this.like = like;
	}

	public Date getNewest() {
		return newest;
	}

	public void setNewest(Date newest) {
		this.newest = newest;
	}

	public Date getOlsest() {
		return olsest;
	}

	public void setOlsest(Date olsest) {
		this.olsest = olsest;
	}

}
