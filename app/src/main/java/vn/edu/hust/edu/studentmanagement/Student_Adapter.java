package vn.edu.hust.edu.studentmanagement;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Student_Adapter extends ArrayAdapter<Student> {
    Context context;
    int layout;
    ArrayList<Student> arrayList;
    public Student_Adapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Student> objects) {
        super(context, resource, objects);
        this.context = context; this.layout = resource;
        this.arrayList = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater =LayoutInflater.from(context);
        convertView = inflater.inflate(layout,null);
        ImageView img =(ImageView)convertView.findViewById(R.id.image);
        TextView txt0 = (TextView)convertView.findViewById(R.id.edtID);
        TextView txt1 = (TextView)convertView.findViewById(R.id.txtName);
        TextView txt2 = (TextView)convertView.findViewById(R.id.txtAddress);
        TextView txt3 = (TextView)convertView.findViewById(R.id.DateOfBirth);
        TextView txt4 = (TextView)convertView.findViewById(R.id.edtEmail);
        txt0.setText(arrayList.get(position).getId());
        txt1.setText(arrayList.get(position).getName());
        txt2.setText(arrayList.get(position).getAddress());
        return convertView;
    }

}
