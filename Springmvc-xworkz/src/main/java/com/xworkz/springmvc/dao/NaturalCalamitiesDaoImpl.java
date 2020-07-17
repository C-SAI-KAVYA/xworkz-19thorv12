package com.xworkz.springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springmvc.dto.NaturalCalamitiesDto;

@Component
public class NaturalCalamitiesDaoImpl implements NaturalCalamitiesDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public NaturalCalamitiesDto persist(NaturalCalamitiesDto dto) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			System.out.println("Session Object Created");
			session.beginTransaction();
			System.out.println("Transaction Started");
			session.save(dto);
			System.out.println("DTO Saved");
			session.flush();
			session.getTransaction().commit();
			System.out.println("Transaction Committed");
		}catch(Exception e) {
			System.err.println("Exception Occured While Saving The DTO Object "+e.getMessage());
			session.getTransaction().rollback();
		}finally {
			System.out.println("Closing Session");
			session.close();
		}
		return dto;
	}
}
