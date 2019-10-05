import java.util.*;
class Userb {
    String name;
    String connection_of_user;
    int number_of_connections;
 
public Userb(){

}
public void setname(String name){
    this.name=name;
}
public void setconnection_of_user(String connection_of_user){
    this.connection_of_user=connection_of_user;

}
public void setnumber_of_connections(int number_of_connections){
    this.number_of_connections=number_of_connections;
}
public String getname(){
    return this.name;

}
public String getconnection_of_user(){
    return this.connection_of_user;
     
}
public int getnumber_of_connections(){
    return this.number_of_connections;
}
public String toString(){
    return(this.name+"is connected to"+this.connection_of_user+""+this.number_of_connections);
}
}

public class User {
public static void main(String[]args){
    Userb a= new Userb();
    a.setname("ramu");
    System.out.println(a.name);
}

}