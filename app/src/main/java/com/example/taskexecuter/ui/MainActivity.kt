package com.example.taskexecuter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.taskexecuter.databinding.ActivityMainBinding
import com.example.taskexecuter.ui.adapters.TaskAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    val taskAdapter = TaskAdapter()
    val data = ArrayList<String>()
    val ss = SimpleDateFormat("dd-MM-yyyy hh:mm")
    var curr = ss.format(Date())


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
        when (p0) {
            binding.task1But -> task1()
            binding.task2But -> task2()
            binding.task3But -> task3()
            binding.task4But -> task4()
        }

    }

    fun task1() {
        runBlocking {
            flow<String> {
                emit("Task 1")

            }.collect {
                curr = ss.format(Date())
                data.add(curr + " <b>" + it + "</b>")
                taskAdapter.setdata(data)
            }
        }

    }

    fun task2() {
        runBlocking {
            flow<String> {
                emit("Task 2")

            }.collect {
                curr = ss.format(Date())
                data.add(curr + " <b>" + it + "</b>")
                taskAdapter.setdata(data)
            }
        }
    }

    fun task3() {
        runBlocking {
            flow<String> {
                emit("Task 3")

            }.collect {
                curr = ss.format(Date())
                data.add(curr + " <b>" + it + "</b>")
                taskAdapter.setdata(data)
            }
        }
    }

    fun task4() {
        runBlocking {
            flow<String> {
                emit("Task 4")

            }.collect {
                curr = ss.format(Date())
                data.add(curr + " <b>" + it + "</b>")
                taskAdapter.setdata(data)
            }
        }
    }
}