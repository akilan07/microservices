package com.sample.ms.expenditurecrudservice.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.ToString;

@ToString
@Entity
public class Expenditure {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int expenditureId;
	private String expenditureName;
	private int parentId;
	private double projectedAmt;
	@Column(columnDefinition = "boolean default false")
	private boolean deleteStatus;
	
	public int getExpenditureId() {
		return expenditureId;
	}
	public void setExpenditureId(int expenditureId) {
		this.expenditureId = expenditureId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public double getProjectedAmt() {
		return projectedAmt;
	}
	public void setProjectedAmt(double projectedAmt) {
		this.projectedAmt = projectedAmt;
	}
	public String getExpenditureName() {
		return expenditureName;
	}
	public void setExpenditureName(String expenditureName) {
		this.expenditureName = expenditureName;
	}
	public boolean isDeleteStatus() {
		return deleteStatus;
	}
	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	
	
}
