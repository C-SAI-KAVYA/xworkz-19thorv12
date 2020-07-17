package com.xworkz.springmvc.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
@Entity
@Table(name = "nc", schema = "naturalcalamities")
public class NaturalCalamitiesDto implements Serializable{
	@Id
	@Column(name = "id")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	@Column(name = "place")
	private String place;
	@Column(name = "date")
	private String date;
	@Column(name = "capturedBy")
	private String capturedBy;
	@Column(name = "calamityType")
	private String calamityType;
	@Column(name = "area")
	private String area;
	@Column(name = "averageLoss")
	private Double averageLoss;
	@Column(name = "noOfDeaths")
	private Integer noOfDeaths;
	@Column(name = "noOfInjured")
	private Integer noOfInjured;
	
	public NaturalCalamitiesDto( String place, String date, String capturedBy, String calamityType, String area,
			Double averageLoss, Integer noOfDeaths, Integer noOfInjured) {
		super();
//		this.id = id;
		this.place = place;
		this.date = date;
		this.capturedBy = capturedBy;
		this.calamityType = calamityType;
		this.area = area;
		this.averageLoss = averageLoss;
		this.noOfDeaths = noOfDeaths;
		this.noOfInjured = noOfInjured;
	}
	
	public NaturalCalamitiesDto() {
		System.out.println("Created Natural Calamities \t"+this.getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

//	public void setId(Integer id) {
//		this.id = id;
//	}

	public String getplace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getDate() {
		return date;
	}

	public void setString(String date) {
		this.date = date;
	}

	public String getCapturedBy() {
		return capturedBy;
	}

	public void setCapturedBy(String capturedBy) {
		this.capturedBy = capturedBy;
	}

	public String getCalamityType() {
		return calamityType;
	}

	public void setCalamityType(String calamityType) {
		this.calamityType = calamityType;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Double getAverageLoss() {
		return averageLoss;
	}

	public void setAverageLoss(Double averageLoss) {
		this.averageLoss = averageLoss;
	}

	public Integer getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(Integer noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

	public Integer getNoOfInjured() {
		return noOfInjured;
	}

	public void setNoOfInjured(Integer noOfInjured) {
		this.noOfInjured = noOfInjured;
	}

	@Override
	public String toString() {
		return "NaturalCalamitiesDto [id=" + id + ", place=" + place + ", date=" + date + ", capturedBy=" + capturedBy
				+ ", calamityType=" + calamityType + ", area=" + area + ", averageLoss=" + averageLoss + ", noOfDeaths="
				+ noOfDeaths + ", noOfInjured=" + noOfInjured + "]";
	}
	
}
