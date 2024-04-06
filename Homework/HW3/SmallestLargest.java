public class SmallestLargest {
	public static void main(String[] arg) {
		double terminum=IO.readDouble();
		double usernum=IO.readDouble();
		double lagest=usernum;
		double lowest =usernum;	
		while(usernum!=terminum) {
			//usernum=IO.readDouble();
		
			if(usernum>lagest) {
				lagest=usernum;
			}	
			if(usernum<lowest) {
				lowest=usernum;
			}
			usernum=IO.readDouble();
		}	
		IO.outputDoubleAnswer(lowest);
		IO.outputDoubleAnswer(lagest);
			
		if(lagest==lowest) {
			IO.reportBadInput();
		}	
	}
}