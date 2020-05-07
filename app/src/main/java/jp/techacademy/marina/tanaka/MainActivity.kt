package jp.techacademy.marina.tanaka

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human= Human("ポニョ", 3, "ねこ") //名前をポニョ、年齢は3歳で、Humanのインスタンスを作る

        human.say()
        Log.d("kotlintest", "私の名前は" +human.name + "です。")
        Log.d("kotlintest", "年は" +human.age + "歳です。")

        val human2= Human("ちこ", 5, "バドミントン") //名前をポニョ、年齢は3歳で、Humanのインスタンスを作る

        human2.say()
        Log.d("kotlintest", "私の名前は" +human2.name + "です。")
        Log.d("kotlintest", "年は" +human2.age + "歳です。")


        human.think()
        human2.think()


    }
}
