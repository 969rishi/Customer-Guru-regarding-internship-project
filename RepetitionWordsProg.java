import java.util.*;

public class RepetitionWordsProg{
	public static int count = 0;
	RepetitionWordsProg(){

		System.out.println("Program to Solve the Top 5 most repeated words from a List");
		System.out.print("How many Values want to Enter: ");
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr;
		
		RepetitionWordsProg ob = new RepetitionWordsProg();
		int ValLen =  sc.nextInt();
		int co=0;

		if (ValLen != 0) {

			arr = new String[ValLen];
			String tempstr[] = new String[ValLen];
			int[] prr = new int[ValLen];
			int[] temp =new int[ValLen];
			
			for (int i = 0; i < ValLen; i++)
			{
				System.out.print("Please Enter the Value "+i+": ");
				arr[i] = sc.next();
			}

			for (int i = 0; i < arr.length; i++)

				{			count = -1; co =0;
					while (co<ValLen) {

						if (arr[i].equalsIgnoreCase(arr[co])) {
							count++;
							prr[i] = count;
						}co++;
					}

					{
						{co = i+1;
							while (co<arr.length) {

								if (arr[i].equalsIgnoreCase(arr[co])) {
									arr[co] = "NULL";
									prr[co] = 0;
								}co++;
							}
						}			

					}
				}

				System.out.println("Top 5 most repeated words are as Follow:");
				System.out.println(" Words   |    Repetition Time");
				
				for (int i = 0; i < prr.length; i++)
				{
					for (int j=i+1; j<prr.length; j++) {

						if (prr[i]<prr[j]) {

							temp[i] = prr[i];
							prr[i] = prr[j];
							prr[j] = temp[i];

							tempstr[i] = arr[i];
							arr[i] = arr[j];
							arr[j] = tempstr[i];
							
						}
					}

					if (arr[i] != "NULL" ) {
						System.out.println(" "+arr[i]+   "       "+prr[i]);
					}

				}

				
			}

		}
	}