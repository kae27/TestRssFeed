package com.example.dell.testrssfeed;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.example.dell.testrssfeed.model.Rss;
import com.example.dell.testrssfeed.model.entry.Item;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;



public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL ="https://tmd.go.th/xml/";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        FeedApi feedAPI = retrofit.create(FeedApi.class);

        Call<Rss> call = feedAPI.getRss();

        call.enqueue(new Callback<Rss>() {
            @Override
            public void onResponse(Call<Rss> call, Response<Rss> response)
            {
               // Log.d("Rss", "onResponse: feed: " + response.body().toString());
                Log.d("Rss", "onResponse: Server Response: " + response.toString());


                List<Item> items = response.body().getItem();
//
//                Log.i("Rss", "TitelChannel ---------------------------\n" +response.body().getTitleChannel());
//                Log.i("Rss", "PubDateChannel -------------------------\n" +response.body().getPubDateChannel());
//                Log.i("Rss", "Decritioon -----------------------------\n" + items.get(0).getDescription());
//                Log.i("Rss", "Decritioon -----------------------------\n" + items.get(1).getDescription());
//                Log.i("Rss", "Decritioon -----------------------------" + items.get(2).getDescription());

                for (int i = 0; i< items.size(); i++)
                {
                    ExtractXML extractXML1 = new ExtractXML(items.get(i).getDescription(), "<br />");

                }


            }


            @Override
            public void onFailure(Call<Rss> call, Throwable t) {
                Log.e("Rss", "onFailure: Unable to retrieve RSS: " + t.getMessage() );
                Toast.makeText(MainActivity.this, "An Error Occured", Toast.LENGTH_SHORT).show();

            }
        });



    }
}
