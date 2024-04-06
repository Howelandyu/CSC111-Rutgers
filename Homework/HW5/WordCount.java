public class WordCount {
	public static class ZiFuChuanChangDuTest {
	public int f1(String a){
		    int sum=0;
		    sum=a.length();
		    if(sum>=4) {
		    	sum=0;
		    }
		    return sum;
		}
	}
	public static void main(String args[]){
		   ZiFuChuanChangDuTest n=null;
		    n=new ZiFuChuanChangDuTest();
		    String sc=IO.readString();
		    IO.outputStringAnswer(sc);
		    int i=sc.length();
		    if(i>4) {
		    	
		    }
		     IO.outputIntAnswer(i);
		  }
}
