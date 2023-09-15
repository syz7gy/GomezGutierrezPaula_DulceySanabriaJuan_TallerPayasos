package co.edu.unbosque.model;

public class ComedianDTO extends PersonDTO{
	
	private int numPresentations;
	
	public ComedianDTO() {
		// TODO Auto-generated constructor stub
	}

	public ComedianDTO(int numPresentations) {
		super();
		this.numPresentations = numPresentations;
	}

	public ComedianDTO(int id, long cc, String name, String educationLevel) {
		super(id, cc, name, educationLevel);
		// TODO Auto-generated constructor stub
	}

	public ComedianDTO(int id, long cc, String name, String educationLevel, int numePresentations) {
		super(id, cc, name, educationLevel);
		this.numPresentations = numePresentations;
	}

	public int getNumPresentations() {
		return numPresentations;
	}

	public void setNumPresentations(int numPresentations) {
		this.numPresentations = numPresentations;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + getId());
		sb.append("\nDocument: " + getCc());
		sb.append("\nName: " + getName());
		sb.append("\nEducation level: " + getEducationLevel());
		sb.append("\nNumber of presentations: " + numPresentations  + "\n");
		return sb.toString();
	}
	
	

}
