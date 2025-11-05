package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio;

public class Person {
    private String firstName;
    private String lastName;
    private String username;
    private String emailAddress;

    private Person(String firstName, String lastName, String username, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String username;
        private String emailAddress;

        public PersonBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public PersonBuilder username(String username){
            this.username = username;
            return this;
        }
        public PersonBuilder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

        public Person build(){
            return new Person(firstName, lastName, username, emailAddress);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
