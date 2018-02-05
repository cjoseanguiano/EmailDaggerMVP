package anguiano.carlos.emaildaggermvp.networking;

import anguiano.carlos.emaildaggermvp.model.Response;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Carlos Anguiano on 04/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

public class ServiceNetwork {
    private NetworkService networkService;

    public ServiceNetwork(NetworkService networkService) {
        this.networkService = networkService;
    }

    public Subscription getListModel(final GetListCallBack getListCallBack) {
        return networkService.getListModel()
                .subscribeOn(Schedulers.io())
                .onErrorResumeNext(new Func1<Throwable, Observable<? extends Response>>() {
                    @Override
                    public Observable<? extends Response> call(Throwable throwable) {
                        return Observable.error(throwable);
                    }
                })
                .subscribe(new Subscriber<Response>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        getListCallBack.onError(new NetworkError(e));
                    }

                    @Override
                    public void onNext(Response response) {
                        getListCallBack.onSuccess(response);
                    }
                });
    }

    public interface GetListCallBack {
        void onSuccess(Response response);

        void onError(NetworkError networkError);
    }
}
