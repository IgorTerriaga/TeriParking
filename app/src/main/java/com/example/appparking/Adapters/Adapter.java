package com.example.appparking.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appparking.Model.Loja;
import com.example.appparking.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Loja> listaLoja;

    public Adapter(List<Loja> listaLoja) {
        this.listaLoja = listaLoja;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, null);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Loja loja = listaLoja.get(position);
        holder.loja.setText(loja.getNome() + " - Próximo ao Portão " +  loja.getProximo());
        if (loja.getCategoria().contains("Vestuário")) {
            holder.imagemTipoLoja.setImageResource(R.drawable.fashion);
        } else if (loja.getCategoria().contains("Alimentação")) {
            holder.imagemTipoLoja.setImageResource(R.drawable.hamburger);

        } else if (loja.getCategoria().contains("Chocolates")) {
            holder.imagemTipoLoja.setImageResource(R.drawable.chocolate);

        } else {
            holder.imagemTipoLoja.setImageResource(R.drawable.shops);
        }

    }

    @Override
    public int getItemCount() {
        return listaLoja.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView loja;
        private ImageView imagemTipoLoja;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            loja = itemView.findViewById(R.id.textLojas);
            imagemTipoLoja = itemView.findViewById(R.id.imageTipoLoja);
        }
    }
}
