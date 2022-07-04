package boot.spring1.topic;

public class Topic {

	private String idString;
	private String name;
	private String description;
	
	public Topic() {
		
	}
	
	public Topic(String idString, String name, String description) {
		super();
		this.idString = idString;
		this.name = name;
		this.description = description;
	}
	
	public String getIdString() {
		return idString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
