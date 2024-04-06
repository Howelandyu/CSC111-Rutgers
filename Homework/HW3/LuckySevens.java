
public class LuckySevens {
	public static void main(String[] arg) {
		int lowerang=IO.readInt();
		int uprang=IO.readInt();
		int d;
		String changenum=""; 
		int sevensnum=0;
		//int sevens;
		int con=0;
		//for(d=0;d>lowerang&&d>uprang;d++){
		for(d=lowerang;d<=uprang;d++) {
			changenum=Integer.toString(d);
			sevensnum=changenum.length();
			//k=0;
			for(int k=0;k<sevensnum;k++) {
				if(changenum.charAt(k)=='7') {
					con++;
				}
			}	
			if(d==uprang) {
				IO.outputIntAnswer(con);
			}
		}	
		if(lowerang>uprang) {
			IO.outputStringAnswer("Please input right number");
		}
	}
}