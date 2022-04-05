package lambda;

import java.util.*;

public class Arr {

    public static void main(String[] args) {
        String[] arr = {"B", "D", "V", "G", "A"};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Arrays.asList(arr);

        // List<String> li = new ArrayList<>();

        // Collections.sort(li, (a,b) -> a.compareTo(b));

        String[] arr2 = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));

        int[] intArr = {1, 2, 3, 4, 6, 6, 3};
        int[] revIntArr = new int[intArr.length];

        Set<Integer> set = new HashSet<>();


        for (int i = 0; i < intArr.length; i++) {
            set.add(intArr[i]);
        }

        System.out.println(set);

        int[] inputArray = {2, 7, 4, -5, 11, 5, 20};
        int inputNumber = 15;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == inputNumber) {
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " =  " + inputNumber);
                }
            }

        }


        int arrc[] = {10, 9, 14, 23, 15, 0, 9};
        int size = arrc.length;
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arrc[i] <= arrc[j])
                    break;
            }
            if (j == size)
                System.out.print(arrc[i] + " ");
        }
    }
    }

