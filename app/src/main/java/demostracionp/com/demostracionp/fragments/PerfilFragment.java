package demostracionp.com.demostracionp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import demostracionp.com.demostracionp.Inicio.MainActivity;
import demostracionp.com.demostracionp.Inicio.PreferenceManager;
import demostracionp.com.demostracionp.R;

public class PerfilFragment extends Fragment {

    private Button btnsal;
    View v;
    public PerfilFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.perfil_fragment,container,false);

        btnsal = (Button) v.findViewById(R.id.salirid);
        btnsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceManager.delPref(v.getContext(),PreferenceManager.PREF_SW1);
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }
}
