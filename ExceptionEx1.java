
class ExceptionEx1{


public  static void main(String args[]){


ExceptionEx1 demo=new ExceptionEx1();
User user=null;
demo.displayUser(user);
System.out.println("bye");
 

}


 void displayUser(User user){
 try{
  System.out.println("inside displayUser(*)");
 System.out.println("user-"+user.id+","+user.name);
 
 System.out.println("user displayed");
 }
 catch(NullPonterException e){
 System.out.println("input is null");
 
 }
 
 }
 


}


class User{

int id;

String name;

User(int id, String name){
this.id=id;
this.name=name;
}


}
