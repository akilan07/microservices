package com.sample.ms.expenditurecrudservice.dto;

import com.sample.ms.expenditurecrudservice.modal.Expenditure;

import lombok.ToString;

@ToString
public class ExpenditureDTO {
	
	private Expenditure expenditure;
	private int responseCode;
	private String responseStatus;

	public Expenditure getExpenditure() {
		return expenditure;
	}

	public void setExpenditure(Expenditure expenditure) {
		this.expenditure = expenditure;
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
