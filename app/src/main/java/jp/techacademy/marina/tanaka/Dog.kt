package jp.techacademy.marina.tanaka

import android.util.Log

class Dog {
    //プロパティ
    var name: String
    var age:Int

    //コンストラクタ
    constructor() {
        this.name=""
        this.age = 0
    }

    //メソッド
    fun say(){
        Log.d("kotlintest", this.name + "("+this.age + "歳)"+"「ワンワン」")
    }
}