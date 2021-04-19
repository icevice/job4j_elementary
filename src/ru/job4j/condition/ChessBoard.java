package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int rsl2 = 0;

        if (x1 != x2 && y1 != y2) {
            rsl = Math.abs(y2 - y1);
            rsl2 = Math.abs(x2 - x1);
            if (rsl != rsl2) {
                rsl = 0;
            }
            if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {

                rsl = 0;
            } else if (rsl > 7) {
                rsl = 0;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(3, 0, 5, 2));
    }
}