package androidapp.utils

import android.support.test.InstrumentationRegistry
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import androidapp.model.UserMap
import java.io.IOException
import java.io.InputStream

class JsonUtils internal constructor() {

    companion object {

        fun getUsersList(): List<UserMap> {

            val gson = Gson()

            val context = InstrumentationRegistry.getTargetContext().applicationContext

            var `in`: InputStream? = null
            var builder: StringBuilder? = null

            try {
                `in` = context.assets.open("testData.json")
                var count: Int
                val bytes = ByteArray(2048)
                builder = StringBuilder()

                count = `in`!!.read(bytes, 0, bytes.size)

                while (count > 0) {
                    builder.append(String(bytes, 0, count))
                }

            } catch (e: IOException) {
                Log.e("Catch: File reader error", e.toString())
            } finally {
                try {
                    if (`in` != null) {
                        `in`.close()
                    }
                } catch (e: IOException) {
                    Log.e("Finally: File handler error", e.toString())
                }

            }

            val usersList = gson.fromJson<List<UserMap>>(builder!!.toString(),

                    object : TypeToken<List<UserMap>>() {

                    }.type)
            return usersList
        }
    }

}
