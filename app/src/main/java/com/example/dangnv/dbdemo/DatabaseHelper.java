package com.example.dangnv.dbdemo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by dangnv on 9/20/15.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final Integer DB_VERSION = 1;
    private static final String DB_NAME = "SinhVien";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Photo.PhotoTable.createTable(db);
        Category.CategoryTable.createTable(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + Photo.PhotoTable.NAME);
        db.execSQL("drop table if exists " + Category.CategoryTable.NAME);

        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }

    public ArrayList getAllPhotos(SQLiteDatabase db) {
        String sqlString = "select * from " + Photo.PhotoTable.NAME;
        Cursor cur = this.getReadableDatabase().rawQuery(sqlString, null);
        cur.moveToFirst();
        //Doc photo ra

        //hihihihihihi
        return null;
    }

    public ArrayList getAllCategories() {
        //Source code in here.
        return null;
    }
}
