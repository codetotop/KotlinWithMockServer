package com.gabriel.kotlin.screen.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.gabriel.kotlin.R
import com.gabriel.kotlin.data.model.Customer
import com.gabriel.kotlin.webservice.content.MockServerRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

@SuppressLint("CheckResult")
class MainActivity : AppCompatActivity() {

    var mCustomers: ArrayList<Customer> = ArrayList();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData();
        addControls();
        addEvents();
    }

    private fun getData() {
        MockServerRepository
            .fetchCustomerList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ customer ->
                mCustomers.addAll(customer);
                swRefreshLayout.isRefreshing = false;
                if (rcvCustomer.adapter != null)
                    rcvCustomer.adapter.notifyDataSetChanged();
            });

    }

    private fun addControls() {
        rcvCustomer.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rcvCustomer.adapter = CustomerAdapter(mCustomers, this);
    }

    private fun addEvents() {
        swRefreshLayout.setColorSchemeResources(
            android.R.color.black,
            android.R.color.darker_gray,
            android.R.color.holo_red_dark
        );
        swRefreshLayout.setOnRefreshListener {
            getData();
        }

    }
}
