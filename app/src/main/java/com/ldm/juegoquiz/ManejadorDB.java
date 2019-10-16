package com.ldm.juegoquiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ManejadorDB extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "quizgame.sqlite";
    private static final int DATABASE_VERSION = 1;

    public ManejadorDB(Context context) {
        super(context,DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE jugadores(id_usuario TEXT PRIMARY KEY,puntuacion INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS jugadores");
        onCreate(db);
    }
}
