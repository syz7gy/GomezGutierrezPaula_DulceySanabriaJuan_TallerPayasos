package co.edu.unbosque.model.persistance;

public interface CRUDOperation {
	
	public void create(Object o, String database);
	public void create(String ... args);
	public String readAll();
	public int updateById(int id, String ... args);
	public int deleteById(int id);

}
