package net.rkasigi.iak.animalium;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by rkasigi on 5/7/17.
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.MyViewHolder> {


    List<AnimalModel> animalModelList;
    Context context;

    public AnimalAdapter(List<AnimalModel> animalModelList, Context context) {
        this.animalModelList = animalModelList;
        this.context = context;
    }



    @Override
    public AnimalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AnimalAdapter.MyViewHolder holder, int position) {

        final AnimalModel animalModel = animalModelList.get(position);
        holder.textViewTitle.setText(animalModel.getNameId());
        holder.imageViewProfile.setImageResource(animalModel.getImageId());

        holder.layout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context, animalModel.getNameEn(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return animalModelList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        ImageView imageViewProfile;
        LinearLayout layout;



        MyViewHolder(View itemView) {
            super(itemView);

            textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
            imageViewProfile = (ImageView) itemView.findViewById(R.id.imageViewProfile);
            layout = (LinearLayout) itemView.findViewById(R.id.layoutItemList);



        }
    }
}
