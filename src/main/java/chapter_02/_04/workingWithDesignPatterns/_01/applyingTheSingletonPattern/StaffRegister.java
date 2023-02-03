package chapter_02._04.workingWithDesignPatterns._01.applyingTheSingletonPattern;

public class StaffRegister {
	private static final StaffRegister instance;
	static {
		instance = new StaffRegister();
		//perform additional steps
	}
	
	private StaffRegister() {}
	
	public static StaffRegister getInstance() {
		return instance;
	}
}
