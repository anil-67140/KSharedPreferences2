package com.deora.ksharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val textView:TextView=findViewById(R.id.textViewName)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText:EditText=findViewById(R.id.editText)

        val btn:Button=findViewById(R.id.btn)


        DisplaySavedName()
        btn.setOnClickListener(){
            val enteredText:String=editText.text.toString()
            SaveNameInSharedPreferences(enteredText)
        }

    }

//    private fun SaveNameInSharedPreferences(enteredText: String) {
//        //opening sharedPreferenrdce
//        val sharedPreferences:SharedPreferences=getSharedPreferences("UserName", MODE_PRIVATE)
//////write datta in shred preference
//       val editor:SharedPreferences.Editor=sharedPreferences.edit()
//       editor.putString("name",enteredText)
//        editor.commit()
//
//
//    }
   private  fun SaveNameInSharedPreferences(enteredText:String){
       val sharedPreferences:SharedPreferences=getSharedPreferences("UserName", MODE_PRIVATE)
    //write
    val editor:SharedPreferences.Editor=sharedPreferences.edit()
    editor.putString("name",enteredText)
    editor.commit()

   }

    ///reding data from shared prefernces
//    fun  DisplaySavedName(){
//        val sharedPreferences:SharedPreferences=getSharedPreferences("UserName", MODE_PRIVATE)
//
//        val s1:String?=sharedPreferences.getString("name","")
//
//     textView.setText(s1)
//    }
 fun DisplaySavedName(){
     val sharedPreferences:SharedPreferences=getSharedPreferences("UserName", MODE_PRIVATE)
        val s1:String?=sharedPreferences.getString("name","")
        textView.setText(s1)

 }


}