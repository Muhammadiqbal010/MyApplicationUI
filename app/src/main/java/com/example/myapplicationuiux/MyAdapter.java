package com.example.myapplicationuiux;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<MyList> myList;
    private Context context;

    public MyAdapter(List<MyList> myList, Context context) {
        this.myList = myList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Menginflate item_layout.xml
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Set gambar untuk ImageView di setiap item
        holder.imageView.setImageResource(myList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    // ViewHolder untuk menampung ImageView
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            // Menyimpan referensi ke ImageView yang ada di itemView
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}

