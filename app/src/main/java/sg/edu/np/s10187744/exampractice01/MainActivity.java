package sg.edu.np.s10187744.exampractice01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.rv);
        String[] names = {"A B", "C D", "E F", "G H", "I J", "K L", "M N", "O P", "Q R", "S T"};
        String[] schools = {"ICT", "BA", "HS", "FMS", "LSCT", "DE", "SOE", "IS", "HMS", "ICT"};
        ArrayList<Student> data = new ArrayList<>();
        for (int i=0; i<10; i++){
            Student s = new Student(names[i], schools[i]);
            /*s.setName(names[i]);
            s.setSchool(schools[i]);*/
            data.add(s);
        }

        StudentAdapter adapter = new StudentAdapter(this, data);

        LinearLayoutManager layout = new LinearLayoutManager(this);
        rv.setLayoutManager(layout);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapter);
    }



}
