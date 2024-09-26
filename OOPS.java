public class OOPS{
public static void main(String args[]){
    Student p1 = new Student();
    
    p1.setname("Harsh");
    System.out.println(p1.getname());
    p1.setage(17);
    System.out.println(p1.getage());

}  
}
class Student {
     String name;
    int age;
     String city;
void setname( String name){
    this.name = name;
}
void setage(int age){
    if(age >=18){
    this.age = age;
    }else {
        System.out.println("Invalid");
    }
}
void setcity(String city){
    this.city = city;
} 
String getname(){
    return this.name;
}
int getage(){
    return this.age;
}
String getcity(){
    return this.city;
}
}
