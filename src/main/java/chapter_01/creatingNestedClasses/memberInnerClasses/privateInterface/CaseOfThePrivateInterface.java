package chapter_01.creatingNestedClasses.memberInnerClasses.privateInterface;

public class CaseOfThePrivateInterface {
	private interface Secret{
		public void shh();
	}
	
	class DontTell implements Secret{
		public void shh() {}
	}
}
