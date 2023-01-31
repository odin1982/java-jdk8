package chapter_02.designPatternsAndPrinciples._01.designAndInterface._01.purposeOfAnInterface;

import java.util.List;

public class DummyRaceManager implements RaceManager{

	@Override
	public Animal getWinner(List<Animal> animals) {
		return animals == null || animals.size() == 0 ? null : animals.get(0);
	}

}
