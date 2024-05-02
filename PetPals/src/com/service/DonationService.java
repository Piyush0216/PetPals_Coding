package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.PetPalsDao;
import com.daoImpl.PetPalsDaoImpl;
import com.model.Donation;

public class DonationService {
	PetPalsDao dao = new PetPalsDaoImpl();

	public int makeDonation(Donation donation) throws SQLException {
		// TODO Auto-generated method stub
		
		return dao.makeDonation(donation);
	}

	public List<Donation> findAllDonation() throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAllDonation();
	}

}
