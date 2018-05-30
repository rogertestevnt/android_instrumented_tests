package epson.com.br.rewards.androidapp.instrumented.login

import android.support.test.filters.LargeTest
import android.support.test.runner.AndroidJUnit4
import epson.com.br.rewards.androidapp.utils.JsonFunctions
import org.junit.Test
import org.junit.runner.RunWith


@LargeTest
@RunWith(AndroidJUnit4::class)
class JsonTests {

    @Test
    fun verifyJsonContents(){

        var list = JsonFunctions().jsonContents

        var i = 0

        for (each in list){
            if (list[i].documentType  == "INDIVIDUAL"){
                print(list[i])
            }
            i =+ 1
        }
    }


}