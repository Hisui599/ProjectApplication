package com.segproject.niflheimr.projectapplication;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Date;

/**
 * Created by Max Chen on 12/3/2017.
 */

public class ResourceCustomAdapter extends ArrayAdapter{
    private final Context context;
    String[] itemName ;
    Integer[] avalible ;
    Integer[] Total ;
    Drawable[] ItemIcon;
    public ResourceCustomAdapter(Context context, String[] itemName, Integer[] avalible, Integer[] Total, Drawable[] ItemIcon){
        super(context, R.layout.activity_resource_chores);
        this.context = context;
        this.itemName = itemName;
        this.avalible = avalible;
        this.Total = Total;
        this.ItemIcon = ItemIcon;

    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_resource_chores, parent, false);
        TextView ResourceName = (TextView)rowView.findViewById(R.id.ResourceName);
        TextView Avalible = (TextView)rowView.findViewById(R.id.Avalible);
        TextView total = (TextView)rowView.findViewById(R.id.Total);
        ImageView choreImage = (ImageView) rowView.findViewById(R.id.choreImage);
        ResourceName.setText("Name" + itemName[position]);
        Avalible.setText("Number of Avalible items:"+ avalible[position]);
        total.setText("Total Number:"+ Total[position]);
        choreImage.setImageDrawable(ItemIcon[position]);

        return rowView;
    }

}
