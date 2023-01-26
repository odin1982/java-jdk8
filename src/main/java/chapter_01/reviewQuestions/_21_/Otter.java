package chapter_01.reviewQuestions._21_;

public interface Otter {
	default void play() {}
}

class RiverOtter implements Otter{
	// @Override public boolean equals(Object o) {return false;} //ok
	//@Override public boolean equals(Otter o) {return false;} // X
	//@Override public int hashCode() { return 42;}//ok
	//@Override public long hashCode() { return 42;}//X
	//@Override public void play() {}//ok
	//@Override void play(){}//x
	
}
