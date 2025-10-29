package com.csen160.FinalImplementationExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AFileIO {
	public static void main(String[] args) {
		int byteCount = 0;
		try {
			FileInputStream fileInputStream = new FileInputStream(new File("example.bin"));
			while (fileInputStream.read() != -1) {
				byteCount++;
			}
			System.out.println("The file 'example.bin' contains " + byteCount + " bytes.");
			fileInputStream.close();
		} catch (IOException e) {
			System.err.println("An error occurred while reading the file: " + e.getMessage());
		}
	}
}