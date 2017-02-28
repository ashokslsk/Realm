package com.ical.test.realmexample.adapters;

import android.content.Context;

import com.ical.test.realmexample.model.Book;

import io.realm.RealmResults;

/**
 * Created by ashok.kumar on 28/02/17.
 */

public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }
}