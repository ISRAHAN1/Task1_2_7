package Glava_2.Task_2_1_6;
public class CatDog {
    public static void main(String[]args){
        Cat cat=new Cat();
        Dog dog=new Dog();
        cat.sayHello();
        dog.sayHello();
        dog.catchCat();
    }
    public static class Cat{
        public void sayHello(){
            System.out.println("Мяу");
        }
    }
    public static class Dog{
        public void sayHello(){
            System.out.println("Гав");
        }
        public void catchCat(){
            System.out.println("Кошка поймана");
        }
    }
}