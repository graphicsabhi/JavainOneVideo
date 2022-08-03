package com.company;

public class JV_Arrays_foreachloop {
    public static void main(String[] args) {
        int [] marks ={23,56,76,88,45};
//        System.out.println(marks[2]);
//        System.out.println(marks.length);
//
//        float [] Marks ={23.4f,45.4f,66.3f,66.3f,76.3f};
//        System.out.println(marks[3]);
//        System.out.println(marks.length);
//
//        String [] Students={"Satyam","Sobhraj","Kaushik","POOja","sdsd"};
//        System.out.println(Students[2]);
//        System.out.println(Students.length);

//        int[] marks = new int[4];
//        marks[0]=23;
//        marks[1]=34;
//        marks[2]=33;
//        System.out.println(marks[0]);

        //Displaying the array Naive way
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Displaying the Array in for loop
        System.out.println("Printing using for loops");
        for (int i=0;i<=marks.length;i++){
            System.out.println(i);
        }

        //Quick Quiz: Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length - 1;i>=0;i--){
            System.out.println(marks[i]);
        }

        // Quick Quiz: Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }





    }
}
