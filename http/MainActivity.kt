package com.example.http

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import javax.net.ssl.HttpsURLConnection
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * 1.manifests 파일에 권한 추가
         * 2.메인 스레드에서 통신 및 ui작업을 하면 안되므로 새로운 스레드로 작업.
         */
        editText.setText("https://www.google.com/search?q=buffer&oq=&aqs=chrome.0.69i59l8.164752j0j7&sourceid=chrome&ie=UTF-8")
        libFlag.setOnCheckedChangeListener{compoundButton, b -> libFlag.isChecked = b  }
        button.setOnClickListener{
            var textUrl:String=editText.text.toString()
            var url = URL(textUrl)
            textView.text=""
            if(libFlag.isChecked){
                getdatabyretrofit()
            }else{
                getdatabyurlconnection(url)
            }
            Log.d("switch", "${libFlag.isChecked}")
        }
    }
    private fun getdatabyretrofit(){

    }

    private fun getdatabyurlconnection(url: URL){
        //통신은 기본적으로 Thread안에서 돌아야 하기 때문에 Thread로 감싸야 한다.
        thread {
            //서버와의 연결 생성, as를 통해 형변화.
            val httpsconn = url.openConnection() as HttpURLConnection
            httpsconn.requestMethod="GET"

            //요청이 성공적일 때 200일 때
            if(httpsconn.responseCode ==HttpURLConnection.HTTP_OK){
                //데이터를 읽어오는 스트림을 연결하여 버퍼에 담는 것. 스트림은 데이터의 흐름이다.
                val streamReader = InputStreamReader(httpsconn.inputStream)
                //buffer은 데이터를 임시적으로 담아놓는 곳이다.
                val resBuffer = BufferedReader(streamReader)
                while (true){
                    val resline:String =resBuffer.readLine() ?:break
//                    안드로이드 OS 는 UI 자원에 Main Thread와 Sub Thread가 동시 접근하여 동기화 이슈를
//                    발생시키는 것을 방지시키기 위해 UI 자원 사용은 UI Thread에서만 가능하도록 만들었다고 했습니다.

                    runOnUiThread{
                        textView.append(resline)
                    }
                }
                //스트림과 커넥션의 해제
                resBuffer.close()
                httpsconn.disconnect()
            }else if(httpsconn.responseCode==HttpsURLConnection.HTTP_NOT_FOUND){
                textView.text="해당 서버 api가 존재하지 않음."
            }else{
                textView.text="올바르지 않은 형식입니다."
            }
        }
    }
}