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
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + getId());
		sb.append("\nDocument: " + getCc());
		sb.append("\nName: " + getName());
		sb.append("\nEducation level: " + getEducationLevel());
		sb.append("\nNumber of friends: " + numFriends  + "\n");
		return sb.toString();
	}
}
