public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        String name = firstName + " " + lastName;
        return name;
    }

    @Override
    public boolean equals(Object other) {
        Name obj = (Name) other;
        return this.firstName.equals(obj.firstName) && this.lastName.equals(obj.lastName);
    }

    @Override
    public int hashCode() {
        int firstNameHashCode = this.firstName.hashCode();
        int lastNameHashCode = this.lastName.hashCode();
        return firstNameHashCode + lastNameHashCode;
    }
}
