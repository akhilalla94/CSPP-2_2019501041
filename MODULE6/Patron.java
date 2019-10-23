class Patron{
    String name;
    String mobilenumber;
    String ticket;
    Patron(String name,String number){
        this.name=name;
        this.mobilenumber=number;
    }
    public void setTicket(String t){
        this.ticket=t;
    }
    public String toString(){
        return this.ticket;
    }
}
