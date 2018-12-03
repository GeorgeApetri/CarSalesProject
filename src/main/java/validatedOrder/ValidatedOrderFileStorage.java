package validatedOrder;

import util.GenericStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidatedOrderFileStorage extends GenericStore<ValidatedOrder> {

    private static final String filePath = "D:\\JavaTest\\CarSalesManagement\\validatedOrder.json";

    private List<ValidatedOrder> validatedOrderList = new ArrayList<>(  );


    @Override
    public ValidatedOrder add(ValidatedOrder value) {
        value.setIdValidateOrder( generateId() );
        validatedOrderList.add( value );
        writeJson();
        return null;
    }

    private int generateId() {
        int max = 0;
        for (ValidatedOrder validatedOrder: validatedOrderList) {
            if (max < validatedOrder.getIdValidateOrder()) {
                max = validatedOrder.getIdValidateOrder();
            }
        }
        return max + 1;
    }

    @Override
    public void delete(ValidatedOrder value) {
        validatedOrderList.remove( value );

    }

    @Override
    public void update(ValidatedOrder value) {
        ValidatedOrder oldValidatedOrder = getById( value.getIdValidateOrder() );
        validatedOrderList.remove( oldValidatedOrder );
        validatedOrderList.add( value );
        writeJson();

    }

    @Override
    public List<ValidatedOrder> getAll() {
        Collections.sort( validatedOrderList );
        return validatedOrderList;
    }

    @Override
    public ValidatedOrder getById(int id) {
        for (ValidatedOrder validatedOrder : validatedOrderList) {
            if (validatedOrder.getIdValidateOrder() == id) {
                return validatedOrder;
            }
        }
        return null;
    }

    @Override
    public String getFilePath() {
        return filePath;
    }

}
