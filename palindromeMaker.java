import java.util.Scanner;
public class palindromeMaker{


static boolean checker(String toCheck){

  int len = toCheck.length() - 1;
  char lastChar = toCheck.charAt(len);
  
  return ((('!'|'.'|'?') & lastChar) == lastChar && toCheck == toCheck.toUpperCase() && toCheck.trim() == toCheck);
}

static String palindromeConverter (String toConvert) {
  
  char punctuation;
  String[] words;
  String strRtrn="";
  int len;
  
  len = toConvert.length()-1;
  punctuation = toConvert.charAt(len);
  toConvert = toConvert.substring(0,len);
  words = toConvert.split(" ");
  
  for (String word: words){
    if (word == reverse(word) || word.length() == 1 ){
    strRtrn+=word +" ";
    System.out.println();
    }
    else
    strRtrn += convert(word) +" ";
    }
    strRtrn = strRtrn.trim() + punctuation;
  return strRtrn;
}

static String convert(String cnvrtWord){
  int len = cnvrtWord.length()-1, sameLastChar=0, i;
  String toRvrse;
  
  for (i=len; i>0; i--){
    if (cnvrtWord.charAt(i) == cnvrtWord.charAt(i-1))
    sameLastChar++;
    else 
    break;
  }
  toRvrse = cnvrtWord.substring(0, len - sameLastChar);
  return cnvrtWord + reverse(toRvrse);
  
  
}

static String reverse(String word){
  
  int charNo;
  String revrseWord ="" ;
  
  for (charNo= (word.length()-1);charNo>-1; charNo--)
  revrseWord += word.charAt(charNo);
  
 return revrseWord;
 } 


public static void main (String[] args){
  
  Scanner in = new Scanner(System.in);
  String inp;
  
  
  System.out.println("Enter a word");
  inp = in.nextLine();
  
  
  if (checker(inp)){
    System.out.println(palindromeConverter(inp));
  }
  else 
    System.out.println("INVALID INPUT");
    
  in.close();
  
}

}

