
//Super class usage
class Animals{
 void sound(){
		System.out.println("Animal Sound");
		}
}

class dog extends Animals{
	dog(){
		super.sound();
	System.out.println("Dog Barks");
	}
}

 class Main{
   public static void main(String[] args){
		dog d= new dog();
		d.sound();
	}
}