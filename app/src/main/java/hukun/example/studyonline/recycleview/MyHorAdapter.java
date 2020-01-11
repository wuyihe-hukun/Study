package hukun.example.studyonline.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import hukun.example.studyonline.R;

public class MyHorAdapter extends RecyclerView.Adapter<MyHorAdapter.LinearViewHolder> {
    private Context mcontext;
    private OnItemListener listener;
    //adapter的构造方法
    public MyHorAdapter(Context context, OnItemListener listener){
        this.mcontext=context;
        this.listener=listener;
    }
    @NonNull
    @Override
    public MyHorAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new LinearViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.layout_horrv_item,parent,false));
    }
    //设置
    @Override
    public void onBindViewHolder(@NonNull MyHorAdapter.LinearViewHolder holder, final int position) {
        holder.textView.setText("hello ");
        //在适配器里面设置点击事件
        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mcontext,"click"+position,Toast.LENGTH_SHORT).show();
            }
        });*/
        //接口回调点击事件,回到RecycleViewActivity
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.oonClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 20;
    }
    class LinearViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_title);
        }
    }
    //点击事件的接口
    public interface  OnItemListener{
        void oonClick(int pos);
    }
}
