package validatedOrder;

import java.util.List;

public class ValidatedOrderService {

    ValidatedOrderFileStorage validatedOrderFileStorage = new ValidatedOrderFileStorage();

    public void addValidatedOrder (ValidatedOrder validatedOrder) {
        validatedOrderFileStorage.add(validatedOrder);
    }

    public void deleteValidatedOrder (ValidatedOrder validatedOrder) {
        validatedOrderFileStorage.delete( validatedOrder );
    }

    public ValidatedOrder getValidatedOrderById (int id) {
        return validatedOrderFileStorage.getById( id );
    }

    public void updatedValidatedOrder (ValidatedOrder validatedOrder) {
        validatedOrderFileStorage.update( validatedOrder );
    }

    public List<ValidatedOrder> getAllValidatedOrder() {
        return validatedOrderFileStorage.getAll();
    }
}
