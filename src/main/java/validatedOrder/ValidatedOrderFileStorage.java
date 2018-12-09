package validatedOrder;

import com.google.gson.Gson;
import util.GenericStore;
import util.Paths;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidatedOrderFileStorage extends GenericStore<ValidatedOrder> {

    public ValidatedOrderFileStorage() {
        this.validatedOrderList = readJson();
    }

    private List<ValidatedOrder> validatedOrderList;

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
        return Paths.VALIDATED_ORDER_FILE_PATH;
    }

    @Override
    protected List<ValidatedOrder> getListFromJson(Gson gson, Reader reader) {
        return new ArrayList<>( Arrays.asList(gson.fromJson(reader, ValidatedOrder[].class)));
    }

}
