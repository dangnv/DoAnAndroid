package com.example.dangnv.dbdemo;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by dangnv on 9/20/15.
 */
public class Photo {
    public int photoId;
    public String url;
    public String thumbnail;
    public String title;
    public String description;

    public static class PhotoTable {
        public static final String NAME = "Photo";
        public static final String COLUMN_PHOTO_ID = "photoId";
        public static final String COLUMN_URL = "url";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_DESCRIPTION = "description";

        public static void createTable(SQLiteDatabase db) {
            String sqlStatement = "create table " + NAME + "(" + COLUMN_PHOTO_ID + " integer, " + COLUMN_URL + " text primary key, " + COLUMN_TITLE + " text, " + COLUMN_DESCRIPTION + " text)";
            db.execSQL(sqlStatement);
        }
    }
}
