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

public class MylinearAdapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mcontext;
    private OnItemListener listener;
    //adapter的构造方法
    public MylinearAdapter2(Context context, OnItemListener listener){
        this.mcontext=context;
        this.listener=listener;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType==0){
            return new LinearViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.layout_linear_item,parent,false));

        }
        else {
            return new LinearViewHolder2(LayoutInflater.from(mcontext).inflate(R.layout.layout_linear_item_2,parent,false));

        }

    }
    //设置viewholder的使用
    // @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
       if( getItemViewType(position)==0){
           ((LinearViewHolder)holder).textView.setText("hello world!");
           holder.itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   listener.oonClick(position);
               }
           });
       }
       else {
           ((LinearViewHolder2)holder).textView.setText("璐璐在裸奔");
           holder.itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   listener.oonClick(position);
               }
           });

       }
        //holder.textView.setText("hello world!");
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

    public int getItemViewType(int position){
        if (position %2==0){
            return 0;
        }
        else {
            return 1;
        }
       // return super.getItemViewType(position);
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

    class LinearViewHolder2 extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;

        public LinearViewHolder2(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_title);
            imageView=itemView.findViewById(R.id.div1);
        }
    }
    //点击事件的接口
    public interface  OnItemListener{
        void oonClick(int pos);
    }
}
