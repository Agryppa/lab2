package com.example.herud.lab2;

/**
 * Created by Herud on 2018-04-10.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;


public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder>
{
    private List<Title> filmTitles;



    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView category;
        public ImageView iv;

        public ViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            iv = (ImageView)view.findViewById(R.id.frontImage);
            category = (TextView) view.findViewById(R.id.category);
        }
    }


    public RecAdapter(List<Title>titles)
    {
        filmTitles=titles;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rec_view_row, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Title movie = filmTitles.get(position);
        holder.title.setText(movie.getTitle());
        holder.iv.setImageResource(movie.getPicture());
        holder.category.setText(movie.getCategory());

    }

    @Override
    public int getItemCount() {
        return filmTitles.size();
    }




}
