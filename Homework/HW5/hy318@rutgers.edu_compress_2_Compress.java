


public class Compress {
	/*int stringnum;
	String s=" ";
	public int lengthnum(int stringsnum) {
		String strings = " ";
		int stringnum=(int)strings.length();
		return stringnum;
	}
	public String strings(String s) {
		return s;
	}*/
	public static String Lengthnum(String strings) {
	    String Stringtext = "";

	    for (int i = 0, count = 1; i < strings.length(); i++) {
	    		String number = Stringtext.concat(Integer.toString(count));
	    		//int number = Stringtext.length();
	    		String text=(Character.toString(strings.charAt(i)));	
	        if (i + 1 < strings.length() && strings.charAt(i) == strings.charAt(i + 1)) {
	            count++;
	        }
	        else {
	                if (number.equals('1')){
	                		Stringtext=(Character.toString(strings.charAt(i)));
	
	            		 	//count = 1;
	            		}
	                else {
	                		Stringtext=number+text;
	                		count = 1;
	            }
	        }
	    }
		return Stringtext;
	}
		public static void main(String[] args) {
		String sentence=IO.readString();
		System.out.println(Lengthnum(sentence));
	}
}
