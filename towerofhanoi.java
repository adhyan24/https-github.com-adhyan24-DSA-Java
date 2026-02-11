public class towerofhanoi {
    static int total = 3;

    public static void toh(char src, char dest, char aux, int n) {
        if (n == 0) {
            return;
        }

        toh(src, aux, dest, n - 1); // 1st faith (choti disc souce -> exxtra tower)

        System.out.println((total - n + 1) + ". disc  move from " + src + " tower to " + dest + " tower");

        toh(aux, dest, src, n - 1);// 2nd faith (choti discs to destination tower)
    }

    public static void main(String[] args) {
        toh('A', 'C', 'B', 3);

    }

}
