package edu.xula.lgaseller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("\nHello, Xula parking Lot App!\n");

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();
        fillArray(numbers, 10);
        System.out.println("numbers: " + numbers);

        //come back to this
        int amount = howManyLessThan(numbers, 5);
        System.out.println("\nthere are " + amount + " element(s) less than 5\n");

        int notIn = notInRange(numbers);
        System.out.println("there are " + notIn + " numbers not in range");

        int even = isEven(numbers);
        System.out.println("there are " + even + " even numbers");

        int smallest = isSmallest(numbers);
        System.out.println("the smallest number in the arrayList is " + smallest);

        int indLarge = indexOfLarge(numbers);
        System.out.println("the index of the largest number is " + indLarge);

        //comeback
        inList(numbers, 20);

        ArrayList<Integer> newList = removeFirstMiddleLast(numbers);
        System.out.println("removed firstMiddleLast " + newList);

        int large = largest(numbers);
        ArrayList<Integer> swapped = swapLargelast(numbers);

        ArrayList<Integer> ascending = makeAscend(numbers);
        System.out.println("ascending : " + ascending);

        ArrayList<Integer> copiedRange = new ArrayList<>();
        copyRange(numbers, copiedRange,  13, 19);
        System.out.println("copied list: " +copiedRange);

        ArrayList<Integer> reversed = new ArrayList<>();
        reverseEm(numbers, reversed);
        System.out.println("reversed numbers: " + reversed);


















    }

    private static void reverseEm(ArrayList<Integer> numbers, ArrayList<Integer> reversed) {
        for (int i = numbers.size(); i < 0 ; i--) {
            reversed.add(numbers.get(i));

        }
    }


    private static void copyRange(ArrayList<Integer> numbers, ArrayList<Integer> copiedRange, int min, int max) {
        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.get(i) >= 13 && numbers.get(i) <= 19)
            {
                copiedRange.add(numbers.get(i));
            }

        }
    }


    private static ArrayList<Integer> makeAscend(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size()-1 ; i++) {
            if(numbers.get(i) > numbers.get(i +1))
            {
                int temp = numbers.get(i);
                numbers.remove(i);
                numbers.add(i +1, temp);
            }

        }
        return numbers;
    }

    private static ArrayList<Integer> swapLargelast(ArrayList<Integer> numbers) {
        int temp = largest(numbers);
        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.get(i) == temp)
            {
                numbers.remove(i);
                numbers.add(i, numbers.get(numbers.size()-1));
            }

        }
        numbers.add(temp);

        return numbers;

    }

    private static int largest(ArrayList<Integer> numbers) {
        int largest = numbers.get(0);

        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i) > largest)
            {
                largest = numbers.get(i);
            }

        }
        return largest;
    }

    private static ArrayList<Integer> removeFirstMiddleLast(ArrayList<Integer> numbers) {
        int middle = numbers.size()/2;

        numbers.remove(0);
        numbers.remove(middle);
        numbers.remove(numbers.size()-1);

        return numbers;

    }

    private static void inList(ArrayList<Integer> numbers, int num) {
        int is = 0;
        int isNot = 1;
        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.size() == num)
            {
                is = 1;
            }
            else
            {
                isNot = 0;
            }

        }
        if (is == 1)
        {
            System.out.println(num + " is in the ArrayList");
        }
        else
        {
            System.out.println(num + " is not in the ArrayList");
        }

    }

    private static int indexOfLarge(ArrayList<Integer> numbers) {
        int largest = numbers.get(0);
        int index = 0;
        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.get(i) > largest)
            {
                largest = numbers.get(i);
                index = i;


            }


        }
        return index;
    }

    private static int isSmallest(ArrayList<Integer> numbers) {
        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.get(i) < smallest)
            {
                smallest = numbers.get(i);
            }

        }

        return smallest;
    }

    private static int isEven(ArrayList<Integer> numbers) {
        int count = 0;
        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i) %2 == 0)
            {
                count++;
            }

        }
        return count;
    }

    private static int notInRange(ArrayList<Integer> numbers) {
        int count = 0;
        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i) < 1 || numbers.get(i) >22)
            {
                count++;
            }

        }
        return count;
    }

    private static int howManyLessThan(ArrayList<Integer> numbers, int lessThan) {
        int counter = 0;
        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i) < lessThan)
            {
                counter++;
            }

        }
        return counter;


    }

    private static void fillArray(ArrayList<Integer> numbers, int size) {
        Random rand = new Random();
        for (int i = 0; i < size ; i++) {
            int num = rand.nextInt(22)+1;
            numbers.add(num);
        }
    }
}
