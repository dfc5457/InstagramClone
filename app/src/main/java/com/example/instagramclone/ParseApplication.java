package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("o47DAGjBgi7RwGf9cpsUNNnLeOBGHEcrAYmIEY4H")
                .clientKey("")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
//0kd0d0ER6mT358wmDZgm5JUeSRVaZOBosHFFKZrN