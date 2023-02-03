package chapter_02._04.workingWithDesignPatterns._01.applyingLazyInstantiationToSingleton;

public class VisitorTicketTracker {
	private static VisitorTicketTracker instance;
	private VisitorTicketTracker() {}
	public static synchronized VisitorTicketTracker getInstance() {
		if(instance == null) {
			instance = new VisitorTicketTracker();
		}
		return instance;
	}
}
