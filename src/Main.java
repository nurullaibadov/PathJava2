import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.print("Enter your choice to here 1 or 2: ");
        int choice = scanner.nextInt() ;


        if(choice == 1){
            animal = new Dog();
            animal.Speak();
        }else if(choice == 2){
            animal = new Cat();
            animal.Speak();
        }else {
            System.out.println("Your choice is wrong");
        }












//        Scanner scanner = new Scanner(System.in);
//
//        Animal animal;
//
//        System.out.print("Choice 1 or 2: ");
//
//        int choice = scanner.nextInt();
//        if(choice == 1){
//            animal = new Dog();
//            animal.speak();
//        }else if(choice == 2){
//            animal = new Cat();
//            animal.speak();
//        }else{
//            System.out.println("Wrong choice");
//        }
//
//scanner.close();
//
//        Car car = new Car();
//        Bike bike = new Bike();
//        Boat boat = new Boat();
//
//        Vehicle[] vehicles = {car,bike,boat};
//
//        for(Vehicle v: vehicles){
//            v.go();
//        }
//


//        Circle circle = new Circle(5);
//        Rectangle rectangle = new Rectangle(3,5);
//        Triangle triangle = new Triangle(4,8);
//
//        Shape[] shapes = {circle,rectangle,triangle};
//
//        for(Shape s : shapes){
//            System.out.println(s.area());
//            s.display();;
//        }









//        Cat cat = new Cat();
//        Dog dog= new Dog();
//
//        Animal[] animals = {cat,dog};
//
//        for(Animal a : animals){
//            System.out.println(a.eat());
//        }







//        Student student1 = new Student("Spongebob",23,98.232,true);
//        Student student2 = new Student("Ciko",21,97.343,true);
//        Student student3 = new Student("faso",24,97.343,false);
//
//        Student[] students = {student1,student2,student3};
//
//        for(Student s: students){
//             System.out.println(s.S)
//        }




//
//        Car car1 = new Car("Mustang","Ford",2026,23232,true);
//        Car car2 = new Car("Hyundai","Accent",2012,12999.99,false);
//
//        Car[] cars = {car1,car2};

//        for(Car masin : cars){
//            masin.stop();
//            masin.start();
//            masin.brake();
//            masin.drive();
//        }

    }

}







//        Scanner scanner = new Scanner(System.in);
//        String[] foods = new String[3];
//
//
//        for(int i = 0;i < foods.length;i++){
//            System.out.print("Enter a food: ");
//            foods[i] = scanner.nextLine();
//        }
//
//
//        for(String food : foods){
//            System.out.println(food);
//        }
//
//        scanner.close();

//        String[] foods = new String[3];
//
//        foods[0] = "pizza";
//        foods[1] = "niko";
//        foods[2] = "cucuki";
//
//        for (String food : foods){
//            System.out.println("Food: " + food);
//        }




//        String[] fruits = {"NIKO","sdfsd","sdfdsf"};
//        fruits[0] = "Pineapple";

//        for(String fruit : fruits){
//            System.out.println("FRUIT " + fruit);
//        }
//    }
//}
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter name to here: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter age to here: ");
//        int age = scanner.nextInt();
//        happyBirthday(name,age);
//    }
//
//    static void happyBirthday(String name, int age) {
//        System.out.println("Happy Birthday to u " + name);
//        System.out.println("Youre years old " + age);
//    }
//}




//        int number;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your number to here: ");
//        number = scanner.nextInt();
//
//
//
//
//        for(int i = 0;i< number;i++){
//            if(i == 5){
//                break;
//            }
//            System.out.println("I: " + i);
//        }









//        boolean isActive = false;
//        Scanner scanner = new Scanner(System.in);
//
//        while(!isActive){
//            System.out.print("Enter number to here: ");
//            int number = scanner.nextInt();
//            if(number == 5){
//                isActive = false;
//                break;
//            }
//            System.out.println("Ur number is "+ number);
//        }
//
//
//
//        System.out.println("Finished");
//        scanner.close();
//    }
//
//}
