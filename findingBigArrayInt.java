import org.omg.CORBA.portable.ValueOutputStream;


public class findingBigArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrr={4335,65,17,8,0,181,654,15,38,990,-1};
		
//		System.out.println(arrr.length);
//		int p=arrr[0];
//		int q=arrr[1];
//		
//		arrr[0]=p < q ? p:q;
//		arrr[1]=q>p?q:p;
		
		for (int i : arrr) {
			System.out.println(i);
		}
		bigArr(arrr,arrr.length-1);
		for (int i : arrr) {
			System.out.println("last"+i);
		}
	}

	static void bigArr(int arrq[],int ng){
		//int[] arr=arrq;
		
		if(arrq.length>=1&& ng>0){
			for (int i = 0; i < arrq.length-1; i++) {
				int p=arrq[i];
				int q=arrq[i+1];
			arrq[i]=p < q ? p:q;
			arrq[i+1]=q>p?q:p;
			
			}
			ng--;
		bigArr(arrq, ng);	
		}
	/*	for (int i : arrq) {
			System.out.println(i);
		}*/
		
	}
	
}
