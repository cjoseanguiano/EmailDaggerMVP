package anguiano.carlos.emaildaggermvp;

import anguiano.carlos.emaildaggermvp.model.Response;

/**
 * Created by Carlos Anguiano on 04/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

public interface EmailView {
    void showWait();

    void removeWait();

    void getListSuccess(Response response);

    void onFailure(String appErrorMessage);
}
