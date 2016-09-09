//class Programmer
import java.util.Comparator;
public class Programmer implements Comparator<Programmer>{
	private String name;
	private String skill;
	
	public Programmer() {
	}
	
	public Programmer(String name, String skill) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.skill = skill;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public int compare(Programmer o1, Programmer o2) {
		// TODO Auto-generated method stub
		int programmerLanguageRank1 = LanguageRank.level.get(o1.getSkill());
		int programmerLanguageRank2 = LanguageRank.level.get(o2.getSkill());
		if (programmerLanguageRank1 > programmerLanguageRank2) 
			return 1;
		else if (programmerLanguageRank1 < programmerLanguageRank2)
			return -1;
		return 0;
	}

}
