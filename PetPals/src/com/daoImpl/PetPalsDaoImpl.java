package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.PetPalsDao;
import com.dto.EventDto;
import com.exception.InvalidInputException;
import com.exception.InvalidPetAgeException;
import com.model.AdoptionEvent;
import com.model.Donation;
import com.model.Pets;
import com.utility.DBConnection;

public class PetPalsDaoImpl implements PetPalsDao {


	@Override
	public int save(Pets pet) throws SQLException, InvalidPetAgeException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql = "insert into pets (petId, name, age, breed, availableToAdopt)  VALUES (?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, pet.getPetId());
		pstmt.setString(2, pet.getName());
		pstmt.setInt(3, pet.getAge());
		pstmt.setString(4, pet.getBreed());
		pstmt.setString(5, pet.getAvailableToAdopt());

		int status = pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}


	@Override
	public List<Pets> findAll() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql = "select * from pets";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Pets> list = new ArrayList<>();
		while (rst.next() == true) {
			int id = rst.getInt("petId");
			String name = rst.getString("name");
			int age = rst.getInt("age");
			String breed = rst.getString("breed");
			String available = rst.getString("availableToAdopt");

			Pets pet = new Pets(id, name, age, breed, available);
			list.add(pet);
		}
		DBConnection.dbClose();
		return list;
	}


	@Override
	public boolean isAvailable(int petid) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql = "select petId from pets where petId=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, petid);

		ResultSet rst = pstmt.executeQuery();

		boolean status = rst.next();
		DBConnection.dbClose();
		return status;

	}


	@Override
	public void DeleteById(int petid) throws InvalidInputException, SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql = " update pets SET  availableToAdopt='no' where petId =?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, petid);
		pstmt.executeUpdate();

		DBConnection.dbClose();

	}

	@Override
	public List<Pets> findAllAvailable() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql = "select * from pets where availableToAdopt ='yes' ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Pets> list = new ArrayList<>();

		while (rst.next() == true) {
			int id = rst.getInt("petId");
			String name = rst.getString("name");
			int age = rst.getInt("age");
			String breed = rst.getString("breed");
			String available = rst.getString("availableToAdopt");
			Pets pet = new Pets(id, name, age, breed, available);
			list.add(pet);
		}
		DBConnection.dbClose();
		return list;
	}


	@Override
	public int makeDonation(Donation donation) throws SQLException {

		Connection con = DBConnection.dbConnect();
		String sql = "insert into donation (donorId,donorName, amount, petId) VALUES (?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, donation.getDonorId());
		pstmt.setString(2, donation.getDonorName());
		pstmt.setDouble(3, donation.getAmount());
		pstmt.setInt(4, donation.getPetId());

		int status = pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}


	@Override
	public List<Donation> findAllDonation() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql = "select * from donation";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Donation> list = new ArrayList<>();

		while (rst.next() == true) {
			int id = rst.getInt("donorId");
			String name = rst.getString("donorName");
			double amount = rst.getDouble("amount");
			int petid = rst.getInt("petId");

			Donation donation = new Donation(id, name, amount, petid);
			list.add(donation);
		}
		DBConnection.dbClose();
		return list;

	}


	@Override
	public List<AdoptionEvent> findAllEvent() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql = "select * from adoptaionevent";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<AdoptionEvent> list = new ArrayList<>();

		while (rst.next() == true) {
			int id = rst.getInt("eventId");
			String name = rst.getString("eventName");
			String date = rst.getString("eventDate");
			String address = rst.getString("eventAddress");

			AdoptionEvent event = new AdoptionEvent(id, name, date, address);
			list.add(event);
		}
		DBConnection.dbClose();
		return list;
	}


	@Override
	public List<EventDto> getParticipation() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql = "select a.eventName,a.eventDate,p.participantName,p.participantType"
				+ "from participant p join adoptaionevent"
				+ "on p.eventId=a.eventId"
				+ "group by a.eventId";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<EventDto> list = new ArrayList<>();

		while (rst.next() == true) {
			int id = rst.getInt("eventId");
			String name = rst.getString("eventName");
			String date = rst.getString("eventDate");
			String address = rst.getString("eventAddress");

			EventDto event = new EventDto(id, name, date, address);
			list.add(event);
		}
		DBConnection.dbClose();
		return list;
	}


	

}
