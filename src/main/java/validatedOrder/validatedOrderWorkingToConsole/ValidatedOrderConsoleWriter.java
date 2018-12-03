package validatedOrder.validatedOrderWorkingToConsole;

import util.ServiceInstances;
import validatedOrder.ValidatedOrder;
import validatedOrder.ValidatedOrderService;

public class ValidatedOrderConsoleWriter {

    private ValidatedOrderService validatedOrderService = ServiceInstances.getInstance().getValidatedOrderService();

    public void displayValidatedOrderData (ValidatedOrder validatedOrder) {

        validatedOrderService.getAllValidatedOrder();
        System.out.println(validatedOrderService.getAllValidatedOrder().toString());

    }
}
