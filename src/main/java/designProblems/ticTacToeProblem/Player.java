package designProblems.ticTacToeProblem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player{
    Piece piece;
    String name;

    public Player(String name, Piece piece){
        this.name = name;
        this.piece = piece;
    }

}
