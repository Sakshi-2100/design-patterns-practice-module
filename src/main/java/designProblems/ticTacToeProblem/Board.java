package designProblems.ticTacToeProblem;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public record CellPosition(int row, int col) {}

    public int size;
    public Piece[][] board;

    public Board(int size){
        this.size = size;
        board = new Piece[size][size];
    }

    public boolean fillCell(Piece p, int cellRow, int cellCol){
        if(board[cellRow][cellCol] == null){
            board[cellRow][cellCol] = p;
            return true;
        }
        return false;
    }

    public List<CellPosition> getFreeCells(){
        List<CellPosition> freeCells = new ArrayList<>();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row][col] == null) {
                    freeCells.add(new CellPosition(row, col));
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                String value = board[row][col] == null ? " " : board[row][col].name();
                System.out.print(" " + value + " ");
                if (col < size - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row < size - 1) {
                System.out.println("---+".repeat(size - 1) + "---");
            }
        }
    }

}
