package caseStudy;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
	private long budget;
	private String name;
	private int id;
	private long expense;

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	Project() {
	}

	Project(int id, String name, long budget) {
		this.budget = budget;
		this.name = name;
		this.id = id;
		this.expense = 0;
	}

	@Override
	public String toString() {
		return "Id : " + this.id + ", Project Name: " + this.name + ", Budget: " + this.budget;
	}

	public static void main(String[] args) {
		Project project1 = new Project(1, "ATT", 1000);
		Project project2 = new Project(2, "Google", 320);
		User user1 = new User(1, "User1", 100, project1);
		User user2 = new User(2, "User2", 360, project2);
		User user3 = new User(3, "User3", 500, project1);

		ArrayList<User> usersList = new ArrayList<>();
		usersList.add(user1);
		usersList.add(user2);
		usersList.add(user3);
		HashMap<String, ArrayList<User>> map = new HashMap<>();
		map.put("OutOfBudget", new ArrayList<>());
		for (User user : usersList) {
			if (user.getSalary() > 1.1 * (user.getProject().getBudget())) {
				map.get("OutOfBudget").add(user);
			} else {
				map.putIfAbsent(user.getProject().getName(), new ArrayList<>());
				map.get(user.getProject().getName()).add(user);
			}
		}
		System.out.println(map);

	}

	public long getExpense() {
		return expense;
	}

	public void setExpense(long expense) {
		this.expense = expense;
	}

}

class User {
	private int id;
	private long salary;
	private String name;
	private Project project;

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		if(this.project!=null) {
			this.project.setExpense(this.project.getExpense()-this.salary+salary);
		}
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		if (this.project != null) {
			this.project.setExpense(this.project.getExpense() - this.getSalary());
		}
		this.project = project;
	}

	@Override
	public String toString() {
		return "User Id: " + this.id + ", User Name: " + this.name + ", User Salary: " + this.salary + ", Project: "
				+ this.project + "\n";
	}

	User() {
	}

	User(int id, String name, long salary, Project project) {
		this.salary = salary;
		this.name = name;
		this.id = id;
		this.project = project;
		project.setExpense(project.getExpense() + salary);
	}

}
