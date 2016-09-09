import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ProgrammerRankerTest {

	@Test
	public void test() {
		List<Programmer> candidates = new LinkedList<Programmer>();
		candidates.add(new Programmer("Mark", "Go"));
		candidates.add(new Programmer("Michelle", "Ruby"));
		candidates.add(new Programmer("Michael", "JavaScript"));
		candidates.add(new Programmer("Join", "C"));
		candidates.add(new Programmer("Tim", "C#"));
		candidates.add(new Programmer("Johnson", "Java"));
		candidates.add(new Programmer("Apple", "Python"));
		candidates.add(new Programmer("Max", "PHP"));
		candidates.add(new Programmer("Alex", "R"));
		System.out.println("The candidates before ranking:");
		for (Programmer p : candidates) {
			System.out.print("(" + p.getName() + ", " + p.getSkill() + ")   ");
		}
		
		ProgrammerRanker programmerRanker = new ProgrammerRanker();
		programmerRanker.rank(candidates);
		System.out.println("\nThe candidates after ranking:");
		for (Programmer p : candidates) {
			System.out.print("(" + p.getName() + ", " + p.getSkill() + ")   ");
		}	
	}

}
