package com.company;

public class Main {

    public static void main(String[] args) {
	    fibo(11);
        System.out.println("---------------------");
        vampires();
    }

    /** N_23
     * returns the numbers of Fibo
     * @param n - the number of numbers
     */
    public static void fibo(int n){
        int a = 0, b = 1;
        for(int i = 0; i < n; i++){
            int sum = a + b;
            System.out.println(b);
            a = b;
            b = sum;
        }
    }

    /** N_24
     * finds number-vampires
     */
    public static void vampires(){
        int iterationCount = 0;
        int vampireNumbersCount = 0;

        outLoop: for (int i = 11; i <= 99; i++){
            for (int j = 99; j >= i; j--){
                int result = i * j;
                if (result < 1001){
                    continue outLoop;
                } else if (result % 10 == 0){
                    continue;
                } else {
                    int count = 0;
                    int newResDigit = result;
                    int curIterDigit1 = i % 10;
                    int curJiterDigit1 = j % 10;
                    int curIterDigit2 = i / 10;
                    int curJiterDigit2 = j / 10;
                    for (int k = 0; k < 4; k++){
                        iterationCount++;
                        int curResDigit = newResDigit % 10;
                        newResDigit /= 10;
                        if(curIterDigit1 == curResDigit || curJiterDigit1 == curResDigit || curIterDigit2 == curResDigit || curJiterDigit2 == curResDigit){
                            count++;
                        } else {
                            break;
                        }
                    }
                    if (count == 4){
                        vampireNumbersCount++;
                        System.out.println(result);
                    }
                }
            }
        }

        System.out.println("iterations: " + iterationCount);
        System.out.println("vampire-numbers: " + vampireNumbersCount);
    }
}
