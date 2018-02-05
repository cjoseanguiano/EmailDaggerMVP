package anguiano.carlos.emaildaggermvp.networking;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Carlos Anguiano on 04/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

class ResponseStatus {
    @SerializedName("status")
    public String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @SuppressWarnings({"unused", "used by Retrofit"})
    public ResponseStatus() {
    }

    public ResponseStatus(String status) {
        this.status = status;
    }
}
