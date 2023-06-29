package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._01.commonCollectionsMethods._02.remove;

import java.util.ArrayList;
import java.util.List;

/*
 * boolean remove(Object object)
 * 
 * Removes the element at the specified position in this list (optional operation).
 * E remove(int index)
 */
public class Sample01 {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.remove("cardinal"));
		System.out.println(birds.remove("hawk"));
		System.out.println(birds);
		
		try {
			birds.remove(1000);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Retorna exception IndexOutOfBoundsException ya que no existe ese indice.");
		}
	}
}
