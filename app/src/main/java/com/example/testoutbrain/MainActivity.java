package com.example.testoutbrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.outbrain.OBSDK.Entities.OBRecommendation;
import com.outbrain.OBSDK.Entities.OBRecommendationsResponse;
import com.outbrain.OBSDK.FetchRecommendations.OBRequest;
import com.outbrain.OBSDK.FetchRecommendations.RecommendationsListener;
import com.outbrain.OBSDK.Outbrain;
import com.outbrain.OBSDK.OutbrainException;
import com.outbrain.OBSDK.SmartFeed.OBSmartFeed;
import com.outbrain.OBSDK.SmartFeed.OBSmartFeedListener;

public class MainActivity extends AppCompatActivity implements OBSmartFeedListener {

    RecyclerView recyclerView;
    private OBSmartFeed obSmartFeed;
    private MyAdapter mAdapter = new MyAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);

//        this.obSmartFeed = new OBSmartFeed(getString(R.string.outbrain_sample_url), "SDK_6",
//                recyclerView, this);
//        mAdapter.setOBSmartFeed(obSmartFeed); // connects RecycleView adapter to the OBSmartFeed instance
//        this.obSmartFeed.start();  // start OBSmartFeed
//        try {
//            Outbrain.register(this, "SCORE210M9KMLGHK8AJ289C03");
//            Outbrain.setTestMode(true); // enable test mode when debugging
//        }
//        catch (OutbrainException ex)
//        {
//            // handle exception
//        }
//
//        try {
//            OBRequest request = new OBRequest("", "SDK_3");
//
//            Outbrain.fetchRecommendations(request, new RecommendationsListener() {
//                @Override
//                public void onOutbrainRecommendationsSuccess(OBRecommendationsResponse recommendations) {
//                    //Do something with the recommendations (i.e populate UI components)
//                    int numRecs = recommendations.getAll().size();
//
//                    for (int i = 0; i < numRecs; i++)
//                    {
//                        OBRecommendation rec = recommendations.get(i);
//                        // displaying the recommendation
//                        // Example: displaying a specific recommendation
//                        // getting the title
//                        String title = rec.getContent();
//                        // .... populate the relevant UI component with the title
//                        // getting the source
//                        String source = rec.getSourceName();
//                        // .... populate the relevant UI component with the source
//                        // getting image URL
//                        if (rec.getThumbnail() != null) {
//                            String imageURL = rec.getThumbnail().getUrl();
//                            // .... populate the relevant UI component with the image
//                        }
//
//                        // handling paid VS organic recommendation
//                        if (rec.isPaid()) {
//                            //....Show disclaimer, add paid icon, etc…
//                        }
//                        // handling video VS article
//                        if (rec.isVideo()) {
//                            //Add video icon on recommendation
//                        }
//
//                    }
//                }
//
//                @Override
//                public void onOutbrainRecommendationsFailure(Exception ex) {
//                    //Handle failure (write to log, hide the UI component, etc...)
//                }
//            });
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void userTappedOnRecommendation(OBRecommendation rec) {

    }

    @Override
    public void userTappedOnAdChoicesIcon(String url) {

    }

    @Override
    public void userTappedOnAboutOutbrain() {

    }

    @Override
    public void userTappedOnVideo(String url) {

    }
}
