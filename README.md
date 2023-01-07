# jdk8

## lambda
- es una función anonima. 
- una funcion sin nombre
- no pertenece a ninguna clase
- es usada principalmente para implementar interfaces funcionales

Addable withLambdaD = (int a, int b) -> (a+b);

### main parts lambda
- no name
- parameter list
- body
- no return type

### lambda expression sintax
() -> {}

## interfaces funcionales
- es una interfaz que contiene  exactamente un metodo abstracto
- puede tener cualquier numero de metodos estaticos o default

## java.util.function
https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

## method references
method reference is used to refer method of the functional interface. It is a compact and easy fomr of
lambda expresion.

each time when you are using a lambda expresiion to just referring a method, you can replace your lambda expression with a method reference. 

Printable printableLambda = (String msg) -> System.out.println(msg);

Printable printable = System.out::println;

## types of method references

- method reference to static method, its syntax is Class::StaticMethodName
- reference to an instance method of a particular object: Object::instanceMethodName
- reference to an instance method of an arbitrary obeject of specific type Class::instanceMethod
- reference to a constructor: ClassName::new

## java Optional class
This class can help in avoiding null checks and NullPointerException exceptions.
Yo can view Optional as a single-value container thet either contains a value or doesn't(it is then said to be empty)

## Stream API

Stream representa una secuencia de objetos de una fuente, en la cual soporta agregar operaciones.

-java.util.stream

### How Stream Works?
Source -> Filter -> Sort -> Map -> Collect



Link tutorial: https://www.youtube.com/watch?v=UfJ0lCH7FMM&t=7s
Avance:	2:32:21
