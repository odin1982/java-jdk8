package chapter_01.creatingNestedClasses.anonymousInnerClasses.interfaceCase;

public class AnonInner {
	interface SaleTodayOnly{
		int dollarsOff();
	}
	
	public int admission(int basePrice) {
		SaleTodayOnly sales = new SaleTodayOnly() {
			@Override
			public int dollarsOff() { return 3; }
		};
		return basePrice - sales.dollarsOff();
	}
}
