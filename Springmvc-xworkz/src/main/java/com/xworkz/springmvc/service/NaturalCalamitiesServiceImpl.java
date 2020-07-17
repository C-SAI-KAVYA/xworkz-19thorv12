package com.xworkz.springmvc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springmvc.dao.NaturalCalamitiesDao;
import com.xworkz.springmvc.dto.NaturalCalamitiesDto;

@Component
public class NaturalCalamitiesServiceImpl implements NaturalCalamitiesService {

	@Autowired
	private NaturalCalamitiesDao dao;

	public NaturalCalamitiesServiceImpl() {
		System.out.println("Created Object \t " + getClass().getSimpleName());
	}

	public boolean validatePersist(NaturalCalamitiesDto dto) {
		boolean valid = false;
		try {
			if (dto != null) {
				System.out.println("Validating the Place");
				String place = dto.getplace();
				if (place != null && !place.isEmpty()) {
					System.out.println("Place is valid");
					valid = true;
				} else {
					System.out.println("Place is not valid");
					valid = false;
				}

//				System.out.println("Validating the date");
//				String date = dto.getDate();
//				if (valid == true && date != null) {
//					System.out.println("date is valid");
//					valid = true;
//				} else {
//					System.out.println("date is not valid");
//					valid = false;
//				}

				System.out.println("Validating the captured by");
				String capturedBy = dto.getCapturedBy();
				if (valid == true && capturedBy != null) {
					System.out.println("capturedBy is valid");
					valid = true;
				} else {
					System.out.println("capturedBy is not valid");
					valid = false;
				}

				System.out.println("Validating the calamity type");
				String calamityType = dto.getCalamityType();
				if (valid == true && calamityType != null) {
					System.out.println("calamityType is valid");
					valid = true;
				} else {
					System.out.println("calamityType is not valid");
					valid = false;
				}

				System.out.println("Validating the area");
				String area = dto.getArea();
				if (valid == true && area != null) {
					System.out.println("area is valid");
					valid = true;
				} else {
					System.out.println("area is not valid");
					valid = false;
				}

				System.out.println("Validating the averageLoss");
				Double averageLoss = dto.getAverageLoss();
				if (valid == true && averageLoss != 0) {
					System.out.println("averageLoss is valid");
					valid = true;
				} else {
					System.out.println("averageLoss is not valid");
					valid = false;
				}

				System.out.println("Validating the noOfDeaths");
				Integer noOfDeaths = dto.getNoOfDeaths();
				if (valid == true && noOfDeaths != 0) {
					System.out.println("noOfDeaths is valid");
					valid = true;
				} else {
					System.out.println("noOfDeaths is not valid");
					valid = false;
				}

				System.out.println("Validating the noOfInjured");
				Integer noOfInjured = dto.getNoOfInjured();
				if (valid == true && noOfInjured != 0) {
					System.out.println("noOfInjured is valid");
					valid = true;
				} else {
					System.out.println("noOfInjured is not valid");
					valid = false;
				}

				if (valid == true) {
					System.out.println("All Fields Are Valid Hence Saving the Given Data");
					dao.persist(dto);
					return valid;
				}
			}
		} catch (Exception e) {
			System.err.println("Exception Occured While Validating the Fields" + e.getMessage());
		}
		return valid;
	}

}
