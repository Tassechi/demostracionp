package demostracionp.com.demostracionp.adaptadores;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import demostracionp.com.demostracionp.PerfilCorreo;
import demostracionp.com.demostracionp.R;
import demostracionp.com.demostracionp.entidades.Contact;
import demostracionp.com.demostracionp.fragments.CorreoFragment;

public class RecyclerViewAdapterEmail extends RecyclerView.Adapter<RecyclerViewAdapterEmail.My1ViewHolder> {


    Context mContext1;
    List<Contact> mData1;
    Dialog mDialog;
    CorreoFragment mCorreo;

    public RecyclerViewAdapterEmail(Context mContex1, List<Contact> mData1, CorreoFragment mCorreo) {
        this.mContext1 = mContex1;
        this.mData1 = mData1;
        this.mCorreo = mCorreo;
    }
    @NonNull
    @Override
    public RecyclerViewAdapterEmail.My1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext1).inflate(R.layout.item_list,parent,false);
        final My1ViewHolder v1Holder = new My1ViewHolder(v);

        mDialog = new Dialog(mContext1);
        mDialog.setContentView(R.layout.activity_perfil_correo);

        v1Holder.Lineal01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView dialog_name = (TextView) mDialog.findViewById(R.id.idnombrecorreo);
                TextView dialog_descripcion = (TextView) mDialog.findViewById(R.id.iddescripcioncorreo);
                ImageView dialog_img = (ImageView)mDialog.findViewById(R.id.idimagencorreo);

                dialog_name.setText(mData1.get(v1Holder.getAdapterPosition()).getName());
                dialog_descripcion.setText(mData1.get(v1Holder.getAdapterPosition()).getDescripcion());
                dialog_img.setImageResource(mData1.get(v1Holder.getAdapterPosition()).getImagenId());


                mDialog.show();


            }
        });


        return v1Holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterEmail.My1ViewHolder holder, int position) {

        holder.Titulo01.setText(mData1.get(position).getName());
        holder.contenido01.setText((CharSequence) mData1.get(position).getInfo());
        holder.imagen01.setImageResource(mData1.get(position).getImagenId());


    }

    @Override
    public int getItemCount() {
        return mData1.size();
    }

    public class My1ViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout Lineal01;
        private TextView Titulo01;
        private TextView contenido01;
        private ImageView imagen01;


        public My1ViewHolder(View itemView) {
            super(itemView);

            Lineal01 = (LinearLayout) itemView.findViewById(R.id.id_itemlist);
            Titulo01 = (TextView) itemView.findViewById(R.id.tituloid);
            contenido01 = (TextView) itemView.findViewById(R.id.conteidoid);
            imagen01 = (ImageView) itemView.findViewById(R.id.circleid);

        }
    }
}