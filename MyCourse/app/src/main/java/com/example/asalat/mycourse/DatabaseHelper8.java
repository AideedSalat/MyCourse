package com.example.asalat.mycourse;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper8 extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "Modules.db";
    public static final String TABLE_NAME = "modules";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "SEM";
    public static final String COL_3 = "MODULE1";
    public static final String COL_4 = "MODULE2";
    public static final String COL_5 = "MODULE3";
    public static final String COL_6 = "MODULE4";
    public static final String COL_7 = "MODULE5";

    public DatabaseHelper8(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,SEM INTEGER,MODULE1 TEXT,MODULE2 TEXT,MODULE3 TEXT,MODULE4 TEXT,MODULE5 TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String sem,String module1,String module2,String module3,String module4,String module5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,sem);
        contentValues.put(COL_3,module1);
        contentValues.put(COL_4,module2);
        contentValues.put(COL_5,module3);
        contentValues.put(COL_6,module4);
        contentValues.put(COL_7,module5);
        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }
}

