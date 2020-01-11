package hukun.example.studyonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {
private Button mbtnLogin;
private EditText edit1,edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        mbtnLogin=findViewById(R.id.login);
        edit1=findViewById(R.id.edit_1);
        edit2=findViewById(R.id.edit_2);
        mbtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit11=edit1.getText().toString();
                String edit22=edit2.getText().toString();
                if(edit11.equals("hukun") && edit22.equals("123456")) {
                    Toast.makeText(EditTextActivity.this, "login is successful", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(EditTextActivity.this, "login is failure", Toast.LENGTH_LONG).show();
                }
                }

        });
        //对文本输入进行监听
        edit1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edittext",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
