package _13_search_algorithms.exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxAscendingArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character character : max) {
            System.out.print(character);
        }
    }
    //*********************************************************
    //* Analyze the time complexity of your program:
    // 1 outer loop =n;
    // 1 inner loop= n-1;
    // 1 simple statement = 1;
    // 1 single loop * 1 simple statement=1;
    // T(n)= n*(n-1)+1+1;
    //T(n)=O(n^2)+O(n)
    //T(n)=O(n^2)
    //**********************************************************
}
