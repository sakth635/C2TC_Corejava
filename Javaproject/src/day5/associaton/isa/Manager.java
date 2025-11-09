package day5.associaton.isa;

public class Manager extends Employee {
	private int teamSize;

	// constructors
	public Manager() {
		super();

	}

	public Manager(String name, int employeeId, String department, int teamSize) {
		this.teamSize = teamSize;
	}

	// getter/setter methods
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [TeamSize=" + teamSize + ", Name=" + getName() + ", EmployeeId=" + getEmployeeId()
				+ ", Department=" + getDepartment() + "]";
	}

	private String getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getEmployeeId() {
		// TODO Auto-generated method stub
		return null;
	}
}
