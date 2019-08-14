package sg.edu.np.s10187744.exampractice01;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView school;
    View view;

    public StudentViewHolder(View v){
        super(v);
        this.view = v;
        name = v.findViewById(R.id.name);
        school = v.findViewById(R.id.school);
    }
}
