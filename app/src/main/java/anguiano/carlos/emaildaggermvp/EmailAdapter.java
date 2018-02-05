//package anguiano.carlos.emaildaggermvp;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//
///**
// * Created by Carlos Anguiano on 04/02/18.
// * For more info contact: c.joseanguiano@gmail.com
// */
//
//public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.ViewHolder> {
//
////    private OnItemClickListener listener;
//    private ArrayList<ItemsTest> itemsTests;
//    private Context context;
//
//    EmailAdapter(Context context, ArrayList<ItemsTest> itemsTestsList, OnItemClickListener onItemClickListener) {
//        this.context = context;
//        this.itemsTests = itemsTestsList;
//        this.listener = onItemClickListener;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_email, null);
//        view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        holder.click(itemsTests.get(position), listener);
//        holder.postId.setText(itemsTests.get(position).getPostId());
//        holder.id.setText(itemsTests.get(position).getId());
//        holder.name.setText(itemsTests.get(position).getName());
//        holder.email.setText(itemsTests.get(position).getEmail());
//        holder.body.setText(itemsTests.get(position).getBody());
//    }
//
//    @Override
//    public int getItemCount() {
//        return itemsTests.size();
//    }
//
//    /*"postId": 1,
//        "id": 1,
//        "name": "id labore ex et quam laborum",
//        "email": "Eliseo@gardner.biz",
//        "body": "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo */
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        TextView postId;
//        TextView id;
//        TextView name;
//        TextView email;
//        TextView body;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            postId = itemView.findViewById(R.id.postId);
//            id = itemView.findViewById(R.id.id);
//            name = itemView.findViewById(R.id.name);
//            email = itemView.findViewById(R.id.email);
//            body = itemView.findViewById(R.id.body);
//        }
//
//        /*public void click(final ItemsTest itemsTest, final OnItemClickListener listener) {
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    listener.onClickItem(itemsTest);
//                }
//            });
//        }*/
//    }
//
//  /*  public interface OnItemClickListener {
//        void onClickItem(ItemsTest itemsTest);
//    }*/
//}
