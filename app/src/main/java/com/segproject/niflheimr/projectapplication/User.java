package com.segproject.niflheimr.projectapplication;

/**
 * Created by pph on 2017/12/3.
 */

public class User {
    private String _userName;
    private int _reward;
    private int _photoid;
    private String _password;
    private String _group;

    public User() {
    }
    public User(String userName, int reward, int photoid, String password, String group) {
        _userName = userName;
        _reward = reward;
        _photoid = photoid;
        _password = password;
        _group = group;

    }
    public User(String username, String password, int photoid) {
        _userName = username;
        _password = password;
        _photoid = photoid;

    }

    public void setUserName(String userName) {
        _userName = userName;
    }
    public String getUserName() {
        return _userName;
    }
    public void setReward(int reward) {
        _reward = reward;
    }
    public int getReward() {
        return _reward;
    }
    public void setPhotoId(int photoId){_photoid = photoId;}
    public int getPhotoId(){return _photoid;}
    public void setGroupName(String groupName){_group = groupName;}
    public String getGroupName(){return _group;}
    public String getPassword(){return _password;}
    public void setPassword(String password){_password = password;}
}
