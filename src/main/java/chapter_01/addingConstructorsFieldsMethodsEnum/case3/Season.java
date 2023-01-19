package chapter_01.addingConstructorsFieldsMethodsEnum.case3;

public enum Season {
	WINTER{
		public void printHours() {
			System.out.println("short hours");
		}
	},
	SUMMER{
		public void printHours() {
			System.out.println("long hours");
		}
	},SPRING,FALL;
	public void printHours() { System.out.println("default hours"); }

}
