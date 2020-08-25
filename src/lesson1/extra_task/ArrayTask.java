package lesson1.extra_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTask {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(2);
//        list.add(17);
//        list.add(13);
//        list.add(6);
//        list.add(22);
//        list.add(31);
//        list.add(45);
//        list.add(66);
//        list.add(100);
//        list.add(-18);
        //1. while cycle
//        int i = 0;
//        while (i < list.size()) {
//            System.out.println(list.get(i));
//            i++;
//        }
        //1.1 reverse
//        int i = list.size()-1; //10
//        while (i >= 0) {
//            System.out.println(list.get(i));
//            i--;
//        }
//
//        //2. for cycle
//        for (int iter = 0; iter < list.size(); iter++) {
//            System.out.println(list.get(iter));
//        }
        //2.1
//        for (int iter = list.size()-1; iter >= 0  ; iter--) {
//            System.out.println(list.get(iter));
//        }

        //3. while with pair nums
//        int n = 0;
//        while (n < list.size()) {
//            if (n%2 == 0) {
//                System.out.println(list.get(n));
//            }
//            n++;
//        }
        //3.1 while with pair nums REVERSED
//        int n = list.size()-1;
//        while (n >= 0) {
//            if (n%2 == 0) {
//                System.out.println(list.get(n));
//            }
//            n--;
//        }

        //4. while with unpair nums
//        int num = 0;
//        while (num < list.size()) {
//            if (num%2 != 0) {
//                System.out.println(list.get(num));
//            }
//            num++;
//        }
        //4.1while with unpair nums REVERSED
//        int num = list.size()-1;
//        while (num >= 0) {
//            if (num%2 != 0) {
//                System.out.println(list.get(num));
//            }
//            num--;
//        }

        //5. for with pair nums
//        for (int iterator = 0; iterator < list.size(); iterator++) {
//            if (iterator % 2 == 0) {
//                System.out.println(list.get(iterator));
//            }
//        }
        //5.1 for with pair nums REVERSED
//        for (int iterator = list.size()-1; iterator >= 0 ; iterator--) {
//            if (iterator % 2 == 0) {
//                System.out.println(list.get(iterator));
//            }
//        }
//
//        //6. for with unpair nums
//        for (int iterat = 0; iterat < list.size(); iterat++) {
//            if (iterat % 2 != 0) {
//                System.out.println(list.get(iterat));
//            }
//        }
        //6.1 for with unpair nums
//        for (int iterat = list.size()-1; iterat >= 0; iterat--) {
//            if (iterat % 2 != 0) {
//                System.out.println(list.get(iterat));
//            }
//        }
//        //7. reverse
//        Collections.reverse(list);
//        System.out.println(list);

        //================
//        List newList = new ArrayList();
        //1
//        for (int iter = 2; iter <= 100; iter += 2) {
//            newList.add(iter);
//        }
//        System.out.println(newList);

        //2
//        for (int iter = 1; iter <= 100; iter += 2) {
//            newList.add(iter);
//        }
//        System.out.println(newList);

//        List listWithRandomNums = new ArrayList();
//        for(int i = 0; i<=50; i++){
//            listWithRandomNums.add(-9+(int)(Math.random()*50));
//        }
//        System.out.println(listWithRandomNums);

        //each 3-rd item
//        for(int i = 2; i<listWithRandomNums.size(); i+=3){
//            System.out.println(listWithRandomNums.get(i));
//        }

//        //each 3-rd item pair
//        for(int i = 2; i<listWithRandomNums.size(); i+=3){
//            if((int)listWithRandomNums.get(i) %2 == 0){
//            System.out.println(listWithRandomNums.get(i));
//            }
//        }

        //each 3-rd item pair add to another list
//        List anotherList = new ArrayList();
//        for(int i = 2; i<listWithRandomNums.size(); i+=3){
//            if((int)listWithRandomNums.get(i) %2 == 0){
//                anotherList.add(listWithRandomNums.get(i));
//
//            }
//        }
//        System.out.println(anotherList);
        System.out.println("==============");

    }
}
