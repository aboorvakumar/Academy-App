package com.compunet.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class batches extends AppCompatActivity {

//    ListView listView,lv;
//
//    ArrayList<HashMap<String, String>> data;
//
//    private String[] batchArray,batchDetailArray,batchId;
//    ArrayList<NameValuePair> nameValuePairs;
//    ProgressDialog dialog = null;
//    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//    SharedPreferences prefs;
//    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batches);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Batches");
    }

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3F51B5")));
//
//       // getActionBar().setTitle("Batches");
//
//        getSupportActionBar().setTitle("Batches");
//
//
//        prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//        editor = prefs.edit();
//
//        lv = (ListView) findViewById(R.id.listview_with_fab);
//
//        new LogIn().execute("http://advocate.compunet.in/Academy/task2/batchdisplay1.php");
//
//    }
//
//    private class LogIn extends AsyncTask<String, Void, String> {
//        @Override
//        protected  void onPreExecute()
//        {
//            dialog = ProgressDialog.show(batches.this, "",
//                    "Loading Batches...", true);
//        }
//        @Override
//        protected String doInBackground(String... params) {
//            String responseStr="";
//            try {
//                HttpClient httpclient = new DefaultHttpClient();
//                HttpPost httppost = new HttpPost(params[0]);
//                HttpResponse response = httpclient.execute(httppost);
//                responseStr = EntityUtils.toString(response.getEntity());
//            }
//
//            catch (Exception ex) {
//                ex.printStackTrace();
//                responseStr="networkerror";
//            }
//            return responseStr;
//        }
//
//        @Override
//        protected void onPostExecute(String result) {
//
//            String output = result;
//            try
//
//            {
//                JSONObject reader = new JSONObject(output);
//
//                JSONArray jsonArray = reader.getJSONArray("Batches");
//
//                String[] batchIdR = new String[jsonArray.length()];
//                String[] batchArrayR = new String[jsonArray.length()];
//                String[] batchDetailArrayR = new String[jsonArray.length()];
//                batchArray=new String[jsonArray.length()];
//                batchDetailArray=new String[jsonArray.length()];
//                batchId=new String[jsonArray.length()];
//
//                for(int i=0; i < jsonArray.length(); i++)
//                {
//                    JSONObject jsonObject = jsonArray.getJSONObject(i);
//
//                    batchIdR[i]= jsonObject.getString("heading").toString();
//                    batchArrayR[i]= jsonObject.getString("detail").toString();
//                    batchDetailArrayR[i]= jsonObject.getString("date").toString();
//                    batchArray[i]=batchArrayR[i];
//                    batchDetailArray[i]=batchDetailArrayR[i];
//                    batchId[i]=batchIdR[i];
//                }
//                dialog.dismiss();
//                }
//
//            catch (JSONException e)
//
//            {
//                e.printStackTrace();
//            }
//
//            /*Toast.makeText(MainActivity.this, caseDetailArray[2].toString(), Toast.LENGTH_SHORT).show();*/
//
//            data = new ArrayList<HashMap<String, String>>();
//
//            for(int i=0;i<batchArray.length;i++){
//                HashMap<String,String> datum = new HashMap<String, String>();
//                datum.put("Batch", batchArray[i]);
//                datum.put("Upcoming_Batch_Detail", batchDetailArray[i]);
//                datum.put("Date", batchId[i]);
//                data.add(datum);
//            }
//
//            SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), data, R.layout.list_item1, new String[] {"Batch", "Upcoming_Batch_Detail", "Date"}, new int[] {R.id.upcomingdetails_listview_case, R.id.upcomingdetails_listview_case_detail, R.id.date});
//
//            lv.setAdapter(adapter);
//
//        }
//
//    }
//
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
