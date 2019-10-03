package com.example.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.model.Tu;
import com.example.projecti.R;

public class TuAdapter extends ArrayAdapter<Tu> {
    Activity context; int resoure;
    public TuAdapter(@NonNull Activity context, int resource) {
        super(context, resource);
        this.context= context;
        this.resoure= resource;
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= this.context.getLayoutInflater().inflate(this.resoure, null);
        TextView textLabel= view.findViewById(R.id.text_label);
        TextView textSign= view.findViewById(R.id.text_sign);
        LinearLayout image= view.findViewById(R.id.image_tu);

        Tu tu= getItem(position);
        image.setBackgroundColor(R.color.colorPrimaryDark);
        textLabel.setText(tu.getLabel());
        textSign.setText(tu.getSign());




        return view;
    }
}
