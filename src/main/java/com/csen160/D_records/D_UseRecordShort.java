package com.csen160.D_records;

public class D_UseRecordShort {
	public static void main(String[] args) {
		A_DataShort myData1=new A_DataShort(1, "Michael");
		A_DataShort myData2=new A_DataShort(2, "John");
		System.out.println(myData1);
		System.out.println(myData2);
		
		//DataShort myData3=new DataShort(); // Does not work
		//System.out.println(myData3.id());
		//System.out.println(myData3.name());
		//System.out.println(myData3);
		
		System.out.println(myData1.equals(myData2));
	}
}
