package Game.util.D2Dim;

import Game.WindowInitializer;

import java.util.LinkedList;

public class Coord {

    public int line, col;

    public Coord(int line, int col) {
        this.line = line;
        this.col = col;
    }

    public LinkedList<Coord> getCoordAdjacent(){
        LinkedList<Coord> coordAdjacent = new LinkedList<>();
        for (int i=-1; i<2; i++){
            for (int j=-1; j<2; j++){
                if (WindowInitializer.isBoard(new Coord(line+i, col+j) ))
                    coordAdjacent.add(new Coord(line+i, col+j));
            }
        }
        return coordAdjacent;
    }

    @Override
    public String toString() {
        return "Coord{" +
                "line=" + line +
                ", col=" + col +
                '}';
    }

    public boolean isCoordEqual(Coord coord){
        return (this.line == coord.line && coord.col == this.col);
    }
}
