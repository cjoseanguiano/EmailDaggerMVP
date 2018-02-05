package anguiano.carlos.emaildaggermvp.networking;

import anguiano.carlos.emaildaggermvp.model.CityListResponse;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Carlos Anguiano on 04/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

public interface NetworkService {
    @GET("posts/1/comments")
    Observable<CityListResponse> getListModel();
}
