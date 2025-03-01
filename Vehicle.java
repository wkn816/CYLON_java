class Vehicle {
  public void start() {
      System.out.println("Vehicle start");
  }
}

class Car extends Vehicle {
  @Override
  public void start() {
      super.start(); // 親クラスのstartメソッドを呼び出す
      System.out.println("Car is starting...");
  }
}

// Mainクラスをpublicにする
class Main {
  public static void main(String[] args) {
      Car car = new Car();
      car.start();
  }
}
