package com.firstspring;

public class Rec {
    public long fctrlrec(long l)
    {
        if(l == 0)
        {
            return  1;
        }
        System.out.println("функция вызвана");
        return l * fctrlrec(l - 1);
    }
    public long factcycle(long lc)
    {
        if (lc == 0) {
            return 1;
        }
        long res = 1;
        for (int i = 1; i <= lc; i++) {
            System.out.println(res);
            res = res * i;

        }
        return res;
     }

     public int fib(int f)
     {
         int a = 0;
         int b = 1;
         if(f == 0)
         {
             return a;
         }
         if(f == 1)
         {
             return b;
         }
         int c = b;
         for (int i = 0; i < f-2; i++)
         {
             c = a + b;
             a = b;
             b = c;
             System.out.println("i = " + i + " c = " + c);
         }
         return c;
     }

    public int fibRec(int f)
    {
        if(f == 0){
            return 0;
        } else if(f == 1) {
            return 1;
        } else {
            return fibRec(f - 1) + fibRec(f - 2);
        }
    }


    public static void main(String[] args) {
Rec rec = new Rec();
     long res = rec.fctrlrec(5);
        System.out.println("result recursion = " + res);

        long resCycle = rec.factcycle(4);

        System.out.println("fact cycle = " + resCycle);
//0, 1, 1, 2, 3, 5, 8
        int fibCycle = rec.fib(5);
        System.out.println("fibonachi from 5 = " + fibCycle);

        System.out.println("фибоначи 9й номер= " + rec.fibRec(9));
    }




}
