package mx.codewars._02.basicSubClassesAdamAndEve.solution2;
public class God {
  public static Human[] create(){
     return new Human[]{new Man(), new Woman()};
  }
}

interface Human {}
class Man implements Human {}
class Woman implements Human {}