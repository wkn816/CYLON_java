class Car {
  // フィールド
  private String color;
  private String name;

  public Car(String color, String name) {
      this.color = color;
      this.name = name;
  }

  // メソッド
  public void start() {
      System.out.println(name + "が動きます。");
  }

  public void stop() {
      System.out.println("車が止まりました。");
  }

  public String turn(String direction) {
      return "車が" + direction + "に曲がりました。";
  }
}


class Main {
    public static void main(String[] args){
      Car car = new Car("red", "GTR");
      car.start();
      System.out.println(car.turn("右"));
  }
}