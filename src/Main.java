import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    //    static Scanner input = new Scanner(System.in);
//
//    public static int num1 = input.nextInt();
//
//    public static int num2 = input.nextInt();
//    public static int result = 0;
//
//    public static boolean Addition(){
//        result = num1 + num2;
//        System.out.println(result);
//        return true;
//    }
//
//    public static boolean Subtraction(){
//        result = num1 - num2;
//        System.out.println(result);
//        return true;
//    }
    public static void main(String[] args) {

////        System.out.printf("Hello and welcome!");
////        System.out.println("hi there ");

//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Type a color");
//        String WhatColor = input.next();
//        Color constant = Color.CONSTANT1;
//        String value = constant.getDescription();
//        if (Objects.equals(WhatColor, value)){
//            System.out.println("Correct");
//        }
////        if (WhatColor == value){
////            System.out.println("Correct");
////        }
//            else {
//            System.out.println("GAME OVER");
//        }



//
//        System.out.println("Enter a lucky color");
//        Scanner input = new Scanner(System.in);
//        String[] list = {};
//        String color = input.next();
//        String constant = "Red";
//        int vlen = color.length();
//        int vlconst = constant.length();
//
//        if(color==constant){
//            Arrays.stream(list).map(_ ->color);
//            System.out.println(list);
//        } else if (vlen <= vlconst || vlen == vlconst) {
//            Arrays.stream(list).map( _ ->color);
//        }else{
//            System.out.println("Game over");
//        }


//        CORRECT CODE


//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a lucky color: ");
//        String color = input.next();
//        String constant = "Red";
//
//        List<String> list = new ArrayList<>();
//        int vlen = color.length();
//        int vlconst = constant.length();
//
//        if (!Objects.equals(color, constant)) {
//            // Add the color to the list
//            list.add(color);
//
//            // Check if color contains 'R'
//            boolean bool = color.contains("R");
//
//            if (!bool) {
//                System.out.println("Cloned List: " + new ArrayList<>(list));
//            }
//
//            System.out.println("List: " + list);
//
//        } else if (vlen <= vlconst) {
//            list.add(color);
//            System.out.println("Equal/Shorter: " + new ArrayList<>(list));
//        } else {
//            System.out.println("Game over");
//        }
//
//        input.close();

//           Object new_Object = new Object();
//           String result = new_Object.getShoe();
//           System.out.println(result);
//
//           new_Object.setShoe("Nike");
//           String x = new_Object.getShoe();
//           System.out.println(x);
//
//        Aptech new_object_1 = new Aptech();
//        String p = new_object_1.getRotimi();
//        System.out.println(p);

//        CALCULATOR
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the first number");
//        int num1 = input.nextInt();
//        System.out.println("Please enter the second number");
//        int num2 = input.nextInt();
//        System.out.println("Please enter an operator /,+,-,*");
//        char operator = input.next().charAt(0);
//
//        int result = 0;
//
//        switch(operator){
//            case '+':
//               result = num1 + num2;
//                break;
//
//            case '-':
//                result = num1 - num2;
//                break;
//
//            case '*':
//                result = num1 * num2;
//                break;
//
//            case '/':
//                result = num1 / num2;
//                break;
//
//            default:
//                System.out.println("Invalid operator");
//
//        }
//
//        System.out.println(result);

//
//        System.out.println(Addition());
//        System.out.println(Subtraction());
//

//    Vehicle sample = new Vehicle();
//
//    Greeting  instance_body = new Greeting(){
//
//         @Override
//         public String sayHello() {
//              return  "hello string";
//         }
//
//     };
//
//    System.out.println(instance_body.sayHello());
//
//
//
//
//
//    }


//    Profile nested_object = new Profile();
//    Profile.PersonalAxademicInfo innerClass = Profile.personalAxademicInfo;
//    String L = innerClass.getSchoolLocation();

        File myObj = new File("Ebube.txt");
        try {
//
            //
//            if (myObj.createNewFile()) {
//                System.out.println("File created.");
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }



            FileOutputStream output = new FileOutputStream("Ebube.txt");
            output.write("Nothing concern me".getBytes());
            FileDescriptor container = output.getFD();
            System.out.println(container);
            output.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException exception) {
            System.out.println("Error writing file.");
//


          boolean a = myObj.canRead();
          System.out.println(a);
          boolean b = myObj.canWrite();
        System.out.println(b);
        String c = myObj.getName();
        System.out.println(c);


            // try-with-resources: FileInputStream will be closed automatically
            try (FileInputStream input = new FileInputStream("Ebube.txt")) {

                int i;  // variable to store each byte that is read

                // Read one byte at a time until end of file (-1 means "no more data")
                while ((i = input.read()) != -1) {
                    // Convert the byte to a character and print it to the console
                    System.out.print((char) i);
                }

            } catch (IOException e) {
                // If an error happens (e.g. file not found), print an error message
                System.out.println("Error reading file.");
            }


    }
}
}

