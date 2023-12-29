package simulador._02.advancedClassDesign._07;

public class OuterWorld {
	
	public InnerPeace i = new InnerPeace();
	private class InnerPeace{
		private String reason = "none";
	}
}
