package im.tobe.learnjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MyClass {
    public static void main(String[] args) {

        // dataTypeBasics();
//         objectInheritance();
        arrayDemo();
//        arrayListDemo();
//        hashMapDemo();
    }

    public static void hashMapDemo() {
        HashMap<String, Integer> gameStats = new HashMap<>();
        gameStats.put("Osaka", 34);
        gameStats.put("Milan", 44);
        gameStats.put("ManUtd", 3);

        System.out.println(gameStats.get("Osaka"));

        for (String key: gameStats.keySet()) {
            System.out.println(key);
        }

        for (int value: gameStats.values()) {
            System.out.println(value);
        }
    }

    public static void arrayListDemo() {
        // ArrayList<String> name = new ArrayList<>(); // formal syntax
        ArrayList<String> names = new ArrayList();
        names.add("Fiona");
        names.add("Ruby");
        names.add("Melody");
        // names.add(1); // can run if no <String>

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (String name : names) {
            System.out.println(name);
        }

        ArrayList attrs = new ArrayList();
        attrs.add(1);
        attrs.add("Text");
        attrs.add("hello");

        // use Object if no Data Type is defined.
        for (Object attr : attrs) {
            System.out.println(attr);
        }
    }

    public static void arrayDemo() {
        int[] myArray = { 1, 4, 76, 85};
        System.out.println(myArray[3]);

        String[] names = { "Hins", "Gem", "April"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("names: "+names[i]);
        }

        int[] newArray = new int[4]; // predefine the length of array
        newArray[0] = 12;
        newArray[1] = 14;
        newArray[2] = 33;
        newArray[3] = 392;
        // newArray[4] = 44; cannot exceed the length of array

        int[] numbers = { 1, 44, 343, 66, 34,22,34, 482 };

        Arrays.sort(numbers);

        findMultiThree(numbers);
    }

    public static void findMultiThree(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
                System.out.println("It is the multiple of 3 "+nums[i]);
            }
        }
    }

    public static void objectInheritance() {
        Rectangle rect1 = new Rectangle(133, 40);
        rect1.setWidth(10000);
        int rect1Area = rect1.getArea();
        System.out.println(rect1); // print the memory address
        System.out.println(rect1Area);

        Rectangle rect2 = new Rectangle();
        rect2.setWidth(10);
        rect2.setHeight(20);
        int rect2Area = rect2.getArea();
        System.out.println(rect2Area);

        Rectangle rect3 = new Rectangle(40);
        int rect3Area = rect3.getArea();
        System.out.println(rect3Area);

        Square square = new Square(30);
        int squareArea = square.getArea();
        int squarePerimeter = square.getPerimeter();
        System.out.println("Area of square, "+squareArea);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This is line 1");
        stringBuilder.append("This is line 2");
        System.out.println("stringBuildier: "+stringBuilder);

        String name = "Apple";
        boolean isContains = name.contains("A"); // strint is an object, can call its method

        if (isContains) {
            System.out.println("isContains true");
        } else {
            System.out.println("isContains false");
        }

        printArea(square);
    }

    public static void printArea(Square square) {
        System.out.println("area is "+square.getArea());
    }

    public static void dataTypeBasics() {
        System.out.println("Hello World!");

        String name = "Peter";
        int age = 30;

        long bigNumber = 99999999999999L; // need to add L tp specify it is long number
        float celsius = 45.9f;
        double height = 45.9;
        byte myByte = 127; // byte only 8 bits
        short myShort = 289; // short only 16 bits
        char letter = 'C'; // char must by single quote
        boolean isTall;
        isTall = false;

        System.out.println("Hello my name is "+name);
        System.out.println("Age is "+age);
        System.out.println(isTall);

        double a = 50;
        double b = 7;
        int x1 = (int) (a + b); // cast to int
        double x2 = a + b;
        double x3 = a/b;
        int x4 = (int) (a%b);

        System.out.println("a + b = "+ x1);
        System.out.println("a + b = "+ x2);
        System.out.println("a/b = "+ x3);
        System.out.println("a%b = "+ x4);

        for (int i = 0; i < 100; i += 11) {
            System.out.println("i = "+i);
        }

        String userName = "Peter";
        int retNum = showName(userName, 10);
        System.out.println("retNum is "+retNum);
    }

    public static int showName(String name, int age) {
        System.out.println("The name is "+name);

        return age + 56;
    }
}