package hukun.example.studyonline.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import hukun.example.studyonline.R;

public class PuBuLiuActivity extends AppCompatActivity {
    private RecyclerView mmRvPubu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu_bu_liu);
        mmRvPubu=findViewById(R.id.rv_pubu);
        mmRvPubu.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        mmRvPubu.setAdapter(new MyPuBuAdapter(PuBuLiuActivity.this, new MyPuBuAdapter.OnItemListener() {
            @Override
            public void oonClick(int pos) {
                Toast.makeText(PuBuLiuActivity.this,"click"+pos,Toast.LENGTH_SHORT).show();
            }
        }));

    }
}
