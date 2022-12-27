package main.java.com.java.lambda;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg);

    default void m1(){}
    static void m2(){}
}
