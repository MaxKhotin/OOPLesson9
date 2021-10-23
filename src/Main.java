import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
//    Создать массив объектов.
//
//    Приложение при старте, выводит в консоли текстовое меню для выполнения
//    пользователем нижеперечисленных операций.
//            Вывести:
//    a) список марок автомобилей из созданного массива объектов;
//    b) список автомобилей, которые эксплуатируются больше n лет;
//    c) список автомобилей заданного года выпуска, цена которых больше указанной.
//    d) количество одинаковых автомобилей сравнивая с первым автомобилем (который помещен в массив) и саму характеристику автомобиля (используя toString())
//
//    Постройте структуру меню приложения таким образом, чтобы пользователь
//    мог последовательно вводить параметры поиска и получать результат. После
//    выполнения выбранной операции, на экран должен выводиться результат и
//    снова пользователю предлагается выполнить одну из операций до тех пор,
//    пока пользователь выполнить выход из приложения.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car(1, "Audi", "A8", 2021, "Black", 140000, "KA7777II");
        Car car2 = new Car(2, "Mercedes", "E500", 2016, "Blue", 70000, "AI2345BB");
        Car car3 = new Car(1, "Audi", "A8", 2021, "Black", 140000, "KA7777II");
        Car car4 = new Car(3, "Volkswagen", "Golf", 2010, "Grey", 10000, "AI2785TY");
        Car car5 = new Car(4, "Volvo", "XC90", 2008, "Red", 30000, "AB4589TU");
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        ListIterator listIterator = cars.listIterator();
        do {
            System.out.println("Выберите действие: ");
            System.out.println("1) список марок автомобилей из созданного массива объектов;\n" +
                    "2) список автомобилей, которые эксплуатируются больше n лет;\n" +
                    "3) список автомобилей заданного года выпуска, цена которых больше указанной.\n" +
                    "4) количество одинаковых автомобилей сравнивая с первым автомобилем и саму характеристику автомобиля");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println(car1.getBrand() + "\n" + car2.getBrand() + "\n" + car3.getBrand() + "\n" + car4.getBrand() + "\n" + car5.getBrand());
                    break;
                }
                case 2: {
                    System.out.println("Введите срок эксплуатации: ");
                    int years = sc.nextInt();
                    while (listIterator.hasNext()) {                     // Не доделал
                    }
                    break;
                }
                case 4: {
                    int counter = 0;
                    while (listIterator.hasNext()) {
                        Car testerCar = (Car)listIterator.next();
                    if (testerCar.equals(car1)){
                        counter++;
                        System.out.println(testerCar.toString());
                    }
                    }
                    System.out.println("Кол-во одинаковых автомобилей: " + counter);
                }
            }
        } while (true);
    }
}