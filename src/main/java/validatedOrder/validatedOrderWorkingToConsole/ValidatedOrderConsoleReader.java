package validatedOrder.validatedOrderWorkingToConsole;

import order.Order;
import order.OrderService;
import util.ServiceInstances;
import validatedOrder.ValidatedOrder;

import java.util.Scanner;

public class ValidatedOrderConsoleReader {

    OrderService orderService = ServiceInstances.getInstance().getOrderService();
//    ValidatedOrderService validatedOrderService = ServiceInstances.getInstance().getValidatedOrderService();

    public ValidatedOrder readValidatedOrderData() {

        ValidatedOrder validatedOrder = new ValidatedOrder();

        editValidatedOrderData( validatedOrder );

        return validatedOrder;
    }

    public ValidatedOrder editValidatedOrderData(ValidatedOrder validatedOrder) {

        System.out.println( "choose order by ID: \n" );
        for (Order order : orderService.getAllOrder()) {
            System.out.println( order.toString() );
        }

        Scanner scanner1 = new Scanner( System.in );
        Order order = null;
        while (order == null) {
            int option1 = scanner1.nextInt();
            order = orderService.getOrderById( option1 );
            validatedOrder.setOrder( order );
            if (order == null) {
                System.out.println( "The order you choose doesn't exist. Please insert different ID. \n" );
            }
        }

        System.out.println( "choose initial value: \n" );
        Scanner scanner2 = new Scanner( System.in );
        int initialValue = scanner2.nextInt();
        validatedOrder.setInitialValue( initialValue );


        return validatedOrder;
    }

}
