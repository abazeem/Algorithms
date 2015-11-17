
public class Nthqueen {

	public static void main(String args[])
	{
		int[][] board = new int[8][8];
		if(solve(board,0))
			print(board);
		else
			System.out.print("No Solution");
	}
	
	public static void print(int[][] S)
	{
		for(int i = 0; i< S.length; i++)
		{
			for(int j = 0; j < S[i].length ; j++)
				System.out.print(S[i][j] +" ");
			System.out.println("");
		}
	}
	public static boolean isSafe(int[][] S, int row, int col)
	{
		for(int i = 0; i< col ; i++)
		{
			if(S[row][i] == 1)
				return false;
		}
		int i, j;
		for( i = row, j = col ; i >= 0 && j >= 0 ; i--, j--)
		{
			if(S[i][j] == 1)
				return false;
		}
		for( i = row, j = col ; i < S.length && j >= 0 ; i++, j--)
		{
			if(S[i][j] == 1)
				return false;
		}
		return true;
	}
	
	public static boolean solve(int[][] board , int col)
	{
		int N = board.length;
		if( col >= N)
			return true;
		for(int i = 0; i< N;i++)
		{
			if(isSafe(board, i , col))
			{
				board[i][col] = 1;
				if(solve(board, col+1))
					return true;
				else
					board[i][col] = 0;
			}
		}
		return false;
	}
}
