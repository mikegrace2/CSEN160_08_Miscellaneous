package com.csen160.B_reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A_UsingRefelections {
	public static void allFields(SecretClass mySecretClass) throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = mySecretClass.getClass().getDeclaredFields();

		System.out.println("\nFields:");
		for (Field field : fields) {
			System.out.println(field);
			if (field.getName().equals("password")) {
				System.out.println("\t\tFound Password");
				field.setAccessible(true);
				field.set(mySecretClass, "New Password");
			}
		}
		System.out.println();

		System.out.println(mySecretClass);
	}

	public static void checkAllMethods(SecretClass mySecretClass) throws IllegalAccessException, InvocationTargetException {
		Method[] methods = mySecretClass.getClass().getDeclaredMethods();

		System.out.println("\nMethods:");

		for (Method method : methods) {
			System.out.println(method);

			if (method.getName().equals("setDecryptMessage")) {
				System.out.println("Found setDecryptMessage");
				method.setAccessible(true);
				method.invoke(mySecretClass, "NEW SECRET MESSAGE");
			} else if (method.getName().equals("getSecretMission")) {
				System.out.println("Found getSecretMission");
				method.setAccessible(true);
				String returnString = (String) method.invoke(null);
				System.out.println("SecretMission = " + returnString);
			}
		}
		System.out.println();

		System.out.println(mySecretClass);
	}
	
	public static void checkAllMethods2() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException {
		Class<?> myClass=Class.forName("com.csen160.B_reflections.SecretClass");
		Method[] myMethods=myClass.getMethods();

		System.out.println("\nMethods2:");
		for (Method myMet : myMethods) {
			System.out.println(myMet.toString());
		}
		
		System.out.println();
	}
	
	
	public static void checkAnnotations(SecretClass mySecretClass){
		Annotation[] annotations = mySecretClass.getClass().getAnnotations();

		System.out.println("\nAnnotation:");

		for (Annotation annot : annotations) {
			System.out.println(annot);			
		}
		System.out.println();
	}
	
	public static void getConstructors(SecretClass mySecretClass){
		Constructor<?>[] constructors = mySecretClass.getClass().getConstructors();

		System.out.println("\nConstructors:");
		System.out.println(""+constructors.toString());
		System.out.println();
	}
	
	public static void checkArray(int[] intArray){
		System.out.println("\nArray:");
	}

	public static void check() throws ClassNotFoundException{
		System.out.println("\nCheck:");
        Class<?> myClass=Class.forName("com.csen160.B_reflections.SecretClass");
		System.out.println("Class.toString = "+myClass);
		System.out.println("Name           = "+myClass.getName());
		System.out.println("CanonicalName  = "+myClass.getCanonicalName());
		System.out.println("PackageName    = "+myClass.getPackageName());
		System.out.println("SimpleName     = "+myClass.getSimpleName());
		System.out.println("TypeName       = "+myClass.getTypeName());		
	}
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
		SecretClass mySecretClass = new SecretClass("mike", "123456", 7866, "hhyvfdfedd", "hello");
		System.out.println(mySecretClass);
		
		A_UsingRefelections.allFields(mySecretClass);
		A_UsingRefelections.checkAllMethods(mySecretClass);
		A_UsingRefelections.checkAllMethods2();
		A_UsingRefelections.checkAnnotations(mySecretClass);
		A_UsingRefelections.getConstructors(mySecretClass);
		A_UsingRefelections.checkArray(null);
		//A_UsingRefelections.check();
	}
}
