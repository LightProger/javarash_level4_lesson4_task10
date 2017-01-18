package Alexandr_Nikitchenko;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Чтение с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        int a = Integer.parseInt(d);
        String e = reader.readLine();
        int b = Integer.parseInt(e);
        String f = reader.readLine();
        int c = Integer.parseInt(f);

        // Сравнивание введеных значений и вывод результата
        if(a == b && b == c)
        {
            System.out.println(a + " " + b + " " + c);
        }else if( a == b){
            System.out.println(a + " " + b);
        }else if( a == c){
            System.out.println(a + " " + c);
        }else if(b == c){
            System.out.println(b + " " + c);
        }
    }
}
