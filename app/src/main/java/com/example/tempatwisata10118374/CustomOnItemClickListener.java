//11 Agustus 2021, 10118374, Leonardo D Y Korompis, IF-9
package com.example.tempatwisata10118374;

import android.view.View;

public class CustomOnItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;

    public CustomOnItemClickListener (int position, OnItemClickCallback onItemClickCallback){
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }
    @Override
    public void onClick(View v) {
        onItemClickCallback.onItemClicked(v, position);
    }
    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}
