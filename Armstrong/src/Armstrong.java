import java.util.ArrayList;
import java.util.List;

public class Armstrong {

    private final List<Integer> armstrongList = new ArrayList<>();

    public List<Integer> getNumbers(int n) {
        for (int i = 10; i < n; i++) {
            int degree = String.valueOf(Math.abs(i)).length();
            int input = i;
            int sum = 0;
            int k;

            do {
                k = input % 10;
                int a = 1;
                for (int j = 0; j < degree; j++) {
                    a *= k;
                }
                sum += a;
            } while ((input /= 10) > 0);

            if (sum == i) {
                armstrongList.add(i);
            }
        }
        return armstrongList;
    }
}
