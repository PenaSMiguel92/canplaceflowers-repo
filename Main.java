public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 1));
        System.out.println(sol.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2));
        System.out.println(sol.canPlaceFlowers(new int[] { 0, 0, 1, 0, 0 }, 1));
        System.out.println(sol.canPlaceFlowers(new int[] { 1 }, 1));
        System.out.println(sol.canPlaceFlowers(new int[] {0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0}, 4));
    }
}
