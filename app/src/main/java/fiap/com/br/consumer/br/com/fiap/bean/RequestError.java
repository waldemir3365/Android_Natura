package fiap.com.br.consumer.br.com.fiap.bean;

import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Created by logonrm on 12/08/2017.
 */

public class RequestError implements Response.ErrorListener {
    @Override
    public void onErrorResponse(VolleyError error) {
        Log.e("Natura", "Erro: " + error.getMessage());
    }
}
