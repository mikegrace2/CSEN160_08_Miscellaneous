package com.csen160.D_records;

public class F_RecordVsOldEntities_SpeedTest {
	public static void main(String[] args) {
		{
			long start = System.currentTimeMillis();
			for (int i = 0; i < 1000000000; i++) {
				C_DataOld temp = new C_DataOld(i, "" + i);
				temp.getId();
				temp.getName();
				temp = null;
			}
			long end = System.currentTimeMillis();
			System.out.println("Time consumed old classes entity: " + (end - start));
		}

		{
			long start = System.currentTimeMillis();
			for (int i = 0; i < 1000000000; i++) {
				A_DataShort temp = new A_DataShort(i, "" + i);
				temp.id();
				temp.name();			
				temp = null;
			}
			long end = System.currentTimeMillis();
			System.out.println("Time consumed new records entity: " + (end - start));
		}
	}
}
