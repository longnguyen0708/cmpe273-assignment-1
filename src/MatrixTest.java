import static org.junit.Assert.*;

import org.junit.Test;


public class MatrixTest {

	@Test
	public void testMaxArea() {
		int n = 6;
		int [][] matrixInput = {
				{1, 0, 0, 1, 0, 0},
				{1, 1, 0, 1, 0, 0},
				{0, 1, 0, 1, 0, 1},
				{0, 1, 1, 1, 0, 1},
				{0, 0, 0, 1, 0, 1},
				{0, 0, 0, 1, 1, 1}
		};
		Matrix matrix = new Matrix();
		assertEquals(17, matrix.maxArea(matrixInput, n));
	}

}
