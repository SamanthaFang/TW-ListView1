package a13045249.c347.soi.rp.edu.sg.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

/**
 * Created by 13045249 on 28/4/2017.
 */

public class CourseAdapter extends ArrayAdapter<Course> {

    private ArrayList<Course> courses;
        private Context context;
        private TextView tvCourseStructure;


    public CourseAdapter(Context context, int resource, ArrayList<Course> objects){
        super(context, resource, objects);

// Store the food that is passed to this adapter
        courses = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }
    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

// Get the TextView object
        tvCourseStructure = (TextView) rowView.findViewById(R.id.tvCourseStructure);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Course currentFood = courses.get(position);
        // Set the TextView to show the food

        tvCourseStructure.setText(currentFood.gettitle());

        // Return the nicely done up View to the ListView
        return rowView;
    }



}

