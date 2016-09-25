package com.me.harris.dagger2demo.model;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;

import com.me.harris.dagger2demo.BR;

import java.util.List;


/**
 * Created by Fermi on 2016/7/24.
 */

public class FuLi implements Observable{


    private transient PropertyChangeRegistry registry =
            new PropertyChangeRegistry();

    @Bindable
    private List<News> results;
    @Bindable
    private boolean error;

    public List<News> getResults() {
        return results;
    }

    public void setResults(List<News> results) {
        this.results = results;
        registry.notifyChange(this, BR.results);
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
        registry.notifyChange(this,BR.error);
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
