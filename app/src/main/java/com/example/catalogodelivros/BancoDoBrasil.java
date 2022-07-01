package com.example.catalogodelivros;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.sql.SQLData;

public class BancoDoBrasil  extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "biblioteca";
    public static final String CREATE_TABLE_CATALOGO = "CREATE TABLE catalogo ("+
                                                                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                                                                "titulo VARCHAR(206)," +
                                                                "autor VARCHAR(206)," +
                                                                + "ano INTEGER);";

    public BancoDoBrasil(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_CATALOGO);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS catalogo");
        onCreate(sqLiteDatabase);

    }
}
