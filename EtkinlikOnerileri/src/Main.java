import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int havaSicakligi;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen etkinlik düzenleyeceğiniz günki hava sıcaklığını giriniz:");
        havaSicakligi = input.nextInt();

        if (havaSicakligi<5){
            System.out.println("Bu hava sıcaklığında en uygun etkinlik kayaktır.");
        } else if(havaSicakligi>=5 && havaSicakligi<15){
            System.out.println("Bu hava sıcaklığında en uygun etkinlik sinemadır.");
        } else if (havaSicakligi>15 && havaSicakligi<=25){
            System.out.println("Bu hava sıcaklığında en uygun etkinlik pikniktir.");
        } else{
            System.out.println("Bu hava sıcaklığında en uygun etkinlik yüzmedir.");
        }
    }
}