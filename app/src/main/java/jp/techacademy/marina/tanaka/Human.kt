package jp.techacademy.marina.tanaka

import android.util.Log

open class Human: Animal, Thinkable {
    //引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
}

    var hobby1: String ="バドミントン"
    var hobby2: String ="ねっこ"


  // Animalクラスのメソッドをオーバーライド
  override fun say() {
      Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「人だよ」")
  }

    //Thinkableインターフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" +this.hobby1+ "について考える。")
        Log.d("kotlintest", "私は" +this.hobby2+ "について考える。")
    }



  }