package pro.sky.java.course1;

import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int []arr=generateRandomArray();
        System.out.println("Наш массив");
        System.out.println(Arrays.toString(arr));

        //Задание1
        float allSum=0;
        for (int i:arr){
            allSum+=i;
            System.out.println(allSum);
        }
        System.out.println("Сумма трат за месяц составила "+allSum + "рублей ");

        //Задание 2
        int minSum=arr[0];
        int maxSum=arr[0];
        for (int i:arr){
            if (i>maxSum){
                maxSum=i;
            }
            if (minSum>i){
                minSum=i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minSum +" рублей \n"+"Максимльня сумма трат за день составила " +maxSum +" рублей");

        //Задание3
        float averageSum=allSum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+ averageSum +" рублей");

        //Задание4

        char[] reverseFullName={ 'n','a','v','I',' ', 'v','o','n','a','v','I'};
        for (int i=reverseFullName.length-1;i>0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}
