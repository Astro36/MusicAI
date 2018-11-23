package me.astro36.musicai

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class MusicRecyclerViewAdapter(val context: Context, val musicList: ArrayList<Music>) :
    RecyclerView.Adapter<MusicRecyclerViewAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return musicList.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(musicList[position], context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_music, parent, false)
        return ViewHolder(view)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val musicThumbnail = itemView.findViewById<ImageView>(R.id.music_thumbnail)
        val musicTitle = itemView.findViewById<TextView>(R.id.music_title)
        val musicDetails = itemView.findViewById<TextView>(R.id.music_details)

        fun bind(music: Music, context: Context) {
            musicThumbnail?.setImageResource(R.mipmap.ic_launcher)
            musicTitle?.text = "ASDF"
            musicDetails?.text = "asdf"
        }
    }

}