/**
 * The game of life
 *
 * @author Marc Oliveras Galvez <oligalma@gmail.com> 
 * @link http://www.oligalma.com
 * @copyright 2016 Oligalma
 * @license GPL License v3
 */

package the_game_of_life;

public class Vivarum {
	// Atributes.
	private boolean[][] n, m, k;
	private boolean ball, r = true;
	private int nF, nC, a = 0;

	// Constructor.
	public Vivarum(boolean[][] area, boolean ball) {
		nF = area.length;
		nC = area[0].length;
		this.ball = ball;
		n = area.clone();
		m = new boolean[area.length][area[0].length];
		k = new boolean[area.length][area[0].length];
		for (int row = 0; row < nF; row++)
			for (int col = 0; col < nC; col++)
				k[row][col] = area[row][col];

	}

	// Mehod to calculate next generations
	public boolean[][] nextGen() {
		r = true;
		int bug = 0, row, col;

		// Copy of m and n matrix.
		for (row = 0; row < nF; row++)
			for (col = 0; col < nC; col++)
				m[row][col] = n[row][col];

		for (row = 0; row < nF; row++) {
			for (col = 0; col < nC; col++) {
				if (ball) // Ball mode...
				{
					if (row == 0 && col == 0) {
						if (m[nF - 1][nC - 1])
							bug++;
						if (m[nF - 1][col])
							bug++;
						if (m[nF - 1][col + 1])
							bug++;
						if (m[row][nC - 1])
							bug++;
						if (m[row][col + 1])
							bug++;
						if (m[row + 1][nC - 1])
							bug++;
						if (m[row + 1][col])
							bug++;
						if (m[row + 1][col + 1])
							bug++;
					} else if (row == 0 && col == nC - 1) {
						if (m[nF - 1][col - 1])
							bug++;
						if (m[nF - 1][col])
							bug++;
						if (m[nF - 1][0])
							bug++;
						if (m[row][col - 1])
							bug++;
						if (m[row][0])
							bug++;
						if (m[row + 1][col - 1])
							bug++;
						if (m[row + 1][col])
							bug++;
						if (m[row + 1][0])
							bug++;
					} else if (row == nF - 1 && col == 0) {
						if (m[row - 1][nC - 1])
							bug++;
						if (m[row - 1][col])
							bug++;
						if (m[row - 1][col + 1])
							bug++;
						if (m[row][nC - 1])
							bug++;
						if (m[row][col + 1])
							bug++;
						if (m[0][nC - 1])
							bug++;
						if (m[0][col])
							bug++;
						if (m[0][col + 1])
							bug++;
					} else if (row == nF - 1 && col == nC - 1) {
						if (m[row - 1][col - 1])
							bug++;
						if (m[row - 1][col])
							bug++;
						if (m[row - 1][0])
							bug++;
						if (m[row][col - 1])
							bug++;
						if (m[row][0])
							bug++;
						if (m[0][col - 1])
							bug++;
						if (m[0][col])
							bug++;
						if (m[0][0])
							bug++;
					} else if (row == 0 && col != nC - 1 && col != 0) {
						if (m[nF - 1][col - 1])
							bug++;
						if (m[nF - 1][col])
							bug++;
						if (m[nF - 1][col + 1])
							bug++;
						if (m[row][col - 1])
							bug++;
						if (m[row][col + 1])
							bug++;
						if (m[row + 1][col - 1])
							bug++;
						if (m[row + 1][col])
							bug++;
						if (m[row + 1][col + 1])
							bug++;
					} else if (row == nF - 1 && col != nC - 1 && col != 0) {
						if (m[row - 1][col - 1])
							bug++;
						if (m[row - 1][col])
							bug++;
						if (m[row - 1][col + 1])
							bug++;
						if (m[row][col - 1])
							bug++;
						if (m[row][col + 1])
							bug++;
						if (m[0][col - 1])
							bug++;
						if (m[0][col])
							bug++;
						if (m[0][col + 1])
							bug++;
					} else if (row != nF - 1 && row != 0 && col == 0) {
						if (m[row - 1][nC - 1])
							bug++;
						if (m[row - 1][col])
							bug++;
						if (m[row - 1][col + 1])
							bug++;
						if (m[row][nC - 1])
							bug++;
						if (m[row][col + 1])
							bug++;
						if (m[row + 1][nC - 1])
							bug++;
						if (m[row + 1][col])
							bug++;
						if (m[row + 1][col + 1])
							bug++;
					} else if (row != nF - 1 && row != 0 && col == nC - 1) {
						if (m[row - 1][col - 1])
							bug++;
						if (m[row - 1][col])
							bug++;
						if (m[row - 1][0])
							bug++;
						if (m[row][col - 1])
							bug++;
						if (m[row][0])
							bug++;
						if (m[row + 1][col - 1])
							bug++;
						if (m[row + 1][col])
							bug++;
						if (m[row + 1][0])
							bug++;
					} else {
						if (m[row - 1][col - 1])
							bug++;
						if (m[row - 1][col])
							bug++;
						if (m[row - 1][col + 1])
							bug++;
						if (m[row][col - 1])
							bug++;
						if (m[row][col + 1])
							bug++;
						if (m[row + 1][col - 1])
							bug++;
						if (m[row + 1][col])
							bug++;
						if (m[row + 1][col + 1])
							bug++;
					}
				} else // Not ball mode...
				{
					if (row == 0 && col == 0) {
						if (m[row][col + 1])
							bug++;
						if (m[row + 1][col])
							bug++;
						if (m[row + 1][col + 1])
							bug++;
					} else if (row == 0 && col == nC - 1) {
						if (m[row][col - 1])
							bug++;
						if (m[row + 1][col - 1])
							bug++;
						if (m[row + 1][col])
							bug++;
					} else if (row == nF - 1 && col == 0) {
						if (m[row - 1][col])
							bug++;
						if (m[row - 1][col + 1])
							bug++;
						if (m[row][col + 1])
							bug++;
					} else if (row == nF - 1 && col == nC - 1) {
						if (m[row - 1][col - 1])
							bug++;
						if (m[row - 1][col])
							bug++;
						if (m[row][col - 1])
							bug++;
					} else if (row == 0 && col != nC - 1 && col != 0) {
						if (m[row][col - 1])
							bug++;
						if (m[row][col + 1])
							bug++;
						if (m[row + 1][col - 1])
							bug++;
						if (m[row + 1][col])
							bug++;
						if (m[row + 1][col + 1])
							bug++;
					} else if (row == nF - 1 && col != nC - 1 && col != 0) {
						if (m[row - 1][col - 1])
							bug++;
						if (m[row - 1][col])
							bug++;
						if (m[row - 1][col + 1])
							bug++;
						if (m[row][col - 1])
							bug++;
						if (m[row][col + 1])
							bug++;
					} else if (row != nF - 1 && row != 0 && col == 0) {
						if (m[row - 1][col])
							bug++;
						if (m[row - 1][col + 1])
							bug++;
						if (m[row][col + 1])
							bug++;
						if (m[row + 1][col])
							bug++;
						if (m[row + 1][col + 1])
							bug++;
					} else if (row != nF - 1 && row != 0 && col == nC - 1) {
						if (m[row - 1][col - 1])
							bug++;
						if (m[row - 1][col])
							bug++;
						if (m[row][col - 1])
							bug++;
						if (m[row + 1][col - 1])
							bug++;
						if (m[row + 1][col])
							bug++;
					} else {
						if (m[row - 1][col - 1])
							bug++;
						if (m[row - 1][col])
							bug++;
						if (m[row - 1][col + 1])
							bug++;
						if (m[row][col - 1])
							bug++;
						if (m[row][col + 1])
							bug++;
						if (m[row + 1][col - 1])
							bug++;
						if (m[row + 1][col])
							bug++;
						if (m[row + 1][col + 1])
							bug++;
					}
				}
				if (m[row][col]) {
					if (bug == 0 || bug == 1 || bug >= 4)
						n[row][col] = false;
				} else {
					if (bug == 3)
						n[row][col] = true;
				}
				bug = 0;
			}
		}

		// Check if the current matrix and the last are equal.
		for (int fila2 = 0; fila2 < nF; fila2++)
			for (int col2 = 0; col2 < nC; col2++)
				if (m[fila2][col2] != n[fila2][col2]) {
					r = false;
					break;
				}
		if (!r)
			a++;
		return n;
	}

	// Method to calculate the stationary generation.
	public int calculateStationary() {
		int b = 0;
		for (int i = 0; i < 1000; i++) {
			if (a != b)
				break;
			nextGen();
			b++;
		}
		for (int fila = 0; fila < nF; fila++)
			for (int col = 0; col < nC; col++)
				n[fila][col] = k[fila][col];
		m = new boolean[nF][nC];
		return a;
	}
}
