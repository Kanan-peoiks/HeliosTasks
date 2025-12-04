package lesson21.homeTaskMain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

        Order order = new Order("Active", 10.2);
        Order order1 = new Order("Cancalled", 123.0);
        Order order2 = new Order("Active", 0);

        orderList.add(order);
        orderList.add(order1);
        orderList.add(order2);

        double total = orderList.stream()
                .filter(odr -> odr.getStatus().equals("Active"))
                .mapToDouble(odr -> odr.getAmount() * 1.05)
                .sum();
        System.out.println(total);








    }
}
