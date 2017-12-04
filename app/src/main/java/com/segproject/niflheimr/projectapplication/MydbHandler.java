package com.segproject.niflheimr.projectapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pph on 2017/12/3.
 */

public class MydbHandler extends SQLiteOpenHelper{
    private static final String DATABASE_NAME ="choreDB1.db";
    private static final int DATABASE_VERSION =1;
    public static final String TABLE_USERS = "Users";
    public static final String USERS_USERS_ID = "User_ID";
    public static final String USERS_USER_NAME = "User_name";
    public static final String USERS_REWARD = "Reward";
    public static final String USERS_PHORO_ID = "photo_id";
    public static final String USERS_PASSWORD = "Password";
    public static final String USERS_GROUP_NAME= "Group_name";
    public static final String TABLE_CHORE= "Chore";
    public static final String CHORE_CHORE_ID= "Chore_ID";
    public static final String CHORE_DESCRIPTION= "Description";
    public static final String CHORE_DEADLINE= "Deadline";
    public static final String CHORE_REWARD_MARK= "Reward_Mark";
    public static final String CHORE_ISCOMPLETE= "Iscomplete";
    public static final String CHORE_ACTIVE= "Active";
    public static final String TABLE_TODO= "Todo";
    public static final String TODO_RELATIONSHIPNUMBER="relationshipNumber";
    public static final String TODO_USERS_ID= "User_ID";
    public static final String TODO_CHORE_ID= "Chore_ID";

    public MydbHandler (Context context){ super (context, DATABASE_NAME,null,DATABASE_VERSION);}
    public void onCreate(SQLiteDatabase db){
        String CREATE_USERS_TABLE="CREATE TABLE " +
                TABLE_USERS + "("
                + USERS_USER_NAME + " VARCHAR(20) PRIMARY KEY,"
                + USERS_REWARD + " INTEGER,"
                + USERS_PHORO_ID + " INTEGER,"
                + USERS_PASSWORD + " VARCHAR(20) NOT NULL,"
                + USERS_GROUP_NAME + " VARCHAR(10)" + ")";
        db.execSQL(CREATE_USERS_TABLE);
        String CREATE_CHORE_TABLE="CREATE TABLE " +
                TABLE_CHORE +"("
                + CHORE_CHORE_ID + " SERIAL PRIMARY KEY,"
                + CHORE_DESCRIPTION + " VARCHAR(89),"
                + CHORE_DEADLINE + " DATE,"
                + CHORE_REWARD_MARK + " INTEGER,"
                + CHORE_ISCOMPLETE + " Boolean,"
                + CHORE_ACTIVE + " Boolean" + ")";
        db.execSQL(CREATE_CHORE_TABLE);
        String CREATE_TODO_TABLE="CREATE TABLE "+
                TABLE_TODO+"("
                + TODO_RELATIONSHIPNUMBER + " SERIAL PRIMARY KEY,"
                + TODO_USERS_ID + " INTEGER,"
                + TODO_CHORE_ID + " INTEGER,"
                + " FOREIGN KEY (" + TODO_USERS_ID + ") REFERENCES " + TABLE_USERS + ","
                + " FOREIGN KEY (" + TODO_CHORE_ID + ") REFERENCES " + TABLE_CHORE
                + " ON DELETE CASCADE"
                + " ON UPDATE CASCADE"
                + " )";
        db.execSQL(CREATE_TODO_TABLE);



    }
    public void addUsers(User user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USERS_USER_NAME, user.getUserName());
        values.put(USERS_REWARD,user.getReward());
        values.put(USERS_PHORO_ID, user.getPhotoId());
        values.put(USERS_PASSWORD, user.getPassword());
        values.put(USERS_GROUP_NAME, user.getGroupName());
        db.insert(TABLE_USERS,null,values);
        db.close();
    }
    public User findUser(String userName){
        String query = "Select * FROM " + TABLE_USERS + " WHERE " +
                USERS_USER_NAME + " = \"" + userName + "\"";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query,null);
        User user = new User();
        if (cursor.moveToFirst()){
            user.setUserName(cursor.getString(0));
            user.setReward(Integer.parseInt(cursor.getString(1)));
            user.setPhotoId(Integer.parseInt(cursor.getString(2)));
            user.setPassword(cursor.getString(3));
            user.setGroupName(cursor.getString(4));
            cursor.close();
        }else{
            user = null;
        }
        db.close();
        return user;
    }

    public void onUpgrade(SQLiteDatabase db,int num1, int num2){}
}
