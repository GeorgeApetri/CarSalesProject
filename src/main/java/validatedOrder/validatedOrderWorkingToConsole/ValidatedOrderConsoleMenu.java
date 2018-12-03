package validatedOrder.validatedOrderWorkingToConsole;

import util.ServiceInstances;
import validatedOrder.ValidatedOrder;
import validatedOrder.ValidatedOrderService;

import java.util.List;
import java.util.Scanner;

public class ValidatedOrderConsoleMenu {

    ValidatedOrderService validatedOrderService = ServiceInstances.getInstance().getValidatedOrderService();
    ValidatedOrderConsoleWriter validatedOrderConsoleWriter = new ValidatedOrderConsoleWriter();
    ValidatedOrderConsoleReader validatedOrderConsoleReader = new ValidatedOrderConsoleReader();

    public void displayMenuValidatedOrders() {

        Scanner scanner = new Scanner( System.in );

        int option;

        do {
            displayValidatedOrderOption();
            System.out.println("select validated order option: \n");
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println( "Program menu: \n" );
                    System.out.println( "0  Exit" );
                    System.out.println( "1  Cars" );
                    System.out.println( "2  Clients" );
                    System.out.println( "3  Orders" );
                    System.out.println( "4  Validated Orders \n" );
                    break;
                case 1:
                    displayValidatedOrder();
                    break;
                case 2:
                    addValidatedOrder();
                    break;
                case 3:
                    editValidatedOrder();
                    break;
            }

        } while (option != 0);

    }


    private void displayValidatedOrderOption() {

        System.out.println( "validated order menu: \n" );
        System.out.println( "0   exit" );
        System.out.println( "1   display all validated order" );
        System.out.println( "2   add validated order" );
        System.out.println( "3   edit initial value for validated order" );
        System.out.println( "4   validated order ready for production \n" );


    }

    private void displayValidatedOrder() {
        List<ValidatedOrder> allValidatedOrder = validatedOrderService.getAllValidatedOrder();
        for (ValidatedOrder validatedOrder : allValidatedOrder) {
            validatedOrderConsoleWriter.displayValidatedOrderData(validatedOrder);
        }
        System.out.println();
    }

    private void addValidatedOrder () {

        ValidatedOrderConsoleReader validatedOrderConsoleReader = new ValidatedOrderConsoleReader();
        ValidatedOrder validatedOrder = validatedOrderConsoleReader.readValidatedOrderData();
        validatedOrderService.addValidatedOrder( validatedOrder );
        System.out.println("validated order successfully added. \n");

    }

    private void editValidatedOrder () {

        System.out.println("which validated order do you want to edit? enter ID: \n");
        displayValidatedOrder();
        Scanner scanner = new Scanner( System.in );
        int id = scanner.nextInt();
        ValidatedOrder validatedOrder = validatedOrderService.getValidatedOrderById( id );
        validatedOrder = validatedOrderConsoleReader.editValidatedOrderData(validatedOrder);
        validatedOrderService.updatedValidatedOrder( validatedOrder );
        System.out.println("validated order successfully edited. \n");

    }









}
