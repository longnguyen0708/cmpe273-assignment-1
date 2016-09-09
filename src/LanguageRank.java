//class LanguageRank
import java.util.HashMap;
import java.util.Map;
public class LanguageRank {
	public static final Map<String, Integer> level = new HashMap<String, Integer>();
	static {
		level.put("C", 1);
		level.put("Java", 2);
		level.put("Python", 3);
		level.put("C++", 4);
		level.put("R", 5);
		level.put("C#", 6);
		level.put("PHP", 7);
		level.put("JavaScript", 8);
		level.put("Ruby", 9);
		level.put("Go", 10);
	}
	
}
