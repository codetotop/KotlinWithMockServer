package com.gabriel.kotlin.screen.home

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gabriel.kotlin.R
import com.gabriel.kotlin.data.model.Customer
import kotlinx.android.synthetic.main.item_customer.view.*

class CustomerAdapter(val mItems: ArrayList<Customer>, val mContext: Context) :
    RecyclerView.Adapter<CustomerHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CustomerHolder {
        return CustomerHolder(LayoutInflater.from(mContext).inflate(R.layout.item_customer, viewGroup, false));
    }

    override fun getItemCount(): Int {
        return mItems.size;
    }

    override fun onBindViewHolder(holder: CustomerHolder, position: Int) {
        var mCustomer: Customer = mItems.get(position);
        holder.mTvName.text = mCustomer.mName;
        holder.mTvAge.text = mCustomer.mAge;
    }
}


class CustomerHolder(mView: View) : RecyclerView.ViewHolder(mView) {
    val mTvName = mView.tvName;
    val mTvAge = mView.tvAge;
}