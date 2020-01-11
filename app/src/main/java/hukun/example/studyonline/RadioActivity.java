package hukun.example.studyonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {
private RadioGroup  mbtRadiogroup1,mRg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        mbtRadiogroup1=findViewById(R.id.radiogroup_1);
        mbtRadiogroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton1=group.findViewById(checkedId);
                Toast.makeText(RadioActivity.this,radioButton1.getText(),Toast.LENGTH_LONG).show();
            }
        });
        mRg2=findViewById(R.id.radiogroup_2);
        mRg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton1=group.findViewById(checkedId);
                Toast.makeText(RadioActivity.this,radioButton1.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
