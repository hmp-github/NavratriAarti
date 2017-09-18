package navdurgaaarti.app.hmp.aarti.com.navratriaarti;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

;

public class BlankFragment extends Fragment {

    public static int[] prgmImages =
            {R.drawable.a_shailputri, R.drawable.b_brahmcharini, R.drawable.c_chandraghanta,R.drawable.d_kushmanda,R.drawable.e_skanda, R.drawable.f_katyani, R.drawable.g_kalratri, R.drawable.h_gauri, R.drawable.i_siddhidatri};


    public static String[] prgmNameList =  {
            "नवरात्री के प्रथम दिन माता शैलपुत्री की पूजा",
            "नवरात्री के दूसरे दिन माता ब्रम्ह्चारिणी रूप की पूजा",
            "नवरात्री का तीसरा दिन माता चंद्रघंटा रूप की पूजा",
            "नवरात्री का चतुर्थ दिन माता कूष्मांडा रूप की पूजा",
            "नवरात्री के पंचम दिन स्कंदमाता रूप की पूजा",
            "नवरात्री के षष्ठम दिन कात्यायनी रूप की पूजा",
            "नवरात्री के सप्तम दिन माता कालरात्रि रूप की पूजा",
            "नवरात्री के अष्टम दिन माता महागौरी रूप की पूजा",
            "नवरात्री के नवमी दिन माता महागौरी रूप की पूजा",};


    public static String[] prgmDetailList = {"","","","","","","","",""};


    public BlankFragment() {
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
        MyAdapter adapter = new MyAdapter(prgmNameList,prgmDetailList,prgmImages);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        AdView mAdView  = new AdView(getActivity());
        mAdView.setAdUnitId(" ca-app-pub-6027226674629801/6309616819");
        //   mAdView.setAdSize(AdSize.SMART_BANNER);
        mAdView = (AdView) rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.loadAd(adRequest);

        return rootView;
    }

}
