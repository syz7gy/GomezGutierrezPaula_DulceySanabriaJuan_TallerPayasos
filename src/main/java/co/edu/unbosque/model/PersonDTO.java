package co.edu.unbosque.model;

public class PersonDTO {
	private int id;
	private long cc;
	private String name;
	private String educationLevel;

	public PersonDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonDTO(int id, long cc, String name, String educationLevel) {
		super();
		this.id = id;
		this.cc = cc;
		this.name = name;
		this.educationLevel = educationLevel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCc() {
		return cc;
	}

	public void setCc(long cc) {
		this.cc = cc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

}
