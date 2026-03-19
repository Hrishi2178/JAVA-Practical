
//iNHERITANCE
class Person{
	String name;
	int age;
	void display(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		}
	}

class Student extends Person{
	int marks;
	void show(){
		System.out.println("marks: "+marks);

	}
	
}

class Main{
	public static void main(String[] args){
		Student s=new Student();
		s.name="Hrishikesh";
		s.age=19;
		s.marks=100;

		s.display();
		s.show();
	}
}