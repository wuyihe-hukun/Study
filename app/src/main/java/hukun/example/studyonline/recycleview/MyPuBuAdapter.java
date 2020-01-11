package hukun.example.studyonline.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import hukun.example.studyonline.R;

public class MyPuBuAdapter extends RecyclerView.Adapter<MyPuBuAdapter.LinearViewHolder> {
    private Context mcontext;
    private OnItemListener listener;
    //adapter的构造方法
    public MyPuBuAdapter(Context context, OnItemListener listener){
        this.mcontext=context;
        this.listener=listener;
    }
    @NonNull
    @Override
    public MyPuBuAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new LinearViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.layout_pubu_item,parent,false));
    }
    //设置
    @Override
    public void onBindViewHolder(@NonNull MyPuBuAdapter.LinearViewHolder holder, final int position) {
        if(position%2 !=0)
        {
            holder.imageView.setImageResource(R.drawable.lin);
        }
        else {
            holder.imageView.setImageResource(R.drawable.xin);
        }
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
      private  ImageView imageView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.iv);
        }
    }
    //点击事件的接口
    public interface  OnItemListener{
        void oonClick(int pos);
    }
}
