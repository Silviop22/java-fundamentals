package al.sda.operators;

public class Person {
    String identificationNumber;
    String firstName;
    String lastName;
    int age;
    
    public boolean equals(Person p) {
        if (p == this) {
            return true;
        }
        return this.identificationNumber.equals(p.identificationNumber);
    }
}