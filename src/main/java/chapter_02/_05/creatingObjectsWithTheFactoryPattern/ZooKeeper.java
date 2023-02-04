package chapter_02._05.creatingObjectsWithTheFactoryPattern;

public class ZooKeeper {
	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("polar bear");
		food.consumed();
		
		final Food foodSpider = FoodFactory.getFood("spider");
		foodSpider.consumed();
	}
}
