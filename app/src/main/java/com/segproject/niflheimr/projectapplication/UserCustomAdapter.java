package com.segproject.niflheimr.projectapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Date;

/**
 * Created by pph on 2017/12/3.
 */

public class UserCustomAdapter extends ArrayAdapter {

    private final Context context;
    private final String[] userList;
    private final Drawable[] userIcon;

    public UserCustomAdapter(Context context, String[] userList,Drawable[] userIcon){
        super(context, R.layout.single_user_layout, userList);
        this.context = context;
        this.userList = userList;
        this.userIcon = userIcon;

    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.single_user_layout, parent, false);
        TextView userNameTextField = (TextView) rowView.findViewById(R.id.userName);
        ImageView userImageView = (ImageView) rowView.findViewById(R.id.userImage);
        userNameTextField.setText(userList[position]);
        userImageView.setImageDrawable(userIcon[position]);

        return rowView;
    }
}
