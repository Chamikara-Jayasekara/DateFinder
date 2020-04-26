package Sttatements4.dateFinder;
//fully coded by my self 1st one ever

import java.util.Scanner;

public class DateFinder {
    public static void  main(String[] args) {
      setYears setyears = new setYears();
      setyears.SetLastYear();


    }


   public static class setYears{
        public void SetLastYear()
        {

            Scanner scanner = new Scanner(System.in);


            //calculate century
            System.out.println("Enter Current year you going to calculate");
            String  curYear = scanner.nextLine();
            String cen = curYear.substring(0,2);
            int century = Integer.parseInt(cen.trim());

            String current = curYear.substring(2);
            int currentYear =  Integer.parseInt(current.trim());
            //set previous year

            //first convert to previous year
            int preYear = Integer.parseInt(curYear.trim());;
            Integer prevYearConvert = preYear -1;


            //previous year convert to string
            String yearTostring = prevYearConvert.toString();
            String preTrim =  yearTostring.substring(2);
            //after trim again convert to integer
            int previuosYear=Integer.parseInt(preTrim.trim()) ;

            //add month to the system
            System.out.print("Enter month's number: ");

            int monthNumber;
            monthNumber = scanner.nextInt();

            switch (monthNumber) {

                case 1:

                    monthNumber= 11;

                    break;

                case 2:

                   monthNumber = 12;

                    break;

                case 3:

                   monthNumber = 1;

                    break;

                case 4:

                   monthNumber=2;

                    break;

                case 5:

                   monthNumber = 3;

                    break;

                case 6:

                    monthNumber = 4;

                    break;

                case 7:

                   monthNumber = 5;

                    break;

                case 8:

                    monthNumber = 6;

                    break;

                case 9:

                    monthNumber=7;

                    break;

                case 10:

                   monthNumber=8;

                    break;

                case 11:

                  monthNumber=9;

                    break;

                case 12:

                    monthNumber=10;

                    break;

                default:

                    System.out.println("Invalid month.");

                    break;

            }

            //get date
            System.out.println("Enter the date");
            int date = scanner.nextInt();


            System.out.println("-----------------your results day is-----------------------");

        if (monthNumber == 11){
            int g = date + ((13 *monthNumber - 1)/5) + previuosYear + (previuosYear/4) + (century/4) - (2*century);
            if (g%7 == 0){
                System.out.println("Sunday");
            }
            else if (g%7 == 1){
                System.out.println("Monday");
            }
            else if (g%7 == 2){
                System.out.println("Tuesday");
            }
            else if(g%7 == 3){
                System.out.println("Wednesday");
            }
            else if(g%7 == 4){
                System.out.println("Thursday");
            }
            else if (g%7 == 5){
                System.out.println("Friday");
            }
            else if(g%7 == 6){
                System.out.println("Saturday");
            }
        }
           else if (monthNumber == 12){
                int g = date + ((13 *monthNumber - 1)/5) + previuosYear + (previuosYear/4) + (century/4) - (2*century);
                if (g%7 == 0){
                    System.out.println("Sunday");
                }
                else if (g%7 == 1){
                    System.out.println("Monday");
                }
                else if (g%7 == 2){
                    System.out.println("Tuesday");
                }
                else if(g%7 == 3){
                    System.out.println("Wednesday");
                }
                else if(g%7 == 4){
                    System.out.println("Thursday");
                }
                else if (g%7 == 5){
                    System.out.println("Friday");
                }
                else if(g%7 == 6){
                    System.out.println("Saturday");
                }
            }
        else {
            int g = date + ((13 *monthNumber - 1)/5) + currentYear + (currentYear/4) + (century/4) - (2*century);
            if (g%7 == 0){
                System.out.println("Sunday");
            }
            else if (g%7 == 1){
                System.out.println("Monday");
            }
            else if (g%7 == 2){
                System.out.println("Tuesday");
            }
            else if(g%7 == 3){
                System.out.println("Wednesday");
            }
            else if(g%7 == 4){
                System.out.println("Thursday");
            }
            else if (g%7 == 5){
                System.out.println("Friday");
            }
            else if(g%7 == 6){
                System.out.println("Saturday");
            }
        }
        }
    }

}

