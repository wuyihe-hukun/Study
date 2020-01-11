package hukun.example.studyonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hukun.example.studyonline.Data.DataActivity;
import hukun.example.studyonline.Gridview.GridViewActivity;
import hukun.example.studyonline.listview.ListViewActivity;
import hukun.example.studyonline.recycleview.RecycleViewActivity;


public class MainActivity extends AppCompatActivity {
    private Button mbtnTextView;//声明组件
    private Button mbtnButton;
    private Button mbtnEditView,mbtRadiobutton,mbtcheck,mbImage;
    private Button mbtlist,mgrid,mRvlinear,mbtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnTextView=findViewById(R.id.btn_textview);
        mbtnEditView=findViewById(R.id.edittext);
        mbtnButton=findViewById(R.id.btn_button);
        mbtcheck=findViewById(R.id.checkbox);
        mbImage=findViewById(R.id.imageview);
        mbtlist=findViewById(R.id.list_1);
        mgrid=findViewById(R.id.grid_1);
        mRvlinear=findViewById(R.id.rv_linear);
        mbtData=findViewById(R.id.rv_data);
        mbtRadiobutton=findViewById(R.id.radiobutton);//找到组件，通过Id
        setListeners();
    }

    private  void setListeners(){
        OnClick onClick=new OnClick();
        mbtnTextView.setOnClickListener(onClick);
        mbtRadiobutton.setOnClickListener(onClick);
        mbtnButton.setOnClickListener(onClick);
        mbtnEditView.setOnClickListener(onClick);
        mbtcheck.setOnClickListener(onClick);
        mbImage.setOnClickListener(onClick);
        mbtlist.setOnClickListener(onClick);
        mgrid.setOnClickListener(onClick);
        mRvlinear.setOnClickListener(onClick);
        mbtData.setOnClickListener(onClick);

    }
    //接口
    private class OnClick implements View.OnClickListener{
        public void onClick(View v){
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                   intent=new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                   intent=new Intent(MainActivity.this,ButtonActivity.class);
                   break;
                case R.id.edittext:
                    intent=new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.radiobutton:
                    intent=new Intent(MainActivity.this,RadioActivity.class);
                    break;
                case R.id.checkbox:
                    intent=new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.imageview:
                    intent=new Intent(MainActivity.this,ImagViewActivity.class);
                    break;
                case R.id.list_1:
                    intent=new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.grid_1:
                    intent=new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                case R.id.rv_linear:
                    intent=new Intent(MainActivity.this, RecycleViewActivity.class);
                    break;
                case R.id.rv_data:
                    intent=new Intent(MainActivity.this, DataActivity.class);
                    break;

            }
            startActivity(intent);
        }

    }
}
