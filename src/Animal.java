class Animal {
    public String name;
    public String favoriteFood;
    static int population;


    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    public void sleep(String name) {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if(food.equals(this.favoriteFood)){
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        }else{
            sleep(this.name);
        }
    }
}
