package bankingsystem;
public class Client {
    String name;
    String nationalID;
    String address;
    long phone;
    Account acc; 
    public Client()//default constructor 
    { }
    public Client(String name, String address, String nationalID, long phone, Account acc)// Perematarize constructor that giving value for attriubtes
    {   this.name=name;
        this.nationalID=nationalID;
        this.address=address;
        this.phone=phone;
        this.acc=acc;}
    public void setName(String name)//set the name for client
    {
        this.name=name; }
    public void setNationalID(String nationalID)//set the national id for client 
    {
        this.nationalID=nationalID;}
    public void setAddress(String address)//set the address for client
    {
        this.address=address;}
    public void setPhone(long phone)//set phone number for client
    {
        this.phone=phone;}
    public void setAccount(Account acc){
        this.acc=acc;
    }
    public String getName()//return the name of client when it needed
    {
        return name; }
    public String getNationalID()//return the national id of client when it needed
    {
        return nationalID; }
    public String getAddress()//return the address of client when it needed
    {
        return address;}
    public long getPhone()//return the phone of client when it needed
    {
        return phone; }
    public Account getAccount() //return the account of client 
    {
        return acc;
    }
    
    @Override
    public String toString() {
        return "Client{" + "Name: " + name + ", National-ID= " + nationalID + ", Address: " + address + ", Phone: " + phone + ", Account: " + acc + '}';
    }
    
    
}
