import Sorting.BubbleSort;
import Stream.StreamDemo;
import collections.ComparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int x = 1;
//        int y = x;
//        float a = 2;
//        int[] array1 = new int[4];
//        array1[0] = 1;
//        System.out.println(Arrays.toString(array1));
//        String message = "A boy is good" + "!!";
//        System.out.println(message);
//
//
//        float z = x;
//        int b = (int)a;
//
//        x = 2;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(a);
//        System.out.println(b);
//
//        Point point = new Point(x=1, y=2);
//        Point point2 = point;
//        point.x = 3;
//
//        System.out.println(point.x + "," + point.y);
//        System.out.println(point2.x + "," + point2.y);

//        float b = 2.7F;
//        float c =  (float)Math.floor(b);
//        System.out.println(c);
//
//        double random = Math.random();
//        int result = (int)(random * 100);
//        System.out.println(result);
//
//
//        double min = Math.min(9.1, 8.4);
//        System.out.println(min);
//
//        int number = 123456;
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//
//        System.out.println(currency.format(number));
//
//        float percent = 0.1F;
//        String answer = NumberFormat.getPercentInstance().format(percent);
//        System.out.println(answer);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your firstname : ");
//        String firstname = scanner.next();
//        System.out.println("Enter your lastname : ");
//        String lastname = scanner.next();
//
//        System.out.println("Your name is " + firstname + " " + lastname);
//
//
//        String[] fruits = {"Cashew", "Banana", "Mangoes", " Pear"};
//
//        System.out.println(Arrays.toString(fruits));
//
//        for (int x = 1; x < 5; x++) {
//            System.out.println(x);
//        }
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//
//        int month = 13;
//        String monthName;
//
//        switch (month) {
//
//            case 1:
//                monthName = "January";
//                break;
//            case 2:
//                monthName = "February";
//                break;
//            case 3:
//                monthName = "March";
//                break;
//            case 4:
//                monthName = "April";
//                break;
//            case 5:
//                monthName = "May";
//                break;
//            case 6:
//                monthName = "June";
//                break;
//            default:
//                monthName = "invalid month name";
//
//
//        }
//        System.out.println(monthName);
//        int num = 100;
//        int count = 1;
//        while(num < 110) {
//            System.out.println(count + ": Hello world");
//            num++;
//            count++;
//        }
//
//       int[][][] matrix = {{{1,2,3},{2,3,4},{5,6,7}},{{11,12,13},{14,15,16},{17,18,19}}};
//        System.out.println(matrix[0][1][2]);

//        Scanner scanner = new Scanner(System.in);
//        String message = "real";
//        while(message.equals("quit")){
//            System.out.print("Enter the message : ");
//            message = scanner.nextLine().toLowerCase();
//
//        }

//        List<Integer>arrayList = new ArrayList<Integer>(5);
//        arrayList.add(5);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(1,2);
//        arrayList.add(1,10);
//
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("Olayinka");
//        linkedList.add("Hephzibah");
//        System.out.println(linkedList);
//
//        System.out.println(arrayList);


//        Static_class sta = new Static_class("Seyi", 20);
//        System.out.println(Static_class.changeMessages("You are welcome"));
//        System.out.println(sta.calculator(10,19));
//
//
//
//
//        Abstract_Implementation imp = new Abstract_Implementation();
//        System.out.println(imp.gearrider(10, 5));
//
//
 //     smallMountainBike smallMountainBike = new smallMountainBike(10,20,30,40);
//
//        System.out.println(smallMountainBike.getSpeed());
//        System.out.println(smallMountainBike.pressAccelerator(36));


  //      Bicycle bicycles = new mountainBike(10,20,40, 4);
  //     mountainBike mountainBike = new mountainBike(10,20,30,50);
    //    Bicycle b = new Bicycle(10,20,20);
      //  System.out.println(show(b));
//        var test = new com.olayinka.generic.GenericList<Integer>();
//        test.add(7);
//        System.out.println(test.getItem(0));
//        test.add(20);
//        System.out.println(test.getItem(1));
//        System.out.println((test));
//
//        User firstUser = new User(1, "Yetunde", "Bamidele" );
//        User secondUser = new User(2,"Seun","Oloyeme");
//        var users = new GenericList2<User>();
//        users.addUser(firstUser);
//        users.addUser(secondUser);
//       //System.out.println(users.getUser(0));
//       // System.out.println(users.getUser(1));
//        users.addUser(new com.olayinka.generic.User(3, "Sola", "Dele" ));
//        //System.out.println(users.getUser(2));
//        var iterable = users.iterator();
//
//        for(var item : users ){
//            System.out.println(item);
//        }
//
//        while(iterable.hasNext()){
//            var current = iterable.next();
//            System.out.println(current);
//        }
//        var generics = new GenericList<Integer>();
//        generics.add(34);
//        System.out.println(generics.getItem(0));
//
//        for(var gen : generics){
//            System.out.println(gen);
//        }
// CollectionDemo.show();
//       ListDemo.show()
//       ComparableDemo.show();
       // Sorting.show();
       // fortest.fortest();
        // BubbleSort.show();
//        bicycles.run();
//        mountainBike.run();
//        b.run();
//
 //       System.out.println(LinearSearch.show());
  //      System.out.println(BinarySearch.show());
  //      BinarySearch2 ob = new BinarySearch2();


//        int arr[] = { 1,2, 3, 4,5,6,7,8,9,10};
//        int n = arr.length;
//        int x = 77;
//        int result = ob.binarySearch(arr, 0, n - 1, x);
//        System.out.println(result);
//
//
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at index "
//                    + result);



// Demo for Stream

        StreamDemo.show();
    }

    public static int show(Bicycle bicycle){
        int speed = 0;
        if(bicycle instanceof mountainBike) {
            mountainBike s = (mountainBike) bicycle;
            s.getBrake();
           speed = s.getAccelerate();
        }
        System.out.println("Hello world");
        return speed;

    }


}