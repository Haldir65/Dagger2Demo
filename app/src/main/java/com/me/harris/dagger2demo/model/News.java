package com.me.harris.dagger2demo.model;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;


import com.me.harris.dagger2demo.BR;


/**
 * Created by Fermi on 2016/24.
 */

public class News implements Observable {

    private transient PropertyChangeRegistry registry =
            new PropertyChangeRegistry();

    @Bindable
    private String type;
    @Bindable
    private String desc;
    @Bindable
    public String url;
    @Bindable
    private String who;
    @Bindable
    private String createdAt;
    @Bindable
    private String publishedAt;
    @Bindable
    private boolean used;
    @Bindable
    private String _id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        registry.notifyChange(this, BR.type);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
        registry.notifyChange(this, BR.desc);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
        registry.notifyChange(this, BR.url);
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
        registry.notifyChange(this, BR.who);
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        registry.notifyChange(this, BR.createdAt);
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        registry.notifyChange(this, BR.publishedAt);
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
        registry.notifyChange(this, BR.used);
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
        registry.notifyChange(this, BR.id);
    }

    @Override
    public String toString() {
        return "News{" +
                "type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                ", url='" + url + '\'' +
                ", who='" + who + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", used=" + used +
                ", _id='" + _id + '\'' +
                '}';
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback) {
        registry.add(onPropertyChangedCallback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback) {
        registry.remove(onPropertyChangedCallback);
    }
}
