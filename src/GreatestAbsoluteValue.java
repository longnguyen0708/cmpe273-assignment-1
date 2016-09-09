
public class GreatestAbsoluteValue {
	public int findTheGreatestAbsoluteValueOf(int[] listNum) {
		int greatestAbsoluteValueNumber = 0;
		int smallestNumber = listNum[0];
		int greatestNumber = listNum[0];
		for (int num : listNum) {
			if (smallestNumber > num) 
				smallestNumber = num;
			if (greatestNumber < num)
				greatestNumber = num;
		}
		smallestNumber = smallestNumber * (-1);
		greatestAbsoluteValueNumber = greatestNumber;
		if (greatestAbsoluteValueNumber < smallestNumber) 
			greatestAbsoluteValueNumber = smallestNumber;
		return greatestAbsoluteValueNumber;
	}
}
