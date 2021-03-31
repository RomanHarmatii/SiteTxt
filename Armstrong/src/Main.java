/*A natural number of n digits is the Armstrong number if the sum of its digits raised to the nth power is
  is equal to the number itself (like, for example, 153 = 1 ^ 3 + 5 ^ 3 + 3 ^ 3).
  Get all Armstrong numbers with two, three and four digits. */

public class Main {
    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        ArmCommunicator communicator = new ArmCommunicator();
        communicator.print(armstrong.getNumbers(communicator.getInput()));
    }
}
