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

	public ClownDTO(int numFriends) {
		super();
		this.numFriends = numFriends;
	}

	public ClownDTO(int id, long cc, String name, String educationLevel) {
		super(id, cc, name, educationLevel);
		// TODO Auto-generated constructor stub
	}

	public int getNumFriends() {
		return numFriends;
	}

	public void setNumFriends(int numFriends) {
		this.numFriends = numFriends;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
