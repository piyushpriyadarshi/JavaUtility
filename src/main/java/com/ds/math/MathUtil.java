package com.ds.math;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * class for Maths utility class
 * @author piyush
 * @since 0.1
 */
public class MathUtil {
    /**
     * <p>This is a method implenenting the no of digit of a number
     * <a href="http://www.supermanisthegreatest.com">Superman!</a>
     * </p>
     * @param n
     * @return int
     * @see <a href="http://www.link_to_jira/HERO-402">HERO-402</a>
     * @since 1.0
     */
    public int noOfDigits(int n){
        /*
        implementation for iterative approach
         */
//        int count=0;
//        while(n!=0){
//            n=n/10;
//            count++;
//        }
//        return count;
        /*
        recursive implementation
         */
//        if(n==0){
//            return 0;
//        }
//        else{
//            return 1+noOfDigits(n/10);
//        }
        //best implenentation O(1)
        return (int)Math.floor(Math.log10(n)+1);
    }

    public static void main(String[] args) {
        MathUtil mathUtil=new MathUtil();

//        List<Integer> arrayList=mathUtil.seiveOfEratosthenes(50);
//        for (int a:arrayList) {
//            System.out.println(a);
//        }
//        System.out.println(mathUtil.exactly3Divisors(999999));
        int n = 10;

        System.out.println(exactlyThreeDivisors(999999));
    }
    /**
     * <p>This is a method return s the list of prime Number upto a number
     * <a href="http://www.supermanisthegreatest.com">Superman!</a>
     * </p>
     * @param num
     * @return int
     * @see <a href="http://www.link_to_jira/HERO-402">HERO-402</a>
     * @since 1.0
     */
    public List<Integer> primeNumberUptoN(int num){
        int[] arr=new int[num+1];
        for (int i=0;i<num+1;i++){
           arr[i]=1;
        }
        for(int i=2;i*i<arr.length;i++){
            for (int j=i;j*i<arr.length;j++){

               arr[i*j]=0;
            }
        }
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for (int i = 2; i <arr.length ; i++) {
            if(arr[i]==1){
                arrayList.add(i);
            }
        }
        return arrayList;
    }
    /**
     * <p>This is a method return s the list of prime Number upto a number
     * <a href="http://www.supermanisthegreatest.com">Superman!</a>
     * </p>
     * @param num
     * @return int
     * @see <a href="http://www.link_to_jira/HERO-402">HERO-402</a>
     * @since 1.0
     */
    public List<Integer> seiveOfEratosthenes(int num){
        ArrayList<Integer> primeNumbers=new ArrayList<Integer>();
        //declare the size of arr as num+1
        int[] arr=new int[num+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=1;
        }
        for(int i=2;i<Math.sqrt(num);i++){
           for(int j=2;i*j<=num;j++){
               arr[i*j]=0;
           }
        }
        for(int i=2;i<arr.length;i++){
           if(arr[i]==1){
               primeNumbers.add(i);
           }
        }
        return primeNumbers;

    }
    public int exactly3Divisors(int N)
    {
        List<Integer> primeNumbers=seiveOfEratosthenes(N);
        System.out.println(primeNumbers.size());
//        for(int a:primeNumbers){
//            System.out.println(a);
//        }
        int count=0;
        for(int a:primeNumbers){
            if((a*a)<=N){
                count++;
            }
        }
        return count;
    }
    private static int exactlyThreeDivisors(int num) {

        boolean[] primeSieve = generatePrimeUptoN(num);

        int j = 2;

        int count = 0;

        while ((j * j) <= num) {

            if (primeSieve[j] == true) {

                count++;

            }

            j++;

        }

        return count;

    }

    private static boolean[] generatePrimeUptoN(int num) {

        boolean[] primeSieve = new boolean[num + 1];

        Arrays.fill(primeSieve, true);

        primeSieve[0] = false;

        primeSieve[1] = false;

        int range = (int) Math.floor(Math.sqrt(num));

        for (int i = 2; i < range; i++) {

            for (int j = (i * i); j <= num; j = j + i) {

                if (!primeSieve[j]) {

                    primeSieve[j] = false;

                }

            }

        }

        return primeSieve;

    }






}
