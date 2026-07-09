// Last updated: 7/9/2026, 3:07:54 PM
class Solution {
    public int numRookCaptures(char[][] board) {
		int len = board.length;
		int[] rook = null;
		int Ri = -1;
		int Rj = -1;
		int n = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (board[i][j] == 'R') {
					rook = new int[2];
					Ri = i;
					Rj = j;
					break;
				}
			}
		}
		for (int i = Ri-1; i > -1; i--) {
			if (board[i][Rj] != '.') {
				if (board[i][Rj] == 'p') {
					n++;				
				}
				break;
			}
		}		
		for (int i = Ri+1; i < len; i++) {
			if (board[i][Rj] != '.') {
				if (board[i][Rj] == 'p') {
					n++;				
				}
				break;			
			}
		}		
		for (int j = Rj-1; j > -1; j--) {
			if (board[Ri][j] != '.') {
				if (board[Ri][j] == 'p') {
					n++;				
				}
				break;					
			}		
		}		
		for (int j = Rj+1; j < len; j++) {
			if (board[Ri][j] != '.') {
				if (board[Ri][j] == 'p') {
					n++;				
				}
				break;				
			}	
		}
		return n;
	}
}