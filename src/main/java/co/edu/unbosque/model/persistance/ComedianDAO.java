package co.edu.unbosque.model.persistance;

import java.sql.SQLException;
import java.util.ArrayList;

import co.edu.unbosque.controller.DBconnection;
import co.edu.unbosque.model.ComedianDTO;
import co.edu.unbosque.model.ComedianDTO;
import co.edu.unbosque.model.PersonDTO;

public class ComedianDAO implements CRUDOperation{
	
	private ArrayList<ComedianDTO> comedians;
	private DBconnection dbcon;
	
	public ComedianDAO() {
		comedians = new ArrayList<ComedianDTO>();
		dbcon = new DBconnection();
	}

	@Override
	public void create(Object o, String table) {
		ComedianDTO comedian = (ComedianDTO) o;
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement("INSERT INTO "+ table +" VALUES(?,?,?,?);"));
			dbcon.getPreparedStatement().setInt(1, comedian.getId());
			dbcon.getPreparedStatement().setLong(2, comedian.getCc());
			dbcon.getPreparedStatement().setString(3, comedian.getName());
			dbcon.getPreparedStatement().setString(4, comedian.getEducationLevel());
			dbcon.getPreparedStatement().setInt(5, comedian.getNumPresentations());
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		comedians.add((ComedianDTO) o);
		
	}

	@Override
	public void create(String ... args) {
		ComedianDTO comedian = new ComedianDTO(
				Integer.parseInt(args[0]), Long.parseLong(args[1]), args[2], args[3], Integer.parseInt(args[4]));
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement("INSERT INTO comedian VALUES(?,?,?,?);"));
			dbcon.getPreparedStatement().setInt(1, comedian.getId());
			dbcon.getPreparedStatement().setLong(2, comedian.getCc());
			dbcon.getPreparedStatement().setString(3, comedian.getName());
			dbcon.getPreparedStatement().setString(4, comedian.getEducationLevel());
			dbcon.getPreparedStatement().setInt(5, comedian.getNumPresentations());
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		comedians.add(comedian);
		
	}

	@Override
	public String readAll() {
		String output = "";
		comedians.clear();
		dbcon.initConnection();
		try {
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultSet(dbcon.getStatement().executeQuery("SELECT * FROM comedian;"));
			while(dbcon.getResultSet().next()) {
				int id = dbcon.getResultSet().getInt("id");
				long cc = dbcon.getResultSet().getLong("cc");
				String name = dbcon.getResultSet().getString("name");
				String educationLevel = dbcon.getResultSet().getString("educationlevel");
				int numPresentations = dbcon.getResultSet().getInt("numpresentations");
				
				comedians.add(new ComedianDTO(id, cc, name, educationLevel, numPresentations));
			}
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(ComedianDTO comedian : comedians) {
			output += comedian.toString();
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
			int numPresentations = Integer.parseInt(args[3]);
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultSet(dbcon.getStatement().executeQuery("UPDATE comedian SET cc=" 
										+ cc + ", name=" + name + ", educationLevel=" + educationLevel
										+ ", numpresentations=" + numPresentations + " WHERE id=" + id + ";"));
			ComedianDTO updated = new ComedianDTO(id, cc, name, educationLevel, numPresentations);
			dbcon.getPreparedStatement().executeUpdate();
			comedians.set(id-1, updated);
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
			dbcon.setResultSet(dbcon.getStatement().executeQuery("DELETE FROM comedian WHERE id=" + id + ";"));
			dbcon.getPreparedStatement().executeUpdate();
			comedians.remove(id-1);
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
