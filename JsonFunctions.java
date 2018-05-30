package epson.com.br.rewards.androidapp.utils;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import epson.com.br.rewards.androidapp.model.UserMap;

public class JsonFunctions {

    Gson gson;
    Context context;

    public JsonFunctions(){
        gson = new Gson();
        context = InstrumentationRegistry.getTargetContext().getApplicationContext();
    }

    public List<UserMap> getJsonContents() {

        InputStream in = null;
        StringBuilder builder = null;

        try {
            in = context.getAssets().open("testData.json");
            int count;
            final byte[] bytes = new byte[2048];
            builder = new StringBuilder();

            while ( (count = in.read(bytes,0, bytes.length)) > 0) {
                builder.append(new String(bytes, 0, count));
            }

        } catch (IOException e) {
            Log.e("Catch: File reader error",e.toString());
        }
        finally{
            try {
                if (in != null){
                    in.close();
                }
            } catch (IOException e) {
                Log.e("Finally: File handler error",e.toString());
            }
        }

        List<UserMap> usersList = gson.fromJson(builder.toString(),

                new TypeToken<List<UserMap>>(){}.getType());

        return usersList;
    }

}
