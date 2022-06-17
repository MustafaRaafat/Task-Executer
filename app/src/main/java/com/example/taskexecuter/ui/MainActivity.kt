package com.example.taskexecuter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.taskexecuter.R
import com.example.taskexecuter.databinding.ActivityMainBinding
import com.example.taskexecuter.ui.adapters.TaskAdapter
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    val taskAdapter = TaskAdapter()
    val data = ArrayList<String>()
    val ss= SimpleDateFormat("dd-MM-yyyy hh:mm")
    var curr=ss.format(Date())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.taskRecyclerView.adapter = taskAdapter

        binding.task1But.setOnClickListener(this)
        binding.task2But.setOnClickListener(this)
        binding.task3But.setOnClickListener(this)
        binding.task4But.setOnClickListener(this)


    }

    override fun onClick(p0: View?) {
        if (p0 ==binding.task1But){
            curr=ss.format(Date())
            data.add(curr+" <b>Task 1</b>")
            taskAdapter.setdata(data)
        }
        if (p0 ==binding.task2But){
            curr=ss.format(Date())
            data.add(curr+" <b>Task 2</b>")
            taskAdapter.setdata(data)
        }
        if (p0 ==binding.task3But){
            curr=ss.format(Date())
            data.add(curr+" <b>Task 3</b>")
            taskAdapter.setdata(data)
        }
        if (p0 ==binding.task4But){
            curr=ss.format(Date())
            data.add(curr+" <b>Task 4</b>")
            taskAdapter.setdata(data)
        }
    }
}