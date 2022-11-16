package Test;

import com.company.Hardware;
import com.company.Software;
import com.company.Order;
import com.company.OrderManager;

public class My_Class {
    public static void main(String[] args) {
        Hardware modul = new Hardware();
        modul.f13("RAM 32GB");

        System.out.println("Цена переоборудования: " + modul.f7(999,50) + " BYN");

        Software windowsOS = new Software();
        windowsOS.f12("установлено");

        Order wash = new Order();
        wash.f4("fgng54vfb58evgyeognoc");

        OrderManager powder = new OrderManager();
        System.out.println("Система выполнила:"+ powder.f3(" передачу управления другому классу"));
    }


}
