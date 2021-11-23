package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment()   //Activity에 fragment를 삽입하는 메서드
    }

    fun setFragment() {
//        //*프래그먼트를 시작하는 과정은 하나의 트랜젝션으로 관리되는 것임
//
//        val listFragment: ListFragment = ListFragment()
//
//        val transaction = supportFragmentManager.beginTransaction()
//        //액티비티가 가지고 있는 프래그먼트 매니저를 통해서 트랜잭션을 시작하고 트랜잭션을 편수에 저장
//
//        transaction.add(R.id.FrameLayout, listFragment)
//        //트랜젝션의 add() 메서드로 frameLayout을 id로 가지고 있는 레이아웃에 앞에서 생성한 listFragment를 삽입함
//
//        transaction.commit()
//        //commit메서드로 모든 작업이 정상적으로 처리되었음을 트랜젝션에 알려줌
    }
}