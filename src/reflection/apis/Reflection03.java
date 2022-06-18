package reflection.apis;

public class Reflection03 {

  public static void main(String[] args) {
    Simple s = new Simple();
    System.out.println("class =" + s.getClass());
    System.out.println("class name =" + s.getClass().getName());
}
}
