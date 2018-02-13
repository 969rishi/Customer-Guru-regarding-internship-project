import java.util.*;
import java.text.*;
import java.util.Date; 

public class Tex {
	
	
	String[] ddfrmdt;
	String[] ddtodt;
	String[] ddfrmm;
	String[] ddtomm;
	String[] currndt;
	
	int ddofFromDate;
	int ddofToDate;
	int MMofFromDt;
	int mmdtTodt1;
	int cudd;
	int todtyr;
	int fromyrr;
	
	
	protected void dispmsg(){
		System.out.println("Please Enter date in prescribed format: dd-MM-YYYY");
		System.out.println("Enter From_Date and To_Date : ");

	}

	public void function1(String s1, String s2){
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date Currntdate = new Date();
			//to get current date below
			String Currntdate1 = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
			
			Date date1 = sdf.parse(s1);
			Date date2 = sdf.parse(s2);
			
			//To break the dd
			ddfrmdt = s1.split("-");
			ddofFromDate = Integer.parseInt(ddfrmdt[0]);
			ddtodt = s2.split("-");
			ddofToDate = Integer.parseInt(ddtodt[0]);
			todtyr = Integer.parseInt(ddtodt[2]);
				//To break the MM
			ddfrmm = s1.split("-");
			MMofFromDt = Integer.parseInt(ddfrmm[1]);
			fromyrr = Integer.parseInt(ddfrmm[2]);
			ddtomm = s2.split("-");
			mmdtTodt1 = Integer.parseInt(ddtomm[1]);
			//to break current date
			
			currndt = Currntdate1.split("-");
			cudd = Integer.parseInt(currndt[2]);

			if ((ddofFromDate > 31)) {
				System.out.println("Your Days is exceeding than 31 days for a month!");
			}
			else if ((ddofToDate > 31)) {
				System.out.println("Your Days is exceeding than 31 days for a month!");
			}

			else if ((MMofFromDt > 12) || (mmdtTodt1 > 12)) {
				System.out.println("Your month is exceeding than 12 month in a Year");
			}

			else if (date1.compareTo(date2) == 0) {
				System.out.println("From_Date and To_Date can not be Not equal! Try Again!");
			} else if (date1.equals(null)) {
				System.out.println("From Date can not be Not Empty! Try Again!");
			} 
			else if (date1.compareTo(date2) > 0) {
				System.out.println("From_Date can not be greater then To_Date! Try Again!");
			}
			else if (date2.compareTo(Currntdate) > 0) {
				System.out.println("To_Date Can not be greater than Current Date! Try Again!");
			}

			else if (todtyr == cudd) {
				cudd = Integer.parseInt(currndt[1]);
				ddofFromDate = Integer.parseInt(ddfrmdt[2]);
				if (ddofFromDate == todtyr) {
					ddofFromDate = Integer.parseInt(ddfrmdt[1]);			

					if (ddofFromDate < 30) {
						String finFromDate = "01-"+ddfrmdt[1]+"-"+ddfrmdt[2];
						System.out.println("FROM_DATE : "+finFromDate);
						System.out.println("TO_DATE : "+Currntdate1);
					}else{
						String finFromDate = ddfrmdt[0]+"-"+ddfrmdt[1]+"-"+ddfrmdt[2];
						System.out.println("FROM_DATE : "+finFromDate);
						System.out.println("TO_DATE : "+Currntdate1);
					}				

				}else if (ddofFromDate != todtyr) {
					ddofFromDate = Integer.parseInt(ddfrmdt[1]);			

					if (ddofFromDate < 30) {
						String finFromDate = "01-"+ddfrmdt[1]+"-"+ddfrmdt[2];
						System.out.println("FROM_DATE : "+finFromDate);
						System.out.println("TO_DATE : "+Currntdate1);
					}else{
						String finFromDate = ddfrmdt[0]+"-"+ddfrmdt[1]+"-"+ddfrmdt[2];
						System.out.println("FROM_DATE : "+finFromDate);
						System.out.println("TO_DATE : "+Currntdate1);
					}				

				}

			}else if (todtyr == fromyrr) {
				cudd = Integer.parseInt(currndt[1]);
				ddofFromDate = Integer.parseInt(ddfrmdt[2]);
				if (ddofFromDate == todtyr) {
					ddofFromDate = Integer.parseInt(ddfrmdt[1]);			

					if (ddofFromDate < 30 && ddofToDate <30) {
						String finFromDate = "01-"+ddfrmdt[1]+"-"+ddfrmdt[2];
						System.out.println("FROM_DATE : "+finFromDate);
						if ((mmdtTodt1 %2 != 0) || mmdtTodt1 == 8 || mmdtTodt1 == 10 || mmdtTodt1 == 12) {
							Currntdate1 = "31-"+ddtomm[1]+"-"+ddtomm[2];
							System.out.println("TO_DATE : "+Currntdate1);
						}else{
							Currntdate1 = "30-"+ddtomm[1]+"-"+ddtomm[2];
							System.out.println("TO_DATE : "+Currntdate1);
						}
						
					}
				}

			}else if (todtyr != fromyrr) {
				
				cudd = Integer.parseInt(currndt[1]);
				ddofFromDate = Integer.parseInt(ddfrmdt[2]);
				if (ddofFromDate != todtyr) {
					ddofFromDate = Integer.parseInt(ddfrmdt[1]);			

					if (ddofFromDate < 30 && ddofToDate <30) {
						String finFromDate = "01-"+ddfrmdt[1]+"-"+ddfrmdt[2];
						System.out.println("FROM_DATE : "+finFromDate);
						if ((mmdtTodt1 %2 != 0) || mmdtTodt1 == 8 || mmdtTodt1 == 10 || mmdtTodt1 == 12) {
							Currntdate1 = "31-"+ddtomm[1]+"-"+ddtomm[2];
							System.out.println("TO_DATE : "+Currntdate1);
						}else{
							Currntdate1 = "30-"+ddtomm[1]+"-"+ddtomm[2];
							System.out.println("TO_DATE : "+Currntdate1);
						}
						
					}
				}
			}
			

		} 

		catch (ParseException e) { 
			System.out.println("Please Enter the date into prescribed format only => dd-MM-YYYY");
		}
	}


	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		Tex ob = new Tex();
		ob.dispmsg();
		ob.function1(sc.nextLine(), sc.nextLine());
		

	}
}