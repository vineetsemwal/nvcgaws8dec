import java.util.*;


class StringUtil{


/**
string representing numbers till the input value provided in argument
**/
   String numbersString(int val){
   
   StringBuffer result=new StringBuffer();
   
   for(int i=0;i<val;i++){
   
   result.append(i);
   
   }
   
   String resultString= result.toString();
   return resultString;
   
   
   }
   
  
   
   
/**
Find all the vowels in string and convert into ‘b’ in all the vowels and should return a StringBuilder.

  hello
  01234

**/
  StringBuilder convertTo(String input){
  StringBuilder builder=new StringBuilder();
  for(int index=0; index<input.length();index++){
      char ch=input.charAt(index);
      char converted= convertChar(ch);
      builder.append(converted); 
  
  }
  return builder;
  
  }

   char convertChar(char input){   
    char small =Character.toLowerCase(input);
   if(small=='a' || small=='e' || small=='i' || small=='o' || small=='u'){
       return 'b';      
      }
      return input;       
       
   }


//Check if the string is an panagram ie. Contains all 26 alphabets 

boolean  isPanagram(String input)
{

   String letters="";
   for(int i=0;i<input.length();i++){
   char ch=input.charAt(i);
   boolean isLetter=isLetter(ch);
   if(!letters.contains(ch)){
   letters.add(ch);     
   }
   
   }
   boolean result=letters.length()==26;
   return result;
   
 }

   boolean isLetter(char ch){
    char small =Character.toLowerCase(ch);
    boolean result=(small>='a' && small<='z');
    return result;
   }

}



}






