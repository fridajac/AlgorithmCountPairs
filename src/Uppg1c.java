public class Uppg1c {

    /*
    Gå igenom arrayen av storlek N och räkna alla par.
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 5};
        System.out.println(countpairs(arr));
    }

    public static double getNbrOfPairs(int uniqueValues) {
        return ((Math.pow(uniqueValues, 2)) - uniqueValues) / 2;
    }

    private static int countpairs(int[] sortedarr) {
        int N = sortedarr.length;
        int pairs = 0;
        int identicalValues = 1;
        for (int i = 0; i < N - 1; i++) {
            if (sortedarr[i] == sortedarr[i + 1]) identicalValues++;
            else {
                pairs += getNbrOfPairs(identicalValues);
                identicalValues = 1;
            }
        }
        return pairs += getNbrOfPairs(identicalValues);
    }
}
