import java.util.*;
class Merg {

	Merg(){
		System.out.println("Program to Merg two Sorted Array!");
		System.out.print("How many Values want to Enter in 1st Array: ");
	}

	void fun1(){
		System.out.print("How many Values want to Enter in 2st Array: ");
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[]={};
		int[] Sarr;
		int TotalArrLen =0;
		Merg ob = new Merg();
		int ValLen =  sc.nextInt();

		
		if (ValLen != 0) {

			arr = new int[ValLen];

			for (int i = 0; i < ValLen; i++)
			{
				System.out.print("Enter the Value in 1st Array: "+i+": ");
				arr[i] = sc.nextInt();
			}

		}else{System.out.print("Array Should be Greater than ZERO");}

		ob.fun1();
		int ScndArrLen =  sc.nextInt();
		TotalArrLen = ScndArrLen+ValLen;
		if (ScndArrLen != 0) {

			Sarr = new int[TotalArrLen];

			for (int i = 0; i < ScndArrLen; i++)
			{	
				System.out.print("Enter the Values in 2st Array: "+i+": ");
				Sarr[i] = sc.nextInt();
			}
			
			System.out.println("Total Size of Array is: "+TotalArrLen);

			int Len = ScndArrLen;

			for (int i=0; i<ValLen; i++) {		// complexity O(n)
				Sarr[Len] = arr[i];
				Len++;		
			}
			
			Arrays.sort(Sarr);

			for (int i=0; i<TotalArrLen; i++) {
				System.out.println("Array: "+Sarr[i]);
			}
		}else{System.out.print("Array Should be Greater than ZERO");}
	}

}