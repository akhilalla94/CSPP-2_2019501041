class bankaccount{
    String accno;
    double balance;
    bankaccount(String accno,double balance){
        this.accno=accno;
        this.balance=balance;
    }
    bankaccount(){

    }
public String getaccno(){
    return accno;
    
}
public double getbalance(){
    return balance;
}
}
class checkingaccount extends bankaccount{
    double limit;
}
class savingaccount extends bankaccount{

}
class certificateofdeposit extends bankaccount{

}
class bank{
    public static void main (String[]args){
        bankaccount a=new bankaccount("1234567890",12345678);
        System.out.println(a.getaccno());
        System.out.println(a.getbalance());
        
    }


}