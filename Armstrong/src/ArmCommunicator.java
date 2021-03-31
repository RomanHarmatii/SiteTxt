import java.util.List;
import java.util.Scanner;

public class ArmCommunicator implements Print<List<Integer>>, Input<Integer>  {
    private final Scanner scanner = new Scanner(System.in);

    public ArmCommunicator() { }

    @Override
    public Integer getInput() {
        int input = 0;
        System.out.println("Please enter your data:");
        if (scanner.hasNextInt()) {
            input = scanner.nextInt();
        } else {
            System.out.println("Incorrect input.");
        }
        return input;
    }

    @Override
    public void print(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
