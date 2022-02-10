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
       setId(id);
       setPhone(phone);
   }




    public String getTitle() {
        return title;
    }

    public String getName() {return name; }

    public String getId(){
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void setTitle(String title) {
        if (title == "Mr" || title == "Mrs" || title == "Ms") {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid title Entered!");
        }

    }

    public void setName(String name) {
        if(name.length() >= 3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid name Entered!");
        }

    }

    public void setId(String id) {
        if(id.length() >= 10){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("Invalid Id number Entered!");
        }

    }
    private void setPhone(String phone) {
        if(phone.length() >= 7){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("Invalid Phone number Entered!");
        }



    }

}

