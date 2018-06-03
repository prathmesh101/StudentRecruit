package com.stud.prathmesh.android.studentrecruit.Finder;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.stud.prathmesh.android.studentrecruit.R;

public class ListFinderAdapter extends CursorAdapter {


    public ListFinderAdapter(Context context, Cursor c, int flag) {
        super(context, c, flag);
    }

    // Default constructor


        public void bindView(View view, Context context, Cursor cursor) {

            TextView tv = (TextView) view.findViewById(R.id.tvNote);
            String title = cursor.getString( cursor.getColumnIndex( UniversityFinderDB.COLUMN_UNIVERSITYNAME ) );
            tv.setText(title);
        }

        public View newView(Context context, Cursor cursor, ViewGroup parent) {


            return null;
        }
    }



