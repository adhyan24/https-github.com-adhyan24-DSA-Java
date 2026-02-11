import java.util.*;

public class Backtracking2 {
    
    final static char L[][] = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' },
            { 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void rateinmaze(int x, int y, int maze[][], int n, String curr) {

        // base case
        if (x < 0 || y < 0 || x == n || y == n || maze[x][y] == 0) {
            return;
        }
        if (x == n - 1 && y == n - 1) {
            System.out.println(curr);
        }
        // recursion
        maze[x][y] = 0;
        rateinmaze(x + 1, y, maze, n, curr + 'd');
        rateinmaze(x, y - 1, maze, n, curr + 'l');
        rateinmaze(x, y + 1, maze, n, curr + 'r');
        rateinmaze(x - 1, y, maze, n, curr + 'u');

        maze[x][y] = 1;
    }

    public static void keypad(String D) {
        int len = D.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        bfs(0, len, "", D);

    }

    public static void bfs(int pos, int len, String sb, String D) {
        if (pos == len) {

            System.out.println(sb);

        } else {

            char[] letters = L[Character.getNumericValue(D.charAt(pos))];

            for (int i = 0; i < letters.length; i++)

                bfs(pos + 1, len, sb+(letters[i]), D);

        }
    }

    public static void main(String[] args) {
        int n = 4;
        int mat[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 } };

        rateinmaze(0, 0, mat, n, "");

        keypad("24");

    }

}
