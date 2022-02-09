package ie.gmit;

public class Passenger {

    private String title;
    private String name;
    private int id;
    private int phone;
    private int age;

    public Passenger(String title, String name, String id, long phone, int age) {
       setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == "Mr" || title == "Mrs" || title == "Ms"){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Invalid title Entered!");
        }

    }


}

