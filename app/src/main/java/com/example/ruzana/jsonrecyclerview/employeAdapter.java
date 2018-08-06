package com.example.ruzana.jsonrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class employeAdapter extends RecyclerView.Adapter<employeAdapter.ViewHolder> {
    private Context mCtx;
    private List<Employe> employeList;

    public employeAdapter(Context mCtx, List<Employe> employeList) {
        this.mCtx = mCtx;
        this.employeList = employeList;
    }
/*
    @NonNull
    @Override
    public employeviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(mCtx);
        View view = layoutInflater.inflate(R.layout.employe, null);
        return new employeviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull employeviewHolder employeViewHolder, int posistion) {
        Employe employe = employeList.get(posistion);

        employeViewHolder.name.setText(employe.getName());
        employeViewHolder.job.setText(employe.getJob());
        employeViewHolder.salary.setText(employe.getSalary());
    }
    @Override
    public int getItemCount() {
        return employeList.size();
    }

    public class employeviewHolder extends RecyclerView.ViewHolder {
        TextView name, job, salary;

        public employeviewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txt_name);
            job = itemView.findViewById(R.id.txt_job);
            salary = itemView.findViewById(R.id.txt_salary);
        }
    }*/

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mCtx).inflate(R.layout.employe, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Employe employe = employeList.get(position);

        holder.name.setText(String.valueOf(employe.getName()));
        holder.job.setText(String.valueOf(employe.getJob()));
        holder.salary.setText(String.valueOf(employe.getSalary()));

    }

    @Override
    public int getItemCount() {
        return employeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, job, salary;

        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.txt_name);
            job = itemView.findViewById(R.id.txt_job);
            salary = itemView.findViewById(R.id.txt_salary);
        }
    }
}


