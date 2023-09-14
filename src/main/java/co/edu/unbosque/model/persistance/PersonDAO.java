package co.edu.unbosque.model.persistance;

import java.sql.SQLException;
import java.util.ArrayList;

import co.edu.unbosque.controller.DBconnection;
import co.edu.unbosque.model.PersonDTO;

public class PersonDAO implements CRUDOperation{
	private ArrayList<PersonDTO> people;
	private DBconnection dbcon;

	public PersonDAO() {
		people = new ArrayList<PersonDTO>();

	}

	@Override
	public void create(Object o, String database) {
		PersonDTO person = (PersonDTO) o;
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement("INSERT INTO "+ database +" VALUES(?,?,?,?);"));
			dbcon.getPreparedStatement().setInt(1, person.getId());
			dbcon.getPreparedStatement().setLong(2, person.getCc());
			dbcon.getPreparedStatement().setString(3, person.getName());
			dbcon.getPreparedStatement().setString(4, person.getEducationLevel());
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		people.add((PersonDTO) o);
	}

	@Override
	public void create(String... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String readAll() {
		String exit = "";
		people.clear();
		dbcon.initConnection();
		try {
			dbcon.setStatement(dbcon.getConnect().createStatement());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int updateById(int id, String... args) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
