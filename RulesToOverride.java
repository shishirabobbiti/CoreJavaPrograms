class Parent1{
	public Parent2 getParent2Object(){
		Parent2 p2=new Parent2();
		return p2;
	}

	public String getText(){
		return "Parent1";
	}
}

class Child1 extends Parent1{

	//public Parent2 getParent2Object(int i){
	//	return new Parent2();
	//}
	
	public Child2 getParent2Object(int i){
		return new Child2();
	}

}

class Parent2{	

	public void helloWorld(){
		System.out.println("Hello");
	}

}



class Child2 extends Parent2{

}


public class RulesToOverride{

	public static void main(String[] shishira){
		Parent1 p1=new Parent1();
		System.out.println("Hello");
	}

}