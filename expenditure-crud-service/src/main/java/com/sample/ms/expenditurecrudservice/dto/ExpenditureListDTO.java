package com.sample.ms.expenditurecrudservice.dto;

import java.util.List;

import com.sample.ms.expenditurecrudservice.modal.Expenditure;

import lombok.ToString;

@ToString
public class ExpenditureListDTO {
	
	private List<Expenditure> expenditures;
	private int responseCode;
	private String responseStatus;
	
	public List<Expenditure> getExpenditures() {
		return expenditures;
	}
	public void setExpenditures(List<Expenditure> expenditures) {
		this.expenditures = expenditures;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	
}
