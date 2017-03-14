package com.sanke46.android.jsontrening;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ilafedoseev on 06.03.17.
 */

public class FeedReaderDBHelper extends SQLiteOpenHelper {

    private static final int DATE_VEARSION = 1;
    private static final String DATE_NAME = "FeedReader.db";

    public FeedReaderDBHelper(Context context) {
        super(context, DATE_NAME, null, DATE_VEARSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
