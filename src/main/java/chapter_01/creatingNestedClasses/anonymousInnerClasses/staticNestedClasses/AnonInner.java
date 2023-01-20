package chapter_01.creatingNestedClasses.anonymousInnerClasses.staticNestedClasses;

public class AnonInner {
	interface SaleTodayOnly{
		int dollarsOff();
	}
	
	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {
			public int dollarsOff() { return 3; }
		};
		return basePrice - sale.dollarsOff();
	}
}
