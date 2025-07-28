class Animal {
 void makeSound() {
     System.out.println("Some generic animal sound");
 }
}
class Dog extends Animal {
 void makeSound() {
     System.out.println("Woof!");
 }
}
class Cat extends Animal {
 void makeSound() {
     System.out.println("Meow!");
 }
}
public class single_inheritance {
 public static void main(String[] args) {
     Dog dog = new Dog();
     Cat cat = new Cat();
     dog.makeSound(); 
     cat.makeSound(); 
 }
}
