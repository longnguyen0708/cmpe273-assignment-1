//class ProgrammerRanker
import java.util.Collections;
import java.util.List;
public class ProgrammerRanker {
	public void rank(List<Programmer> programerList) {
		Collections.sort(programerList, new Programmer());
	}
}
