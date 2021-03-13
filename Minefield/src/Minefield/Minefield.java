package Minefield;

import mvc.Model;

public class Minefield extends Model {

    public static int percentMined = 5;
    public static final int gridSize = 20;

    private boolean[][] gridMined;
    private boolean[][] gridLocations;

    public Minefield() {
        gridMined = new boolean[gridSize][gridSize];
        gridLocations = new boolean[gridSize][gridSize];
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                
            }
        }
    }

    public void nw() {

    }

    public void n() {

    }

    public void ne() {

    }

    public void w() {

    }

    public void e() {

    }

    public void sw() {

    }

    public void s() {

    }

    public void se() {

    }
}
