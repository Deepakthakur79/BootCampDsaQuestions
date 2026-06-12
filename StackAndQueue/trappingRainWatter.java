// trapping rain water
public class trappingRainWatter {

    public static void main(String[] args) {

        int arr[] = {3, 0, 0, 2, 0, 4};
        int water = 0;

        for (int i = 1; i < arr.length - 1; i++) {

            int leftMax = arr[i];

            for (int j = 0; j < i; j++) {
                if (arr[j] > leftMax)
                    leftMax = arr[j];
            }

            int rightMax = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > rightMax)
                    rightMax = arr[j];
            }

            water += Math.min(leftMax, rightMax) - arr[i];
        }

        System.out.println("Water Trapped = " + water);
    }
}