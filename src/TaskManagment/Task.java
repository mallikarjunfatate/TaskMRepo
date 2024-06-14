package TaskManagment;

public class Task {
	private String taskId;
	private String description;
	private String type;
	
	public Task(String taskId, String description, String type) 
	{
		super();
		this.taskId = taskId;
		this.description = description;
		this.type = type;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
