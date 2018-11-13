public class TokenPass {

    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount)
    {
        this.board = new int[playerCount];
        for(int i = 0; i <= playerCount; i++)
        {
            this.board[i] = (int)(Math.random() * 10) + 1;
            this.currentPlayer = (int)(Math.random() * playerCount - 1);
        }
    }

    public void distributeCurrentPlayerTokens()
    {

    }
}
