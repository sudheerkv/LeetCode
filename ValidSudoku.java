public class Solution {
	public boolean isValidSudoku(char[][] board) {

		for (int i = 0; i < 9; i++) {
			boolean[] hash = new boolean[9];
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					int index = Character.getNumericValue(board[i][j]) - 1;
					if (hash[index])
						return false;
					else
						hash[index] = true;
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			boolean[] hash = new boolean[9];
			for (int j = 0; j < 9; j++) {
				if (board[j][i] != '.') {
					int index = Character.getNumericValue(board[j][i]) - 1;
					if (hash[index])
						return false;
					else
						hash[index] = true;
				}
			}
		}
		int row = 0, col = 0;
		while (row != 9) {
			col = 0;
			while (col != 9) {
				boolean[] hash = new boolean[9];
				for (int i = row; i < row + 3; i++) {
					for (int j = col; j < col + 3; j++) {
						if (board[i][j] != '.') {
							int index = Character.getNumericValue(board[i][j]) - 1;
							if (hash[index])
								return false;
							else
								hash[index] = true;

						}
					}
				}
				col += 3;
			}
			row += 3;
		}
		return true;

	}
}