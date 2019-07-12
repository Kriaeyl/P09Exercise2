package sg.edu.rp.dmsd.p09exercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    ArrayList<Employee> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips = findViewById(R.id.listViewMovie);
        movieList.add(new Employee("John", "Software Technical Leader", 3400.0));
        movieList.add(new Employee("May", "Programmer", 2200.0));


        CustomAdapter adapter = new CustomAdapter(this,
                R.layout.row, movieList);

        lvExamTips.setAdapter(adapter);
    }
}

