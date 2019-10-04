package com.example.assignment_1_infs3634;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TimeAdapter extends RecyclerView.Adapter<TimeAdapter.MyViewHolder> {

    private List<City_Time> citiesList;
    private int position;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView time, city;

        public MyViewHolder(View view) {
            super(view);
            time = (TextView) view.findViewById(R.id.time);
            city = (TextView) view.findViewById(R.id.city);
        }
    }


    public TimeAdapter(List<City_Time> citiesList) {
        this.citiesList = citiesList;
    }


    public MyViewHolder onCreateViewHolder(ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.city_list, parent, false);

        return new MyViewHolder(itemView);
    }


    public void onBindViewHolder(MyViewHolder holder) {
        City_Time city= citiesList.get(position);
        holder.time.setText(City_Time.getTime());
        holder.city.setText(City_Time.getCity());

    }


}


