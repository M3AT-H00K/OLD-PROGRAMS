import java.util.*;
class vowel{
    public static void main(){
      Scanner ob=new Scanner(System.in);
      String s1=ob.nextLine().trim().toUpperCase();
      int length1=s1.length();
      
      char last=s1.charAt(length1-1);
      if(last != '.' || last != '?' || last != '!'){
          System.out.println("fuckoff");
          return;
      }
      String s2=s1.substring(0,length1-1);
      
      StringTokenizer stt = new StringTokenizer(s2);
      StringBuffer sbmain=new StringBuffer();
      StringBuffer sb= new StringBuffer();
      int c=0;
      
      while(stt.hasMoreTokens()){
          String s3= stt.nextToken();
          int length2= s3.length();
          if(isVowel(s3.charAt(0)) && isVowel(s3.charAt(length2-1))){
              c++;
              sbmain;
          }
      }
    }
}