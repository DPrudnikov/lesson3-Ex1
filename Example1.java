package Task1;

import java.util.Scanner;

/*
 Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
         Вывести дату следующего дня в формате "День.Месяц.Год".
         Учесть переход на следующий месяц, а также следующий год.
         Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
*/

public class Example1 {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Введите дату ДД.ММ.ГГГГ: ");

     String data = scanner.nextLine();

     int point1 = data.indexOf('.'); //first point
     int point2 = data.lastIndexOf('.'); //last point

     int day = Integer.parseInt(data.substring(0, point1));
     int month = Integer.parseInt(data.substring(point1 + 1, point2));
     int year = Integer.parseInt(data.substring(point2 + 1));

     if (day>31 && month>12){
         System.out.println("Ошибка!");}
     else{

     String newData = dataReturn(day, month, year);
     System.out.println(newData);}
 }

     public static String dataReturn(int day, int month, int year) {

         int dayNew = day + 1;
         int monthNew = month + 1;
         int yearNew = year + 1;



         if (day == 31 && month == 12) {
             return dayNew + "." + 1 + "." + yearNew;
         } else if ((day == 31 && month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
                 month == 10) ||
         (day == 30 && month == 4 || month == 6 || month == 9 || month == 11) ||
         (day == 29 && month == 2 && (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0)))) ||
         (day == 28 && month == 2)) {
             return 1 + "." + monthNew + "." + yearNew;
         } else {
             return dayNew + "." + month + "." + year;
         } }}