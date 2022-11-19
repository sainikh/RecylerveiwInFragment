package com.example.recylerveiwinfragment

import android.media.MediaCommunicationManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerveiwinfragment.databinding.FragmentFirstFranmentBinding
import com.example.recylerveiwinfragment.databinding.FragmentSecodBinding
import java.lang.reflect.Array.get

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [FirstFranment.newInstance] factory method to
 * create an instance of this fragment.
 */

lateinit var adapter: MyAdapter
lateinit var  recyclerView: RecyclerView
lateinit var usrList:ArrayList<DataClass>


lateinit var name :Array<String>


class FirstFranment() : Fragment(),Passer{

private var _binding  :  FragmentFirstFranmentBinding? = null
    private val binding : FragmentFirstFranmentBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
            _binding =  FragmentFirstFranmentBinding.inflate(inflater, container, false)

            return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DataInishlize()
        val layotManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler)
        recyclerView.layoutManager = layotManager
        adapter = MyAdapter(usrList,this)
        recyclerView.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }





    private fun DataInishlize()
    {
        usrList = ArrayList<DataClass>()
        name = arrayOf("sai","nikhil","sham","kumar","Siddharth","helow","Max","Don't Ask","You are good","HA HA")

        for( i in name.indices)
        {
            val FinalList = DataClass(name[i])
            usrList.add(FinalList)
        }
    }

    override fun getPoss(possition: Int) {
        var name = usrList[possition].name
        Toast.makeText(context,"possition $name",Toast.LENGTH_SHORT).show()


        val action = FirstFranmentDirections.actionFirstFranmentToSecodFragment(name)
        binding.root.findNavController().navigate(action)
//        navControler.navigate(action)
//           Navigation.findNavController(requireView().rootView).navigate(R.id.action_firstFranment_to_secodFragment)

    }

}