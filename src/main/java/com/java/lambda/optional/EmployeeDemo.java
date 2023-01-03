package com.java.lambda.optional;

import java.util.Optional;

public class EmployeeDemo {
	public static void main(String[] args) {
		
		//bloque 1
//		Employee employee = new Employee();
//		String email = employee.getEmail(); // if employee is null
//		String result = email.toLowerCase();// null pointer exception
		
		// para evitar null pointer exception en las lineas anteriores hacemos lo siguiente pero es una mala practica:
		
		//bloque 2
//		if(employee != null) {
//			if(employee.getId() != null) {
//				//logic goes here
//			}
//			
//			if(employee.getEmail() != null) {
//				//logic goes here
//			}
//		}
		
		String email = "odin@hotmail.com";
		
		//How to create Optional Object: of,empty, ofNullable
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		Optional<String> emailOptional = Optional.of(email);
		System.out.println(emailOptional);
		
		//email = null;
		
		//Optional<String> emailOptionalNull = Optional.of(email);
		//System.out.println(emailOptionalNull);

		// ofNullable: Returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional.
		email = "odin@hotmail.com";
		Optional<String> stringOptional = Optional.ofNullable(email);
		
		
		email = null;
		Optional<String> stringOptionalNull = Optional.ofNullable(email);
		System.out.println(stringOptionalNull);
		
		//get se usa para obtener el valor del Optional
		email = "odin@hotmail.com";
		stringOptional = Optional.ofNullable(email);
		System.out.println(stringOptional.get());

		// ------------------------------
		email = null;
		stringOptional = Optional.ofNullable(email);
		
		if(stringOptional.isPresent()) {
			System.out.println(stringOptional.get());
		}else {
			System.out.println("no value present");
		}
		
		// ------------------------------
		email = "odin@hotmail.com";
		stringOptional = Optional.ofNullable(email);
		
		if(stringOptional.isPresent()) {
			System.out.println(stringOptional.get());
		}else {
			System.out.println("no value present");
		}


		//------------------------------
//		email = "odin";	// caso 1
//		email = null;	// caso 2
		stringOptional = Optional.ofNullable(email);
		stringOptional.orElse("default odin");
		System.out.println(stringOptional);
		
		String orElseGet = stringOptional.orElseGet(() -> null);
		System.out.println(orElseGet);
		
		
		
		
		
		
	}

}
