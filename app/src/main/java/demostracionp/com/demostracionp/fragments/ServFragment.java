package demostracionp.com.demostracionp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import demostracionp.com.demostracionp.R;
import demostracionp.com.demostracionp.adaptadores.RecyclerViewAdapter;
import demostracionp.com.demostracionp.entidades.Contact;

public class ServFragment extends Fragment {


    View v;
    private RecyclerView emailrecyclerview1;
    private List<Contact> sdContact;


    public ServFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.serv_fragment,container,false);

        emailrecyclerview1 = (RecyclerView) v.findViewById(R.id.recyclerserv);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),sdContact);
        emailrecyclerview1.setLayoutManager(new LinearLayoutManager(getActivity()));
        emailrecyclerview1.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sdContact = new ArrayList<>();
        sdContact.add(new Contact("Amelia Margaret", "Estamos cordinando la entrega",R.drawable.cliente1));
        sdContact.add(new Contact("Jose Perez", "Disculpe con una pregunta, se puede bajar el precio si entrego la comida que tengo",R.drawable.cleinte2));

    }
}

