package hukun.example.studyonline.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hukun.example.studyonline.Gridview.GridViewActivity;
import hukun.example.studyonline.R;

public class RecycleViewActivity extends AppCompatActivity {
    private Button mbt_rv_linear,mbt_rv_hor,mbt_rv_grid,mbt_rv_pubu,mbt_rv_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        mbt_rv_linear=findViewById(R.id.rv_linear);
        mbt_rv_hor=findViewById(R.id.rv_hor);
        mbt_rv_grid=findViewById(R.id.rv_grid);
        mbt_rv_pubu=findViewById(R.id.rv_pubu);
        mbt_rv_=findViewById(R.id.rv_);
        mbt_rv_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecycleViewActivity.this,LinearRecycleViewActivity.class);
                startActivity(intent);
            }
        });
        mbt_rv_hor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecycleViewActivity.this,HorRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mbt_rv_grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecycleViewActivity.this, GridRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mbt_rv_pubu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecycleViewActivity.this, PuBuLiuActivity.class);
                startActivity(intent);
            }
        });
        mbt_rv_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecycleViewActivity.this, LinearRecycleViewActivity2.class);
                startActivity(intent);
            }
        });
    }
}
