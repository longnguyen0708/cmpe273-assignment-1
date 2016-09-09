
public class LargestObject {
	public <T extends Comparable<T>> T findLargestObjectOf(T[] list) {
		T max = list[0];
		for (T element : list) {
			if (element.compareTo(max) > 0) 
				max = element;
		}
		return max;
	}
}
