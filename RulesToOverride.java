class Parent1{

	public Parent2 getParent2Object(){
		System.out.println("Parent getParent2Object method");
		Parent2 p2=new Parent2();
		return p2;
	}

	public String getText(){
		return "Parent1";
	}
}

class Child1 extends Parent1{

	//public Parent2 getParent2Object(){
	//	Parent2 p2=new Parent2();
	//	return p2;
	//}

	public Child2 getParent2Object(){
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
		String value=p1.getText();
		System.out.println(value);
		Parent2 p2=p1.getParent2Object();
		p2.helloWorld();
		Parent1 p3=new Child1();
		p3.getParent2Object().helloWorld(); 
		Child1 c1=new Child1();
		Child2 p4=c1.getParent2Object();
		p4.helloWorld();
				
		
	}

}