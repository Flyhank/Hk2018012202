package com.n9s.flyjet.hk2018012202;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Student on 2018/1/22.
 */

public class MyHelper extends SQLiteOpenHelper
{
    final static String DB_NAME = "student.sqlite";
    final static int VERSION = 1;

    public MyHelper(Context context)
    {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)     //若資料表不存在,則新增
    {
        sqLiteDatabase.execSQL("CREATE TABLE \"students\" ( `_id` INTEGER, `name` TEXT, `score` INTEGER, PRIMARY KEY(`_id`) )");
            //從SQLite資料庫copy: CREATE TABLE "students" ( `_id` INTEGER, `name` TEXT, `score` INTEGER, PRIMARY KEY(`_id`) ) 到此, 但必須先留好("    "); 再加入
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)     //若資料表已存在(前版本),則更新
    {

    }
}
