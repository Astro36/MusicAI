package me.astro36.musicai


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment
        val musicList = arrayListOf<Music>(
            Music("aaa"),
            Music("bbb"),
            Music("aaa"),
            Music("bbb"),
            Music("aaa"),
            Music("bbb"),
            Music("aaa"),
            Music("bbb"),
            Music("aaa"),
            Music("bbb"),
            Music("aaa"),
            Music("bbb"),
            Music("ccc")
        )
        val musicRecyclerView = view.findViewById<RecyclerView>(R.id.list_music)
        musicRecyclerView.adapter = MusicRecyclerViewAdapter(context!!, musicList)
        musicRecyclerView.layoutManager = LinearLayoutManager(activity)
        musicRecyclerView.setHasFixedSize(true)
        return view
    }


}
