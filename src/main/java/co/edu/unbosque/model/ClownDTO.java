package co.edu.unbosque.model;

public class ClownDTO extends PersonDTO{
	private int numFriends;
	
	public ClownDTO() {
		// TODO Auto-generated constructor stub
	}

	public ClownDTO(int id, long cc, String name, String educationLevel, int numFriends) {
		super(id, cc, name, educationLevel);
		this.numFriends = numFriends;
	}

	public int getNumFriends() {
		return numFriends;
	}

	public void setNumFriends(int numFriends) {
		this.numFriends = numFriends;
	}
}
