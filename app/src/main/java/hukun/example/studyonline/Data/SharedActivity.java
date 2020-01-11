package hukun.example.studyonline.Data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Templates;

import hukun.example.studyonline.R;

public class SharedActivity extends AppCompatActivity {
    private EditText mbt_edit,mbt_edit1;
    private Button btnsave,btnshow;
    private TextView textView1,textView2;;
    private SharedPreferences msharedPreferences;
    private SharedPreferences.Editor meditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
        mbt_edit=findViewById(R.id.shared_edit1);
        mbt_edit1=findViewById(R.id.shared_edit2);
        btnsave=findViewById(R.id.btn_save1);
        btnshow=findViewById(R.id.btn_show1);
        textView1=findViewById(R.id.show_text1);
        textView2=findViewById(R.id.show_text2);
        //如何获得实例(文件名字和模式)
        msharedPreferences=getSharedPreferences("data",MODE_PRIVATE);
        meditor=msharedPreferences.edit();

        //点击事件
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击获取输入框的数据，存储
                meditor.putString("name",mbt_edit.getText().toString());
                meditor.putString("code",mbt_edit1.getText().toString());
                meditor.apply();//commit也是没有问题的，多进程则使用commit稍微好一些

            }
        });
        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(msharedPreferences.getString("name",""));
                textView2.setText(msharedPreferences.getString("code",""));
            }
        });
    }
}
