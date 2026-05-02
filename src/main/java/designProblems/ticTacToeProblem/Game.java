package designProblems.ticTacToeProblem;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static designProblems.ticTacToeProblem.GameStatus.DRAW;
import static designProblems.ticTacToeProblem.GameStatus.WIN;
import static designProblems.ticTacToeProblem.Piece.O;
import static designProblems.ticTacToeProblem.Piece.X;

public class Game {
   Player winner;
   Deque<Player> players;
   Board gameBoard;

   public void initialiseGame(int size){
       List<Player> players = new LinkedList<>();
       gameBoard = new Board(size);
       Player playerA = new Player("A", X);
       Player playerB = new Player("B", O);
       players.add(playerA);
       players.add(playerB);
   }

   public GameStatus startGame(){
       Scanner sc = new Scanner(System.in);
       while(true){
           Player currentPlayer = players.removeFirst();
           gameBoard.printBoard();

           List<Board.CellPosition> freeCells = gameBoard.getFreeCells();
           if(freeCells.isEmpty()){
               return DRAW;
           }

           System.out.println("Player: "+ currentPlayer.getName() + " Please enter row and column in which you want to insert in row,col format ");
           String s = sc.nextLine();
           String[] values = s.split(",");
           int inputRow = Integer.parseInt(values[0]);
           int inputColumn = Integer.parseInt(values[1]);


           boolean validMove = gameBoard.fillCell(currentPlayer.getPiece(), inputRow, inputColumn);

           if(!validMove){
               System.out.println("Please try again");
               players.addFirst(currentPlayer);
           }
           else{
               players.addLast(currentPlayer);
           }

           boolean isWinner = checkWinner(inputRow, inputColumn, currentPlayer.getPiece());
           if(isWinner){
               gameBoard.printBoard();
               winner = currentPlayer;
               return WIN;
           }
       }
   }

   public boolean checkWinner(int row, int col, Piece piece){
       boolean rowCheck = true;
       boolean colCheck = true;
       boolean diagonal = true;
       boolean antidiagonal = true;

       for(int i =0 ; i<gameBoard.size; i++){
            if(gameBoard.board[row][i]==null || gameBoard.board[row][i] != piece){
                rowCheck = false;
                break;
            }
       }

       for(int i=0; i<gameBoard.size; i++){
           if(gameBoard.board[i][col]==null || gameBoard.board[i][col] != piece){
               colCheck = false;
               break;
           }
       }
       int i=0;
       int j=0;
       while(i<gameBoard.size && j<gameBoard.size){
           if(gameBoard.board[i][j]==null || gameBoard.board[i][j]!=piece){
               diagonal = false;
               break;
           }
           i++;
           j++;
       }
       i=gameBoard.size-1;
       j=0;
       while(i>=0 && j<gameBoard.size){
           if(gameBoard.board[i][j]==null || gameBoard.board[i][j]!=piece){
               antidiagonal = false;
               break;
           }
           i--;
           j++;
       }

       return rowCheck || colCheck || diagonal || antidiagonal;
   }
}
