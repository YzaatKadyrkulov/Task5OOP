import java.util.Scanner;

public class Seasons {
    String Spring;
    String Summertime;
    String Autumn;
    String Winter;

    public static void Seasons1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the numbers:");
        int resultSeasons = scanner.nextInt();
        if(resultSeasons>=3 && resultSeasons<=5){
            System.out.println("Spring");
        }else if(resultSeasons>=6 && resultSeasons<=8){
            System.out.println("Summertime");
        }else if(resultSeasons>=9 && resultSeasons<=11){
            System.out.println("Autumn");
        }else if(resultSeasons>=1 && resultSeasons<=2 || resultSeasons==12){
            System.out.println("Winter");
        }else{
            System.out.println("This number is not serial number ");
        }
    }

}
