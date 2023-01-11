package Animals;

public class Main {
    public static void main(String[] args) {
        Dog richard = new Dog (4,300);
        Dog zeus = new Dog (3,350);
        Dog leo = new Dog (9,200);
        Dog rocky = new Dog (2,400);
        Cat felix = new Cat(0,150);
        Cat serafima = new Cat(0,200);
        Cat max = new Cat (0,100);






        System.out.println(Animals.count);
        System.out.println(Cat.countCat);
        System.out.println(Dog.countDog);
        System.out.println(richard.getSwim());
        System.out.println(felix.getRun());



    }


}
