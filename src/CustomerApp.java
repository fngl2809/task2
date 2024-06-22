public class CustomerApp {
    public static void main(String[] args) throws Exception{

        Customer customer = new Customer ("fakhri", 2000, "fakhrizalahmad@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer customer2 = new Customer ("rini", "rinihidayati@gmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());

        System.out.println((customer2.creditLimit==100?"Correct Constructor default CreditLimit":"Wrong Constructor default CreditLimit"));

        Customer customer3 = new Customer();
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());

        System.out.println((customer3.getName()=="fiona_anggilia"?"Correct Constructor default Name":"Wrong Constructor default Name"));
        System.out.println((customer3.getEmail()=="anggiliafiona@gmal.com"?"Correct Constructor default Email":"Wrong Constructor default Email"));

    }
    
}
