package main;

import java.util.Arrays;

public class Scorecard {

        private gameentry[] board;

        public Scoreboard(int capacity)
        {
            board=new gameentry[capacity];

        }

        public void add(gameentry e)
        {
            //attempts to add a new score to the board(if it is high enough)
       Arrays.sort(board);
            if(gameentry.score>board[0].score )
            {
                board[0]=gameentry;
            }
        }
        public void remove(int i)
        {
            //remove the high score at index i

        }

}


void add(gameentry gameentry)
{
    int newScore=gameentry.score;
    if(numEntries<board.length||newScore>board[numEntires-1].score)
    {
        if(numEntries<board.length)
        {
            numEntries++;
        }
    }

}