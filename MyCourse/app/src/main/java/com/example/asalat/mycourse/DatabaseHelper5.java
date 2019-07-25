package com.example.asalat.mycourse;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper5 extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "Semester5.db";
    public static final String TABLE_NAME = "sem5";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "SEMESTER";
    public static final String COL_3 = "NAME";
    public static final String COL_4 = "MARKS";
    public static final String COL_5 = "CATS";
    public static final String COL_6 = "PRAC";
    public static final String COL_7 = "PROJECT";
    public static final String COL_8 = "EXAM";
    public static final String COL_9 = "LECTURER";

    public DatabaseHelper5(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,SEMESTER INTEGER,NAME TEXT,MARKS INTEGER,CATS INTEGER,PRAC INTEGER,PROJECT INTEGER,EXAM INTEGER,LECTURER TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String semester,String name,String marks,String cats,String prac,String project,String exam,String lecturer) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,semester);
        contentValues.put(COL_3,name);
        contentValues.put(COL_4,marks);
        contentValues.put(COL_5,cats);
        contentValues.put(COL_6,prac);
        contentValues.put(COL_7,project);
        contentValues.put(COL_8,exam);
        contentValues.put(COL_9,lecturer);
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

    public boolean updateData(String id,String semester,String name,String marks,String cats,String prac,String project,String exam,String lecturer) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,semester);
        contentValues.put(COL_3,name);
        contentValues.put(COL_4,marks);
        contentValues.put(COL_5,cats);
        contentValues.put(COL_6,prac);
        contentValues.put(COL_7,project);
        contentValues.put(COL_8,exam);
        contentValues.put(COL_9,lecturer);
        db.update(TABLE_NAME, contentValues, "ID = ?",new String[] { id });
        return true;
    }

    public Integer deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?",new String[] {id});
    }
}

