package co.edu.unbosque.model.persistance;

import java.sql.SQLException;
import java.util.ArrayList;

import co.edu.unbosque.controller.DBconnection;
import co.edu.unbosque.model.ClownDTO;

public class ClownDAO implements CRUDOperation{
	
	private ArrayList<ClownDTO> clowns;
	private DBconnection dbcon;
	
	public ClownDAO() {
		clowns = new ArrayList<ClownDTO>();
		dbcon = new DBconnection();
	}

	@Override
	public void create(Object o, String database) {
		ClownDTO clown = (ClownDTO) o;
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement("INSERT INTO "+ database +" VALUES(?,?,?,?);"));
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
		String database = args[5];
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement("INSERT INTO "+ database +" VALUES(?,?,?,?);"));
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
		// TODO Auto-generated method stub
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
