package Test;

import com.company.DecorativeLipstick;
import com.company.HygienicLipstick;
import com.company.WashingPowder;
import com.company.Ariel;

public class My_Class {
    public static void main(String[] args) {
        DecorativeLipstick lip = new DecorativeLipstick();
        lip.f13("красная");

        System.out.println("Цена вашей помады: "+lip.f7(10,5)+ "рублей");

        HygienicLipstick hlip = new HygienicLipstick();
        hlip.f12("питает");

        WashingPowder wash = new WashingPowder();
        wash.f4("'Мара'");

        Ariel powder = new Ariel();
        System.out.println("Запах стирального порошка:"+ powder.f3(" лаванда "));
    }


}
