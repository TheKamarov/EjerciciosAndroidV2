package com.example.recyclerviewpart1.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpart1.R;
import com.example.recyclerviewpart1.model.Contact;

import java.util.List;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    Context mContext;
    List<Contact> mData;

    public AdapterRecyclerView(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_contact,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textViewNameContact.setText(mData.get(position).getStringName());
        holder.textViewNumberPhoneContact.setText(mData.get(position).getStringPhone());
        holder.imageViewImageContact.setImageResource(mData.get(position).getIntPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewNameContact;
        private TextView textViewNumberPhoneContact;
        private ImageView imageViewImageContact;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewNameContact = itemView.findViewById(R.id.ItemContact_TextView_ContactName);
            textViewNumberPhoneContact = itemView.findViewById(R.id.ItemContact_TextView_PhoneNumberContact);
            imageViewImageContact = itemView.findViewById(R.id.ItemContact_ImageView_ImageContact);
        }
    }
}
