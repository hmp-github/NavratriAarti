package navdurgaaarti.app.hmp.aarti.com.navratriaarti;



import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by harsh.arora on 7/17/2017.
 */

public class WhiteFragment extends Fragment {

    public static int[] prgmImages = {R.drawable.ganeshhh, R.drawable.h_icon,R.drawable.icon};

    public static String[] prgmNameList = {"आरती", "हनुमान जी की आरती ","शिव जी की आरती "};

    public static String[] prgmDetailList = {"आरती संग्रह ", "हनुमान आराधना ","शिव आराधना "};



    public WhiteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_fragment, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        rv.setNestedScrollingEnabled(false);
        CustomAdapter adapter = new CustomAdapter(prgmNameList,prgmDetailList,prgmImages);

        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        //  MobileAds.initialize(getContext(), " ca-app-pub-3940256099942544~3347511713");

        AdView mAdView  = new AdView(getActivity());
        mAdView.setAdUnitId(" ca-app-pub-6027226674629801/6309616819");
        //   mAdView.setAdSize(AdSize.SMART_BANNER);
        mAdView = (AdView) rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.loadAd(adRequest);

        return rootView;


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


}
