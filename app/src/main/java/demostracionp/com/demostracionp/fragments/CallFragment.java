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

import java.util.ArrayList;
import java.util.List;

import demostracionp.com.demostracionp.entidades.Contact;
import demostracionp.com.demostracionp.R;
import demostracionp.com.demostracionp.adaptadores.RecyclerViewAdapter;

public class CallFragment extends Fragment{

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> prContact;


    public CallFragment() {

        }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.call_fragment,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.callrecycler);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),prContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prContact = new ArrayList<>();
        prContact.add(new Contact("Amelia Margaret", "Me encantan los perros de todos los tamaños, mi esposo y yo estamos conprometidos para darles el mejor cuidado que se le pueda dar a su cascota",R.drawable.cliente1));
        prContact.add(new Contact("Jose Perez", "el mejor cuidador de perros",R.drawable.cleinte2));
        prContact.add(new Contact("Familia Scott", "Nos encargamos de todas las mascotas, incluyendo mascotas exoticas con su respectivo papeleo en ordem, ambiente amigable para mascotas grandes, pequeñas incluyendo reptiles.",R.drawable.cliente1));
        prContact.add(new Contact("Ximena Soto", "Cuido cagos de todo tipo de pelo, el servicio incluye jugutes alimentacion, cepillados y ejercicio para los gatos",R.drawable.cliente3));
        prContact.add(new Contact("Juanito Alcachofa", "el mejor cuidador de perros",R.drawable.cliente5));
        prContact.add(new Contact("Matias y Megan", "Nos encargamos del cuidado de su mascota, incluyendo dias feriados, vacaciones largas o dias festivos.",R.drawable.cliente6));
        prContact.add(new Contact("Buscamos Cuidador", "Buscamos cuidador para nuestro perro, el es cariñoso con todo tipo de personas, que lo cuide durante una semana",R.drawable.cliente7));

    }
}

