package com.example.quiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DbHandler extends SQLiteOpenHelper {
    public DbHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create = "CREATE TABLE highScore (sno INTEGER PRIMARY KEY AUTOINCREMENT, playerName TEXT, score INTEGER)";
        sqLiteDatabase.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String drop = String.valueOf("DROP TABLE IF EXITS");
        sqLiteDatabase.execSQL(drop, new String[]{"highScore"});
        onCreate(sqLiteDatabase);
    }

    public void addPlayer(Player player){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("playerName", player.getPlayerName());
        values.put("score", player.getScore());
        long k = db.insert("highScore", null,values);
        Log.d("mytag", Long.toString(k));
        db.close();
    }

    public void updateScore(Player player){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("playerName",player.getPlayerName());
        contentValues.put("score",player.getScore());
        db.update("HighScore", contentValues, "sno=?",new String[] {String.valueOf(player.getSno())});
        db.close();
    }
//
public List<Player> getPlayerTable(){
        List<Player> players = new ArrayList<>();
    SQLiteDatabase db = this.getReadableDatabase();
    Cursor cursor = db.rawQuery("select * from HighScore", null, null);
    String scoreboardres = "";
    if(cursor != null && cursor.moveToFirst() && !cursor.isLast()){
        do{
            Player player = new Player();
            player.setPlayerName(cursor.getString(1));
            player.setScore(Integer.parseInt(cursor.getString(2)));
            players.add(player);
            cursor.moveToNext();
        }while (!cursor.isLast());
        Log.d("mytag", String.valueOf(cursor.getCount()));
        Log.d("mytag sno", cursor.getString(0));
        Log.d("mytag name", cursor.getString(1));
        Log.d("mytag score", cursor.getString(2));
    }
    else if(cursor != null && cursor.isLast()){
        Player player = new Player();
        player.setPlayerName(cursor.getString(1));
        player.setScore(Integer.parseInt(cursor.getString(2)));
        players.add(player);
    }
    else{
        return null;
    }
    db.close();
    return players;
}

    public Player getPlayerScore(String name){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query("highScore", new String[]{"sno","playerName","score"},"playerName=?",new String[]{name}, null, null, null);
        if(cursor != null && cursor.moveToFirst()){
            Player player = new Player(Integer.parseInt(cursor.getString(0)), cursor.getString(1), Integer.parseInt(cursor.getString(2)));
            Log.d("mytag sno", cursor.getString(0));
            Log.d("mytag name", cursor.getString(1));
            Log.d("mytag score", cursor.getString(2));
            db.close();
            return player;
        }
        else{
            Log.d("mytag", "Some error occured");
            db.close();
            return null;

        }
    }

}
