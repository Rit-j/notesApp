package SingletonClass;

import android.content.Context;

import androidx.room.Room;

import RoomDatabase.AppDatabase;

public class DatabaseInstance {

    private Context mCtx;
    private static DatabaseInstance mInstance;

    //our app database object
    private AppDatabase appDatabase;

    private DatabaseInstance(Context mCtx) {
        this.mCtx = mCtx;

        //creating the app database with Room database builder
        //MyToDos is the name of the database
        appDatabase = Room.databaseBuilder(mCtx, AppDatabase.class, "MyToDos").build();
    }

    public static synchronized DatabaseInstance getInstance(Context mCtx) {
        if (mInstance == null) {
            mInstance = new DatabaseInstance(mCtx);
        }
        return mInstance;
    }

    public AppDatabase getAppDatabase() {
        return appDatabase;
    }
}