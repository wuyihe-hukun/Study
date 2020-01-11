package hukun.example.studyonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    private Button mbton3;
    private TextView mTv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mbton3=findViewById(R.id.btn_3);
        mbton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"the button three is be clicked",Toast.LENGTH_LONG).show();
            }
        });
        mTv1=findViewById(R.id.btv_1);
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"the textview is be clicked",Toast.LENGTH_LONG).show();

            }
        });
    }
    public void  showToast(View view){
        Toast.makeText(this,"I am be clicked!",Toast.LENGTH_LONG).show();
    }
}
