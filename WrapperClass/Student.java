public class Student{
	int id;
	public Student(int id){
	this.id=id;
	}
	public static void main(String[] args){
	 Student s=new Student(1234);
		s.printId(s.id);
		
	}
	public void printId(int id){
		System.out.println("print id "+ id);
		

	}

}