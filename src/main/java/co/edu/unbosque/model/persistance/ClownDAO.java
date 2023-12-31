package co.edu.unbosque.model.persistance;

import java.sql.SQLException;
import java.util.ArrayList;

import co.edu.unbosque.controller.DBconnection;
import co.edu.unbosque.model.ClownDTO;
import co.edu.unbosque.model.PersonDTO;

public class ClownDAO implements CRUDOperation{
	
	private ArrayList<ClownDTO> clowns;
	private DBconnection dbcon;
	
	public ClownDAO() {
		clowns = new ArrayList<ClownDTO>();
		dbcon = new DBconnection();
	}

	@Override
	public void create(Object o, String table) {
		ClownDTO clown = (ClownDTO) o;
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement("INSERT INTO "+ table +" VALUES(?,?,?,?);"));
			dbcon.getPreparedStatement().setInt(1, clown.getId());
			dbcon.getPreparedStatement().setLong(2, clown.getCc());
			dbcon.getPreparedStatement().setString(3, clown.getName());
			dbcon.getPreparedStatement().setString(4, clown.getEducationLevel());
			dbcon.getPreparedStatement().setInt(5, clown.getNumFriends());
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		clowns.add((ClownDTO) o);
		
	}

	@Override
	public void create(String ... args) {
		ClownDTO clown = new ClownDTO(Integer.parseInt(args[0]), Long.parseLong(args[1]), args[2], args[3], Integer.parseInt(args[4]));
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement("INSERT INTO clown VALUES(?,?,?,?);"));
			dbcon.getPreparedStatement().setInt(1, clown.getId());
			dbcon.getPreparedStatement().setLong(2, clown.getCc());
			dbcon.getPreparedStatement().setString(3, clown.getName());
			dbcon.getPreparedStatement().setString(4, clown.getEducationLevel());
			dbcon.getPreparedStatement().setInt(5, clown.getNumFriends());
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		clowns.add(clown);
		
	}

	@Override
	public String readAll() {
		String output = "";
		clowns.clear();
		dbcon.initConnection();
		try {
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultSet(dbcon.getStatement().executeQuery("SELECT * FROM clown;"));
			while(dbcon.getResultSet().next()) {
				int id = dbcon.getResultSet().getInt("id");
				long cc = dbcon.getResultSet().getLong("cc");
				String name = dbcon.getResultSet().getString("name");
				String educationLevel = dbcon.getResultSet().getString("educationlevel");
				int numFriends = dbcon.getResultSet().getInt("numfriends");
				clowns.add(new ClownDTO(id, cc, name, educationLevel, numFriends));
			}
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(ClownDTO clown : clowns) {
			output += clown.toString();
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
			int numFriends = Integer.parseInt(args[3]);
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultSet(dbcon.getStatement().executeQuery("UPDATE clown SET cc=" 
										+ cc + ", name=" + name + ", educationLevel=" + educationLevel
										+ ", numfriends=" + numFriends + " WHERE id=" + id + ";"));
			ClownDTO updated = new ClownDTO(id, cc, name, educationLevel, numFriends);
			dbcon.getPreparedStatement().executeUpdate();
			clowns.set(id-1, updated);
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
			dbcon.setResultSet(dbcon.getStatement().executeQuery("DELETE FROM clown WHERE id=" + id + ";"));
			dbcon.getPreparedStatement().executeUpdate();
			clowns.remove(id-1);
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
