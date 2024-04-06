import java.util.StringTokenizer;  
public class PigLatin {
	private static String Design ="`~!@#$%^&*()<>?:[]{}_-+=?.,';";
	public static String translatelet(String line) {  
        String result=" ";  
        StringTokenizer letter=new StringTokenizer(line,Design,true);
        while(letter.hasMoreTokens())  
        {  
            String let=letter.nextToken();
            if(isWord(let))  
            {  
                let=translateWord(let);  
            }  
            result+=let;
        }
        return result;
        }  
       public static String translateWord(String word) {  
            
            int site=fitet(word);  
            if(site==-1)  
                return word;  
            else if(site==0)  
                return word+"vai";  
            else   
            {  
                String head=word.substring(0,site);  
                String mid=word.substring(site);  
                return mid+head+"ai";  
            }  
                  
        }  
       public static int fitet(String tok) {  
           for(int i=0;i<tok.length();i++)  
               if(isVowel(tok.charAt(i)))
                   return i;  
           return -1;  
       }  
       public static boolean isVowel(char cons) {  
           switch(Character.toLowerCase(cons)){  
           case 'a':  
           case 'e':  
           case 'i':  
           case 'u':  
           case 'o':  
               return true;  
               default: return false;  
           }  
       }  
       public static boolean isWord(String word) {  
           for(int i=0;i<word.length();i++)  
               if(!Character.isLetter(word.charAt(i)))  
                   return false;  
           return true;  
       }  
     
     
	   public static void main (String[] args){
		   String text =IO.readString();  
	       //String line=text.nextline();  
	       System.out.println(translatelet(text));  
	    
	   }

	}


