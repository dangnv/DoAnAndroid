package com.example.dangnv.dbdemo;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by dangnv on 9/20/15.
 */
public class Category {
    public String categoryId;
    public String name;
    public String description;

    public static class CategoryTable {
        public static final String NAME = "Category";
        public static final String COLUMN_ID = "categoryId";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_DESCRIPTION = "description";

        public static void createTable(SQLiteDatabase db) {
            String sqlStatement = "create table " + NAME + "(" + COLUMN_ID + " integer, " + COLUMN_NAME + " text, " + COLUMN_DESCRIPTION + " text)";
            db.execSQL(sqlStatement);
        }
    }
}
