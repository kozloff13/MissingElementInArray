public class Main {

    public static int getRemoveItem(int[] arr, int capacity) {
        int arrSum = 0;
        int totalSum = 0;

        for(int i = 1; i <= capacity; i++){
            totalSum += i;
        }
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        
        getRemoveItem(mas, 100);
    }
}
