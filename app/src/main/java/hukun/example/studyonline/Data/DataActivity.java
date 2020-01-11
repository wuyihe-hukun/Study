package hukun.example.studyonline.Data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hukun.example.studyonline.R;

public class DataActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mbt_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        mbt_data=findViewById(R.id.btn_sharedata);
        mbt_data.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){
            case R.id.btn_sharedata:
                intent=new Intent(DataActivity.this,SharedActivity.class);
                break;
        }
        startActivity(intent);
    }
}
