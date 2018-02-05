package anguiano.carlos.emaildaggermvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import anguiano.carlos.emaildaggermvp.di.Depss;
import anguiano.carlos.emaildaggermvp.networking.NetworkModule;

/**
 * Created by Carlos Anguiano on 04/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

class BaseApp extends AppCompatActivity {
    Depss deps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        deps = DaggerDepss.builder().networkModule(new NetworkModule());
    }

    public Depss getDeps() {
        return deps;
    }
}
