public class Unicorn extends Animal{
    public String favoriteFood;

    public Unicorn(String name){
        super(name, "marshmallows");
    }

    public void sleep(String name){
        System.out.println(this.name + " sleeps in a cloud");
    }
}
