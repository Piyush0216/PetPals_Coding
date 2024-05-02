package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.PetPalsDao;
import com.daoImpl.PetPalsDaoImpl;
import com.dto.EventDto;
import com.model.AdoptionEvent;

public class AdoptionService {
	PetPalsDao dao = new PetPalsDaoImpl();

	public List<AdoptionEvent> findAllEvent()throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAllEvent();
	}

	public List<EventDto> getParticipation()throws SQLException {
		// TODO Auto-generated method stub
		return dao.getParticipation();
	}

	

}
