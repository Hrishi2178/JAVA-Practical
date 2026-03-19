//Hybrid Inheritance
 class Plants{
	void display(){
		System.out.println("mai zhad hu");
	}
}

class Shrub extends Plants{
  	void show(){
		System.out.println("mai chota hota hu");
		}
	}

class herbs extends Plants{
	  void bata(){
		System.out.println("mai uusse bhi chota hota hu");
		}
	}

class Limbu extends Shrub{
 void sach(){
	System.out.println("Iam also akind of shrub");
	}	
}

class Main{
	public static void main(String[] args){
		Limbu l=new Limbu();
		//l.bata();
		l.show();
		l.display();
		l.sach();
	}
}

 	
