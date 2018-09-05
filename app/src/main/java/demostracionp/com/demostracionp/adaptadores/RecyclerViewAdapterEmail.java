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

import de.hdodenhof.circleimageview.CircleImageView;
import demostracionp.com.demostracionp.R;
import demostracionp.com.demostracionp.entidades.Contact;

public class RecyclerViewAdapterEmail extends RecyclerView.Adapter<RecyclerViewAdapterEmail.My1ViewHolder> {


    Context mContext;
    List<Contact> mData;

    public RecyclerViewAdapterEmail(Context mContex, List<Contact> mData) {
        this.mContext = mContex;
        this.mData = mData;
    }
    @NonNull
    @Override
    public RecyclerViewAdapterEmail.My1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_list,parent,false);
        My1ViewHolder v1Holder = new My1ViewHolder(v);
        return v1Holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterEmail.My1ViewHolder holder, int position) {

        holder.Titulo01.setText(mData.get(position).getName());
        holder.contenido01.setText((CharSequence) mData.get(position).getInfo());
        holder.imagen01.setImageResource(mData.get(position).getImagenId());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class My1ViewHolder extends RecyclerView.ViewHolder {

        private TextView Titulo01;
        private TextView contenido01;
        private CircleImageView imagen01;


        public My1ViewHolder(View itemView) {
            super(itemView);

            Titulo01 = (TextView) itemView.findViewById(R.id.tituloid);
            contenido01 = (TextView) itemView.findViewById(R.id.conteidoid);
            imagen01 = (CircleImageView) itemView.findViewById(R.id.circleid);

        }
    }
}