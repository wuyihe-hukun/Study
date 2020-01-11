package hukun.example.studyonline.recycleview;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import hukun.example.studyonline.R;

public class LinearRecycleViewActivity2 extends AppCompatActivity {
    private RecyclerView mbtmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycle_view);
        mbtmain=findViewById(R.id.rv_main);
        //线性布局管理器
        mbtmain.setLayoutManager(new LinearLayoutManager(LinearRecycleViewActivity2.this));
        mbtmain.setAdapter(new MylinearAdapter2(LinearRecycleViewActivity2.this, new MylinearAdapter2.OnItemListener() {
            @Override
            //调用接口
            public void oonClick(int pos) {
                Toast.makeText(LinearRecycleViewActivity2.this,"click"+pos,Toast.LENGTH_SHORT).show();
            }
        }));//因为写了接口回调，所以传参数不止一个
        //样式设置,分割线示例
        mbtmain.addItemDecoration(new MyDecoration());
        //直接设置点击事件，通过回调方法，在设配器里面写一个接口回调

    }
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeght));
        }
    }
}
