package Homework2.a2;

public class Librarian extends User {
    String department = "Reference";

    @Override
    public String getRole() {
        return this.name + "Librarian";
    }

    public void work(){
        //do some work
    }
}
