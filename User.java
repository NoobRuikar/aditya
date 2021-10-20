// Sorting using Salary of user
//Aditya
package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.swing.plaf.PanelUI;

public class User implements Comparable<User> {
	public int id;
	public int salary;
	public String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
	@Override
	  public String toString() {
	    return id+" "+name+" "+salary;
	}
	
	public int compareTo(User u) {
	        return this.salary - u.getSalary();
	    }
	


	public User(int id, int salary, String name) {
		this.id=id;
		this.salary=salary;
		this.name=name;
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		User u1= new User(1,70000,"aditya");
		User u2= new User(2,50000,"Mohsin");
		User u3= new User(3,20000,"Pavan");
		User[] User1= {u1,u2,u3};
		
		System.out.println(Arrays.toString(User1));
		ArrayList list = new ArrayList();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
		Collections.sort(list);
		 System.out.println(list);
		
		// TODO Auto-generated method stub

	}

}