// Parent Class
public abstract class Animal {
    public String gender = "male";

    public void getGender(){
        System.out.println(gender);
    }

    public abstract void getName();

    public abstract void color();
}
