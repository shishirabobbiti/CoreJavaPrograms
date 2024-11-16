class Parent{

	static String p="Parent";

	public Parent(){
		System.out.println("Parent Constructor");
	}

}

class Child extends Parent{

	public void getText(){
		System.out.println(super.p);
	}

	public Child(){
		super();
	}

}


public class SuperKeyword{

	public static void main(String[] maruthi){
		Child c=new Child();
		c.getText();
	}

}
//this->to distinguish b/w instance vs local variables
//this()->to call same class constructor
//super->to call parent class properties
//super()->to call parent class constructor