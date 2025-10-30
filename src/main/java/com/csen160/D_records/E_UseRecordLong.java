package com.csen160.D_records;

public class E_UseRecordLong {
	public static void main(String[] args) {
		B_DataLong myData1=new B_DataLong(1, "Michael");
		B_DataLong myData2=new B_DataLong(2, "John");
		B_DataLong myData3=new B_DataLong();
		
		System.out.println(myData3.id());
		System.out.println(myData3.name());
		
		System.out.println(myData1);
		System.out.println(myData2);
		System.out.println(myData3);
		System.out.println(myData1.equals(myData2));
	}
}
