package reflection.apis;

public class Simple {

  public int a = 10;
  public int b = 20;
  
  public Simple() {
  }
  
  public Simple(int a, int b) {
  this.a = a;
  this.b = b;
  }

  public void squareA() {
    this.a *= this.a;
  }
  
  public void squareB() {
    this.b *= this.b;
  }
  
  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }
  
  public void setA(int a) {
    this.a = a;
  }
  
  public void setB(int b) {
    this.b = b;
  }
  
  public String toString() {
    return String.format("(a:%d, b:%d)", a, b);
  }
}
