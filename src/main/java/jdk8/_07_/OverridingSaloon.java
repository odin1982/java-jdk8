package jdk8._07_;

abstract class Saloon{
	protected int m1() { return 0; }
}
public class OverridingSaloon extends Saloon{
	int m1() { return 1;}//En un metodo sobreescrito no puedes reducir la visibilidad
}
