package assesmentTest._15;

import java.util.ArrayList;
import java.util.List;

interface CanSwim{}

public class Amphibiam implements CanSwim{}

class Tadpole extends Amphibiam{}
class FindAllTadPole {
	public static void main(String[] args) {
		List<Tadpole> tadpoles = new ArrayList<Tadpole>();
		for(Amphibiam ambhibian : tadpoles) {
			//CanSwim tadpole = ambhibian;  // A = OK
			//Long tadpole = ambhibian; // B = X
			//Amphibiam tadpole = ambhibian; // C = OK
			//Tadpole tadpole = ambhibian;  // D = X
			//Obejct tadpole = ambhibian; // E = OK
		}
	}
}
