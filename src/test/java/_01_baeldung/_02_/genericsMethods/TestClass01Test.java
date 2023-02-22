package _01_baeldung._02_.genericsMethods;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestClass01Test {
	
	@Test
	public void givenArrayOfIntegers_thanLsitOfStringReturnedOK() {
		Integer[] intArray = {1,2,3,4,5};
		List<String> stringList = TestClass01.fromArrayToList(intArray, Object::toString);
		assertThat(stringList,hasItems("1","2","3","4","5"));
		
	}

}
