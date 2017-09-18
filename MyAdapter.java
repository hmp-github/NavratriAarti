package navdurgaaarti.app.hmp.aarti.com.navratriaarti;

/**
 * Created by harsh.arora on 8/29/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String[] result;
    String[] description;
    int[] imageId;

    private Context context;
    public MyAdapter(Context context) {
        this.context = context;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
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

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(String[] prgmNameList, String[] prgmDetailList, int[] prgmImages) {
        result = prgmNameList;
        imageId = prgmImages;
        description = prgmDetailList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.item_title.setText(result[position]);
        holder.item_detail.setText(description[position]);
        holder.img.setImageResource(imageId[position]);

        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // String currentValue = result[position];
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), Second_Activity.class);
                    int address = R.raw.a_shailputri;
                    int img_address = R.drawable.a_shelputri;
                    intent.putExtra("Image_Address", img_address);
                    intent.putExtra("song_address", address);
                    view.getContext().startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(view.getContext(), Second_Activity.class);
                    int address = R.raw.b_bramcharini;
                    int img_address = R.drawable.b_varahamcharni;
                    intent.putExtra("Image_Address", img_address);
                    intent.putExtra("song_address", address);
                    view.getContext().startActivity(intent);
                }
                else if(position==2){
                    Intent intent = new Intent(view.getContext(), Second_Activity.class);
                    int address = R.raw.c_chandraghanta;
                    int img_address = R.drawable.c_chanderghanta;
                    intent.putExtra("Image_Address", img_address);
                    intent.putExtra("song_address", address);
                    view.getContext().startActivity(intent);
                }
                else if(position==3){
                    Intent intent = new Intent(view.getContext(), Second_Activity.class);
                    int address = R.raw.d_kushmanda;
                    int img_address = R.drawable.d_khusmanda;
                    intent.putExtra("Image_Address", img_address);
                    intent.putExtra("song_address", address);
                    view.getContext().startActivity(intent);
                }
                else if(position==4){
                    Intent intent = new Intent(view.getContext(), Second_Activity.class);
                    int address = R.raw.a_shailputri;
                    int img_address = R.drawable.a_shelputri;
                    intent.putExtra("Image_Address", img_address);
                    intent.putExtra("song_address", address);
                    view.getContext().startActivity(intent);
                }
                else if (position==5){
                    Intent intent = new Intent(view.getContext(), Second_Activity.class);
                    int addres = R.raw.f_katyani;
                    int img_address = R.drawable.f_katiyani;
                    intent.putExtra("Image_Address", img_address);
                    intent.putExtra("song_address", addres);
                    view.getContext().startActivity(intent);
                }
                else if (position==6) {
                    Intent intent = new Intent(view.getContext(), Second_Activity.class);
                    int addres = R.raw.g_siddhidatri;
                    int img_address = R.drawable.g_kaalratri;
                    intent.putExtra("Image_Address", img_address);
                    intent.putExtra("song_address", addres);
                    view.getContext().startActivity(intent);
                }
                else if (position==7) {
                    Intent intent = new Intent(view.getContext(), Second_Activity.class);
                    int addres = R.raw.h_gauri;
                    int img_address = R.drawable.h_mahagori;
                    intent.putExtra("Image_Address", img_address);
                    intent.putExtra("song_address", addres);
                    view.getContext().startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return result.length;
    }
}
