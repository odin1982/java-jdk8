package _01_baeldung._02_.genericsMethods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass01 {
	public <T> List<T> fromArrayToList(T[] a){
		return Arrays.stream(a).collect(Collectors.toList());
	}
	
	public static <T,G> List<G> fromArrayToList(T[] a,Function<T,G> mapperFunction){
		return Arrays.stream(a)
					.map(mapperFunction)
					.collect(Collectors.toList());
	}
}
