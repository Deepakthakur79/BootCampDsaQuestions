// find the largest rectangle in histogram
public class LargestRectangleHistogram {
    public static void main(String[] args) {

        int arr[] = {2, 1, 5, 6, 2, 3};
        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {

            int minHeight = arr[i];

            for (int j = i; j < arr.length; j++) {

                if (arr[j] < minHeight) {
                    minHeight = arr[j];
                }

                int width = j - i + 1;
                int area = minHeight * width;

                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        System.out.println("Largest Area = " + maxArea);
    }
}