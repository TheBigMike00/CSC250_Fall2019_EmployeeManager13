package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EmployeeListActivity extends AppCompatActivity {

    private ListView employeeLV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);
        TextView d = this.findViewById(R.id.display);
        this.employeeLV = this.findViewById(R.id.employeeLV);

        /*
        String[] theStrings = new String[1000];
        for(int i = 0; i<theStrings.length; i++)
        {
            theStrings[i] = "String " + i;
        }
        */

        ArrayList<String> theStrings = new ArrayList<String>();
        for(int i = 0; i<Core.theEmployees.size(); i++)
        {
            theStrings.add(Core.theEmployees.get(i).toString());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, theStrings);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, theStrings);
        this.employeeLV.setAdapter(adapter);

    }
}
