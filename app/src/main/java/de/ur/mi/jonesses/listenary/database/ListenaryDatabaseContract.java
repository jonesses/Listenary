package de.ur.mi.jonesses.listenary.database;

import android.provider.BaseColumns;

/**
 * Created by Jonas on 03.07.2016.
 */
public class ListenaryDatabaseContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public ListenaryDatabaseContract() {
    }

    /* Inner class that defines the table contents */
    public static abstract class SongEntry implements BaseColumns {
        public static final String TABLE_NAME = "songhistory";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_ARTIST = "artist";
        public static final String COLUMN_NAME_DATE = "date";
        public static final String COLUMN_NAME_TIME = "time";
        public static final String COLUMN_NAME_LOCATION = "location";
    }

}
