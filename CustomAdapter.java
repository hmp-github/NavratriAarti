package navdurgaaarti.app.hmp.aarti.com.navratriaarti;


import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String[] result;
    String[] description;
    int[] imageId;
    MainActivity m;




    public CustomAdapter(String[] prgmNameList, String[] prgmDetailList, int[] prgmImages) {
        result = prgmNameList;
        imageId = prgmImages;
        description = prgmDetailList;


    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public CardView mCardView;
        TextView item_title;
        TextView item_detail;
        ImageView img;


        public MyViewHolder(View v) {
            super(v);
            mCardView = (CardView) v.findViewById(R.id.card_view);
            item_title = (TextView) v.findViewById(R.id.item_title);
            item_detail = (TextView) v.findViewById(R.id.item_detail);
            img = (ImageView) v.findViewById(R.id.image_View);
        }
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter.MyViewHolder vh = new MyAdapter.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, final int position) {

        holder.item_title.setText(result[position]);
        holder.item_detail.setText(description[position]);
        holder.img.setImageResource(imageId[position]);

        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = result[position];
                if(position==0){
                    openApp(view.getContext(), "com.aarti.hmp.app.aarti");
                }
                else if (position==1){
                    openApp1(view.getContext(), "com.hmp.android.hanumanaaradhna");
                }
                else if (position==2){
                    openApp2(view.getContext(), "com.hmp.android.shiv_ji");
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return result.length;
    }

    public boolean openApp(Context context, String packageName) {
        PackageManager manager = context.getPackageManager();
        Intent i = manager.getLaunchIntentForPackage(packageName);
        if (i == null) {
            Intent i1 = new Intent(Intent.ACTION_VIEW);
            i1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.aarti.hmp.app.aarti&hl=en"));
            context.startActivity(i1);
        } else {
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            context.startActivity(i);

        }
        return true;
    }

    public boolean openApp1(Context context, String packageName) {
        PackageManager manager = context.getPackageManager();
        Intent i = manager.getLaunchIntentForPackage(packageName);
        if (i == null) {
            Intent i1 = new Intent(Intent.ACTION_VIEW);
            i1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.hmp.android.hanumanaaradhna&hl=en"));
            context.startActivity(i1);
        } else {
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            context.startActivity(i);

        }
        return true;
    }

    public boolean openApp2(Context context, String packageName) {
        PackageManager manager = context.getPackageManager();
        Intent i = manager.getLaunchIntentForPackage(packageName);
        if (i == null) {
            Intent i1 = new Intent(Intent.ACTION_VIEW);
            i1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.hmp.android.shiv_ji&hl=en"));
            context.startActivity(i1);
        } else {
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            context.startActivity(i);

        }
        return true;
    }
}
