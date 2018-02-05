package anguiano.carlos.emaildaggermvp;

import anguiano.carlos.emaildaggermvp.model.Response;
import anguiano.carlos.emaildaggermvp.networking.NetworkError;
import anguiano.carlos.emaildaggermvp.networking.ServiceNetwork;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Carlos Anguiano on 04/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

public class EmailPresenter {
    private EmailView emailView;
    private ServiceNetwork serviceNetwork;
    private CompositeSubscription subscriptions;

    EmailPresenter(EmailView emailView, ServiceNetwork serviceNetwork) {
        this.emailView = emailView;
        this.serviceNetwork = serviceNetwork;
    }

    void getListModel() {
        emailView.showWait();

        Subscription subscription = serviceNetwork.getListModel(new ServiceNetwork.GetListCallBack() {
            @Override
            public void onSuccess(Response response) {
                emailView.removeWait();
                emailView.getListSuccess(response);
            }

            @Override
            public void onError(NetworkError networkError) {
                emailView.removeWait();
                emailView.onFailure(networkError.getAppErrorMessage());
            }
        });
        subscriptions.add(subscription);
    }

    public void onStop() {
        subscriptions.unsubscribe();
    }
}
