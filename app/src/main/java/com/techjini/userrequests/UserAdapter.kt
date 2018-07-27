package com.techjini.userrequests

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.techjini.userrequests.databinding.UserAdapterBinding

class UserAdapter(var context: Context?, var model: List<UserModel>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    private var binding: UserAdapterBinding? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding = DataBindingUtil.inflate<UserAdapterBinding>(LayoutInflater.from(context),
                R.layout.user_adapter, parent, false)
        return ViewHolder(context, binding)
    }

    override fun getItemCount(): Int {
        return model?.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(model?.get(position))
    }

    class ViewHolder(var context: Context?, var binding: UserAdapterBinding?) : RecyclerView.ViewHolder(binding?.root) {

        fun bind(model: UserModel) {
            binding?.requestNumber?.text = model.requestNumber
            binding?.typeName?.text = model.requestType
            binding?.raisedOnDate?.text = model.requestDate
            binding?.statusType?.text = model.status
        }
    }
}