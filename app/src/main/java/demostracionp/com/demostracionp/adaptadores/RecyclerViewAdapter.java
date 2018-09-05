package demostracionp.com.demostracionp.adaptadores;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import demostracionp.com.demostracionp.entidades.Contact;
import demostracionp.com.demostracionp.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Contact> mData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context mContex, List<Contact> mData) {
        this.mContext = mContex;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.elemento_lista,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.solicitud_item);

        vHolder.contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name = (TextView)myDialog.findViewById(R.id.nombretrabajador);
                TextView dialog_descripcion = (TextView) myDialog.findViewById(R.id.descripciontrabajador);
                ImageView idalog_img =(ImageView) myDialog.findViewById(R.id.imagentrabajador);

                dialog_name.setText(mData.get(vHolder.getAdapterPosition()).getName());
                dialog_descripcion.setText((CharSequence) mData.get(vHolder.getAdapterPosition()).getDescripcion());
                idalog_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getImagenCorreo());

                Toast.makeText(mContext, "Click", Toast.LENGTH_LONG).show();
                myDialog.show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.titulo1.setText(mData.get(position).getName());
        holder.contenido1.setText((CharSequence) mData.get(position).getInfo());
        holder.img.setImageResource(mData.get(position).getImagenId());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout contact;
        private TextView titulo1;
        private TextView contenido1;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            contact = (LinearLayout) itemView.findViewById(R.id.lista_elemento);
            titulo1 = (TextView) itemView.findViewById(R.id.texttitulo);
            contenido1 = (TextView) itemView.findViewById(R.id.textdesc);
            img = (ImageView) itemView.findViewById(R.id.imagen);

        }
    }
}
