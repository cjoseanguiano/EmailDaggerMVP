package anguiano.carlos.emaildaggermvp.di;

import javax.inject.Singleton;

import anguiano.carlos.emaildaggermvp.EmailActivity;
import anguiano.carlos.emaildaggermvp.networking.NetworkModule;
import dagger.Component;

/**
 * Created by Carlos Anguiano on 04/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

@Singleton
@Component(modules = NetworkModule.class)
public interface Deps {
    void inject(EmailActivity emailActivity);
}
