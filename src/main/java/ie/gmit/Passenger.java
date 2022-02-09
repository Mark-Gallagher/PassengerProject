package ie.gmit;

public class Passenger {

    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    public Passenger(String title, String name, String id, String phone, int age) {
       setTitle(title);
       setName(name);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == "Mr" || title == "Mrs" || title == "Ms") {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid title Entered!");
        }

    }

    public String setName(String name) {
        if(name.length() <= 3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid title Entered!");
        }

        return this.name;
    }

}

