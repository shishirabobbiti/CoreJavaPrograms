abstract class C1 {
 public C1() { 
System.out.print(1); 
}
 }
 class C2 extends C1 {
 public C2() { 
System.out.print(2); 
}
 }
 class C3 extends C2 {
 public C3() { 
System.out.println(3);
}
 }
 public class Ctest {
 public static void main(String[] a) {
 new C3(); 
}
 }
//What is the result?
 //A. 3
// B. 23
// C. 32
// D. 123
// E. 321
// F. Compilation fails.
// G. An exception is thrown at runtime.