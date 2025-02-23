class IndexPrac {

  public void index1(){
      int[] myArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
      System.out.println("1番目の要素: " + myArray[0]);
  }

  public void index2(){
      int[][] myArray = {{1,2,3},{10,20,30},{100,200,300}};
      System.out.println("1番目の要素:"+ myArray[0][0]);
  }

  public void index3(){
      int[] myArray = {1,2,3,4,5,6,7,8,9,10};
      for(int i : myArray){
        System.out.println(i);
      }
  }
}

class Main {
  public static void main(String[] args) {
      IndexPrac indexPrac = new IndexPrac();
      indexPrac.index1();
      indexPrac.index2();
      indexPrac.index3();
  }
}