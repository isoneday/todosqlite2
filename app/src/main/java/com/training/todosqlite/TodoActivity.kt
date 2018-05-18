package com.training.todosqlite

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_todo.*

class TodoActivity : AppCompatActivity() {

var fab: FloatingActionButton? = null
    var listtask : RecyclerView? = null
    var linearlayout : LinearLayoutManager? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        setSupportActionBar(toolbar)
        //fun for inizialitation view
        initview()
        //fun for operation
        initoperations()

    }


    private fun initview() {
        fab =findViewById<FloatingActionButton>(R.id.fab)
        listtask =findViewById<RecyclerView>(R.id.listtask)
        linearlayout = LinearLayoutManager(applicationContext)
        (listtask as RecyclerView).layoutManager =linearlayout

    }

    private fun initoperations() {
        fab?.setOnClickListener {
val i = Intent(applicationContext,AddOrEditActivity::class.java)
            i.putExtra("mode","A")
        }
    }

}
