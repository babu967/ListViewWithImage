package com.codex.listviewwithimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class ModelAdapter extends ArrayAdapter<Model> {

    private Context mContext;
    private List<Model> modelList;
    public ModelAdapter(Context context, List<Model>modelList) {
        super(context, R.layout.list_view_image_model, modelList);
        mContext=context;
        this.modelList=modelList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= LayoutInflater.from(mContext);
        convertView=inflater.inflate(R.layout.list_view_image_model,parent,false);
        Model model= modelList.get(position);

        ImageView image=convertView.findViewById(R.id.imageView);
        TextView doctorName=convertView.findViewById(R.id.doctorNameListView);
        TextView doctorDetails=convertView.findViewById(R.id.doctorDetailsListView);
        TextView doctorDate=convertView.findViewById(R.id.doctorDateListView);



        image.setImageResource(model.getImage());
        doctorName.setText(model.getDoctorName());
        doctorDetails.setText(model.getDoctorDetails());
        doctorDate.setText(model.getDoctorDate());

        return convertView;
    }
}
