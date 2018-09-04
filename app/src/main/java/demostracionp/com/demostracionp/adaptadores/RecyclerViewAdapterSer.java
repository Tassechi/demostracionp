package demostracionp.com.demostracionp.adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import demostracionp.com.demostracionp.R;
import demostracionp.com.demostracionp.entidades.Contact;

public class RecyclerViewAdapterSer extends RecyclerView.Adapter<RecyclerViewAdapterSer.My2ViewHolder> {

    Context mContext;
    List<Contact> mData;

    public RecyclerViewAdapterSer(Context mContex, List<Contact> mData) {
        this.mContext = mContex;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerViewAdapterSer.My2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_menu,parent,false);
        My2ViewHolder v2Holder = new My2ViewHolder(v);
        return v2Holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterSer.My2ViewHolder holder, int position) {

        holder.nombre.setText(mData.get(position).getName());
        holder.nombre.setText(mData.get(position).getInfo());
        holder.compania.setImageResource(mData.get(position).getImagenId());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class My2ViewHolder extends RecyclerView.ViewHolder {

        private TextView nombre;
        private TextView desc;
        private ImageView compania;

        public My2ViewHolder(View itemView) {
            super(itemView);

            nombre =(TextView) itemView.findViewById(R.id.idtitulo);
            desc = (TextView) itemView.findViewById(R.id.textoc);
            compania =(ImageView) itemView.findViewById(R.id.idimagen1);


        }
    }
}
