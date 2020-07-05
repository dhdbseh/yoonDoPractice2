package kr.co.tjoeun.yoondopractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            //이메일 /PW입력값 받아오기
            val email = emailEdt.text.toStrion()
            val pw = pwEdt.text.toStrion()

            //if문으로 확인.
            if (email == "admin@test.com" && pw == "qwer1234") {
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "로그인실패",Toast.LENGTH_SHORT).show()
            }
        }

    }
}