// celebrity problem  using stack
import java.util.Stack;

public class Main {

    static int findCelebrity(int arr[][], int n) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {

            int a = st.pop();
            int b = st.pop();

            if (arr[a][b] == 1)
                st.push(b);
            else
                st.push(a);
        }

        int candidate = st.pop();

        for (int i = 0; i < n; i++) {

            if (i != candidate) {

                if (arr[candidate][i] == 1 ||
                    arr[i][candidate] == 0)
                    return -1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int arr[][] = {
                {0,1,1},
                {0,0,0},
                {0,1,0}
        };

        int ans = findCelebrity(arr, 3);

        if (ans == -1)
            System.out.println("No Celebrity");
        else
            System.out.println("Celebrity = " + ans);
    }
}