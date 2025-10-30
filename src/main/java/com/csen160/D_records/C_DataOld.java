package com.csen160.D_records;

public class C_DataOld {
	private int id;
	private String name;
	
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
	
	
	public C_DataOld() {
		super();
	}
	
	public C_DataOld(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "DataOld [id=" + id + ", name=" + name + "]";
	}
}
