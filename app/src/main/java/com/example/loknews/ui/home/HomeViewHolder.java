package com.example.loknews.ui.home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loknews.R;
import com.squareup.picasso.Picasso;

public class HomeViewHolder extends RecyclerView.ViewHolder {
    private final TextView publishedItemView;
    private final ImageView newsImageItemView;
    TextView titleItemView;
    private final TextView publisherItemView;
    public CardView cardView;

    public HomeViewHolder(View itemView) {
        super(itemView);
        publishedItemView = (TextView) itemView.findViewById(R.id.rv_text_published);
        newsImageItemView = (ImageView) itemView.findViewById(R.id.rv_image_berita);
        titleItemView = (TextView) itemView.findViewById(R.id.rv_text_title);
        publisherItemView = (TextView) itemView.findViewById(R.id.rv_text_publisher);
        cardView = (CardView) itemView.findViewById(R.id.cardViewNews);
    }

    public void bind(String published, String image, String title, String publisher, String url, Context context) {
        publishedItemView.setText(published);
        Picasso.get().load(image).into(newsImageItemView);
        titleItemView.setText(title);
        publisherItemView.setText(publisher);


    }

    static HomeViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_news, parent, false);
        return new HomeViewHolder(view);
    }
}
