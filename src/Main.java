public class Main {

    /*
    Gå igenom arrayen av storlek N och räkna alla par.
     */

    public static void main(String[] args) {
        byte[] arr = {1, 2, 3, 3, 3, 5};
        System.out.println(countPairs(arr));
    }

    public static double getNbrOfPairs(int uniqueValues) {
        return ((Math.pow(uniqueValues, 2)) - uniqueValues) / 2;
    }

    private static int countPairs(byte[] arr) {
        int totalNbrOfPairs = 0;
        int identicalValues = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) identicalValues++;
            else {
                totalNbrOfPairs += getNbrOfPairs(identicalValues);
                identicalValues = 1;
            }
        }
        return totalNbrOfPairs += getNbrOfPairs(identicalValues);
    }
}
