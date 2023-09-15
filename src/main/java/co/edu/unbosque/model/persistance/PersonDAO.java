package co.edu.unbosque.model.persistance;

import java.sql.SQLException;
import java.util.ArrayList;

import co.edu.unbosque.controller.DBconnection;
import co.edu.unbosque.model.PersonDTO;
import co.edu.unbosque.model.PersonDTO;

public class PersonDAO implements CRUDOperation{
	private ArrayList<PersonDTO> people;
	private DBconnection dbcon;

	public PersonDAO() {
		people = new ArrayList<PersonDTO>();

	}

	@Override
	public void create(Object o, String table) {
		PersonDTO person = (PersonDTO) o;
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement("INSERT INTO "+ table +" VALUES(?,?,?,?);"));
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
		PersonDTO person = new PersonDTO(Integer.parseInt(args[0]), Long.parseLong(args[1]), args[2], args[3]);
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement("INSERT INTO person VALUES(?,?,?,?);"));
			dbcon.getPreparedStatement().setInt(1, person.getId());
			dbcon.getPreparedStatement().setLong(2, person.getCc());
			dbcon.getPreparedStatement().setString(3, person.getName());
			dbcon.getPreparedStatement().setString(4, person.getEducationLevel());
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		people.add(person);
		
	}

	@Override
	public String readAll() {
		String output = "";
		people.clear();
		dbcon.initConnection();
		try {
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultSet(dbcon.getStatement().executeQuery("SELECT * FROM person;"));
			while(dbcon.getResultSet().next()) {
				int id = dbcon.getResultSet().getInt("id");
				long cc = dbcon.getResultSet().getLong("cc");
				String name = dbcon.getResultSet().getString("name");
				String educationLevel = dbcon.getResultSet().getString("educationlevel");
				people.add(new PersonDTO(id, cc, name, educationLevel));
			}
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(PersonDTO person : people) {
			output += person.toString();
		}
		return output;
	}

	@Override
	public int updateById(int id, String... args) {
		try {
			dbcon.initConnection();
			long cc = Long.parseLong(args[0]);
			String name = args[1];
			String educationLevel = args[2];
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultSet(dbcon.getStatement().executeQuery("UPDATE person SET cc=" 
										+ cc + ", name=" + name + ", educationLevel=" + educationLevel
										+ " WHERE id=" + id + ";"));
			PersonDTO updated = new PersonDTO(id, cc, name, educationLevel);
			dbcon.getPreparedStatement().executeUpdate();
			people.set(id-1, updated);
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteById(int id) {
		try {
			dbcon.initConnection();
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultSet(dbcon.getStatement().executeQuery("DELETE FROM person WHERE id=" + id + ";"));
			dbcon.getPreparedStatement().executeUpdate();
			people.remove(id-1);
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
