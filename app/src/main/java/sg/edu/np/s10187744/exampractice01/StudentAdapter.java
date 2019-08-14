package sg.edu.np.s10187744.exampractice01;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder>{
    private ArrayList<Student> data;
    private Context c;

    public StudentAdapter(Context c, ArrayList<Student> data) {
        this.c = c;
        this.data = data;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View item = LayoutInflater.from(c).inflate(R.layout.student_layout, viewGroup, false);

        return new StudentViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {
        final int Position = i;
        studentViewHolder.name.setText(data.get(i).getName());
        studentViewHolder.school.setText(data.get(i).getSchool());
    }

    @Override
    public int getItemCount()  {
        return data.size();
    }
}
