/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class
class Contact {
    /**
    * name takes name.
    */
    private String name;
    /**
     *email takes email.
     */
    private String email;
    /**
     *phoneNumber takes number of contact.
     */
    private String phoneNumber;
    /**
     * Takes name,email and phonenumber.
     * @param n , name of contact.
     * @param e , email of contact.
     * @param p , number of contact.
     */
    Contact(final String n, final String e, final String p) {
        this.name = n;
        this.email = e;
        this.phoneNumber = p;
    }
    // "{ Name = akhil, Email = .com, Phone Number = 9999912345 }"

    public String toString() {
        return "{ Name = " + this.name + ", Email = " + this.email
    +  ", Phone Number = " + this.phoneNumber + " }";
    }
    /*
    * getters
    */
    public String getName() {
        return this.name; //obj.getName();
    }
    public String getEmail() {
        return this.email; //obj.getEmail();
    }
    public String getPhoneNumber() {
        return this.phoneNumber; //obj.getPhoneNumber();
    }
    /*
    * setters
    */
    public void setName(final String toSet) {
        this.name = toSet;
    }
    public void setEmail(final String toSet) {
        this.email = toSet;
    }
    public void setPhoneNumber(final String toSet) {
        this.phoneNumber = toSet;
    }
}


