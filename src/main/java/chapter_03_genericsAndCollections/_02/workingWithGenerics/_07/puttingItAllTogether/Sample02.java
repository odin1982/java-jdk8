package chapter_03_genericsAndCollections._02.workingWithGenerics._07.puttingItAllTogether;

import java.util.List;

public class Sample02 {
	
	<T> T method1(List<? extends T> list) {
		return list.get(0); //puede retornar T o un hijo de T y eso es correcto
	}
	
	//la forma en que se declaro el tipo de retorno no es permitido
	<T> <? extends T> method2(List<? extends T> list){
		return list.get(1);
	}
	
	// B no se puede usar porque es una clase
	<B extends A> B method3(List<B> list) {
		return new B();
	}
	
	void method4(List<? super B> list) {
		
	}
	
	
	<X> void method5(List<X super B> list) {
		
	}

}
