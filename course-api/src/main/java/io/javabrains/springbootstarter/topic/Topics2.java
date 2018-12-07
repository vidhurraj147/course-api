package io.javabrains.springbootstarter.topic;

public class Topics2 {
	private int id;
	private String name;
	
	public Topics2() {
		
	}
	
	public Topics2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
