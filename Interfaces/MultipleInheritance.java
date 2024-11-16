interface IBMW{
	void cost();
}
interface IAudi{
	void powerOfEngine();
}
class Car implements IBMW,IAudi{
	public void cost(){
		System.out.println("50 lakhs");
	}
	public void powerOfEngine(){
		System.out.println("High Speed");
	}
}


public class MultipleInheritance{
		public static void main(String[] args){
		Car c=new Car();
		c.cost();
		c.powerOfEngine();
		}


}