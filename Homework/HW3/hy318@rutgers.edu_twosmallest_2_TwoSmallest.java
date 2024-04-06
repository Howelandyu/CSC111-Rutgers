
public class TwoSmallest {
	public static void main(String[] arg) {
		double terminum=IO.readDouble();
		double usernum=IO.readDouble();
		double firsmallest=usernum;
		double secsmallest =IO.readDouble();
		while(secsmallest == terminum) {
			IO.reportBadInput();
			secsmallest = IO.readDouble();
		}
		//double con=0;
		do{
			//usernum=IO.readDouble();
			if(usernum<firsmallest) {
				//terminum=firsmallest;
				secsmallest=firsmallest;
				firsmallest=usernum;
			}	
			else if(usernum<secsmallest) {
					secsmallest=usernum;
			}
			usernum=IO.readDouble();
			//con++;
		}
		while(usernum!=terminum);
		
		//if(usernum==terminum) {t
			//System.out.println("end");
		IO.outputDoubleAnswer(firsmallest);
		IO.outputDoubleAnswer(secsmallest);
			//usernum++;
			//}
	}
}