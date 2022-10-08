package javatutorial;
import java.util.Scanner;

public class DayOfBirth {
    
    
    public static void main(String[] args) {
        
        Scanner MyScanner = new Scanner(System.in);
        
           int monthCode [ ] =  { 1,4,4,0,2,5,0,3,6,1,4,6 };
           
           Print("Input Your Barth Date: ");
           int date = MyScanner.nextInt();
           Print("Input Your Birth Month: ");
           int month =MyScanner.nextInt();
           Print("Input Your Birth Year: ");
           int year = MyScanner.nextInt();
       
          
          if( ( ( (year-1999)%4) == 0 ) && (month == 1 || month == 2)  ) {
              month = month - 1 ;
               int sum = date + (monthCode[month-1]) + (year-1900) + ((year-1900)/4) ;
               dayNameFind(sum);
          }else{
              int sum = date + (monthCode[month-1]) + (year-1900) + ((year-1900)/4) ;
               dayNameFind(sum);
          }
    }
    
    public static void dayNameFind(int sum){
         int week = sum%7;
           
           Print(sum+","+week);
           
           switch(week){
               case 0:
                   Print("Sat");
                   break;
               case 1:
                   Print("Sun");
                   break;
                   case 2:
                       Print("Mon");
                       break;
                       case 3:
                           Print("Tues");
                           break;
                           case 4:
                               Print("Wed");
                               break;
                           case 5:
                               Print("Thurs");
                               break;
                           default:
                               Print("Fri");
           }
    }
    
    
    public static void Print(String mass){
        System.out.println(mass);
    }
    
}


