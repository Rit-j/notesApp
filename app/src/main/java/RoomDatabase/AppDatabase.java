package RoomDatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import Dao.TaskDao;
import Entities.Task;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}
