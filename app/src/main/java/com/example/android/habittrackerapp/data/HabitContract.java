package com.example.android.habittrackerapp.data;

import android.provider.BaseColumns;

public final class HabitContract {

    private HabitContract() {
    }

    public static final class HabitEntry implements BaseColumns {

        public static final String TABLE_NAME = "habit";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_HABIT_NAME = "name";
        public static final String COLUMN_HABIT_IS_IMPORTANT = "important";
        public static final String COLUMN_HABIT_HOUR = "hour";

        /**
         * Possible values for the importance.
         */
        public static final int IMPORTANT_NO = 0;
        public static final int IMPORTANT_YES = 1;

    }

}
