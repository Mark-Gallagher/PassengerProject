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
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setTitle(String title) {
        if (title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")) {
            this.title = title;
        } else {
            String message = "Invalid title Entered!";
            throw new IllegalArgumentException(message);
        }
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            String message = "Invalid name Entered!";
            throw new IllegalArgumentException(message);
        }
    }

    public void setId(String id) {
        if (id.length() >= 10) {
            this.id = id;
        } else {
            String message = "Invalid id number Entered!";
            throw new IllegalArgumentException(message);
        }
    }

    private void setPhone(String phone) {
        if (phone.length() >= 7) {
            this.phone = phone;
        } else {
            String message = "Invalid phone number Entered!";
            throw new IllegalArgumentException(message);
        }
    }

    private void setAge(int age) {
        if (age >= 16) {
            this.age = age;
        } else {
            String message = "Invalid age Entered!";
            throw new IllegalArgumentException(message);
        }
    }
}

