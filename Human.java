class Human {
  // フィールド
  private String name;
  private int age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // メゾット
  public void walk() {
    System.out.println(name + "が動きます。");
  }

  public void run() {
    System.out.println(name + "が走ります。");
  }

  public String speak(String content) {
    return name + "(" + age + ")" + content;
  }
}

class Main {
  public static void main(String[] args) {
    Human human = new Human("jhon", 23);
    human.walk();
    human.run();
    System.out.println(human.speak("エンジェル"));
  }
}