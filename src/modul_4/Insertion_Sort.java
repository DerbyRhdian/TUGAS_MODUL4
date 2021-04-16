/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_4;

/**
 *
 * @author derby rahadian
 */
public class Insertion_Sort {
    public static void main(String[] args) {
        int[] data = {25,7,9,13,3};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        for (int i=1; i<data.length; i++){
            int key = data[i];
            int j = i-1;
            while((j>=0)&&(data[j]>key)){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
        System.out.println("\nsorted by DERBY:");
        System.out.println("=== Insertion Sort ===");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
}
