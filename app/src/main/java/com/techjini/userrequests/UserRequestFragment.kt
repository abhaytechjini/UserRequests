package com.techjini.userrequests

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.techjini.userrequests.databinding.FragmentUserRequestsBinding
import java.util.*

class UserRequestFragment : Fragment() {

    private var mBinding: FragmentUserRequestsBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_user_requests, container, false)
        return mBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var userModel = ArrayList<UserModel>()
        var user = UserModel()
        user.requestDate = "Jun 11, 2018"
        user.requestNumber = "140682"
        user.requestType = "Farm Equipment Loan"
        user.status = "Open"
        userModel.add(user)

        user = UserModel()
        user.requestDate = "Jun 15, 2018"
        user.requestNumber = "234567"
        user.requestType = "Vendor Financing"
        user.status = "Open"
        userModel.add(user)

        user = UserModel()
        user.requestDate = "Jun 19, 2018"
        user.requestNumber = "343445"
        user.requestType = "Complaint"
        user.status = "Closed"
        userModel.add(user)

        user = UserModel()
        user.requestDate = "Jun 23, 2018"
        user.requestNumber = "694558"
        user.requestType = "Mobile Number Change"
        user.status = "Closed"
        userModel.add(user)

        user = UserModel()
        userModel.add(user)

        val adapter = UserAdapter(context, userModel)
        mBinding?.rvUserRequestsList?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        mBinding?.rvUserRequestsList?.adapter = adapter
    }
}