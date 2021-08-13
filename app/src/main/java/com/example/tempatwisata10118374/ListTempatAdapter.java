//11 Agustus 2021, 10118374, Leonardo D Y Korompis, IF-9
package com.example.tempatwisata10118374;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListTempatAdapter extends RecyclerView.Adapter<ListTempatAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Tempat> listTempat;

    public ArrayList<Tempat> getListTempat() {
        return listTempat;
    }

    public void setListTempat(ArrayList<Tempat> listTempat){
        this.listTempat = listTempat;
    }

    public ListTempatAdapter(ArrayList<Tempat> list, Context context){
        this.listTempat = list;
        this.context = context;
    }




    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_tempat, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Tempat tempat = listTempat.get(position);
        Glide.with(holder.itemView.getContext())
            .load(tempat.getPhoto())
            .apply(new RequestOptions().override(55, 55))
            .into(holder.imgPhoto);
        holder.tvName.setText(tempat.getName());


    }

    @Override
    public int getItemCount() {
        return listTempat.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvName, tvAddress;
        ListViewHolder(View view) {
            super(view);
            imgPhoto =view.findViewById(R.id.img_item_tempat);
            tvName =view.findViewById(R.id.tv_item_tempat_name);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Tempat tempat = getListTempat().get(position);
            Intent intent = new Intent(context, DetailTempatActivity.class);
            intent.putExtra(DetailTempatActivity.ITEM_EXTRA, tempat);
            context.startActivity(intent);

        }
    }
}
