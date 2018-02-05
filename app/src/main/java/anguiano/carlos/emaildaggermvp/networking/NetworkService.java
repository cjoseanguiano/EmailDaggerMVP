package anguiano.carlos.emaildaggermvp.networking;

import anguiano.carlos.emaildaggermvp.model.Response;
import retrofit2.http.GET;

/**
 * Created by Carlos Anguiano on 04/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

public interface NetworkService {
    @GET("posts/1/comments")
    rx.Observable<Response> getListModel();
}
