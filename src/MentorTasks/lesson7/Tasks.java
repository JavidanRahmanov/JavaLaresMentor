package MentorTasks.lesson7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        Tasks.Task1();
//        Tasks.Task2();
//        Tasks.Task3();
//        Tasks.Task4();
    }

        public static void Task1() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Zehmet olmasa arrayin olcusunu daxil edin: ");
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n; i++){
                System.out.println("Zehmet olmasa arrayin " + i + "ci elementini daxil edin:");
                array[i] = sc.nextInt();
            }
            int max = array[0];
            int min = array[0];
            for(int i = 0; i < n; i++){
                if(array[i] > max){
                    max = array[i];
                }
                if(array[i] < min){
                    min = array[i];
                }
            }
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
            sc.close();
        }
    public static void Task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa arrayin olcusunu daxil edin: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Zehmet olmasa arrayin " + i + "ci elementini daxil edin:");
            array[i] = sc.nextInt();
        }
        int cem = 0;
        for(Integer e : array){
            cem+=e;
        }
        System.out.println("The sum is " + cem);
        sc.close();
    }
    public static void Task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa arrayin olcusunu daxil edin: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Zehmet olmasa arrayin " + i + "ci elementini daxil edin:");
            array[i] = sc.nextInt();
        }
        int cem = 0;
        for(int e : array){
            cem+=e;
        }
        double edediOrta = (double) cem/n;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Avarage value of the array elements is : " + df.format(edediOrta));
    }
    public static void Task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa arrayin olcusunu daxil edin: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Zehmet olmasa arrayin " + i + "ci elementini daxil edin:");
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(array[i] == target){
                System.out.println("Target value found at index: " + i);
            }
        }
        sc.close();
    }
    }

