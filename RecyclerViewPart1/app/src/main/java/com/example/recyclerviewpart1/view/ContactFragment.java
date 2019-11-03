package com.example.recyclerviewpart1.view;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerviewpart1.R;
import com.example.recyclerviewpart1.model.Contact;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {

    View view;
    private RecyclerView recyclerViewContacts;
    private List<Contact> contactList;

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_contact, container, false);

        recyclerViewContacts = view.findViewById(R.id.ContactFragment_RecyclerView_Contacts);
        AdapterRecyclerView adapterRecyclerView = new AdapterRecyclerView(getContext(), contactList);
        recyclerViewContacts.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewContacts.setAdapter(adapterRecyclerView);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contactList = new ArrayList<>();

        contactList.add(new Contact("Ariana Grande","(111) 432453243", R.drawable.arianacontact));
        contactList.add(new Contact("Hillary Clinton","(111) 73244552", R.drawable.hillatycontact));
        contactList.add(new Contact("Rubio Manson","(543) 564343543", R.drawable.rubiocontact));
        contactList.add(new Contact("Selena Gomez","(111) 4536564345", R.drawable.selenacontact));
        contactList.add(new Contact("Taylor Swift","(4543) 325643535", R.drawable.taylorswiftcontact));
        contactList.add(new Contact("Walter Monro","(324) 543564345", R.drawable.waltercontact));
        contactList.add(new Contact("Zayn Klein","(432) 42345532", R.drawable.zayncontact));
        contactList.add(new Contact("Ariana Grande","(111) 432453243", R.drawable.arianacontact));
        contactList.add(new Contact("Hillary Clinton","(111) 73244552", R.drawable.hillatycontact));
        contactList.add(new Contact("Rubio Manson","(543) 564343543", R.drawable.rubiocontact));
        contactList.add(new Contact("Selena Gomez","(111) 4536564345", R.drawable.selenacontact));
        contactList.add(new Contact("Taylor Swift","(4543) 325643535", R.drawable.taylorswiftcontact));
        contactList.add(new Contact("Walter Monro","(324) 543564345", R.drawable.waltercontact));
        contactList.add(new Contact("Zayn Klein","(432) 42345532", R.drawable.zayncontact));
        contactList.add(new Contact("Ariana Grande","(111) 432453243", R.drawable.arianacontact));
        contactList.add(new Contact("Hillary Clinton","(111) 73244552", R.drawable.hillatycontact));
        contactList.add(new Contact("Rubio Manson","(543) 564343543", R.drawable.rubiocontact));
        contactList.add(new Contact("Selena Gomez","(111) 4536564345", R.drawable.selenacontact));
        contactList.add(new Contact("Taylor Swift","(4543) 325643535", R.drawable.taylorswiftcontact));
        contactList.add(new Contact("Walter Monro","(324) 543564345", R.drawable.waltercontact));
        contactList.add(new Contact("Zayn Klein","(432) 42345532", R.drawable.zayncontact));
        contactList.add(new Contact("Ariana Grande","(111) 432453243", R.drawable.arianacontact));
        contactList.add(new Contact("Hillary Clinton","(111) 73244552", R.drawable.hillatycontact));
        contactList.add(new Contact("Rubio Manson","(543) 564343543", R.drawable.rubiocontact));
        contactList.add(new Contact("Selena Gomez","(111) 4536564345", R.drawable.selenacontact));
        contactList.add(new Contact("Taylor Swift","(4543) 325643535", R.drawable.taylorswiftcontact));
        contactList.add(new Contact("Walter Monro","(324) 543564345", R.drawable.waltercontact));
        contactList.add(new Contact("Zayn Klein","(432) 42345532", R.drawable.zayncontact));
        contactList.add(new Contact("Ariana Grande","(111) 432453243", R.drawable.arianacontact));
        contactList.add(new Contact("Hillary Clinton","(111) 73244552", R.drawable.hillatycontact));
        contactList.add(new Contact("Rubio Manson","(543) 564343543", R.drawable.rubiocontact));
        contactList.add(new Contact("Selena Gomez","(111) 4536564345", R.drawable.selenacontact));
        contactList.add(new Contact("Taylor Swift","(4543) 325643535", R.drawable.taylorswiftcontact));
        contactList.add(new Contact("Walter Monro","(324) 543564345", R.drawable.waltercontact));
        contactList.add(new Contact("Zayn Klein","(432) 42345532", R.drawable.zayncontact));
    }
}
