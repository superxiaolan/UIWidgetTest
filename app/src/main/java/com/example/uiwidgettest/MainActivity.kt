package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.uiwidgettest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , View.OnClickListener {

    private lateinit var binding: ActivityMainBinding //ActivityMainBinding就是activity_main.xml生成的绑定文件

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*binding.setOnClickListener(this)*/
    }

    override fun onClick(v: View?) {
        /*when(v?.id){
            R.id.button ->{
                //此处添加逻辑
                *//*val inputText = binding.editText.text.toString()
                Toast.makeText(this,inputText,Toast.LENGTH_SHORT).show()*//*

            *//*binding.imageView.setImageResource(R.drawable.img_2)*//*

            *//*if(binding.progressBar.visibility ==View.VISIBLE){
                binding.progressBar.visibility = View.GONE
            }else{
                binding.progressBar.visibility = View.VISIBLE
            }*//*
                *//*binding.progressBar.progress = binding.progressBar.progress + 10*//*

                *//*AlertDialog.Builder(this).apply {
                    setTitle("This is Dialog")
                    setMessage("Something important.")
                    setCancelable(false)
                    setPositiveButton("OK"){ dialog,which ->
                    }
                    setNegativeButton("Cancle"){ dialog, which ->
                    }
                    show()*//*
                }
            }*/



        }
    }