package com.example.taskexecuter.ui.adapters

import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.core.text.HtmlCompat.FROM_HTML_MODE_LEGACY
import androidx.recyclerview.widget.RecyclerView
import com.example.taskexecuter.R
import kotlin.collections.ArrayList

class TaskAdapter : RecyclerView.Adapter<TaskAdapter.TaskHolder>() {
    private var data: ArrayList<String> = ArrayList()


    fun setdata(data: ArrayList<String>) {
        this.data = data
        notifyDataSetChanged()
    }

    class TaskHolder(view: View) : RecyclerView.ViewHolder(view) {
        val task_name: TextView

        init {
            task_name = view.findViewById(R.id.task_name)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.task_item, parent, false)
        return TaskHolder(view)
    }

    override fun onBindViewHolder(holder: TaskHolder, position: Int) {
        holder.task_name.text =HtmlCompat.fromHtml(data[position],FROM_HTML_MODE_LEGACY)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}