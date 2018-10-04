package com.ipiecoles.java.java210;

public class Main {
    public static void main(String[] args){
        System.out.println(Sudoku.FIN_SAISIE);

        Sudoku s = new Sudoku();

        /*s.setSudokuAResoudre(new short[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        });*/

        System.out.println(s.getSudokuAResoudre()[0][2]);
    }
}
