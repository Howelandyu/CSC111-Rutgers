
public class Change {
	public static void main(String[] args) {
		double totalCost=0;
		double totalPay = 0;
		change(totalCost,totalPay);
	}
	public static void change(double totalCost,double totalPay) {
		totalCost=IO.readDouble();
		totalPay=IO.readDouble();
		double bchange=totalPay-totalCost;
		//int dchange=(int)change;
		int cchange=(int) ((bchange-(int)bchange)*100);
		//System.out.println(cchange); test
		int onethirty;
		int fiyf;
		int twfif;
		int fives;
		int ones;
		int seventyfifc;
		int thirtyc;
		int onec;
		//double Rainder;
		if(bchange>=0) {
		if(bchange>=130) {
			onethirty=(int)bchange/130;
			bchange=bchange-onethirty*130;
		}
		else {
			onethirty=0;
		}
		

		if(bchange>=55) {
			fiyf=(int) (bchange/55);
			bchange=bchange-fiyf*55;
		}
		else {
			fiyf=0;
		}
		
		if(bchange>=25) {
			twfif=(int) (bchange/25);
			bchange=bchange-twfif*25;
		}
		else {
			twfif=0;
		}
		
		if(bchange>=5) {
			fives=(int) (bchange/5);
			bchange=bchange-fives*5;
		}
		else {
			fives=0;
		}
		
		if(bchange>=1) {
			ones=(int) (bchange);
			bchange=ones;
		}
		else {
			ones=0;
		}
		
		if(cchange>=75) {
			seventyfifc=cchange/75;
			cchange=cchange-seventyfifc*75;
		}
		else {
			seventyfifc=0;
		}
		
		if(cchange>=30) {
			thirtyc=cchange/30;
			cchange=cchange-thirtyc*30;
		}
		else {
			thirtyc=0;
		}
		
		if(cchange>=1) {
			onec=(int)cchange;
			cchange=cchange-onec;
		}
		else {
			onec=0;
		}
		IO.outputIntAnswer(onethirty);
		System.out.println("("+onethirty+" $130 bill)");
		IO.outputIntAnswer(fiyf);
		System.out.println("("+fiyf+" $55 bill)");
		IO.outputIntAnswer(twfif);
		System.out.println("("+twfif+" $25 bill)");
		IO.outputIntAnswer(fives);
		System.out.println("("+fives+" $5 bill)");
		IO.outputIntAnswer(ones);
		System.out.println("("+ones+" $1 bill)");
		IO.outputIntAnswer(seventyfifc);
		System.out.println("("+seventyfifc+" $0.75 coin)");
		IO.outputIntAnswer(thirtyc);
		System.out.println("("+thirtyc+" $0.30 coin)");
		IO.outputIntAnswer(onec);
		System.out.println("("+onec+" $0.01 coin)");
		}

		else if(bchange<0) {
			IO.reportBadInput();
			IO.outputIntAnswer(-1);
		}
		
	}
}