package com.example.khaireddine.e_market;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Khaireddine on 24/12/2017.
 */

public class UserListOpenHelper extends SQLiteOpenHelper {

    private static final String TAG = UserListOpenHelper.class.getSimpleName();
    private static final int DATABASE_VERSION = 1;
    private static final String USER_LIST_TABLE = "user_entries";
    private static final String DATABASE_NAME = "userlist";
    public static final String KEY_ID = "id";
    public static final String KEY_USERNAME = "username";
    public static final String KEY_EMAIL = "Email";
    public static final String KEY_PASSWORD = "password";
    public static final long KEY_PHONENUMBER= 0;
    public static final long KEY_CARDNUMBER= 0;
    private static final String USER_LIST_TABLE_CREATE = "CREATE TABLE " + USER_LIST_TABLE + " (" +
            KEY_ID + " INTEGER PRIMARY KEY, " +
            KEY_USERNAME + " TEXT"+
            KEY_EMAIL + " TEXT" +
            KEY_PASSWORD + " TEXT" +
            KEY_PHONENUMBER + "INT"

    );";
       public UserListOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
} {
}
