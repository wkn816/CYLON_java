//インターフェースの定義
interface Shape{
  void draw();
}

//クラスの実装
class Circle implements Shape{
  @Override
  public void draw(){
    System.out.println("Circleクラス");
  }
}

class Rectangle implements Shape{
  @Override
  public void draw(){
    System.out.println("Rectangleクラス");
  }
}

class Main{
  public static void main(String[] args) {
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();

    circle.draw(); // Woof!
    rectangle.draw(); // Meow!
}
}