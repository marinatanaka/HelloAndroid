package jp.techacademy.marina.tanaka

import android.util.Log

open class Human: Animal, Thinkable {
    var hobby: String
    //引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby =hobby
}

  // Animalクラスのメソッドをオーバーライド
  override fun say() {
      Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「人だよ」")
  }

    //Thinkableインターフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" +this.hobby+ "について考える。")
    }



  }