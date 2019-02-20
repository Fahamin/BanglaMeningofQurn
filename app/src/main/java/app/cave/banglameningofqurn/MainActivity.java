package app.cave.banglameningofqurn;

import android.content.SharedPreferences;
import android.drm.DrmStore;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    TextView suraTxt;
    ListView listView;
    List<Model> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);


        final SharedPreferences preferences = getApplicationContext().getSharedPreferences("ss", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();


        suraTxt = findViewById(R.id.suraTxtId);
        listView = findViewById(R.id.suraListView);
        suraStore();

        modelList = new ArrayList<>();


        modelList.add(new Model("1.আল ফাতিহা"));
        modelList.add(new Model("2.আল বাক্বারাহ"));
        modelList.add(new Model("3.আল ইমরান  "));
        modelList.add(new Model("4.আন নিসা  "));
        modelList.add(new Model("5.আল মায়েদাহ  "));
        modelList.add(new Model("6.আল আন-আম  "));
        modelList.add(new Model("7.আল আ’রাফ  "));
        modelList.add(new Model("8.আল-আনফাল  "));
        modelList.add(new Model("9.আত তাওবাহ  "));
        modelList.add(new Model("10.ইউনুস  "));
        modelList.add(new Model("11.হুদ  "));
        modelList.add(new Model("12.ইউসূফ"));
        modelList.add(new Model("13.রা’দ  "));
        modelList.add(new Model("14.ইব্রাহীম "));
        modelList.add(new Model("15.হিজর  "));
        modelList.add(new Model("16.নাহল  "));
        modelList.add(new Model("17.বনী ইসরাঈল "));
        modelList.add(new Model("18.কাহফ  "));
        modelList.add(new Model("19.মারইয়াম  "));
        modelList.add(new Model("20.ত্বোয়া-হা "));
        modelList.add(new Model("21.আম্বিয়া  "));
        modelList.add(new Model("22.হাজ্জ্ব  "));
        modelList.add(new Model("23.আল মু’মিনূন   "));
        modelList.add(new Model("24.আন-নূর   "));
        modelList.add(new Model("25.আল-ফুরকান"));
        modelList.add(new Model("26.আশ-শো’আরা   "));
        modelList.add(new Model("27.নমল"));
        modelList.add(new Model("28.আল কাসাস   "));
        modelList.add(new Model("29.আল আনকাবুত   "));
        modelList.add(new Model("30.আর-রূম   "));
        modelList.add(new Model("31.লোকমান   "));
        modelList.add(new Model("32.সেজদাহ   "));
        modelList.add(new Model("33.আল আহযাব   "));
        modelList.add(new Model("34.সাবা  "));
        modelList.add(new Model("35.ফাতির   "));
        modelList.add(new Model("36.ইয়াসীন   "));
        modelList.add(new Model("37.আস-সাফফাত   "));
        modelList.add(new Model("38.ছোয়াদ  "));
        modelList.add(new Model("39.আল-যুমার  "));
        modelList.add(new Model("40.আল-মু’মিন   "));
        modelList.add(new Model("41.হা-মীম সেজদাহ "));
        modelList.add(new Model("42.আশ-শুরা "));
        modelList.add(new Model("43.যুখরুফ "));
        modelList.add(new Model("44.আদ দোখান "));
        modelList.add(new Model("45.আল জাসিয়া "));
        modelList.add(new Model("46.আল আহক্বাফ "));
        modelList.add(new Model("47.মুহাম্মদ "));
        modelList.add(new Model("48.আল ফাতহ "));
        modelList.add(new Model("49.আল হুজরাত "));
        modelList.add(new Model("50.ক্বাফ "));
        modelList.add(new Model("51.আয-যারিয়াত "));
        modelList.add(new Model("52.আত্ব তূর "));
        modelList.add(new Model("53.আন-নাজম "));
        modelList.add(new Model("54.আল ক্বামার "));
        modelList.add(new Model("55.আর রহমান "));
        modelList.add(new Model("56.আল ওয়াক্বিয়া "));
        modelList.add(new Model("57.আল হাদীদ "));
        modelList.add(new Model("58.আল মুজাদালাহ n"));
        modelList.add(new Model("59.আল হাশর "));
        modelList.add(new Model("60.মমতাহিনা "));
        modelList.add(new Model("61.আছ-ছফ  "));
        modelList.add(new Model("62.আল জুমুআহ "));
        modelList.add(new Model("63.মুনাফিকুন  "));
        modelList.add(new Model("64.আত-তাগাবুন n"));
        modelList.add(new Model("65.আত্ব-ত্বালাক্ব  "));
        modelList.add(new Model("66.আত-তাহরীম "));
        modelList.add(new Model("67.আল মুলক   "));
        modelList.add(new Model("68.আল কলম   "));
        modelList.add(new Model("69.আল হাক্বক্বাহ  "));
        modelList.add(new Model("70.আল মা’আরিজ   "));
        modelList.add(new Model("71.নূহ   "));
        modelList.add(new Model("72.আল জিন n "));
        modelList.add(new Model("73.মুযযামমিল   "));
        modelList.add(new Model("74.আল মুদ্দাসসির  "));
        modelList.add(new Model("75.আল ক্বেয়ামাহ n "));
        modelList.add(new Model("76.আদ-দাহর "));
        modelList.add(new Model("77.আল মুরসালাত  "));
        modelList.add(new Model("78.আন-নাবা n  "));
        modelList.add(new Model("79.আন-নযিআ’ত n"));
        modelList.add(new Model("80.আবাসা  "));
        modelList.add(new Model("81.আত-তাকভীর  "));
        modelList.add(new Model("82.আল ইনফিতার  "));
        modelList.add(new Model("83.আত-তাতফীফ  "));
        modelList.add(new Model("84.আল ইনশিক্বাক্ব "));
        modelList.add(new Model("85.আল বুরূজ  "));
        modelList.add(new Model("86.আত্ব-তারিক্ব  "));
        modelList.add(new Model("87.আল আ’লা "));
        modelList.add(new Model("88.আল গাশিয়াহ  "));
        modelList.add(new Model("89.আল ফজর   "));
        modelList.add(new Model("90.আল বালাদ  "));
        modelList.add(new Model("91.আশ-শামস  "));
        modelList.add(new Model("92.আল লায়ল "));
        modelList.add(new Model("93.আদ্ব-দ্বোহা  "));
        modelList.add(new Model("94.আল ইনশিরাহ   "));
        modelList.add(new Model("95.ত্বীন   "));
        modelList.add(new Model("96.আলাক  "));
        modelList.add(new Model("97.কদর "));
        modelList.add(new Model("98.বাইয়্যিনাহ  "));
        modelList.add(new Model("99.যিলযাল  "));
        modelList.add(new Model("100.আদিয়াত  "));
        modelList.add(new Model("101.কারেয়া   "));
        modelList.add(new Model("102.তাকাসূর  "));
        modelList.add(new Model("103.আসর  "));
        modelList.add(new Model("104.হুমাযাহ  "));
        modelList.add(new Model("105.ফীল  "));
        modelList.add(new Model("106.কোরাইশ n "));
        modelList.add(new Model("107.মাউন   "));
        modelList.add(new Model("108.কাওসার  "));
        modelList.add(new Model("109.কাফিরুন   "));
        modelList.add(new Model("110.নছর "));
        modelList.add(new Model("111.লাহাব   "));
        modelList.add(new Model("112.এখলাছ  "));
        modelList.add(new Model("113.ফালাক্ব  "));
        modelList.add(new Model("114.নাস "));

        final Adapter adapter = new Adapter(this, R.layout.model, modelList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0 && preferences.contains("0")) {
                    suraTxt.setText(preferences.getString("0", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 1) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getResources().getString(R.string.s2));
                }
                if (position == 2) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    // suraTxt.setText(Html.fromHTML(myHtmlFormattedText));
                    suraTxt.setMovementMethod(new ScrollingMovementMethod());
                    suraTxt.setText(getResources().getString(R.string.s3));
                }
                if (position == 3) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getResources().getString(R.string.s4));
                }
                if (position == 4) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getResources().getString(R.string.s5));
                }
                if (position == 5) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s6));
                }
                if (position == 6) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s7));
                }
                if (position == 7 && preferences.contains("7")) {
                    suraTxt.setText(preferences.getString("7", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 8) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s9));
                }
                if (position == 9) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s10));
                }
                if (position == 10) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s11));
                }
                if (position == 11) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s12));
                }
                if (position == 12 && preferences.contains("12")) {
                    suraTxt.setText(preferences.getString("12", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 13 && preferences.contains("13")) {
                    suraTxt.setText(preferences.getString("13", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 14) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s15));
                }
                if (position == 15) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s16));
                }
                if (position == 16) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s17));
                }
                if (position == 17) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s18));
                }
                if (position == 18 && preferences.contains("18")) {
                    suraTxt.setText(preferences.getString("18", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 19) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s20));
                }
                if (position == 20) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s21));
                }
                if (position == 21 && preferences.contains("22")) {
                    suraTxt.setText(preferences.getString("22", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 22) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s23));
                }
                if (position == 23 && preferences.contains("24")) {
                    suraTxt.setText(preferences.getString("24", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 24 && preferences.contains("25")) {
                    suraTxt.setText(preferences.getString("25", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 25) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s26));
                }
                if (position == 26) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s27));
                }

                if (position == 27 && preferences.contains("28")) {
                    suraTxt.setText(preferences.getString("28", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 28 && preferences.contains("29")) {
                    suraTxt.setText(preferences.getString("29", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 29 && preferences.contains("30")) {
                    suraTxt.setText(preferences.getString("30", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 30 && preferences.contains("31")) {
                    suraTxt.setText(preferences.getString("31", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 31 && preferences.contains("32")) {
                    suraTxt.setText(preferences.getString("32", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 32) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s33));
                }
                if (position == 33) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s34));
                }
                if (position == 34 && preferences.contains("35")) {
                    suraTxt.setText(preferences.getString("35", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 35 && preferences.contains("36")) {
                    suraTxt.setText(preferences.getString("36", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 36) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s37));
                }
                if (position == 37 && preferences.contains("38")) {
                    suraTxt.setText(preferences.getString("38", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 38 && preferences.contains("39")) {
                    suraTxt.setText(preferences.getString("39", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 39) {
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                    suraTxt.setText(getString(R.string.s40));
                }
                if (position == 40 && preferences.contains("41")) {
                    suraTxt.setText(preferences.getString("41", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 41 && preferences.contains("42")) {
                    suraTxt.setText(preferences.getString("42", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 42 && preferences.contains("43")) {
                    suraTxt.setText(preferences.getString("43", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 43 && preferences.contains("44")) {
                    suraTxt.setText(preferences.getString("44", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 44 && preferences.contains("45")) {
                    suraTxt.setText(preferences.getString("45", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 45 && preferences.contains("46")) {
                    suraTxt.setText(preferences.getString("46", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 46 && preferences.contains("47")) {
                    suraTxt.setText(preferences.getString("47", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 47 && preferences.contains("48")) {
                    suraTxt.setText(preferences.getString("48", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 48 && preferences.contains("49")) {
                    suraTxt.setText(preferences.getString("49", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 49 && preferences.contains("50")) {
                    suraTxt.setText(preferences.getString("50", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 50 && preferences.contains("51")) {
                    suraTxt.setText(preferences.getString("51", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 51 && preferences.contains("52")) {
                    suraTxt.setText(preferences.getString("52", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 52 && preferences.contains("53")) {
                    suraTxt.setText(preferences.getString("53", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 53 && preferences.contains("54")) {
                    suraTxt.setText(preferences.getString("54", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 54 && preferences.contains("55")) {
                    suraTxt.setText(preferences.getString("55", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 55 && preferences.contains("56")) {
                    suraTxt.setText(preferences.getString("56", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 56 && preferences.contains("57")) {
                    suraTxt.setText(preferences.getString("57", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 57 && preferences.contains("58")) {
                    suraTxt.setText(preferences.getString("58", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 58 && preferences.contains("59")) {
                    suraTxt.setText(preferences.getString("59", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 59 && preferences.contains("60")) {
                    suraTxt.setText(preferences.getString("60", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 60 && preferences.contains("61")) {
                    suraTxt.setText(preferences.getString("61", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 61 && preferences.contains("62")) {
                    suraTxt.setText(preferences.getString("62", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 62 && preferences.contains("63")) {
                    suraTxt.setText(preferences.getString("63", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 63 && preferences.contains("64")) {
                    suraTxt.setText(preferences.getString("64", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 64 && preferences.contains("65")) {
                    suraTxt.setText(preferences.getString("65", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 65 && preferences.contains("66")) {
                    suraTxt.setText(preferences.getString("66", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 66 && preferences.contains("67")) {
                    suraTxt.setText(preferences.getString("67", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 67 && preferences.contains("68")) {
                    suraTxt.setText(preferences.getString("68", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 68 && preferences.contains("69")) {
                    suraTxt.setText(preferences.getString("69", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 69 && preferences.contains("70")) {
                    suraTxt.setText(preferences.getString("70", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 70 && preferences.contains("71")) {
                    suraTxt.setText(preferences.getString("71", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 71 && preferences.contains("72")) {
                    suraTxt.setText(preferences.getString("72", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 72 && preferences.contains("73")) {
                    suraTxt.setText(preferences.getString("73", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 73 && preferences.contains("74")) {
                    suraTxt.setText(preferences.getString("74", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }if (position == 74 && preferences.contains("75")) {
                    suraTxt.setText(preferences.getString("75", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 75 && preferences.contains("76")) {
                    suraTxt.setText(preferences.getString("76", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 76 && preferences.contains("77")) {
                    suraTxt.setText(preferences.getString("77", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 77 && preferences.contains("78")) {
                    suraTxt.setText(preferences.getString("78", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 78 && preferences.contains("79")) {
                    suraTxt.setText(preferences.getString("79", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 79 && preferences.contains("80")) {
                    suraTxt.setText(preferences.getString("80", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 80 && preferences.contains("81")) {
                    suraTxt.setText(preferences.getString("81", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 81 && preferences.contains("82")) {
                    suraTxt.setText(preferences.getString("82", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 82 && preferences.contains("83")) {
                    suraTxt.setText(preferences.getString("83", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 83 && preferences.contains("84")) {
                    suraTxt.setText(preferences.getString("84", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 84 && preferences.contains("85")) {
                    suraTxt.setText(preferences.getString("85", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 85 && preferences.contains("86")) {
                    suraTxt.setText(preferences.getString("86", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 86 && preferences.contains("87")) {
                    suraTxt.setText(preferences.getString("87", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 87 && preferences.contains("88")) {
                    suraTxt.setText(preferences.getString("88", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 88 && preferences.contains("89")) {
                    suraTxt.setText(preferences.getString("89", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }if (position == 89 && preferences.contains("90")) {
                    suraTxt.setText(preferences.getString("90", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 90 && preferences.contains("91")) {
                    suraTxt.setText(preferences.getString("91", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 91 && preferences.contains("92")) {
                    suraTxt.setText(preferences.getString("92", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }if (position == 92 && preferences.contains("93")) {
                    suraTxt.setText(preferences.getString("93", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 93 && preferences.contains("94")) {
                    suraTxt.setText(preferences.getString("94", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 94 && preferences.contains("95")) {
                    suraTxt.setText(preferences.getString("95", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 95 && preferences.contains("96")) {
                    suraTxt.setText(preferences.getString("96", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 96 && preferences.contains("97")) {
                    suraTxt.setText(preferences.getString("97", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 97 && preferences.contains("98")) {
                    suraTxt.setText(preferences.getString("98", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 98 && preferences.contains("99")) {
                    suraTxt.setText(preferences.getString("99", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 99 && preferences.contains("100")) {
                    suraTxt.setText(preferences.getString("100", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 100 && preferences.contains("101")) {
                    suraTxt.setText(preferences.getString("101", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 101 && preferences.contains("102")) {
                    suraTxt.setText(preferences.getString("102", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 102 && preferences.contains("103")) {
                    suraTxt.setText(preferences.getString("103", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 103 && preferences.contains("104")) {
                    suraTxt.setText(preferences.getString("104", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 104 && preferences.contains("105")) {
                    suraTxt.setText(preferences.getString("105", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 105 && preferences.contains("106")) {
                    suraTxt.setText(preferences.getString("106", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 106 && preferences.contains("107")) {
                    suraTxt.setText(preferences.getString("107", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 107 && preferences.contains("108")) {
                    suraTxt.setText(preferences.getString("108", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 108 && preferences.contains("109")) {
                    suraTxt.setText(preferences.getString("109", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 109 && preferences.contains("110")) {
                    suraTxt.setText(preferences.getString("110", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 110 && preferences.contains("111")) {
                    suraTxt.setText(preferences.getString("111", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                } if (position == 111 && preferences.contains("102")) {
                    suraTxt.setText(preferences.getString("102", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 112 && preferences.contains("113")) {
                    suraTxt.setText(preferences.getString("113", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
                if (position == 113 && preferences.contains("114")) {
                    suraTxt.setText(preferences.getString("114", null));
                    suraTxt.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
            }
        });
    }


    private void suraStore() {
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("ss", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("114","পরিচ্ছেদ ১১৪ দৃশ্যঃ মানুষ(সুরা আন-নাস the humankind) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৭ আয়াত এবং ১ রুকূ আছে। \n\n" +
                "[১১৪:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                "[১১৪:০০১] আপনি বলুন, \"আমি। আশ্রয়/নিরাপত্তা চাচ্ছি মানুষের ক্রমবিকাশকের কাছে, \n\n" +
                "[১১৪:০০২] মানুষের অধিপতির কাছে, \n\n" +
                "[১১৪:০০৩] মানুষের উদ্ভাবনকারীর কাছে, \n\n" +
                "[১১৪:০০৪] গোপনে কুমন্ত্রণাদানকারী চারপাশের বন্ধু-বান্ধবী, (বিপদে)পিছু হটে যাওয়া বন্ধু-বান্ধবীদের *অনিষ্ট-নষ্টামি-অন্যায় সুবিধা গ্রহণের ক্ষতি* থেকে, \n\n" +
                "[১১৪:০০৫] যারা মানুষের মনে-মগজে মন্দভাব উদ্রেক করে, \n\n" +
                "[১১৪:০০৬] সে অভিজাত(সুশীল) মানুষের মধ্য থেকে হোক বা সাধারণ মানুষের মধ্য থেকে হোক।\" \n\n");
        editor.putString("113","পরিচ্ছেদ ১১৩. দৃশ্যঃ প্রভাত(সূরা আল-ফালাক the dawn) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৬ আয়াত এবং ১ রুকূ আছে। \n\n" +
                "[১১৩:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                "[১১৩:০০১] আপনি বলুন, \"আমি। আশ্রয়/নিরাপত্তা চাচ্ছি প্রভাতের ক্রমবিকাশকের কাছে \n\n" +
                "[১১৩:০০২] তাঁর সকল সৃষ্টির *অনিষ্ট-নষ্টামি-অন্যায় সুবিধা গ্রহণের ক্ষতি* থেকে, \n\n" +
                "[১১৩:০০৩] এবং অন্ধকারাচ্ছান্নকারীর *অনিষ্ট-নষ্টামি-অন্যায় সুবিধা গ্রহণের ক্ষতি* থেকে, যখন তা ছড়িয়ে পড়ে, \n\n" +
                "[১১৩:০০৪] এবং সম্পর্ক-বন্ধনে(বিচ্ছেদ সৃষ্টির জন্য) অপবাদ প্রদানকারীর *অনিষ্ট-নষ্টামি-অন্যায় সুবিধা গ্রহণের ক্ষতি* থেকে, \n\n" +
                "[১১৩:০০৫] এবং হিংসুকের *অনিষ্ট-নষ্টামি-অন্যায় সুবিধা গ্রহণের ক্ষতি* থেকে, যখন সে হিংসা করে।\" \n\n");
        editor.putString("112","পরিচ্ছেদ ১১২.দৃশ্যঃ বিশুদ্ধতা(সূরা আল-ইখলাস the puritty) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৫ আয়াত এবং ১ রুকূ আছে। \n\n" +
                "[১১২:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                "[১১২:০০১] আপনি বলুন, \"তিনিই আল্লাহ এককসত্বা(absolute one)। একক-মহাবিশ্ব \n\n" +
                "[১১২:০০২] আল্লাহ (কনায়)সমৃদ্ধশালী (তাঁরই কনায় তাঁরই মধ্যে সকল সৃষ্টি) \n\n" +
                "[১১২:০০৩] তাঁর কোনও পূর্বলিপি নেই(তিনি আদি বা শূন্য অবস্থা থেকে দৃশ্য অবস্থায় এসেছেন) এবং তিনি নিজেও নিজের কোনও প্রতিলিপি সৃষ্টি করেন না, \n\n" +
                "[১১২:০০৪] এবং তাঁর সমতুল্য কোনও প্রতিলিপি নেই, থাকতে পারে না । \n\n");
        editor.putString("111","পরিচ্ছেদ ১১১.দৃশ্যঃ লেলিহান আগুন(সূরা আল-লাহাব the blazing fire) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৬ আয়্ত এবং ১ রুকূ আছে। \n\n" +
                "[১১১:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                "[১১১:০০১] আবু লাহাবের সকল চেষ্টা(দুই হাত) ব্যার্থ(ধ্বংস) হয়েছে এবং সে নিজেও ব্যার্থ(ধ্বংস) হয়েছে ! \n\n" +
                "[১১১:০০২] তার ধন-সম্পদ এবং যা সে উপার্জন করেছে ,তা তার কোন কাজে আসে নাই, \n\n" +
                "[১১১:০০৩] সে অচিরেই (অনুতাপের)লেলিহান আগুনে দগ্ধ হবে, \n\n" +
                "[১১১:০০৪] এবং তার স্ত্রী, যে বার বার তাকে ইন্দন জোগাত, \n\n" +
                "[১১১:০০৫] তার গলায় খেজুর-আঁশের দড়ি পেঁচানো থাকবে। \n\n");
        editor.putString("110","পরিচ্ছেদ ১১০.দৃশ্যঃ সাহায্য(সূরা আন-নাসর the help) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৪ আয়াত এবং ১ রুকূ আছে। \n\n" +
                "[১১০:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                "[১১০:০০১] যখন (মহাকাশ বিজয়ে)আল্লাহর সাহায্য এবং বিজয় আসবে, \n\n" +
                "[১১০:০০২] এবং আপনি লোকদেরকে দলে দলে আল্লাহর বিধানে অন্তর্ভূক্ত হতে দেখবেন, \n\n" +
                "[১১০:০০৩] সুতরাং আপনি আপনার ক্রমবিকাশকের প্রসংশাসহ (মহাকাশ জয়ের)কাজ করুন এবং তাঁর কাছে সংশোধন প্রার্থনা করুন, নিশ্চই তিনি ভুল মত-পথ থেকে প্রত্যাবর্তনকারীদেরকে গ্রহন করে নেন। \n\n");
        editor.putString("109","[১০৯:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                "[১০৯:০০১] আপনি বলুন, \"হে অস্বীকারকারীরা! \n\n" +
                "[১০৯:০০২] আমি সেভাবে সেবাকর্ম(ইবাদত) করি না যেভাবে তোমরা সেবাকর্ম(ইবাদত) কর, \n\n" +
                "[১০৯:০০৩] এবং তোমরা সেভাবে সেবাকর্ম(ইবাদত) কর না যেভাবে আমি সেবাকর্ম(ইবাদত) করি, \n\n" +
                "[১০৯:০০৪] এবং আমি তাদের সেবাকর্ম(ইবাদত) করি না যাদের সেবাকর্ম(ইবাদত) তোমরা কর, \n\n" +
                "[১০৯:০০৫] এবং তোমরা তাঁর সেবাকর্ম(ইবাদত) কর না যাঁর সেবাকর্ম(ইবাদত) আমি করি, \n\n" +
                "[১০৯:০০৬] তোমাদের জন্য তোমাদের জীবন-বিধান(দীন) এবং আমার জন্য আমার জীবন-বিধান(দীন)।\" \n\n");
        editor.putString("108","১০৮. দৃশ্যঃ অনন্য উপহার(সূরা আল-কাওসার the grand gift) \n\n" +
                "এট মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৪ আয়্ত এবং ১ রুকূ আছে। \n\n" +
                "[১০৮:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                "[১০৮:০০১] নিশ্চই আমরা আপনাকে দান করবো এক \"অনন্য উপহার\"(কাওসার) \n\n" +
                "[১০৮:০০২] সুতরাং আপনি আপনার ক্রমবিকাশকের জন্য ভালবাসা (সালাত) করতে থাকুন এবং কুরবানী (গরিব দুস্থদের খাদ্য ও বস্ত্র এককভাবে দান, এবং দারিদ্র দূরিকরণে সম্মিলিত ভাবে অর্থ দান) করতে থাকুন \n\n" +
                "[১০৮:০০৩] নিশ্চই আজ যারা আপনাকে অপূত্রক বলছে তারাই হবে অপূত্রক \n\n");
        editor.putString("107","পরিচ্ছেদ ১০৭. দৃশ্যঃ ক্ষূদ্র দয়া(সূরা আল্ মা’উন the small kindness ) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৮ আয়াত এবং ১ রুকূ আছে। \n\n" +
                "[১০৭:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                "[১০৭:০০১] আপনি কি তাকে দেখেছেন যে জীবন-বিধানকে মিথ্যা প্রতিপন্ন করে ? \n\n" +
                "[১০৭:০০২] অতএব সে-ই ঐ ব্যক্তি, যে অনাথ-এতিমদের তাড়িয়ে দেয় \n\n" +
                "[১০৭:০০৩] এবং সে গরিবদের খাদ্য দানে উৎসাহ বোধ করে না, \n\n" +
                "[১০৭:০০৪] সুতরাং সর্বনাশা বিপর্যয় সেসব সালাতকারীর জন্য \n\n" +
                "[১০৭:০০৫] যারা তাদের সালাত সম্মন্ধে উদাসীন \n\n" +
                "[১০৭:০০৬] যারা শুধুই লোক দেখায় (অর্থাৎ তাদের সালাত লোক দেখানো) \n\n" +
                "[১০৭:০০৭] এবং যারা ক্ষূদ্র দয়া(গরিবদের খাদ্য দান) করতে বিরত থাকে \n\n");
        editor.putString("106","পরিচ্ছেদ ১০৬. দৃশ্যঃ কুরাইশ বংশ(সূরা কুরাইশ The Quraysh) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৫ আয়াত এবং ১ রুকূ আছে। \n\n" +
                "[১০৬:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                "[১০৬:০০১] কুরাইশদের জন্য স্নেহশীলতা তাদের (মনে-মগজে) অনুরাগ সৃষ্টি করার জন্য, \n\n" +
                "[১০৬:০০২] শীত ও গ্রীষ্মকালীন (কাবা ঘরে)পর্যটনের প্রতি (অনুরাগ সৃষ্টি করার জন্য) \n\n" +
                "[১০৬:০০৩] সুতরাং তাদের উচিত তারা যেন এ গৃহের(কাবা ঘরের) ক্রমবিকাশকের সেবাকর্ম(ইবাদত) করে, \n\n" +
                "[১০৬:০০৪] যিনি ক্ষুধায় তাদেরকে অন্ন দান করেন এবং ভয়-ভীতিতে তাদেরকে নিরাপত্তা দান করেন। \n\n");
        editor.putString("105","পরিচ্ছেদ ১০৫. দৃশ্যঃ হাতি(সূরা আল-ফীল the elephant) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৬ আয়্ত এবং ১ রুকূ আছে। \n\n" +
                "[১০৫:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                "[১০৫:০০১] আপনি কি দেখেন নাই আপনার ক্রমবিকাশক হস্তী-বাহিনীর সাথে কেমন ব্যবহার করেছিলেন? \n\n" +
                "[১০৫:০০২] তিনি কি তাদের ষড়যন্ত্রকে ব্যর্থতায় পরিণত করে দেন নাই? \n\n" +
                "[১০৫:০০৩] এবং তিনি তাদের বিরুদ্ধে ঝাঁকে ঝাঁকে উড়ন্ত লাভা-শেল প্রেরণ করেছিলেন, \n\n" +
                "[১০৫:০০৪] নিক্ষেপ করেছিলেন জ্বলন্ত লাভা-শেল আগ্নেয়গিরি থেকে \n\n" +
                "[১০৫:০০৫] এবং তিনি তাদেরকে প্রচণ্ড আক্রমণে করায়ত্ব করলেন। \n\n");
        editor.putString("104","পরিচ্ছেদ ১০৪. দৃশ্যঃ হীনমন্যতা(সূরা আল-হোমাযা inferiority complex) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ১০ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " \n\n" +
                "[১০৪:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                "[১০৪:০০১] সর্বনাশা বিপর্যয় প্রত্যেক শ্রেষ্ঠত্বের ভানকারী হীনমন্যদের জন্য, \n\n" +
                "[১০৪:০০২] যে ধন-সম্পদ জমা করে এবং তা বার বার গণনা করে। \n\n" +
                "[১০৪:০০৩] সে মনে করে, তার ধন-সম্পদ তাকে অমর করবে, \n\n" +
                "[১০৪:০০৪] কখনও নয়, সে নিশ্চই ‘হুতামা’য় নিক্ষিপ্ত হবে, \n\n" +
                "[১০৪:০০৫] এবং কিসে আপনাকে অবহিত করবে, ‘হুতামা’ কী? \n\n" +
                "[১০৪:০০৬] এটি আল্লাহর লেলিহান আগুন’ \n\n" +
                "[১০৪:০০৭] যা মগজের গভীরে গিয়ে পৌঁছাবে। \n\n" +
                "[১০৪:০০৮] নিশ্চই একে চারদিক থেকে তাদের উপর বন্ধ করে দেয়া হবে, \n\n" +
                "[১০৪:০০৯] অতল গহ্বরের মধ্যে ডুবিয়ে । \n\n");
        editor.putString("103","পরিচ্ছেদ ১০৩. দৃশ্যঃ মহাকাল(সূরা আল-আসর The time) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ ইহাতে ৪ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ১০৩:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ১০৩:০০১] বলছি মহাকালের কথা, \n\n" +
                " ১০৩:০০২] নিশ্চই মানবজাতি বিরাট ক্ষতির মধ্যে আছে, \n\n" +
                " ১০৩:০০৩] তারা ছাড়া, যারা আল্লাহকে এককসত্বা মেনে নেয় এবং ভালকাজ করে, এবং তারা একে অপরকে বিজ্ঞান(সত্য) অনুশীলনে উত্সাহিত করে থাকে এবং(এ পথে কষ্ট-ক্লেষ ও বিপদ-আপদে) একে অপরকে ধৈর্য ধরতেও উত্সাহিত করে থাকে। \n\n" +
                "</string>");
        editor.putString("102","পরিচ্ছেদ ১০২. দৃশ্যঃ প্রজনন(সূরা আত-তাকাসুর The reproduction) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৯ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ১০২:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ১০২:০০১] অধিক সন্তান জন্মদান(এর আনন্দ) তোমাদেরকে(আল্লাহ থেকে) উদাসীন করে দেয়, \n\n" +
                " ১০২:০০২] যতক্ষণ পর্যন্ত না তোমরা কবর-যাত্রা করছ। \n\n" +
                " ১০২:০০৩] কখনও নয়, অচিরেই তোমরা জানতে পারবে। \n\n" +
                " ১০২:০০৪] আবার বলছি ! কখনও নয়, অচিরেই তোমরা উপলব্ধি করতে পারবে। \n\n" +
                " ১০২:০০৫] কখনও নয়, হায়! যদি তোমাদের নিশ্চিত জ্ঞান হত । \n\n" +
                " ১০২:০০৬] নিশ্চই তোমরা অনুতাপস্থলের (দুঃখ-দূর্দশার) দৃশ্য দেখবে , \n\n" +
                " ১০২:০০৭] আবার বলছি, নিশ্চিতভাবেই তোমরা এসব চাক্ষুষ দেখবে। \n\n" +
                " ১০২:০০৮] অতঃপর সেদিন তোমরা পুরস্কার(সন্তান)গুলো সম্বন্ধে অবশ্যই জিজ্ঞাসিত হবে।");
        editor.putString("101","পরিচ্ছেদ ১০১. দৃশ্যঃ সংকেত-ধ্বনি(সূরা আল-কারি’আ the signal) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ১২ আয়াত এবং ১ রুকূ আছে। \n\n" +
                "[১০১:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                "[১০১:০০১] একটি সংকেত-ধ্বনি! \n\n" +
                "[১০১:০০২] কিসের সে সংকেত-ধ্বনি ? \n\n" +
                "[১০১:০০৩] এবং কিসে আপনাকে অবহিত করবে, কিসের সে সংকেত-ধ্বনি ? \n\n" +
                "[১০১:০০৪] যেদিন মানুষ বিক্ষিপ্ত পঙ্গপালের মত গিজগিজ করবে, \n\n" +
                "[১০১:০০৫] এবং মহারথীরা হবে (লজ্জায়)লাল মুখো, \n\n" +
                "[১০১:০০৬] অতএব তখন যার (ভালকাজের)পাল্লা ভারী হবে, \n\n" +
                "[১০১:০০৭] সে আনন্দময় সন্তোষজনক অবস্থানে থাকবে। \n\n" +
                "[১০১:০০৮] কিন্তু যার পাল্লা হালকা হবে, \n\n" +
                "[১০১:০০৯] পরিণামে তার জননী হবে ‘হাভিয়া’ \n\n" +
                "[১০১:০১০] এবং কিসে আপনাকে অবহিত করবে যে এটি কী? \n\n" +
                "[১০১:০১১] এটি একটি লেলিহান আগুন । \n\n");
        editor.putString("100","পরিচ্ছেদ ১০০.দৃশ্যঃ অনামিকা(সূরা আল-আদিয়াত The Anonymous) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ১২ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ১০০:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ১০০:০০১] শপথ কুয়াশাচ্ছন্ন অনামিকার, \n\n" +
                " ১০০:০০২] এবং পিছনে নিন্দাকারীর, \n\n" +
                " ১০০:০০৩] এবং প্রভাতে ছোল বদলকারী ধর্ষকের(আততায়ীর), \n\n" +
                " ১০০:০০৪] এবং যারা(নারীদের) অবৈধ গর্ভধারণ নিশ্পন্ন করে, \n\n" +
                " ১০০:০০৫] এবং তারা জনসমাবেশের মধ্যে মিশে যায়। \n\n" +
                " ১০০:০০৬] নিশ্চই মানবজাতি তার ক্রমবিকাশকের প্রতি বড়ই অকৃতজ্ঞ। \n\n" +
                " ১০০:০০৭] এবং নিশ্চই সে (নিজ আচরণে) এর উপর সাক্ষী। \n\n" +
                " ১০০:০০৮] এবং নিশ্চই সে নিজের লাভের প্রতি অতি মাত্রায় অন্ধ। \n\n" +
                " ১০০:০০৯] তবে সে কি জানে না যে, কবরে যা আছে তা যখন উঠান হবে, \n\n" +
                " ১০০:০১০] এবং তার অন্তরে যা কিছু(গোপন) আছে তা বের করে আনা হবে? \n\n" +
                " ১০০:০১১] নিশ্চই সেদিন তাদের ক্রমবিকাশক তাদের সম্বন্ধে সম্পূর্ণরূপে অবহিত হবেন।");
        editor.putString("99","পরিচ্ছেদ ০৯৯.দৃশ্যঃ জাগ্রত করণ(সূরা আয-যিলযাল The excite) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহসহ এতে ৯ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৯৯:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৯৯:০০১] যখন পৃথিবী নিজ জাগরণে জাগ্রত হবে \n\n" +
                " ০৯৯:০০২] এবং পৃথিবী তার বোঝা(গোপন সংবাদ) বের করে দিবে \n\n" +
                " ০৯৯:০০৩] এবং মানবজাতি বলবে এর কী হল? \n\n" +
                " ০৯৯:০০৪] সেদিন পৃথিবী তার যাবতীয় সংবাদ প্রকাশ করবে(বই-পত্র, সংবাদপত্র, রেডিও-টিভি, ইন্টার্নেট-ফেসবুক, তথ্য প্রযূক্তির মাধ্যমে) \n\n" +
                " ০৯৯:০০৫] কেননা আপনার ক্রমবিকাশক পৃথিবীর কাছে ওহী করবেন \n\n" +
                " ০৯৯:০০৬] সেদিন মানুষ গ্রুপে গ্রুপে বের হবে যেন তারা কী করছে দেখান যায় \n\n" +
                " ০৯৯:০০৭] সেদিন কোনও ব্যক্তি বিন্দু পরিমান ভালকাজ করলেও সেটা দেখবে \n\n" +
                " ০৯৯:০০৮] এবং কোনও ব্যক্তি বিন্দু পরিমান মন্দকাজ করলেও সেটা দেখবে");
        editor.putString("98","পরিচ্ছেদ ০৯৮.দৃশ্যঃ সুস্পষ্ট প্রমাণ্য তথ্য(সূরা আল বাইয়্যেনাহ্ The Clear Evidence) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৯ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৯৮:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৯৮:০০১] (পূর্ব)ঐশী-গ্রন্থধারী ও পৃথকসত্তা কল্পনাকারীদের(মুশরিকদের) মধ্যে যারা আল্লাহর এককসত্তাকে অস্বীকার করেছে, তারা অস্বীকৃতি থেকে বিরত হওয়ার পাত্র ছিল না যতক্ষণ পর্যন্ত না তাদের কাছে সুস্পষ্ট প্রমাণ্য তথ্য আসত- \n\n" +
                " ০৯৮:০০২] আল্লাহর তরফ থেকে, এক রাসূল(কুরআন), যে দুষণমুক্ত পুস্তকগুলো আবৃত্তি করে চলেছে, \n\n" +
                " ০৯৮:০০৩] যার মধ্যে উচ্চমানের নৈতিক গুণ সম্পন্ন গ্রন্থগুলো আছে। \n\n" +
                " ০৯৮:০০৪] এবং যারা গ্রন্থের অধিকারী হয়েছে, তারা তাদের কাছে সুস্পষ্ট প্রমাণ্য তথ্য আসার পর ছাড়া বিভিন্ন দলে(ফিরকায়) বিভক্ত হয় নাই। \n\n" +
                " ০৯৮:০০৫] এবং তাদেরকে এছাড়া আদেশ দেয়া হয় নাই, তারা শুধু আল্লাহরই সেবাকর্ম(ইবাদত) করবে, তাঁরই জন্য, বিশুদ্ধ জীবন-বিধানের মাধমে, একনিষ্ঠ ভাবে, এবং মানুষে-মানুষে ভালবাসা(সালাত) স্থাপন করবে এবং (দরিদ্র-দুস্থদের এককভাবে খাদ্য ও বস্ত্র দান এবং দারিদ্রদূরিকরণে সম্মিলিতভাবে অর্থ দানের মাধ্যমে) শুদ্ধতা অর্জন করবে এবং এটিই উচ্চমানের নৈতিক গুণ সম্পন্ন-চিরস্থায়ী জীবন-বিধান, \n\n" +
                " ০৯৮:০০৬] নিশ্চই (পূর্ব)ঐশী-গ্রন্থধারী ও পৃথকসত্তা কল্পনাকারীদের (মুশরিকদের) মধ্যে যারা আল্লাহর এককসত্তাকে অস্বীকার করেছে, তারা অনুতাপস্থলের আগুনে থাকবে- তারা সেখানে দীর্ঘস্থায়ী হবে। এরাই তারা, যারা সৃষ্টির মধ্যে নিকৃষ্টতম। \n\n" +
                " ০৯৮:০০৭] নিশ্চই যারা আল্লাহকে এককসত্তা মেনে নিয়েছে এবং ভালকাজ করেছে- এরাই তারা, যারা সৃষ্টির মধ্যে উৎকৃষ্টতম। \n\n" +
                " ০৯৮:০০৮] তাদের পুরস্কার তাদের ক্রমবিকাশকের কাছে- চিরস্থায়ী জান্নাতগুলো, যেগুলোর তলদেশ দিয়ে অব্যাহত পানির সরবরাহ থাকবে, সেখানে তারা চিরকাল স্থায়ীভাবে বাস করবে। আল্লাহ তাদের প্রতি সন্তুষ্ট হয়েছেন এবং তারাও তাঁর প্রতি সন্তুষ্ট। এটি সেই ব্যক্তির জন্য যে তার ক্রমবিকাশকের প্রতি সংকুচিত । \n\n" +
                "</string>");
        editor.putString("97","পরিচ্ছেদ ০৯৭.দৃশ্যঃ পরিমিত-পরিমাপ নিরুপন(সূরা আল কাদর The Dimensional measurement) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৬ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৯৭:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৯৭:০০১] নিশ্চই এ গ্রন্থ(কুরআন) অবতারিত হয়েছে পরিমিত-পরিমাপ নিরুপনের রজনীতে \n\n" +
                " ০৯৭:০০২] আপনি কি জানেন পরিমিত-পরিমাপ নিরুপনের রজনী কী????? \n\n" +
                " ০৯৭:০০৩] পরিমিত-পরিমাপ নিরুপনের রজনী এক হাজার মাসের চেয়ে উত্তম কল্যানের(নতুন বিজ্ঞানের জ্ঞান) প্রকাশক \n\n" +
                " ০৯৭:০০৪] এ রজনীতে অবতরণ করে (প্রহরী)ফেরেস্তারা এবং কুরআন-নভোযান, তাদের ক্রমবিকাশকের অনুমতিতে, সকল বিষয়ের বিজ্ঞান-বানী সহ \n\n" +
                " ০৯৭:০০৫] সেখানে পরম শান্তি বিরাজিত হয়, ঊশার উদ্ভব পর্যন্ত");
        editor.putString("96","পরিচ্ছেদ ০৯৬.দৃশ্যঃ ঝুলন্ত(সূরা আল-আলাক The hang up) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ২০ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৯৬:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৯৬:০০১] আপনি পড়ালেখা করুন, আপনার ক্রমবিকাশকের সৌজন্যে যিনি সৃষ্টি করেছেন, \n\n" +
                " ০৯৬:০০২] যিনি সৃষ্টি করেছেন মানবজাতিকে (জরায়ুতে)ঝুলন্ত রেখে। \n\n" +
                " ০৯৬:০০৩] আপনি পড়ালেখা করুন, কেননা আপনার ক্রমবিকাশক পরম সম্মানিত, \n\n" +
                " ০৯৬:০০৪] যিনি কলম দিয়ে শিক্ষা দেন, \n\n" +
                " ০৯৬:০০৫] যিনি শিক্ষা দেন মানবজাতিকে সেসব (বিজ্ঞান) যা সে জানত না। \n\n" +
                " ০৯৬:০০৬] কখনও নয়, মানবজাতি অবশ্যই বিপথগামী, \n\n" +
                " ০৯৬:০০৭] কারণ সে নিজেকে অভাব মৃক্ত মনে করে। \n\n" +
                " ০৯৬:০০৮] নিশ্চই আপনার ক্রমবিকাশকের কাছেই প্রত্যাবর্তন, \n\n" +
                " ০৯৬:০০৯] আপনি কি তাকে দেখেছেন যে বাধাদান করে ? \n\n" +
                " ০৯৬:০১০] (আমাদের) এক কর্মী(বান্দা) যখন ভালবাসা (সালাত) স্থাপন করে ? \n\n" +
                " ০৯৬:০১১] আপনি কি দেখেছেন, যদি (সে কর্মী) সুপথ প্রাপ্তির নির্দেশনার উপর অধিষ্ঠিত থাকে, \n\n" +
                " ০৯৬:০১২] অথবা সে সচেতনতায় অধিষ্ঠিত থাকে। \n\n" +
                " ০৯৬:০১৩] আপনি কি দেখেছেন, যদি সে(বাধাদানকারী) মিথ্যা প্রতিপন্ন করে এবং পৃষ্ঠ প্রদর্শন করে? \n\n" +
                " ০৯৬:০১৪] সে কি জানে না, নিশ্চই আল্লাহ(সব কিছু) দেখছেন? \n\n" +
                " ০৯৬:০১৫] কখনও নয়, যদি সে বিরত না হয়, তাহলে আমরা অবশ্যই তার কপালের চুলেরগোছা ধরে হেঁচড়াবো- \n\n" +
                " ০৯৬:০১৬] মিথ্যাবাদী, পাপাচারীর-কপালের চুলেরগোছা । \n\n" +
                " ০৯৬:০১৭] সুতরাং সে তার পরিষদকে আহ্বান করুক। \n\n" +
                " ০৯৬:০১৮] আমরাও নির্যাতক (ফেরেস্তা)দের আহ্বান করব। \n\n" +
                " ০৯৬:০১৯] কখনও নয়, আপনি এমন ব্যক্তির বাধ্য হবেন না, এবং আনুগত্যও করবেন না এবং নিকটবর্তিও (খাতিরেরও) হবেন না। \n\n" +
                "</string>");
        editor.putString("95","পরিচ্ছেদ ০৯৫.দৃশ্যঃ ডুমুর(সূরা আত-তীন The fig) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৯ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৯৫:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৯৫:০০১] বলছি ডুমুর এবং জলপাইয়ের কথা, \n\n" +
                " ০৯৫:০০২] এবং সিনাই পর্বতের, \n\n" +
                " ০৯৫:০০৩] এবং এই নিরাপদ শহরের, \n\n" +
                " ০৯৫:০০৪] নিশ্চই আমরা মানবজাতিকে সর্বোৎকৃষ্ট উপাদানে সৃষ্টি করেছি। \n\n" +
                " ০৯৫:০০৫] অতঃপর(মন্দকাজ করায়) আমরা তাকে হীন থেকে হীনতম স্তরে নামিয়ে দেই, \n\n" +
                " ০৯৫:০০৬] সেসব লোক ছাড়া, যারা আল্লাহকে এককসত্তা মেনে নেয় এবং ভালকাজ করে, অতএব তাদের জন্য রয়েছে অফুরন্ত প্রতিফল। \n\n" +
                " ০৯৫:০০৭] অতএব, এরপরও জীবন-বিধান সম্বন্ধে আপনাকে কিভাবে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৯৫:০০৮] আল্লাহ কি সকল বিচারকের মধ্যে শ্রেষ্টতম বিচারক নন?");
        editor.putString("94","পরিচ্ছেদ ০৯৪ দৃশ্যঃ সম্প্রসারণ(সুরা ইনশিরাহ The expansion) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ ইহাতে ৯ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৯৪:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৯৪:০০১] আমরা কি আপনার বক্ষকে(সাহসকে) সম্প্রসারিত করে দেই নাই? \n\n" +
                " ০৯৪:০০২] এবং আপনার (দুঃশ্চিন্তার)বোঝা আপনার (কাঁধ)থেকে অপসারণ করে দিই নাই? \n\n" +
                " ০৯৪:০০৩] যার চাপে আপনার পিঠ ভেঙ্গে যাচ্ছিল (যে, কিকরে জীবন-বিধান প্রতিষ্ঠা হবে) \n\n" +
                " ০৯৪:০০৪] আমরা আপনার স্মারক-বানী(কুরআন)কে উচ্চমর্যাদা দান ও সম্মনীত করেছি \n\n" +
                " ০৯৪:০০৫] অতএব, অবশ্যই কষ্টকাঠিন্য সহযসাধ্যতার ব্যাস্তানুপাতিক \n\n" +
                " ০৯৪:০০৬] অবশ্যই কষ্টকাঠিন্য সহযসাধ্যতার ব্যাস্তানুপাতিক (পরিশ্রম বাড়াতে সময় কমছে তাই ব্যাস্তানুপাতিক the time taken for a journey is inversely proportional to the speed of travel) \n\n" +
                " ০৯৪:০০৭] সুতরাং যখন আপনার অবসর হয় তখন আপনি (কঠিন পরিশ্রম করে) প্রতিষ্ঠা (setup, install, constitute) করতে থাকুন \n\n" +
                " ০৯৪:০০৮] এবং আপনার ক্রমবিকাশকের প্রতি আকাঙ্খিত হোন");
        editor.putString("93","পরিচ্ছেদ ০৯৩ দৃশ্যঃ পূর্বাহ্ন(সুরা আদ-দোহা The forenoon) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ১২আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৯৩:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৯৩:০০১] বলছি পূর্বাহ্নকালীন সূর্য-কিরণের কথা। \n\n" +
                " ০৯৩:০০২] বলছি রাতের কথা, যখন এটি নিঝুম-নিস্তব্ধ অন্ধকারে ঢেকে থাকে, \n\n" +
                " ০৯৩:০০৩] আপনার ক্রমবিকাশক আপনাকে পরিত্যাগ করেন নাই এবং (আপনাকে) বঞ্চিতও করেন নাই। \n\n" +
                " ০৯৩:০০৪] এবং আপনার ভবিষ্যৎ আপনার পূর্ববতী অবস্থা থেকে উৎকৃষ্টতর হবে। \n\n" +
                " ০৯৩:০০৫] এবং আপনার ক্রমবিকাশক শীঘ্রই আপনাকে(সবকিছু) দান করবেন যাতে আপনি সন্তুষ্ট হয়ে যাবেন। \n\n" +
                " ০৯৩:০০৬] তিনি কি আপনাকে এতীম পান নাই এবং (নিজ রহমতের) ছায়াতলে আশ্রয় দেন নাই? \n\n" +
                " ০৯৩:০০৭] এবং তিনি আপনাকে গোলকধাঁধাঁয় দীর্ঘ(১০রাত্রী) পরিক্রমারত পেয়েছিলেন এবং তিনি \n\n" +
                "আপনাকে সুপথ প্রাপ্তির নির্দেশনা(কুরআন) দান করেছিলেন(এক জোড় ও বেজোড় রাতে)। \n\n" +
                " ০৯৩:০০৮] এবং তিনি আপনাকে অভাব-গ্রস্থ পেয়েছিলেন এবং তিনি আপনাকে সম্পদশালী করেছেন। \n\n" +
                " ০৯৩:০০৯] অতএব যে কোন অনাথ-এতীম হোক, আপনি তার সাথে কঠোরতা করবেন না, \n\n" +
                " ০৯৩:০১০] এবং যে কোন প্রার্থীই হোক, আপনি তাকে তিরস্কার করবেন না, \n\n" +
                " ০৯৩:০১১] এবং তাই আপনি আপনার ক্রমবিকাশকের যে সকল পুরস্কার আছে তা প্রকাশ করতে থাকুন। \n\n" +
                "শব্দার্থঃ  سجو] নিঝুম-নিস্তব্ধ অন্ধকারে ঢাকা");
        editor.putString("92","পরিচ্ছেদ ০৯২.দৃশ্যঃ রাত্রি(সূরা আল-লাইল The night) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ২২ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৯২:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৯২:০০১] বলছি রাত্রির কথা, যখন এটি নিষ্প্রভ হয়, \n\n" +
                " ০৯২:০০২] এবং দিবসের কথা, যখন এটি আলোকোদ্ভাসিত হয়, \n\n" +
                " ০৯২:০০৩] এবং তাঁর কথা, যিনি নর এবং নারী সৃষ্টি করেছেন, \n\n" +
                " ০৯২:০০৪] নিশ্চই তোমাদের প্রচেষ্টা বিচিত্র। \n\n" +
                " ০৯২:০০৫] অতএব, যে দান করেছে এবং সচেতনতা অবলম্বন করেছে, \n\n" +
                " ০৯২:০০৬] এবং সত্যায়ন করেছে উত্তম বিষয়ের, \n\n" +
                " ০৯২:০০৭] আমরা অবশ্যই তার জন্য (তার কাঙ্খিত সঠিকপথ) সহজতর করে দিব, \n\n" +
                " ০৯২:০০৮] কিন্তু যে কৃপণাতা করেছে এবং ঐশ্বর্যশালী থেকেছে, \n\n" +
                " ০৯২:০০৯] এবং যে উত্তম বিষয়কে মিথ্যা প্রতিপন্ন করেছে, \n\n" +
                " ০৯২:০১০] সেক্ষেত্রে অচিরেই আমরা তার জন্য (তার কাঙ্খিত ভুলপথ) সহজতর করে দিব। \n\n" +
                " ০৯২:০১১] এবং তার ধন-সম্পদ তার উপকার করতে ব্যার্থ হবে। \n\n" +
                " ০৯২:০১২] নিশ্চই সুপথ-প্রাপ্তির-নির্দেশনা দানের দায়িত্ব আমাদের উপর রয়েছে। \n\n" +
                " ০৯২:০১৩] এবং নিশ্চই পরকাল ও পূর্বকাল আমাদেরই আয়ত্বাধীন। \n\n" +
                " ০৯২:০১৪] অতএব আমি তোমাদেরকে সতর্ক করছি শিখাবিস্তার করে জ্বলা আগুন(বিভিন্নমুখি অনুশোচনা) থেকে \n\n" +
                " ০৯২:০১৫] চরম অসুবিধাগ্রস্থ ব্যক্তি ছাড়া অন্য কেউই তাতে জ্বলবে না, \n\n" +
                " ০৯২:০১৬] যে (সত্যকে)মিথ্যা প্রতিপন্ন করেছে এবং পৃষ্ঠপ্রদর্শন করেছে। \n\n" +
                " ০৯২:০১৭] কিন্তু সচেতনদেরকে তা থেকে অবশ্যই দূরে রাখা হবে, \n\n" +
                " ০৯২:০১৮] যে নিজ সম্পদকে(দরিদ্রদেরকে এককভাবে অন্ন ও বস্ত্র দান এবং দারিদ্রদূরিকরণে সম্মিলিতভাবে দান করতে) ব্যয় করে যেন সে শুদ্ধতা লাভ করতে পারে, \n\n" +
                " ০৯২:০১৯] এবং তার কাছে কারও পাওনা কোন অনুগ্রহ নাই যা পরিশোধযোগ্য , \n\n" +
                " ০৯২:০২০] তার মহান ক্রমবিকাশকের নৈতিক সমর্থন চাওয়া ছাড়া। \n\n" +
                " ০৯২:০২১] এবং তিনি অবশ্যই(তার প্রতি) সন্তুষ্ট হবেন।");
        editor.putString("91","পরিচ্ছেদ ০৯১ দৃশ্যঃ সূর্য(সুরা আশ-শামস্ The Sun) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ১৬ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৯১:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৯১:০০১] এবং বলছি সূর্যের কথা এবং এর প্রাতঃকালিন কীরণের \n\n" +
                " ০৯১:০০২] এবং চন্দ্রের কথা যখন এটি (সূর্যের) অনুগমন করে \n\n" +
                " ০৯১:০০৩] এবং দিবসের যখন এটি (সূর্যকে) প্রকাশ করে \n\n" +
                " ০৯১:০০৪] এবং রাত্রির যখন এটি (সূর্যকে) আচ্ছন্ন করে \n\n" +
                " ০৯১:০০৫] এবং বায়ুমণ্ডলের এবং যিনি এটিকে(বিষ্ময়কর ভাবে) সুগঠিত করেছেন \n\n" +
                " ০৯১:০০৬] এবং পৃথিবীর এবং যিনি এটিকে(কোটি কোটি সংখ্যায়) সুবিস্তৃতি দান করেছেন \n\n" +
                " ০৯১:০০৭] এবং প্রানশীল মানব-দেহের এবং যিনি(আল্লাহ) এটিকে সমতাপূর্ণ-লোমহীন করেছেন \n\n" +
                " ০৯১:০০৮] অতঃপর তিনি এটির প্রতি প্রকাশ করেছেন এর মন্দপথ এবং সচেতনতার পথ \n\n" +
                " ০৯১:০০৯] সুতরাং সে অবশ্যই সফল হয়েছে যে এটিকে (দরিদ্রকে অন্ন ও বস্ত্র দান এবং দারিদ্রদূরিকরণে সম্মিলিত দান করে)বিশুদ্ধ করেছে \n\n" +
                " ০৯১:০১০] এবং সে অকৃতকার্য হয়েছে যে এটিকে শুধুই কবর দিয়েছে । \n\n" +
                " ০৯১:০১১] সামুদ জাতি অবাধ্যতা বশতঃ তাকে(রাসুলকে) মিথ্যা প্রতিপন্ন করেছিল \n\n" +
                " ০৯১:০১২] যখন তাদের মধ্যে সবচেয়ে কঠিন লোকটি তৎপর হয়ে উঠেছিল। \n\n" +
                " ০৯১:০১৩] তখন তাদেরকে আল্লাহর রাসুল বলল, \"সাবধান হও, আল্লাহর উষ্ট্রী সম্বন্ধে এবং তার পনি পান করা সম্বন্ধে\" \n\n" +
                " ০৯১:০১৪] কিন্তু তারা তাকে মিথ্যা প্রতিপন্ন করল এবং উষ্ট্রীর হাঁটুর রগ কেটে ফেলল, \n\n" +
                "ফলে তাদের ক্রমবিকাশক তাদের পাপের দরুন তাদেরকে নিঃশেষে ধ্বংস করে দিলেন এবং তাদেরকে(ভূমিতে) একাকার করে দিলেন। \n\n" +
                " ০৯১:০১৫] এবং তিনি তাদের ভবিষ্যৎ প্রজন্ম সম্বন্ধে কোন ইতস্ততই করলেন না");
        editor.putString("90","পরিচ্ছেদ ০৯০. দৃশ্যঃ নগরী (সূরা আল-বালাদ The city) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ২১ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৯০:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৯০:০০১] না; বলছি এ নগরীর কথা- \n\n" +
                " ০৯০:০০২] এবং আপনি অবশ্যই এ নগরীতে অবতরণ করবেন \n\n" +
                " ০৯০:০০৩] এবং বলছি জন্মদাতার কথা এবং প্রজন্মের \n\n" +
                " ০৯০:০০৪] নিশ্চই আমরা মানবজাতিকে শ্রমসহিষ্ণু করে সৃষ্টি করেছি \n\n" +
                " ০৯০:০০৫] সে কি মনে করে, কেউ তার উপর আদৌ ক্ষমতাবান হবে না? \n\n" +
                " ০৯০:০০৬] সে বলে, \"আমি প্রচুর সম্পদ বিনাশ করেছি।\" \n\n" +
                " ০৯০:০০৭] সে কি মনে করে, কেউ তাকে দেখে না? \n\n" +
                " ০৯০:০০৮] আমরা কি তার জন্যে সৃষ্টি করি নাই দুটি চোখ? \n\n" +
                " ০৯০:০০৯] এবং একটি জিহ্বা এবং দুটি ঠোঁট? \n\n" +
                " ০৯০:০১০] এবং আমরা তাকে দুটি(ভাল ও মন্দ) পথেরই নির্দেশনা দিয়েছি \n\n" +
                " ০৯০:০১১] তথাপি সে ****উচ্চশিখরে আরোহন****করার জন্য প্রানপন চেষ্টা করে নাই \n\n" +
                " ০৯০:০১২] এবং কিসে আপনাকে অবহিত করবে যে উচ্চশিখর(এ আরোহনের উপায়) কী? \n\n" +
                " ০৯০:০১৩] দুস্থ-অসহায়-সর্বহারাদের পক্ষে উচ্চ-কন্ঠ হওয়া(চোখ-জিহ্বা-ঠোঁট ব্যবহার করে) \n\n" +
                " ০৯০:০১৪] অথবা চরম অনাহারের দিনে অন্ন দান করা \n\n" +
                " ০৯০:০১৫] নিকটাত্মিয় অনাথ-এতিমকে অন্ন দান করা \n\n" +
                " ০৯০:০১৬] অথবা ভূলুন্ঠিত দরিদ্রকে অন্ন দান করা \n\n" +
                " ০৯০:০১৭] অতঃপর সে ঐ সকল লোকের অন্তর্ভূক্ত হয় যারা আল্লাহকে এককসত্তা মেনে নেয় ও পরস্পরকে ধৈর্য ধারণে আদেশ-উপদেশ দেয় এবং (দুস্থ-অসহায়-সর্বহারাদের) দয়া করার জন্য পরস্পরকে আদেশ-উপদেশ দেয় \n\n" +
                " ০৯০:০১৮] এরাই তারা, যারা ডান দিকের লোক \n\n" +
                " ০৯০:০১৯] এবং যারা আমাদের আয়াতগুলো অস্বীকার করে তারাই বামদিকের লোক \n\n" +
                " ০৯০:০২০] তাদের উপর নেমে আসছে অবরুদ্ধ আগুনের নিম্নচাপ");
        editor.putString("89","পরিচ্ছেদ ০৮৯. দৃশ্যঃ ভোর-টোয়াইলাইট(সূরা আল-ফাজর The dawn twilight) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৩১ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৮৯:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৮৯:০০১] বলছি ভোরের টোয়াইলাইটের(৭২মিনিট) কথা, \n\n" +
                " ০৮৯:০০২] এবং দশ রাত্রির(৫৯৪খৃ. সিদরাতুল মুনতাহায়), \n\n" +
                " ০৮৯:০০৩] এবং এক জোড় ও বেজোড় তারিখের(জিবরাইলের সাথে প্রথম সাক্ষাতে সম্পূর্ণ কুরআন নাজিল), \n\n" +
                " ০৮৯:০০৪] এবং এক রাত্রির যখন এটিকে পৃষ্ঠপোষকতা করা হয়েছিল । \n\n" +
                " ০৮৯:০০৫] এর মধ্যে বুদ্ধিমান লোকের জন্য কি কোন চিন্তার খোরাক নেই? \n\n" +
                " ০৮৯:০০৬] আপনি কি দেখেন নাই যে, আপনার ক্রমবিকাশক আদ জাতির সাথে কী ব্যবহার করেছেন- \n\n" +
                " ০৮৯:০০৭] রকেট উৎক্ষেপনের পারদর্শীদের সাথে? \n\n" +
                " ০৮৯:০০৮] তাদের সমতুল্য কোন জাতি অন্য কোনও দেশে সৃষ্টি করা হয় নাই- \n\n" +
                " ০৮৯:০০৯] এবং সামুদের সাথে, যারা উপত্যকায়(গৃহ নির্মাণের জন্য) পাথর কেটে নলাকার পিলার বানাতো, \n\n" +
                " ০৮৯:০১০] এবং ফেরাউনের সাথে, যে বিমান গুলোর অধিকারী, \n\n" +
                " ০৮৯:০১১] যারা দেশে বিদ্রোহ করেছিল(নৌবাহিনী মুসানবীর পক্ষ নিয়েছিল), \n\n" +
                " ০৮৯:০১২] এবং দেশে উপদ্রব বৃদ্ধি করেছিল(বিমান বাহিনী) । \n\n" +
                " ০৮৯:০১৩] যার ফলে আপনার ক্রমবিকাশক তাদের উপর দুঃখ-কষ্টের কশাঘাত ঢেলে দিলেন। \n\n" +
                " ০৮৯:০১৪] নিশ্চই আপনার ক্রমবিকাশক পর্যবেক্ষণে আছেন। \n\n" +
                " ০৮৯:০১৫] দেখুন, মানবজাতি কেমন! যখন তার ক্রমবিকাশক তাকে পরীক্ষা করেন এবং সম্মানে ও পুরস্কারে ভূষিত করেন তখন সে বলে, \"আমার ক্রমবিকাশক আমাকে সম্মানিত করেছেন।\" \n\n" +
                " ০৮৯:০১৬] কিন্তু যখন তিনি তাকে পরীক্ষা করেন এবং তার জন্য জীবিকা সংকীর্ণ করে দেন, তখন সে বলে, \"আমার ক্রমবিকাশক আমাকে অপমানিত করেছেন।\" \n\n" +
                " ০৮৯:০১৭] কখনও নয়, বরং তোমরা আসলে এতীমকে সম্মান কর না, \n\n" +
                " ০৮৯:০১৮] এবং গরিবদেরকে আহার দানে পরস্পরকে উৎসাহ দাও না, \n\n" +
                " ০৮৯:০১৯] এবং তোমরা(অন্য লোকের) ওয়ারিশি-সম্পত্তি একত্রিত করে অবাধে ভক্ষণ করে থাক, \n\n" +
                " ০৮৯:০২০] এবং তোমরা ধন-সম্পদ অত্যাধিক ভালবাস। \n\n" +
                " ০৮৯:০২১] কখনও নয়, যখন আশীর্বাদপুষ্ট পৃথিবী গুলোকে আশীর্বাদে আশীর্বাদে ভরে দেয়া হবে (পৃথিবীগুলোকে পূর্ণরূপে বিন্যাস্ত করে বেহেস্ত ঘোষণা দেওয়া হবে), \n\n" +
                " ০৮৯:০২২] এবং আপনার ক্রমবিকাশক প্রতিভাত হবেন এবং ফেরেস্তারাও পদমর্যাদার ভিত্তিতে সারি সারি দন্ডায়মান থাকবে(পরকালীন জীবন উদ্বোধন করার জন্য), \n\n" +
                " ০৮৯:০২৩] এবং সেদিন জাহান্নামকে বানিয়ে উপস্থিত করা হবে, সেদিন মানবজাতি উপদেশ গ্রহণ করবে, কিন্তু সে উপদেশ তার কী উপকারে আসবে? \n\n" +
                " ০৮৯:০২৪] সে বলবে, \"হায় আমার সর্বনাশ ! যদি আমি এ জীবনের জন্য(কিছু ভালকাজ) আগে পাঠাতাম\" \n\n" +
                " ০৮৯:০২৫] সুতরাং সেদিন কেউই তাঁর মত শাস্তি দিতে পারবে না। \n\n" +
                " ০৮৯:০২৬] এবং কেউই তাঁর বাঁধার মত বাঁধতে পারবে না। \n\n" +
                " ০৮৯:০২৭] হে দুশ্চিন্তামুক্ত প্রান! \n\n" +
                " ০৮৯:০২৮] আপনি আপনার ক্রমবিকাশকের দিকে প্রত্যাবর্তন করুন, এমতাবস্থায় যে, আপনি তাঁর প্রতি সুন্তুষ্ট এবং তিনিও আপনার প্রতি সন্তুষ্ট। \n\n" +
                " ০৮৯:০২৯] সুতরাং আপনি আমার বান্দাদের মধ্যে প্রবেশ করুন, \n\n" +
                " ০৮৯:০৩০] এবং প্রবেশ করুন আপনি আমার জান্নাতে।");
        editor.putString("88","পরিচ্ছেদ ০৮৮.দৃশ্যঃ আচ্ছন্নকারী(সূরা আল-গাশিয়া The overwhelming) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ ইহাতে ২৭ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৮৮:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৮৮:০০১] আপনার কাছে কি আচ্ছন্নকারীর(হাদিস রচনাকারীদের) সংবাদ পৌঁছেছে? \n\n" +
                " ০৮৮:০০২] সেদিন কতক মুখমন্ডল হবে অবনত, \n\n" +
                " ০৮৮:০০৩] কর্মক্লান্ত, পরিশ্রান্ত। \n\n" +
                " ০৮৮:০০৪] তারা প্রবেশ করবে প্রজ্বলিত আগুনে, \n\n" +
                " ০৮৮:০০৫] তাদেরকে পানি পান করানো হবে, ফুটন্ত ঝরণা থেকে। \n\n" +
                " ০৮৮:০০৬] শুষ্ক-তিক্ত-কন্টকময় ক্যাক্টাস(ফনিমনসা) ছাড়া তাদের জন্য কোন খাদ্য থাকবে না, \n\n" +
                " ০৮৮:০০৭] যা না পুষ্টি সাধন করবে এবং না ক্ষুধা নিবারণ করবে। \n\n" +
                " ০৮৮:০০৮] কতক মুখমন্ডল সেদিন হর্ষোৎফুল্ল হবে, \n\n" +
                " ০৮৮:০০৯] তারা তাদের চেষ্টা-সাধানার ফল লাভ করে সন্তুষ্ট থাকবে, \n\n" +
                " ০৮৮:০১০] সুউচ্চ জান্নাতে, \n\n" +
                " ০৮৮:০১১] সেখানে তারা কোন বৃথা কথা-বার্তা শুনবে না। \n\n" +
                " ০৮৮:০১২] সেখানে প্রবাহমান ঝরণা থাকবে, \n\n" +
                " ০৮৮:০১৩] সেখানে থাকবে সুউচ্চ আসন, \n\n" +
                " ০৮৮:০১৪] এবং সুসজ্জিত পানপাত্র, \n\n" +
                " ০৮৮:০১৫] এবং সারি সারি পালঙ্ক, \n\n" +
                " ০৮৮:০১৬] এবং বিছানো ম্যাট্রেস। \n\n" +
                " ০৮৮:০১৭] তারা কি গ্রহানুপুঞ্জের দিকে লক্ষ্য করে না, সেগুলিকে কিভাবে সৃষ্টি করা হয়েছে? \n\n" +
                " ০৮৮:০১৮] এবং বায়ুমণ্ডলের দিকে, কিভাবে এটিকে সুউচ্চ করা হয়েছে? \n\n" +
                " ০৮৮:০১৯] এবং পর্ব্বতগুলোর দিকে, কিভাবে এগুলোকে সংস্থাপিত করা হয়েছে? \n\n" +
                " ০৮৮:০২০] এবং পৃথিবীগুলোর দিকে, কিভাবে এগুলোকে সমানভাবে বিন্যাস্ত করা হয়েছে? \n\n" +
                " ০৮৮:০২১] সুতরাং আপনি উপদেশ দিতে থাকুন, কারণ আপনি কেবল একজন উপদেশদাতা মাত্র, \n\n" +
                " ০৮৮:০২২] আপনি তাদের জন্য জিম্মাদার নন। \n\n" +
                " ০৮৮:০২৩] কিন্তু যে পৃষ্ঠপ্রদর্শন করে এবং অস্বীকার করে, \n\n" +
                " ০৮৮:০২৪] তাহলে আল্লাহ তাকে সর্বপেক্ষা বড় দুঃখ-কষ্ট দিবেন। \n\n" +
                " ০৮৮:০২৫] নিশ্চই আমাদের দিকেই তাদের প্রত্যাবর্তন। \n\n" +
                " ০৮৮:০২৬] এবং নিশ্চই আমাদের উপরই তাদের হিসাব-নিকাশের দায়িত্ব।");
        editor.putString("87","পরিচ্ছেদ ০৮৭.দৃশ্যঃ মহামহিম(সূরা আল-আ’লা The Highest) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ২০ আয়াত এবং ১ রুকূ আছে। ০৮৭:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৮৭:০০১] আপনি আপনার মহামহিম ক্রমবিকাশকের সৌজন্যে আপনাকে প্রদত্ত দায়িত্ব পালন করুন, \n\n" +
                " ০৮৭:০০২] যিনি(মানুষকে) সৃষ্টি করেন এবং সমতাপূর্ণ-লোমহীন করেন। \n\n" +
                " ০৮৭:০০৩] এবং যিনি তার শক্তি-সামর্থ্য নিরূপণ করেন এবং তাকে সুপথ প্রাপ্তির নির্দেশনা দান করেন। \n\n" +
                " ০৮৭:০০৪] এবং যিনি তৃণ-লতা-চারণভূমি উদগত করেন, \n\n" +
                " ০৮৭:০০৫] অতঃপর সেটিকে কৃষ্ণবর্ণ আবর্জনায় পরিণত করেন। \n\n" +
                " ০৮৭:০০৬] অবশ্যই আমরা আপনাকে (বিজ্ঞান)শিক্ষা দিব এবং আপনি ভুলবেন না, \n\n" +
                " ০৮৭:০০৭] কেবল তা ছাড়া যা আল্লাহ চাইবেন, নিশ্চই তিনি জানেন যা প্রকাশ লাভ করেছে এবং যা এখনও অজানা(গুপ্ত)। \n\n" +
                " ০৮৭:০০৮] এবং অবশ্যই আমরা আপনার জন্য সব কিছুকে সহজ করে দিব। \n\n" +
                " ০৮৭:০০৯] সুতরাং আপনি স্মরণ করিয়ে দিতে থাকুন, যেন এ স্মারক-বানী(মানুষের জন্য) লাভজনক হয় । \n\n" +
                " ০৮৭:০১০] যে বুঝতে পারবে সে অবশ্যই স্মারক-বানী গ্রহণ করবে, \n\n" +
                " ০৮৭:০১১] কিন্তু যে এড়িয়ে চলবে সে একান্ত হতভাগ্য , \n\n" +
                " ০৮৭:০১২] যে (অনুশোচনার) বিশাল আগুনে দগ্ধ হবে। \n\n" +
                " ০৮৭:০১৩] এবং সে তাতে না মরবে এবং না বাঁচবে। \n\n" +
                " ০৮৭:০১৪] অবশ্যই সে সফল হবে যে নিজেকে শুদ্ধ করবে(দরিদ্রকে এককভাবে অন্নদান, বস্ত্রদান এবং দারিদ্র দূরিকরণে সম্মিলিত দান করার মাধ্যমে), \n\n" +
                " ০৮৭:০১৫] এবং তার ক্রমবিকাশকের মালিকানা স্মরণ করবে এবং ভালবাসা(সালাত) স্থাপন করবে। \n\n" +
                " ০৮৭:০১৬] কিন্তু তোমরা ইহকালীন জীবনকেই প্রাধান্য দিচ্ছ, \n\n" +
                " ০৮৭:০১৭] অথচ পরকালই অধিকতর উত্তম এবং স্থায়ী। \n\n" +
                " ০৮৭:০১৮] নিশ্চই এটি পূর্ববতী গ্রন্থগুলোতে আছে- \n\n" +
                " ০৮৭:০১৯] ইবরাহীম ও মূসার গ্রন্থে। \n\n" +
                "</string>");
        editor.putString("86","পরিচ্ছেদ ০৮৬.দৃশ্যঃ শুকতারা(সূরা আত-তারেক The Venus) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ১৮ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৮৬:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৮৬:০০১] মহাকাশের এবং শুকতারার কথা বলছি- \n\n" +
                " ০৮৬:০০২] এবং আপনাকে কিসে অবহিত করেছে, শুকতারা কী? \n\n" +
                " ০৮৬:০০৩] এটি অতীব তীক্ষ্ন আলোকিত গ্রহ- \n\n" +
                " \n\n" +
                " ০৮৬:০০৪] এমন কোন কোষ(উদ্ভিদকোষ, প্রানিকোষ) নেই যারা উপর কোন রক্ষাকারী(ফেরেস্তা) নেই। \n\n" +
                " ০৮৬:০০৫] সুতরাং আপনি দেখুন(গবেষণা করুন), মানবজাতিকে কী থেকে সৃষ্টি করা হয়েছে। \n\n" +
                " ০৮৬:০০৬] তাকে ডিম্বানু ও মাতৃ দুগ্ধ দিয়ে সৃষ্টি করা হয়েছে, \n\n" +
                " ০৮৬:০০৭] যা মাতৃ ডিম্বাশয় এবং পঞ্জরাস্থি(মাতৃস্তন)র মধ্য থেকে নির্গত হয়। \n\n" +
                " ০৮৬:০০৮] নিশ্চই তিনি তাকে পুনরায় ফিরিয়ে আনতে ক্ষমতাবান(আল্লাহ ভ্রূণ বানিয়ে রাখছেন), \n\n" +
                " ০৮৬:০০৯] যেদিন গুপ্ত রহস্যাবলী প্রকাশ করা হবে(ভ্রূণগুলো খুজে পাবে গভীর আগ্নেয়গীরি থেকে), \n\n" +
                " ০৮৬:০১০] তখন তার(মানুষের) কোনই ক্ষমতা থাকবে না এবং কোন সাহায্যকারীও থাকবে না। \n\n" +
                " ০৮৬:০১১] বায়ুমণ্ডলগুলো ফিরে আসবে(উপযোগী হবে), \n\n" +
                " ০৮৬:০১২] এবং পৃথিবীগুলো ফুটো করতে হবে(ভ্রূণগুলো খুজে বের করতে)। \n\n" +
                " ০৮৬:০১৩] নিশ্চই এটি(কুরআন) সমাধানমূলক বানী। \n\n" +
                " ০৮৬:০১৪] এবং এটি কোন খামখেয়ালী গ্রন্থ নয়। \n\n" +
                " ০৮৬:০১৫] নিশ্চই তারা ষড়যন্ত্র করবে –গভীর ষড়যন্ত্র, \n\n" +
                " ০৮৬:০১৬] এবং আমিও কৌশলোদ্ভাবন করব-উত্তম কৌশল। \n\n" +
                " ০৮৬:০১৭] সুতরাং আপনি অস্বীকারকারীদের অবকাশ দিন। অবকাশ দিন তাদেরকে কিছুকালের জন্য।");
        editor.putString("85","পরিচ্ছেদ ০৮৫.দৃশ্যঃ রাশিচক্র(সূরা আল-বুরূজ The Zodiac) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ২৩ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৮৫:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৮৫:০০১] গ্রহ-নক্ষত্রের কক্ষপথ(রাশিচক্র)-বিশিষ্ট মহাকাশের কথা বলছি, \n\n" +
                " ০৮৫:০০২] এবং প্রতিশ্রুত দিবসের, \n\n" +
                " ০৮৫:০০৩] এবং স্বীকৃত শহীদদের \n\n" +
                " ০৮৫:০০৪] ধ্বংস হল খাদ(\"groove\")গুলোর অধিবাসীরা(ইয়েমেনের ধর্মান্ধ ইহুদি রাজা)- \n\n" +
                " ০৮৫:০০৫] ইন্ধনপূর্ণ আগুনের খাদগুলো(নাজরানের একদল খৃস্টান-স্বীকারকারীকে আগুনে পুড়িয়ে হত্যা করে)- \n\n" +
                " ০৮৫:০০৬] যখন তারা খাদের উপর বসে ছিল, \n\n" +
                " ০৮৫:০০৭] এবং স্বীকারকারীদের সাথে যে ব্যবহার করেছিল সে বিষয়ে তারা প্রত্যক্ষ সাক্ষী ছিল। \n\n" +
                " ০৮৫:০০৮] এবং তারা(ইয়েমেনের ধর্মান্ধ ইহুদি রাজা) স্বীকারকারীদের সাথে শুধু এ কারণে শত্রুতা পোষণ করছিল যে, তারা ভালবাসাকনিকার মহাসমূদ্র, অতীব প্রশংসনীয় আল্লাহকে এককসত্বা মেনে নিয়েছিল \n\n" +
                " ০৮৫:০০৯] বায়ুমণ্ডলগুলো এবং পৃথিবীগুলোর আধিপত্য যাঁর, যেহেতু আল্লাহ প্রত্যেক বস্তুর উপর সাক্ষী। \n\n" +
                " ০৮৫:০১০] যারা স্বীকারকারী পুরুষদেরকে এবং স্বীকারকারী নারীদেরকে নির্যাতন করে এবং পরে তারা অনুশোচনা করে ফিরে আসে না, তাদের জন্য নিশ্চই অনুতাপস্থলের দুঃখ-কষ্ট রয়েছে। এবং তাদের জন্য রয়েছে (হৃদয়)দগ্ধকারী আগুনের যন্ত্রণা। \n\n" +
                " ০৮৫:০১১] নিশ্চই যারা আল্লাহকে এককসত্বা মেনে নেয় এবং ভালকাজ করে, তাদের জন্য রয়েছে এমন জান্নাতগুলো যার তলদেশ দিয়ে অব্যহত পানির সরবরাহ থাকবে, যেহেতু এটিই মহা-সফলতা। \n\n" +
                " ০৮৫:০১২] নিশ্চই আপনার ক্রমবিকাশকের লাঞ্ছনা অতি কঠোর। \n\n" +
                " ০৮৫:০১৩] নিশ্চই তিনিই উদ্ভব করেন এবং তিনিই পুনরাবৃত্তি(replicate) করেন, \n\n" +
                " ০৮৫:০১৪] এবং তিনিই অত্যন্ত সংশোধনশীল, স্নেহশীল, \n\n" +
                " ০৮৫:০১৫] পরম মার্জিত, পরমানুবন্ধনের মালিক, \n\n" +
                " ০৮৫:০১৬] তিনি যা চান তা ই করেন। \n\n" +
                " ০৮৫:০১৭] আপনার কাছে কি সৈন্যবাহিনীগুলোর বৃত্তান্ত পৌঁছেছে? \n\n" +
                " ০৮৫:০১৮] ফেরাউন ও সামূদের? \n\n" +
                " ০৮৫:০১৯] না, বরং যারা অস্বীকার করেছে তারা (সত্যকে) মিথ্যা প্রতিপন্ন করতে বদ্ধপরিকর। \n\n" +
                " ০৮৫:০২০] অথচ আল্লাহ তাদেরকে তাদের পিছন থেকে ঘিরে আছেন \n\n" +
                " ০৮৫:০২১] না, বরং এটি অতি গৌরবময় কুরআন(নভোযান), \n\n" +
                " ০৮৫:০২২] যা সুরক্ষিত ডকে(২৯.২২৯ ট্রিলিয়ন মাইল দূরে, সীয়েরা নক্ষত্রের কাছে) রয়েছে।");
        editor.putString("84","৮৪.দৃশ্যঃ মহাকাশ যাত্রা (সূরা আল-ইনশিকাক The travel to space) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ২৬ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৮৪:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৮৪:০০১] যখন বায়ুমণ্ডল ভেদ(বিদীর্ণ) করে মানুষ মহাকাশে যাবে, \n\n" +
                " ০৮৪:০০২] এবং এটি নিজ ক্রমবিকাশকের আদেশ শুনবে(পালন করবে) -যেহেতু এটাই তার কর্তব্য নির্ধারণ করা হয়েছে- \n\n" +
                " ০৮৪:০০৩] এবং যখন পৃথিবীগুলোকে সম্প্রসারিত(নতুন নতুন পৃথিবী আবিস্কার) করা হবে, \n\n" +
                " ০৮৪:০০৪] এবং যাকিছু পৃথিবীর মধ্যে আছে(মানুষ) সে তা বের করে দিবে এবং এটি খালি হয়ে যাবে, \n\n" +
                " ০৮৪:০০৫] এবং এটি নিজ ক্রমবিকাশকের আদেশ শুনবে(পালন করবে) -যেহেতু এটাই তার কর্তব্য নির্ধারণ করা হয়েছে- \n\n" +
                " ০৮৪:০০৬] হে বিনয়ী-গুণ বিশিষ্ট মানুষ ! নিশ্চই আপনাকে আপনার ক্রমবিকাশকের কাছে পৌঁছতে(মহাকাশ জয় করতে) কঠোর সাধনা করতে হবে, অতঃপর আপনি তাঁর সাক্ষাৎ লাভ করবেন। \n\n" +
                " ০৮৪:০০৭] অতএব যাকে তার কর্ম-গ্রন্থ(আমলনামা result sheet) তার ডান হাতে দেয়া হবে, \n\n" +
                " ০৮৪:০০৮] অতঃপর শিঘ্রই তার হিসাব(score) নেয়া হবে- সহজ হিসাব, \n\n" +
                " ০৮৪:০০৯] এবং সে নিজ পরিবারের কাছে উৎফুল্ল চিত্তে প্রত্যাবর্তন করবে। \n\n" +
                " ০৮৪:০১০] কিন্তু যাকে তার কর্ম-গ্রন্থ(আমলনামা result sheet) তার(তাকে উপুড় করে রেখে) পশ্চাৎ দিকে দেয়া হবে, \n\n" +
                " ০৮৪:০১১] সে শীঘ্রই ধ্বংসকে ডাকবে, \n\n" +
                " ০৮৪:০১২] এবং প্রজ্বলিত আগুনে দগ্ধ হবে (অনুতাপে কষ্ট পাবে)। \n\n" +
                " ০৮৪:০১৩] নিশ্চই(ইতোপূর্বে) সে নিজ পরিবারের কাছে উৎফুল্ল চিত্তে ছিল। \n\n" +
                " ০৮৪:০১৪] নিশ্চই সে ভেবেছিল, সে কখনও (পরকালীন জীবনে) ফিরবে না। \n\n" +
                " ০৮৪:০১৫] হ্যাঁ, নিশ্চই তার ক্রমবিকাশক তার সম্বন্ধে সর্বদ্রষ্টা ছিলেন। \n\n" +
                " ০৮৪:০১৬] কিন্তু না, আমি সন্ধ্যা-গগনের লোহিত আভার(সান্ধ-টোয়াইলাইটের) কথা বলছি, \n\n" +
                " ০৮৪:০১৭] এবং রাত্রির যা তাকে(সান্ধ-টোয়াইলাইটেকে) গুটিয়ে নেয়, \n\n" +
                " ০৮৪:০১৮] এবং চন্দ্রের যখন এটি পূর্ণতা প্রাপ্ত হয়(পূর্নিমা হয়), \n\n" +
                " ০৮৪:০১৯] নিশ্চই তোমরা(মহাকাশচারীরা) এক স্তর(গ্যালাক্সি) থেকে অন্য স্তরে(গ্যালাক্সিতে) আরোহণ করে অগ্রসর হবে। \n\n" +
                " ০৮৪:০২০] সুতরাং তাদের কী হয়েছে, যে তারা মেনে নিচ্ছে না? \n\n" +
                " ০৮৪:০২১] এবং যখন তাদের কাছে কুরআন পাঠ করা হয়, তখন তারা সেজদা করে না, \n\n" +
                " ০৮৪:০২২] পক্ষান্তরে অস্বীকারকারীরা(কুরআনকে) মিথ্যা প্রতিতন্ন করে। \n\n" +
                " ০৮৪:০২৩] এবং তারা(বিজ্ঞানের নতুন আবিস্কার) যা কিছু গোপন করছে আল্লাহ তা সর্বাধিক অবগত আছেন। \n\n" +
                " ০৮৪:০২৪] সুতরাং তাদেরকে যন্ত্রণাদায়ক দুঃখ-কষ্টের সুসংবাদ দিন- \n\n" +
                " ০৮৪:০২৫] কেবল তারা ছাড়া যারা আল্লাহর এককসত্তা মেনে নেয় এবং ভালকাজ করে, তাদের জন্য অফুরন্ত প্রতিদান রয়েছে।");
        editor.putString("83","পরিচ্ছেদ ০৮৩.দৃশ্যঃ প্রবঞ্চক-ঠক-জোচ্চোর(সূরা আল-মুতাফফেফীন The defrauder) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৩৭ আয়্ত এবং ১ রুকূ আছে। \n\n" +
                " ০৮৩:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৮৩:০০১] সর্বনাশ তাদের জন্য যারা ঠক-জোচ্চর অর্থাৎ মাপে কম দেয়, \n\n" +
                " ০৮৩:০০২] যারা অন্য লোকদের কাছ থেকে যখন কিছু আদায় করে নেয় তখন পূর্ণ পরিমাপে নেয়, \n\n" +
                " ০৮৩:০০৩] কিন্তু যখন তারা অন্যকে মেপে দেয় অথবা তাদেরকে ওজন করে দেয় তখন কম দেয়। \n\n" +
                " ০৮৩:০০৪] এ সকল লোক কি বিশ্বাস করে না, তাদেরকে পুনরুত্থিত করা হবে ? \n\n" +
                " ০৮৩:০০৫] এক মহান দিনে ? \n\n" +
                " ০৮৩:০০৬] যেদিন সকল মানুষ মহাবিশ্বের ক্রমবিকাশকের সামনে দন্ডায়মান থাকবে। \n\n" +
                " ০৮৩:০০৭] কখনও নয়, নিশ্চই দুষ্কৃতিপরায়ণদের কর্ম-তালিকা(আমল-নামা) ‘সিজ্জীনে’ থাকবে। \n\n" +
                " ০৮৩:০০৮] এবং আপনাকে কিসে অবহিত করবে যে ‘সিজ্জীন’ কী? \n\n" +
                " ০৮৩:০০৯] সেটি একটি লিখিত ডাইরী। \n\n" +
                " ০৮৩:০১০] সেদিন মিথ্যা প্রতিপন্নকারীদের জন্য সর্বনাশ \n\n" +
                " ০৮৩:০১১] যারা বিধান প্রতিষ্ঠার সময়কে মিথ্যা প্রতিপন্ন করে। \n\n" +
                " ০৮৩:০১২] আসলে কেবল সীমাতিক্রমকারী, চরম পাপিষ্ঠ ছাড়া কেউই এটিকে মিথ্যা প্রতিপন্ন করতে পারে না। \n\n" +
                " ০৮৩:০১৩] যখন তার কাছে আমাদের আয়াতগুলো আবৃত্তি করা হয় তখন সে বলে, \"প্রাচীন লোকদের কিসসা কাহিনী।\" \n\n" +
                " ০৮৩:০১৪] না, বরং তারা যা অর্জন করেছে তা তাদের মন-মগজ বিশেষত্বহীন বা নিষ্ক্রিয় করে দিয়েছে। \n\n" +
                " ০৮৩:০১৫] কখনও নয়, আসলে সেদিন তাদেরকে তাদের ক্রমবিকাশকের সাক্ষাৎ থেকে অবশ্যই আড়ালে রাখা হবে। \n\n" +
                " ০৮৩:০১৬] অতঃপর তারা নিশ্চই অনুতাপের আগুনে দগ্ধ হতে থাকবে, \n\n" +
                " ০৮৩:০১৭] অতঃপর তাদেরকে বলা হবে, \"এগুলো তা-ই যা তোমরা মিথ্যা প্রতিপন্ন করতে।\" \n\n" +
                " ০৮৩:০১৮] কখনও নয়, নিশ্চই সৎকর্মপরায়নদের কর্ম-তালিকা *ইল্লীয়্যুনে* আছে। \n\n" +
                " ০৮৩:০১৯] এবং আপনাকে কিসে অবহিত করবে যে ‘ইল্লীয়্যুন’ কী ? \n\n" +
                " ০৮৩:০২০] সেটি (অন্য)একটি লিখিত ডাইরী। \n\n" +
                " ০৮৩:০২১] নৈকট্য-প্রাপ্তরা(অগ্রবর্তি দলের সদস্যরা) তা প্রত্যক্ষ করবে। \n\n" +
                " ০৮৩:০২২] নিশ্চই সৎকর্মপরায়নরা পুরস্কারের মধ্যে অবস্থান করবে, \n\n" +
                " ০৮৩:০২৩] সুসজ্জিত পালংকের উপর বসে(চারদিক) অবলোকন করবে। \n\n" +
                " ০৮৩:০২৪] আপনি তাদের মুখমন্ডলে পুরস্কারের আনন্দ(সজীবতা) লক্ষ্য করবেন। \n\n" +
                " ০৮৩:০২৫] তাদেরকে মোহরাঙ্কিত(ব্র্যাণ্ডেড) বিশুদ্ধ মদ পান করানো হবে \n\n" +
                " ০৮৩:০২৬] সেগুলোর সীলমোহর হবে কম্ভরীত। সুতরাং উচ্চাকাঙ্খীরা এ বিষয়েই উচ্চাকাঙ্খা করুক- \n\n" +
                " ০৮৩:০২৭] এবং তাতে ‘তসনীম’ ঝরণার পানি মিশ্রিত থাকবে, \n\n" +
                " ০৮৩:০২৮] এমন এক ঝরণার, যা থেকে নৈকট্য-প্রাপ্তরা পান করবে। \n\n" +
                " ০৮৩:০২৯] নিশ্চই যারা অপরাধ করেছে, তারা তাদের সাথে হাসি-বিদ্রুপ করত, যারা আল্লাহকে এককসত্বা মেনে নিয়েছে, \n\n" +
                " ০৮৩:০৩০] এবং যখন তারা তাদের কাছ দিয়ে যাতায়াত করত, তখন তারা নিজেরা পরস্পর চোখ টিপা-টিপি করত, \n\n" +
                " ০৮৩:০৩১] এবং যখন তারা তাদের পরিবারের কাছে ফিরে আসত তখন উল্লাসের সাথে প্রত্যাবর্তন করত, \n\n" +
                " ০৮৩:০৩২] এবং যখন তারা তাদেরকে দেখত, তারা বলত, \"এরা নিশ্চই বিপথগামী।\" \n\n" +
                " ০৮৩:০৩৩] অথচ তাদেরকে তাদের উপর সংরক্ষক হিসেবে প্রেরণ করা হয় নাই। \n\n" +
                " ০৮৩:০৩৪] সুতরাং যারা আল্লাহকে এককসত্বা মেনে নিয়েছে তারা আজ অস্বীকারকারীদের সাথে হাসি ঠাট্টা করবে \n\n" +
                " ০৮৩:০৩৫] তারা সুসজ্জিত পালংকের উপর বসে(চারদিকে) অবলোকন করবে। \n\n" +
                " ০৮৩:০৩৬] (তারা একে অন্যকে বলবে) অস্বীকারকারীরা যা কিছু করত তারা কি তার পূর্ণ প্রতিফল পায় নাই?");
        editor.putString("82","০৮২.দৃশ্যঃ ছড়িয়ে দেয়া(সূরা ইনফিতার The disseminate) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহসহ এতে ২০ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৮২:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৮২:০০১] যখন বায়ুমণ্ডল গুলোকে ছড়িয়ে দেয়া হবে, \n\n" +
                " ০৮২:০০২] যখন (মানুষ)খাড়াভাবে(vertically অর্থাৎ রকেটে চড়ে) একে ডিঙ্গিয়ে যাবে, \n\n" +
                " ০৮২:০০৩] এবং যখন সমুদ্রের তলদেশ দিয়ে টানেল(ও সাবম্যারিন ক্যাবল স্থাপন) করা হবে, \n\n" +
                " ০৮২:০০৪] এবং যখন কবর গুলো খাড়াভাবে করা হবে, \n\n" +
                " ০৮২:০০৫] তখন প্রত্যেক প্রান জানতে পারবে, সে কী উপস্থাপন করেছে এবং কী পিছন ছেড়ে এসেছে। \n\n" +
                " ০৮২:০০৬] হে মানবজাতি! তোমাকে তোমার পরম দাতা ক্রমবিকাশক সম্বন্ধে কিসে প্রতারিত করেছে- \n\n" +
                " ০৮২:০০৭] যিনি তোমাকে সৃষ্টি করেছেন, অতঃপর তোমাকে সমতাপূর্ণ ও সমন্বিত করেছেন, \n\n" +
                " ০৮২:০০৮] যে কাঠামোতে তিনি চেয়েছেন, তোমাকে আকার দান করেছেন। \n\n" +
                " ০৮২:০০৯] না, বরং তোমরা জীবন-বিধানকে মিথ্যা প্রতিপন্ন করছ । \n\n" +
                " ০৮২:০১০] এবং নিশ্চই তোমাদের উপর সংরক্ষকরা নিযুক্ত আছে, \n\n" +
                " ০৮২:০১১] সম্মানিত লেখকরা, \n\n" +
                " ০৮২:০১২] তাঁরা সবকিছু জানেন যা তোমরা কর। \n\n" +
                " ০৮২:০১৩] নিশ্চই সৎকর্মপরায়নরা অনুগ্রহের মধ্যে থাকবে। \n\n" +
                " ০৮২:০১৪] এবং নিশ্চই অশ্লীল-অসচ্চরিত্র ব্যক্তি অনুতাপস্থলে থাকবে, \n\n" +
                " ০৮২:০১৫] বিধান প্রতিষ্ঠার দিনগুলোতে তারা অনুতাপে দগ্ধ হবে, \n\n" +
                " ০৮২:০১৬] তারা তা থেকে পালাতে পারবে না। \n\n" +
                " ০৮২:০১৭] এবং আপনাকে কিসে জানাবে যে, সে বিধান প্রতিষ্ঠার দিনগুলো কী ? \n\n" +
                " ০৮২:০১৮] পুনরায় বলি, আপনাকে কিসে জানাবে যে, সে বিধান প্রতিষ্ঠার দিনগুলো কী ? \n\n" +
                " ০৮২:০১৯] যেদিন কোন ব্যক্তি অন্য ব্যক্তির মোটেও উপকার করার ক্ষমতা রাখবে না, এবং সেদিন ****সকল আদেশের অধিকার একমাত্র আল্লাহরই**** থাকবে।");
        editor.putString("81","পরিচ্ছেদ ০৮১.দৃশ্যঃ আবর্তিত হত্তয়া(সূরা আত্ তাকভীর The gyrate) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৩০ আয়াত এবং ১ রুকূ আছে। \n\n" +
                " ০৮১:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৮১:০০১] যখন সূর্য আবর্তিত হয়(৮০ দিনে নিজ অক্ষে, ২০কোটি বছরে নিজ কক্ষপথে) , \n\n" +
                " ০৮১:০০২] এবং যখন নক্ষত্ররাজি নিষ্প্রভ হয়(বায়ুমণ্ডল ছাড়িয়ে মহাকাশে গেলেই), \n\n" +
                " ০৮১:০০৩] এবং যখন পর্বতের মত নভোযান গুলো চালিত করা হবে \n\n" +
                " ০৮১:০০৪] এবং যখন দশ মাসের গর্ভবতী উটনীগুলি বেকার পরিত্যক্ত হবে(যান্ত্রিক গাড়িঘোড়া চলবে বলে, উট উৎপাদন কাজে লাগবে না), \n\n" +
                " ০৮১:০০৫] এবং যখন বন্যজন্তুগুলিকে সমবেত করা হবে(চিড়িয়াখনা বানিয়ে), \n\n" +
                " ০৮১:০০৬] এবং যখন নদীগুলোতে বাঁধ দেয়া হবে, \n\n" +
                " ০৮১:০০৭] এবং যখন(বিভিন্ন জাতির) নারী-পুরুষদের (সামাজিক-যোগাযোগ, বিয়ে ও বন্ধুত্বের মাধ্যমে) একত্রিত করা হবে, \n\n" +
                " ০৮১:০০৮] এবং যখন জীবন্ত সমাধিস্থ বালিকা সম্বন্ধে জিজ্ঞাসা করা হবে- \n\n" +
                " ০৮১:০০৯] কী অপরাধে তাকে হত্যা করা হয়েছে? \n\n" +
                " ০৮১:০১০] এবং যখন পুস্তক-পুস্তিকা-ইন্টার্নেট(ব্যাপকভাবে) বিস্তৃত করা হবে, \n\n" +
                " ০৮১:০১১] এবং যখন বায়ুমণ্ডলের ঘর্ষণের বাধা তুলে ফেলা হবে (আয়নোস্ফিয়ারের ঘর্ষণ এড়িয়ে যাওয়ার আবরণ আবিস্কারের ফলে), \n\n" +
                " ০৮১:০১২] এবং যখন অনুতাপের মূল্য নির্ধারণ হবে(অনুতাপরতদের প্রার্থনা শুনা হবে), \n\n" +
                " ০৮১:০১৩] এবং যখন (পৃথিবীগুলোর)জান্নাত হওয়া নিকটবর্তী করা হবে, \n\n" +
                " ০৮১:০১৪] তখন প্রত্যেক প্রান জানবে কতটুকু(নুর) সে নিয়ে এসেছে । \n\n" +
                " ০৮১:০১৫] কিন্তু না, আমি বলছি পশ্চাদপসরণকারী ধুমকেতুদের কথা, \n\n" +
                " ০৮১:০১৬] যারা দ্রুতগতিতে সামনে চলে এবং লুকিয়ে পড়ে। \n\n" +
                " ০৮১:০১৭] এবং রাত্রির কথা বলছি যখন তা শেষ প্রহরে পৌঁছে, \n\n" +
                " ০৮১:০১৮] এবং প্রভাতের কথা বলছি যখন তা নিঃশ্বাস ফেলতে আরম্ভ করে, \n\n" +
                " ০৮১:০১৯] নিশ্চই এটি(কুরআন) এক সম্মানিত রসূলের(জিবরাইলের) বাণী \n\n" +
                " ০৮১:০২০] যে শক্তির অধিকারী(জিবর=শক্তি, ইল=আল্লাহ) এবং সৃষ্টির ভিত্তি নিউক্লিয়াসের অধিপতি(আল্লাহ)'র কাছে প্রতিষ্ঠিত, \n\n" +
                " ০৮১:০২১] অনুসরণ যোগ্য, তদুপরি বিশ্বস্ত। \n\n" +
                " ০৮১:০২২] এবং তোমাদের সাথী(মুহাম্মদ) উন্মাদ নন। \n\n" +
                " ০৮১:০২৩] নিশ্চই তিনি তাকে(জিবরাইল নভোযানকে) স্পষ্ট দিগন্তে দেখেছেন। \n\n" +
                " ০৮১:০২৪] সে অজানা বিষয় সম্পর্কে কৃপণ নয়। \n\n" +
                " ০৮১:০২৫] এবং এটি(কুরআন) বিতাড়িত শয়তানের কথা নয় (সালমান রুসদির উদ্দেশ্যে)। \n\n" +
                " ০৮১:০২৬] তবুও তোমরা কোথায় চলেছ? \n\n" +
                " ০৮১:০২৭] এটি মহাবিশ্বের জন্য এক উপদেশবাণী ছাড়া কিছু নয়- \n\n" +
                " ০৮১:০২৮] তার জন্য, যে তোমাদের মধ্য থেকে ঊর্ধগামী-সরল পথে চলতে চায়। \n\n" +
                " ০৮১:০২৯] যেহেতু তোমরা কিছুই চাইতে পার না, যদি না মহাবিশ্বের ক্রমবিকাশক আল্লাহ তা চান।");
        editor.putString("80","পরিচ্ছেদ ০৮০.দৃশ্যঃ ভ্রুকুঞ্চনকারী (সূরা আল-আবাসা The frown) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৪৩ আয়্ত এবং ১ রুকূ আছে। \n\n" +
                " ০৮০:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৮০:০০১] তিনি ভ্রুকুঞ্চিত করলেন কিন্তু তাকে গ্রহন করে নিলেন, \n\n" +
                " ০৮০:০০২] যেহেতু, অন্ধ লোকটি তাঁর কাছে আসলো, \n\n" +
                " ০৮০:০০৩] এবং কিসে আপনাকে অবহিত করবে, সে হয়তো (গরিবদের খাদ্য ও বস্ত্র দান এবং দারিদ্র দূরিকরণে সম্মিলিতভাবে দান করে) শুদ্ধতা অর্জন করবে, \n\n" +
                " ০৮০:০০৪] অথবা সে স্মরণকারী হবে এবং এ স্মারক-বানী তার উপকারে লাগবে? \n\n" +
                " ০৮০:০০৫] যে ব্যক্তি প্রয়োজনই মনে করে না, \n\n" +
                " ০৮০:০০৬] আপনি তার প্রতি মনযোগী হবেন ? \n\n" +
                " ০৮০:০০৭] অথচ তার শুদ্ধতা অর্জনের দায়ভার আপনার উপর বর্তায়ই না- \n\n" +
                " ০৮০:০০৮] কিন্তু যে ব্যক্তি আপনার কাছে দৌড়ে আসে, \n\n" +
                " ০৮০:০০৯] এবং সে বিনীত হয় , \n\n" +
                " ০৮০:০১০] তাহলে আপনি তার সাথে প্রসন্ন হবেন। \n\n" +
                " ০৮০:০১১] না, নিশ্চই এটি(কুরআন) একটি স্মারক-বানী \n\n" +
                " ০৮০:০১২] অতএব যার ইচ্ছা এটিকে স্মরণ করুক- \n\n" +
                " ০৮০:০১৩] এর কথা সম্মানিত গ্রন্থগুলোতে আছে, \n\n" +
                " ০৮০:০১৪] যা খালিহাতে লিখিত, অতি বিশুদ্ধচিত্ত \n\n" +
                " ০৮০:০১৫] লেখকদের হাতে লেখা সম্পন্ন, \n\n" +
                " ০৮০:০১৬] যারা সম্ভ্রান্ত, ন্যায্যতা প্রতিপাদন কারী। \n\n" +
                " ০৮০:০১৭] মানুষের জন্য পরিতাপ ! সে কতই না অকৃতজ্ঞ! \n\n" +
                " ০৮০:০১৮] তাকে কোন্ বস্তু থেকে সৃষ্টি করা হয়েছে? \n\n" +
                " ০৮০:০১৯] এক অতি-আনুবিক্ষণিক জননক্ষম কোষ থেকে তিনি তাকে সৃষ্টি করেন এবং পরিমিতভাবে সুগঠিত করেন, \n\n" +
                " ০৮০:০২০] অতঃপর তিনি তার জন্য পথগুলোকে সহয করে দেন, \n\n" +
                " ০৮০:০২১] অতঃপর তিনি তাকে মৃত্যু দান করেন এবং তাকে কবর দেন \n\n" +
                " ০৮০:০২২] অতঃপর যখন তিনি চাইবেন, তিনি তাকে পুনরুত্থিত করবেন। \n\n" +
                " ০৮০:০২৩] কখনই নয়, তিনি তাকে যে আদেশ দান করেছেন তা সে এ পর্যন্ত সম্পন্ন করে নাই। \n\n" +
                " ০৮০:০২৪] অতএব মানুষকে তার নিজের খাদ্যের দিকে লক্ষ্য করা উচিত, \n\n" +
                " ০৮০:০২৫] কিভাবে আমরা পানি বর্ষণ করি, প্রচুর বর্ষণে- \n\n" +
                " ০৮০:০২৬] অতঃপর আমরা পৃথিবীকে বিদীর্ণ করি, -যথাযথভাবে বিদীর্ণ, \n\n" +
                " ০৮০:০২৭] অতঃপর আমরা উৎপন্ন করি তাতে শস্য দানা, \n\n" +
                " ০৮০:০২৮] এবং আঙ্গুর এবং শাক-সবজি, \n\n" +
                " ০৮০:০২৯] এবং জলপাই ও খেজুর, \n\n" +
                " ০৮০:০৩০] এবং ঘন বাগানগুলো, \n\n" +
                " ০৮০:০৩১] এবং ফল-ফলাদি ও তৃণ-লতা, \n\n" +
                " ০৮০:০৩২] তোমাদের জন্য এবং তোমাদের চতুষ্পদ জন্তুদের জন্য সম্ভোগের সামগ্রী করে। \n\n" +
                " ০৮০:০৩৩] কিন্তু যখন কর্ণ বিদারী বিকট ধ্বনি আসবে, \n\n" +
                " ০৮০:০৩৪] সেদিন মানুষ পালাবে তার ভাই থেকেও, \n\n" +
                " ০৮০:০৩৫] এবং তার মাতা ও তার পিতা থেকেও, \n\n" +
                " ০৮০:০৩৬] এবং তার সঙ্গি-সাথী ও তার সন্তানদের থেকেও, \n\n" +
                " ০৮০:০৩৭] সেদিন তাদের প্রত্যেকের অবস্থা এমন হবে যে, তা তাকে অন্যদের সম্বন্ধে উদাসীন করে তুলবে। \n\n" +
                " ০৮০:০৩৮] সেদিন কিছু সংখ্যক মুখমন্ডল উজ্জুল হবে, \n\n" +
                " ০৮০:০৩৯] হাস্যোজ্জুল হর্ষোৎফুল্ল ঈদআনন্দে। \n\n" +
                " ০৮০:০৪০] এবং সেদিন কিছু সংখ্যক মুখমন্ডল হবে ধূলি-ধূসরিত, \n\n" +
                " ০৮০:০৪১] তাদেরকে অন্ধকার আচ্ছাদিত করে নিবে। \n\n" +
                " ০৮০:০৪২] এরাই হল নিজের পায়ে কুড়াল মারা অস্বীকারকারীরা।");
        editor.putString("79","০৭৯.দৃশ্যঃ উড্ডয়ন(সূরা আন-নাযে’আত taking off ) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৪৭ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৭৯:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৭৯:০০১] তাদের কথা বলছি যারা (বিমান থেকে আকাশে)নিক্ষিপ্ত হয়ে উড্ডয়নশীল হয়, \n\n" +
                " ০৭৯:০০২] এবং তাদের কথা যারা প্রফুল্লতার সাথে সক্রিয় হয়, \n\n" +
                " ০৭৯:০০৩] এবং তাদের কথা যারা মালার মত(হাত ধরাধরি করে) ত্বরিত গতিতে আকাশে সন্তরণ করে, \n\n" +
                " ০৭৯:০০৪] অতঃপর তারা প্রতিযোগীতায় দ্রুতবেগে(প্যারাসুট খুলে) আগে চলে যায়, \n\n" +
                " ০৭৯:০০৫] এবং তারা(উত্তমভাবে) কার্যাবলী পরিচালনা করে, \n\n" +
                " ০৭৯:০০৬] যেদিন একটি কলঙ্ক রটনা হবে, \n\n" +
                " ০৭৯:০০৭] তার পিছনে আরও কালিমা লেপন করা হবে। \n\n" +
                " ০৭৯:০০৮] সেদিন তার অন্তর ভয়ে কম্পমান হবে, \n\n" +
                " ০৭৯:০০৯] (এবং) তার দৃষ্টি থাকবে অবনত । \n\n" +
                " ০৭৯:০১০] তারা(অস্বীকারকারীরা) বলে, \"আমাদেরকে কি আগের অবস্থায় ফিরিয়ে নেয়া হবে? \n\n" +
                " ০৭৯:০১১] কী ! যখন আমরা পচা-গলা অস্থিপুঞ্জ হয়ে যাব তখনও ?\" \n\n" +
                " ০৭৯:০১২] তারা বলে, \"তাহলে এটি অত্যন্ত ক্ষতিকারক শত্রুতা \n\n" +
                " ০৭৯:০১৩] এবং এটি নিছক একটি ধমক মাত্র।\" \n\n" +
                " ০৭৯:০১৪] আহ ! যদি তারা জাগ্রত হোত। \n\n" +
                " ০৭৯:০১৫] আপনার কাছে কি মূসার বৃত্তান্ত পৌঁছেছে? \n\n" +
                " ০৭৯:০১৬] যখন তার ক্রমবিকাশক তাকে ‘তুওয়া’র পবিত্র উপত্যকায় ডেকেছিলেন, \n\n" +
                " ০৭৯:০১৭] (এবং নিদের্শ দিয়েছিলেনঃ) \"তুমি ফেরাউনের কাছে যাও, কেননা সে (আমার বিরুদ্ধে) বিদ্রোহ করেছে, \n\n" +
                " ০৭৯:০১৮] অতঃপর বল, \"তোমার কি ইচ্ছা আছে যে তুমি বিশুদ্ধ হও? \n\n" +
                " ০৭৯:০১৯] এবং আমি তোমাকে তোমার ক্রমবিকাশকের দিকে সুপথ প্রদর্শন করছি যাতে তুমি(তাঁকে) ভয় করে চল?\" \n\n" +
                " ০৭৯:০২০] সুতরাং সে(মুসা) তাকে এক মহান আয়াত(নিদর্শন) দেখাাল। \n\n" +
                " ০৭৯:০২১] কিন্তু সে(ফেরাউন) তা মিথ্যা প্রতিপন্ন করল এবং অবাধ্যতা করল, \n\n" +
                " ০৭৯:০২২] অতঃপর সে(কু-মতলব আঁটার) প্রচেষ্টায় ফিরে গেল, \n\n" +
                " ০৭৯:০২৩] এবং সে(লোকদেরকে) ডেকে সমাবেত করল, \n\n" +
                " ০৭৯:০২৪] অতঃপর সে বলল, \"আমি তোমাদের সর্বশ্রেষ্ঠ প্রতিপালক।\" \n\n" +
                " ০৭৯:০২৫] সুতরাং আল্লাহ তাকে প্রথম থেকে শেষ পর্যন্ত যন্ত্রণা-নিপীড়নে ধরাশায়ী করলেন। \n\n" +
                " ০৭৯:০২৬] নিশ্চই এ ঘটনায় শিক্ষণীয় বিষয় রয়েছে তার জন্য, যে (আল্লাহকে) ভয় করে চলে। \n\n" +
                " ০৭৯:০২৭] সৃষ্টিতে কি তোমরা(মানুষ) কঠিন না বায়ুমণ্ডল??? যা তিনি সুনিপুন ভাবে সেট করেছেন \n\n" +
                " ০৭৯:০২৮] তিনি সেগুলোর উচ্চতাকে সমুন্নত করেছেন এবং সেগুলোকে পূর্ণতা দান করেছেন \n\n" +
                " ০৭৯:০২৯] এবং সেগুলোর রাতকে অন্ধকারাচ্ছন্ন করেছেন এবং সেগুলোর প্রাতঃকালীন আলো প্রকাশ করেছেন (অর্থাৎ আহ্নিক গতি দান করেছেন) \n\n" +
                " ০৭৯:০৩০] সেগুলোর পর তিনি পৃথিবীগুলোর কক্ষপথ বিস্তৃত করলেন (অর্থাৎ বার্ষিক গতি দান করলেন) \n\n" +
                " ০৭৯:০৩১] তিনি সেগুলো থেকে সেগুলোর পানি(জলভাগ) ও পশুচারণ ভূমি(স্থলভাগ) উদগত করেছেন \n\n" +
                " ০৭৯:০৩২] এবং তিনিই ওগুলোতে পর্বত গুলো স্থাপন করেছেন(যাতে ভারসাম্য রক্ষা করে চলতে পারে) \n\n" +
                " ০৭৯:০৩৩] (এসব কিছু) তোমাদের ও সকল গৃহপালিত জীবের সম্ভোগের সামগ্রী হিসেবে। \n\n" +
                " ০৭৯:০৩৪] অতঃপর যখন (পাপীদের জন্য) মহা দূর্যোগ আসবে, \n\n" +
                " ০৭৯:০৩৫] যেদিন মানুষ সব কিছু স্মরণ করবে যা সে প্রচেষ্টা করেছে, \n\n" +
                " ০৭৯:০৩৬] এবং অনুতাপস্থল উন্মুক্ত করা হবে তার জন্য, যে দেখে। \n\n" +
                " ০৭৯:০৩৭] সুতরাং যে ব্যক্তি বিদ্রোহ করে, \n\n" +
                " ০৭৯:০৩৮] এবং এই ইহকালীন জীবনকে প্রাধান্য দেয়, \n\n" +
                " ০৭৯:০৩৯] পরিণামে নিশ্চই অনুতাপস্থলেই হবে (তার) অবস্থান। \n\n" +
                " ০৭৯:০৪০] কিন্তু যে ব্যক্তি তার ক্রমবিকাশকের মর্যাদাকে ভয় করে এবং নিজেকে নীচ কামনা-বাসনা থেকে নিবৃত্ত রাখে, \n\n" +
                " ০৭৯:০৪১] পরিণামে নিশ্চই জান্নাতই হবে(তার) আবাসস্থল, \n\n" +
                " ০৭৯:০৪২] তারা আপনাকে \"স্থির সময়\" সম্বন্ধে জিজ্ঞেস করে, \"কখন এটি উপস্থিত হবে?\" \n\n" +
                " ০৭৯:০৪৩] সেটির সাথে আপনার কী সম্পর্ক? \n\n" +
                " ০৭৯:০৪৪] আপনার ক্রমবিকাশকের দিকেই তার চূড়ান্ত সীমা।(মহাবিশ্বের সম্প্রসারণের সমান্তরালে) \n\n" +
                " ০৭৯:০৪৫] আপনি কেবল সে ব্যক্তির জন্য সতর্ককারী যে সেটিকে ভয় করে। \n\n" +
                " ০৭৯:০৪৬] যেদিন তারা সেটি প্রত্যক্ষ করবে, তাদের অবস্থা এমন হবে যেন তারা কেবল এক সন্ধ্যা বা এক প্রভাত(ইহকালে) অবস্থান করেছে। \n\n" +
                "</string>");
        editor.putString("78","পরিচ্ছেদ ০৭৮.দৃশ্যঃ মহা সংবাদ(সূরা আন-নাবা The great news) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৪১ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৭৮:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৭৮:০০১] কোন্ বিষয়ে তারা একে অপরকে জিজ্ঞাসাবাদ করছে? \n\n" +
                " ০৭৮:০০২] মহা সংবাদ সম্বন্ধে। \n\n" +
                " ০৭৮:০০৩] যে বিষয়ে তারা মতভেদ করে। \n\n" +
                " ০৭৮:০০৪] কখনও নয়, তারা অচিরেই জানতে পারবে। \n\n" +
                " ০৭৮:০০৫] পুনরায় বলছি কখনও নয়, তারা অচিরেই জানতে পারবে। \n\n" +
                " ০৭৮:০০৬] আমরা কি রাখি নাই পৃথিবীকে ঝুলন্ত করে, \n\n" +
                " ০৭৮:০০৭] এবং পর্বতগুলিকে খুঁটি করে ? \n\n" +
                " ০৭৮:০০৮] এবং আমরা তোমাদেরকে জোড়া জোড়া(নর-নারী) করে সৃষ্টি করেছি \n\n" +
                " ০৭৮:০০৯] এবং তোমাদের নিদ্রাকে আমরা আরামের কারণ করেছি, \n\n" +
                " ০৭৮:০১০] এবং রাত্রিকে করেছি আবরণ হিসেবে অর্থাৎ অন্ধকার করে \n\n" +
                " ০৭৮:০১১] এবং দিবসকে করেছি জীবিকা আহরণের উপা্য় হিসেবে, \n\n" +
                " ০৭৮:০১২] এবং আমরা তোমাদের উর্ধ্বদেশে সাত স্তর বিশিষ্ট টেকসই বায়ুমণ্ডল বানিয়েছি, \n\n" +
                " ০৭৮:০১৩] এবং আমরা সৃষ্টি করেছি (সূর্যকে) এক সমুজ্জুল প্রদীপ । \n\n" +
                " ০৭৮:০১৪] এবং আমরা কিউমুলো-নিমবাস মেঘ থেকে মুষলধারে বৃষ্টি বর্ষণ করি, \n\n" +
                " ০৭৮:০১৫] যেন আমরা উৎপন্ন করি তা দিয়ে শস্যদানা এবং শাক-সবজি, \n\n" +
                " ০৭৮:০১৬] এবং ঘণবিন্যস্ত বাগানগুলো। \n\n" +
                " ০৭৮:০১৭] নিশ্চই (ইহকাল ও পরকাল)পৃথকিকরণের দিন নির্দিষ্ট আছে। \n\n" +
                " ০৭৮:০১৮] সেদিন যখন সংকেত-ধ্বনী দেয়া হবে, তখন তোমরা দলে দলে আসবে। \n\n" +
                " ০৭৮:০১৯] এবং মহাকাশ অভিযান (সকল মানুষের জন্য)উন্মুক্ত করা হবে, ফলে তা বহুসংখ্যক সহযপথে বিভক্ত হবে। \n\n" +
                " ০৭৮:০২০] এবং পর্বতের মত উঁচু উঁচু মহাকাশযান গুলো উৎক্ষেপন করা হবে, ফলে সেগুলি দৃষ্টি-বিভ্রম মনে হবে(অর্থাং এই আছে এই নাই বা চরম গতিসম্পন্ন হবে)। \n\n" +
                " ০৭৮:০২১] নিশ্চই অনুতাপস্থল ওঁৎ পেতে আছে, \n\n" +
                " ০৭৮:০২২] বিদ্রোহপরায়ণদের জন্য, যা একটি প্রত্যাবর্তনস্থল। \n\n" +
                " ০৭৮:০২৩] তারা সেখানে যুগ যুগ ধরে অবস্থান করবে। \n\n" +
                " ০৭৮:০২৪] সেখানে তারা না শীতলতা আস্বাদন করবে এবং না পানীয়, \n\n" +
                " ০৭৮:০২৫] কেবল ফুটন্ত পানি এবং দুর্গদ্ধময় তরল পদার্থ অসহনীয় ঠান্ডা পানি ছাড়া- \n\n" +
                " ০৭৮:০২৬] এটি হবে উপযুক্ত প্রতিদান, \n\n" +
                " ০৭৮:০২৭] নিশ্চই তারা হিসেবের ভিত্তিতে প্রতিদান চাইতো না, \n\n" +
                " ০৭৮:০২৮] এবং আমাদের আয়াত(নিদর্শন) গুলোকে মিথ্যা প্রতিপন্ন করে সম্পূর্ণরূপে প্রত্যাখ্যান করত। \n\n" +
                " ০৭৮:০২৯] এবং আমরা সব কিছুই গ্রন্থে(ডায়রীতে) সংরক্ষণ করে রেখেছি। \n\n" +
                " ০৭৮:০৩০] অতএব তোমরা আস্বাদন কর, আমরা তোমাদেরকে দুঃখ-কষ্ট ছাড়া আদৌ কিছুতে বাড়াবো না। \n\n" +
                " ০৭৮:০৩১] নিশ্চই সচেতনদের জন্য অবধারিত আছে সফলতা- \n\n" +
                " ০৭৮:০৩২] বাগানগুলো এবং আঙ্গুরগুলো, \n\n" +
                " ০৭৮:০৩৩] এবং মানানসই যুটি, \n\n" +
                " ০৭৮:০৩৪] এবং কানায় কানায় পূর্ণ পান-পাত্র। \n\n" +
                " ০৭৮:০৩৫] সেখানে তারা না কোন অপ্রয়োজনীয় কথা শুনবে এবং না কোন মিথ্যে কথা, \n\n" +
                " ০৭৮:০৩৬] আপনার ক্রমবিকাশকের সন্নিধান থেকে যথোপযুক্ত একটি উপহার- \n\n" +
                " ০৭৮:০৩৭] যিনি বায়ুমণ্ডলগুলো এবং পৃথিবীগুলো এবং এতদুভয়ের মধ্যে যা কিছু আছে সকলের ক্রমবিকাশক, অযাচিত-অসীম দাতা। স্বীকার করা ছাড়া তাদের আর কিছুই বলার থাকবে না। \n\n" +
                " ০৭৮:০৩৮] সেদিন যখন রুহ(জিবরাইল) এবং সকল ফিরিশতারা সারিবদ্ধভাবে দাঁড়াবে, তারা কোন কথা বলবে না, কেবল মাত্র সে(সাক্ষি ফেরেস্তা) ছাড়া যাকে রহমান আল্লাহ অনুমতি দিবেন, এবং সে সঠিক কথাই বলবে। \n\n" +
                " ০৭৮:০৩৯] সেদিনটি সুনিশ্চিত। সুতরাং যার ইচ্ছা সে তার ক্রমবিকাশকের কাছে আশ্রয়স্থল গ্রহণ করুক। \n\n" +
                " ০৭৮:০৪০] নিশ্চই আমরা তোমাদেরকে অতি নিকটবর্তী দুঃখ-কষ্ট সম্বন্ধে সতর্ক করছি- সেদিন দেখবে *পুরুষরা* যা তার দুটিহাত আগে পাঠিয়েছে এবং প্রত্যেক অস্বীকারকারী বলবে, ‘হায়! যদি আমি মায়ের ডিম্বাধারেই রয়ে যেতাম। \n\n" +
                "</string>");
        editor.putString("77","পরিচ্ছেদ ০৭৭.দৃশ্যঃ পাঠানোর নিয়ম(সূরা আল-মুরসালাত transmitter ) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ ইহাতে ৫১ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৭৭:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৭৭:০০১] বলছি রাসুল পাঠানোর নিয়ম সম্বন্ধে \n\n" +
                " ০৭৭:০০২] অতঃপর দ্রুত গতিতে ধাবমানদের(জিবরাইল বাহিনী) \n\n" +
                " ০৭৭:০০৩] এবং ব্যাপক ভাবে বিস্তারকারীদের \n\n" +
                " ০৭৭:০০৪] অতঃপর পূর্ণরূপে (সত্য-মিথ্যার)পার্থক্যকারীদের \n\n" +
                " ০৭৭:০০৫] কুরআনকে মহাবিশ্বে(পৃথিবীতে পৃথিবীতে) উপস্থাপনকারীদের \n\n" +
                " ০৭৭:০০৬] ওজর-আপত্তি খণ্ডনের জন্য অথবা সতর্কীকরণের জন্য \n\n" +
                " ০৭৭:০০৭] নিশ্চই যার প্রতিশ্রুতি দেয়া হয়েছে তা পূর্ণ হবেই \n\n" +
                " ০৭৭:০০৮] অতএব যখন নক্ষত্ররাজি জ্যোতিহীন হয়ে পড়বে (বায়ুমণ্ডলের বাইরে মহাকাশে এমনই হয়) \n\n" +
                " ০৭৭:০০৯] এবং যখন বায়ুমণ্ডল ছাড়িয়ে (বিদির্ণ করে মানুষ মহাকাশে) যাবে \n\n" +
                " ০৭৭:০১০] এবং যখন পাহাড় সমান নভোযান গুলো মহাকাশে উড়িয়ে দেয়া হবে \n\n" +
                " ০৭৭:০১১] এবং যখন (বিজ্ঞানী)রাসুলরা উপদেশমূলক মতামত উপস্থাপন করবেন \n\n" +
                " ০৭৭:০১২] এগুলো কোন দিনের জন্য স্থগিত রাখা হয়েছে \n\n" +
                " ০৭৭:০১৩] এক পৃথকীকরণ দিনের জন্য \n\n" +
                " ০৭৭:০১৪] এবং কিসে আপনাকে পৃথকীকরণের দিন সম্বন্ধে অবহিত করবে- \n\n" +
                " ০৭৭:০১৫] এবং সেদিন মিথ্যা প্রতিপন্নকারীদের জন্য সর্বনাশ। \n\n" +
                " ০৭৭:০১৬] আমরা কি পূর্ববর্তীদেরকে ধ্বংস করি নাই? \n\n" +
                " ০৭৭:০১৭] অতঃপর আমরা পরবর্তীদেরকে অবশ্যই তাদের অনুগমন করাব। \n\n" +
                " ০৭৭:০১৮] এভাবেই আমরা অপরাধীদের সাথে ব্যবহার করে থাকি। \n\n" +
                " ০৭৭:০১৯] সেদিন মিথ্যা প্রতিপন্নকারীদের জন্য সর্বনাশ। \n\n" +
                " ০৭৭:০২০] আমরা কি তোমাদেরকে এক ঘৃণ্য পানি থেকে সৃষ্টি করি নাই? \n\n" +
                " ০৭৭:০২১] অতঃপর সেটিকে আমরা এক সুরক্ষিত অবস্থান-স্থলে(মাতৃগর্ভে) রাখলাম, \n\n" +
                " ০৭৭:০২২] এক পরিমিত মেয়াদ পর্যন্ত। \n\n" +
                " ০৭৭:০২৩] এভাবে আমরা এক পরিমাপ নিরূপণ করলাম, এবং আমরা কেমন উত্তম পরিমাপ নিরূপণকারী ! \n\n" +
                " ০৭৭:০২৪] সেদিন মিথ্যা প্রতিপন্নকারীদের জন্য সর্বনাশ। \n\n" +
                " ০৭৭:০২৫] আমরা কি পৃথিবীগুলোকে ধারণকারী করে সৃষ্টি করি নাই- \n\n" +
                " ০৭৭:০২৬] জীবিতদের এবং মৃতদের(ভ্রূণ)? \n\n" +
                " ০৭৭:০২৭] এবং আমরা সেগুলোতে অতুচ্চ পর্বতমালা সংস্থাপন করেছি এবং তোমাদেরকে সুমিষ্ট পানি পান করানোর ব্যবস্থা করেছি। \n\n" +
                " ০৭৭:০২৮] সেদিন সর্বনাশ মিথ্যা প্রতিপন্নকারীদের জন্য। \n\n" +
                " ০৭৭:০২৯] এখন তোমরা সেদিকেই ছুটে যাও যাকে তোমরা মিথ্যা প্রতিপন্ন করতে, \n\n" +
                "------সাকারের বর্ণনা------ \n\n" +
                " ০৭৭:০৩০] হাঁ, তোমরা সেই অবিচ্ছেদ্য সঙ্গী তিন মানুষ সমান বায়ুতাড়িত গন্ধ ধোঁয়ার দিকেই \n\n" +
                " ০৭৭:০৩১] যা ছায়াও দেয় না বা অগ্নিশিখার উত্তাপ থেকে রক্ষাও করে না, \n\n" +
                " ০৭৭:০৩২] এটি(প্রকান্ড) দূর্গের মত আগুনের গোলা নিক্ষেপ করে, \n\n" +
                " ০৭৭:০৩৩] যেন সেগুলো একেকটি হলুদ রংএর উট \n\n" +
                " ০৭৭:০৩৪] সেদিন সর্বনাশ মিথ্যা প্রতিপন্নকারীদের জন্য। \n\n" +
                " ০৭৭:০৩৫] এটিই সেদিন যখন তারা কথা বলতে পারবে না, \n\n" +
                " ০৭৭:০৩৬] এবং তাদেরকে অনুমতি দেয়া হবে না, যাতে তারা ওজর-আপত্তি উত্থাপন করতে পারে। \n\n" +
                " ০৭৭:০৩৭] সেদিন সর্বনাশ মিথ্যা প্রতিপন্নকারীদের জন্য। \n\n" +
                " ০৭৭:০৩৮] ‘এটিই পৃথকীকরণের দিন। আমরা তোমাদেরকে একত্রিত করেছি এবং পূর্ববর্তীদেরও, \n\n" +
                " ০৭৭:০৩৯] যদি তোমাদের কাছে কোনও কৌশল থাকে তাহলে আমার বিরুদ্ধে কৌশল কর। \n\n" +
                " ০৭৭:০৪০] সেদিন সর্বনাশ মিথ্যা প্রতিপন্নকারীদের জন্য। \n\n" +
                "-----বেহেস্তের বর্ণনা----- \n\n" +
                " ০৭৭:০৪১] নিশ্চই সচেতনরা ছায়া ও ঝরণাগুলোর মধ্যে অবস্থান করবে, \n\n" +
                " ০৭৭:০৪২] এবং ফলরাজির মধ্যে, যা তারা চাইবে। \n\n" +
                " ০৭৭:০৪৩] (বলা হবে) \"তোমরা যে কাজ করতে তার বিনিময়ে তৃপ্তি সহকারে খাও এবং পান কর- \n\n" +
                " ০৭৭:০৪৪] নিশ্চই সৎকর্মশীলদেরকে এভাবে আমরা প্রতিদান দিয়ে থাকি।\" \n\n" +
                " ০৭৭:০৪৫] সেদিন সর্বনাশ মিথ্যা প্রতিপন্নকারীদের জন্য। \n\n" +
                " ০৭৭:০৪৬] (হে মিথ্যা প্রতিপন্নকারীরা!) \"তোমরা খেয়ে নাও এবং কিছুকালের জন্য সুখ-সম্ভোগ কর, নিশ্চই তোমরা অপরাধী।\" \n\n" +
                " ০৭৭:০৪৭] সেদিন সর্বনাশ মিথ্যা প্রতিপন্নকারীদের জন্য। \n\n" +
                " ০৭৭:০৪৮] এবং যখন তাদেরকে বলা হয়, \"তোমরা(আল্লাহর সামনে) বাঁকা হয়ে নতশির হও।\" তখন তারা বাঁকা হয়ে নতশির হয় না। \n\n" +
                " ০৭৭:০৪৯] সেদিন সর্বনাশ মিথ্যা প্রতিপন্নকারীদের জন্য। \n\n" +
                " ০৭৭:০৫০] সুতরাং এর পরে তারা কোন হাদিস(কথা) মেনে নিবে?");
        editor.putString("76","০৭৬.দৃশ্যঃ মানবজাতি/ সময়(সূরা আল-ইনসান/ আদ-দাহর The man/ Time ) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৩২ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৭৬:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৭৬:০০১] মানবজাতির ওপর কি নিঃসীম মহাকালের এমন একটা সময়ও অতিবাহিত হয়নি, যখন তারা উল্লেখযোগ্য কোনো বস্তুই ছিল না? \n\n" +
                " ০৭৬:০০২] আমরা মানবজাতিকে এক অতিআনুবিক্ষনিক জননক্ষম জীবকোষ থেকে সৃষ্টি করেছি যেন আমরা তাদের পরীক্ষা করতে পারি। অতঃপর আমরা তাদেরকে শ্রবণশক্তি ও পরে দৃষ্টিশক্তির দান করেছি । \n\n" +
                " ০৭৬:০০৩] আমরা তাদেরকে সঠিক পথ দেখিয়েছি-- ইচ্ছা হলে তারা কৃতজ্ঞ হবে কিংবা হবে অস্বীকারকারী। \n\n" +
                "----ভ্রূণ সৃষ্টির প্রসেস---- \n\n" +
                " ০৭৬:০০৪] নিশ্চই আমরা অস্বীকারারীদের জন্য (১০৫ফুট লম্বা)শিকল দিয়ে গলারবেড়ি (বাঁধা টেস্টটিউব), প্রজ্জলিত আগুন(নিউক্লিয়ার রিএক্টরে ঝুলানো অপূর্ণ ভ্রূণ) প্রস্তুৎ করে রেখেছি। \n\n" +
                " ০৭৬:০০৫] নিশ্চই সৎযূক্তিপরায়নরা এমন পানপাত্র থেকে পান করবে যার মধ্যে কর্পুর মিশ্রিত পানীয় থাকবে – \n\n" +
                " ০৭৬:০০৬] এমন একটি হ্রদ যা থেকে আল্লাহর বান্দারা পান করবে, যাকে তারা নিজেদের প্রচেষ্টায় উত্তম প্রবাহে প্রবাহিত করবে। \n\n" +
                " ০৭৬:০০৭] তারা নিজেদের প্রতিশ্রুতি পূর্ণ করবে এবং সেদিনের ক্ষতিকে ভয় করবে যা সংবাদ মাধ্যমে ছড়িয়ে পড়বে। \n\n" +
                " ০৭৬:০০৮] এবং তারা তাঁর(আল্লাহর)ই ভালবাসায় দরিদ্র, অনাথ-এতিম ও বেঁধেরাখা পাগলদের আহার করায় \n\n" +
                " ০৭৬:০০৯] \"আমরা তোমাদেরকে শুধুই আল্লাহর সন্তুষ্টির জন্য আহার করাই, তোমাদের কাছে কোনও প্রতিদান চাই না, কৃতজ্ঞতাও না \n\n" +
                " ০৭৬:০১০] নিশ্চই আমরা আমাদের ক্রমবিকাশক থেকে আগত ভ্রুকুঞ্চনকারী এবং দূর্যোগপূর্ণ দিনকে ভয় করি।\" \n\n" +
                " ০৭৬:০১১] সুতরাং আল্লাহ তাদেরকে সেদিনের ক্ষতি থেকে রক্ষা করবেন এবং তাদেরকে প্রফুল্লতা এবং আনন্দ দান করবেন। \n\n" +
                " ০৭৬:০১২] এবং যেহেতু তারা ধৈর্য ধারণ করেছে, তিনি তাদেরকে বিনিময়ে জান্নাত এবং রেশমী বস্ত্র দান করবেন। \n\n" +
                " ০৭৬:০১৩] তারা সেখানে পালংকের উপর হেলান দিয়ে বসবে, সেখানে তারা না প্রখর রৌদ্র অনুভব করবে এবং না প্রচন্ড শীত। \n\n" +
                " ০৭৬:০১৪] এবং তাদের উপর সেটির রোদ থেকে আড়াল করা ছাউনি গুলো কাছেই থাকবে, এবং তার গুচ্ছবদ্ধ ফলরাজি তাদের নাগালের আওতায় এনে দেয়া হবে। \n\n" +
                " ০৭৬:০১৫] এবং তাদের মধ্যে রৌপ্য-নির্মিত ভোজন-পাত্র এবং পান-পাত্র পরিবেশন করা হবে যা স্ফটিক-স্বচ্ছ কাঁচের(silver-glass) হবে। \n\n" +
                " ০৭৬:০১৬] সেগুলি স্ফটিক-স্বচ্ছ কাঁচের হলেও (silver-glass)রৌপ্য নির্মিত হবে, সেগুলো যথাযথ পরিমাপে দাগকাটা ও মাপাঙ্ক লেখা থাকবে। \n\n" +
                " ০৭৬:০১৭] এবং সেখানে তাদেরকে সেসব পান-পাত্রে পানীয় পরিবেশন করা হবে যাতে আদা(যানজাবীল) সংমিশ্রিত থাকবে, \n\n" +
                " ০৭৬:০১৮] সেটির মধ্যে হ্রদ থাকবে যা ‘সালসাবীল’ নামে অভিহিত হবে। \n\n" +
                " ০৭৬:০১৯] এবং তাদের মধ্যে পরিবেশন করবে কিশোররা, যখন আপনি তাদেরকে দেখবেন তখন তাদেরকে মনে করবেন যেন বিক্ষিপ্ত মুক্তারাজি। \n\n" +
                " ০৭৬:০২০] এবং যখন আপনি অবলোকন করবেন, সেখানে আপনি এক মহা পুরস্কার এবং বিশাল রাজ্য অবলোকন করবেন। \n\n" +
                " ০৭৬:০২১] তাদের গায়ে সবুজ বর্নের চিকণ রেশমী এবং ঘন রেশমী পোষাক থাকবে এবং তাদেরকে রৌপ্য নির্মিত কংকণ দিয়ে অলংকৃত করা হবে, এবং তাদের ক্রমবিকাশক তাদেরকে বিশুদ্ধ পানীয় পান করাবেন। \n\n" +
                " ০৭৬:০২২] (তাদেরকে বলা হবে) এটিই হল তোমাদের জন্য পুরস্কার, বস্তুতঃ তোমাদের চেষ্টা-প্রচেষ্টার কদর করা হয়েছে। \n\n" +
                " ০৭৬:০২৩] নিশ্চই আমরা আপনার প্রতি কুরআন ক্রমে ক্রমে নাযেল করেছি। \n\n" +
                " ০৭৬:০২৪] সুতরাং আপনি আপনার ক্রমবিকাশকের আদেশের অপেক্ষায় ধৈর্য ধারণ করুন এবং তাদের মধ্যে কোন পাপাচারী অথবা অস্বীকারকারীকে অনুসরণ করবেন না, \n\n" +
                " ০৭৬:০২৫] এবং প্রভাতে ও সন্ধ্যায় আপনি আপনার ক্রমবিকাশকের মালিকাানা স্মরণ করুন, \n\n" +
                " ০৭৬:০২৬] রাত্রেও তাঁর উদ্দেশ্যে সেজদা করুন এবং দীর্ঘ রাত পর্যন্ত তাঁর সেবা-কর্ম করতে থাকুন। \n\n" +
                " ০৭৬:০২৭] নিশ্চই এসকল লোক দ্রুত(নগদে)-পাওয়া ইহকালীন জীবনকে ভালবাসে এবং তাদের প্রাপ্য পরবর্তী কঠিন দিনকে উপেক্ষা করে। \n\n" +
                " ০৭৬:০২৮] আমরাই তাদেরকে সৃষ্টি করেছি এবং তাদের গঠনকে মযবুত করেছি এবং যখন আমরা ইচ্ছা করব তখন তাদের অনুরূপ জাতিকে তাদের স্থলে দাঁড় করাব। \n\n" +
                " ০৭৬:০২৯] নিশ্চই এটি(কুরআন) একটি স্মারক-বাণী। অতএব যার ইচ্ছা নিজ ক্রমবিকাশক অভিমুখী পথ অবলম্বন করুক। \n\n" +
                " ০৭৬:০৩০] যেহেতু তোমরা কিছুই চাইতে পার না শুধু সেগুলো ছাড়া, যা আল্লাহ চাইবেন। নিশ্চই আল্লাহ সর্বজ্ঞানী, মহা বিজ্ঞানী। \n\n" +
                " ০৭৬:০৩১] তিনি যাকে চান নিজ রহমতে প্রবিষ্ট করেন এবং অন্যায়কারীদের বিষয় হল---তাদের জন্য তিনি প্রস্তুত করেছেন যন্ত্রণাদায়ক দুঃখ-কষ্ট।");
        editor.putString("75","০৭৫.দৃশ্যঃ পূনরুত্থান(সূরা আল-কিয়ামা The Resurrection) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৪১ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৭৫:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৭৫:০০১] না, আমি পূনরুত্থান দিবসের কথা বলছি। \n\n" +
                " ০৭৫:০০২] পুনরায়(বলছি) না, আমি পুনঃপুনঃ ভৎর্সনাকারী প্রানের কথা বলছি, (পূনরুত্থান অবশ্যম্ভাবী)। \n\n" +
                " ০৭৫:০০৩] মানুষ কি গণনা করে, আমরা তাদের অস্তিগুলোকে কখনও একত্রিত করব না? \n\n" +
                " ০৭৫:০০৪] না, বরং আমরা তার আঙ্গুলের অগ্রভাগগুলোকেও(আলাদা আলাদা ভ্রূণে) পুনর্বিন্যস্ত করতে সক্ষম। \n\n" +
                " ০৭৫:০০৫] তবুও মানুষ অনবরত তাঁর সম্মুখে পাপাচারে লিপ্ত থাকতে চায়। \n\n" +
                " ০৭৫:০০৬] সে জিজ্ঞেস করে, \"পূনরুত্থান দিবস কবে ?\" \n\n" +
                " ০৭৫:০০৭] অতএব যখন বিদ্যূৎঝলকে চক্ষু ঝলসে যাবে (রেটিনার ক্লান্তি হবে), \n\n" +
                " ০৭৫:০০৮] এবং চন্দ্রে গ্রহণ লাগবে, \n\n" +
                " ০৭৫:০০৯] এবং সূর্য ও চন্দ্র উভয়কে একত্রিত করা হবে (অর্থাৎ সূর্যগ্রহন হবে, চন্দ্রগ্রহন থেকে সূর্যগ্রহন ব্যাবধান ১৫দিন), \n\n" +
                " ০৭৫:০১০] সে সময়ে মানুষ(পুরুষ) বলবে, \"পালাবার স্থান কোথায়?\" \n\n" +
                " ০৭৫:০১১] কখনও না, কোন আশ্রয়স্থল নেই ! \n\n" +
                " ০৭৫:০১২] সেদিন কেবল আপনার ক্রমবিকাশকের কাছে শেষ-পরিনতি হবে (নিঃশেষে ধ্বংস হবে)। \n\n" +
                " ০৭৫:০১৩] সেদিন মানবজাতিকে অবহিত করা হবে, যা সে আগে প্রেরণ করেছে এবং যা সে পিছনে ফেলে এসেছে। \n\n" +
                " ০৭৫:০১৪] প্রকৃতপক্ষে মানবজাতি তার নিজের সম্বন্ধে সম্যক অবহিত, \n\n" +
                " ০৭৫:০১৫] সে যতই ওজর-আপত্তি উপস্থাপন করুক না কেন। \n\n" +
                " ০৭৫:০১৬] (হে নবীজী !) আপনি এটি(কুরআন) সম্বন্ধে(আয়ত্তে আনার জন্য) আপনারর জিহবাকে দ্রুত সঞ্চালিত করবেন না। \n\n" +
                "---আল্লাহই কুরআন এর সংকলন ও ব্যাখ্যা করেছেন--- \n\n" +
                " ০৭৫:০১৭] নিশ্চই এটি সংকলন করার ও পাঠ করে শুনানোর দায়িত্ব আমাদের উপর। \n\n" +
                " ০৭৫:০১৮] অতএব যখন আমরা পাঠ করি তখন আপনিও এটি পাঠের অনুসরণ করবেন । \n\n" +
                " ০৭৫:০১৯] অতঃপর একে সুস্পষ্টভাবে ব্যাখ্যা করার দায়িত্ব আমাদের উপর । \n\n" +
                " ০৭৫:০২০] কখনও না, বরং তোমরা ত্বরিৎলভ্য(ইহকালীন) পুরস্কারকে ভালবাস। \n\n" +
                " ০৭৫:০২১] এবং পরকালীন জীবনকে তোমরা পরিহার কর। \n\n" +
                " ০৭৫:০২২] সেদিন কতক মুখমন্ডল উজ্জল-উৎফুল্ল হবে, \n\n" +
                " ০৭৫:০২৩] নিজ ক্রমবিকাশকের দিকে তাকিয়ে থাকবে, \n\n" +
                " ০৭৫:০২৪] এবং কতক মুখমন্ডল বিষন্ন হবে, \n\n" +
                " ০৭৫:০২৫] তারা ধারণা করবে, তাদেরকে মেরুদন্ড ভঙ্গকারী শাস্তি দেয়া হবে। \n\n" +
                " ০৭৫:০২৬] কখনও না, যখন প্রাণ কন্ঠদেশ পর্যন্ত পৌছে যাবে, \n\n" +
                " ০৭৫:০২৭] এবং বলা হবে, \"কোনও চিকিৎসক আছে কি?\" \n\n" +
                " ০৭৫:০২৮] এবং প্রত্যেকে ধারনা করবে, নিশ্চই বিদায়-মুহূর্ত উপস্থিত হয়েছে, \n\n" +
                " ০৭৫:০২৯] এবং যখন পায়ের এক নলি অপর নলির সাথে ঘর্ষণ করবে। \n\n" +
                " ০৭৫:০৩০] সেদিন আপনার ক্রমবিকাশকের দিকে হাঁকিয়ে নিয়ে যাওয়া হবে। \n\n" +
                " ০৭৫:০৩১] কেননা সে সত্যকে গ্রহনও করে নাই এবং ভালবাসা(সালাত) স্থাপনও করে নাই, \n\n" +
                " ০৭৫:০৩২] বরং সে শুধু মিথ্যা প্রতিপন্ন করল এবং মুখ ফিরিয়ে নিল, \n\n" +
                " ০৭৫:০৩৩] অতঃপর সে নিজ পরিবার-পরিজনের কাছে গর্বভরে গমন করল। \n\n" +
                " ০৭৫:০৩৪] (হে পুরুষ মানুষ) সর্বনাশ তোমার জন্য। আবারও সর্বনাশ। \n\n" +
                " ০৭৫:০৩৫] পুনরায়(বলছি) সর্বনাশ তোমাদের জন্য। আবারও সর্বনাশ। \n\n" +
                " ০৭৫:০৩৬] মানবজাতি কি মনে করে যে, তাকে বল্গাহীনভাবে ছেড়ে দেয়া হবে? \n\n" +
                "----মানব সৃষ্টির প্রসেস---- \n\n" +
                " ০৭৫:০৩৭] সে কি এক সময় অতিআনুবিক্ষনিক বিন্দু(zygot) ছিল না যা(মাতৃ ফেলোপিয়ান টিউবে) নিষিক্ত হয়েছে? \n\n" +
                " ০৭৫:০৩৮] অতঃপর সেটি এক ঝুলন্ত ব্লাস্টোসাইটে পরিণত হয়, অতঃপর সেটিকে তিনি(আল্লাহ) আকৃতি দান করেন, অতঃপর তিনি সেটিকে পরিপূর্ণ ভ্রূণ করেন। \n\n" +
                " ০৭৫:০৩৯] অতঃপর তিনি তা থেকে দুধরণের জোড়া(লিঙ্গ) সৃষ্টি করেন -নর ও নারী। \n\n" +
                " ০৭৫:০৪০] তবুও কিভাবে এককসত্বা(আল্লাহ) মৃতকে জীবিত করতে সক্ষম না হবেন ?");
        editor.putString("74","পরিচ্ছেদ ০৭৪.দৃশ্যঃ ধোয়া পোশাকাবৃত ব্যাক্তি(সূরা আল-মু্দাস্সের The washed-suited) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহসহ এতে ৫৭ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৭৪:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৭৪:০০১] হে ধোয়া পোশাকাবৃত ব্যাক্তি \n\n" +
                " ০৭৪:০০২] আপনি উঠুন এবং সতর্ক করুন, \n\n" +
                " ০৭৪:০০৩] এবং আপনার ক্রমবিকাশকের মহত্ব ঘোষণা করুন, \n\n" +
                " ০৭৪:০০৪] এবং আপনি আপনার পোষাক-পরিচ্ছদকে পরিচ্ছন্ন-জীবানুমুক্ত রাখুন, \n\n" +
                " ০৭৪:০০৫] এবং অশুদ্ধতাকে বর্জন করুন, \n\n" +
                " ০৭৪:০০৬] এবং আপনি এভাবে দান করবেন না, যাতে বেশি জমা করতে পারেন, \n\n" +
                " ০৭৪:০০৭] এবং আপনি আপনার ক্রমবিকাশকের(সন্তুষ্টির) জন্য দান করুন অতঃপর ধৈর্য ধরুন \n\n" +
                " ০৭৪:০০৮] এবং যখন সংকেত-ধ্বনী ধ্বনিত হবে, \n\n" +
                " ০৭৪:০০৯] তখন সেদিন হবে বড়ই কঠিন দিন, \n\n" +
                " ০৭৪:০১০] যা অস্বীকারকারীদের জন্যে মোটেও সহজ হবে না। \n\n" +
                " ০৭৪:০১১] আপনি আমাকে এবং যাকে আমি সৃষ্টি করেছি তাকে একাকী ছেড়ে দিন, \n\n" +
                " ০৭৪:০১২] এবং আমি তাকে বিপুল সম্পদ দান করেছি, \n\n" +
                " ০৭৪:০১৩] এবং সন্তান-সন্ততি(তার) সম্মুখে অবস্থানকারী হিসেবে, \n\n" +
                " ০৭৪:০১৪] এবং আমি তার জন্য প্রস্তুত করেছি আরামদায়ক(জীবন-যাত্রার) যাবতীয় উপকরণ, \n\n" +
                " ০৭৪:০১৫] তবুও সে লোভ করে, যেন আমি তাকে আরও দেই \n\n" +
                " ০৭৪:০১৬] কখনও নয়, সে আমাদের আয়াত গুলোর পরম শত্রু ছিল \n\n" +
                " ০৭৪:০১৭] অচিরেই আমি তাকে ক্রমবর্ধমান কঠোর দুঃখ-কষ্টে আক্রান্ত করাবো \n\n" +
                " ০৭৪:০১৮] নিশ্চই সে চিন্তা করলো এবং আন্দাজ করলো \n\n" +
                " ০৭৪:০১৯] অতএব, ধ্বংস হোক সে ! সে কিভাবে আন্দাজ করলো !!! \n\n" +
                " ০৭৪:০২০] ধ্বংস হোক সে আবারও ! সে কিভাবে আন্দাজ করলো \n\n" +
                " ০৭৪:০২১] সে পুনরায় তাকিয়ে দেখলো \n\n" +
                " ০৭৪:০২২] অতঃপর সে ভ্রূকুঞ্চিত করলো এবং মুখ বিকৃত করলো \n\n" +
                " ০৭৪:০২৩] অতঃপর সে পৃষ্ঠপ্রদর্শন করলো এবং অহংকার করলো \n\n" +
                " ০৭৪:০২৪] এবং সে বললো এগুলো মিরাকল ছাড়া কিছু নয়, এগুলো কপিকৃত \n\n" +
                " ০৭৪:০২৫] এগুলো মানুষের কথা ছাড়া কিছু নয় \n\n" +
                " ০৭৪:০২৬] অচিরেই আমি তাকে সাকারে নিক্ষেপ করবো \n\n" +
                " ০৭৪:০২৭] এবং আপনাকে কিসে অবহিত করবে যে সেই ‘সাকার’ কী? \n\n" +
                " ০৭৪:০২৮] এটি কিছুই বাকী রাখে না এবং এটি কিছুই ছাড়ে না। \n\n" +
                " ০৭৪:০২৯] এটি মানুষের চামড়াকে ঝলসে দেয় \n\n" +
                " ০৭৪:০৩০] যার উপর উনিশ(১৯এর গুনিতক সংখ্যক) প্রহরী আছে। \n\n" +
                " ০৭৪:০৩১] এবং ফিরিশতা ছাড়া আমরা অন্য কাউকেও আগুনের(জিবরাইল বা কুরআনের) প্রহরী নিযুক্ত করি নাই। এবং আমরা তাদের সংখ্যা নির্ধারণ করি নাই কিন্তু কেবল সেসব লোকের জন্য পরীক্ষা হিসেবে, যারা অস্বীকার করেছে, যেন তারা মেনে নিতে পারে যাদেরকে গ্রন্থ দেয়া হয়েছে, এবং যেন তারা আরও বেশি বিষয় মানে যারা মেনে নিয়েছে, এবং যাদেরকে গ্রন্থ দেয়া হয়েছে তারা এবং যারা মেনে নিয়েছে তারা যেন সন্দেহ না করে, এবং ফলে যাদের অন্তরে কলুষতা আছে তারা এবং অন্যান্য অস্বীকারকারীরা বলতে পারে, \"এমন উপমা দিয়ে আল্লাহ কী বুঝাতে চাইছেন?\" এভাবে আল্লাহ যাকে ইচ্ছা করেন পথভ্রষ্ট হতে দেন এবং যাকে ইচ্ছা করেন সুপথ প্রদর্শন করেন। বস্তুতঃ পক্ষে আপনার ক্রমিকাশকের সৈন্যদলকে (কুরআনের প্রহরী) তিনি ছাড়া আর কেউই জানে না। এবং এটি (কুরআন) মানুষের জন্য স্মারক-বানী ছাড়া কিছু নয়। \n\n" +
                " ০৭৪:০৩২] কখনও নয়, চন্দ্রের কথা বলছি, \n\n" +
                " ০৭৪:০৩৩] এবং রাত্রির কথা বলছি যখন এর অবসান ঘটে, \n\n" +
                " ০৭৪:০৩৪] এবং প্রভাতের কথা বলছি যখন তা সমুজ্জুল হয়, \n\n" +
                " ০৭৪:০৩৫] নিশ্চই এটি মহা বিপদগুলোর অন্যতম, \n\n" +
                " ০৭৪:০৩৬] মানুষের জন্য সতর্ককারী, \n\n" +
                " ০৭৪:০৩৭] তোমাদের মধ্যে সে ব্যক্তির জন্য যে চায়(ভালকাজে) অগ্রগামী থাকতে অথবা পশ্চাদপসরণ করতে, \n\n" +
                " ০৭৪:০৩৮] প্রত্যেক ব্যক্তি তার কৃত-কর্মের জন্য দায়ি, \n\n" +
                " ০৭৪:০৩৯] ডানপার্শ্ববতী লোকেরা ছাড়া, \n\n" +
                " ০৭৪:০৪০] যারা জান্নাতে থাকবে, তারা জিজ্ঞাসাবাদ করবে- \n\n" +
                " ০৭৪:০৪১] অপরাধীদের কাছ থেকে, \n\n" +
                "--- সাকারে প্রবেশের কারন --- \n\n" +
                " ০৭৪:০৪২] তোমাদেরকে কিসে সাকারে প্রবিষ্ট করলো? \n\n" +
                " ০৭৪:০৪৩] তারা বলবে, আমরা ভালবাসা(সালাত) স্থাপনকারীদের অন্তর্ভূক্ত ছিলাম না \n\n" +
                " ০৭৪:০৪৪] আমরা দুস্থ-অভাবগ্রস্থ-গরিবদের খাওয়াতাম না \n\n" +
                " ০৭৪:০৪৫] এবং বাজে গল্পকারিদের সাথে মিলে বাজে গল্প করে বেড়াতাম (ফেসবুক বা যে কোন আড্ডায়), \n\n" +
                " ০৭৪:০৪৬] এবং জীবন-বিধান প্রতিষ্ঠার সময়কালকে অমান্য(মিথ্যা প্রতিপন্ন) করতাম, \n\n" +
                " ০৭৪:০৪৭] যতক্ষণ পর্যন্ত না আমাদের কাছে নিশ্চয়তা আসলো, \n\n" +
                " ০৭৪:০৪৮] সুতরাং কোন মধ্যস্ততাকারীর মধ্যস্ততা তাদের কোন উপকারে লাগবে না। \n\n" +
                " ০৭৪:০৪৯] তাদের কী হয়েছে যে, তারা উপদেশ থেকে এমনভাবে মুখ ফিরিয়ে নিচ্ছে, \n\n" +
                " ০৭৪:০৫০] যেন তারা আতংকিত গর্দভ, \n\n" +
                " ০৭৪:০৫১] যারা সিংহ দেখে পলায়ন করছে? \n\n" +
                " ০৭৪:০৫২] বরং তাদের মধ্যে প্রত্যেকেই কামনা করে যেন তাকে উন্মুক্ত গ্রন্থ প্রদান করা হয়। \n\n" +
                " ০৭৪:০৫৩] কখনও নয়, যেহেতু তারা পরকালকেই ভয় করে না। \n\n" +
                " ০৭৪:০৫৪] কখনও নয়, নিশ্চই এটি(কুরআর) এক স্মারক-বাণী। \n\n" +
                " ০৭৪:০৫৫] সুতরাং যার ইচ্ছা সেটি স্মরণ (উপদেশ গ্রহণ) করুক। \n\n" +
                " ০৭৪:০৫৬] এবং তারা কখনও স্মরণকারী হবে না (উপদেশ নিবে না), যদি না আল্লাহ চান। তিনিই সকল বিষয়ে সচেতনতার যোগ্য(প্রাপ্য) এবং সংশোধন দানের অধিকারী। \n\n" +
                "</string>");
        editor.putString("73","পরিচ্ছেদ ০৭৩.দৃশ্যঃ অনুষঙ্গী(সূরা আল-মুযযাম্মেল The accompanied) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ২১ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৭৩:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে। \n\n" +
                " ০৭৩:০০১] হে অনুষঙ্গী! \n\n" +
                " ০৭৩:০০২] আপনি রাত্রে দন্ডায়মান হৌন, অল্প অংশ ছাড়া, \n\n" +
                " ০৭৩:০০৩] এর অর্ধেক অংশ অথবা তা থেকে কিছু কম করুন, \n\n" +
                " ০৭৩:০০৪] অথবা এরচেয়ে কিছু সময় বাড়ান এবং ধীরে ধীরে সুললিত কন্ঠে কুরআন আবৃত্তি করুন। \n\n" +
                " ০৭৩:০০৫] নিশ্চই আমরা আপনার উপর গুরুভার কালাম(অনেক বানী) অর্পন করতে চলেছি। \n\n" +
                " ০৭৩:০০৬] নিশ্চই রাতে উঠে দাঁড়ানো অত্যন্ত সহয(নিরাপদ) এবং কন্ঠস্বর থাকে মসৃন। \n\n" +
                " ০৭৩:০০৭] নিশ্চই দিবসে আপনি দীর্ঘ কর্মব্যাস্ততায় নিমগ্ন থাকেন। \n\n" +
                " ০৭৩:০০৮] সুতরাং আপনি আপনার ক্রমবিকাশকের মালিকানা স্মরণ করুন এবং ঘণ্টাধ্বনি দিয়ে তাঁর দিকে আহ্বান করুন। \n\n" +
                " ০৭৩:০০৯] তিনিই প্রাচ্য(orient) ও পাশ্চাত্য(oxidant)এর ক্রমবিকাশক, তিনি ছাড়া কোনও উদ্ভাবনীশক্তি নেই, অতএব আপনি শুধু তাঁকে অভিভাবক হিসেবে গ্রহণ করুন। \n\n" +
                " ০৭৩:০১০] এবং তারা যা কিছু বলে, তাতে আপনি ধৈর্য ধারণ করুন, এবং তাদেরকে অতি সুন্দর ভাবে বর্জন করুন। \n\n" +
                " ০৭৩:০১১] এবং আপনি আমাকে এবং (সত্যের প্রতি)মিথ্যারোপকারী সুবিধাভোগীদেরকে ছেড়ে দিন এবং তাদেরকে কিছুকাল অবকাশ দিন। \n\n" +
                " ০৭৩:০১২] নিশ্চই আমাদের কাছে রয়েছে ক্লান্তিকর ও জলন্ত অনুতাপস্থল, \n\n" +
                " ০৭৩:০১৩] এবং কন্ঠরোধকারী(ক্যাক্টাস meselobryanthium flo...) খাদ্য এবং যন্ত্রণাদায়ক দুঃখ-কষ্ট- \n\n" +
                " ০৭৩:০১৪] যেদিন পৃথিবী এবং পর্বতসাদৃশ মহাকাশযানগুলো (যাত্রা শুরুতে)কম্পিত হতে থাকবে এবং পর্বতসাদৃশ শত শত বালিয়াড়ী(Dune ) তৈরী হবে। \n\n" +
                " ০৭৩:০১৫] নিশ্চই আমরা তোমাদের কাছে প্রেরণ করেছি এক রসূল(কুরআন) তোমাদের উপর সাক্ষী হিসেবে, যেভাবে ফেরাউনের কাছে প্রেরণ করেছিলাম একজন রসূল, \n\n" +
                " ০৭৩:০১৬] কিন্তু ফেরাউন সে রসূলকে অমান্য করল, ফলে আমরা তাকে অতি ভয়ংকর ভাবে ধরাশায়ী করেছিলাম। \n\n" +
                " ০৭৩:০১৭] সুতরাং কিকরে তোমরা সচেতন হবে যদি সেদিনকে অস্বীকার কর, যেদিন সাদা চুলবিশিষ্ট নবজাতকরা জন্ম নিবে (অর্থাৎ পুরনো মানুষেরা পূনর্জন্ম নিবে) ? \n\n" +
                " ০৭৩:০১৮] যেদিন বায়ুমণ্ডলগুলো সে (মহাকাশ যাত্রার)কারনে বিদীর্ণ হবে, তাঁর প্রতিশ্রুতি অবশ্যই পূর্ণ হবে? \n\n" +
                " ০৭৩:০১৯] নিশ্চই এটি(কুরআন) স্মারক-বাণী। অতএব যার ইচ্ছা সে নিজ ক্রমবিকাশক অভিমুখী পথ অবলম্বন করুক। \n\n" +
                " ০৭৩:০২০] নিশ্চই আপনার ক্রমবিকাশক জানেন যে, আপনি দন্ডায়মান হন রাত্রের দুই-তৃতীয়ংশের কিছু কম এবং কখনও অর্ধেকাংশ এবং কখনও বা এক-তৃতীয়াংশ, এবং(দন্ডায়মান হয়) তাদের থেকে একদলও যারা আপনার সঙ্গী। বস্তুতঃ আল্লাহ রাত্রি ও দিবসের পরিমাণকে নির্ধারণ করেন। তিনি জানেন, আপনারা কখনও সময় ঠিক রাখতে পারবেন না, সুতরাং তিনি আপনাদের প্রতি সদয় দৃষ্টিাপাত করলেন(দ্রঃ ১১:১১৪)। অতএব আপনারা কুরআন থেকে যতটুকু সহজসাধ্য হয় ততটুকু আবৃত্তি করুন। তিনি এও জানেন, আপনাদের মধ্যে কিছু লোক অসুস্থ থাকবে এবং অন্য কিছু লোক আল্লাহর বিজ্ঞানের জ্ঞান(শিক্ষা) অন্বেষণ করতে পৃথিবী গুলোতে ভ্রমণ করবে এবং অন্য কিছু লোক আল্লাহর পথে প্রচেষ্টা করবে। সুতরাং তা থেকে যতটুকু সহজসাধ্য হয় আপনারা ততটুকু আবৃত্তি করুন, এবং আপনারা সালাত(ভালবাসা) স্থাপন করুন এবং শুদ্ধতা অর্জন করুন(দরিদ্রদের খাদ্য ও বস্ত্র এককভাবে দান এবং দারিদ্রদূরিকরণে সম্মিলিত দান করে) এবং উত্তম ভাবে আল্লাহকে ঋণ দান করুন। এবং আপনারা যে কোন সৎকর্ম নিজেদের কল্যাণের জন্য আগে আগে পাঠাবেন, আল্লাহর কাছে আপনারা তা পাবেন। তা অতি উত্তম এবং পুরস্কার হিসাবে অত্যন্ত মহৎ হবে, এবং আপনারা আল্লাহর কাছে সংশোধন প্রার্থনা করুন, নিশ্চই আল্লাহ অতীব সংশোধনশীল, এককসত্তা দয়াময়। \n\n" +
                "</string>");
        editor.putString("72","পরিচ্ছেদ ০৭২.দৃশ্যঃ অজানা গোষ্ঠি(সূরা আল-জিন The X party) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ২৯ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৭২:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৭২:০০১] আপনি বলুন, \"আমার প্রতি প্রত্যাদেশ করা হয়েছে, অজানা(গোপন) একটি গোষ্ঠি (কুরআন) শ্রবণ করেছে,\" এবং তারা বলেছে, \"নিশ্চই আমরা এক বিস্ময়কর কুরআন শ্রবণ করেছি, \n\n" +
                " ০৭২:০০২] যা সুপথ প্রাপ্তির নির্দেশনার দিকে পরিচালিত করে, সুতরাং আমরা তা মেনে নিয়েছি, এবং আমরা আমাদের ক্রমবিকাশকের সাথে কাউকেও পৃথকসত্বা কল্পনা করব না। \n\n" +
                " ০৭২:০০৩] প্রকৃত কথা হচ্ছে, আমাদের ক্রমবিকাশকের মর্যাদা অতীব মহান, তিনি কখনও নিজের জন্য কোনও যুগ্ন-সংস্করণ বা কোনও ক্ষূদ্র-সংস্করণ গ্রহণ করেন নাই, \n\n" +
                " ০৭২:০০৪] এবং আমাদের মধ্যে নির্বোধেরা আল্লাহ সম্পর্কে ডাহা মিথ্যা কথা বলত, \n\n" +
                " ০৭২:০০৫] এবং আমরা অবশ্যই এ ধারণা করে আসছিলাম, (স্থলের)মানুষ এবং (পাহাড়ি)উপজাতি কখনও আল্লাহ সম্বন্ধে মিথ্যা বলতে পারে না, \n\n" +
                " ০৭২:০০৬] এবং এ কথাও সত্য, (স্থলের)মানুষের মধ্য থেকে কিছু পুরুষ উপজাতিয়দের মধ্যে থেকে কিছু পুরুষের শরণাপন্ন হয় এবং এভাবে তারা তাদেরকে আন্তরিকতায় বাড়িয়ে দিয়েছে,\" \n\n" +
                " ০৭২:০০৭] এবং আসলে তারা এমন ধারণা করেছিল, যেভাবে তোমরা ধারণা কর, \"আল্লাহ কখনও কাউকে (নবী হিসাবে)আবির্ভূত করবেন না, \n\n" +
                " ০৭২:০০৮] এবং আমরা (পাহাড়ের চুড়ায় উঠে)আকাশকে স্পর্শ করতে চেষ্টা করলাম কিন্তু সেটিকে সুতিক্ষ্ন প্রহরায়(উল্কাপতনে) পরিপূর্ণ দেখতে পেলাম, \n\n" +
                " ০৭২:০০৯] এবং আমরা (ওহী)শ্রবণের উদ্দেশ্য চুড়ার কতিপয় বসার স্থানে বসতাম। কিন্তু এখন যে কিছু শুনার প্রচেষ্টা করবে, সে নিজের জন্য এক উল্কাপিন্ডকে ওঁৎ পতে বসে থাকতে দেখবে, \n\n" +
                " ০৭২:০১০] এবং আমরা জানি না, স্থলের অধিবাসীদের জন্য কোন অমঙ্গলের ইচ্ছা করা হয়েছে, না তাদের ক্রমবিকাশক তাদের জন্য সুপথ প্রাপ্তির নির্দেশনা দানের সিদ্ধান্ত নিয়েছেন । \n\n" +
                " ০৭২:০১১] এবং আমাদের মধ্যে কেউ কেউ ভদ্রলোক এবং কেউ কেউ এর বিপরীত, আমরা বিভিন্ন মত ও পথে বিভক্ত। \n\n" +
                " ০৭২:০১২] এবং আমরা জানি, আমরা পৃথিবীতে আল্লাহকে(তাঁর পরিকল্পনার ক্ষেত্রে) ব্যর্থ করতে পারব না এবং পালিয়েও তাঁকে ব্যর্থ করতে পারব না, \n\n" +
                " ০৭২:০১৩] সুতরাং যখন আমরা সুপথ প্রাপ্তির নির্দেশনার বাণী শুনলাম তখন তা মেনে নিলাম। অতঃপর যে তার ক্রমবিকাশককে মেনে নেয় তার কোন ক্ষতি বা অবিচারের ভয় নেই। \n\n" +
                " ০৭২:০১৪] এবং আমাদের মধ্যে কেউ কেউ(আল্লাহর কাছে) সমর্পিত এবং কেউ কেউ অবাধ্য।\" এবং যারা সমর্পিত - এরাই সুপথ প্রাপ্তির নির্দেশনার অনুসন্ধান করে। \n\n" +
                " ০৭২:০১৫] এবং যারা অবাধ্য, আসলে তারাই অনুশোচনাকারী হবে। \n\n" +
                " ০৭২:০১৬] \"এবং যদি এরা(মক্কাবাসীরা) নির্দেশিত সঠিক পথে কায়েম থাকত তাহলে অবশ্যই তাদেরকে আমরা প্রচুর পানি সরবরাহ করতাম, \n\n" +
                " ০৭২:০১৭] যেন আমরা তাদেরকে তা দিয়ে পরীক্ষা করি।\" এবং যে ব্যক্তি তার ক্রমবিকাশকের স্মরণ থেকে বিমুখ হয়ে যাবে তাকে তিনি কঠিন দুঃখ-যন্ত্রণার পথে পরিচালিত করবেন। \n\n" +
                " ০৭২:০১৮] এবং নিশ্চই সকল সেজদা আল্লাহর জন্য, সুতরাং তোমরা আল্লাহর সংগে অন্য কাউকেও ডেকো না। \n\n" +
                " ০৭২:০১৯] এবং যখন আল্লাহর বান্দা তাঁকে(আল্লাহকে) ডাকার জন্য দন্ডায়মান হয় তখন তারা তাঁর (মুহাম্মদের) কাছে ভিড় জমিয়ে শ্বাসরোধ করার উপক্রম করে। \n\n" +
                " ০৭২:০২০] আপনি বলুন, \"আমি কেবল আমার ক্রমবিকাশককে ডাকি, এবং তাঁর সাথে কাউকেও পৃথকসত্বা কল্পনা করি না।\" \n\n" +
                " ০৭২:০২১] আপনি বলুন, \"তোমাদের অনিষ্ট সাধন বা তোমাদেরকে সুপথ প্রাপ্তির নির্দেশনা দানের কোন ক্ষমতাই আমার নেই।\" \n\n" +
                " ০৭২:০২২] আপনি বলুন, \"আল্লাহ থেকে আমাকে আদৌ কেউ রক্ষা করতে পারবে না, এবং তিনি ছাড়া আমি কখনও কোন আশ্রয়স্থল পাব না। \n\n" +
                " ০৭২:০২৩] (আমার দায়িত্ব) শুধু আল্লাহর পক্ষ থেকে আগত বাণী এবং সংবাদগুলো পৌঁছে দেয়া।\" এবং যে ব্যক্তি আল্লাহ ও তাঁর রসূলের(কুরআনের) অবাধ্য হয় নিশ্চই তার জন্য অনুতাপস্থলের আগুন রয়েছে, সে অবস্থায় সে দীর্ঘকাল থাকবে। \n\n" +
                " ০৭২:০২৪] যতক্ষণ পর্যন্ত না তারা তা চাক্ষুষ দেখতে পাবে, যার প্রতিশ্রুতি তাদেরকে দেয়া হচ্ছে, তখন তারা অবশ্যই জানবে যে, সাহায্যকারী হিসেবে অতি দুর্বল কারা এবং সংখ্যার দিক দিয়ে অতি কম কারা। \n\n" +
                " ০৭২:০২৫] আপনি বলুন, \"আমি জানি না, তোমাদের প্রতিশ্রুত বিষয় সন্নিকটে অথবা আমার ক্রমবিকাশক এর জন্যে কোন দীর্ঘ মেয়াদ নির্ধারণ করেছেন কিনা।\" \n\n" +
                " ০৭২:০২৬] তিনিই অদৃশ্য বিষয়ের পরিজ্ঞাতা, অতএব তিনি কারও উপর অজানা বিষয় বহুল পরিমাণে প্রকাশ করেন না, \n\n" +
                " ০৭২:০২৭] কিন্তু রসূল(কুরআন) ছাড়া, যাকে তিনি মনোনীত করেছেন। অতঃপর নিশ্চই তিনি তার সামনে ও পিছনে একদল প্রহরী(ফিরিশতা) পরিচালনা করেন, \n\n" +
                " ০৭২:০২৮] যেন তিনি জানেন, তারা(কুরআন ও প্রহরী ফেরেস্তারা) তাদের ক্রমবিকাশকের সংবাদগুলো সঠিকভাবে পৌছে দিয়েছে। বস্তুতঃ তিনি তাদের কাছে যা(বিধান-জ্ঞান) আছে সবকিছু পরিবেষ্টন করে আছেন, এবং প্রত্যেক বস্তুর সংখ্যা গুণে রেখেছেন। \n\n" +
                "</string>");
        editor.putString("71","পরিচ্ছেদ ০৭১.দৃশ্যঃ নুহ(সূরা নুহ Noah) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ২৯ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৭১:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৭১:০০১] নিশ্চই আমরা নূহকে তার জাতির কাছে এ নিদের্শ দিয়ে পাঠিয়েছিলাম, \"তুমি তোমার জাতিকে তাদের উপর যন্ত্রণাদায়ক দুঃখ-কষ্ট আসার পূর্বে সতর্ক কর।\" \n\n" +
                " ০৭১:০০২] সে বলল, \"হে আমার জাতি! নিশ্চই আমি তোমাদের জন্য একজন প্রকাশ্য সতর্ককারী, \n\n" +
                " ০৭১:০০৩] যেন তোমরা আল্লাহর ইবাদত কর এবং তাঁর(আদেশ পালনে) সচেতনতা অবলম্বন কর এবং আমার আনুগত্য কর, \n\n" +
                " ০৭১:০০৪] তিনি তোমাদেরকে তোমাদের পাপগুলো সংশোধন করবেন এবং তোমাদেরকে নির্ধারিত সময় পর্যন্ত অবকাশ দিবেন। যদি তোমাদের জ্ঞান থাকে তাহলে জেনে রাখ, \"যখন আল্লাহর নির্ধারিত সময় উপস্থিত হয় তখন তা বিলম্বিত হয় না।\" \n\n" +
                " ০৭১:০০৫] সে বলল, \"হে আমার ক্রমবিকাশক! আমি আমার জাতিকে দিবা-রাত্রি আহ্বান জানিয়েছি, \n\n" +
                " \n\n" +
                " ০৭১:০০৬] কিন্তু আমার আহ্বান তাদেরকে কেবল পলায়নে আরও বাড়িয়ে দিয়েছে, \n\n" +
                " ০৭১:০০৭] এবং যখনই আমি তাদেরকে আহ্বান জানিয়েছি যেন আপনি তাদেরকে সংশোধন করেন, তখনই তারা তাদের কানে আঙ্গুল দিয়ে রেখেছে, এবং তারা তাদের কাপড় টেনে নিজেদেরকে আচ্ছাদিত করেছে এবং(অস্বীকারে) জেদ ধরেছে এবং চরম অহংকার প্রদর্শন করেছে, \n\n" +
                " ০৭১:০০৮] অতঃপর আমি তাদেরকে উচ্চঃস্বরে(বক্তৃতার মাধমে) আহবান জানিয়েছি, \n\n" +
                " ০৭১:০০৯] অতঃপর আমি তাদের কাছে প্রকাশ্যে ঘোষণা করেছি এবং তাদেরকে গোপনে গোপনেও অনেক বুঝািয়েছি।\" \n\n" +
                " ০৭১:০১০] এবং আমি তাদেরকে বলেছি, \"তোমরা তোমাদের ক্রমবিকাশকের কাছে সংশোধন প্রার্থনা কর, নিশ্চই তিনি অতীব সংশোধনশীল, \n\n" +
                " ০৭১:০১১] তিনি তোমাদের উপর মুষলধারে বর্ষণশীল মেঘ পাঠাবেন, \n\n" +
                " ০৭১:০১২] এবং ধন-সম্পদ ও সন্তান-সন্ততি দিয়ে তোমাদেরকে সাহায্য করবেন এবং তোমাদের জন্য অনেক বাগান উৎপন্ন করবেন এবং তোমাদের জন্য অনেক নদী প্রবাহিত করবেন। \n\n" +
                " ০৭১:০১৩] তোমাদের কি হয়েছে যে, তোমরা আল্লাহর কাছ থেকে সম্মান-সম্ভ্রম-উৎকর্ষের আশা রাখ না? \n\n" +
                " ০৭১:০১৪] অথচ তিনি তোমাদেরকে(ক্রমবিকাশের ধারায়) বিভিন্ন আকার এবং অবস্থার মধ্য দিয়ে সৃষ্টি করেছেন। \n\n" +
                " ০৭১:০১৫] তোমরা কি লক্ষ্য কর না, আল্লাহ কিভাবে কোটি কোটি বায়ুমণ্ডল সৃষ্টি করেছেন একেকটি পৃথিবীর(দ্রঃ ৬৫:১২) উপর একেকটি? \n\n" +
                " ০৭১:০১৬] এবং প্রতিটিতে চন্দ্রকে জ্যোর্তিময় করে সৃষ্টি করেছেন এবং সূর্যকে প্রদীপাকারে সৃষ্টি করেছেন? \n\n" +
                " ০৭১:০১৭] এবং আল্লাহ তোমাদেরকে পৃথিবীগুলো থেকে উৎপন্ন করেছেন উদ্ভিদের বর্ধন-প্রক্রিয়ায়(উদ্ভিদ মাটি থেকে পুষ্টি শোষণ \n\n" +
                "করে এবং বায়ুমণ্ডল থেকে গ্যাস । মানুষও মাটি থেকে উৎপ্ন বস্তু আহার করে এবং বায়ুমণ্ডল থেকে গ্যাস) \n\n" +
                " ০৭১:০১৮] অতঃপর তিনি তোমাদেরকে সেগুলোতে ফিরিয়ে আনবেন(ভ্রূণাকারে জমা করবেন) এবং তিনি তোমাদেরকে সেখান থেকে বের করে আনবেন এবং অধিষ্ঠিত করবেন(স্থায়ী উপাদানে পূনর্জন্ম দিয়ে)। \n\n" +
                " ০৭১:০১৯] এবং আল্লাহই তোমাদের জন্য পৃথিবীগুলোকে বিস্তৃত করেছেন কোটি কোটি সংখ্যায়(দ্রঃ ৬৫:১২), \n\n" +
                " ০৭১:০২০] তোমাদেরকে সেগুলোতে অজস্র উপায়ে নির্দিষ্ট রীতিতে কাজ করার জন্যে।\" \n\n" +
                " ০৭১:০২১] নূহ বলেছিল, \"হে আমার ক্রমবিকাশক! তারা আমার অবাধ্যতা করেছে এবং এমন এক ব্যক্তির অনুসরণ করছে যার ধন-সম্পদ এবং সন্তান-সন্ততি তার ক্ষতি বৃদ্ধি ছাড়া আর কিছুই করে নাই, \n\n" +
                " ০৭১:০২২] এবং (আমার বিরুদ্ধে) তারা বিরাট ষড়যন্ত্র করেছে \n\n" +
                " ০৭১:০২৩] এবং তারা(পরস্পরকে) বলছে, তোমরা তোমাদের ইশ্বরদের কখনও পরিত্যাগ কোরও না, এবং পরিত্যাগ কোরও না ওয়াদ্দকে এবং না সুওয়া’আকে, এবং না ইয়াগুসকে ও ইয়া’উককে এবং নাসরকে। \n\n" +
                " ০৭১:০২৪] এবং তারা অনেক লোককে পথভ্রষ্ট করেছে, সুতরাং আপনি অন্যায়কারীদেরকে পথভ্রষ্টতা ছাড়া অন্য কিছুতে বৃদ্ধি করবেন না।\" \n\n" +
                " ০৭১:০২৫] তাদেরকে তাদের পাপাচারের কারণে নিমজ্জিত করা হল, অতঃপর তাদেরকে ফেলা হবে অনুতাপের আগুনে। তখন তারা নিজেদের জন্য আল্লাহ ছাড়া কাউকেও সাহায্যকারী পাবে না। \n\n" +
                " ০৭১:০২৬] এবং নূহ বলল, \"হে আমার ক্রমবিকাশক! আপনি ভূপৃষ্ঠে অস্বীকারকারীদের থেকে কোন গৃহবাসীকে ছাড়বেন না, \n\n" +
                " ০৭১:০২৭] কেননা, যদি আপনি তাদেরকে ছেড়ে দেন তাহলে তারা আপনার বান্দাদেরকে পথভ্রষ্ট করবে এবং তারা পাপাচারী এবং অস্বীকারকারী ছাড়া কাউকেও জন্ম দিবে না, \n\n" +
                " ০৭১:০২৮] হে আমার ক্রমবিকাশক! আপনি আমাকে, আমার পিতা মাতাকে এবং যে ব্যক্তি স্বীকারকারী হয়ে আমার গৃহে দাখিল হয় তাকে এবং সকল স্বীকারকারী পুরুষকে এবং সকল স্বীকারকারী নারীকে সংশোধন করুন, এবং অন্যায়কারীদেরকে ধ্বংস ছাড়া আর কিছুতে বৃদ্ধি করবেন না।\" \n\n" +
                "</string>");
        editor.putString("70","পরিচ্ছেদ ০৭০.দৃশ্যঃ মহাকাশ-স্টেশন(সূরা আল-মা’আরেজ The Space Station) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৪৫ আয়াত এবং ২ রুকূ আছে। \n\n" +
                "[০৭০:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                "[০৭০:০০১] একজন প্রশ্নকারী অবশ্যম্ভাবী দুঃখ-কষ্ট সম্বন্ধে প্রশ্ন করেছে- \n\n" +
                "[০৭০:০০২] অস্বীকারকারীদের জন্য। কেউই এর প্রতিরোধকারী নেই, \n\n" +
                "[০৭০:০০৩] আল্লাহর কাছ থেকে, যিনি মহাকাশ স্টেশনগুলোর অধিপতি। \n\n" +
                "[০৭০:০০৪] (প্রহরী)ফিরিশতারা এবং রূহুল কুদুস(জিবরাইল) তাঁর দিকে আরোহণ করে একদিনে(২৪ ঘন্টায়), যার পরিমাণ পঞ্চাশ হাজার বৎসর। (অর্থাৎ জিবরাইল-নভোযানের গতি প্রতি সেকেণ্ডে ৩৩,৮১,৯৩,৬৫০.৭৯৩৬৫০৮ মাইল, এবং তার ডকিং-স্টেশন লওহেমাহফুজ ২৯.২২৯ ট্রিলিয়ন মাইল । ৫০,০০০ হাজার বছরে পৃথিবীর অতিক্রান্ত দূরত্ব) \n\n" +
                "[০৭০:০০৫] সুতরাং আপনি ধৈর্য ধারণ করুন- উত্তম ধৈর্য। (মহকাশযানের গতি বৃদ্ধির চেষ্টা করুন) \n\n" +
                "[০৭০:০০৬] নিশ্চই তারা(অস্বীকারকারীরা) সেটিকে(মঙ্গলগ্রহ অভিযানকে) অনেক দূরে দেখছে।  \n\n" +
                "[০৭০:০০৭] কিন্তু আমরা দেখছি সেটিকে সন্নিকটে।  \n\n" +
                "[০৭০:০০৮] সেদিন আকাশ হবে গলিত-তরল তামার মত(মঙ্গলগ্রহের) ,  \n\n" +
                "[০৭০:০০৯] এবং পর্বতসাদৃশ নভোযানগুলো হবে বেলুনে মোড়া(যেন আছড়ে পড়লে ক্ষতি না হয়),  \n\n" +
                "[০৭০:০১০] এবং কোন বন্ধু কোন বন্ধুর সম্বন্ধে জিজ্ঞেস করবে না।  \n\n" +
                "[০৭০:০১১] (যদিও) তাদেরকে তাদের অবস্থা পরস্পর(পৃথিবীর বন্ধুদের)কে দেখানো হবে। প্রত্যেক (বিজ্ঞান-প্রযূক্তিতে পিছিয়ে থাকা)অপরাধী কামনা করবে, হায়! সে যদি সেদিন দূরাবস্থা থেকে রক্ষা পাওয়ার জন্য মুক্তিপন(ফিদিয়া) হিসেবে পেশ করতে পারত নিজ সন্তানদেরকে, \n\n" +
                "[০৭০:০১২] এবং তার স্ত্রীকে এবং তার ভাইকে,  \n\n" +
                "[০৭০:০১৩] এবং তার জাতি-গোষ্ঠীকে যারা তাকে আশ্রয় দিত, \n\n" +
                "[০৭০:০১৪] এবং ভূপৃষ্ঠে যারা আছে তাদের সকলকে, অতঃপর সে তা থেকে নিজেকে রক্ষা করতে পারত! \n\n" +
                "[০৭০:০১৫] কিন্তু কখনও হবে না, নিশ্চই এটি (মনের)আগুন ,  \n\n" +
                "[০৭০:০১৬] চামড়া পর্যন্ত তুলে নেয়ার মত দুঃখ-কষ্ট।  \n\n" +
                "[০৭০:০১৭] তা তাকে ডাকবে- যে পৃষ্ঠ প্রদর্শন করে এবং মুখ ফিরিয়ে নেয়।  \n\n" +
                "[০৭০:০১৮] এবং সে ধন-সম্পদ জমা করে এবং সেটিকে কুক্ষিগত করে রাখে(বিজ্ঞান-প্রযূক্তির উন্নয়নে কাজে লাগায় না)।  \n\n" +
                "[০৭০:০১৯] নিশ্চই মানুষকে অধৈর্য-চঞ্চল করে সৃষ্টি করা হয়েছে।  \n\n" +
                "[০৭০:০২০] যখন তাকে কোন ক্লেশ স্পর্শ করে, তখন সে হা-হুতাশ করে।  \n\n" +
                "[০৭০:০২১] এবং যখন তাকে কোন কল্যাণ স্পর্শ করে তখন সে কৃপণতা করে,  \n\n" +
                "[০৭০:০২২] কেবল মানুষে-মানুষে ভালবাসা স্থাপনকারী(সালাতকারী)রা ছাড়া,  \n\n" +
                "[০৭০:০২৩] যারা সবসময় মানুষে-মানুষে তাদের ভালবাসা(সালাত) স্থাপনরত থাকে, \n\n" +
                "[০৭০:০২৪] এবং তাদের ধন-সম্পদে রয়েছে নির্দিষ্ট অধিকার(হক)--  \n\n" +
                "[০৭০:০২৫] তাদের জন্যে, যারা(সাহায্য) চাইতে পারে, এবং তাদের জন্যেও যারা বঞ্চিত।  \n\n" +
                "[০৭০:০২৬] এবং যারা বিধান-সময়কালকে সত্যে পরিনত করে,  \n\n" +
                "[০৭০:০২৭] এবং যারা নিজেদের ক্রমবিকাশকের দেয়া দুঃখ-কষ্ট সম্বন্ধে ভীত-সন্ত্রস্ত থাকে- \n\n" +
                "[০৭০:০২৮] প্রকৃতপক্ষে তাদের ক্রমবিকাশকের দেয়া দুঃখ-কষ্ট থেকে কেউই নিরাপদ নয়- \n\n" +
                "[০৭০:০২৯] এবং তাদের মধ্যে যারা নিজেদের ইজ্জৎ-সম্মান রক্ষা করে(নারী বিষয়ক চিন্তা থেকে)- \n\n" +
                "[০৭০:০৩০] কেবল তাদের স্ত্রীদের অথবা তাদের বান্ধবীদের ছাড়া, যেহেতু এক্ষেত্রে তারা অপরাধ মুক্ত থাকবে,  \n\n" +
                "[০৭০:০৩১] কিন্তু যারা এর অতিরিক্ত (নারী বিষয়ক চিন্তা)করবে, তারা অবশ্যই সীমালংঘনকারী- \n\n" +
                "[০৭০:০৩২] এবং যারা তাদের কাছে গচ্ছিত বস্তু(আমানত) এবং তাদের অংগীকারগুলো সম্বন্ধে যত্নবান থাকে,  \n\n" +
                "[০৭০:০৩৩] এবং যারা নিজেদের সাক্ষ্যগুলোর উপর অটল থাকে \n\n" +
                "[০৭০:০৩৪] এবং যারা তাদের সালাতের(ভালবাসার) নিয়মানুবর্তিতা রক্ষা করে,  \n\n" +
                "[০৭০:০৩৫] এরাই জান্নাতগুলোতে সম্মানের সাথে থাকবে।  \n\n" +
                "[০৭০:০৩৬] অতএব তাদের কী হয়েছে, যারা অস্বীকার করছে, যে তারা(ক্রোধভরে)মাথা উঁচু করে তোমার দিকে দৌড়ে আসছে- \n\n" +
                "[০৭০:০৩৭] ডানদিক(আস্তিক) থেকে এবং বামদিক(নাস্তিক) থেকে দলবদ্ধভাবে? \n\n" +
                "[০৭০:০৩৮] তাদের মধ্যে প্রত্যেকে কি এটি চেয়েছে, তাকে অনুগ্রহেপূর্ণ জান্নাতে প্রবিষ্ট করা হবে?  \n\n" +
                "[০৭০:০৩৯] কখনও নয়, নিশ্চই আমরা তাদেরকে যা দিয়ে সৃষ্টি করেছি তা তারা জানে।  \n\n" +
                "[০৭০:০৪০] অতএব আমি অবশ্যই পূর্ব দিকগুলোর এবং পশ্চিম দিকগুলোর ক্রমবিকাশকের কথা বলছি , নিশ্চই আমরা সর্বশক্তিমান- \n\n" +
                "[০৭০:০৪১] এর উপরও যে, **তাদের স্থানে তাদের অপেক্ষা অধিকতর উত্তম(অন্য লোক) বদল করে আনি** এবং এ ব্যাপারে কেউই আমাদেরকে অক্ষম করতে পারবে না।  \n\n" +
                "[০৭০:০৪২] অতএব আপনি তাদেরকে ছেড়ে দিন, তারা তুচ্ছ গল্প-গুজবে এবং ক্রীড়া-কৌতুকে মত্ত থাকুক, এমনকি তারা সেদিনকে প্রত্যক্ষ করুক যার প্রতিশ্রুতি তাদেরকে দেয়া হয়েছে, \n\n" +
                "[০৭০:০৪৩] যেদিন তারা তাদের কবর থেকে দ্রুতগতিতে বের হয়ে আসবে যেন তারা লক্ষ্যস্থলের দিকে ছুটে চলেছে \n\n" +
                "[০৭০:০৪৪] তাদের চক্ষুগুলো অবনত থাকবে, লাঞ্ছনা তাদেরকে আচ্ছন্ন করে ফেলবে, এটিই সেই দিন, যেদিনের প্রতিশ্রুতি তাদেরকে দেয়া হয়েছিল। \n\n");
        editor.putString("69","এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৫৩ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৬৯:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৬৯:০০১] মহা বিজ্ঞান। \n\n" +
                " ০৬৯:০০২] কী সে মহা বিজ্ঞান? \n\n" +
                " ০৬৯:০০৩] এবং আপনাকে কিসে জানাবে, কী সে মহা বিজ্ঞান? \n\n" +
                " ০৬৯:০০৪] ‘সামূদ’ এবং ‘আদ’ জাতি পূর্বাভাষ-সংকেতকে মিথ্যা প্রতিপন্ন করেছিল। \n\n" +
                " ০৬৯:০০৫] অতএব, ‘সামূদ’ জাতির প্রকৃত অবস্থা হল, তাদেরকে এক প্রলয়ংকরি শব্দবোমা বিস্ফোরণ করে ধ্বংস করা হয়েছিল। \n\n" +
                " ০৬৯:০০৬] এবং ‘আদ’ জাতির প্রকৃত অবস্থা হল, তাদেরকে এক ভয়াবহ হিম-ঝঞ্ঝাবায়ু(Polar Cold Air-Mass) দিয়ে ধ্বংস করা হয়েছিল। \n\n" +
                " ০৬৯:০০৭] তিনি তাদেরকে সমূলে উৎপাটিত করার উদ্দেশ্যে ঐ ঝঞ্ঝা-বায়ুকে তাদের উপর অবিরাম সাত রাত এবং আট দিনের জন্য চালনা করেছিলেন, অতএব আপনি সে জাতিকে সেখানে ভূপতিত অবস্থায় দেখতে পাবেন যেন তারা ভূলুন্ঠিত খেজুর গাছের কাণ্ড। \n\n" +
                " ০৬৯:০০৮] অতএব আপনি কি তাদের কোন ধ্বংসাবশেষ দেখতে পাচ্ছেন? \n\n" +
                " ০৬৯:০০৯] এবং ফেরাউন ও তার পূর্ববর্তীরা এবং উৎপাটিত জনপদগুলোও মহা অপরাধ করেছিল। \n\n" +
                " ০৬৯:০১০] যেহেতু তারা তাদের ক্রমবিকাশকের রসূলকে অমান্য করেছিল, ফলে তিনি তাদেরকে ধৃত করলেন যা ক্রমান্বয়ে বৃদ্ধি পাচ্ছিল। \n\n" +
                " ০৬৯:০১১] এবং যখন(নূহের যুগে) ঝড়-জলোচ্ছাস(নিম্নচাপ) হয়েছিল, তখন নিশ্চই আমরা তোমাদেরকে এক আশ্রয়কেন্দ্রে আরোহণ করিয়েছিলাম, \n\n" +
                " ০৬৯:০১২] যেন আমরা সেটিকে তোমাদের জন্য এক শিক্ষামূলক নিদর্শন করে দিই এবং যেন শ্রবণকারী- কান সেটিকে শ্রবণ করে। \n\n" +
                " ০৬৯:০১৩] এবং যখন সংকেত ধ্বনিত হবে- কেবল একটি সংকেত। \n\n" +
                " ০৬৯:০১৪] এবং উৎক্ষেপন করা হবে পাহাড়সাদৃশ নভোযানগুলোকে ও ধুলোমাটি, এবং (সঠিকভাবে আস্তর করে) বিস্ফোরণের ধাক্কায়, মাত্র একটি বিস্ফোরণ। \n\n" +
                " ০৬৯:০১৫] অতএব সেসব দিনগুলোতে এ মহাঘটনা সংঘটিত হবে। \n\n" +
                " ০৬৯:০১৬] এবং মধ্যাকর্ষণ ছাড়িয়ে যাবে (প্রতি সেকেণ্ডে ৭ মাইলের বেশি গতিতে বিদীর্ণ হবে) এবং সেদিনগুলোতে তা(মধ্যাকর্ষণ ছাড়িয়ে যাওয়া) নমনীয় হয়ে পড়বে। \n\n" +
                " ০৬৯:০১৭] এবং ফিরিশতারা মধ্যাকর্ষণের প্রান্তে(জিরো-\"জি\"তে) অবস্থান করবে এবং সেদিন নিজেদের উপর আপনার ক্রমবিকাশকের সৃষ্টির-ভিত্তি(পানির নিউক্লিয়াস)কে বহন করবে আটজন (আটটি ইলেক্ট্রন, পানি-কনার অক্সিজেনের ৬টি ও দুটি হাইড্রোজেনের ২টি)। \n\n" +
                " ০৬৯:০১৮] সেদিন সবই তোমাদেরকে প্রদর্শন করা হবে, এবং কোনও গুপ্ত বিষয় তোমাদের কাছে গোপন থাকবে না। \n\n" +
                " ০৬৯:০১৯] অতঃপর যাকে তার কর্ম-গ্রন্থ(result sheet) তার ডান হাতে দেয়া হবে, সে (তার সংগীদেরকে) ডেকে বলবে, \"আস আমার কর্ম-গ্রন্থ(result sheet) পড়ে দেখ।\" \n\n" +
                " ০৬৯:০২০] আমার বিশ্বাস ছিল যে, নিশ্চই আমি আমার ফলাফল প্রত্যক্ষ করব। \n\n" +
                " ০৬৯:০২১] সুতরাং সে আনন্দময়, সন্তোষজনক জীবন যাপন করবে, \n\n" +
                " ০৬৯:০২২] সুমহান ও সমুন্নত জান্নাতে। \n\n" +
                " ০৬৯:০২৩] তার ফলরাশি ঝুঁকে নিকটবর্তী থাকবে (অর্থাৎ তাদের জন্য সহজলভ্য হবে)। \n\n" +
                " ০৬৯:০২৪] (তাদেরকে বলা হবে) \"অতীত দিনগুলিতে তোমরা যে ভালকাজ করেছ তার বিনিময়ে তোমরা পরম তৃপ্তির সাথে ভোজন কর ও পান কর।\" \n\n" +
                " ০৬৯:০২৫] কিন্তু যাকে তার কর্ম-গ্রন্থ(result sheet) বাম হাতে দেয়া হবে সে বলবে, \"হায় যদি আমাকে আমার কর্ম-গ্রন্থ(result sheet) না-ই দেয়া হত। \n\n" +
                " ০৬৯:০২৬] এবং যদি আমি জানতে না-ই পেতাম যে, আমার ফলাফল কী! \n\n" +
                " ০৬৯:০২৭] হায়! যদি তা(আমার মৃত্যু) আমাকে একেবারে শেষ করে দিত। \n\n" +
                " ০৬৯:০২৮] আমার ধন-সম্পদ(আজ) আমার কোন কাজেই লাগল না, \n\n" +
                " ০৬৯:০২৯] আমার অধিপত্য আমার থেকে নিঃশেষ হয়ে গেল।\" \n\n" +
                " ০৬৯:০৩০] (তখন ফিরিশতাদেরকে বলা হবে) \"তোমরা তাকে ধৃত কর এবং তার(টেস্টটিউবের) গলায় বেড়ি পরাও। \n\n" +
                " ০৬৯:০৩১] অতঃপর তাকে অনুতাপস্থলে ফেল , \n\n" +
                " ০৬৯:০৩২] অতঃপর তাকে ঝুলিয়ে দাও(সাকারে) শিকলে বেঁধে যার দৈর্ঘ ১০৫ ফুট বা সত্তর হাত। \n\n" +
                " ০৬৯:০৩৩] নিশ্চই সে মহামহিম আল্লাহকে এককসত্বা মানতো না, \n\n" +
                " ০৬৯:০৩৪] সে দরিদ্রদেরকে খাবার খাওয়াতো না(এবং অন্যকে উৎসাহ দিত না)।\" \n\n" +
                " ০৬৯:০৩৫] সুতরাং আজ এখানে তার কোন বন্ধু নেই, \n\n" +
                " ০৬৯:০৩৬] এবং অনূপ-উদ্ভিদ(mesenbryanthemum nodiflorum ) ছাড়া তার আর কোন খাদ্য নেই, \n\n" +
                " ০৬৯:০৩৭] এ খাদ্য কেবল অপরাধীরাই খাবে।’ \n\n" +
                " ০৬৯:০৩৮] আমি অবশ্যই তার(বিজ্ঞানের) কথা বলছি যা তোমরা দেখছ, \n\n" +
                " ০৬৯:০৩৯] এবং তারও(অনাবিস্কৃত বিজ্ঞান), যা তোমরা দেখছ না। \n\n" +
                " ০৬৯:০৪০] এটি(মহাবিজ্ঞান কুরআন) একজন সম্মানিত রসূলের বাণী \n\n" +
                " ০৬৯:০৪১] কোন কবির কাব্য নয়৷ তোমরা খুব অল্পই মেনে চল । \n\n" +
                " ০৬৯:০৪২] আর এটা কোন গণকের (তথাকথিত সংখ্যাতাত্বিক)গণনাও নয়৷ তোমরা স্মারক-বানী অল্পই অনুসরণ কর। \n\n" +
                " ০৬৯:০৪৩] এ মহাবিজ্ঞান মহাবিশ্বের ক্রমবিকাশকের পক্ষ থেকে অবতীর্ণ ৷ \n\n" +
                " ০৬৯:০৪৪] এবং যদি তিনি(এ নবী) নিজে কোনও কথা বানিয়ে আমাদের উপর আরোপ করতেন \n\n" +
                " ০৬৯:০৪৫] তাহলে আমরা তাঁকে ডানহাত দিয়ে অবরুদ্ধ করতাম \n\n" +
                " ০৬৯:০৪৬] অতঃপর আমরা কেটে দিতাম তার জীবন-শিরা ৷ \n\n" +
                " ০৬৯:০৪৭] তোমাদের কেউ-ই (আমাদেরকে) এ কাজ থেকে বিরত রাখতে পারতে না৷ \n\n" +
                " ০৬৯:০৪৮] এবং নিশ্চই এটি(কুরআন) সচেতনদের জন্য অবশ্যই একটি স্মারক-বানী। \n\n" +
                " ০৬৯:০৪৯] আমরা অবশ্যই জানি, তোমাদের মধ্য থেকে অনেকে আমার নিদর্শনাবলী প্রত্যাখ্যানকারী আছে \n\n" +
                " ০৬৯:০৫০] নিশ্চিতভাবে এগুলো অস্বীকারকারীদের জন্য আক্ষেপের কারন ৷ \n\n" +
                " ০৬৯:০৫১] এবং এটি অবশ্যই এক নিশ্চিত \"মহা বিজ্ঞান\" \n\n" +
                " ০৬৯:০৫২] সুতরাং আপনি আপনার মহা-মহিমান্বিত ক্রমবিকাশকের মালিকানা প্রতিষ্ঠার কাজ করুন।");
        editor.putString("68","পরিচ্ছেদ ০৬৮.দৃশ্যঃ কলম(সূরা আল-কালাম The Pen) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৫৩ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৬৮:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৬৮:০০১] বলছি দোয়াত ও কলমের কথা এবং যা তারা লিখে, \n\n" +
                " ০৬৮:০০২] আপনি আপনার ক্রমবিকাশকের পুরস্কারের কারনে উন্মাদ নন । \n\n" +
                " ০৬৮:০০৩] এবং নিশ্চই আপনার জন্য অশেষ পুরস্কার নির্ধারিত আছে। \n\n" +
                " ০৬৮:০০৪] এবং নিশ্চই আপনি অতীব মহান চরিত্রের উপর অধিষ্ঠিত \n\n" +
                " ০৬৮:০০৫] অতএব আপনি অচিরেই দেখবেন এবং তারাও দেখবে- \n\n" +
                " ০৬৮:০০৬] আপনাদের মধ্যে কে বিকারগ্রস্থ? \n\n" +
                " ০৬৮:০০৭] নিশ্চই আপনার ক্রমবিকাশক তাকেও সমধিক জানেন, যে তাঁর পথ থেকে বিচ্যুত হয়ে গেছে, এবং তিনি সুপথ প্রাপ্তির নির্দেশনা প্রাপ্তদেরকেও সমধিক জানেন। \n\n" +
                " ০৬৮:০০৮] অতএব আপনি মিথ্যা প্রতিপন্নকারীদের আনুগত্য করবেন না। \n\n" +
                " ০৬৮:০০৯] আসলে তারা চায়, যদি আপনি নমনীয় হন তাহলে তারাও নমনীয় হবে। \n\n" +
                " ০৬৮:০১০] এবং আপনি আনুগত্য করবেন না-পরম লাঞ্ছিত অধিক শপথকারীর, \n\n" +
                " ০৬৮:০১১] পিছনে পরম নিন্দকারীর, ভীষণ কুৎসা রটনাকারীর, \n\n" +
                " ০৬৮:০১২] ভালকাজে অধিক বাধাদানকারীর, সীমাতিক্রমকারীর, পাপাচারীর, \n\n" +
                " ০৬৮:০১৩] যে রূঢ় স্বভাব বিশিষ্ট, এর পরও হৃদয়হীন, \n\n" +
                " ০৬৮:০১৪] একমাত্র এজন্যে যে, সে ধন-সম্পদ এবং সন্তান-সন্ততির অধিকারী, \n\n" +
                " ০৬৮:০১৫] যখন তার কাছে আমাদের আয়াতগুলো আবৃত্তি করা হয়, তখন সে বলে, \"এগুলো পূর্ববর্তীদের কিচ্ছা কাহিনী।\" \n\n" +
                " ০৬৮:০১৬] অচিরেই আমরা তার লম্বা নাকের উপর দাগ দিব। \n\n" +
                " ০৬৮:০১৭] নিশ্চই আমরা তাদেরকে পরীক্ষা করব যেভাবে উদ্যানের অধিকারীদেরকে পরীক্ষা করেছিলাম, যখন তারা শপথ করেছিল যে, অবশ্যই তারা ভোরে ভোরে বাগানের সব ফল পেড়ে আনবে। \n\n" +
                " ০৬৮:০১৮] এমন কি তারা আল্লাহর নাম নেয় নাই(‘অর্থাৎ আল্লাহর মালিকানা ঘোষণা করে নাই)। \n\n" +
                " ০৬৮:০১৯] ফলে আপনার ক্রমবিকাশক থেকে এক ঘূর্ণিবায়ু(tornado) তার উপর দিয়ে বয়ে গেল এমন অবস্থায় যখন তারা নিদ্রিত ছিল। \n\n" +
                " ০৬৮:০২০] অতঃপর প্রভাতে তা কর্তিত বাগানের মত হয়ে গেল। \n\n" +
                " ০৬৮:০২১] অতঃপর তারা একে অপরকে প্রভাতে ডেকে বলল- \n\n" +
                " ০৬৮:০২২] \"তোমরা ভোরে ভোরে নিজেদের ক্ষেতে যাও যদি তোমাদের ফল পাড়ার ইচ্ছা থাকে।\" \n\n" +
                " ০৬৮:০২৩] অতঃপর তারা চলল এবং তারা চুপি চুপি কথা বলতে লাগল- \n\n" +
                " ০৬৮:০২৪] \"আজ যেন তোমাদের ক্ষেতে কোনও গরিব লোক মোটেও প্রবেশ না করতে পারে।\" \n\n" +
                " ০৬৮:০২৫] এভাবে তারা ভোরে ভোরে কৃপণতার সংকল্প করে অগ্রসর হল, \n\n" +
                " ০৬৮:০২৬] কিন্তু যখন তারা তা দেখল, তখন তারা বলল, \"আমরা নিশ্চই পথ ভুলে গেছি! \n\n" +
                " ০৬৮:০২৭] বরং প্রকৃত পক্ষে আমরা(আমাদের ফল থেকে) সম্পূর্ণ বঞ্চিত।\" \n\n" +
                " ০৬৮:০২৮] তাদের সর্বোত্তম লোকটি বলল, \"আমি কি তোমাদেরকে বলি নাই, কেন তোমরা তোমাদের ক্রমবিকাশকের প্রদত্ত নিয়মে কাজ করছ না?\" \n\n" +
                " ০৬৮:০২৯] তারা বলল, \"আমাদের ক্রমবিকাশক সকল প্রকার ত্রুটি থেকে মুক্ত ! নিশ্চই আমরাই অন্যায়কারী ছিলাম।\" \n\n" +
                " ০৬৮:০৩০] অতঃপর তারা পরস্পরকে তিরস্কার করে একে অপরের প্রতি মনোনিবেশ করল। \n\n" +
                " ০৬৮:০৩১] তারা বলল, \"পরিতাপ আমাদের জন্য ! নিশ্চই আমরাই বিদ্রোহী ছিলাম, \n\n" +
                " ০৬৮:০৩২] (যদি আমরা তাঁর দিকে ফিরি) অচিরেই আমাদের ক্রমবিকাশক আমাদেরকে এর পরিবর্তে এরচেয়ে উৎকৃষ্টতর দান করবেন, নিশ্চই আমরা আমাদের ক্রমবিকাশকের কাছে সবিনয়ে অনবত হচ্ছি।\" \n\n" +
                " ০৬৮:০৩৩] এভাবেই দুঃখকষ্ট নেমে আসে। এবং নিশ্চই পরকালের দুঃখকষ্ট গুরুতর। হায় যদি তারা জানত! \n\n" +
                " ০৬৮:০৩৪] নিশ্চই সচেতনদের জন্য তাদের ক্রমবিকাশকের সন্নিধানে পুরস্কারে ভরপুর বাগানগুলো রয়েছে। \n\n" +
                " ০৬৮:০৩৫] তবে কি আমরা সমর্পিতদেরকে অপরাধীদের মত করে দিব? \n\n" +
                " ০৬৮:০৩৬] তোমাদের কী হয়েছে? তোমরা কিভাবে বিচার করছ? \n\n" +
                " ০৬৮:০৩৭] তোমাদের কাছে কি এমন কোন গ্রন্থ আছে যাতে তোমরা একথা পড়ছ, \n\n" +
                " ০৬৮:০৩৮] যে, তোমরা যা চাইবে অবশ্যই তা তোমরা তাতে পাবে? \n\n" +
                " ০৬৮:০৩৯] অথবা তোমাদের জন্য কি আমাদের দায়িত্বে এমন কোন বাধ্যবাধকতামূলক চুক্তি আছে যা প্রতিফল দিবস পর্যন্ত বলবৎ থাকবে এবং তোমরা যা কিছু আদেশ করবে সেগুলোই তোমরা পাবে? \n\n" +
                " ০৬৮:০৪০] আপনি তাদেরকে জিজ্ঞেস করুন, তাদের মধ্যে কে এ কথার জন্য জিম্মাদার। \n\n" +
                " ০৬৮:০৪১] অথবা তাদের জন্য কি পৃথকসত্তারা(পীর-পুরোহিত-যাযক-হুজুররা) আছে? তাহলে তারা তাদের পৃথকসত্তাদেরকে উপস্থিত করুক, যদি তারা সত্যবাদী হয়। \n\n" +
                " ০৬৮:০৪২] সেদিন চরম সংকট ঘনিয়ে আসবে, এবং তাদেরকে সেজদার জন্য আহবান করা হবে, কিন্তু তারা(সেজদা করতে) সমর্থ হবে না, \n\n" +
                " ০৬৮:০৪৩] তাদের চোখগুলি(লজ্জায়) অবনত হবে, এবং লাঞ্ছনা তাদেরকে আচ্ছন্ন করবে, অথচ তাদেরকে(ইতোপূর্বে) সেজদার জন্য আহবান করা হত যখন তারা নিরাপদ ও সুস্থ ছিল। \n\n" +
                " ০৬৮:০৪৪] অতএব(উপযুক্ত ব্যবস্থা গ্রহণ করার জন্য) আপনি আমাকে এবং তাদেরকে ছেড়ে দিন, যারা এ বাণীকে মিথ্যা প্রতিপন্ন করে, আমরা অচিরেই তাদেরকে ধ্বংসের দিকে এমন স্থান থেকে ধাপে ধাপে টেনে আনব যা তারা জানতেও পারবে না। \n\n" +
                " ০৬৮:০৪৫] এবং আমি তাদেরকে দীর্ঘ অবকাশ দিব, নিশ্চই আমার কৌশল অত্যাধিক দৃঢ়, নিশ্চিত। \n\n" +
                " ০৬৮:০৪৬] আপনি কি তাদের কাছে কোন প্রতিদান চাচ্ছেন যার ফলে তারা দণ্ড-ভারে ভারাক্রান্ত? \n\n" +
                " ০৬৮:০৪৭] অথবা তাদের কাছে অজানা কোন জ্ঞান আছে কি, যে তারা তা লিখছে? \n\n" +
                " ০৬৮:০৪৮] সুতরাং আপনি আপনার ক্রমবিকাশকের আদেশের উপর ধৈর্য সহকারে প্রতিষ্ঠিত থাকুন এবং আপনি সেই মৎস-সঙ্গীর(ইউনুসের) মত হবেন না যখন যে বিষন্ন চিত্তে(নিজ ক্রমবিকাশককে) ডেকেছিল। \n\n" +
                " ০৬৮:০৪৯] যদি তার কাছে তার ক্রমবিকাশকের পুরস্কার না পৌঁছাত তাহলে নিশ্চই সে এক নির্জন মরু-প্রান্তরে নিক্ষিপ্ত হত এবং সে লোকের দৃষ্টিতে তিরস্কৃত হত। \n\n" +
                " ০৬৮:০৫০] কিন্তু তার ক্রমবিকাশক তাকে মনোনীত করলেন এবং তাকে সৎমর্কমশীল বান্দাদের অর্ন্তভুক্ত করলেন। \n\n" +
                " ০৬৮:০৫১] এবং যারা অস্বীকার করেছে তারা যখন এ স্মারক-বাণী শ্রবণ করে তখন নিশ্চই তারা(রোষভরা) দৃষ্টি দিয়ে পারলে আপনাকে স্থানচ্যুত করে ফেলত এবং তারা বলে, \"এ ব্যক্তি নিশ্চই পাগল।\" \n\n" +
                " ০৬৮:০৫২] অথচ এটি(কুরআন) সকল বিশ্ববাসীর জন্য সম্মান-সূচক উপদেশ বাণী ছাড়া কিছুই নয়।");
editor.putString("67","পরিচ্ছেদ ০৬৭.দৃশ্যঃ সার্বভৌমত্ব(সূরা আল-মুলক The sovereignty) \n\n" +
        "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৩১ আয়াত এবং ২ রুকূ আছে। \n\n" +
        " ০৬৭:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
        " ০৬৭:০০১] পরম কল্যাণময় তিনি, যাঁর হাতে সকল সার্বভৌমত্ব, এবং তিনিই সকল বস্তুর পরিমিত পরিমাপ নিরুপনে সক্ষম, \n\n" +
        " ০৬৭:০০২] যিনি সৃষ্টি করেছেন মৃত্যুকে এবং জীবনকে যেন তিনি তোমাদেরকে পরীক্ষা করেন -তোমাদের মধ্যে কে কাজে উত্তম, যেহেতু তিনি ভালবাসাকনিকার মহাসমূদ্র, অত্যন্ত সংশোধনশীল, \n\n" +
        " ০৬৭:০০৩] যিনি সৃষ্টি করেছেন কোটি কোটি বায়ুমণ্ডল একেকটি পৃথিবীর উপর একেকটি করে , আপনি রহমান আল্লাহর সৃষ্টির মধ্যে কোন অসামঞ্জস্য দেখতে পাবেন না। অতঃপর আপনি পুনরায় দৃষ্টি নিবদ্ধ করুন। আপনি কি কোন ত্রুটি-বিচ্যুতি দেখতে পাচ্ছেন? \n\n" +
        " ০৬৭:০০৪] অতঃপর আপনি পুনঃ পুনঃ দৃষ্টি নিবদ্ধ করুন, আপনার দৃষ্টি ব্যর্থ হয়ে আপনার কাছে ফিরে আসবে অতি শ্রান্ত-ক্লান্ত অবস্থায়। \n\n" +
        " ০৬৭:০০৫] এবং নিশ্চই আমরা এ পৃথিবীর সন্নিহিত মহাকাশকে বহু জ্যোতিষ্ক দিয়ে সাজিয়েছি , এবং আমরা সৃষ্টি করেছি মিসাইল শয়তানকে আঘাত করার জন্য, এবং আমরা তাদের জন্য প্রস্তুত করে রেখেছি প্রজ্জুলিত আগুনের গোলা। \n\n" +
        " ০৬৭:০০৬] এবং যারা তাদের ক্রমবিকাশককে অস্বীকার করেছে তাদের জন্য রয়েছে অনুতাপের আগুনে দহন, এবং তা অতি নিকৃষ্ট প্রত্যাবর্তন স্থল \n\n" +
        " ০৬৭:০০৭] যখন তাদেরকে সেখানে নিক্ষেপ করা হবে তখন তারা সেটির গর্জন শুনতে পাবে, এবং সেটি তখন উথলাতে থাকবে \n\n" +
        " ০৬৭:০০৮] সেটি ক্রোধে ফেটে পড়ার উপক্রম হবে। যখনই কোনও দল সেটিতে নিক্ষিপ্ত হবে তার প্রহরীরা তাদেরকে জিজ্ঞেস করবে, \"তোমাদের কাছে কি কোনও সতর্ককারী আসে নাই?\" \n\n" +
        " ০৬৭:০০৯] তারা বলবে, \"হ্যাঁ, নিশ্চই আমাদের কাছে সতর্ককারী এসেছিল কিন্তু আমরা তাদেরকে মিথ্যা প্রতিপন্ন করেছিলাম এবং আমরা বলেছিলাম আল্লাহ কিছুই অবতীর্ণ করেন নাই, তোমরা অবশ্যই স্পষ্ট বিভ্রান্তিতে নিপতিত ছাড়া কেউ নও,\" \n\n" +
        " ০৬৭:০১০] এবং তারা আরও বলবে, \"যদি আমরা শুনতাম এবং অনুধাবন করতাম তাহলে আমরা প্রজ্জলিত আগুনের অধিবাসীদের অন্তর্ভূক্ত হতাম না।\" \n\n" +
        " ০৬৭:০১১] এভাবে তারা নিজেদের অপরাধগুলো স্বীকার করবে, অতএব প্রজ্জুলিত আগুনের অধিবাসীদের জন্য অমঙ্গল অবধারিত। \n\n" +
        " ০৬৭:০১২] নিশ্চই যারা না দেখেও তাদের ক্রমবিকাশকের প্রতি বিনয়ী থাকে- তাদের জন্য রয়েছে সংশোধন এবং বৃহত্তম পুরস্কার। \n\n" +
        " ০৬৭:০১৩] এবং তোমরা তোমাদের কথা গোপনে বল অথবা প্রকাশ্যে বল, নিশ্চই তিনি তাও উত্তমভাবে জানেন যা মনের মধ্যে থাকে। \n\n" +
        " ০৬৭:০১৪] যিনি সৃষ্টি করেছেন, তিনি কি জানেন না? যেহেতু তিনি সুক্ষাতিসুক্ষ কনা(যা দিয়ে মহাবিশ্বের সকল কিছু সৃষ্টি), সর্বজ্ঞতা। \n\n" +
        " ০৬৭:০১৫] তিনিই তোমাদের জন্য পৃথিবীগুলোকে জয়-করে-বসবাসের উপযোগী করেছেন, সুতরাং তোমরা আবিস্কারের অভিযান কর এবং সেগুলোতে থাকা জীবিকা(ফল-ফসল) থেকে আহার কর। এবং তাঁর দিকেই হবে পুনরুত্থান। \n\n" +
        " ০৬৭:০১৬] তোমরা কি নিরাপত্তা অনুভব করছ না, যখন তিনি তোমাদেরকেসহ পৃথিবীগুলোকে বায়ুমমণ্ডলগুলো দিয়ে আবৃত করে দেন, তখন সেগুলো জীবন(পরমায়ু) লাভ করে ? \n\n" +
        " ০৬৭:০১৭] অথবা তোমরা কি নিরাপদ থাকবে যদি তিনি আকাশ থেকে তোমাদের উপর বসন্তের-জীবানু পাঠান? তখন তোমরা জানতে পারবে কেমন ছিল আমার সতর্কীকরণ ! \n\n" +
        " ০৬৭:০১৮] এবং নিশ্চই যারা তাদের পূর্বে ছিল তারাও(আমাদের রসূলদেরকে) মিথ্যা প্রতিপন্ন করেছিল, তখন কেমন ভয়ঙ্কর ছিল আমার শাস্তি? \n\n" +
        " ০৬৭:০১৯] তারা কি তাদের উর্ধ্বাকাশে পাখি (বর্তমানে কৃত্তিম উপগ্রহ বা স্যাটেলাইট) গুলিকে দেখে না যে, তারা কিভাবে ডানা বিস্তার করে উড়ছে এবং গুটিয়ে নিচ্ছে? দয়াময় আল্লাহ ছাড়া কেউ তাদেরকে ধরে রাখছে না। নিশ্চই তিনি সকল বিষয়ে সর্বদ্রষ্টা। \n\n" +
        " ০৬৭:০২০] এমন লোক, যারা তোমাদের সৈন্য-বাহিনী, রহমান আল্লাহর বিরুদ্ধে তোমাদেরকে কী সাহায্য করতে পারবে? অস্বীকারকারীরা শুধু আত্মপ্রতারণায় পড়ে আছে। \n\n" +
        " ০৬৭:০২১] অথবা সে এমন কে যে তোমাদেরকে জীবিকা দিবে, যদি তিনি তাঁর জীবিকাদান বন্ধ করে দেন? প্রকৃত পক্ষে তারা অবাধ্যতা ও ঘৃণায় অবিচল। \n\n" +
        " ০৬৭:০২২] যে ব্যক্তি মুখমন্ডলের উপর পড়ে চলে অর্থাৎ মনমরা হয়ে চলে সে হেদায়াত প্রাপ্ত, নাকি যে ঊর্ধ্বগামী-সরল পথে সোজা হয়ে চলে সে ? \n\n" +
        " ০৬৭:০২৩] আপনি বলুন, \"তিনিই তোমাদেরকে সৃষ্টি করেছেন এবং তোমাদের জন্য কান, চোখ এবং মন সৃষ্টি করেছেন। তোমরা অল্পই কৃতজ্ঞতা প্রকাশ কর।\" \n\n" +
        " ০৬৭:০২৪] আপনি বলুন, \"তিনিই তোমাদেরকে (মহাকাশ বিজয় দিয়ে) পৃথিবীগুলোতে সম্প্রসারিত করছেন এবং তাঁরই সামনে তোমাদেরকে সমাবেত করা হবে।\" \n\n" +
        " ০৬৭:০২৫] এবং তারা বলে, \"যদি তোমরা সত্যবাদী হয়ে থাক তাহলে এ প্রতিশ্রুতি কখন পূর্ণ হবে?’ \n\n" +
        " ০৬৭:০২৬] আপনি বলুন, \"এর জ্ঞান একমাত্র আল্লাহর কাছে আছে, এবং আমি একজন প্রকাশ্য সতর্ককারী মাত্র।\" \n\n" +
        " ০৬৭:০২৭] অতঃপর যখন তারা তা(মহাকাশ বিজয়) কাছে দেখতে পাবে, তখন যারা অস্বীকার করতো তাদের মুখমন্ডল মলিন হবে, এবং বলা হবে, \"এটিই তা(মহাকাশ বিজয়) যার জন্য তোমরা বার বার দাবী জানাতে।\" \n\n" +
        " ০৬৭:০২৮] আপনি বলুন, \"তোমরা কি ভেবে দেখেছ, যদি আল্লাহ আমাকে এবং যারা আমার সাথে আছে তাদেরকে ধ্বংস করে দেন অথবা আমাদের উপর দয়া করেন, তাহলে কে অস্বীকারকারীদেরকে সতর্ক করবে যন্ত্রণাদায়ক দুঃখ-কষ্ট থেকে?\" \n\n" +
        " ০৬৭:০২৯] আপনি বলুন, \"তিনিই অযাচিত-অসীম দাতা, তাঁকে আমরা এককসত্তা মেনে নিয়েছি এবং তাঁর উপরই আমরা আস্থা স্থাপন করি। এবং অচিরেই তোমরা জানতে পারবে, কে প্রকাশ্য ভ্রান্তিতে পড়ে আছে।\" \n\n" +
        " ০৬৭:০৩০] আপনি বলুন, \"তোমরা কি ভেবে দেখেছ যদি তোমাদের(সব) পানি ভূগর্ভে শোষিত হয়ে যায়, তাহলে কে আছে যে তোমাদের জন্য প্রবহমান পানি এনে দিবে?\" \n\n" +
        "</string>");
        editor.putString("66","পরিচ্ছেদ ০৬৬.দৃশ্যঃ নিষেধাজ্ঞা(সূরা আত-তাহরীম The Prohibition) \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ১৩ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৬৬:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৬৬:০০১] হে নবীজী ! আপনি কেন তা অবৈধ ঘোষণা করছেন যা আল্লাহ আপনার জন্য বৈধ করেছেন, আপনি আপনার স্ত্রীদের সন্তুষ্টি কামনা করছেন? অতএব আল্লাহ অত্যন্ত সংশোধনশীল, এককসত্তা দয়াময়। \n\n" +
                " ০৬৬:০০২] আল্লাহ অবশ্যই আপনাদের জন্য আপনাদের(এমন) শপথগুলোকে ভেঙ্গে ফেলা আবশ্যক করেছেন, যেহেতু আল্লাহ আপনাদের অভিভাবক এবং তিনি সর্বজ্ঞানী, মহাবিজ্ঞানী। \n\n" +
                " ০৬৬:০০৩] এবং যখন নবীজী তাঁর স্ত্রীদের মধ্যে কোন একজনের কাছে সংগোপনে একটি কথা বলেছিলেন, অতঃপর সে যখন তা অন্যকে বলেছিল এবং আল্লাহ নবীজীর কাছে তা প্রকাশ করে দিলেন, তখন তিনি তার কিছু অংশ(স্ত্রীকে) জানিয়ে দিলেন এবং কিছু অংশ এড়িয়ে গেলেন। অতঃপর যখন তিনি তাকে(স্ত্রীকে) সে খবর দিলেন তখন সে(স্ত্রী) বলল, \"আপনাকে কে এ সংবাদ দিয়েছে?\" তিনি বললেন, \"সর্বজ্ঞানী, সর্ববিদিত আল্লাহ আমাকে এ সংবাদ দিয়েছেন।\" \n\n" +
                " ০৬৬:০০৪] যদি তোমরা উভয়ে আল্লাহর দিকে প্রত্যাবর্তন কর- তোমাদের মন অবশ্য আগে থেকেই এর জন্য ঝুঁকে আছে-(এটি তোমাদের জন্য কল্যাণজনক হবে), কিন্তু যদি তোমরা তাঁর(রসূলের) বিরুদ্ধে একে অন্যের পৃষ্ঠপোষকতা কর, তাহলে জেনে রাখ, আল্লাহই তাঁর অভিভাবক, এবং জিবরাঈল এবং সকল সৎকর্মপরায়ণ স্বীকারকারীরাও এবং এছাড়া সকল ফিরিশতাও(তাঁর) পৃষ্ঠপোষক। \n\n" +
                " ০৬৬:০০৫] যদি তিনি তোমাদেরকে বিচ্ছিন্ন করে দেন, তাহলে অচিরেই তাঁর ক্রমবিকাশক তাঁকে তোমাদের পরিবর্তে তোমাদের চাইতে উৎকৃষ্টতর স্ত্রী দান করবেন- সমর্পণকারিণী, স্বীকারকারিনী, আনুগত্যকারিনী, তওবাকারিণী, ইবাদতকারিণী, সিয়াম পালনকারিণী, বিধবা এবং কুমারী মহিলাদের থেকে। \n\n" +
                " ০৬৬:০০৬] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ ! তোমরা নিজদেরকে এবং তোমাদের পরিবার-পরিজনদেরকে আগুন থেকে রক্ষা কর, যার জ্বালানী হবে *মানুষ এবং পাথর*, যার উপর নির্মম ও কঠোর ফিরিশতারা নিয়োজিত থাকবে, আল্লাহ তাদেরকে যে আদেশ দেন তারা তা অমান্য করে না এবং তারা তা-ই করে যা তাদেরকে আদেশ দেয়া হয়েছে। \n\n" +
                " ০৬৬:০০৭] হে যারা অস্বীকার করেছ ! আজ তোমরা কোনও কারন দর্শাবে না, তোমাদেরকে শুধু সেই কাজেরই প্রতিফল দেয়া হচ্ছে যা তোমরা করতে। \n\n" +
                " ০৬৬:০০৮] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ ! তোমরা আল্লাহর দিকে প্রত্যাবর্তন কর- খাঁটি প্রত্যাবর্তন। অচিরেই তোমাদের ক্রমবিকাশক তোমাদের কাজের ক্ষতিকর দিকগুলো তোমাদের থেকে দূরীভূত করে দিবেন, এবং তোমাদেরকে এমন জান্নাতগুলোতে প্রবিষ্ট করবেন যার তলদেশ দিয়ে পানির অব্যাহত সরবরাহ থাকবে, সেদিন আল্লাহ এ নবীজীকে এবং তাদেরকে, যারা তাঁর সাথে আল্লাহর এককসত্তা মেনে নিয়েছে, অপমানিত করবেন না। তাদের নূর তাদের সামনে এবং তাদের ডান দিকে ছুটতে থাকবে, তারা বলবে, \"হে আমাদের ক্রমবিকাশক ! আমাদের জন্য আমাদের নূরকে পূর্ণ করুন, এবং আমাদেরকে সংশোধন করুন, নিম্চই আপনি সকল কিছুর পরিমিত-পরিমাপ নিরুপন করতে সক্ষম।\" \n\n" +
                " ০৬৬:০০৯] হে নবীজী ! আপনি অস্বীকারকারী এবং দ্বিধাগ্রস্থ(মোনাফেক)দের বিরুদ্ধে প্রচেষ্টা(জিহাদ) করুন এবং তাদের ব্যাপারে কঠোর হৌন, যেহেতু তাদের আবাসস্থল হচ্ছে অনুতাপস্থল(জাহান্নাম, waiting-room), এবং কতই না নিকৃষ্ট এ প্রত্যাবর্তন স্থল। \n\n" +
                " ০৬৬:০১০] যারা অস্বীকার করেছে, তাদের জন্য আল্লাহ নূহের স্ত্রী এবং লূতের স্ত্রীকে উপমা হিসেবে বর্ণনা করেছেন। তারা উভয়ে আমাদের বান্দাদের মধ্য থেকে দুজন সৎবান্দার সাথে বিবাহ-বন্ধনে আবদ্ধ ছিল, কিন্তু উভয় স্ত্রী তাদের(স্বামীদের) সাথে বিশ্বাসঘাতকতা করেছিল। ফলে তারা উভয়ে(স্বামীরা) আল্লাহর বিপক্ষে তাদের কোন উপকারে লাগল না এবং বলা হবে, \"তোমরা উভয়ে আগুনে প্রবেশকারীদের সাথে প্রবেশ কর।\" \n\n" +
                " ০৬৬:০১১] এবং যারা আল্লাহকে এককসত্বা মেনে নিয়েছে তাদের জন্য আল্লাহ ফেরাউনের স্ত্রীকে উপমা হিসেবে বর্ণনা করেছেন, যখন সে বলেছিল, \"হে আমার ক্রমবিকাশক ! আপনি আমার জন্য আপনার কাছে জান্নাতের মধ্যে একটি ঘর নির্মাণ করুন, এবং ফেরাউন এবং তার কার্যকলাপ থেকে আমাকে উদ্ধার করুন এবং আমাকে এ অন্যায়কারী-জাতি থেকে উদ্ধার করুন।\" \n\n" +
                " ০৬৬:০১২] এবং ইমরানের কন্যা মরিয়মকে(উপমা স্বরূপ বর্ণনা করেছেন), যে নিজ সতীত্বকে রক্ষা করেছিল এবং আমরা তার (জরায়ুতে থাকা ভ্রূণের)মধ্যে আমাদের আদেশ-বাণী দিলাম এবং সে সত্যায়ন করেছিল তার ক্রমবিকাশকের বাণীগুলোর, এবং তাঁর গ্রন্থগুলোর, এবং সে অনুগতদের অর্ন্তভুক্ত ছিল। \n\n" +
                "</string>");
        editor.putString("65","রিচ্ছেদ ০৬৫.দৃশ্যঃ বিচ্ছেদ(সূরা আত-তালাক The separation) \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ১৩ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৬৫:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৬৫:০০১] হে নবীজী ! যখন আপনারা স্ত্রীদেরকে বিচ্ছিন্ন করেন, তখন তাদেরকে তাদের নির্ধারিত সময়-কাল(স্বামীর বাড়িতে পৃথক বিছানায় ৪মাস) অনুযায়ী বিচ্ছিন্ন করবেন এবং সময়-কাল গণনা করতে থাকুন এবং আপনাদের ক্রমবিকাশক আল্লাহর সচেতনতা অবলম্বন করুন। তাদেরকে তাদের ঘর থেকে বের করে দিবেন না এবং তারাও যেন বের হয়ে না যায়, যদি না তারা প্রকাশ্যে কোন অশ্লীল কাজ করে। অতএব এগুলো আল্লাহর নির্ধারিত সীমা, এবং যে আল্লাহর সীমাগুলো লংঘন করে বস্তুতঃ সে নিজের উপরই অন্যায় করে। আপনি জানেন না, হয়তো আল্লাহ এর পর নতুন অবস্থার সৃষ্টি করে দিবেন। \n\n" +
                " ০৬৫:০০২] অতঃপর যখন তারা তাদের নির্ধারিত সময়-কালের শেষ সীমায় উপনীত হয় তখন আপনারা হয় তাদেরকে ন্যায় সংগতভাবে রাখুন অথবা ন্যায় সংগতভাবে বিদায় করে দিন, এবং আপনাদের মধ্য থেকে দুজন ন্যায়পরায়ণ ব্যক্তিকে সাক্ষী রাখুন, এবং আল্লাহর জন্য সাক্ষ্য প্রতিষ্ঠা করুন। সেই ব্যক্তিকে এ উপদেশ প্রদান করা হচ্ছে, যে আল্লাহকে এককসত্বা মেনে নেয় এবং পরকালীন-জীবনকে মেনে নেয়। এবং যে আল্লাহর সচেতনতা অবলম্বন করে- তিনি তার জন্য কোন না কোন উদ্ধারের পথ করে দিবেন। \n\n" +
                " ০৬৫:০০৩] এবং তিনি তাকে এমন দিক থেকে জীবিকা দিবেন যা সে কল্পনাও করতে পারে না। এবং যে আল্লাহর উপর নির্ভর করে, তিনি তার জন্য যথেষ্ট। নিশ্চই আল্লাহ নিজ উদ্দেশ্যকে পূর্ণ করে থাকেন। আল্লাহ প্রত্যেক বিষয়ের পরিমিত-পরিমাপ অবশ্যই নিরুপিত করতে সক্ষম। \n\n" +
                " ০৬৫:০০৪] এবং তোমাদের স্ত্রীদের থেকে, যাদের মেনোপজ(ঋতুস্রাব শেষ) হয়ে গেছে, যদি(তাদের সময়-কাল সম্বন্ধে) তোমরা সন্দেহ কর, তাহলে তাদের সময়-কাল হল তিন মাস এবং যাদের ঋতুস্রাব না হয় (এমিনোরিয়া) তাদের জন্যও। এবং গর্ভবতী স্ত্রীলোকের সময়-কাল হল সন্তান প্রসব হওয়া পর্যন্ত। এবং যে আল্লাহর সচেতনতা অবলম্বন করে, তিনি তার জন্য তার বিষয়কে সহয সাধ্য করে দেন। \n\n" +
                " ০৬৫:০০৫] এটিই আল্লাহর আদেশ যা তিনি তোমাদের প্রতি অবতীর্ণ করেছেন। এবং যে আল্লাহর জন্য সচেতনতা অবলম্বন করে তিনি তার সকল (কৃতকর্মের)অনিষ্টকে দূরীভূত করে দেন এবং তার পুরস্কারকে বর্ধিত করে দেন। \n\n" +
                " ০৬৫:০০৬] তোমরা তাদেরকে(বিচ্ছেদপ্রাপ্ত স্ত্রীদেরকে) সেখানে বাস করতে দিও যেখানে তোমরা নিজ সামর্থ্য অনুযায়ী বসবাস করে থাক এবং তোমরা তাদেরকে তাদের জন্য সংকট সৃষ্টি করে(এবং ঘর ছাড়তে বাধ্য করে) কষ্ট দিও না এবং যদি তারা গর্ভবতী হয় তাহলে তাদের জন্য খরচ বহন কর যতক্ষণ পর্যন্ত না তারা তাদের সন্তান প্রসব করে। অতঃপর যদি তারা তোমাদের জন্য (শিশুদেরকে) স্তন্য পান করায় তাহলে তাদেরকে তাদের পারিশ্রমিক দাও, এবং পরস্পরের মধ্যে ন্যায় সংগতভাবে পরার্মশ(করে স্থির) কর, এবং যদি তোমরা পরস্পর অসুবিধার সম্মুখীন হও তাহলে তাকে(শিশুকে পিতার পক্ষ থেকে) অন্য স্ত্রীলোক স্তন্য পান করাবে। \n\n" +
                " ০৬৫:০০৭] স্বচ্ছল ব্যক্তি নিজ স্বচ্ছলতা অনুযায়ী(স্তন্য-দায়িণীকে) খরচ দিবে। এবং অসচ্ছল বাক্তি তা থেকে খরচ করবে যা আল্লাহ তাকে দিয়েছেন। আল্লাহ কাউকে, যা তিনি তাকে দান করেছেন, সে সামর্থ্য ছাড়া বোঝা অর্পণ করেন না। অচিরেই আল্লাহ তাকে অস্বচ্ছলতার পর স্বচ্ছলতা দান করবেন। \n\n" +
                " ০৬৫:০০৮] এবং কত জনপদই না তাদের ক্রমবিকাশকের এবং তাঁর রসূলদের আদেশ অমান্য করেছিল, ফলে আমরা তাদের হিসাব গ্রহণ করেছিলাম-কঠোর হিসাব এবং তাদেরকে দুঃখ-কষ্ট দিয়েছিলাম নিকৃষ্ট দুঃখ-কষ্ট। \n\n" +
                " ০৬৫:০০৯] সুতরাং তারা তাদের কৃত-কর্মের সমুচিত শাস্তি ভোগ করেছিল এবং তাদের কর্মের পরিণাম ক্ষতিকরই হয়েছিল। \n\n" +
                " ০৬৫:০১০] আল্লাহ তাদের জন্য কঠিন দুঃখ-কষ্ট প্রস্তুত করে রেখেছেন, সুতরাং তোমরা আল্লাহর সচেতনতা অবলম্বন কর, হে বুদ্ধিমানরা, যারা আল্লাহর এককসত্তা মেনে নিয়েছ! আল্লাহ নিশ্চই তোমাদের প্রতি অবতীর্ণ করেছেন \"এক স্মারক-বানী \n\n" +
                " ০৬৫:০১১] এক রসূল(কুরআন), যে তোমাদের কাছে আল্লাহর সুস্পষ্ট প্রামান্য তথ্যপূর্ণ আয়াতগুলো আবৃত্তি করে, যেন সে- যারা আল্লাহকে এককসত্বা মেনে নেয় এবং ভালকাজ করে-তাদেরকে অজ্ঞানতার অন্ধকার থেকে বের করে শিক্ষার আলোর দিকে নিয়ে আসে।\" এবং যে আল্লাহকে এককসত্বা মেনে নেয় এবং ভাল কাজ করে- তিনি তাকে এমন জান্নাতগুলোতে প্রবিষ্ট করবেন যার তলদেশ দিয়ে অব্যাহত পানির সরবরাহ থাকবে, সেখানে তারা চিরকাল বসবাস করবে। নিশ্চই আল্লাহ তার জন্য উৎকৃষ্ট জীবিকা সৃষ্টি করে রেখেছেন। \n\n" +
                " ০৬৫:০১২] আল্লাহই কোটি কোটি বায়ুমণ্ডল সৃষ্টি করেছেন এবং সমান সংখ্যক পৃথিবী সৃষ্টি করেছেন। এগুলোর মধ্যে তাঁর আদেশ অবতীর্ণ হচ্ছে যেন তোমরা জানতে পার, নিশ্চই আল্লাহ সবকিছু পরিমিত পরিমাপে সৃষ্টি করেন, এবং আল্লাহ বিজ্ঞান দিয়ে সকল বস্তুকে পরিবেষ্টন করে আছেন। \n\n" +
                "</string>");
        editor.putString("64","পরিচ্ছেদ ০৬৪.দৃশ্যঃ লাভ-ক্ষতি(সূরা আত-তাগাবুন The gain and loss) \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ১৯ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৬৪:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৬৪:০০১] বায়ুমণ্ডলগুলোতে যা কিছু আছে এবং পৃথিবীগুলোতে যা কিছু আছে সকলেই আল্লাহর নিয়মে দায়িত্ব পালন(তছবিহ) করছে। তাঁরই জন্য সকল সার্বভৌমত্ব এবং তাঁরই জন্য সকল ধন্যবাদ এবং তিনিই সকল বিষয়ে পরিমিত-পরিমাপ নিরুপনে সক্ষম। \n\n" +
                " ০৬৪:০০২] তিনিই তোমাদেরকে সৃষ্টি করেছেন, কিন্তু তোমাদের মধ্যে কেউ অস্বীকারকারী এবং তোমাদের মধ্যে কেউ স্বীকারকারী। এবং তোমরা যে কাজই কর আল্লাহ তার সবকিছুর দ্রষ্টা। \n\n" +
                " ০৬৪:০০৩] তিনি বায়ুমণ্ডলগুলো এবং পৃথিবীগুলোকে যথাযথ ভাবে সৃষ্টি করেছেন, এবং তিনি তোমাদেরকে আকৃতি দিয়েছেন, এবং তোমাদের আকৃতিকে পরম সুন্দর করেছেন, এবং তাঁরই দিকে তোমাদের প্রত্যাবর্তন। \n\n" +
                " ০৬৪:০০৪] বায়ুমণ্ডলগুলোতে এবং পৃথিবীগুলোতে যা কিছু আছে তিনি সবই পরিজ্ঞাত আছেন এবং তোমরা যা কিছু গোপন কর এবং তোমরা যা প্রকাশ কর সবই তিনি জানেন এবং অন্তরে যাকিছু নিহিত আছে তা-ও তিনি সবিশেষ অবগত আছেন। \n\n" +
                " ০৬৪:০০৫] যারা ইতিপূর্বে অস্বীকার করেছিল তাদের খবর তোমাদের কাছে কি আসে নাই ? তারা তাদের কর্মের প্রতিফল আস্বাদন (পৃথিবীতেই) করেছে এবং তাদের জন্য(অবধারিত) আছে যন্ত্রণাদায়াক দুঃখ-কষ্ট। \n\n" +
                " ০৬৪:০০৬] এটি এজন্যে যে, তাদের কাছে তাদের রসূলরা সুস্পষ্ট প্রামাণ্য তথ্যসহ আগমন করত, কিন্তু তারা বলত, \"(মরণশীল) মানুষ কি আমাদেরকে সুপথ-প্রাপ্তির-নির্দেশনা দিবে?\" সুতরাং তারা অস্বীকার করত এবং মুখ ফিরিয়ে নিত, ফলে আল্লাহও(তাদেরকে) উপক্ষো করলেন, বস্তুতঃ আল্লাহ স্বয়ং সম্পূর্ণ, ধন্যবাদযোগ্য। \n\n" +
                " ০৬৪:০০৭] যারা অস্বীকার করেছে তারা ধারণা করে, তারা কখনও পুনরুত্থিত হবে না, অতঃপর নিশ্চই তোমাদেরকে তোমাদের কৃতকর্ম সম্বন্ধে জানান হবে, এবং এটি আল্লাহর পক্ষে অতি সহজ।\" \n\n" +
                " ০৬৪:০০৮] সুতরাং তোমরা মেনে নাও আল্লাহর এককসত্তাকে এবং তাঁর রসূল(কুরআন)এর মধ্যে নূর (শিক্ষা)কে যা আমরা অবতীর্ণ করেছি এবং আল্লাহ তোমাদের কাজ সম্বন্ধে, যা তোমরা কর, সবিশেষ অবগত আছেন। \n\n" +
                " ০৬৪:০০৯] যেদিন তোমাদেরকে ফলাফল-দিবসের জন্য সমবেত করবেন তা হবে লাভ-ক্ষতির দিন। এবং যে আল্লাহকে এককসত্বা মেনে নেয় এবং ভালকাজ করে, তিনি তার সকল(কৃত-কাজের) মন্দ-অনিষ্টকে তার কাছ থেকে দূরীভূত করে দিবেন এবং তাকে এমন জান্নাতগুলোতে প্রবিষ্ট করবেন যাদের তলদেশ দিয়ে অধ্যহত পানির সরবরাহ থাকবে, তারা সেখানে চিরকাল বসবাস করবে এটিই হবে পরম সফলতা। \n\n" +
                " ০৬৪:০১০] এবং যারা অস্বীকার করেছে এবং আমাদের আয়াতগুলোকে মিথ্যা প্রতিপন্ন করেছে, তারাই আগুনের অধিবাসী, তারা সেখানে দীর্ঘকাল বসবাস করবে এবং তা কত মন্দ প্রত্যাবর্ত্যনস্থল (waiting-room)। \n\n" +
                " ০৬৪:০১১] আল্লাহর অনুমতি ছাড়া কোন বিপদ আপতিত হয় না। এবং যে আল্লাহকে এককসত্বা মেনে নেয় -তিনি তার মন-মগজকে সঠিক পথে পরিচালিত করেন। এবং আল্লাহ সকল বিষয়ে সর্বজ্ঞানী। \n\n" +
                " ০৬৪:০১২] এবং তোমরা আল্লাহর আনুগত্য কর এবং এই রসূলের(কুরআনের) আনুগত্য কর। কিন্তু যদি তোমরা বিমুখ হও তাহলে আমাদের রসুলের উপর দায়িত্ব শুধু সুস্পষ্টভাবে(বাণী) পৌঁছে দেয়া। \n\n" +
                " ০৬৪:০১৩] আল্লাহ এককসত্তা, তিনি ছাড়া কোন উদ্ভাবনীশক্তি নেই, সুতরাং স্বীকারকারীদের তাঁরই উপর নির্ভর করা উচিত। \n\n" +
                " ০৬৪:০১৪] হে যারা আল্লাহর এককসত্তা মেনে নিয়েছ ! নিশ্চই তোমাদের স্ত্রীদের এবং তোমাদের সন্তান-সন্ততির মধ্যে কেউ কেউ তোমাদের শত্রু, অতএব তোমরা তাদের সম্বন্ধে সতর্ক থেকো। এবং যদি তোমরা মাফ কর এবং উপক্ষো কর এবং সংশোধন কর তাহলে নিশ্চই আল্লাহ অতীব সংশোধনশীল, এককসত্তা দয়াময়। \n\n" +
                " ০৬৪:০১৫] তোমাদের ধন-সম্পদ এবং তোমাদের সন্তান-সন্ততি(তোমাদের জন্য) কেবল পরীক্ষার বিষয়, এবং আল্লাহ এককসত্তা- তাঁরই কাছে রয়েছে মহাপুরস্কার। \n\n" +
                " ০৬৪:০১৬] সুতরাং তোমাদের সাধ্যানুসারে আল্লাহর জন্য সচেতনতা অবলম্বন কর, এবং(তাঁর কথা) শ্রবণ কর, এবং (তাঁর) আনুগত্য কর, এবং (দরিদ্রদের অন্ন ও, বস্ত্র দাও, দারিদ্রদূরিকরণে সম্মিলিতভাবে দান করায়)খরচ কর, এটি তোমাদের নিজেদের জন্যই মঙ্গলজনক এবং যাদেরকে তাদের হৃদয়ের কার্পন্য থেকে রক্ষা করা হয়, তারাই সফল হবে। \n\n" +
                " ০৬৪:০১৭] যদি তোমরা আল্লাহকে উত্তমভাবে ঋণ দান কর, (তাহলে) তিনি সেগুলোকে তোমাদের জন্য বর্ধিত করে দিবেন এবং তোমাদেরকে সংশোধন করবেন, নিশ্চই আল্লাহ অতিশয় গুণগ্রাহী, পরম সহিষ্ণু। \n\n" +
                " ০৬৪:০১৮] তিনি অজানা ও প্রত্যক্ষ সকল বিষয়ে সর্বজ্ঞ, ভালবাসাকনিকার মহাসমূদ্র, মহা বিজ্ঞানী। \n\n" +
                "</string>");
        editor.putString("63","পরিচ্ছেদ ০৬৩.দৃশ্যঃ দ্বিধাগ্রস্থ(সূরা আল-মুনাফেকূন The double-dealer) \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ১২ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৬৩:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৬৩:০০১] যখন দ্বিধাগ্রস্থরা আপনার কাছে আসে, তখন তারা বলে, \"আমরা সাক্ষ্য দিচ্ছি, নিশ্চই আপনি আল্লাহর রসূল।\" কিন্তু আল্লাহ এও সাক্ষ্য দিচ্ছেন, \"দ্বিধাগ্রস্থরা নিশ্চই মিথ্যা বলছে।\" \n\n" +
                " ০৬৩:০০২] তারা তাদের শপথকে ঢাল হিসেবে অবলম্বন করে এভাবে তারা(মানুষকে) আল্লাহর পথ থেকে নিবৃত্ত করে। নিশ্চই তারা যা করছে তা খুবই মন্দ। \n\n" +
                " ০৬৩:০০৩] এটি এজন্য যে, তারা আল্লাহর এককসত্বা মেনে নিয়েছিল, অতঃপর তারা অস্বীকার করল। ফলে তাদের অন্তর(বিবেকবুদ্ধি) সীল করে দেয়া হল, অতএব তারা কিছুই বুঝছে না। \n\n" +
                " ০৬৩:০০৪] এবং যখন আপনি তাদেরকে দেখেন, তাদের দেহাকৃতি আপনাকে মুগ্ধ করে, এবং যখন তারা কোন কথা বলে, আপনি তাদের কথা (আগ্রহভরে)শ্রবণ করেন। তারা যেন (দেয়ালে)হেলান দেয়া কন্ঠস্বর। তারা মনে করে যেন প্রত্যেকটি বিকট শব্দকারী দুঃখ-কষ্ট তাদের বিরুদ্ধে। তারাই শত্রু, সুতরাং তাদের সম্বন্ধে সর্তক হৌন। আল্লাহ তাদেরকে ধ্বংস করুন, (সত্য পথ থেকে) তাদেরকে কোথায় ফিরিয়ে নেয়া হচ্ছে! \n\n" +
                " ০৬৩:০০৫] এবং যখন তাদেরকে বলা হয়, \"তোমরা আস, আল্লাহর রসূল তোমাদের জন্য সংশোধন প্রার্থনা করবেন,\" তখন তারা তাদের মাথা ঘুরিয়ে নেয়, এবং আপনি তাদেরকে দেখবেন, তারা(ঘৃণা ভরে) অহংকারে ফুলে-ফেঁপে পিছনে সরে যাচ্ছে। \n\n" +
                " ০৬৩:০০৬] আপনি তাদের জন্য সংশোধন প্রার্থনা করেন বা তাদের জন্য সংশোধন প্রার্থনা না করেন তাদের জন্য উভয়ই সমান, আল্লাহ তাদেরকে কখনও সংশোধন করবেন না। নিশ্চই আল্লাহ দুস্কৃতিপরায়ণ জাতিকে সুপথ প্রপ্তির নির্দেশনা দান করেন না। \n\n" +
                " ০৬৩:০০৭] তারাই তো বলে, \"আল্লাহর রসূলের কাছে যারা আছে তোমরা তাদের জন্য খরচ কোরও না, যতক্ষণ পর্যন্ত না তারা ছত্রভঙ্গ হয়ে যায়, অথচ বায়ুমণ্ডলগুলোতে এবং পৃথিবীগুলোতে সকল ধন-ভান্ডার আল্লাহর জন্য, কিন্তু দ্বিধাগ্রস্থরা বোঝে না।\" \n\n" +
                " ০৬৩:০০৮] তারা বলে, \"যদি আমরা মদীনায় ফিরে যাই তাহলে, সর্বাপেক্ষা সম্মানিত ব্যক্তি অবশ্যই সর্বাপেক্ষা নিকৃষ্ট ব্যক্তিকে সেখান থেকে বহিষ্কার করে দিবে,\" অথচ (প্রকৃত) সম্মান আল্লাহর জন্য এবং তাঁর রসূল এবং স্বীকারকারীদের জন্য, কিন্তু দ্বিধাগ্রস্থরা তা জানে না। \n\n" +
                " ০৬৩:০০৯] হে যারা আল্লাহর এককসত্বা মেনে নিয়েছ ! তোমাদের ধন-সম্পদ এবং সন্তান-সন্ততি যেন তোমাদেরকে আল্লাহর স্মরণ থেকে উদাসীন না করে। এবং যারা এমন করবে-তারাই ক্ষতিগ্রস্থ হবে। \n\n" +
                " ০৬৩:০১০] এবং তোমাদের কারও উপর মৃত্যু আসার পূর্বে আমরা তোমাদরকে যে জীবিকা দিয়েছি তা থেকে তোমরা খরচ(দরিদ্রদের অন্ন ও, বস্ত্র দান এবং, দারিদ্রদূরিকরণে সম্মিলিত দান) কর যেন তাকে পরে এ বলতে না হয়, \"হে আমার ক্রমবিকাশক ! আপনি কেন আমাকে কিছুকালের অবকাশ দিলেন না যাতে আমি কিছু দান-খয়রাত করতাম এবং সৎকর্মশীলদের অর্ন্তভুক্ত হতাম।’ \n\n" +
                " ০৬৩:০১১] বস্তুতঃ আল্লাহ কাউকেও অবকাশ দেন না যখন তার নির্ধারিত সময় উপস্থিত হয় এবং তোমরা যে কর্মই কর আল্লাহ তা সম্বন্ধে সবিশেষ জানেন।");
        editor.putString("62","পরিচ্ছেদ ০৬২.দৃশ্যঃ সম্বেলন(সূরা আল-জুমু’আ The Congress) \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ১২ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৬২:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৬২:০০১] বায়ুমণ্ডলগুলোতে যা কিছু আছে এবং পৃথিবীগুলোতে যা কিছু আছে সকলেই আল্লাহর নিয়মে দায়িত্ব পালন(তছবিহ) করছে এবং তিনি পরম-মহাবিশ্ব(আল-মালিক), অনতিক্রম্য(আল-কুদ্দুস), ভালবাসা-কনিকার মহাসাগর(আল-আযিয), মহাবিজ্ঞানী(আল-হাকিম)।  \n\n" +
                " ০৬২:০০২] তিনিই পূর্ব-ঐশীগ্রন্থে অজ্ঞ(উম্মী)দের মধ্যে তাদেরই মধ্যে থেকে এক রসূল(মুহাম্মদ) আবির্ভুত করেছেন, যে তাদের কাছে তাঁর আয়াতগুলো আবৃত্তি করে, এবং তাদেরকে (দরিদ্রদের অন্ন ও বস্ত্র দান এবং দারিদ্রদূরিকরণে সম্মিলিত দানের মাাধ্যমে) পরিশুদ্ধ করে, এবং তাদেরকে গ্রন্থ ও বিজ্ঞান শিক্ষা দেয়, যদিও পূর্বে তারা প্রকাশ্য ভ্রান্তির মধ্যে ছিল,  \n\n" +
                " ০৬২:০০৩] এবং তাদের মধ্য থেকে অন্য লোকের মধ্যেও(শিক্ষা দেয়) যারা এখনও তাদের সঙ্গে মিলিত হয় নাই। এবং তিনি ভালবাসা-কনিকার মহাসাগর(আল-আযিয), মহাবিজ্ঞানী(আল-হাকিম)।  \n\n" +
                " ০৬২:০০৪] এটি(কুরআন) আল্লাহর বিজ্ঞান-প্রযূক্তি, তিনি যাকে চান এটি দান করেন, এবং আল্লাহ এককসত্তা বিজ্ঞান-প্রযূক্তির অধিকারী। \n\n" +
                " ০৬২:০০৫] যাদের উপর তওরাতের দায়িত্বভার ন্যস্ত করা হয়েছিল, কিন্তু তারা তা বহন করে নাই, তাদের উপমা সেই গাধার মত, যে গ্রন্থের বোঝা বহন করে চলে। সে জাতির দৃষ্টান্ত অতি নিকৃষ্ট যারা আল্লাহর আয়াত(নিদর্শন) গুলোকে মিথ্যা প্রতিপন্ন করে। যেহেতু আল্লাহ অন্যায়কারী জাতিকে সুপথ প্রাপ্তির নির্দেশনা দান করেন না। \n\n" +
                " ০৬২:০০৬] আপনি বলুন, \"হে যারা ইহুদী হয়েছ ! যদি তোমরা মনে কর যে, সকল মানুষকে বাদ দিয়ে তোমরাই আল্লাহর প্রিয়পাত্র, তাহলে তোমরা মৃত্যু চাও, যদি তোমরা সত্যবাদী হও।\" \n\n" +
                " ০৬২:০০৭] কিন্তু তারা কখনও তা চাইবে না, সে কারণে যা তাদের হাত আগে পাঠিয়েছে। এবং আল্লাহ অন্যায়কারীদের সম্বন্ধে সবিশেষ অবহিত।  \n\n" +
                " ০৬২:০০৮] আপনি বলুন, \"সেই মৃত্যু যা থেকে তোমরা পলয়ান করছ, অবশ্যই তোমাদের উপর আপতিত হবে। অতঃপর তোমরা গোপন ও প্রকাশ্য সকল বিষয়ে জ্ঞাত আল্লাহর কাছে প্রত্যাবর্তিত হবে, তখন তিনি তোমাদেরকে তোমাদের সেই কাজ সম্বন্ধে অবহিত করবেন যা তোমরা করে এসেছ।\" \n\n" +
                " ০৬২:০০৯] হে যারা আল্লাহর এককসত্তা মেনে নিয়েছ ! যখন তোমাদেরকে সম্বেলনের দিনে (উসতা) সালাতের (দ্রঃ ১০০:০০৫) জন্য আহবান করা হয় তখন আল্লাহর স্মরণের জন্য দ্রুত আসবে এবং ক্রয়-বিক্রয় পরিত্যাগ করবে। এটিই তোমাদের জন্য উত্তম, যদি তোমরা জানতে।  \n\n" +
                " ০৬২:০১০] অতঃপর যখন সালাত সম্পন্ন হয় তখন তোমরা পৃথিবীতে ছড়িয়ে পড় এবং আল্লাহর বিজ্ঞান-প্রযূক্তি(ফজল) অন্বেষণ কর এবং আল্লাহকে বেশী বেশী স্মরণ কর যেন তোমরা সফল হও।  \n\n" +
                " ০৬২:০১১] এবং যখন তারা কোন ব্যবসা-বাণিজ্য অথবা আমোদ-প্রমোদ দেখতে পায়, তখন তারা আপনাকে একাকী দন্ডায়মান অবস্থায় ছেড়ে তার দিকে দৌড়ে যায়। আপনি বলুন, \"যা আল্লাহর কাছে আছে তা আমোদ-প্রমোদ এবং ব্যবসা-বাণিজ্য থেকে উৎকৃষ্টতর, আসলে আল্লাহই সর্বোত্তম জীবিকাদাতা।\" \n\n" +
                "</string>");
editor.putString("61","পরিচ্ছেদ ০৬১.দৃশ্যঃ সারিবদ্ধ-বিন্যাস(সূরা আস-সাফফ The Rank) \n\n" +
        "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ১৫ আয়াত এবং ২ রুকূ আছে। \n\n" +
        " ০৬১:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
        " ০৬১:০০১] বায়ুমণ্ডলগুলোতে যা কিছু আছে এবং পৃথিবীগুলোতে যা কিছু আছে সকলেই আল্লাহর নিয়মে দায়িত্ব পালন(তছবিহ) করছে এবং তিনি ভালবাসা-কনিকার মহাসাগর(আল-আযিয), মহাবিজ্ঞানী(আল-হাকিম)। \n\n" +
        " ০৬১:০০২] হে যারা আল্লাহর এককসত্তা মেনে নিয়েছ! তোমরা কেন তা বল, যা কর না? \n\n" +
        " ০৬১:০০৩] আল্লাহর দৃষ্টিতে এটি অত্যন্ত ঘৃণিত, তোমরা তা বল, যা কর না। \n\n" +
        " ০৬১:০০৪] নিশ্চই আল্লাহ তাদেরকে ভালবাসেন যারা তাঁর পথে সারিবদ্ধ ভাবে বিন্যাস্ত হয়ে এমনভাবে যুদ্ধ করে যেন তারা শক্তিধর প্রাচীর। \n\n" +
        " ০৬১:০০৫] এবং যখন মূসা তার জাতিকে বলেছিল, \"হে আমার জাতি! তোমরা কেন আমাকে যাতনা দিচ্ছ অথচ তোমরা জান যে, নিশ্চই আমি তোমাদের প্রতি আল্লাহর রসূল?\" অতঃপর যখন তারা বক্রতা অবলম্বন করল তখন আল্লাহও তাদের হৃদয়গুলিকে বক্র করে দিলেন, যেহেতু আল্লাহ দুষ্কৃতিপরায়ণ জাতিকে সুপথপ্রাপ্তির নির্দেশনা দান করেন না। \n\n" +
        " ০৬১:০০৬] এবং যখন মরিয়ম-পুত্র ঈসা বলেছিল, \"হে বনী ইসরাঈল ! নিশ্চই আমি তোমাদের প্রতি আল্লাহর রসূল, সেই ভবিষ্যদ্বাণীর সত্যায়নকারী রূপে যা তওরাত থেকে আমার সামনে আছে, এবং এমন এক রসূলেরও সুসংবাদদাতা হিসেবে যে আমার পরে আসবে, যার নাম হবে আহমদ।\" অতঃপর যখন সে তাদের কাছে সুস্পষ্ট প্রামাণ্য তথ্যসহ আসলো, তারা বলল, \"এ-তো স্পষ্ট যাদু।\" \n\n" +
        " ০৬১:০০৭] এবং ঐ ব্যক্তি অপেক্ষা বড় অন্যায়কারী কে, যে আল্লাহর প্রতি মিথ্যা আরোপ করে, অথচ তাকে ইসলাম(কুরআন)এর দিকে আহবান করা হয়, যেহেতু আল্লাহ কখনও অন্যায়কারী জাতিকে সুপথপ্রাপ্তির নির্দেশনা দেন না। \n\n" +
        " ০৬১:০০৮] তারা চায় যেন তারা নিজেদের মুখের ফু দিয়ে আল্লাহর নূর(কুরআন)কে নিভিয়ে দিবে, কিন্তু আল্লাহ তাঁর নিজ নূরকে নিশ্চই পূর্ণরূপে প্রতিষ্ঠিত করবেন, অস্বীকারকারীরা যত অসন্তুষ্টই হোক না কেন। \n\n" +
        " ০৬১:০০৯] তিনিই তাঁর রসূল(কুরআন)কে সুপথপ্রাপ্তির নির্দেশনা এবং বৈজ্ঞানিক-বিধান সহকারে পাঠিয়েছেন যেন তিনি এটিকে সকল (মানবরচিত)বিধানের উপর জয়যুক্ত করে দেন, পৃথকসত্বাবাদিরা যত অসুন্তুষ্টই হোক না কেন। \n\n" +
        " ০৬১:০১০] হে যারা আল্লাহর এককসত্তা মেনে নিয়েছ ! আমি কি তোমাদেরকে এমন এক বাণিজ্যের সন্ধান দিব যা তোমাদেরকে যন্ত্রণাদায়ক দুঃখ-কষ্ট থেকে রক্ষা করবে? \n\n" +
        " ০৬১:০১১] (তা এই যে) তোমরা আল্লাহর এককসত্তা ও তাঁর রসুল(কুরআন)কে মেনে নাও এবং নিজেদের ধন-সম্পদ এবং প্রান দিয়ে আল্লাহর পথে প্রচেষ্টা কর। এটিই তোমাদের জন্য কল্যাণজনক যদি তোমরা জ্ঞান রাখ। \n\n" +
        " ০৬১:০১২] (ফলে) তিনি তোমাদেরকে তোমাদের পাপগুলো সংশোধন করে দিবেন এবং তোমাদেরকে প্রবিষ্ট করবেন এমন জান্নাতগুলোতে যার তলদেশ দিয়ে অব্যাহত পানির সরবরাহ থাকবে এবং মনোরম, চিরস্থায়ী আবাসস্থল জান্নাতগুলোর মধ্যে, এটিই পরম সফলতা। ০৬১:০১৩] আরও কিছু আছে যা তোমরা ভালবাস -তা হচ্ছে আল্লাহর সাহায্য এবং আসন্ন (মহাকাশ)বিজয়, সুতরাং আপনি স্বীকারকারীদেরকে সুসংবাদ দিন। \n\n" +
        " ০৬১:০১৪] হে যারা আল্লাহকে এককসত্তা মেনে নিয়েছ ! তোমরা আল্লাহর সাহায্যকারী হও, যেভাবে মরিয়ম-পুত্র ঈসা হাওয়ারীদেরকে বলেছিল, \"আল্লাহর পথে কে আমার সাহায্যকারী।\" হাওয়ারীরা বলল, \"আমরা আল্লাহর সাহায্যকারী।\" সুতরাং বনী ইসরাঈলের মধ্য থেকে একদল আল্লাহকে এককসত্তা মেনে নিল এবং একদল অস্বীকার করল। অতঃপর যারা আল্লাহকে এককসত্তা মেনে নিয়েছিল আমরা তাদেরকে তাদের শত্রুদের বিরুদ্ধে শক্তি যোগান দিলাম, ফলে তারা বিজয়ী হল। \n\n" +
        "</string>");
        editor.putString("60","পরিচ্ছেদ ০৬০.দৃশ্যঃ পরীক্ষন(সূরা আল-মুমতাহানা The Examine) \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ১৪ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৬০:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৬০:০০১] হে যারা আল্লাহকে এককসত্তা মেনে নিয়েছ ! তোমরা আমার শত্রুকে এবং তোমাদের শত্রুকে বন্ধুরুপে গ্রহণ কোরও না। তোমরা তাদের কাছে প্রেমের বাণী পেশ করছ, অথচ তোমাদের কাছে যে সত্য এসেছে তা তারা অস্বীকার করছে; তারা এই রসূলকে এবং তোমাদেরকে শুধু এ কারণে বহিষ্কৃত করেছে, তোমরা আল্লাহকে এককসত্বা মেনে নিয়েছ, যিনি তোমাদের ক্রমবিকাশক। যখন তোমরা আমার প্রদর্শিত পথে প্রচেষ্টা করার এবং আমার সন্তুষ্টি লাভ করার উদ্দেশ্যে বের হও, তখন তোমরা কেউ কেউ গোপনে তাদের কাছে প্রেমের বাণী দিয়ে থাক, অথচ তোমরা যা গোপন কর এবং যা প্রকাশ কর সবই আমি ভালভাবে জানি। এবং তোমাদের মধ্যে যে কেউ এটি করে, বস্ততঃ সে সঠিক পথ থেকে বিচ্যুত। \n\n" +
                " ০৬০:০০২] যদি তারা তোমাদেরকে নিজেদের আয়ত্বে আনতে পারে তাহলে তারা তোমাদের (ঘোর)শত্রু হবে এবং তারা তোমাদের অনিষ্ট সাধনে নিজেদের হাত এবং জিহ্বাগুলো তোমাদের দিকে প্রসারিত করবে; যেহেতু তারা চায় যেন তোমরা অস্বীকারকারী হয়ে যাও। \n\n" +
                " ০৬০:০০৩] পুনরুত্থান দিবসে না তোমাদের আত্মীয়-স্বজন এবং না তোমাদের সন্তান-সন্ততি তোমাদের কখনও উপকারে লাগবে। তিনি তোমাদের মধ্যে মিমাংসা করবেন। এবং তোমরা যে কাজই কর আল্লাহ্ অবশ্যই তা দেখছেন। \n\n" +
                " ০৬০:০০৪] তোমাদের জন্য অবশ্য উত্তম আদর্শ রয়েছে ইব্রাহীম এবং ঐ সকল লোকের মধ্যে যারা তার সাথে ছিল, যখন তারা তাদের জাতিকে বলেছিল, নিশ্চই আমরা তোমাদের থেকে এবং আল্লাহ্ ছাড়া তোমরা যাদের উপাসনা কর তাদের থেকে সম্পর্কমুক্ত। আমরা তোমাদের কথা অস্বীকার করছি। এবং আমাদের এবং তোমাদের মধ্যে চিরকালের জন্য শত্রুতা ও বিদ্বেষ প্রকাশ হল যতক্ষণ পর্যন্ত না তোমরা আল্লাহর এককসত্তা মেনে নাও, তবে তার পিতার প্রতি ইব্রাহীমের এ উক্তি ছাড়া, \"আমি নিশ্চই তোমার জন্য সংশোধন প্রার্থনা করব, কিন্তু আল্লাহর ইচ্ছার বিরুদ্ধে তোমার জন্য কোন কিছু করার ক্ষমতা আমার নেই।\" (তাদের প্রার্থনা) \"হে আমাদের ক্রমবিকাশক ! আপনার উপর আমরা ভরসা করি এবং আপনারই প্রতি আমরা ঝুঁকি এবং আপনারই কাছে আমাদের শেষ প্রত্যাবর্তন; \n\n" +
                " ০৬০:০০৫] হে আমাদের ক্রমবিকাশক ! আপনি আমাদেরকে সে সকল লোকের জন্য পরীক্ষার কারণ করবেন না যারা অস্বীকার করেছে এবং আপনি আমাদেরকে সংশোধন করুন, হে আমাদের ক্রমবিকাশক ! নিশ্চই আপনি ভালবাসা-কনিকার মহাসমুদ্র মহাবিজ্ঞানী।\" \n\n" +
                " ০৬০:০০৬] নিশ্চই তাদের মধ্যে তোমাদের জন্য এক উত্তম আদর্শ রয়েছে -তাদের জন্য যারা আল্লাহ এবং পরকালের (সাক্ষাতের) আাশা পোষণ করে। এবং যে ব্যক্তি মুখ ফিরিয়ে নেয় -সে জেনে রাখুক নিশ্চই আল্লাহই কনায়-সমৃদ্ধশালী ও ধন্যবাদযোগ্য। \n\n" +
                " ০৬০:০০৭] তাদের মধ্য থেকে যাদের সাথে তোমাদের (আপাততঃ) শত্রুতা রয়েছে, তাদের ও তোমাদের মধ্যে অচিরেই আল্লাহ ভালবাসা সৃষ্টি করে দিবেন, যেহেতু আল্লাহ পরিমিত পরিমাপ নিরুপক, এবং অত্যন্ত সংশোধনশীল এককসত্তা দয়াময়। \n\n" +
                " ০৬০:০০৮] যারা জীবন-বিধান(কুরআন)'র ব্যাপারে তোমাদের সাথে যুদ্ধ করে নাই এবং তোমাদেরকে তোমাদের ঘর-বাড়ী থেকে বিতাড়িত করে নাই তাদের সঙ্গে আল্লাহ তোমাদেরকে সদ্ব্যাবহার এবং ভারসাম্য রক্ষা করতে নিষেধ করেন না, নিশ্চই আল্লাহ ভারসাম্য রক্ষাকারীদেরকে ভালবাসেন। \n\n" +
                " ০৬০:০০৯] আল্লাহ শুধু তাদের সাথে বন্ধুত্ব করতে নিষেধ করেন, যারা জীবন-বিধান(কুরআন)'র ব্যাপারে তোমাদের সাথে যুদ্ধ করেছে আর তোমাদেরকে তোমাদের ঘর-বাড়ী থেকে বিতাড়িত করেছে, এবং তোমাদেরকে বিতাড়িত করতে অন্যদেরকে সাহায্য করেছে, এবং যারা তাদের সাথে বন্ধুত্ব করবে-তারাই অন্যায়কারী হবে। \n\n" +
                " ০৬০:০১০] হে যারা আল্লাহকে এককসত্তা মেনে নিয়েছ ! যখন স্বীকারকারী নারীরা হিজরত করে তোমাদের কাছে আগমন করে, তখন তোমরা তাদেরকে ***পরীক্ষা*** কর । আল্লাহ তাদের স্বীকৃতি সম্বন্ধে সবিশেষ অবগত। অতএব যদি তোমরা তাদেরকে স্বীকারকারী নারী বলে জানতে পার তাহলে তোমরা তাদেরকে অস্বীকারকারীদের কাছে ফিরিয়ে দিও না। কারন তারা তাদের(অস্বীকারকারীদের) জন্য বৈধ নয়, এবং তারাও এদের জন্য বৈধ নয়। তারা (এ নারীদের বিয়েতে) যা খরচ করেছে তোমরা তাদেরকে সে খরচ দিয়ে দাও। এবং যখন তোমরা উক্ত নারীদেরকে (মুক্ত করার পর) তাদের প্রাপ্য দেন-মোহর আদায় কর তখন তাদেরকে বিয়ে করলে তোমাদের কোন অপরাধ হবে না। এবং অস্বীকারকারী নারীদের সাথে (তোমাদের) দাম্পত্য-বন্ধনকে তোমরা বজায় রেখো না; এবং (যখন তারা অস্বীকারকারীদের কাছে চলে যায় তখন) তোমরা যা খরচ করেছ তা (অস্বীকারকারীদের কাছে) দাবী কর, এবং (মুসলিম নারীরা অস্বীকারকারীদের থেকে চলে আসলে) তারা যা খরচ করেছে তা যেন তারা (তোমাদের কাছে) দাবী করে। এ-ই হল আল্লাহর মিমাংসা। তিনি তোমাদের মধ্যে মিমাংসা করেন। যেহেতু আল্লাহ সর্বজ্ঞানী, মহাবিজ্ঞানী। \n\n" +
                " ০৬০:০১১] এবং যদি তোমাদের ন্ত্রীদের মধ্য থেকে কেউ তোমাদের হস্তচ্যুত হয়ে অস্বীকারকারীদের কাছে চলে যায়, অতঃপর একইরকম সুযোগ পেলে(অর্থাৎ তাদের স্ত্রীরা তোমাদের হাতে এলে) তোমরাও, যাদের স্ত্রীরা অস্বীকারকারীদের কাছে চলে গেছে, তাদেরকে সে পরিমাণ (ক্ষতিপূরণ) দাও যা তারা খরচ করেছে। এবং আল্লাহর সচেতনতা অবলম্বন কর যাকে তোমরা এককসত্তা মান । \n\n" +
                " ০৬০:০১২] হে নবী ! যখন স্বীকারকারী নারীরা আপনার কাছে আনুগত্য করার জন্য আসে এ শর্তে যে, তারা আল্লাহর বদলে কোন কিছুকে পৃথকসত্বা কল্পনা করবে না এবং চুরি করবে না এবং ব্যাভিচার করবে না এবং নিজেদের সস্তানদেরকে হত্যা করবে না, এবং কারও প্রতি অপবাদ আরোপ করবে না যা তারা নিজেদের হাত ও পায়ের মাধ্যমে মিথ্যা অভিনয় করে আরোপ করে থাকে এবং কোন সংগত বিষয়ে আপনার অবাধ্যতা করবে না, তাহলে আপনি তাদের আনুগত্য গ্রহণ করবেন এবং তাদের জন্য আল্লাহর কাছে সংশোধন প্রার্থনা করবেন। নিশ্চই আল্লাহ অতীব সংশোধনশীল, পরম দয়াময়। \n\n" +
                " ০৬০:০১৩] হে যারা আল্লাহকে এককসত্তা মেনে নিয়েছ ! তোমরা এমন জাতির সাথে বন্ধুত্ব স্থাপন কোরও না যাদের প্রতি আল্লাহ ক্রোধ বর্ষণ করেছেন। তারা পরকাল সম্বন্ধে এভাবে নিরাশ হয়েছে যেভাবে অস্বীকারকারীরা কবরবাসীদের জন্য নিরাশ হয়েছে (অর্থাৎ তাদের পূনরুত্থান হবে না, পৃথিবীতেই শেষ বা বদল হয়ে যাবে) । \n\n" +
                "</string>");
        editor.putString("59","পরিচ্ছেদ ০৫৯.দৃশ্যঃ ভিড়(সূরা আল-হাশর The Crowd) \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ২৫ আয়াত এবং ৩ রুকূ আছে। \n\n" +
                " ০৫৯:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৫৯:০০১] বায়ুমণ্ডলগুলোতে যা কিছু আছে এবং পৃথিবীগুলোতে যা কিছু আছে সকলেই আল্লাহর নিয়মে দায়িত্ব পালন(তছবিহ)করছে এবং তিনি ভালবাসা-কনিকার মহাসাগর(আল-আযিয), মহাবিজ্ঞানী(আল-হাকিম)।  \n\n" +
                " ০৫৯:০০২] তিনিই পূর্ব-ঐশীগ্রন্থধারীদের মধ্য থেকে অস্বীকারকারীদের প্রথম নির্বাসনের সময় তাদের ঘর থেকে বহিস্কার করেছিলেন। তোমরা ধারণাও কর নাই, তারা বের হবে এবং তারা ধারণা করেছিল, তাদের দুর্গগুলো আল্লাহর মোকাবেলায় তাদেরকে রক্ষা করবে। কিন্তু তাদের কাছে আল্লাহ এমন দিক থেকে আগমন করলেন যেদিক সম্বন্ধে তারা কল্পনাও করে নাই এবং তিনি তাদের অন্তরে ত্রাসের সৃষ্টি করলেন, ফলে তারা তাদের ঘরগুলো তাদের নিজ হাতে এবং মোমেনদের হাতে বিধ্বস্ত করছিল। সুতরাং হে দৃষ্টিসম্পন্ন ব্যক্তিবর্গ ! শিক্ষা গ্রহণ কর। \n\n" +
                " ০৫৯:০০৩] এবং আল্লাহ্ যদি তাদের উপর নির্বাসন অবধারিত করে না দিতেন তবুও তিনি এ পৃথিবীতেও তাদেরকে নিশ্চই দুঃখ-কষ্ট দিতেন। এবং পরকালে তাদের জন্য আগুনের দুঃখ-কষ্ট নির্ধারিত আছেই। \n\n" +
                " ০৫৯:০০৪] এটি এ জন্য হয়েছে, তারা আল্লাহ্ ও তাঁর রসূল(কুরআন)এর বিরোধিতা(নিজেদেরকে আলাদা) করতো। এবং নিশ্চই যে আল্লাহর বিরুদ্ধাচরণ করে, নিশ্চই আল্লাহ্ কঠিন পরিনাম দাতা। \n\n" +
                " ০৫৯:০০৫] খেজুরের যে বৃক্ষই তোমরা কর্তন করেছ অথবা যে গুলোকে তাদের মূলের উপর দওায়মান অবস্থায় ছেড়ে দিয়েছ অর্থাৎ কাট নাই, এটি আল্লাহ অনুমোদন দিয়েছেন। যদিও তিনি দুস্কৃতকারীদেরকে এমনই প্রতিদান দিতে পারেন। \n\n" +
                " ০৫৯:০০৬] এবং যে ধন-সম্পদ আল্লাহ তাদের থেকে নিজ রসূলকে অর্পন করেছেন তার জন্য তোমরা ঘোড়া এবং উট দৌড়াও নাই(বিনাযুদ্ধে), বরং আল্লাহ নিজ রসূলদেরকে যার উপর তিনি চান আধিপত্য দান করেন, এবং আল্লাহ্ সকল বিষয়ের পরিমিত পরিমাপ নিরুপনে সক্ষম। \n\n" +
                " ০৫৯:০০৭] আল্লাহ্ তাঁর রসূলকে জনপদের অধিবাসীদের থেকে বিনাযুদ্ধে যে ধন-সম্পদ দান করেছেন তা আল্লাহর জন্য, এবং রসূলের জন্য, এবং যারা কাছাকাছি আত্মিয়-স্বজন, এবং এতীম, এবং দুস্থ-অভাবগ্রস্থ এবং পথশিশু (টোকাই) তাদের জন্য। যেন এগুলো তোমাদের বিত্তশালীদের মধ্যে চক্রাকারে আবর্তিত না হয় । এবং রসূল তোমাদেরকে যা দান করেন তা সানন্দে গ্রহণ কর, এবং যা তোমাদেকে দিতে না চান তা থেকে তোমরা বিরত থাক(চেওনা)। এবং আল্লাহর জন্য সচেতনতা অবলম্বন কর; নিশ্চই আল্লাহ্ কঠিন পরিনাম দাতা। \n\n" +
                " ০৫৯:০০৮] এ ধন-সম্পদ দরিদ্র মুহাজেরদের জন্যেও, যাদেরকে তাদের ঘররবাড়ি থেকে ও ধন-সম্পদ থেকে বিতাড়িত করা হয়েছে, তারা আল্লাহর বিজ্ঞান-প্রযূক্তি ও সন্তুষ্টি কামনা করে এবং আল্লাহ ও তাঁর রসূলের সাহায্য করে। এরাই সত্যবাদী। \n\n" +
                " ০৫৯:০০৯] এবং তাদেরও জন্য যারা তাদের (হিজরতের) আগে থেকে (মদীনায়) বাসগৃহে বসবাস করছিল এবং আল্লাহকে এককসত্বা মেনে নিয়েছিল; তারা তাদেরকে ভালবাসে যারা তাদের কাছে হিজরত করে আসে, এবং তারা নিজেদের বক্ষঃস্থলে সে সম্পদের জন্য কোন আকাঙ্ক্ষা বোধ করে না যা তাদেরকে (মুহাজেরীনকে) দেয়া হয়, এবং নিজেদের দারিদ্র থাকা সত্বেও তাদেরকে নিজেদের চেয়ে অগ্রাধিকার দেয়। এবং যাকে তার নিজ কৃপণতা থেকে রক্ষা করা হয়, তারাই আসলে সফল। \n\n" +
                " ০৫৯:০১০] এবং যারা তাদের পরে আসলো, তারা বলল, \"হে আমাদের ক্রমবিকাশক, আপনি আমাদেরকে এবং আমাদের সে সকল ভাইকে ক্ষমা করুন যারা আপনার এককসত্তার স্বীকৃতিতে আমাদের চেয়ে অগ্রগামী হয়েছে, এবং আমাদের অন্তরে তাদের প্রতি কোন বিদ্বেষ সৃষ্টি করবেন না, যারা আল্লাহকে এককসত্বা মেনে নিয়েছে। হে আমাদের ক্রমবিকাশক, নিশ্চই আপনি অতীব স্নেহশীল পরম দয়াময়।\" \n\n" +
                " ০৫৯:০১১] আপনি কি সে সব দ্বিধাগ্রস্থকে দেখেন নাই যারা নিজেদের ভাইদেরকে, পূর্ব-ঐশীগ্রন্থধারীদের থেকে যারা অস্বীকার করেছে,বলে, \"যদি তোমাদেরকে বের করে দেয়া হয়. তাহলে নিশ্চই আমারাও তোমাদের সাথে বের হব, এবং তোমাদের বিরুদ্ধে কারও কথা মানবো না; এবং যদি তোমাদের সঙ্গে যুদ্ধ করা হয় তাহলে আমরা নিশ্চই তোমাদের সাহায্য করর।\" কিন্তু আল্লাহ সাক্ষ্য দেন, তারা নিশ্চই মিথ্যাবাদী। \n\n" +
                " ০৫৯:০১২] যদি তাদেরকে বের করে দেয়া হয়, তাহলে তারা তাদের সাথে কখনও বের হবে না এবং যদি তাদের সঙ্গে যুদ্ধ করা হয় তাহলে তারা কখনও তাদের সাহায্য করবে না। এবং যদি তারা তাদেরকে সাহায্য করেও তাহলে নিশ্চই তারা পৃষ্ঠ প্রদর্শন করবে; অতঃপর তাদের কোন সাহায্য করা হবে না। \n\n" +
                " ০৫৯:০১৩] নিশ্চই তাদের মনে ভয়-ভীতিতে আল্লাহর চেয়ে তোমারা বেশি ভয়ংকর। এটি এ জন্য যে, তারা এমন এক জাতি যারা বুঝে না। \n\n" +
                " ০৫৯:০১৪] তারা দুর্গ দিয়ে সুরক্ষিত জনপদগুলোতে অবস্থান করে অথবা প্রাচীরের পিছন থেকে যুদ্ধ ছাড়া তোমাদের সাথে কখনও সম্মিলিতভাবে যুদ্ধ করবে না। তাদের নিজেদের মধ্যকার যুদ্ধ অতীব ভীষণ। তুমি তাদেরকে সংঘবদ্ধ মনে কর; অথচ তাদের অন্তরগুলো বিচ্ছিন্ন। এটি এজন্য, তারা এমন জাতি যারা বিবেক-বুদ্ধি প্রয়োগ করে না। \n\n" +
                " ০৫৯:০১৫] তাদের উপমা সে সব লোকের মত যারা তাদের পূর্বে নিকটবর্তীকালে অতীত হয়েছে, তারা তাদের কৃত-কর্মের প্রতিফল আস্বাদন করেছে। এবং তাদের জন্য যন্ত্রণাদায়ক দুঃখ-কষ্ট আছে। \n\n" +
                " ০৫৯:০১৬] অথবা তাদের উপমা সেই শয়তানের মত যে একসময়ে মানুষকে বলে, \"অস্বীকার কর;\" যখন সে অস্বীকার করে,তখন সে বলে, \"আমি তোমার থেকে দায়-মুক্ত নিশ্চই আমি আল্লাহকে ভয় করি,যিনি মহাবিশ্বের ক্রমবিকাশক।\" \n\n" +
                " ০৫৯:০১৭] ফলে উভয়ের এ পরিণাম দাঁড়ায়, তারা অনুতপের আগুনে নিপতিত হয়, সেখানে তারা দীর্ঘকাল বাস করবে। এবং এটিই অন্যায়কারীদের প্রতিফল। \n\n" +
                " ০৫৯:০১৮] হে যারা আল্লাহকে এককসত্তা মেনে নিয়েছ ! তোমারা আল্লাহর জন্য সচেতনতা অবলম্বন কর এবং প্রত্যেককেই চিন্তা করে দেখা উচিত, আগামীকালের জন্য সে আগে আগে কী পাঠিয়েছে। এবং তোমরা আল্লাহর জন্য সচেতনতা অবলম্বন কর, তোমরা যে কাজই কর তা সম্বন্ধে নিশ্চই আল্লাহ সবিশেষ খবর রাখেন। \n\n" +
                " ০৫৯:০১৯] তোমরা সে সব লোকের মত হবে না যারা আল্লাহকে ভুলে গেছে , ফলে তিনিও তাদেরকে আত্মবিস্মৃত করে দিয়েছেন। এরাই দুষ্কৃতকারী। \n\n" +
                " ০৫৯:০২০] অনুতাপস্থলে অবস্থানকারীরা এবং জান্নাতবাসীরা সমান নয়। জান্নাতবাসীরাই সফল । \n\n" +
                " ০৫৯:০২১] যদি আমরা এ কুরআনকে কোন পর্বতের উপর অবতীর্ণ করতাম তাহলে আপনি নিশ্চই তাকে আল্লাহর ভয়ে বিনীত, বিদীর্ণ হতে দেখতেন। এবং এসব উপমা, যা আমরা মানব জাতির জন্য বর্ণনা করছি যাতে তারা চিন্তা করে।  \n\n" +
                " ০৫৯:০২২] তিনিই আল্লাহ এককসত্তা, যিনি ছাড়া কোন উদ্ভাবনীশক্তি নেই, তিনি অজানা এবং প্রত্যক্ষ সকল বিষয়ে পরিজ্ঞাত। তিনি এককসত্তা করুনাময় দাতা, এককসত্তা দয়াময়। \n\n" +
                " ০৫৯:০২৩] তিনিই আল্লাহ এককসত্তা, যিনি ছাড়া অন্য কোন উদ্ভাবনীশক্তি নেই যিনি পরম-মহাবিশ্ব, অনতিক্রম্য, পরম শান্তির আধার, পূর্ণ নিরাপত্তাদাতা, সর্বোত্তম রক্ষাকর্তা, ভালবাসা-কনিকার মহাসাগর, বিরাটাকায়, মহাশক্তিধর। তাদের পৃথকসত্বা কল্পনা থেকে আল্লাহ অত্যন্ত নিয়মশীল। \n\n" +
                " ০৫৯:০২৪] তিনি আল্লাহ্, একমাত্র সৃষ্টিকর্তা, মহা উদ্ভাবক, সর্বোত্তম আকৃতিদাতা(ডিজাইনার)। সুন্দরতম নামসমুহ তাঁরই। বায়ুমণ্ডলগুলোতে যা কিছু আছে এবং পৃথিবীগুলোতে যা কিছু আছে সকলেই আল্লাহর নিয়মে দায়িত্ব পালন(তছবিহ) করছে এবং তিনি ভালবাসা-কনিকার মহাসাগর(আল-আযিয), মহাবিজ্ঞানী(আল-হাকিম)। \n\n" +
                "</string>");
        editor.putString("58","পরিচ্ছেদ ০৫৮.দৃশ্যঃ বিতর্ককারিনী(সূরা আল-মুজাদেলা The polemicist) \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ২৩ আয়াত এবং ৩ রুকূ আছে। \n\n" +
                " ০৫৮:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৫৮:০০১] আল্লাহ অবশ্য সে মহিলার কথা শুনেছেন, যে তার স্বামীর সম্বন্ধে আপনার সাথে বিতর্ক করছিল এবং আল্লাহর কাছে অভিযোগ করছিল। এবং আল্লাহ আপনাদের উভয়ের বাক্যালাপ শুনছিলেন। নিশ্চই আল্লাহ সবশ্রোতা,সর্বদ্রষ্টা । \n\n" +
                " ০৫৮:০০২] তোমাদের মধ্যে যারা নিজেদের স্ত্রীদেরকে ‘মা’ বলে ফেলে(‘যিহার’ করে), তারা তাদের ‘মা’ হয় না, তাদের মা কেবল তারাই যারা তাদেরকে প্রসব করেছে। এবং নিশ্চই আল্লাহ মাজর্নাকারী,সংশোধনশীল। \n\n" +
                " ০৫৮:০০৩] এবং যারা নিজেদের স্ত্রীদেরকে ‘মা’ বলে ফেলে অতঃপর তারা যা বলেছে তা থেকে ফিরে আসে, তাহলে তারা পরস্পরকে স্পশ করার পূর্বে তাদেরকে অবশাই একজন ক্রিতদাসকে মুক্ত করে দিতে হবে। এটাই সেই বিষয় যে সম্বন্ধে তোমাদেরকে উপদেশ দেয়া হচ্ছে। এবং তোমরা যে কাজই কর তা সম্বন্ধে আল্লাহ সবিশেষ খবর রাখেন। \n\n" +
                " ০৫৮:০০৪] কিন্তু যে (ক্রিতদাস) না পায়, তাহলে তারা পরস্পর স্পশ করার পূর্বে তাকে একাদিক্রমে দুই মাস (৬০টি)রোযা রাখতে হবে। কিন্তু সে যদি এতে অসমর্থ হয় তাহলে তাকে ৬০ জন অভাবগ্রস্থকে খাওয়াতে হবে । এটি এজন্য যেন তোমরা আল্লাহর এককসত্বা এবং তাঁর রসূল(কুরআন)কে জীবনবিধান মেনে নিতে পার। এবং এগুলো আল্লাহর (নির্ধারিত)সীমারেখা, এবং অস্বীকারকারীদের জন্য রয়েছে যন্ত্রণাদায়ক দুঃখ-কষ্ট। \n\n" +
                " ০৫৮:০০৫] নিশ্চই যারা আল্লাহ এবং তাঁর রসূল(কুরআন)এর বিরোধিতা করে, তাদেরকে অপদস্থ করা হবে, যেভাবে তাদের পূর্ববতীদেরকে অপদস্থ করা হয়েছিল, এবং আমরা অবশ্যই সূস্পষ্ট প্রামান্য তথ্য সহ আয়াত(নিদর্শন) গুলো অবতীর্ণ করেছি। এবং অস্বীকারকারীদের জন্য অপমানজনক দুঃখ-কষ্ট অবধারিত আছে। \n\n" +
                " ০৫৮:০০৬] একদিন আল্লাহ্ তাদের সকলকে পুনরুথিত করবেন এবং তিনি তাদের কৃতকর্ম সম্বন্ধে অবহিত করবেন। আল্লাহ্ এসবের হিসাব করে রেখেছেন, কিন্ত তারা তা ভুলে গেছে। যেহেতু আল্লাহ্ সকল বিষয়ের উপর সাক্ষী। \n\n" +
                " ০৫৮:০০৭] আপনি কি চিন্তা করে দেখেন না, যা কিছু বায়ুমণ্ডলগুলোত আছে এবং যা কিছু পৃথিবীগুলোতে আছে আল্লাহ্ সব জানেন? তিন জনের এমন কোন গোপন পরামর্শ হয় না যা-তে তিনি তাদের চতুর্থজন না হন, এবং না পাঁচ জনের হয় যাতে তিনি তাদের ষষ্ঠজন না হন,এবং (সংখ্যায়) এর অপেক্ষা অল্প হোক অথবা বেশি হোক তিনি আবশ্যই তাদের সাথে থাকেন- তারা যেখানেই থাকুক না কেন। অতঃপর কিয়ামতের দিন তিনি তাদেরকে তাদের কৃত-কর্ম সম্বন্ধে অবহিত করবেন। নিশ্চই আল্লাহ্ সর্ব বিষয়ে সর্বজ্ঞানী। \n\n" +
                " ০৫৮:০০৮] আপনি কি তাদেরকে দেখেন নাই যাদেরকে গোপন পরার্মশ করতে নিষেধ করা হয়েছে, অতঃপর তারা পুনরায় সে কাজেই ফিরে, যা থেকে তাদেরকে নিষেধ করা হয়েছিল,এবং তারা পাপ কাজ,সীমালংঘন এবং রসূল(কুরআন)এর অবাধ্যতা করার জন্য গোপন পরামর্শ করে? এবং যখন তারা আপনার কাছে আসে তখন তারা আপনাকে এমন ভাবে অভিবাদন করে যেভাবে আল্লাহ্ও আপনাকে অভিবাদন করেন নাই. এবং তারা নিজেদের মধ্যে বলে, \"আমরা যা বলি তারজন্য আল্লাহ্ আমাদেরকে দুঃখ-কষ্ট দেন না কেন?\" তাদের জন্য অনুতাপস্থলই যথেষ্ট, তাতে তারা অবস্থান করবে, এবং সেটি কতই না মন্দ প্রত্যাবর্তনস্থল। \n\n" +
                " ০৫৮:০০৯] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ ! যখন তোমরা পরস্পরের মধ্যে গোপন পরামর্শ কর, তখন পাপকাজ, সীমালংঘন এবং রসূল(কুরআন)এর অবাধ্যতা সম্পর্কে গোপন পরামর্শ কোরও না, বরং ভালকাজ এবং সচেতনতা সম্বন্ধে পরামর্শ কর, এবং সচেতনতা অবলম্বন কর আল্লাহর জন্য, যার কাছে তোমাদেরকে সমবেত করা হবে। \n\n" +
                " ০৫৮:০১০] নিশ্চই (মন্দ বিষয়ে) গোপন পরামর্শ কেবল শয়তান (নিজ স্বাধীন ইচ্ছা) থেকে, যেন সে সেসব লোকদেরকে দুঃখ দেয় যারা আল্লাহকে এককসত্তা মেনে নিয়েছে , অথচ আল্লাহর অনুমতি ছাড়া সে তাদের কোন অনিষ্ট করতে পারবে না। সুতরাং স্বীকারকারীদেরকে আল্লাহর উপরই নির্ভর করা উচিত। \n\n" +
                " ০৫৮:০১১] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ ! যখন তোমাদেরকে বলা হয়, \"তোমরা মজলিসে জায়গা খোলা রেখে বস,\" তখন তোমরা জায়গা খোলা রেখে বসবে আল্লাহ্ তোমাদেরকে প্রশস্ততা দান করবেন। এবং যখন বলা হয়, \"তোমার উঠ,\" তখন তোমারা উঠে পড়বে। তোমাদের মধ্যে যারা আল্লাহকে এককসত্তা মেনে নিয়েছ এবং যাদেরকে জ্ঞান দান করা হয়েছে তাদেরকে আল্লাহ্ মর্যাদায় সমুন্নত ও সম্মানিত করবেন। এবং তোমরা যে কাজই কর তা সম্বন্ধে আল্লাহ্ সবিশেষ খবর রাখেন। \n\n" +
                " ০৫৮:০১২] হে যারা আল্লাহকে এককসত্তা মেনে নিয়েছ ! যখন তোমরা রসূল(মুহাম্মদ)এর সাথে পৃথকভাবে পরামর্শ করতে চাও, তোমরা তোমাদের পরামর্শের পূর্বে কিছু সদকা প্রদান করবে। তা তোমাদের জন্য মঙ্গলজনক এবং শুদ্ধতার কারণ হবে। কিন্তু যদি তোমরা কিছু দিতে না পার তাহলে নিশ্চই আল্লাহ অত্যন্ত সংশোধনশীল এবং এককসত্তা দয়াময়। \n\n" +
                " ০৫৮:০১৩] তোমরা কি তোমাদের পরামর্শের পূর্বে সদকা দিতে ভয় কর? সূতরাং যখন তোমরা এমন কর নাই এবং আল্লাহ তোমাদের প্রতি সদয় দৃষ্টিপাত করলেন,তখন তোমরা মানুষে মানুষে ভালবাসা(সালাত) স্থাপন কর এবং (গরিবদের অন্ন-বস্ত্র এককভাবে দান এবং বিপদাপন্ন ও দরিদ্রদূরিকরনে সম্মিলিত ভাবে দানের মাধ্যমে) শুদ্ধতা অর্জন কর এবং তাঁর রসূল(কুরআন)এর আনুগত্য কর। এর্ং তোমারা যে কাজ কর তা সম্বন্ধে আল্লাহ্ সবিশেষ খবর রাখেন। \n\n" +
                " ০৫৮:০১৪] আপনি কি তাদের দিকে লক্ষ্য করেন নাই যারা এমন জাতির সাথে বন্ধুত্ব করেছে যাদের উপর আল্লাহ ক্রোধ বর্ষণ করেছেন, তারা আপনাদের থেকেও না এবং তাদের মধ্য থেকেও না এবং তারা জ্ঞাতসারে মিথ্যা বিষয়ের শপথ করছে? \n\n" +
                " ০৫৮:০১৫] আল্লাহ্ তাদের জন্য কঠোর শাস্তি প্রস্তুত করে রেখেছেন। নিশ্চই তারা যে কাজ করছে তা অতি নিকৃষ্ট। \n\n" +
                " ০৫৮:০১৬] তারা তাদের শপথকে ঢাল বানিয়ে নিয়েছে এবং তারা এটি দিয়ে আল্লাহর পথ থেকে নিবৃত্ত রাখছে, সুতরাং তাদের জন্য লাঞ্ছনাজনক দুঃখ-কষ্ট অবধারিত। \n\n" +
                " ০৫৮:০১৭] না তাদের ধন-সম্পদ এবং না তাদের সন্তান-সন্ততি আল্লাহর মোকাবেলায় কোনও কাজে লাগবে। এরাই (অনুতাপের)আগুনের অধিবাসী,তারা তাতে বসবাস করতে থাকবে। \n\n" +
                " ০৫৮:০১৮] যে দিন আল্লাহ্ তাদের সকলকে পুনরুত্থিত করবেন,তখন তারা তাঁর সম্বন্ধে এভাবেই শপথ করবে যেভাবে তারা তোমাদের সামনে শপথ করে,এবং তারা মনে করে,তারা কোন বিষয়ের উপর (ভিত্তি করে) আছে। সাবধান ! নিশ্চই তারাই মিথ্যাবাদী। \n\n" +
                " ০৫৮:০১৯] শয়তান তাদেরকে পরাভূত করে তাদের উপর প্রভাব বিস্তার করেছে এবং তাদেরকে আল্লাহর স্মারক-বানী(যিকর) ভুলিয়ে দিয়েছে। এরাই শয়তানের দল। সাবধান নিশ্চই শয়তানের দলই ক্ষতিগ্রস্ত। \n\n" +
                " ০৫৮:০২০] নিশ্চই যারা আল্লাহ এবং তাঁর রসূল(কুরআন)এর বিরুদ্ধাচরণ করে তারাই লাঞ্ছিতদের অন্তর্ভুক্ত। \n\n" +
                " ০৫৮:০২১] আল্লাহ লিখে নিয়েছেন, নিশ্চই আমি এবং আমার রসূলরাই বিজয়ী হব। নিশ্চই আল্লাহ্ মহাতেজস্বী, ভালবাসা-কনিকার মহাসাগর। \n\n" +
                " ০৫৮:০২২] আপনি এমন কোনও জাতি পাবেন না যারা আল্লাহর এককসত্বা ও পরকালের-জীবন মেনে নেয় এবং (অপরদিকে)তারা তাদেরকেও ভালবাসে যারা আল্লাহ এবং তাঁর রসূল(কুরআন)এর বিরুদ্ধাচরণ করেছে, যদিও তারা তাদের পিতৃপুরুষ অথবা তাদের সন্তান-সন্ততি অথবা তাদের ভ্রাতৃবৃন্দ অথবা তাদের গোত্র-গোষ্ঠির অন্তর্ভুক্ত হোক না কেন। সেসব লোক এমনই যাদের হৃদয়ে আল্লাহ (প্রকৃত) স্বীকৃতি অষ্কিত করেন এবং তিনি তাঁর সন্নিধান থেকে আদেশ-বাণী দিয়ে তাদেরকে শক্তিশালী করেন,এবং তিনি তাদেরকে এমন জান্নাতগুলোতে প্রবিষ্ট করবেন যাদের তলদেশ দিয়ে অব্যাহত পানির সরবরাহ থাকবে। সেখানে তারা চিরকাল বসবাস করবে। তাদের প্রতি আল্লাহ্ সন্তুষ্ট এবং তারাও আল্লাহর প্রতি সন্তুষ্ট্। এরাই আল্লাহর দল। জেনে রাখুন, নিশ্চই আল্লাহর দলই সফল হবে। \n\n" +
                "</string>");
        editor.putString("57","পরিচ্ছেদ ০৫৭.দৃশ্যঃ লোহা(সূরা আল-হাদীদ The Iron) \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ৩০ আয়াত এবং ৪ রুকূ আছে। \n\n" +
                " ০৫৭:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৫৭:০০১] বায়ুমণ্ডলগুলোতে যা কিছু আছে এবং পৃথিবীগুলোতে যা কিছু আছে সকলেই আল্লাহর নিয়মে দায়িত্ব পালন(তছবিহ)করছে এবং তিনি ভালবাসা-কনিকার মহাসাগর(আল-আযিয), মহাবিজ্ঞানী(আল-হাকিম)। \n\n" +
                " ০৫৭:০০২] বায়ুমণ্ডলগুলোর এবং পৃথিবীগুলোর অধিকারী তিনিই, তিনি জীবন দান করেন এবং মৃত্যু দেন এবং তিনি সকল বিষয়ের পরিমিত পরিমাপ নিরুপনকারী। \n\n" +
                " ০৫৭:০০৩] তিনিই আদি থেকে অন্ত এবং ব্যক্ত থেকে গুপ্ত এবং তিনিই সকল বিষয়ে সর্বজ্ঞানী। \n\n" +
                " ০৫৭:০০৪] তিনিই বায়ুমণ্ডলগুলোকে ও পৃথিবীগুলোকে অনন্তের কাছাকাছি অন্তযূক্ত মহাকাল ধরে (ছয়দিনে) সৃষ্টি করে চলেছেন, অতএব তিনি জানেন, যা কিছু পৃথিবীতে প্রবেশ করে এবং যা কিছু তা থেকে বর্হিগত হয় এবং যা কিছু মহাকাশ থেকে অবতরণ করে এবং যা কিছু তাতে আরোহণ করে এবং তিনি তোমাদের সাথে আছেন যেখানেই তোমরা থাক না কেন। এবং তোমরা যা কিছুই কর আল্লাহ তা প্রত্যক্ষ করেন। \n\n" +
                " ০৫৭:০০৫] বায়ুমণ্ডলগুলোর এবং পৃথিবীগুলোর অধিকারী তিনিই, বস্তুতঃ আল্লাহরই দিকে সমস্ত বিষয় প্রত্যাবর্তিত হবে। \n\n" +
                " ০৫৭:০০৬] তিনি রাতকে দিনে প্রবিষ্ট করান(ফজর-টোয়াইলাইট) এবং দিনকে রাত্রিতে প্রবিষ্ট করান(ইশা-টোয়াইলাইট), এবং মনের ভিতরে থাকা সমস্ত বিষয় তিনি সর্বতোভাবে পরিজ্ঞাত। \n\n" +
                " ০৫৭:০০৭] তোমরা আল্লাহকে এককসত্তা ও তাঁর রসূল(কুরআন)কে জীবনবিধান মেনে নাও, এবং তিনি তোমাদেরকে যা কিছুর উত্তরাধিকারী করেছেন তাথেকে (আল্লাহর সন্তুষ্টির জন্যে) খরচ কর। অতএব তোমাদের মধ্য থেকে যারা মেনে নিয়েছে এবং খরচ (দরিদ্রদেরকে অন্ন ও বস্ত্র এককভাবে দান এবং দারিদ্র দূরিকরণে সম্মিলিত ভাবে দান) করে, তাদের জন্য রয়েছে মহাপুস্কার। \n\n" +
                " ০৫৭:০০৮] এবং তোমাদের কী হয়েছে, তোমরা আল্লাহকে এককসত্তা মেনে নাও না, যদিও এ রসূল (কুরআন) তোমাদেরকে আহবান করছে যেন তোমরা তোমাদের ক্রমবিকাশককে মেনে নাও, এবং যদি তোমরা স্বীকারকারী হও তাহলে জেনে রাখ, তিনি তোমাদের থেকে এক দৃঢ় অঙ্গীকার গ্রহণ করেছেন? \n\n" +
                " ০৫৭:০০৯] তিনিই তাঁর বান্দার উপর সুস্পষ্ট প্রামান্য তথ্য বিশিষ্ট আয়াত গুলো অবতীর্ণ করেন, যেন তিনি সেগুলো দিয়ে তোমাদেরকে অন্ধকার(মূর্খতা) থেকে আলো(জ্ঞান)এর দিকে নিয়ে আসেন (অর্থাৎ শিক্ষাদান করেন)। এবং নিশ্চই আল্লাহ তোমাদের প্রতি অতীব মমতাশীল এবং এককসত্তা দয়াময়। \n\n" +
                " ০৫৭:০১০] এবং তোমাদের কী হয়েছে, তোমরা আল্লাহর পথে খরচ কর না? অথচ বায়ুমণ্ডলগুলোর এবং পৃথিবীগুলোর মালিকানা একমাত্র আল্লাহর, তোমাদের মধ্য থেকে কেউ তাঁর সমান হতে পারে না। যে বিজয়ের পূর্বে খরচ করেছে এবং যুদ্ধ করেছে, এরা পদমর্যাদায় তাদের অপেক্ষা শ্রেষ্ঠতর যারা বিজয়ের পরে খরচ করেছে এবং যুদ্ধ করেছে। এবং সবার সাথে আল্লাহ কল্যাণের প্রতিশ্রুতি দান করেছেন। এবং আল্লাহ তোমাদের কাজ সম্বন্ধে, যা তোমরা কর, সবিশেষ অবগত আছেন। \n\n" +
                " ০৫৭:০১১] কে আছে যে আল্লাহকে অতি উত্তম ঋণ দিবে? ফলে, তিনি সে ঋণকে তার জন্য বাড়িয়ে দিবেন এবং তার জন্য এক সম্মানজনক পুরস্কার অবধারিত আছে। \n\n" +
                " ০৫৭:০১২] যেদিন আপনি স্বীকারকারী পুরুষদেরকে এবং স্বীকারকারী নারীদেরকে দেখতে পাবেন, তাদের নূর তাদের সামনে এবং তাদের ডানে ধাবমান আছে, (ফেরেস্তারা তাদেরকে বলবে) \"আজ তোমাদেরকে জান্নাত গুলোর সুসংবাদ দেয়া হচ্ছে যার তলদেশ দিয়ে অব্যহত পানির সরবরাহ আছে, তারা সেখানে চিরকাল বাস করবে। এটিই মহান সফলতা।\" \n\n" +
                " ০৫৭:০১৩] যেদিন দ্বিধাগ্রস্থ পুরুষ এবং দ্বিধাগ্রস্থ নারীরা স্বীকারকারীদেরকে বলবে, \"আমাদের জন্য অপেক্ষা কর যাতে আমরা তোমাদের নূর থেকে কিছু গ্রহণ করতে পারি।\" তখন(তাদেরকে) বলা হবে, \"তোমরা পিছনে ফিরে যাও এবং (সেখানে) নূর অন্বেষণ কর।\" অতঃপর তাদের উভয়ের মধ্যে একটি প্রাচীর তুলে দেয়া হবে যাতে একটি দরজা থাকবে। তার অভ্যন্তরে রহমত বিরাজ করবে এবং তার বাইরে তার সম্মুখভাগে দুুঃখ-কষ্ট থাকবে। \n\n" +
                " ০৫৭:০১৪] তারা(দ্বিধাগ্রস্থরা) তাদেরকে(স্বীকারকারীদেরকে) বলবে, \"আমরা কি তোমাদের সাথে ছিলাম না?\" তারা বলবে, \"হাঁ, কিন্তু তোমরা নিজেরাই নিজদেরকে দুর্বিপাকে ফেলেছ, এবং তোমরা (আমাদের ধ্বংসের) অপেক্ষা করতে এবং নানা প্রকার সন্দেহ করতে, প্রকৃতপক্ষে হীন-বাসনা গুলো তোমাদেরকে প্রতারিত করেছে- আল্লাহর আদেশ না আসা পর্যন্ত। এবং আল্লাহ সম্পর্কে প্রবঞ্চক(শয়তান) তোমাদেরকে প্রবঞ্চিত করল।\" \n\n" +
                " ০৫৭:০১৫] \"সুতরাং আজ(হে দ্বিধাগ্রস্থরা) না তোমাদের থেকে, না যারা অস্বীকার করেছে তাদের থেকে কোন প্রকার মুক্তি-পণ গ্রহণ করা হবে। তোমাদের আশ্রয়স্থল আগুন, সেটিই তোমাদের সঙ্গী, এবং তা কতই না মন্দ বাসস্থল।\" \n\n" +
                " ০৫৭:০১৬] যারা আল্লাাহকে এককসত্তা মেনে নিয়েছে তাদের জন্য এখনও কি সে সময় আসে নাই, যখন তাদের মন আল্লাহর স্মারক-বানীর জন্য এবং যে বিজ্ঞান অবতীর্ণ হয়েছে তার জন্য ভয়ে বিনীত হয়? এবং (স্বীকারকারীদের কর্তব্য) তারা যেন তাদের মত না হয়, যাদেরকে ইতোপূর্বে গ্রন্থ দেয়া হয়েছিল, কিন্তু তাদের উপর (আল্লাহর বিজ্ঞান-প্রযূক্তি অবতীর্ণ হওয়ার) সময়কাল দীর্ঘ হওয়ায় তাদের মন-মগজ কঠিন হয়ে গিয়েছিল এবং তাদের অধিকাংশই দুষ্কৃতকারী ছিল। \n\n" +
                " ০৫৭:০১৭] জেনে রাখুন, আল্লাহ পৃথিবীগুলোকে সেটির নির্জীবতার পর প্রান সঞ্চার করেন, অবশ্যই আমরা আপনাদের জন্য আয়াত(নিদর্শন) গুলো সুস্পষ্ট প্রামান্য তথ্যের ভিত্তিতে বর্ণনা করেছি যেন আপনারা বুদ্ধি-বিবেক প্রয়োগ করেন। \n\n" +
                " ০৫৭:০১৮] নিশ্চই দানশীল পুরুষরা এবং দানশীল নারীরা এবং যারা আল্লাহকে অতি উত্তম ঋণ দান করে- তাদেরকে বাড়িয়ে দেয়া হবে, তদুপরি তাদের জন্য রয়েছে অতি সম্মানজনক পুরস্কার- \n\n" +
                " ০৫৭:০১৯] যারা আল্লাহ এবং তাঁর রসূলদেরকে মেনে নিয়েছে, তারা তাদের ক্রমবিকাশকের কাছে \"সিদ্দীক\" এবং \"শহীদ\"দের পর্যায়ভুক্ত। তাদের জন্য রয়েছে তাদের \"পুরস্কার\" এবং তাদের \"নূর\"। কিন্তু যারা অস্বীকার করেছে এবং আমাদের আয়াতগুলোকে মিথ্যা প্রতিপন্ন করেছে তারা অনুতাপস্থলের অধিবাসী। \n\n" +
                " ০৫৭:০২০] তোমরা জেনে রাখ, এ ইহকালীন-জীবন ক্রীড়া-কৌতুক, আনন্দ-উল্লাস, সৌন্দর্য, বিলাস- চাকচিক্য, তোমাদের মধ্যে ধন-সম্পদ ও সন্তান-সন্ততি বৃদ্ধির প্রতিযোগীতা মাত্র। এর দৃষ্টান্ত বৃষ্টিধারার মত যার (উৎপাদিত)শাস্যাদি কৃষকদেরকে চমৎকৃত করে, অতঃপর তা পরিপক্ক হয় এবং আপনি তাকে হলুদবর্ণ দেখতে পান, যা অবশেষে চূর্ণ-বিচূর্ণ হয়ে যায়। যদিও পরকালে রয়েছে কঠিন দুঃখ-কষ্ট, এবং আল্লাহর কাছ থেকে সংশোধন এবং সন্তুষ্টি। এবং এ ইহকালীন-জীবন (সাময়িক) ছলনাময়ী ভোগ্যবস্তু ছাড়া কিছু নয়। \n\n" +
                " ০৫৭:০২১] তোমাদের ক্রমবিকাশকের পক্ষ থেকে সংশোধন এবং এমন জান্নাতের দিকে দ্রুত অগ্রসর হও, যার প্রকাশ বায়ুমণ্ডলগুলো ও পৃথিবীগুলো, যা প্রস্তুত করা হচ্ছে সেসব লোকদের জন্য যারা আল্লাহর এককসত্তাকে এবং তাঁর রসূলদেরকে মেনে নিয়েছে। এটি আল্লাহর বিশেষ বিজ্ঞান-প্রযূক্তি, তিনি যাকে চান এটি দান করেন এবং আল্লাহ মহান বিজ্ঞান-প্রযূক্তির অধিকারী। \n\n" +
                " ০৫৭:০২২] পৃথিবীগুলোতে এবং তোমাদের নিজেদের উপর এমন কোন দুঃখ-ক্লেশ আসে না, তা আমরা প্রকাশ করার পূর্বেই এক গ্রন্থে লিপিবদ্ধ না থাকে নিশ্চই তা আল্লাহর জন্য অতি সহজ- \n\n" +
                " ০৫৭:০২৩] যেন তোমরা তোমাদের হারানো বস্তুর জন্য দুঃখ না কর এবং যা তিনি তোমাদেরকে দেন তাতে তোমরা আনন্দে স্ফীত না হও। এবং আল্লাহ কোন দাম্ভিক ও অহংকারীকে ভালবাসেন না- \n\n" +
                " ০৫৭:০২৪] যারা স্বয়ং কৃপণতা করে এবং লোকদেরকেও কৃপণতার আদেশ দেয়, এবং এবং যারা মুখ ফিরিয়ে নেয়, সেক্ষেত্রে নিশ্চই আল্লাহই প্রাচুর্যশীল এবং সকল ধন্যবাদের অধিকারী। \n\n" +
                " ০৫৭:০২৫] নিশ্চই আমরা আমাদের রসূলদেরকে সুস্পষ্ট প্রমান্য তথ্যসহ পাঠিয়েছি এবং তাদের সাথে বিজ্ঞান-গ্রন্থ এবং মধ্যাকর্ষণ(ব্যালেন্স) অবতীর্ণ করেছি যাতে মানুষ ভারসাম্য বজায় রাখতে পারে। এবং আমরা লৌহঅবতীর্ণ করেছি, যাতে বিভিন্ন শক্তিশালী যন্ত্রপাতির উপকরণ আছে এবং মানব জাতির জন্য বহুবিধ উপকার আছে, এবং যেন আল্লাহ স্বতন্ত্রভাবে প্রকাশ করেন তাদেরকে যারা তাঁকে এবং তাঁর অনাগত (ভবিষ্যৎ) রসূলদের সাহায্য করে। নিশ্চই আল্লাহ্ মহাতেজস্বী, ভালবাসা-কনিকার মহাসাগর। \n\n" +
                " ০৫৭:০২৬] এবং নিশ্চই আমরা নূহ ও ইবরাহীমকে প্রেরণ করেছিলাম এবং উভয়ের বংশধরদের মধ্যে নুবওয়াত এবং গ্রন্থ দান করেছিলাম। সুতরাং তাদের মধ্যে কতক সুপথ-প্রাপ্তির-নির্দেশনার অনুসরণ করেছিল এবং তাদের মধ্যে অধিকাংশই ছিল দুষ্কৃতকারী। \n\n" +
                " ০৫৭:০২৭] অতঃপর তাদের পদাঙ্ক অনুসরণে আমরা পর্যায়ক্রমে আমাদের রসূলদেরকে পাঠিয়েছিলাম, এবং আমরা(তাদের) পিছনে মরিয়মের পুত্র ঈসাকে পাঠিয়েছিলাম এবং তাকে ইনজীল প্রদান করেছিলাম তাদের অন্তরে আমরা স্নেহ-মমতা ও দয়ার সৃষ্টি করেছিলাম। আর যে সন্যাসবাদ-এটি তারা নিজেরাই প্রবর্তন করেছিল- যার নির্দেশ আমরা তাদেরকে দেই নাই, তারা অবশ্য আল্লাহর সন্তোষ লাভের জন্যই এটি করেছিল, কিন্তু তারা এর \n\n" +
                "যথোচিত মর্যাদা রক্ষা করতে পারে নাই। অতঃপর তাদের থেকে যারা আল্লাহকে এককসত্তা মেনে নিয়েছিল তাদেরকে আমরা তাদের পুরস্কার দিয়েছিলাম কিন্তু তাদের অধিকাংশই ছিল দুষ্কৃতকারী। \n\n" +
                " ০৫৭:০২৮] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ ! তোমরা আল্লাহর জন্য সচেতনতা অবলম্বন কর এবং তাঁর রসূল(কুরআন)কে মেনে নাও। তিনি তোমাদেরকে নিজ রহমত থেকে দ্বিগুণ পুরস্কার দান করবেন এবং তোমাদের জন্য এমন নূর(বিজ্ঞান শিক্ষা) নির্ধারণ করবেন যার সাহায্যে তোমরা(অন্ধকারে) পথ চলতে পার, এবং তোমাদের অপরাধ সংশোধন করবেন -যেহেতু আল্লাহ অতীব সংশোধনশীল, এককসত্তা দয়াময়। \n\n" +
                " ০৫৭:০২৯] অবশ্য পূর্বগ্রন্থধারীরা নাও জানতে পারে, সকল বস্তুতে আল্লাহ বিজ্ঞান ভিত্তিক পরিমিত পরিমাপ নিরুপনে সক্ষম, যেহেতু বিজ্ঞান শিক্ষা আল্লাহর হাতে রয়েছে, তিনি যাকে চান এটি দান করেন এবং আল্লাহ মহান বিজ্ঞান-প্রযূক্তির অধিকারী। \n\n" +
                "</string>");
editor.putString("56","পরিচ্ছেদ ০৫৬.দৃশ্যঃ পরিণাম ফলাফল(সূরা আল-ওয়াকি’আ The Event) \n\n" +
        "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৯৭ আয়াত এবং ৩ রুকূ আছে। \n\n" +
        " ০৫৬:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
        " ০৫৬:০০১] যখন পরিণাম ফলাফল সংঘটিত হবে- \n\n" +
        " ০৫৬:০০২] এর সংঘটনে মিথ্যার কোন অবকাশ নেই- \n\n" +
        " ০৫৬:০০৩] এটি(কতককে) অধঃপতিত করবে এবং (কতককে) সমুন্নত করবে। \n\n" +
        " ০৫৬:০০৪] যখন পৃথিবীকে প্রচন্ড কম্পনে প্রকম্পিত করা হবে। \n\n" +
        " ০৫৬:০০৫] এবং পর্বতসাদৃশ মহাকাশযান গুলোকে উৎক্ষেপন মঞ্চের হাতল খুলে উৎক্ষিপ্ত করা হবে। \n\n" +
        " ০৫৬:০০৬] অতঃপর সেগুলো মহাকাশ যাত্রা করবে ধোঁয়া ধূলিকণা উড়িয়ে, \n\n" +
        " ০৫৬:০০৭] এবং তোমরা তিন শ্রেণীতে বিভক্ত হয়ে যাবে, \n\n" +
        " ০৫৬:০০৮] যেমন, কাছের(ডানহাতের) সহচরবৃন্দ- কেমন হবে কাছের সহচরবৃন্দ? \n\n" +
        " ০৫৬:০০৯] এবং দূরের(বামহাতের) সহচরবৃন্দ- কেমন হবে দূরের সহচরবৃন্দ? \n\n" +
        " ০৫৬:০১০] এবং অগ্রগামী, তারা প্রকৃতই অগ্রগামী হবে, \n\n" +
        " ০৫৬:০১১] এরাই নৈকট্যপ্রাপ্ত হবে, \n\n" +
        " ০৫৬:০১২] অনুগ্রহে-পুরস্কারে ভরপুর নতুন নতুন পৃথিবীতে(জান্নাতে) \n\n" +
        " ০৫৬:০১৩] অগ্রগামীদের মধ্য থেকে হবে এক বড় দল, \n\n" +
        " ০৫৬:০১৪] এবং পরবর্তীদের(কাছের সহচরদের) মধ্য থেকে হবে, এক ছোট দল, \n\n" +
        " ০৫৬:০১৫] স্বর্ণখচিত পালঙ্কগুলোর উপর, \n\n" +
        " ০৫৬:০১৬] সেগুলোর উপরে হেলান দিয়ে, মুখোমুখি অবস্থায়- \n\n" +
        " ০৫৬:০১৭] চিরকিশোররা তাদের মধ্যে ঘুরে ফিরে পরিবেশন করতে থাকবে, \n\n" +
        " ০৫৬:০১৮] ঝরণার পানি পূর্ণ পান-পাত্র, সুরাহী এবং পেয়ালাগুলো নিয়ে। \n\n" +
        " ০৫৬:০১৯] সেজন্যে তাদের মাথাব্যাথাও হবে না এবং তারা মাতালও হবে না। \n\n" +
        " ০৫৬:০২০] এবং ফল-মূল নিয়ে ঘুরবে যা তারা পসন্দ করবে, \n\n" +
        " ০৫৬:০২১] এবং পাখীর মাংস নিয়ে যা তারা আকাংখা করবে। \n\n" +
        " ০৫৬:০২২] এবং সেখানে আয়তলোচনা সুন্দরী নারীরা থাকবে, \n\n" +
        " ০৫৬:০২৩] সযত্নে রাখা মুক্তার মত, \n\n" +
        " ০৫৬:০২৪] এটি বিনিময় স্বরূপ হবে সেসব কাজের যা তারা করত। \n\n" +
        " ০৫৬:০২৫] সেখানে তারা না কোন বৃথা কথা শুনবে এবং না কোন মন্দকথা, \n\n" +
        " ০৫৬:০২৬] কেবল এ অভিবাদন-বাণী ছাড়া, সালাম সালাম। \n\n" +
        " ০৫৬:০২৭] আর যে কাছের সহচররা কতই না সৌভাগ্যশালী হবে কাছের সহচররা ! \n\n" +
        " ০৫৬:০২৮] কন্টকবিহীন-ভারাবনত বরই-বাগানের মধ্যে, \n\n" +
        " ০৫৬:০২৯] এবং স্তরে স্তরে সজ্জিত গুচ্ছবিশিষ্ট কলাগাছ গুলোর মধ্যে, \n\n" +
        " ০৫৬:০৩০] এবং সুবিস্তৃত ছায়াতে, \n\n" +
        " ০৫৬:০৩১] এবং প্রবহমান পানির মাঝে, \n\n" +
        " ০৫৬:০৩২] এবং প্রচুর ফল-মূলের মধ্যে, \n\n" +
        " ০৫৬:০৩৩] যা শেষও হবে না এবং নিষিদ্ধও হবে না, \n\n" +
        " ০৫৬:০৩৪] এবং সম্ভ্রান্ত নরীদের সাথে- \n\n" +
        " ০৫৬:০৩৫] নিশ্চই আমরা তাদেরকে উত্তম ভাবে সৃষ্টি করেছি, \n\n" +
        " ০৫৬:০৩৬] এবং তাদেরকে যৌনতাহীন করেছি, \n\n" +
        " ০৫৬:০৩৭] প্রেমময়ী সম-বয়স্কা করে, \n\n" +
        " ০৫৬:০৩৮] কাছের সহচরদের জন্য। \n\n" +
        " ০৫৬:০৩৯] অগ্রবর্তীগণের মধ্য থেকে হবে এক ক্ষূদ্র দল। \n\n" +
        " ০৫৬:০৪০] এবং পরবর্তীদের(কাছের সহচরদের) মধ্য থেকেও হবে এক বড় দল। \n\n" +
        " ০৫৬:০৪১] আর যে দূরের সহচররা-কেমন হবে দূরের সহচররা ! \n\n" +
        " ০৫৬:০৪২] তারা থাকবে মরুঝড় এবং উষ্ণপ্রশ্রবন(hot spring) এর পানির মধ্যে \n\n" +
        " ০৫৬:০৪৩] এবং নিকষ-কালো ধোঁয়ার ছায়াতলে, \n\n" +
        " ০৫৬:০৪৪] তা না ঠান্ডা হবে,না আরামদায়ক। \n\n" +
        " ০৫৬:০৪৫] ইতিপূর্বে তারা আরাম ও প্রাচুর্যের অবস্থায় ছিল, \n\n" +
        " ০৫৬:০৪৬] এবং তারা মহাপাপে গভীরভাবে নিমগ্ন থাকত। \n\n" +
        " ০৫৬:০৪৭] এবং তারা বলত, \"কী ! যখন আমরা মরে যাব এবং মাটি ও অস্তিপুঞ্জে পরিণত হব তখনও কি আমরা সত্যিই পুনরুত্থিত হব?\" \n\n" +
        " ০৫৬:০৪৮] এবং আমাদের পূর্ববর্তী পিতৃপুরুষরাও কি? \n\n" +
        " ০৫৬:০৪৯] আপনি বলুন, \"নিশ্চই পূর্ববর্তীরাও এবং পরবর্তীরাও, \n\n" +
        " ০৫৬:০৫০] অবশ্যই(সকলকে) একত্রিত করা হবে এক নির্দিষ্ট দিনের নির্ধারিত সময়ে। \n\n" +
        " ০৫৬:০৫১] অতঃপর তোমরা হে ভণ্ড-প্রতারক, মিথ্যা প্রতিপন্নকারীরা। \n\n" +
        " ০৫৬:০৫২] তোমরা নিশ্চই ফনিমনসা(যাক্কুম বৃক্ষ) থেকে খাবে, \n\n" +
        " ০৫৬:০৫৩] এবং তা দিয়ে পেট ভরবে, \n\n" +
        " ০৫৬:০৫৪] এবং তার উপর গরম পানি পান করবে, \n\n" +
        " ০৫৬:০৫৫] পিপাসিত উষ্ট্রের পান করার মত পান করবে, \n\n" +
        " ০৫৬:০৫৬] বিধান-দিবসে এ-ই হবে তাদের আপ্যায়ন। \n\n" +
        " ০৫৬:০৫৭] তোমাদেরকে আমরাই সৃষ্টি করেছি, অতএব তোমরা কেন সত্যকে স্বীকার কর না? \n\n" +
        " ০৫৬:০৫৮] তোমরা যৌনতার বিষয়ে কী চিন্তা করেছ? \n\n" +
        " ০৫৬:০৫৯] তোমরাই কি তা সৃষ্টি কর, না আমরা সৃষ্টিকর্তা? \n\n" +
        " ০৫৬:০৬০] আমরাই তোমাদের জন্য মৃত্যু নির্ধারিত করেছি, এবং আমরা এমন নই যে আমাদেরকে কেউ ডিঙ্গিয়ে আগে যেতে পারবে, \n\n" +
        " ০৫৬:০৬১] এ ব্যাপারে যে, আমরা তোমাদের মত(অন্য জাতিকে) তোমাদের স্থলে নিয়ে আসি, এবং আমরা তোমাদেরকে এমন আকারে সৃষ্টি করি যা তোমরা অবগত নও। \n\n" +
        " ০৫৬:০৬২] এবং নিশ্চই তোমরা প্রথম সৃষ্টি সম্বন্ধে অবহিত আছ। তথাপি তোমরা কেন উপদেশ গ্রহণ কর না? \n\n" +
        " ০৫৬:০৬৩] তোমরা কি চিন্তা করেছ, যা তোমরা(ক্ষেতে) বপণ কর? \n\n" +
        " ০৫৬:০৬৪] তোমরাই কি তা উৎপন্ন কর, না আমরা উৎপাদনকারী? \n\n" +
        " ০৫৬:০৬৫] আমরা ইচ্ছা করলে সেগুলোকে শুকনা গুঁড়ায় পরিণত করতে পারতাম, তখন তোমরা শুধুই কথা রচনা করতে থাকতে, \n\n" +
        " ০৫৬:০৬৬] \"নিশ্চই আমরা ঋণ-ভারাক্রান্ত ! \n\n" +
        " ০৫৬:০৬৭] বরং আমরা বঞ্চিত।\" \n\n" +
        " ০৫৬:০৬৮] তোমরা কি সেই পানি সম্বন্ধে চিন্তা করেছ যা তোমরা পান কর? \n\n" +
        " ০৫৬:০৬৯] তোমরাই কি তা কিউমুলোনিম্বাস-মেঘ থেকে অবতরণ করাও, না আমরা অবতরনকারী? \n\n" +
        " ০৫৬:০৭০] আমরা ইচ্ছা করলে তাকে তিক্ত করে দিতে পারতাম, তথাপি তোমরা কেন কৃতজ্ঞতা প্রকাশ করছ না? \n\n" +
        " ০৫৬:০৭১] তোমরা কি সেই আগুন সম্বন্ধেও চিন্তা করেছ যা তোমরা জ্বালিয়ে থাক? \n\n" +
        " ০৫৬:০৭২] তোমরাই কি তার(জন্য) গাছ উৎপন্ন কর, না আমরা উৎপাদনকারী? \n\n" +
        " ০৫৬:০৭৩] আমরা এটিকে অভাবী ও টোকাইদের জন্য উপদেশ এবং সুফলপ্রদ করেছি। \n\n" +
        " ০৫৬:০৭৪] অতএব আপনি আপনার মহান ক্রমবিকাশকের মালিকানা প্রতিষ্ঠার দায়িত্ব পালন করুন। \n\n" +
        " ০৫৬:০৭৫] অবশ্যই আমি নক্ষত্রটির(SPACE SHIP) অবতরণের শপথ করছি \n\n" +
        " ০৫৬:০৭৬] এবং নিশ্চই এটি মহান শপথ যদি তোমরা জানতে \n\n" +
        " ০৫৬:০৭৭] নিশ্চই এটি(SPACE SHIP) মহা সম্মানীত কুরআন \n\n" +
        " ০৫৬:০৭৮] গুপ্ত(২৯.২২৯ ট্রিলিয়ন মাইল দূরে) সুরক্ষিত গ্রন্থে অবস্থিত \n\n" +
        " ০৫৬:০৭৯] পরিশুদ্ধরা ছাড়া কেউ এটিকে স্পর্শ করতে পারে না। \n\n" +
        " ০৫৬:০৮০] মহাবিশ্বের ক্রমবিকাশক থেকে এটি অবতারিত হয়েছে। \n\n" +
        " ০৫৬:০৮১] তবুও কি তোমরা এ হাদিস(বাণী) গুলোর প্রতি নিস্পৃহ থাকবে? \n\n" +
        " ০৫৬:০৮২] এবং তোমরা কি এ-কে নিজেদের জীবিকা-উপর্যনের মাধ্যম বানিয়ে নিয়েছ অথচ এ-কে তোমরা অভিযোগের সুরে মিথ্যা প্রতিপন্ন কর? \n\n" +
        " ০৫৬:০৮৩] যখন (কারও প্রান)কন্ঠাগত হয় তখন কেন কিছু কর না? \n\n" +
        " ০৫৬:০৮৪] এবং তোমরা সে মুহূর্তে তাকিয়ে থাক \n\n" +
        " ০৫৬:০৮৫] বস্তুতঃ আমরা তার অধিকতর নিকটবর্তী তোমাদের চেয়ে, কিন্তু তোমরা দেখতে পাও না, \n\n" +
        " ০৫৬:০৮৬] যদি চাও তোমাদেরকে ঋণী করা না হয়, তাহলে কেন নয়?- \n\n" +
        " ০৫৬:০৮৭] তোমরা তাকে ফিরিয়ে আন, যদি তোমরা সত্যবাদী হয়ে থাক? \n\n" +
        " ০৫৬:০৮৮] অতএব যদি সে নৈকট্য প্রাপ্তদের অর্ন্তভুক্ত হয়- \n\n" +
        " ০৫৬:০৮৯] তাহলে তার জন্য অবধারিত আছে আরাম ও সুখ-স্বাচ্ছন্দ্য এবং পুরসকারে পূর্ণ জান্নাত, \n\n" +
        " ০৫৬:০৯০] এবং যদি সে কাছের সহচরদের অর্ন্তভুক্ত হয়, \n\n" +
        " ০৫৬:০৯১] তাহলে (বলা হবে), \"তোমার উপর ‘সালাম’, হে কাছের সহচরদের অর্ন্তভুক্ত ব্যাক্তি !\" \n\n" +
        " ০৫৬:০৯২] কিন্তু যদি সে মিথ্যা প্রতিপন্নকারী বিপথগামীদের অর্ন্তভুক্ত হয়ে থাকে, \n\n" +
        " ০৫৬:০৯৩] তাহলে তার অপ্যায়ন হবে ফুটন্ত পানি দিয়ে, \n\n" +
        " ০৫৬:০৯৪] এবং অনুতাপস্থলের দহন। \n\n" +
        " ০৫৬:০৯৫] নিশ্চই এটিই নিশ্চিত বিজ্ঞান, \n\n" +
        " ০৫৬:০৯৬] অতএব আপনি আপনার মহান ক্রমবিকাশকের মালিকানা প্রতিষ্ঠার দায়িত্ব পালন করুন।");
        editor.putString("55","পরিচ্ছেদ ০৫৫.দৃশ্যঃ দয়ার-সাগর(সূরা আর-রাহমান The most Gracious) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৭৯ আয়াত এবং ৩ রুকূ আছে। \n\n" +
                " ০৫৫:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৫৫:০০১] এককসত্তা করুণাময় দাতা দয়ার সাগর(আল্লাহ), \n\n" +
                " ০৫৫:০০২] যিনি কুরআন শিক্ষা দিয়েছেন। \n\n" +
                " ০৫৫:০০৩] তিনি মানবজাতিকে সৃষ্টি করেছেন, \n\n" +
                " ০৫৫:০০৪] তাকে কথা বলার বিভিন্ন ভাষা শিক্ষা দিয়েছেন। \n\n" +
                " ০৫৫:০০৫] সূর্য থেকে চন্দ্র নিরুপিত পরিমাপে(নিজ নিজ কক্ষপথে বিচরণশীল) রয়েছে। \n\n" +
                " ০৫৫:০০৬] এবং তারকা থেকে বৃক্ষরাজি মান্য(সেজদা) করছে। \n\n" +
                " ০৫৫:০০৭] এবং বায়ুমণ্ডলগুলো- তিনি এগুলোকে সুউচ্চ করেছেন এবং অভিকর্ষ স্থাপন করেছেন, \n\n" +
                " ০৫৫:০০৮] যেন তোমরা অভিকর্ষের সীমাতিক্রম না কর (বজায় রাখ) । \n\n" +
                " ০৫৫:০০৯] সুতরাং তোমরা সঠিকভাবে(স্প্রিংনিক্তি দিয়ে) ওজন প্রতিষ্ঠিত কর এবং পরিমাপ কম কোরও না। \n\n" +
                " ০৫৫:০১০] এবং পৃথিবীগুলো- তিনি এগুলোকে সৃষ্টির(তাঁর সৃষ্ট জীবের) জন্য সংস্থাপন করেছেন, \n\n" +
                " ০৫৫:০১১] যাতে রয়েছে ফল-ফলাদি এবং আবরণ-বিশিষ্ট খেজুর বৃক্ষ, \n\n" +
                " ০৫৫:০১২] এবং খোসা বিশিষ্ট শস্য-দানা এবং সুগন্ধি ফুলগাছ। \n\n" +
                " ০৫৫:০১৩] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্র্মবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০১৪] তিনি তোমাদের ইনসান-চরিত্র(বিনয়, প্রেম-ভালবাসা, শ্রদ্ধা, সেবাযত্ন)কে খন খনে পাত্রের মত শুষ্ক মাটি থেকে সৃষ্টি করেছেন,{অর্থাৎ মাটির মত নরম,ভঙ্গুর ও অভিকর্ষের দিকে পতনশীল} \n\n" +
                " ০৫৫:০১৫] এবং জিন-চরিত্র(গোঁয়ার্তুমি, বদমেজাজ, অহঙ্কার, সেক্স, অন্যায় কাজেরর প্রবনতা)কে সৃষ্টি করেছেন আগুনের শিখা থেকে। {আগুনের মত অভিকর্ষভেদি, ঊর্ধগামী, কিছুতে মাথা নোয়ায় না} \n\n" +
                " ০৫৫:০১৬] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০১৭] তিনি দুটি পূর্বেরও ক্রমবিকাশক এবং দুটি পশ্চিমেরও ক্রমবিকাশক (অর্থাৎ পৃথিবী গোলাকার)। \n\n" +
                " ০৫৫:০১৮] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০১৯] তিনি দুই সমুদ্র(লোহিত ও ভূমধ্য)কে এমনভাবে প্রবাহিত করেছেন যে, (এক সময়ে) উভয়ে মিলিত হবে। \n\n" +
                " ০৫৫:০২০] (বর্তমানে) উভয়ের মধ্যে এক প্রতিবন্ধক আছে(যার জন্য) তারা একে অপরের মধ্যে প্রবেশ করতে পারে না। {এ আয়াতের ভিত্তিতে সুয়েজখাল করে দুটি সাগরে সংযোগ করা হয়েছে, একইভাবে পানামাখাল কেটে আটলান্টিক ও প্রসান্ত মহাসাগরে সংযোগ সৃষ্টি করা হয়েছে} \n\n" +
                " ০৫৫:০২১] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০২২] উভয়(সমুদ্র) থেকে মুক্তা এবং প্রবাল বর্হিগত হয়। \n\n" +
                " ০৫৫:০২৩] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০২৪] এবং (পানি ও বাতাস)সমুদ্রবক্ষেঃ পর্বতের মত সুউচ্চ দ্রুতগামী জাহাজগুলি তাঁরই। \n\n" +
                " ০৫৫:০২৫] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০২৬] তার(ভূপৃষ্ঠের) উপর যা কিছু আছে সবই ধরাশায়ী বা পরিবর্তনশীল, \n\n" +
                " ০৫৫:০২৭] এবং স্থায়ী থাকবে শুধুই আপনার ক্রমবিকাশকের মুখ(মহাবিশ্ব) যিনি প্রতাপ এবং সম্মানের অধিপতি। \n\n" +
                " ০৫৫:০২৮] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০২৯] বায়ুমণ্ডলগুলোতে ও পৃথিবীগুলোতে যারা আছে সকলকেই তাঁর কাছে চােয়ে নিতে হয়। তিনি প্রতিদিন নতুন নতুন গুরুত্বে প্রকাশিত হন। \n\n" +
                " ০৫৫:০৩০] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৩১] হে ‘ইনসান ও জিন্ন’(চরিত্রবিশিষ্ট মানুষ)এর শক্তিশালী দল ! আমরা অচিরেই তোমাদের প্রতি মনোনিবেশ করব, \n\n" +
                " ০৫৫:০৩২] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৩৩] হে জিন্ন ও ইনসান(চরিত্রবিশিষ্ট মানুষ)এর দল ! যদি তোমরা বায়ুমণ্ডল গুলো এবং পৃথিবী গুলোর প্রান্তসীমা ছাড়িয়ে যেতে পার, তাহলে \n\n" +
                "ছাড়িয়ে যাও। তোমরা নির্ভরযোগ্য পাণ্ডিত্য (উচ্চগতি, সেকেণ্ডে ৭মাইল) ছাড়া মোটেও (অভিকর্ষ)ছাড়িয়ে যেতে পারবে না। \n\n" +
                " ০৫৫:০৩৪] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৩৫] তোমাদের উভয়ের উপর অগ্নি-শিখা এবং গলিত তাম্র প্রেরণ করা হবে (যদি আয়নস্ফিয়ারের ঘর্ষণ থেকে রক্ষার বাবস্থা না নাও), তখন তোমরা একে অপরকে সাহায্য করতে পারবে না। \n\n" +
                " ০৫৫:০৩৬] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৩৭] এবং যখন(মঙ্গলের) আকাশ বিদীর্ণ হবে এবং রক্ত বর্ণের চামড়ার মত লাল হবে (মানুষ প্রথমে মঙ্গলগ্রহে যাবে)। \n\n" +
                " ০৫৫:০৩৮] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৩৯] এবং সেদিন না ইনসান তার পাপ সম্বন্ধে জিজ্ঞাসিত হবে এবং না জিন্ন। \n\n" +
                " ০৫৫:০৪০] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৪১] অপরাধীদেরকে তাদের চেহারার লক্ষণাবলী দেখে চেনা যাবে, এবং তাদেরকে তাদের মাথার ঝুঁটি এবং পা ধরে গ্রেপ্তার করা হবে(অর্থাৎ মহাকাশযানে চিৎ হয়ে শুয়ে যাত্রা শুরু করতে হয়, নতুবা সকল হাড় ভেঙ্গে একত্র হবে)। \n\n" +
                " ০৫৫:০৪২] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৪৩] (বলা হবে) \"এটিই সেই অনুতাপস্থল যা অপরাধীরা অস্বীকার করত, \n\n" +
                " ০৫৫:০৪৪] তারা এর মধ্যে এবং ফুটন্ত গরম পানির মধ্যে ঘুরে বেড়াবে।\" \n\n" +
                " ০৫৫:০৪৫] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৪৬] যে ব্যক্তি তার ক্রমবিকাশকের সামনে দাঁড়াতে ভয় পায় তার জন্য দুটি জান্নাত আছে- \n\n" +
                " ০৫৫:০৪৭] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৪৮] উভয়ই ঘন শাখা বিশিষ্ট(বৃক্ষরাজি পূর্ণ) হবে। \n\n" +
                " ০৫৫:০৪৯] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৫০] উভয়ের মধ্যে দুটি ঝর্ণা প্রবাহিত থাকবে। \n\n" +
                " ০৫৫:০৫১] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৫২] উভয়ের মধ্যে প্রত্যেক প্রকারের ফল জোড়া জোড়া থাকবে। \n\n" +
                " ০৫৫:০৫৩] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৫৪] তারা এমন আসবাবপত্র বিছানা-চাদরের উপর পালঙ্কে হেলান দিয়ে উপবিষ্ট থাকবে যা হবে ঘন রেশমের এবং উভয় বাগানের ফল নিকটবর্তী হবে। \n\n" +
                " ০৫৫:০৫৫] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্র্মবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৫৬] সেগুলোর মধ্যে থাকবে আনত-নয়না নারীরা যাদেরকে তাদের(জান্নাতবাসীদের) পূর্বে কোন ইনসানও স্পর্শ করে নাই এবং কোন জিন্নও না- \n\n" +
                " ০৫৫:০৫৭] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্র্মবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৫৮] (দেখতে) তারা যেন ইয়াকূত(লোহিত পদ্মরাগমণি) এবং প্রবাল, \n\n" +
                " ০৫৫:০৫৯] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্র্মবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৬০] দানশীলতা(ইহসান) এর বিনিময়ে মঙ্গলসাধন(ইহসান) ছাড়া আর কী হতে পারে? \n\n" +
                " ০৫৫:০৬১] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্র্মবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৬২] এবং এদুটি জান্নাত ছাড়াও আরও দুটি জান্নাত আছে- \n\n" +
                " ০৫৫:০৬৩] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্র্মবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৬৪] উভয়ই ঘন সবুজ হবে- \n\n" +
                " ০৫৫:০৬৫] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্র্মবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৬৬] উভয়ের মধ্যে দুটি স্ববেগে উচ্ছসিত প্রবহমান ঝর্ণা থাকবে। \n\n" +
                " ০৫৫:০৬৭] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্র্মবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৬৮] উভয়ের মধ্যে থাকবে(নানারকম) ফল-ফলাদি, এবং খেজুর এবং ডালিম। \n\n" +
                " ০৫৫:০৬৯] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৭০] সেগুলোর মধ্যে থাকবে পুণ্যবতী এবং সন্দুরী নারীরা- \n\n" +
                " ০৫৫:০৭১] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৭২] তারা সতী কৃষ্ণনয়না রূপসী(বাঙ্গালীর মত) হবে যারা তাঁবুর মধ্যে সুরক্ষিত থাকবে- \n\n" +
                " ০৫৫:০৭৩] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৭৪] যাদেরকে তাদের আগে কোন ইনসানও স্পর্শ করে নাই এবং কোন জিন্নও না- \n\n" +
                " ০৫৫:০৭৫] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৭৬] তারা হেলান দিয়ে উপবিষ্ট থাকবে সবুজ(রেশমের চাদরে মোড়ান) পালঙ্কে এবং অতিসুন্দর গালিচার উপর \n\n" +
                " ০৫৫:০৭৭] অতএব তোমরা (জিন ও ইনসান উভয় চরিত্রবিশিষ্ট মানুষ) তোমাদের ক্রমবিকাশকের কোন কোন পুরসকারকে মিথ্যা প্রতিপন্ন করবে? \n\n" +
                " ০৫৫:০৭৮] তোমার ক্রমবিকাশকের মালিকানা অতন্ত আশীর্বাদ(পানিকনা)পূর্ণ, যিনি মহাপ্রতাপ এবং সম্মানের অধিপতি,");
        editor.putString("54","পরিচ্ছেদ ০৫৪.দৃশ্যঃ চন্দ্র(সূরা আল-কামার The Moon) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৫৬ আয়াত এবং ৩ রুকূ আছে। \n\n" +
                " ০৫৪:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৫৪:০০১] নির্দিষ্ট মুহূর্ত নিকটবর্তী হল এবং চন্দ্র বিদীর্ণ হল(১৯৬৯এর ২০ জুলাই মানুষ চন্দ্রবিজয় করল)। \n\n" +
                " ০৫৪:০০২] এবং তারা কোন নিদর্শন দেখলে মুখ ফিরিয়ে নেয় এবং বলে, \"এ-তো চির প্রচলিত যাদু।\" \n\n" +
                " ০৫৪:০০৩] এবং তারা(সত্যকে) মিথ্যা প্রতিপন্ন করেছে এবং নিজেদের প্রবৃত্তির অনুসরণ করছে। কিন্তু প্রত্যেক বিষয়ের জন্য এক নির্ধারিত সময় আছে। \n\n" +
                " ০৫৪:০০৪] এবং নিশ্চই তাদের কাছে এমন গুরুত্বপূর্ণ সংবাদ এসেছে যার মধ্যে সতর্কবাণী আছে- \n\n" +
                " ০৫৪:০০৫] হৃদয়স্পর্শী বিজ্ঞান। কিন্তু সাবধানবাণী তাদের কোন উপকারে লাগল না। \n\n" +
                " ০৫৪:০০৬] সুতরাং আপনি তাদের থেকে মুখ ফিরিয়ে নিন এবং যেদিন এক আহবানকারী তাদেরকে এক অবাঞ্ছিত বিষয়ের(দুঃখ-কষ্টের) প্রতি আহবান করবে, \n\n" +
                " ০৫৪:০০৭] তখন তাদের চোখ অবনত থাকবে, তারা(তাদের) কবরগুলো থেকে এমনভাবে বের হবে যেন তারা বিক্ষিপ্তভাবে ছড়িয়ে পড়া পঙ্গপাল, \n\n" +
                " ০৫৪:০০৮] তারা ঘোষণাকারীর দিকে ধাবমান হবে। অস্বীকারকারীরা বলবে, \"এটি বড়ই কঠিন দিন।\" \n\n" +
                " ০৫৪:০০৯] এদের পূর্বে নূহের জাতিও(সত্যকে) মিথ্যা প্রতিপন্ন করেছিল, এবং তারা আমাদের বান্দাকেও মিথ্যাবাদী প্রতিপন্ন করেছিল এবং বলেছিল, \"সে তো একজন উন্মাদ এবং তাকে(আমাদের দেবতাকে দিয়ে) অভিশপ্ত করা হয়েছে।\" \n\n" +
                " ০৫৪:০১০] তখন সে তার ক্রমবিকাশকের কাছে প্রার্থনা করেছিল, \"নিশ্চই আমি পরাভূত, সুতরাং আপনি আমাকে সাহায্য করুন।\" \n\n" +
                " ০৫৪:০১১] তখন আমরা মুষলধারে বারি বর্ষণে আকাশের দরজাগুলো উন্মুক্ত করে দিলাম, \n\n" +
                " ০৫৪:০১২] এবং ভূমি থেকেও আমরা ঝরণাগুলো প্রবাহিত করলাম, সুতরাং(দুদিকের) পানি সম্মিলিত হয়ে গেল এমন এক বিষয়ের জন্য যার সিদ্ধান্ত পূর্ব থেকে করা হয়েছিল। \n\n" +
                " ০৫৪:০১৩] এবং আমরা তাকে (লুদি পর্বতের উপরে) তক্তা ও পেরেক দিয়ে নির্মিত ঘূর্ণিঝড়-আশ্রয়কেন্দ্রে আরোহণ করিয়েছিলাম। \n\n" +
                " ০৫৪:০১৪] তা আমাদের দৃষ্টির সম্মুখে অবস্থান করছিল, এটি সেই ব্যক্তির জন্য প্রতিদান স্বরূপ ছিল যাকে অস্বীকার করা হয়েছিল। \n\n" +
                " ০৫৪:০১৫] এবং আমরা সেটিকে (পরবর্তীদের জন্য) এক আয়াত(নিদর্শন) স্বরূপ রেখেছিলাম। অতএব স্মরণকারীদের থেকে কেউ আছে কি? \n\n" +
                " ০৫৪:০১৬] অতএব, কেমন ছিল আমার শাস্তি ও সতর্কবাণী! \n\n" +
                " ০৫৪:০১৭] এবং নিশ্চই আমরা কুরআনকে স্মরণ রাখার জন্য সহজ করে দিয়েছি। অতএব স্মরণকারীদের থেকে কেউ আছে কি? \n\n" +
                " ০৫৪:০১৮] ‘আদ’ জাতিও(সত্যকে) মিথ্যা প্রতিপন্ন করেছিল। সুতরাং কেমন(কঠোর) ছিল আমার শাস্তি ও সতর্কবাণী। \n\n" +
                " ০৫৪:০১৯] এবং আমরা তাদের উপর এক প্রচন্ড ঝঞ্ঝাবায়ু পাঠিয়েছিলাম এক অশুভ দীর্ঘস্থায়ী সময়ে(৭ দিন ৮ রাত ব্যাপী), \n\n" +
                " ০৫৪:০২০] যা মানুষকে এভাবে উৎপাটিত করেছিল যেন তারা মূলোৎপাটিত ফাঁপা খেজুর-বৃক্ষের কান্ড। \n\n" +
                " ০৫৪:০২১] অতএব কেমন(কঠোর) ছিল আমার শাস্তি ও সতর্কবাণী। \n\n" +
                " ০৫৪:০২২] এবং নিশ্চই আমরা কুরআনকে স্মরণ রাখার জন্য সহজ করে দিয়েছি। অতএব স্মরণকারীদের থেকে কেউ আছে কি? \n\n" +
                " ০৫৪:০২৩] ‘সামুদ’ জাতি সতর্ককারীদেরকে মিথ্যাবাদী প্রতিপন্ন করেছিল। \n\n" +
                " ০৫৪:০২৪] এবং তারা বলেছিল, \"কী, আমরা আমাদেরই মধ্য থেকে একজন(মরণশীল) মানুষের অনুসরণ করে চলব? এমন করলে আমরা নিশ্চই বিভ্র্রান্তি এবং উন্মাদনার মধ্যে পড়ে যাব। \n\n" +
                " ০৫৪:০২৫] আমাদের মধ্য থেকে শুধু এ ব্যক্তির উপরই কি উপদেশ-বাণী অবতীর্ণ হয়েছে? না, বরং সে একজন চরম মিথ্যাবাদী, অত্যাধিক দাম্ভিক ব্যক্তি।\" \n\n" +
                " ০৫৪:০২৬] তারা আগামীকাল জানবে, কে চরম মিথ্যাবাদী, অত্যাধিক দাম্ভিক। \n\n" +
                " ০৫৪:০২৭] আমরা তাদের পরীক্ষার জন্যে এক উষ্ট্রী প্রেরণ করব। সুতরাং(হে সালেহ!) তুমি তাদের পরিণামের অপেক্ষা কর এবং ধৈর্য ধারণ কর। \n\n" +
                " ০৫৪:০২৮] এবং তাদেরকে জানিয়ে দাও, \"তাদের মধ্যে (তাদের এবং সেই উষ্ট্রীর মধ্যে) পানি পানের সময় বন্টন করে দেয়া হয়েছে, (পালাক্রমে) প্রত্যেক বার পানি পান করার নির্ধারিত সময়ে উপস্থিত হতে হবে।\" \n\n" +
                " ০৫৪:০২৯] অতঃপর তারা তাদের সঙ্গীকে ডাকল, সুতরাং সে(উষ্ট্রীকে) বলপূর্বক ধরল এবং হাঁটুর পশ্চাদশিরা কেটে দিল। \n\n" +
                " ০৫৪:০৩০] অতএব কেমন ছিল আমার শাস্তি এবং সতর্কবাণী। \n\n" +
                " ০৫৪:০৩১] নিশ্চই আমরা তাদের উপর একটি বিকট শব্দকারী(সোনিক বোম্ব) শাস্তি প্রেরণ করলাম, ফলে তারা খোঁয়াড় নিমার্ণকারীর(ছুরি দিয়ে চাঁছা) শুকনা কাঠ-টুকরার মত হয়ে গেল। \n\n" +
                " ০৫৪:০৩২] এবং নিশ্চই আমরা কুরআনকে স্মরণ রাখার জন্য সহজ করে দিয়েছি। অতএব স্মারক-বানী গ্রহণকারী কেউ আছে কি? \n\n" +
                " ০৫৪:০৩৩] লূতের জাতিও সতর্ককারীদেরকে মিথ্যাবাদী প্রতিপন্ন করেছিল। \n\n" +
                " ০৫৪:০৩৪] নিশ্চই আমরা তাদের উপর শিলা বৃষ্টি প্রেরণ করেছিলাম লূতের পরিবার ছাড়া, যাদেরকে আমরা প্রভাতে রক্ষা করেছিলাম- \n\n" +
                " ০৫৪:০৩৫] আমাদের পক্ষ থেকে পুরস্কার স্বরূপ। এভাবেই আমরা পুরস্কার দিয়ে থাকি যারা কৃতজ্ঞতা জ্ঞাপন করে। \n\n" +
                " ০৫৪:০৩৬] এবং সে তাদেরকে আমাদের গুরুতর ধৃতকরণ সম্বন্ধে সতর্ক করেছিল, কিন্তু তাারা সতর্কবাণী সম্বন্ধে তর্ক-বিতর্ক করেছিল। \n\n" +
                " ০৫৪:০৩৭] এবং তারা তাকে মেহমানদের বিরুদ্ধে প্ররোচিত করতে চেয়েছিল, ফলে আমরা তাদের চক্ষুগুলোকে দৃষ্টিহীন করে দিয়েছিলাম এবং(বলেছিলাম), \"আমার শাাস্তি এবং সতর্কবাণীর স্বাদ গ্রহণ কর।\" \n\n" +
                " ০৫৪:০৩৮] এবং প্রাতঃঃকালেই এক বিরামহীন শাস্তি তাদের উপর এসে পড়ল। \n\n" +
                " ০৫৪:০৩৯] অতএব, \"তোমরা এখন আমার শাস্তি ও সতর্কবাণীর স্বাদ গ্রহণ কর।\" \n\n" +
                " ০৫৪:০৪০] এবং নিশ্চই আমরা কুরআনকে স্মরণ রাখার জন্য সহজ করে দিয়েছি। অতএব কোন স্মারক-বানী গ্রহণকারী আছে কি? \n\n" +
                " ০৫৪:০৪১] এবং ফেরাউনের জাতির কাছেও সতর্ককারীরা এসেছিল। \n\n" +
                " ০৫৪:০৪২] তারা আমাদের সকল আয়াতকে(নিদর্শনকে) মিথ্যা প্রতিপন্ন করেছিল। ফলে আমরা তাদেরকে এক মহা পরাক্রমশালী শক্তিধর ধৃত করণের মত ধৃত করেছিলাম। \n\n" +
                " ০৫৪:০৪৩] (হে মক্কাবাসীরা !) তোমাদের অস্বীকারীরা কি তাদের অপেক্ষা বেশি শক্তিশালী? অথবা পূর্ববর্তী গ্রন্থ গুলোতে তোমাদের জন্য(শাস্তি থেকে) নিষ্কৃতি লিপিবদ্ধ আছে? \n\n" +
                " ০৫৪:০৪৪] তারা কি বলে, \"আমরা এক অপরাজেয় দল?\" \n\n" +
                " ০৫৪:০৪৫] অচিরেই সেই দলকে পরাভূত করা হবে তারা পৃষ্ঠ প্রদর্শন করে পলায়ন করবে। \n\n" +
                " ০৫৪:০৪৬] বরং(তাদের ধ্বংসের) সে মুহূর্ত তাদের সঙ্গে কৃত প্রতিশ্রুত মুহূর্ত, বস্তুতঃ সে মুহূর্ত অত্যন্ত ধ্বংসকারী এবং তিক্ত। \n\n" +
                " ০৫৪:০৪৭] নিশ্চই অপরাধীরা পথ-ভ্রষ্টতা এবং উন্মাদনায় আক্রান্ত। \n\n" +
                " ০৫৪:০৪৮] যেদিন তাদেরকে অধোমুখী করে আগুনের মধ্যে হেঁচড়ে নিয়ে যাওয়া হবে,(এবং বলা হবে), \"তোমরা অনুতাপের আগুনের স্পর্শ-স্বাদ অস্বাদন কর।\" \n\n" +
                " ০৫৪:০৪৯] নিশ্চই আমরা প্রত্যেক বস্তুকে নির্দিষ্ট পরিমাপ অনুযায়ী সৃষ্টি করেছি। \n\n" +
                " ০৫৪:০৫০] এবং আমাদের আদেশ একবারই মাত্র, যা চক্ষুর পলকের মত। \n\n" +
                " ০৫৪:০৫১] এবং নিশ্চই আমরা(পূর্বেও) তোমাদের মত বহু দলকে ধ্বংস করেছি। অতএব স্মারক-বানী গ্রহণকারী কেউ আছে কি? \n\n" +
                " ০৫৪:০৫২] এবং প্রত্যেক কাজ যা তারা করেছে ডাইরীীতে (সংরক্ষিত) আছে। \n\n" +
                " ০৫৪:০৫৩] এবং প্রত্যেক ছোট এবং বড়(কাজ) লিপিবদ্ধ আছে। \n\n" +
                " ০৫৪:০৫৪] নিশ্চই সচেতনরা বাগানগুলো এবং নদীসগুলোর মধ্যে থাকবে, \n\n" +
                " ০৫৪:০৫৫] এক চিরস্থায়ী সম্মানজনক বাসস্থানে সর্বশক্তিমান মহা সম্রাটের সান্নিধ্যে।");
        editor.putString("53","পরিচ্ছেদ ০৫৩.দৃশ্যঃ নক্ষত্র-মহাকাশযান(সূরা আন-নাজম The Star-Spaceship) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৬৩ আয়াত এবং ৩ রুকূ আছে। \n\n" +
                " ০৫৩:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৫৩:০০১] বলছি নক্ষত্র-মহাকাশযানটির কথা যখন তা (পৃথিবীতে-পৃথিবীতে) অবতরণ করে, \n\n" +
                " ০৫৩:০০২] তোমাদের সাথী(নবীজী) পথভ্রষ্টও হন নাই এবং বিভ্রান্তও হন নাই,  \n\n" +
                " ০৫৩:০০৩] এবং তিনি নিজ ইচ্ছায় কোন কথা বলেন না। \n\n" +
                " ০৫৩:০০৪] এসব(কুরআন) ঐশী-বিধানবানী ছাড়া কিছু নয় যা প্রত্যাদেশ করা হয়েছে।  \n\n" +
                " ০৫৩:০০৫] তাঁকে(নবীজীকে) এসব শিক্ষা দিয়াছে মহাশক্তিধর(নক্ষত্র-মহাকাশযান),  \n\n" +
                " ০৫৩:০০৬] যা সহজাত শক্তিসম্পন্ন, সেটি নিজ আকৃতিতে প্রকাশ পেল। \n\n" +
                " ০৫৩:০০৭] এবং সেটি ছিল সর্ব্বোচ্চ দিগন্তে, \n\n" +
                " ০৫৩:০০৮] অতঃপর সেটি (নবীজীর)নিকটবর্তী হল, ও ঝুলে থাকল।  \n\n" +
                " ০৫৩:০০৯] অতঃপর সেটি \"দুই-ধনুকের-একতন্ত্রী\"র মত কাছে আসলো অথবা তা থেকেও নিকটবর্তী হয়ে গেল।  \n\n" +
                " ০৫৩:০১০] অতঃপর তিনি(আল্লাহ) নিজ বান্দার প্রতি যা প্রত্যাদেশ করার, তা প্রত্যাদেশ করলেন। \n\n" +
                " ০৫৩:০১১] তাঁর(নবীজীর) অন্তঃকরণ মিথ্যা বলে নাই যা তিনি দেখেছিলেন।  \n\n" +
                " ০৫৩:০১২] তোমরা কি তাঁর সাথে সে সম্বন্ধে বিতর্ক করছ যা তিনি নিজে দেখেছেন? \n\n" +
                " ০৫৩:০১৩] এবং নিশ্চই তিনি তাকে আরেকবার দেখেছেন,  \n\n" +
                " ০৫৩:০১৪] দূর প্রান্তের বরই বাগানে, \n\n" +
                " ০৫৩:০১৫] যেখানে অবস্থিত (আদম-হাওয়ার)বসবাসের জান্নাত।  \n\n" +
                " ০৫৩:০১৬] যখন বরইগাছ গুলো বরইতে আচ্ছাদিত ছিল, যা(সেসময়) আচ্ছাদন করে থাকে।  \n\n" +
                " ০৫৩:০১৭] তাঁর দৃষ্টি তখন বিভ্রান্তও হয় নাই এবং লক্ষ্য অতিক্রমও করে নাই।  \n\n" +
                " ০৫৩:০১৮] নিশ্চই তিনি তাঁর ক্রমবিকাশকের নিদর্শনগুলোর মধ্যে সর্বাধিক মহান নিদর্শন দেখেছিলেন। \n\n" +
                " ০৫৩:০১৯] তোমরা কি দেখেছ \"লাত\" ও \"উযযা\"কে? \n\n" +
                " ০৫৩:০২০] এবং অন্যগুলো থেকে তৃতীয়টি \"মানাত\"কে?  \n\n" +
                " ০৫৩:০২১] কী ! তোমাদের জন্য পুত্র সন্তান এবং তাঁর(আল্লাহর) জন্য কন্যা প্রতীক?  \n\n" +
                " ০৫৩:০২২] তাহলে এটি অত্যন্ত অসংগত বন্টন।  \n\n" +
                " ০৫৩:০২৩] এ-তো কতগুলো নাম মাত্র, যা তোমরা এবং তোমাদের পিতৃপুরুষরা রেখেছে, তাদের জন্য আল্লাহ কোন দলীল-প্রমাণ অবতীর্ণ করেন নাই। তারা শুধু অলীক কল্পনার এবং তাদের প্রবৃত্তির অনুসরণ করে, অথচ তাদের কাছে তাদের ক্রমবিকাশক থেকে সুপথ-প্রাপ্তীর-নির্দেশনা এসেছে।  \n\n" +
                " ০৫৩:০২৪] মানুষ যা চায় তা-ই কি সে পায়? \n\n" +
                " ০৫৩:০২৫] বস্তুতঃ অন্ত(পরকাল) এবং আদি(ইহকাল) আল্লাহরই জন্য।  \n\n" +
                " ০৫৩:০২৬] এবং মহাকাশে কত ফিরশিতা, তাদের সম্মিলিত কথাও কারও কোনও উপকারে লাগে না, কেবল যার জন্য আল্লাহর ইচ্ছে হবে তার চাওয়া তিনি অনুমোদন করবেন । \n\n" +
                " ০৫৩:০২৭] নিশ্চই যারা পরকালীন জীবন মেনে নেয় না, তারাই ফিরিশতাদেরকে নারীবাচক নাম দিয়ে ডাকে,  \n\n" +
                " ০৫৩:০২৮] অথচ এ বিষয়ে তাদের কোন জ্ঞান নেই। তারা শুধু অনুমানের অনুসরণ করছে, যদিও অনুমান বিজ্ঞানের কোনও কিছু থেকে মোটেও সমৃদ্ধ নয়।  \n\n" +
                " ০৫৩:০২৯] সুতরাং আপনিও তাদের থেকে মুখ ফিরিয়ে নিন, যারা আমাদের স্মরণ থেকে মুখ ফিরিয়ে নেয় এবং ইহকালীন-জীবন ছাড়া আর কিছুই চায় না। \n\n" +
                " ০৫৩:০৩০] সেটুকুই তাদের জ্ঞানের পরিধি। নিশ্চই আপনার ক্রমবিকাশক সে ব্যক্তিকে ভালভাবে জানেন যে তাঁর পথ থেকে বিভ্রান্ত হয়েছে এবং তিনি সে ব্যক্তিকেও ভালভাবে জানেন, যে সুপথ-প্রাপ্তীর-নির্দেশনার পথে চলেছে।  \n\n" +
                " ০৫৩:০৩১] এবং বায়ুমণ্ডলগুলোতে যা কিছু আছে এবং পৃথিবীগুলোতে যা কিছু আছে সবই আল্লাহর, যারা মন্দকাজ করে তাদেরকে তিনি তাদের কৃত-কর্ম অনুযায়ী প্রতিফল দেন, এবং যারা ভালকাজ করে তাদেরকে তিনি উত্তম ভাবে পুরস্কার দান করেন, \n\n" +
                " ০৫৩:০৩২] যারা মহাপাপ ও অশ্লীলতাকে পরিহার করে, কেবল ক্ষণিকের জন্য মনে উদ্ভাসিত মন্দ ধারণা ছাড়া। নিশ্চই তোমাদের ক্রমবিকাশক অতীব সংশোধনশীল। তিনি তোমাদেরকে তখন থেকে ভালভাবে জানেন যখন তিনি তোমাদেরকে পৃথিবীতে লালনপালন করেছেন, এবং যখন তোমরা মাতৃগর্ভে ভ্রণাকারে ছিলে। অতএব তোমরা নিজদেরকে পরিশুদ্ধ ভেবো না। তিনি তাকে সার্বাধিক জানেন যে সচেতনতা অবলম্বন করে।  \n\n" +
                " ০৫৩:০৩৩] তুমি কি সে ব্যক্তিকে দেখেছ যে দায়িত্বগ্রহণ করে \n\n" +
                " ০৫৩:০৩৪] কিন্তু সে অল্প দান করে এবং কৃপণতা করে? \n\n" +
                " ০৫৩:০৩৫] তার কাছে কি অদৃশ্যের কোন জ্ঞান আছে যে সে(নিজ পরিণামকে) প্রত্যক্ষ করছে? \n\n" +
                " ০৫৩:০৩৬] তাকে কি সে সম্বন্ধে সংবাদ দেয়া হয় নাই যা মূসার গ্রন্থগুলোয় আছে,  \n\n" +
                " ০৫৩:০৩৭] এবং ইবরাহীমের গ্র্ন্থ, যে বিশ্বস্ততা রক্ষা করেছিল-  \n\n" +
                " ০৫৩:০৩৮] এই যে, কোন পাপী অন্য কারও পাপের ভার বহন করবে না।  \n\n" +
                " ০৫৩:০৩৯] এবং এই যে, মানুষের জন্য কিছুই নাই কেবল যা সে চেষ্টা করে,  \n\n" +
                " ০৫৩:০৪০] এবং এই যে, তার প্রচেষ্টাকে অচিরেই প্রত্যক্ষ করা হবে,  \n\n" +
                " ০৫৩:০৪১] অতঃপর তাকে পূর্ণ মাত্রায় পুরস্কার প্রদান করা হবে,  \n\n" +
                " ০৫৩:০৪২] এবং এই যে, নিশ্চই(সকল বিষয়ের) পরিসমাপ্তি আপনার ক্রমবিকাশকের কাছে,  \n\n" +
                " ০৫৩:০৪৩] এবং এই যে, তিনিই হাসান এবং কাঁদান,  \n\n" +
                " ০৫৩:০৪৪] এবং এই যে, তিনিই মৃত্যু ঘটান এবং জীবন দান করেন,  \n\n" +
                " ০৫৩:০৪৫] এবং এই যে, তিনিই সৃষ্টি করেন জোড়া জোড়া নর ও নারী,  \n\n" +
                " ০৫৩:০৪৬] অতিআনুবিক্ষনিক জননক্ষম কোষ থেকে, যখন মানুষ চায় \n\n" +
                " ০৫৩:০৪৭] এবং এই যে, পুনরুত্থানের দায়িত্ব তাঁরই উপর,  \n\n" +
                " ০৫৩:০৪৮] এবং এই যে, তিনিই ধনী করেন এবং পরিতৃপ্ত করেন,  \n\n" +
                " ০৫৩:০৪৯] এবং এই যে, তিনিই শি’রা(লুব্ধক) নক্ষত্রের মালিক,  \n\n" +
                " ০৫৩:০৫০] এবং এই যে, তিনিই প্রথমে ‘আদ’ জাতিকে ধ্বংস করেছিলেন,  \n\n" +
                " ০৫৩:০৫১] এবং ‘সামূদ’ জাতিকেও, এবং তিনি তাদের কাউকেও অবশিষ্ট রাখেন নাই,  \n\n" +
                " ০৫৩:০৫২] এবং তাদের পূর্বে নূহের জাতিকেও- তারা অত্যন্ত অন্যায়কারী এবং বিদ্রোহপরায়ণ জাতি ছিল- \n\n" +
                " ০৫৩:০৫৩] এবং (লুতের জাতির) উল্টানো জনপদসমূহকেও তিনিই ভূতলশায়ী করেছিলেন,  \n\n" +
                " ০৫৩:০৫৪] অতঃপর তাদের আবৃত করলেন (উল্কাপতনের)আস্তরণ দিয়ে ।  \n\n" +
                " ০৫৩:০৫৫] অতএব(হে মানুষ) তুমি তোমার ক্রমবিকাশকের অনুগ্রহ গুলোর মধ্যে কোন্ কোনটির প্রতি সন্দেহ পোষণ করবে।  \n\n" +
                " ০৫৩:০৫৬] পূর্ববর্তী সতর্ককারীদের মত ইনি(নবীজী) একজন সতর্ককারী।  \n\n" +
                " ০৫৩:০৫৭] এ(জাতির মিমাংসার) মুহূর্ত ঘনিয়ে এসেছে,  \n\n" +
                " ০৫৩:০৫৮] আল্লাহ ছাড়া কেউই তা টলাতে পারে না।  \n\n" +
                " ০৫৩:০৫৯] তবে কি তোমরা এ কথায় বিস্মিত হচ্ছ? \n\n" +
                " ০৫৩:০৬০] এবং তোমরা হাসছ, এবং কাঁদছ না-  \n\n" +
                " ০৫৩:০৬১] এবং তোমরা আমোদ-প্রমোদ করছ? \n\n" +
                " ০৫৩:০৬২] অতএব(ওঠ! এবং) আল্লাহর সামনে সেজদা কর এবং তাঁর সেবা-কাজ(ইবাদত) কর।");
        editor.putString("52","পরিচ্ছেদ ০৫২.দৃশ্যঃ পর্বত(সূরা আত-তূর The Mountain) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৫০ আয়াত এবং ২ রুকূ আছে। \n\n" +
                " ০৫২:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৫২:০০১] বলছি পর্বতের কথা, \n\n" +
                " ০৫২:০০২] এবং লিখিত গ্রন্থের কথা, \n\n" +
                " ০৫২:০০৩] (যা) পাতলা চামড়ায় সমতল পাতায়(লেখা), \n\n" +
                " ০৫২:০০৪] এবং অতি পূরণো বাড়ি(বাইতুল মা\\'মুর)র কথা, \n\n" +
                " ০৫২:০০৫] এবং চির সমুন্নত ছাদের কথা, \n\n" +
                " ০৫২:০০৬] এবং উদ্বেলিত সমুদ্রের কথা, \n\n" +
                " ০৫২:০০৭] নিশ্চই আপনার ক্রমবিকাশক প্রদত্ত দুঃখ-কষ্ট অবশ্যই বাস্তবিকই হবে। \n\n" +
                " ০৫২:০০৮] তার প্রতিরোধকারী কেউই নেই। \n\n" +
                " ০৫২:০০৯] যেদিন বায়ুমণ্ডল ভীষণ ভাবে তোলপাড় করবে, \n\n" +
                " ০৫২:০১০] এবং পবর্তসাদৃশ মহাকাশযানগুলো দ্রুতগতিতে চলতে শুরু করবে, \n\n" +
                " ০৫২:০১১] অতএব সেদিন সর্বনাশ এসবকে মিথ্যা প্রতিপন্নকারীদের জন্য, \n\n" +
                " ০৫২:০১২] হেঁসে-খেলে যারা বৃথা জীবন অতিবাহিত করছে, \n\n" +
                " ০৫২:০১৩] সেদিন যখন তাদেরকে ধাক্কা দিতে দিতে অনুতাপস্থলের আগুনের দিকে নিয়ে যাওয়া হবে, \n\n" +
                " ০৫২:০১৪] (বলা হবে) \"এই সেই আগুন যা তোমরা মিথ্যা প্রতিপন্ন করতে, \n\n" +
                " ০৫২:০১৫] এ কি তবে যাদু, অথবা তোমরা কি দেখছ না? \n\n" +
                " ০৫২:০১৬] তোমরা এতে দগ্ধ হও, অতএব তোমরা ধৈর্য ধর বা না ধর, তোমাদের জন্য দুটিই সমান। তোমাদেরকে কেবল সে কাজেরই প্রতিফল দেয়া হচ্ছে যা তোমরা করতে।\" \n\n" +
                " ০৫২:০১৭] নিশ্চই সচেতনরা জান্নাতগুলোতে ও পুরস্কারের মধ্যে থাকবে, \n\n" +
                " ০৫২:০১৮] অতএব তাদেরকে তাদের ক্রমবিকাশক যা কিছু দান করবেন তাতে তারা আনন্দিত হবে, এবং তাদের ক্রমবিকাশক তাদেরকে অনুতাপস্থলের আগুন থেকে রক্ষা করবেন, \n\n" +
                " ০৫২:০১৯] (এবং আল্লাহ বলবেন), \"তোমরা তোমাদের কৃত-কর্মের বিনিময়ে সানন্দে রুচিসহকারে আহার কর এবং পান কর।\" \n\n" +
                " ০৫২:০২০] তারা সারিসারি সুসজ্জিত পালঙ্কের উপর হেলান দিয়ে উপবিষ্ট থাকবে। এবং আমরা তাদেরকে পরমাসুন্দরী আয়তলোচনা নারীদেরকে জোড়া হিসেবে দান করব \n\n" +
                " ০৫২:০২১] এবং যারা আল্লাহর এককসত্তাকে মেনে নিয়েছে এবং তাদের সন্তান-সন্ততি স্বীকৃতির ক্ষেত্রে তাদেরকে অনুসরণ করেছে আমরা তাদের সন্তান-সন্ততিকেও তাদের সাথে মিলিত করব। এবং তাদের কৃত-কর্ম থেকে আমরা কিছু মাত্রও কম করব না। প্রত্যেক ব্যক্তি তার জন্য দায়ী হবে যা সে অর্জন করেছে। \n\n" +
                " ০৫২:০২২] এবং আমরা তাদেরকে নানাবিধ ফল ও মাংস প্রদান করব যা তারা চাইবে। \n\n" +
                " ০৫২:০২৩] তারা সেখানে একে অপরের সাথে পান-পাত্র আদান প্রদান করবে তাতে বৃথা কথা বলারও কিছু থাকবে না এবং কোনও অপরাধ করারও কিছু থাকবে না। \n\n" +
                " ০৫২:০২৪] এবং তাদের কিশোররা তাদের চারপাশে পরিক্রমণ করবে, তারা সুরক্ষিত মুক্তার মত পরিদৃষ্ট হবে। \n\n" +
                " ০৫২:০২৫] এবং তারা প্রশ্ন করতে করতে পরস্পর মুখামুখি হবে। \n\n" +
                " ০৫২:০২৬] তারা বলবে, \"ইতোপূর্বে নিশ্চই আমরা আমাদের পারিবারিক জীবনে ক্ষূদে(অবিবাহিত) ছিলাম, \n\n" +
                " ০৫২:০২৭] কিন্তু আল্লাহ আমাদের উপর অনুগ্রহ করেছেন এবং তিনি আমাদেরকে যৌন-অপরাধ থেকে রক্ষা করেছেন, \n\n" +
                " ০৫২:০২৮] নিশ্চই আমরা ইতিপূর্বে তাঁকে ডেকে আসছিলাম, নিশ্চই তিনি পরম কল্যাণকারী, এককসত্তা দয়াময়।\" \n\n" +
                " ০৫২:০২৯] অতএব আপনি উপদেশ দিতে থাকুন, কারণ আপনি আপনার ক্রমবিকাশকের অনুগ্রহে (সংখ্যাতাত্বিক)গণকও নন এবং উন্মাদও নন। \n\n" +
                " ০৫২:০৩০] তারা কী বলছে, \"(সে) একজন কবি আমরা তার জন্য মরণের অপেক্ষা করছি?\" \n\n" +
                " ০৫২:০৩১] আপনি বলুন, \"তোমরা অপেক্ষা করতে থাক, আমিও তোমাদের সাথে অপেক্ষামানদের অর্ন্তভুক্ত থাকলাম।\" \n\n" +
                " ০৫২:০৩২] তাদের বিচার-বুদ্ধি কি তাদেরকে এর আদেশ করছে অথবা তারা কি এক বিদ্রোহপরায়ণ জাতি? \n\n" +
                " ০৫২:০৩৩] অথবা তারা কি বলছে, \"সে নিজে এটি(কুরআন) রচনা করেছে?\" না, বরং তারা স্বীকার করে না। \n\n" +
                " ০৫২:০৩৪] অতএব যদি তারা সত্যবাদী হয়ে থাকে তাহলে তারা এর অনুরূপ কোন বাণী পেশ করুক। \n\n" +
                " ০৫২:০৩৫] তাদেরকে কি কোন কিছু ছাড়া সৃষ্টি করা হয়েছে অথবা তারা নিজেরাই কি(নিজেরদের) স্রষ্টা? \n\n" +
                " ০৫২:০৩৬] তারা কি বায়ুমণ্ডলগুলো ও পৃথিবীগুলোকে সৃষ্টি করেছে? না, বরং তাদের(স্রষ্টাতে) স্বীকৃতিই নেই। \n\n" +
                " ০৫২:০৩৭] তাদের কাছে কি আপনার ক্রমবিকাশকের ভান্ডারগুলো আছে অথবা তারা কি তত্ত্বাবধায়ক? \n\n" +
                " ০৫২:০৩৮] তাদের কাছে কি কোন সিঁড়ি(দ্রঃ নবীজীর আছে) আছে যাতে আরোহণ করে তারা (আল্লাহর কথা) শুনছে? অতএব তাদের শ্রোতা সুস্পষ্ট দলীল প্রমাণ পেশ করুক। \n\n" +
                " ০৫২:০৩৯] তাঁর(আল্লাহর) জন্য কি কন্যা সন্তানরা এবং তোমাদের জন্য পুত্র সন্তানরা? \n\n" +
                " ০৫২:০৪০] আপনি কি তাদের কাছে কোন পারিশ্রমিক চান যার ফলে তারা ঋণের বোঝায় ভারাক্রান্ত হয়ে পড়েছে? \n\n" +
                " ০৫২:০৪১] তাদের কাছে কি অজানা জ্ঞান আছে যা তারা লিপিবদ্ধ করছে? \n\n" +
                " ০৫২:০৪২] তারা কি কোন কৌশলোদ্ভাবন করতে চাচ্ছে? তাহলে যারা অস্বীকার করেছে তারা নিজেরাই ষড়যন্ত্রের মধ্যে আছে। \n\n" +
                " ০৫২:০৪৩] আল্লাহ এককসত্বার বদলে কি তাদের কোন পৃথকসত্বা আছে? তাদের পৃথকসত্বার কল্পনা থেকে আল্লাহ অত্যন্ত নিয়মশীল। \n\n" +
                " ০৫২:০৪৪] এবং যদি তারা মহাকাশের কোন একটা বস্তু-খন্ডকে পড়তে দেখে তখন তারা বলে, \"এটিতো এক ঘন মেঘ।\" \n\n" +
                " ০৫২:০৪৫] সুতরাং আপনি তাদেরকে ছেড়ে দিন যতক্ষণ পর্যন্ত না তারা তাদের সে দিনকে প্রত্যক্ষ করে যেদিন তাদেরকে বজ্রাঘাতে বাকশক্তিহীন করা হবে, \n\n" +
                " ০৫২:০৪৬] যেদিন তাদের দুরভিসন্ধি তাদের কোন উপকারে লাগবে না এবং তাদেরকে কোন সাহায্যও করা হবে না। \n\n" +
                " ০৫২:০৪৭] এবং নিশ্চই যারা অন্যায় করেছে তাদের জন্য এছাড়া আরও দুঃখ-কষ্ট আছে। কিন্তু তাদের অধিকাংশই তা জানে না। \n\n" +
                " ০৫২:০৪৮] এবং আপনি আপনার ক্রমবিকাশকের নির্দেশের জন্য ধৈর্য ধারণ করুন, কারণ আপনি আমাদের দৃষ্টির সামনে আছেন, এবং যখনই আপনি জাগেন, আপনার ক্রমবিকাশক প্রদত্ত দায়িত্ব প্রশংসার সাথে পালন করুন, \n\n" +
                " ০৫২:০৪৯] এবং রাত্রে এবং তারকারাজির অস্তগমনের সময়ও আপনি তাঁর দেয়া দায়িত্ব পালন করুন।");
        editor.putString("51","রিচ্ছেদ ০৫১.দৃশ্যঃ ঝিরঝিরে বৃষ্টি(সূরা আয-যারিয়াত The Drizzle) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৬১ আয়াত এবং ৩ রুকূ আছে। \n\n" +
                " ০৫১:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৫১:০০১] বলছি ঝিরঝিরে বৃষ্টির কথা যা গুড়ি গুড়ি ঝরে,  \n\n" +
                " ০৫১:০০২] এবং বোঝা বহনকারী মেঘের কথা, \n\n" +
                " ০৫১:০০৩] এবং মৃদু গতিতে ধাবমানদের, \n\n" +
                " ০৫১:০০৪] এবং(আমাদের) নির্দেশ (অনুযায়ী রহমত বারি) বন্টনকারীদের, \n\n" +
                " ০৫১:০০৫] তোমাদেরকে যে প্রতিশ্রুতি দেয়া হচ্ছে তা নিশ্চই সত্য,  \n\n" +
                " ০৫১:০০৬] এবং জীবন-বিধান অবশ্যই প্রতিষ্ঠিত হবে।  \n\n" +
                " ০৫১:০০৭] বলছি বহু (কক্ষ)পথ-বিশিষ্ট মহাকাশের কথা, \n\n" +
                " ০৫১:০০৮] নিশ্চই তোমরা পরস্পর বিরোধী কথায় লিপ্ত। \n\n" +
                " ০৫১:০০৯] (কেবল)তাকে ছাড়ানো হয় যে বেশি কথা বলে ।  \n\n" +
                " ০৫১:০১০] ধ্বংস হল তারা, যারা বেশি আনুমানিক কথা বলে, \n\n" +
                " ০৫১:০১১] যারা গভীর অজ্ঞতার কারনে (সত্য সম্বন্ধে) উপেক্ষায় রত আছে \n\n" +
                " ০৫১:০১২] তারা প্রশ্ন করে, \"জীবন-বিধান কখন প্রতিষ্ঠিত হবে ?\" \n\n" +
                " ০৫১:০১৩] \"সেদিন হবে, যখন তাদেরকে বৈচিত্রপূর্ণ আগুনে নিপতিত করা হবে।\" \n\n" +
                " ০৫১:০১৪] (এবং তাদেরকে বলা হবে,) \"তোমরা তোমাদের অগ্নি-যন্ত্রণার স্বাদ গ্রহণ কর, এ হচ্ছ সেটি(অগ্নি-যন্ত্রণা) যার ত্বরিত আগমন তোমরা চাইতে।\" \n\n" +
                " ০৫১:০১৫] নিশ্চই সচেতনরা বাগান ও ঝরণাগুলোর মধ্যে থাকবে,  \n\n" +
                " ০৫১:০১৬] তাদের ক্রমবিকাশক তাদেরকে যা কিছু দান করবেন তারা তা গ্রহণ করতে থাকবে, কারণ তারা এর পূর্বে সৎকর্মশীল ছিল,  \n\n" +
                " ০৫১:০১৭] তারা রাত্রে অল্পই ঘুমাত, \n\n" +
                " ০৫১:০১৮] এবং তারা প্রভাতে সংশোধন প্রার্থনা করত, \n\n" +
                " ০৫১:০১৯] যেহেতু তাদের ধন-সম্পদের মধ্যে অধিকার রয়েছে তাদের, যারা সাহায্য প্রার্থনা করে এবং তাদেরও যারা সাহায্য প্রার্থনা করতে পারে না। \n\n" +
                " ০৫১:০২০] এবং দৃঢ়নিশ্চিতদের জন্য পৃথিবীতে আয়াত(নিদর্শন) আছে,  \n\n" +
                " ০৫১:০২১] এবং তোমাদের নিজেদের মধ্যেও(অনেক আয়াত আছে), তবুও কি তোমরা দেখছ না? \n\n" +
                " ০৫১:০২২] এবং মহাকাশে তোমাদের জীবিকা আছে এবং তা আছে যার প্রতিশ্রুতি তোমাদেরকে দেয়া হয়েছে।  \n\n" +
                " ০৫১:০২৩] এবং বায়ুমণ্ডলগুলো ও পৃথিবীগুলোর ক্রমবিকাশকের শপথ, নিশ্চই এটি(কুরআন) অবশ্যই বিজ্ঞান, যেভাবে তোমরা 'কথা' বলতে পারছ।  \n\n" +
                " ০৫১:০২৪] আপনার কাছে কি ইব্রাহীমের সম্মানিত মেহমানদের বৃত্তান্ত পৌছেছে? \n\n" +
                " ০৫১:০২৫] যখন তারা তাঁর কাছে উপস্থিত হল তখন তারা বলল, \"সালাম(শান্তি বর্ষিত হউক)!\" তিনি বললেন, \"সালাম !\" (ইবরাহীম মনে মনে বললেন) \"লোকগুলো অপরিচিত মনে হচ্ছে।\" \n\n" +
                " ০৫১:০২৬] এবং তিনি নিরবে নিজ পরিবারের কাছে চলে গেলেন এবং একটি মোটা ভাজা বাছুর নিয়ে আসলেন,  \n\n" +
                " ০৫১:০২৭] এবং তা তাদের সামনে রাখলেন এবং বললেন, \"আপনারা কি খাবেন না?\" \n\n" +
                " ০৫১:০২৮] এবং তিনি তাদের থেকে ভীতি অনুভব করলেন, তারা বলল, \"ভীত হবে না,\" এবং তারা তাঁকে এক জ্ঞানবান পুত্র-সন্তানের সুসংবাদ দিলেন।  \n\n" +
                " ০৫১:০২৯] তখন তাঁর স্ত্রী অত্যন্ত লজ্জিত ও হতভম্ব হয়ে সামনে আসলেন এবং তিনি নিজ মুখে করাঘাত করে বললেন, \"আমি তো একজন বন্ধ্যা, বৃদ্ধা।\" \n\n" +
                " ০৫১:০৩০] তারা বলল, \"এভাবেই, তোমার ক্রমবিকাশক বলেছেন, নিশ্চই তিনি মহাবিজ্ঞানী, সর্বজ্ঞানী।\" \n\n" +
                " ০৫১:০৩১] তিনি(ইবরাহীম) বললেন, \"হে দূতরা! আপনাদের গুরুত্বপূর্ণ বিষয় কী?\" \n\n" +
                " ০৫১:০৩২] তারা বলল, \"আমরা এক অপরাধপরায়ণ জাতির কাছে প্রেরিত হয়েছি, \n\n" +
                " ০৫১:০৩৩] যেন আমরা তাদের উপর (ঠাণ্ডায় জমিয়ে)পাথর করে দেয়া-ঝড় বর্ষণ করি,  \n\n" +
                " ০৫১:০৩৪] যেগুলোকে তোমার ক্রমবিকাশকের দরবারে সীমালংঘনকারীদের শাস্তির জন্য চিহ্নিত করা হয়েছে।\" \n\n" +
                " ০৫১:০৩৫] সুতরাং সেখানে যারা স্বীকারকারী ছিল তাদেরকে আমরা বের করে নিলাম।  \n\n" +
                " ০৫১:০৩৬] এবং আমরা সেখানে(আমাদের প্রতি) সমর্পিতদের মাত্র একটি ঘরই পেলাম।  \n\n" +
                " ০৫১:০৩৭] এবং আমরা সেখানে সেসব লোকদের জন্য এমন একটি নিদর্শন রেখে দিলাম, যারা যন্ত্রণাদায়ক শাস্তিকে ভয় করে চলে।  \n\n" +
                " ০৫১:০৩৮] এবং মূসার(বৃত্তান্তের) মধ্যেও(অনেক আয়াত রয়েছে), যখন আমরা তাকে ফেরাউনের কাছে নিশ্চিত কর্তৃত্ব সহ নির্ভরযোগ্য প্রমাণ প্রেরণ করেছিলাম।  \n\n" +
                " ০৫১:০৩৯] কিন্তু সে(ফেরাউন) তার শক্তির অহমিকায় মুখ ফিরিয়ে নিল এবং বলল, \"সে(মুসা) তো একজন যাদুকর অথবা একজন উন্মাদ।\" \n\n" +
                " ০৫১:০৪০] সুতরাং আমরা তাকে(ফেরাউনকে) এবং তার সৈন্যদলকে ধৃৃত করলাম, অতঃপর তাদেরকে সমুদ্রে নিক্ষেপ করলাম, ফলে সে আজও তিরস্কৃত হচ্ছে।  \n\n" +
                " ০৫১:০৪১] এবং ‘আদ’ জাতির মধ্যেও(আয়াত রয়েছে) যখন আমরা তাদের উপর এক সর্বনাশা ঝঞ্জাবায়ু প্রেরণ করেছিলাম,  \n\n" +
                " ০৫১:০৪২] তা যার উপর দিয়ে প্রবাহিত হয়, তাকে পচা-গলিত অস্থিপুঞ্জে পরিণত না করে ছাড়ে না।  \n\n" +
                " ০৫১:০৪৩] এবং ‘সামুদ’ জাতির মধ্যেও(আয়াত রয়েছে) যখন তাদেরকে বলা হয়েছিল, \"ভোগ করে নাও স্বল্পকাল।\" \n\n" +
                " ০৫১:০৪৪] কিন্তু তারা তাদের ক্রমবিকাশকের আদেশকে অমান্য করল, তখন তাদেরকে বজ্রাঘাত ধৃত করল এবং তারা চেয়েচেয়ে দেখছিল, \n\n" +
                " ০৫১:০৪৫] এবং তারা না উঠে দাঁড়াতে পারল এবং না কারও কাছ থেকে কোন সাহায্য লাভ করতে পারল।  \n\n" +
                " ০৫১:০৪৬] এবং পূর্বে নূহের জাতিকেও(আমরা ধ্বংস করেছিলাম), নিশ্চই তারা এক অবাধ্য জাতি ছিল।  \n\n" +
                " ০৫১:০৪৭] এবং এই যে বায়ুমণ্ডলগুলো – আমরা এগুলোকে \"আমাদের হাত*(যা যা প্রয়োজন তা তা) দিয়ে সৃষ্টি করেছি, এবং নিশ্চই আমরা মহা সম্প্রসারণকারী।  \n\n" +
                " ০৫১:০৪৮] আর এই যে পৃথিবীগুলো- আমরা এগুলোকে বাসোপোযোগী করে সংখ্য্যাবৃদ্ধি করেছি এবং আমরা কত উত্তম বৃদ্ধিকারী ।  \n\n" +
                " ০৫১:০৪৯] এবং প্রত্যেক বস্তুকে জোড়া জোড়া করে সৃষ্টি করেছি যেন তোমরা উপদেশ গ্রহন কর \n\n" +
                " ০৫১:০৫০] অতএব তোমরা আল্লাহর দিকে ধাবিত হও, নিশ্চই আমি তাঁর কাছ থেকে তোমাদের জন্য একজন প্রকাশ্য সতর্ককারী।  \n\n" +
                " ০৫১:০৫১] এবং তোমরা আল্লাহর সাথে অন্যকিছুকে পৃথকসত্বা স্থির কোরও না, নিশ্চই আমি তাঁর পক্ষ থেকে তোমাদের জন্য একজন সুস্পষ্ট সতর্ককারী।  \n\n" +
                " ০৫১:০৫২] এভাবে পূর্ববর্তীদের কাছে এমন কোন রসূল আগমন করে নাই যাকে তারা একজন যাদুকর অথবা উন্মাদ বলে আখ্যায়িত করে নাই।  \n\n" +
                " ০৫১:০৫৩] তারা কি একে অপরকে(এই আচরণের) উইল করে গিয়েছিল? না, বরং তারা সকলে বিদ্রোহপরায়ণ জাতি।  \n\n" +
                " ০৫১:০৫৪] সুতরাং আপনি তাদের দিক থেকে মুখ ফিরিয়ে নিন, এবং আপনি (তাদের কার্যকলাপের জন্য) তিরস্কৃত হবেন না।  \n\n" +
                " ০৫১:০৫৫] এবং আপনি বার বার উপদেশ দিতে থাকুন, কেননা নিশ্চই উপদেশ স্বীকারকারীদের উপকার সাধন করে।  \n\n" +
                " ০৫১:০৫৬] এবং আমি মানুষ(জিন্ন ও ইনসান)কে শুধু এজন্যে সৃষ্টি করেছি যেন তারা কেবল মাত্র আমারই সেবা-কর্ম করে।  \n\n" +
                " ০৫১:০৫৭] এবং আমি তাদের কাছে কোন জীবিকা চাই না এবং এও চাই না যে তারা আমাকে খাদ্য দান করুক।  \n\n" +
                " ০৫১:০৫৮] নিশ্চই আল্লাহ তিনি, যিনি মহান জীবিকাদাতা, শক্তির অধিকারী, সুদৃঢ়। \n\n" +
                " ০৫১:০৫৯] অতএব যারা অন্যায় করেছে নিশ্চই তাদের জন্য তেমনই কর্মফল নির্ধারিত আছে যেমন তাদের(সম-মতাবলম্বী) সঙ্গীদের কর্মফল নির্ধারিত ছিল, সুতরাং তারা যেন আমার কাছে(শাস্তি চাওয়ায়) ব্যস্ততা না দেখায়।  \n\n" +
                " ০৫১:০৬০] সুতরাং যারা অস্বীকার করেছে তাদের জন্য সেদিন সর্বনাশ হবে, যার প্রতিশ্রুতি তাদেরকে দেয়া হয়েছে।");
        editor.putString("50","   পরিচ্ছেদ ০৫০.দৃশ্যঃ কাফ্/কুরআন(সূরা কাফ্ The Qaf/Quran) \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৪৬ আয়াত এবং ৩ রুকূ আছে। \n\n" +
                " ০৫০:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৫০:০০১] কাফ। এই মর্যাদাশীল-মহান কুরআনের কথা বলছি(যা একটি বড় প্রমাণ যে পুনরুত্থান অবশ্যই সংঘটিত হবে)। \n\n" +
                " ০৫০:০০২] এটি জেনে তারা বিস্মিত হচ্ছে, তাদের কাছে তাদেরই মধ্য থেকে একজন সর্তককারী আগমন করেছে। অতএব অস্বীকারকারীরা বলছে, \"এটি এক তাজ্জবের ব্যাপার! \n\n" +
                " ০৫০:০০৩] কী, আমরা যখন মরে যাব এবং মাটিতে পরিণত হব (তখন আমরা পুনর্জীবিত হব)? এরূপ প্রত্যাবর্তন (সম্ভাবনা থেকে) অনেক দূরের বিষয়।\" \n\n" +
                " ০৫০:০০৪] আমরা নিশ্চই জানি যা পৃথিবী তাদের মধ্য থেকে বিকীরণ(Radiation) করে, এবং আমাদের কাছে এমন এক গ্রন্থ(ডাইরী) আছে, যা(সবকিছু) সংরক্ষণ করে যাচ্ছে। \n\n" +
                " ০৫০:০০৫] বরং যখন বিজ্ঞান তাদের কাছে আসলো, তখন তারা এটিকে মিথ্যা প্রতিপন্ন করল, এইজন্য তারা বিষম দ্বিধা-দ্বন্দের অবস্থায় পড়ে আছে।  \n\n" +
                " ০৫০:০০৬] তারা কি নিজেদের উপরস্থিত বায়ুমণ্ডলকে দেখে না, আমরা তাকে কিভাবে সৃষ্টি করেছি এবং তাকে কিভাবে সৌন্দর্যমন্ডিত করেছি, এবং যার মধ্যে কোন ছিদ্র নেই? (বিপজ্জনক কোন রশ্নি আসতে পাররে না। নিচ্ছিদ্র নিরাপত্তা। খাদ্য নিয়ে আসা অতিবেগুনী রশ্নিও দুটি ওজন স্তরের প্রতিবন্ধকতা পেরিয়ে আসতে হয়) \n\n" +
                " ০৫০:০০৭] এবং (তারা কি দেখে না) পৃথিবীগুলোকে? আমরা সেগুলোকে (বিভিন্ন গ্যালাক্সিতে) সম্প্রসারিত করেছি, এবং সেগুলোতে পবর্তমালা সংস্থাপিত করেছি এবং তার মধ্যে সর্ব প্রকারের সুন্দর সুন্দর জোড়া উৎপন্ন করেছি, \n\n" +
                " ০৫০:০০৮] এতে(আল্লাহর কাছে) অবনত প্রত্যেক (বিজ্ঞানমনষ্ক)ব্যক্তির জন্য অর্ন্তদৃষ্টি ও উপদেশ রয়েছে।  \n\n" +
                " ০৫০:০০৯] এবং আমরা আকাশ থেকে জীবনোত্ফুল্ল বৃষ্টি বর্ষণ করি, অতঃপর আমরা তা দিয়ে বাগানগুলো এবং গোলাজাত করে রাখা শস্য উৎপন্ন করি,  \n\n" +
                " ০৫০:০১০] এবং উঁচু উঁচু খেজুর বৃক্ষগুলো, যাদের গুচ্ছগুলো স্তরে স্তরে(সুসজ্জিত) রয়েছে- \n\n" +
                " ০৫০:০১১] বান্দাদের জন্য জীবিকা হিসেবে, এবং আমরা তা(বৃষ্টি) দিয়ে নির্জীব জনপদকে সঞ্জীবিত করি। অনুরূপভাবেই পুনরুত্থান হবে।  \n\n" +
                " ০৫০:০১২] মিথ্যা প্রতিপন্ন করল- তাদের পূর্বে নূহের জাতি এবং কূপের অধিবাসীরা এবং সামুদ জাতি,  \n\n" +
                " ০৫০:০১৩] এবং আদ(এর জাতি) এবং ফেরাউন এবং লুতের ভ্রাতৃবৃন্দ, \n\n" +
                " ০৫০:০১৪] এবং অরন্যের অধিবাসীরা এবং তুব্বার জাতি। তারা প্রত্যেকেই রসূলদেরকে মিথ্যা প্রতিপন্ন করেছিল, পরিণামে আমার প্রতিশ্রুত শাস্তি পূর্ণ হল।  \n\n" +
                " ০৫০:০১৫] তবে কি আমরা প্রথমবার সৃষ্টি করেই ক্লান্ত হয়ে পড়েছি? না বরং নতুন সৃষ্টি সম্বন্ধে তারা সন্দেহে নিপতিত।  \n\n" +
                " ০৫০:০১৬] এবং নিশ্চই আমরা মানুষকে সৃষ্টি করেছি এবং তার স্বাধীনইচ্ছা তাকে যা কিছু প্ররোচনা দেয় তাও আমরা অবগত আছি, এবং আমরা তার জীবন-শিরা অপেক্ষাও অধিকতর নিকটে আছি।  \n\n" +
                " ০৫০:০১৭] যখন(তার) ডানদিকে এবং বামদিকে উপবিষ্ট দুইজন লিপিকার লিপিবদ্ধ করে যাচ্ছে,  \n\n" +
                " ০৫০:০১৮] সে যে কথাই বলুক না কেন, তার কাছে অবশ্যই (আরও)একজন অতন্দ্র প্রহরী(অডিও-ভিজুয়াল রেকর্ডিংএ নিয়োজত) রয়েছে, {অর্থাৎ আল্লাহ ও ৩ ফেরেস্তা প্রতিটি কাজের তাৎক্ষনিক বিচার-বিশ্লেষণ করে ডাইরীতে লিপিবদ্ধ রাখছেন} \n\n" +
                " ০৫০:০১৯] এবং মৃত্যুর আকস্মিক দমক বিজ্ঞানের ভিত্তিতে আসবে, \"এ হচ্ছে সে অবস্থা যা থেকে তোমরা প্রত্যেকে পাশ কাটিয়ে যেতে।\" \n\n" +
                " ০৫০:০২০] এবং সিগনাল ধ্বনিত হবে। এটিই শাসানো সেদিনটি।  \n\n" +
                " ০৫০:০২১] এবং প্রত্যেকটি প্রনশীল দেহ(এমন অবস্থায়) উপস্থিত হবে যে, পিছন থেকে হাঁকার জন্য তার সঙ্গে একজন চালক(ফিরিশতা) এবং একজন সাক্ষী(ফিরিশতা) থাকবে।  \n\n" +
                " ০৫০:০২২] \"এদিনটি সম্বন্ধে তুমি ঔদাসিন্যে পড়ে ছিলে, সুতরাং আমরা তোমার উপর থেকে তোমার আচ্ছাদন সরিয়ে দিলাম, ফলে আজ তোমার দৃষ্টি অতি তীক্ষ্ণ হয়েছে।\" \n\n" +
                " ০৫০:০২৩] এবং তার সঙ্গী(সাক্ষী ফিরিশতা) বলবে, \"যা কিছু(ডাইরীতে) আমার কাছে প্রস্তুত আছে তা এই।\" \n\n" +
                " ০৫০:০২৪] (অতঃপর আমরা তাদের উভয় চালক ও সাক্ষীকে বলব) \"তোমরা অনুতাপের আগুনে নিক্ষেপ কর প্রত্যেক অস্বীকারকারীকে, সত্যের শত্রুকে,--  \n\n" +
                " ০৫০:০২৫] ভাল কাজের প্রতিরোধকারীকে, সীমাতিক্রমকারীকে, সন্দেহ পোষণকারীকে- \n\n" +
                " ০৫০:০২৬] যে আল্লাহর বদলে কল্পিত পৃথকসত্তা গ্রহণ করেছিল, সুতরাং তোমরা তাকে অতি কঠোর দুঃখ-কষ্টে নিক্ষেপ কর।\" \n\n" +
                " ০৫০:০২৭] তার সঙ্গী(সাক্ষী ফিরিশতা) বলবে, \"হে আমাদের ক্রমবিকাশক ! আমিতো তাকে বাধ্য করি নাই, বরং সে ঘোর পথভ্রষ্টতায় নিপতিত ছিল।\"  \n\n" +
                " ০৫০:০২৮] তিনি বলবেন, \"তোমরা আমার কাছে ঝগড়া করবে না, আমি তোমাদেরকে পূর্বেই সতর্ক করে দিয়েছিলাম,  \n\n" +
                " ০৫০:০২৯] আমার দরবারে কোন কথা পরিবর্তন করা যায় না, এবং আমি বান্দাদেরর প্রতি ন্যূনতম অন্যায়ও করব না।\" \n\n" +
                " ০৫০:০৩০] সেদিন আমরা অনুতাপস্থলকে বলব, \"তুমি কি পূর্ণ হয়েছ?\" এবং সে উত্তরে বলবে, \"আরও কিছু আছে কি?\" \n\n" +
                " ০৫০:০৩১] এবং জান্নাতকে সচেতনদেরর জন্য এত নিকটবর্তী করে দেয়া হবে যে, কোন দূরত্ব থাকবে না।  \n\n" +
                " ০৫০:০৩২] এটিই তোমাদের কাছে দেয়া সে প্রতিশ্রুতি, যা প্রত্যাবর্তনকারী এবং (জীবন-বিধানের) রক্ষাকারী প্রত্যেক ব্যক্তির সঙ্গে করা হয়েছে,  \n\n" +
                " ০৫০:০৩৩] যে রহমান আল্লাহর প্রতি সংগোপনেও বিনীত থেকেছে, এবং \"ফজর ও ইশায়\" ঝুঁকা মন-মগজ নিয়ে উপস্থিত হয়েছে।  \n\n" +
                " ০৫০:০৩৪] \"তোমরা শান্তির সাথে এ জান্নাতে প্রবেশ কর। এটি সেই চিরস্থায়ী বসবাসের দিন।\" \n\n" +
                " ০৫০:০৩৫] সেখানে তারা যা কিছু চাইবে তা-ই তারা পাবে, এছাড়া আমাদের কাছে দেয়ার আরও অনেক কিছু আছে। \n\n" +
                " ০৫০:০৩৬] এবং আমরা তাদের পূর্বে কত জাতিকে ধ্বংস করেছি যারা শক্তিতে এদের অপেক্ষা অধিকতর প্রবল ছিল ! তারা দেশ-বিদেশ জয় করে বেড়াত। কিন্তু কোথাও কি বাঁচার স্থান ছিল? \n\n" +
                " ০৫০:০৩৭] নিশ্চই এতে তার জন্য উপদেশ রয়েছে যার মন-মগজ আছে অথবা যে কান পেতে শোনে এবং সে গভীরভাবে পর্যবেক্ষণ করে।  \n\n" +
                " ০৫০:০৩৮] নিশ্চই আমরা বায়ুমণ্ডলগুলো এবং পৃথিবীগুলোকে এবং এতদুভয়ের মধ্যে যা কিছু আছে সবকিছুকে 'অনন্তের কাছাকাছি অন্তযূক্ত সময় ধরে'(ছয় দিনে) সৃষ্টি করে চলেছি অথচ আমাদেরকে কোন ক্লান্তি স্পর্শ করছে না।  \n\n" +
                " ০৫০:০৩৯] অতএব তারা যা কিছু বলছে তাতে আপনি ধৈর্য ধারণ করুন এবং সূর্যোদয়ের পূর্বে এবং সূর্যাস্তের পূর্বে আপনি প্রশংসা সহ আপনার ক্রমবিকাশকের দেয়া দায়িত্ব পালন করুন, \n\n" +
                " ০৫০:০৪০] এবং রাত্রেও তাঁর দেয়া দায়িত্ব পালন করুন এবং সেজদা(সালাত) গুলোর শেষেও।  \n\n" +
                " ০৫০:০৪১] এবং শুনুন ! যেদিন একজন আহ্বানকারী নিকটবর্তী স্থান থেকে আহ্বান করবে,  \n\n" +
                " ০৫০:০৪২] যেদিন সকল লোক বিজ্ঞান-প্রযূক্তিগত সংকেত ধ্বনী শুনবে, এটিই হবে দলবদ্ধভাবে অভিনিষ্ক্রমণের দিন।  \n\n" +
                " ০৫০:০৪৩] নিশ্চই আমরাই জীবন দান করি এবং আমরাই মৃত্যু দিই, এবং আমাদেরই দিকে সকলের প্রত্যাবর্তন হবে,  \n\n" +
                " ০৫০:০৪৪] যেদিন সকল পৃথিবী তাদের পুনরুত্থানের জন্য বিদীর্ণ হবে(ভ্রূণগুলো তোলার কারনে) এমতাবস্থায় যে, তারা তাড়াতাড়ি করবে, এভাবে সমবেত করা আমাদের জন্য সহজ।  \n\n" +
                " ০৫০:০৪৫] তারা যা বলে আমরা তা সবিশেষ অবগত আছি, আপনি তাদের উপর শক্তি প্রয়োগকারী নন, অতএব আপনি কুরআন দিয়ে তাকে উপদেশ দিন, যে আমার সতর্ক বাণীকে ভয় করে। \n\n");
editor.putString("49","পরিচ্ছেদ ০৪৯.দৃশ্যঃ কার্যালয়(সূরা আল-হুজুরাত The Office) \n\n" +
        "    এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ১৯ আয়াত এবং ২ রুকূ আছে। \n\n" +
        "     ০৪৯:০০০] অযাচিত অসীম দাতা(বারবার ক্ষমাকারী) পরম(সবচেয়ে) দয়াময় আল্লাহর সৌজন্যে \n\n" +
        "     ০৪৯:০০১] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ ! তোমরা আল্লাহ্ ও তাঁর রসূলের সামনে অগ্রবতী হবে না, এবং আল্লাহর সচেতনতা অবলম্বন কর । নিশ্চই আল্লাহ্ সর্বশ্রোতা, সর্বজ্ঞানী। \n\n" +
        "     ০৪৯:০০২] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ ! তোমরা নিজেদের কণ্ঠ স্বরকে নবীর কণ্ঠস্বরের উপর উচু কোরও না, এবং তোমরা তোমাদের পরস্পরের মধ্যে উচ্চঃস্বরে কথা বলার মত তাঁর সামনে উচ্চঃস্বরে কথা বোলও না, কারণ এতে তোমাদের কৃতকর্মগুলো বিনষ্ট হয়ে যাবে এবং তোমরা অনুভবও করতে পারবে না। \n\n" +
        "     ০৪৯:০০৩] নিশ্চই যারা নিজেদের কণ্ঠস্বরকে আল্লাহর রসূলের সামনে চাপা দিয়ে রাখে তারাই এমন লোক যাদের অন্তরকে আল্লাহ সচেতনতার জন্য বিশুদ্ধ করে নিয়েছেন; তাদের জন্য সংশোধন(ক্ষমা) ও মহাপুরস্কার অবধারিত রয়েছে। \n\n" +
        "     ০৪৯:০০৪] যারা কার্যালয়ের পিছন থেকে আপনাকে উচ্চৈস্বরে ডাকাডাকি করে তাদের অধিকাংশই বুদ্ধি খাটায় না। \n\n" +
        "     ০৪৯:০০৫] এবং আপনি বের হয়ে তাদের কাছে আসা পর্যন্ত যদি তারা ধৈর্য ধারণ করত তাহলে তা তাদের জন্য খুব ভাল হত এবং আল্লাহ্ অতীব সংশোধনকাারী(ক্ষমাশীল), পরম দয়াময়। \n\n" +
        "     ০৪৯:০০৬] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ ! যদি কোন দুস্কৃতকারী তোমাদের কাছে কোন গুরুত্বপূর্ণ সংবাদ নিয়ে আসে তাহলে তোমরা ভালরূপে তদস্ত কর, যেন এমন না হয় যে, তোমরা না জেনে কোন জাতিকে কষ্ট দাও এবং পরে তোমরা যে(ভুল) কাজ কর তার জন্য অনুতপ্ত হও। \n\n" +
        "     ০৪৯:০০৭] এবং তোমরা জেনে রাখ যে, তোমাদের মধ্যে আল্লাহর রসুল রয়েছেন; যদি অনেক বিষয়ে তিনি তোমাদের কথা মেনে চলেন তাহলে অবশ্যই তোমরা কষ্টে পড়বে, কিন্তু আল্লাহ্ তোমাদের দৃষ্টিতে স্বীকৃতিকে প্রিয় করে দিয়েছেন এবং তোমাদের অন্তরে এটি মনোরম করে দিয়েছেন; এবং অস্বীকার, দুস্কৃতি এবং অবাধ্যতাকে তিনি তোমাদের দৃষ্টিতে ঘৃণ্য করে দেখিয়েছেন। এরাই সঠিকপথে কায়েম আছে। \n\n" +
        "     ০৪৯:০০৮] এসব আল্লাহর পক্ষ থেকে অনুগ্রহ ও পুরস্কার স্বরূপ। এবং আল্লাহ্ সর্বজ্ঞানী, মহাবিজ্ঞানী। \n\n" +
        "     ০৪৯:০০৯] এবং যদি স্বীকারকারীদের দুদল পরস্পর লড়াইয়ে লিপ্ত হয়, তাহলে তাদের উভয়ের মধ্যে তোমরা মীমাংসা করাবে; যদি(মীমাংসার পরে) তাদের উভয়ের মধ্য থেকে একদল অপর দলের উপর বিদ্রোহ করে আক্রমণ করে তাহলে তোমরা সকলে মিলে, যে বিদ্রোহ করেছে, তার বিরুদ্ধে যুদ্ধ করে যাবে যতক্ষণ পর্যন্ত না সে আল্লাহর নির্দেশের দিকে ফিরে আসে। যদি সে ফিরে আসে তাহলে তোমরা তাদের উভয়ের মধ্যে ন্যায়পরায়ণতার সাথে মীমাংসা করিয়ে দিবে এবং সুবিচার করবে। নিশ্চই আল্লাহ্ সুবিচারকারীদেরকে ভালবাসেন। \n\n" +
        "     ০৪৯:০১০] নিশ্চই স্বীকারকারীরা পরস্পর ভাই ভাই, অতএব তোমরা তোমাদের ভ্রাতৃগণের মধ্যে সংশোধনপূর্বক শান্তি স্থাপন কর এবং আল্লাহর সচেতনতা অবলম্বন কর, যাতে তোমাদের উপর দয়া করা হয়। \n\n" +
        "     ০৪৯:০১১] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ ! কোন জাতি যেন অন্য জাতিকে হাসি বিদ্রুপ(উপহাস) না করে, তারা তাদের চেয়ে উত্তম হতে পারে ; এবং নারীরাও যেন অন্য নারীদেরকে হাসি বিদ্রুপ(উপহাস) না করে, তারা তাদের চেয়ে উত্তম হতে পারে। এবং তোমরা একে অপরের প্রতি দোষারোপ কোরও না; আল্লাহকে এককসত্বা মেনে নেয়ার পর দূষণীয় নাম(দিয়ে ডাকা) বড়ই মন্দ কথা; এবং যারা এরপর তওবা করবে না তারাই অন্যায়কারী। \n\n" +
        "     ০৪৯:০১২] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ ! তোমরা অতিরিক্ত সন্দেহকে পরিহার কর, কারণ কতক (ক্ষেত্রে) সন্দেহ পাপ বিশেষ। এবং তোমরা ছিদ্রান্বেষণ কোরও না, এবং একে অপরের পিছনে গীতব (কুৎসা) করে বেড়িও না। তোমাদের মধ্যে কেহ কি তার মৃত ভাইয়ের মাংস খেতে চাইবে? অবশ্যই তোমরা একে ঘৃণা করবে; এবং আল্লাহর সচেতনতা অবলম্বন কোরও, নিশ্চই আল্লাহ্ পুনঃ পুনঃ সদয় দৃষ্টিপাতকারী, পরম দয়াময়। \n\n" +
        "     ০৪৯:০১৩] হে মানবমন্ডলী! নিশ্চই আমরা তোমাদেরকে পুরুষ ও নারী থেকে সৃষ্টি করেছি এবং তোমাদেরকে বিভিন্ন জাতি এবং বিভিন্ন গোত্রে বিভক্ত করে দিয়েছি যেন তোমরা একে অপরকে চিনতে পার; নিশ্চই আল্লাহর দৃষ্টিতে তোমাদের মধ্যে সর্বাধিক সম্মানিত ঐ ব্যক্তি যে তোমাদের মধ্যে সর্বাধিক সচেতন; নিশ্চই আল্লাহ্ সর্বজ্ঞানী, সর্ববিদিত। \n\n" +
        "     ০৪৯:০১৪] মরুবাসীগণ বলে, আমরা আল্লাহকে এককসত্বা মেনে নিয়েছি । আপনি বলুন তোমরা (এখনও প্রকৃত) আল্লাহকে এককসত্বা মেনে নাও নাই, বরং তোমরা বল, আমরা ইসলাম(কুরআন) গ্রহণ করেছি, কারণ এখনও স্বীকৃতি তোমাদের অন্তরে প্রবেশ করে নাই। কিন্তু যদি তোমরা আল্লাহ্ এবং তাঁর রসূল(কুরআন)এর আনুগত্য কর, তাহলে তিনি তোমাদের কৃতকর্মগুলো থেকে কিছুই কম করবেন না। \n\n" +
        "     ০৪৯:০১৫] আসলে স্বীকারকারী কেবল তারাই যারা আল্লাহকে এককসত্বা ও রসূল (কুরআন)কে জীবন-বিধান মেনে নেয়, অতঃপর তারা সন্দেহ পোষণ করে না এবং নিজেদের ধনসম্পদ ও প্রাণ দিয়ে আল্লাহর পথে প্রচেষ্টা করে, তারাই সত্যবাদী। \n\n" +
        "     ০৪৯:০১৬] আপনি বলুন, ‘তোমরা কি আল্লাহকে তোমাদের জীবন-বিধান শিখাবে? অথচ আল্লাহ্ জানেন যা কিছু বায়ুমণ্ডলগুলোতে আছে এবং যা কিছু পৃথিবীগুলোতে আছে; বস্তুতঃ আল্লাহ্ সকল বিষয়ে সর্বজ্ঞানী। \n\n" +
        "     ০৪৯:০১৭] তারা ইসলাম(কুরআন) গ্রহণ করে আপনার উপর অনুগ্রহ করেছে বলে মনে করে। আপনি বলুন, তোমরা তোমাদের ইসলাম গ্রহণ করাকে আমার উপর তোমাদের অনুগ্রহ ভেবো না। বরং আল্লাহ্ তোমাদের উপর অনুগ্রহ করেছেন যে, তিনি তোমাদেরকে স্বীকৃতীর পথে পরিচালিত করছেন; যদি তোমরা সত্যবাদী হয়ে থাক। \n\n" +
        "     ০৪৯:০১৮] নিশ্চই আল্লাহ্ বায়ুমণ্ডলগুলো ও পৃথিবীগুলোর অদৃশ্য-অজানা বিষয়াবলী জানেন, এবং তোমরা যে কাজ কর তা আল্লাহ্ ভালভাবে দেখছেন \n\n" +
        "    </string>");
        editor.putString("48", "পরিচ্ছেদ ০৪৮.দৃশ্যঃ বিজয়(সূরা আল-ফাত্হ The Conquest) \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ৩০ আয়াত এবং ৪ রুকূ আছে। \n\n" +
                " ০৪৮:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৪৮:০০১] নিশ্চই আমরা আপনাকে এক সুস্পষ্ট বিজয় দান করেছি, \n\n" +
                " ০৪৮:০০২] যেন আল্লাহ্ আপনাকে সংশোধন করেন, আপনার যা আগে ভুল-ত্রুটি হয়েছে এবং ভবিষাতে হতে পারে, এবং আপনার উপর নিজ অনুগ্রহকে পূর্ণ করেন এবং আপনাকে সরল সুদৃঢ় পথে পরিচালিত করেন; \n\n" +
                " ০৪৮:০০৩] এবং আল্লাহ্ আপনাকে অতি শক্তিশালী সাহায্য দান করেন। \n\n" +
                " ০৪৮:০০৪] তিনিই তো স্বীকারকারীদের অন্তরে প্রশান্তি নাযেল করেছেন, যেন তারা তাদের পূর্বেকার স্বীকৃতির সাথে স্বীকৃতিতে আরও বৃদ্ধি লাভ করে, যেহেতু বায়ুমণ্ডলগুলোর ও পৃথিবীগুলোর সকল সৈন্যদল আল্লাহরই এবং আল্লাহ্ সর্বজ্ঞানী মহাবিজ্ঞানী । \n\n" +
                " ০৪৮:০০৫] যেন তিনি স্বীকারকারী পুরুষদেরকে এবং স্বীকারকারী নারীদেরকে এমন জান্নাতগুলোতে প্রবিষ্ট করেন যার তলদেশ দিয়ে অব্যহত পানির সরবরাহ থাকবে, তারা তাতে সবসময় বসবাস করতে থাকবে, এবং যেন তিনি তাদের সকল অনিষ্ট দূরীভূত করে দেন; এবং আল্লাহর কাছে এটি হবে মহা-সফলতা। \n\n" +
                " ০৪৮:০০৬] এবং যেন তিনি দ্বিধাগ্রস্থ পুরুষদেরকে ও দ্বিধাগ্রস্থ নারীদেরকে এবং পৃথকসত্বাবাদী পুরূষদেরকে ও পৃথকসত্বাবাদী নারীদেরকে, যারা আল্লাহ্ সম্বন্ধে অনেক মন্দ ধারণা পোষণ করে, শাস্তি দেন । তাদের উপরই অমঙ্গল চক্র আসবে; এবং আল্লাহ্ তাদের উপর ক্রোধ বর্ষণ করেছেন, এবং তাদেরকে অমঙ্গলাবদ্ধ করেছেন, এবং তাদের জন্য অনুতাপস্থল প্রস্তুত করে রেখেছেন। এবং প্রত্যাবর্তনস্থল হিসেবে তা অতীব নিকৃষ্ট। \n\n" +
                " ০৪৮:০০৭] এবং বায়ুমণ্ডলগুলোর ও পৃথিবীগুলোর সৈন্যদল আল্লাহরই এবং আল্লাহ্ ভালবাসা-কনার মহাসমূদ্র, মহাবিজ্ঞানী । \n\n" +
                " ০৪৮:০০৮] নিশ্চই আমরা আপনাকে সাক্ষীরূপে, সুসংবাদদাতারূপে এবং সতর্ককারীরূপে পাঠিয়েছি. \n\n" +
                " ০৪৮:০০৯] যেন আপনারা আল্লাহকে এককসত্বা ও তাঁর রসূল(কুরআন)কে জীবন-বিধান মেনে নেন এবং তাকে কার্যে পরিণত করেন এবং তাকে প্রতিষ্ঠিত করেন; এবং প্রভাতে ও সন্ধ্যায় তাঁর প্রদত্ত দায়িত্ব পালন করেন। \n\n" +
                " ০৪৮:০১০] নিশ্চই যারা আপনার আনুগত্যের শপথ করে বস্তুতঃ পক্ষে তারা আল্লাহরই আনুগত্যের শপথ করে। আল্লাহর হাত তাদের হাতের উপর আছে। অতএব যে ব্যক্তি আনুগত্যের শপথকে ভঙ্গ করে সে নিজেরই বিরুদ্ধে অঙ্গীকার ভঙ্গ করে; এবং যে ব্যক্তি সে অঙ্গীকারকে পূর্ণ করে যা সে আল্লাহর সাথে করেছে তাকে অচিরেই তিনি মহাপুরস্কার দান করবেন। \n\n" +
                " ০৪৮:০১১] মরুবাসীদের মধ্য থেকে যাদেরকে পশ্চাতে পরিত্যাগ করা হয়েছিল, তারা নিশ্চই আপনাকে বলবে, আমাদেরকে আমাদের ধন-সস্পদ ও পরিজনবর্গ মশগুল রেখেছিল, সুতরাং আপনি আমাদের জন্য সংশোধনের প্রার্থনা করুন। তারা নিজেদের মুখে যা বলে তা তাদের অন্তরে নেই। আপনি বলুন, \"যদি আল্লাহ্ তোমাদের ক্ষতি করতে চান অথবা তোমাদের কল্যাণ সাধন করতে চান তাহলে কে আছে যে আল্লাহর বিরুদ্ধে তোমাদের জন্য কিছু করার ক্ষমতা রাখে ? না, বরং তোমরা যা কিছু করেছ সে সম্বন্ধে আল্লাহ্ সবকিছু জানেন। \n\n" +
                " ০৪৮:০১২] না, বরং তোমারা এই ধারণা করেছিলে, এই রসূল এবং স্বীকারকরীরা নিজেদের পরিবার পরিজনের কাছে আর কখনও ফিরে আসবে না; এবং এ ধারণাকে তোমাদের অন্তরে অতি মনোরম করে দেখানো হয়েছিল, এবং তোমরা অতি মন্দ ধারণা করেছিলে; যেহেতু তোমরা ধ্বংসপ্রাপ্ত জাতি ছিলে। \n\n" +
                " ০৪৮:০১৩] এবং যে ব্যক্তি আল্লাহকে এককসত্বা ও তাঁর রসূল(কুরআন)কে জীবন-বিধান মেনে নেয় না- অবশ্যই আমরা এমন অস্বীকারকরীদের জন্য জলন্ত আগুন প্রস্তুত করে রেখেছি। \n\n" +
                " ০৪৮:০১৪] যেহেতু বায়ুমণ্ডলগুলোর ও পৃথিবীগুলোর আধিপত্য আল্লাহরই। তিনি যাকে চান সংশোধন করেন এবং যাকে চান দুঃখ-কষ্ট দেন। এবং আল্লাহ্ অতীব সংশোধনশীল, এককসত্তা দয়াময়। \n\n" +
                " ০৪৮:০১৫] যখন তোমরা যুদ্ধলদ্ধ মালের দিকে অগ্রসর হবে, তা নেয়ার জন্য, তখন যাদেরকে পশ্চাতে পরিত্যাগ করা হয়েছিল তারা অবশ্যই বলবে, \"আমাদেরকে তোমাদের অনুসরণ করতে দাও। তারা আল্লাহর মীমাংসাকে অনুসরণ করতে চাইবে। তুমি বল তোমরা কখনও আমাদের পিছনে আসতে পারবে না । তোমাদের সম্বন্ধে এমনই আল্লাহ্ ইতিপূর্বে বলেছেন। তখন তারা নিশ্চই বলবে, \"বরং তোমরা আামাদের সাথে হিংসা করছ। যেহেতু তারা খুব সামান্য ছাড়া কিছু্ই বুঝে না। \n\n" +
                " ০৪৮:০১৬] মরুবাসীদের মধ্যে যাদেরকে পশ্চাতে পরিত্যাগ করা হয়েছিল, আপনি তাদেরকে বলুন, \"অচিরেই তোমাদেরকে এক দুর্দান্ত যোদ্ধা জাতির সাথে যুদ্ধ করার জন্য আহবান করা হবে, তোমরা তাদের সাথে যুদ্ধ করে যাবে যতক্ষণ পর্যন্ত না তারা আত্নসমর্পণ করে। সুতরাং যদি তোমরা তখন অনুগত্য কর, তাহলে আল্লাহ্ তোমাদেরকে উত্তম পুরস্কার দিবেন; কিন্তু যদি তোমরা পৃষ্ঠ প্রদর্শন কর যেভাবে পূর্বে তোমরা পৃষ্ঠ প্রদর্শন করেছিলে, তাহলে তিনি তোমাদেরকে যন্ত্রণাদায়ক দুঃখ-কষ্ট দিবেন। \n\n" +
                " ০৪৮:০১৭] অন্ধের উপর কোন দোষ নেই, খঞ্জের উপর কোন দোষ নেই, পীড়িতের উপর কোন দোষ নেই (যদি তারা প্রচেষ্টায় যোগান না করতে পারে) এবং যে ব্যক্তি আল্লাহর এককসত্তা ও তাঁর রসূল(কুরআন)কে জীবন-বিধান হিসেবে আনুগত্য করবে, তিনি তাকে এমন জান্নাতে প্রবিষ্ট করবেন যার তলদেশ দিয়ে অব্যহত পানির সরবরাহ থাকবে; কিন্তু যে পৃষ্ঠ প্রদর্শন করবে তাকে তিনি যন্ত্রণাদায়ক দুঃখ-কষ্ট দিবেন।\" \n\n" +
                " ০৪৮:০১৮] নিশ্চই আল্লাহ্ স্বীকারকারীদের প্রতি সন্তুষ্ট হয়েছেন যখন তারা একটি বৃক্ষতলে আপনার আনুগত্যের শপথ করছিল, এবং তিনি তাদের অন্তরে যা ছিল তা অবগত ছিলেন, সুতরাং তিনি তাদের অন্তরে প্রশান্তি নাযেল করলেন এবং তাদেরকে নিকটবর্তী বিজয় দান করলেন। \n\n" +
                " ০৪৮:০১৯] এবং বহু পরিমাণ যুদ্ধ লব্ধ সম্পদ (দান করলেন) যা তারা সংগ্রহ করেছিল। বস্তুতঃ আল্লাহ্ ভালবাসাকনার মহাসমূদ্র, মহাবিজ্ঞানী। \n\n" +
                " ০৪৮:০২০] আল্লাহ্ তোমদেরকে বহু যুদ্ধ লব্ধ সম্পদের প্রতিশ্রুতি দান করেছেন যা তোমরা হস্তগত করবে; এবং এটি তিনি তোমাদেরকে ত্বরিত দান করেছিলেন, এবং লোকদের হাতকে তোমাদের উপর থেকে প্রতিহত করেছিলেন, যেন এটি স্বীকারকারীদের জন্য নিদর্শন হয়, এবং যেন তিনি তোমাদেরকে এসব দিয়ে সরল সুদৃঢ় পথে পরিচালিত করেন;। \n\n" +
                " ০৪৮:০২১] এবং আরও একটি (বিজয়) আছে, যা তোমরা এখনও করায়ত্ত করতে পার নাই; আল্লাহ্ সেটিকে পরিবেষ্টন করে রেখেছেন; নিশ্চই আল্লাহ্ প্রত্যেক বিষয়ে পরিমিত পরিমাপ নিরুপনে সক্ষম। \n\n" +
                " ০৪৮:০২২] এবং যারা অস্বীকার করেছে যদি তারা তোমাদের সাথে যুদ্ধ করত তাহলে নিশ্চই তারা পিঠ ফিরিয়ে নিত, তখন তারা না পেত কোন অভিভাবক এবং না কোন সাহায্যকারী। \n\n" +
                " ০৪৮:০২৩] আল্লাহর সুন্নত (চিরাচরিত নিয়ম) যা আগে থেকে চলে আসছে; এবং আপনি আল্লাহর সুন্নতে (চিরাচরিত নিয়মে) কখনও কোন পরিবর্তন দেখতে পাবেন না। \n\n" +
                " ০৪৮:০২৪] এবং তিনিইতো মক্কা উপত্যকায় আপনাদেরকে তাদের উপর বিজয়ী করার পর তাদের হাতকে আপনাদের উপর থেকে এবং আপনাদের হাতকে তাদের উপর থেকে প্রতিরোধ করেছিলেন। এবং আল্লাহ আপনাদের কৃতকর্ম প্রত্যক্ষ করছিলেন \n\n" +
                " ০৪৮:০২৫] তারাইতো অস্বীকার করেছিল এবং আপনাদেরকে মসজিদুল হারাম থেকে বাধা দিয়েছিল; এবং কুরবানীর পশুগুলিকেও. যেগুলি (কুরবানীর উদ্দেশ্যে) অবরুদ্ধ অবস্থায় ছিল, কুরবানীস্থলে পৌছতে বাধা দিয়েছিল। এবং যদি কতিপয় এমন স্বীকারকারী পুরুষ এবং স্বীকারকারী \n\n" +
                "নারী(মক্কায়) না থাকত, যাদেরকে আপনারা জানতেন না(এবং এই আশংকা না হত) যে আপনারা তাদেরকে পদদলিত করবেন, ফলে আপনাদের উপর তাদের পক্ষ থেকে অজ্ঞাতসারে একটা দোষ বর্তে যাবে ; এটি এই জন্য যেন আল্লাহ্ যাকে চান নিজ রহমতে প্রবিষ্ট করেন। যদি তারা এদিকে ওদিক সরে যেত, তাহলে আমরা অবশ্যই তাদের মধ্য থেকে, যারা অস্বীকার করেছিল তাদেরকে, যন্ত্রণাদায়ক শাস্তি দিতাম । \n\n" +
                " ০৪৮:০২৬] (স্মরণ করুন সে সময়কে) যখন তারা, যারা অস্বীকার করেছিল, নিজেদের অন্তরে অন্ধকার যুগের আত্নশ্লাঘার ন্যায় আত্নশ্লাঘা পোষণ করেছিল, তখন আল্লাহ্ তাঁর রসূলের উপর এবং স্বীকারকারীদের উপর স্বীয় প্রশান্তি নাযেল করলেন এবং তিনি তাদেরকে সচেতনতার নীতির উপর সুদৃঢ়ভাবে প্রতিষ্ঠিত করলেন, বস্তুতঃ তারাই এর অধিকতর অধিকারী ও উপযুক্ত ছিল এবং আল্লাহ্ সকল বিষয়ে সর্বজ্ঞানী। \n\n" +
                " ০৪৮:০২৭] নিশ্চই আল্লাহ্ তাঁর রসূলের জন্য স্বপ্নটি বাস্তব সত্য করে দেখালেন : যদি আল্লাহ্ চান আপনারা অবশ্যই নিরাপদে আল মসজিদুলহারামে প্রবেশ করবেন; আপনাদের কেউ মাথা মুড়ানো অবস্থায় এবং কেউ কেউ চুল ছাটানো অবস্থায় , আপনারা কোন ভয় করবেন না। সুতরাং আল্লাহ্ তা জানতেন যা আপনারা জানতেন না এবং এছাড়া তিনি আরও একটি আসন্ন বিজয় নির্ধারিত করেছেন। \n\n" +
                " ০৪৮:০২৮] তিনিই তো তাঁর রসূলকে সুপথ-প্রাপ্তীর-নির্দেশনা ও বিজ্ঞানের বিধান সহ প্রেরণ করেছেন যেন তিনি এটিকে সকল বিধানের উপর জযযুক্ত করেন। এবং সাক্ষী হিসাবে আল্লাহ্ই যথেষ্ট । \n\n" +
                " ০৪৮:০২৯] মুহাম্মদ আল্লাহর রসূল, এবং যারা তাঁর সাথে আছে, তারা অস্বীকারকারীদের বিরুদ্ধে অত্যন্ত কঠোর কিন্তু পরস্পরের প্রতি দয়াদ্রচিত্ত। আপনি তাদেরকে বিনীতভাবে সেজদারত দেখতে পাবেন, তারা সর্বদা আল্লাহর বিজ্ঞান-প্রযূক্তি ও (গরিবদের এককভাবে অন্ন-বস্ত্র দান এবং বিপদাপন্নকে ও দারিদ্রদূরিকরণে সম্মিলিতভাবে দানের মাধ্যমে) আল্লাহর সন্তুষ্টি লাভের জন্য যত্নবান থাকে। *সেজদার চিহ্নের* জন্য তাদের চেহারায় তাদের (পরিচয়ের) লক্ষণাবলী রয়েছে। তাদের এ বিবরণ, এক শশ্য ক্ষেত্রের মত, যা নিজ অঙ্কুর নির্গত করে, অতঃপর তাকে সুদৃঢ় করে, ফলে তা আরও পুষ্ট হয় অতঃপর তা স্বীয় কাণ্ডের উপর প্রতিষ্ঠিত হয় যা কৃষককে আনন্দিত করে যেন তিনি তাদের (স্বীকারকারীদের উন্নতি) দিয়ে অস্বীকারকারীদেরকে ক্রোধান্বিত করেন। তাদের মধ্য থেকে যারা আল্লাহর এককসত্তা মেনে নেয় এবং ভালকাজ করে আল্লাহ্ তাদের সাথে সংশোধন এবং মহা প্রতিদানের অংগীকার করেছেন। \n\n" +
                "</string>");
        editor.putString("47", "পরিচ্ছেদ ০৪৭.দৃশ্যঃ নবীজী মুহাম্মদ(সূরা মুহাম্মদ The Mohamed) \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ৩৯ আয়াত এবং ৪ রুকূ আছে। \n\n" +
                " ০৪৭:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৪৭:০০১] যারা অস্বীকার করে এবং লোকদেরকে আল্লাহর পথ থেকে নিবৃত্ত রাখে- তিনি তাদের সকল কাজ ব্যর্থ করে দেন। \n\n" +
                " ০৪৭:০০২] এবং যারা আল্লাহকে এককসত্বা মেনে নেয় এবং ভালকাজ করে এবং যা নবীজী মুহাম্মদের উপর অবতীর্ণ হয়েছে তাও মেনে নেয়- বস্তুতঃ এটি তাদের ক্রমবিকাশকের তরফ থেকে পূর্ণ সত্য- তিনি তাদের অনিষ্ট গুলোকে দূর করে দিবেন এবং তাদের অবস্থা সংশোধন করে দিবেন। \n\n" +
                " ০৪৭:০০৩] এটি এজন্য, যারা অস্বীকার করে তারা মিথ্যার অনুসরণ করে এবং যারা আল্লাহকে এককসত্বা মেনে নেয় তারা নিশ্চই তাদের ক্রমবিকাশক থেকে সমাগত পূর্ণ সত্যের অনুসরণ করে। এভাবেই আল্লাহ্ মানব জাতির জন্য তাদের উপমাগুলো বর্ণনা করে থাকেন। \n\n" +
                " ০৪৭:০০৪] অতএব যখন তোমাদের অস্বীকারকারীদের সাথে সাক্ষাৎ হয় তখন (তাদের) \"করার ক্ষমতায়\" আঘাত অর্থাৎ যূদ্ধ করতে থাক যতক্ষণ পর্যন্ত না তারা নিরুৎসাহিত হয় , তখন তাদের বন্ধি কর; অতঃপর (তাদেরকে মুক্ত কর) অনুগ্রহ করে অথবা মুক্তি পণ নিয়ে, যতক্ষণ পর্যন্ত না যুদ্ধ শেষ হয়। এ-ই হল প্রত্যাদেশ। এবং আল্লাহ্ ইচ্ছা করলে নিজেই তাদের থেকে প্রতিশোধ নিতে পারতেন কিন্তু তিনি তোমাদের কিছু লোককে কিছু লোকের মাধ্যমে পরীক্ষা করতে চান। এবং যারা আল্লাহর পথে নিহত হয়েছে তাদের কৃতকর্ম তিনি কখনও বিনষ্ট করবেন না। \n\n" +
                " ০৪৭:০০৫] তিনি অবশ্যই তাদেরকে সুপথপ্রাপ্তীর নির্দেশনার পথে নিয়ে যাবেন, এবং তাদের অবস্থার সংশোধন করে দিবেন। \n\n" +
                " ০৪৭:০০৬] এবং তাদেরকে সে জান্নাতে দাখিল করবেন যার পরিচয় তিনি পূর্বেই তাদেরকে দিয়েছেন। \n\n" +
                " ০৪৭:০০৭] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ! যদি তোমরা আল্লাহকে সাহায্য কর তাহলে তিনিও তোমাদেরকে সাহায্য করবেন এবং তোমাদের পদক্ষেপ গুলিকে সুদৃঢ় করে দিবেন। \n\n" +
                " ০৪৭:০০৮] এবং যারা অস্বীকার করেছে তাদের ভাগ্যে ধ্বংস অবধারিত এবং তিনি তাদের কৃতকর্মকে বিনষ্ট করে দিবেন। \n\n" +
                " ০৪৭:০০৯] এটি এজন্য, তারা তা ঘৃণা করেছে যা আল্লাহ্ অবতীর্ণ করেছেন; ফলে তিনিও তাদের কৃত-কর্মকে বিনষ্ট করে দিয়েছেন। \n\n" +
                " ০৪৭:০১০] অতএব তারা কি পৃথিবীতে পরিভ্রমণ করে নাই এবং তারা দেখে নাই, তাদের পূর্ববতীদের পরিণাম কেমন হয়েছিল? আল্লাহ্ তাদেরকে সম্পূর্ণরূপে চুর্ণ বিচূর্ণ করে দিয়েছেন, অস্বীকারকারীদের অবস্থাও তেমন হবে। \n\n" +
                " ০৪৭:০১১] এটি এজন্য, আল্লাহ্ তাদের অভিভাবক যারা আল্লাহকে এককসত্বা মেনে নিয়েছে, পক্ষান্তরে অস্বীকারকারীদের কোন অভিভাবক নেই। \n\n" +
                " ০৪৭:০১২] যারা আল্লাহকে এককসত্বা মেনে নেয় এবং ভালকাজ করে , নিশ্চই আল্লাহ্ তাদেরকে জান্নাত গুলোতে প্রবিষ্ট করবেন যেগুলোর তলদেশ দিয়ে অব্যাহত পানির সরবরাহ থাকবে; এবং যারা অস্বীকার করেছে তারা সুখ ভোগ করে, এবং এভাবেই আহার করে বেড়ায় যেভাবে চতুম্পদ জন্তু আহার করে বেড়ায়, এবং আগুন হবে তাদের আবাসস্থল । \n\n" +
                " ০৪৭:০১৩] এবং এমন কত জনপদ ছিল, যারা আপনার সে জনপদ অপেক্ষা অধিকতর শক্তিশালী ছিল যারা আপনাকে বহিস্কার করে দিয়েছে, আমরা তাদেরকে ধ্বংস করে দিয়েছি তখন কেউই তাদের সাহায্যকারী ছিল না। \n\n" +
                " ০৪৭:০১৪] যে ব্যক্তি নিজ ক্রমবিকাশক থেকে সমাগত এক সুম্পষ্ট প্রমাণের উপর প্রতিষ্ঠিত সে কি তার মত হতে পারে, যাকে তার কাজের অনিষ্টকে সু্ন্দর করে দেখানো হয়েছে এবং তারা নিজেদের হীন প্রবৃত্তির অনুসরণ করছে? \n\n" +
                " ০৪৭:০১৫] সচেতনদেরকে যে জান্নাতের প্রতিশ্রুতি দেয়া হয়েছে তার বিবরণঃ তাতে নির্মল-বিশুদ্ধ পানির সরবরাহ থাকবে; এবং দুধের সরবরাহ থাকবে, যার স্বাদ কখনও বিকৃত হবে না; এবং পানকারীদের জন্য সুস্বাদু সুরার সরবরাহ থাকবে ; এবং পরিস্কার স্বচ্ছ মধুর সরবরাহ থাকবে। এবং সেখানে তাদের জন্য থাকবে প্রত্যেক প্রকারের ফল ফলাদি এবং তাদের ক্রমবিকাশক থেকে সংশোধন। এটি তাদের মত হতে পারে কি যারা দীর্ঘকাল আগুনে বাস করবে এবং যাদেরকে এমন ফুটন্ত পানি পান করানো হবে যা তাদের নাড়ী ভূড়ি ছিঁড়ে ফেলবে? \n\n" +
                " ০৪৭:০১৬] এবং তাদের মধ্যে কতক আছে যারা আপনার কথা কান পেতে শুনতে থাকে অতঃপর যখন তারা আপনার কাছ থেকে চলে যায়, তখন যাদেরকে জ্ঞান দেয়া হয়েছে তাদেরকে তারা বলে, এক্ষুণি সে এসব কী বলল? এরাই তারা, যাদের মস্তিষ্ককে আল্লাহ মোহরাংকিত(বিবেক-বুদ্ধি হারা) করে দিয়েছেন, এবং তারা নিজেদের প্রবৃত্তির অনুসরণ করে চলছে। \n\n" +
                " ০৪৭:০১৭] এবং যারা সুপথপ্রাপ্তির নির্দেশনা পায় তিনি তাদেরকে সুপথপ্রাপ্তির নির্দেশনার মধ্যে আরও বর্ধিত করে দেন, এবং তাদেরকে তাদের (অবস্থা অনুপাতে) সচেতনতা দান করেন। \n\n" +
                " ০৪৭:০১৮] অতএব তারা শুধু নির্দিষ্ট সময়ের অপেক্ষা করছে যেন তা তাদের কাছে অকস্মাৎ এসে পড়ে। বস্তুতঃ তার লক্ষণগুলো এসেই পড়েছে। কিন্তু যখন তা সত্যি সত্যি তাদের কাছে এসে পড়বে তখন তাদের উপদেশ গ্রহণ করা তাদের কী উপকার করবে? \n\n" +
                " ০৪৭:০১৯] অতএব আপনি জেনে রাখুন, কোনও উদ্ভাবনীশক্তি নেই কেবল আল্লাহ এককসত্বা ছাড়া ; এবং আপনি আপনার (মানবীয়) ক্রটি বিচ্যুতির জন্য সংশোধন ও নিরাপত্তা প্রার্থনা করুন, এভাবেই স্বীকারকারী পুরুষ ও স্বীকারকারী নারীদের জন্যেও। এবং আল্লাহ্ আপনাদের এদিক ওদিক গমনাগমনস্থল ও অবস্থানস্থলকে ভালভাবে জানেন। \n\n" +
                " ০৪৭:০২০] এবং যারা আল্লাহকে এককসত্বা মেনে নিয়েছে তারা বলে, কোন সূরা কেন অবতীর্ণ হল না ? অতঃপর যখন এমন দ্বার্থহীন সুদৃঢ় সূরা অবতীর্ণ করা হয় যার মধ্যে যুদ্ধের উল্লেখ থাকে, তখন যাদের মনে-মগজে কলুষতা(বিকৃত বিবেকবুদ্ধি) আছে আপনি তাদেরকে দেখতে পাবেন, তারা আপনার দিকে এমনভাবে তাকায় যেমন ভাবে মৃত্যুর ঘোরে অচেতন ব্যক্তি তাকায়। সুতরাং তাদের জন্য ধ্বংস! \n\n" +
                " ০৪৭:০২১] আনুগত্য এবং সংগত কথা, এবং যখন কোনও বিষয় চুড়ান্ত হয়, তখন যদি তারা আল্লাহর সাথে সত্যপরায়ণতা দেখাত তাহলে এটি তাদের জন্য অতি উত্তম হত। \n\n" +
                " ০৪৭:০২২] অতএব, যদি তোমরা শাসন ক্ষমতায় অধিষ্ঠিত হও তাহলে তোমরা কি পৃথিবীতে নীতিভ্রষ্টতা করে বেড়াবে না? \n\n" +
                " ০৪৭:০২৩] এরাই তারা, যাদেরকে আল্লাহ্ অভিসম্পাত করেছেন এবং তাদেরকে বধির এবং তাদের চোখগুলিকে অন্ধ করে দিয়েছেন। \n\n" +
                " ০৪৭:০২৪] তবে কি তারা কুরআনের উপর মনোনিবেশ করে না, অথবা তাদের মনে-মগজে তালা লাগানো আছে? \n\n" +
                " ০৪৭:০২৫] যারা নিজেদের পৃষ্ঠ প্রদর্শন করে ফিরে যায়, তাদের উপর সুপথপ্রাপ্তির নির্দেশনা সুস্পষ্টভাবে প্রকাশিত হওয়ার পরও, নিশ্চই শয়তান তাদেরকে বিপথে প্রলুব্ধ করে এবং তাদেরকে মিথ্যা আশ্বাস দেয়। \n\n" +
                " ০৪৭:০২৬] এটি এজন্য, আল্লাহ্ যা অবতীর্ণ করেছেন তাকে যারা ঘৃণা করে তাদেরকে এরা বলে আমরা কোন কোন বিষয়ে অবশ্যই তোমাদের আনুগত্য করব; এবং আল্লাহ্ তাদের সকল গোপন রহস্য জানেন। \n\n" +
                " ০৪৭:০২৭] সুতরাং যখন ফিরিশতারা তাদের মুখমন্ডলে ও তাদের পৃষ্ঠদেশে আঘাত করতে করতে তাদের প্রাণ বের করে নিবে তখন তাদের কেমন শোচনীয় অবস্থা হবে! \n\n" +
                " ০৪৭:০২৮] এটি এজন্য হবে, যা আল্লাহকে অসন্তুষ্ট করে তারা তার অনুসরণ করে, এবং তাঁর সন্তুষ্টি লাভের চেষ্টাকে তারা ঘৃণা করে। সুতরাং তিনিও তাদের কৃত কর্মসগুলোকে বিনষ্ট করে দিয়েছেন। \n\n" +
                " ০৪৭:০২৯] যাদের মনে-মগজে কলুষতা(বিকৃত বিবেকবুদ্ধি) আছে, তারা কি মনে করে, আল্লাহ্ তাদের (অন্তর্নিহিত) হিংসা বিদ্বেষকে কখনও প্রকাশ করবেন না? \n\n" +
                " ০৪৭:০৩০] এবং আমরা ইচ্ছে করলে অবশ্যই আপনার দৃষ্টিতে তাদেরকে চিহ্নিত করে দিতাম, তখন আপনি তাদেরকে তাদের চেহারার লক্ষণগুলো দিয়ে নিশ্চই চিনে নিতেন। এবং আপনি (এখনও) নিশ্চই তাদেরকে তাদের কথার স্বরভঙ্গী দিয়ে চিনতে পারবেন। এবং আল্লাহ্ আপনাদের কৃতকর্মকে জানেন। \n\n" +
                " ০৪৭:০৩১] এবং নিশ্চই আমরা আপনাদের পরীক্ষা করতে থাকব যতক্ষণ পর্যন্ত না আমরা আপনাদের মধ্য থেকে প্রচেষ্টাকারীদেরকে ও ধৈর্যশীলদেরকে স্বতন্ত্রভাবে প্রকাশ করে দিব। এবং আপনাদের (সঠিক) অবস্থান অবহিত করে দিব। \n\n" +
                " ০৪৭:০৩২] নিশ্চই যারা অস্বীকার করেছে এবং (মানুষকে)আল্লাহর পথ থেকে প্রতিরোধ করেছে এবং তাদের কাছে সুপথপ্রাপ্তীর নির্দেশনা প্রকাশ হওয়ার পরও তারা রসূলের বিরুদ্ধাচরণ করেছে তারা আল্লাহর আদৌ কোন ক্ষতি করতে পারবে না; উপরন্তু তিনি তাদের কৃত-কর্মগুলো বিনষ্ট করে দিবেন। \n\n" +
                " ০৪৭:০৩৩] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ! তোমরা আল্লাহর আনুগত্য কর এবং এই রসুল(কুরআন)এর আনুগত্য কর এবং তোমরা নিজেদের কৃত-কর্মগুলো নষ্ট কোরও না। \n\n" +
                " ০৪৭:০৩৪] নিশ্চই যারা অস্বীকার করেছে এবং (মানুষকে)আল্লাহর পথ থেকে প্রতিরোধ করেছে, অতঃপর অস্বীকারকারী হওয়া অবস্থায় মৃত্যু বরণ করেছে, তাদেরকে আল্লাহ্ কখনও ক্ষমা করবেন না। \n\n" +
                " ০৪৭:০৩৫] সুতরাং (হে স্বীকারকারীরা !) তোমরা অলস হবে না এবং সন্ধির জন্য আহবান করবে না; অবশেষে তোমরাই বিজয়ী হবে। এবং আল্লাহ্ তোমাদের সাথে আছেন এবং তিনি তোমাদের কৃতকর্মগুলো কখনও কম করবেন না। \n\n" +
                " ০৪৭:০৩৬] এই ইহকালীন-জীবন ক্রীড়া কৌতুক এবং আমোদ প্রমোদ ছাড়া আর কিছু্ই নয়; এবং তোমরা যদি আল্লাহকে এককসত্বা মেনে নাও এবং সচেতনতা অবলম্বন কর তাহলে তিনি তোমাদেরকে তোমাদের পুরস্কার দান করবেন এবং তিনি তোমাদের কাছে তোমাদের ধন সম্পদ চাইবেন না। \n\n" +
                " ০৪৭:০৩৭] যদি তিনি তোমাদের কাছে সম্পদ চান এবং তোমাদের উপর চাপ সৃষ্টি করেন, তাহলে তোমরা কার্পণ্য করতে পার, এবং তিনি তোমাদের ঈর্ষা বিদ্বেষেকে তোমাদের অন্তর থেকে বের করে দিবেন। \n\n" +
                " ০৪৭:০৩৮] শুন! তোমরাই হচ্ছ সেসব লোক যাদেরকে আল্লাহর পথে খরচ(দরিদ্রকে এককভাবে অন্ন-বস্ত্র দান, বিপদাপন্নকে ও দারিদ্রদূরিকরণে সম্মিলিতভাবে দান ) করার জন্য আহবান করা হচ্ছে ; তবে তোমাদের মধ্যে এমনও আছে যে কার্পণ্য করে। কিন্তু যে কার্পণ্য করে, সে প্রকৃত পক্ষে নিজের প্রাণের বিরুদ্ধেই কার্পণ্য করে। আসলে আল্লাহ্ অসীম সম্পদশালী, এবং তোমরাই অভাবগ্রস্ত। এবং যদি তোমরা বিমুখ হয়ে যাও, তাহলে তিনি তোমাদের স্থলে অন্য এক জাতিকে নিয়ে আসবেন, তখন তারা তোমাদের মত (উদাসিন) হবে না। \n\n" +
                "</string>");
        editor.putString("46", "পরিচ্ছেদ ০৪৬.দৃশ্যঃ বালিয়াড়ি(সূরা আল-আহকাফ The Sand-Dune) \n\n" +
                "এটি মক্কী সূরা, বিসমিল্লাহ সহ এতে ৩৬ আয়াত এবং ৪ রুকূ আছে। \n\n" +
                " ০৪৬:০০০] অযাচিত অসীম দাতা(বারবার ক্ষমাকারী) পরম(সবচেয়ে) দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৪৬:০০১] হা মীম্। \n\n" +
                " ০৪৬:০০২] ভালবাসা-কনার মহাসমূদ্র, মহাবিজ্ঞানী আল্লাহর নিকট থেকে এ গ্রন্থ অবতীর্ণ । \n\n" +
                " ০৪৬:০০৩] আমরা বায়ুমণ্ডলগুলো ও পৃথিবীগুলো এবং এতদুভয়ের মধ্যে যাকিছু আছে সবকিছু বিজ্ঞানের ভিত্তিতে এবং ধনাত্মক কনা ছাড়া সৃষ্টি করি নাই; এবং যারা অস্বীকার করেছে তারাই তা থেকে বিমুখ হয় যার সম্বন্ধে তাদেরকে সতর্ক করা হয়েছে।  \n\n" +
                " ০৪৬:০০৪] আপনি বলুন,তোমরা তাদের সম্বন্ধে কি কিছু জান যাদেরকে(পীর-পূরোহিত-যাযক-হুজুরদেরকে) তোমরা আল্লাহর পরিবর্তে ডাক ? আমাকে দেখাও তারা পৃথিবীগুলোতে কী সৃষ্টি করেছে, অথবা বায়ুমণ্ডলগুলোর (সৃষ্টির) মধ্যে তাদের কোন অংশ আছে কি? যদি তোমরা সত্যবাদী হয়ে থাক তাহলে এর পূর্ববতী কোন গ্রন্থ আমার সামনে আন অথবা জ্ঞানের সামান্য কোনও প্রামাণিক সাক্ষ্য উপস্থিত কর। \n\n" +
                " ০৪৬:০০৫] এবং ঐ ব্যক্তি আপেক্ষা অধিকতর পথভ্রষ্ট আর কে হতে পারে যে আল্লাহর পরিবর্তে এমন অস্তিত্বের কাছে প্রার্থনা করে যারা পুনরুত্থানের দিন পর্যন্ত তার ডাকে সাড়া দিতে পারবে না, এবং তারা তাদের প্রার্থনা সম্পর্কে সম্পূর্ণ উদাসিন থাকবে ? \n\n" +
                " ০৪৬:০০৬] এবং যখন মানব জাতিকে পুনরুত্থিত করে একত্রিত করা হবে তখন তারা(পীর-পূরোহিত-যাযক-হুজুররা) তাদের(উপাশকদের) শত্রু হয়ে দাঁড়াবে এবং তাদের সেবা-কর্মকে অস্বীকার করবে। \n\n" +
                " ০৪৬:০০৭] এবং যখন তাদের নিকট আমাদের সমু্জ্জল আয়াতগুলো আবৃত্তি করা হয়, তখন যারা অস্বীকার করেছে, তারা বিজ্ঞানকে,যখন তা তাদের নিকট সমাগত হয়, বলে, ‘এ-তো সুস্পষ্ট যাদু। \n\n" +
                " ০৪৬:০০৮] তারা কি এমন বলে যে, ‘সে নিজেই এটি রচনা করে নিয়েছে?’ আপনি বলুন, \"যদি আমি এটি স্বয়ং রচনা করে থাকি তাহলে আল্লাহর মোকাবেলায় আমাকে রক্ষা করার জন্য তোমাদের ক্ষমতা হবে না। এর সম্বন্ধে যা কিছু তোমরা বর্ণনা করে বেড়াচ্ছ তা তিনি সর্বাধিক জানেন। তিনি আমার ও তোমাদের মধ্যে সাক্ষী হিসাবে যথেষ্ট।\" বস্তুতঃ তিনি অতীব সংশোধনশীল, পরম দায়াময়। \n\n" +
                " ০৪৬:০০৯] আপনি বলুন,‘আমি কোন অভিনব রসূল নই, আমি জানি না আমার সংগে কী ব্যবহার করা হবে এবং তোমাদের সংগেই বা কী ব্যবহার করা হবে। আমি কেবল তারই অনুসরণ করে চলি যা আমার প্রতি প্রত্যাদেশ করা হয় এবং আমি একজন সুস্পষ্ট সতর্ককারী মাত্র। \n\n" +
                " ০৪৬:০১০] আপনি বলুন, ‘তোমরা কি লক্ষ্য করেছ, যদি এটি(কুরআন) আল্লাহর নিকট থেকে অবতীর্ণ হয়ে থাকে এবং তোমরা এটিকে অস্বীকার কর অথচ বনী-ইসরাঈল থেকে একজন সাক্ষী তার নিজের মত একজনের (রাসুল আবির্ভাবের) সাক্ষ্য দান করেছে এবং সে স্বয়ং আল্লাহর এককসত্বা মেনে নিয়েছে, কিন্তু তোমরা অহংকার কর(তাহলে এর পরিমাণ কী হবে)?’ আল্লাহ অন্যায়কারী জাতিকে আদৌ সুপথপ্রাপ্তির নির্দেশনা দেন না।  \n\n" +
                " ০৪৬:০১১] এবং যারা অস্বীকার করে তারা, আল্লাহর এককসত্বা স্বীকারকারীদের জন্য বলে, \"যদি এটি(কুরআন) কল্যাণময় হত তাহলে তারা আমাদের আগে এটিকে মেনে নিতে পারত না ।\" অতএব যখন তারা এটি থেকে সুপথপ্রাপ্তির নির্দেশনা গ্রহণ করল না, তখন নিশ্চই তারা এ কথাই বলবে, \"এটি বহু পুরাতন মিথ্যা।\" \n\n" +
                " ০৪৬:০১২] এবং এর পূর্বে মূসার গ্রন্থ ছিল পথ-প্রদর্শক ও রহমত স্বরূপ; এবং এ গ্রন্থ (কুরআন) যা পূর্ব-গ্রন্থের সত্যায়নকারী, আরবী ভাষায় বর্ণিত, অন্যায়কারীদের জন্য সতর্ককারী এবং সৎকর্মশীলদের জন্য আনন্দের ঢল(ঈদ) ।  \n\n" +
                " ০৪৬:০১৩] নিশ্চই যারা বলে,‘আল্লাহ্ আমাদের ক্রমবিকাশক ; অতঃপর সুদৃঢ়ভাবে অবিচল থাকে, অবশ্য তাদের কোন ভয় নাই এবং তারা দুঃখিতও হবে না। \n\n" +
                " ০৪৬:০১৪] এরাই জান্নাতের অধিবাসী, তারা তাতে চিরকাল বাস করবে- সেসব কাজের বিনিময় স্বরূপ যা তারা করত। \n\n" +
                " ০৪৬:০১৫] এবং আমরা মানবজাতিকে তার মাতাপিতার সাথে সদ্ব্যাবহার করার আবশ্যিক আদেশ দিয়েছি, কারণ তার মাতা তাকে কঠিন কষ্টের সাথে গর্ভে ধারণ করেছে এবং কঠিন কষ্টের সাথে প্রসব করেছে, এবং তাকে গর্ভে ধারণ করতে ও দুধ ছাড়াতে মোট ত্রিশ মাস লেগেছে, অতঃপর সে যখন পূর্ণ যৌবনে উপনীত হয় এবং চল্লিশ বৎসর বয়সে পদার্পণ করে, তখন সে বলে, ‘হে আমার ক্রমবিকাশক ! আপনি আমাকে কর্মশক্তি দান করুন, যাতে আমি আপনার সে অনুগ্রহের কৃতজ্ঞতা করতে পারি যা আপনি আমাকে ও আমার মাতা-পিতাকে দান করেছেন এবং (কর্মশক্তি দিন) যেন আমি এমন ভালকাজ করতে পারি যাতে আপনি সন্তুষ্ট হন; এবং আমার জন্য আমার বংশধরদের মধ্যেও সৎকর্মশীলতা প্রতিষ্ঠিত করুন। নিশ্চই আমি আপনার দিকে প্রত্যাবর্তিত হয়েছি এবং নিশ্চই আমি সমর্পিতদের অন্তর্ভূক্ত হয়েছি । \n\n" +
                " ০৪৬:০১৬] এরাই এমন লোক যাদের ভালকাজ গুলোকে আমরা গ্রহণ করব এবং তাদের মন্দকাজ গুলোকে উপেক্ষা করব, তারা জান্নাতবাসীদের অন্তর্ভুক্ত হবে; এ এক সত্য প্রতিশ্রুতি যা তাদের সাথে করা হয়েছে। \n\n" +
                " ০৪৬:০১৭] এবং ঐ ব্যক্তি কেমন (হতভাগ্য) যে, তার মাতা-পিতাকে বলে, আফসোস তোমাদের প্রতি! তোমরা কি এই বলে আমাকে ভয় প্রদর্শন করছ যে, আমাকে (কবর থেকে) বহির্গত করা হবে অথচ আমার পূর্বে বংশের পর বংশ অতীত হয়ে গেছে(কাউকেও ফিরিয়ে আনা হয়নি)? এবং তারা(বাবা ও মা) উভয়ে আল্লাহর কাছে ফরিয়াদ করে, (এবং সন্তানকে বলে হে বৎস !) ধিক তোমাকে! তুমি আল্লাহর এককসত্বা মেনে নাও, নিশ্চই আল্লাহর প্রতিশ্রুতি বিজ্ঞান ভিত্তিক। তখন সে বলে এসব পূর্ববর্তীদের উপকথা ছাড়া কিছুই নয়। \n\n" +
                " ০৪৬:০১৮] এরা এমন লোক, যাদের উপর বিজ্ঞানের কথা পূর্ণ হয়ে গেছে এরা জিনচরিত্র ও ইনাসানচরিত্রের মানুষের সেসব জাতির অন্তর্গত, যারা এদের আগে গত হয়ে গেছে; নিশ্চই তারা ক্ষতিগ্রস্থ। \n\n" +
                " ০৪৬:০১৯] এবং তারা যে কাজ করেছে সে অনুযায়ী প্রত্যেকের জন্য পদমর্যাদা আছে, এটি এজন্য যেন তিনি তাদেরকে তাদের কর্মের পূর্ণ প্রতিফল দেন, এবং তাদের প্রতি কোন অন্যায় করা হবে না। \n\n" +
                " ০৪৬:০২০] এবং যেদিন তাদেরকে, যারা অস্বীকার করেছে, অনুতাপের আগুনে উপস্থিত করা হবে(এবং বলা হবে) তোমরা তোমাদের ইহকালীন জীবনে নিজেদের সমস্ত উত্তম বস্তু নিঃশেষ করেছ এবং তা দিয়ে পূর্ণরূপে সুখ ভোগ করেছ; সুতরাং আজ তোমাদেরকে প্রতিফল দেয়া হবে লাঞ্ছনাজনক শাস্তি; এ কারনে যে, তোমরা পৃথিবীতে অহংকার করতে অবৈজ্ঞানিক কাজ করতে এবং এ কারণে যে, তোমরা উশৃঙ্খল যৌনাচরণ করতে। \n\n" +
                " ০৪৬:০২১] এবং ‘আদ’ জাতির ভাইকে(হুদকে) স্মরণ কর, যখন সে তার জাতিকে বালিয়াড়িতে(আহকাফে) সতর্ক করেছিল এবং তার পূর্বেও এবং তার পরেও অনেক সতর্ককারী গত হয়ে গেছে, তাদের প্রত্যেকেই এ শিক্ষা দিয়েছিল যে, তোমরা আল্লাহ্ ছাড়া কারও সেবা-কাজ কোরও না। নিশ্চই আমি তোমাদের উপর এক মহা দিনের দুঃখ-কষ্টের আশংকা করছি।  \n\n" +
                " ০৪৬:০২২] তারা বলল,‘তুমি কি আমাদের কাছে এজন্য এসেছ যেন তুমি আমাদেরকে আমাদের ইশ্বরদের থেকে বিচ্ছিন্ন করে দিতে পার? অতএব যদি তুমি সত্যবাদী হয়ে থাক তাহলে আমাদের নিকট সেসব বিষয় নিয়ে আস যার ভয় তুমি আমদেরকে দেখাচ্ছ ।  \n\n" +
                " ০৪৬:০২৩] সে বলল, ‘প্রকৃত জ্ঞান শুধু আল্লাহর নিকট আছে এবং আমি তোমাদের কাছে কেবল সে শিক্ষাই পৌঁছে দিচ্ছি যা নিয়ে আমি প্রেরিত হয়েছি, কিন্তু আমি যে তোমাদেরকে এক অজ্ঞ-মূর্খ জাতিরূপে দেখছি।  \n\n" +
                " ০৪৬:০২৪] অতঃপর যখন তারা সে শাস্তিকে এক মেঘের আাকারে তাদের উপত্যকা গুলোর দিকে অগ্রসর হতে দেখল, তখন তারা বলল, ‘এটি এক মেঘ যা আমাদের উপর বৃষ্টি বর্ষণ করবে। (আমরা বললাম)না, বরং এ হচ্ছে সে শাস্তি যা তোমরা তাড়াতাড়ি চেয়েছ – এক বায়ু(Polar Cold Air-Mass) যার মধ্যে যন্ত্রণাদায়ক দুঃখ-কষ্ট নিহিত আছে,(যেদিক দিয়ে বয়ে যায় সব প্রচণ্ড ঠাণ্ডায় জমিয়ে পাথর করে দেয়)  \n\n" +
                " ০৪৬:০২৫] যা তাদের ক্রমবিকাশকের আদেশক্রমে প্রত্যেক বস্তুকে ধ্বংস করে যেতে থাকল। ফলে তাদের প্রভাত হল এমন আবস্থায় যে, তাদের গৃহগুলি ছাড়া আর কিছুই দেখা গেল না। এভাবেই আমরা অপরাধী জাতিকে প্রতিফল দিয়ে থাকি ।  \n\n" +
                " ০৪৬:০২৬] এবং আমরা তাহাদেরকে এমন শক্তিতে প্রতিষ্ঠিত করেছিলাম যেভাবে (হে মক্কাবাসীগণ!) তোমাদেরকে প্রতিষ্ঠিত করি নাই; এবং আমরা তাদেরকে বিবেক-বুদ্ধি(কর্ণ, চক্ষু এবং হৃদয়) দান করেছিলাম । কিন্তু তাদের বিবেক-বুদ্ধি(কর্ণ, চক্ষু এবং হৃদয়) তাদের কোনই উপকারে লাগল না; কারণ তারা, এবং যে শস্তি নিয়ে তারা ঠাট্টা-বিদ্রুপ করত সেটিই তাদেরকে পরিবেষ্টন করে ফেলল। \n\n" +
                " ০৪৬:০২৭] এবং অবশ্যই আমরা তোমাদের চারপাশের জনপদগুলোকে ধ্বংস করে দিয়েছি, অথচ আমরা আয়াত(নিদর্শন)গুলোকে বারবার বিশদভাবে বর্ণনা করে পাঠিয়েছিলাম, যাতে তারা (হঠকারিতা থেকে) ফিরে আসে।  \n\n" +
                " ০৪৬:০২৮] কিন্তু তারা আল্লাহর পরিবর্তে নৈকট্য লাভের জন্য যাদেরকে উদ্ভাবনিশক্তি হিসেবে গ্রহণ করেছিল তারা কেন তাদের সাহায্য করল না? বরং তারা তাদের নিকট থেকে অন্তর্হিত হয়ে গেল। এ ছিল তাদের মিথ্যা কল্পনা এবং যা তারা মিথ্যা বানিয়ে নিয়েছিল তার পরিণতি ।  \n\n" +
                " ০৪৬:০২৯] এবং যখন আমরা আপনার নিকট পাহাড়ীদের একটি দলকে (আপনার প্রার্থনায় তায়েফ থেকে)ফিরিয়ে এনেছিলাম, যারা কুরআন শুনতে চেয়েছিল; অতঃপর যখন তারা এর(কুরআন আবৃত্তির মজলিসের) সামনে উপস্থিত হল তখন তারা একে অপরকে বলল,‘ \"চুপ কর;\" অতঃপর যখন এটি(কুরআন আবৃত্তি) শেষ হল তখন তারা নিজেদের জাতির নিকট (তাদের জন্য রসুল)সতর্ককারী হয়ে ফিরে গেল । \n\n" +
                " ০৪৬:০৩০] তারা বলল,‘হে আমাদের জাতি! আমরা এমন এক কিতাব শুনেছি যা মূসার পরে নাযেল করা হয়েছে, যা এর পূর্বের গ্রন্থগুলোর সত্যায়ন করছে,(মানুষকে)সত্য এবং সরল-সুদৃঢ় পথে পরিচালিত করছে,  \n\n" +
                " ০৪৬:০৩১] হে আমাদের জাতি ! তোমরা আল্লাহর আহ্বানকারীর ডাকে সাড়া দাও এবং আল্লাহর এককসত্বা মেনে নাও, ফলে তিনি(আল্লাহ) তোমাদের পাপগুলো ক্ষমা করবেন এবং তোমাদেরকে যন্ত্রণাদায়ক দুঃখ-কষ্ট থেকে রক্ষা করবেন।  \n\n" +
                " ০৪৬:০৩২] এবং যে আল্লাহর আহ্বানকারীর ডাকে সাড়া দেয় না সে পৃথিবীতে (তাঁকে) আদৌ পরাভূত করতে পারবে না, এবং তিনি ছাড়া তার জন্য কোন অভিভবাক হবে না। এরাই স্পষ্ট প্রথভ্রষ্টতার মধ্যে নিপতিত আছে।’ \n\n" +
                " ০৪৬:০৩৩] তারা কি অনুধাবন করে নাই যে, নিশ্চই আল্লাহ, যিনি বায়ুমণ্ডলগুলো এবং পৃথিবীগুলোকে সৃষ্টি করেছেন এবং সেসব সৃজনে ক্লান্ত হন নাই, তিনি কি প্রানহীন বস্তুতে প্রান সঞ্চার করতে সক্ষম নন? হ্যাঁ । নিশ্চই তিনি প্রত্যেক বিষয়ের নিখুত পরিমাপকারী-ক্ষমতাবান।  \n\n" +
                " ০৪৬:০৩৪] এবং যেদিন অস্বীকারকারীদেরকে আগুনের সামনে উপস্থিত করা হবে(এবং বলা হবে) \"এ কি বিজ্ঞান নয় ? তারা বলবে, \"হ্যাঁ ! আমাদের ক্রমবিকাশকের শপথ(এসব বিজ্ঞান)।\" তখন তিনি বলবেন, \"তোমরা যেহেতু অস্বীকার করতে এজন্য দুঃখ-কষ্টের স্বাদ গ্রহণ কর।\" \n\n" +
                " ০৪৬:০৩৫] সুতরাং আপনিও ধৈর্যধারণ করুন যেভাবে পূর্বের স্থিরপ্রতিজ্ঞ রসুলগণ ধৈর্যধারণ করেছে এবং আপনি তাদের(অস্বীকরকারীদের) জন্য শ্রীঘ্র (দুঃখ-কষ্ট কামনা) করবেন না। যেদিন তারা তা প্রত্যক্ষ করবে যার প্রতিশ্রুতি তাদেরকে দেয়া হয়েছে, তাদের অবস্থা এমন হবে যেন তারা পৃথিবীতে দিনের এক ক্ষূদ্র সময় ছাড়া অবস্থান করে নাই। একটি প্রজ্ঞাপন(জেনে রাখুন) , উশৃঙ্খল যৌনাচরণ পরায়ণ জাতি ছাড়া কাউকেও ধ্বংস করা হয় না। \n\n" +
                "</string>");
        editor.putString("45", "পরিচ্ছেদ ০৪৫.দৃশ্যঃ নতজানু(সূরা আল-জাসিয়া The Crouching) \n\n" +
                "এটি মক্কী সূরা, বিসমিল্লাহ সহ এতে ৩৮ আয়াত এবং ৪ রুকূ আছে। \n\n" +
                " ০৪৫:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৪৫:০০১] হা মীম্। \n\n" +
                " ০৪৫:০০২] ভালবাসা-কনার মহাসমূদ্র, মহাবিজ্ঞানী আল্লাহ থেকে এ গ্রন্থ অবতীর্ণ । \n\n" +
                " ০৪৫:০০৩] নিশ্চই বায়ুমণ্ডলগুলোতে ও পৃথিবীগুলোতে স্বীকারকারীদের জন্য অবশ্যই বহু আয়াত(নিদর্শন) বিদ্যমান আছে। \n\n" +
                " ০৪৫:০০৪] এভাবে তোমাদের সৃষ্টির মধ্যে এবং ইন্টার্নেট থেকে তিনি যা সম্প্রচার করেন তার মধ্যে সে জাতির জন্য বহু আয়াত(নিদর্শন) রয়েছে, যারা দৃঢ় প্রত্যয়ী। \n\n" +
                " ০৪৫:০০৫] এবং রাত্রি ও দিবসের পরিবর্তনের মধ্যে এবং মহাকাশ থেকে আল্লাহ্ যে জীবিকা অবতীর্ণ করেন যা দিয়ে তিনি পৃথিবীকে তার নির্জীবতার পর সঞ্জীবিত(nitrogen fixating ও পানি কনা ইত্যাদি দিয়ে) করেন, এর মধ্যে এবং বায়ু-প্রবাহে বুদ্ধিসম্পন্ন জাতির জন্য বহু আয়াত(নিদর্শন) আছে। \n\n" +
                " ০৪৫:০০৬] এগুলি আল্লাহর আয়াত যা আমরা যথার্থভাবে আপনার কাছে বর্ণনা করছি। অতএব তারা আল্লাহ ও তাঁর আয়াতগুলোর পরে কোন *হাদিস*(কথা) মেনে নিবে? \n\n" +
                " ০৪৫:০০৭] প্রত্যেক ঘোর মিথ্যাবাদী পাপীর জন্য সর্বনাশ- \n\n" +
                " ০৪৫:০০৮] যে আল্লাহর আয়াতগুলো, যা তার সামনে আবৃত্তি করা হয়, শ্রবণ করে অতঃপর সে অহংকার ভরে হঠকারিতা করে যেন সে তা শুনেই নাই। সুতরাং তাকে যন্ত্রণাদায়ক দুঃখ-কষ্টের সুসংবাদ দিন। \n\n" +
                " ০৪৫:০০৯] এবং যখন সে আমাদের আয়াত গুলোর মধ্য থেকে কিছু জানতে পারে তখন সে সেটিকে হাসি-বিদ্রুপের বস্ত বানিয়ে নেয়। এরাই তারা, যাদের জন্য লাঞ্ছনাজনক দুঃখ-কষ্ট নির্ধারিত আছে । \n\n" +
                " ০৪৫:০১০] তাদের সামনে রয়েছে অনুতাপস্থল; এবং তারা যাকিছূ অর্জন করছে তা তাদের কোন উপকারে লাগবে না, এবং আল্লাাহ ছাড়া যাদেরকে তারা অভিভাবক হিসেবে গ্রহন করেছে তারাও (কোন উপকারে লাগবে না)। এবং তাদের জন্য মহা-যন্ত্রণাদায়ক দুঃখ-কষ্ট আছে। \n\n" +
                " ০৪৫:০১১] এ হচ্ছে (সত্যিকার) সুপথপ্রপ্তীর নির্দেশনা। এবং যারা নিজেদের ক্রমবিকাশকের আয়াতগুলোকে অস্বীকার করেছে তাদের জন্য রয়েছে (আল্লাহর)ক্রোধ থেকে আগত যন্ত্রণাদায়ক শাস্তি। \n\n" +
                " ০৪৫:০১২] আল্লাহ তিনি যিনি সমুদ্রকে(পানি ও বায়ু-সমূদ্রকে) তোমাদের সেবায় নিয়োজিত করেছেন যেন তাঁর আদেশে তাতে নৌযান ও আকাশযানগুলো চলাচল করতে পারে এবং যেন তোমরা তাঁর অনুগ্রহ অন্বেষণ করতে পার এবং যেন তোমরা কৃতজ্ঞতা প্রকাশ করতে পার। \n\n" +
                " ০৪৫:০১৩] এবং যাকিছু বায়ুমণ্ডলগুলোতে আছে এবং যাকিছু পৃথিবীগুলোতে আছে সব কিছুই তিনি তাঁর পক্ষ থেকে তোমাদের কার্যোপযোগী করেছেন। নিশ্চই এ-তে চিন্তাশশীল লোকদের জন্য বহু আয়াত(নিদর্শন) আছে। \n\n" +
                " ০৪৫:০১৪] আপনি তাদেরকে বলুন, যারা আল্লাহর এককসত্তা মেনে নিয়েছে, তারা যেন সেসব লোককে সংশোধন করে, যারা আল্লাহর দিনগুলির কোন তোয়াক্কা করে না। যেন তিনি এ জাতিকে তার প্রতিফল দান করেন যা তারা অর্জন করে আসছে । \n\n" +
                " ০৪৫:০১৫] যে ব্যক্তি ভালকাজ করে, তার কল্যাণ তারই নিজের জন্য হবে এবং যে ব্যক্তি মন্দকাজ করে তার ক্ষতি তারই নিজের উপর বর্তাবে। অতঃপর তোমাদেরকে তোমাদের ক্রমবিকাশকের দিকে প্রত্যাবর্তিত করা হবে। \n\n" +
                " ০৪৫:০১৬] এবং নিশ্চই আমরা বনী-ইসরাঈলকে গ্রন্থগুলো, রাষ্ট্রক্ষমতা এবং নবুওয়াত দান করেছিলাম এবং তাদেরকে উপকারি-উপাদেয় বস্ত থেকে জীবিকা দান করেছিলাম এবং তাদেরকে বিশ্ববাসীর উপর শ্রেষ্ঠত্ব দান করেছিলাম। \n\n" +
                " ০৪৫:০১৭] এবং আমরা তাদেরকে উক্ত বিষয় সম্বন্ধে সুস্পষ্ট প্রামান্য তথ্য দান করেছিলাম, কিন্তু তাদের কাছে প্রত্যাশিত জ্ঞান (ঐশী গ্রন্থগুলো) আসার পরই তারা পরস্পরের মধ্যে সৈরাচারের কারনে মতভেদ করল। তারা যে বিষয়ে মতভেদ করে আসছিল নিশ্চই আপনার ক্রমবিকাশক তার সম্বন্ধে পূনরুত্থান দিবসে তাদের মধ্যে মীমাংশা করবেন। \n\n" +
                " ০৪৫:০১৮] অতঃপর আমরা আপনাকে বিভিন্ন বিষয় সম্বন্ধে এক মহান বিধানের (কুরআনের) উপর অধিষ্ঠিত করেছি; সুতরাং আপনি এর অনুসরণ করুন এবং ঐ সকল লোকের কুপ্রবৃত্তির অনুসরণ করবেন না, যাদের কোন জ্ঞান নেই। \n\n" +
                " ০৪৫:০১৯] নিশ্চই তারা আল্লাহর মোকাবেলায় আপনার কোন উপকারে লাগবে না। এবং নিশ্চই অন্যায়কারীরা একে অপরের বন্ধু, কিন্তু আল্লাহ্ সচেতনদের অভিভাবক । \n\n" +
                " ০৪৫:০২০] এটি(কুরআন) মানবজাতির জন্য জোতির্ময় দালীল-প্রমাণ এবং দৃঢ়-প্রত্যয়ী জাতির জন্য সুপথপ্রপ্তীর নির্দেশনা এবং করুণা । \n\n" +
                " ০৪৫:০২১] যারা মন্দকাজ করে তারা কি মনে করে, আমরা তাদেরকে তাদের সমতুল্য করি যারা আল্লাহর এককসত্তা মেনে নেয় এবং ভালকাজ করে, যার ফলে তাদের জীবন এবং তাদের মরণ সমান হয়ে যাবে (অমরত্ব লাভ করবে)? তারা কত মন্দ বিচার করছে! \n\n" +
                " ০৪৫:০২২] এবং আল্লাহ্ বায়ুমণ্ডলগুলো ও পৃথিবীগুলোকে বিজ্ঞানের ভিত্তিতে এবং ধনাত্মক কনা দিয়ে সৃষ্টি করেছেন যেন প্রত্যেক ব্যক্তিকে সে অনুযায়ী প্রতিফল দেয়া হয় যা সে অর্জন করে। যদিও তাদের উপর কোন অবিচার করা হবে না। \n\n" +
                " ০৪৫:০২৩] আপনি কি সে লোকের (অবস্থার) প্রতি লক্ষ্য করেছেন যে নিজের হীন প্রবৃত্তিকে ইশ্বর বানিয়ে নিয়েছে অথচ আল্লাহ্ তাকে জ্ঞানানুযায়ী পথভ্রষ্ট সাব্যস্ত করেছেন এবং তার কান ও মনে সীল-গালা (মোহরাংকিত) করে দিয়েছেন এবং তার চোখের উপর নির্বুদ্ধিতার পর্দা তুলে দিয়েছেন। সুতরাং আল্লাহর (এমন মীমাংশার) পর কে তাকে সুপথপ্রাপ্তীর নির্দেশনা দিবে? আপনারা কি তবুও উপদেশ গ্রহণ করবেন না? \n\n" +
                " ০৪৫:০২৪] এবং তারা বলে, আমাদের এ ইহকালীন জীবন ছাড়া আর কোনও জীবন নেই (এমনইভাবে) আমরা মরি এবং বাঁচি, এবং একমাত্র সময়ই আমাদেরকে ধ্বংস করে। যেহেতু এ বিষয়ে তাদের কোন জ্ঞান নেই, তারা কেবল অনুমানিক কথা বলছে। \n\n" +
                " ০৪৫:০২৫] এবং যখন তাদের সামনে আমাদের সুস্পষ্ট প্রামান্য তথ্যপূর্ণ আয়াতগুলো আবৃত্তি করা হয়, তখন তাদের শুধু এ কথা ছাড়া আর কোন যুক্তি প্রমাণ থাকে না, \"যদি তোমরা সত্যবাদী হও তাহলে আমাদের পিতৃপুরুষ দেরকে উপস্থিত কর।\" \n\n" +
                " ০৪৫:০২৬] আপনি বলুন, \"আল্লাহ্ই তোমাদেরকে জীবন দান করেন, অতঃপর তোমাদের মৃত্যু ঘটান, অতঃপর তিনি পূনরুত্থানের দিন পর্যন্ত তোমাদেরকে(বিভিন্ন পৃথিবীতে ভ্রূণরুপে) জমা করতে থাকবেন, যার মধ্যে কোন সন্দেহ নেই ;\" কিন্তু অধিকাংশ লোক এটি জানে না। \n\n" +
                " ০৪৫:০২৭] এবং বায়ুমণ্ডলগুলো ও পৃথিবীগুলোর আধিপত্য আল্লাহর এবং যেদিন পূনরুত্থান সংঘটিত হবে সেদিন মিথ্যাবাদীরা অত্যন্ত ক্ষতিগ্রস্ত হবে। \n\n" +
                " ০৪৫:০২৮] এবং আপনি প্রত্যেকটি জাতিকে নতজানু অবস্থায় দেখতে পাবেন। প্রত্যেকটি জাতিকে তার নিজ নিজ গ্রন্থের(কর্মলিপি, result sheetএর) দিকে আহবান করা হবে(এবং বলা হবে,) \"আজ তোমাদেরকে তার প্রতিফল দেওয়া হবে যা তোমরা করতে।\" \n\n" +
                " ০৪৫:০২৯] এই আমাদের গ্রন্থ(কর্মলিপি, result sheet), এটি তোমাদের বিরুদ্ধে সত্য সত্য কথা বলছে, তোমরা যা কিছু করতে আমরা নিশ্চই তা লিপিবদ্ধ করে নিতাম । \n\n" +
                " ০৪৫:০৩০] সুতরাং যারা আল্লাহকে এককসত্বা মেনে নিয়েছে এবং ভালকাজ করেছে, তাদেরক তাদের ক্রমবিকাশক তাঁর করুণার ছায়াতলে প্রবিষ্ট করবেন। এটিই সুস্পষ্ট সফলতা । \n\n" +
                " ০৪৫:০৩১] কিন্তু যারা অস্বীকার করেছে (তাদেরকে বলা হবে), \"তবে কি তোমাদের সামনে আমার আয়াতগুলো আবৃত্তি করা হত না? কিন্তু তোমরা অহংকার করতে; যেহেতু তোমরা অপরাধী জাতি ছিলে।\" \n\n" +
                " ০৪৫:০৩২] এবং যখন বলা হত, \"নিশ্চই আল্লাহর প্রতিশ্রুতি বিজ্ঞানমূলক এবং পুনরুত্থানও, এতে কোন সন্দেহ নেই,\" তখন তোমরা বলতে, \"আমরা জানি না পুনরুত্থান কী, আমরা মনে করি এটি একটি আনুমানিক বিষয় ছাড়া কিছুই নয়, আমরা এটি মানতে পারি না। \" \n\n" +
                " ০৪৫:০৩৩] এবং তারা যা কিছু করেছে তার অনিষ্ট তাদের উপর প্রকাশ হয়ে পড়বে, এবং যা নিয়ে তারা হাসি বিদ্রুপ করত তা তাদেরকে পরিবেষ্টন করে নিবে। \n\n" +
                " ০৪৫:০৩৪] এবং (তাদেরকে) বলা হবে, \"আজ আমরা তোমাদেরকে এভাবেই ভূলে যাবো যেভাবে তোমরা তোমাদের এ দিনের সাক্ষাৎকে ভুলে গিয়েছিলে এবং আগুন তোমাদের আশ্রয়স্থল হবে এবং কেউ তোমাদের সাহায্যকারী হবে না; \n\n" +
                " ০৪৫:০৩৫] এটি এই জন্য হবে যে, তোমরা আল্লাহর আয়াত(নিদর্শন)গুলোকে ঠাট্টা বিদ্রুপের বস্তু বানিয়ে নিয়েছিলে এবং ইহকালীন জীবন তোমাদেরকে প্রতারিত করেছিল। সুতরাং আজ তোমাদেরকে দুঃখ-কষ্ট থেকে বের করা হবে না এবং (আল্লাহর)নৈকট্য লাভ করার জন্য তাদের চেষ্টা ও ছাফাই গ্রহনযোগ্য হবে না।\" \n\n" +
                " ০৪৫:০৩৬] অতএব সকল ধন্যবাদ একমাত্র আল্লাহরই, যিনি বায়ুমণ্ডলগুলোর ক্রমবিকাশক এবং পৃথিবীগুলোর ক্রমবিকাশক এবং সমগ্র মহাবিশ্বের ক্রমবিকাশক। \n\n" +
                " ০৪৫:০৩৭] এবং বায়ুমণ্ডলগুলোতে এবং পৃথিবীগুলোতে সকল মহিমা একমাত্র তাঁরই এবং তিনিই ভালবাসা-কনার মহাসমূদ্র মহাবিজ্ঞানী। \n\n" +
                "");
        editor.putString("44", "পরিচ্ছেদ ০৪৪.দৃশ্যঃ গ্রীনহাউজ গ্যাস(সূরা আদ-দুখান The Greenhouse gas) \n\n" +
                "এটি মক্কী সূরা, বিসমিল্লাহ সহ এতে ৬০ আয়াত এবং ৩ রুকূ আছে। \n\n" +
                " ০৪৪:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৪৪:০০১] হা মীম্। \n\n" +
                " ০৪৪:০০২] উপস্থাপিত নিশ্চিত প্রামান্য-তথ্য সমৃদ্ধ গ্রন্থের কথা বলছি ।  \n\n" +
                " ০৪৪:০০৩] নিশ্চই আমরা এটিকে এক বৃষ্টি-ধোয়া(আশীর্বাদপূর্ণ) রাতে অবতীর্ণ কারেছি। নিশ্চই আমরা (সদা) সতর্ক করে আসছি। \n\n" +
                " ০৪৪:০০৪] এ রাতে প্রত্যেক বৈজ্ঞানিক সমস্যা সমাধানমূলক আদেশ পৃথকিকরণ করা হয় (রসূল পাঠিয়ে)- \n\n" +
                " ০৪৪:০০৫] আমাদেরই আদেশক্রমে। নিশ্চই আমরা সব সময় রসূল পাঠিয়ে থাকি, \n\n" +
                " ০৪৪:০০৬] আপনার ক্রমবিকাশকের সন্নিধান থেকে করুণাস্বরূপ। নিশ্চই তিনিই সর্বশ্রোতা, সর্বজ্ঞানী,  \n\n" +
                " ০৪৪:০০৭] যিনি বায়ুমণ্ডলগুলো এবং পৃথিবীগুলো এবং এতদুভয়ের মধ্যে যা কিছু আছে সব কিছুর ক্রমবিকাশক; যদি তোমরা দৃঢ়-প্রত্যয়ী হয়ে থাক। \n\n" +
                " ০৪৪:০০৮] কোন উদ্ভাবনীশক্তি নেই তিনি(আল্লাহ এককসত্বা) ছাড়া। তিনি জীবন দান করেন এবং মৃত্যু দেন; তিনি তোমাদের ক্রমবিকাশক এবং তোমাদের পিতাদের ও পূর্বপূরুষদেরও ক্রমবিকাশক। \n\n" +
                " ০৪৪:০০৯] তথাপি তারা সন্দেহে নিপতিত হয়ে ক্রীড়া কৌতুক করছে ।  \n\n" +
                " ০৪৪:০১০] অতএব আপনি সে দিনের অপেক্ষা করুন যেদিন বায়ুমণ্ডলোতে গ্রীনহাউজ গ্যাস (কার্বন ডাইঅক্সাইড এবং কার্বন মনোক্সাইড, সালফার ডাইঅক্সাইড এবং সালফারের অন্যান্য অক্সাইডসমূহ, নাইট্রিক অক্সাইড, ক্লোরোফ্লুওরো কার্বন ইত্যাদি) বেড়ে যাবে ,  \n\n" +
                " ০৪৪:০১১] তা মানবমন্ডলীকে (ভূ-উষ্ণতা বৃদ্ধিতে global warming)আবৃত করে ফেলবে। এটি একটি মহা যন্ত্রণাদায়ক দুঃখ-কষ্ট হবে। \n\n" +
                " ০৪৪:০১২] (তারা বলবে,) \"হে আমাদের ক্রমবিকাশক ! আমাদের উপর থেকে এ দুঃখ-কষ্ট দূর করুন; নিশ্চই আমরা আপনাকে এককসত্বা মেনে নিচ্ছি।\" \n\n" +
                " ০৪৪:০১৩] কেমন হতে পারে তাদের জন্য সেই স্মারক-বানী ! এবং অবশ্যই তাদের কাছে এক নিশ্চিত প্রামান্য তথ্যবহুল রসূল (কুরআন) এসেছে,  \n\n" +
                " ০৪৪:০১৪] অতঃপর তারা তা থেকে বিমূখ হয়ে চলে গেল, এবং বলতে লাগল, \"এটি কোনও পাগলের শেখানো !\" \n\n" +
                " ০৪৪:০১৫] নিশ্চই আমরা অল্প দুঃখ-কষ্ট অপসারণ করলেও নিশ্চই তোমাদের আনন্দোৎসব হয়। \n\n" +
                " ০৪৪:০১৬] যেদিন আমরা (তোমাদেরকে) কঠিন ধৃতকরণে ধরাশায়ী করব সেদিন নিশ্চই আমরা প্রতিশোধ গ্রহণ করবো। \n\n" +
                " ০৪৪:০১৭] এবং আমরা তাদের পূর্বে ফেরাউনের জাতিকে পরীক্ষা করেছিলাম এবং তাদের কাছে একজন সম্মানিত রসূল আগমন করেছিল, \n\n" +
                " ০৪৪:০১৮] (সে তাদেরকে বলেছিল), \"তোমরা আল্লাহর বান্দাদেরকে(বনি-ইসরাইলদেরকে) আমার কাছে সোপর্দ কর। নিশ্চই আমি তোমাদের জন্য একজন বিশ্বস্ত রসূল, \n\n" +
                " ০৪৪:০১৯] এবং যেন তোমরা আল্লাহ সম্বন্ধে অহংকার না কর। নিশ্চই আমি তোমাদের কাছে সুস্পষ্ট দলীল প্রমাণ নিয়ে এসেছি, \n\n" +
                " ০৪৪:০২০] এবং নিশ্চই আমার ও তোমাদের ক্রমবিকাশকের আশ্রয় প্রার্থনা করি যেন তোমরা আমাকে বিতাড়িত না কর, \n\n" +
                " ০৪৪:০২১] যদি তোমরা আমাকে আল্লাহর রাসুল না মান তাহলে তোমরা আমাকে একাকী ছেড়ে দাও।\" \n\n" +
                " ০৪৪:০২২] অতঃপর সে তার ক্রমবিকাশকের কাছে প্রার্থনা করল, \"নিশ্চই এরা এক অপরাধী জাতি।\" \n\n" +
                " ০৪৪:০২৩] অতএব (আল্লাহ্ বলিলেন) \"তুমি আমার বান্দাদেরকে নিয়ে রাতের বেলা চলে যাও, নিশ্চই তোমরা পশ্চাদ্ধাবিত হবে। \n\n" +
                " ০৪৪:০২৪] এবং তুমি সমুদ্রকে শান্ত অবস্থায় পিছনে ছেড়ে যাও(অর্থাৎ সমূদ্রপথে পাড়ি দাও)। তারা এমন এক সৈন্যদল(ফেরাউনের বিমানবাহিনী) যাদেরকে নিশ্চই নিমজ্জিত করা হবে।\" \n\n" +
                " ০৪৪:০২৫] তারা কত বাগান ও ঝরণা পেরিয়ে গেল, \n\n" +
                " ০৪৪:০২৬] এবং শস্যক্ষেত ও সুন্দর মনোরম আবাসস্থল,  \n\n" +
                " ০৪৪:০২৭] এবং অনুগ্রহ, যাতে তারা পরম সুখ ও আনন্দে ছিল! \n\n" +
                " ০৪৪:০২৮] এভাবেই, অতঃপর আমরা অন্য এক জাতিকে সে সবের উত্তরাধিকারী করে দিলাম। \n\n" +
                " ০৪৪:০২৯] তখন তাদের জন্য বায়ুমণ্ডলগুলো ও পৃথিবীগুলো ক্রন্দন করে নাই, এবং তাদেরকে কোন অবকাশও দেয়া হয় নাই। \n\n" +
                " ০৪৪:০৩০] এবং নিশ্চই আমরা বনী-ইসরাঈলকে এক লাঞ্ছনাজনক দুঃখ-কষ্ট থেকে উদ্ধার করেছিলাম, \n\n" +
                " ০৪৪:০৩১] ফেরাউন (এর কবল) থেকে। নিশ্চই সে সীমালংঘনকারীদের মধ্যে অত্যধিক উদ্ধত ব্যক্তি ছিল। \n\n" +
                " ০৪৪:০৩২] এবং নিশ্চই আমরা তাদেরকে জ্ঞানের ভিত্তিতে (তৎকালীন) বিশ্ববাসীর উপর মনোনীত করেছিলাম, \n\n" +
                " ০৪৪:০৩৩] এবং আমরা তাদেরকে কতিপয় নিদর্শন প্রদান করেছিলাম যাতে সুস্পষ্ট পরীক্ষা ছিল। \n\n" +
                " ০৪৪:০৩৪] নিশ্চই এরা বলে,- \n\n" +
                " ০৪৪:০৩৫] \"আমাদের জন্য কেবল প্রথম মৃত্যুই রয়েছে, এবং আমরা পুনরুত্থিত হব না।\" \n\n" +
                " ০৪৪:০৩৬] অতএব তোমরা আমাদের পূর্বপুরুষদেরকে নিয়ে এসো, যদি তোমরা সত্যবাদী হয়ে থাক।  \n\n" +
                " ০৪৪:০৩৭] তারা কি অধিকতর উত্তম, না তুব্বা জাতি এবং যারা তাদের পূর্বে ছিল? আমরা তাদের সকলকে ধ্বংস করেছিলাম কেননা তারা অপরাধ পরায়ণ ছিল। \n\n" +
                " ০৪৪:০৩৮] এবং আমরা বায়ুমণ্ডলগুলো ও পৃথিবীগুলো এবং উভয়ের মধ্যে কোন বস্তুই ক্রীড়া কৌতুক স্বরুপ সৃষ্টি করি নাই। \n\n" +
                " ০৪৪:০৩৯] আমরা উভয়কে যথাযথ উদ্দেশ্য ছাড়া সৃষ্টি করি নাই, কিন্তু তাদের অধিকাংশ্ই তা জানে না । \n\n" +
                " ০৪৪:০৪০] নিশ্চই মীমাংশার দিনটি হচ্ছে তাদের সকলের জন্য নির্ধারিত সময়।  \n\n" +
                " ০৪৪:০৪১] সেদিন কোন বন্ধু অপর বন্ধুর কোন উপকারে লাগবে না এবং তাদেরকে কোন প্রকার সাহায্যও করা হবে না \n\n" +
                " ০৪৪:০৪২] কেবল তারা ছাড়া যাদের প্রতি আল্লাহ্ দয়া করবেন; নিশ্চই তিনি ভালবাসা-কনার মহা-সমূদ্র, এককসত্তা দয়াময়। \n\n" +
                " ০৪৪:০৪৩] নিশ্চই যাক্কুম (ফণীমনসা, ক্যাক্টাস) বৃক্ষ- \n\n" +
                " ০৪৪:০৪৪] পাপীদের খাদ্য হবে, \n\n" +
                " ০৪৪:০৪৫] গলিত তামার মত; এটি পেটে ফুটতে থাকবে,  \n\n" +
                " ০৪৪:০৪৬] উত্তপ্ত পানি যেমন ফুটতে থাকে। \n\n" +
                " ০৪৪:০৪৭] (আমরা ফিরিশতাদেরকে বলব,) \"তাকে ধর এবং অনুতাপস্থলের মধ্যস্থল পর্যন্ত তাকে হেঁচড়ে নিয়ে যাও। \n\n" +
                " ০৪৪:০৪৮] অতঃপর তার মস্তকের উপর উত্তপ্ত লাভা ঢেলে কষ্ট ভোগ করাও।\" \n\n" +
                " ০৪৪:০৪৯] (আমরা তাদেরকে বলব,) \"স্বাদ গ্রহণ কর। তুমি ছিলে একজন মহা শক্তিশালী, সম্মানিত মানুষ, \n\n" +
                " ০৪৪:০৫০] নিশ্চই এটি সেই বিষয়, যার সম্বন্ধে তোমরা সন্দেহ পোষণ করতে।\" \n\n" +
                " ০৪৪:০৫১] নিশ্চই সচেতনরা থাকবে এক শান্তিপূর্ণ স্থানে, \n\n" +
                " ০৪৪:০৫২] বাগানগুলো ও ঝরণাগুলোর মাঝে, \n\n" +
                " ০৪৪:০৫৩] তারা পরিধান করবে পাতলা ও মোটা রেশমী বস্ত্র, তারা পরস্পর মুখোমুখি হয়ে থাকবে; \n\n" +
                " ০৪৪:০৫৪] এমনই হবে। এবং আয়তলোচনা পরমাসুন্দরী নারীদেরকে আমরা তাদের সঙ্গিণী করে দিব। \n\n" +
                " ০৪৪:০৫৫] নিরাপদ অবস্থায় তারা সেখানে প্রত্যেক প্রকারের ফল মূলের ফরমায়েশ দিবে। \n\n" +
                " ০৪৪:০৫৬] সেখানে তারা কেবল প্রথম মৃত্যু ছাড়া আর কোন মৃত্যুর স্বাদ গ্রহণ করবে না; এবং তিনি তাদেরকে অনুতাপের কষ্ট থেকে রক্ষা করবেন, \n\n" +
                " ০৪৪:০৫৭] আপনার ক্রমবিকাশকের পক্ষ থেকে অনুগ্রহ স্বরূপ হবে। এবং এটিই হবে পরম সফলতা। \n\n" +
                " ০৪৪:০৫৮] অবশ্যই আমরা এটিকে(কুরআনকে) আপনার ভাষার সহজ করে দিয়েছি যেন তারা উপদেশ গ্রহণ করতে পারে। \n\n" +
                " ০৪৪:০৫৯] সুতরাং আপনি প্রতীক্ষা করুন, নিশ্চই তারাও অপেক্ষমান রয়েছে।");

        editor.putString("43", "পরিচ্ছেদ ০৪৩.দৃশ্যঃ অলঙ্করণ(সূরা আয-যুখরুফ The ornamentation) \n\n" +
                "এটি মক্কী সূরা, বিসমিল্লাহ সহ এতে ৯০ আয়াত এবং ৭ রুকূ আছে। \n\n" +
                " ০৪৩:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৪৩:০০১] হা মীম্। \n\n" +
                " ০৪৩:০০২] উপস্থাপিত সুস্পষ্ট বর্ণনাকারী গ্রন্থের কথা বলছি । \n\n" +
                " ০৪৩:০০৩] নিশ্চই আমরা এটিকে কুরআন(সদা-পাঠ্য) হিসেবে প্রাঞ্জল আরবী ভাষায় অবতীর্ণ করেছি যেন আপনারা বুঝতে পারেন। \n\n" +
                " ০৪৩:০০৪] এবং নিশ্চই এটি আমাদের কাছে মূল-গ্রস্থে (উম্মুল কিতাবে) আছে যা অত্যন্ত মৌলিক (অবিমিশ্র), মহা-বিজ্ঞান। \n\n" +
                " ০৪৩:০০৫] আমরা কি উপেক্ষাপূর্বক তোমাদের থেকে এই স্মারক-বানী বর্ণনা করা প্রত্যাহার করে নিব, এজন্য যে তোমরা এক সীমালণ্ঘকারী জাতি? \n\n" +
                " ০৪৩:০০৬] এবং আমরা পূর্বতীদের মধ্যে কত নবী পাঠিয়েছিলাম ! \n\n" +
                " ০৪৩:০০৭] কিন্তু তাদের কাছে এমন কোন নবী আসে নাই, যার সাথে তারা হাসি-বিদ্রুপ করে নাই। \n\n" +
                " ০৪৩:০০৮] এবং এদের অপেক্ষা প্রবল শক্তিশালী জাতিকে আমরা ধ্বংস করে দিয়েছি, এবং (এভাবে) পূর্ববতীদের দৃষ্টান্ত অতীত হয়েছে। \n\n" +
                " ০৪৩:০০৯] এবং আপনি যদি তাদেরকে জিজ্ঞেস করেন, বায়ুমণ্ডলগুলো ও পৃথিবীগুলোকে কে সৃষ্টি করেছেন ? তখন তারা অবশ্যই বলবে, \"এগুলিকে ভালবাসা-কনার মহাসমূদ্র, সর্বজ্ঞানী আল্লাহ্ সৃষ্টি করেছেন,\" \n\n" +
                " ০৪৩:০১০] যিনি তোমাদের জন্য পৃথিবীগুলোকে বাসোপযোগী করে সৃষ্টি করেছেন, এবং এতে বহু উপায় সৃষ্টি করেছেন যেন তোমরা নির্দেশিত সঠিক পথে চলতে পার; \n\n" +
                " ০৪৩:০১১] এবং যিনি মহাকাশ থেকে(ধুমকেতু বর্ষণ করে) পরিমাণমত পানি অবতীর্ণ করেন, অতঃপর তা দিয়ে আমরা নির্জীব পৃথিবীকে সজীব করে তুলি --এভাবে তোমাদেরকে(প্রশিক্ষণ দিয়ে বিভিন্ন পৃথিবীতে) ধীরে ধীরে বের করা হবে, \n\n" +
                " ০৪৩:০১২] এবং যিনি সর্বপ্রকার জোড়া সৃষ্টি করেছেন, এবং তোমাদের জন্য যিনি নৌযান-আকাশযান-নভোযান এবং সড়কযান(গাড়ি-বাস-ট্রেন) সৃষ্টি করেছেন যেগুলোর উপর তোমরা আরোহণ করে (স্থির ভাবে)চলে থাক, \n\n" +
                " ০৪৩:০১৩] যেন তোমরা সেগুলোর আসনে *স্থিরভাবে* বসে থাকতে পার, অতঃপর তোমরা যখন সেগুলোর উপর স্থিরভাবে বসে থাক , তখন যেন তোমরা তোমাদের ক্রমবিকাশকের অনুগ্রহকে স্মরণ কর এবং বল, তিনি নিয়মশীল, যিনি এসব আমাদের সেবায় নিয়োজিত করেছেন, অথচ আমরা এসব আবিস্কার করতে সক্ষম ছিলাম না, \n\n" +
                " ০৪৩:০১৪] এবং নিশ্চই আমরাও আমাদের ক্রমবিকাশকের দিকে(মহাকাশে) কেন্দ্রীভূত হবো । \n\n" +
                " ০৪৩:০১৫] কিন্তু তারা আল্লাহর জন্য তাঁরই বান্দাদের মধ্য থেকে একাংশকে(পীর-পূরোহিত-যাযক-হুজুর) ইশ্বর নির্ধারিত করেছে। নিশ্চই মানবজাতি স্পষ্টই অস্বীকারকারী । \n\n" +
                " ০৪৩:০১৬] তিনি কি তাঁর সৃষ্টি থেকে নিজে মেয়েরুপ গ্রহণ করেছেন এবং তোমাদেরকে বৈশিষ্টা দান করেছিন ছেলেরুপ দিয়ে ? \n\n" +
                " ০৪৩:০১৭] অথচ যখন তাদের কাউকে মেয়েশিশু জন্মের সুসংবাদ দেয়া হয়, যাকে সে রহমান আল্লাহর জন্য উপমা(আল্লাহ নারী) বর্ণনা করে থাকে, তখন তার মুখ কালো হয়ে যায়, এবং চাপা ক্রোধে সে ক্ষুব্ধ হয়ে পড়ে। \n\n" +
                " ০৪৩:০১৮] তবে কি যে (নারীরা) অলংকারে-পোশাকে লালিত পালিত হয় এবং উচ্চকণ্ঠে ঝগড়ার মধ্যে স্পষ্টভাবে (নিজের) মানোভাবও প্রকাশ করতে পারে না?(তারা আল্লাহকে নারী বলে এটাই প্রমান করতে চায়?) \n\n" +
                " ০৪৩:০১৯] এবং তারা ফিরিশতাদেরকে, যারা রহমান আল্লাহর বান্দা, নারী(দেবী)রুপে অভিহিত করেছে। তারা কি তাদের সৃষ্টির সময়ে উপস্থিত ছিল? তাহলে তাদের সাক্ষ্য নিশ্চই লিপিবদ্ধ করা হবে এবং তাদেরকে এ সম্বন্ধে জিজ্ঞাসাবাদ করা হবে। \n\n" +
                " ০৪৩:০২০] এবং তারা বলে, \"যদি রহমান আল্লাহ্ ইচ্ছা করতেন তাহলে আমরা তাদের উপাশনা করতাম না।\" এ সম্বন্ধে তাদের কোন জ্ঞান নেই। তারা কেবল অনুমান করে অবান্তর কথা বলছে। \n\n" +
                " ০৪৩:০২১] আমরা কি এর আগে তাদেরকে এমন কোন গ্রন্থ দিয়েছিলাম, যাকে তারা দৃঢ়ভাবে ধরে রেখেছে? \n\n" +
                " ০৪৩:০২২] না, বরং তারা বলছে, আমরা আমাদের পিতৃপুরুষদেরকে যা করতে দেখেছি আমরা তাদেরই পাদাংক অনুসরণে পরিচালিত হচ্ছি। \n\n" +
                " ০৪৩:০২৩] এবং এভাবে (হে নবী!) আমরা আপনার আগে এমন কোন জনপদে কোন সতর্ককারী পাঠাই নাই যার বিত্তশালী লোকেরা একথা বলে নাই, \"নিশ্চই আমরা আমাদের পিতৃপুরুষদেরকে যা করতে দেখেছি আমরা তারই অনুসরণ করে যাচ্ছি।\" \n\n" +
                " ০৪৩:০২৪] সে (তাদের রসূল) বলল, \"যা করতে তোমরা তোমাদের পিতৃপুরুষদেরকে দেখেছ, যদি আমি তার চাইতেও উৎকৃষ্টতর সুপথের নির্দেশনা তোমাদের জন্য নিয়ে আসি তবুও কি (তোমরা তাদের পদাংক অনুসরণ করবে)?\" তারা বলল, \"যে শিক্ষাসহ তোমরা প্রেরিত হয়েছ, আমরা অবশ্যই তাকে অস্বীকার করছি।\" \n\n" +
                " ০৪৩:০২৫] অতএব আমরা তাদের থেকে প্রতিশোধ গ্রহণ করলাম। সুতরাং দেখুন (নবীর প্রতি) মিথ্যরোপকারীদের পরিণাম কেমন হয়েছিল! \n\n" +
                " ০৪৩:০২৬] এবং যখন ইব্রাহীম তার পিতা এবং তার জাতিকে বলেছিল, \"নিশ্চই আমি তা থেকে মুক্ত যাদের উপাশনা তোমরা করছ , \n\n" +
                " ০৪৩:০২৭] কেবল তিনি ছাড়া যিনি আমাকে সৃষ্টি করেছেন। অতএব তিনিই আমাকে সুপথপ্রাপ্তির নির্দেশনা দান করবেন।\" \n\n" +
                " ০৪৩:০২৮] এবং সে(ইব্রাহীম) তার পরবর্তী প্রজন্মের মধ্যে এ স্থায়ী শিক্ষাকে প্রবর্তন করল, যেন তারা (আল্লাহর দিকে) প্রত্যাবর্তন করে। \n\n" +
                " ০৪৩:০২৯] না, বরং আমি এদেরকে এবং এদের পূর্বপুরুষদেরকে ক্রমাগত ইহকালীন ধন-সম্ভার দান করে আসছি যতক্ষণ পর্যন্ত না তাদের কাছে বিজ্ঞান এবং সুস্পষ্ট বর্ণনাকারী রসূল(কুরআন) আগমন করল। \n\n" +
                " ০৪৩:০৩০] এবং যখন তাদের কাছে বিজ্ঞান আসলো, তখন তারা বলল, \"এ-তো যাদু এবং আমরা এসব অস্বীকার করছি।\" \n\n" +
                " ০৪৩:০৩১] এবং তারা এও বলল, \"এই কুরআন দুটি নগরীর মধ্য থেকে কোনও মহান ব্যক্তির উপর কেন অবতীর্ণ হল না ?\" \n\n" +
                " ০৪৩:০৩২] তারা কি আপনার ক্রমবিকাশকের রহমতকে বন্টন করছে ? আমরাই তাদের মধ্যে এ ইহকালীন জীবনে তাদের জীবিকা বন্টন করি; এবং তাদের কাউকে কারুর উপর পদমর্যাদায় উন্নীত ও সম্মানিত করি যাতে তাদের মধ্য কেউ কেউ তাদের কাউকে কাউকে অধীনস্থ করতে পারে । এবং তারা যে সম্পদ জমা করে তা অপেক্ষা আপনার ক্রমবিকাশকের রহমত উত্তম। \n\n" +
                " ০৪৩:০৩৩] এবং যদি এমন না হত, সমগ্র মানবমন্ডলী একই সম্প্রদায়ভূক্ত হয়ে পড়বে তাহলে আমরা রহমান আল্লাহর এককসত্বা অস্বীকারকারীদের জন্য তাদের ঘরবাড়ির ছাদ এবং সিড়িগুলো, যার উপর দিয়ে তারা আরোহণ করে, রুপা দিয়ে মুড়ে দিতাম, \n\n" +
                " ০৪৩:০৩৪] এবং তাদের ঘরবাড়ির দরজাগুলো এবং পালস্ক গুলোকেও(রুপা দিয়ে মুড়ে দিতাম), যার উপর তারা হেলান দিয়ে বসে \n\n" +
                " ০৪৩:০৩৫] এমনকি স্বর্ণ দিয়ে মুড়ে দিতাম। কিন্তু এসব কেবল ইহকালীন-জীবনের সম্পদ। আসলে আপনার ক্রমবিকাশকের কাছে সচেতনদের জন্য রয়েছে পরকালীন-জীবন(এর সুখ-শান্তি)। \n\n" +
                " ০৪৩:০৩৬] এবং যে ব্যক্তি রহমান আল্লাহর স্মরণ থেকে বিমুখ হয়ে যায়, আমরা শয়তানকে (নিজ স্বাধীন ইচ্ছাকে) তার উপর নিযুক্ত করে দিই, অতঃপর সে তার অবিচ্ছেদ্য (সার্বক্ষণিক) সঙ্গী হয়ে যায়। \n\n" +
                " ০৪৩:০৩৭] এবং নিশ্চই তারা (বিকৃত বিবেক-বুদ্ধি) তাদেরকে সৎপথ থেকে নিবৃত্ত রাখে, তবুও তারা মনে করে, তারা সৎপথে চলছে; \n\n" +
                " ০৪৩:০৩৮] এমন কি, যখন সে আমাদের কাছে উপস্থিত হয় তখন সে বলে, \"হায় ! (হে আমার বিকৃত বিবেক-বুদ্ধি) আমার মধ্যে এবং তোমার মধ্যে যদি পূর্ব ও পশ্চিমের দূরত্ব থাকত !\" সে কত মন্দ সঙ্গী ! \n\n" +
                " ০৪৩:০৩৯] এবং (তাদেরকে বলা হবে,) \"কষ্টভোগে তোমাদের সকলের অংশগ্রহন আজ তোমাদের আদৌ উপকার করবে না, যেহেতু তোমরা অন্যায় করেছ।\" \n\n" +
                " ০৪৩:০৪০] এমতাবস্থায় আপনি কি বধিরদেরকে শুনাতে পারবেন, অথবা অন্ধদেরকে পথ দেখাতে পারবেন, এবং তাকেও (পথ দেখাতে পারবেন) যে প্রকাশ্য ভ্রান্তিতে নিপতিত আছে? \n\n" +
                " ০৪৩:০৪১] অনন্তর যদি আমরা আপনাকে(পৃথিবী থেকে) উঠিয়ে নেই তবুও আমরা তাদের থেকে নিশ্চই প্রতিশোধ গ্রহণ করব; \n\n" +
                " ০৪৩:০৪২] অথবা আমরা আপনাকে সে বিষয় অবশ্যই দেখাব যার প্রতিশ্রুতি আমরা তাদেরকে দিয়েছি, এবং নিশ্চই আমরা তাদের উপর ক্ষমতাবান। \n\n" +
                " ০৪৩:০৪৩] সুতরাং যা অপনার প্রতি প্রত্যাদেশ করা হয়েছে আপনি তা(কুরআন) সুদৃঢ়ভাবে ধারণ করুন, নিশ্চিই আপনি ঊর্ধ্বগামী-সরল পথে আছেন। \n\n" +
                " ০৪৩:০৪৪] এবং নিশ্চই এটি(কুরআন) আপনার জন্য এবং আপনার জাতির জন্য সম্মান ও গৌরবের বিষয়; এবং নিশ্চই আপনারা (আপনাদের কৃতকাজ সম্বন্ধে) জিজ্ঞাসিত হবেন। \n\n" +
                " ০৪৩:০৪৫] এবং আপনার পূর্বে আমরা আমাদের যে সব রসূল পাঠিয়েছি আপনি তাদেরকে জিজ্ঞেস করুন, আমরা কি করুণাময়(আল্লাহ)এর বদলে কল্পিত পৃথকসত্তাদের বসিয়েছিলাম, যাদের উপাশণা করা হত? \n\n" +
                " ০৪৩:০৪৬] এবং আমরা মূসাকে আমাদের নিদর্শনসহ ফেরাউন ও তার পরিষদদের কাছে পাঠিয়েছিলাম; অতএব সে বলল, নিশ্চই \n\n" +
                "আমি সকল জগতের ক্রমবিকাশকের প্রেরিত একজন রসূল। \n\n" +
                " ০৪৩:০৪৭] অতঃপর যখন সে আমাদের নিদর্শনসহ তাদের কাছে আসলো, তখন তারা এগুলির প্রতি হাসি-বিদ্রুপ করতে লাগল। \n\n" +
                " ০৪৩:০৪৮] এবং আমরা তাদেরকে এমন কোন নিদর্শন দেখাই নাই যা তার পূর্ববর্তী নিদর্শন থেকে বড় ছিল না, এবং আমরা তাদেরকে দুঃখ-কষ্টের অন্তর্ভূক্ত করেছিলাম যেন তারা (আমাদের দিকে) প্রত্যাবর্তন করে। \n\n" +
                " ০৪৩:০৪৯] এতদসত্বেও তারা (প্রত্যেক বারই)বলল, \"হে যাদুকর ! তুমি তোমার ক্রমবিকাশকের কাছে আমাদের জন্য সেসব বিষয় সম্বন্ধে(দুঃখ-কষ্ট দূর করার জন্য) প্রার্থনা কর, যার অঙ্গীকার তিনি তোমার সঙ্গে করেছেন (যদি দুঃখ-কষ্ট দূর হয়ে যায় তাহলে) নিশ্চই আমরা সুপথপ্রাপ্তীর নির্দেশনা \n\n" +
                "গ্রহণ করব।\" \n\n" +
                " ০৪৩:০৫০] অতঃপর যখনই আমরা তাদের উপর থেকে দুঃখ-কষ্ট অপসারিত করতাম, তখনই তারা অঙ্গীকার ভংগ করতো। \n\n" +
                " ০৪৩:০৫১] এবং ফেরাউন তার জাতির মধ্যে ঘোষণা করল, \"হে আমার জাতি ! মিশর দেশ কি আমার অধিকারভুক্ত নয় এবং এসব নদী কি আমার অধীনে প্রবাহিত হচ্ছে না? তথাপি তোমরা কি দেখছ না? \n\n" +
                " ০৪৩:০৫২] না, বরঞ্চ আমি এ ব্যক্তি অপেক্ষা শ্রেষ্ঠ যে অতি হীন, এবং স্পষ্টভাবে কথাও বলতে পারে না। \n\n" +
                " ০৪৩:০৫৩] অতএব কেন তার উপর স্বর্ণের কঙ্কণ অবতীর্ণ করা হয় নাই, অথবা কেন তার সাথে ফেরেস্তারা সারিবদ্ধ হয়ে আসে নাই?\" \n\n" +
                " ০৪৩:০৫৪] এভাবে সে তার জাতিকে হালকা(বুদ্ধিহারা) করে ফেলল, ফলে তারা তার আনুগত্য স্বীকার করে নিল। নিশ্চই তারা দুস্কার্যকারী জাতি ছিল। \n\n" +
                " ০৪৩:০৫৫] সুতরাং যখন তারা আমাদেরকে রাগান্বিত করল, তখন আমরা তাদের থেকে প্রতিশোধ গ্রহণ করলাম, এবং তাদের সকল(বিমানসেনা)কে জলমগ্ল করলাম। \n\n" +
                " ০৪৩:০৫৬] এবং আমরা তাদেরকে অতীতের কাহিনীতে পরিণত করলাম এবং পরবর্তীদের জন্য (ফেরাউনদের প্রযূক্তির চেয়ে মুসার উন্নত প্রযূক্তিককে)একটি শিক্ষামূলক দৃষ্টান্ত করে দিলাম। \n\n" +
                " ০৪৩:০৫৭] এবং যখনই উপমা হিসেবে মরিয়ম-পুত্রের উল্লেখ করা হয়, তখনই আপনার জাতি এতে অট্টহাসিতে ফেটে পড়ে। \n\n" +
                " ০৪৩:০৫৮] এবং তারা বলে, \"আমাদের ইশ্বররা শ্রেষ্ঠ, না সে?\" এবং তারা কেবল বাক বিতণ্ডা স্বরূপই আপনাকে একথা বলে। বরং তারা বড়ই ঝগড়াটে জাতি। \n\n" +
                " ০৪৩:০৫৯] সে(আমাদের) কেবল এক বান্দা ছিল, যাকে আমরা পুরস্কার(উন্নত প্রযূক্তি) দান করেছিলাম এবং তাকে বনী ইসরাঈলের জন্য দৃষ্টান্ত \n\n" +
                "করেছিলাম। \n\n" +
                " ০৪৩:০৬০] এবং আমরা চাইলে অবশ্যই আপনাদের মধ্য থেকে কতককে ফিরিশতা করে দিতাম যারা পৃথিবীতে (আপনাদের) স্থলাভিযিক্ত হত। \n\n" +
                " ০৪৩:০৬১] এবং সে(ইসা) নিশ্চই নির্ধারিত সময়ের জন্য একটি নিদর্শন; সুতরাং তার সম্বন্ধে তোমরা সন্দেহ কোরও না এবং আমার অনুসরণ কর। এ-ই হল ঊর্ধগামী-সরল পথ। \n\n" +
                " ০৪৩:০৬২] এবং শয়তান(বিকৃত বিবেক-বুদ্ধি) যেন তোমাদেরকে (সঠিক পথ থেকে) নিবৃত্ত করে না রাখে । নিশ্চই এটি(বিকৃত বিবেক-বুদ্ধি) তোমাদের প্রকাশ্য শত্রু। \n\n" +
                " ০৪৩:০৬৩] এবং ঈসা যখন উজ্জল সাক্ষপ্রমান সহ আগমন করল, তখন সে বলল, \"আমি তোমাদের কাছে (উন্নত)প্রযূক্তি নিয়ে এসেছি, এবং যেন আমি তোমাদেরকে এমন কতক বিষয় খুলে খুলে বর্ণনা করি যার সম্বদ্ধে তোমরা মতভেদ করছ। অতএব তোমরা আল্লাহর সচেতনতা অবলম্বন কর এবং আমার অনুগত্য কর। \n\n" +
                " ০৪৩:০৬৪] নিশ্চই আল্লাহ্ আমারও ক্রমবিকাশক এবং তোমাদেরও ক্রমবিকাশক, সুতরাং তাঁরই সেবা-কর্ম কর। এটিই ঊর্ধ্বগামী-সরল পথ। \n\n" +
                " ০৪৩:০৬৫] কিন্তু বিভিন্ন দল তাদের পরস্পরের মধ্যে মতভেদ করতে লাগল; সুতরাং যারা অন্যায় করেছে তাদের জন্য রয়েছে এক যন্ত্রণাদায়ক সময়ের দুর্ভোগ ! \n\n" +
                " ০৪৩:০৬৬] তারা কেবল নির্ধারিত সময়ের অপেক্ষা করছে যেন তা অকস্মাৎ তাদের উপর আপতিত হয়, যেন তারা এটি অনুভবও করতে না পারে। \n\n" +
                " ০৪৩:০৬৭] সেদিন একমাত্র সচেতনরা ছাড়া অন্য বন্ধুরা একে অপরের শত্রু হবে; \n\n" +
                " ০৪৩:০৬৮] (আল্লাহ্ বলবেন) \"হে আমার বান্দারা ! আজ তোমাদের কোন ভয় নেই এবং তোমরা দুঃখিতও হবে না; \n\n" +
                " ০৪৩:০৬৯] যারা আমাদের আয়াতগুলো মেনে নিয়েছ, এবং নিজেকে সমপর্ণ করেছ, \n\n" +
                " ০৪৩:০৭০] তোমরা এবং তোমাদের স্ত্রীরা সম্মনিত ও আনন্দিত অবস্থায় জান্নাতে প্রবেশ কর।\" \n\n" +
                " ০৪৩:০৭১] তাদের সামনে স্বর্ণের জগ ও গ্লাসগুলো বারবার পরিবেশিত হবে এবং সেখানে তাদের মন যা চাইবে এবং যাতে চোখ তৃপ্তি লাভ করবে তা-ই তাদের জন্য মওজুদ থাকবে। এবং (বলা হবে) তোমরা এর মধ্যে চিরকাল থাকবে। \n\n" +
                " ০৪৩:০৭২] এবং এ-ই সেই জান্নাত, তোমাদেরকে যার উত্তরাধিকারী করা হয়েছে সে কাজের বিনিময়ে যা তোমরা করতে। \n\n" +
                " ০৪৩:০৭৩] তোমাদের জন্য এর মধ্যে প্রচুর ফল মূল রয়েছে যা থেকে তোমরা খাবে। \n\n" +
                " ০৪৩:০৭৪] নিশ্চই অপরাধীরা অনুতাপস্থলে দীর্ঘকাল ধরে পড়ে থাকবে। \n\n" +
                " ০৪৩:০৭৫] তাদের উপর থেকে কষ্ট লাঘব করা হবে না, এবং তার মধ্যে তারা নিরাশ হয়ে যাবে; \n\n" +
                " ০৪৩:০৭৬] বস্তুতঃ আমরা তাদের প্রতি কোন অন্যায় করি নাই, বরং তারা নিজেরাই অন্যায়কারী ছিল। \n\n" +
                " ০৪৩:০৭৭] এবং তারা চিৎকার করে ডাকবে, \"হে দায়িত্বের মালিক ! তোমার ক্রমবিকাশক যেন আমাদেরকে শেষ করে দেন।\" সে বলবে,, \"তোমরা দীর্ঘকাল(এখানেই) অবস্থান করবে।\" \n\n" +
                " ০৪৩:০৭৮] (আল্লাহ্ বলবেন) \"আমরা অবশ্যই তোমাদের কাছে বিজ্ঞান নিয়ে এসেছিলাম কিন্তু তোমাদের অধিকাংশই বিজ্ঞানকে \n\n" +
                "ঘৃণা করতে।\" \n\n" +
                " ০৪৩:০৭৯] তারা কি (আপনার বিরুদ্ধে) কোন বিষয়ে দৃঢ়সংকল্প করে নিয়েছে? তাহলে আমরাও (তাদেরকে ধ্বংস করার) দৃঢ় সংকল্প করে নিয়েছি। \n\n" +
                " ০৪৩:০৮০] তারা কি মনে করে যে, আমরা তাদের গুপ্ত বিষয়াবলী এবং তাদের গুপ্ত পরামর্শগুলি শুনতে পাই না? এমন নয়, বরং আমাদের প্রেরিতরা (ফিরিশতারা) তাদের পাশে বসে লিখছে। \n\n" +
                " ০৪৩:০৮১] আপনি বলুন, \"যদি রহমান আল্লাহর কোন পুত্র থাকত তাহলে নিশ্চই ইবাদতকারীদের মধ্যে আমি সর্বপ্রথম হতাম।\" \n\n" +
                " ০৪৩:০৮২] নিয়মশীল আল্লাহ, বায়ুমণ্ডলগুলো ও পৃথিবীগুলোর ক্রমবিকাশক, \"সৃষ্টির ভিত্তি\"(আরশ)এর ক্রমবিকাশক, সকল বর্ণনারও উর্ধে। \n\n" +
                " ০৪৩:০৮৩] অতএব আপনি তাদেরকে বৃথা বাক বিতন্ডা এবং ক্রীড়া কৌতুক করতে ছেড়ে দিন যতক্ষণ পর্যন্ত না তারা তাদের সেদিনকে প্রত্যক্ষ করে যার প্রতিশ্রুতি তাদেরকে দেয়া হয়েছে। \n\n" +
                " ০৪৩:০৮৪] এবং তিনিই বায়ুমণ্ডলগুলোতেও উদ্ভাবনীশক্তি এবং পৃথিবীগুলোতেও উদ্ভাবনীশক্তি, যেহেতু তিনি মহাবিজ্ঞানী, সর্বজ্ঞানী। \n\n" +
                " ০৪৩:০৮৫] এবং সকল পানি-কনার অধিকারী আল্লাহ যাঁর জন্য বায়ুমণ্ডলগুলো ও পৃথিবীগুলো এবং এতদুভয়ের মধ্যে যা কিছু আছে সবকিছুর আধিপত্য; এবং \"স্থিরসময়\"এর জ্ঞান একমাত্র তাঁরই মধ্যে; এবং তাঁরই দিকে তোমাদেরকে প্রত্যাবর্তিত করা হবে। \n\n" +
                " ০৪৩:০৮৬] এবং তারা আল্লাহ্ ছাড়া যাদেরকে ডেকে থাকে তারা মধ্যস্থতা(সাফায়াত) করার কোন ক্ষমতা রাখে না; কেবল সে(সাক্ষি ফেরেস্তা) ছাড়া যে সত্য সম্বন্ধে সাক্ষ্য দান করে এবং তারা এটি ভালভাবে জানে। \n\n" +
                " ০৪৩:০৮৭] এবং যদি আপনি তাদেরকে জিজ্ঞেস করেন কে তাদেরকে সৃষ্টি করেছে ? তারা নিশ্চই বলবে, \"আল্লাহ্।\" তাহলে তারা কোন দিকে প্রত্যাবর্তিত হচ্ছে? \n\n" +
                " ০৪৩:০৮৮] তাঁর(এই রসূলের) এ উক্তির কথা বলছি, যখন সে বলেছিল, \"হে আমার ক্রমবিকাশক ! এরা এমন এক জাতি যারা আল্লাহর এককসত্বা মেনে নিচ্ছে না।\" \n\n" +
                " ০৪৩:০৮৯] (উত্তরে বললাম) \"সুতরাং আপনি তাদেরকে ছেড়ে আসুন এবং বলুন শান্তি হোক(সালাম) অতঃপর অচিরেই তারা জানতে পারবে।\" \n\n");

        editor.putString("42", "পরিচ্ছেদ ০৪২.দৃশ্যঃ সংসদ অধিবেশন(সূরা আশ-শূরা The legislative assembly) \n\n" +
                "এটি মক্কী সূরা, বিসমিল্লাহ সহ এতে ৫৪ আয়াত এবং ৫ রুকূ আছে। \n\n" +
                " ০৪২:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n" +
                " ০৪২:০০১] হা মীম্। \n\n" +
                " ০৪২:০০২] আইন সীন কাফ। \n\n" +
                " ০৪২:০০৩] ভালবাসা-কনার মহাসমূদ্র, সর্বজ্ঞানী আল্লাহ্ এভাবে আপনার প্রতি প্রত্যাদেশ অবতীর্ণ করছেন যেভাবে তিনি আপনার পূর্ববতীদের প্রতি (প্রত্যাদেশ অবতীর্ণ) করেছিলেন।  \n\n" +
                " ০৪২:০০৪] যাকিছু বায়ুমণ্ডলগুলোতে আছে এবং যাহা কিছু পৃথিবীগুলোতে আছে, সবকিছু তাঁরই ; এবং তিনি অতীব মৌলিক(কনা), অতীব বিস্তীর্ণ । \n\n" +
                " ০৪২:০০৫] বায়ুমণ্ডলগুলো তাদের উপর থেকে কেন্দ্রাভিক গতি(centripetal force)এর কারনে পৃথিবীতে পড়ে যাওয়ার উপক্রম হয়, এবং ফিরিশতারা কেন্দ্রাতিক গতি(centrifugal force) দিয়ে তা ধরে রাখার ব্যাবস্থা করে তাদের ক্রমবিকাশকের দেয়া দায়িত্ব প্রশংসাসহ পালন করছে। এবং পৃথিবীতে যারা আছে তাদের জন্য (যেন তারা ছিটকে না পড়ে যায় সেসব) অসুবিধা লাঘব করার ব্যাবস্থা করছে। শুনুন ! নিশ্চই আল্লাহ্ই (অসুবিধা)লাঘবকারী, এককসত্তা দয়াময়। \n\n" +
                " ০৪২:০০৬] এবং যারা তাঁরস্থলে অন্য কাউকে অভিভাবক (পীর-পূরোহিত-যাযক-হুজুর) হিসেবে গ্রহণ করেছে; আল্লাহ্ তাদের উপর (তাদের কার্যকলাপের) সংরক্ষণকারী, এবং আপনি তাদের প্রতিনিধি নন। \n\n" +
                " ০৪২:০০৭] এবং এভাবে আমরা আপনার প্রতি আরবী ভাষার কুরআন প্রত্যাদেশ করেছি যেন আপনি জনপদ জননী (মক্কা) এবং এর চারদিকের লোকদেরকে সতর্ক করেন এবং সমাবেত(পূনরুত্থান) হওয়ার দিন সম্বন্ধেও সতর্ক করে দেন, যার (আগমন) সম্বন্ধে কোন সন্দেহ নেই; সেদিন এক দল (যাবে) জান্নাতে এবং একদল প্রচণ্ড অনুতাপের তেজষ্কৃয় আগুনে। \n\n" +
                " ০৪২:০০৮] এবং যদি আল্লাহ্ চাইতেন তাহলে তিনি অবশ্যই তাদের সকলকে এক উম্মতভুক্ত করে দিতেন, কিন্তু তিনি যাকে চান তাকে নিজ রহমতে প্রবিষ্ট করেন। যেহেতু অন্যায়কারীরা এমনই যে তাদের কোন অভিভাবকও নেই এবং কোন সাহায্যকারীও নেই। \n\n" +
                " ০৪২:০০৯] তারা কি তাঁরস্থলে অন্য কাউকে অভিভাবক রুপে গ্রহণ করেছে? অতএব (জেনে রাখুন) আল্লাহ্ তিনিই, যিনি একমাত্র অভিভাবক। তিনি মৃতকে জীবিত করেন, এবং তিনিই সকল বিষয়ের পরিমিত পরিমাপ নিরুপনে সক্ষম। \n\n" +
                " ০৪২:০১০] এবং তোমরা যে কোন বিষয়েই মতভেদ কর, তার শেষ মীমাংশা আল্লাহর কাছে। (আপনি বলুন) \"ইনি হচ্ছেন আল্লাহ্ আমার ক্রমবিকাশক, তাঁরই উপর আমি নির্ভর করি এবং তাঁরই দিকে আমি পুনঃ পুনঃ প্রত্যাবর্তন করি। \n\n" +
                " ০৪২:০১১] তিনিই বায়ুমণ্ডলগুলোর ও পৃথিবীগুলোর সৃষ্টিকর্তা। তিনি তোমাদের প্রানশীল-দেহ সৃষ্টি করেছেন বিপরিত লিঙ্গের জোড়ায়(xx) জোড়ায়(xy) এবং সৃষ্টি করেছেন এবং চতুস্পদ জন্তুর মধ্য থেকেও বিপরিত লিঙ্গের জোড়ায়(xx) জোড়ায়(xy)। এবং তিনি এগুলোর মধ্যে তোমাদেরকে বহুগুনে বৃদ্ধি করেন। কোন কিছুই তাঁর সদৃশ নয়; তিনি সর্বশ্রোতা, সর্বদ্রষ্টা।\" \n\n" +
                " ০৪২:০১২] বায়ুমণ্ডলগুলোর ও পৃথিবীগুলোর চাবী(পরিচালনা পদ্ধতি) তাঁরই কাছে। তিনি যার জন্য চান জীবিকা সম্প্রসারিত করেন এবং নিরুপিত পরিমান নির্ধারণ করেন। নিশ্চয়ই তিনি সকল বিষয়ে সর্বজ্ঞানী । \n\n" +
                " ০৪২:০১৩] তিনি আপনাদের জন্য বিধিবদ্ধ করেছেন সে জীবন-বিধান যার তত্ত্বাবধায়ক আদেশ দিয়েছিলেন তিনি নূহকে, এবং যা আমরা আপনার প্রতি ওহী করলাম এবং আমরা ইব্রাহীম এবং মূসা এবং ঈসাকে এর তত্ত্বাবধায়ক আদেশ দিয়েছিলাম, আপনারা এই জীবন-বিধানকে (পৃথিবীগুলোতে) সুপ্রতিষ্ঠিত করুন এবং এটিকে কখনও খণ্ডে খণ্ডে বিভক্ত করবেন না। কল্পিত পৃথকসত্তাবাদিদের উপর এটি অনেক কঠিন, যার প্রতি আপনি তাদেরকে আহবান করছেন। আল্লাহ্ যাকে চান নিজের জন্য মনোনীত করেন, এবং তিনি তাকে নিজের দিকে সুপথপ্রাপ্তীর নির্দেশনা দেন যে তাঁর দিকে *ফজর ও ইশায় ঝুঁকে*। \n\n" +
                " ০৪২:০১৪] কিন্তু তাদের(উম্মতের) কাছে পূর্ণ জ্ঞান সমাগত হওয়ার পরেই তারা নিজেদের মধ্যে নোংরামীর কারনে মতভেদ করে বিভক্ত হল। এবং যদি আপনার ক্রমবিকাশকের পক্ষ থেকে প্রলম্বিত গুনাঙ্কে(নির্দিষ্ট মেয়াদ) উচিৎ শিক্ষা দেয়ার কথা না থাকত, তাহলে তাদের মধ্যে চুড়ান্ত নিষ্পত্তি করে দেয়া হত। এবং তাদের পরে যাদেরকে কিতাবের উত্তরাধিকারী করা হয়েছিল তারা নিশ্চই এর সম্বন্ধে এক অস্বস্তিকর সন্দেহে নিপতিত আছে। \n\n" +
                " ০৪২:০১৫] অতএব আপনি (এ জীবন-বিধানের প্রতি) লোকদেরকে আহবান করুন। এবং যেভাবে আপনাকে আদেশ দেয়া হয়েছে সেভাবে আপনি (এই জীবন-বিধানের উপর) দৃঢ় প্রতিষ্ঠিত থাকুন; এবং আপনি তাদের প্রবৃত্তির অনুসরণ করবেন না; এবং বলুন আল্লাহ্ কিতাব থেকে যা কিছু অবতীর্ণ করেছেন তা আমি মেনে নিয়েছি, এবং তোমাদের মধ্যে সুবিচার করার জন্য আমি আদিষ্ট হয়েছি ; আল্লাহ্ আমাদেরও ক্রমবিকাশক এবং তোমাদেরও ক্রমবিকাশক। আমাদের জন্য আামাদের কর্ম এবং তোমাদের জন্য তোমাদের কর্ম। আমাদের মধ্যে এবং তোমাদের মধ্যে কোন বিবাদ বিসম্বাদ নেই। আল্লাহ্ই আমাদের সকলকে একত্রিত করবেন, এবং তাঁরই কাছে (আমাদের) প্রত্যাবর্তন। \n\n" +
                " ০৪২:০১৬] এবং যারা আল্লাহ্ সম্বন্ধে তাঁর আহবান গৃহীত হওয়ার পর হঠকারিতা করে তর্ক বির্তক করে তাদের যূক্তি তর্ক তাদের ক্রমবিকাশকের সমীপে পন্ড হয়ে যাবে। এবং তাদের উপর (তাঁর) ক্রোধ (বর্ষিত হবে) এবং তাদের জন্য রয়েছে কঠোর দুঃখ-কষ্ট । \n\n" +
                " ০৪২:০১৭] আল্লাহ্, যিনি বিজ্ঞানসহ গ্রন্থ এবং মধ্যাকর্ষন অবতীর্ণ করেছেন ; এবং কিসে আপনাকে অবগত করবে যে, \"স্থিরসময়\" সম্তবতঃ সন্নিকটবর্তী-- \n\n" +
                " ০৪২:০১৮] তারাই সেটিকে সত্বর কামনা করে,যারা \"স্থিরসময়\"কে মেনে নেয় না। এবং যারা মেনে নিয়েছে, তারা সেটির জন্য দরদী-সহানুভূতিশীল, এবং তারা জানে যে, সেটি বিজ্ঞানভিত্তিক-যূক্তিযূক্ত। প্রশ্নাতীতভাবে যারা \"স্থিরসময়\" সম্বন্ধে বাক বিতগুা করে, তারা ঘোর ভ্রাস্তিতে নিপতিত। \n\n" +
                " ০৪২:০১৯] আল্লাহ্ তাঁর বান্দাদের প্রতি পরম আনন্দজনক কনা, তিনি যাকে চান (প্রচুর) জীবিকা দেন। এবং তিনি পরম শক্তিশালী, ভালবাসা-কনার মহাসমূদ্র ।  \n\n" +
                " ০৪২:০২০] যে ব্যক্তি পরকালের ফসল চায়, আমরা তার জন্য তার ফসল বর্ধিত করে দিই, এবং যে ব্যক্তি ইহকালের ফসল চায়, আমরা তাকে তা থেকে কিছু(অংশ) দিয়ে দিই, কিন্তু পরকালে তার জন্য কোন অংশ থাকবে না (অর্থাৎ পরকালে তার জন্মই হবে না) । \n\n" +
                " ০৪২:০২১] তাদের জন্য কি এমন কিছু পৃথকসত্তা আছে যারা তাদের জন্য এমন বিধান নির্ণয় করেছে যার কোন আদেশ আল্লাহ্ দেন নাই ? এবং যদি না চুড়ান্ত সিদ্ধান্তের কথা থাকত, তাহলে তাদের মধ্যে চুড়ান্ত নিষ্পত্তি করে দেয়া হত। এবং অন্যায়কারীদের জন্য নিশ্চই যন্ত্রণাদায়ক দুঃখ-কষ্ট আছে। \n\n" +
                " ০৪২:০২২] আপনি অন্যায়কারীদের দেখবেন তারা যা কিছু অর্জন করেছে তার জন্য চরম বেদনাহত অথচ তা তাদের উপর অবশ্যই আপতিত হবে। এবং যারা আল্লাহকে এককসত্বা মেনে নিয়েছে এবং ভালকাজ করেছে তারা জান্নাতগুলোর সবুজ তৃণবহুল স্থানে ফুলে-ফলে থাকবে। তারা যা কিছু চাইবে তাদের ক্রমবিকাশকের সন্নিধানে তাদের জন্য তা মওজুদ থাকবে। এটি হবে তাঁর মহা বিজ্ঞান-প্রযূক্তি। \n\n" +
                " ০৪২:০২৩] এটিই সে বিষয় যার সুসংবাদ আল্লাহ্ নিজের বান্দদেরকে দিচ্ছেন, যারা আল্লাহকে এককসত্বা মেনে নেয় এবং ভালকাজ করে। আপনি বলুন, \"আমি তোমাদের থেকে এর বিনিময়ে কোন প্রতিদান চাই না একমাত্র ভালবাসা-প্রেম-প্রীতি ছাড়া যা নিকটআত্নীয় স্বজনদের মধ্যে বিদ্যমান।\" এবং যে মনোভাবের সম্পূর্ণ পরিবর্তন উৎকৃষ্ট ও সুন্দর ভাবে করে আমরা তার জন্য সে সৌন্দর্যকে আরও বাড়িয়ে দেই। নিশ্চই আল্লাহ্ পরম সংশোধনশীল অতীব ধন্যবাদপ্রাপ্য। \n\n" +
                " ০৪২:০২৪] তারা কি বলে, \"সে আল্লাহর উপর মিথ্যা রচনা করেছে?\" আল্লাহ্ ইচ্ছা করলে আপনার মন-মগজের উপর সীল মেরে দিতে পারেন।  \n\n" +
                "আল্লাহ্ অপ্রযোজ্য-পরিত্যক্ত-কুসংস্কার দূরিভূত করেন এবং বিজ্ঞানকে নিজ বাণী দিয়ে সুপ্রতিষ্ঠিত করেন। নিশ্চই তিনি বক্ষঃস্থলে নিহিত কথা সম্যক পরিজ্ঞাত আছেন। \n\n" +
                " ০৪২:০২৫] এবং তিনিই নিজ বান্দাদেরকে ভুল মত-পথ থেকে ফিরে আসলে গ্রহন করে নেন এবং ভুলগুলো সংশোধন করেন। এবং আপনারা যা কিছু করেন, তা তিনি অবগত আছেন। \n\n" +
                " ০৪২:০২৬] এবং নিশ্চই তিনি প্রতুত্তরে তাদের বিনিময় দেন যারা আল্লাহকে এককসত্তা মেনে নেয় এবং ভালকাজ করে ; এবং তিনি নিজ বিজ্ঞান-প্রযূক্তি দিয়ে তাদেরকে অনেক বেশি (১০গুন, ৭০০+গুন) বাড়িয়ে দিয়ে থাকেন; এবং অস্বীকারকারীদের জন্য কঠিন দুঃখ-কষ্ট আছে। \n\n" +
                " ০৪২:০২৭] এবং যদি আল্লাহ্ নিজ বান্দাদের জন্য জীবিকাকে(পৃথিবীতে) অধিক পরিমাণে বাড়িয়ে দিতেন, তাহলে তারা পৃথিবীতে আবশ্যই বিদ্রোহ করত, কিন্তু তিনি যা কিছু চান পরিমাণ অনুযায়ী অবতীর্ণ করেন। নিশ্চই তিনি নিজ বান্দাদের সম্বন্ধে সবিশেষ অবহিত, পর্যবেক্ষক। \n\n" +
                " ০৪২:০২৮] এবং তিনিই তো তাদের নিরাশ হয়ে যাওয়ার পর বারি বর্ষণ করেন এবং নিজ রহমতকে বিস্তৃত করে দেন। যেহেতু তিনিই প্রকৃত অভিভাবক, সকল ধন্যবাদ প্রাপ্য ।  \n\n" +
                " ০৪২:০২৯] এবং বায়ুমণ্ডলগুলো ও পৃথিবীগুলো এবং এতদুভয়ের মধ্যে সমস্ত জীবজন্তুর সৃষ্টি এবং সেগুলোতে ছড়িয়ে দেয়া ইন্টার্নেট বা পরমানু যোগাযোগ সবই তাঁর আয়াত(নিদর্শন) গুলো থেকে। এবং তিনি যখন চাইবেন তাদেরকে পরিমিত পরিমাপে একত্রিত করতে সক্ষম। \n\n" +
                " ০৪২:০৩০] এবং তোমাদের উপর যেসব বিপদ আপদ নিপতিত হয় তা তোমাদের কৃতকর্মেরই কারণে। এবং তোমাদের বহু অপরাধ তিনি ক্ষমা করেন। \n\n" +
                " ০৪২:০৩১] এবং তোমরা পৃথিবীতে কখনও অলৌকিক-অপ্রাকৃতিক কিছু পাবে না; এবং আল্লাহ্ ছাড়া তোমাদের কোন অভিভাবক নেই এবং কোন সাহায্যকারীও নেই। \n\n" +
                " ০৪২:০৩২] এবং (পানি ও বাতাসের)সমুদ্রে পর্বতসদৃশ দ্রুতগামী জাহজগুলোও তাঁর আয়াত (নিদর্শন) গুলোর অন্তর্গত ।  \n\n" +
                " ০৪২:০৩৩] তিনি ইচ্ছা করলে বায়ুর চলাচলকে ম্তব্ধ করে দিতে পারেন, ফলে সেগুলি (পানি ও বাতাসের) সমুদ্রের পৃষ্ঠদেশে নিশ্চল হয়ে পিছিয়ে থাকবে(বায়ুহীন স্পেসএ চলতে উৎপাদিত যান্ত্রিক শক্তি প্রয়োজন); নিশ্চই এর মধ্যে প্রত্যেক ধৈর্যশীল কৃতজ্ঞ ব্যক্তির জন্য বহু আয়াত(নিদর্শন) আছে,  \n\n" +
                " ০৪২:০৩৪] অথবা সেগুলোকে (আরোহীসহ) তাদের কৃত-কর্মের কারণে বিধ্বস্ত করে দিতে পারেন; কিন্তু তিনি বহু অপরাধ মাফ করেন। \n\n" +
                " ০৪২:০৩৫] এবং যারা আমাদের আয়াত গুলো সম্বন্ধে তর্ক-বিতর্ক করে তিনি তাদেরকে জানেন, তাদের পলায়নের কোন স্থান নেই। \n\n" +
                " ০৪২:০৩৬] এবং তোমাদেরকে যা কিছু দান করা হয়েছে তা ইহকালীন-জীবনের আনন্দ-উল্লাস মাত্র, এবং আল্লাহর কাছে যা আছে তা উৎকৃষ্ট ও সর্বাধিক স্থায়ী –তাদের জন্য যারা আল্লাহকে এককসত্তা মেনে নেয় এবং নিজেদের ক্রমবিকাশকের উপর নির্ভর করে,  \n\n" +
                " ০৪২:০৩৭] এবং যারা বড় বড় অপরাধ এবং অশ্লীল কাজকে বর্জন করে এবং ক্রুদ্ধ হলে তা পরিত্যাগ করে,  \n\n" +
                " ০৪২:০৩৮] এবং যারা নিজেদের ক্রমবিকাশকের ডাকে সাড়া দেয় এবং মানুষে মানুষে ভালবাসা(সালাত) স্থাপন করে, এবং তাদের কাজ তাদের পরস্পরের পরামর্শের মাধ্যমে (সংসদ অধিবেশনের মাধ্যমে) সুসম্পন্ন করে, এবং আমরা তাদেরকে যা জীবিকা দান করেছি তা থেকে (দরিদ্রদের অন্ন-বস্ত্র এককভাবে ও দারিদ্র দূরিকরণে সম্মিলিতভাবে দানের জন্য) খরচ করে, \n\n" +
                " ০৪২:০৩৯] এবং তাদের উপর যখন কোন অন্যায় হয় তখন তারা অবশ্যই প্রতিশোধ গ্রহণ করে। \n\n" +
                " ০৪২:০৪০] এবং (স্মরণ রাখবে যে) মন্দের প্রতিফল তার মতই মন্দ, এবং যে ব্যক্তি মাফ করে এবং পুনর্গঠন করে তার পুরস্কার আল্লাহর জিম্মায়। আল্লাহ্ অন্যায়কারীদেরকে আদৌ ভালবাসেন না। \n\n" +
                " ০৪২:০৪১] এবং অবশ্য যারা, তাদের উপর অন্যায় হওয়ার পর, প্রতিশোধ গ্রহণ করে তাদের বিরুদ্ধে কোন অভিযোগ নেই।  \n\n" +
                " ০৪২:০৪২] অভিযোগ শুধুই তাদের বিরুদ্ধে যারা মানুষের উপর অন্যায় করে এবং পৃথিবীতে অবৈজ্ঞানিক ভাবে বিদ্রোহাচরণ করে বেড়ায়। এসব লোকের জন্য যন্ত্রণাদায়ক দুঃখ-কষ্ট আছে। \n\n" +
                " ০৪২:০৪৩] এবং অবশ্য যে ধৈর্য ধারণ করে এবং সংশোধন করে নিশ্চই এ আচরণ (তার) দৃঢ়-সংকল্পের বিষয়।  \n\n" +
                " ০৪২:০৪৪] এবং আল্লাহ্ যাকে পথভ্রষ্ট সাব্যস্ত করেন তার জন্য এরপর আদৌ কোন রক্ষাকারী অভিভাবক হতে পারে না। এবং আপনি অন্যায়কারীদের, যখন তারা দুঃখ-কষ্ট প্রত্যক্ষ করবে, বলতে শুনবেন, \"প্রত্যবর্তনের কোন উপায় আছে কি?\" \n\n" +
                " ০৪২:০৪৫] এবং আপনি তাদেরকে অপমানের দরুন অবনত অবস্থায় দুঃখ-কষ্টের সম্মুখিন করতে দেখবেন, এবং দেখবেন, তারা আড়চোখে তাকাচ্ছে। এবং যারা আল্লাহকে এককসত্বা মেনে নিয়েছে তারা বলবে, প্রকৃত ক্ষতিগ্রস্ত তারাই যারা নিজেদেরকে এবং নিজেদের পরিবারবর্গকে পুনরুত্থানের দিনে ক্ষতিগ্রস্ত করেছে। তোমরা মনযোগ দিয়ে শোন ! অন্যায়কারীরা নিশ্চই এক দীর্স্থাঘয়ী  \n\n" +
                "দুঃখ-কষ্টের মধ্যে অবস্থান করবে। \n\n" +
                " ০৪২:০৪৬] তাদের এমন কোন বন্ধু থাকবে না যে আল্লাহর মোকাবেলায় তাদেরকে সাহায্য করবে। এবং আল্লাহ্ যাকে পথভ্রষ্ট সাব্যস্ত করেন তার জন্য কোন পথ থাকে না। \n\n" +
                " ০৪২:০৪৭] তোমরা তোমাদের ক্রমবিকাশকের ডাকে সাড়া দাও সেদিন আসার আগে যাকে আল্লাহর মোকাবেলায় প্রতিহত করা যাবে না। সেদিন তোমাদের কোন আশ্রয়স্থলও থাকবে না এবং তোমাদের অস্বীকার করারও কোন উপায় থাকবে না। \n\n" +
                " ০৪২:০৪৮] কিন্তু যদি তারা বিমুখ হয়ে যায়, তাহলে আমরা আপনাকে তাদের উপর রক্ষাকারী করে পাঠাই নাই। কেবল (সংবাদ) পৌছে দেয়াই আপনার কর্তব্য এবং প্রকৃত বিষয় হচ্ছে, আমরা যখন মানুষকে নিজ সন্নিধান থেকে কোন রহমতের স্বাদ গ্রহণ করাই, তখন সে আনন্দিত হয়। কিন্তু যদি তাদের কৃত-কর্মের কারণে, তাদের উপর কোন বিপদ আসে তখন দেখুন ! মানুষ বড়ই অকৃতজ্ঞ হয়ে পড়ে। \n\n" +
                " ০৪২:০৪৯] বায়ুমণ্ডলগুলো ও পৃথিবীগুলোর আধিপত্য আল্লাহর জন্য। তিনি যা চান সৃষ্টি করেন। তিনি যাকে চান কন্যা দান করেন, এবং যাকে চান পুত্র দান করেন; \n\n" +
                " ০৪২:০৫০] অথবা তিনি তাদেরকে পুত্র ও কন্যা মিলিয়ে দান করেন, এবং যাকে চান বন্ধ্যা করে দেন। নিশ্চই তিনি সর্বজ্ঞানী পরিমিত পরিমাপ নিরুপনকারী। \n\n" +
                " ০৪২:০৫১] এবং কোন মানুষের পক্ষে সম্ভব নয় যে, আল্লাহ্ তার সাথে (মানুষের মত সরাসরি) কথা বলবেন কেবল প্রত্যাদেশ(ওহী) ছাড়া, অথবা  \n\n" +
                "(পর্দার অস্তরাল থেকে) ঘুমে স্বপ্ন দেখিয়ে, অথবা একজন রাসুল প্রেরণ করে, যে তাঁর আদেশানুযায়ী তা প্রত্যাদেশ করে যা তিনি চান। নিশ্চই তিনি মৌলিক বিজ্ঞানী। \n\n" +
                " ০৪২:০৫২] এবং এভাবে আমরা আপনার প্রতি নিজ আদেশ ওহী করেছি। আপনি জানতেন না, গ্রন্থ কী, মেনে নেয়া কী ? কিন্তু আমরা এটিকে(স্মারক-বাণীকে) আলোক(বিজ্ঞান-শিক্ষা)স্বরুপ করেছি, যা দিয়ে আমরা আমাদের বান্দাদের মধ্য থেকে যাকে চাই সুপথপ্রাপ্তীর নির্দেশনা দেই। এবং নিশ্চই আপনি (মানুষদেরকে) সরল সুদৃঢ় পথে পরিচালিত করছেন,  \n\n" +
                " ০৪২:০৫৩] সেই আল্লাহর পথে যিনি বায়ুমণ্ডগুলোতে যা কিছু আছে ও পৃথিবীগুলোতে যা কিছু আছে সব কিছুর মালিক। মনে রাখবেন, সকলেই আল্লাহর দিকে প্রত্যাবর্তন করে। \n\n");
        editor.putString("41", "পরিচ্ছেদ ০৪১.দৃশ্যঃ বিস্তারিত ব্যাখ্যা(সূরা ফুচ্ছিলাত/হা মীম্ আস্ সাজদা The detailed) \n\n" +
                "এটি মক্কী সূরা, বিসমিল্লাহ সহ এতে ৫৫ আয়াত এবং ৬ রুকূ আছে। \n\n" +
                " ০৪১:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে \n\n" +
                " ০৪১:০০১] হা মীম্।. \n\n" +
                " ০৪১:০০২] এককসত্তা করুণাময়, এককসত্তা দায়াময় থেকে (এ কুরআন) অবতীর্ণ হয়েছে \n\n" +
                " ০৪১:০০৩] এমন গ্রন্থ, যার আয়াতগুলো বিস্তারিত ব্যাখ্যাসহ বর্ণিত হয়েছে যা পুনঃ পুনঃ পাঠ যোগ্য, যা আরবী (প্রাঞ্জল) ভাষায় বর্ণিত হয়েছে, সেসব লোক-সমাজের জন্য যারা জ্ঞানের অধিকারী, \n\n" +
                " ০৪১:০০৪] সুসংবাদদাতা ও সতর্ককারী হিসেবে। তবুও তাদের বেশিরভাগই বিমুখ হয়ে গেছে এবং তারা শুনেও না। \n\n" +
                " ০৪১:০০৫] এবং তারা বলে, \"তোমরা যে বিষয়ের প্রতি আমাদেরকে আহবান করছ তা সম্বন্ধে আমাদের অন্তর পর্দাবৃত আছে এবং আমাদের কানে বধিরতা আছে, এবং আমাদের ও তোমার মধ্যে এক অন্তরাল আছে।\" সুতরাং আপনি আপনার কাজ করুন এবং আমরাও আমাদের কাজ করি। \n\n" +
                " ০৪১:০০৬] আপনি বলুন, \"আমি তোমাদেরই মত একজন মানুষ, আমার প্রতি ওহী করা হয়, তোমাদের উদ্ভাবনকারী একই উদ্ভাবনীশক্তি; সুতরাং তোমরা তাঁর দিকে যাওয়ার পথে ধৈর্যের সাথে অবিচল থাক, এবং তাঁরই কাছে সংশোধন প্রার্থনা কর। এবং পৃথকসত্তা কল্পনাকারীদের জন্য সর্বনাশ \n\n" +
                " ০৪১:০০৭] যারা শুদ্ধতা অর্জনের জন্য দরিদ্রদের প্রাপ্য (অন্ন-বস্ত্র এককভাবে এবং দারিদ্র দূরিকরণে সম্মিলিতভাবে দান বা যাকাত) দেয় না, যেহেতু তারাই পরকাল অস্বীকারকারী। \n\n" +
                " ০৪১:০০৮] যারা আল্লাহর এককসত্তা মেনে নেয় এবং ভালকাজ করে তাদের জন্য নিশ্চই অফুরন্ত প্রতিদান (অবধারিত) আছে। \n\n" +
                " ০৪১:০০৯] আপনি বলুন, তোমরা কি বাস্তবিকই তাঁর এককসত্বা অস্বীকার করছ, তিনি পৃথিবীগুলোকে দুইদিনে(মহাকালের এক তৃতীয়াংশ সময়ে) সৃষ্টি করেছেন এবং তাঁর সমকক্ষ স্থির করছ ? ইনিই তো মহাবিশ্বের ক্রমবিকাশক। \n\n" +
                " ০৪১:০১০] এবং তিনি পৃথিবীগুলোর উপরিভাগে পর্বতশ্রেণী সংস্থাপন করেছেন এবং তাতে বহু জলভাগ রেখেছেন এবং তাতে চতুর্থদিনে পরিমিত পরিমাণে তার খ্যাদ্য সামগ্রীর আয়োজন করেছেন যা *সকল অন্বেষণকারীদের জন্য সমান*। \n\n" +
                " ০৪১:০১১] অতঃপর তিনি বায়ুমণ্ডলের দিকে মানোনিবেশ করলেন, তখন তা ছিল ধোঁয়া(কার্বন-ডাই-অক্সাইড ও হাইড্রোজেন)পূর্ণ, অতঃপর তিনি সেগুলোকে এবং পৃথিবীগুলোকে বললেন, তোমরা স্বেচ্ছায় অথবা অনিচ্ছায় (আমার পরিকল্পনা বাস্তবায়নের জন্য) এস। তারা উভয়ে বলল, আামরা স্বেচ্ছায় এসেছি। \n\n" +
                " ০৪১:০১২] অতঃপর তিনি বায়ুমণ্ডলকে সাতটি স্তরে সম্পূর্ণ করলেন দুই দিনে(এ ২দিন পৃথিবী ২য় ২দিন অর্থাৎ মহাকালের ২য় তৃতীয়াংশ যা এখনও চলছে, শেষ ২দিন পরকাল); এবং প্রত্যেক স্তরকে যার যার কাজ সম্বন্ধে প্রত্যাদেশ করলেন। এবং আমরা নিকটতম মহাকাশকে নক্ষত্রপুঞ্জ দিয়ে সুশোভিত করলাম, এবং পৃথিবীগুলোকে রক্ষার কারণ করলাম (আমাদের পৃথিবীকে উত্তরে ধ্রূবতারা এবং দক্ষিণে হ্যাডলিস-অকটেন্ট সাড়ে ২৩ডিগ্রী কোনে ধরে রেখেছে) । এ-ই হল ভালবাসা-কনার মহাসমূদ্র, মহাবিজ্ঞানী আল্লাহর নির্ধারিত বিধান। \n\n" +
                " ০৪১:০১৩] এরপরও যদি তারা বিমুখ হয়, তাহলে আপনি বলুন, \"আমি তোমাদেরকে আদ এবং সামূদ জাতির বজ্রাঘাতের শাস্তির মত বজ্রাঘাত সম্বন্ধে সতর্ক করে দিচ্ছি । \n\n" +
                " ০৪১:০১৪] যখন তাদের কাছে রসূলরা তাদের সামনে(ভবিষ্যতে)ও এবং তাদের পিছনে(অতীতে)ও আগমন করেছিল এ কথা বলে, \"তোমরা আল্লাহ্ ছাড়া অন্য কারও সেবা-কাজ(ইবাদত) করবে না,\" তখন তারা বলেছিল, \"যদি আমাদের ক্রমবিকাশক ইচ্ছে করতেন তাহলে নিশ্চই তিনি (আমাদের উপর) ফিরিশতাদেরকে অবতীর্ণ করতেন। সুতরাং তোমরা যে শিক্ষাসহ প্রেরিত হয়েছ তা আমরা অবশ্যই অস্বীকার করছি। \n\n" +
                " ০৪১:০১৫] এবং আদ জাতির বিবরণ হচ্ছে, তারা পৃথিবীতে অন্যায়ভাবে অহংকার করত এবং বলত, শক্তিতে আমাদের অপেক্ষা অধিকতর শক্তিশালী কে? তারা কি চিন্তা করে দেখে নাই, নিশ্চই সেই আল্লাহ্ যিনি তাদেরকে সৃষ্টি করেছেন, শক্তিতে তাদের অপেক্ষা অধিকতর শক্তিশালী? এবং তারা হঠকারিতা করে আমাদের আয়াত(নিদর্শন) গুলোকে অস্বীকার করত। \n\n" +
                " ০৪১:০১৬] ফলে আমরা তাদের উপর অশুভ দিনগুলোতে প্রচন্ড ঝঞ্ঝাবায়ু পাঠিয়েছিলাম যাতে আমরা তাদেরকে পার্থিব জীবনে লাঞ্চনাজনক শাস্তি ভোগ করাই । এবং পরকালের শাস্তি অবশ্যই এরচেয়ে বেশি লাঞ্ছনাজনক হবে এবং তাদেরকে (আদজাতি নয়,পরকালে যারা শাস্তি ভুগবে) কোন প্রকার সাহায্য করা হবে না। \n\n" +
                " ০৪১:০১৭] আর সামূদ জাতির বিবরণ হচ্ছে যে, আমরা তাদেরকে সুপথপ্রাপ্তীর নির্দেশনার পথে পরিচালিত করেছিলাম। কিন্তু তারা সুপথপ্রাপ্তীর নির্দেশনার পরিবর্তে অন্ধত্বকে পছন্দ করেছিল ; তখন তাদের কৃত কর্মের ফলে এক লাঞ্ছনাজনক শাস্তির প্রকট বজ্রধ্বনি এসে তাদেরকে ধৃত করল। \n\n" +
                " ০৪১:০১৮] আর যারা আল্লাহকে এককসত্বা মেনে নিয়েছিল এবং সচেতনতা অবলম্বন করে চলত আমরা তাদেরকে উদ্ধার করেছিলাম । \n\n" +
                " ০৪১:০১৯] এবং যেদিন আল্লাহর শত্রুদেরকে অনুতাপের আগুনের অভিমুখে সমাবেত করা হবে, অতঃপর তাদেরকে বিভিন্ন শ্রেণীতে বিন্যস্ত করা হবে; \n\n" +
                " ০৪১:০২০] এমন কি যখন তারা তাঁর কাছে পৌঁছবে, তখন তারা যেসব কার্যকালাপ করত তার জন্য তাদের কর্ণ তাদের চক্ষু এবং তাদের চর্ম তাদেরই বিরুদ্ধে সাক্ষ্য দিবে (কারন আমাদের শরীর কোটি কোটি একক কোষ দিয়ে সৃষ্টি, এখন আমরা তাদের কথা শুনতে না পেলেও তখন শুনবো)। \n\n" +
                " ০৪১:০২১] এবং তারা নিজেদের চর্মকে বলবে, \"তোমরা কেন আমাদের বিরুদ্ধে সাক্ষ্য দিলে ?\" তারা বলবে সেই আল্লাহ্ আমাদেরকে বাকশক্তি দিয়াছেন যিনি প্রত্যেক বস্তকে বাকশক্তি দিয়েছেন। এবং তিনিই তোমাদেরকে প্রথমবার সৃষ্টি করেছেন(তখন থেকেই বাকশক্তি দিয়েছেন) এবং তাঁরই দিকে তোমরা প্রত্যাবর্তিত হয়েছ। \n\n" +
                " ০৪১:০২২] এবং তোমরা (তোমাদের পাপগুলোকে) এ কারণে গোপন করতে না, তোমাদের কর্ণ্, তোমাদের চক্ষু এবং তোমাদের চর্ম তোমাদের বিরুদ্ধে সাক্ষ্য দিবে বরং তোমরা ধারণা করতে, আল্লাহ তোমাদের অনেক কার্যকলাপ সম্বন্ধে অবগত নন, যা তোমরা করছ। \n\n" +
                " ০৪১:০২৩] এবং তোমাদের এই কুধারণাই, যা তোমরা তোমাদের ক্রমবিকাশক সম্বন্ধে পোষণ আসছ, তোমাদেরকে ধ্বংস করেছে, ফলে তোমরা ক্ষতিগ্রস্থ লোকদের অন্তর্গত হয়ে গেছ। \n\n" +
                " ০৪১:০২৪] এখন তারা ধৈর্য ধারণ করলেও অনুতাপের-আগুনই হবে তাদের আবাসস্থল, এবং তারা (আল্লাহর কাছে)নৈকট্য চাইলেও তারা নৈকট্য প্রাপ্তদের অন্তর্ভুক্ত হবে না। \n\n" +
                " ০৪১:০২৫] এবং আমরা তাদের জন্য এমন সহচরবৃন্দ নিয়োজিত করে দিয়েছি যারা তাদের ভবিষ্যতের এবং তাদের অতীতের সকল কার্যকলাপকে তাদের দৃষ্টতে মনোহর করে দেখিয়েছে ফলে তাদের উপরও সেই প্রত্যাদেশ জারী হয়ে গেল যা জিন্ন এবং ইনসানের অপরাপর জাতিগুলোর উপর জারী হয়েছিল, যারা এদের পূর্বে গত হয়ে গেছে। নিশ্চই তারা ক্ষতিগ্রস্ত হয়েছিল। \n\n" +
                " ০৪১:০২৬] এবং যারা অস্বীকার করেছে তারা বলে, \"তোমরা এই কুরআন শুনবে না এবং এর পাঠের মধ্যে শোরগোল সৃষ্টি কর যাতে তোমরা জয় লাভ করতে পারে।\" \n\n" +
                " ০৪১:০২৭] সুতরাং যারা অস্বীকার করেছে আমরা এর জন্য তাদেরকে অবশ্যই কঠোর শাস্তির স্বাদ গ্রহণ করাবো এবং তাদেরকে তাদের জঘন্যতম কার্যকলাপের প্রতিফল দিব। \n\n" +
                " ০৪১:০২৮] আল্লাহর শত্রুদের প্রতিফল এ-ই আগুন। সেখানে তাদের জন্য দীর্ঘকাল বসবাসের আবাস (অবধারিত) রয়েছে, এ-ই হবে প্রতিফল কারণ তারা আমাদের নিদর্শনাবলীকে হঠকারিতার সাথে অস্বীকার করত \n\n" +
                " ০৪১:০২৯] এবং যারা অস্বীকার করেছে তারা বলবে, \"হে আমাদের ক্রমবিকাশক ! জিন্ন ও ইনসান থেকে আমাদেরকে সেসব লোক দেখিয়ে দিন যারা আমাদেরকে পথভ্রষ্ট করেছে, যাতে আমরা তাদের উভয়কে আমাদের পায়ের তলায় পিষি, যাতে তারা নিকৃষ্টতম লোকদের অন্তর্গত হয়ে যায়। \n\n" +
                " ০৪১:০৩০] নিশ্চই যারা বলে, \"আমাদের ক্রমবিকাশক আল্লাহ্, অতঃপর তারা দৃঢ়তার সাথে অবিচল থাকে তাদের উপর ফিরিশতারা অবতীর্ণ হয়(এই বলে), \"তোমরা ভয় করবে না, এবং দুঃখিতও হবে না এবং সেই জান্নাতের জন্য তোমরা আনন্দিত হও যার প্রতিশ্রুতি তোমাদেরকে দেয়া হয়েছে।\" \n\n" +
                " ০৪১:০৩১] আমরা তোমাদের অভিভাবক ইহাজীবনেও এবং পরজীবনেও। সেখানে তোমাদের মন যা কিছু চাইবে তা তোমাদেরকে দেয়া হবে এবং যা কিছু তোমরা ফরমায়েশ করবে তা-ও তোমাদেরকে দেয়া হবে- \n\n" +
                " ০৪১:০৩২] অত্যন্ত সংশোধনশীল এককসত্তা দয়াময়ের পক্ষ থেকে তা আপ্যায়ন স্বরূপ হবে। \n\n" +
                " ০৪১:০৩৩] এবং যে মানুষকে আল্লাহর দিকে আহবান করে এবং ভালকাজ করে, এবং বলে নিশ্চই আমি সমর্পিতদের অন্তর্গত, তারচেয়ে কথায় অধিক উত্তম আর কে ? \n\n" +
                " ০৪১:০৩৪] যেহেতু ভাল এবং মন্দ সমান নয়; অতএব আপনি তা দিয়ে (মন্দকে)প্রতহত করুন যা সর্বোত্তম , ফলে সহসা সে ব্যক্তি, যার মধ্যে এবং আপনার মধ্যে শত্রুতা রয়েছে, আপনার অন্তরঙ্গ বন্ধুর মত হয়ে যাবে। \n\n" +
                " ০৪১:০৩৫] কিন্তু এর অধিকারী করা হয় কেবল তাদেরকে যারা ধৈর্য ধারণ করে এবং এর অধিকারী করা হয় কেবল তাদেরকে যারা বহুসংখ্যক কল্যানজনক বস্তুর অধিকারী। \n\n" +
                " ০৪১:০৩৬] এবং যদি শয়তানের পক্ষ থেকে কোন প্ররোচনা আপনাকে প্ররোচিত করে তাহলে আপনি আল্লাহর কাছে আশ্রয় প্রার্থনা করুন। নিশ্চই তিনিই সর্বশ্রোতা, সর্বজ্ঞানী। \n\n" +
                " ০৪১:০৩৭] এবং রাত ও দিন এবং সূর্য ও চাঁদ তাঁর নিদর্শন গুলোর অন্তর্গত। তোমরা সুর্যকে সেজদা করবে না, এবং চন্দ্রকেও না বরং তোমরা কেবল সেই আল্লাহকে সেজদা কর, যিনি সেগুলোকে সৃষ্টি করেছেন, যদি তোমরা তাঁরই সেবাকাজ কর ! \n\n" +
                " ০৪১:০৩৮] যদি তারা অহংকার করে, তাহলে জেনে রাখুন, যারা আপনার ক্রমবিকাশকের সন্নিধানে আছে তারা রাতে ও দিনে তাঁরই দেয়া দায়িত্ব পালন করছে এবং তারা ক্লান্ত ও শ্রান্ত হয় না। \n\n" +
                " ০৪১:০৩৯] এবং এ-ও তাঁর আয়াতগুলোর অন্তর্গত, আপনি পৃথিবীকে শুষ্ক তৃণহীন দেখতে পান, অতঃপর যখন আমরা তাতে বৃষ্টি বর্ষণ করি তখন তা সতেজ ও স্ফীত হয়ে উঠে; নিশ্চই যিনি তাকে(ভূমিকে) সঞ্জীবিত করেন তিনি অবশ্যই মৃতদের জীবনদাতা; তিনি সকল বিষয়ে ক্ষমতাবান । \n\n" +
                " ০৪১:০৪০] যারা আামাদের নিদর্শনাবলীর মধ্যে বক্রতা দেখানোর জন্য সেগুলোকে বিকৃত করে তারা কখনও আমাদের দৃষ্টি থেকে গোপন নয়। যে ব্যক্তি আগুনে নিক্ষিপ্ত হবে সে ব্যক্তি কি উত্তম অথবা যে ব্যক্তি পুনরুত্থান দিবসে শান্তির সাথে আসবে সে উত্তম ? তোমরা যা চাও কর; যা কিছু তোমরা করছ, নিশ্চই তিনি তা দেখছেন-- \n\n" +
                " ০৪১:০৪১] নিশ্চই যারা এই স্মারক-বানী(কুরআন)কে অস্বীকার করেছে, যখন এটি তাদের কাছে আসলো। এটি(কুরআন) নিশ্চই কণিকা-বিজ্ঞান গ্রন্থ- \n\n" +
                " ০৪১:০৪২] কোন প্রকার মিথ্যা এর কাছে ভবিষ্যতেও আসতে পারবে না এবং অতীতেও আসতে পারে নাই । পরম ধন্যবাদযোগ্য বিজ্ঞানী আল্লাহর কাছ থেকে এটি অবতীর্ণ হয়েছে। \n\n" +
                " ০৪১:০৪৩] আপনাকে (শত্রুপক্ষ থেকে) কেবল তা-ই বলা হচ্ছে যা আপনার পুর্ববতী রসূলদেরকেও বলা হয়েছিল। নিশ্চই আপনার ক্রমবিকাশক সংশোধনের মালিক এবং মহা জরিমানার মালিক। \n\n" +
                " ০৪১:০৪৪] এবং আমারা যদি এটি(কুরআন)কে অনারবী ভাষায়(অবতীর্ণ) করতাম তাহলে নিশ্চই তারা (মক্কাবাসীরা) বলতো, \"কেন এর আয়াতগুলো সুস্পষ্ট ভাবে বর্ণনা করা হয় নাই ? কী ! ভাষা অনারবী এবং (নবী) আরবীয় ?\" আপনি বলুন, \"এটি সুপথপ্রাপ্তীর নির্দেশনা এবং আরোগ্য, তাদের জন্য যারা আল্লাহর এককসত্বা মেনে নিয়েছ,\" এবং যারা মেনে নেয় নাই তাদের কানে বধিরতা আছে, এবং এটি তাদের কাছে অন্ধকারাচ্ছন্ন হয়ে আছে। তারাই এমন লোক (যেন)তাদেরকে অনেক দূরবর্তী স্থান থেকে আহবান করা হচ্ছে। \n\n" +
                " ০৪১:০৪৫] এবং আমরা মূসাকেও এক গ্রন্থ দিয়েছিলাম, কিন্তু তার মধ্যেও মতভেদ করা হয়েছিল; বস্তুতঃ যদি আপনার ক্রমবিকাশক থেকে এক বাক্য আগে থেকে বলা না থাকত তাহলে অবশ্যই তাদের মধ্যে মীমাংশা করে দেয়া হত; এবং নিশ্চই তারা এটি সম্বন্ধে এক অস্বস্তিকর সন্দেহে নিপতিত রয়েছে। \n\n" +
                " ০৪১:০৪৬] যে ব্যক্তি ভালকাজ করে, বস্তুতঃ তা তারই নিজের কল্যাণের জন্য হবে ; এবং যে ব্যক্তি মন্দকাজ করে, তার শাস্তি তারই উপর বর্তাবে। এবং আপনার ক্রমবিকাশক বান্দাদের প্রতি আদৌ অন্যায়কারী নন। \n\n" +
                " ০৪১:০৪৭] কেবল তাঁরই দিকে \"স্থিরসময়\" এর জ্ঞান অনুরণিত হয় । তাঁর অজান্তে কোন ফল তার কলির আবরণ থেকে বের হয় না এবং কোন নারী গর্ভধারণ করে না এবং সন্তান প্রসবও করে না। এবং যেদিন তিনি তাদেরকে আহবান করবেন, এই বলে, \"কোথায় আমার পৃথকসত্তারা ? তারা বলবে, \"আমরা তোমাকে স্পষ্টভাবে নিবেদন করছি, আমাদের মধ্যে কেউই এর সাক্ষী নেই।\" \n\n" +
                " ০৪১:০৪৮] তারা আগে যাদেরকে আহবান করত তারা (পীর-পুরোহিত-যাযক-হুজুর) তাদের থেকে উধাও হয়ে যাবে এবং তারা বিশ্বাস করবে, এখন তাদের জন্য পালানোর কোন স্থান নেই। \n\n" +
                " ০৪১:০৪৯] মানুষ নিজ কল্যাণের জন্য প্রার্থনা করতে কখনও ক্লান্ত হয় না, কিন্তু যদি কোন অকল্যাণ তাকে স্পর্শ করে তখনই সে নিরাশ হয়ে পড়ে। \n\n" +
                " ০৪১:০৫০] এবং তাকে কোন দুঃখ যাতনা স্পর্শ করার পর যদি আমরা আমাদের সন্নিধান থেকে তাকে রহমতের স্বাদ গ্রহণ করাই তখন অবশ্যই সে বলতে থাকে, \"এ-তো আমারই প্রাপ্য এবং আমি বিশ্বাস করি না, পুনরুত্থান সংঘটিত হবে। আর যদি আমাকে আমার ক্রমবিকাশকের কাছে প্রত্যাবর্তিত করা হয় তাহলে নিশ্চই আমার জন্য তাঁর কাছে উত্তম অনুগ্রহগুলো প্রস্তুত থাকবে।\" সুতরাং আমরা অবশ্যই অস্বীকারকারীদেরকে তাদের কৃতকর্ম সম্বন্ধে অবহিত করব এবং অবশ্যই আমরা তাদেরকে কঠোর শাস্তির স্বাদ গ্রহণ করাব। \n\n" +
                " ০৪১:০৫১] এবং যখন আমরা মানুষকে কোন পুরস্কার দান করি, তখন সে মুখ ফিরিয়ে নেয় এবং নিজ পক্ষ পরিবর্তন করে ফেলে, এবং যখন কষ্ট তাকে স্পর্শ করে তখন সে লম্বা চওড়া দোয়া করতে থাকে। \n\n" +
                " ০৪১:০৫২] আপনি বলুন, \"তোমরা চিন্তা করে আমাকে বল, যদি এটি আল্লাহ থেকে এসে থাকে এবং তোমরা এটিকে অস্বীকার কর, তাহলে যে ব্যক্তি ঘোর বিরুদ্ধাচরণে লিপ্ত আছে তার চেয়ে অধিক বিভ্রান্ত আর কে হতে পারে?\" \n\n" +
                " ০৪১:০৫৩] নিশ্চই আমরা তাদেরকে বিশ্বের প্রান্তে প্রান্তে এবং তাদের নিজেদের মধ্যেও আমাদের নিদর্শনাবলী দেখাব এমন কি তাদের জন্য সুস্পষ্ট হয়ে যাবে, এটি সুনিশ্চিত সত্য। এগুলোই কি আপনার ক্রমবিকাশক সম্পর্কে যথেষ্ট নয়, তিনি প্রত্যেক বিষয়ের উপর সম্যক পর্যবেক্ষক? \n\n" +
                " ০৪১:০৫৪] শুনুন ! তারা ক্রমবিকাশকের সাক্ষাৎ সম্বন্ধে সন্দেহে নিপতিত; আবার শুনুন ! তিনি প্রত্যেক বস্তুকে পরিবেষ্টন করে আছেন।");
        editor.putString("39", "    পরিচ্ছেদ ০৩৯.দৃশ্যঃ দলে দলে (সূরা আয-যুমার roll in)  \n\n \n\n" +
                "এটি মক্কী সূরা, বিসমিল্লাহ সহ এতে ৭৬ আয়াত এবং ৮ রুকূ আছে।  \n\n \n\n" +
                " ০৩৯:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০৩৯:০০১] ভালবাসা-কনিকার মহাসমূদ্র, মহা বিজ্ঞানী আল্লাহর তরফ থেকে এ গ্রন্থ অবতীর্ণ হয়েছে ।  \n\n \n\n" +
                " ০৩৯:০০২] নিশ্চই আমরা বিজ্ঞানসহ এ গ্রন্থ আপনার প্রতি অবতীর্ণ করেছি, অতএব আপনি আল্লাহকে ডাকুন বিশুদ্ধ জীবন-বিধানের মাধ্যমে ।  \n\n \n\n" +
                " ০৩৯:০০৩] প্রশ্নাতীত ভাবে বিশুদ্ধ জীবন-বিধান কেবল আল্লাহরই। এবং যারা আল্লাহ্ ছাড়া অন্য(পীর-পূরোহিত-যাযক-হুজুর)কে অভিভাবক হিসেবে গ্রহণ করে, (এবং বলে যে) আমরা তাদের সেবা-কাজ কেবল এই জন্য করি যেন তারা আমাদেরকে আল্লাহর নিকটবর্তী(দীদার লাভ) করে দেয় । নিশ্চই আল্লাহ্ তাদের মধ্যে সে বিষয়ে মীমাংসা করবেন যার সম্বন্ধে তারা মতভেদ করছে। নিশ্চই আল্লাহ্ মিথ্যাপুজাারী অস্বীকারকারীকে সুপথপ্রপ্তির নির্দেশনা দেন না।  \n\n \n\n" +
                " ০৩৯:০০৪] যদি আল্লাহ্ সন্তান গ্রহণ করতে ইচ্ছা করতেন তাহলে তিনি স্বীয় সৃষ্টি থেকে যাকে ইচ্ছা মনোনীত করে নিতেন। তিনি নিয়মশীল, তিনি সর্ব-জয়ী এককসত্বা আল্লাহ ।  \n\n \n\n" +
                " ০৩৯:০০৫] তিনি বায়ুমণ্ডলগুুলো ও পৃথিবীগুলোকে বিজ্ঞানভিত্তিক ভাবে সৃষ্টি করেছেন। তিনি দিনকে রাত দিয়ে ঢেকে দিতে থাকেন অর্থাৎ রাত করেন এবং রাতকে দিন দিয়ে ঢেকে দিতে থাকেন অর্থাৎ দিন করেন ; তিনি সূর্য ও চন্দ্রকে ব্যাবহার উপযোগী করেছেন এদের প্রত্যেকটিই নির্দিষ্ট সময়ে (স্ব স্ব কক্ষপথে) আবর্তন রত রয়েছে। প্রশ্নাতীতভাবে তিনি ভালবাসা-কনার মহাসমূদ্র, অত্যন্ত সংশোধনশীল।  \n\n \n\n" +
                " ০৩৯:০০৬] তিনি তোমাদেরকে একটি মাত্র আদি-প্রান(protoplasm) থেকে সৃষ্টি করেছিলেন, এবং তা থেকে অযৌনজনন(binary fission)এ এর জোড়া সৃষ্টি করেছিলেন, এবং তিনি তোমাদের জন্য গৃহপালিত চতুম্পদ জন্তুর আট জোড়া উদ্ভাবন করেছেন। তিনি তোমাদেরকে(সেক্স সৃষ্টি করে) যৌনজননে তোমাদের মাতৃগর্ভে সৃষ্টি করেন। এক প্রানি থেকে অন্য প্রানিতে বিবর্তন করে (বিগত) তিনটি বরফযূগের ভিতর দিয়ে সৃষ্টি করেছেন। ইনিই সেই আল্লাহ যিনি তোমাদের বিবর্তনকারী (ক্রমবিকাশক) মহাবিশ্বের সকল আধিপত্য তাঁরই। তিনি ছাড়া কোন উদ্ভাবনীশক্তি নেই। অতএব তোমরা কোন দিকে ফিরে যাচ্ছ ?  \n\n \n\n" +
                " ০৩৯:০০৭] যদি তোমরা অস্বীকার কর তাহলে মনে রেখ আল্লাহ্ কনায়-সমৃদ্ধিশালী তোমাদের সহ। এবং তিনি তাঁর বান্দাদের এককসত্বায়-অস্বীকৃতিকে পছন্দ করেন না । যদি তোমরা (এককসত্বায় অন্তর্ভূক্ত থাকায়) কৃতজ্ঞ থাক তাহলে তিনি তোমাদের জন্য এটি পছন্দ করেন। এবং কোন বোঝাবহনকারী অর্থাৎ পাপী(নিজ ইচ্ছায়) অন্যের পাপের বোঝা বহন করতে পারবে না। অতঃপর তোমাদের ক্রমবিকাশকের দিকে তোমাদের প্রত্যাবর্তন ঘটবে তখন তিনি তোমাদেরকে তোমরা যা করতে তা সম্বন্ধে অবহিত করবেন । নিশ্চই তিনি তোমাদের মনের মধ্যে থাকা সব বিষয় সম্বন্ধে সার্বিকভাবে জানেন ।  \n\n \n\n" +
                " ০৩৯:০০৮] এবং যখনই মানুষকে কোন কষ্ট স্পর্শ্ করে তখন সে নিজ ক্রমবিকাশককে তাঁর প্রতি \"ফজর ও ইশায়\" ঝুঁকে ডাকতে থাকে। এবং যখন তিনি নিজ সন্নিধান থেকে তাকে কোন পুরস্কার দান করেন তখন সে আগে যেজন্য তাঁকে ডাকছিল তা ভুলে যায়, এবং সে আল্লাহর সমকক্ষ স্থির করে যেন সে (লোকদেরকে) তাঁর পথ থেকে বিভ্রান্ত করতে পারে। আপনি বলুন, \"(হে মানব) তুমি তোমার অস্বীকৃতি দিয়ে কিছু কাল সুবিধা ভোগ করে নাও, নিশ্চই তুমি অনুতাপস্থলের অগ্নিবাসীদের অন্তর্ভুক্ত হবে।\"  \n\n \n\n" +
                " ০৩৯:০০৯] যে ব্যক্তি রাতে ঘন্টার পর ঘন্টা (কুরআন)পাঠ করে, সেজদা করে এবং দণ্ডয়মান থাকে এবং পরকাল সম্বন্ধে সতর্কতা অবলম্বন করে এবং নিজ ক্রমবিকাশকের রহমতের আশা রাখে, আপনি বলুন, যারা শিক্ষিত এবং যারা অশিক্ষিত তারা কি সমান কি সমান হতে পারে? আসলে মনোনিবেশকারী মানুষরাই কেবল শিক্ষা লাভ করে।  \n\n \n\n" +
                " ০৩৯:০১০] আপনি বলুন, \"হে আল্লাহর এককসত্বা মেনে নেয়া বান্দারা , তোমরা তোমাদের ক্রমবিকাশকের প্রতি সচেতনতা অবলম্বন কর। যারা এ দুনিয়াতে অর্থাৎ ইহকালে কল্যাণমমূূলক কাজ করে তাদের জন্য কল্যাণই অবধারিত আছে। এবং আল্লাহর পৃথিবী সুপ্রশস্ত। ধৈর্যশীলদেরকে অবশ্যই বেহিসাব প্রতিদান দেয়া হবে।  \n\n \n\n" +
                " ০৩৯:০১১] আপনি বলুন, \"নিশ্চই আমি আদিষ্ট হয়েছি যেন আমি আল্লাহর সেবা-কাজ করি বিশুদ্ধ জীবন-বিধানের মাধ্যমে ;  \n\n \n\n" +
                " ০৩৯:০১২] এবং আমি আদিষ্ট হয়েছি যেন আমি সমর্পিতদের মধ্যে প্রথম সারীতে অবস্থান করি।\"  \n\n \n\n" +
                " ০৩৯:০১৩] আপনি বলুন, \"যদি আমি আমার ক্রমবিকাশকের অবাধ্যতা করি তাহলে নিশ্চই আমি এক মহা দিবসের শাস্তিকে ভয় করি।\"  \n\n \n\n" +
                " ০৩৯:০১৪] আপনি বলুন, \"আমি আল্লাহর সেবা-কাজ করি বিশুদ্ধ জীবন-বিধানের মাধ্যমে।  \n\n \n\n" +
                " ০৩৯:০১৫] সুতরাং তোমরা তাঁকে ছাড়া যার ইচ্ছা সেবা-কাজ করতে পার,\" আপনি বলুন, \"প্রকৃত ক্ষতিগ্রস্ত তারা, যারা পুনরুত্থান দিবসে নিজেদেরকেও এবং নিজেদের পরিজনবর্গকেও ক্ষতিগ্রস্ত করেছে।\" প্রশ্নাতীত ভাবে এ-ই হচ্ছে সুস্পষ্ট ক্ষতি।  \n\n \n\n" +
                " ০৩৯:০১৬] তাদের উপরে অগুনের আবরণ থাকবে এবং তাদের নিচেও তেমনি আগুনের আবরণ থাকবে । এটিই সেই ভীতিপ্রদর্শন, যার সম্বন্ধে আল্লাহ্ নিজ বান্দাদেরকে সতর্ক করছেন, \"হে আমার বান্দারা ! আমার সচেতনতা অবলম্বন কর।\"  \n\n \n\n" +
                " ০৩৯:০১৭] এবং যারা ভালকাজে বাধা সৃষ্টিকারী বিদ্রোহীদের সেবা-কাজ থেকে আত্মরক্ষা করে এবং আল্লাহর দিকে ঝুঁকে থাকে তাদের জন্য মহা সুসংবাদ। সুতরাং আপনি আমার বান্দাদেরকে সুসংবাদ দিন,  \n\n \n\n" +
                " ০৩৯:০১৮] যারা মনোযোগ সহকারে কথা শুনে এবং তার ভাল অংশের অনুসরণ করে এরাই তারা, যাদেরকে আল্লাহ্ সুপথপ্রাপ্তীর নির্দেশনা দান করেছেন এবং তারাই প্রকৃত মনোনিবেশকারী ।  \n\n \n\n" +
                " ০৩৯:০১৯] এবং যার উপর বিজ্ঞানভিত্তিক ভাবে দুঃখ-কষ্টের বানী পূর্ণ হয়েছে, আপনি কি তাকে (অনুতাপের) আগুন থেকে রক্ষা করতে পারেন?  \n\n \n\n" +
                " ০৩৯:০২০] কিন্তু যারা নিজেদের ক্রমবিকাশকের সচেতনতা অবলম্বন করে তাদের জন্য অবধারিত আছে বহুতল (ফাউণ্ডেশন)বিশিষ্ট বাড়ি যার উপর অরও তলা নির্মান করা যাবে। বাড়িগুলোর পাদদেশ দিয়ে পানির অব্যাহত সরবরাহ থাকবে। এসবই আল্লাহর প্রতিশ্রুতি, আল্লাহ্ প্রতিশ্রুতি ভংগ করেন না।  \n\n \n\n" +
                " ০৩৯:০২১] আপনি কি দেখেন নাই, আল্লাহ্ আকাশ থেকে বৃষ্টি বর্ষণ করেন, অতঃপর তা ভূপৃষ্ঠে ঝরণা-প্রশ্রবন-নদী আকারে প্রবাহিত করেন, অতঃপর তিনি তা দিয়ে ফসল উৎপন্ন করেন যার বর্ণ ভিন্ন ভিন্ন? অতঃপর ফসল যখন পেকে শুকিয়ে যায় তখন আপনি সেগুলোকে হলূদবর্ণ দেখতে পান যার পর তিনি সেগুলোকে শস্য ছাড়িয়ে নিয়ে খড়কুটায় পরিণত করেন। নিশ্চই এ থেকে মনোনিবেশকারী লোকেরাই শুধু শিক্ষা লাভ করে--  \n\n \n\n" +
                " ০৩৯:০২২] যার মন-মগজ আল্লাহ্ ইসলামের জন্য উম্মুক্ত করেছেন অতঃপর সেই তার ক্রমবিকাশক থেকে প্রাপ্ত শিক্ষা(নুর)এর উপর প্রতিষ্ঠিত আছে। কেবল তাদের জন্য সর্বনাশ যাদের মন-মগজ আল্লাহর স্মারক-বানীর প্রতি কঠিন-অনমনিয় ! এরাই তারা, যারা প্রকাশ্য ভ্রান্তির মধ্যে আছে।  \n\n \n\n" +
                " ০৩৯:০২৩] আল্লাহ্ অবতীর্ণ করেছেন \"আহসানাল হাদিস\"(সর্বোত্তম বাণী) একটি গ্রন্থ যা পরস্পর সাদৃশ্যপূর্ণ সদা-পাঠ্য(কুরআন)। এর (পাঠের)কারণে তাদের গায়ে কাঁটা দিয়ে উঠে --যারা তাদের ক্রমবিকাশককে ভয় করে অতঃপর তাদের দেহ ও তাদের মন আল্লাহর স্মারক-বানীর প্রতি নরম হয়ে পড়ে। এটি আল্লাহর সুপথপ্রাপ্তীর নির্দেশনা, এটি দিয়ে তিনি যাকে চান সুপথে চালান। এবং যাকে আল্লাহ্ বিভ্রান্ত সাব্যস্ত করেন তার জন্য কেউই সুপথপ্রাপ্তীর নির্দেশনাদাতা নাই।  \n\n \n\n" +
                " ০৩৯:০২৪] তবে যে ব্যক্তি পুনরুত্থান দিবসে রোগ যন্ত্রণার আশঙ্কায় নিজ মুখমণ্ডল লুকায় যদিও অন্যায়কারীদের বলা হয় তোমরা যা কিছূ অর্জন করতে তার স্বাদ গ্রহণ কর।  \n\n \n\n" +
                " ০৩৯:০২৫] তাদের পূর্ববর্তীরাও মিথ্যারোপ করেছিল যার ফলে তাদের উপর এমন দিক থেকে দুঃখ-কষ্ট এসেছিল যা তারা অনুমানও করতে পারে নাই।  \n\n \n\n" +
                " ০৩৯:০২৬] সুতরাং আল্লাহ্ তাদেরকে ইহজীবনেও লাঞ্ছনা ভোগ করিয়েছেন, এবং পরকালের দুঃখ-কষ্ট হবে গুরুতর। হায় ! যদি তারা বুঝতো।  \n\n \n\n" +
                " ০৩৯:০২৭] এবং নিশ্চই আমরা এই কুরআনে মানবমগুলীর জন্য সর্বপ্রকার দৃষ্টান্ত বর্ণনা করেছি যেন তারা অনুধাবন করে।  \n\n \n\n" +
                " ০৩৯:০২৮] কুরআনকে আরবী ভাষায় বক্রতামুক্ত করে (অবতীর্ণ করেছি) যেন তারা সচেতনতা অবলম্বন করতে পারে।  \n\n \n\n" +
                " ০৩৯:০২৯] আল্লাহ্ দৃষ্টান্ত বর্ণনা করছেন এক ব্যাক্তির যার কয়েকজন এমন মালিক আছে যারা পরস্পর মত বিরোধ রাখে এবং অপর এক ব্যাক্তির যার মালিক পুরোপুরি একজনই। এই দুই জনের অবস্থা কি সমান হতে পারে? সকল ধন্যবাদ আল্লাহর জন্য। কিন্তু তাদের অধিকাংশই এটি জানে না।  \n\n \n\n" +
                " ০৩৯:০৩০] নিশ্চই আপনিও মরণশীল এবং তারাও নিশ্চই মরণশীল।  \n\n \n\n" +
                " ০৩৯:০৩১] অতঃপর নিশ্চই প্রতিফল দিবসে তোমরা তোমাদের ক্রমবিকাশকের সামনে পরস্পর কলহ বিবাদ করবে।  \n\n \n\n" +
                " ০৩৯:০৩২] অতএব ঐ ব্যাক্তি অপেক্ষা বড় অন্যায়কারী কে যে আল্লাহর বিরুদ্ধে মিথ্যা বলে এবং সত্যকে, যখন তা তার কাছে আসে, মিথ্যা প্রতিপন্ন করে? অনুতাপস্থলে কি অস্বীকারকারীদের জন্য প্রতিক্ষাস্থল নেই?  \n\n \n\n" +
                " ০৩৯:০৩৩] এবং যে ব্যক্তি সত্য আনে(রাসুল-নবী) এবং যে ব্যক্তি তার সত্যায়ন করে(শুধুই রাসুল) এরাই তারা, যারা সচেতন।  \n\n \n\n" +
                " ০৩৯:০৩৪] তারা যা কিছু চাইবে সব কিছু তাদের জন্য তাদের ক্রমবিকাশকের সন্নিধানে মওজুদ থাকবে; এটিই সৎকর্মশীলদের পুরস্কার,  \n\n \n\n" +
                " ০৩৯:০৩৫] যেন আল্লাহ্ তাদের কৃত-কর্মের অনিষ্টকে তাদের থেকে দূর করে দেন (ভালকাজের বিনিময়ে মন্দকাজ মুছে) এবং তাদের কৃত-কর্মের মধ্যে সর্বোত্তম কাজ অনুযায়ী তাদেরকে তাদের পুরস্কার দান করেন।  \n\n \n\n" +
                " ০৩৯:০৩৬] আল্লাহ্ কি তাঁর বান্দার জন্য যথেষ্ট নন? তথাপি তারা আপনাকে তাঁর পরিবর্তে কল্পিত পৃথকসত্বা (পীর-পুরোহিত-যাযক-হুজুর)দের ভয় দেখায়। এবং যাকে আল্লাহ্ বিপথগামী সাব্যস্ত করেন তার জন্য অন্য কেউ সুপথ প্রদর্শক নেই।  \n\n \n\n" +
                " ০৩৯:০৩৭] এবং আল্লাহ্ যাকে সুুপথপ্রাপ্তির নির্দেশনা দান করেন তার জন্য কেউই পথভ্রষ্টকারী হতে পারে না। আল্লাহ্ কি ভালবাসা-কনার মহাসমূদ্র, ক্ষতিপূরণদাতা নন?  \n\n \n\n" +
                " ০৩৯:০৩৮] এবং যদি আপনি তাদেরকে জিজ্ঞেস করেন, কে বায়ুমণ্ডলগুলো ও পৃথিবীগুলোকে সৃষ্টি করেছেন? তারা নিশ্চই বলবে, \"আল্লাহ্\"। আপনি বলুন, \"তোমরা কি ভেবে দেখেছ, আল্লাহর স্থলে তোমরা যাদেরকে ডাক আল্লাহ্ আমার অনিষ্ট করতে চাইলে তারা কি তাঁর অনিষ্টকে দূর করতে পারবে? অথবা আল্লাহ্ আমাকে রহমত দান করতে চাইলে, তারা কি তাঁর রহমতকে রোধ করতে পারবে?\" আপনি বলুন, \"আল্লাহ্ই আমার জন্য যথেষ্ট। তাঁরই উপর নির্ভরশীলরা নির্ভর করে থাকে।\"  \n\n \n\n" +
                " ০৩৯:০৩৯] আপনি বলুন, \"হে আমার জাতি ! তোমরা নিজ নিজ সাধ্য অনুযায়ী কাজ করতে থাক আমিও (আমার সাধ্য অনুযায়ী) কাজ করব, অতঃপর তোমরা শীঘ্রই জানতে পারবে,  \n\n \n\n" +
                " ০৩৯:০৪০] কার উপর সেই দুঃখ-কষ্ট আসে, যা তাকে লাঞ্ছিত করে এবং কার উপর স্থায়ী যন্ত্রণা আপতিত হয়?\"  \n\n \n\n" +
                " ০৩৯:০৪১] নিশ্চই আমরা মানবমগুলীর কল্যাণের জন্য আপনার কাছে এ গ্রন্থ বিজ্ঞানসহ অবতীর্ণ করেছি। অতএব যে ব্যক্তি সুপথপ্রাপ্তির নির্দেশনা অবলম্বন করে, আসলে সে নিজেরই কল্যাণ সাধনে এমন করে এবং যে ব্যক্তি পথভ্রষ্ট হয়, বস্তুতঃ সে নিজেরই ক্ষতির জন্য পথভ্রষ্ট হয়। এবং আপনি তাদের অভিভাবক নন।  \n\n \n\n" +
                " ০৩৯:০৪২] আল্লাহ্ মানুষের প্রান তাদের মৃত্যুর সময় নিয়ে নেন(প্রতিটি কোষের রক্ষাকারী ফেরেস্তা সম্পূর্ণ প্রত্যাহার করে), এবং যাদের মৃত্যু হয় নাই (তাদের প্রানও) তাদের নিদ্রাকালে(প্রতিটি কোষের রক্ষাকারী ফেরেস্তা আংশিক প্রত্যাহার করে)। অতঃপর যাদের জন্য মৃত্যুর নিশ্চিত করেন তাদের প্রান ধরে রাখেন(ফেরেস্তাদের না ফিরিয়ে দিয়ে), এবং অন্যগুলোকে এক নিদিষ্ট কালের জন্য ফিরিয়ে দেন (ফেরেস্তাদের ফিরিয়ে দিয়ে)। নিশ্চই এতে চিন্তাশীল জাতির জন্য অনেক নিদর্শন আছে।  \n\n \n\n" +
                " ০৩৯:০৪৩] তারা কি আল্লাহকে ছেড়ে মধ্যস্থতাকারী ধরেছে? আপনি বলুন, \"যদি তাদের কোন ক্ষমতা না থাকে, এবং তাদের কোন বুদ্ধিও না থাকে, তবুও কি ?\"  \n\n \n\n" +
                " ০৩৯:০৪৪] আপনি বলুন, \"সকল প্রকার মধ্যস্থতা(শাফায়াত) আল্লাহর নিজের অধিকারে। বায়ুমণ্ডলগুলো ও পৃথিবীগুলোর মালিকানা তাঁরই। অতঃপর তাঁরই দিকে তোমরা প্রত্যাবর্তিত হবে।\"  \n\n \n\n" +
                " ০৩৯:০৪৫] এবং যখন আল্লাহকে এককসত্বা হিসেবে স্মরণ করা হয়, তখন যারা পরকাল মানে না তাদের মন-মগজ ঘৃণায় সংকুচিত হয়, এবং যখন তাঁকে ছাড়া অন্যদের (পীর-পুরোহিত-যাযক-হুজুরদের) কথা উল্লেখ করা হয় অমনি তারা হর্যোৎফুল্ল হয়।  \n\n \n\n" +
                " ০৩৯:০৪৬] আপনি বলুন, \"হে আল্লাহ্ ! বায়ুমণ্ডলগুলো ও পৃথিবীগুলোর আদি স্রষ্টা, অদৃশ্য ও দৃশ্য সকল বিষয়ের পরিজ্ঞাতা; আপনিই আপনার বান্দাদের মধ্যে সেসব বিষয়ের মীমাংসা করবেন যে সম্বন্ধে তারা মতভেদ করছে।\"  \n\n \n\n" +
                " ০৩৯:০৪৭] এবং যা কিছু পৃথিবীতে আছে যদি অন্যায়কারীরা সেসব কিছুর মালিক হত, বরং তার সঙ্গে তেমন আরও থাকত তাহলে তারা নিশ্চই তা পুনরুত্থান দিবসে রোগ-যন্ত্রনা দুঃখ-কষ্ট থেকে রক্ষা পাওয়ার জন্য মুক্তিপণ হিসেবে পেশ করত, এবং আল্লাহর তরফ থেকে তাদের সম্বন্ধে প্রকাশিত হবে গণনাতীত বিষয় ।  \n\n \n\n" +
                " ০৩৯:০৪৮] এবং প্রকাশিত হবে তাদের মন্দকাজের ফল যা তারা অর্জন করেছে, এবং বিজ্ঞান নিয়ে তারা যা ঠাট্টা-বিদ্রুপ করত ।  \n\n \n\n" +
                " ০৩৯:০৪৯] এবং যখন মানুষকে কোন কষ্ট স্পর্শ করে তখন সে আমাদেরকে ডাকে। কিন্তু যখন আমরা তাকে আমাদের থেকে কোন পুরস্কার দেই, তখন সে বলে, \"এটিতো আমাকে আমার জ্ঞানের কারণে দেয়া হয়েছে।\" না, বরং এটি এক পরীক্ষা; কিন্তু তাদের অধিকাংশই এটি জানে না।  \n\n \n\n" +
                " ০৩৯:০৫০] তাদের পূর্ববতীরাও এমন কথা বলত; কিন্তু তাদের অর্জিত সম্পদ তাদের কোন উপকারে লাগে নাই।  \n\n \n\n" +
                " ০৩৯:০৫১] এবং তাদের অর্জিত সম্পদের মন্দফল তাদের উপর আপতিত হল। এদের মধ্যেও যারা অন্যায়কাজ করেছে তাদের উপর তাদের অপকর্মের মন্দফল অবশ্যই আপতিত হবে; এবং তারা (আল্লাহকে) অক্ষম করতে পারবে না।  \n\n \n\n" +
                " ০৩৯:০৫২] তারা কি জানে না, আল্লাহ্ যার জন্য চান জীবিকা প্রশস্ত করে দেন এবং পরিমিত পরিমাপে দেন ? নিশ্চই এর মধ্যে স্বীকারকারী জাতির জন্য অনেক আয়াত(নিদর্শন) আছে।  \n\n \n\n" +
                " ০৩৯:০৫৩] আপনি বলুুন, \"হে নিজেদের উপর অপরিমিতাচারী বান্দারা ! তোমরা আল্লাহর রহমত থেকে নিরাশ হবে না, নিশ্চই আল্লাহ্ সকল পাপ সংশোধন করেন। নিশ্চই তিনি অতীব সংশোধনকারী, এককসত্তা দয়াময়;  \n\n \n\n" +
                " ০৩৯:০৫৪] এবার তোমাদের ঝুঁকার পালা তোমাদের ক্রমবিকাশকের দিকে, এবং তাঁর কাছে নিজেদেকে সমর্পণ কর, তোমাদের উপর সেই দুঃখ-কষ্ট আসার আগে, যার পর তোমাদের আর কোন সাহায্য করা হবে না;  \n\n \n\n" +
                " ০৩৯:০৫৫] এবং তোমরা সর্বোত্তম শিক্ষার অনুসরণ কর, যা তোমাদের প্রতি তোমাদের ক্রমবিকাশক থেকে অবতীর্ণ হয়েছে, তোমাদের উপর, তোমরা বুঝতে পারার আগেই, অকস্মাৎ দুঃখ-কষ্ট চলে আসে ।  \n\n \n\n" +
                " ০৩৯:০৫৬] পাছে যেন কোন ব্যক্তি এমন কথা না বলে, \"আল্লাহ্ সম্বন্ধে আমি যে অতিরিক্ত মাত্রায় উপহাস করেছি তার জন্য আক্ষেপ ! যেহেতু আমি উপহাসকারীদের অন্তর্ভুক্ত ছিলাম,\"  \n\n \n\n" +
                " ০৩৯:০৫৭] অথবা পাছে কোন ব্যক্তি যেন না বলে, \"যদি আল্লাহ্ আমাকে সুপথপ্রাপ্তীর নির্দেশনা দিতেন তাহলে নিশ্চই আমি সচেতনদের অন্তর্ভুক্ত হতাম,\"  \n\n \n\n" +
                " ০৩৯:০৫৮] অথবা যখন দুঃখ-কষ্টকে দেখবে তখন যেন সে এমন না বলে, \"যদি আমার জন্য (ইহকালীন জীবনে) ফিরে যাওয়া সম্ভব হত, তাহলে আমি সৎকর্মশীদের অন্তর্ভুক্ত হতাম।\"  \n\n \n\n" +
                " ০৩৯:০৫৯] না, বরং তোমার কাছে আমার আয়াতগুলো এসেছিল তখন তুমি সেগুলিকে অহংকারের সাথে মিথ্যা প্রতিপন্ন করেছিলে এবং তুমি ছিলে অস্বীকারকারীদের অন্তর্ভূক্ত !’  \n\n \n\n" +
                " ০৩৯:০৬০] এবং যারা আল্লাহর বিরুদ্ধে মিথ্যা বলেছে, পুরুত্থান দিবসে আপনি তাদেরকে দেখতে পাবেন, তাদের মুখমন্ডল কালো রংএর।  \n\n \n\n" +
                "অহংকারীদের জন্য কি অনুতাপের আবাসস্থল নেই?  \n\n \n\n" +
                " ০৩৯:০৬১] এবং আল্লাহ্ সচেতনদেরকে বিজয়ী অবস্থায় বিদ্যমান রাখবেন, কোন অমঙ্গল তাদেরকে স্পর্শ করবে না, এবং তারা দুঃখিতও হবে না।  \n\n \n\n" +
                " ০৩৯:০৬২] আল্লাহ্ সকল বস্তুর স্রষ্টা এবং তিনি সকল বিষয়ের উপর অভিভাবক।  \n\n \n\n" +
                " ০৩৯:০৬৩] বায়ুমণ্ডলগুলো ও পৃথিবীগুলোর চাবি তাঁরই হাতে আছে, এবং যারা আল্লাহর আয়াত গুলোকে অস্বীকার করে তারাই ক্ষতিগ্রস্ত।  \n\n \n\n" +
                " ০৩৯:০৬৪] আপনি বলুন, \"হে মূর্খরা ! তোমরা কি আমাকে আল্লাহ্ ছাড়া অন্য কারও সেবা-কাজ(ইবাদত) করতে আদেশ দিচ্ছ?\"  \n\n \n\n" +
                " ০৩৯:০৬৫] অথচ আল্লাহর তরফ থেকে আপনার কাছে এবং আপনার পূর্ববতীদের কাছে প্রত্যদেশ করা হয়েছিল, \"যদি আপনি আল্লাহ থেকে কাউকে পৃথকসত্বা কল্পনা(শির্ক) করেন তাহলে আপনার ভালকাজ বৃথা যাবে এবং আপনি ক্ষতিগ্রস্ত লোকদের অন্তর্ভুক্ত হবেন।  \n\n \n\n" +
                " ০৩৯:০৬৬] বরং আল্লাহর সেবাকাজ করুন এবং কৃতজ্ঞ বান্দাদের মধ্যে শামিল হোন।\"  \n\n \n\n" +
                " ০৩৯:০৬৭] এবং তারা আল্লাহর বিজ্ঞানের সক্ষমতা ধারণাও করতে পারে নাই। এবং পুনরুত্থানের দিন সবগুলো পৃথিবী একত্রে তাঁর করায়ত্ত হবে (মানুষ পৌঁছে গিয়ে সর্বোন্নত করে গড়ে তুলবে) এবং মহাকাশ-পথগুলো তাঁর ডান হাতের নিয়ন্ত্রণে গুটানো থাকবে (ছোট হয়ে আসবে অর্থাৎ মানুষ অতি উচ্চগতি লাভ করবে)। তিনি মৌলিক, নিয়মশীল, আসলে তাঁর সাথে যা কিছুকে পৃথকসত্বা কল্পনা করা হয়, সেসব থেকে তিনি বহু বহু উর্ধ্বে।  \n\n \n\n" +
                " ০৩৯:০৬৮] এবং যখন সিগনাল ধ্বনিত হবে, তখন বায়ুমণ্ডলগুলো ও পৃথিবীগুলোতে যারা আছে তারা হতবাক হয়ে পড়বে কেবল তারা ছাড়া যাদেরকে আল্লাহ্ বাদ রাখতে চাইবেন। অতঃপর এতে দ্বিতীয় বার সিগনাল ধ্বনিত হবে (পৃথিবীগুলোকে বেহেস্ত হিসেবে উদ্বোধন করা হবে), তখন দেখবেন ! তারা (স্থায়ীভাবে) প্রতিষ্ঠা লাভ করেছে।  \n\n \n\n" +
                " ০৩৯:০৬৯] এবং পৃথিবী তার ক্রমবিকাশকের শিক্ষার আলোয় আলোকিত হয়ে উঠবে এবং বই-পত্রগুলো সামনে রাখা হবে এবং নবীদরকে (শিক্ষা দেয়ার জন্য) এবং সাক্ষী-ফেরেস্তাদেরকে উপস্থিত করা হবে এবং তাদের জন্য বিজ্ঞানের ভিত্তিতে বসতি গড়ে দেয়া হবে এবং তারা আর কখনও ভুল করবে না।  \n\n \n\n" +
                " ০৩৯:০৭০] এবং প্রত্যেক ব্যক্তিকে তার কাজের পূর্ণ প্রতিফল দেয়া হবে। এবং তারা যা কিছু করে তিনি তা সর্বাধিক জানেন।  \n\n \n\n" +
                " ০৩৯:০৭১] এবং অস্বীকারকারীদেরকে দলে দলে অনুতাপস্থলের দিকে হাঁকিয়ে নিয়ে যাওয়া হবে, এমন কি যখন তারা এর নিকট উপস্থিত হবে তখন এর দরজাগুলো খুলে দেয়া হবে এবং এর প্রহরীরা তাদেরকে বলবে, তোমাদের কাছে কি তোমাদের মধ্য থেকে রসূলরা আসেন নাই যারা তোমাদের কাছে তোমাদের ক্রমবিকাশকের আয়াতগুলো পাঠ করে শুনাতেন এবং তোমাদেরকে তোমাদের এই দিনের সাক্ষাৎ সম্বন্ধে সতর্ক করতেন? তারা বলবে, \"হ্যাঁ অবশ্যই;\" কিন্তু অস্বীকারকারীদের উপর দুঃখ-কষ্টের কথা পূর্ণ হল (যা পূর্ণ হওয়া অবধারিত ছিল)।  \n\n \n\n" +
                " ০৩৯:০৭২] তাদেরকে বলা হবে, \"তোমরা অনুতাপস্থলের উপাদানগুলোতে (হাহুতাশ, দীর্ঘশ্বাস, আফসোস, ফুঁপিয়ে কান্না) অন্তর্ভূক্ত হও, এ অবস্থায় তোমরা দীর্ঘকাল অবস্থান করবে। এবং অহংকারীদের আবাসস্থল অত্যন্ত মন্দ।\"  \n\n \n\n" +
                " ০৩৯:০৭৩] এবং যারা তাদের ক্রমবিকাশকের জন্য সচেতনতা অবলম্বন করতোতাদেরকে দলে দলে জান্নাতের দিকে হাঁঁকিয়ে নিয়ে যাওয়া হবে, এমনকি যখন তারা সেটির কাছে পৌঁছাবে এবং তার দরজাগুলো খুলে দেয়া হবে এবং তার প্রহরীরা তাদেরকে বলবে, \"তোমাদের উপর শান্তি বর্ষিত হোক, তোমরা সুখী হও, এবং তোমরা এতে চিরকাল অবস্থান করার জন্য প্রবেশ কর।\"  \n\n \n\n" +
                " ০৩৯:০৭৪] এবং তারা বলবে, \"সকল ধন্যবাদ আল্লাহর যিনি আমাদের সাথে কৃত তাঁর প্রতিশ্রুতি পূর্ণ করেছেন এবং যিনি আমাদেরকে এ মহাবিশ্বের উত্তরধিকারী করেছেন, আমরা জান্নাতের যেখানে ইচ্ছা অবস্থান করব।\" যেহেতু সৎকর্মশীলদের প্রতিদান কতই না উত্তম !  \n\n \n\n" +
                " ০৩৯:০৭৫] এবং আপনি ফিরিশতাদেরকে নিউক্লিয়াসের চারদিকে সজ্জিত অবস্থায় দেখবেন, যারা তাদের ক্রমবিকাশকের দেয়া দায়িত্ব সুনিয়মে ও প্রশংসার সাথে পালন করছে এবং তাদের সকলের মধ্যে বিজ্ঞান সম্মতভাবে কর্মবণ্টন করা হবে এবং বলা হবে, \"সকল ধন্যবাদ আল্লাহর, যিনি মহাবিশ্বের ক্রমবিকাশক।\"  \n\n \n\n"
        );
        editor.putString("38", "পরিচ্ছেদ ০৩৮.দৃশ্যঃ খাঁটি-বিবরণ (সূরা সাদ the truth)  \n\n \n\n" +
                "এটি মক্কী সূরা, বিসমিল্লাহ সহ এতে ৮৯ আয়াত এবং ৫ রুকূ আছে।  \n\n \n\n" +
                " ০৩৮:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০৩৮:০০১] খাঁটি- একটি স্মারকের কথা বলছি  \n\n \n\n" +
                " ০৩৮:০০২] কিন্তু যারা অস্বীকার করে তারা অহংকার এবং শত্রুতায় নিমগ্ন রয়েছে।  \n\n \n\n" +
                " ০৩৮:০০৩] কতই না জনগোষ্ঠীকে আমরা তাদের আগে ধ্বংস করেছি ! তখন তারা (সাহায্যের জন্য) আর্তনাদ করেছিল, অথচ তখন বাঁচার সময় ছিল না।  \n\n \n\n" +
                " ০৩৮:০০৪] এবং তারা বিস্মিত হয়, তাদের কাছে তাদেরই মধ্য থেকে একজন সতর্ককারী এসেছে, এবং অস্বীকারকারীরা বলে, \"এ-তো একজন যাদুকর, বড়ই মিথ্যাবাদী।  \n\n \n\n" +
                " ০৩৮:০০৫] কী ! সে বহু ইশ্বরকে এক উদ্ভাবনীশক্তি বানিয়ে নিয়েছে? নিশ্চই এটি এক তাজ্জবের ব্যাপার।\"  \n\n \n\n" +
                " ০৩৮:০০৬] এবং তাদের মধ্যে প্রধাণরা এই বলে চলে গেল যে, \"তোমরা এখান থেকে চলে যাও, এবং তোমাদের ইশ্বরদেরর উপর অবিচল থাক। নিশ্চই এটি এমন এক বিষয় যা দিয়ে কোনও একটা মতলব আঁটা হয়েছে;  \n\n \n\n" +
                " ০৩৮:০০৭] আমরা এমন কথা আগের কোন ধর্মমতে কখনও শুনি নাই। এটি মনগড়া মিথ্যা ছাড়া আর কিছু নয়;  \n\n \n\n" +
                " ০৩৮:০০৮] আমাদের (সারা জাতির) মধ্য থেকে কি কেবল তারই উপরই এ উপদেশ-বাণী অবতীর্ণ হয়েছে?\" না বরং তারা আমার উপদেশ-বাণী সম্বন্ধে সন্দেহে পড়ে আছে। না, বরং তারা এখন পর্যন্ত আমার শাস্তির স্বাদই পায় নাই।  \n\n \n\n" +
                " ০৩৮:০০৯] আপনার ভালবাসা-কনার মহা-সমূদ্র ও এককসত্তা দানশীল ক্রমবিকাশকের রহমতের ভাণ্ডারগুলো কি তাদের কাছে আছে?  \n\n \n\n" +
                " ০৩৮:০১০] অথবা বায়ুমণ্ডলগুলো ও পৃথিবীগুলো এবং এতদুভয়ের মধ্যে যা কিছু আছে সব কিছুর আধিপত্য কি তাদের কবযায় আছে? যদি তাই হয় তাহলে তারা যেন তাদের রকেটগুলোর সাহায্যে উপরে আরোহন করে।  \n\n \n\n" +
                " ০৩৮:০১১] (তারা) বিভিন্ন দল সমন্বয়ে একটি সেনাবাহিনী, যারা সেখানে পরাভূত হবে।  \n\n \n\n" +
                " ০৩৮:০১২] তাদের পূর্বেই নূহের জাতি এবং আদ এবং বিমানবহরের অধিকারী ফেরাউনও (নবীদেরকে) মিথ্যা প্রতিপন্ন করে অস্বীকার করেছিল;  \n\n \n\n" +
                " ০৩৮:০১৩] (অনুরুপভাবে) সামুদ্ ও লুতের জাতি এবং ঝোঁপের অধিবাসীরা(bush-man)-এরাও সংঘদ্ধ দল ছিল।  \n\n \n\n" +
                " ০৩৮:০১৪] (তাদের) প্রত্যেকেই রসূলদেরকে মিথ্যা প্রতিপন্ন করে প্রত্যাখ্যান করেছিল, পরিণামে আমার শাস্তি (তাদের বিরুদ্ধে) কার্যকরী হল।  \n\n \n\n" +
                " ০৩৮:০১৫] এবং এসব লোক কেবল একটি বিকট শব্দকারী শাস্তির অপেক্ষা করছে, যাতে কোনও বিলম্ব হবে না।  \n\n \n\n" +
                " ০৩৮:০১৬] তারা বলে, \"হে আমাদের ক্রমবিকাশক ! প্রতিফল দিবসের আগেই আমাদেরকে আমাদের প্রাপ্য অংশ তাড়াতাড়ি দিয়ে দাও।  \n\n \n\n" +
                " ০৩৮:০১৭] তারা যা কিছু বলে তাতে আপনি ধৈর্য্য ধারণ করুন, এবং আমাদের বান্দা দাউদের কথা মনে করুন, যে বড় শক্তির অধিকারী ছিল, নিশ্চই সে (আল্লাহর দিকে) বার বার ঝুঁকত।  \n\n \n\n" +
                " ০৩৮:০১৮] নিশ্চই আমরা পর্বতগুলোকে (তার বিমানবন্দর হিসেবে) সেবায় নিয়োজিত করেছিলাম-তারা সন্ধ্যায় এবং সকালে তার সাথে আমার দেয়া দায়িত্ব পালন(বিমান উঠানামা) করত।  \n\n \n\n" +
                " ০৩৮:০১৯] এবং বিমানগুলোকেও একত্রিত (বিমানবহর) করে; যারা সকলে তার অনুগত (প্রস্তুত) হয়ে থাকত।  \n\n \n\n" +
                " ০৩৮:০২০] এবং তার রাজ্যকে সুদূঢ় করেছিলাম এবং তাকে বিজ্ঞান-প্রযূক্তি এবং অকাট্য বাগ্মিতা (বক্তৃতার শক্তি) দান করেছিলাম।  \n\n \n\n" +
                " ০৩৮:০২১] এবং আপনার কাছে কি কলহকারীদের খবর পৌছেছে যথন তারা প্রাচীর ডিঙ্গিয়ে (তার) ব্যক্তিগত চেম্বারে ঢুকে পড়েছিল।  \n\n \n\n" +
                " ০৩৮:০২২] যখন তারা দাউদের নিকট পৌঁছল, তখন সে তাদেরকে দেখে শঙ্কিত হয়ে পড়ল। তারা বলল, \"ভয় কোরও না, আমরা দুই বিবদমান পক্ষ: আমাদের একজন অন্যজনের প্রতি হিংশাত্বক-নোংরা আচরণ করছে; সুতরাং তুমি আমাদের মধ্যে বিজ্ঞানভিত্তিক (যূক্তিযূক্ত) বিচার কর এবং অবিচার কোরও না এবং তুমি আমাদেরকে সঠিক সোজা সুপথে পরিচালিত কর।  \n\n \n\n" +
                " ০৩৮:০২৩] এই লোকটি আমার ভাই, তার কাছে নিরানব্বইটি দুম্বা আছে এবং আমার কাছে একটি মাত্র দুম্বা আছে। তবুও সে বলে, এটি আমাকে দিয়ে দাও ; এবং কথা-বার্তার প্যাঁচে সে আমাকে পরাজিত করে।\"  \n\n \n\n" +
                " ০৩৮:০২৪] সে (দাউদ) বলল, \"নিশ্চই সে তোমার দুম্বা নিজ দুম্বা গুলোর সাথে সংযোগ করার দাবি জানিয়ে তোমার প্রতি অন্যায় করেছে। এবং অধিকাংশ মিশ্র-পরিবারে এমনই অবস্থা যে, তারা একে অন্যের(প্রাপ্য অংশের) উপর অন্যায় করে থাকে, কেবল তারা ছাড়া যারা আল্লাহকে এককসত্তা মেনে নেয় এবং ভালকাজ করে,\" কিন্তু তাদের সংখ্যাও নগন্য। এবং দাউদ মনে করল যে, আমরা তাকে পরীক্ষা করছি, সুতরাং সে তার ক্রমবিকাশকের কাছে সংশোধন প্রার্থনা করতে লাগল এবং বিনয়ের সাথে ভুমিতে পড়ে গেল এবং (আল্লাহর দিকে) সমর্পিত হল ।  \n\n \n\n" +
                " ০৩৮:০২৫] তখন আমরা তাকে সংশোধন করলাম; নিশ্চই তার জন্য আমাদের দরবারে নৈকট্য এবং উত্তম আশ্রয়স্থল নির্ধারিত আছে।  \n\n \n\n" +
                " ০৩৮:০২৬] (আমরা বললাম) হে দাউদ! আমরা তোমাকে পৃথিবীতে খলিফা নিযুক্ত করেছি; অতএব তুমি মানুষের মধ্যে বিজ্ঞান-প্রযূক্তির সাহায্যে বিচার কর এবং নিজ খামখেয়ালীর অনুসরণ করবে না, নতুবা এটি তোমাকে আল্লাহর পথ থেকে ভ্রষ্ট করে ফেলবে। নিশ্চই যারা আল্লাহর পথ থেকে ভ্রষ্ট হয় তাদের জন্য কঠিন যন্ত্রণা আছে, কারণ তারা প্রতিফল দিবসকে ভুলে বসে আছে।  \n\n \n\n" +
                " ০৩৮:০২৭] এবং আমরা বায়ুমণ্ডলগুলো ও পৃথিবীগুলো এবং এদের উভয়ের মধ্যে যা কিছু আছে, বৃথা সৃষ্টি করি নাই। এটি তাদের ধারণা যারা অস্বীকার করেছে। সুতরাং যারা অস্বীকার করেছে তাদের জন্য অনুতাপের আগুনে দগ্ধ হওয়া অবধারিত আছে।  \n\n \n\n" +
                " ০৩৮:০২৮] যারা আল্লাহর এককসত্তা মেনে নিয়েছে এবং ভালকাজ করেছে আমরা কি তাদেরকে পৃথিবীতে বিশৃংখলা সৃষ্টিকারীদের সমান গণ্য করব? অথবা সচেতনদেরকে কি আমরা দুষ্কৃতকারীদের সমতুল্য করব?  \n\n \n\n" +
                " ০৩৮:০২৯] এটি(কুরআন) এমন এক গ্র্ন্থ, যা আমরা আপনার প্রতি অবতীর্ণ করেছি, যা অতীব কল্যাণময়, যেন তারা এর আয়াতগুলোকে অনুধাবন করে, এবং ধীসম্পন্ন ব্যক্তিরাই শিক্ষা লাভ করে।  \n\n \n\n" +
                " ০৩৮:০৩০] এবং আমরা দাউদকে দান করেছিলাম সুলায়মান; সে বড়ই চমৎকার বান্দা ছিল। নিশ্চই সে পুনঃপুনঃ ঝুঁকতো ।  \n\n \n\n" +
                " ০৩৮:০৩১] যখন সন্ধ্যাকালে তার সম্মুখে উৎকৃষ্টতম দ্রুতগামী বিমানবহর উপস্থিত করা হয়েছিল।  \n\n \n\n" +
                " ০৩৮:০৩২] তখন সে বলেছিল, \"আমি উৎকৃষ্ট বস্তুর ভালবাসাকে এ কারণে পছন্দ করি, এরা আমার ক্রমবিকাশককে স্মরণ করিয়ে দেয়। এমন কি যখন সেগুলো দৃষ্টির আড়ালে লুকিয়ে গেল;  \n\n \n\n" +
                " ০৩৮:০৩৩] (তখন সুলায়মান বলল) \"সেগুলোকে আমার কাছে ফিরিয়ে আন।\" (যখন সেগুলো আসল) তখন সে সেগুলোর বাঁক ও ককপিটের উপর হাত বুলাতে লাগল।  \n\n \n\n" +
                " ০৩৮:০৩৪] এবং নিশ্চই আমরা সুলায়মানকে পরীক্ষা করেছিলাম এবং তার সিংহাসনে একটা অপদার্থকে (তার ছেলেকে) বসানোর সিদ্ধান্ত নিয়েছিলাম। অতঃপর সে (তার ক্রমবিকাশকের দরবারে) ঝুঁকে পড়ল।  \n\n \n\n" +
                " ০৩৮:০৩৫] সে বলল, হে আমার ক্রমবিকাশক ! আমাকে সংশোধন করুন এবং আমাকে এমন রাজ্য দান করুন যেন আমার পরে অন্য কেউ সেটির উত্তরাধীকারী না হয়, নিশ্চই আপনি পরম দাতা।  \n\n \n\n" +
                " ০৩৮:০৩৬] সুতরাং আমরা বায়ুযানকে তার সেবায় নিয়োজিত করেছিলাম, সে যেদিকে যেতে চাইত সেই দিকেই তার আদেশে বায়ুযান মৃদুভাবে চলতে থাকত,  \n\n \n\n" +
                " ০৩৮:০৩৭] এভাবে (আমরা তার সেবায় নিয়োজিত করেছিলাম) প্রতিজ্ঞাবদ্ধ লোকদেরকে, সকল প্রকার স্থপতিদেরকে এবং ডুবুরীদেরকে।  \n\n \n\n" +
                " ০৩৮:০৩৮] এবং অন্য কতককেও যারা শিকলে বাঁধা থাকত।  \n\n \n\n" +
                " ০৩৮:০৩৯] এগুলো আমাদের উপহার, সুতরাং তুমি (ইচ্ছা করলে) কড়া শাসনে রাখ অথবা আদরে বুকে আশ্রয় দাও ।  \n\n \n\n" +
                " ০৩৮:০৪০] এবং নিশ্চই তার(সুলায়মানের) জন্য আমাদের দরবারে নৈকট্য এবং উত্তম আশ্রয়স্থল নির্ধারিত আছে।  \n\n \n\n" +
                " ০৩৮:০৪১] এবং আমাদের বান্দা আইউবকে স্মরণ করুন, যখন সে তার ক্রমবিকাশককে ডেকেছিল, \"নিশ্চই এক শয়তান(*ক্ষতিকর কীট*) আমাকে স্পর্শ করেছে এবং অত্যন্ত দুঃখ-কষ্ট দিচ্ছে।\"  \n\n \n\n" +
                " ০৩৮:০৪২] (আমরা বললাম)তুমি তোমার পা জোরে চালাও। এইতো সামনে রয়েছে গোসলের এবং খাওয়ার সুশীতল পানি।  \n\n \n\n" +
                " ০৩৮:০৪৩] এবং আমরা তাকে তার পরিবার পরিজন দিয়েছিলাম এবং আমাদের থেকে রহমত হিসেবে তাদের মত আত্মিয়স্বজনও দিয়েছিলাম এবং ধীসম্পন্ন লোকদের জন্য স্মরণীয় সদুপদেশও দিয়েছিলাম।  \n\n \n\n" +
                " ০৩৮:০৪৪] এবং (নির্দেশ দিলাম) তুমি কিছু গুল্ম-লতা এক গোছা নিজ হাতে নাও এবং তা দিয়ে তোমার ক্ষততে লেপন কর এবং মিথ্যার দিকে ঝুঁকো না। নিশ্চই আমরা তাকে ধৈর্যশীল পেয়েছিলাম। সে বড়ই চমৎকার বান্দা ছিল। নিশ্চই সে সবসময় আল্লাহর প্রতি ঝুঁকত।  \n\n \n\n" +
                " ০৩৮:০৪৫] এবং স্মরণ করুন, আমাদের বান্দা ইবরাহীম ও ইসহাক এবং ইয়াকুবের কথা, তারা শক্তিশালী এবং সুক্ষ ও দূরদর্শী লোক ছিল।  \n\n \n\n" +
                " ০৩৮:০৪৬] আমরা তাদেরকে এক বিশেষ উদ্দেশ্যে মনোনীত করেছিলাম- (লোকদেরকে) পারলৌকিক বাসস্থান সমন্ধে স্মরণ করিয়ে দিতে।  \n\n \n\n" +
                " ০৩৮:০৪৭] এবং নিশ্চই তারা আমাদের সন্নিধানে মনোনীত ও উত্তম বান্দাদের অন্তর্ভূক্ত ছিল।  \n\n \n\n" +
                " ০৩৮:০৪৮] এবং স্মরণ করুন, ইসমাইল, ইয়াসা’আ এবং যূল-কিফলের(গৌতম বুদ্ধের) বৃত্তান্ত, তারা সকলেই অতি উত্তম মানুষ ছিল।  \n\n \n\n" +
                " ০৩৮:০৪৯] এটি এক স্মারক-বানী, এবং নিশ্চই সচেতনদের জন্য পরম উৎকৃষ্ট প্রত্যাবর্তনস্থল নির্ধারিত আছে-  \n\n \n\n" +
                " ০৩৮:০৫০] চিরস্থায়ী বাগান(জান্নাত) গুলো, তাদের জন্য সকল দুয়ার সবসময় উন্মুক্ত থাকবে,  \n\n \n\n" +
                " ০৩৮:০৫১] সেখানে তারা বিছানায় হেলান দিয়ে বসবে, সেখানে তারা প্রচুর পরিমাণে ফল-মূল এবং পানীয় বস্তুর জন্য ফরমায়েশ করবে;  \n\n \n\n" +
                " ০৩৮:০৫২] এবং তাদের পাশে থাকবে আনতনয়না সময়বয়স্কা নারীরা।  \n\n \n\n" +
                " ০৩৮:০৫৩] এই হল সেসব জিনিস যা তোমাদেরকে প্রতিফলের দিনে দান করার প্রতিশ্রুতি দেয়া হচ্ছে।  \n\n \n\n" +
                " ০৩৮:০৫৪] নিশ্চই এটি আমাদের দেয়া জীবিকা, যা *কখনও নিঃশেষ হবে না*।  \n\n \n\n" +
                " ০৩৮:০৫৫] এই হল (স্বীকাকারীদের জন্য পুরষ্কার)। কিন্তু বিদ্রোহ পোষনকারী উদ্ধত লোকদের জন্য নির্ধারিত আছে ক্ষতিকর প্রত্যাবর্তনস্থল-  \n\n \n\n" +
                " ০৩৮:০৫৬] \"অনুতাপস্থল\", যাতে তারা দগ্ধ হবে। এটি কতই না মন্দ বিশ্রামস্থল(waiting area)!  \n\n \n\n" +
                " ০৩৮:০৫৭] সুতরাং তাদেরকে এর স্বাদ গ্রহণ করতে হবে- অত্যাধিক গরম পানি এবং অত্যাধিক দুর্গন্ধযুক্ত ঠান্ডা পানি দেয়া হবে।  \n\n \n\n" +
                " ০৩৮:০৫৮] এবং তেমনই আরও থাকবে বিভিন্ন প্রকারের যন্ত্রনা।  \n\n \n\n" +
                " ০৩৮:০৫৯] এরা একটি দল, যারা অনধিকার প্রবেশকারী শান্তিভঙ্গকারী, তোমাদের সাথে অনুতাপস্থলে দাখিল হবে। তাদেরকে কেউ স্বাগত জানাবে না। তারা অবশ্যই আগুনে জ্বলবে।  \n\n \n\n" +
                " ০৩৮:০৬০] তারা(আগের লোকেরা) বলবে, \"বরং তোমরা এমন লোক, যাদেরকে কেউ স্বাগত জানাবে না। তোমরাই (আমাদেরকে বিভ্রান্ত করে) এটিকে(অনুতাপস্থলকে) আমাদের জন্য আগে পাঠিয়েছ। যদিও এটি অতি মন্দ অবস্থানস্থল।\"  \n\n \n\n" +
                " ০৩৮:০৬১] তারা যখন বলবে, হে আমাদের ক্রমবিকাশক ! যে ব্যক্তি আমাদের জন্য এ অবস্থার সৃষ্টি করেছে তুমি তাকে আগুনের মধ্যে দ্বিগুন শাস্তি বর্ধিত করে দাও।  \n\n \n\n" +
                " ০৩৮:০৬২] এবং তারা(অনুতাপগ্রস্থরা) বলবে, \"আমাদের কী হয়েছে, আমরা সেসব লোকদেরকে দেখছি না যাদেরকে আমরা মন্দ বলে গণ্য করতাম,  \n\n \n\n" +
                " ০৩৮:০৬৩] আমরা কি (অযথাই) তাদেরকে উপহাসের পাত্র মনে করতাম, অথবা তাদের সমন্ধে আমাদের দৃষ্টি বিভ্রম ঘটেছে?\"  \n\n \n\n" +
                " ০৩৮:০৬৪] নিশ্চই এটি সত্য – অনুতাপগ্রস্থদের এই তর্ক-বিতর্ক।  \n\n \n\n" +
                " ০৩৮:০৬৫] আপনি বলুন, \"আমি শুধুই একজন সতর্ককারী, এবং আল্লাহ্ ছাড়া কোন উদ্ভাবনীশক্তি নেই, তিনি সর্ব-জয়ী এককসত্বা আল্লাহ ।  \n\n \n\n" +
                " ০৩৮:০৬৬] তিনি বায়ুমণ্ডলগুলো ও পৃথিবীগুলো এবং এদের উভয়ের মধ্যে যা কিছু আছে সব কিছুর ক্রমবিকাশক, যিনি ভালবাসা-কনার মহা-সমূদ্র , অতীব ক্ষমাশীল।  \n\n \n\n" +
                " ০৩৮:০৬৭] আপনি বলুন, \"এটি এক মহা সংবাদ,  \n\n \n\n" +
                " ০৩৮:০৬৮] যা থেকে তোমরা বিমুগ্ধ হচ্ছ;  \n\n \n\n" +
                " ০৩৮:০৬৯] মহাকাশ ফেরেস্তাদল সম্বন্ধে কোন জ্ঞান আমার ছিল না, যখন তারা (তাদের বিষয় নিয়ে) পরস্পর বিতর্ক করছিল।  \n\n \n\n" +
                " ০৩৮:০৭০] আমার প্রতি কেবল এ প্রত্যাদেশ করা হয়, আমি শুধু একজন প্রকাশ্য সতর্ককারী।\"  \n\n \n\n" +
                " ০৩৮:০৭১] (স্মরণ করুন) যখন আপনার ক্রমবিকাশক ফিরিশতাদেরকে বলেছিলেন, আমি অস্থায়ী (মরণশীল) বস্তু থেকে এক মানব সৃষ্টি করতে চলেছি; {প্রান সৃষ্টির আগের ঘোষণা}  \n\n \n\n" +
                " ০৩৮:০৭২] অতঃপর যখন আমি তাকে (বিবর্তন করতে করতে)পূর্ণাঙ্গ করব এবং (যখন) তার মধ্যে আমার *আদেশ-বানী* থেকে প্রেরণ করব তখন তোমরা সেজদা করতে তার সামনে লুটিয়ে পড়বে।  \n\n \n\n" +
                " ০৩৮:০৭৩] তখন ফিরিশতারা সকলেই তার অনুগত্য করল,  \n\n \n\n" +
                " ০৩৮:০৭৪] ইবলিস ছাড়া। সে অহংকার করল, এবং সে অস্বীকারকারীদের অন্তর্ভূক্ত হল।  \n\n \n\n" +
                " ০৩৮:০৭৫] তিনি(আল্লাহ) বললেন, \"হে ইবলীস! আমি যাকে আভিজাত্য দিয়ে সৃষ্টি করেছি তার অনুগত্য স্বীকার করতে তোমাকে কিসে বিরত রেখেছে? তুমি কি অহংকার করছ, নাকি তুমি আমার আদেশ পালন থেকে নিজেকে বহু উর্ধে মনে করছ?\"  \n\n \n\n" +
                " ০৩৮:০৭৬] সে বলল, \"আমি তার অপেক্ষা শ্রেষ্ঠ; আপনি আমাকে আগুন (স্থায়ি বস্তু) থেকে সৃষ্টি করেছেন এবং তাকে অস্থায়ী বস্তু থেকে(মরণশীল করে) সৃষ্টি করেছেন।\"  \n\n \n\n" +
                " ০৩৮:০৭৭] তিনি বললেন, \"তুমি এখান থেকে(মহাকাশ-রেজিমেন্ট থেকে) বের হয়ে যাও, কারণ, নিশ্চই তুমি বিতাড়িত;\"  \n\n \n\n" +
                " ০৩৮:০৭৮] এবং নিশ্চই মহামহাকাল পর্যন্ত আমার ঘৃণা তোমার উপর বিপর্যয় হয়ে পড়তে থাকবে।  \n\n \n\n" +
                " ০৩৮:০৭৯] সে বলল, \"হে আমার ক্রমবিকাশক ! তাহলে আপনি আমাকে সেইদিন পর্যন্ত অবকাশ দিন যখন তাদেরকে পুনরুথিত করা হবে।  \n\n \n\n" +
                " ০৩৮:০৮০] তিনি বললেন, \"নিশ্চই তুমি অবকাশ-প্রাপ্তদের অন্তর্ভুক্ত,  \n\n \n\n" +
                " ০৩৮:০৮১] সেই সুবিদিত সময়ের দিন পর্যন্ত\"  \n\n \n\n" +
                " ০৩৮:০৮২] সে বলল, \"সুতরাং আপনার ইজ্জতের কসম, নিশ্চই আমি তাদের সকলকেই বিভ্রান্ত করব,  \n\n \n\n" +
                " ০৩৮:০৮৩] তাদের থেকে কেবল তোমার বিশুদ্ধ বান্দারা ছাড়া।\"  \n\n \n\n" +
                " ০৩৮:০৮৪] তিনি বললেন, \"অতএব সত্য এটিই,\" এবং আমি সত্যই বলি-  \n\n \n\n" +
                " ০৩৮:০৮৫] \"আমি নিশ্চই তোমাকে দিয়ে এবং তাদের মধ্য থেকে যারা তোমার অনুসরণ করবে তাদের সকলকে দিয়ে অনুতাপস্থলকে পূর্ণ করব।\"  \n\n \n\n" +
                " ০৩৮:০৮৬] আপনি বলুন, \"আমি এর জন্য তোমাদের থেকে কোন প্রতিদান চাই না, এবং আমি ভানকারীদের অন্তর্ভুক্ত নই,  \n\n \n\n" +
                " ০৩৮:০৮৭] নিশ্চই এটি (কুরআন) মহাবিশ্বের সকলের জন্য স্মারক-বানী ছাড়া অন্য কিছু নয়।  \n\n \n\n" +
                " ০৩৮:০৮৮] এবং তোমরা স্বল্পকাল পরে এর (সত্যতার) সংবাদ অবশ্যই জানতে পারবে।\"");
        editor.putString("36", " পরিচ্ছেদ ০৩৬.দৃশ্যঃ হে খাঁট নেতা (সূরা ইয়াসীন Oh perfect leader)  \n\n \n\n" +
                "এটি মক্কী সূরা, বিসমিল্লাহ সহ এতে ৮৪ আয়াত এবং ৫ রুকূ আছে।  \n\n \n\n" +
                " ০৩৬:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০৩৬:০০১] ইয়াসীন(হে খাঁট নেতা),  \n\n \n\n" +
                " ০৩৬:০০২] বিজ্ঞান-প্রযূক্তি পূর্ণ কুরআনের কথা বলছি,  \n\n \n\n" +
                " ০৩৬:০০৩] নিশ্চই আপনি(মুহাম্মদ) রসূলগণের অন্তর্ভূক্ত,  \n\n \n\n" +
                " ০৩৬:০০৪] সরল-সুদূঢ় পথে প্রতিষ্ঠিত।  \n\n \n\n" +
                " ০৩৬:০০৫] (এ কুরআন) ভালবাসা-কনার মহাসমূদ্র , মহাবিজ্ঞানী থেকে অবতারিত,  \n\n \n\n" +
                " ০৩৬:০০৬] যেন আপনি সে জাতিকে সতর্ক করেন, যাদের পূর্বপুরুষদেরকে সতর্ক করা হয় নাই, ফলে তারা উদাসীন।  \n\n \n\n" +
                " ০৩৬:০০৭] তাদের বেশিরভাগ সমন্ধে আদেশ-বানী অবশ্যই বৈজ্ঞানিকভাবে প্রযূক্ত হয়েছে, অতএব তারা আল্লাহর এককসত্বা মানবে না।  \n\n \n\n" +
                " ০৩৬:০০৮] নিশ্চই আমরা তাদের গলায় বেড়ি পরিয়ে (১০৫ফুট লম্বা)শিকলে ঝুলিয়ে দিয়েছি, তাই তারা শিকলের দিকে মাথা উচু করে আছে।  \n\n \n\n" +
                " ০৩৬:০০৯] এবং আমরা তাদের সামনে এক প্রতিবন্ধক এবং পিছনেও এক প্রতিবন্ধক সৃষ্টি করে দিয়েছি এবং তাদেরকে ঢেকে দিয়েছি (\"D\" আকৃতির পরমানু-চুল্লি বা সাকারে); সুতরাং তারা(নিচে) দেখতে পারে না ।  \n\n \n\n" +
                " ০৩৬:০১০] এবং আপনি তাদেরকে সতর্ক করেন বা না করেন তাদের জন্য উভয়ই সমান, তারা আল্লাহর এককসত্তা মেনে নেবে না।  \n\n \n\n" +
                " ০৩৬:০১১] আপনি শুধু সে ব্যক্তিকে সতর্ক করতে পারেন, যে স্মারক-বানীর অনুসরণ করে, এবং অজান্তেই রহমান আল্লাহর সচেতনতা অবলম্বন করে চলে। অতএব আপনি তাকে সংশোধন এবং সম্মানজনক পুরষ্কারের শুভ সংবাদ দিন ।  \n\n \n\n" +
                " ০৩৬:০১২] নিশ্চই আমরাই মৃত বস্তু-কনায় প্রান সঞ্চার করি এবং তারা যা কিছু আগে আগে প্রেরণ করে এবং যা কিছু পিছনে ফেলে যায় সবই আমরা লিপিবদ্ধ করে রাখি, বস্তুতঃ প্রত্যেক বস্তুকেই আমরা গুণে গুনে রাখছি সুস্পষ্ট ডাইরীতে ।  \n\n \n\n" +
                " ০৩৬:০১৩] এবং আপনি তাদের কাছে এক জনপদের অধিবাসীদের উপমা বর্ণনা করুন, যখন তাদের কাছে রসূলরা এসেছিল।  \n\n \n\n" +
                " ০৩৬:০১৪] যখন আমরা তাদের কাছে (প্রথমে) দুজন রসুল(মুসা ও হারুন) পাঠিয়েছিলাম তখন তারা উভয়কে মিথ্যাবাদী বলে প্রত্যাখ্যাণ করেছিল, তখন আমরা তৃতীয় একজন রসূল দিয়ে (তাদেরকে) শক্তিশালী করলাম; এবং তারা বলল, \"নিশ্চই আমরা তোমাদের কাছে রসূল হিসেবে প্রেরিত হয়েছি।\"  \n\n \n\n" +
                " ০৩৬:০১৫] তারা উত্তরে বলল, \"তোমরা আমাদের মত মানুষ ছাড়া কিছু নও, এবং রহমান আল্লাহ কিছুই অবতীর্ণ করেন নাই, তোমরা শুধু শুধু মিথ্যে বলছ;\"  \n\n \n\n" +
                " ০৩৬:০১৬] তারা বলল; \"আমাদের ক্রমবিকাশক জানেন, আমরা নিশ্চই তোমাদের কাছে রসূল হিসেবে প্রেরিত হয়েছি;--  \n\n \n\n" +
                " ০৩৬:০১৭] আসলে, আমাদের উপর দায়িত্ব কেবল স্পষ্ট ভাবে (বানী) পৌঁছে দেয়া।\"  \n\n \n\n" +
                " ০৩৬:০১৮] তারা বলল, \"নিশ্চই আমরা তোমাদের(আগমন)কে অশুভ মনে করি, তোমরা যদি তোমাদের কার্যকলাপ থেকে বিরত না হও তাহলে নিশ্চই আমরা তোমাদেরকে বিতাড়িত করব, এবং নিশ্চই আমাদের থেকে তোমাদেরকে যন্ত্রনাদায়ক শাস্তি স্পর্শ করবে।\"  \n\n \n\n" +
                " ০৩৬:০১৯] তারা বলল, \"তোমাদের মন্দ-কর্মফল তোমাদের সাথেই আছে। (তোমরা) কি এটি এজন্য (বলছ) যে তোমাদেরকে সৎ উপদেশ দেয়া হচ্ছে ? বরং তোমরা সীমালঙ্ঘনকারী জাতি।\"  \n\n \n\n" +
                " ০৩৬:০২০] এবং শহরের দূরপ্রান্ত থেকে এক ব্যক্তি(৩য় রসুল) দৌড়ে আসলো, সে বলল, \"হে আমার জাতি ! তোমরা এ রসূলদের অনুসরণ কর।  \n\n \n\n" +
                " ০৩৬:০২১] অনুসরণ কর তাদের, যারা তোমাদের কাছে কোন প্রতিদান চায় না, এবং তারা সুপথপ্রাপ্তীর নির্দেশনা প্রাপ্ত।  \n\n \n\n" +
                " ০৩৬:০২২] এবং আমার কি হয়েছে যে আমি তাঁর সেবাকাজ করব না, যিনি আমাকে সৃষ্টি করেছেন? এবং তাঁরই দিকে তোমাদের সকলকে ফিরিয়ে নিয়ে যাওয়া হবে।  \n\n \n\n" +
                " ০৩৬:০২৩] আমি কি তাঁরস্থলে কল্পিত পৃথকসত্বাদের গ্রহণ করব? যদি রহমান আল্লাহ আমার কোন ক্ষতি করতে চান তাহলে তাদের সুপারিশ আমার কোনও উপকারে লাগবে না, এবং তারা আমাকে বাঁচাতেও পারবে না;  \n\n \n\n" +
                " ০৩৬:০২৪] এমন করলে আমি অবশ্যই প্রকাশ্য ভ্রান্তিতে পড়ব,  \n\n \n\n" +
                " ০৩৬:০২৫] নিশ্চই আমি তোমাদের ক্রমবিকাশকের এককসত্বা মেনে নিয়েছি, অতএব তোমরা আমার কথা শুন।\"  \n\n \n\n" +
                " ০৩৬:০২৬] তাকে বলা হবে তুমি জান্নাতে প্রবেশ কর। সে বলবে, \"হায়, আমার জাতি যদি জানতে পারত-  \n\n \n\n" +
                " ০৩৬:০২৭] যে কিভাবে আমার ক্রমবিকাশক আমাাকে সংশোধন করেছেন এবং আমাকে সম্মানিত লোকদের অন্তুর্ভুক্ত করেছেন।\"  \n\n \n\n" +
                " ০৩৬:০২৮]এবং আমরা তারপর তার জাতির বিরুদ্ধে আকাশ থেকে কোন সৈন্যদল অবতীর্ণ করি নাই এবং আমরা কখনও এভাবে অবতীর্ণ করিনা  \n\n \n\n" +
                " ০৩৬:০২৯] তা কেবল এক প্রচণ্ড বিস্ফোরণ ছিল, তখন তারা নীরব হয়ে গেল (জীবন প্রদীপ নিভে গেল) ।  \n\n \n\n" +
                " ০৩৬:০৩০] পরিতাপ ! বান্দাদের জন্য, তাদের কাছে এমন কোন রসূল আসে নাই, যার প্রতি তারা ঠাট্টা-বিদ্রুপ করে নাই।  \n\n \n\n" +
                " ০৩৬:০৩১] তারা কি দেখে নাই, তাদের পূর্বে আমরা কত জনগোষ্ঠীকে ধ্বংস করে দিয়েছি, তারা কখনও তাদের কাছে ফিরে আসবে না ?  \n\n \n\n" +
                " ০৩৬:০৩২] এবং তাদের(বান্দাদের) সবাইকে একত্রিত করে নিশ্চই আমাদের সামনে উপস্থিত করা হবে।  \n\n \n\n" +
                " ০৩৬:০৩৩] এবং *নির্জীব পৃথিবীও তাদের জন্য এক আয়াত(নিদর্শন)*, আমরা সেটিকে সঞ্জীবিত করি এবং তা থেকে শস্য উৎপন্ন করি, অতঃপর তারা তা আহার করে (মহাকাশের যে কোনও পৃথিবীকেই একইভাবে মানুষের বাসোপযোগী করা সম্ভব)।  \n\n \n\n" +
                " ০৩৬:০৩৪] এবং আমরা তাতে খেজুর এবং আঙ্গুরের বাগানগুলোও উৎপন্ন করি এবং সেগুলোর মধ্যে আমরা ঝরণাও প্রবাহিত করি।  \n\n \n\n" +
                " ০৩৬:০৩৫] যেন তারা তার ফল আহার করে, অথচ তাদের হাত সেগুলো উৎপাদন করে নাই, তবুও কি তারা কৃতজ্ঞতা করবে না?  \n\n \n\n" +
                " ০৩৬:০৩৬] নিয়মশীল তিনি যিনি সকল বস্তুকে জোড়া জোড়া(উভয় সেক্স x y ক্রোমজম) করে সৃষ্টি করেছেন, যা ভূমিতে উৎপন্ন হয়(উদ্ভিদে) এবং তাদের মধ্যে (প্রানিতে) এবং তাদেরও যা তারা (এখনও)জানে না(মৃতদের জেনোম ভ্রূণ) ।  \n\n \n\n" +
                " ০৩৬:০৩৭] এবং *রাত*ও তাদের জন্য একটি আয়াত(নিদর্শন), যার মধ্য থেকে আমরা দিনকে পৃথক করে নেই, আবার তারা  \n\n \n\n" +
                "অন্ধকার হয়ে যায়(মূলতঃ মহাকাশ অন্ধকার, পৃথিবী ঘুরে বলেই যে পিঠে সূর্যের আলো পড়ে সেখানে দিন হয়)।  \n\n \n\n" +
                " ০৩৬:০৩৮] এবং সূর্য তার নিজ কক্ষপথে তাকে প্রদত্ত গতিতে দ্রুতবেগে(২২.৫ কোটি বছরে ১বার) ধাবমান রয়েছে; এটি ভালবাসা-কনার মহাসমূদ্র মহাবিজ্ঞানী আল্লাহর নির্ধারিত নিয়ম।  \n\n \n\n" +
                " ০৩৬:০৩৯] এবং চন্দ্রের জন্য আমরা বিভিন্ন মঞ্জিল নির্ধারিত করেছি, এমন কি (মঞ্জিলগুলি অতিক্রম করতে করতে) সেটি খেজুর গাছের পুরনো শুস্ক শাখার মত সরু হয়ে প্রথম অবস্থায় ফিরে আসে।  \n\n \n\n" +
                " ০৩৬:০৪০] সুর্যের ক্ষমতা নেই যে চন্দ্রকে ধরে(দূরত্বের কারনে) এবং রাতেরও ক্ষমতা নেই যে দিনকে অতিক্রম করে(পৃথিবী আহ্নিক গতির কারনে)। এবং তাদের প্রত্যেকেই মহাকাশে নিজ নিজ কক্ষপথে অবাধে সস্তরণ করে চলছে।  \n\n \n\n" +
                " ০৩৬:০৪১] এবং তাদের জন্য এটিও একটি আয়াত(নিদর্শন), আমরা তাদের বংশধরদেরকে বোঝাই করা নৌযানে বহন করে থাকি।  \n\n \n\n" +
                " ০৩৬:০৪২] এবং আমরা নিশ্চই সেগুলোর মত আরও (যানবাহন) সৃষ্টি করব (বিমান-রকেট-মহাকাশযান) যাতে তারা আরোহন করবে।  \n\n \n\n" +
                " ০৩৬:০৪৩] এবং যদি আমরা চাই তাহলে তাদেরকে নিমজ্জিত করে দিতে পারি, তখন তাদের জন্য কেউ ফরিয়াদ শ্রবণকারী থাকবে না এবং তাদেরকে উদ্ধারও করা হবে না (মহাকাশে)-  \n\n \n\n" +
                " ০৩৬:০৪৪] কেবল আমাদের পক্ষ থেকে রহমত ছাড়া, এবং তা কেবল এক নিদিষ্ট সময় পর্যন্ত ইহকালীন সূখ-সন্তোগ হিসেবে।  \n\n \n\n" +
                " ০৩৬:০৪৫] এবং যখন তাদেরকে বলা হয়, যাকিছু তোমাদের ভবিষ্যতে আছে এবং যাকিছু তোমাদের অতীতে আছে তা থেকে সচেতন হও (অতীতের মূল্যায়ন করে ভবিষ্যতে সঠিক কাজ কর) যেন তোমাদের উপর রহম করা যায় ।  \n\n \n\n" +
                " ০৩৬:০৪৬] এবং যখনই তাদের ক্রমবিকাশকের আয়াত(নিদর্শনাবলী) থেকে কোন নিদর্শন তাদের কাছে আসে তখনই তারা তা থেকে মূখ ফিরিয়ে নেয়।  \n\n \n\n" +
                " ০৩৬:০৪৭] এবং যখন তাদেরকে বলা হয় আল্লাহ তোমাদেরকে যা কিছু দিয়েছেন তা থেকে *খরচ* কর, তখন অস্বীকারকারীরা স্বীকারকারীদেরকে বলে, \"আমরা কি এমন ব্যক্তিকে *খাওয়াব* যাকে আল্লাহ ইচ্ছা করলে নিজে খাওয়াতে পারেন? তোমরা একেবারে স্পষ্ট বিভ্রান্তিতে আছ।\"  \n\n \n\n" +
                " ০৩৬:০৪৮] এবং তারা বলে, \"যদি তোমরা সত্যবাদী হও, তাহলে বল এ প্রতিশ্রুতি কখন পূর্ণ হবে ?\"  \n\n \n\n" +
                " ০৩৬:০৪৯] তারা কেবল একটি প্রচণ্ড বিস্ফোরণের অপেক্ষা করছে যা তাদেরকে এসে ধরবে এমন অবস্থায় যে তারা বিতর্কই করতে থাকবে।  \n\n \n\n" +
                " ০৩৬:০৫০] সে সময় তারা একে অপরকে উইলও করতে পারবে না এবং নিজেদের পরিবারের কাছেও ফিরে যেতে পারবে না।  \n\n \n\n" +
                " ০৩৬:০৫১] এবং যখন সিগনাল ধ্বনিত হবে , তখন তারা কবর(ভ্রূণব্যাংক) থেকে জন্ম নিয়ে তাদের ক্রমবিকাশকের কাছে আসবে।  \n\n \n\n" +
                " ০৩৬:০৫২] তারা (একে অপরকে) বলবে, হায় আমাদের সর্বনাশ! কে আমাদেরকে আমাদের ঘুম থেকে উঠাল? এ-তো সে-ই যার প্রতিশ্রুতি রহমান আল্লাহ্ দিয়েছিলেন এবং রসূলরাও সত্য বলেছিলেন।  \n\n \n\n" +
                " ০৩৬:০৫৩] এটি হবে কেবল একটি প্রচন্ড আর্তনাদ, তখন তাদের সবাই একে একে আমাদের সামনে (উপস্থিত হয়ে) রিপোর্ট করবে  \n\n \n\n" +
                " ০৩৬:০৫৪] এবং সেদিন কোন প্রানের প্রতি বিন্দু মাত্র অন্যায় করা হবে না, এবং তোমাদেরকে কেবল তোমাদের কর্মেরই প্রতিফল দেয়া হবে।  \n\n \n\n" +
                " ০৩৬:০৫৫] সেদিন নিশ্চই জান্নাতবাসীরা (নিজেদের অবস্থা দেখে) আনন্দে উৎফুল্ল হবে।  \n\n \n\n" +
                " ০৩৬:০৫৬] তারাও এবং তাদের স্ত্রীরাও (রহমতের) ছায়াতলে পালংকের উপরে হেলান দিয়ে উপবিষ্ট থাকবে।  \n\n \n\n" +
                " ০৩৬:০৫৭] সেখানে তাদের জন্য নানা ফল-মূল থাকবে আর থাকবে তাদের কাঙ্খিত সকল বস্তু।  \n\n \n\n" +
                " ০৩৬:০৫৮] শান্তি(সালাম)- এ-ই হবে তাদের এককসত্তা দয়াময় ক্রমবিকাশক থেকে সাদর সম্ভাষণ।  \n\n \n\n" +
                " ০৩৬:০৫৯] এবং (আল্লাহ এও বলবেন) হে আমার অপরাধীরা ! আজ তোমরা (স্বীকারকারীদের থেকে) পৃথক হয়ে যাও।  \n\n \n\n" +
                " ০৩৬:০৬০] হে বিজ্ঞানী সম্প্রদায়(আদম-সন্তানরা) ! আমি কি তোমাদেরকে এ তত্বাবধায়ক নির্দেশ দেই নাই, তোমরা শয়তান(নিজ স্বাধীন ইচ্ছা)এর সেবা-কাজ(ইবাদত) করবে না, সে নিশ্চই তোমাদের নিশ্চিত শত্রু?  \n\n \n\n" +
                " ০৩৬:০৬১] এবং তোমরা শুধু আমার সেবা-কাজ(ইবাদত) করবে, এটিই হল ঊর্ধ্বগামী-সরল পথ।  \n\n \n\n" +
                " ০৩৬:০৬২] এবং সে(তোমাদের স্বাধীন ইচ্ছা) অবশ্যই তোমাদের মধ্য থেকে অনেক দলকে বিপথগামী করেছে, তবুও তোমরা কি বুঝতে পার নাই?  \n\n \n\n" +
                " ০৩৬:০৬৩] এটিই সেই অনুতাপস্থল যার ওয়াদা তোমাদের সঙ্গে করা হয়েছিল।  \n\n \n\n" +
                " ০৩৬:০৬৪] আজ তোমরা এতে প্রবেশ কর, যেহেতু তোমরা অস্বীকার করতে।  \n\n \n\n" +
                " ০৩৬:০৬৫] সেদিন আমরা তাদের মূখের উপর সীল-মোহর মেরে দিব; এবং তাদের হাত আমাদের সঙ্গে কথা বলবে, এবং তাদের পা গুলি তাদের কার্যকলাপ সমন্ধে সাক্ষ্য দিবে।  \n\n \n\n" +
                " ০৩৬:০৬৬] এবং আমরা চাইলে তাদের চোখ গুলি বিলুপ্ত করে দিতে পারি, তখন তারা পথ অনুসন্ধানে দ্রুত বেগে দৌড়াবে? কিন্তু এমন অবস্থায় তারা কিভাবে দেখতে পাবে?  \n\n \n\n" +
                " ০৩৬:০৬৭] এবং আমরা চাইলে তাদেরকে তাদের অবস্থান স্থলেই এমন নাযেহাল করতে পারি, যার ফলে তারা সামনেও যেতে পারবে না এবং  \n\n \n\n" +
                "পিছনেও ফিরতে পারবে না।  \n\n \n\n" +
                " ০৩৬:০৬৮] এবং আমরা যাকে দীর্ঘায়ু দান করি – তাকে শারীরিক গঠনে ক্ষয়প্রাপ্ত ও দুর্বল করতে থাকি। তবুও কি তারা বুঝে না।  \n\n \n\n" +
                " ০৩৬:০৬৯] এবং আমরা তাকে না কোন কবিতা রচনা করার শিক্ষা দিয়েছি, না এটি তার পক্ষে সংগত; এ-তো কেবল এক স্মারক-বাণী এবং নিশ্চিত-সত্য বর্ণনাকারী কুরআন (সদাপাঠ্য গ্রন্থ),  \n\n \n\n" +
                " ০৩৬:০৭০] যেন এটি প্রত্যেক ব্যক্তিকে সতর্ক করে দেয় যে জীবিত, এবং যেন অস্বীকারকারীদের উপর (আল্লাহর) বিজ্ঞানভিত্তিক বানীগুলো পূর্ণ হয়।  \n\n \n\n" +
                " ০৩৬:০৭১] তারা কি দেখে না, আমাদের হাত যা সৃষ্টি করেছে তাদের মধ্যে আমরা তাদের জন্য চতুষ্পদ জন্তু সৃষ্টি করেছি যার তারা এখন মালিক হয়েছে।  \n\n \n\n" +
                " ০৩৬:০৭২] এবং আমরা চতুষ্পদ জন্তুগুলিকে তাদের অধিনস্থ করে দিয়েছি, তাদের মধ্যে কতগুলোকে তাদের যানবাহন হিসেবে এবং কতগুলোকে তারা ভক্ষন করে।  \n\n \n\n" +
                " ০৩৬:০৭৩] এবং তাদের জন্য সেগুলোতে নানাবিধ উপকার এবং পানীয় আছে। তবুও কি তারা কৃতজ্ঞতা প্রকাশ করবে না?  \n\n \n\n" +
                " ০৩৬:০৭৪] এবং তারা আল্লাহকে ছেড়ে কল্পিত পৃথকসত্তাদের (পীর-পুরোহিত-যাযক-হুজুর) গ্রহণ করেছে এই বলে, হয় তো কোন সময় (তাদের মাধ্যমে) তারা সাহায্য প্রাপ্ত হবে।  \n\n \n\n" +
                " ০৩৬:০৭৫] তারা তাদের কোন সাহায্য করতে পারে না। পক্ষান্তরে তাদেরকে (তাদের ক্রমবিকাশকের সামনে) তাদের বিরুদ্ধে রেকর্ড হিসেবে উপস্থিত করা হবে।  \n\n \n\n" +
                " ০৩৬:০৭৬] অতএব তাদের কথাবার্তা যেন আপনাকে মনোকষ্ট না দেয়। নিশ্চই আমরা জানি তাও, যা তারা গোপন করে এবং তাও, যা তারা প্রকাশ করে।  \n\n \n\n" +
                " ০৩৬:০৭৭] মানুষ কি চিন্তা করে দেখে না, নিশ্চই আমরা তাকে অতিআনুবিক্ষণিক জননক্ষম কোষ থেকে সৃষ্টি করেছি? এরপরও সে বিতর্ককারী হয়ে দাঁড়ায়।  \n\n \n\n" +
                " ০৩৬:০৭৮] এবং সে আমাদের সমন্ধে উপমা বর্ণনা করে অথচ সে নিজের সৃষ্টি-বিষয় ভুলে যায়। এবং বলতে থাকে, \"অস্থিপুঞ্জে কে জীবন সঞ্চার করতে পারে যখন ঐ গুলি পচে গলে যায়?\"  \n\n \n\n" +
                " ০৩৬:০৭৯] আপনি বলুন, \"সেগুলোতে তিনি জীবন সঞ্চার করবেন যিনি সেগুলোকে প্রথমবার সৃষ্টি করেছেন। যেহেতু তিনি প্রত্যেক সৃষ্টি সমন্ধে সর্বজ্ঞানী।  \n\n \n\n" +
                " ০৩৬:০৮০] যিনি তোমাদের জন্য সবুজ গাছ থেকে আগুন(দাবানল) সৃষ্টি করেন; অতঃপর তোমরাও তা(সবুজ গাছ) থেকে আগুন প্রজ্বলিত কর।  \n\n \n\n" +
                " ০৩৬:০৮১] যিনি বায়ুমণ্ডলগুলো ও পৃথিবীগুলো সৃষ্টি করেছেন, তিনি কি সেগুলোর মত সৃষ্টি করতে সক্ষম নন? হ্যাঁ অবশ্যই, তিনি মহান সৃষ্টিকর্তা, সর্বজ্ঞানী।  \n\n \n\n" +
                " ০৩৬:০৮২] তাঁর কার্যধারা এমনই, যখন তিনি কোন কিছু সমন্ধে ইচ্ছা(পরিকল্পনা) করেন তখন তিনি সেটির জন্য শুধু বলেন, \"হও\", তখন তা হয়ে যায়।  \n\n \n\n" +
                " ০৩৬:০৮৩] অতএব নিয়মশীল তিনি, যাঁর হাতে প্রত্যেক বিষয়ের আধিপত্য। এবং তাঁরই দিকে তোমাদের সকলকে প্রত্যাবর্তিত করা হবে।\"");
        editor.putString("35", "পরিচ্ছেদ ০৩৫.দৃশ্যঃ একক-সৃষ্টিকর্তা (সূরা আল-ফাতির The Creator)  \n\n \n\n" +
                "এটি মক্কী সূরা, বিসমিল্লাহ সহ এতে ৪৬ আয়াত এবং ৫ রুকূ আছে।  \n\n \n\n" +
                " ০৩৫:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০৩৫:০০১] সকল ধন্যবাদ আল্লাহরই যিনি বায়ুমণ্ডলগুলোর এবং পৃথিবীগুলোর একক-সৃষ্টিকর্তা এবং ফেরেস্তাদেরকে রসুল(বার্তাবাহক) নিযুক্তকারী, যারা দুই দুই, তিন তিন এবং চার চার জেট বিশিষ্ট। সৃজনে তিনি যত চান বৃদ্ধি করেন; নিশ্চই আল্লাহ প্রত্যেক বস্তুর উপর সর্বশক্তিমান।  \n\n \n\n" +
                " ০৩৫:০০২] আল্লাহ মানুষের জন্য যে কোন রহমতের দ্বার উন্মুক্ত করলে তার প্রতিরোধকারী কেউ নেই; এবং তিনি তা প্রতিরোধ করলে এরপর সেটির উন্মুক্তকারী কেউ নেই; যেহেতু তিনি ভালবাসাকনার-মহাসমূদ্র , মহাবিজ্ঞানী।  \n\n \n\n" +
                " ০৩৫:০০৩] হে মানব মন্ডলী ! তোমাদের উপর আল্লাহর যে অনুগ্রহ অবতীর্ণ হয়েছে তা তোমরা স্মরণ কর। আল্লাহ ছাড়া কি অন্য কোন সৃষ্টিকর্তা আছে যে তোমাদেরকে মহাকাশ ও পৃথিবী থেকে জীবিকা দেয়? তিনি ছাড়া কোন উদ্ভাবনীশক্তি নেই। তবুও তোমাদেরকে কোথায় বিভ্রান্ত করে নিয়ে যাওয়া হচ্ছে।  \n\n \n\n" +
                " ০৩৫:০০৪] এবং যদি তারা আপনাকে মিথ্যা প্রতিপন্ন করে, তবে অবশ্যই আপনার পূর্ববর্তী রসূলদেরকেও মিথ্যা প্রতিপন্ন করা হয়েছিল। যেহেতু সকল বিষয় আল্লাহর দরবারে প্রত্যাবর্তিত হবে।  \n\n \n\n" +
                " ০৩৫:০০৫] হে মানব মন্ডলী! নিশ্চই আল্লাহর প্রতিশ্রুতি বিজ্ঞান ভিত্তিক, অতএব ইহকালীন-জীবন যেন তোমাদেরকে বিপথে চালিত না করে এবং কোনও ভণ্ড-প্রতারক(পীর-পুরোহিত-যাযক-হুজুর) যেন তোমাদেরকে আল্লাহ সম্বন্ধে বিপথে চালিত না করে।  \n\n \n\n" +
                " ০৩৫:০০৬] নিশ্চই শয়তান(তোমাদের স্বাধীন ইচ্ছা) তোমাদের শত্রু, সুতরাং তোমরা তাকে শত্রু হিসেবে ধরে নাও। সে নিজের দলবল(পীর-পুরোহিত-যাযক-হুজুর)দেরকে শুধু এজন্যেই ডাকে যেন তারা উন্মত্ততাগ্রস্থ হয়।  \n\n \n\n" +
                " ০৩৫:০০৭] যারা অস্বীকার করেছে তাদের জন্য কঠিন দুঃখ-কষ্ট নির্ধারিত আছে। এবং যারা আল্লাহর এককসত্বা মেনে নিয়েছে এবং ভালকাজ করেছে তাদের জন্য সংশোধন(পাপ মোচন) এবং মহা পুরষ্কার অবধারিত আছে।  \n\n \n\n" +
                " ০৩৫:০০৮] অতএব যে মন্দকাজ করতে মনোরম-প্রসন্নতা অনুভব করে সে সেগুলোকে সুন্দর মনে করে। নিশ্চই আল্লাহ যাকে চান বিভ্রান্ত হতে দেন, এবং যাকে চান সুপথপ্রাপ্তীর নির্দেশনা দেন; সুতরাং তাদের জন্য অপেক্ষা করে আপনার প্রান যেন বিনষ্ট হয়ে না যায়। নিশ্চই আল্লাহ তা পূরোপূরি জানেন যা তারা করছে।  \n\n \n\n" +
                " ০৩৫:০০৯] এবং আল্লাহ তিনি যিনি বায়ুরাশিকে প্রেরণ করেন, যা মেঘমালাকে আকাশে তুলে; অতঃপর আমরা সেগুলোকে কোন নিষ্প্রাণ দেশের দিকে হাঁকিয়ে নিয়ে যাই, অতঃপর আমরা তা দিয়ে ভুমিকে তার নির্জীব হওয়ার পরও সঞ্জীবিত করে তুলি। এমন ভাবেই পুনরুত্থান হবে।  \n\n \n\n" +
                " ০৩৫:০১০] যে কেউ সম্মান চায় সে যেন স্মরণ রাখে যে, সব সম্মান আল্লাহর জন্য। মঙ্গলকর বাক্য(কালেমা তাইয়েবা বা মহাকাশ অভিযান)গুলো তাঁরই দিকে আহরোণ করে এবং ভালকাজ সেগুলোকে উন্নীত ও সম্মানিত করে; এবং যারা মন্দকাজের ষড়যন্ত্র করছে-তাদের জন্য কঠোর শাস্তি নির্ধারিত আছে, এবং তাদের ষড়যন্ত্র ব্যর্থ হবেই।  \n\n \n\n" +
                " ০৩৫:০১১] এবং আল্লাহ তোমাদেরকে সৃষ্টি (শুরু) করেছেন ফাঁদে (মাতৃ-ফেলোপিয়ান টিউবের \"ফাঁদ-প্রান্তে\", ডিম্বানু থেকে), অতঃপর অতিআনুবিক্ষনিক জননক্ষম-কোষ দিয়ে(নিষিক্ত করে), অতঃপর তিনি তোমাদেরকে (x ও y ক্রোমজমে ভিন্ন সেক্সে) জোড়া জোড়া করেন। এবং তাঁর জানার বাইরে কোন নারী গর্ভধারণ করে না এবং সন্তান প্রসবও করে না। এভাবে কোন দীর্ঘায়ু ব্যক্তির আয়ু দীর্ঘও করা হয় না এবং তার আয়ু কমও করা হয় না এবং সবই গ্রন্থে লিপিবদ্ধ করা হয়। নিশ্চই এটি আল্লাহর জন্য অত্যন্ত সহজ।  \n\n \n\n" +
                " ০৩৫:০১২] এবং এমন দুই সমুদ্র কখনও সমান হতে পারে না, একটির পানি সুমিষ্ট-সুস্বাদ এবং সুপেয় এবং অপরটির পানি লবাণাক্ত এবং ঝাঁঝাল। এবং (এ সত্বেও) তোমরা প্রত্যেক সমুদ্র থেকে তাজা মাংস আহার কর এবং অলংকার বের কর যা তোমরা পরিধান কর। আপনি তাতে তরঙ্গগুলো ভেদ করে নৌযান গুলোকে যেতে দেখেন, যেন আপনারা তাঁর অনুগ্রহ অনুসন্ধান করেন এবং যেন কৃতজ্ঞতা জ্ঞাপন করেন।  \n\n \n\n" +
                " ০৩৫:০১৩] তিনি রাত্রিকে দিবসে প্রবিষ্ট করান এবং দিবসকে রাত্রিতে প্রবিষ্ট করান। এবং তিনিই সূর্য ও চন্দ্রকে ব্যাবহার উপযোগী করেছেন; প্রত্যেকেই নিদিষ্ট সময় অনুযায়ী ধাবমান আছে। এ আল্লাহই তোমাদের ক্রমবিকাশক, তাঁরই জন্য অধিপত্য, এবং তোমরা তাঁর বদলে যাদের(পীর-পুরোহিত-যাযক-হুজুরদের)কে ডাক তারা খেজুর আঁটির মধ্যকার ঝিল্লিরও মালিক নয়।  \n\n \n\n" +
                " ০৩৫:০১৪] যদি তোমরা তাদেরকে ডাক তাহলে তারা কখনও তোমাদের ডাক শুনবে না, আর শুনলেও তারা তোমাদের উপকারের জন্য তা পূূরণ করতে পারবে না। এবং প্রতিফল দিবসে তারা তোমাদের (আল্লাহ থেকে)পৃথকসত্বা বা প্রলুব্ধকারী ধরে নেয়াকে অস্বীকার করবে। বস্তুতঃ আপনাকে সর্বজ্ঞ এককসত্তার মত সঠিক সংবাদ কেউ দিতে পারবে না।  \n\n \n\n" +
                " ০৩৫:০১৫] হে মানব মন্ডলী! তোমরাই আল্লাহর মূখাপেক্ষী; আসলে আল্লাহ্ তিনি, যিনি অত্যন্ত কনাসমৃদ্ধ ,পরম ধন্যবাদ প্রাপ্য।  \n\n \n\n" +
                " ০৩৫:০১৬] তিনি চাইলে তোমাদের সকলকে ধ্বংস করে দিতে পারেন এবং (তোমাদের স্থলে) নতুন সৃষ্টি আনতে পারেন।  \n\n \n\n" +
                " ০৩৫:০১৭] এবং এটি আল্লাহর পক্ষে মোটেই কঠিন নয়।  \n\n \n\n" +
                " ০৩৫:০১৮] এবং কোন পাপী (নিজে থেকে) অন্য কারও পাপ (ভার) বহন করতে পারবে না এবং কোন ভারাক্রান্ত তার ভার বহনের জন্য অন্য কাউকেও ডাকলে তার পাপ থেকে সামান্য পরিমাণ পাপও বহন করা হবে না যত ঘনিষ্ঠ আত্মিয়ই হোক না কেন। আপনি কেবল সেসব লোককেই সতর্ক করতে পারেন যারা না দেখেও নিজেদের ক্রমবিকাশককে বুঝতে পারে এবং মানুষে মানুষে ভালবাসা (সালাত) স্থাপন করে। এবং যে ব্যক্তি (গরিবদের অন্ন-বস্ত্র এককভাবে এবং দারিদ্র দূরীকরনে সম্মিলিত ভাবে দান করে) বিশুদ্ধ হয় সে নিজেরই কল্যাণের জন্য শুদ্ধতা অর্জন করে, এবং আল্লাহর কাছেই সকলের প্রত্যাবর্তন হবে।  \n\n \n\n" +
                " ০৩৫:০১৯] যেহেতু সমান হতে পারে না অন্ধ এবং চক্ষুষ্মান,  \n\n \n\n" +
                " ০৩৫:০২০] এবং, না অন্ধকার এবং না আলো  \n\n \n\n" +
                " ০৩৫:০২১] এবং, না ছায়া না রোদ্র  \n\n \n\n" +
                " ০৩৫:০২২] এবং সমান হতে পারে না জীবিত ও মৃত। নিশ্চই আল্লাহ যাকে চান শ্রবণ করান; কিন্তু যারা কবরে আছে আপনি তাদেরকে শুনাতে পারবেন না ।  \n\n \n\n" +
                " ০৩৫:০২৩] আপনি কেবল একজন সতর্ককারী।  \n\n \n\n" +
                " ০৩৫:০২৪] নিশ্চই আমরা আপনাকে বিজ্ঞান সহ সুসংবাদদাতা ও সতর্ককারী করে প্রেরণ করেছি; এবং এমন কোন জাতি নেই যার কাছে সতর্ককারী আগমন করে নাই।  \n\n \n\n" +
                " ০৩৫:০২৫] এবং যদি তারা আপনাকে মিথ্যা প্রতিপন্ন করে, তাহলে (স্মরণ রাখবেন) নিশ্চই তাদের পূর্ববর্তীরাও (রসূলদেরকে) মিথ্যা প্রতিপন্ন করেছিল। তাদের কাছে তাদের রসূলরা সুস্পষ্ট প্রামাণ্য তথ্য এবং ঐশী পুস্তিকা এবং আলোকিত গ্রন্থসহ আগমন করেছিল।  \n\n \n\n" +
                " ০৩৫:০২৬] অতঃপর আমি তাদেরকে ধৃত করেছিলাম যারা অস্বীকার করেছিল; অতএব কেমন হয়েছিল প্রত্যাখ্যান করার ফল।  \n\n \n\n" +
                " ০৩৫:০২৭] আপনি কি দেখেন না, আল্লাহ্ আকাশ থেকে বৃষ্টি বর্ষণ করেন? অতঃপর তা দিয়ে আমরা বিচিত্র বর্ণের ফল উৎপাদন করি, এবং পর্বতের মত মেঘগুলোর মধ্যে কোনটিকে শুভ্র, কোনটিকে লোহিত(ঝড়ের পূর্বাভাষ), বিচিত্র বর্ণে নবায়ন করি, আবার কোনটিকে ঘোর কৃষ্ণবর্ণের(cumulonimbus) করি।  \n\n \n\n" +
                " ০৩৫:০২৮] এবং মানুষ ও চলনক্ষম জীবজন্তু এবং গৃহপালিত জীবজন্তুর মধ্যেও এমন আছে যাদের বর্ণ ভিন্ন ভিন্ন। প্রকৃত পক্ষে আল্লাহকে তাঁর বান্দাদের মধ্যে কেবল জ্ঞানীরাই বুঝতে পারে ; নিশ্চই আল্লাহ্ ভালবাসাকনার-মহাসমূদ্র, অতীব সংশোধনশীল(ক্ষমাশীল)।  \n\n \n\n" +
                " ০৩৫:০২৯] নিশ্চই যারা আল্লাহর গ্রন্থ পাঠ করে এবং মানুষে মানুষে ভালবাসা (সালাত) স্থাপন করে, এবং আমরা তাদেরকে যা  \n\n \n\n" +
                "দিয়েছি তা থেকে গোপনে ও প্রকাশ্যে খরচ করে, তারা এমন এক বাণিজ্যের আশা রাখে, যা কখনও বিফল হবে না।  \n\n \n\n" +
                " ০৩৫:০৩০] যেন তিনি তাদেরকে পূর্ণ প্রতিফল দেন এবং তিনি নিজ অনুগ্রহ থেকে তাদেরকে আরও বেশি করে(১০গুণ, ৭০০+গুণ) দান করেন। নিশ্চই তিনি অতীব সংশোধনশীল(ক্ষমাশীল), পরম হিতকারী।  \n\n \n\n" +
                " ০৩৫:০৩১] এবং আমরা আপনার কাছে (কুরআন)গ্রন্থে যা প্রত্যাদেশ করেছি তা নিশ্চিত বিজ্ঞান এবং এর পূর্বেকার গ্রন্থগুলোর সত্যায়নকারী। নিশ্চই আল্লাহ নিজ বান্দাদের সম্বন্ধে সম্পুর্ন খবর রাখেন এবং তাদের অবস্থা দেখছেন।  \n\n \n\n" +
                " ০৩৫:০৩২] সুতরাং আমরা গ্রন্থের উত্তরাধিকারী করেছি আমাদের মনোনীত বান্দাদের থেকে। অতএব তাদের মধ্যে কেউ নিজের প্রতি অন্যায়কারী, এবং তাদের মধ্যে কেউ মধ্যপন্থী এবং তাদের মধ্যে কেউ আল্লাহর আদেশে ভালকাজে অগ্রগামী । এ-ই হচ্ছে (আল্লাহর) মহান শিক্ষা।  \n\n \n\n" +
                " ০৩৫:০৩৩] (ভালকাজে অগ্রগামীদের বিনিময়) চিরস্থায়ী জান্নাতগুলো হবে, যার মধ্যে তারা প্রবেশ করবে, সেখানে তাদেরকে স্বর্ণ নির্মিত কংকণ এবং মুক্তা দিয়ে অলংকৃত করা হবে এবং সেখানে তাদের পোষাক হবে রেশমের।  \n\n \n\n" +
                " ০৩৫:০৩৪] এবং তারা বলবে, \"সকল ধন্যবাদ আল্লাহর জন্য যিনি আমাদের সকল চিন্তা দূর করে দিয়েছেন। নিশ্চই আমাদের ক্রমবিকাশক অতীব সংশোধনশীল(ক্ষমাশীল), পরম হিতকারী;  \n\n \n\n" +
                " ০৩৫:০৩৫] যিনি নিজ অনুগ্রহে আমাদেরকে এমন স্থায়ী আবাসগৃহে স্থান দান করেছেন যেখানে আমাদেরকে কোন দুঃখও স্পর্শ করে না এবং যেখানে কোন ক্লান্তিও স্পর্শ করে না।\"  \n\n \n\n" +
                " ০৩৫:০৩৬] এবং যারা অস্বীকার করেছে তাদের জন্য রয়েছে অনুতাপের আগুন। তাদের জন্য মৃত্যুর সিদ্ধান্ত করা হবে না যাতে তারা মরে গিয়ে নিঃশেষ হতে পারে, এবং তাদের জন্য অনুতাপের দুঃখ কষ্টও লাঘব করা হবে না। এভাবেই আমরা প্রত্যেক অকৃতজ্ঞ ব্যক্তিকে শাস্তি দিয়ে থাকি।  \n\n \n\n" +
                " ০৩৫:০৩৭] এবং তারা তাতে চিৎকার করবে এবং বলবে হে আমার ক্রমবিকাশক! আপনি আমাদেরকে (এ অনুতাপস্থল থেকে) বের করুন, আমরা ভালকাজ করব তার পরিবর্তে যা আমরা প্রথম জীবনে করতাম। (আল্লাহ বলবেন) আমরা কি তোমাদেরকে এমন আয়ু দেই নাই, যাতে উপদেশ গ্রহণে ইচ্ছুক ব্যক্তি উপদেশ গ্রহণ করতে পারত? অথচ তোমাদের কাছে সতর্ককারীও এসেছিল। অতএব (এখন) তোমরা এসব ভোগ কর; কারণ অন্যায়কারীদের জন্য কোন সাহায্যকারী হয় না।  \n\n \n\n" +
                " ০৩৫:০৩৮] নিশ্চই আল্লাহ বায়ুমণ্ডলগুলো ও পৃথিবীগুলোর অজানা বিষয়গুলো অবগত আছেন ; নিশ্চই তিনি অন্তর্নিহিত সকল কথা খুব ভালো ভাবে জানেন।  \n\n \n\n" +
                " ০৩৫:০৩৯] তিনিই তোমাদেরকে পৃথিবীতে খলিফা(উত্তরপুরুষ) নিযূক্ত করেছেন, অতএব যে অস্বীকার করবে তার অস্বীকারের শাস্তি তারই উপর বর্তাবে। যেহেতু অস্বীকারকারীদেরকে তাদের অস্বীকৃতি তাদের ক্রমবিকাশকের দৃষ্টিতে কেবল অসন্তোষেই বাড়াচ্ছে, এবং অস্বীকারকারীদের অস্বীকৃতি শুধু তাদের ক্ষতিকেই বৃদ্ধি করছে।  \n\n \n\n" +
                " ০৩৫:০৪০] আপনি বলুন, \"তোমরা কি তোমাদের প্রলুব্ধকারীদেরকে দেখেছ যাদেরকে(পীর-পুরোহিত-যাযক-হুজুর) তোমরা আল্লাহকে বাদ দিয়ে ডাক ? তোমরা আমাকে দেখাও, তারা ভূপৃষ্ঠের কোন অংশ সৃষ্টি করেছে অথবা বায়ুমণ্ডলগুলোতে তাদের কোন অংশ আছে ?\" অথবা আমরা কি তাদেরকে এমন কোন গ্রন্থ দিয়েছি, তারা তাতে বর্ণিত স্পষ্ট প্রমাণগুলোর উপর প্রতিষ্ঠিত আছে ? বরং অন্যায়কারীরা একে অপরের সঙ্গে শুধু প্রবঞ্চনামূলক প্রতিশ্রুতি দিয়ে থাকে।  \n\n \n\n" +
                " ০৩৫:০৪১] নিশ্চই আল্লাহ্ বায়ুমণ্ডলগুলো ও পৃথিবীগুলোকে (অভিকর্ষ-মহাকর্ষ শক্তি দিয়ে)আটকে রেখেছেন যেন উভয়ে স্থানচ্যুত না হয়ে পড়ে। এবং যদি তারা স্থানচ্যূত হয়ে পড়ে তাহলে তিনি ছাড়া কেউই সেগুলোকে আটকে রাখতে পারবেন না। নিশ্চই তিনি পরম সহিষ্ণু, অতীব সংশোধনশীল।  \n\n \n\n" +
                " ০৩৫:০৪২] এবং তারা আল্লাহর নামে কঠিন শপথ করে বলে, যদি তাদের কাছে কোন সতর্ককারী আগমন করে, তাহলে তারা সকল জাতির মধ্যে প্রত্যেকটি অপেক্ষা অধিক সুপথপ্রাপ্তীর নির্দেশনা লাভ করবে। কিন্তু যখন তাদের কাছে সতর্ককারী আগমন করল, তখন তার আগমন কেবল তাদের বিমুখতাকেই বাড়িয়ে দিল।  \n\n \n\n" +
                " ০৩৫:০৪৩] কারণ তারা পৃথিবীতে ঔদ্ধত্য ও হীন ষড়যন্ত্র করেছিল। যেহেতু হীন ষড়যন্ত্র কেবল ষড়যন্ত্র-কারীদেরকেই ধ্বংস করে থাকে। অতএব তারা অপেক্ষা করছে শুধু পূর্ববর্তীদের সুন্নতের। এবং আপনি আল্লাহর নিয়মে আদৌ কোনও পরিবর্তন পাবেন না (তাদের পূর্ববর্তিদের যা শাস্তি হয়েছে এদেরও তা-ই হবে); এবং আল্লাহর নিয়মকে আপনি কখনও টলতে দেখবেন না।  \n\n \n\n" +
                " ০৩৫:০৪৪] তারা কি পৃথিবীতে ভ্রমণ করে নাই (যদি করত) তাহলে তারা দেখত, তাদের পূর্ববর্তীদের কী পরিণাম ঘটেছিল। অথচ তারা এদের অপেক্ষা বেশি শক্তিশালী ছিল। এবং আল্লাহ্ এমন নন যে, বায়ুমণ্ডল গুলোতে ও পৃথিবী গুলোতে কোন বস্তু তাকে বিফল করতে পারে; নিশ্চই তিনি সর্বজ্ঞানী, অতীব ক্ষমতাবান।  \n\n \n\n" +
                " ০৩৫:০৪৫] এবং যদি আল্লাহ মানুষের দোষ ধরতেন, যা তারা অর্জন করে, তিনি কোনও একটি পরমানুও ছাড়তেন না, কিন্তু তিনি তাদেরকেনির্দিষ্ট মেয়াদ পর্যন্ত অবকাশ দেন, অতএব যখন তাদের নির্দিষ্ট মেয়াদ ফুরিয়ে আসে, তখন সাব্যস্ত হয়ে যায়, \"নিশ্চই আল্লাহ্ তাঁর বান্দাদেরকে ভালভাবে দেখছিলেন।\"  \n\n \n\n" +
                "</string>");
        editor.putString("32", "পরিচ্ছেদ ০৩২.দৃশ্যঃ প্রনতি (সূরা আস-সাজদা The Prostration)  \n\n \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৩১ আয়াত এবং ৩ রুকূ আছে।  \n\n \n\n" +
                " ০৩২:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০৩২:০০১] আলিফ লাম মীম্।  \n\n \n\n" +
                " ০৩২:০০২] মহাবিশ্বের ক্রমবিকাশক থেকে এ গ্রন্থ, যাতে কোন সন্দেহ নেই, অবতীর্ণ হয়েছে।  \n\n \n\n" +
                " ০৩২:০০৩] তারা কি বলছে, সে নিজেই এটি উদ্ভাবন করে নিয়েছে? না, বরং তা অবশ্যই আপনার ক্রমবিকাশক থেকে সমাগত বিজ্ঞান, যেন আপনি এটি দিয়ে সে জাতিকে সতর্ক করতে পারেন *যাদের কাছে আপনার আগে কোন রসূল আসে নাই*, যেন তারা সুপথপ্রাপ্তির নির্দেশনা পায়।  \n\n \n\n" +
                " ০৩২:০০৪] আল্লাহ্, যিনি বায়ুমন্ডলগুলো ও পৃথিবীগুলো এবং এতদুভয়ের মধ্যে যা কিছু আছে সবই অনন্তের কাছাকাছি অন্তযূক্ত সময় ধরে সৃষ্টি করে চলেছেন; এবং নিয়ন্ত্রণ করে চলেছেন সৃষ্টির-ভিত্তি(আরশ) অর্থাৎ পানি(হাইড্রোজেন) কনার। তাঁর পাশাপাশি তোমাদের কোন অভিভাবক নেই এবং কোন মধ্যস্থতাকারীও নেই। তবুও তোমরা সতর্ক হচ্ছ না?  \n\n \n\n" +
                " ০৩২:০০৫] তিনি মহাকাশ থেকে পৃথিবীর দিকে ছুটে আসা সব কিছুর নিয়ন্ত্রণ করেন ; তখন সেসব(ম্যাগনেটোস্ফিয়ারে বাধা পেয়ে) তাঁর দিকে ফিরে যায় এক দিনে, যার পরিমাণ তোমাদের গণনানুসারে এক হাজার বৎসর অর্থাৎ ৬৭৬৫৮৭৩ মাইল প্রতি সেকেণ্ড গতিতে । {পৃথিবীর ম্যাগনেটোস্ফিয়ারে হাইপার-ডাইভিংএ ৬৭৬৫৮৭৩mps গতি পাওয়া সম্ভব । এ গতিতে মহাকাশ স্টেশন লওহে-মাহফুজে ডাইভ করলে জিবরাইলের গতি ৩৩৭৯৮৬১১১mps পাওয়া সম্ভব }  \n\n \n\n" +
                " ০৩২:০০৬] তিনিই গুপ্ত এবং প্রকাশ্য সবকিছুর পরিজ্ঞাতা, ভালবাসাকনার মহাসমূদ্র, পরম দয়াময়-  \n\n \n\n" +
                " ০৩২:০০৭] যিনি প্রত্যেক বস্তুকে,যা তিনি সৃষ্টি করেছেন, সুন্দর রুপ-গুণ দিয়েছেন। এবং তিনি অস্থায়ী বস্তু(ডিম্বানু) থেকে মানবজাতি সৃষ্টির সূচনা করেছেন।  \n\n \n\n" +
                " ০৩২:০০৮] অতঃপর তিনি তার(ডিম্বানুর) বংশগতি(xওy ক্রোমজম) সৃষ্টি করেছেন চারদিকে ঘিরে থাকা উপেক্ষনীয়(কোটিকোটিতে মাত্র একটি শুক্রানু) পানি থেকে;  \n\n \n\n" +
                " ০৩২:০০৯] অতঃপর তিনি তাকে পূর্ণভ্রূণে সুগঠিত করেন এবং তাতে নিজের আদেশ-বানী থেকে বর্ধনশীলতা দান করেন । এবং তিনি তোমাদেরকে কান, চোখ এবং মন-মগজ দান করেন, কিন্তু তোমরা অল্পই কৃতজ্ঞ হও।  \n\n \n\n" +
                " ০৩২:০১০] এবং তারা বলে, \"কী ! যখন আমরা মাটিতে বিলীন হয়ে যাব তখনও কি অবশ্যই আমরা এক নুতন সৃষ্টির আকারে উত্থিত হব?\" না, বরং তারা তাদের ক্রমবিকাশকের সাক্ষাৎকে অস্বীকার করছে ।  \n\n \n\n" +
                " ০৩২:০১১] আপনি বলুন, \"তোমাদের মৃত্যু ঘটাবে ‘মৃত্যুর ফিরিশতা(ডিকে ব্যাক্টেরিয়া), যাকে তোমাদের উপর নিযুক্ত করা হয়েছে ; অতঃপর তোমাদেরকে তোমাদের ক্রমবিকাশকের কাছে প্রত্যাবর্তিত করা হবে।  \n\n \n\n" +
                " ০৩২:০১২] এবং যদি আপনি সে অবস্থা লক্ষ্য করতে পারতেন, যখন অপরাধীরা তাদের ক্রমবিকাশকের সামনে স্ব স্ব মাথা (গলায় ১০৫ফুট লম্বা চেন দিয়ে) ঝুলানো অবস্থায়(বলবে),\"হে আমাদের ক্রমবিকাশ ! আমরা প্রত্যক্ষ করলাম এবং শ্রবণ করলাম; অতএব আপনি এখন আমাদেরকে ফেরৎ পাঠান, আমরা নিশ্চই অবশ্যই ভালকাজ করব।\"  \n\n \n\n" +
                " ০৩২:০১৩] যেহেতু, যদি আমাদের ইচ্ছা থাকতো, তাহলে নিশ্চই আমরা প্রত্যেক ব্যক্তিকে সুপথপ্রাপ্তির নির্দেশনা দিতে পারতাম; কিন্তু আমার এক বাক্য যৌক্তিকতা পাবে, \"নিশ্চই আমি জিন্নদের ও ইনসানদের দিয়ে অনুতাপস্থল পূর্ণ করবো ।\"  \n\n \n\n" +
                " ০৩২:০১৪] অতএব স্বাদ ভোগ কর, তোমরা যেহেতু তোমাদের আজকের দিনের সাক্ষাৎকে বিস্মৃত হয়েছিলে, এ জন্য আমরাও তোমাদেরকে বিস্মৃত হলাম। অতএব (এখন) তোমরা তোমাদের কৃত-কর্মের জন্য দীঘস্থায়ী দুঃখ-কষ্টের স্বাদ ভোগ করতে থাক।  \n\n \n\n" +
                " ০৩২:০১৫] আমাদের আয়াতগুলো কেবল তারাই মেনে নেয়, যাদেরকে ওগুলো সম্বন্ধে যখনই স্মরণ করিয়ে দেয়া হয়, তখনই তারা সেজদায় ভূলুষ্ঠিত হয়ে পড়ে এবং তাদের ক্রমবিকাশকের প্রদত্ত দায়িত্ব প্রশংসাসহ পালন করতে থাকে, এবং তারা অহংকার করে না।  \n\n \n\n" +
                " ০৩২:০১৬] তাদের পার্শ্বদেশ শয্যা থেকে পৃথক হয়ে যায়, এবং তারা তাদের ক্রমবিকাশককে ডাকে ভয় ও আশার সাথে, এবং আমরা তাদেরকে যাকিছু জীবকা দিয়েছি তা থেকে তারা(দরিদ্রদের অন্ন ও বস্ত্র একক ভাবে দান এবং দারিদ্রদূরিকরণে সম্মিলিতভাবে দান করতে) খরচ করে।  \n\n \n\n" +
                " ০৩২:০১৭] বস্তুতঃ কেউই জানে না যে, তাদের জন্য তাদের কৃত-কর্মের প্রতিদানস্বরুপ কী কী নয়ন তৃপ্তিকর বস্তু গোপন করে রাখা হয়েছে।  \n\n \n\n" +
                " ০৩২:০১৮] যে ব্যক্তি স্বীকারকারী সে কি দুষ্কর্মকারীর সমতুল্য হতে পারে? তারা কখনও সমান হতে পারে না।  \n\n \n\n" +
                " ০৩২:০১৯] যারা আল্লাহকে এককসত্বা মেনে নিয়েছে এবং ভালকাজ করেছে তাদের জন্য থাকবে তাদের কৃত-কর্ম অনুযায়ী চিরস্থায়ী আতিথেয়তাপূর্ণ আবাসগৃহের জান্নাত।  \n\n \n\n" +
                " ০৩২:০২০] কিন্ত যারা দুষ্কর্ম করেছে তাদের জন্য বাসস্থল হবে আগুন, যখনই তারা তা থেকে বের হওয়ার ইচ্ছা করবে তখনই তাদেরকে তার মধ্যে ফিরিয়ে দেয়া হবে এবং তাদেরকে বলা হবে, এখন তোমরা আগুনের দুঃখ-কষ্টের স্বাদ গ্রহণ কর, যাকে তোমরা মিথ্যা প্রতিপন্ন করতে।’  \n\n \n\n" +
                " ০৩২:০২১] এবং আমরা অবশ্যই তাদেরকে সেই আসন্ন বড় দুঃখ-কষ্টের পূর্বে (পৃথিবীতে) ছোট দুঃখ-কষ্টের স্বাদ গ্রহণ করাব যেন তারা(আমাদের দিকে) ফিরে আসে।  \n\n \n\n" +
                " ০৩২:০২২] এবং সে ব্যক্তি অপেক্ষা অধিকতর অন্যায়কারী আর কে হতে পারে যাকে তার ক্রমবিকাশকের আয়াতগুলো স্মরণ করিয়ে দেয়া হলেও সে তা থেকে বিমুখ হয়ে যায় ? নিশ্চই আমরা অপরাধীদের থেকে প্রতিশোধ গ্রহণ করব।  \n\n \n\n" +
                " ০৩২:০২৩] এবং নিশ্চই আমরা মূসাকে গ্রন্থ দিয়েছিলাম, অতএব আপনিও তা(এক ঐশী গ্রন্থ) প্রাপ্তি সম্বন্ধে সন্দেহ পোষণ করবেন না, এবং সে গ্রন্থে বনী-ইসরাঈলের জন্য সুপথপ্রাপ্তির নির্দেশনা ছিল।  \n\n \n\n" +
                " ০৩২:০২৪] এবং আমরা তাদের মধ্য থেকে এমন বহু ইমাম নিযুক্ত করেছিলাম যারা আমাদের আদেশানুযায়ী (মানুষকে) সুপথপ্রাপ্তির নির্দেশনা দান করত, কেননা তারা ধৈর্য সহকারে এবং আমাদের আয়াতগুলোর প্রতি দৃঢ় প্রতিজ্ঞ হয়ে কাজ করত ।  \n\n \n\n" +
                " ০৩২:০২৫] নিশ্চই তিনিই আপনার ক্রমবিকাশক যিনি পুনরুত্থানের দিনে তাদের মধ্যে সে বিষয়ে মিমাংসা করে দিবেন যে বিষয়ে তারা মতভেদ করত।  \n\n \n\n" +
                " ০৩২:০২৬] এটিও কি তাদেরকে সুপথপ্রাপ্তির নির্দেশনা দান করে নাই, আমরা তাদের পূর্বে কত কত জনগোষ্ঠীকে ধ্বংস করে দিয়েছি যাদের বাসগৃহগুলো তারা পরিদর্শন করছে? নিশ্চই এগুলোতে অনেক আয়াত (নিদর্শন) আছে । তবুও তারা কি শুনছে না?  \n\n \n\n" +
                " ০৩২:০২৭] তারা কি দেখে না যে, আমরা শুষ্ক ভূমির দিকে বারিধারাকে হাঁকিয়ে নিয়ে যাই, অতঃপর তা দিয়ে আমরা শশ্য উৎপাদন করি যা হতে কিছু অংশ তাদের পশুগুলো ভক্ষণ করে এবং কিছু অংশ তারা নিজেরা আহার করে? তবুও তারা কি দেখছে না?  \n\n \n\n" +
                " ০৩২:০২৮] এবং তারা বলে. \"যদি তোমরা সত্যবাদী হও তাহলে বল দেখি, সে (মহাকাশ)বিজয় কখন আসবে?\"  \n\n \n\n" +
                " ০৩২:০২৯] আপনি বলুন, \"যারা অস্বীকার করেছে তাদের মতবাদ সে (মহাকাশ)বিজয়ের দিনে তাদের কোন উপকার করবে না এবং তাদেরকে কোন অবকাশও দেয়া হবে না।\"  \n\n \n\n" +
                " ০৩২:০৩০] অতএব আপনি তাদের থেকে মুখ ফিরিয়ে নিন এবং অপেক্ষা করুন; নিশ্চই তাদেরকেও (কিছুকাল) অপেক্ষা করতে হবে।");
        editor.putString("31", "০৩১.দৃশ্যঃ বিজ্ঞানী লুকমান (সূরা লুকমান The Lookman)  \n\n \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৩৫ আয়াত এবং ৪ রুকূ আছে।  \n\n \n\n" +
                " ০৩১:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০৩১:০০১] আলিফ লাম মীম্।  \n\n \n\n" +
                " ০৩১:০০২] এগুলো বিজ্ঞান গ্রন্থের আয়াত,  \n\n \n\n" +
                " ০৩১:০০৩] সৎকর্মশীলদের জন্য সুপথপ্রাপ্তির নির্দেশনা এবং রহমত,  \n\n \n\n" +
                " ০৩১:০০৪] যারা সালাত(আল্লাহর ভালবাসা) স্থাপন করে এবং শুদ্ধতা (দরিদ্রদের অন্ন ও বস্ত্র দান এবং দারিদ্রদূরিকরনে সম্মিলিত দানের মাদ্যমে) অর্জন করে এবং পরকালীন-জীবন নিশ্চিত ভাবে মানে।  \n\n \n\n" +
                " ০৩১:০০৫] এসব লোকই তাদের ক্রমবিকাশকের তরফ থেকে আগত সুপথপ্রাপ্তির নির্দেশনার উপর প্রতিষ্ঠিত আছে এবং এরাই সফল।  \n\n \n\n" +
                " ০৩১:০০৬] এবং মানুষের মধ্যে কিছু আছে যারা (মানুষকে)আল্লাহর পথ থেকে বিভ্রাস্ত করার জন্য জ্ঞানবিহীন রূপকথার গল্পের(লাহওয়ালহাদিসএর) বই কিনে আনে এবং সেটিকে ঠাট্রা-বিদ্রুপের বিষয় বানিয়ে নেয়। এসব লোকের জন্য লাঞ্ছনাজনক দুঃখ-কষ্ট অবধারিত।  \n\n \n\n" +
                " ০৩১:০০৭] এবং যখন তার(উল্লিখিত ব্যক্তির) সামনে আমাদের আয়াতগুলো আবৃত্তি করে তখন সে অহংকার করে মুখ ফিরিয়ে নেয়, যেন সে তা শুনতেই পায় নাই, যেন তার কান দুটিতে বধিরতা আছে। অতএব আপনি তাকে মহা দুঃখ-কষ্টের সুসংবাদ দিন।  \n\n \n\n" +
                " ০৩১:০০৮] নিশ্চই যারা আল্লাহকে এককসত্বা মেনে নিয়েছে এবং ভালকাজ করেছে তাদের জন্য অনুগ্রহেপূর্ণ জান্নাত,  \n\n \n\n" +
                " ০৩১:০০৯] সেখানে তারা চিরকাল বাস করবে। আল্লাহর প্রতিশ্রুতি বিজ্ঞান ভিত্তিক; এবং তিনিই ভালবাসাকনার মহাসমূদ্র, মহাবিজ্ঞানী।  \n\n \n\n" +
                " ০৩১:০১০] তিনি বায়ুমণ্ডলগুলোকে স্তরের উপর স্তর সাজিয়ে সৃষ্টি করেছেন, যেমন তোমরা দেখছ; এবং তিনি পৃথিবীগুলোতে স্থাপন করেছেন স্থির-স্টেশন পাছে যেন এগুলো তোমাদেরকে নিয়ে টলমল না করে; এবং এতে সম্প্রচার করা হয় প্রত্যেক প্রকারের ইন্টার্নেট নেটওয়ার্ক(creeper, পরমানুর তেজষ্কৃয়তা) । এবং আমরা মহাকাশ থেকে পানি(হাইড্রোজেন) বর্ষণ করি, এবং এতে ফিউশন করে সৃষ্টি করি সকল পরমানুর সুসমন্বিত সংযূক্তি-বন্ধন।  \n\n \n\n" +
                " ০৩১:০১১] এ হচ্ছে আল্লাহর সৃষ্টি, অতএব তোমরা আমাকে দেখাও তিনি ছাড়া অন্যেরা কী সৃষ্টি করেছে। কিছুই নয়, বরং  \n\n \n\n" +
                "অন্যায়কারীরা স্পষ্ট ভ্রান্তিতে আছে।  \n\n \n\n" +
                " ০৩১:০১২] এবং আমরা লুকমানকে বিজ্ঞান-প্রযূক্তি দান করেছিলাম (এবং বলেছিলাম), \"আল্লাহর প্রতি কৃতজ্ঞ হও,\" বস্তুতঃ যে কৃতজ্ঞ হয় সে কেবল নিজের জন্যেই কৃতজ্ঞ হয় এবং যে অস্বীকার করে, তাহলে স্মরণ রাখতে হবে যে, নিশ্চই আল্লাহ্ কনায় সমৃদ্ধিশালী পরম ধন্যবাদযোগ্য।  \n\n \n\n" +
                " ০৩১:০১৩] এবং (স্মরণ করুন) যখন লুকমান তার পুত্রকে বলেছিল, \"হে আমার প্রিয় পুত্র! তুমি আল্লাহর বদলে কাউকেও পৃথকসত্বা কল্পনা করবে না, নিশ্চই পৃথকসত্বা কল্পনা অতি ভয়ানক অন্যায়।\"  \n\n \n\n" +
                " ০৩১:০১৪] এবং আমরা মানুষকে তার পিতামাতার সাথে সদাচরণের জরুরী নির্দেশ দিয়েছি – তার জননী তাকে দুর্বল অবস্থার পর দুর্বল অবস্থায় বহন করে, এবং তার দুধ ছাড়ান হয় দুই বৎসর বয়সে – সুতরাং আমার, এবং তোমার পিতামাতার কৃতজ্ঞতা প্রকাশ কর; আমারই দিকে(শেষ) প্রত্যাবর্তন;  \n\n \n\n" +
                " ০৩১:০১৫] এবং যদি তারা উভয়ে তোমার সঙ্গে বির্তক করে যেন তুমি আমার পাশে কাউকেও পৃথকসত্বা কল্পনা কর, যার সম্বন্ধে তোমার কোন জ্ঞান নাই, তাহলে তুমি তাদের আনুগত্য করবে না; কিন্তু ইহকালীন সকল বিষয়ে সেবা-যত্নে তাদের উত্তম সঙ্গী হবে; এবং সে ব্যক্তির পথের অনুসরণ করবে যে আমার দিকে সমর্পিত। অতঃপর আমারই কাছে তোমাদের সকলকে ফিরে আসতে হবে; তখন আমি তোমাদেরকে তোমাদের কৃত-কর্ম সম্বন্ধে অবহিত করব;  \n\n \n\n" +
                " ০৩১:০১৬] \"হে আমার প্রিয় পুত্র ! স্মরণ রেখো, যদি কোন কাজ সর্ষে দানার চেয়ে সূক্ষ কনা ওজনেরও হয় এবং তা কোনও শক্ত পাথরে অথবা বায়ুমন্ডলগুলোতে অথবা পৃথিবীগুলোতে অবস্থান করে, তবুও আল্লাহ্ সেটিকে উপস্থিত করে দিবেন। নিশ্চই আল্লাহ্ অতি সূক্ষাতিসূক্ষ কনা সর্বজ্ঞাতা।\"  \n\n \n\n" +
                " ০৩১:০১৭] \"হে আমার প্রিয় পূত্র ! সালাত স্থাপন করবে (লোকদেরকে) উপকারী কাজের নির্দেশ দিবে এবং নীতিবিগর্হিত মন্দকাজ থেকে বিরত রাখবে এবং তোমার উপর যদি কোনও আঘাৎ আসে তবে ধৈর্য ধারণ করবে। নিশ্চই এটি অত্যন্ত দৃঢ় চারিত্রিক গুন;  \n\n \n\n" +
                " ০৩১:০১৮] এবং তুমি লোকদের থেকে অবজ্ঞাভরে মুখ ফিরিয়ে নিবে না, এবং পৃথিবীতে ঠাট্টা-তামাসা করে চলবে না; কোনও উদ্ধত, অহংকারীকে আল্লাহ্ মোটেও ভালবাসেন না;  \n\n \n\n" +
                " ০৩১:০১৯] এবং তুমি নিজ চাল-চালনে মধ্যম পস্থা অবলম্বন করবে এবং নিজ কণ্ঠস্বরকে মূদু রাখবে। নিশ্চই সকল কণ্ঠস্বরের মধ্যে গাধার কন্ঠস্বর সবচে বেশি কর্কশ।\"  \n\n \n\n" +
                " ০৩১:০২০] তোমরা কি দেখ না, যাকিছু বায়ুমণ্ডলগুলোতে আছে এবং যাকিছু পৃথিবীগুলোতে আছে সকলকেই আল্লাহ্ তোমাদের ব্যাবহার উপযোগী করে দিয়েছেন এবং তিনি তাঁর প্রকাশ্য ও গুপ্ত অনুগ্রহগুলোকে তোমাদের উপর সম্পূর্ণ করেছেন? এবং লোকদের মধ্যে কিছু এমন আছে যারা জ্ঞান, এবং সুপথপ্রাপ্তির নির্দেশনা এবং সমুজ্জল গ্রন্থ ছাড়াই আল্লাহ্ সম্বন্ধে কুণ্ডলী পেঁচিয়ে থাকে।  \n\n \n\n" +
                " ০৩১:০২১] এবং যখন তাদেরকে বলা হয়, \"আল্লাহ্ যাকিছু অবতীর্ণ করেছেন, তোমরা তার অনুসরণ কর,\" তখন তারা বলে, \"না, বরং আমরা সে পথের অনুসরণ করব যার উপর আমরা আমাদের পূর্বপুরুষদেরকে পেয়েছি।\" কী ! শয়তান(তাদের স্বাধীন ইচ্ছা) যদি তাদেরকে উন্মত্ততার দুঃখ-কষ্টের দিকে ডাকে তবুও?  \n\n \n\n" +
                " ০৩১:০২২] এবং যে ব্যক্তি তার মুখমণ্ডল আল্লাহর কাছে সমর্পন করে এবং সে সৎকর্মপরায়ণ হয় সে বস্তুতঃ এক আস্থাপূর্ণ-সুসম্পাদিত-খাঁটি-প্রামাণ্য দলিলপত্রাদি উপস্থিতকারীর(মহাকাশযানের) সুদৃঢ় *হাতল*কে ধরে। এবং আল্লাহরই দিকে সমস্ত বিষয়ের পরিনতি।  \n\n \n\n" +
                " ০৩১:০২৩] এবং যে ব্যক্তি অস্বীকার করে তার অস্বীকার যেন আপনাকে দুঃখিত না করে । আমাদের দিকেই তাদের প্রত্যাবর্তন, অতএব আমরা তাদেরকে তাদের কৃত-কর্ম সম্বন্ধে অবহিত করব। নিশ্চই বক্ষঃস্থলে নিহিত সব কিছু আল্লাহ্ জানেন।  \n\n \n\n" +
                " ০৩১:০২৪] আমরা তাদেরকে ক্ষণিকের জন্য সুখ-সম্ভোগ করতে দিব, অতঃপর আমরা তাদেরকে গুরুতর দুঃখ-কষ্টের দিকে তাড়িয়ে নিয়ে যাব।  \n\n \n\n" +
                " ০৩১:০২৫] এবং যদি আপনি তাদেরকে জিজ্ঞেস করেন, \"বায়ুমন্ডলগুলো ও পৃথিবীগুলোকে কে সৃষ্টি করেছেন?\" তাহলে তারা অবশ্যই বলবে, \"আল্লাহ্।\" আপনি বলুন, \"সমস্ত ধন্যবাদ আল্লাহর জন্য।\" কিন্তু তাদের অধিকাংশই তা জানে না।  \n\n \n\n" +
                " ০৩১:০২৬] বায়ুমন্ডলগুলো ও পৃথিবীগুলোতে যাকিছু আছে সব আল্লাহরই জন্য। নিশ্চই আল্লাহ্ সেই সত্তা, যিনি কনায় সমৃদ্ধশালী এবং অতীব ধন্যবাদযোগ্য।  \n\n \n\n" +
                " ০৩১:০২৭] এবং পৃথিবীতে যত গাছ আছে যদি সব কলম হয়, এবং যত সমুদ্র আছে, তার সাথে যদি আরও অগণিত সমুদ্র কালি হয়ে যুক্ত হয়, তথাপি আল্লাহর বাণী শেষ হবে না। নিশ্চই আল্লাহ্ ভালবাসাকনার মহাসমূদ্র, মহাবিজ্ঞানী।  \n\n \n\n" +
                " ০৩১:০২৮] তোমাদের সৃষ্টি যেমন (মরণশীল)একক-কোষের সমষ্টি এবং তোমাদের পুনরুথানও তেমনি (মৃত্যুহীন)একক-কোষের সমষ্টি । নিশ্চই আল্লাহ্ সর্বশ্রোতা, সর্বদ্রষ্টা।  \n\n \n\n" +
                " ০৩১:০২৯] আপনি কি দেখেন না যে, আল্লাহ্ রাত্রিকে দিবসে প্রবিষ্ট করেন এবং দিবসকে রাত্রিতে প্রবিষ্ট করেন, এবং সূর্য ও চন্দ্রকে সেবায় নিয়োজিত করেছেন; এদের প্রত্যেকেই এক নিদিষ্টি মিয়াদের কক্ষপথে ছুটে চলেছে এবং আপনারা যা করছেন আল্লাহ্ সে সম্বন্ধে সম্পুর্ণ অবহিত?  \n\n \n\n" +
                " ০৩১:০৩০] এগুলো আল্লাহর জন্য, যিনি যূক্তিযূক্ত(বিজ্ঞানপূর্ণ) এবং তারা তাঁর বদলে যাকে ডাকে তারা নিশ্চই অন্তঃসারশূণ্য ; আসলে আল্লাহ অতীব মৌলিক, অতীব মহান।  \n\n \n\n" +
                " ০৩১:০৩১] আপনি কি দেখেন না যে, নৌযানগুলি আল্লাহর অনুগ্রহ বহন করে সমুদ্রে চলাচল করছে যেন তিনি আপনাদেরকে তাঁর আয়াত(নিদর্শন)গুলো থেকে কিছু দেখান? নিশ্চই এতে প্রত্যেক ধৈর্যশীল, কৃতজ্ঞ বান্দার জন্য বহু আয়াত(নিদর্শন) আছে।  \n\n \n\n" +
                " ০৩১:০৩২] এবং যখন কোন তরঙ্গ তাদেরকে শামিয়ানার মত ঢেকে ফেলে তখন তারা (একাগ্রচিত্তে)আল্লাহকে ডাকতে থাকে তাঁর জন্য বিশুদ্ধ জীবন-বিধানের মাধ্যমে; অতঃপর যখন তিনি তাদেরকে উদ্ধার করে স্থলে দিকে নিয়ে আসেন তখন তাদের কেউ  \n\n \n\n" +
                "কেউ মধ্যপথ অবলম্বনকারী হয়। এবং শুধু বিশ্বাসঘাতক, অকৃতজ্ঞ লোকই আমাদের আয়াত(নিদর্শন) গুলোকে অস্বীকার করে।  \n\n \n\n" +
                " ০৩১:০৩৩] হে লোক সকল ! তোমরা তোমাদের ক্রমবিকাশকের সচেতনতা অবলম্বন কর এবং সে দিন সম্বন্ধে শঙ্কিত হও যেদিন কোন পিতা তার পূত্রের কোন উপকারে লাগবে না এবং পূত্রও তার পিতার কোন উপকারে লাগবে না। নিশ্চই আল্লাহর প্রতিশ্রুতি বিজ্ঞান ভিত্তিক, অতএব ইহকালীন-জীবন যেন তোমাদেরকে বিপথে চালিত না করে এবং কোনও ভণ্ড-প্রতারক(পীর-পুরোহিত-যাযক-হুজুর) যেন তোমাদেরকে আল্লাহ সম্বন্ধে বিপথে চালিত না করে।  \n\n \n\n" +
                " ০৩১:০৩৪] পূনরুত্থানের জ্ঞান একমাত্র আল্লাহর কাছেই আছে। তিনিই বৃষ্টি বর্ষণ করেন, এবং জরাযুতে যাকিছু আছে তা তিনিই জানেন। এবং কেউ জানে না যে আগামীকাল সে কী উপার্জন করবে, এবং কেউ জানে না যে কোন স্থানে সে মরবে। নিশ্চই আল্লাহ্ সর্বজ্ঞানী, সর্বজ্ঞাতা।  \n\n \n\n");
        editor.putString("30", "পরিচ্ছেদ ০৩০.দৃশ্যঃ রোম-সম্রাজ্য (সূরা আর-রুম The Roman Empire)  \n\n \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৬১ আয়াত এবং ৬ রুকূ আছে।  \n\n \n\n" +
                " ০৩০:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০৩০:০০১] আলিফ লাম মীম্।  \n\n \n\n" +
                " ০৩০:০০২] রোমানরা পরাজিত হয়েছে-  \n\n \n\n" +
                " ০৩০:০০৩] নিকটবর্তী দেশে এবং তারা তাদের পরাজয়ের পরে অচিরেই বিজয়ী হবে,  \n\n \n\n" +
                " ০৩০:০০৪] মাত্র কয়েক বছরের মধ্যে। সর্বাধিপত্য পূর্বে ও পরে আল্লাহরই-এবং সেদিন স্বীকারকারীরা অত্যন্ত আনন্দিত হবে-  \n\n \n\n" +
                " ০৩০:০০৫] আল্লাহর সাহায্যে, তিনি যাকে চান সাহায্য করেন। যেহেতু তিনি ভালবাসা-কনিকার মহাসমূদ্র, এককসত্তা দয়াময়।  \n\n \n\n" +
                " ০৩০:০০৬] এটি আল্লাহর প্রতিশ্রুতি। আল্লাহ নিজের প্রতিশ্রুতি ভঙ্গ করেন না ; কিন্তু অধিকাংশ লোক বুঝে না।  \n\n \n\n" +
                " ০৩০:০০৭] তারা কেবল, ইহকালীন জীবনের প্রকাশিত হওয়া বিষয় বুঝে; কিন্তু পরবর্তিতে কী আছে বা হতে পারে তা সমন্ধে সম্পুর্ণ উদাসিন।  \n\n \n\n" +
                " ০৩০:০০৮] তারা নিজেরা কি কখনও ভাবে না, আল্লাহ বায়ুমন্ডলগুলো ও পৃথিবীগুলো এবং এতদুভয়ের মধ্যে যাকিছু আছে সবই যথাযথ বিজ্ঞানের ভিত্তিতে এবং নির্দিষ্ট মেয়াদ (প্রলম্বিত গুনাঙ্ক) ছাড়া সৃষ্টি করেন নাই ? কিন্তু মানুষের মধ্যে অধিকাংশই নিজেদের ক্রমবিকাশকের সাক্ষাৎ (মহাকাশ-বিজয়) অস্বীকারকারী।  \n\n \n\n" +
                " ০৩০:০০৯] তারা কি পৃথিবীতে ভ্রমণ করে নাই যেন তারা দেখতে পারে, তাদের পূর্ববর্তী লোকদের পরিণাম কেমন (মন্দ) হয়েছিল ? তারা শক্তিতে অধিকতর প্রবল ছিল, তারা অনেক দেশ জয় করেছিল এবং পৃথিবীতে তাণ্ডবলীলা চালিয়েছিল এবং এরা(বর্তমান মানুষ) ভূপৃষ্ঠে যে পরিমাণ বসতি স্থাপন করেছিল তার চেয়ে বেশি পরিমাণে তারা(আগের মানুষ) এতে বসতি স্থাপন করেছিল। এবং তাদের কাছে তাদের রসূলরা সুস্পষ্ট প্রামান্য তথ্যসহ এসেছিল। আল্লাহ এমন নয়, তিনি তাদের উপর কোনও অন্যায় করেছিলেন, বরং তারা নিজেরাই নিজেদের উপর অন্যায় করত।  \n\n \n\n" +
                " ০৩০:০১০] অতঃপর যারা মন্দ কাজ করেছিল তাদের পরিণাম অত্যন্ত মন্দ হয়েছিল, কারণ তারা আল্লাহর আয়াতগুলোকে মিথ্যা প্রতিপন্ন করত এবং সেগুলো নিয়ে ঠাট্টা-বিদ্রুপ করত।  \n\n \n\n" +
                " ০৩০:০১১] আল্লাহই সৃষ্টিকে প্রথমে উদ্ভব করেন, অতঃপর এর পূনরাবৃত্তি করেন, অতঃপর তাঁরই দিকে তোমাদেরকে প্রত্যাবর্তিত করা হবে।  \n\n \n\n" +
                " ০৩০:০১২] এবং যেদিন সময় দাঁড়িয়ে পড়বে(অতীত-বর্তমান-ভবিষ্যত একসাথে দেখা যাবে) অর্থাৎ স্থির-সময় আসবে, সেদিন অপরাধীরা বঞ্চিত হবে।  \n\n \n\n" +
                " ০৩০:০১৩] এবং তাদের বানোয়াট পৃথকসত্বা থেকে কেউই তাদের জন্য মধ্যস্থতাকারী হবে না এবং (তখন) তাদের নিজেদের (তথাকথিত) পৃথকসত্বারা তাদেরকে অস্বীকার করবে।  \n\n \n\n" +
                " ০৩০:০১৪] এবং যেদিন সময় দাঁড়িয়ে পড়বে(অতীত-বর্তমান-ভবিষ্যত একসাথে দেখা যাবে) অর্থাৎ স্থির-সময় আসবে, – সেদিন তারা পৃথক হয়ে যাবে।  \n\n \n\n" +
                " ০৩০:০১৫] অতঃপর বলছি তাদের কথা, যারা আল্লাহর এককসত্বা মেনে নিয়েছে এবং ভালকাজ করেছে, তাদেরকে মনোরম উদ্যানে সম্মান ও আনন্দ দান করা হবে।  \n\n \n\n" +
                " ০৩০:০১৬] কিন্তু যারা অস্বীকার করেছে এবং আমাদের আয়াতগুলো ও পরকালের সাক্ষাৎকে মিথ্যা প্রতিপন্ন করেছে তাদেরকে চরম দুঃখ-কষ্টের সামনে উপস্থিত করা হবে।  \n\n \n\n" +
                " ০৩০:০১৭] সুতরাং তোমরা আল্লাহর দেয়া কর্তব্যকাজ কর তখনও যখন তোমরা অপরাহ্নে প্রবেশ কর এবং তখনও যখন তোমরা প্রভাত কালে প্রবেশ কর।  \n\n \n\n" +
                " ০৩০:০১৮] বায়ুমণ্ডলগুলোতে ও পৃথিবীগুলোতে সকল ধন্যবাদ তাঁরই জন্য, (এভাবে তাঁর দেয়া কর্তব্যকাজ কর) সন্ধ্যাকালে এবং যখন মধ্যাহ্নে প্রবেশ করে তখনও।  \n\n \n\n" +
                " ০৩০:০১৯] তিনি জীবিতকে মৃত থেকে বের করেন এবং ভূমিকে এর নির্জীবতার পর সঞ্জীবিত করেন। এবং এভাবেই তোমাদের(সংরক্ষিতভ্রূণগুলো)কে বের করা হবে।  \n\n \n\n" +
                " ০৩০:০২০] এবং তাঁর আয়াত(নিদর্শন)গুলোর মধ্যে এও একটি (নিদর্শন), তিনি তোমাদেরকে মাতৃ ফেলোপিয়ান টিউবের ফাঁদ-প্রান্তে (ক্ষূদ্র ডিম্বানু) থেকে সৃষ্টি করেছেন। অতঃপর দেখ ! তোমরা মানুষ হিসেবে (বিভিন্ন পৃথিবীতে) ছড়িয়ে পড়ছ।  \n\n \n\n" +
                " ০৩০:০২১] এবং তাঁর আয়াত(নিদর্শনাবলী) গুলো থেকে এও একটি (নিদর্শন) যে, তিনি তোমাদের জন্য তোমাদেরই মধ্য থেকে জুটি সৃষ্টি করেছেন  \n\n \n\n" +
                "যেন তোমরা তাদের কাছে প্রশান্তি লাভ করতে পার, এবং তিনি তোমাদের পরস্পরের মধ্যে প্রেম-ভালবাসা ও দয়া-মায়া সৃষ্টি করেছেন। নিশ্চই এর মধ্যে গবেষক-সম্প্রদায়ের জন্য বহু নিদর্শন আছে।  \n\n \n\n" +
                " ০৩০:০২২] এবং তাঁর আয়াত(নিদর্শন)এর মধ্যে বায়ুমণ্ডলগুলো ও পৃথিবীগুলো সৃষ্টি করা এবং তোমাদের ভাষায় ও বর্ণে প্রভেদ সৃষ্টি করাও অন্যতম নিদর্শন। নিশ্চই এর মধ্যে জ্ঞানী লোকদের জন্য বহু নিদর্শন আছে ।  \n\n \n\n" +
                " ০৩০:০২৩] এবং তাঁর আয়াত(নিদর্শনাবলী)এর মধ্যে রাতে এবং দিনে তোমাদের ঘুম এবং তাঁর বিজ্ঞান-শিক্ষা লাভের জন্য তোমাদের প্রচেষ্টা করাও অন্যতম নিদর্শন। নিশ্চই এর মধ্যেও বহু নিদর্শন আছে সে সকল লোকের জন্য যারা শ্রবণ করে।  \n\n \n\n" +
                " ০৩০:০২৪] এবং তাঁর নিদর্শনগুলো থেকে এও যে, তিনি তোমাদের মধ্যে ভয় ও আশা সঞ্চারের জন্য তোমাদেরকে বিদ্যুৎ প্রদর্শন করেন, এবং আকাশ থেকে পানি বর্ষণ করেন, অনন্তর তা দিয়ে পৃথিবীগুলোকে এদের নির্রজীবতার পর সঞ্জীবিত করেন। নিশ্চই এর মধ্যে বুদ্ধিমান-সম্প্রদায়ের জন্য বহু নিদর্শন আছে।  \n\n \n\n" +
                " ০৩০:০২৫] এবং তাঁর আয়াত(নিদর্শন)এর অন্তর্ভুক্ত এও যে তাঁরই আদেশে বায়ুমণ্ডলগুলো ও পৃথিবীগুলো প্রতিষ্ঠিত আছে, অতঃপর যখন তিনি তোমাদেরকে ভূগর্ভ থেকে বের হওয়ার জন্য আহবান করবেন তখন দেখ ! সহসা তোমরা পৃথিবীগুলো থেকে বের হয়ে আসবে।  \n\n \n\n" +
                " ০৩০:০২৬] এবং বায়ুমণ্ডলগুলোতে এবং পৃথিবীতেগুলোতে যারা আছে তারা সকলে তাঁর প্রতি বিনীত।  \n\n \n\n" +
                " ০৩০:০২৭] যেহেতু তিনি সৃষ্টিকে প্রথমে উদ্ভব করেন, অতঃপর তিনিই এর পূনরাবৃত্তি করেন, এবং এটি তাঁর জন্য অতি সহজ বিষয়। এবং বায়ুমণ্ডলগুলোতে ও পৃথিবীগুলোতে গুলোতে সর্বোচ্চ উপমা তাঁরই, এবং তিনি ভালবাসা-কনিকার মহাসমূদ্র, মহা বিজ্ঞানী।  \n\n \n\n" +
                " ০৩০:০২৮] তিনি তোমাদের জন্য তোমাদেরই মধ্য থেকে এক উপমা বর্ণনা করছেন। তোমাদের বন্ধুবান্ধবীদের মধ্য থেকে কেউ  \n\n \n\n" +
                "কি সে ধন-সম্পদে, যা আমরা তোমাদেরকে দিয়েছি, তোমাদের সমান অংশিদার হয়ে যায়, এবং তোমরা তাদের জন্য যতটুকু উদ্দিগ্ন হও সেভাবে তোমরা নিজেদের জন্য উদ্দেগ-উৎকণ্ঠায় থাক? এইরুপে আমরা বুদ্ধিমান জাতির জন্য আয়াত(নিদর্শন)গুলো স্পষ্টভাবে বর্ণনা করে থাকি।  \n\n \n\n" +
                " ০৩০:০২৯] বরং, যারা জ্ঞানহীনতার কারনে অন্যায়ের অনুসরণ করে চলছে কেউই তাদের সাহায্যকারী হবে না। এবং আল্লাহ যাকে বিপথগামী করেন, কে আছে যে তাকে সুপথপ্রাপ্তীর নির্দেশনা দিবে?  \n\n \n\n" +
                " ০৩০:০৩০] অতএব আপনি আপনার সমস্ত মনোযোগ নিবদ্ধ করুন স্থায়ী জীবন-বিধান অর্থাৎ আল্লাহর সৃষ্ট প্রকৃতির জন্য যার ভিত্তিতে তিনি মানবজাতিকে সৃষ্টি করেছেন। আল্লাহর সৃষ্টির মধ্যে কোন পরিবর্তন নাই। এটিই স্থায়ী তত্ত্বাবধায়ক জীবন-বিধান -কিন্তু অধিকাংশ লোকই এটি অবগত নয়।  \n\n \n\n" +
                " ০৩০:০৩১] তোমরা \"ফজর ও ইশায়\" তাঁর দিকে ঝুঁক, এবং তাঁর জন্য সচেতনতা অবলম্বন কর এবং সালাত স্থাপন কর এবং দ্বিধাগ্রস্থদের অন্তর্ভূক্ত হবে না।  \n\n \n\n" +
                " ০৩০:০৩২] যারা নিজেদের জীবন-বিধানকে খন্ড বিখন্ড করেছে এবং বিভিন্ন দলে বিভক্ত হয়েছে; তাদের প্রত্যেকটি দলই তাদের কাছে যাকিছু আছে তা নিয়ে আনন্দিত।  \n\n \n\n" +
                " ০৩০:০৩৩] এবং মানুষকে যখন কোনও কষ্ট-ক্লেশ স্পর্শ করে তখন তারা তাদের ক্রমবিকাশককে তাঁরই প্রতি \"ফজর ও ইশায়\" ঝুঁকে ডাকে ; অতঃপর যথন তাদেরকে তিনি নিজ রহমতের স্বাদ গ্রহণ করান তখন তাদের একদল নিজেদের ক্রমবিকাশকের সঙ্গে পৃথকসত্বা নির্ধারণ করতে আরম্ব করে-  \n\n \n\n" +
                " ০৩০:০৩৪] অস্বীকৃতির জন্য, যা আমরা তাদের জন্য বরাদ্দ করেছি। সুতরাং তোমরা ভোগ-বিলাস করে নাও; তোমরা অচিরেই পরিণাম জানতে পারবে।  \n\n \n\n" +
                " ০৩০:০৩৫] আমরা কি তাদের জন্য কোন প্রমাণ নাযেল করেছি যার সমর্থনে কথা বলতে গিয়ে তারা তাঁর পৃথকসত্বা নির্ধারণ করছে ?  \n\n \n\n" +
                " ০৩০:০৩৬] এবং যখন আমরা মানুষকে রহমতের স্বাদ গ্রহণ করাই তখন তারা তাতে আনন্দিত হয় এবং যদি তাদের নিজেদের কৃতকর্মের ফলে তাদের উপর কোন বিপদ আসে তখন তারা হতাশায় ভেঙ্গে পড়ে।  \n\n \n\n" +
                " ০৩০:০৩৭] তারা কি দেখে নাই, আল্লাহ যার জন্য চান জীবিকাকে সম্প্রসারিত করে দেন এবং গণনা করে নির্ধারণ করে দেন? নিশ্চই এতে সে জাতির জন্য বহু নিদর্শন আছে যারা আল্লাহকে এককসত্বা মেনে নেয়।  \n\n \n\n" +
                " ০৩০:০৩৮] অতএব আপনি প্রতিবেশি-ঘণিষ্টদেরকে তাদের প্রাপ্য দিন এভাবে মিসকীনদেরকে এবং পথশিশু-টোকাইদেরকেও। এটি তাদের জন্য উত্তম যারা আল্লাহর সন্তুষ্টি লাভের ইচ্ছে করে; এবং এরাই সফল হবে।  \n\n \n\n" +
                " ০৩০:০৩৯] এবং তোমরা যে মুলধন সুদে খাটিয়ে থাক যাতে তা লোকের ধন-সম্পদের সাথে বৃদ্ধি পায়, আসলে তা আল্লাহর কাছে বৃদ্ধি পায় না । এবং তোমরা আল্লাহর সন্তোষ লাভের উদ্দেশ্যে শুদ্ধতা অর্জন করতে (দরিদ্রদের অন্ন-বস্ত্র এককভাবে দান এবং দারিদ্রদূরিকরণে সম্মিলিত ভাবে) যা দান কর সে ধন-সম্পদই বহুগুণে বৃদ্ধি পাচ্ছে।  \n\n \n\n" +
                " ০৩০:০৪০] আল্লাহ তিনি, যিনি তোমাদেরকে সৃষ্টি করেছেন, অতঃপর জীবিকা দিয়েছেন, অতঃপর তিনি তোমাদেরকে মৃত্যু দেন অতঃপর তিনি তোমাদেরকে জীবিত করেন। তোমাদের কল্পিত পৃথকসত্বা(পীর-পূরোহীত-যাযক-হুজুর)দের মধ্যে কে আছে যে এসকল কাজের কিছু মাত্রও করতে পারে? তিনি নিয়মশীল মৌলিক এবং তাদের কল্পিত পৃথকসত্বা(পীর-পূরোহীত-যাযক-হুজুর)দের থেকে তিনি বহু উর্ধ্বে।  \n\n \n\n" +
                " ০৩০:০৪১] মানুষের হাতগুলো যা অর্জন করেছে তার ফলে জলে-স্থলে-অন্তরিক্ষে দূর্নীতি ছেয়ে গেছে। পরিণামে আল্লাহ তাদেরকে, তারা যে কাজ করেছে তারকতকাংশের শাস্তি ভোগ করাবেন যেন তারা (তাদের অবাধ্যতা থেকে) ফিরে আসে।  \n\n \n\n" +
                " ০৩০:০৪২] আপনি বলুন, তোমরা পৃথিবীতে ভ্রমণ কর এবং দেখ পূর্ববর্তী লোকদের কী পরিণাম হয়েছিল। তাদের মধ্যে বেশিরভাগই পৃথকসত্তাকল্পনাকারী ছিল।  \n\n \n\n" +
                " ০৩০:০৪৩] অতএব আপনি আপনার সমস্ত মনোযোগ স্থায়ী তত্ত্বাবধায়ক জীবন-বিধানের প্রতি নিবিষ্ট করুন, আল্লাহ থেকে, সেদিনটি আসার আগে, যেদিনকে টলানো যাবে না। যেদিন তারা (স্বীকারকারী ও অস্বীকারকারীরা একে অপর থেকে) বিচ্ছিন্ন হয়ে পড়বে।  \n\n \n\n" +
                " ০৩০:০৪৪] যে ব্যক্তি অস্বীকার করেছে তার অস্বীকারের কূফল তারই উপরই বর্তাবে এবং যারা ভালকাজ করছে তারা নিজেদেরই জন্য সূখ-স্বচ্ছন্দ প্রস্তুত করছে।  \n\n \n\n" +
                " ০৩০:০৪৫] যেন আল্লাহ নিজ বিজ্ঞান-প্রযূক্তি দিয়ে তাদেরকে পুরস্কৃত করেন, যারা আল্লাহকে এককসত্বা মেনে নিয়েছে এবং ভালকাজ করছে। তিনি  \n\n \n\n" +
                "অস্বীকারকারীদেরকে আদৌ ভালবাসেন না।  \n\n \n\n" +
                " ০৩০:০৪৬] এবং তাঁর নিদর্শনগুলোর অন্তর্গত এও যে, তিনি আবর্তন-গতিকে আনন্দের বন্যা হিসেবে প্রেরণ করেন, এবং যেন তিনি তোমাদেরকে নিজ অনুগ্রহের স্বাদ গ্রহন করান, এবং যেন নৌযান-আকাশযান-নভোযানগুলি তাঁরই আদেশে(আবর্তন-গতি কাজে লাগিয়ে) পরিচালিত হয় এবং যেন তোমরা তাঁর বিজ্ঞানশিক্ষা-প্রযূক্তি অন্বেষন(মহাকাশ বিজয়) করতে পার এবং কৃতজ্ঞতা প্রকাশ করতে পার।  \n\n \n\n" +
                " ০৩০:০৪৭] এবং নিশ্চই আমরা আপনার পূর্বে বহু রাসূলকে তাদের জাতির কাছে পাঠিয়েছিলাম এবং তারা তাদের কাছে সুস্পষ্ট প্রামান্য তথ্যসহ এসেছিল। অতঃপর যারা অপরাধ করেছিল আমরা তাদের থেকে উপযুক্ত প্রতিশোধ গ্রহণ করেছিলাম। যেহেতু স্বীকারকারীদেরকে বিজ্ঞান চর্চায়-গবেষণায় সাহায্য করাই আমাদের কাজ।  \n\n \n\n" +
                " ০৩০:০৪৮] আল্লাহ, যিনি বায়ুরাশিকে প্রেরণ করেন, অতঃপর তা মেঘ উত্তোলন করে। অতঃপর তিনি যেভাবে চান তাকে আকাশে বিস্তৃত করেন এবং তিনি তাকে খন্ড বিখন্ড করে দেন এবং আপনি দেখতে পান যে তার মধ্য থেকে বৃষ্টি নির্গত হচ্ছে। অতঃপর যখন তিনি নিজ বান্দাদের মধ্য থেকে যাকে ইচ্ছা করেন তা পৌঁছে দেন, তখন দেখুন! তারা কেমন উৎফুল্ল হতে থাকে।  \n\n \n\n" +
                " ০৩০:০৪৯] যদিও ইতোপূর্বে – তাদের উপর বৃষ্টি বর্ষনের পূর্বে তারা সম্পুর্ন রুপে নিরাশ হয়ে গিয়েছিল।  \n\n \n\n" +
                " ০৩০:০৫০] অতএব আপনি আল্লাহর রহমতের ফলাফলের প্রতি লক্ষ্য করুন, কিভাবে তিনি পৃথিবীকে এর নির্জীবতার পর সঞ্জীবিত করেন। নিশ্চই তিনিই আল্লাহ, যিনি মৃতকে জীবিত করেন। এবং তিনি সকল বস্তুর পরিমিত পরিমাপ নিরুপনে সক্ষম।  \n\n \n\n" +
                " ০৩০:০৫১] এবং যদি আমরা বায়ু প্রবাহিত করি এবং তারা তাকে(শস্যকে) পাকতে দেখে তখন তারা অকৃতজ্ঞতা প্রকাশ করতে আরম্ভ করে।  \n\n \n\n" +
                " ০৩০:০৫২] যেহেতু আপনি (আপনার) আহবান নিষ্ক্রিয়মনা(মৃত)দেরকেও শুনাতে পারবেন না এবং ইচ্ছে-বধির(যারা শুনেও শোনে না)দেরকেও শুনাতে পারবে না যখন তারা কৌশল উদ্ভাবন করে;  \n\n \n\n" +
                " ০৩০:০৫৩] এবং আপনি ইচ্ছে-অন্ধ(যারা দেখেও দেখে না)দেরকেও তাদের পথভ্রষ্টতা থেকে ফিরিয়ে সুপথপ্রাপ্তির নির্দেশনার পথে পরিচালিত করতে পারবেন না। আপনি কেবল তাদেরকে শোনাতে পারবেন যারা আমাদের আয়াতগুলো মেনে নেয়, কারণ তারা সমর্পিত।  \n\n \n\n" +
                " ০৩০:০৫৪] আল্লাহ, যিনি তোমাদেরকে দূর্বল অবস্থায় সৃষ্টি করেন এবং দুর্বলতার পর তোমাদেরকে শক্তি দান করেন, এবং সে শক্তির পর বার্ধক্যে পূনরায় দুর্বল করেন, তিনি যা চান (ভ্রূণ)সৃষ্টি করেন। এবং তিনি সর্বজ্ঞানী, ক্ষমতাবান।  \n\n \n\n" +
                " ০৩০:০৫৫] এবং যেদিন সময় দাঁড়িয়ে পড়বে(অতীত-বর্তমান-ভবিষ্যত একসাথে দেখা যাবে) অর্থাৎ স্থির-সময় আসবে, তখন অপরাধীরা হলফ করে বলবে, (ইহকালে)তারা অল্পক্ষণ ছাড়া অবস্থান করে নাই; এভাবেই তারা প্রতারিত হোত।  \n\n \n\n" +
                " ০৩০:০৫৬] কিন্তু যারা জ্ঞানী ও এককসত্বার স্বীকৃতি দানকারী তারা বলবে, নিশ্চই তোমরা আল্লাহর গ্রন্থ অনুযায়ী পূনরুত্থান দিবস পর্যন্ত অবস্থান করেছ, এটিই সে পুনরুথান দিবস; কিন্তু তোমরা জানতে না।  \n\n \n\n" +
                " ০৩০:০৫৭] সুতরাং সেদিন অন্যায়কারীদের আত্মপক্ষ সমর্থন চেষ্টায় তারা মোটেও লাভবান হবে না এবং তাদেরকে ইহকালে ফেরার সুযোগও দেয়া হবে না।  \n\n \n\n" +
                " ০৩০:০৫৮] এবং আমরা মানুষের জন্য এ কুরআনে সর্বপ্রকার উপমা সবিস্তারে বর্ণনা করেছি এবং যদি আপনি তাদের কাছে কোন আয়াত উপস্থিত করেন তাহলে, যারা অস্বীকার করছে তারা নিশ্চই বলবে, \"তোমরা প্রাচীনপন্থি ছাড়া কিছুই নও\"।  \n\n \n\n" +
                " ০৩০:০৫৯] এভাবে আল্লাহ্ তাদের মন-মগজ সংস্কার(ব্রেইন ট্রান্সপ্লান্ট) করে দেন যারা অজ্ঞ-মূর্খ।  \n\n \n\n" +
                " ০৩০:০৬০] অতএব আপনি ধৈর্য ধারণ করুন। নিশ্চই আল্লাহর ওয়াদা বিজ্ঞানমূলক; এবং যাদের নিশ্চিত জ্ঞান নাই তারা যেন আপনাকে মহাকাশযানের খাড়া উৎক্ষেপণে আদৌ স্থানচ্যুত না করে।");

        editor.putString("29", "পরিচ্ছেদ ০২৯.দৃশ্যঃ মাকড়সার জাল (সূরা আল-আনকাবূত The Spider Web)  \n\n \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৭০ আয়াত এবং ৭ রুকূ আছে।  \n\n \n\n" +
                " ০২৯:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০২৯:০০১] আলিফ লাম মীম্।  \n\n \n\n" +
                " ০২৯:০০২] মানুষ কি ভাবছে, তাদেরকে ছেড়ে দেয়া হবে, \"আমরা আল্লাহর এককসত্বা মেনে নিয়েছি\" বললেই, এবং তাদেরকে পরীক্ষা করা হবে না ?  \n\n \n\n" +
                " ০২৯:০০৩] এবং নিশ্চই আমরা তাদের পূর্ববর্তীদেরকে পরীক্ষা করেছিলাম। সুতরাং আল্লাহ তাদেরকেও অবশ্যই নিরপেক্ষ ভাবে প্রমান করবেন যারা সত্যবাদী এবং অবশ্যই তাদেরকেও প্রমান করবেন যারা মিথ্যাবাদী।  \n\n \n\n" +
                " ০২৯:০০৪] যারা মন্দ কাজকরে, তারা কি মনে করে যে, তারা আমাদের আয়ত্বের বাইরে চলে যাবে? কত মন্দ তাদের সিদ্ধান্ত !  \n\n \n\n" +
                " ০২৯:০০৫] আল্লাহর সাথে যে ব্যক্তি সাক্ষাতের আশা রাখে নিশ্চই তাহলে আল্লাহ অবশ্যই অবিরত আসছেন। এবং তিনিই সর্বশ্রোতা, সর্বজ্ঞানী।  \n\n \n\n" +
                " ০২৯:০০৬] এবং যে ব্যক্তি চেষ্টা সাধনা করে বস্তুতঃ সে নিজেরই জন্য চেষ্টা সাধনা করে, নিশ্চই আল্লাহ্ মহাবিশ্বের সকল কনার অধিকারী।  \n\n \n\n" +
                " ০২৯:০০৭] এবং যারা আল্লাহর এককসত্বা মেনে নেয় এবং ভালকাজ করে, নিশ্চই আমরা তাদের মন্দকাজগুলোকে তাদের থেকে অপসারণ করে দিব। এবং নিশ্চই আমরা তাদেরকে তাদের কৃতকর্মগুলোর সর্বোত্তম পুরষ্কার দান করব।  \n\n \n\n" +
                " ০২৯:০০৮] এবং আমরাই মানবজাতিকে তার পিতামাতার সাথে সদ্বব্যবহার করার তত্বাবধায়ক আদেশ দিয়েছি এবং (বলেছি) যদি তারা প্রচেষ্টা করে, যেন আপনি আমার সাথে এমন কিছু পৃথকসত্বা ধার্য করেন, যা সমন্ধে আপনার কোন জ্ঞান নাই, তাহলে আপনি তাদের আদেশ মান্য করবেন না। আপনাদের সকলকে আমারই দিকে ফিরে আসতে হবে; তখন আমি আপনাদেরকে আপনাদের কৃত-কর্মগুলো সমন্ধে পূর্ণরুপে অবহিত করব।  \n\n \n\n" +
                " ০২৯:০০৯] যেহেতু যারা আল্লাহর এককসত্বা মেনে নেয় এবং ভালকাজ করে, তাদেরকে অবশ্যই আমরা সৎকর্মশীল(*সালেহিন*)দের মধ্যে অন্তর্ভূক্ত করব।  \n\n \n\n" +
                " ০২৯:০১০] এবং মানুষের মধ্যে কিছু এমন আছে যারা বলে, আমরা আল্লাহর এককসত্বা মেনে নিয়েছি ? কিন্তু যখন আল্লাহর পথে কোনও আঘাৎ পায়, তারা মানুষের করা বেইজ্জতিকে, আল্লাহর প্রদত্ত দুঃখ-কষ্ট মনে করে। এবং যদি আপনার ক্রমবিকাশক থেকে কোন সাহায্য আসে তখন তারা জোর দিয়ে বলে, \"নিশ্চই আমরাও তোমাদের সাথে ছিলাম।\" বিশ্ববাসীর বক্ষঃস্থলে যা কিছু আছে, আল্লাহ কি তা সবচেয়ে বেশি অবগত নন?  \n\n \n\n" +
                " ০২৯:০১১] এবং অবশ্যই আল্লাহ নিরপেক্ষ ভাবে প্রমান করবেন যারা আল্লাহর এককসত্বা মেনে নিয়েছে এবং তাদেরকেও অবশ্যই নিরপেক্ষ ভাবে প্রমান করবেন যারা দ্বিধাগ্রস্থ(মুনাফিক)।  \n\n \n\n" +
                " ০২৯:০১২] এবং অস্বীকারকারীরা স্বীকারকারীদেরকে বলে, তোমরা আমাদের পথের অনুসরণ কর, আমরা তোমাদের পাপের বোঝা বহন করব। অথচ তারা তাদের পাপের বোঝা থেকে (নিজেরা)কিছুই বহন করতে পারবে না। তারা অবশ্যই মিথ্যা বলছে ।  \n\n \n\n" +
                " ০২৯:০১৩] আসলে তারা নিজেদের বোঝাও বহন করবে এবং তাদের বোঝার সাথে অন্য আরও বোঝাও বহন করবে। এবং তারা যা মিথ্যা (হাদিস) উদ্ভাবন করত সে সমন্ধে পুনরুত্থান দিবসে তাদেরকে অবশ্যই জিজ্ঞেস করা হবে।  \n\n \n\n" +
                " ০২৯:০১৪] এবং আমরা নূহ'কে রিসালাত দিয়ে তার জাতির কাছে পাঠিয়েছিলাম, অনন্তর তা তাদের মধ্যে নয়শত পঞ্চাশ বৎসর সম্প্রচারিত হয়ে ছিল। এবং ঘূর্ণিঝড়-জলোচ্ছাস তাদেরকে গ্রাস করল, যারা অন্যায়কারী ছিল।  \n\n \n\n" +
                " ০২৯:০১৫] সুতরাং আমরা তাকে এবং (তার) আশ্রয়কেন্দ্রে আরোহনকারী সাথীদেরকে বাঁচিয়ে নিলাম, এবং এটিকে সকল বিশ্ববাসীর জন্য একটি আয়াত(নিদর্শন) করলাম।  \n\n \n\n" +
                "  \n\n \n\n" +
                " ০২৯:০১৬] এবং আমরা ইবরাহীমকেও (রসূল করে পাঠিয়েছিলাম) যখন সে তার জাতিকে বলেছিল, \"তোমরা আল্লাহর ইবাদত কর এবং তাঁর জন্য সচেতনতা অবলম্বন কর। এটিই তোমাদের জন্য উত্তম যদি তোমরা জানতে।  \n\n \n\n" +
                " ০২৯:০১৭] আল্লাহকে ছেড়ে তোমরা কেবল মুর্তি গুলোর পুজা করছ এবং অলীক ছলনার সৃষ্টি করছ। তোমরা আল্লাহকে ছেড়ে যাদের পুজা করছ তারা তোমাদেরকে আদৌ জীবিকা দিতে পারে না; সুতরাং তোমরা আল্লাহর কাছে জীবিকা প্রার্থনা কর এবং তাঁর সেবাকাজ কর এবং তাঁরই কৃতজ্ঞতা প্রকাশ কর। তোমাদেরকে তাঁরই দিকে প্রত্যাবর্তিত করা হবে।\"  \n\n \n\n" +
                " ০২৯:০১৮] এবং তোমরা যদি সত্যকে প্রত্যাক্ষান কর তাহলে তোমাদের পূর্ববর্তী জাতিগুলোও অবশ্যই (তাদের রসূলদেরকে) মিথ্যা প্রতিপন্ন করেছিল। যেহেতু আল্লাহর বানী সুস্পষ্ট ভাবে পৌঁছে দেয়াই হল রসূলের একমাত্র কর্তব্য।  \n\n \n\n" +
                " ০২৯:০১৯] তারা কি চিন্তা করে দেখে না, কিভাবে আল্লাহ বিবর্তনে সৃষ্টির প্রথম উদ্ভব করে থাকেন, অতঃপর এর পুনরাবর্তন করেন। নিশ্চই এটি আল্লাহর জন্য অতি সহজ।  \n\n \n\n" +
                " ০২৯:০২০] আপনি বলুন, \"তোমরা পৃথিবীতে প্ররিভ্রমন কর, অতঃপর দেখ, কিভাবে আল্লাহ বিবর্তনে সৃষ্টির প্রথম উদ্ভব করেছেন। অতঃপর আল্লাহই তাদেরকে শেষবার উত্থিত করবেন। নিশ্চই আল্লাহ প্রত্যেক বস্তুকে পরিমিত পরিমাপে সৃষ্টি করতে সক্ষম।\"  \n\n \n\n" +
                " ০২৯:০২১] তিনি যাকে চান দুঃখ-কষ্ট দেন এবং যার উপর চান দয়া করেন; তাঁরই দিকে তোমাদের আবর্ত-গতি।  \n\n \n\n" +
                " ০২৯:০২২] এবং তোমরা না পৃথিবীগুলোতে এবং না বায়ুমণ্ডলগুলোতে কখনও অলৌকিক-অপ্রাকৃতিক কিছু পাবে ; এবং আল্লাহ্ ছাড়া তোমাদের না কোন অভিভাবক আছে এবং না কোন সাহায্যকারী।  \n\n \n\n" +
                " ০২৯:০২৩] এবং যারা আল্লাহর আয়াত(নিদর্শণ)গুলোকে এবং তাঁর সাক্ষাৎকে অস্বীকার করে, তারাই আমার রহমত থেকে নিরাশ হয়ে গেছে। এবং তাদের জন্যই যন্ত্রনাদায়ক দুঃখ-কষ্ট থাকবে।  \n\n \n\n" +
                " ০২৯:০২৪] অতঃপর তার জাতির এছাড়া আর কোন উত্তর ছিলনা, তারা বলল, \"তাকে হত্যা কর অথবা তাকে অগ্নিদগ্ধ কর।\" কিন্তু আল্লাহ তাকে অগ্নিকুণ্ড থেকে রক্ষা করলেন। নিশ্চই এতে স্বীকারকারী জাতির জন্য বহু আয়াত(নিদর্শণ) আছে।  \n\n \n\n" +
                " ০২৯:০২৫] এবং সে বলল, \"তোমরা কেবল ইহকালীন জীবনে পারস্পারিক প্রেম-ভালবাসা স্থাপন করার জন্য আল্লাহকে ছেড়ে (তোমাদের তৈরী)মুর্তিগুলোকে গ্রহণ করেছ। অনন্তর পুনরুত্থানের দিনে তোমরা একে অপরকে অস্বীকার করবে এবং একে অপরের অমঙ্গল চাইবে। এবং তোমাদের আশ্রয়স্থল হবে অনুতাপের আগুন এবং কেউই তোমাদের সাহায্যকারী হবে না।  \n\n \n\n" +
                " ০২৯:০২৬] অতএব লূত তাকে মেনে নিল, এবং (ইবরাহীম) বলল, \"আমি আমার ক্রমবিকাশকের দিকে হিজরত করব; নিশ্চই  \n\n \n\n" +
                "তিনি ভালবাসা-কনিকার মহাসমূদ্র মহাবিজ্ঞানী।\"  \n\n \n\n" +
                " ০২৯:০২৭] এবং আমরা তাকে ইসহাক ও ইয়াকুবকে দান করলাম এবং তার বংশধরদের মধ্যে নবী পুরস্কার ও গ্রন্থ প্রবর্তিত করলাম এবং তাকে পৃথিবীতেও তার কর্মের বিনিময় দান করলাম এবং পরকালেও নিশ্চই সে সৎকর্মশীলদের অন্তর্ভূক্ত হবে।  \n\n \n\n" +
                " ০২৯:০২৮] এবং লূতকেও (আমরা রসূল করেছিলাম,) যখন সে তার জাতিকে বলেছিল, \"নিশ্চই তোমরা এমন এক অশ্লীল কাজ করছ যা তোমাদের আগে বিশ্ববাসীর মধ্যে অন্য কেউই করে নাই।  \n\n \n\n" +
                " ০২৯:০২৯] তোমরা কি (কাম চরিতার্থে) পুরুষদের কাছে আসছ এবং রাস্তা(anus) কেটে নিচ্ছ এবং নিজেদের সভায় প্রকাশ্যে সম্মিলিত ভাবে ঘৃণ্য কাজ করছ ?\" তখন তার জাতির কেবল একথা বলা ছাড়া আর কোন উত্তর ছিল না, \" যদি তুমি সত্যবাদী হয়ে থাক তাহলে আমাদের উপর আল্লাহর শাস্তি আন।\"  \n\n \n\n" +
                " ০২৯:০৩০] সে বলল, \"হে আমার ক্রমবিকাশক ! আপনি আমাকে এ যৌনবিকৃত-দূষিত-নীতিভ্রষ্ট জাতির বিরুদ্ধে সাহায্য করুন।\"  \n\n \n\n" +
                " ০২৯:০৩১] এবং যখন আমাদের দূতেরা ইবরাহীমের কাছে সুসংবাদ আনল, তখন তারা বলল, \"আমরা এ জনপদের অধিবাসীদেরকে ধ্বংস করে দিব; কারণ এর অধিবাসীরা অবশ্যই অন্যায়কারী(যৌনস্বেচ্ছাচারী)।  \n\n \n\n" +
                " ০২৯:০৩২] সে বলল, \"এ জনপদে লুতও আছে।\" তারা বলল, \"তাতে যারা আছে তাদেরকে আমরা ভাল করে জানি, আমরা অবশ্যই তাকে এবং তার (অনুসারীসহ)পরিজনবর্গকে উদ্ধার করব, কেবল তার স্ত্রী ছাড়া, কারণ সে গড্ডলিকা প্রবাহের অন্তর্ভূক্ত।\"  \n\n \n\n" +
                " ০২৯:০৩৩] এবং যখন আমাদের দূতেরা লুতের কাছে আসল, তাদের কারণে সে বিষন্ন হয়ে পড়ল, এবং তাদের (রক্ষার) ব্যাপারে সে নিজেকে অক্ষম অনুভব করল। এতে তারা বলল, \"তুমি ভয় করবে না এবং দুঃখও করবে না, নিশ্চই আমরা তোমাকে এবং তোমার পরিজনবর্গকে উদ্ধার করব, কেবল তোমার স্ত্রী ছাড়া, সে গড্ডলিকা প্রবাহের অন্তর্ভূক্ত।\"  \n\n \n\n" +
                " ০২৯:০৩৪] নিশ্চই আমরা এ জনপদবাসীদের উপর মহাকাশ থেকে শাস্তি অবতীর্ণ করব, এইজন্য যে তারা অবাধ্যতা করে আসছে।  \n\n \n\n" +
                " ০২৯:০৩৫] এবং নিশ্চই আমরা এর মধ্যে বুদ্ধিমান লোকদের জন্য সুস্পষ্ট প্রামান্য-নিদর্শন রেখে যাব।  \n\n \n\n" +
                " ০২৯:০৩৬] এবং আমরা মিদিয়ানবাসীদের কাছে তাদের ভাই শো’আয়বকেও (রসূল করে পাঠিয়েছিলাম) তখন সে তাদেরকে বলল, \"হে আমার জাতি! তোমরা আল্লাহর ইবাদত কর এবং পরকালের প্রতি আশান্বিত হও এবং পৃথিবীতে দুষ্কর্ম-দূর্ণীতি করে বেড়াবে না।  \n\n \n\n" +
                " ০২৯:০৩৭] এতে তারা তাকে মিথ্যা প্রতিপন্ন করল; ফলে এক ভয়াবহ ভুমিকম্প তাদেরকে আঘাৎ করল। তখন তারা তাদের গৃহে মূখ থুবড়ে পড়ে থাকল।  \n\n \n\n" +
                " ০২৯:০৩৮] এভাবে আদ ও সামুদকেও (আমাদের শাস্তি ধৃত করেছিল) এবং তাদের বাসগৃহ গুলোর অবস্থা তোমাদের কাছে সুস্পষ্ট হয়ে গেছে, বস্তুতঃ শয়তান(স্বাধীন ইচ্ছা) তাদের কার্যকলাপকে তাদের দৃষ্টিতে মনোরম করে দেখিয়েছিল এবং তা তাদেরকে আল্লাহর পথ থেকে নিবৃত্ত রেখেছিল, অথচ তারা বিচক্ষণ লোক ছিল।  \n\n \n\n" +
                " ০২৯:০৩৯] এবং কারুন ও ফেরাউন এবং হামান, অবশ্যই তাদের কাছে মূসা সুস্পষ্ট প্রামান্য তথ্যপূর্ণ আয়াত(নিদর্শন) সহ এসেছিল, তখন তারা পৃথিবীতে অহংকার করেছিল, কিন্তু তারা (আমাদের শাস্তিকে) অতিক্রম করে বাঁচতে পারে নাই।  \n\n \n\n" +
                " ০২৯:০৪০] সুতরাং আমরা তাদের প্রত্যেককেই নিজ নিজ পাপের কারণে ধৃত করেছিলাম, অতএব তাদের মধ্যে কেউ এমন ছিল যার উপর আমরা মরু-ঝটিকা (হামান এর রকেট লাঞ্চিং-প্যাড ধুলিষ্মাৎ) প্রেরণ করেছিলাম এবং তাদের মধ্যে কেঊ এমন ছিল যাকে (ফেরাউনের প্রযূক্তি ধ্বংস) শব্দ-বিস্ফোরণের শাস্তি দিয়ে ধৃত করেছিলাম, এভাবে তাদের মধ্যে কেউ এমন ছিল যাকে (কারুনকে সকল ধনদৌলতসহ ) ভূগর্ভে পুঁতে দিয়েছিলাম এবং কেউ এমন ছিল যাকে (ফেরাউনকে তার বিমানবাহিনী সহ) আমরা নিমজ্জিত করেছিলাম। বস্তুতঃ আল্লাহ তাদের উপর অন্যায় করেন নাই, উপরন্তু তারা নিজেরাই নিজেদের উপর অন্যায় করছিল।  \n\n \n\n" +
                " ০২৯:০৪১] যারা আল্লাহকে ছেড়ে অন্য কাউকে অভিভাবক রুপে গ্রহণ করেছে তাদের উপমা মাকড়সার মত, যে নিজের জন্য একটি ঘর তৈরী করে। কিন্তু সকল ঘরের মধ্যে মাকড়সার ঘরই সর্বাধিক দুর্বল; হায় যদি তারা জানত !  \n\n \n\n" +
                " ০২৯:০৪২] নিশ্চই আল্লাহ ভালভাবে জানেন এমন প্রত্যেক বস্তুকে, যেগুলোকে তারা আল্লাহর স্থলে ডাকে; যৈহৈতু তিনি ভালবাসা-কনিকার মহাসমূদ্র মহাবিজ্ঞানী।  \n\n \n\n" +
                " ০২৯:০৪৩] এগুলো হচ্ছে উপমা যা আমরা মানবজাতির জন্য বারবার বুঝিয়ে দিয়েছি কিন্তু জ্ঞানী লোক ছাড়া অন্য কেউ এগুলো হৃদয়ঙ্গম করতে পারে না।  \n\n \n\n" +
                " ০২৯:০৪৪] আল্লাহ বায়ুমন্ডলগুলো ও পৃথিবীগুলো বিজ্ঞানের ভিত্তিতে সৃষ্টি করেছেন; নিশ্চই এতে স্বীকারকারীদের জন্য আয়াত(নিদর্শন) আছে।  \n\n \n\n" +
                " ০২৯:০৪৫] আপনার প্রতি ওহীকৃত গ্রন্থ থেকে আপনি আবৃত্তি করুন, এবং সালাত (আল্লাহর ভালবাসা) স্থাপন করুন; নিশ্চই সালাত (আল্লাহর ভালবাসাই) অশ্লীলতা ও মন্দকাজ থেকে বিরত রাখে, এবং নিশ্চই কুরআন-পাঠ হচ্ছে আল্লাহর সর্বশ্রেষ্ঠ স্মরণ এবং তোমরা যা মিথ্যা (হাদিস) উদ্ভাবন করছ আল্লাহ তা জানেন।  \n\n \n\n" +
                " ০২৯:০৪৬] এবং তোমরা পূর্বগ্রন্থধারীদের সাথে শুধু উত্তম পন্থায়ই বিতর্ক করবে, তাদের মধ্য থেকে যারা অন্যায় করেছে সেসব লোক ছাড়া। এবং আপনি (তাদেরকে) বলুন, আমরা তা মেনে নিয়েছি যা আমাদের উপর অবতীর্ণ হয়েছে এবং যা তোমাদেরউপর অবতীর্ণ হয়েছে। আসলে আমাদের ঊদ্ভাবনিশক্তি এবং তোমাদের উদ্ভাবনিশক্তি একইজন এবং আমরা তাঁরই কাছে সমর্পিত।  \n\n \n\n" +
                " ০২৯:০৪৭] এবং এভাবে আমরা আপনার প্রতি এ গ্রন্থ অবতীর্ণ করেছি, অতএব যাদেরকে আমরা গ্রন্থ(তাওরাত) দিয়েছিলাম, তারা এ গ্রন্থ(কুরআন) মানে ; এবং এদের (মক্কাবাসীদের) মধ্য থেকেও কতক এ গ্রন্থ মেনে নেয়। যদিও কেবল অস্বীকারকারীরা ছাড়া আমাদের আয়াত(নিদর্শন) কেউই প্রত্যাখ্যান করে না।  \n\n \n\n" +
                " ০২৯:০৪৮] এবং আপনি এর(কুরআনের) পূর্বের কোন ঐশীগ্রন্থ আবৃত্তি করেন নাই, এবং আপনার ডান হাত দিয়ে সেগুলো লিখেনও নাই, তাহলে প্রাচিনপন্থিরা সন্দেহ করত(যে আপনি পূর্বঐশীগ্রন্থের অনুকরণে এটি নিজে রচনা করেছেন)।  \n\n \n\n" +
                " ০২৯:০৪৯] বরং যাদেরকে জ্ঞান দান করা হয়েছে তাদের বক্ষঃস্থলে এটি(কুরআন) সুস্পষ্ট প্রামান্য তথ্যপূর্ণ আয়াত(নিদর্শন)। আসলে কেবল অন্যায়কারীরাই আমাদের নিদর্শন গুলোকে অস্বীকার করে।  \n\n \n\n" +
                " ০২৯:০৫০] এবং তারা বলে, \"তার প্রতি তার ক্রমবিকাশক থেকে কেন আয়াত(নিদর্শন) অবতীর্ণ করা হয় নাই?\" আপনি বলুন, \"নিদর্শনগুলো আল্লাহর ইখতিয়ারে রয়েছে, আমি শুধুই একজন সুস্পষ্ট সতর্ককারী।\"  \n\n \n\n" +
                " ০২৯:০৫১] এটি কি তাদের জন্য যথেষ্ট (নিদর্শন) নয় যে, আমরা আপনার উপর এক গ্রন্থ নাযেল করেছি যা তাদের কাছে আবৃত্তি করা হয়; নিশ্চই এতে স্বীকারকারী জাতির জন্য বিশেষ রহমত ও স্মারক-বানী রয়েছে।  \n\n \n\n" +
                " ০২৯:০৫২] আপনি বলুন, \"আমার এবং তোমাদের মধ্যে সাক্ষী হিসেবে আল্লাহই যথেষ্ট। বায়ুমন্ডলগুলো ও পৃথিবীগুলোতে যাকিছু আছে তিনি সবই জানেন এবং যারা অকার্যকর-অপ্রযোজ্য-অন্তঃসারশূন্য বিষয় মেনে নেয় এবং আল্লাহকে অস্বীকার করে তারাই ক্ষতিগ্রস্ত।\"  \n\n \n\n" +
                " ০২৯:০৫৩] এবং তারা আপনার কাছে শীঘ্র শাস্তি কামনা করছে; যদি একটি নির্দিষ্ট মেয়াদে (প্রলম্বিত গুনাঙ্কে) উচিৎ শিক্ষা দেয়ার কথা না থাকত তাহলে নিশ্চই তাদের কাছে শাস্তি এসে পৌঁছত। এবং নিশ্চই তাদের উপর শাস্তি অকস্মাৎ আসবে, এমন অবস্থায় যে তারা টেরও পাবে না।  \n\n \n\n" +
                " ০২৯:০৫৪] তারা আপনার কাছে শীঘ্র শাস্তি কামনা করছে. অথচ নিশ্চই অনুতাপস্থল(এর দুঃখ-কষ্ট) অস্বীকারকারীকে পরিবেষ্টন করে আছে।  \n\n \n\n" +
                " ০২৯:০৫৫] যেদিন সে শাস্তি তাদেরকে দুঃখ-কষ্টের *যাঁতাকলে অর্থাৎ তাদের উপরদিক এবং তাহাদের নিচেরদিক থেকে পিষ্ট করবে* এবং তিনি বলবেন তোমরা যে কাজ করে আসছিলে এখন তার স্বাদ গ্রহণ কর।(যাঁতাকল আবিস্কারের আয়াত)  \n\n \n\n" +
                " ০২৯:০৫৬] হে আমার বান্দারা যারা আমার এককসত্বা মেনে নিয়েছ ! নিশ্চই আমার পৃথিবী কোটিকোটি ; সুতরাং তোমরা একমাত্র আমারই সেবাকাজ (পৃথিবীগুলো আবিস্কার-বসবাস-সর্বোন্নত) কর।  \n\n \n\n" +
                " ০২৯:০৫৭] প্রত্যেক (অস্থায়ী উপাদানে সৃষ্ট)জীবদেহই মৃত্যুর স্বাদ গ্রহণ করবে, অতঃপর আমাদের দিকে প্রত্যাবর্তিত হবে (মাটি হয়ে যাবে)।  \n\n \n\n" +
                " ০২৯:০৫৮] এবং যারা আল্লাহর এককসত্বা মেনে নেয় এবং ভালকাজ করে অবশ্যই আমরা তাদেরকে জান্নাতে বহুতলভবনে বসবাসের জন্য বাসগৃহ দান করব ; যার তলদেশ দিয়ে অব্যাহত পানির সরবরাহ থাকবে। তারা সেখানে চিরদিন অবস্থান করবে। সৎকর্মশীলদের কতই না উত্তম পুরস্কার !  \n\n \n\n" +
                " ০২৯:০৫৯] যারা ধৈর্য ধারণ করে এবং নিজেদের ক্রমবিকাশকের উপর নির্ভর করে।  \n\n \n\n" +
                " ০২৯:০৬০] এবং আল্লাহর শক্তিশালী সৃষ্টির মধ্যে পরমানু-জীবানু , যারা নিজেরা জীবিকা ধারণ করে না। আল্লাহ তাদেরকে জীবিকা দেন এবং তোমাদের দিকেও। এবং তিনিই সর্বশ্রোতা, সর্বজ্ঞানী।  \n\n \n\n" +
                " ০২৯:০৬১] এবং যদি আপনি তাদেরকে জিজ্ঞেস করেন, বায়ুমন্ডলগুলো ও পৃথিবীগুলো কে সৃষ্টি করেছেন, এবং সুর্য ও চন্দ্রকে কে মানুষের ব্যাবহার উপযোগী করেছেন। তারা অবশ্যই বলবে আল্লাহ। তবুও কেমন অলীক ছলনাময় মিথ্যাভাষণ !  \n\n \n\n" +
                " ০২৯:০৬২] আল্লাহই নিজ বান্দাদের থেকে যার জন্য চান জীবিকা সম্প্রসারিত করে দেন এবং তাদের জন্য পরিমিত পরিমাপে বরাদ্দ দেন। নিশ্চই আল্লাহ সকল সৃষ্টির চাহিদার বিষয়ে সর্বজ্ঞানী।  \n\n \n\n" +
                " ০২৯:০৬৩] এবং যদি আপনি তাদেরকে জিজ্ঞেস করেন, মহাকাশ থেকে কে পানি অবতীর্ণ করেন(ধুমকেতু পাঠিয়ে), অতঃপর তা দিয়ে নির্জীব  \n\n \n\n" +
                "পৃথিবীগুলোকে (প্রানের ছোঁয়ায়) সঞ্জীবিত করেন। তারা অবশ্যই বলবে, \"আল্লাহ্;\" আপনি বলুন, \"সকল ধন্যবাদ আল্লাহর জন্য।\" বরং তাদের অধিকাংশই বুদ্ধি খাটায় না।  \n\n \n\n" +
                " ০২৯:০৬৪] এই ইহকালীন-জীবন আনন্দ ও খেলাধুলার-মঞ্চ ছাড়া কিছুই নয়। আর যে, পারলৌকিক আবাস তা-ই হচ্ছে প্রকৃত জীবন; হায় যদি তারা জানত !  \n\n \n\n" +
                " ০২৯:০৬৫] এবং যখন তারা জাহাজ-বিমান-নভোযানে আহরোণ করে তখন তারা একমাত্র তাঁরই জন্য বিশুদ্ধ জীবন-বিধানের মাধ্যমে একাগ্রচিত্তে আল্লাহকে ডাকতে থাকে। কিস্তু যথন তিনি তাদেরকে স্থলের দিকে নিরাপদে নামিয়ে আনেন তখন তারা পৃথকসত্বার গুণকীর্তন করতে আরম্ভ করে।  \n\n \n\n" +
                " ০২৯:০৬৬] যা আমরা তাদেরকে দান করেছি তা উপভোগ করেও অস্বীকার করার জন্য অচিরেই তারা এর প্রতিফল জানতে পারবে।  \n\n \n\n" +
                " ০২৯:০৬৭] তারা কি দেখে নাই যে, আমরা স্থাপন করেছি একটি নিরাপদ শোধিত গৃহ (কাবাঘর থেকে পুতুলগুলো সরিয়ে) , অথচ এর চতুষ্পার্শ থেকে মানুষদের অপহরণ করে নেয়া হয়, তারা কি অকার্যকর-অপ্রযোজ্য-অন্তঃসারশূন্য বিষয় মেনে নিয়েছে এবং আল্লাহর অনুগ্রহকে অস্বীকার করছে ?  \n\n \n\n" +
                " ০২৯:০৬৮] যে ব্যক্তি অন্যায়ভাবে আল্লাহর সমন্ধে মিথ্যা রচনা করে, অথবা বিজ্ঞানকে মিথ্যা প্রতিপন্ন করে যখন তা তার কছে আসে, এমন অস্বীকারকারীদের জন্য কি অনুতাপস্থলে আবাস হওয়া উচিত নয় ?  \n\n \n\n" +
                " ০২৯:০৬৯] এবং যারা আমাদের জন্য প্রচেষ্টা করে, নিশ্চই আমরা তাদেরকে আমাদের সুপথপ্রাপ্তির নির্দেশনার ভিত্তিতে পথ দেখাব। এবং নিশ্চই আল্লাহ্ অবশ্যই সৎকর্মশীল দের সাথে আছেন।  \n\n \n\n");
        editor.putString("28", "পরিচ্ছেদ ০২৮.দৃশ্যঃ কাহিনী-ঘটনা-বিবরণ (সূরা আল-কাসাস্ The Stories)  \n\n \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৮৯ আয়াত এবং ৯ রুকূ আছে।  \n\n \n\n" +
                " ০২৮:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০২৮:০০১] তা সীন মীম্।  \n\n \n\n" +
                " ০২৮:০০২] এগুলো সুস্পষ্ট গ্রন্থের আয়াত।  \n\n \n\n" +
                " ০২৮:০০৩] স্বীকারকারী জাতির উপকারার্থে আমরা আপনার কাছে মূসা এবং ফেরাউনের বৈজ্ঞানিক বৃত্তান্ত বর্ণনা করছি।  \n\n \n\n" +
                " ০২৮:০০৪] নিশ্চই ফেরাউন দেশে বড়ই উদ্ধত হয়ে উঠেছিল এবং তার অধিবাসীদেরকে দলে দলে বিভক্ত করেছিল, তাদের মধ্য থেকে একদলকে সে শক্তিহীন করতে চেয়েছিল, তাদের পুত্রদেরকে নৃশংসভাবে হত্যা করত এবং তাদের নারীদেরকে জীবিত রাখত। নিশ্চই সে নীতিভ্রষ্টতা সৃষ্টিকারীদের অন্তর্ভুক্ত ছিল।  \n\n \n\n" +
                " ০২৮:০০৫] এবং আমরা সংকল্প করেছিলাম, যাদেরকে দেশে শক্তিহীন করা হয়েছিল তাদের উপর আমরা অনুগ্রহ করব এবং তাদেরকে নেতা(ইমাম) মনোনীত করব এবং তাদেরকে (দেশের) উত্তরাধিকারী করব।  \n\n \n\n" +
                " ০২৮:০০৬] এবং তাদেরকে দেশে ক্ষমাতায় প্রতিষ্ঠিত করব এবং ফেরাউন ও হামানকে এবং উভয়ের সৈন্যবাহিনীকে তা দেখাবো যা সমন্ধে তারা তাদের থেকে আশঙ্কা করছিল।  \n\n \n\n" +
                " ০২৮:০০৭] এবং আমরা মূসার মাতার প্রতি ওহী করেছিলাম, \"তুমি তাকে দুধ পান করাতে থাক এবং যখন তার সমন্ধে তোমার আশঙ্কা হবে তখন তুমি তাকে সাগরের বাঁকে ভাসিয়ে দিও এবং তুমি ভয় করবে না এবং চিন্তিত ও দুঃখিত হবে না; নিশ্চই আমরা তাকে তোমার কাছে ফিরিয়ে আনব এবং তাকে রসূলদের অন্তর্ভুক্ত করব।\"  \n\n \n\n" +
                " ০২৮:০০৮] অতঃপর ফেরাউনের (নৌবাহিনীর)লোক তাকে কুড়িয়ে নিল, পরিণামে সে যেন তাদের জন্য একদিন শত্রু সাব্যস্ত হয় এবং দুঃখের কারণ হয়। নিশ্চই ফেরাউন এবং হামান এবং উভয়ের সৈন্যদল অন্যায়কারী ছিল।  \n\n \n\n" +
                " ০২৮:০০৯] এবং ফেরাউনের স্ত্রী বলল, এ শিশুতো আমার এবং তোমার জন্য নয়ন-তৃপ্তিদায়ক! একে হত্যা করবে না। হতে পারে সে একদিন আমাদের উপকারে লাগতে পারে, অথবা আমরা তাকে পুত্ররুপে গ্রহণ করতে পারি। আসলে (আমাদের উদ্দেশ্য) তারা উপলব্দি করতে পারে নাই।  \n\n \n\n" +
                " ০২৮:০১০] এবং মুসার মাতার মন-মগজ চিন্তামুক্ত হয়ে গেল। যদি আমরা তার অন্তরকে সুদূঢ় না করে দিতাম, যাতে সে স্বীকারকারীদের অন্তর্গত হতে পারে, তা নাহলে সে বিষয়টিকে প্রকাশ করার উপক্রম করেছিল।  \n\n \n\n" +
                " ০২৮:০১১] সে(মুসার মাতা) তার(মুসার) ভগ্নীকে বলেছিল, \"তুমি তার পিছনে পিছনে যাও।\" সে দূর থেকে আড়চোখে তাকে লক্ষ্য করছিল, কিন্তু তারা(ফেরাউন-বাহিনী) এটি বুঝতে পারে নাই।  \n\n \n\n" +
                " ০২৮:০১২] এবং আমরা ইতোপূর্বে সকল স্তন-দাত্রীকে তার জন্য নিষিদ্ধ করে রাখলাম অতঃপর মুসার ভগ্নী বলল, \"আমি কি তোমাদেরকে এমন এক পরিবারের সংবাদ দিব, যারা এ'কে তোমাদের জন্য লালন পালন করবে এবং তারা তার জন্য সত্যিকারের হিতাকাঙ্খী হবে?\"  \n\n \n\n" +
                " ০২৮:০১৩] এভাবে আমরা তাকে তার মাতার কাছে ফিরিয়ে দিলাম যেন তার নয়ন তৃপ্তি লাভ করে এবং সে দুঃখ না করে এবং সে যেন জানতে পারে, আল্লাহর প্রতিশ্রুতি বিজ্ঞানভিত্তিক। কিন্তু অধিকাংশ লোকই তা জানে না।  \n\n \n\n" +
                " ০২৮:০১৪] এবং যখন সে শক্তিশালী হল এবং পূর্ণ বয়ল্ক হল তখন আমরা তাকে বিজ্ঞান ও শিক্ষায়(মেরিন-ইঞ্জিনিয়ারিংএ) সুপ্রতিষ্ঠিত করলাম, এবং এভাবে আমরা সৎকর্মপরায়নদেরকে পুরস্কার দিয়ে থাকি।  \n\n \n\n" +
                " ০২৮:০১৫] এবং (একদিন)সে নগরীতে এমন সময় প্রবেশ করল, যখন তার আধিবাসীরা অসতর্ক ছিল, তখন সেখানে সে দুজন লোককে পরস্পর লড়াই করতে দেখল, এক ব্যক্তি তার নিজ সম্প্রদায়ের এবং অপর ব্যক্তি তার শত্রু পক্ষের ছিল। সুতরাং তার নিজ সম্প্রদায়ের যে লোকটি ছিল সে তার কাছে সাহায্য চাইল সে ব্যাক্তির বিরুদ্ধে যে তার শত্রুপক্ষের ছিল। তখন মূসা তাকে কুনুই দিয়ে গুতো মারল এবং সে গুতোতেই তার মৃত্যু হল। সে (মূসা) বলল, এটি একটি শয়তানি কাজ; নিশ্চই সে স্বীকারকারীদের শত্রু এবং স্পষ্ট ভ্রান্তি-উত্পাদনকারী।  \n\n \n\n" +
                " ০২৮:০১৬] সে বলল, \"হে আমার ক্রমবিকাশক ! আমি নিশ্চই নিজের প্রতি অন্যায় করেছি; আপনি আমাকে সংশোধন করুন।\" সুতরাং তিনি তাকে সংশোধন করে দিলেন; নিশ্চই তিনি অতীব সংশোধনশীল, এককসত্তা দয়াময়।  \n\n \n\n" +
                " ০২৮:০১৭] সে বলল, হে আমার ক্রমবিকাশক ! যেহেতু আপনি আমার প্রতি অনুগ্রহ করেছেন, অতএব আমি ভবিষ্যতে কখনও অন্যায়কারীদের সাহায্য করব না।  \n\n \n\n" +
                " ০২৮:০১৮] অতঃপর সে ভীত অবস্থায় এদিক ওদিক তাকাতে তাকাতে প্রভাত বেলায় নগরীতে বের হল, তখন সে দেখে, যে ব্যক্তি গতকাল তার কাছে সাহায্য চেয়েছিল সে পুনরায় তাকে সাহায্যের জন্য চিৎকার করে ডাকছে। মূসা তাকে বলল, \"নিশ্চই তুমি একজন স্পষ্ট বিপথগামী ব্যক্তি।\"  \n\n \n\n" +
                " ০২৮:০১৯] অতঃপর যখন মূসা মনস্থ করল সে লোকটিকে ধরবে, যে তাদের উভয়ের শত্রু; তখন সে লোকটি বলল, \"হে মূসা! তুমি গতকাল যেভাবে এক ব্যক্তিকে হত্যা করেছ সেভাবে কি আমাকেও হত্যা করতে চাচ্ছ ? তুমি তো দেশে কেবল অত্যাচারী হতে চাচ্ছ এবং মোটেই শান্তি স্থাপনকারীদের অন্তর্গত হতে চাও না।\"  \n\n \n\n" +
                " ০২৮:০২০] এমন সময় নগরীর দূর প্রান্ত থেকে এক ব্যক্তি ছুটে আসল এবং বলল, \"হে মূসা ! (রাজ্যের) নেতৃবৃন্দ তোমাকে হত্যা করার জন্য পরামর্শ করছে। সুতরাং তুমি (রাজ্যের)বাইরে চলে যাও, বিশ্বাস কর, আমি তোমার হিতাকাঙ্খীদের অন্তর্গত।\"  \n\n \n\n" +
                " ০২৮:০২১] তখন সে ভীত অবস্থায় সতর্কতা অবলম্বনপূর্বক সেখান থেকে বের হয়ে গেল, এবং বলল, \"হে আমার ক্রমবিকাশক ! আপনি আমাকে  \n\n \n\n" +
                "অত্যাচারী জাতি থেকে রক্ষা করুন।\"  \n\n \n\n" +
                " ০২৮:০২২] এবং যখন সে মিদিয়ান অভিমূখে রওনা হল, তখন বলল, আমি আশা করি আমার ক্রমবিকাশক আমাকে সঠিক পথ দেখাবেন।  \n\n \n\n" +
                " ০২৮:০২৩] এবং যখন সে মিদিয়ান শহরে পানির (কূপের) কাছে আসল তখন একদল লোককে সেখানে দেখতে পেল, তারা পানি পান করাচ্ছে। এবং তাদের মধ্যে দুজন নারীকে দেখতে পেল, যারা ভীড় থেকে পিছিয়ে যাচ্ছিল। সে বলল, তোমাদের কী ব্যাপার ? তারা বলল, রাখালদেরকে যতক্ষণ পরিবেশন করা শেষ না হয় ততক্ষণ পর্যন্ত আমরা পানির নিয়ন্ত্রণ পাই না, এছাড়া আমাদের পিতা অতি বৃদ্ধ।  \n\n \n\n" +
                " ০২৮:০২৪] অনন্তর সে তাদের সাহায্যার্থে পানি-সরবরাহ করল। অতঃপর এক ছায়ার নীচে চলে গেল এবং বলল, \"হে আমার ক্রমবিকাশক ! আপনি যে কোন কল্যাণ আমার প্রতি অবতীর্ণ করেন আমি অবশ্যই তার ভিখারী।\"  \n\n \n\n" +
                " ০২৮:০২৫] তখন নারী দুজনের একজন লজ্জাজড়িত পদক্ষেপে তার কাছে আসল। সে বলল, \"আমার পিতা তোমাকে ডাকছেন, তুমি যে আমাদের জন্য পানি-সরবরাহ করেছ তিনি যেন তোমাকে তার বিনিময় দান করেন।\" অতঃপর যখন সে তার কাছে পৌঁছল এবং নিজের সমস্ত ঘটনা তাঁর সম্মূখে বর্ণনা করল, তখন তিনি বললেন, \"তুমি কোন ভয় কোর না, অন্যায়কারী জাতির কবল থেকে তুমি এখন মুক্ত।\"  \n\n \n\n" +
                " ০২৮:০২৬] নারীদের একজন বলল, \"হে আমার পিতা ! তুমি তাকে কাজের জন্য নিয়োগ কর, কারণ তুমি এমন শক্তিশালী ও বিশ্বস্ত কাউকে কাজের জন্য নিয়োগ করলে ভাল করবে।\"  \n\n \n\n" +
                " ০২৮:০২৭] তখন তিনি বললেন, \"আমি আমার এই কণ্যাদের একজনকে তোমার সাথে এক শর্তে বিয়ে দিতে চাই যে, তুমি আট  \n\n \n\n" +
                "বছর আমার(প্রতিষ্ঠানে) কাজ করবে। আর যদি তুমি দশ বছর পূর্ণ কর, তাহলে তা তোমার উপর। তবে আমি তোমাকে কোন কষ্ট দিতে চাই না; আল্লাহ চাইলে তুমি আমাকে সদাচারীদের মধ্যে পাবে।\"  \n\n \n\n" +
                " ০২৮:০২৮] সে বলল, \"আপনার ও আমার মধ্যে এ চুক্তি হল। এ দুই মেয়াদের মধ্যে যে কোন একটি আমি পূর্ণ করি তাতে আমার জন্য আগ্রাসী হবে না; আমরা যাকিছু বলছি আল্লাহ্ তার উপর সাক্ষী।\"  \n\n \n\n" +
                " ০২৮:০২৯] অতঃপর যখন মূসা নির্দিষ্ট মিয়াদ পূর্ণ করল এবং নিজ পরিবারবর্গকে নিয়ে যাত্র্রা করল, তখন সে তূর-সিনাই পর্বতের (পশ্চিম)পাশে এক আগুন দেখল। সে তার পরিবারকে বলল, তোমরা এখানে অবস্থান কর, আমি এক আগুন দেখেছি, হয়তো আমি সেখান থেকে তোমাদের জন্য কোন ভাল কিছু আনব অথবা আগুনের জলন্ত অঙ্গার আনব যেন তোমরা আগুন পোহাতে পার।  \n\n \n\n" +
                " ০২৮:০৩০] অতঃপর যখন সে ডান-সৈকতের দিকের উপত্যকার অকুস্থলে পানিপূর্ণ স্থানে পৌঁছল, তখন এক বৃক্ষ থেকে তাকে ডেকে বলা হল: \"হে মূসা! নিশ্চই আমি আল্লাহ, মহাবিশ্বের ক্রমবিকাশক\"--  \n\n \n\n" +
                " ০২৮:০৩১] এবং, \"তুমি তোমার যন্ত্রটির-সুইচ(عصا) অন(ألق) কর।\" অতঃপর যখন সে সেটিকে সাপের মত বুকে ভর দিয়ে এঁকেবেঁকে চলতে দেখল, তখন সে বিচার-বিবেচনা করে পিছু নেয়া থেকে বিরত থাকলো। (বলা হল) \"হে মূসা ! তুমি এটিতে চড় ভয় নেই, তুমি নিশ্চই নিরাপদ লোকদের অন্তর্গত।  \n\n \n\n" +
                " ০২৮:০৩২] এবং তুমি তোমার হাত (পারদের)টাংকিতে প্রবেশ করাও ঝকঝকে শুভ্র পারদ নির্গত হবে, কোনও গড়বড় ছাড়াই বের হবে এবং জোড়হাতে শাফ্ট নিজের দিকে টেনে মিলাও, হয়ে গেল তোমার *দ্রুতগামী হোবারক্রাফট(جناح)*। এদুটি দলিল তোমার ক্রমবিকাশক থেকে ফেরাউন ও তার সভাসদদের প্রতি প্রেরিত হল,\" এবং নিশ্চই তারা এক দুষ্কৃতকারী-অবাধ্য জাতি। {১. গুটানো নৌকাটি জলযান থেকে হয়ে গেল উভচরযান, ২. পারদ প্রয়োগে ইঞ্জিনের শক্তি বৃদ্ধি অর্থাৎ মার্কারি-ভর্টেক্স, যা ফেরাউনদের সাউণ্ড-ওয়েভ প্রযূক্তি ধ্বংশকারী}  \n\n \n\n" +
                " ০২৮:০৩৩] সে বলল, \"হে আমার ক্রমবিকাশক ! নিশ্চই আমি তাদের এক ব্যক্তিকে হত্যা করেছিলাম; অতএব আমার আশংকা হয় যে, তারা আমাকে হত্যা করবে;  \n\n \n\n" +
                " ০২৮:০৩৪] এবং আমার ভাই হারুন আমার চাইতে বেশি বাকপটু; অতএব তাকে আমার সাহায্যকারী করে আমার সাথে পাঠান যেন সে আমার সত্যতার সাক্ষ্য দেয়। আমি অবশ্যই ভয় করছি, তারা আমাকে মিথ্যা প্রতিপন্ন করবে।\"  \n\n \n\n" +
                " ০২৮:০৩৫] তিনি বললেন, \"নিশ্চই আমরা তোমার ভাইকে দিয়ে তোমার বাহুকে শক্তিশালী করব এবং তোমাদের উভয়ের জন্য কর্তৃত্বের বা  \n\n \n\n" +
                "**বিজয়ের উপকরণ** সৃষ্টি করব(ফেরাউনের নৌবাহিনী মুসার পক্ষে আসে), ফলে তারা তোমাদের কাছেও পৌছতে পারবে না। তোমরা উভয়ে এবং যারা তোমাদের অনুসরণ করবে তারা আমাদের আয়াত(নিদর্শন) দিয়ে অবশ্যই বিজয়ী হবে।\"  \n\n \n\n" +
                " ০২৮:০৩৬] অতএব যখন মূসা আমাদের সুস্পষ্ট প্রামান্য আয়াত(নিদর্শন) গুলো সহ তাদের কাছে আসলো, তখন তারা বলল, \"এটি স্পষ্ট যাদু ছাড়া কিছুই নয় যা বানানো হয়েছে; এবং আমরা আমাদের পিতৃপুরুষের কাছে এসব কথা কখনও শুনি নাই।\"  \n\n \n\n" +
                " ০২৮:০৩৭] তখন মূসা বলল, \"আমার ক্রমবিকাশক তাকে সর্বাধিক উত্তম জানেন, যে তাঁর থেকে সুপথ-প্রাপ্তির নির্দেশনা নিয়ে এসেছে এবং তাকেও যার আনুক্রমিক আবাসস্থল পরিণামে সুন্দর ও শুভ হবে। মোটকথা, অন্যায়কারীরা কখনও সফল হবে না।\"  \n\n \n\n" +
                " ০২৮:০৩৮] ফেরাউন বলল, \"হে প্রধানরা ! আমি ছাড়া তোমাদের অন্য কোন উদ্ভাবনকারী আছে বলে আমি জানি না, অতএব হে হামান! তুমি আমার জন্য অন্তরীপের উপর উৎক্ষেপন-মঞ্চ নির্মাণ কর এবং আমার জন্য একটি সুউচ্চ রকেট সংযূক্ত কর, যেন আমি সেটিতে (চড়ে) মূসার উদ্ভাবনকারীকে উঁকি মেরে দেখতে পারি, কারণ আমি মনে করি, সে মিথ্যাবাদীদের অন্তর্গত।\"  \n\n \n\n" +
                " ০২৮:০৩৯] যেহেতু সে এবং তার সেনাদল দেশে অবৈজ্ঞানিক ভাবে অহংকার করল এবং ধারনা করল যে, তাদেরকে আমাদের কাছে ফিরিয়ে আনা হবে না,  \n\n \n\n" +
                " ০২৮:০৪০] অতএব আমরা তাকে এবং তার বিমান-সেনাদেরকে ধৃত করলাম এবং তাদেরকে সমুদ্রে নিক্ষেপ করলাম, অতএব দেখুন, অন্যায়কারীদের পরিণাম কেমন হয়েছে !  \n\n \n\n" +
                " ০২৮:০৪১] এবং আমরা তাদেরকে নেতা করেছিলাম, তারা (মানুষকে) আগুনের দিকে আহবান করেছে; পুনরুত্থানের দিনে তাদের কোন সাহায্য করা হবে না।  \n\n \n\n" +
                " ০২৮:০৪২] এবং এ ইহকালীন জীবনেও আমরা তাদের পিছনে অমঙ্গল লাগিয়ে দিয়েছি এবং পুনরুত্থানের দিনেও তারা দুর্দশাগ্রস্ত লোকদের অন্তর্ভুক্ত হবে।  \n\n \n\n" +
                " ০২৮:০৪৩] এবং আমরা পূর্ববর্তী জাতিগুলোকে ধ্বংস করার পর মূসাকে গ্রন্থ দিয়েছিলাম যা মানুষের জন্য দূরদর্শিতা, সুপথপ্রাপ্তির নির্দেশনা এবং রহমতের কারণ ছিল যেন তারা উপদেশ গ্রহণ করে।  \n\n \n\n" +
                " ০২৮:০৪৪] এবং আপনি (সিনাই পর্বতের) পশ্চিম পার্শ্বে উপস্থিত ছিলেন না, যখন আমরা মূসাকে বিধিবিধানের দায়িত্ব অর্পণ করেছিলাম এবং আপনি তখন সাক্ষীদের অন্তর্ভুক্তও ছিলেন না।  \n\n \n\n" +
                " ০২৮:০৪৫] কিন্তু আমরা প্রজন্মের পর প্রজন্মকে প্রতিষ্ঠিত করেছিলাম, অতঃপর তারা দীর্ঘ জীবন টিকে থাকলো। এবং আপনি মিদিয়াবাসীদের মধ্যেও কোন কালে অবস্থানকারী ছিলেন না যে, আপনি তাদের কাছে আমাদের আয়াত(নিদর্শন) গুলো পাঠ করে শুনাতেন; কিন্তু আমরাই রসূল প্রেরনকারী।  \n\n \n\n" +
                " ০২৮:০৪৬] এবং আপনি তখনও সিনাই পর্বতের পাশে উপস্থিত ছিলেন না, যখন আমরা (মূসাকে) ডেকেছিলাম ; বস্তুতঃ এসব কিছু আপনার ক্রমবিকাশকের তরফ থেকে রহমত; যেন আপনি *সে জাতিকে* সতর্ক করে দেন, *যাদের কাছে আপনার আগে কোনও সতর্ককারী আসে নাই*, যেন তারা স্মরণকারী হতে পারে।  \n\n \n\n" +
                " ০২৮:০৪৭] এবং যদি এমন না হয়, তাদের কৃত-কর্মের ফলে তাদের উপর কোন বিপদ আসলে তারা বলবে, \"হে আমার ক্রমবিকাশক ! কেন আপনি আমাদের কাছে কোনও রসূল পাঠান নাই, যাতে আমরা আপনার আয়াত(নিদর্শন) গুলোর অনুসরণ করতে পারতাম এবং স্বীকারকারীদের অন্তর্ভূক্ত হতে পারতাম ?\"  \n\n \n\n" +
                " ০২৮:০৪৮] অতঃপর যখন তাদের কাছে আমাদের তরফ থেকে বিজ্ঞান আসল, তখন তারা বলল, \"মুসাকে যেমন বিজ্ঞান শিক্ষা দেয়া হয়েছিল তেমন বিজ্ঞান শিক্ষা এ ব্যক্তিকে (মুহাম্মদকে) কেন দেয়া হল না?\" ইতোপূর্বে কি তারা তা অস্বীকার করে নাই যা মূসাকে প্রদান করা হয়েছিল? তারা বলেছিল, এ দুজন বড় যাদুকর, তারা একে অপরকে সাহায্য করে। তারা আরও বলেছিল, \"আমরা তাদের প্রত্যেককে অস্বীকার করি।\"  \n\n \n\n" +
                " ০২৮:০৪৯] আপনি বলুন, \"যদি তোমরা সত্যবাদী হয়ে থাক, তাহলে তোমরা আল্লাহ থেকে এমন এক গ্রন্থ আন যা এতদুভয় (তাওরাত ও কুরআন) থেকে অধিকতর সুপথপ্রাপ্তির নির্দেশনা সম্বলিত হবে, যাতে আমি তার অনুসরণ করতে পারি।\"  \n\n \n\n" +
                " ০২৮:০৫০] অতঃপর যদি তারা আপনাকে উত্তর না দেয়, তাহলে জেনে রাখুন, তারা কেবল নিজেদের বাসনার অনুসরণ করছে। সে ব্যক্তি অপেক্ষা অধিকতর বিপথগামী কে যে আল্লাহর সুপথপ্রাপ্তির নির্দেশনাকে উপেক্ষা করে নিজ বাসনার অনুসরণ করে? বস্তুতঃ আল্লাহ্ অন্যায়কারী জাতিকে কখনও সুপথপ্রাপ্তির নির্দেশনা দেন না।  \n\n \n\n" +
                " ০২৮:০৫১] এবং অবশ্যই আমরা তাদের জন্য বানী পৌঁছে দিয়েছি যেন তারা স্মরণককরী হয়।  \n\n \n\n" +
                " ০২৮:০৫২] যাদেরকে আমরা এর পুর্বে গ্রন্থ দিয়েছিলাম তারা এ গ্রন্থ(কুরআন)কে মেনে নেয়।  \n\n \n\n" +
                " ০২৮:০৫৩] এবং যখন তাদের কাছে এটি পাঠ করা হয়, তখন তারা বলে, \"আমরা এ গ্রন্থ(কুরআন) মেনে নিলাম। এটি আমাদের ক্রমবিকাশকর তরফ থেকে সুনিশ্চিত বিজ্ঞান। আমরা এর পূর্বেই সমর্পিত ছিলাম।\"  \n\n \n\n" +
                " ০২৮:০৫৪] এসকল লোককে তাদের পুরষ্কার দুবার প্রদান করা হবে- এজন্য যে, তারা ধৈর্য ধারণ করে এবং সুুন্দর দিয়ে অসুন্দরকে প্রতিহত করে এবং আমরা তাদেরকে যা কিছু জীবিকা দিয়েছি তা থেকে তারা খরচ(দরিদ্রকে এককভাবে অন্ন ও বস্ত্র দান এবং দারিদ্রদূরিকরণে সম্মিলিত দান) করে।  \n\n \n\n" +
                " ০২৮:০৫৫] এবং তারা যখন কোন বাজেকথা শুনে তখন তারা তা উপেক্ষা করে চলে এবং বলে, \"আমাদের কৃত-কর্ম আমাদের জন্য এবং তোমাদের কৃত-কর্ম তোমাদের জন্য, তোমার উপর শাস্তি বর্ষিত হউক। আমরা মূর্খদের সাথে সংস্রব রাখা পছন্দ করি না।\"  \n\n \n\n" +
                " ০২৮:০৫৬] আপনি যাকে ভালবাসেন তাকেই সুপথপ্রাপ্তির নির্দেশনা দিতে পারেন না, কিন্তু আল্লাহ্ যাকে চান তাকে সুপথপ্রাপ্তির নির্দেশনা দেন এবং তিনি সুপথপ্রাপ্তির নির্দেশনা প্রাপ্য ব্যক্তিদেরকে সরচেয়ে বেশি জানেন।  \n\n \n\n" +
                " ০২৮:০৫৭] এবং তারা বলে, \"যদি আমরা তোমার সাথে এ সুপথপ্রাপ্তির নির্দেশনার অনুগমন করি তাহলে আমাদেরকে আমাদের দেশ থেকে উচ্ছেদ করে দেয়া হবে।\" (তাদেরকে বলুন), \"আমরা কি তাদেরকে একটি শোধিত নিরাপদ স্থান দিই নাই যেখানে আমাদের পক্ষ থেকে সবার জন্য জীবিকা হিসেবে সর্বপ্রকার ফল-মূল আমদাানী হয়?\" কিন্তু তাদের অধিকাংশ তা জানে না।  \n\n \n\n" +
                " ০২৮:০৫৮] এবং কত জনপদকেই না আমরা ধ্বংস করে দিয়েছি, যার মধ্যে পরমোল্লসিত জীবিকানির্বাহের উপায় ছিল! এগুলো হল তাদের বাসস্থান, যেখানে তাদের পরে অতি অল্প ছাড়া বসতি স্থাপন করা হয় নাই। এবং আমরাই সেসবের উত্তরাধীকারী হয়েছি।  \n\n \n\n" +
                " ০২৮:০৫৯] এবং আপনার ক্রমবিকাশক কোনও জনপদ কখনও ধ্বংস করেন না যতক্ষণ পর্যন্ত না তিনি সেগুলোর কেন্দ্রস্থলে এমন কোন রসূল প্রেরণ করেন, যে তাদের কাছে আমাদের আয়াতগুলো পাঠ করে শুনায়, এবং আমরা জনপদগুলোকে কখনও ধ্বংস করি না যতক্ষণ পর্যন্ত না তার অধিবাসীরা অন্যায়কারী হয়ে যায়।  \n\n \n\n" +
                " ০২৮:০৬০] এবং তোমাদেরকে বিভিন্ন জিনিস থেকে যা কিছু দেয়া হয়েছে তা কেবল ইহকালীন অস্থায়ী জীবনের ভোগ-বিলাসের সামগ্রী এবং সৌন্দর্য, এবং আল্লাহর কাছে যা আছে তা উত্তম এবং চিরস্থায়ী। তবুও কি তোমরা বুদ্ধি খাটাবে না।  \n\n \n\n" +
                " ০২৮:০৬১] যার সাথে আমরা অঙ্গীকার করেছি, অতিউত্তম (পুরষ্কারের) অঙ্গীকার, এবং যার সাক্ষাৎ সে নিশ্চই পাবে, তবে কি সে সেই ব্যক্তির মত হতে পারে যাকে আমরা শুধু ইহকালীন অস্থায়ী জীবনের আনন্দের সামগ্রী দিয়েছি, অতঃপর পুনরুত্থানের দিন সে তাদের অন্তর্ভুক্ত হবে যাদেরকে উপস্থিত করা হবে (অনুতাপস্থলে ওয়েটিং এরিয়াতে)।  \n\n \n\n" +
                " ০২৮:০৬২] এবং যে দিন তিনি তাদেরকে আহবান করবেন, এবং জিজ্ঞেস করবেন, \"আমার পৃথকসত্বারা কোথায় যাদেরকে তোমরা পৃথকসত্বা দাবি করতে?\"  \n\n \n\n" +
                " ০২৮:০৬৩] তারা(যাদেরকে পৃথকসত্বা দাবি করা হত) বলবে, \"তাদের বিরুদ্ধে আমাদের ক্রমবিকাশকের বিজ্ঞান-বাণী পূর্ণ হবে। এরাই সেসব লোক যাদেরকে আমরা বিভ্রান্ত করেছিলাম, যেভাবে আমরা স্বয়ং বিভ্রান্ত হয়েছিলাম। আজ আমরা আপনার সামনে তাদেরকে প্রত্যাখ্যান করছি। তারা আমাদের সেবা-কর্ম করত না।\"  \n\n \n\n" +
                " ০২৮:০৬৪] এবং বলা হবে, \"তোমরা তোমাদের কল্পিত পৃথকসত্বাদেরকে আহবান কর।\" তখন তারা তাদেরকে আহবান করবে, কিন্তু তারা(পৃথকসত্বারা) তাদেরকে কোন উত্তর দিবে না। এবং তারা দুঃখ-কষ্ট প্রত্যক্ষ করবে। হায়! যদি তারা সুপথপ্রাপ্তির নির্দেশনা পেত।  \n\n \n\n" +
                " ০২৮:০৬৫] এবং সেদিন তিনি তাদেরকে আহবান করবেন, এবং বলবেন, \"তোমরা রসূলদেরকে কী উত্তর দিয়েছিলে?\"  \n\n \n\n" +
                " ০২৮:০৬৬] অতএব সেদিন সকল তথ্য-প্রমাণ তাদের জন্য ধাঁধাঁয় পরিনত হবে, ফলে তারা একে অপরকে প্রশ্ন করতে পারবে না।  \n\n \n\n" +
                " ০২৮:০৬৭] অনন্তর যে অনুশোচিত হবে এবং আল্লাহর এককসত্তা মেনে নিবে এবং ভালকাজ করবে, সে হয়তো সফল ব্যক্তিদের অন্তর্ভূক্ত হবে।  \n\n \n\n" +
                " ০২৮:০৬৮] আপনার ক্রমবিকাশক যাকে চান সৃষ্টি করেন এবং মনোনীত করেন, এ ব্যাপারে তাদের কোন বদান্যতা নেই। আল্লাহ নিয়মশীল মহান এবং তাদের পৃথকসত্বা কল্পনা থেকে তিনি অনেক উর্ধ্বে।  \n\n \n\n" +
                " ০২৮:০৬৯] এবং আপনার ক্রমবিকাশক তাও জানেন যা তাদের বক্ষঃস্থল গোপন করে এবং তাও যা তারা প্রকাশ করে।  \n\n \n\n" +
                " ০২৮:০৭০] এবং তিনিই আল্লাহ, তিনি ছাড়া কোনও উদ্ভাবনীশক্তি নেই। সকল ধন্যবাদ তাঁরই, আদিতেও এবং অন্তেও। এবং সকল আধিপত্য তাঁরই, এবং তাঁরই দিকে তোমাদেরকে ফিরিয়ে নেয়া হবে।  \n\n \n\n" +
                " ০২৮:০৭১] আপনি বলুন, \"তোমরা লক্ষ্য করেছ কি- আল্লাহ যদি তোমাদের উপর রাতকে পুনরুত্থানের দিন পর্যন্ত অবিচল করে  \n\n \n\n" +
                "দেন, তাহলে আল্লাহ্ ছাড়া আর কি কোন উদ্ভাবনীশক্তি আছে যে তোমাদের কাছে আলো এনে দিবে ? তবুও কি তোমরা শুনবে না।\"  \n\n \n\n" +
                " ০২৮:০৭২] আপনি বলুন, \"তোমরা লক্ষ্য করেছ কি- আল্লাহ যদি তোমাদের উপর দিনকে পুনরুত্থানের দিন পর্যন্ত অবিচল করে দেন, তাহলে আল্লাহ্ ছাড়া আর কি কোন উদ্ভাবনীশক্তি আছে যে তোমাদেরকে রাত এনে দিবে, যাতে তোমরা স্বস্তিলাভ করতে পার, তবুও কি তোমরা দেখছ না?\"  \n\n \n\n" +
                " ০২৮:০৭৩] যেহেতু এটি তাঁরই রহমত থেকে, তিনি তোমাদের জন্য রাত ও দিন সৃষ্টি করেছেন যেন তোমরা তাতে বিশ্রাম করতে পার এবং বিজ্ঞান-প্রযূক্তি থেকে অনুসন্ধ্যান করতে পার এবং যেন তোমরা কৃতজ্ঞ হতে পার  \n\n \n\n" +
                " ০২৮:০৭৪] এবং যেদিন তিনি তাদেরকে আহবান করবেন এবং জিজ্ঞেস করবেন, \"আমার পৃথকসত্তারা কোথায়, যাদেরকে তোমরা পৃথকসত্বা কল্পনা করতে?\"  \n\n \n\n" +
                " ০২৮:০৭৫] এবং আমরা উম্মতের প্রত্যেকজন থেকে সাক্ষী(ফেরেস্তাদের) বের করে আনব, অতঃপর বলব, \"তোমাদের প্রামানিক তথ্য(ডাইরী) উপস্থাপন কর।\" তখন তারা জানতে পারবে যে, সকল বিজ্ঞান কেবল আল্লাহর এবং যা কিছু (হাদিস) তারা নবউদ্ভাবন করত, সেসবই তাদেরকে প্রতারণা করবে (উধাও হয়ে যাবে)।  \n\n \n\n" +
                " ০২৮:০৭৬] নিশ্চই কারুন ছিল মূসার জাতির অন্তর্ভূক্ত, কিন্তু সে তাদের উপর নোংরা আচরণ করত। এবং আমরা তাকে এত ধণ-সম্পদ দান করেছিলাম যে, তার চাবিগুলো বহন করতে শক্তিশালী একদল লোককেও ক্লান্ত করে দিত। (স্মরণ করুন) যখন তার জাতি তাকে বলেছিল, আনন্দ-উল্লাস করবে না, নিশ্চই আল্লাহ আনন্দ-উল্লাসকারীদেরকে ভালবাসেন না।  \n\n \n\n" +
                " ০২৮:০৭৭] এবং আল্লাহ তোমাকে যাকিছু দিয়েছেন তুমি তা দিয়ে পরকালের বাসগৃহের অনুসন্ধান কর এবং তোমার ইহকালীন জীবনের প্রাচুর্যকেও  \n\n \n\n" +
                "ভুলো না এবং যেভাবে আল্লাহ তোমার প্রতি উত্তম ব্যবহার করেছেন সেভাবে তুমিও লোকদের প্রতি সদয় ব্যবহার কর, এবং দেশে নীতিভ্রষ্টতা সৃষ্টি করতে চেও না। নিশ্চই আল্লাহ নীতিভ্রষ্টতা সৃষ্টি কারীদের ভালবাসেন না।  \n\n \n\n" +
                " ০২৮:০৭৮] সে বলল, \"এসব(প্রাচুর্য ও মর্যাদা)তো আমি এমন জ্ঞান বলে পেয়েছি যা শুধু আমার নিজেরই্য\" সে কি জানত না যে আল্লাহ তার পূর্বের বহু জনগোষ্ঠিকে ধ্বংস করে দিয়েছেন যারা শক্তিতে তার অপেক্ষা অধিকতর শক্তিশালী এবং সংগ্রহে অধিকতর প্রাচুর্যশালী ছিল? বস্তুতঃ অপরাধীদেরকে ধ্বংসের সময় তাদের পাপ সমন্ধে কোন জিজ্ঞাসাবাদ করা হয় না।  \n\n \n\n" +
                " ০২৮:০৭৯] অতঃপর সে তার জাতির সামনে নিজ জাঁকজমক সহকারে বের হল। এতে যারা ইহকালীন জীবনের সূখ-সম্পদ কামনা করত তারা বলল, \"হায় আফসোস, কারুনকে যা দান করা হয়েছে তেমন যদি আমাদেরকে দান করা হত! সে নিশ্চই পরম সৌভাগ্যশালী।\"  \n\n \n\n" +
                " ০২৮:০৮০] এবং যারা জ্ঞানী ছিল তারা বলল, \"তোমাদের সর্বনাশ ! আল্লাহর পুরষ্কার সে ব্যক্তির জন্য উত্তম যে আল্লাহর এককসত্বা মেনে নেয় এবং ভালকাজ করে, এমন পুরষ্কার শুধু ধৈর্যশীল ব্যক্তিরাই পেয়ে থাকে।\"  \n\n \n\n" +
                "  \n\n \n\n" +
                " ০২৮:০৮১] অতঃপর আমরা তাকে(হামানকে) ও তার বাসগৃহকে ভূগর্ভে প্রোথিত করে দিলাম, তখন তার এমন কোন দল ছিল না, যারা আল্লাহর মোকাবেলায় তাকে সাহায্য করতে পারত, এবং সে কোনক্রমেই আত্মরক্ষাকারীদের অন্তর্ভূক্ত হতে পারল না।  \n\n \n\n" +
                " ০২৮:০৮২] এবং যারা আগেরদিন পর্যন্ত তার অবস্থানে পৌঁছতে চেয়েছিল, তারা বলতে লাগল, সর্বনাশ ! নিশ্চই আল্লাহ নিজ বান্দাদের মধ্যে যার জন্য চান জীবিকা সম্প্রসারিত করেন এবং পরিমিত পরিমাপ নিরুপন করেন। আল্লাহ যদি আমাদের উপর অনুগ্রহ না করতেন তাহলে নিশ্চই তিনি আমাদেরকেও ভূগর্ভে প্রোথিত করে দিতেন,\" সর্বনাশ! নিশ্চই অস্বীকারকারীরা কখনও সফল হয় না।  \n\n \n\n" +
                " ০২৮:০৮৩] এ-ই হচ্ছে পরকালের বাসগৃহ, তাদের জন্যই উন্নত করি যারা পৃথিবীতে ঔদ্ধত্য প্রকাশ এবং নীতিভ্রষ্টতা সৃষ্টি করতে চায় না। এবং উত্তম পরিণাম সচেতনগণের জন্যই।  \n\n \n\n" +
                " ০২৮:০৮৪] যে কেউ ভালকাজ নিয়ে উপস্থিত হবে, তাকে তা অপেক্ষা উৎকৃষ্টতর(১০, ৭০০ গুণ) প্রতিদান দেয়া হবে এবং যে মন্দ কাজ নিয়ে উপস্থিত হবে(১ গুণ), তাহলে তাকে পুরস্কার দেয়া হবে না ততটুকু ছাড়া যতটুকু মন্দকাজ সে করেছে।  \n\n \n\n" +
                " ০২৮:০৮৫] নিশ্চই যিনি আপনার উপর কুরআনকে অবশ্যপাঠ্য করেছেন, তিনিই আপনাকে পুনরাবৃত্তি স্থলে(পৃথিবীতে) পূনরায় ফিরিয়ে আনবেন। আপনি বলুন, আমার ক্রমবিকাশক সে ব্যক্তিকে খুব ভালভাবে জানেন যে সুপথপ্রাপ্তির নির্দেশনাসহ আগমন করেছে, এবং তাকেও, যে প্রকাশ্য ভ্রান্তিতে নিপতিত আছে।  \n\n \n\n" +
                " ০২৮:০৮৬] এবং আপনি আশাও করতে পারেন নাই, আপনাকে গ্রহন করতে হবে এক মহান গ্রন্থ , কেবল আপনার ক্রমবিকাশকের পক্ষে থেকে রহমত স্বরুপ, অতএব আপনি কখনও অস্বীকারকারীদের সহযোগী হবেন না।  \n\n \n\n" +
                " ০২৮:০৮৭] এবং আল্লাহর আয়াতগুলো আপনার উপর অবতীর্ণ হওয়ার পর তা থেকে তারা যেন আপনাকে নিবৃত্ত করতে না পারে, এবং আপনি আপনার ক্রমবিকাশকের দিকে (মানব জাতিকে) আহবান করুন, এবং আপনি কখনও পৃথকসত্তা কল্পনাকারী(মোশরেক)দের মধ্যে শামিল হবেন না।  \n\n \n\n" +
                " ০২৮:০৮৮] এবং আপনি আল্লাহর সাথে অন্য কোন উদ্ভাবনীশক্তিকে ডাকবেন না। তিনি ছাড়া কোন উদ্ভাবনীশক্তি নেই। তাঁর সত্তা ছাড়া সবকিছু ধ্বংসশীল, সকল নিয়ম-কানুন-সিদ্ধান্ত তাঁরই, এবং সকলকে তাঁরই দিকে ফিরিয়ে নিয়ে যাওয়া হবে।");

        editor.putString("25", "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৭৮ আয়াত এবং ৬ রুকূ আছে।  \n\n \n\n" +
                " ০২৫:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০২৫:০০১] প্লাজমা-কনার অধিকারী এককসত্বা আল্লাহ যিনি নিজ বান্দার উপর (ভাল-মন্দ) **পার্থক্যকারী গ্রন্থ** অবতীর্ণ করেছেন যেন তিনি(মুহাম্মদ) মহাবিশ্বের সকলের জন্য সতর্ককারী হন।  \n\n \n\n" +
                " ০২৫:০০২] তিনি(আল্লাহ)ই এককসত্বা যার জন্য বায়ুমন্ডলগুলো ও পৃথিবীগুলোর পরম মালিকানা, এবং যিনি কোন ক্ষূদ্র-সংস্করণ সৃষ্টি করেন নাই(যা ধীরে ধীরে বড় হবে), এবং যাঁর মধ্যে কোন পৃথকসত্বা নেই। এবং যিনি প্রত্যেক বস্তুকে সৃষ্টি করেছেন অতঃপর সেগুলোর পরিমিত-পরিমাপ নিরুপন করেছেন।  \n\n \n\n" +
                " ০২৫:০০৩] এবং তারা তাঁর পরিবর্তে যাদেরকে(পীর-পুরোহিত-যাযক-হুজুরদেরকে) উপাশ্য হিসেবে গ্রহণ করেছে, তারা কোন কিছু সৃষ্টি করতে পারে না বরং তারা নিজেরাই সৃষ্ট। যেহেতু তারা নিজেদের জন্যও না কোন উপকার এবং না কোন অপকার করার ক্ষমতা রাখে, এবং না জীবন এবং না মরণ এবং না পূনরুথানের কোন ক্ষমতা রাখে।  \n\n \n\n" +
                " ০২৫:০০৪] এবং যারা অস্বীকার করেছে তারা বলে, এ(কুরআন) এক অলীক কথা-মালা ছাড়া কিছু নয় যা সে নিজে মিথ্যা রচনা করে নিয়েছে এবং এ ব্যাপারে অন্য এক জাতি তাকে সাহায্য করেছে। বস্তুতঃ তারা গুরুতর অন্যায় করেছে এবং জঘন্য মিথ্যা বলেছে।  \n\n \n\n" +
                " ০২৫:০০৫] এবং তারা বলে, এসব পূর্ববর্তীদের উপকথা, যা সে লিখে নিচ্ছে এবং এটি তার কাছে সকাল ও সন্ধ্যায় শ্রুতিলিখনের জন্য উচ্চারণ করা হচ্ছে।  \n\n \n\n" +
                " ০২৫:০০৬] আপনি বলুন, এটি(কুরআন) তিনি অবতীর্ণ করেছেন যিনি বায়ুমন্ডলগুলো ও পৃথিবীগুলোর প্রত্যেক গুপ্তরহস্য অবগত আছেন। নিশ্চই তিনি অতীব সংশোধনশীল, পরম দয়াময়।  \n\n \n\n" +
                " ০২৫:০০৭] এবং তারা বলে, এ আবার কেমন রসূল যে আহারও করে আবার বাজারেও চলাফেরা করে? তার উপর কেন কোন ফিরিশতা অবতীর্ণ করা হয় নাই যাতে সে তার সাথে থেকে সতর্ককারী হতে পারত?  \n\n \n\n" +
                " ০২৫:০০৮] অথবা তার নিকট কোন ধণ-ভান্ডার অবতীর্ণ করা হত অথবা তার কোন বাগান থাকত যা থেকে সে (ফল-ফলদি)খেত। এবং অন্যায়কারীরা বলে, তোমরা কেবল এক যাদুগ্রস্ত ব্যক্তির অনুসরণ করছ।  \n\n \n\n" +
                " ০২৫:০০৯] দেখুন ! তারা আপনার সমন্ধে কেমন উপমা বর্ণনা করছে। ফলে তারা বিপথগামী হচ্ছে, অতএব তারা কোনও সঠিক পথ খুজে পাচ্ছে না।  \n\n \n\n" +
                " ০২৫:০১০] প্লাজমা-কনার অধিকারী এককসত্বা তিনি, যিনি চাইলে আপনার জন্যে এরচেয়ে উৎকৃষ্টতর জিনিস সৃষ্টি করতে পারেন-এমন সব বাগান যার তলদেশ দিয়ে নদী প্রবাহিত হতে থাকবে-এবং আপনার জন্য বড় বড় প্রাসাদ তৈরী করে দিতে পারেন।  \n\n \n\n" +
                " ০২৫:০১১] বরং তারা স্থির-সময়কে মিথ্যা প্রতিপন্ন করছে, এবং যে ব্যক্তি স্থির-সময়কে মিথ্যা প্রতিপন্ন করবে তার জন্য আমরা তেজষ্ক্রিয়-অগ্নিশিখা প্রস্তুত করে রেখেছি।  \n\n \n\n" +
                " ০২৫:০১২] যখন সেটি তাদেরকে দূর থেকে দেখবে তখন তারা সেটির তীব্র রোষ এবং গর্জন শুনতে পাবে।  \n\n \n\n" +
                " ০২৫:০১৩] এবং যখন তাদের(অপূর্ণ ভ্রূণের টেস্টটিউবগুলো)কে সেটির একটি সংকীর্ণ (অর্ধগোলাকৃতি) স্থানে শিকলে বেঁধে নিক্ষেপ করা হবে এবং তাদেরকে সেখানে সেটআপ করা হবে কঠিন পরিশ্রমের জন্য।  \n\n \n\n" +
                " ০২৫:০১৪] (এবং বলা হবে) আজ তোমরা ডেকো না এক প্রকার কঠিন পরিশ্রমকে, বরং বহু প্রকার কঠিন পরিশ্রমকে ডাক।  \n\n \n\n" +
                " ০২৫:০১৫] আপনি বলুন, \"এটি উত্তম, না চিরস্থায়ী জান্নাত, যার প্রতিশ্রুতি সচেতনদেরকে দেয়া হয়েছে?\" এটি তাদের পুরস্কার এবং শেষ প্রত্যাবর্তনস্থল হবে।  \n\n \n\n" +
                " ০২৫:০১৬] সেখানে তাদের জন্য থাকবে, তাদের পছন্দের সকল বস্তু ও *অমরত্ব*। এ প্রতিশ্রুতি পূর্ণ করা আপনার ক্রমবিকাশকের উপর দায়িত্ব।  \n\n \n\n" +
                " ০২৫:০১৭] এবং তাদেরকে এবং আল্লাহর পরিবর্তে তারা যাদের উপাশনা করছে, তাদেরকে একত্রিত করার দিনে তিনি তাদেরকে (পীর-পুরোহিত-যাযক-হুজুরদেরকে) বলবেন, তোমরা কি আমার এ বান্দাদেরকে (৫০থেকে৯৯%শুদ্ধ) বিপথগামী করেছিলে, না তারা নিজেরাই পথভ্রষ্ট হয়েছিল?  \n\n \n\n" +
                " ০২৫:০১৮] তখন তারা (পীর-পুরোহিত-যাযক-হুজুররা) বলবে, আপনি নিয়মশীল, আমাদের কোন অধিকার ছিল না যে, আমরা আপনার পরিবর্তে অন্য কাউকে অভিভাবক হিসেবে গ্রহণ করি, কিন্তু আপনি তাদেরকে এবং তাদের পিতৃপুরুষদেরকে আমোদ-প্রমোদ-সম্ভোগের বস্তু দান করেছিলেন, যতক্ষণ না তারা আপনার স্মারক-বানী (কুরআন)কে ভুলে গেল এবং ধ্বংসপ্রাপ্ত জাতিতে পরিণত হল।  \n\n \n\n" +
                " ০২৫:০১৯] কিন্তু (পৃথকসত্বাবাদিদেরকে বলা হবে দেখ!) যা কিছু তোমরা বলছ তা তারা (পীর-পুরোহিত-যাযক-হুজুররা) মিথ্যা প্রতিপন্ন করছে, সুতরাং (আজ) তোমরা এ দুঃখ-কষ্ট অপসারণ করতে পারবেনা এবং কোন প্রকার সাহায্য লাভ করতে পারবেনা। তোমাদের মধ্য থেকে যারা অন্যায়কারী তাদেরকে আমরা মহা দুঃখ-কষ্টের স্বাদ গ্রহণ করাবো।  \n\n \n\n" +
                " ০২৫:০২০] এবং আমরা আপনার পূর্বে রসূলদের মধ্য থেকে যাদের প্রেরণ করেছি তারা সকলেই আহার করত এবং হাটে-বাজারে চলাফেরা করত। এবং আমরা আপনাদের মধ্যে কতককে কতকের জন্য বিভ্রান্তির কারন করেছি, আপনারা কি ধৈর্য ধরেছেন, যেহেতু আপনার ক্রমবিকাশক সর্বদ্রষ্টা?  \n\n \n\n" +
                " ০২৫:০২১] এবং যারা আমাদের সাক্ষাতের আশা রাখেনা তারা বলে, আমাদের উপর ফিরিশতা অবতীর্ণ হয় না কেন? অথবা আমরা আমাদের ক্রমবিকাশককে দেখতে পাই না কেন? তারা নিজেদের মনে অহংকার পোষণ করছে এবং নির্লজ্জতায় ঔদ্ধত্যে সীমা ছাড়িয়ে গেছে।  \n\n \n\n" +
                " ০২৫:০২২] যেদিন তারা ফিরিশতাদেরকে দেখতে পাবে সেদিন অপরাধীদের জন্য কোন শুভ সংবাদ থাকবে না; এবং তারা বলবে আমাদের ও তাদের মধ্যে শক্ত আড়াল চাই।  \n\n \n\n" +
                " ০২৫:০২৩] এবং আমরা তাদের সকল কৃত-কর্ম প্রদর্শন করব, যা তারা করত, অতঃপর ওদেরকে আমরা বিক্ষিপ্ত ধুলিকণায় পরিণত করব।  \n\n \n\n" +
                " ০২৫:০২৪] সেদিন জান্নাতবাসীদের প্রাপ্তস্থান স্থিতিশলতার দিক দিয়েও উৎকৃষ্ট হবে এবং বিশ্রামাগার হিসেবেও সুন্দর-মনোরম হবে।  \n\n \n\n" +
                " ০২৫:০২৫] এবং যেদিন (টাইলসএর)আচ্ছাদন সহ(মহাকাশযানগুলোর যাতায়তে) বায়ুমণ্ডল বিদীর্ণ হবে, এবং বহু সংখ্যক ফিরিশতা অবতীর্ণ করা হবে।  \n\n \n\n" +
                " ০২৫:০২৬] সেদিন মালিকানা রহমান আল্লাহর বিজ্ঞানের হবে। এবং অস্বীকারকারীদের জন্য সেদিনটি হবে অতি কঠোর।  \n\n \n\n" +
                " ০২৫:০২৭] সেদিন অন্যায়কারীরা নিজ দুহাত দংশন করে বলবে, হায় যদি আমি রাসূলের সঙ্গে পথ অবলম্বন করতাম।  \n\n \n\n" +
                " ০২৫:০২৮] হায়, আমার সর্বনাশ ! যদি আমি অমুককে বন্ধু হিসেবে গ্রহণ না করতাম।  \n\n \n\n" +
                " ০২৫:০২৯] অবশ্যই সে আমাকে স্মারক-বানী (কুরআন) থেকে বিভ্রান্ত করেছে, তা আমার কাছে আসার পর । নিশ্চই নিজ স্বাধীন-ইচ্ছা (শয়তান) মানুষের জন্য হতাশা প্রস্তুৎকারী।  \n\n \n\n" +
                " ০২৫:০৩০] এবং এ রসূল (নবীজী) বলবেন, হে আমার ক্রমবিকাশক ! নিশ্চই আমার জাতি এ কুরআনকে পরিত্যক্ত বস্তু বানিয়ে নিয়েছে।  \n\n \n\n" +
                " ০২৫:০৩১] এভাবে আমরা সকল নবীর জন্য অপরাধীদের থেকে শত্রু সৃষ্টি করেছি, যেহেতু আপনার ক্রমবিকাশক সুপথপ্রাপ্তির নির্দেশনা দানকারী হিসেবে ও সাহায্য দানকারী হিসেবে যথেষ্ট।  \n\n \n\n" +
                " ০২৫:০৩২] এবং অস্বীকারকারীরা বলল, কুরআনকে কেন তার উপর একক খণ্ডে অবতীর্ণ করা হল না? এভাবেই আমরা আপনার মনে-মগজে এটিকে যুক্তি দিয়ে প্রমাণ করেছি এবং আমরা এটিকে ধীরে ধীরে পাঠ করেছি।  \n\n \n\n" +
                " ০২৫:০৩৩] এবং আপনার কাছে তারা এমন যে কোনও উদাহরণ(প্রশ্ন) নিয়ে আসুক না কেন, অবশ্যই আমরা আপনার কাছে এনে দিয়েছি তার বিজ্ঞান ভিত্তিক এবং সুন্দরতম ব্যাখ্যা।  \n\n \n\n" +
                " ০২৫:০৩৪] তাদেরকে অধো-মুখে(উপুড় করে) অনুতাপস্থলে একত্রিত করা হবে- তারা থাকবে ক্ষতিগ্রস্থ অবস্থায় এবং ভ্রান্ত পথ-অবলম্বী অবস্থায়।  \n\n \n\n" +
                " ০২৫:০৩৫] এবং মুসাকে আমরা গ্রন্থ দিয়েছিলাম এবং সাথে তার ভাই হারুনকে সহকারী নিযূক্ত করেছিলাম।  \n\n \n\n" +
                " ০২৫:০৩৬] এবং আমরা বলেছিলাম তোমরা দুজন সে জাতির কাছে যাও যারা আমাদের আয়াত(নিদর্শন) গুলোকে মিথ্যা প্রতিপন্ন করেছে। অতঃপর আমরা তাদেরকে সম্পুর্ণ ভাবে বিধ্বস্ত করে দিলাম।  \n\n \n\n" +
                " ০২৫:০৩৭] এবং নূহের জাতিকেও, যখন তারা রসূলদেরকে মিথ্যা প্রতিপন্ন করল তখন আমরা তাদেরকে নিমজ্জিত করলাম এবং মানবজাতির জন্য আমরা তাদেরকে এক আয়াত(নিদর্শন) করলাম। এবং আমরা অন্যায়কারীদের জন্য এক যন্ত্রনাদায়ক দুঃখ-কষ্ট প্রস্তুত করে রেখেছি।  \n\n \n\n" +
                " ০২৫:০৩৮] এবং আমরা ধ্বংস করে দিয়েছি, আদ ও সামুদ জাতিকে এবং রাস(পুরণো-কূপ) নগরীর অধিবাসীদেরকে এবং তাদের মধ্যবর্তী আরও অনেক প্রজন্মকে।  \n\n \n\n" +
                " ০২৫:০৩৯] এবং তাদের প্রত্যেকের জন্য আমরা বারবার বিভিন্ন দৃষ্টান্ত বর্ণনা করেছি, কিন্তু (না মানায়) আমরা সকলকেই সম্পুর্ণ ধ্বংস করে দিয়েছি।  \n\n \n\n" +
                " ০২৫:০৪০] এবং অবশ্যই তারা (মক্কা বাসীগণ) এ শহরগুলোতে আসে, যেগুলোর উপর কষ্টদায়ক নিকৃষ্ট বৃষ্টি বর্ষণ করা হয়েছিল। তবুও কি তারা এটি দেখে না? বরং *তারা পূনরুত্থানের আশাই রাখে না*।  \n\n \n\n" +
                " ০২৫:০৪১] এবং তারা যখন আপনাকে দেখে তারা আপনাকে গ্রহন করে না ঠাট্টা-বিদ্রুপের পাত্র ছাড়া, (এবং বলে) \"এ লোককে আল্লাহ্ রসূল হিসেবে আবির্ভূত করেছেন ?  \n\n \n\n" +
                " ০২৫:০৪২] সে আমাদেরকে আমাদের উপাশ্যদের থেকে বিপথ-গামী করে দেয়ার উপক্রম করেছিল যদি না আমরা এদের উপর সুদূঢ় থাকতাম।\" এবং শিগ্রই তারা জানতে পারবে, যখন তারা দুঃখ-কষ্ট প্রত্যক্ষ করবে, কারা (সঠিক)পথ থেকে বিভ্রান্ত।  \n\n \n\n" +
                " ০২৫:০৪৩] আপনি কি তাকে দেখেছেন, যে নিজের উচ্চাকাঙ্খাকে উপাশ্য হিসেবে গ্রহণ করেছে? আপনি কি তার অভিভাবক হয়েছেন?  \n\n \n\n" +
                " ০২৫:০৪৪] আপনি কি মনে করেন যে, তাদের বেশির ভাগ লোক শুনে এবং বুঝে ? তারা একেবারে চতুষ্পদ জন্তুর মত -বরং তারা (সঠিক)পথ থেকে বিভ্রান্ত।  \n\n \n\n" +
                " ০২৫:০৪৫] আপনি কি আপনার ক্রমবিকাশকের প্রতি লক্ষকরেন নাই, কিভাবে তিনি পৃথিবীকে নিজঅক্ষে ঘুরিয়ে সূর্য থেকে সরিয়ে নেন(ছায়াকে লম্বা করেন)? তিনি ইচ্ছা করলে সেটিকে একই স্থানে স্থির করে দিতে পারেন। আবার আমরা সূর্যকে করেছি পথপ্রদর্শক-মধ্যমনি (পৃথিবীর কক্ষপথ সূর্যকে ঘিরে) ।  \n\n \n\n" +
                " ০২৫:০৪৬] অতএব সেটিকে (পৃথিবীর বার্ষিক গতিতে সূর্যকে) আমরা আমাদের দিকে ক্রমান্বয়ে গুটিয়ে আনি।  \n\n \n\n" +
                " ০২৫:০৪৭] এবং তিনিই সে এককসত্বা যিনি তোমাদের জন্য রাতকে করেছেন আবরণে ঢাকা এবং ঘুমকে করেছেন বিশ্রামের জন্যে এবং দিনকে করেছেন ঘুম থেকে জেগে উঠার জন্যে।  \n\n \n\n" +
                " ০২৫:০৪৮] এবং তিনিই সে এককসত্বা যিনি নিজ রহমত বর্ষণের মধ্যে আনন্দ-সংবাদবাহি বায়ু পাঠান এবং আমরা বায়ুমণ্ডল থেকে বিশুদ্ধ(most distiled) পানি বর্ষণ করি।  \n\n \n\n" +
                " ০২৫:০৪৯] যেন আমরা তা দিয়ে মৃত ভূমিকে সঞ্জীবিত করি এবং আমাদের সৃষ্ট বহু জীবজন্তু ও মানুষকে পানি পান করাই।  \n\n \n\n" +
                " ০২৫:০৫০] এবং অবশ্যই আমরা এটিকে(কুরআনকে) তাদের মধ্যে বন্টণ করে দিয়েছি যেন তারা উপদেশ গ্রহণ করে, কিন্তু অধিকাংশ মানুষই এটি প্রত্যাখ্যাণ করে অস্বীকার ছাড়া কিছুই করলো না।  \n\n \n\n" +
                " ০২৫:০৫১] এবং যদি আমরা চাইতাম তাহলে প্রত্যেক শহর-নগর-জনপদে সতর্ককারী উত্থান করতাম।  \n\n \n\n" +
                " ০২৫:০৫২] অতএব আপনি অস্বীকারকারীদের আনুগত্য করবেন না, এবং আপনি সেটির (কুরআনের) সাহায্যে তাদের সাথে যথাসাধ্য গভীর-প্রচেষ্টা চালিয়ে যান।  \n\n \n\n" +
                " ০২৫:০৫৩] তিনিই সেই এককসত্তা যিনি দুটি সমুদ্রকে প্রবাহিত করেছেন যাদের মধ্য থেকে একটির (ভূমধ্যসাগরর) পানি মিষ্ট, সুপেয়, এবং অপরটির (লোহিতসাগরের) লবনাক্ত, তিক্ত এবং তিনি উভয়ের মধ্যে এক আড়াল (সিনাই উপদ্বীপ) এবং শক্ত প্রতিবন্ধকতা সৃষ্টি করেছেন (বর্তমানে সুয়েজখাল কেটে অপসারিত )।  \n\n \n\n" +
                " ০২৫:০৫৪] এবং তিনিই সেই এককসত্তা যিনি মানুষ (বাশার)কে পানি থেকে সৃষ্টি করেছেন, অতঃপর তিনি তাদের জন্য জন্মগত সম্পর্ক এবং বৈবাহিক সম্পর্ক নিরুপন করেছেন, এবং আপনার ক্রমবিকাশক পরিমিত-পরিমাপ নিরুপনে সক্ষম।  \n\n \n\n" +
                " ০২৫:০৫৫] এবং তারা আল্লাহর পরিবর্তে তাদের (পীর-পুরোহিত-যাযক-হুজুরদের) সেবাকাজ-ইবাদত করে যারা তাদের কোন উপকার করতে পারে না এবং কোন অপকারও করতে পারে না। বস্তুতঃ অস্বীকাকারীরা সবসময়ই তাদের ক্রমবিকাশকের পশ্চাদ্ভূমি(hinterland)ই হয়ে থাকে।  \n\n \n\n" +
                " ০২৫:০৫৬] এবং আমরা আপনাকে শুধু শুভ-সংবাদদাতা ও সতর্ককারীরুপে প্রেরণ করেছি।  \n\n \n\n" +
                " ০২৫:০৫৭] আপনি বলুন, আমি তোমাদের কাছে এর জন্য কোন পারিশ্রমিক চাই না কেবল এ ছাড়া যে, যদি কোন ব্যক্তি সেচ্ছায় নিজ ক্রমবিকাশকের পথ অবলম্বন করে।  \n\n \n\n" +
                " ০২৫:০৫৮] এবং (আপনি বলুন,) \"সেই *চিরঞ্জীবের* উপর ভরসা কর, যাঁর মরণ নেই, এবং তাঁর প্রশংসার সাথে নিজ নিজ দায়িত্ব পালন কর। যেহেতু তিনি নিজ বান্দাদের পাপ সমন্ধে খবর রাখার ব্যাপারে যথেষ্ট।\"  \n\n \n\n" +
                " ০২৫:০৫৯] যিনি বায়ুমন্ডলগুলো ও পৃথিবীগুলো এবং এতদুভয়ের মধ্যে যা কিছু আছে সবই অনন্তের কাছাকাছি অন্তযূক্ত মহাকাল(ছয় দিন) ধরে সৃষ্টি করে চলেছেন, এবং তিনি সৃষ্টির-ভিত্তি নিউক্লিয়াসকে (আরশ) সুদৃঢ়ভাবে প্রতিষ্ঠিত করেছেন, ইনি অযাচিত-অসীম দাতা। অতএব আপনি তাঁর সমন্ধে তাকে জিজ্ঞেস করুন, যে বেশি জানে।  \n\n \n\n" +
                " ০২৫:০৬০] এবং যখন তাদেরকে বলা হয় যে, \"তোমরা রহমানকে সেজদা কর,\" তখন তারা বলে, \"রহমান আবার কী ? আমরা কি তাকে সেজদা করবো যার সমন্ধে তুমি আমাদেরকে আদেশ দিচ্ছ?\" যদিও একথা তাদের ঘৃণাকে আরও বাড়িয়ে দেয়।  \n\n \n\n" +
                " ০২৫:০৬১] প্লাজমা-কণার অধিকারী এককসত্বা যিনি মহাআকাশে অসংখ্য ছায়াপথ সৃষ্টি করেছেন এবং তাতে অগুণিত নক্ষত্র (সূর্য, তারা), গ্রহ এবং উজ্জল উপগ্রহ সৃষ্টি করেছেন।  \n\n \n\n" +
                " ০২৫:০৬২] এবং তিনিই সে এককসত্বা যিনি রাত ও দিনকে একটিকে অপরটির ক্রম-প্রতিস্থাপনকারী করে সৃষ্টি করেছেন, সে ব্যক্তির জন্য যে স্মরণ করতে চায় অথবা কৃতজ্ঞ হতে চায়।  \n\n \n\n" +
                " ০২৫:০৬৩] এবং রহমানের প্রকৃত বান্দা তারা, যারা ভূপৃষ্ঠের উপর নম্র-ভদ্র-অমাইকভাবে চলে, এবং যখন অজ্ঞরা তাদেরকে বিদ্রুপাত্মক খেতাবে সম্মোধন করে তখন তারা বলে, \"সালাম\"।  \n\n \n\n" +
                " ০২৫:০৬৪] এবং যারা রাত্রি অতিবাহিত করে তাদের ক্রমবিকাশকের জন্য সেজদারত ও দন্ডয়মান অবস্থায়।  \n\n \n\n" +
                " ০২৫:০৬৫] এবং যারা বলে, \"হে আমার ক্রমবিকাশক ! আপনি আমাদের উপর থেকে অনুতাপস্থলের দুঃখ-কষ্টকে অপসারণ করুন, নিশ্চই সেটির দুঃখ-কষ্ট অতি গভীর।\"  \n\n \n\n" +
                " ০২৫:০৬৬] নিশ্চই সেটি অতি মন্দ- অস্থায়ী ঠিকানা হিসেবেও এবং দীর্ঘস্থায়ী আবাসস্থল হিসেবেও।  \n\n \n\n" +
                " ০২৫:০৬৭] এবং যারা, যখন খরচ (দরিদ্রদের এককভাবে অন্নদান, বস্ত্রদান করে এবং দারিদ্রদূরিকরণে সম্মিলিতভাবে দান) করে তখন, অপব্যয়ও করে না এবং কার্পণ্যাও করে না বরং স্বচ্ছলতা অর্জন পর্যন্ত দান করে।  \n\n \n\n" +
                " ০২৫:০৬৮] এবং যারা, আল্লাহর সাথে অন্য উপাশ্যকে ডাকে না, এবং বিজ্ঞান-ভিত্তিক কারণ ছাড়া কোন প্রাণকে হত্যা করে না যাকে আল্লাহ্ (হত্যা করা) নিষিদ্ধ করেছেন, এবং তারা বিকৃত-যৌনাচার করে না।যেহেতু যে কেউ এমন করবে সে জরিমানার সম্মূখীন হবে।  \n\n \n\n" +
                " ০২৫:০৬৯] পুনরুত্থানের দিন তার জন্য দুঃখ-কষ্টকে দ্বিগুণ করা হবে এবং সেখানে সে লাঞ্ছনায় দীর্ঘ সময় বাস করতে থাকবে-  \n\n \n\n" +
                " ০২৫:০৭০] সে ব্যক্তি ছাড়া যে অনুতাপ করে ফিরে আসে এবং আল্লাহকে এককসত্বা মানে এবং কাজ করে ভালকাজ, এরা এমন লোক যে, আল্লাহ তাদের মন্দকাজ গুলোকে সুন্দরকাজে বদলে দিবেন, বস্তুতঃ আল্লাহ অতীব সংশোধনশীল, পরম দয়াময়।  \n\n \n\n" +
                " ০২৫:০৭১] যে ব্যক্তি অনুতাপ করে ফিরে আসে এবং ভালকাজ করে তাহলে অবশ্যই সে পূর্ণরূপে আল্লাহর দিকে ফিরেছে,  \n\n \n\n" +
                " ০২৫:০৭২] এবং যারা, মিথ্যা সাক্ষ্য দেয় না এবং যখন তারা খোশগল্প(chat) করে তখন ভদ্রতা বজায় রাখে,  \n\n \n\n" +
                " ০২৫:০৭৩] এবং যারা, যখন তাদের ক্রমবিকাশকের আয়াতগুলোকে স্মরণ করিয়ে দেয়া হয়, তখন তারা সেগুলোর প্রতি বধির ও অন্ধ হয়ে পড়ে না।  \n\n \n\n" +
                " ০২৫:০৭৪] এবং যারা বলে, \"হে আমাদের ক্রমবিকাশক ! আপনি আামাদের জন্য আমাদের স্ত্রী ও সন্তান থেকে চক্ষুর স্নিগ্ধতা-পরমানন্দ বইয়ে দিন এবং আমাদেরকে সচেতনদের নেতা(ইমাম) বানান।\"  \n\n \n\n" +
                " ০২৫:০৭৫] এরাই এমন লোক, যাদেরকে প্রতিদানস্বরুপ (সুরম্য)বালাখানা দেয়া হবে কারন তারা ধৈর্য ধরেছে এবং সেখানে তারা সম্মুক্ষিন হবে অভিবাদন-শুভাশীষ এবং সালাম এর।  \n\n \n\n" +
                " ০২৫:০৭৬] সেখানে তারা চিরকাল বাস করবে। সেটি অতি উত্তম হবে-অস্থায়ী বিশ্রামাগার হিসেবেও এবং স্থায়ী বাসস্থান হিসেবেও।  \n\n \n\n" +
                " ০২৫:০৭৭] আপনি(অস্বীকারকারীদের) বলুন, \"আমার ক্রমবিকাশক তোমাদের কোন পরওয়া করেন না যদি তোমাদের কোনও প্রার্থনা না থাকে। যেহেতু তোমরা(আল্লাহর বাণীকে) মিথ্যা প্রতিপন্ন করতে, অতএব তার ফল অচিরেই তোমাদের উপর আরোপিত হবে।\"  \n\n \n\n");

        editor.putString("24", "পরিচ্ছেদ ০২৪.দৃশ্যঃ শিক্ষাই-আলো(সূরা আন-নূর The Light)  \n\n \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ৬৫ আয়াত এবং ৯ রুকূ আছে।  \n\n \n\n" +
                " ০২৪:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০২৪:০০১] একটি সুরা, যা আমরা অবতীর্ণ করেছি এবং যেটিকে আমরা অবশ্য-কর্তব্য (ফর্জ) করেছি এবং যেটিতে আমরা অবতীর্ণ করেছি সুস্পষ্ট প্রমান্য তথ্যসহ সমুজ্জল আয়াত (নিদর্শন) যেন তোমরা গবেষণা করতে পার।  \n\n \n\n" +
                " ০২৪:০০২] ব্যভিচারিণী এবং ব্যভিচারি- এদের প্রত্যেককে তোমরা একশত বেত্রাঘাত করবে, এবং যদি তোমরা আল্লাহর এককসত্বা ও পরকালীন-জীবন মেনে থাক তাহলে আল্লাহর এ বিধান পালনে যেন তাদের দুজন সমন্ধে তোমাদের অন্তরে মায়া-মমতার উদ্রেক না হয়, এবং যেন স্বীকারকারীদের একটি দল তাদের উভয়ের শাস্তি প্রত্যক্ষ করে।  \n\n \n\n" +
                " ০২৪:০০৩] ব্যভিচারীরা কেবল ব্যভিচারিণী অথবা পৃথকসত্বা-কল্পনাকারী(মোশরেক) নারী ছাড়া কাউকে বিয়ে করবে না এবং ব্যভিচারিণীরাও ব্যভিচারী অথবা পৃথকসত্বা-কল্পনাকারী(মোশরেক) পুরুষ ছাড়া কাউকে বিয়ে করবে না এবং স্বীকারকারীদের জন্য এদেরকে বিয়ে করা নিষিদ্ধ(হারাম) করা হয়েছে।  \n\n \n\n" +
                " ০২৪:০০৪] এবং যারা সতী নারীদের প্রতি অপবাদ আরোপ করে, অতঃপর তারা চারজন সাক্ষী উপস্থিত করে না, তাহলে তাদেরকে তোমরা আশিটি করে বেত্রাঘাত কর এবং তাদের সাক্ষ্য কখনও গ্রহণ করবে না, যেহেতু এরাই দুষ্কৃতকারী-সৈরাচারী।  \n\n \n\n" +
                " ০২৪:০০৫] শুধু তারা ছাড়া, যারা এরপরও ভুলমত-পথ থেকে ফিরে আসে এবং নিজেদের পুনর্গঠন করে, যেহেতু আল্লাহ্ অতীব সংশোধনশীল, দয়াময়।  \n\n \n\n" +
                " ০২৪:০০৬] এবং যারা নিজেদের স্ত্রীর প্রতি অপবাদ আরোপ করে এবং তারা নিজেরা ছাড়া তাদের কাছে অন্য কোন সাক্ষী থাকে না, তাহলে তাদের প্রত্যেকের সাক্ষ্য হবে আল্লাহর শপথসহ চারবার সাক্ষ্য দেয়া, এবং \"নিশ্চই সে সত্যবাদীদের অন্তর্ভূক্ত\" ঘোষণা দেয়া।  \n\n \n\n" +
                " ০২৪:০০৭] এবং পঞ্চমবার সাক্ষ্য দিবে, যদি সে মিথ্যাবাদীদের অন্তর্ভূক্ত হয়, তাহলে তার উপর আল্লাহ প্রদত্ত অমঙ্গল বর্ষিত হবে।  \n\n \n\n" +
                " ০২৪:০০৮] কিন্তু সে নারী থেকে এ শাস্তি দূর করতে, সে চারবার আল্লাহর শপথসহ সাক্ষ্য দিবে, সে(স্বামী)ই মিথ্যাবাদী।  \n\n \n\n" +
                " ০২৪:০০৯] এবং পঞ্চমবার সাক্ষ্য দিবে যে, যদি পুরুষটি সত্যবাদী হয় তাহলে তার(স্ত্রীটির) উপর আল্লাহর ক্রোধ বর্ষিত হবে,  \n\n \n\n" +
                " ০২৪:০১০] কারন, তোমাদের উপর আল্লাহর বিজ্ঞান-প্রযূক্তি এবং রহমত যদি না থাকত (তাহলে তোমাদেরকে অবশ্যই এক গুরুতর শাস্তি স্পর্শ করত ২৪:১৪)। যেহেতু, আল্লাহ্ ভুলমত-পথ থেকে ফিরে আসাদের গ্রহণকারী ও মহা-বিজ্ঞানী।  \n\n \n\n" +
                " ০২৪:০১১] যারা এক জঘন্য অপবাদ রটনা করেছিল নিশ্চই তারা তোমাদেরই মধ্য থেকে এক দল ছিল; তোমরা এটিকে নিজেদের জন্য অনিষ্টকর মনে করবে না, বরং এটি তোমাদের জন্য কল্যাণকর; তাদের মধ্য থেকে প্রত্যেকের জন্য সে পরিমাণ শাস্তি হবে যে পরিমাণ সে পাপ করেছে; এবং তাদের মধ্য থেকে যে ব্যক্তি তার(পাপের) মূল অংশের জন্য দায়ী তার জন্য গুরুতর শাস্তি নির্ধারিত আছে।  \n\n \n\n" +
                " ০২৪:০১২] যখন তোমরা একথা শুনেছিলে তখন স্বীকারকারী পুরুষরা এবং স্বীকারকারী নারীরা কেন নিজেদের সমন্ধে ভাল ধারণা করে নাই এবং বলে নাই, এটি ডাহা অপবাদ?  \n\n \n\n" +
                " ০২৪:০১৩] তারা (যারা এ অপবাদ ছড়িয়েছিল) কেন এবিষয়ে চারজন সাক্ষী উপস্থিত করে নাই? সুতরাং যেহেতু তারা সাক্ষী উপস্থিত করে নাই, এজন্য তারা আল্লাহর দৃষ্টিতে মিথ্যাবাদী।  \n\n \n\n" +
                " ০২৪:০১৪] এবং যদি তোমাদের উপর আল্লাহর বিজ্ঞান-প্রযূক্তি এবং তাঁর রহমত ইহকালে ও পরকালে না থাকত, তাহলে সে কাজের জন্য, যে কাজে তোমরা লিপ্ত হয়েছিলে, তোমাদেরকে অবশ্যই এক গুরুতর শাস্তি স্পর্শ করত।  \n\n \n\n" +
                " ০২৪:০১৫] (এজন্য যে) যখন তোমরা নিজেদের জিহ্বাগুলো দিয়ে এটি(অপবাদ) চর্চা করতে আরম্ভ করেছিলে এবং তোমরা নিজেদের মুখে এমন কথা বলছিলে, যার সমন্ধে তোমাদের কোন জ্ঞান ছিল না, তোমরা এ কথাকে সাধারণ মনে করেছিলে, অথচ এটি আল্লাহর দৃষ্টিতে অতি গুরুতর ছিল।  \n\n \n\n" +
                " ০২৪:০১৬] এবং কেন এমন হল না, যখন তোমরা এটি শুনেছিলে তখন বললে না, \"এ বিষয়ে আমাদের পরস্পরের মধ্যে চর্চা করার কোন অধিকার নেই, (হে আল্লাহ্) আপনি নিয়মশীল এটি একটি গুরুতর অপবাদ।\"  \n\n \n\n" +
                " ০২৪:০১৭] আল্লাহ্ তোমাদেরকে সতর্ক করছেন যেন তোমরা কখনও এমন কাজ পূনরায় না কর, যদি তোমরা স্বীকারকারী হও।  \n\n \n\n" +
                " ০২৪:০১৮] এবং আল্লাহ তোমাদের জন্য সুস্পষ্টভাবে তাঁর আয়াতগুলো(আদেশাবলী) বর্ণনা করছেন, বস্তুতঃ আল্লাহ্ সর্বজ্ঞানী, মহা-বিজ্ঞানী।  \n\n \n\n" +
                " ০২৪:০১৯] যারা এমন চায় যে, স্বীকারকারীদের মধ্যে অশ্লীলতা বিস্তার লাভ করুক, তাদের জন্য নিশ্চই ইহকালে ও পরকালে যন্ত্রনাদায়ক দুঃখ-কষ্ট আছে। বস্তুতঃ আল্লাহ জানেন এবং তোমরা জান না।  \n\n \n\n" +
                " ০২৪:০২০] —এবং যদি না তোমাদের উপর আল্লাহর বিজ্ঞান-প্রযূক্তি ও তাঁর রহমত থাকত! (তাহলে তোমাদেরকে অবশ্যই এক গুরুতর শাস্তি স্পর্শ করত ২৪:১৪) যেহেতু আল্লাহ অতীব স্নেহশীল, পরম দয়াময়।  \n\n \n\n" +
                " ০২৪:০২১] হে যারা আল্লাহর এককসত্বা মেনে নিয়েছ ! তোমরা নিজ-স্বাধীন-ইচ্ছার(শয়তানের) পদাংক অনুসরণ করবে না এবং যে নিজ-স্বাধীন-ইচ্ছার(শয়তানের) পদাংক অনুসরণ করে, তার জানা উচিৎ, নিশ্চই সেটি অশ্লীল ও মন্দ কাজের ঘৃণ্য আদেশ দেয়, এবং যদি তোমাদের উপর আল্লাহর বিজ্ঞান-প্রযূক্তি ও তাঁর রহমত না থাকত, তাহলে তোমাদের কেউ শুদ্ধ হতে পারতে না, কিন্তু আল্লাহ্ যাকে চান শুদ্ধ করেন; এবং আল্লাহ্ সর্বশ্রোতা সর্বজ্ঞানী।  \n\n \n\n" +
                " ০২৪:০২২] এবং তোমাদের মধ্যে যারা বিজ্ঞান-প্রযূক্তিতে ও ধন-সম্পদে প্রাচুর্যের অধিকারী, তারা যেন শপথ না করে, তারা আত্বীয়স্বজন এবং দরিদ্রদের সাহায্য দান করবে না। তারা যেন মার্জনা করে এবং সংশোধন করে। তোমরা কি চাওনা, আল্লাহ্ তোমাদের সংশোধন করুন? বস্তুতঃ আল্লাহ্ অতীব সংশোধনশীল, পরম দয়াময়।  \n\n \n\n" +
                " ০২৪:০২৩] নিশ্চই সেসব লোক যারা সতী, অসতর্ক স্বীকারকারী নারীদের বিরুদ্ধে অপবাদ রটায় তারা ইহকালে ও পরকালে ঘৃণ্য হবে এবং তাদের জন্য কঠিন দুঃখ-কষ্ট অবধারিত।  \n\n \n\n" +
                " ০২৪:০২৪] যেদিন তাদের জিহ্বা, তাদের হাত এবং তাদের পাগুলো তাদের কৃতকর্ম সমন্ধে তাদের বিরুদ্ধে সাক্ষ্য দিবে।  \n\n \n\n" +
                " ০২৪:০২৫] সেদিন আল্লাহ্ তাদেরকে তাদের জীবন-বিধানের বিজ্ঞানের ভিত্তিতে পূর্ণ প্রতিফল দিবেন এবং তারা জানবে যে, আল্লাহই সুস্পষ্ট বিজ্ঞানী।  \n\n \n\n" +
                " ০২৪:০২৬] মন্দ নারীরা মন্দ পুরুষের জন্য এবং মন্দ পুরুষরা মন্দ নারীদের জন্য এবং ভাল নারীরা ভাল পুরুষদের জন্য এবং ভাল পুরুষরা ভাল নারীদের জন্য। তারা তা থেকে নির্দোষ যা তারা বলে, তাদের জন্য আছে সংশোধন এবং সম্মানজনক জীবিকা।  \n\n \n\n" +
                " ০২৪:০২৭] হে যারা আল্লাহর এককসত্বা মেনে নিয়েছ ! তোমরা নিজেদের বাড়িঘর ছাড়া অন্য বাড়িঘরে প্রবেশ করবে না, যতক্ষণ পর্যন্ত না তোমরা অনুমতি গ্রহণ এবং গৃহবাসীদের সালাম কর। এটি তোমাদের জন্য উত্তম হবে যদি তোমরা (উপদেশ)স্মরণ কর।  \n\n \n\n" +
                " ০২৪:০২৮] এবং যদি তোমরা সেসব বাড়িঘরে কাউকেও না পাও, তাহলে তোমরা তাতে প্রবেশ করবে না যতক্ষণ পর্যন্ত না তোমাদেরকে অনুমতি দেয়া হয়। এবং যদি তোমাদেরকে বলা হয় ফিরে যাও, তাহলে তোমরা ফিরে আসবে, এটি তোমাদের জন্য অধিকতর শুদ্ধতার কারণ হবে। এবং তোমরা যা কর আল্লাহ্ তা ভাল ভাবে জানেন।  \n\n \n\n" +
                " ০২৪:০২৯] তোমাদের উপরে কোন দোষ হবে না যদি তোমরা অনাবাসিক বাড়িঘরে প্রবেশ কর যা\\'তে তোমাদের দ্রব্য-সম্ভার রয়েছে, এবং আল্লাহ্ জানেন তাও, যা তোমরা প্রকাশ কর এবং তাও, যা গোপন কর।  \n\n \n\n" +
                " ০২৪:০৩০] আপনি স্বীকারকারীদেরকে বলুন, তারা যেন নিজেদের দৃষ্টিকে সংযত রাখে এবং তাদের ইজ্জৎ-সম্মান রক্ষা করে। এটি তাদের জন্য অত্যন্ত শুদ্ধতার কারণ হবে। নিশ্চই তারা যা করে সে সমন্ধে আল্লাহ্ ভালভাবে অবগত আছেন।  \n\n \n\n" +
                " ০২৪:০৩১] এবং আপনি স্বীকারকারী নারীদেরকে বলুন, তারাও যেন নিজেদের দৃষ্টিকে সংযত রাখে এবং নিজেদের ইজ্জৎ-সম্মান রক্ষা করে। এবং নিজেদের (ব্রা\\'তে ঢাকা)বক্ষ-সৌন্দর্যকে উন্মুক্ত না রাখে, কেবল ততটুকু ছাড়া যা আপনাআপনিই প্রকাশ পায়; এবং তারা তাদের চাদরের প্রান্তগুলোকে (কাঁধের উপর দিয়ে এনে আড়াআড়ি ভাবে) নিজেদের বগলে খুচে দেয়, এবং তারা যেন তাদের স্বামী অথবা পিতা অথবা তাদের স্বামীর পিতা অথবা তাদের পূত্র অথবা তাদের স্বামীর পূত্র অথবা ভাই অথবা তাদের ভ্রাতুষ্পুত্র অথবা নিজেদের ভগ্নি-পুত্র অথবা তাদের সমশ্রেণীর নারী অথবা তাদের বান্ধবী(যাদের মালিক হয়েছে তাদের ডানহাত) অথবা বুদ্ধিপ্রতিবন্ধি অধীনস্থ চাকর অথবা নারীদের গোপন বিষয় সমন্ধে অজ্ঞ বালকরা ছাড়া অপর কারও কাছে নিজেদের (ব্রা\\'তে ঢাকা)বক্ষ-সৌন্দর্য প্রকাশ না করে। এবং তাদের (ব্রা'তে ঢাকা)বক্ষ-সৌন্দর্য প্রকাশের উদ্দেশ্যে যেন তারা (হাটার সময়)  \n\n \n\n" +
                "সজোরে পা দিয়ে আঘাত না করে। এবং হে স্বীকারকারীগন ! তোমরা সকলে আল্লাহর দিকে প্রত্যাবর্তন কর যেন তোমরা সফলতা লাভ কর।  \n\n \n\n" +
                " ০২৪:০৩২] এবং বিয়ে দাও তোমাদের মধ্যে অবিবাহিতদের(কুমার-কুমারী-বিপত্নক-বিধবাদের) এবং তোমাদের দাস এবং দাসীদের মধ্যে যারা ভাল। যদি তারা অভাবগ্রস্ত হয়, তাহলে আল্লাহ্ নিজ অনুগ্রহে তাদেরকে সচ্ছল করবেন। বস্তুতঃ আল্লাহ্ উদারহৃদয়, সর্বজ্ঞানী।  \n\n \n\n" +
                " ০২৪:০৩৩] এবং যাদের বিবাহ করার সামর্থ নেই, তারা যেন চারিত্রিক সততা-শ্লীলতা রক্ষা করে চলে যতক্ষণ পর্যন্ত না আল্লাহ্ তাদেরকে নিজ অনুগ্রহে সামর্থবান করে দেন। এবং তোমাদের বন্ধুদের(ডান হাত যাদের মালিক হয়েছে তাদের) মধ্যে যারা লিখিত-চুক্তি করতে চায়, তোমরা তাদের মধ্যে কোন কল্যাণ দেখলে তাদের সাথে লিখিত-চুক্তি কর, এবং আল্লাহর সে ধনসম্পদ থেকে, যা তিনি তোমাদেরকে দান করেছেন, তোমরা তাদেরকে দান কর। এবং তোমরা ইহকালীন অস্থায়ী ধণসম্পদ লাভের জন্য তোমাদের দাসীদেরকে দিয়ে দেহব্যাবসা করতে বাধ্য করবে না যেহেতু তারা সতীত্ব রক্ষা করে চলতে চায়। এবং যে কেউ তাদেরকে বাধ্য করবে সেক্ষেত্রে তারা বাধ্য হলে (তাদের জন্য) আল্লাহ্ অতীব সংশোধনশীল,  \n\n \n\n" +
                "পরম দয়াময়।  \n\n \n\n" +
                " ০২৪:০৩৪] এবং অবশ্যই আমরা তোমাদের প্রতি সুস্পষ্ট-প্রামান্য আয়াত (নির্দশন) অবতীর্ণ করেছি এবং তোমাদের আগেও যারা গত হয়েছে তাদের উপমা এবং সচেতনদের জন্য বিজ্ঞ-বক্তৃতা-উপদেশও (বর্ণনা করেছি)।  \n\n \n\n" +
                " ০২৪:০৩৫] আল্লাহ্ বায়ুমণ্ডলগুলোর এবং পৃথিবীগুলোর উৎপাদক-শক্তি (নূর বা শিক্ষার আলো)। তাঁর নূরের উপমা হল একটি ধারক সদৃশ, যার মধ্যে একটি প্রদিপ আছে, সেই প্রদিপটি একটি গোলাকার কাঁচের চিমনির মধ্যে আছে, সে কাঁচের চিমনিটি এমনই দীপ্তিমান, যেন সেটি একটি উজ্জল তারকা। সেটি(প্রদিপটি) এমন এক জলাভূমির জলপাই-রংএর বাঁশ বৃক্ষ(এর আঁশ) দিয়ে প্রজ্বলিত হয়, যা পূর্বেরও নয় পশ্চিমেরও নয় (জাপানের) সেটির জ্বলানী(বিদ্যূৎ) এমন যেন এক্ষণই তা (নিজে নিজেই) জ্বলে উঠবে যদিও আগুন সেটিকে স্পর্শ করে নাই। শিক্ষাই আলো(নূর) ! আল্লাহ্ যাকে চান শিক্ষার আলোর দিকে সুপথে পরিচালিত করেন। এবং আল্লাহ মানবমন্ডলীর জন্য বিভিন্ন উপমা বর্ণনা করেন; যেহেতু আল্লাহ্ সর্ববিষয়ে সর্বজ্ঞানী।  \n\n \n\n" +
                " ০২৪:০৩৬] (এ নূর) এমন বিদ্যালয়-গৃহগুলোতে আছে যাদেরকে উন্নীত করার এবং তাদের মধ্যে তাঁর বিজ্ঞান চর্চা-অনুশীলন করার জন্য আল্লাহ্ অনুমতি দিয়েছেন। সূর্যোদয়পূর্ব সময়(ফজর) থেকে সূর্যাস্ত পরবর্তি সময়ে(ইশা) পর্যন্ত সেগুলোর মধ্যে তাঁর প্রদত্ত নিয়মে দায়িত্ব পালন করা হয়--  \n\n \n\n" +
                " ০২৪:০৩৭] তারা এমন লোক, যাদেরকে কেউ ব্যবসা-বাণিজ্য ও ক্রয়-বিক্রয়ে আল্লাহর স্মরণ থেকে এবং সালাত স্থাপন ও (গরিবদের এককভাবে অন্ন ও বস্ত্র দান এবং দারিদ্রদূরিকরণে সম্মিলিত দানের মাধ্যমে) শুদ্ধতা অর্জন থেকে অমনযোগী করতে পারে না। তারা সেদিনকে ভয় করে যেদিন *মন-মগজ এবং দৃষ্টিকে বদলে* দেয়া হবে;  \n\n \n\n" +
                " ০২৪:০৩৮] যেন আল্লাহ তাদেরকে তাদের কৃতকর্মের সর্বোত্তম প্রতিদান দেন এবং বিজ্ঞান-প্রযূক্তিতে তাদেরকে আরও উন্নতি দেন। এবং আল্লাহ্ যাকে চান বেহিসাব জীবিকা দান করেন।  \n\n \n\n" +
                " ০২৪:০৩৯] এবং যারা অস্বীকার করেছে তাদের কৃত-কর্মগুলো বিশাল মরুভুমির মরীচিকার মত, যাকে তৃষ্ণার্ত ব্যক্তি পানি মনে করে। এমনকি সে যখন সেটির কাছে পৌঁছে তখন সে দেখে, সেটি কিছুই নয়। এবং আল্লাহকে নিজের কাছে দেখতে পায়(মৃত্যু হয়), তখন আল্লাহ্ তাকে তার হিসাব পূর্ণ মাত্রায় চুকিয়ে দেন, বস্তুতঃ আল্লাহ দ্রুততম সময়ে তাৎক্ষণিক হিসাব(কর্ম যাচাই) করেন ।  \n\n \n\n" +
                " ০২৪:০৪০] অথবা গভীর সমুদ্রে বিরাজমান এমন অন্ধকাররাশির মত যেটিকে তরঙ্গের উপর তরঙ্গে আচ্ছন্ন করে রেখেছে যার উপর  \n\n \n\n" +
                "নিকষকালো(nimbus) মেঘমালা রয়েছে, এ কালোমেঘ স্তরে স্তরে(stratified) পূঞ্জীভূত(cumulus)। যখন কেউ তার হাত বের করে তখন সে তা আদৌ দেখতে পায় না, আল্লাহ্ যার জন্য নূর (শিক্ষার আলো) নির্ধারিত করেন নাই তার জন্য কোনই নূর (শিক্ষার আলো) নেই।  \n\n \n\n" +
                " ০২৪:০৪১] আপনি কি দেখছেন না, তারা আল্লাহরই নিয়মে দায়িত্ব পালন করছে যারা বায়ুমণ্ডল গুলোতে এবং পৃথিবীগুলোতে আছে, এবং পাখিরাও ডানা বিস্তৃত অবস্থায়? তাদের প্রত্যেকেই নিজ নিজ *সালাত* ও নিজ নিজ কর্তব্য-কাজ(ডিউটি) জানে। এবং তারা যা কিছু করছে আল্লাহ তা খুব ভালভাবে অবগত আছেন।  \n\n \n\n" +
                " ০২৪:০৪২] এবং বায়ুমণ্ডলগুলোর এবং পৃথিবীগুলোর মালিকানা একমাত্র আল্লাহরই, এবং আল্লাহরই দিকে সকলকে ফিরে যেতে হবে।  \n\n \n\n" +
                " ০২৪:০৪৩] আপনি কি দেখেন নাই, আল্লাহ মেঘমালাকে ধীরে ধীরে পরিচালিত করেন, অতঃপর সেগুলোকে যূক্ত করতে থাকেন এবং স্তরে স্তরে পূঞ্জীভূত (cumulo-nimbus cloud) করেন অতঃপর আপনি সেটির মধ্য থেকে বৃষ্টি ধারা ঝরতে দেখেন? এবং এ বৃষ্টি ধারা তিনি আকাশ থেকে-পাহাড় সমান মেঘ (cumulo-nimbus cloud=৩৫০০০ফুট পর্যন্ত উঁচু) থেকে বর্ষণ করেন, যার মধ্যে এক প্রকার শিলা থাকে, অতঃপর তিনি যাকে চান সেগুলো দিয়ে আঘাত করেন এবং যার উপর থেকে চান তিনি তা সরিয়ে দেন। সেটির বিদ্যুৎ-ঝলক যেন দৃষ্টিগুলোকে অপসারণ করার উপক্রম করে।  \n\n \n\n" +
                " ০২৪:০৪৪] আল্লাহ্ রাত ও দিনের আবর্তন ঘটান। নিশ্চই এর মধ্যে *চক্ষুষ্মান (গবেষক) লোকদের* জন্য অবশ্যই শিক্ষনীয় বিষয় আছে।  \n\n \n\n" +
                " ০২৪:০৪৫] আল্লাহ সকল প্রানীকে পানি থেকে সৃষ্টি করেছেন। সেগুলোর মধ্যে কতক এমন আছে যারা পেটের উপর ভর দিয়ে চলে এবং তাদের কতক এমন আছে যারা দুই পায়ের উপর ভর দিয়া চলে এবং তাদের কতক এমনও আছে যারা চারপায়ের উপর ভর দিয়ে চলে। আল্লাহ্ যা চান সৃষ্টি করেন। নিশ্চই আল্লাহ প্রত্যেক বিষয়ের পরিমিত-পরিমাপ নিরুপনে সক্ষম।  \n\n \n\n" +
                " ০২৪:০৪৬] অবশ্যই আমরা সমুজ্জল-প্রামান্য আয়াত(নিদর্শন)গুলো অবতীর্ণ করেছি। এবং আল্লাহ্ যাকে চান ঊর্ধ্বগামী-সরল পথের দিকে সুপথ দেখাতে থাকেন।  \n\n \n\n" +
                " ০২৪:০৪৭] এবং তারা বলে আমরা আল্লাহর এককসত্বা ও এ রসূল (কুরআন)কে জীবন-বিধান হিসেবে মেনে নিয়েছি এবং আনুগত্য করছি। কিন্তু এর পর তাদের মধ্য থেকে একদল মূখ ফিরিয়ে নেয়। বস্তুতঃ তারা (কখনও) স্বীকারকারী নয়।  \n\n \n\n" +
                " ০২৪:০৪৮] এবং যখন তাদেরকে আল্লাহ্ ও তাঁর রসূল(কুরআন)এর দিকে এজন্য আহবান করা হয় যেন সেটি(কুরআন) তাদের মধ্যে বিজ্ঞান-ভিত্তিক মীমাংসা করে দেয়, তখন দেখুন ! সহসা তাদের মধ্য থেকে একদল মূখ ফিরিয়ে নেয়।  \n\n \n\n" +
                " ০২৪:০৪৯] এবং যদি এ বিজ্ঞান-ভিত্তিক মীমাংসা তাদের পক্ষে যায়, তাহলে তারা অনুবর্তী হয়ে তার (কুরআন)এর কাছে ছুটে আসে।  \n\n \n\n" +
                " ০২৪:০৫০] তাদের মন-মগজ কি জীবানু সংক্রমিত? অথবা তারা সন্দেহ করছে? অথবা তারা ভয় করছে আল্লাহ তাদের উপর অবিচার করবেন ? না, বরং তারাই অন্যায়কারী।  \n\n \n\n" +
                " ০২৪:০৫১] নিশ্চই স্বীকারকারীদের উক্তি এটিই হয়, যখন তাদের মধ্যে বিজ্ঞান-ভিত্তিক মীমাংসা করে দেয়ার জন্য তাদেরকে আল্লাহ ও তাঁর রসূল(কুরআন)এর দিকে আহবান করা হয়, তখন তারা বলে, আমরা শুনলাম এবং আনুগত্য করলাম। বস্তুতঃ এরাই হবে সফল।  \n\n \n\n" +
                " ০২৪:০৫২] এবং যারা আল্লাহ ও তাঁর রসূল(কুরআন)এর আনুগত্য করে এবং আল্লাহকে ভয় করে এবং তাঁর সচেতনতা অবলম্বন করে, তারাই হবে বিজয়ী।  \n\n \n\n" +
                " ০২৪:০৫৩] এবং তারা আল্লাহর শক্ত শপথ করে যে, যদি আপনি তাদেরকে আদেশ করেন তাহলে তারা অবশ্যই বের হবে। আপনি বলুন, তোমরা শপথ কোরও না তোমাদের কেবল যথোচিত অনুগত হতে হবে। তোমরা যা কিছু কর সে সমন্ধে নিশ্চই আল্লাহ্ খবর রাখেন।  \n\n \n\n" +
                " ০২৪:০৫৪] আপনি বলুন, তোমরা আল্লাহর আনুগত্য কর এবং এ রসূল (কুরআন)এর আনুগত্য কর। অতঃপর যদি তোমরা মূখ ফিরিয়ে নাও তাহলে এ রসূলের (কুরআনের) উপর কেবল ততটুকুই দায়িত্ব যা তাকে অর্পণ করা হয়েছে এবং তোমাদের উপর কেবল ততটুকুই দায়িত্ব যা তোমাদেরকে অর্পণ করা হয়েছে। যদি তোমরা তার(কুরআনর) আনুগত্য কর তাহলে তোমরা সুপথপ্রাপ্তির নির্দেশনা পাবে। এবং এ রসূলের (কুরআনের) দায়িত্ব কেবল সুস্পষ্টভাবে (বিধান-বানী) পৌঁছে দেয়া।  \n\n \n\n" +
                " ০২৪:০৫৫] তোমাদের মধ্য থেকে যারা আল্লাহর এককসত্বা মেনে নেয় এবং ভালকাজ করে আল্লাহ তাদেরকে প্রতিশ্রুতি দিয়েছেন, তিনি অবশ্যই তাদেরকে পৃথিবীতে খলীফা নিযুক্ত করবেন যেভাবে তিনি তাদের পূর্ববর্তীদের খলীফা নিযুক্ত করেছিলেন, এবং অবশ্যই তিনি তাদের জন্য তাদের জীবন-বিধানকে সুদৃঢ় ভাবে প্রতিষ্ঠিত করে দিবেন যেটিকে তিনি তাদের জন্য মনোনীত করেছেন, এবং তাদের ভয় ভীতির অবস্থার পর সেটিকে তিনি তাদের জন্য নিরাপত্তায় পরিবর্তন করে দিবেন। তারা আমার সেবাকাজ (ইবাদত) করবে, আমার সাথে কোন কিছুকেই পৃথকসত্বা কল্পনা করবে না। এবং এর পর যারা অস্বীকার করবে, তারাই হবে দুষ্কৃতকারী।  \n\n \n\n" +
                " ০২৪:০৫৬] এবং তোমরা সালাত স্থাপন কর এবং শুদ্ধতা অর্জন কর এবং এ রসূলের (কুরআনের) আনুগত্য কর যেন তোমাদের উপর রহমত বর্ষণ করা হয়।  \n\n \n\n" +
                " ০২৪:০৫৭] আপনি কখনও ধারণা করবেন না, যারা অস্বীকার করেছে তারা পৃথিবীতে আমাদেরকে (পরিকল্পনায়) অক্ষম করতে পারবে। তাদের আশ্রয় হবে অনুতাপের আগুনে এবং তা অত্যন্ত মন্দ পরিণামস্থল।  \n\n \n\n" +
                " ০২৪:০৫৮] হে যারা আল্লাহকে এককসত্বা মেনে নিয়েছ ! তোমাদের বন্ধুরা (তোমাদের ডান হাত যাদের অধিকারী হয়েছে) এবং তোমাদের মধ্যে যারা প্রাপ্ত বয়সের কাছাকাছি তারা যেন তিন সময়ে তোমাদের অনুমতি গ্রহণ করে (তোমাদের শয়নকক্ষে প্রবেশের জন্য) – ফজরের সালাতের পূর্বে এবং দুপুরে যখন তোমরা তোমাদের পোশাক খুলে রাখ এবং ইশার সালাতের পর। এ তিন সময় তোমাদের পর্দার সময়, এ তিন সময় ছাড়া (ভিতরে যাতায়াতে) তোমাদের জন্য এবং তাদের জন্যও কোন দোষ হবে না , (কারণ) তোমরা পরস্পর একে অপরের কাছে প্রায়ই যাতায়াত করে থাক, এভাবে আল্লাহ তোমাদের জন্য আয়াতগুলো সুস্পষ্ট-প্রামান্য তথ্যের ভিত্তিতে বর্ণনা করে থাকেন। যেহেতু আল্লাহ্ সর্বজ্ঞানী, মহা বিজ্ঞানী।  \n\n \n\n" +
                " ০২৪:০৫৯] এবং যখন তোমাদের ছেলে-মেয়েরা সাবালক হয় তখন তারাও যেন সেভাবে অনুমতি নেয় যেভাবে তাদের পূর্ববর্তীরা অনুমতি নেয়। এভাবে আল্লাহ তোমাদের জন্য আয়াতগুলো সুস্পষ্ট-প্রামান্য তথ্যের ভিত্তিতে বর্ণনা করে থাকেন। যেহেতু আল্লাহ্ সর্বজ্ঞানী, মহা বিজ্ঞানী।  \n\n \n\n" +
                " ০২৪:০৬০] এবং রজঃনিবৃত্ত(postmenopausal) নারীদের মধ্যে যারা বিয়ের ইচ্ছে রাখেনা তাদের উপর কোন দোষ হবে না যদি তারা (ব্রা পরা অবস্থায়)বক্ষ-সৌন্দর্য প্রদর্শন না করে নিজেদের গায়ের কাপড় খুলে রাখে। অবশ্য সংযত থাকাই তাদের জন্য উত্তম, যেহেতু আল্লাহ্ সর্বশ্রোতা, সর্বজ্ঞানী।  \n\n \n\n" +
                " ০২৪:০৬৩] তোমরা রাসূল(নবীজী)এর আহবানকে তোমাদের মধ্যে তোমাদের একে অপর কে আহবান করার মত মনে কোরও না। নিশ্চই আল্লাহ্ সেসব লোককে জানেন যারা তোমাদের মধ্য থেকে পাশ কাটিয়ে (পরামর্শ সভা থেকে) সরে পড়ে। সুতরাং যারা তাঁর আদেশের বিরোধিতা করে তারা যেন সাবধান হয় পাছে আল্লাহর তরফ থেকে কোন বিভ্রান্তি তাদেরকে স্পর্শ করে অথবা কোন যন্ত্রণাদায়ক দুঃখ-কষ্ট তাদেরকে স্পর্শ করে।  \n\n \n\n" +
                " ০২৪:০৬৪] নিঃসন্দেহে যা কিছু বায়ুমণ্ডলগুলোতে ও পৃথিবীগুলোতে আছে সকলই নিশ্চই আল্লাহর। যার (যে অবস্থার) উপর তোমরা আছ তা-ও আল্লাহ্ জানেন। এবং যেদিন তাদেরকে তাঁর দিকে ফিরিয়ে নিয়ে যাওয়া হবে, সেদিন তিনি তাদেরকে সে সমন্ধে পূর্ণরুপে অবহিত করবেন যা তারা করত। যেহেতু আল্লাহ সকল বিষয়ে সর্বজ্ঞানী।  \n\n \n\n");
        editor.putString("22", "  পরিচ্ছেদ ০২২.দৃশ্যঃ বিশ্ব-সম্মেলন(সূরা আল হাজ্জ (The Universal Conference)  \n\n \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ৭৯ আয়াত এবং ১০ রুকূ আছে।  \n\n \n\n" +
                " ০২২:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০২২:০০১] হে মানবমন্ডলী! তোমরা তোমাদের ক্রমবিকাশকের সচেতনতা অবলম্বন কর। নিশ্চই স্থির-সময়ে পরিবর্তনের বিষয় অতীব গুরুতর-  \n\n \n\n" +
                " ০২২:০০২] যেদিন তোমরা তা দেখবে সেদিন প্রত্যেক স্তন্যদাত্রী-মা বিস্ময়াভিভূত হয়ে যাবে এবং প্রত্যেক গর্ভবতী-মা সন্তান জন্ম দিবে এবং আপনি মানুষদেরকে মত্ত দেখবেন, অথচ তারা মাতাল হবে না, বস্তুতঃ আল্লাহর দেয়া দুঃখ-কষ্ট হবে অতীব কঠোর।  \n\n \n\n" +
                " ০২২:০০৩] এবং লোকদের মধ্যে কতক এমন আছে যারা আল্লাহর সমন্ধে প্রয়োজনীয় শিক্ষা ছাড়াই বিতর্ক করে এবং তারা প্রত্যেকে নিজ-স্বাধীন-ইচ্ছা(শয়তান)এর অনুসরণ করে।  \n\n \n\n" +
                " ০২২:০০৪] যার সমন্ধে এ সিদ্ধান্ত নেয়া হয়েছে, যে ব্যক্তিই তার সাথে বন্ধুত্ব স্থাপন করবে, সে তাকে অবশ্যই বিপথগামী করবে এবং উন্মত্ত দুঃখ-কষ্টের দিকে নিয়ে যাবে।  \n\n \n\n" +
                " ০২২:০০৫] হে মানব মন্ডলী! যদি পূনরুত্থান সমন্ধে সন্দেহের মধ্যে থাক তাহলে (চিন্তা কর) আমরা তোমাদেরকে মাতৃ ফেলোপিয়ানটিউবের ফাঁদ-প্রান্ত থেকে সৃষ্টি শুরু করেছি, অতঃপর অতিআনুবিক্ষণিক জননক্ষম কোষ(zygot) থেকে, অতঃপর (morula, blustulaশেষে) আলাক(ঝুলন্ত blustocyst) থেকে, অতঃপর ভ্রূণ(embryo) এবং অমরা-ফুল(plasenta) থেকে, যেন আমরা তোমাদের কাছে সবিস্তারে বর্ণনা করে দেই। এবং যাকে আমরা চাই নিদিষ্ট সময় পর্যন্ত জরায়ুতে রাখি, অতঃপর আমরা তোমাদেরকে শিশুর আকারে বের করি অতঃপর (ক্রমান্বয়ে পরিবর্ধিত করে) তোমাদের বলিষ্ঠ বয়সে উপনীত করি। এবং তোমাদের মধ্য থেকে কেউ কেউ মরে যাও এবং তোমাদের কেউ কেউ জরাজীর্ণ বার্ধক্যে উপনীত হও, ফলে আগে জ্ঞান-বুদ্ধি থাকলেও তখন জ্ঞান-বুদ্ধি সম্পুর্ণ লোপ পায়। এবং আপনি (নতুন)পৃথিবীগুলোকে নিষ্প্রান দেখতে পাবেন, অতঃপর যখন আমরা সেটির উপর পানি অবতীর্ণ করবো তখন তা সতেজ হয়ে উঠবে এবং বর্ধিত হতে থাকবে এবং সর্বপ্রকার সুশোভিত উদ্ভিদ উৎপন্ন করতে আরম্ভ করবে।  \n\n \n\n" +
                " ০২২:০০৬] এটি এজন্য যে, আল্লাহ এককসত্বা, যিনি বিজ্ঞানমূলক, এবং তিনিই মৃতকে জীবিত করেন এবং তিনিই সকল বিষয়ের পরিমিত-পরিমাপ নিরুপনে সক্ষম।  \n\n \n\n" +
                " ০২২:০০৭] এবং স্থিরসময় অবশ্যই আসবে, এতে কোন সন্দেহ নেই, এবং আল্লাহ নিশ্চই তাদেরকে পুনরুত্থিত করবেন যাদের ভ্রূণ কবরে(বিভিন্ন পৃথিবীর ভ্রণ-ব্যাংকে) আছে।  \n\n \n\n" +
                " ০২২:০০৮]এবং মানুষের মধ্যে কেউ কেউ শিক্ষার্জন ছাড়া,সুপথপ্রাপ্তির নির্দেশনা ছাড়া এবং কোনও সমুজ্জুল গ্রন্থ ছাড়াই আল্লাহর সমন্ধে তর্ক করে।  \n\n \n\n" +
                " ০২২:০০৯] সে(পীর-হুজুর-নেতা) সহানুভূতিতে নিজেকে ঝুঁকিয়ে রাখে যেন সে আল্লাহর পথ থেকে (মানুষকে) বিপথগামী করতে পারে। তার জন্য দুনিয়াতেও লাঞ্ছনা নির্ধারিত আছে এবং পুনরুত্থান দিবসেও আমরা তাকে তেজস্ক্রিয়-রশ্নির কষ্টের স্বাদ গ্রহণ করাব।  \n\n \n\n" +
                " ০২২:০১০] এটি সে কারনে যা তোমাদের হাত আগে প্রেরণ করেছে, আসলে আল্লাহ্ তাঁর বান্দাদের উপর আদৌ অন্যায় করেন না।  \n\n \n\n" +
                " ০২২:০১১] এবং মানুষের মধ্যে কেউ কেউ আল্লাহর ইবাদত করে দোটানায়(কিনারায় দাঁড়িয়ে)। অতএব, যদি তার কোন মঙ্গল হয় তাহলে সে সন্তুষ্ট হয়, কিন্তু যদি সে কোন পরীক্ষার সম্মুক্ষীন হয় তাহলে সে মুখ ঘুরিয়ে ফিরে যায়। তারা ইহকালেও ক্ষতিগ্রস্ত হয়েছে এবং পরকালেও। বস্তুতঃ এটিই সুস্পষ্ট ক্ষতি।  \n\n \n\n" +
                " ০২২:০১২] সে আল্লাহকে ছেড়ে এমন কাউকে(পীর-পূরোহিত-যাযক-হুজুর) ডাকে যে, তার কোন অপকারও করতে পারে না এবং কোন উপকারও করতে পারে না। এটিই সুদূরপ্রসারী বিপথগামিতা।  \n\n \n\n" +
                " ০২২:০১৩] সে তাকে ডাকে যার ক্ষতি তার উপকার অপেক্ষা অনেক কাছে। এমন মনিবও কত মন্দ এবং এমন সহচরও কত মন্দ।  \n\n \n\n" +
                " ০২২:০১৪] নিশ্চই আল্লাহ তাদেরকে, যারা আল্লাহর এককসত্বা মেনে নেয় এবং ভালকাজ করে, এমন বাগানগুলোতে প্রবিষ্ট করবেন যাদের তলদেশ দিয়ে নদী প্রবাহিত থাকবে, নিশ্চই আল্লাহ তা-ই করেন যা তিনি ইচ্ছা(পরিকল্পনা) করেন।  \n\n \n\n" +
                " ০২২:০১৫] যে ব্যক্তি এমন ধারণা করে যে আল্লাহ তাকে ইহকালে ও পরকালে কখনও সাহায্য করবে না, তার কর্তব্য সে যেন একটি রকেটে করে আকাশে যায় অতঃপর সেটি থেকে নিজেকে আলাদা করে(লাফ দিয়ে পড়ে) এবং দেখে যে তার কৌশল সে কারনটি দূর করে কিনা, যা তাকে ক্ষেপিয়েছে।  \n\n \n\n" +
                " ০২২:০১৬] এবং এভাবে আমরা কুরআনকে সুস্পস্ট-প্রামান্য আয়াত(নির্দেশাবলী) হিসেবে অবতীর্ণ করেছি, এবং নিশ্চই আল্লাহ যাকে চান সুপথপ্রাপ্তির নির্দেশনা দেন।  \n\n \n\n" +
                " ০২২:০১৭] নিশ্চই যারা আল্লাহর এককসত্বা মেনে নিয়েছে এবং যারা ইহুদী হয়েছে এবং যারা সাবী এবং খৃষ্টান এবং মজুসী এবং যারা আল্লাহর বদলে পৃথকসত্বা কল্পনা করেছে, আল্লাহ নিশ্চই পুনরুত্থান দিবসে তাদের মধ্যে মিমাংশা করবেন। নিশ্চই আল্লাহ প্রত্যেক বিষয়ের উপর প্রত্যক্ষদর্শী।  \n\n \n\n" +
                " ০২২:০১৮] আপনি কি লক্ষ্য করেন নাই, আল্লাহ এককসত্বা, যার জন্য সেজদা করছে যারা বায়ুমণ্ডলগুলোতে আছে এবং যারা পৃথিবীগুলোতে আছে এবং সূর্য, চন্দ্র, নক্ষত্ররাজি, পর্বতমালা, বৃক্ষপুঞ্জ, জীবজন্তু, এবং অনেক মানুষ ? কিন্তু অনেক মানুষের উপর বিজ্ঞানের ভিত্তিতে নেমে এসেছে দুঃখ-কষ্ট। এবং আল্লাহ যাকে অপমানিত করেন তার সম্মানদাতা কেউই নেই। নিশ্চই আল্লাহ তা-ই করেন যা তিনি ইচ্ছা(পরিকল্পনা) করেন।  \n\n \n\n" +
                " ০২২:০১৯] এ দুটি প্রতিদ্বন্দ্বী দল এমন যারা নিজেদের ক্রমবিকাশক সমন্ধে বিবাদ করছে। অতএব যারা অস্বীকার করবে তাদের জন্য কাটা হবে আগুনের পোশাক, এবং তাদের মাথার উপর লাভা ঢেলে দেয়া হবে।  \n\n \n\n" +
                " ০২২:০২০] তা দিয়ে তাদের পেটে যাহা কিছু আছে তা এবং তাদের চামড়াও গলিয়ে দেয়া হবে।  \n\n \n\n" +
                " ০২২:০২১] এবং তাদের আরও থাকবে লোহার রিপ্রেসর(জিন মেরামতের যন্ত্র)।  \n\n \n\n" +
                " ০২২:০২২] সবসময়ই তারা মর্মবেদনার জন্য তা থেকে বের হতে চাইবে, তাদেরকে সেখানে ফিরিয়ে দেয়া হবে এবং বলা হবে, তোমরা তেজস্ক্রিয়-রশ্নির দুঃখ-কষ্টের স্বাদ গ্রহণ কর।  \n\n \n\n" +
                " ০২২:০২৩] যারা আল্লাহর এককসত্বা মেনে নেয় এবং ভালকাজ করে, নিশ্চই আল্লাহ তাদেরকে এমন বাগানগুলোতে প্রবিষ্ট করবেন যেগুলোর তলদেশ দিয়ে অব্যাহত পানির সরবরাহ থাকবে। সেখানে তাদেরকে অলংকৃত করা হবে স্বর্ণের কঙ্কন দিয়ে এবং মনি-মুক্তা দিয়ে এবং সেখানে তাদের পোশাক পরিচ্ছদ হবে রেশমের।  \n\n \n\n" +
                " ০২২:০২৪] এবং তাদেরকে শুভ-মঙ্গলকর-যূক্তিসিদ্ধ কথার দিকে পথপ্রদর্শন করা হবে এবং তাদেরকে প্রশংসানীয় পথের দিকে পরিচালিত করা হবে।  \n\n \n\n" +
                " ০২২:০২৫] নিশ্চই যারা অস্বীকার করে এবং (মানুষকে) আল্লাহর পথ থেকে এবং মসজিদুল হারাম’(জীবানুসংক্রমনমুক্ত মসজিদ) থেকে নিবৃত্ত রাখে যাকে আমরা (ধর্ম-বর্ণ নির্বিশেষে) সমগ্র মানবজাতির জন্য সমানভাবেকল্যাণের কারণ করেছি- যারা এতে অবস্থান করতে চায় অথবা বেদুইন বা পর্যটকদের জন্য। এবং যারা অসদাচরণের মধ্যদিয়ে ও অন্যায়ের মধ্যদিয়ে এটি পরিচালনা করতে চায়, তাদেরকে আমরা যন্ত্রণাদায়ক দুঃখ-কষ্টের স্বাদ গ্রহণ করাব।  \n\n \n\n" +
                " ০২২:০২৬] এবং (স্মরণ করুন) যখন আমরা ইবরাহীমের বসবাসের জন্য নির্ধারণ করেছিলাম এ গৃহের স্থানকে (এবং বলেছিলাম), তুমি কোন কিছুকে আমার পৃথকসত্বা কল্পনা কোরও না এবং আমার গৃহকে জীবানু-সংক্রমন মুক্ত রাখ, প্রদক্ষিণকারীদের জন্য, এবং দন্ডয়মানকারীদের জন্য, এবং বিনয়ের সাথে সেজদাকারীদের জন্য।  \n\n \n\n" +
                " ০২২:০২৭] এবং আপনি মানুষের মধ্যে হজ্জের অনুমোদন দিন, যেন তারা (হজ্জের উদ্দেশ্যে) আপনার কাছে আসে, পায়ে হেটে, এবং হেলান দিয়ে বসা যানবাহন(জাহাজ-বিমান-ট্রেন-গাড়ি)এর উপর চড়ে, দূর-দূরান্তর থেকে পাহাড়-পর্বত পেরিয়ে আসে,  \n\n \n\n" +
                " ০২২:০২৮] যেন তারা তাদের জন্য নির্ধারিত উপকার গুলো প্রত্যক্ষ করে। এবং যেন তারা নিদিষ্ট দিনগুলোতে সেগুলোর উপর আল্লাহর মালিকানা ঘোষণা করে যা তিনি তাদেরকে গৃহপালিত পশু থেকে দান করেছেন(মাংস-দুধ-মাখন-ঘী-পনির-টাকাপয়সা)। সুতরাং তোমরা নিজেরাও তা থেকে খাও এবং দুর্গত ও অভাবগ্রস্ত লোকদেরকেও খাওয়াও।  \n\n \n\n" +
                " ০২২:০২৯] অতঃপর তারা যেন নিজেদের (জীবানুসংক্রমনমুক্ত করতে)অপরিছন্নতা দূর করে এবং নিজেদের প্রতিজ্ঞা(কুরবানী) পূর্ণ করে এবং প্রাচীন-গৃহের তওয়াফ(প্রদক্ষিন) করে।  \n\n \n\n" +
                " ০২২:০৩০] সেসবের এবং আল্লাহর শুদ্ধাচার গুলোর যে সম্মান করবে, তা তার জন্য তার ক্রমবিকাশকের দৃষ্টিতে কল্যাণকর হবে। (হে স্বীকারকারীরা) তোমাদের জন্য, সকল গৃহপালিত পশুই হালাল করা হয়েছে কেবল তা\\' ছাড়া যা তোমাদের জন্য (হারাম বলে) বর্ণিত হয়েছে। অতএব তোমরা দেবদেবী(সন্তুষ্টির জন্য বলী)এর নির্মমতা বর্জন কর এবং বানিয়ে মিথ্যাকথা বলা বর্জন কর,  \n\n \n\n" +
                " ০২২:০৩১] আপনি আল্লাহর জন্য একনিষ্ঠ হোন, কাউকেও তাঁর সাথে পৃথকসত্বা কল্পনা না করে। এবং যে কেউ আল্লাহর সাথে কাউকে পৃথকসত্বা কল্পনা করে সে যেন আকাশ থেকে পড়ে গেল, অনন্তর পাখী তাকে ছোঁ মেরে নিয়ে গেল অথবা বাতাস তাকে উড়িয়ে দূর-দূরান্তে নিক্ষেপ করল,  \n\n \n\n" +
                " ০২২:০৩২] সেসবের এবং আল্লাহর (লাব্বাইক আল্লাহুম্মা লাব্বাইক)স্লোগান গুলোর যে সম্মান করবে, নিশ্চই তার এ কাজকে আন্তরিক সচেতনতা বলে গণ্য করা হবে,  \n\n \n\n" +
                " ০২২:০৩৩] এক নিদিষ্ট সময় পর্যন্ত তোমাদের জন্য এগুলোর(পশুগুলোর) মধ্যে উপকার আছে, অতঃপর প্রাচীন-গৃহের কাছেই সেগুলোর *বেচাকেনার*-স্থান হবে।  \n\n \n\n" +
                " ০২২:০৩৪] এবং আমরা প্রত্যেক জাতির জন্য কুরবানীর নিয়ম প্রবর্তন করে দিয়েছি যেন তারা আল্লাহর মালিকানা সেগুলোর উপর স্মরণ করে যে জীবিকা তিনি গৃহপালিত পশু থেকে তাদেরকে দান করেছেন(মাংস-দুধ-মাখন-ঘী-পনির-টাকাপয়সা)। তোমাদের উদ্ভাবনীশক্তি একই উদ্ভাবনীশক্তি, সুতরাং তোমরা কেবল তাঁরই জন্য সমর্পিত হও এবং অভূক্ত-মৃতপ্রায় লোকদেরকে সুসংবাদ দাও।  \n\n \n\n" +
                " ০২২:০৩৫] যারা, যখন তাদের কাছে আল্লাহর স্মরণ করা হয়, তখন তাদের মন ভয়ে কেঁপে উঠে, এবং যারা তাদের উপর আঘাৎ আসলে ধৈর্য ধারণ করে এবং তারা সালাত স্থাপন করে এবং তাদেরকে আমরা যা কিছু জীবিকা দান করেছি তা-থেকে খরচ করে।  \n\n \n\n" +
                " ০২২:০৩৬] আর উট গুলোকে, আমরা তোমাদের জন্য আল্লাহর চিহ্ন করেছি। সেগুলোর মধ্যে তোমাদের জন্য অনেক মঙ্গল নিহিত আছে। অতএব, সেগুলোকে সারিবদ্ধভাবে দাঁড় করিয়ে সেগুলোর উপর আল্লাহর মালিকানা ঘোষণা কর। এবং যখন সেগুলো নিজেদের পার্শ্বে ঢলে পড়ে(বিক্রয় হয়ে  \n\n \n\n" +
                "যাওয়া, মূল্য নির্ধারণ হওয়া), তখন তোমরা সেগুলো থেকে নিজেরাও আহার কর এবং আহার করাও অল্পেতুষ্ট-ধৈর্যশীল অভাবীদেরকে এবং দারিদ্রে কাতর লোক দেরকেও। এভাবে আমরা সেগুলোকে তোমাদের সেবায় নিয়োজিত করে দিয়েছি এবং যেন তোমরা কৃতজ্ঞতা প্রকাশ কর।  \n\n \n\n" +
                " ০২২:০৩৭] সেগুলোর মাংস ও সেগুলোর রক্ত কখনও আল্লাহর কাছে পৌছে না(অর্থাৎ আল্লাহ পশুহত্যা চান না), বরং তাঁর কাছে তোমাদের তরফ থেকে সচেতনতা(বুদ্ধি খাটিয়ে সে পশু থেকে প্রাপ্ত টাকা-পয়সা গরিবদের দান করলে সেটাই) পৌঁছে। এভাবে তিনি সেগুলোকে তোমাদের সেবায় নিয়োজিত-বাধ্য করে দিয়েছেন যেন তোমরা আল্লাহর মাহত্ব ঘোষণা কর, যেহেতু তিনি তোমাদেরকে সুপথপ্রাপ্তির নির্দেশনা দান করেছেন। এবং আপনি সৎকর্মশীলদের সুসংবাদ দিন(যে, আল্লাহ পশুহত্যা চান না)।  \n\n \n\n" +
                " ০২২:০৩৮] যারা আল্লাহর এককসত্বা মেনে নিয়েছে, নিশ্চই আল্লাহ্ তাদের পক্ষ থেকে (শত্রুকে) প্রতিহত করেন। নিশ্চই আল্লাহ ভালবাসেন না বিশ্বাসঘাতী-অস্বীকারকারীকে।  \n\n \n\n" +
                " ০২২:০৩৯] অনুমতি দেয়া হল তাদেরকে(আত্বরক্ষার্থে যুদ্ধ করার), যাদের বিরুদ্ধে যুদ্ধ করা হচ্ছে , কারণ তাদের উপর অন্যায় করা হচ্ছে, এবং নিশ্চই আল্লাহই তাদেরকে পরিমিত পরিমাপে সাহায্য করতে পূর্ণ ক্ষমতাবান-  \n\n \n\n" +
                " ০২২:০৪০] যাদেরকে তাদের ঘরবাড়ি থেকে অযৌক্তিকভাবে শুধু এ কারনে বহিষ্কার করা হয়েছে যে তারা বলে, আল্লাহ আমাদের ক্রমবিকাশক। আল্লাহ যদি এসব মানুষের একদলকে অন্যদল দিয়ে (সৎ-যূক্তিতে) প্রতিহত না করতেন, তাহলে সাধুদের-আশ্রম, সন্ন্যাসীদের-গির্জা, ইহুদীদের-সিনেগগ এবং মুসলিমদের-মসজিদ ইত্যাদি যা'তে আল্লাহর মালিকানা বেশি পরিমানে স্মরণ করা হয়, অবশ্যই ধ্বংস করে দেয়া হত। এবং নিশ্চই আল্লাহ তাদেরকে সাহায্য করেন যারা তাঁকে সাহায্য করে। নিশ্চই আল্লাহ্ সক্রিয় শক্তিসম্পন্ন, ভালবাসাকনিকার মহাসমূদ্র।  \n\n \n\n" +
                " ০২২:০৪১] এরা এমন লোক যে, যদি আমরা তাদেরকে পৃথিবীতে ক্ষমতায় বসাই, তাহলে তারা সালাত স্থাপন করবে, (গরিবদেরকে অন্ন ও বস্ত্র এককভাবে দান এবং দারিদ্র দূরিকরণে সম্মিলিতভাবে অর্থদানের মধ্যমে)শুদ্ধতা অর্জন করবে, এবং ভালকাজের আদেশ করবে, এবং মন্দকাজ থেকে নিষেধ করবে। আসলে সকল বিষয়ের পরিণাম আল্লাহর এখতিয়ারে।  \n\n \n\n" +
                " ০২২:০৪২] এবং যদি তারা আপনাকে মিথ্যা প্রতিপন্ন করে, তাহলে (এটি নতুন নয়) তাদের পূর্বেও (নবীদেরকে) মিথ্যা প্রতিপন্ন করেছিল নূহের জাতি এবং আদ এবং সামুদ-  \n\n \n\n" +
                " ০২২:০৪৩] এবং ইবরাহীমের জাতি এবং লুতের জাতি,  \n\n \n\n" +
                " ০২২:০৪৪] এবং মিদিয়ানবাসীরা। এবং মুসাকে মিথ্যা প্রতিপন্ন করা হয়েছিল। তখন আমি অস্বীকারকারীদেরকে কিছু অবকাশ দিয়েছিলাম, অতঃপর আমি তাদেরকে ধ্বংস করেছিলাম, অতএব (চিন্তা করে দেখুন) আমাকে অস্বীকার করার (পরিণাম) কত ভয়াবহ ছিল।  \n\n \n\n" +
                " ০২২:০৪৫] এবং কত শহর-নগর-জনপদ ছিল যেগুলোকে আমরা এমন অবস্থায় ধ্বংস করেছি যখন তারা অন্যায়ে লিপ্ত ছিল, ফলে ওগুলো শুধু নিজ ছাদের উপরে পড়ে রয়েছে, এবং কত পরিত্যক্ত কূপ এবং সুউচ্চ প্রাসাদ পড়ে আছে !  \n\n \n\n" +
                " ০২২:০৪৬] তারা কি পৃথিবীতে ভ্রমন করে দেখে নাই, যাতে তারা এমন মন লাভ করে যেগুলো দিয়ে তারা এসব উপলব্দি করতে পারে অথবা এমন কান লাভ করে, যেগুলো দিয়ে তারা এসব শুনতে পারে? আসল কথা হচ্ছে, বাহ্যিক চক্ষু অন্ধ হয় না, কিন্তু অন্ধ হয় জ্ঞান-চক্ষু যা মগজে(frontal lobe) আছে।  \n\n \n\n" +
                " ০২২:০৪৭] এবং তারা আপনার কাছে শীগ্র (পরকালীন)দুঃখ-কষ্ট চাচ্ছে, অথচ আল্লাহ্ কখনও তাঁর প্রতিশ্রুতি ভংগ করেন না। এবং নিশ্চই আপনার ক্রমবিকাশকের কাছে (স্থির-সময়ের, যার গতি ৬৭,৬৫,৮৭৩.০২ mps) এক দিনের দৈর্ঘ ৩৬৫২৪৯.২৮৬৮০৯৪০৭৪ দিনের বা এক হাজার বৎসরের সমান যা আপনারা গুণে থাকেন।  \n\n \n\n" +
                " ০২২:০৪৮] এবং কত শহর-নগর-জনপদ ছিল যেগুলোকে আমি (প্রথমে) অবকাশ দিয়েছিলাম, অথচ তারা অন্যায়ে ব্যাপৃত ছিল। অতঃপর আমি তাদেরকে ধৃত করেছি, এবং আমারই নিকট হবে প্রত্যাবর্তন।  \n\n \n\n" +
                " ০২২:০৪৯] আপনি বলুন, \"হে মানবমন্ডলী ! আমি তোমাদের জন্য শুধুই একজন সুস্পষ্ট সতর্ককারী।\"  \n\n \n\n" +
                " ০২২:০৫০] সুতরাং যারা আল্লাহর এককসত্বা মেনে নেয়, এবং ভালকাজ করে তাদের জন্য সংশোধন এবং সম্মান জনক জীবিকা (অবধারিত) আছে।  \n\n \n\n" +
                " ০২২:০৫১] কিন্তু যারা আমাদের আয়াত(নিদর্শন) গুলোর ব্যাপারে আমাদেরকে অক্ষম করার প্রচেষ্টা করে-তারা হবে অনুতাপস্থলের অধিবাসী।  \n\n \n\n" +
                " ০২২:০৫২] এবং আমরা আপনার পূর্বে না কোন রসুল এবং না কোন নবী পাঠিয়েছি কিন্তু যখনই সে কোন ইচ্ছা করেছে তখনই শয়তান তাকে নিরুৎসাহিত করেছে। কিন্তু আল্লাহ তা দূরীভূত করে দেন যা শয়তান দাঁড় করায়। অতঃপর তিনি নিজ আয়াত (নিদর্শন) গুলোকে বিজ্ঞানের ভিত্তিতে প্রতিষ্ঠিত করেছেন। যেহেতু আল্লাহ্ সর্বজ্ঞানী, মহা বিজ্ঞানী।  \n\n \n\n" +
                " ০২২:০৫৩] শয়তানের নিরুৎসাহিতাকে তিনি(আল্লাহ) যাদের মনে-মগজে বিকৃতি আছে এবং যারা অত্যুগ্র-বক্রতাপূর্ণ মন বিশিষ্ট, সেসব লোকের জন্য বিভ্রান্তির কারণ করেন, বস্তুতঃ অন্যায়কারীরা কঠোর অনৈক্য-বিচ্ছিন্নতায় লিপ্ত রয়েছে।  \n\n \n\n" +
                " ০২২:০৫৪] এবং বিজ্ঞানীরা যেন জানতে পারে, নিশ্চই এটি(কুরআন) আপনার ক্রমবিকাশকের কাছ থেকে সর্বাঙ্গীন বিজ্ঞান; ফলে তারা যেন এটি(কুরআন)কে মেনে নেয় এবং তাঁর প্রতি তাদের মন নরম হয়। এবং আল্লাহ্ স্বীকারকারীদেরকে সরল-ঊর্ধ্বগামী পথের দিকে নিশ্চই সুপথপ্রাপ্তির নির্দেশনা দিয়ে থাকেন।  \n\n \n\n" +
                " ০২২:০৫৫] এবং অস্বীকারকারীরা এটি(কুরআন) সমন্ধে সেসময় পর্যন্ত সন্দেহে পড়ে থাকবে যতক্ষণ পর্যন্ত না স্থির-সময় তাদের উপর অকস্মাৎ এসে পড়ে, অথবা তাদের কাছে এক মহা-দিবসের দুঃখ-কষ্ট এসে পড়ে।  \n\n \n\n" +
                " ০২২:০৫৬] সেদিন সকল মালিকানা একমাত্র আল্লাহর হবে। তিনি তাদের মধ্যে মিমাংশা করবেন। সুতরাং যারা আল্লাহর এককসত্বা মেনে নিয়েছে এবং ভালকাজ করেছে তারা অনুগ্রহে-পূর্ণ বাগানগুলোতে থাকবে।  \n\n \n\n" +
                " ০২২:০৫৭] এবং যারা অস্বীকার করেছে এবং আমাদের আয়াতগুলোকে মিথ্যা প্রতিপন্ন করেছে, তারাই সেসব লোক যাদের জন্য লাঞ্ছনাজনক দুঃখ-কষ্ট (নির্ধারিত) আছে।  \n\n \n\n" +
                " ০২২:০৫৮] এবং যারা আল্লাহর পথে হিজরত করে, অতঃপর নিহত হয় অথবা স্বাভাবিক ভাবে মারা যায় নিশ্চই আল্লাহ তাদেরকে উত্তম জীবিকা দান করবেন। যেহেতু আল্লাহ সর্বোত্তম জীবিকাদাতা।  \n\n \n\n" +
                " ০২২:০৫৯] তিনি নিশ্চই তাদেরকে এমন স্থানে প্রবেশ করাবেন যা'কে তারা পছন্দ করবে। এবং নিশ্চই আল্লাহ্ সর্বজ্ঞানী, পরম-সহিঞ্চু।  \n\n \n\n" +
                " ০২২:০৬০] সেগুলো এবং যে ব্যক্তি সে পরিমাণ প্রতিশোধ গ্রহণ করে যে পরিমাণ তাকে কষ্ট দেয়া হয়েছে, এতদসত্বেও সে (বিপক্ষ কর্তৃক) নির্যাতিত হলে, নিশ্চই আল্লাহ তাকে সাহায্য করবেন। নিশ্চই আল্লাহ পরম মার্জনাকারী, অতীব সংশোধনশীল।  \n\n \n\n" +
                " ০২২:০৬১] সেগুলো এজন্য যে, নিশ্চই আল্লাহই রাতকে দিনের সাথে সম্পূর্ণ মিশিয়ে দেন (অর্থাৎ রাতের শেষে দিনের শুরু), এবং দিনকে রাতের সাথে সম্পূর্ণ মিশিয়ে দেন(অর্থাৎ দিনের শেষে রাতের শুরু) নিশ্চই আল্লাহ সর্বশ্রোতা, সর্বদ্রষ্টা।  \n\n \n\n" +
                " ০২২:০৬২] এটি এজন্য যে, আল্লাহ বিজ্ঞানমূলক এবং আল্লাহ্ ছাড়া তারা যাকে ডাকে তা আসলে মিথ্যা এবং নিশ্চই আল্লাহই মৌলিক, অত্যন্ত মহীয়ান।  \n\n \n\n" +
                " ০২২:০৬৩] আপনি কি দেখেন নাই, নিশ্চই আল্লাহ্ মহাকাশ থেকে পানি অবতীর্ণ করেন যার ফলে পৃথিবীগুলো সবুজ-শ্যামল হয়ে উঠে? নিশ্চই আল্লাহ পরম সুক্ষাকনা, সর্বজ্ঞাত।  \n\n \n\n" +
                " ০২২:০৬৪] যাকিছু বায়ুমণ্ডলগুলোতে আছে এবং যাকিছু পৃথিবীগুলোতে আছে সবই তাঁর এবং নিশ্চই আল্লাহই প্রাচুর্ষশালী, অতীব ধন্যবাদযোগ্য।  \n\n \n\n" +
                " ০২২:০৬৫] আপনি কি দেখেন নাই, যাকিছু পৃথিবীগুলোতে আছে আল্লাহ্ সেগুলোকে আপনাদের সেবায় নিয়োজিত করেছেন এবং জাহাজ(জলযান-আকাশযান)গুলোকেও, যেগুলি তাঁরই আদেশে (জল ও বায়ু) সমূদ্রে চলছে? এবং তিনি (মধ্যাকর্ষণ দিয়ে) বায়ুমণ্ডলগুলোকে রুখে রাখছেন যেন সেগুলো তাঁর অনুমতি ছাড়া পৃথিবীগুলোতে পড়ে না যায়। নিশ্চই আল্লাহ বান্দাদের প্রতি অত্যন্ত মমতাশীল, এককসত্তা দয়াময়।  \n\n \n\n" +
                " ০২২:০৬৬] এবং তিনিই তোমাদেরকে জীবন দান করেছেন, অতঃপর তোমাদেরকে মৃত্যু দিবেন। আবার তিনি তোমাদেরকে জীবন দান করবেন। নিশ্চই মানবজাতি বড়ই অকৃতজ্ঞ।  \n\n \n\n" +
                " ০২২:০৬৭] আমরা প্রত্যেক উম্মতের(জাতির) জন্য প্রার্থনার(ভালবাসার) নিয়ম-পদ্ধতি নির্ধারিত করেছি তদনুসারে তারা প্রার্থনা(ভালবাসা) করে, সুতরাং তারা যেন আপনাদের সাথে এ বিষয় সমন্ধে কোন বিবাদ না করে। আপনি তাদেরকে আপনার ক্রমবিকাশকের দিকে আহ্বান করুন, নিশ্চই আপনি সরল-ঊর্দ্বগামী সুপথপ্রাপ্তির নির্দেশনার উপর আছেন।  \n\n \n\n" +
                " ০২২:০৬৮] এবং যদি তারা আপনাদের সাথে তর্ক বিতর্ক করে, তাহলে আপনি বলুন, নিশ্চই তোমারা যেসব কাজ করছ আল্লাহ সবই জানেন।  \n\n \n\n" +
                " ০২২:০৬৯] আল্লাহ পুনরুত্থানের দিনে তোমাদের মধ্যে সে বিষয়ের রায় দিবেন যে সমন্ধে তোমরা মতভেদ করছ।  \n\n \n\n" +
                " ০২২:০৭০] আপনি কি জানেন না, যাকিছু বায়ুমণ্ডলগুলো ও পৃথিবীগুলোতে আছে আল্লাহ্ সবই জানেন? নিশ্চই এসব এক গ্রন্থে (সংরক্ষিত) আছে; নিশ্চই এসব আল্লাহর জন্য সহজসাধ্য।  \n\n \n\n" +
                " ০২২:০৭১] এবং তারা আল্লাহর পরিবর্তে এমন কিছুর উপাশনা করে যার জন্য তিনি কোন কর্তৃত্বপূর্ণ আদেশ অবতীর্ণ করেন নাই। এবং যা সমন্ধে তাদের কোন প্রকার জ্ঞান নেই, এবং অন্যায়কারীদের জন্য কোনও সাহায্যকারী নেই।  \n\n \n\n" +
                " ০২২:০৭২] এবং যখন তাদের সামনে আমাদের সুস্পষ্ট-প্রামান্য আয়াত-গুলো আবৃতি করা হয় তখন যারা অস্বীকার করেছে তাদের মুখে স্পষ্ট অসন্তোষের লক্ষন দেখে থাকেন। তারা তাদের উপর আক্রমণ করতে উদ্যত হয়, যারা তাদের কাছে আমাদের আয়াতগুলো আবৃত্তি করে। আপনি বলুন, আমি কি তোমাদেরকে এসব থেকে মন্দ অবস্থার সংবাদ দিব? (শুন ! সেটি) আগুন ! আল্লাহ্ এর ওয়াদা তাদের সাথে করেছেন যারা অস্বীকার করেছে। এবং এটি কতই না মন্দ পরিণামস্থল।  \n\n \n\n" +
                " ০২২:০৭৩] হে মানবমন্ডলী! একটি উপমা বর্ণনা করা হচ্ছে, তোমরা তা মনযোগসহ শুন। নিশ্চই তোমরা আল্লাহকে ছেড়ে যাদেরকে ডাকছ, তারা আদৌ একটি মাছিও সৃষ্টি করতে পারবে না। যদি তারা সকলেই এর জন্য একত্রিত হয়েও যায়। এমনকি মাছি তাদের কাছ থেকে কোন বস্তু ছিনিয়ে নিয়ে গেলে তারা তা'ও সেটি(মাছি)র কাছ থেকে ছাড়িয়ে আনতে পারে না। নিঃসন্দেহে প্রার্থী এবং প্রার্থনার পাত্র উভয়ই দুর্বল।  \n\n \n\n" +
                " ০২২:০৭৪] তারা আল্লাহর বিজ্ঞানের যথোচিত পরিমাপ করতে সক্ষম হয় নাই। নিশ্চই আল্লাহ্ সক্রিয় শক্তিসম্পন্ন, ভালবাসাকনিকার মহাসমূদ্র।  \n\n \n\n" +
                " ০২২:০৭৫] আল্লাহ মনোনীত করে থাকেন রসুলদেরকে ফিরিশতাদের মধ্যে থেকে এবং মানুষের মধ্য থেকেও। নিশ্চই আল্লাহ্ সর্বশ্রোতা, সর্বদ্রষ্টা।  \n\n \n\n" +
                " ০২২:০৭৬] যাকিছু তাদের সামনে আছে এবং যাকিছু তাদের পিছনে আছে, সবই তিনি জানেন এবং সকল বিষয় আল্লাহর দিকে প্রত্যাবর্তিত হয়।  \n\n \n\n" +
                " ০২২:০৭৭] হে যারা আল্লাহর এককসত্বা মেনে নিয়েছ ! তোমরা বিনীত হও এবং সেজদা কর এবং তোমাদের ক্রমবিকাশকের সেবাকাজ(ইবাদত) কর এবং ভালকাজ কর, যেন তোমরা সফল হতে পার।  \n\n \n\n" +
                " ০২২:০৭৮] এবং তোমরা আল্লাহর পথে বিজ্ঞান দিয়ে যথোচিত প্রচেষ্টা কর, তিনিই তোমাদেরকে মনোনীত করেছেন এবং তিনি তোমাদের উপর জীবন-বিধান সম্পর্কে কোন কঠোরতা চাপিয়ে দেন নাই। সুতরাং তোমরা তোমাদের পিতা ইবরাহীমের ধর্মাদর্শ (মহাকাশ গবেষণা) অবলম্বন কর, তিনি তোমাদের নাম মুসলিম(সমর্পিত) রেখেছেন। পূর্বেও এবং এখনও যেন এ রসুল তোমাদের উপর সাক্ষী হয়, এবং তোমরা সমগ্র মানবমন্ডলীর উপর সাক্ষী হও। সুতরাং তোমরা সালাত স্থাপন কর এবং শুদ্ধতা অর্জন কর এবং আল্লাহকে সুদূঢ়ভাবে আঁকড়ে ধর। তিনিই তোমাদের মালিক সুতরাং তিনি বিশুদ্ধতার মালিক এবং বিশুদ্ধ সাহায্যকারী।  \n\n \n\n");
        editor.putString("0",
                "পরিচ্ছেদ ০০১ দৃশ্যঃ প্রারম্ভিক (সুরা আল-ফাতিহা, The Opening)" +
                        " ০০১:০০১] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                        " ০০১:০০২] মহাবিশ্বের ক্রমবিকাশক আল্লাহ'কে ধন্যবাদ  \n\n \n\n" +
                        " ০০১:০০৩] এককসত্তা করুণাময় এককসত্তা দয়াময়  \n\n \n\n" +
                        " ০০১:০০৪] জীবন-বিধান প্রতিষ্ঠার দিনগুলোর মালিক। (জীবন-কালের প্রতিটি সূক্ষ সময়ের কর্মের তাৎক্ষণিক বিচারক, যাচাই-বাছাইকারী)  \n\n \n\n" +
                        " ০০১:০০৫]  আমরা আপনারই (মহাকাশ বিজয়ের) চাকুরীতে নিয়োজিত তাই আপনারই কাছে (মহাকাশ বিজয়ের জন্য) সাহায্য প্রার্থনা করি  \n\n \n\n" +
                        " ০০১:০০৬] আমাদেরকে (মহাকাশ অভিযানের জন্য)ঊর্ধ্বগামী সরল পথে পরিচালিত করুন");


        editor.putString("7", " পরিচ্ছেদ ০০৮.দৃশ্যঃ নির্লিপ্ত-উপহার(সূরা আল-আনফাল The disinterested gift)  \n\n \n\n" +
                "এটি মাদানী সূরা, বিসমিল্লাহ সহ এতে ৭৬ আয়াত এবং ১০ রুকূ আছে।  \n\n \n\n" +
                " ০০৮:০০১ থেকে ০৪০]  \n\n \n\n" +
                " ০০৮:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০০৮:০০১] তারা আপনাকে নির্লিপ্ত-উপহার সম্বন্ধে প্রশ্ন করে, আপনি বলুন, \"নির্লিপ্ত-উপহার আল্লাহ্ এবং তাঁর রসুলের জন্য। সুতরাং তোমরা আল্লাহর সচেতনতা অবলম্বন কর এবং নিজেদের মধ্যে আপোষ-মীমাংশা করে নাও এবং আল্লাহ্ এবং তাঁর রসুল(কুরআন)এর আনুগত্য কর যদি তোমরা স্বীকারকারী হয়ে থাক।\"  \n\n \n\n" +
                " ০০৮:০০২] স্বীকারকারী শুধু তারাই, যখন আল্লাহকে স্মরণ করা হয়, তখন তাদের মন ভীত-কম্পিত হয়, এবং যখন তাদের কাছে তাঁর আয়াত গুলো আবৃত্তি করা হয়, তখন তা তাদের স্বীকৃতিকে বাড়িয়ে দেয় এবং নিজেদের ক্রমবিকাশকের উপরই তারা নির্ভর করে,  \n\n \n\n" +
                " ০০৮:০০৩] যারা ভালবাসা (সালাত) স্থাপন করে এবং আমরা তাদেরকে যে জীবিকা দিয়েছি তা থেকে তারা খরচ (দরিদ্র-নিরন্নদের দিনে দুবেলা অন্ন, প্রয়োজনে বস্ত্র ও দারিদ্র-দূরিকরণে সম্মিলিত হয়ে দান) করে--  \n\n \n\n" +
                " ০০৮:০০৪] তারাই প্রকৃত স্বীকারকারী, বিজ্ঞানের ভিত্তিতে তাদের জন্য আছে তাদের ক্রমবিকাশকের কাছে উচ্চ-মার্যাদা এবং সংশোধন এবং সম্মানজনক জীবিকা,  \n\n \n\n" +
                " ০০৮:০০৫] যেভাবে বিজ্ঞানের ভিত্তিতে আপনার ক্রমবিকাশক আপনাকে আপনার বাড়ি থেকে বের করেছেন, যদিও স্বীকারকারীদের একদল এটিকে অত্যন্ত অপসন্দ করছিল।  \n\n \n\n" +
                " ০০৮:০০৬] তারা(অস্বীকারকারীরা) বিজ্ঞান নিয়ে আপনার সাথে কুণ্ডলী পাকাচ্ছে এটির নিশ্চিত প্রামান্য তথ্য আসার পরও যেন তাদেরকে মৃত্যুর দিকে হাঁকিয়ে নিয়ে যাওয়া হচ্ছে এবং তারা সেটি দেখছে।  \n\n \n\n" +
                " ০০৮:০০৭] এবং যখন আল্লাহ আপনাদের সাথে প্রতিশ্রুতি দিয়েছিলেন পর্যটনকারী দুদলের একটির জন্য, \"এটি আপনাদের জন্য হবে,\" এবং আপনারা চাচ্ছিলেন, নিরস্ত্র দলটি আপনাদের জন্য হোক, কিন্তু আল্লাহ্ চাচ্ছিলেন যেন তিনি তাঁর বানী দিয়ে বিজ্ঞানকে বৈজ্ঞানিক পদ্ধতিতে প্রতিষ্ঠিত করেন এবং অস্বীকারকারীদের মূল কেটে দেন,  \n\n \n\n" +
                " ০০৮:০০৮] যেন তিনি বৈজ্ঞানিক পদ্ধতিতে বিজ্ঞানকে প্রতিষ্ঠিত করেন এবং মিথ্যা-কুসংস্কারকে বাতিল করেন- যদিও অপরাধীরা এটি অপসন্দ করুক না কেন।  \n\n \n\n" +
                " ০০৮:০০৯] যখন আপনারা আপনাদের ক্রমবিকাশকের কাছে পরিত্রানের জন্য সকাতরে প্রার্থনা করছিলেন, তখন তিনি আপনাদের প্রার্থনা পূরণ করলেন (বললেন), \"আমি অবশ্যই আপনাদেরকে এক হাজার পর্যায়ক্রমে আগমনকারী ফিরিশতা দিয়ে বাড়তি শক্তি জোগাবো।\"  \n\n \n\n" +
                " ০০৮:০১০] এবং আল্লাহ এটিকে আনন্দের-বন্যা ছাড়া এবং আপনাদের মনকে এটি দিয়ে প্রশান্তিতে বিনত করা ছাড়া কিছুই করেন নাই। এবং কোনও সাহায্য আসে না আল্লাহ থেকে ছাড়া; নিশ্চই আল্লাহ ভালবাসা-কনিকার মহাসমূদ্র মহা বিজ্ঞানী।  \n\n \n\n" +
                " ০০৮:০১১] যখন তিনি তাঁর পক্ষ থেকে নিরাপত্তা দানের জন্য আপনাদেরকে তন্দ্রায় আচ্ছন্ন করছিলেন এবং আকাশ থেকে আপনাদের উপর পানি বর্ষণ করছিলেন, যেন তিনি তা দিয়ে আপনাদেরকে জীবানুমুক্ত করেন এবং আপনাদের থেকে আপনাদের স্বাধীন ইচ্ছা(শয়তান)এর প্ররোচনা দূর করেন এবং আপনাদের মনকে শক্তিশালী করে দেন এবং আপনাদের পদক্ষেপগুলো সেটি দিয়ে দৃঢ়ভাবে প্রতিষ্ঠিত করেন।  \n\n \n\n" +
                " ০০৮:০১২] যখন আপনার ক্রমবিকাশক ফিরিশতাদের প্রতি ওহী অবতীর্ণ করছিলেন, \"নিশ্চই আমি তোমাদের সাথে আছি; অতএব, তোমরা তাদেরকে অটল-অবিচল রাখ, যারা আল্লাহর এককসত্তা মেনে নিয়েছে। অচিরেই আমি তাদের অন্তরে ত্রাস সঞ্চারিত করবো যারা অস্বীকার করেছে। সুতরাং তোমরা (ফেরেস্তারা) আঘাত কর তাদের কন্ঠনালীতে এবং আঘাত কর তাদের হাতের ও পায়ের আঙ্গুলে।\"  \n\n \n\n" +
                " ০০৮:০১৩] এটি এ জন্য যে, তারা আল্লাহর এবং তাঁর রসূল(কুরআন) থেকে নিজেদেরকে বিচ্ছিন্ন করে নিয়েছে। এবং যে আল্লাহ এবং তাঁর রসূল(কুরআন) থেকে নিজেকে বিচ্ছিন্ন করে সেক্ষেত্রে নিশ্চই আল্লাহ্ কঠিন পরিনতি দাতা।  \n\n \n\n" +
                " ০০৮:০১৪] এগুলো তোমাদের জন্য, অতএব সেগুলোর স্বাদ গ্রহণ কর; (স্মরণ রাখ) নিশ্চই অস্বীকারকারীদের জন্য আগুনের দুঃখ-কষ্ট রয়েছে।  \n\n \n\n" +
                " ০০৮:০১৫] হে যারা আল্লাহর এককসত্তা মেনে নিয়েছ ! যখন তোমরা অগ্রসরমান অবস্থায় অস্বীকারকারীদের মুখামুখি হও, সেক্ষেত্রে (তোমরা) কখনও পৃষ্ঠপ্রদর্শন করবে না।  \n\n \n\n" +
                " ০০৮:০১৬] এবং এমনই কোনও দিনে যে ব্যক্তি কেবল যুদ্ধ কৌশলের জন্য একদিকে সরে যাওয়া অথবা কোনও দলের দিকে (যোগদান করাতে) এগিয়ে যাওয়া ছাড়া তাদেরকে পৃষ্ঠ-প্রদর্শন করবে তবে অবশ্যই সে ফিরে আসবে আল্লাহর ক্রোধসহ এবং তার বাসস্থান হবে অনুতাপস্থল। এবং সে গন্তব্যটি অতি মন্দ।  \n\n \n\n" +
                " ০০৮:০১৭] অতএব, তোমরা তাদেরকে হত্যা কর নাই, বরং আল্লাহ্ই তাদেরকে হত্যা করেছিলেন, এবং যখন আপনি (কংকর, বর্শা, তীর) নিক্ষেপ করেছিলেন আপনি নিক্ষেপ করেন নাই, বরং আল্লাহ্ই নিক্ষেপ করেছিলেন, এবং যেন তিনি নিজ থেকে স্বীকারকারীদেরকে পরীক্ষা করতে পারেন, উত্তম পরীক্ষা। নিশ্চই আল্লাহ্ সর্বশ্রোতা, সর্বজ্ঞানী।  \n\n \n\n" +
                " ০০৮:০১৮] এগুলো তোমাদের জন্য, এবং আল্লাহ অস্বীকারকারীদের চক্রান্ত অবশ্যই দুর্বল করে দেন।  \n\n \n\n" +
                " ০০৮:০১৯] যদি তোমরা(স্বীকারকারীরা) বিজয় চেয়ে থাক তাহলে নিশ্চই বিজয় এসে গেছে। এবং যদি তোমরা(অস্বীকারকারীরা) বিরত হও তাহলে সেটি তোমাদের জন্য কল্যাণকর হবে এবং যদি তোমরা (চক্রান্তের দিকে) ফিরে যাও, তাহলে আমরাও (শাস্তির দিকে)ফিরব। এবং তোমাদের দল যা আছে এমনকি যত বেশি-সংখ্যখই হউক না কেন, সেটি তোমাদের কোনও কাজে লাগবে না, এবং (জেনে রাখ) আল্লাহ্ নিশ্চই স্বীকারকারীদের সাথে আছেন।  \n\n \n\n" +
                " ০০৮:০২০] হে যারা আল্লাহর এককসত্তা মেনে নিয়েছ ! তোমরা আল্লাহ্ এবং তাঁর রসূল(কুরআন)এর আনুগত্য কর এবং তাঁর দিক থেকে মুখ ফিরিয়ে নিও না যেহেতু তোমরা শুনতে পার।  \n\n \n\n" +
                " ০০৮:০২১] এবং তোমরা তাদের মত হবে না যারা বলে, \"আমরা শুনি,\" কিন্তু তারা (শুনেও) শুনে না।  \n\n \n\n" +
                " ০০৮:০২২] নিশ্চই আল্লাহর কাছে নিকৃষ্টতম জীব হচ্ছে (ইচ্ছে)বধির ও (ইচ্ছে)বোবারা, যারা কোনও বুদ্ধি খাটায় না।  \n\n \n\n" +
                " ০০৮:০২৩] এবং আল্লাহ্ যদি তাদের মধ্যে ভাল কিছু দেখতেন, তাহলে অবশ্যই তিনি তাদেরকে শুনাতেন। এবং যদি(এ অবস্থায়) তিনি তাদেরকে শুনাতেন তাহলেও তারা মুখ ফিরিয়ে নিত এবং তারা অগ্রাহ্য করত।  \n\n \n\n" +
                " ০০৮:০২৪] হে যারা আল্লাহর এককসত্তা মেনে নিয়েছ ! তোমরা সাড়া দাও আল্লাহ্ এবং তাঁর রসূল(কুরআন)এর ডাকে, যখন তিনি তোমাদেরকে ডাক দেন যেন তিনি তোমাদেরকে জীবিত(উন্নত থেকে উন্নত) করতে পারেন; এবং জেনে রাখ, নিশ্চই আল্লাহ্ মানুষ ও তার মন-মগজের মধ্যে অবস্থার পরিবর্তন ঘটান এবং তাঁরই কাছে তোমাদের সবাইকে একত্রিত করা হবে।  \n\n \n\n" +
                " ০০৮:০২৫] এবং তোমরা সে পরীক্ষা-বিষয়ে সচেতন হও, তোমাদের থেকে শুধু যারা অন্যায় করেছে তাদেরই জন্য সে পরীক্ষা বরদ্দ হবে না তার সাথে, জেনে রাখ, আল্লাহ কঠিন পরিনতি দাতা।  \n\n \n\n" +
                " ০০৮:০২৬] এবং স্মরণ কর যখন তোমরা (সংখ্যায়) অল্প ছিলে, পৃথিবীতে দুর্বল বলে গণ্য হতে। তোমরা আশঙ্কা করতে, লোকেরা তোমাদেরকে ছিনিয়ে নিয়ে যাবে, অতঃপর তিনি তোমাদেরকে আশ্রয় দিলেন এবং তাঁর সাহায্য দিয়ে শক্তিশালী করলেন এবং তোমাদেরকে বিশুদ্ধ জীবিকা দান করলেন যেন তোমরা কৃতজ্ঞ হতে পার।  \n\n \n\n" +
                " ০০৮:০২৭] হে যারা আল্লাহর এককসত্তা মেনে নিয়েছ ! তোমরা আল্লাহ্ এবং রসূল(কুরআন)এর সাথে বিশ্বসঘাতকতা কোরও না এবং তোমাদের নিজেদের গচ্ছিত আমানত বিষয়েও বিশ্বাসহীনতা কোরও না, যেহেতু তোমরা শিক্ষার্জন করেছ।  \n\n \n\n" +
                " ০০৮:০২৮] এবং তোমরা জেনেছ, নিশ্চই তোমাদের ধন-সম্পদ ও তোমাদের সন্তান-সন্ততি পরীক্ষার বিষয়, এবং নিশ্চই আল্লাহ্ তিনি, যাঁর কাছে আছে মহা পুরস্কার।  \n\n \n\n" +
                " ০০৮:০২৯] হে যারা আল্লাহর এককসত্তা মেনে নিয়েছ! যদি তোমরা আল্লাহর সচেতনতা অবলম্বন কর তাহলে তিনি তোমাদের জন্য ফুরকান (পার্থক্যকারী বিজ্ঞান) সৃষ্টি করে দিবেন এবং তোমাদের সব মন্দ-কুসংস্কার দূর করে দিবেন এবং তোমাদেরকে সংশোধন করবেন; যেহেতু আল্লাহ মহা বিজ্ঞান-প্রযূক্তির অধিকারী।  \n\n \n\n" +
                " ০০৮:০৩০] এবং যখন অস্বীকারকারীরা আপনার বিরুদ্ধে কৌশল আঁটছিল, যেন তারা আপনাকে আহত করে আটকে রাখতে পারে অথবা আপনাকে হত্যা করতে পারে অথবা আপনাকে বহিস্কার করতে পারে। এবং তারা কৌশল আঁটছিল এবং আল্লাহও কৌশল আঁটছিলেন। কিন্তু আল্লাহ সর্বোত্তম কৌশলকারী।  \n\n \n\n" +
                " ০০৮:০৩১] এবং যখন আমাদের আয়াতগুলো তাদের কাছে আবৃত্তি করা হয়, তারা বলে, \"আমরা শুনেছি। আমরাও ইচ্ছে করলে অবশ্যই এর মত বলতে পারি। এটি প্রাচীন লোকদের কাহিনী ছাড়া আর কিছুই নয়।\"  \n\n \n\n" +
                " ০০৮:০৩২] এবং যখন তারা বলল, \"হে আল্লাহ্ ! যদি এটি আপনার কাছ থেকে প্রকৃত বিজ্ঞান হয়ে থাকে, তাহলে আপনি আকাশ থেকে আমাদের উপর পাথর বর্ষণ করুন অথবা আমাদের উপর কোন যন্ত্রণাদায়ক দুঃখ-কষ্ট অবতীর্ণ করুন।\"  \n\n \n\n" +
                " ০০৮:০৩৩] এবং আল্লাহ এমন নন, তিনি তাদেরকে দুঃখ-কষ্ট দিবেন যখন আপনি তাদের মধ্যে রয়েছেন এবং আল্লাহ এমনও  \n\n \n\n" +
                "নন, যখন তারা সংশোধন প্রার্থনা করে তখন তিনি তাদেরকে দুঃখ-কষ্ট দিবেন।  \n\n \n\n" +
                " ০০৮:০৩৪] এবং তাদের কী কারণ আছে, আল্লাহ তাদেরকে(পৌত্তলিকদেরকে) দুঃখ-কষ্ট দিবেন না, যখন তারা(মানুষকে) জীবানুসংক্রমন-মুক্ত-মসজিদে যেতে বাধা দেয় এবং তারা (প্রকৃতপক্ষে) এর রক্ষণা-বেক্ষণকারী হতে পারে না? কেবল সচেতনরা সেটির রক্ষণা-বেক্ষণকারী হতে পারে, কিন্তু তাদের বেশিরভাগই এটি জানে না।  \n\n \n\n" +
                " ০০৮:০৩৫] এবং এ (জীবানুসংক্রমন-মুক্ত)গৃহে তাদের সালাত *শিশ ও করতালি* ছাড়া আর কিছুই ছিল না। অতএব, দুঃখ-কষ্টের স্বাদ গ্রহণ কর যা তোমরা অস্বীকার করতে।  \n\n \n\n" +
                " ০০৮:০৩৬] নিশ্চই যারা অস্বীকার করেছে, তারা (মানুষকে)আল্লাহর পথ থেকে রুখতে নিজেদের ধন সম্পদ খরচ করে। তারা অবশ্যই এভাবে খরচ করেই যাবে, কিন্তু সেটি তাদের অনুশোচনার কারণ হবে, অতঃপর তাদেরকে পরাজিত করা হবে। এবং যারা অস্বীকার করেছে তাদেরকে অনুতাপস্থলে একত্রিত করা হবে;  \n\n \n\n" +
                " ০০৮:০৩৭] যাতে আল্লাহ্ মন্দকে ভাল থেকে পৃথক করে দেন। এবং মন্দদের একের উপর অন্যকে চাপিয়ে তাদের সবাইকে একত্রে স্তুপীকৃত করবেন, এবং তাদেরকে অনুতাপস্থলে নিক্ষেপ করবেন। এরাই তারা, যারা হবে ক্ষতিগ্রস্ত।  \n\n \n\n" +
                " ০০৮:০৩৮] যারা অস্বীকার করেছে তাদেরকে বলুন, \"যদি তারা তৎপরতা বন্ধ করে, তাহলে আগে যা হয়েছে সেসব তাদেরকে সংশোধন করে দেয়া হবে, কিন্তু যদি তারা আগের কাজে ফিরে যায়, তাহলে অবশ্যই পূর্ববর্তীরা দৃষ্টান্ত (সুন্নত) রেখে গেছে।  \n\n \n\n" +
                " ০০৮:০৩৯] এবং তোমরা তাদের সাথে যুদ্ধ কর যে পর্যন্ত না নীতিহীনতা-বিভ্রান্তি বন্ধ হয় এবং সকল বিষয়ে আল্লাহর বিধান কার্যকরী হয়। কিন্তু যদি তারা বন্ধ করে, তাহলে তারা যা কিছু করে, নিশ্চই আল্লাহ্ তাদের সব কাজ দেখছেন।  \n\n \n\n" +
                " ০০৮:০৪০] যদি তারা মুখ ফিরিয়ে নেয়, তাহলে জানবে, নিশ্চই আল্লাহ্ তোমাদের মালিক, কত উত্তম রক্ষাকর্তা, এবং কত উত্তম সাহায্যকারী তিনি !পরিচ্ছেদ ০০৮.দৃশ্যঃ নির্লিপ্ত-উপহার(সূরা আল-আনফাল The disinterested gift)  \n\n \n\n" +
                " ০০৮:০৪১ থেকে ০৭৫]  \n\n \n\n" +
                " ০০৮:০৪১] এবং জেনে রাখ, তোমরা কোনও অসুবিধা ছাড়া, কোনও বস্তু থেকে যা অর্জন কর সেগুলোর এক-পঞ্চমাংশ আল্লাহর জন্য এবং রসুলের জন্য এবং আত্মীয়-স্বজন এবং এতীম এবং মিসকীন এবং টোকাইদের জন্য; যদি তোমরা আল্লাহর এককসত্তা মেনে নাও এবং মেনে নাও যা আমাদের বান্দার প্রতি অবতীর্ণ করেছি ভাল-মন্দ-পৃথকিকরণ দিনগুলোতে, যেদিন গুলোতে দুই সম্প্রদায় মুখোমুখি হয়েছিল; এবং আল্লাহ্ প্রত্যেক বিষয়ের পরিমিত পরিমাপ নিরুপনে সক্ষম।  \n\n \n\n" +
                " ০০৮:০৪২] যখন তোমরা ছিলে উপত্যকার কাছাকাছি প্রান্তে এবং তারা দূর-প্রান্তে ছিল এবং অভিযাত্রীরা ছিল তোমাদের নিচের দিকে এবং যদি তোমরা প্রতিশ্রুতি দিতে তাহলে অবশ্যই তোমরা প্রতিশ্রুতি পালনে পিছিয়ে যেতে। কিন্তু আল্লাহ যেন ঐ বিষয়ের মীমাংসা করে দেন, যা করার জন্য তিনি সিদ্ধান্ত নিয়েছিলেন- যেন সে ব্যক্তি ধ্বংস হয় যে প্রমাণ্য-তথ্যের ভিত্তিতে ধ্বংস হয় এবং যেন সে ব্যক্তি জীবন পায় যে প্রমাণ্য-তথ্যের ভিত্তিতে জীবন পায়। এবং নিশ্চই আল্লাহ্ই সর্বশ্রোতা, সর্বজ্ঞানী।  \n\n \n\n" +
                " ০০৮:০৪৩] যখন আল্লাহ্ আপনাকে আপনার স্বপ্নে তাদেরকে সংখ্যায় অল্প(একপঞ্চমাংশ ৬৫, ৬৬আয়াত দ্রঃ) দেখিয়েছিলেন, অতএব যদি তিনি তাদেরকে সংখ্যায় বেশি দেখাতেন, তাহলে নিশ্চই আপনারা দুর্বল-চিত্ত হয়ে যেতেন এবং নিশ্চই আপনারা এ বিষয়ে পরস্পর মতবিরোধ করতেন; কিন্তু আল্লাহ আপনাদেরকে রক্ষা করেছেন। এবং নিশ্চই তিনি বিশেষভাবে জানেন যা আপনাদের মনে আছে।  \n\n \n\n" +
                " ০০৮:০৪৫] হে যারা আল্লাহর এককসত্তা মেনে নিয়েছ ! যখন তোমরা কোন দলের মুখোমুখি হও তখন অটল-অবিচল থাকবে এবং আল্লাহকে বেশি বেশি স্মরণ করবে যেন তোমরা সফল হতে পার।  \n\n \n\n" +
                " ০০৮:০৪৬] এবং আনুগত্য কর আল্লাহ্ এবং তাঁর রসুল(কুরআন)এর এবং পরস্পর তর্ক-বিতর্ক কোরও না, অন্যথায় তোমরা দুর্বল-চিত্ত হয়ে পড়বে এবং তোমাদের জীবনী-শক্তি চলে যাবে। এবং তোমরা ধৈর্য ধারণ কর, নিশ্চই আল্লাহ ধৈর্যশীলদের সাথে আছেন।  \n\n \n\n" +
                " ০০৮:০৪৭] এবং তোমরা তাদের মত হবে না, যারা অহঙ্কারে এবং লোক দেখানোর জন্য নিজেদের বাড়িঘর থেকে বের হয়েছিল, এবং যারা আল্লাহর পথ থেকে ফিরিয়ে দেয়, আসলে তারা যা কিছু করে আল্লাহ্ সেসব পরিবেষ্টন করে আছেন।  \n\n \n\n" +
                " ০০৮:০৪৮] এবং যখন স্বাধীন-ইচ্ছা(শয়তান) তাদের কাছে তাদের কাজ গুলোকে মনোরম করে দেখিয়েছিল এবং সেটি বলেছিল যে, \"আজ মানুষের মধ্যে থেকে কেউই তোমাদের উপর জয়যুক্ত হতে পারবে না এবং নিশ্চই আমি তোমাদের পাশাপাশি আছি।\" অতঃপর যখন দুদল মুখোমুখি হল, তখন সে নিজে ১৮০ ডিগ্রী ঘুরে পিছনে সরে পড়ল এবং বলল, \"নিশ্চই আমি দায়-মুক্ত তোমাদের থেকে ; নিশ্চই আমি যা দেখি তোমরা তা দেখ না। নিশ্চই আমি আল্লাহকে ভয় করি; কেননা আল্লাহ্ কঠিন পরিনতি দাতা।\"  \n\n \n\n" +
                " ০০৮:০৪৯] যখন দ্বিধাগ্রস্থ(মুনাফিক) এবং যাদের মন কলুষিত তারা বলে, \"এদের জীবন-বিধান এদেরকে ধোকা দিয়েছে।\" আসলে যে কেউ আল্লাহর উপর নির্ভর করে, সেক্ষেত্রে নিশ্চই আল্লাহ্ ভালবাসাকনিকার মহাসাগর, মহা বিজ্ঞানী।  \n\n \n\n" +
                " ০০৮:০৫০] এবং যারা অস্বীকার করেছে যদি তুমি তাদেরকে দেখতে যখন ফিরিশতারা তাদের মুখে এবং পিঠে আঘাত করে এবং বলে, \"এ তেজষ্ক্রিয় আগুনের দুঃখ-কষ্টের স্বাদ গ্রহণ কর।\"  \n\n \n\n" +
                " ০০৮:০৫১] সেটি তোমাদেরই নিজেহাতে আগে পাঠানো কাজের ফলে, এবং, আল্লাহ মোটেও তাঁর বান্দাদের সাথে কোনও অন্যায় করেন না, --  \n\n \n\n" +
                " ০০৮:০৫২] ফেরাউনের জাতি এবং যারা তাদের আগে ছিল তারা আল্লাহর আয়াতগুলোকে অস্বীকার করেছিল এবং আল্লাহ্ তাদেরকে তাদের পাপের জন্য ধৃত করলেন, ঠিক সেই অটলভাবে চলে আসা নিয়মেই। নিশ্চই আল্লাহ্ মহা-তেজশ্নি, কঠিন পরিনামদাতা।  \n\n \n\n" +
                " ০০৮:০৫৩] সেটির কারন, আল্লাহ্ যখন কোন জাতিকে কোনও পুরস্কার দেন, তিনি সেটির পরিবর্তন ততক্ষণ পর্যন্ত করেন না যতক্ষণ পর্যন্ত না তারা নিজেরা সেটির পরিবর্তন করে, এবং নিশ্চই আল্লাহ সর্বশ্রোতা, সর্বজ্ঞানী।  \n\n \n\n" +
                " ০০৮:০৫৪] ফেরাউনের জাতি এবং যারা তাদের আগে ছিল তারা তাদের ক্রমবিকাশকের আয়াতগুলোকে মিথ্যা প্রতিপন্ন করেছিল, অতঃপর আমরা তাদেরকে তাদের পাপের জন্য ধ্বংস করেছিলাম, ঠিক সেই অটলভাবে চলে আসা নিয়মেই। এবং আমরা ফেরাউনের জাতিকে নিমজ্জিত করেছিলাম যেহেতু তারা সবাই ছিল অন্যায়কারী।  \n\n \n\n" +
                " ০০৮:০৫৫] নিশ্চই তারা আল্লাহর কাছে নিকৃষ্টতম জীব, যারা অস্বীকার করেছে, অতএব, তারা আল্লাহর এককসত্তা মেনে নিবে না,  \n\n \n\n" +
                " ০০৮:০৫৬] তাদের মধ্য থেকে, যাদের সাথে আপনি চুক্তি করেছেন, কিন্তু তারা বারবার তাদের চুক্তি ভঙ্গ করেছে এবং তারা (আল্লাহর) সচেতনতা অবলম্বন করবে না।  \n\n \n\n" +
                " ০০৮:০৫৭] সুতরাং যদি আপনি যুদ্ধে তাদের চেয়ে বেশি পারদর্শী হন তাহলে তা দিয়ে তাদের পিছনে আগতদের পালিয়ে যেতে দিন, যেন তারা স্মরণকারী হতে পারে।  \n\n \n\n" +
                " ০০৮:০৫৮] এবং যদি আপনি কোন জাতির পক্ষ থেকে বিশ্বাসঘাতকতার আশঙ্কা করেন তাহলে সেক্ষেত্রে আপনিও সমান ভাবে (চুক্তি) বাতিল করতে পারেন। নিশ্চই আল্লাহ বিশ্বাসঘাতকদেরকে ভালবাসেন না।  \n\n \n\n" +
                " ০০৮:০৫৯] এবং যারা অস্বীকার করে তারা যেন মোটেও নিরুপন না করে তারা (আমাদের) নাগালের বাইরে চলে গেছে। নিশ্চই তারা (আমাদের পরিকল্পনা) ব্যর্থ করতে পারবে না।  \n\n \n\n" +
                " ০০৮:০৬০] এবং আপনারা তাদের বিরুদ্ধে প্রস্তুতি গ্রহণ করুন যথাসাধ্য (সামরিক) শক্তি সংগ্রহ ও সীমান্তে অশ্বারোহী মোতায়েন করে, যা দিয়ে আপনারা আতঙ্কিত করবেন আল্লাহর শত্রুকে এবং আপনাদের শত্রুকে এবং তাদের আশেপাশে অবশিষ্টদেরকেও, যাদেরকে আপনারা জানেন না, আল্লাহ্ তাদেরকে জানেন। এবং আপনারা যা কিছু আল্লাহর রাস্তায় খরচ (দরিদ্র-নিরন্নদের দিনে দুবেলা অন্ন, প্রয়োজনে বস্ত্র ও দারিদ্র-দূরিকরণে সম্মিলিত হয়ে দান) করবেন আপনাদেরকে তার পূর্ণ প্রতিদান(১০ থেকে ৭০০+ গুণ) দেয়া হবে এবং আপনাদের প্রতি কোন প্রকার অন্যায় করা হবে না।  \n\n \n\n" +
                " ০০৮:০৬১] এবং যদি তারা শান্তির দিকে ঝুঁকে তাহলে আপনিও সেটির দিকে ঝুঁকবেন এবং আপনি আল্লাহর উপর নির্ভর করবেন। নিশ্চই তিনি সর্বশ্রোতা, সর্বজ্ঞানী।  \n\n \n\n" +
                " ০০৮:০৬২] এবং তারা যদি আপনার সাথে ছলনার আশ্রয় নিতে চায় তাহলে নিশ্চই আল্লাহ আপনার জন্য যথেষ্ট, তিনিই আপনাকে পৃষ্ঠপোষকতা করবেন নিজ সাহায্য দিয়ে এবং স্বীকারকারীদের দিয়ে।  \n\n \n\n" +
                " ০০৮:০৬৩] এবং তিনিই তাদের মনে সম্প্রীতির সঞ্চার করলেন। যদি আপনি পৃথিবীতে যা আছে সবও খরচ (দরিদ্র-নিরন্নদের দিনে দুবেলা অন্ন, প্রয়োজনে বস্ত্র ও দারিদ্র-দূরিকরণে সম্মিলিত হয়ে দান) করতেন তবুও আপনি তাদের মনে সম্প্রীতির সঞ্চার করতে পারতেন না, কিন্তু আল্লাহ তাদের অনুভূতিতে নাড়া দিলেন । নিশ্চই তিনি ভালবাসাকনিকার মহাসাগর, মহা বিজ্ঞানী।  \n\n \n\n" +
                " ০০৮:০৬৪] হে নবীজী ! আল্লাহ্ই যথেষ্ট –আপনার জন্য এবং স্বীকারকারীদের মধ্য থেকে যারা আপনার অনুসরণ করে তাদের জন্যও।  \n\n \n\n" +
                " ০০৮:০৬৫] হে নবীজী ! আপনি স্বীকারকারীদেরকে যুদ্ধ করার জন্য উদ্বুদ্ধ করতে থাকুন,যদি আপনাদের মধ্যে বিশজন অটল থাকে, তাহলে তারা দুইশ জনের উপর বিজয়ী হবে এবং যদি আপনাদের মধ্যে একশ জন থাকে তাহলে তারা অস্বীকারকারীদের এক হাজার জনের উপর বিজয়ী হবে, কারণ তারা এমন এক জাতি যারা অনুধাবন করতে পারে না।  \n\n \n\n" +
                " ০০৮:০৬৬] তিনি জানেন তোমাদের মধ্যে (মেনে নিতে বা স্বীকৃতিতে) এখনও কিছু দুর্বলতা আছে তাই এখন আল্লাহ তোমাদেরকে সহনীয় করে দিচ্ছেন। তাই তোমাদের মধ্যে একশ জন অটল থাকলে তারা দুইশ জনের উপর বিজয়ী হবে, এবং যদি তোমাদের মধ্যে এক হাজার জন থাকে তাহলে আল্লাহর অনুমতিক্রমে দুইহাজার জনের উপর বিজয়ী হবে। যেহেতু আল্লাহ্ ধৈর্যশীলদের সাথে আছেন।  \n\n \n\n" +
                " ০০৮:০৬৭] কোন নবীর পক্ষে এটি সমীচীন নয়, তিনি কোনও যুদ্ধ-বন্দী রাখেন, যদি না সে দেশ প্রচণ্ড যুদ্ধে লিপ্ত হয়। তোমরা ইহকালীন ধন-সম্পদ চাচ্ছ কিন্তু আল্লাহ্ তোমাদের জন্য পরকালীন-জীবন চাচ্ছেন। যেহেতু আল্লাহ ভালবাসাকনিকার মহাসাগর, মহা বিজ্ঞানী।  \n\n \n\n" +
                " ০০৮:০৬৮] যদি আল্লাহর পক্ষ থেকে আগেই বিধান-গ্রন্থ দেয়া না হত তাহলে তোমরা যা কিছু গ্রহণ করেছ সেটির জন্য অবশ্যই কঠিন দুঃখ-কষ্ট তোমাদের স্পর্শ করত।  \n\n \n\n" +
                " ০০৮:০৬৯] সুতরাং নির্লিপ্ত-উপহার থেকে তোমরা যা কিছু পেয়েছ তা থেকে বৈধ(হালাল) এবং বিশুদ্ধ-উপাদেয় বস্তু থেকে খাও এবং আল্লাহর সচেতনতা অবলম্বন কর। নিশ্চই আল্লাহ অত্যন্ত সংশোধনশীল, এককসত্তা দয়াময়।  \n\n \n\n" +
                " ০০৮:০৭০] হে নবীজী ! আপনাদের হাতে যে সকল যুদ্ধ-বন্ধী আছে আপনি তাদেরকে বলুন, \"যদি আল্লাহ তোমাদের মনে কোন কল্যাণ দেখেন তাহলে তোমাদের কাছ থেকে (মুক্তিপণ হিসেবে) যা নেয়া হয়েছে তিনি তোমাদেরকে সেটি থেকে উৎকৃষ্টতর দিবেন । এবং তোমাদেরকে সংশোধনও করবেন। যেহেতু আল্লাহ অত্যন্ত সংশোধনশীল, পরম দয়াময়।\"  \n\n \n\n" +
                " ০০৮:০৭১] এবং যদি তারা আপনার সাথে বিশ্বাসঘাতকতা করার ইচ্ছে করে তাহলে তারা ইতোপূর্বে আল্লাহর সাথেও বিশ্বাসঘাতকতা করেছিল, কিন্তু তিনি (আপনাকে) তাদের উপরে ক্ষমতা দান করেছেন। যেহেতু আল্লাহ সর্বজ্ঞানী, মহা বিজ্ঞানী।  \n\n \n\n" +
                " ০০৮:০৭২] নিশ্চই যারা আল্লাহকে এককসত্তা মেনে নিয়েছে, এবং সাময়িক-অভিবাসন(হিজরত) করেছে, এবং নিজেদের প্রান ও ধন-সম্পদ দিয়ে আল্লাহর পথে প্রচেষ্টা করেছে এবং যারা (তাদেরকে)আশ্রয় দিয়েছে এবং সাহায্য করেছে তারা একে অপরের বন্ধু। এবং যারা আল্লাহকে এককসত্তা মেনে নিয়েছে অথচ সাময়িক-অভিবাসন(হিজরত) করে নাই, তাদের সব বিষয়ের পৃষ্ঠপোষকতা করার ব্যাপারে তোমরা দায়ী নও যতক্ষণ পর্যন্ত না তারা সাময়িক-অভিবাসন করবে। এবং যদি জীবন-বিধানের ব্যাপারে তারা তোমাদের কাছে সাহায্য প্রার্থনা করে, তাহলে সাহায্য কর –কিন্তু সেই জাতির বিরুদ্ধে নয় যাদের মধ্যে এবং তোমাদের মধ্যে চুক্তি আছে। এবং আল্লাহ সব কিছু দেখেন, তোমরা যে কাজ কর।  \n\n \n\n" +
                " ০০৮:০৭৩] এবং যারা অস্বীকার করে – তারা একে অপরের পৃষ্ঠপোষক। তোমরা যদি (যা অদিষ্ট হয়েছ) তা না কর, তাহলে  \n\n \n\n" +
                "পৃথিবীতে নীতিহীনতা ছড়িয়ে পড়বে এবং মারাত্মক বিশৃঙ্খলার সৃষ্টি হবে।  \n\n \n\n" +
                " ০০৮:০৭৪] এবং যারা আল্লাহকে এককসত্তা মেনে নিয়েছে এবং সাময়িক-অভিবাসন(হিজরত) করেছে এবং আল্লাহর পথে প্রচেষ্টা করেছে এবং যারা আশ্রয় দিয়েছে এবং সাহায্য করেছে এরাই বিজ্ঞান-ভিত্তিক স্বীকারকারী। তাদের জন্য রয়েছে সংশোধন এবং সম্মানজনক জীবনোপকরণ।  \n\n \n\n" +
                " ০০৮:০৭৫] এবং যারা এরপর আল্লাহর এককসত্তা মেনে নিবে এবং সাময়িক অভিবাসন করবে এবং তোমাদের সাথে মিলে (আল্লাহর পথে) প্রচেষ্টা করবে- এরা তোমাদেরই অন্তর্ভুক্ত হবে; এবং আল্লাহর গ্রন্থ অনুযায়ী রক্ত সম্বন্ধীয় আত্নীয়দের মধ্যে কেউ কেউ একে অপরের বেশি কাছাকাছি। নিশ্চই আল্লাহ প্রত্যেক বিষয়ে সবিশেষ অবহিত।  \n\n \n\n");

        editor.putString("12", "   পরিচ্ছেদ ০১৩.দৃশ্যঃ বজ্রধ্বনি(সূরা আর-রা’দ The Thunder)  \n\n \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৪৪ আয়াত এবং ৬ রুকূ আছে।  \n\n \n\n" +
                " ০১৩:০০১ থেকে ০২০]  \n\n \n\n" +
                " ০১৩:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০১৩:০০১] আলিফ লাম মীম রা। এগুলো (বিজ্ঞান) গ্রন্থের আয়াত এবং যেটি আপনার কাছে বিজ্ঞানের ক্রমবিকাশকের পক্ষ থেকে অবতীর্ণ হয়েছে; কিন্তু বেশির ভাগ মানুষ এটি মেনে নেয় না।  \n\n \n\n" +
                " ০১৩:০০২] আল্লাহ, যিনি বায়ুমণ্ডলগুলোকে সুপরিকল্পিতভাবে নিজ উদ্ভাবনী শক্তি দিয়ে (পৃথিবী গুলোর আবরণ হিসেবে) চড়িয়ে(upload) দিয়েছেন যেভাবে তোমরা দেখছ। অতঃপর তিনি সৃষ্টির ভিত্তি(আরশ) নিউক্লিয়াসকে সমত্বরণ বিশিষ্ট করলেন। এবং তিনি সূর্য ও চন্দ্রকে (তোমাদের) ব্যাবহার উপযোগী করলেন, এগুলোর প্রত্যেকটিই এক নির্দিষ্ট মেয়াদে (নিজ নিজ কক্ষপথে) পরিভ্রমন করছে। তিনি প্রত্যেক বিষয়ের কার্যসাধন করেন এবং তিনি আয়াত গুলো ভেঙ্গে ভেঙ্গে (খোলাসা করে) বর্ণনা করেন যেন তোমরা তোমাদের ক্রমবিকাশকের সাথে নিশ্চিতভাবে সাক্ষাৎ করতে পার।  \n\n \n\n" +
                " ০১৩:০০৩] এবং তিনিই পৃথিবীগুলোকে (কোটি কোটি সংখ্যায় বিভিন্ন গ্যালাক্সিতে) বিস্তৃত করেছেন এবং সেগুলোর উপর উচ্চশির-পর্বত এবং প্রবহমান নদী সৃষ্টি করেছেন, এবং সেগুলোর মধ্যে প্রত্যেক প্রকার ফল দুপ্রস্থ ক্রোমজমের মিলনে জোড়ায় জোড়ায় সৃষ্টি করেছেন। তিনি দিনকে রাত দিয়ে ঢেকে দেন। নিশ্চই এর মধ্যে গবেষক সম্প্রদায়ের জন্য বহু আয়াত(নিদর্শন) আছে ।  \n\n \n\n" +
                " ০১৩:০০৪] এবং পৃথিবীতে পরস্পর সংলগ্ন ভুখন্ড(দেশ)গুলো আছে, এবং আঙ্গুরের বাগান, আর শস্যক্ষেত্র এবং খেজুরগাছ এবং একবীজপত্রি উদ্ভিদ (তাল, নারকেল, সুপারী, পাম ইত্যাদি) এবং দ্বিবীজপত্রি উদ্ভিদ (আম, কাঁঠাল, বরই ইত্যাদি), সেগুলোকে একই পানি দিয়ে সিঞ্চিত করা হয়, তবুও বিজ্ঞান শিক্ষার দিক থেকে একেকটি একেক প্রকারের খাবার। নিশ্চই এর মধ্যে শিক্ষিত লোকদের জন্য আয়াত(নিদর্শন) রয়েছে।  \n\n \n\n" +
                " ০১৩:০০৫] এবং যদি আপনি বিস্মিত হন, তাহলে বেশি বিস্ময়কর তাদের এমন বলা, \"যেহেতু আমরা (মানুষ) মাতৃ-গর্ভে জন্মেছিলাম, এখন কি আমাদেরকে নুতন কোনও উপায়ে সৃষ্ট হতে হবে?\" এরাই তারা যারা অস্বীকার করে তাদের ক্রমবিকাশককে, এবং এদেরই গলায় বাঁধা থাকবে (১০৫ফুট লম্বা) শিকল, এবং এরাই অনুতাপের-আগুনের অধিবাসী হবে, তারা সেখানে দীর্ঘকাল বাস করবে।  \n\n \n\n" +
                " ০১৩:০০৬] এবং তারা আপনার কাছে কল্যাণের পূর্বে দ্রুত অকল্যাণ চায়, অথচ তাদের আগের লোকদেরকে মহাবিপদ আক্রান্ত করেছিল। এবং নিশ্চই আপনার ক্রমবিকাশক মানুষের জন্য বড়ই সংশোধনশীল, তাদের অন্যায় সত্বেও, যেহেতু নিশ্চই আপনার ক্রমবিকাশক অভেদ্য পরিনতিদাতা।  \n\n \n\n" +
                " ০১৩:০০৭] এবং যারা অস্বীকার করেছে তারা বলে, \"তার ক্রমবিকাশক থেকে কেন তার উপর কোনও আয়াত(নিদর্শন) অবতীর্ণ হয় নাই?\" অথচ আপনি একজন সতর্ককারী এবং প্রত্যেক জাতির জন্য সুপথপ্রাপ্তির নির্দেশনাদাতা।  \n\n \n\n" +
                " ০১৩:০০৮] আল্লাহ্ জানেন প্রত্যেক নারী যা(ডিম্বানু) গর্ভে ধারণ করে, এবং জরায়ুতে যা অতিআনুবিক্ষণিক জননকোষ(শুক্রানু) আপতন গ্রহন করে এবং যা কিছু(ভ্রূণ-শিশু) বর্দ্ধিত করে। এবং তাঁর কাছে প্রত্যেক বস্তুর এক পূর্ণ পরিমাপ আছে।  \n\n \n\n" +
                " ০১৩:০০৯] তিনি অদৃশ্য-অজানা এবং দৃশ্যমান-প্রামাণিক তথ্যের জ্ঞাতা, অতীব মহান, অতীব মৌলিক।  \n\n \n\n" +
                " ০১৩:০১০] তোমাদের মধ্যে যে কেউ কথা বানায়(ভাষায় প্রকাশ করে) এবং যে কেউ সেটি ছড়ায়(প্রকাশ্যে দৃষ্টি গোচর করে) উভয়ই সমান; এভাবে সেও যে রাতের বেলায় (স্ত্রী-পরিজনের কাছে ভালমানুষের) ছদ্মবেশে থাকে এবং দিনের বেলায় বন্ধু-বান্ধবী নিয়ে যাচ্ছেতাই স্বেচ্ছাচার করে বেড়ায়।  \n\n \n\n" +
                " ০১৩:০১১] তার(কুরআনের) জন্য তার সামনে এবং পিছনে অনুসরণকারী ফিরিশতাদের দল, যারা আল্লাহর আদেশ অনুযায়ী তার সুরক্ষা করে; নিশ্চই আল্লাহ্ কখনও কোন জাতির অবস্থার পরিবর্তন করেন না, যে পর্যন্ত না তারা তাদের নিজেদের অবস্থা পরিবর্তন করে। এবং যখন আল্লাহ্ কোন জাতির ক্ষতি করার সিদ্ধান্ত নেন, তখন তা প্রতিরোধ করারও কেউই নেই; আসলে তাদের জন্য তিনি ছাড়া কোনও অভিভাবক নেই।  \n\n \n\n" +
                " ০১৩:০১২] যিনি তোমাদেরকে ভয় এবং আশার জন্য বিদ্যুৎ দেখান, এবং অতিভারী মেঘমালা(cumulo-nimbus cloud) উত্থিত করেন।  \n\n \n\n" +
                " ০১৩:০১৩] এবং তাঁর ভয়ে বজ্র এবং ফিরিশতারা তাঁর প্রশংসাসহ তাঁর দেয়া দায়িত্ব পালন করে। এবং তিনিই বজ্র প্রেরণ করেন এবং যাকে ইচ্ছা সেটি দিয়ে আঘাত করেন, তবুও তারা আল্লাহ্ সম্বন্ধে বিতর্ক করে, অথচ তিনি কঠিন বঞ্চনাকারী।  \n\n \n\n" +
                " ০১৩:০১৪] বিজ্ঞানের আহ্বান শুধু তাঁরই, এবং তারা তাঁকে ছেড়ে যাদেরকে (পীর-পুরোহিত-যাযক-হুজুর) ডাকে, তাদের ডাকে কোনকিছুই কোনও সাড়া দেয় না। তখন যে ব্যক্তি নিজের দুহাত পানির দিকে প্রসারিত করে, যেন পানি তার মুখে পৌঁছে, কিন্তু তা কখনও তার কাছে পৌঁছে না। আসলে অস্বীকারকারীদের প্রার্থনা নিস্ফলই হয়ে থাকে।  \n\n \n\n" +
                " ০১৩:০১৫] এবং যারা বায়ুমন্ডলগুলোতে এবং পৃথিবীগুলোতে আছে, তারা এবং তাদের সংগঠনগুলো স্বেচ্ছায় বা অনিচ্ছায় সূর্যোদয়পূর্ব (ফজর) ও সূর্যাস্তে (ইশায়) আল্লাহকে সেজদা করে।  \n\n \n\n" +
                " ০১৩:০১৬] আপনি বলুন, বায়ুমন্ডলগুলোর এবং পৃথিবীগুলোর ক্রমবিকাশক কে? আপনি বলুন, \"আল্লাহ্\"। আবার বলুন, \"তবুও কি তোমরা তাঁকে ছেড়ে এমন অভিভাবক গ্রহণ করছ যারা নিজেদের জন্যেও না কোন উপকার করার ক্ষমতা রাখে এবং না অপকারের ?\" আপনি বলুন, \"অন্ধ ও চক্ষুষ্মান কি সমান হতে পারে, অথবা অন্ধকার ও আলো কি সমান হতে পারে, অথবা তাদের কল্পিত আল্লাহর-পৃথকসত্তারা তাঁর সৃষ্টির অনুরূপ কিছু সৃষ্টি করেছে যা তাদের কাছে (আল্লাহর ও) তাদের সৃষ্টি একই রকম লাগছে ?\" আপনি বলুন, \"আল্লাহ সকল বস্তুর সৃষ্টিকর্তা, তিনি এককসত্তা সর্ব-বিজয়ী।\"  \n\n \n\n" +
                " ০১৩:০১৭] তিনি মহাকাশ থেকে পানি বর্ষণ করেছেন যা গভীর উপত্যকা গুলো পরিমিত পরিমাপে প্রবাহিত হয় সাগর নদীনালায়, এবং সাগরের  \n\n \n\n" +
                "তরঙ্গ বুদবুদ তুলে আছড়ে পড়ে(উপকুলে)। এবং অলংকার অথবা তৈজষপত্র তৈরী করার জন্যে যে আগুনে উত্তপ্ত করা হয় সেটি থেকেও একই প্রকার বুদবুদ হয়। এভাবেই আল্লাহ বিজ্ঞান ও কুসংস্কারের উপমা বর্ণনা করেন । এক্ষেত্রে বুদ-বুদ নিঃশেষ হয়ে যায় এবং মানুষের উপকারের জন্য ভূ-পৃষ্ঠে পলী স্থায়ী ভাবে থাকে। এভাবে আল্লাহ উপমাগুলো বারবার বর্ণনা করে থাকেন ।  \n\n \n\n" +
                " ০১৩:০১৮] যারা তাদের ক্রমবিকাশকের ডাকে সাড়া দেয় তাদের জন্য উত্তম বিনিময় রয়েছে, কিন্তু যারা তাঁর ডাকে সাডা দেয় না, তাহলে পৃথিবীর উপর যাকিছু আছে যদি সব এবং তার সাথে সমপরিমাণ আরও হত, তারা নিশ্চই সব কিছুই মুক্তি-পন হিসেবে পেশ করে দিত। এদের জন্যই মন্দ হিসাব (অবধারিত) আছে,এবং তাদের বাসস্থান হবে অনুতাপস্থল । বস্তুতঃ সেটি কতই না মন্দ বিশ্রামস্থল !  \n\n \n\n" +
                " ০১৩:০১৯] যে ব্যক্তি জানে, আপনার প্রতি আপনার ক্রমবিকাশকের তরফ থেকে যা অবতীর্ণ করা হয়েছে তা শুধুই বিজ্ঞান, সে কি ঐ ব্যক্তির মত হতে পারে যে (চোখ থেকেও) অন্ধ ? কেবল বুদ্ধিমান সম্প্রদায়ই গবেষণা করে –  \n\n \n\n" +
                " ০১৩:০২০] যারা আল্লাহর সাথেকৃত অঙ্গীকার পূর্ণ করে এবং চুক্তি ভঙ্গ করে না;  \n\n \n\n" +
                "পরিচ্ছেদ ০১৩.দৃশ্যঃ বজ্রধ্বনি(সূরা আর-রা’দ The Thunder)  \n\n \n\n" +
                " ০১৩:০২১ থেকে ০৪৩]  \n\n \n\n" +
                " ০১৩:০২১] এবং যারা সংযোগ স্থাপন করে, আল্লাহ যে সম্পর্ক(প্রেম-বন্ধুত্ব-আত্মিয়তা) গুলোর সংযোগ স্থাপন করতে আদেশ করেছেন, এবং যারা তাদের ক্রমবিকাশকের প্রতি বিনয়ী হয় এবং মন্দ পরিনামের ভয় করে;  \n\n \n\n" +
                " ০১৩:০২৩] চিরস্থায়ী জান্নাত, যাতে প্রবেশ করবে তারা নিজেরা এবং তাদের সৎকর্মপরায়ণ পূর্বপুরুষ, স্ত্রী ও সন্তান-সন্ততি। এবং ফিরিশতারা প্রত্যেক দরজা দিয়ে তাদের কাছে আসবে  \n\n \n\n" +
                " ০১৩:০২৪] (বলবে) তোমাদের উপর শান্তি(সালাম), যেহেতু তোমরা ধৈর্য ধারণ করেছ, সেহেতু তোমাদের জন্য পুরস্কার এ উত্তম আবাসস্থল, কত উত্তম পরিণতি !  \n\n \n\n" +
                " ০১৩:০২৫] এবং যারা আল্লাহর সাথে কৃত অঙ্গীকারকে বিশুদ্ধতা প্রমাণ করার পরও ভঙ্গ করে এবং যে সম্পর্ক(প্রেম-বন্ধুত্ব-আত্মিয়তা) গুলোর সংযোগ স্থাপন করতে আল্লাহ আদেশ করেছেন, সেটিকে ছিন্ন করে এবং পৃথিবীতে বিশৃংখলা-দূর্নীতি সৃষ্টি করে, এরাই সেসব লোক যাদের জন্য অমঙ্গল এবং তাদের জন্য নিকৃষ্ট বাসস্থান।  \n\n \n\n" +
                " ০১৩:০২৬] আল্লাহ যার জন্য চান জীবিকা বর্ধিত করে দেন এবং পরিমিত পরিমাপে করে দেন। এবং তারা ইহকালীন-জীবন নিয়েই আনন্দিত, কিন্তু ইহকালীন-জীবন পরকালীন-জীবনের তুলনায় (সাময়িক) ভোগসামগ্রী ছাড়া কিছুই নয়।  \n\n \n\n" +
                " ০১৩:০২৭] এবং যারা অস্বীকার করেছে তারা বলে, \"তার ক্রমবিকাশকের তরফ থেকে তার উপর কোন আয়াত(নিদর্শন) অবতীর্ণ হয় নাই কেন?\" আপনি বলুন, \"আল্লাহ যাকে চান পথভ্রষ্ট হতে দেন এবং যে তাঁর দিকে পুনঃ পুনঃ ফিরে আসে তিনি তাকে নিজের দিকে সুপথ প্রদর্শন করেন,  \n\n \n\n" +
                " ০১৩:০২৮] যারা আল্লাহর এককসত্তা মেনে নেয় এবং যাদের মন-মগজ আল্লাহর স্মরণে পরিতৃপ্তি লাভ করে।\" আল্লাহর স্মরনেই মন-মগজ পরিতৃপ্ত হয়।  \n\n \n\n" +
                " ০১৩:০২৯] \"যারা আল্লাহর এককসত্তা মেনে নেয় এবং ভালকাজ করে তাদের জন্য সুখ-শান্তি এবং উত্তম প্রত্যাবর্তনস্থল নির্ধারিত আছে।\"  \n\n \n\n" +
                " ০১৩:০৩০] এভাবে আমরা আপনাকে এমন এক জাতির কাছে পাঠিয়েছি যাদের আগে অনেক জাতি গত হয়েছে, যেন আপনি তাদের কাছে সেটি পাঠ করে শোনান যা আমরা আপনার কাছে ওহী করেছি, যেহেতু তারা রহমান (আল্লাহর দয়া)এর মধ্যে থেকেও অস্বীকার করছে। আপনি বলুন, \"তিনিই আমার ক্রমবিকাশক, তিনি ছাড়া আর কোন উদ্ভাবনীশক্তি নেই। তাঁর উপরই আমি নির্ভর করি এবং তাঁরই দিকে আমাকে ফিরে যেতে হবে।\"  \n\n \n\n" +
                " ০১৩:০৩১] যদি এ কুরআন এমন হত যা দিয়ে পর্বতগুলোকে সঞ্চালিত করা যেত অথবা পৃথিবী গুলোকে কেটে টুকরো টুকরো করা যেত, অথবা সেটি দিয়ে মৃতদের সাথে কথা বলা যেত ! বরং এটি (কুরআন) আল্লাহর সমস্ত অনুশাসন-আদেশনিষেধ। যারা আল্লাহর এককসত্তা মেনে নিয়েছে তারা কি জানতে পারে নাই, যদি আল্লাহ চাইতেন তিনি সকল মানুষকে সুপথপ্রাপ্তির নির্দেশনা দিতে পারতেন? কিন্তু যারা অস্বীকারকারী থাকে তাদেরকে (মানুষ থেকে অন্য প্রানিতে) নামিয়ে দেয়া হবে, অর্থাৎ তাদেরকে ঠুকে ঠুকে রুপান্তর করে অথবা তাদের পরকালীন- গৃহের কাছে টুকরো টুকরো ভাগ করে কাটা হতে থাকবে (ভিন্ন জীব ও মানুষে) যতক্ষণ পর্যন্ত না আল্লাহর প্রতিশ্রুতি পূর্ণ হয়( পুনরুত্থানের যোগ্য হয়)। নিশ্চই আল্লাহ প্রতিশ্রুতি পূরণে ব্যার্থ হন না।  \n\n \n\n" +
                " ০১৩:০৩২] নিশ্চই আপনার আগেও রসূলদের সাথে ঠাট্টা-বিদ্রুপ করা হয়েছিল, কিন্তু যারা অস্বীকার করেছিল, আমি কিছু কালের জন্য তাদেরকে অবকাশ দিয়েছিলাম, পরে আমি তাদেরকে ধৃত করলাম। সুতরাং কেমন (ভয়ংকর) ছিল তাদের শেষ পরিনতি !  \n\n \n\n" +
                " ০১৩:০৩৩] ইনিই কি তিনি, যিনি প্রত্যেক প্রান যা অর্জন করছে, তা তদারক করছেন? অথচ তারা আল্লাহর পৃথকসত্তা কল্পনা করে নিয়েছে। আপনি বলুন, \"তোমরা তাদের নামকরণ কর, অথবা তোমরা কি তাঁকে পৃথিবীর এমন বিষয়ের সংবাদ দিবে যা তিনি জানেন না, অথবা এগুলো কি কেবল ফাঁকা বুলি?\" এবং যারা অস্বীকার করেছে তাদের চাতুরতাকে তাদের কাছে সুন্দর অনুভূত করানো হচ্ছে এবং তাদেরকে (সঠিক) পথ থেকে পিছিয়ে রাখা হয়েছে। আসলে আল্লাহ যাকে পথভ্রষ্ট হতে দেন, তার জন্য কোন সুপথ প্রাপ্তির নির্দেশনা-দাতা নেই।  \n\n \n\n" +
                " ০১৩:০৩৪] তাদের জন্য ইহকালীন জীবনে দুঃখ-কষ্ট আছে এবং নিশ্চই পরকালের দুঃখ-কষ্ট আরও কঠিনতর হবে এবং আল্লাহর মধ্যে তাদের জন্য কোন আশ্রয়স্থল নেই।  \n\n \n\n" +
                " ০১৩:০৩৫] জান্নাতের উদাহরণ হচ্ছে, যা সচেতনদের জন্য প্রতিশ্রুত, যার তলদেশ দিয়ে অব্যাহত পানির সরবরাহ থাকবে, সেটির খাদ্য-ফলমূল চিরস্থায়ী এবং ছায়াময় স্থান গুলোও। এগুলো শেষ-পরিনতি, যারা সচেতনতা অবলম্বন করে, এবং (অনুতাপস্থলের) আগুন হবে অস্বীকারকারীদের পরিনতি।  \n\n \n\n" +
                " ০১৩:০৩৬] এবং যাদেরকে আমরা গ্রন্থ দিয়েছি, তারা আনন্দিত হয়, আপনার প্রতি যা অবতীর্ণ হয়েছে সেটির(কুরআনের) জন্য। এবং সে দলগুলোর মধ্যে যারা সেটির(কুরআনের) অংশবিশেষকে প্রত্যাখ্যান করে তাদেরকে বলুন, \"আমাকে শুধু এ আদেশ দান করা হয়েছে যেন আমি একমাত্র আল্লাহর সেবাকাজ করি এবং তাঁর সাথে কাউকেও পৃথকসত্তা কল্পনা না করি। তাঁর দিকেই আমি ডাকছি এবং তাঁরই দিকেই আমার স্ববেগ-প্রত্যাবর্তন।\"  \n\n \n\n" +
                " ০১৩:০৩৭] এবং এভাবেই আমরা এটিকে (কুরআনকে) অবতীর্ণ করেছি, বিধি-নিষেধ হিসেবে আরবী ভাষায়। এবং অবশ্যই যদি আপনি তাদের মনোভাবের অনুসরণ করেন, আপনার কাছে বিজ্ঞান থেকে যতটুকু এসেছে তারপরেও, তাহলে আল্লাহর পক্ষ থেকে আপনার কোন অভিভাবক থাকবে না এবং না কোনও আশ্রয়স্থল।  \n\n \n\n" +
                " ০১৩:০৩৮] এবং আমরা আপনার আগে অনেক রসূল পাঠিয়েছিলাম এবং তাদেরকে স্ত্রী এবং সন্তান-সন্ততি দান করেছিলাম। এবং কোনও রসুলের পক্ষে এটি সম্ভব নয়, সে আল্লাহর অনুমোদন ছাড়া কোন আয়াত (নিদর্শন) আনে। প্রত্যেক মেয়াদের জন্যই বিধান-গ্রন্থ আছে।  \n\n \n\n" +
                " ০১৩:০৩৯] আল্লাহ যা চান মুছে দেন এবং সুনিশ্চিত করেন এবং তাঁর কাছে সকল বিধান-গ্রন্থের মূল উৎস রয়েছে।  \n\n \n\n" +
                " ০১৩:০৪০] এবং আমরা তাদের সাথে যে প্রতিশ্রুতি দিয়েছি যদি আমরা তার কোন অংশ আপনাকে দেখাই অথবা যদি আমরা আপনাকে মৃত্যু দেই, তখন আপনার দায়িত্ব শুধু(বিধান-বাণী) পৌঁছে দেয়া এবং আমাদের উপর দায়িত্ব (তাৎক্ষণিক)কর্ম-যাচাই করা।  \n\n \n\n" +
                " ০১৩:০৪১] তারা কি দেখে না, আমরা পৃথিবীগুলোকে তার কক্ষপথ গুলোকে (স্থিরসময়ের দিকে) সংকীর্ণ করে আনছি? আসলে আল্লাহ আদেশ-নির্দেশ দান করেন, কেউ তাঁর আদেশ-নির্দেশকে ধ্বংস করতে পারে না, এবং তিনি কর্ম-যাচাই তাৎক্ষণিক ভাবে করেন।  \n\n \n\n" +
                " ০১৩:০৪২] এবং তাদের আগে যারা ছিল তারাও নীল-নকশা এঁটেছিল, কিন্তু সকল (কার্যককরী) পরিকল্পনা আল্লাহরই (আয়াত্বাধীন)। প্রত্যেক প্রান যা কিছু অর্জন করছে, তিনি তা জানেন, এবং অস্বীকারকারীরা জানতে পারবে, শেষ পরিনামে কার (উত্তম)আবাসস্থল।  \n\n \n\n" +
                " ০১৩:০৪৩] যারা অস্বীকার করে তারা বলে, আপনি রসূল নন। আপনি বলুন, \"আল্লাহই আমার ও তোমাদের মধ্যে সাক্ষী হিসেবে যথেষ্ট এবং সে ব্যক্তিও যার কাছে এই গ্রন্থের(কুরআনের) জ্ঞান আছে।\"  \n\n \n\n");

        editor.putString("13", "  \n\n \n\n" +
                "        পরিচ্ছেদ ০১৪.দৃশ্যঃ ইবরাহীম নবী(সূরা ইবরাহীম The Abraham)  \n\n \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৫৩ আয়াত এবং ৭ রুকূ আছে।  \n\n \n\n" +
                "  \n\n \n\n" +
                " ০১৪:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০১৪:০০১] আলিফ লাম রা। একটি গ্রন্থ(কুরআন), আপনার কাছে অবতীর্ণ করেছি যেন আপনি মানব জাতিকে তাদের ক্রমবিকাশকের অনুমোদনক্রমে মুর্খতার অন্ধকার থেকে শিক্ষার আলোর দিকে বের করে আনেন, ভালবাসা কনার মহাসমূদ্র ও প্রশংসনীয় এককসত্তার পথে-  \n\n \n\n" +
                " ০১৪:০০২] আল্লাহ এককসত্তা, বায়ুমণ্ডলগুলোতে যাকিছু আছে এবং পৃথিবী গুলোতে যাকিছু আছে সবই যাঁর জন্য। এবং অস্বীকারকারীদের জন্য  \n\n \n\n" +
                "কঠোর দুঃখ-কষ্টের কারণে সর্বনাশ।  \n\n \n\n" +
                " ০১৪:০০৩] যারা ইহকালীন-জীবনকে পরকালীন-জীবনের চেয়ে বেশি ভালবাসে এবং আল্লাহর পথ থেকে পিছিয়ে থাকে এবং সেটিতে কুটিলতা খুজে বের করতে চায়। এরাই ঘোরতর ভ্রান্তিতে পড়ে রয়েছে।  \n\n \n\n" +
                " ০১৪:০০৪] এবং আমরা পাঠাই নাই এমন কোনও রসূল তার জাতির ভাষা ছাড়া, যেন সে তাদের কাছে সুস্পষ্ট-প্রমান উপস্থাপন করতে পারে। অতঃপর আল্লাহ যাকে চান পথভ্রষ্ট হতে দেন এবং যাকে চান সুপথপ্রাপ্তির নির্দেশনা দান করেন। এবং তিনি ভালবাসা-কনিকার মহাসমূদ্র, মহাবিজ্ঞানী।  \n\n \n\n" +
                " ০১৪:০০৫] এবং অবশ্যই আমরা মূসাকে পাঠিয়েছি আমাদের আয়াত (নিদর্শন) সহ; \"আপনার জাতিকে অশিক্ষার অন্ধকার থেকে বের করে শিক্ষার আলোর দিকে আনার জন্য এবং তাদেরকে আল্লাহর সময় (স্থিরসময়) স্মরণ করাতে,\" এর মধ্যেই প্রত্যেক ধৈর্যশীল-কৃতজ্ঞ লোকের জন্য অনেক আয়াত(নিদর্শন) আছে।  \n\n \n\n" +
                " ০১৪:০০৬] এবং যখন মূসা তার জাতিকে বলেছিল, \"স্মরণ কর তোমাদের উপর আল্লাহর সেসব পুরস্কারগুলোকে , যেমন তিনি তোমাদেরকে ফেরাউনের জাতি থেকে উদ্ধার করেছিলেন, যারা তোমাদেরকে ভীষণ মন্দ দুঃখ-কষ্ট দিত এবং তোমাদের পুত্রদের নৃশংসভাবে হত্যা করত এবং তোমাদের নারীদের জীবিত রাখত।\" আসলে এতে তোমাদের জন্য তোমাদের ক্রমবিকাশকের পক্ষ থেকে এক মহাপরীক্ষা ছিল।  \n\n \n\n" +
                " ০১৪:০০৭] এবং যখন তোমাদের ক্রমবিকাশক ঘোষণা করেছিলেন, যদি তোমরা কৃতজ্ঞ হও তাহলে অবশ্যই আমি তোমাদেরকে আরও বাড়িয়ে দিব; কিন্তু যদি তোমরা অকৃতজ্ঞ হও তাহলে আমার দেয়া দুঃখ-কষ্ট বড়ই কঠোর।  \n\n \n\n" +
                " ০১৪:০০৮] এবং মুসা বলেছিল, \"যদি তোমরা এবং পৃথিবীগুলোর সবাই অস্বীকার কর, তাহলেও নিশ্চই আল্লাহ্ কনায়-সমৃদ্ধ, প্রশংসাভাজন।\"  \n\n \n\n" +
                " ০১৪:০০৯] তোমাদের কাছে কি সংবাদ পৌঁছে নাই, যারা তোমাদের পূর্বে ছিল , নূহ, আদ ও সামূদের জাতি এবং যারা তাদের পরে হবে যাদেরকে আল্লাহ ছাড়া কেউই জানে না ? যখন তাদের কাছে এসেছিল তাদের রসূলরা উজ্জল প্রামান্য তথ্য-দলীল নিয়ে, তখন তারা বারবার মুখের সামনে হাত নেড়ে বিদ্রুপের সাথে বলেছিল, \"আমরা অস্বীকার করছি, যে বিষয়সহ তোমরা প্রেরিত হয়েছ, এবং নিশ্চই অবশ্যই সন্দেহ হচ্ছে, যে বিষয়ের প্রতি তোমরা আমাদেরকে ডাকছ তা চরম সংশয়াচ্ছন্ন কিনা।\"  \n\n \n\n" +
                " ০১৪:০১০] তাদের রসূলরা বলল, \"তোমরা কি আল্লাহর মধ্যে সন্দেহ করছ, যিনি বায়ুমণ্ডলগুলো এবং পৃথিবীগুলোর সৃষ্টিকর্তা ? তিনি তোমাদের পাপগুলো সংশোধনের জন্যে তোমাদেরকে ডাকেন, এবং নির্দিষ্ট মেয়াদ(নিরুপিত-গুনাঙ্ক) পর্যন্ত তোমাদেরকে অবকাশ দান করেন।\" তারা বলল, \"তোমরা আমাদের মত মানুষ ছাড়া কিছুই নও, তোমরা চাচ্ছ আমাদেরকে পিছিয়ে দিতে, আমাদের পূর্বপুরুষ যাদের উপাসনা করে আসছে তাদের থেকে। তাহলে তোমরা আমাদের কাছে নির্ভরযোগ্য পাণ্ডিত্য কর্তৃত্ব নিয়ে আস।\"  \n\n \n\n" +
                " ০১৪:০১১] তাদের রসূলরা তাদেরকে বলল, \"আমরা তোমাদের মত মানুষ ছাড়া কিছুই নই, কিন্তু আল্লাহ নিজ বান্দাদের মধ্য থেকে যাকে চান বিশেষ অনুগ্রহ দান করেন । এবং এটি আমাদের কর্তৃত্বাধীন নয় যে, আল্লাহর অনুমোদন ছাড়া তোমাদের কাছে কিছু আনি। এবং স্বীকারকারীদেরকে আল্লাহর উপরই নির্ভর করা উচিত;  \n\n \n\n" +
                " ০১৪:০১২] এবং কেনইবা আমরা আল্লাহর উপর নির্ভর করব না, যেহেতু তিনি অবশ্যই আমাদেরকে সুপথপ্রাপ্তির নির্দেশনার পথে চালাচ্ছেন? অতএব, তোমরা আমাদেরকে যে দুঃখ-কষ্ট দিচ্ছ সেটির উপর আমরা অবশ্যই ধৈর্য ধারণ করব। আসলে নির্ভরশীলগণকে একমাত্র আল্লাহর উপরই নির্ভর করা উচিত।\"  \n\n \n\n" +
                " ০১৪:০১৩] এবং যারা অস্বীকার করেছিল তারা তাদের রসূলদেরকে বলেছিল, \"আমরা তোমাদেরকে অবশ্যই আমাদের দেশ থেকে বের করে দিব অথবা তোমরা অবশ্যহ আমাদের ধর্মে ফিরে আসবে।\" তখন তাদের ক্রমবিকাশক তাদের প্রতি ওহী করলেন, আমরা অবশ্যই অন্যায়কারীদের ধ্বংস করব,  \n\n \n\n" +
                " ০১৪:০১৪] এবং আমরা তাদের পরে তোমাদেরকে অবশ্যই এ দেশে বসবাস করাব। এটি(এ প্রতিশ্রুতি) সে ব্যক্তির জন্য যে আমার বড়দলকে সমীহ করে এবং আমার প্রতিশ্রুতিগুলোকে ভয় করে।  \n\n \n\n" +
                " ০১৪:০১৫] এবং তারা বিজয় প্রার্থনা করল; এবং প্রত্যেক স্বৈরাচারী একগুঁয়ে শত্রু প্রতিহত হল-  \n\n \n\n" +
                " ০১৪:০১৬] তার সামনে রয়েছে অনুতাপস্থল, এবং তাকে জীবানু-সংক্রমিত পানি পান করানো হবে।  \n\n \n\n" +
                " ০১৪:০১৭] সে তা অতিকষ্টে ঢোক গিলে গিলে পান করবে এবং সহজে গিলতে পারবে না । এবং সবদিক থেকে তার কাছে মৃত্যু আসবে, কিন্তু সে মরবে না। এবং এরপরও তার জন্য গভীরতম দুঃখ-কষ্ট আছে।  \n\n \n\n" +
                " ০১৪:০১৮] যারা তাদের ক্রমবিকাশককে অস্বীকার করেছে তাদের কৃত-কর্ম গুলোর উপমা সে ছাইয়ের মত, যাকে ঝড়ের দিনে বাতাস প্রবল বেগে উড়িয়ে নিয়ে যায়। তারা যা কিছু অর্জন করেছে সেগুলোর কিছুর উপর তাদের কোনও পরিমাপই(অংশ) থাকবে না। আসলে এটিই চরম পর্যায়ের পথভ্রষ্টতা-বিভ্রান্তি,  \n\n \n\n" +
                " ০১৪:০১৯] আপনি কি দেখছেন না, আল্লাহ্ বিজ্ঞানের ভিত্তিতে বায়ুমণ্ডলগুলো এবং পৃথিবীগুলোকে সৃষ্টি করেছেন? তিনি ইচ্ছে করলে আপনাদেরকে দূরীভূত করে এক নতুন সৃষ্টি আনতে পারেন।  \n\n \n\n" +
                " ০১৪:০২০] এবং এটি আল্লাহর জন্য মোটেও কঠিন নয়।  \n\n \n\n" +
                " ০১৪:০২১] তারা একইসাথে আল্লাহর কাছে উপস্থিত হবে; তখন অধঃপতিত লোকেরা,যারা অহংকার করেছিল, সেসব(সুশীল) লোকদেরকে বলবে নিশ্চই আমরা তোমাদের অনুসরণকারী ছিলাম, অতএব তোমরা কি(এখন) আমাদের উপর থেকে আল্লাহ প্রদত্ত দুঃখ-কষ্টের কিয়দংশ দূর করতে পার? তারা বলবে, যদি আল্লাহ্ আমাদেরকে সুপথপ্রাপ্তির নির্দেশনা দিতেন তাহলে আমরাও তোমাদেরকে সুপথে পরিচালিত করতাম । আমাদের অধৈর্য হওয়া অথবা ধৈর্য ধারণ উভয়ই আমাদের জন্য সমান, আমাদের পরিত্রাণের উপায় নেই।  \n\n \n\n" +
                " ০১৪:০২২] এবং শয়তান(মানুষের স্বাধীন ইচ্ছা) বলবে, যখন সব বিষয়ের মীমাংসা করে দেয়া হবে, \"নিশ্চই আল্লাহ্ তোমাদেরকে প্রতিশ্রুতি দিয়েছিলেন, বিজ্ঞানের প্রতিশ্রুতি, এবং আমিও তোমাদেরকে এক প্রতিশ্রুতি দিয়েছিলাম কিন্তু আমি প্রতিশ্রুতি ভঙ্গ করেছিলাম। আসলে তোমাদের উপর আমার কোন কর্তৃত্ব ছিল না, আমি তোমাদেরকে শুধু দাওয়াত দিয়েছিলাম এবং তোমরা আমার ডাকে সাড়া দিয়েছিলে। সুতরাং তোমরা আমাকে দোষ দিও না, বরং নিজেদেরকেই দোষ দাও। আমি তোমাদের সাহায্যের জন্য চিৎকার শুনতে পারব না এবং তোমরাও আমার ক্রন্দন শুনতে পারবে না। তোমরা যে আমাকে (আল্লাহর) পৃথকসত্তা কল্পনা করেছিলে, আমি পূর্বেই তা অস্বীকার করেছি।\" অন্যায়কারীদের জন্য নিশ্চই যন্ত্রণাদায়ক দুঃখ-কষ্ট রয়েছে।  \n\n \n\n" +
                " ০১৪:০২৩] এবং যারা আল্লাহর এককসত্তা মেনে নেয় এবং ভালকাজ করে তাদেরকে তাদের ক্রমবিকাশকের অনুমোদনক্রমে এমন বাগানগুলোতে স্থান দান করা হবে, যার তলদেশ দিয়ে অব্যাহত পানির সরবরাহ থাকবে, তারা সেখানে চিরদিন বসবাস করবে, সেখানে তাদের( পরস্পরের) সম্ভাষণ হবে \"সালাম (শান্তি)\"।  \n\n \n\n" +
                " ০১৪:০২৪] আপনি কি লক্ষ্য করেন নাই, আল্লাহ্ কিভাবে একটি *মঙ্গলময় বানী(কলেমা তাইয়েবা)*কে একটি মঙ্গলময় বৃক্ষের উপমা দিয়ে বুঝিয়েছেন, যেটির শিকড় (এ পৃথিবীতে) দৃঢ়ভাবে প্রোথিত এবং সেটির শাখা প্রশাখা মহাকাশে (বিভিন্ন পৃথিবীতে) বিস্তৃত রয়েছে ?  \n\n \n\n" +
                " ০১৪:০২৫] সেটি নিজ ক্রমবিকাশকের অনুমোদনক্রমে মহাকাল ধরে ফল দিতে থাকবে। এবং আল্লাহ্ মানুষের জন্য বিভিন্ন উপমা বর্ণনা করেছেন যেন তারা গবেষণা করতে পারে।  \n\n \n\n" +
                " ০১৪:০২৬] এবং মন্দ বাক্যের উপমা মন্দ বৃক্ষের মত, যেটিকে পৃথিবী পৃষ্ঠ থেকে মূলোচ্ছেদ করে ফেলা হয়; যার কোনও স্থায়িত্ব নেই।  \n\n \n\n" +
                " ০১৪:০২৭] আল্লাহ এ স্থায়ী-বানী দিয়ে তাদেরকে (পৃথিবীগুলোতে)প্রতিষ্ঠিত করেন, যারা আল্লাহ-এককসত্তাকে মেনে নিয়েছে, ইহকালীন জীবনেও এবং পরকালীন জীবনেও, এবং আল্লাহ্ অন্যায়কারীদেরকে পথভ্রষ্ট হতে দেন। এবং আল্লাহ্ যা চান সেটিই করেন।  \n\n \n\n" +
                " ০১৪:০২৮] আপনি কি সেসব লোকের অবস্থা লক্ষ্য করেন নাই, যারা অস্বীকৃতি প্রদর্শন পূর্বক আল্লাহর পুরস্কারগুলো পরিবর্তন করে নিয়েছে এবং তারা তাদের জাতিকে টুকরো টুকরো করে অনুৎপাদনশীল করেছে?  \n\n \n\n" +
                " ০১৪:০২৯] অনুতাপস্থল, সেখানে তারা (অনুতাপের আগুনে)জ্বলতে থাকবে এবং সেটি অত্যন্ত নিকৃষ্ট বিশ্রামস্থল।  \n\n \n\n" +
                " ০১৪:০৩০] এবং তারা(হিন্দুরা ও কিছু খৃস্টানরা) আল্লাহর প্রতিক তৈরী করে যেন তারা (মানুষকে) তাঁর পথ থেকে বিভ্রান্ত করতে পারে। আপনি বলুন, \"তোমরা সাময়িক আনন্দ-উপভোগ করে নাও, অতঃপর নিশ্চই তোমাদের পুনর্গঠনের জন্য আগুনে ঢেলে সাজাতে হবে।\"  \n\n \n\n" +
                " ০১৪:০৩১] যারা আল্লাহর এককসত্তা স্বীকারকারী আমার বান্দা, তাদেরকে আপনি বলুন, যেন তারা সালাত(ভালবাসা) স্থাপন করে এবং তাদেরকে যে জীবিকা আমরা দিয়েছি তা থেকে গোপনে ও প্রকাশ্যে খরচ(প্রতিদিন গরিব খাওয়ানো এবং দারিদ্রদূরিকরণে দান) করে সেদিন আসার আগে যেদিন কোন ক্রয়-বিক্রয় এবং বন্ধুত্ব থাকবে না।  \n\n \n\n" +
                " ০১৪:০৩২] আল্লাহ এককসত্তা, যিনি বায়ুমণ্ডলগুলো এবং পৃথিবীগুলোকে সৃষ্টি করেছেন, এবং তিনি মহাকাশ থেকে পানি বর্ষণ করেছেন এবং তা দিয়ে তোমাদের জন্য জীবিকা হিসেবে বিভিন্ন প্রকার ফল উৎপন্ন করেন, এবং তিনি জাহাজগুলোকে তোমাদের ব্যাবহারযোগ্য করে দিয়েছেন যেন সেগুলো তাঁর আদেশে (বাতাস ও পানি) সমুদ্রে চলাচল করে। এভাবে তিনি নদীগুলোকেও তোমাদের ব্যাবহার যোগ্য করে দিয়েছেন।  \n\n \n\n" +
                " ০১৪:০৩৩] এবং তিনি সূর্য ও চাঁদকে তোমাদের ব্যাবহারযোগ্য করেছেন, উভয়েই ঐকান্তিকতার সাথে অবিরাম কর্তব্যরত আছে । এবং তিনিই রাত এবং দিনকে তোমাদের ব্যাবহারযোগ্য করে দিয়েছেন।  \n\n \n\n" +
                "  \n\n \n\n" +
                " ০১৪:০৩৪] এবং যাকিছু তোমরা তাঁর কাছে চেয়েছ তিনি তোমাদেরকে সব দিয়েছেন এবং যদি তোমরা আল্লাহর অনুগ্রহ গুণতে চাও তাহলে সেগুলোর সংখ্যা নিরূপণ করতে পারবে না। নিশ্চই মানুষ বড়ই অন্যায়কারী, অকৃতজ্ঞ।  \n\n \n\n" +
                " ০১৪:০৩৫] এবং (স্মরণ করুন) যখন ইব্ররাহীম বলেছিল, হে আমার ক্রমবিকাশক ! এ নগরীকে আপনি নিরাপদ-শান্তিধাম করে দিন এবং আমাকে ও আমার সন্তান-সন্ততিদেরকে প্রতিমার উপাসনা থেকে দূরে রাখুন;  \n\n \n\n" +
                " ০১৪:০৩৬] হে আমার ক্রমবিকাশক ! নিশ্চই সেগুলো(প্রতিমাগুলো) বহু মানুষকে পথভ্রষ্ট করেছে, অতএব যে ব্যক্তি আমার অনুসরণ করে সে নিশ্চই আমার সাথে সম্পৃক্ত, এবং যে আমার অবাধাত্য করে, সেক্ষেত্রে আপনি নিশ্চই অতীব সংশোধনশীল, পরম দয়াময়।  \n\n \n\n" +
                " ০১৪:০৩৭] হে আমাদের ক্রমবিকাশক ! নিশ্চই আমি আমার বংশধর থেকে কিছু অংশকে আপনার সম্মনিত গৃহের কাছে এক চাষাবাদহীন উপত্যকায় বসতি স্থাপন করিয়েছি। হে আমাদের ক্রমবিকাশক ! যেন এরা সালাত(ভালবাসা) স্থাপন করে। সুতরাং আপনি মানুষের মন-মগজ এমন করে দেন যেন তারা এদের প্রতি আকৃষ্ট হয়, এবং এদেরকে ফল-ফলাদির জীবিকা দান করুন যেন এরা কৃতজ্ঞ হয়;  \n\n \n\n" +
                " ০১৪:০৩৮] হে আমাদের ক্রমবিকাশক ! যা কিছু আমরা গোপন করি এবং যা কিছু আমরা প্রকাশ করি নিশ্চই আপনি সবই জানেন। এবং আল্লাহর কাছে কোন বস্তু ভূমণ্ডলেও গোপন থাকতে পারে না এবং নভোমন্ডলেও না;  \n\n \n\n" +
                " ০১৪:০৩৯] সকল ধন্যবাদ আল্লাহকে, যিনি আমাকে বৃদ্ধ বয়সে ইসমাঈল ও ইসহাককে দান করেছেন। নিশ্চই আমার ক্রমবিকাশক সব সময় প্রার্থনা শ্রবনকারী;  \n\n \n\n" +
                " ০১৪:০৪০] হে আমার ক্রমবিকাশক ! আমাকে সালাত(ভালবাসা) স্থাপনকারী করুন এবং আমার বংশধরদেরকেও । আপনি আমাদের ক্রমবিকাশক ! তাই আমাদের প্রার্থনা পূরণ করুন;  \n\n \n\n" +
                " ০১৪:০৪১] হে আমাদের ক্রমবিকাশক ! নিরুপিত *স্থিরসময়* প্রতিষ্ঠিত হলে আমাকে ও আমার পিতামাতাকে এবং স্বীকারকারীদেরকে সংশোধন করে দিবেন।  \n\n \n\n" +
                " ০১৪:০৪২] এবং অন্যায়কারীরা যা করছে সেটি থেকে আপনি আল্লাহকে কখনও উদাসিন কল্পনা করবেন না। তিনি তাদেরকে কেবল সেদিন পর্যন্ত অবকাশ দিচ্ছেন যেদিন (আইরিশ স্ক্যান করে) চক্ষুগুলোকে স্বতন্ত্র বৈশিষ্ট্য মণ্ডিত করা হবে;  \n\n \n\n" +
                " ০১৪:০৪৩] তারা তাদের মাথা তুলে তাড়াহুড়া করতে থাকবে, তাদের দৃষ্টি তাদের দিকে ফিরে আসবে না, এবং তাদের মন-মগজ সম্পূর্ণ ফাঁকা হয়ে যাবে।  \n\n \n\n" +
                " ০১৪:০৪৪] এবং আপনি মানুষদেরকে সেদিন সম্পর্কে সতর্ক করুন, যেদিন তাদের উপর দুঃখ-কষ্ট আসবে, সেদিন যারা অন্যায় করেছিল তারা বলবে, \"হে আমাদের ক্রমবিকাশক ! আমাদেরকে স্বল্প কালের জন্য অবকাশ দিন, আমরা আপনার ডাকে সাড়া দিব এবং রসূলদেরকে অনুসরণ করব।\" (তিনি বলবেন) তোমরা কি ইতিপূর্বে শপথ কর নাই যে তোমরা কখনও বহিঃস্কৃত হবে না?  \n\n \n\n" +
                " ০১৪:০৪৫] অথচ তোমরা সেসব মানুষের ঘরবাড়িতেই বাস করছ, যারা নিজেদের উপর অন্যায় করেছিল এবং তোমাদের কাছে স্পষ্ট প্রতিয়মান হয়েছিল যে, আমরা তাদের সংগে কী ব্যবহার করেছিলাম, এবং তোমাদের কাছে আমরা সব রকম উপমা বর্ণনা করেছি।  \n\n \n\n" +
                " ০১৪:০৪৬] এবং অবশ্যই তারা নীল-নকশা গ্রহণ করেছে; কিন্তু তাদের সে নীল-নকশা গুলো আল্লাহর কাছে আছে। এমনকি তাদের নীল-নকশা এমন কিছুই হোক না কেন, যা দিয়ে পর্বতও উধাও হয়ে যায়।  \n\n \n\n" +
                " ০১৪:০৪৭] অতএব, আপনি আল্লাহ সম্বন্ধে কখনও এ ধারণা করবেন না যে, তিনি তাঁর রসূলদের সাথে কৃত প্রতিশ্রুতি ভঙ্গ করবেন। নিশ্চই আল্লাহ ভালবাসা-কনিকার মহাসমূদ্র, মহা সংস্থাপনকারী;  \n\n \n\n" +
                " ০১৪:০৪৮] সেদিন পৃথিবীগুলোকে অন্যরকম(সর্বোন্নত) পৃথিবীতে পরিবর্তিত করা হবে এবং বায়ুমণ্ডলগুলোও, এবং তারা মহাকাশ-বিজয়ে অগ্রসরমান হয়ে উপস্থিত হবে, আল্লাহর জন্য, যিনি এককসত্তা সর্ব-বিজয়ী।  \n\n \n\n" +
                " ০১৪:০৪৯] এবং সেদিন আপনি অপরাধীদেরকে (১০৫ফুট লম্বা) শিকলে বাঁধা দেখবেন।  \n\n \n\n" +
                " ০১৪:০৫০] তাদের জামাকাপড় গুলো আলকাতরা লাগানো এবং তাদের মুখমন্ডল অর্ধচেতন অবস্থায় আগুনে থাকবে।  \n\n \n\n" +
                " ০১৪:০৫১] এই হচ্ছে, আল্লাহ্ পক্ষ থেকে, প্রত্যেক ব্যক্তির কৃত-কর্মের প্রতিদান; নিশ্চই আল্লাহ অত্যন্ত দ্রুত প্রত্যেকের কৃত-কর্ম যাচাই-বাছাই করেন।  \n\n \n\n" +
                " ০১৪:০৫২] এটি(কুরআন) মানুষের জন্য একটি ইসতেহার(প্রজ্ঞাপন), এবং তাদের জন্য পূর্ণ সতর্ককারী, এবং তারা যেন জানে, \"শুধুমাত্র তিনি(আল্লাহ)ই এককসত্তা উদ্ভাবনীশক্তি,\" এবং(কুরআন) প্রথম স্তরের বুদ্ধিসম্পন্ন লোকদের জন্য স্মারক-বানী গবেষণার বিষয়বস্তু।  \n\n \n\n");

        editor.putString("18", " পরিচ্ছেদ ০১৯.দৃশ্যঃ মাতা-মরিয়ম(সূরা মরিয়ম The Mother-Mary)  \n\n \n\n" +
                "এটি মাক্কী সূরা, বিসমিল্লাহ সহ এতে ৯৯ আয়াত এবং ৬ রুকূ আছে।  \n\n \n\n" +
                " ০১৯:০০০] এককসত্তা করুণাময় এককসত্তা দয়াময় আল্লাহর সৌজন্যে  \n\n \n\n" +
                " ০১৯:০০১] কাফ হা ইয়া আঈন সাদ। (*পরিমিত* *সুপথের-নির্দেশনা-প্রাপ্ত* *হে* *বিজ্ঞানী* *সত্যবাদী*)  \n\n \n\n" +
                " ০১৯:০০২] এটি আপনার ক্রমবিকাশকের দয়ার স্মারক, যা তিনি তাঁর বান্দা যাকারিয়্যার উপর অবতীর্ণ করেছিলেন।  \n\n \n\n" +
                " ০১৯:০০৩] যখন সে তার ক্রমবিকাশককে একান্তে বার বার ডেকেছিল।  \n\n \n\n" +
                " ০১৯:০০৪] সে বলেছিল, \"হে আমার ক্রমবিকাশক ! নিশ্চই আমার হাড়গুলো দুর্বল হয়ে গেছে এবং আমার মাথা উত্তপ্ত হয়েছে চুলও পাকা, কিন্তু হে আমার ক্রমবিকাশক ! আপনার কাছে প্রার্থনা করে আমি কখনও অসুখি হই নাই;  \n\n \n\n" +
                " ০১৯:০০৫] এবং নিশ্চই আমি আমার পরে আমার উত্তরাধিকারী নিয়ে আশঙ্কা করি, এবং আমার স্ত্রীও বন্ধ্যা সুতরাং আপনি *ছাঁচ-অনুয়ায়ী গঠিত*(ক্লোন) পদ্ধতিতে আমাকে উত্তরাধিকারী দান করুন,  \n\n \n\n" +
                " ০১৯:০০৬] যে আমার উত্তরাধিকারী হবে এবং ইয়াকুবের বংশেরও উত্তরাধিকারী হবে, এবং হে আমার ক্রমবিকাশক ! তাকে আপনি সন্তষ্টচিত্ত বানাবেন।\"  \n\n \n\n" +
                " ০১৯:০০৭] হে যাকারিয়া ! নিশ্চই আমরা তোমাকে এক পুত্রের সুসংবাদ দিচ্ছি, যার নাম হবে ইয়াহইয়া, ইতোপূর্বে আমরা এ নামে কাউকেও ডাকি নাই।  \n\n \n\n" +
                " ০১৯:০০৮] সে বলল, \"হে আমার ক্রমবিকাশক ! কিভাবে আমার পুত্র হবে, যেহেতু আমার স্ত্রী বন্ধ্যা এবং আমিও বার্ধক্যের চরম সীমায় পৌঁছে গেছি?\"  \n\n \n\n" +
                " ০১৯:০০৯] সে(জিবরাইল) বলল, \"এভাবেই হবে।\" তোমার ক্রমবিকাশক বলছেন, \"এটি আমার জন্য সহজ; আমি তোমাকে ইতোপূর্বে সৃষ্টি করেছি যখন তুমি কিছুই ছিলে না।\"  \n\n \n\n" +
                " ০১৯:০১০] (যাকারিয়্যা)বলল, \"হে আমার ক্রমবিকাশক ! আমার জন্য কোন নিদর্শন দান করুন।\" (আল্লাহ) বললেন, \"তোমার জন্য এ নিদর্শন, তুমি মানুষের সাথে পরপর তিন রাত কথা বলবে না।\"  \n\n \n\n" +
                " ০১৯:০১১] এরপর, সে উপাশনা-কক্ষ থেকে বেরিয়ে তার জাতির কাছে আসলো এবং তাদেরকে ঈশারায় সকাল থেকে সন্ধ্যা পর্যন্ত নিজনিজ কাজ করে যেতে বলল।  \n\n \n\n" +
                " ০১৯:০১২] \"হে ইয়াহইয়া ! তুমি গ্রন্থটিকে শক্ত করে ধর।\" এবং আমরা তাকে শৈশবেই বিজ্ঞানের জ্ঞান দান করেছিলাম।  \n\n \n\n" +
                " ০১৯:০১৩] এবং আমাদের \"ছাঁচ(বিধান-বানী) অনুয়ায়ী গঠিত\" পদ্ধতিতে হৃদয়ের কোমলতা এবং শুদ্ধতা দান করেছিলাম, এবং সে ছিল অত্যন্ত সচেতন।  \n\n \n\n" +
                " ০১৯:০১৪] এবং সে পিতামাতার প্রতি ছিল ন্যায়পরায়ন, এবং সে উগ্র, অবাধ্য ছিল না।  \n\n \n\n" +
                " ০১৯:০১৫] এবং তার উপর শান্তি যেদিন সে জন্ম গ্রহণ করেছে এবং যেদিন সে মৃত্যু বরণ করবে, এবং যেদিন তাকে জীবিত করে পুনরুথিত করা হবে।  \n\n \n\n" +
                " ০১৯:০১৬] এবং এ গ্রন্থে(কুরআনে) আপনি মরিয়মের উল্লেখ করুন, যখন সে তার পরিবারকে পরিত্যাগ করে পূর্ব দিকের একটি যায়গায় (কাশ্মীরে) চলে গেল।  \n\n \n\n" +
                " ০১৯:০১৭] এবং সে তাদের থেকে নিজেকে আড়াল করে নিল, তখন আমরা আমাদের আদেশ-বানী তার (জরায়ুর ৮৭দিনের ভ্রূণের)কাছে পাঠালাম, সে(ভ্রূণ) তার জন্য এক পূর্ণাকৃতির মানুষের আকার ধারণ করল।(যখন ভ্রূণ পূর্ণঅবয়ব ধারণ করে তখনই প্রান আসে)  \n\n \n\n" +
                " ০১৯:০১৮] সে(মরিয়ম) বলল, \"নিশ্চই আমি তোমার সম্পর্কে রহমান আল্লাহর কাছে আশ্রয় প্রার্থনা করি যাতে তুমি সচেতন হও।\"  \n\n \n\n" +
                " ০১৯:০১৯] সে(ইসার ভ্রূণ) বলল, \"আমি তোমার ক্রমবিকাশকের এক রাসুল (সংবাদ-বাহক) মাত্র, যেন আমি তোমাকে এক শুদ্ধ পুত্র-সন্তানের সুসংবাদ দান করি।\"  \n\n \n\n" +
                " ০১৯:০২০] সে(মরিয়ম) বলল, \" কিকরে আমার পুত্র-সন্তান হবে, যখন কোন পুরুষ আমাকে স্পর্শ করে নাই এবং আমি ব্যভিচারিণীও নই?\"  \n\n \n\n" +
                " ০১৯:০২১] সে(ইসার ভ্রূণ) বলল, \"এভাবেই(স্বনিষেক পদ্ধতিতে) হবে।\" তোমার ক্রমবিকাশক বলেছেন, \"এটি আমার জন্য সহজ; এবং এটি এজন্য করব, যেন আমরা তাকে আমাদের কাছ থেকে মানুষের জন্য একটি(একমাত্র) আয়াত(নিদর্শন) এবং রহমতের কারন করি; এবং এটি পূর্ব-নির্ধারিত আদেশ।\"  \n\n \n\n" +
                " ০১৯:০২২] অতএব সে(মরিয়ম) তাকে(ইসার ভ্রূণ) গর্ভে ধারণ করল এবং তাকে নিয়ে এক দূর-দেশে চলে গেল।  \n\n \n\n" +
                " ০১৯:০২৩] অতঃপর, যখন তার প্রসব-বেদনা তাকে এক খে্জুর-গাছের কান্ডের দিকে যেতে বাধ্য করল তখন সে(মরিয়ম) বলল, \"হায়, এর আগেই যদি আমি মরে যেতাম অথবা আমি সবকিছু ভুলে যেতাম।\"  \n\n \n\n" +
                " ০১৯:০২৪] তখন সে(ইসার ভ্রূণ) তাকে তার পেট থেকে(নীচের দিক থেকে) ডেকে বলল, \"তুমি দুঃখিত হবে না, অবশ্যই তোমার ক্রমবিকাশক তোমার নিচ দিয়ে একটি ছোটনদী প্রবাহিত করেছেন,  \n\n \n\n" +
                " ০১৯:০২৫] এবং তুমি খেজুরের কাঁদি ধরে ঝাঁকি দাও, তোমার দিকে পাকা খে্জুর ঝরে পড়বে;  \n\n \n\n" +
                " ০১৯:০২৬] সুতরাং খাও এবং পান কর এবং চক্ষুকে স্নিগ্ধ কর।\" এবং যদি তুমি কোন মানুষকে দেখ, তখন বলবে, \"আমি রহমানের উদ্দেশ্যে রোযা মানত করেছি; সুতরাং আজ আমি কোন মানুষের সাথে কথা বলতে পারব না।\"  \n\n \n\n" +
                " ০১৯:০২৭] অতঃপর সে(মরিয়ম) তাকে(ইসাকে) হাতে নিয়ে নিজ জাতির কাছে আসল; তারা বলল, \"হে মরিয়ম ! অবশ্যই তুমি অত্যন্ত অদ্ভুত বস্তু নিয়ে এসেছ।  \n\n \n\n" +
                " ০১৯:০২৮] হে হারূন নবীর জাতবোন ! না তোমার পিতা অসচ্চরিত্র ছিল, এবং না তোমার মাতা বেশ্যা ছিল!\"  \n\n \n\n" +
                " ০১৯:০২৯] তখন সে(মরিয়ম) তার(ইসার) দিকে ইশারা করল। তারা বলল, \"আমরা তার সাথে কেমন করে কথা বলতে পারি, যে এক দুধের শিশু?\"  \n\n \n\n" +
                " ০১৯:০৩০] সে(ইসা) বলল, \"নিশ্চই আমি আল্লাহর বান্দা, তিনি আমাকে গ্রন্থ দিয়েছেন এবং আমাকে নবী মনোনীত করেছেন।  \n\n \n\n" +
                " ০১৯:০৩১] এবং আমি যেখানেই থাকি না কেন তিনি আমাকে করেছেন জল-ঘেরা(কাশ্মীর ও প্যালেস্টাইন), এবং যতদিন আমি জীবিত থাকি তিনি আমাকে সালাত স্থাপন ও (দরিদ্রকে অন্ন ও বস্ত্র এককভাবে দান এবং দারিদ্রদূরিকরণে সম্মিলিতভাবে দানের মাধ্যমে)শুদ্ধতা অর্জন করার রক্ষক নিযূক্ত করেছেন;  \n\n \n\n" +
                " ০১৯:০৩২] এবং তিনি আমাকে আমার মাএর প্রতি সদাচারী করেছেন, এবং তিনি আমাকে উদ্ধত ও দূর্দশাগ্রস্থ বা সঙ্কটাপন্ন করেন নাই।  \n\n \n\n" +
                " ০১৯:০৩৩] এবং আমার উপর শান্তি –যেদিন আমি জন্মগ্রহণ করেছি এবং যেদিন আমি মৃত্যু বরণ করব এবং যেদিন আমাকে জীবিত করে পুনরুথিত করা হবে।\"  \n\n \n\n" +
                " ০১৯:০৩৪] এ হচ্ছে মরিয়মের পুত্র ঈসা\\'র বিজ্ঞান ভিত্তিক বিবরণ, যার সম্বন্ধে তারা বিতর্ক করছে।  \n\n \n\n" +
                " ০১৯:০৩৫] এটি আল্লাহর জন্য প্রযোজ্য নয় যে তিনি কোন পুত্র গ্রহণ করেন, তিনি নিয়মশীল। যখন তিনি কোন বিষয়ে পরিকল্পনা গ্রহন করেন তখন তিনি সেটির উদ্দশ্যে শুধু বলেন, \"হও\" অতঃপর সেটি হয়ে যায়।  \n\n \n\n" +
                " ০১৯:০৩৬] (ঈসা বলল) ‘নিশ্চই আল্লাহ্ আমারও ক্রমবিকাশক এবং তোমাদেরও ক্রমবিকাশক, সুতরাং কেবল তাঁরই সেবাকাজ(মহাকাশ বিজয়ের কাজ) কর এটিই সরল-ঊর্ধ্বগামী পথ।  \n\n \n\n" +
                " ০১৯:০৩৭] কিন্তু তাদের মধ্যে বিভিন্ন দল উল্টোটি করছে। সুতরাং সর্বনাশ তাদের জন্য যারা মহাদিবসে স্বাক্ষী(উপস্থিত) হওয়াকে অস্বীকার করে।  \n\n \n\n" +
                " ০১৯:০৩৮] সেদিন তারা কেমন ভাল শুনবে কেমন ভাল দেখবে যেদিন তারা আমাদের সামনে উপস্থিত হবে ! কিন্তু অন্যায়কারীরা আজ স্পষ্ট ভ্রান্তিতে পড়ে আছে।  \n\n \n\n" +
                " ০১৯:০৩৯] এবং আপনি তাদেরকে সতর্ক করুন হৃদয়-বিদারক দিন সম্বন্ধে , যখন সকল বিষয় মীমাংসা করে দেয়া হবে, কিন্তু তারা এখন ঔদাসীন্যে পড়ে আছে, তাই তারা আল্লাহর এককসত্বা মেনে নিচ্ছে না।  \n\n \n\n" +
                " ০১৯:০৪০] নিশ্চই আমরা পৃথিবীগুলোর একমাত্র মালিক হিসেবে টিকে থাকবো এবং তাদেরও, যারা এর উপর আছে, এবং তাদের সবাইকে আমাদের দিকেই ফিরিয়ে আনা হবে।  \n\n \n\n" +
                " ০১৯:০৪১] এবং এ গ্রন্থে(কুরআনে) আপনি ইব্রাহীমের উল্লেখ করুন, নিশ্চই সে পরম সত্যবাদী ও নবী ছিল।  \n\n \n\n" +
                " ০১৯:০৪২] যখন সে তার পিতাকে বলেছিল, \"হে আমার পিতা ! তুমি কেন ঐ সকল বস্তুর উপাশনা করছ যারা শুনেও না এবং দেখেও না এবং তোমার কোন উপকারও করে না?  \n\n \n\n" +
                " ০১৯:০৪৩] হে আমার পিতা! নিশ্চই আমার কাছে অবশ্যই এমন জ্ঞান এসেছে যা তোমার কাছে আসে নাই, সুতরাং তুমি আমার অনুসরণ কর, আমি তোমাকে শোধিত সুপথের নির্দেশনা দিব;  \n\n \n\n" +
                " ০১৯:০৪৪] হে আমার পিতা! তুমি শয়তানের(নিজ-স্বাধীন-ইচ্ছার) উপাশনা কোরও না, নিশ্চই শয়তান রহমান আল্লাহর অবাধ্য;  \n\n \n\n" +
                " ০১৯:০৪৫] হে আমার পিতা! নিশ্চই আমি ভয় করি যেন রহমান আল্লাহর(আবাধ্যতা জন্য) কোন দুঃখ-কষ্ট তোমাকে স্পর্শ না করে, এবং তুমি শয়তানের বন্ধু হয়ে যাও।\"  \n\n \n\n" +
                " ০১৯:০৪৬] সে বলল, \"হে ইব্রাহীম ! তুমি কি আমার উপাশ্যদের থেকে বিমুখ? যদি তুমি বিরত না হও, তাহলে আমি নিশ্চই তোমাকে তাড়িয়ে দিব, তারচেয়ে তুমি আমার থেকে বেশ কিছুকাল দূরে থাক।  \n\n \n\n" +
                " ০১৯:০৪৭] সে(ইব্রাহীম) বলল, তোমার উপর শান্তি বর্ষিত হোক ; নিশ্চই আমি আমার ক্রমবিকাশকের কাছে তোমার জন্য সংশোধন প্রার্থনা করব। নিশ্চই তিনি আমার প্রতি অত্যন্ত ত্বরিত;  \n\n \n\n" +
                " ০১৯:০৪৮] এবং আমি তোমাদের এবং, যাদেরকে তোমরা আল্লাহকে ছেড়ে ডাক, তাদের কাছ থেকে দূরে সরে যাব; এবং আমি আমার ক্রমবিকাশককে ডাকব এবং নিশ্চই আমি আমার ক্রমবিকাশকের কাছে প্রার্থনা করে কখনও বঞ্চিত হই না।  \n\n \n\n" +
                " ০১৯:০৪৯] সুতরাং যখন সে তাদের কাছ থেকে এবং তারা আল্লাহকে ছেড়ে যাদের উপাশনা করত তাদের থেকে বিচ্ছিন্ন হয়ে গেল; তখন আমরা তাকে দান করেছিলাম ইসহাক ও ইয়াকূবকে, এবং তাদের প্রত্যেককে আমরা নবী পদকে ভূষিত করেছিলাম।  \n\n \n\n" +
                " ০১৯:০৫০] এবং আমরা তাদেরকে দান করেছিলাম আামাদের রহমত, তদুপরি আমরা তাদেরকে দান করেছিলাম *অনুমোদিত মহান ভাষা*।  \n\n \n\n" +
                " ০১৯:০৫১] এবং এ গ্রন্থে(কুরআনে) আপনি মূসারও উল্লেখ করুন। নিশ্চই সে স্থিরসংকল্প-আন্তরিক-সৎ(বান্দা) ছিল এবং রসূল-নবী ছিল।  \n\n \n\n" +
                " ০১৯:০৫২] এবং আমরা তাকে তুর পর্বতের ডান পাশ থেকে ডাক দিয়েছিলাম এবং নিভৃতে আলাপ করার সময় তাকে নৈকট্য দান করেছিলাম।  \n\n \n\n" +
                " ০১৯:০৫৩] এবং আমরা তার জন্য আমাদের রহমত থেকে তার ভাই হারুনকেও (সাহায্যকারী)নবী হিসেবে দান করেছিলাম।  \n\n \n\n" +
                " ০১৯:০৫৪] এবং এ গ্রন্থে(কুরআনে) ইসমাঈলেরও উল্লেখ করুন, নিশ্চই সে প্রতিশ্রুতি পালনে সত্যনিষ্ঠ এবং রসূল-নবী ছিল।  \n\n \n\n" +
                " ০১৯:০৫৫] এবং সে তার পরিবার-পরিজনকে সালাত স্থাপন ও শুদ্ধতা অ্রর্জনের নির্দেশ দিত; এবং সে তার ক্রমবিকাশকের দৃষ্টিতে সন্তোষভাজন ছিল।  \n\n \n\n" +
                " ০১৯:০৫৬] এবং এ গ্রন্থে(কুরআনে) আপনি ইদরীসের উল্লেখ করুন, নিশ্চই সে পরম সত্যবাদী নবী ছিল।  \n\n \n\n" +
                " ০১৯:০৫৭] এবং আমরা তাকে অতি মহান অবস্থানে উন্নীত করেছিলাম।  \n\n \n\n" +
                " ০১৯:০৫৮] নবীরা, যাদেরকে আল্লাহ্ পুরস্কার দিয়েছেন, তারা বিজ্ঞানী সম্প্রদায়ের অন্তর্ভুক্ত, যাদেরকে আমরা নুহের সাথে (আশ্রয়-কেন্দ্রে) বহন করিয়েছিলাম, এবং ইব্রাহীম ও ইসরাঈলের সম্প্রদায়ের অন্তর্ভূক্ত এবং, যাদেরকে আমরা সুপথপ্রাপ্তির নির্দেশনা দিয়েছিলাম এবং উন্নিত করেছিলাম। যখনই তাদের কাছে রহমান আল্লাহর আয়াতগুলো পাঠ করা হত তখনই তারা সেজদায় পড়ে যেত এবং কান্নাকাটি করত।  \n\n \n\n" +
                " ০১৯:০৫৯] কিন্তু তাদের(আদম-নুহ-ইব্রাহীম-ইসহাকের) পরে এমন বংশধর স্থলাভিযিক্ত হল যারা সালাতকে নষ্ট-স্থানচ্যূত করে দিল এবং যৌনবিকৃতির অনুসরণ করল । সুতরাং অচিরেই তারা নীতিভ্রষ্টতার (শাস্তির) সম্মুখীন হবে-  \n\n \n\n" +
                " ০১৯:০৬০] কেবল সেসব লোক ছাড়া যারা প্রত্যাবর্তন করে, আল্লাহকে এককসত্বা মেনে নেয় এবং ভালকাজ করে, এসব লোক জান্নাতে প্রবেশ করবে এবং তাদের প্রতি কোন অন্যায় করা হবে না।  \n\n \n\n" +
                " ০১৯:০৬১] প্রচুর পরিমাণে আসতে থাকা জান্নাতগুলো, এবং তাঁর গুপ্ত-অদৃশ্য বান্দারা(মানব ভ্রূণ থেকে), যা রহমান আল্লাহর প্রতিশ্রুতি, নিশ্চই তাঁর প্রতিশ্রুতি অনুযায়ি অবশ্যই সেগুলো আসবে।  \n\n \n\n" +
                " ০১৯:০৬২] সেখানে তারা *সালাম*(শান্তি সদ্ভাষণ) ছাড়া কোন বৃথা আলাপ শুনবে না, এবং সেখানে তারা সকালে ও সন্ধ্যায় তাদের জীবিকা পেতে থাকবে।  \n\n \n\n" +
                " ০১৯:০৬৩] এগুলোই সে জান্নাত যেগুলোর উত্তরাধিকারী করব আমাদের সে বান্দাদের থেকে যারা হবে সচেতন।  \n\n \n\n" +
                " ০১৯:০৬৪] এবং আমরা(জিবরাইল বাহিনী) আপনার ক্রমবিকাশকের আদেশ ছাড়া অবতরণ করি না; যা আমাদের সামনে আছে এবং যা আমাদের পিছনে আছে এবং যা এসবের মধ্যে আছে সব কিছু তাঁর, এবং আপনার ক্রমবিকাশক কিছুই ভুলেন না।  \n\n \n\n" +
                " ০১৯:০৬৫] তিনিই বায়ুমন্ডলগুলোর ও পৃথিবীগুলোর এবং এগুলোর মধ্যে যাকিছু আছে সেসবের ক্রমবিকাশক, সুতরাং তাঁরই সেবাকাজ করুন এবং তাঁর সেবাকাজে ধৈর্য ধারণ করুন; আপনি কি কাউকেও তাঁরচেয়ে উঁচু জানেন?  \n\n \n\n" +
                " ০১৯:০৬৬] এবং মানুষ বলে থাকে, \"কী ! আমি যখন মরে যাব তখনও কি আমাকে পুনরায় জীবিত করে উঠানো হবে?\"  \n\n \n\n" +
                " ০১৯:০৬৭] মানুষ কি এটি স্মরণ করতে পারে না, আমরা ইতোপূর্বে যখন তাকে সৃষ্টি করেছি, তখন সে কিছুই ছিল না?  \n\n \n\n" +
                " ০১৯:০৬৮] অতএব, আপনার ক্রমবিকাশকের শপথ, নিশ্চই আমরা তাদেরকে এবং শয়তানদেরকে একত্রিত করব, অতঃপর আমরা তাদেরকে অনুতাপস্থলে চক্রাকারে নতজানু অবস্থায় উপস্থিত করব।  \n\n \n\n" +
                " ০১৯:০৬৯] তবে নিশ্চই আমরা প্রত্যেক উপদলের মধ্য থেকে তাদেরকে, যারা রহমান আল্লাহর প্রতি সর্বাধিক আগ্রাসী-হিংস্র-নিন্দনীয়, টেনে বের করে নিব।  \n\n \n\n" +
                " ০১৯:০৭০] এবং নিশ্চই আমরা তাদের সম্বন্ধে বিশেষভাবে অবহিত আছি যারা এতে দগ্ধ হওয়ার অধিকতর উপযুক্ত।  \n\n \n\n" +
                " ০১৯:০৭১] এবং আপনাদের মধ্যে এমন কেউ নেই যে এতে আগমন করবে না, এটি আপনার ক্রমবিকাশকের অবশ্যম্ভাবী সিদ্ধান্ত।  \n\n \n\n" +
                " ০১৯:০৭২] আবার, যারা সচেতনতা অবলম্বন করবে তাদেরকে আমরা রক্ষা করব, এবং অন্যায়কারীদেরকে সেটির মধ্যে নতজানু অবস্থায় ছেড়ে দেয়ার প্রতিজ্ঞা করছি।  \n\n \n\n" +
                " ০১৯:০৭৩] এবং যখন তাদেরকে আমাদের প্রামান্য আয়াতগুলো আবৃত্তি করে শুনানো হয় তখন অস্বীকারকারীরা স্বীকারকারীদের জন্যে বলে, \"(আমাদের) দুদলের মধ্যে কোনটি অবস্থানের দিক থেকে উত্তম এবং সভাসদ হিসেবে সেরা?\"  \n\n \n\n" +
                " ০১৯:০৭৪] এবং আমরা তাদের আগে অনেক অনেক প্রজন্মকে ধ্বংস করেছি যারা সাজ-সরঞ্জাম এবং মতবাদের দিক থেকে এদের অপেক্ষা শ্রেষ্ঠ ছিল।  \n\n \n\n" +
                " ০১৯:০৭৫] আপনি বলুন, যারা বিভ্রান্তিতে পড়ে আছে রহমান আল্লাহ্ তাদের জন্য মেয়াদ বাড়িয়ে দেন যতক্ষণ পর্যন্ত না তারা সেসব দেখে যার প্রতিশ্রুতি তাদেরকে দেয়া হয়েছে–হয়তো *দুঃখ-কষ্ট* নয়তো *স্থির-সময়*। সুতরাং অচিরেই তারা জানতে পারবে যে, কে অবস্থানের দিক থেকে  \n\n \n\n" +
                "নিকৃষ্টতর এবং কে সেনা-শিবিরের দিক থেকে দুর্বল।  \n\n \n\n" +
                " ০১৯:০৭৬] এবং আল্লাহ বৃদ্ধি করতে থাকেন সুপথপ্রাপ্তির নির্দেশনা, যারা সুপথপ্রাপ্তির নির্দেশনা গ্রহন করে; এবং স্থায়ী ভালকাজ আপনার ক্রমবিকাশকের দৃষ্টিতে সর্বোত্তম, পুরস্কারের দিক থেকেও এবং পুনরাবৃত্তির দিক থেকেও।  \n\n \n\n" +
                " ০১৯:০৭৭] এবং আপনি কি তাকে দেখেন নাই, যে আমাদের আয়াত(নিদর্শন) গুলোকে অস্বীকার করে এবং বলে, \"আমাকে নিশ্চই অনেক ধন-সম্পদ এবং অনেক সন্তান সন্ততি দেয়া হবে?\"  \n\n \n\n" +
                " ০১৯:০৭৮] সে কি গুপ্ত-সংবাদ খুঁজে পেয়েছে অথবা রহমান আল্লাহর কাছ থেকে কোন প্রতিশ্রুতি নিয়েছে?  \n\n \n\n" +
                " ০১৯:০৭৯] কখনও নয়, আমরা অবশ্যই লিপিবদ্ধ করে রাখছি সে যা বলছে, এবং তার জন্য দুঃখ-কষ্টকে দীর্ঘায়িত করে দিব।  \n\n \n\n" +
                " ০১৯:০৮০] এবং সে যা বলছে আমরা সেসবের অধিকারী হব এবং সে আমাদের কাছে আসবে একাকী।  \n\n \n\n" +
                " ০১৯:০৮১] এবং তারা আল্লাহর পরিবর্তে অন্যান্য অনেককে (পীর-পুরোহিত-যাযক-হুজুরদেরকে) উপাশ্য হিসেবে গ্রহণ করেছে যেন তারা তাদের জন্য সম্মানের কারণ হতে পারে।  \n\n \n\n" +
                " ০১৯:০৮২] কখনও নয়, অচিরেই তারা (পীর-পুরোহিত-যাযক-হুজুররা) তাদের উপাশনাকে অস্বীকার করবে এবং তাদের বিরুদ্ধে দাঁড়াবে।  \n\n \n\n" +
                " ০১৯:০৮৩] আপনি কি দেখেন নাই যে, আমরা শয়তানদেরকে অস্বীকারকারীদের উপর লেলিয়ে দিয়েছি? তারা তাদেরকে (মন্দ কাজে) দুর্বার-উৎসাহী করে তোলে।  \n\n \n\n" +
                " ০১৯:০৮৪] সুতরাং আপনি তাদের বিরুদ্ধেতাড়াহুড়া করবেন না, আমরা যথার্থভবে তাদের জন্য (তাদের কাজ) গুণে রাখছি।  \n\n \n\n" +
                " ০১৯:০৮৫] সেদিন আমরা সচেতনদেরকে রহমান আল্লাহর সামনে সম্মানিত প্রতিনিধি হিসেবে একত্রিত করব;  \n\n \n\n" +
                " ০১৯:০৮৬] এবং আমরা অপরাধীদেরকে তৃষ্ণার্ত উটের পালের মত অনুতাপস্থলের দিকে তাড়িয়ে নিয়ে যাব।  \n\n \n\n" +
                " ০১৯:০৮৭] সেদিন কারও অধিকার থাকবে না মধ্যস্থতাকারী হিসেবে কথা বলার, শুধু সে(সাক্ষী-ফেরেস্তা) ছাড়া, যে রহমান আল্লাহর কাছ থেকে প্রতিশ্রুত-দায়িত্ব নিয়েছে।  \n\n \n\n" +
                " ০১৯:০৮৮] এবং তারা বলে, \"রহমান আল্লাহ্ পুত্র গ্রহণ করেছেন।\"  \n\n \n\n" +
                " ০১৯:০৮৯] অবশ্যই তোমরা এক অত্যন্ত অমার্জিত কথা বলছ।  \n\n \n\n" +
                " ০১৯:০৯০] বায়ুমণ্ডলগুলো প্রায় তাদের আদিম অবস্থায় ফিরে যাওয়ার ও পৃথিবীগুলো বিস্ফোরিত হওয়ার এবং পর্বতগুলো খন্ডবিখন্ড হয়ে পড়ে  \n\n \n\n" +
                "যাওয়ার উপক্রম হয়েছে।  \n\n \n\n" +
                " ০১৯:০৯১] কারণ তারা রহমান আল্লাহর পুত্র(ক্ষূদ্র পৃথকসত্বা) আছে বলছে।  \n\n \n\n" +
                " ০১৯:০৯২] অথচ রহমান আল্লাহর এককসত্বায় কোন ক্ষূদ্র পৃথকসত্বা গ্রহণ করা সম্ভব নয়।  \n\n \n\n" +
                " ০১৯:০৯৩] বায়ুমণ্ডলগুলোতে ও পৃথিবীগুলোতে এমন কেউ নেই যে রহমান আল্লাহর বান্দা ছাড়া অন্য কিছু হিসেবে উপস্থিত হতে পারে।  \n\n \n\n" +
                " ০১৯:০৯৪] অবশ্যই তিনি তাদেরকে নথিভূক্ত করে রাখছেন এবং বিচক্ষণতার সাথে গুনে গুণে রাখছেন।  \n\n \n\n" +
                " ০১৯:০৯৫] এবং তারা প্রত্যেকে পুনরুত্থানের দিন একে একে তাঁর সামনে উপস্থিত হবে।  \n\n \n\n" +
                " ০১৯:০৯৬] নিশ্চই যারা আল্লাহর এককসত্বা মেনে নেয় এবং ভালকাজ করে রহমান আল্লাহ্ তাদের জন্য গভীর ভালবাসা সৃষ্টি করে দিবেন।  \n\n \n\n" +
                " ০১৯:০৯৭] সুতরাং এটিকে(কুরআনকে) আপনার ভাষায় আমরা সহজবোধ্য করেছি, আপনি এটি দিয়ে সচেতনদেরকে সুসংবাদ দেয়ার জন্য এবং কলহপরায়ণ জাতিকে সতর্ক করার জন্য।  \n\n \n\n" +
                " ০১৯:০৯৮] এবং আমরা তাদের পূর্বে কতই না মানব-প্রজন্ম ধ্বংস করে দিয়েছি ! আপনি কি তাদের মধ্য কাউকে অনুভব করছেন অথবা তাদের মৃদু শব্দও শুনতে পাচ্ছেন?  \n\n \n\n");

        editor.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            listView.setVisibility(View.VISIBLE);
            suraTxt.setVisibility(View.GONE);
        }
        return super.onOptionsItemSelected(item);
    }

}
