public class SumOfNumbers {
  public static void main(String[] args) {
    int sum = 0; 

    for (int i = 1; i <= 100; i++) {
      sum += i;
    }

    System.out.println("1から100までの合計: " + sum);
  }
}