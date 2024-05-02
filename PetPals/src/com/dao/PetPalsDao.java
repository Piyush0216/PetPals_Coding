package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.EventDto;
import com.exception.InvalidInputException;
import com.exception.InvalidPetAgeException;
import com.model.AdoptionEvent;
import com.model.Donation;
import com.model.Pets;

public interface PetPalsDao {

	int save(Pets pet) throws SQLException,InvalidPetAgeException;

	List<Pets> findAll() throws SQLException;

	boolean isAvailable(int petid) throws SQLException;

	void DeleteById(int petid) throws InvalidInputException, SQLException;

	List<Pets> findAllAvailable() throws SQLException;

	int makeDonation(Donation donation) throws SQLException;

	List<Donation> findAllDonation() throws SQLException;

	List<AdoptionEvent> findAllEvent()throws SQLException;

	List<EventDto> getParticipation()throws SQLException;

	

}
