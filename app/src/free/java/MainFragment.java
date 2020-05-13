import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.builditbigger.R;


public class MainFragment extends Fragment {

    private static final String TAG = "MainFragment";
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                Log.d(TAG, "onInitializationComplete() called with: initializationStatus = [" + initializationStatus + "]");
            }

        });
        AdView mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.setAdListener(new AdListener(){
//
//            @Override
//            public void onAdClosed() {
//                Log.d(TAG, "onAdClosed() called");
//            }
//            @Override
//            public void onAdFailedToLoad(int var1) {
//                Log.d(TAG, "onAdFailedToLoad: ");
//            }
//            @Override
//            public void onAdLeftApplication() {
//                Log.d(TAG, "onAdLeftApplication: ");
//            }
//            @Override
//            public void onAdOpened() {
//                Log.d(TAG, "onAdOpened: ");
//            }
//            @Override
//            public void onAdLoaded() {
//                Log.d(TAG, "onAdLoaded: ");
//            }
//            @Override
//            public void onAdClicked() {
//                Log.d(TAG, "onAdClicked: ");
//            }
//            @Override
//            public void onAdImpression() {
//                Log.d(TAG, "onAdImpression: ");
//            }
//        });
        mAdView.loadAd(adRequest);
        return view;
    }

}
