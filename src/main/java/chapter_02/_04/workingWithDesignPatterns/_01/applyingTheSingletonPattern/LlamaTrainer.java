package chapter_02._04.workingWithDesignPatterns._01.applyingTheSingletonPattern;

public class LlamaTrainer {
	public boolean feedLlamas(int numberOfLlamas) {
		int amountNeedded = 5 * numberOfLlamas;
		HayStorage hayStorage = HayStorage.getInstance();
		if(hayStorage.getHayQuantity() < amountNeedded) {
			hayStorage.addHay(amountNeedded + 10);
		}
		boolean fed = hayStorage.removeHay(amountNeedded);
		if(fed) System.out.println("LLamas have been fed");
		return fed;
	}

}
