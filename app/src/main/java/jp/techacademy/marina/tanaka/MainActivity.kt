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


        val human2= Human("ちこ", 5, "バドミントン") //名前をポニョ、年齢は3歳で、Humanのインスタンスを作る

        human2.say()

        human.think()
        human2.think()


    }
}
