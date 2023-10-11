package chapter_04._08.reviewQuestions._09;

import java.util.OptionalLong;
import java.util.stream.LongStream;

public class LongStreamTest {
	public static void main(String[] args) {
		LongStream ls = LongStream.of(1,2,3);
		OptionalLong opt = ls.map(n -> n*10).filter(n->n<5).findFirst();
		//if(opt.isPresent())System.out.println(opt.get());
		if(opt.isPresent())System.out.println(opt.getAsLong());
		opt.ifPresent(System.out::println);
	}
}
