class SumOfNumbers {

  public void SumOfNumber(int score) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
        sum += i;
    }
    System.out.println("1から100までの合計: " + sum);
  }

  public void ReverseNumbers(int score) {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

  public void count(int score){
    int gusu = 0;
    int kisu = 0;
    for (int i = 1; i <= 20; i++){
      if (i % 2 == 0){
        gusu++;
        continue;
      }
      kisu++;
    }
    System.out.println("偶数"+gusu);
    System.out.println("奇数"+kisu);
  }

}

// Mainクラス
class Main {
  public static void main(String[] args) {
    SumOfNumbers SumOfNumbers = new SumOfNumbers();
    SumOfNumbers.SumOfNumber(0);
    SumOfNumbers.ReverseNumbers(0);
    SumOfNumbers.count(0);
  }
}
