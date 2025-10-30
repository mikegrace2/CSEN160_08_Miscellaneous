package com.csen160.B_reflections;

import com.csen160.B_reflections.Examples.CourseList;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class B_UsingRefelectionsOnAnEntity {
	public static void allFields(CourseList myCourseList) throws IllegalArgumentException, IllegalAccessException {
		// Output all fields -----------------------------------------------------
		Field[] fields = myCourseList.getClass().getDeclaredFields();

		System.out.println("\nFields:");
		for (Field field : fields) {
			System.out.println(field);
			if (field.getName().equals("password")) {
				System.out.println("\t\tFound Password");
				field.setAccessible(true);
				field.set(myCourseList, "New Password");
			}
		}
		System.out.println();

		System.out.println(myCourseList);
	}

	public static void checkAllMethods(CourseList myCourseList) throws IllegalAccessException, InvocationTargetException {
		// Output all methods -----------------------------------------------------
		Method[] methods = myCourseList.getClass().getDeclaredMethods();

		System.out.println("\nMethods:");

		for (Method method : methods) {
			System.out.println(method);

			if (method.getName().equals("setDecryptMessage")) {
				System.out.println("Found setDecryptMessage");
				method.setAccessible(true);
				method.invoke(myCourseList, "NEW SECRET MESSAGE");
			} else if (method.getName().equals("getSecretMission")) {
				System.out.println("Found getSecretMission");
				method.setAccessible(true);
				String returnString = (String) method.invoke(null);
				System.out.println("SecretMission = " + returnString);
			}
		}
		System.out.println();

		System.out.println(myCourseList);
	}
	
	public static void checkAnnotations(CourseList myCourseList){
		Annotation[] annotations = myCourseList.getClass().getAnnotations();

		System.out.println("\nAnnotation:");

		for (Annotation annot : annotations) {
			System.out.println(annot);			
		}
		System.out.println();
	}

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		CourseList myCourseList= new CourseList();
		System.out.println(myCourseList);
		
		B_UsingRefelectionsOnAnEntity.allFields(myCourseList);
		B_UsingRefelectionsOnAnEntity.checkAllMethods(myCourseList);
		B_UsingRefelectionsOnAnEntity.checkAnnotations(myCourseList);
	}
}
