package co.edu.unbosque.model;

public class ComedianDTO extends PersonDTO{
	
	private boolean hasJob;
	
	public ComedianDTO() {
		// TODO Auto-generated constructor stub
	}

	public ComedianDTO(boolean hasJob) {
		super();
		this.hasJob = hasJob;
	}

	public ComedianDTO(int id, long cc, String name, String educationLevel) {
		super(id, cc, name, educationLevel);
		// TODO Auto-generated constructor stub
	}

	public ComedianDTO(int id, long cc, String name, String educationLevel, boolean hasJob) {
		super(id, cc, name, educationLevel);
		this.hasJob = hasJob;
	}

	public boolean isHasJob() {
		return hasJob;
	}

	public void setHasJob(boolean hasJob) {
		this.hasJob = hasJob;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
