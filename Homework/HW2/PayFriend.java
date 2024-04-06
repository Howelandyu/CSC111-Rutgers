public class PayFriend{
static double Totalpay;
	public static void main(String[] args) {
		double payMount=IO.readDouble();
		
		if (payMount<=100) {
				Totalpay=5;
			
		}
		//double Totalpay;
		else if (payMount>100&&payMount<1000) {
			double Totalpay1=6.0;
			double Totalpay2=payMount*0.03;
			if (Totalpay1>Totalpay2) {
				Totalpay=Totalpay1;
			}
			else{
				Totalpay=Totalpay2;
			}
		}
		//double Totalpay;
		else if (payMount>=1000&&payMount<10000) {
				double Totalpay3=15.0;
				double Totalpay4=payMount*0.01;
				if (Totalpay3>Totalpay4){
					Totalpay=Totalpay3;
				}
				else{
					Totalpay=Totalpay4;
				}
		}
		//double Totalpay;
		else if (payMount>=10000) {
			double expay1=10000.0*0.01;
			double expay2=(payMount-10000.0)*0.02;
			//double expay3=Totalpay-10000.0-5000.0;
			if (payMount>=10000&&payMount<=15000) {

				Totalpay=expay1+expay2;
			}		

			else{
				Totalpay=(payMount-15000.0)*0.03+expay1+5000.0*0.02;	
			}
		}
		IO.outputDoubleAnswer(Totalpay);
	}
}