package com.java.lambda.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // Create Optional object
        // of, empty, ofNullable

        //instance with empty method
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //instance with of method
        String email ="odin.araujo@mail.com";
        Optional<String> email_01 = Optional.of(email);
        System.out.println(email_01);

        //nullPointerException
        //email = null;
        //Optional<String> email_02 = Optional.of(email);
        //System.out.println(email_02);
        
        //instance with ofNullable method - usar este ya que no manda excepcion al mandar un objeto nulo
        String email03 ="odin3.araujo@mail.com";
        Optional<String> email_03 = Optional.ofNullable(email03);
        System.out.println(email_03);

        String email04 = null;
        Optional<String> email_04 = Optional.ofNullable(email04);
        System.out.println(email_04);// prints Optional.empty


        // get() - Obtiene el valor del objeto Optional
        // If a value is present in this Optional, returns the value,
        // otherwise throws NoSuchElementException.

        Optional<String> email_05 = Optional.ofNullable(email);
        System.out.println(email_05.get());

        // NoSuchElementException
        // String email06 = null;
        // Optional<String> email_06 = Optional.ofNullable(email06);
        // System.out.println(email_06.get());

        /*	isPresent()
            Return true if there is a value present, otherwise false.
        */

        String email07 = "odin.araujo@gmail.com";
        Optional<String> email_07 = Optional.ofNullable(email07);
        if(email_07.isPresent()){
            System.out.println(email_07.get());
        }else{
            System.out.println("email_07.isNotPresent()");
        }

        String email08 = null;
        Optional<String> email_08 = Optional.ofNullable(email08);
        if(email_08.isPresent()){
            System.out.println("email_08.isPresent()");
        }else{
            System.out.println("email_08.isNotPresent()");
        }


        /*
        * 	orElse(T other)
        *   Return the value if present, otherwise return other.
        */

        String email09 = "email09@gmail.com";
        Optional<String> email_09 = Optional.ofNullable(email09);
        String s = email_09.orElse("otro@gamil.com");
        System.out.println(s);

        String email10 = null;
        Optional<String> email_10 = Optional.ofNullable(email10);
        String s2 = email_10.orElse("otro@gmail.com");
        System.out.println(s2);

        /*
        * 	orElseGet(Supplier<? extends T> other)
        *   Return the value if present, otherwise invoke other and return the result of that invocation.
        *
        * */

        String email11 = "email11@gmail.com";
        Optional<String> email_11 = Optional.ofNullable(email11);
        String s3 = email_11.orElseGet(() -> "default@gmail.com");
        System.out.println(s3);

        String email12 = null;
        Optional<String> email_12 = Optional.ofNullable(email12);
        String s4 = email_12.orElseGet(() -> "default12@gmail.com");
        System.out.println(s4);


    }
}
