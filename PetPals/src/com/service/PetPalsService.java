package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.PetPalsDao;
import com.daoImpl.PetPalsDaoImpl;
import com.exception.InvalidInputException;
import com.exception.InvalidPetAgeException;
import com.model.Pets;

public class PetPalsService {
	PetPalsDao dao=new PetPalsDaoImpl();

	public int save(Pets pet) throws SQLException,InvalidPetAgeException {
		// TODO Auto-generated method stub
		if(pet.getAge()<=0) {
			throw new InvalidPetAgeException("Invalid age,Enter Valid Age ");
		}
		return dao.save(pet);
		
	}

	public List<Pets> findAll() throws SQLException{
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public void DeleteById(int petid)throws InvalidInputException, SQLException {
		// TODO Auto-generated method stub
		boolean isIdValid = dao.isAvailable(petid);
		if(!isIdValid)
			throw new InvalidInputException("Id given is Invalid");
		 
		dao.DeleteById(petid);
		
	}

	public List<Pets> findAllAvailable()throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAllAvailable();
	}

	

}
