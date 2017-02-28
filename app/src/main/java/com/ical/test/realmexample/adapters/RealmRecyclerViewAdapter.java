package com.ical.test.realmexample.adapters;

import android.support.v7.widget.RecyclerView;

import io.realm.RealmBaseAdapter;
import io.realm.RealmObject;

/**
 * Created by ashok.kumar on 28/02/17.
 */

public abstract class RealmRecyclerViewAdapter<T extends RealmObject> extends RecyclerView.Adapter {

    private RealmBaseAdapter<T> realmBaseAdapter;

    public T getItem(int position) {

        return realmBaseAdapter.getItem(position);
    }

    public RealmBaseAdapter<T> getRealmAdapter() {

        return realmBaseAdapter;
    }

    public void setRealmAdapter(RealmBaseAdapter<T> realmAdapter) {

        realmBaseAdapter = realmAdapter;
    }
}
