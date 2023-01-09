package chapter_01.pag_003.cat.species;

import chapter_01.pag_003.cat.BigCat;

public class Lynx extends BigCat {
	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		
		System.out.println(cat.hasFur);//En BigCat es protected pero solo se puede usar en el mismo paquete o la puede usar la clase hija, como se muestra ne las L10-L11
		Lynx lynx = new Lynx();
		System.out.println(lynx.hasFur);
		
		System.out.println(cat.hasPaws);
		System.out.println(cat.id);
	}
}
