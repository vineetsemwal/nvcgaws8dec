
class Student{


 static int count;
 
 Student(){
  count++;
 }
 
 
public static void main(String args[]){

Student st1=new Student();
Student st2=new Student();
Student st3=new Student();
System.out.println("count="+Student.count);


}

}






