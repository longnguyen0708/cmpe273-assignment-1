import java.util.ArrayDeque;
import java.util.Deque;


public class Matrix {
	public int maxArea(int [][] matrix, int n) {
		int s = 0;
		boolean [][] isChecked = new boolean[n][n];
		Deque<Integer> pointQueue = new ArrayDeque<Integer>();
		int firstPoint = 0 * n + 0; //the 1 area starts with (0, 0)
		pointQueue.addLast(firstPoint);
		while (!pointQueue.isEmpty()) {
			int currentPoint = pointQueue.pollFirst();
			int x = currentPoint / n;
			int y = currentPoint % n;
			isChecked[x][y] = true;
			s++; //increase the checked area
			if (x - 1 >= 0 && matrix[x-1][y] == 1 && !isChecked[x-1][y]) {
				int nextPoint = (x-1) * n + y;
				pointQueue.addLast(nextPoint);
			}
			if (x + 1 < n && matrix[x+1][y] == 1 && !isChecked[x+1][y]) {
				int nextPoint = (x+1) * n + y;
				pointQueue.addLast(nextPoint);
			}
			if (y - 1 >= 0 && matrix[x][y-1] == 1 && !isChecked[x][y-1]) {
				int nextPoint = x * n + y - 1;
				pointQueue.addLast(nextPoint);
			}
			if (y + 1 < n && matrix[x][y+1] == 1 && !isChecked[x][y+1]) {
				int nextPoint = x * n + y + 1;
				pointQueue.addLast(nextPoint);
			}
		}
		return s;
	}
}
