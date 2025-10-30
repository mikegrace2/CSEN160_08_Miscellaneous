package com.csen160.D_records;

/**
 * Record is readonly.
 * Every field is private final.
 * No getter/setter methods anymore.
 */
public record B_DataLong(int id, String name) {
	public B_DataLong() {
		this(0, "");
		
		if (id==0)
			throw new IllegalArgumentException("id wrong");
	}
	
	// same as public Data(int id, String name) 
	public B_DataLong {
		if (id==0)
			throw new IllegalArgumentException("id wrong");
		
		// do not need to do 
		//this.id=id;
		//this.name=name;		
	}
	
	// Not needed is automatically genereated
	/*public DataLong(int id, String name) {
		this.id=id;
		this.name=name;
	}*/
}