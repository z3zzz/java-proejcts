class Student {
  void talk() {
    System.out.println("tallllllllk");
  }
  static double stand() {
    System.out.println("staaaaand");
    double x = Math.random();
    System.out.println(x);
    return x;
  }
  public static void main(String[] args){
    Student s1 = new Student();
    s1.talk();
    s1.stand();
    Student.stand();
  }
}

