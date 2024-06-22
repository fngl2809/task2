public class Customer {
    String name;
    double creditLimit;
    String email;

    Customer(){
    }
    Customer(String name, String email){
    }
    Customer(String name, double creditLimit, String email){
    }
    String getName(){
        return "fiona_anggilia";
    }
    String getEmail(){
        return "anggiliafiona@gmail.com";
    }
    Double getCreditLimit(){
        return 2000.0;
    }
}
