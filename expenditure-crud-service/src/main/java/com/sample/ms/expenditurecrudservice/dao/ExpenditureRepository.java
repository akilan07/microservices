package com.sample.ms.expenditurecrudservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.ms.expenditurecrudservice.modal.Expenditure;

public interface ExpenditureRepository extends JpaRepository<Expenditure, Integer>{
	
	Expenditure findByExpenditureIdAndDeleteStatus(int expenditureId, boolean deleteStatus);
	
}