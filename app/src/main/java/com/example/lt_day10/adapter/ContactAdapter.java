package com.example.lt_day10.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lt_day10.R;
import com.example.lt_day10.model.Person;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private Context context;
    private List<Person> arrPerson;

    public ContactAdapter(Context context, List<Person> arrPerson) {
        this.context = context;
        this.arrPerson = arrPerson;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Person> getArrPerson() {
        return arrPerson;
    }

    public void setArrPerson(List<Person> arrPerson) {
        this.arrPerson = arrPerson;
    }

    @Override
    public int getCount() {
        return arrPerson.size();
    }

    @Override
    public Object getItem(int position) {
        return arrPerson.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder;
        if (view == null) {
            view
                    = LayoutInflater.from(context).inflate(R.layout.item_person_, parent, false);
            holder = new ViewHolder();
            holder.tvName = view.findViewById(R.id.tv_name);
            holder.tvPhone = view.findViewById(R.id.tv_phone);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        holder.tvPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        Person person = arrPerson.get(position);
        holder.tvName.setText(person.getName());
        holder.tvPhone.setText(person.getPhone());
        return view;
    }

    class ViewHolder {
        TextView tvPhone, tvName;
    }
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View view
//                = LayoutInflater.from(context).inflate(R.layout.item_person_, parent, false);
//        TextView tvName = view.findViewById(R.id.tv_name);
//        TextView tvPhone = view.findViewById(R.id.tv_phone);
//        Person person = arrPerson.get(position);
//        tvName.setText(person.getName());
//        tvPhone.setText(person.getPhone());
//        return view;
//    }
}
