package com.example.kirill.p0051_layoutfile;

import android.app.Application;

/**
 * Created by Kirill on 03.11.2015.
 */
public class MyApp extends Application {
    private Game game;
    @Override
    public void onCreate() {
        game= new Game();
        super.onCreate();

    }

    public Game getGame() {
        return game;
    }

    public void setGame(int count) {
        game.initGame(count);
    }
    public int count()
    {
       return game.getCount();
    }
    public void addPlayer(String name)
    {
        game.addPlayer(name);
    }
}
