public class Practical8{
 	public static void main(String[] args){
		long startTime,endTime;

		//Using String
		startTime=System.nanoTime();
		
		String str="UTSAV";
		for(int i=1;i<=2026;i++){
			str=str+"_"+i;
		}


		endTime=System.nanoTime();
		System.out.println("String Time: "+(endTime-startTime));


		//Using String Buffer

		startTime=System.nanoTime();
		

		StringBuffer sbf=new StringBuffer("UTSAV");
		for (int i=1;i<=2026;i++){
		sbf.append("_").append(i);
		}

		endTime=System.nanoTime();
		System.out.println("StringBuffer Time:"+(endTime-startTime));

		//Using StringBuilder
  		startTime=System.nanoTime();

		StringBuilder sbd=new StringBuilder("UTSAV");
		for(int i=1;i<=2026;i++){
			sbd.append("_").append(i);
		}
		
 		endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime));
    }
}