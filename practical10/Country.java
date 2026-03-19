//multilevel inheritance

class Country{
	void myCountry(){
		System.out.println("hi! iam India");
		}
	}
class State extends Country{
	void myState(){
		System.out.println("hello !I AM MAHARASHTRA");
		}
}

class City extends State{
		void myCity(){
		System.out.println("hey! I am Lonar");
		}
	}

class Main{
	public static void main(String []args){
		City c=new City();

		c.myCity();
		c.myState();
		c.myCountry();
	}
}