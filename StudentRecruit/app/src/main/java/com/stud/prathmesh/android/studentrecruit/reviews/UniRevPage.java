package com.stud.prathmesh.android.studentrecruit.reviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.stud.prathmesh.android.studentrecruit.R;


public class UniRevPage extends AppCompatActivity {

    Toolbar mToolbar;
    TextView univHeadText;

    TextView aboutContent;
    TextView infrastContent;
    TextView facultyContent;
    TextView aidContent;
    TextView jobContent;
    TextView lifeContent;
    TextView verdict;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni_rev_page);

        mToolbar =(Toolbar)findViewById(R.id.university_review_toolbar);
        univHeadText =(TextView) findViewById(R.id.university_header);



        aboutContent =(TextView) findViewById(R.id.about_content);
        infrastContent =(TextView) findViewById(R.id.infrastruc_content);
        facultyContent =(TextView) findViewById(R.id.faculty_content);
        aidContent =(TextView) findViewById(R.id.aid_content);
        jobContent =(TextView) findViewById(R.id.jobs_content);
        lifeContent =(TextView) findViewById(R.id.life_content);
        verdict =(TextView) findViewById(R.id.verdict_content);



        openEachUnivRevPage();
    }




    private void openEachUnivRevPage() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mToolbar.setTitle(bundle.getString("university_title_name"));
            univHeadText.setText(bundle.getString("university_title_name"));


            if (mToolbar.getTitle().toString().equalsIgnoreCase(("Arizona State University"))) {

                 

                aboutContent.setText(getString(R.string.uni1_1));
                infrastContent.setText(getString(R.string.uni1_2));
                facultyContent.setText(getString(R.string.uni1_3));
                aidContent.setText(getString(R.string.uni1_4));
                jobContent.setText(getString(R.string.uni1_5));
                lifeContent.setText(getString(R.string.uni1_6));
                verdict.setText(getString(R.string.uni1_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Northeastern University"))) {


                 

                aboutContent.setText(getString(R.string.uni2_1));
                infrastContent.setText(getString(R.string.uni2_2));
                facultyContent.setText(getString(R.string.uni2_3));
                aidContent.setText(getString(R.string.uni2_4));
                jobContent.setText(getString(R.string.uni2_5));
                lifeContent.setText(getString(R.string.uni2_6));
                verdict.setText(getString(R.string.uni2_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Texas A&amp;M University, College Station"))) {


                 

                aboutContent.setText(getString(R.string.uni3_1));
                infrastContent.setText(getString(R.string.uni3_2));
                facultyContent.setText(getString(R.string.uni3_3));
                aidContent.setText(getString(R.string.uni3_4));
                jobContent.setText(getString(R.string.uni3_5));
                lifeContent.setText(getString(R.string.uni3_6));
                verdict.setText(getString(R.string.uni3_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Southern California (USC Viterbi)"))) {


                 

                aboutContent.setText(getString(R.string.uni4_1));
                infrastContent.setText(getString(R.string.uni4_2));
                facultyContent.setText(getString(R.string.uni4_3));
                aidContent.setText(getString(R.string.uni4_4));
                jobContent.setText(getString(R.string.uni4_5));
                lifeContent.setText(getString(R.string.uni4_6));
                verdict.setText(getString(R.string.uni4_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Texas - Dallas (UTD)"))) {


                 

                aboutContent.setText(getString(R.string.uni5_1));
                infrastContent.setText(getString(R.string.uni5_2));
                facultyContent.setText(getString(R.string.uni5_3));
                aidContent.setText(getString(R.string.uni5_4));
                jobContent.setText(getString(R.string.uni5_5));
                lifeContent.setText(getString(R.string.uni5_6));
                verdict.setText(getString(R.string.uni5_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Texas - Arlington (UT Arlingt)"))) {


                 

                aboutContent.setText(getString(R.string.uni6_1));
                infrastContent.setText(getString(R.string.uni6_2));
                facultyContent.setText(getString(R.string.uni6_3));
                aidContent.setText(getString(R.string.uni6_4));
                jobContent.setText(getString(R.string.uni6_5));
                lifeContent.setText(getString(R.string.uni6_6));
                verdict.setText(getString(R.string.uni6_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("State University of New York at Buffalo (SUNY Buffalo)"))) {


                 

                aboutContent.setText(getString(R.string.uni7_1));
                infrastContent.setText(getString(R.string.uni7_2));
                facultyContent.setText(getString(R.string.uni7_3));
                aidContent.setText(getString(R.string.uni7_4));
                jobContent.setText(getString(R.string.uni7_5));
                lifeContent.setText(getString(R.string.uni7_6));
                verdict.setText(getString(R.string.uni7_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("North Carolina State University, Raleigh (NCSU)"))) {


                 

                aboutContent.setText(getString(R.string.uni8_1));
                infrastContent.setText(getString(R.string.uni8_2));
                facultyContent.setText(getString(R.string.uni8_3));
                aidContent.setText(getString(R.string.uni8_4));
                jobContent.setText(getString(R.string.uni8_5));
                lifeContent.setText(getString(R.string.uni8_6));
                verdict.setText(getString(R.string.uni8_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Georgia Institute of Technology (GaTech)"))) {


                 

                aboutContent.setText(getString(R.string.uni9_1));
                infrastContent.setText(getString(R.string.uni9_2));
                facultyContent.setText(getString(R.string.uni9_3));
                aidContent.setText(getString(R.string.uni9_4));
                jobContent.setText(getString(R.string.uni9_5));
                lifeContent.setText(getString(R.string.uni9_6));
                verdict.setText(getString(R.string.uni9_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Illinois at Chicago (UIC)"))) {


                 

                aboutContent.setText(getString(R.string.uni10_1));
                infrastContent.setText(getString(R.string.uni10_2));
                facultyContent.setText(getString(R.string.uni10_3));
                aidContent.setText(getString(R.string.uni10_4));
                jobContent.setText(getString(R.string.uni10_5));
                lifeContent.setText(getString(R.string.uni10_6));
                verdict.setText(getString(R.string.uni10_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Texas - Austin (UT Austin)"))) {


                 

                aboutContent.setText(getString(R.string.uni11_1));
                infrastContent.setText(getString(R.string.uni11_2));
                facultyContent.setText(getString(R.string.uni11_3));
                aidContent.setText(getString(R.string.uni11_4));
                jobContent.setText(getString(R.string.uni11_5));
                lifeContent.setText(getString(R.string.uni11_6));
                verdict.setText(getString(R.string.uni11_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Illinois Institute of Technology (IIT Chicago)"))) {


                 

                aboutContent.setText(getString(R.string.uni12_1));                      //this univ
                infrastContent.setText(getString(R.string.uni12_2));
                facultyContent.setText(getString(R.string.uni12_3));
                aidContent.setText(getString(R.string.uni12_4));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("New York University (NYU)"))) {


                 

                aboutContent.setText(getString(R.string.uni13_1));
                infrastContent.setText(getString(R.string.uni13_2));
                facultyContent.setText(getString(R.string.uni13_3));
                aidContent.setText(getString(R.string.uni13_4));
                jobContent.setText(getString(R.string.uni13_5));
                lifeContent.setText(getString(R.string.uni13_6));
                verdict.setText(getString(R.string.uni13_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of North Carolina at Charlotte (UNCC)"))) {


                 

                aboutContent.setText(getString(R.string.uni14_1));
                infrastContent.setText(getString(R.string.uni14_2));
                facultyContent.setText(getString(R.string.uni14_3));
                aidContent.setText(getString(R.string.uni14_4));
                jobContent.setText(getString(R.string.uni14_5));
                lifeContent.setText(getString(R.string.uni14_6));
                verdict.setText(getString(R.string.uni14_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("San Jose State University (SJSU)"))) {


                 

                aboutContent.setText(getString(R.string.uni15_1));
                infrastContent.setText(getString(R.string.uni15_2));
                facultyContent.setText(getString(R.string.uni15_3));
                aidContent.setText(getString(R.string.uni15_4));
                jobContent.setText(getString(R.string.uni15_5));
                lifeContent.setText(getString(R.string.uni15_6));
                verdict.setText(getString(R.string.uni15_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Carnegie Mellon University (CMU)"))) {


                 

                aboutContent.setText(getString(R.string.uni16_1));
                infrastContent.setText(getString(R.string.uni16_2));
                facultyContent.setText(getString(R.string.uni16_3));
                aidContent.setText(getString(R.string.uni16_4));
                jobContent.setText(getString(R.string.uni16_5));
                lifeContent.setText(getString(R.string.uni16_6));
                verdict.setText(getString(R.string.uni16_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Maryland, College Park (UMCP)"))) {


                 

                aboutContent.setText(getString(R.string.uni17_1));
                infrastContent.setText(getString(R.string.uni17_2));
                facultyContent.setText(getString(R.string.uni17_3));
                aidContent.setText(getString(R.string.uni17_4));
                jobContent.setText(getString(R.string.uni17_5));
                lifeContent.setText(getString(R.string.uni17_6));
                verdict.setText(getString(R.string.uni17_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Purdue University West Lafayette (Purdue)"))) {


                 

                aboutContent.setText(getString(R.string.uni18_1));
                infrastContent.setText(getString(R.string.uni18_2));
                facultyContent.setText(getString(R.string.uni18_3));
                aidContent.setText(getString(R.string.uni18_4));
                jobContent.setText(getString(R.string.uni18_5));
                lifeContent.setText(getString(R.string.uni18_6));
                verdict.setText(getString(R.string.uni18_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Pennsylvania State University (Penn State)"))) {


                 

                aboutContent.setText(getString(R.string.uni19_1));
                infrastContent.setText(getString(R.string.uni19_2));
                facultyContent.setText(getString(R.string.uni19_3));
                aidContent.setText(getString(R.string.uni19_4));
                jobContent.setText(getString(R.string.uni19_5));
                lifeContent.setText(getString(R.string.uni19_6));
                verdict.setText(getString(R.string.uni19_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of California - San Diego (UCSD"))) {


                 

                aboutContent.setText(getString(R.string.uni20_1));
                infrastContent.setText(getString(R.string.uni20_2));
                facultyContent.setText(getString(R.string.uni20_3));
                aidContent.setText(getString(R.string.uni20_4));
                jobContent.setText(getString(R.string.uni20_5));
                lifeContent.setText(getString(R.string.uni20_6));
                verdict.setText(getString(R.string.uni20_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Minnesota, Twin Cities (UM Twin)"))) {


                 

                aboutContent.setText(getString(R.string.uni21_1));
                infrastContent.setText(getString(R.string.uni21_2));
                facultyContent.setText(getString(R.string.uni21_3));
                aidContent.setText(getString(R.string.uni21_4));
                jobContent.setText(getString(R.string.uni21_5));
                lifeContent.setText(getString(R.string.uni21_6));
                verdict.setText(getString(R.string.uni21_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Syracuse University (Syracuse)"))) {


                 

                aboutContent.setText(getString(R.string.uni22_1));
                infrastContent.setText(getString(R.string.uni22_2));
                facultyContent.setText(getString(R.string.uni22_3));
                aidContent.setText(getString(R.string.uni22_4));
                jobContent.setText(getString(R.string.uni22_5));
                lifeContent.setText(getString(R.string.uni22_6));
                verdict.setText(getString(R.string.uni22_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of California - Irvine (UC Irvine"))) {


                 

                aboutContent.setText(getString(R.string.uni23_1));
                infrastContent.setText(getString(R.string.uni23_2));
                facultyContent.setText(getString(R.string.uni23_3));
                aidContent.setText(getString(R.string.uni23_4));
                jobContent.setText(getString(R.string.uni23_5));
                lifeContent.setText(getString(R.string.uni23_6));
                verdict.setText(getString(R.string.uni23_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Rochester Institute of Technology (RIT)"))) {


                 

                aboutContent.setText(getString(R.string.uni24_1));
                infrastContent.setText(getString(R.string.uni24_2));
                facultyContent.setText(getString(R.string.uni24_3));
                aidContent.setText(getString(R.string.uni24_4));
                jobContent.setText(getString(R.string.uni24_5));
                lifeContent.setText(getString(R.string.uni24_6));
                verdict.setText(getString(R.string.uni24_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Virginia Tech (Virg. Tech)"))) {


                 

                aboutContent.setText(getString(R.string.uni25_1));
                infrastContent.setText(getString(R.string.uni25_2));
                facultyContent.setText(getString(R.string.uni25_3));
                aidContent.setText(getString(R.string.uni25_4));
                jobContent.setText(getString(R.string.uni25_5));
                lifeContent.setText(getString(R.string.uni25_6));
                verdict.setText(getString(R.string.uni25_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Michigan - Ann Arbor (U Mich)"))) {


                 

                aboutContent.setText(getString(R.string.uni26_1));
                infrastContent.setText(getString(R.string.uni26_2));
                facultyContent.setText(getString(R.string.uni26_3));
                aidContent.setText(getString(R.string.uni26_4));
                jobContent.setText(getString(R.string.uni26_5));
                lifeContent.setText(getString(R.string.uni26_6));
                verdict.setText(getString(R.string.uni26_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Illinois at Urbana-Champaign (UIUC)"))) {


                 

                aboutContent.setText(getString(R.string.uni27_1));
                infrastContent.setText(getString(R.string.uni27_2));
                facultyContent.setText(getString(R.string.uni27_3));
                aidContent.setText(getString(R.string.uni27_4));
                jobContent.setText(getString(R.string.uni27_5));
                lifeContent.setText(getString(R.string.uni27_6));
                verdict.setText(getString(R.string.uni27_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("State University of New York at Stony Brook (SUNY-SB)"))) {


                 


                aboutContent.setText(getString(R.string.uni28_1));
                infrastContent.setText(getString(R.string.uni28_2));
                facultyContent.setText(getString(R.string.uni28_3));
                aidContent.setText(getString(R.string.uni28_4));
                jobContent.setText(getString(R.string.uni28_5));
                lifeContent.setText(getString(R.string.uni28_6));
                verdict.setText(getString(R.string.uni28_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of California - Los Angeles (UCLA)"))) {


                 


                aboutContent.setText(getString(R.string.uni29_1));
                infrastContent.setText(getString(R.string.uni29_2));
                facultyContent.setText(getString(R.string.uni29_3));
                aidContent.setText(getString(R.string.uni29_4));
                jobContent.setText(getString(R.string.uni29_5));
                lifeContent.setText(getString(R.string.uni29_6));
                verdict.setText(getString(R.string.uni29_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Iowa State University (Iowa State)"))) {


                 

                aboutContent.setText(getString(R.string.uni30_1));
                infrastContent.setText(getString(R.string.uni30_2));
                facultyContent.setText(getString(R.string.uni30_3));
                aidContent.setText(getString(R.string.uni30_4));
                jobContent.setText(getString(R.string.uni30_5));
                lifeContent.setText(getString(R.string.uni30_6));
                verdict.setText(getString(R.string.uni30_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Michigan State University (Mich. SU)"))) {


                 

                aboutContent.setText(getString(R.string.uni31_1));
                infrastContent.setText(getString(R.string.uni31_2));
                facultyContent.setText(getString(R.string.uni31_3));
                aidContent.setText(getString(R.string.uni31_4));
                jobContent.setText(getString(R.string.uni31_5));
                lifeContent.setText(getString(R.string.uni31_6));
                verdict.setText(getString(R.string.uni31_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Houston (U. Houston) "))) {


                 

                aboutContent.setText(getString(R.string.uni32_1));
                infrastContent.setText(getString(R.string.uni32_2));
                facultyContent.setText(getString(R.string.uni32_3));
                aidContent.setText(getString(R.string.uni32_4));
                jobContent.setText(getString(R.string.uni32_5));
                lifeContent.setText(getString(R.string.uni32_6));
                verdict.setText(getString(R.string.uni32_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Massachusetts - Amherst (Umass Am)"))) {


                 

                aboutContent.setText(getString(R.string.uni33_1));
                infrastContent.setText(getString(R.string.uni33_2));
                facultyContent.setText(getString(R.string.uni33_3));
                aidContent.setText(getString(R.string.uni33_4));
                jobContent.setText(getString(R.string.uni33_5));
                lifeContent.setText(getString(R.string.uni33_6));
                verdict.setText(getString(R.string.uni33_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Cincinnati (U.Cincin)"))) {


                 

                aboutContent.setText(getString(R.string.uni34_1));
                infrastContent.setText(getString(R.string.uni34_2));
                facultyContent.setText(getString(R.string.uni34_3));
                aidContent.setText(getString(R.string.uni34_4));
                jobContent.setText(getString(R.string.uni34_5));
                lifeContent.setText(getString(R.string.uni34_6));
                verdict.setText(getString(R.string.uni34_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Rutgers University - New Brunswick (Rutgers NB)"))) {


                 

                aboutContent.setText(getString(R.string.uni35_1));
                infrastContent.setText(getString(R.string.uni35_2));
                facultyContent.setText(getString(R.string.uni35_3));
                aidContent.setText(getString(R.string.uni35_4));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Colorado Boulder (Boulder)"))) {


                 

                aboutContent.setText(getString(R.string.uni36_1));
                infrastContent.setText(getString(R.string.uni36_2));
                facultyContent.setText(getString(R.string.uni36_3));
                aidContent.setText(getString(R.string.uni36_4));
                jobContent.setText(getString(R.string.uni36_5));
                lifeContent.setText(getString(R.string.uni36_6));
                verdict.setText(getString(R.string.uni36_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Columbia University (Columbia)"))) {


                 

                aboutContent.setText(getString(R.string.uni37_1));
                infrastContent.setText(getString(R.string.uni37_2));
                facultyContent.setText(getString(R.string.uni37_3));
                aidContent.setText(getString(R.string.uni37_4));
                jobContent.setText(getString(R.string.uni37_5));
                lifeContent.setText(getString(R.string.uni37_6));
                verdict.setText(getString(R.string.uni37_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("New Jersey Institute of Technology (NJIT)"))) {


                 

                aboutContent.setText(getString(R.string.uni38_1));
                infrastContent.setText(getString(R.string.uni38_2));
                facultyContent.setText(getString(R.string.uni38_3));
                aidContent.setText(getString(R.string.uni38_4));
                jobContent.setText(getString(R.string.uni38_5));
                lifeContent.setText(getString(R.string.uni38_6));
                verdict.setText(getString(R.string.uni38_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Wisconsin-Madison (UW Mad) "))) {


                 

                aboutContent.setText(getString(R.string.uni39_1));                          //thisuniv
                infrastContent.setText(getString(R.string.uni39_2));
                facultyContent.setText(getString(R.string.uni39_3));
                aidContent.setText(getString(R.string.uni39_4));
                jobContent.setText(getString(R.string.uni39_5));
                lifeContent.setText(getString(R.string.uni39_6));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Clemson University (Clemson)"))) {


                 

                aboutContent.setText(getString(R.string.uni40_1));
                infrastContent.setText(getString(R.string.uni40_2));
                facultyContent.setText(getString(R.string.uni40_3));
                aidContent.setText(getString(R.string.uni40_4));
                jobContent.setText(getString(R.string.uni40_5));
                lifeContent.setText(getString(R.string.uni40_6));
                verdict.setText(getString(R.string.uni40_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Pennsylvania (UPenn)"))) {


                 

                aboutContent.setText(getString(R.string.uni41_1));
                infrastContent.setText(getString(R.string.uni41_2));
                facultyContent.setText(getString(R.string.uni41_3));
                aidContent.setText(getString(R.string.uni41_4));
                jobContent.setText(getString(R.string.uni41_5));
                lifeContent.setText(getString(R.string.uni41_6));
                verdict.setText(getString(R.string.uni41_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("California State University, Fullerton (Fullerton)"))) {


                 

                aboutContent.setText(getString(R.string.uni42_1));
                infrastContent.setText(getString(R.string.uni42_2));
                facultyContent.setText(getString(R.string.uni42_3));
                aidContent.setText(getString(R.string.uni42_4));
                jobContent.setText(getString(R.string.uni42_5));
                lifeContent.setText(getString(R.string.uni42_6));
                verdict.setText(getString(R.string.uni42_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Ohio State University (OSU)"))) {


                 

                aboutContent.setText(getString(R.string.uni43_1));
                infrastContent.setText(getString(R.string.uni43_2));
                facultyContent.setText(getString(R.string.uni43_3));
                aidContent.setText(getString(R.string.uni43_4));
                jobContent.setText(getString(R.string.uni43_5));
                lifeContent.setText(getString(R.string.uni43_6));
                verdict.setText(getString(R.string.uni43_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Stevens Institute of Technology (Stevens IT)"))) {


                 

                aboutContent.setText(getString(R.string.uni44_1));
                infrastContent.setText(getString(R.string.uni44_2));
                facultyContent.setText(getString(R.string.uni44_3));
                aidContent.setText(getString(R.string.uni44_4));
                jobContent.setText(getString(R.string.uni44_5));
                lifeContent.setText(getString(R.string.uni44_6));
                verdict.setText(getString(R.string.uni44_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Cornell University (Cornell) "))) {


                 

                aboutContent.setText(getString(R.string.uni45_1));
                infrastContent.setText(getString(R.string.uni45_2));
                facultyContent.setText(getString(R.string.uni45_3));
                aidContent.setText(getString(R.string.uni45_4));
                jobContent.setText(getString(R.string.uni45_5));
                lifeContent.setText(getString(R.string.uni45_6));
                verdict.setText(getString(R.string.uni45_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of California - Davis (UC Davis)"))) {


                 

                aboutContent.setText(getString(R.string.uni46_1));
                infrastContent.setText(getString(R.string.uni46_2));
                facultyContent.setText(getString(R.string.uni46_3));
                aidContent.setText(getString(R.string.uni46_4));
                jobContent.setText(getString(R.string.uni46_5));
                lifeContent.setText(getString(R.string.uni46_6));
                verdict.setText(getString(R.string.uni46_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("San Diego State University (SDSU) "))) {


                 

                aboutContent.setText(getString(R.string.uni47_1));                       //thisuniv
                infrastContent.setText(getString(R.string.uni47_2));
                facultyContent.setText(getString(R.string.uni47_3));
                aidContent.setText(getString(R.string.uni47_4));
                jobContent.setText(getString(R.string.uni47_5));
                lifeContent.setText(getString(R.string.uni47_6));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of California – Berkeley (UC Berkeley)"))) {


                 

                aboutContent.setText(getString(R.string.uni48_1));
                infrastContent.setText(getString(R.string.uni48_2));
                facultyContent.setText(getString(R.string.uni48_3));
                aidContent.setText(getString(R.string.uni48_4));
                jobContent.setText(getString(R.string.uni48_5));
                lifeContent.setText(getString(R.string.uni48_6));
                verdict.setText(getString(R.string.uni48_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of South Florida (USF)"))) {


                 

                aboutContent.setText(getString(R.string.uni49_1));
                infrastContent.setText(getString(R.string.uni49_2));
                facultyContent.setText(getString(R.string.uni49_3));
                aidContent.setText(getString(R.string.uni49_4));
                jobContent.setText(getString(R.string.uni49_5));
                lifeContent.setText(getString(R.string.uni49_6));
                verdict.setText(getString(R.string.uni49_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Michigan Technological University (MTU)"))) {


                 

                aboutContent.setText(getString(R.string.uni50_1));
                infrastContent.setText(getString(R.string.uni50_2));
                facultyContent.setText(getString(R.string.uni50_3));
                aidContent.setText(getString(R.string.uni50_4));
                jobContent.setText(getString(R.string.uni50_5));
                lifeContent.setText(getString(R.string.uni50_6));
                verdict.setText(getString(R.string.uni50_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Rutgers University, Newark (Rutgers) "))) {


                 

                aboutContent.setText(getString(R.string.uni51_1));
                infrastContent.setText(getString(R.string.uni51_2));
                facultyContent.setText(getString(R.string.uni51_3));
                aidContent.setText(getString(R.string.uni51_4));
                jobContent.setText(getString(R.string.uni51_5));
                lifeContent.setText(getString(R.string.uni51_6));
                verdict.setText(getString(R.string.uni51_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Utah (Utah)"))) {


                 

                aboutContent.setText(getString(R.string.uni52_1));
                infrastContent.setText(getString(R.string.uni52_2));
                facultyContent.setText(getString(R.string.uni52_3));
                aidContent.setText(getString(R.string.uni52_4));
                jobContent.setText(getString(R.string.uni52_5));
                lifeContent.setText(getString(R.string.uni52_6));
                verdict.setText(getString(R.string.uni52_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("West Virginia University, Morgantown (WVU)"))) {


                 

                aboutContent.setText(getString(R.string.uni53_1));
                infrastContent.setText(getString(R.string.uni53_2));
                facultyContent.setText(getString(R.string.uni53_3));
                aidContent.setText(getString(R.string.uni53_4));
                jobContent.setText(getString(R.string.uni53_5));
                lifeContent.setText(getString(R.string.uni53_6));
                verdict.setText(getString(R.string.uni53_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Washington (UW Seattle)"))) {


                 

                aboutContent.setText(getString(R.string.uni54_1));                       //thisuniv
                infrastContent.setText(getString(R.string.uni54_2));
                facultyContent.setText(getString(R.string.uni54_3));
                aidContent.setText(getString(R.string.uni54_4));
                jobContent.setText(getString(R.string.uni54_5));
                lifeContent.setText(getString(R.string.uni54_6));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("George Mason University (GMU)"))) {


                 

                aboutContent.setText(getString(R.string.uni55_1));
                infrastContent.setText(getString(R.string.uni55_2));
                facultyContent.setText(getString(R.string.uni55_3));
                aidContent.setText(getString(R.string.uni55_4));
                jobContent.setText(getString(R.string.uni55_5));
                lifeContent.setText(getString(R.string.uni55_6));
                verdict.setText(getString(R.string.uni55_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("West Virginia University, Morgantown (WVU)"))) {


                 

                aboutContent.setText(getString(R.string.uni56_1));
                infrastContent.setText(getString(R.string.uni56_2));
                facultyContent.setText(getString(R.string.uni56_3));
                aidContent.setText(getString(R.string.uni56_4));
                jobContent.setText(getString(R.string.uni56_5));
                lifeContent.setText(getString(R.string.uni56_6));
                verdict.setText(getString(R.string.uni56_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase((")Massachusetts Institute of Technology (MIT)"))) {


                 

                aboutContent.setText(getString(R.string.uni57_1));
                infrastContent.setText(getString(R.string.uni57_2));
                facultyContent.setText(getString(R.string.uni57_3));
                aidContent.setText(getString(R.string.uni57_4));
                jobContent.setText(getString(R.string.uni57_5));
                lifeContent.setText(getString(R.string.uni57_6));
                verdict.setText(getString(R.string.uni57_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase((" Northwestern University (NWU"))) {


                 

                aboutContent.setText(getString(R.string.uni58_1));
                infrastContent.setText(getString(R.string.uni58_2));
                facultyContent.setText(getString(R.string.uni58_3));
                aidContent.setText(getString(R.string.uni58_4));
                jobContent.setText(getString(R.string.uni58_5));
                lifeContent.setText(getString(R.string.uni58_6));
                verdict.setText(getString(R.string.uni58_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase((" Santa Clara University (Santa Clara)"))) {


                 

                aboutContent.setText(getString(R.string.uni59_1));
                infrastContent.setText(getString(R.string.uni59_2));
                facultyContent.setText(getString(R.string.uni59_3));
                aidContent.setText(getString(R.string.uni59_4));
                jobContent.setText(getString(R.string.uni59_5));
                lifeContent.setText(getString(R.string.uni59_6));
                verdict.setText(getString(R.string.uni59_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Boston University (BU)"))) {


                 

                aboutContent.setText(getString(R.string.uni60_1));
                infrastContent.setText(getString(R.string.uni60_2));
                facultyContent.setText(getString(R.string.uni60_3));
                aidContent.setText(getString(R.string.uni60_4));
                jobContent.setText(getString(R.string.uni60_5));
                lifeContent.setText(getString(R.string.uni60_6));
                verdict.setText(getString(R.string.uni60_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Stanford University (Stanford)"))) {


                 

                aboutContent.setText(getString(R.string.uni61_1));
                infrastContent.setText(getString(R.string.uni61_2));
                facultyContent.setText(getString(R.string.uni61_3));
                aidContent.setText(getString(R.string.uni61_4));
                jobContent.setText(getString(R.string.uni61_5));
                lifeContent.setText(getString(R.string.uni61_6));
                verdict.setText(getString(R.string.uni61_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Polytechnic Institute Of New York University (NYU Poly)"))) {


                 

                aboutContent.setText(getString(R.string.uni62_1));
                infrastContent.setText(getString(R.string.uni62_2));
                facultyContent.setText(getString(R.string.uni62_3));
                aidContent.setText(getString(R.string.uni62_4));
                jobContent.setText(getString(R.string.uni62_5));
                lifeContent.setText(getString(R.string.uni62_6));
                verdict.setText(getString(R.string.uni62_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Auburn University (Auburn)"))) {


                 

                aboutContent.setText(getString(R.string.uni63_1));                                   //thisuniv
                infrastContent.setText(getString(R.string.uni63_2));
                facultyContent.setText(getString(R.string.uni63_3));
                aidContent.setText(getString(R.string.uni63_4));
                jobContent.setText(getString(R.string.uni63_5));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of California - Santa Barbara (UCSB)"))) {


                 

                aboutContent.setText(getString(R.string.uni64_1));
                infrastContent.setText(getString(R.string.uni64_2));
                facultyContent.setText(getString(R.string.uni64_3));
                aidContent.setText(getString(R.string.uni64_4));
                jobContent.setText(getString(R.string.uni64_5));
                lifeContent.setText(getString(R.string.uni64_6));
                verdict.setText(getString(R.string.uni64_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("California State University, Long Beach (CSU LB)"))) {


                 

                aboutContent.setText(getString(R.string.uni65_1));
                infrastContent.setText(getString(R.string.uni65_2));
                facultyContent.setText(getString(R.string.uni65_3));
                aidContent.setText(getString(R.string.uni65_4));
                jobContent.setText(getString(R.string.uni65_5));
                lifeContent.setText(getString(R.string.uni65_6));
                verdict.setText(getString(R.string.uni65_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Colorado State University (Col.SU))"))) {


                 

                aboutContent.setText(getString(R.string.uni66_1));
                infrastContent.setText(getString(R.string.uni66_2));
                facultyContent.setText(getString(R.string.uni66_3));
                aidContent.setText(getString(R.string.uni66_4));
                jobContent.setText(getString(R.string.uni66_5));
                lifeContent.setText(getString(R.string.uni66_6));
                verdict.setText(getString(R.string.uni66_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("State University of New York at Binghamton (SUNY Bingh.)"))) {


                 

                aboutContent.setText(getString(R.string.uni67_1));
                infrastContent.setText(getString(R.string.uni67_2));
                facultyContent.setText(getString(R.string.uni67_3));
                aidContent.setText(getString(R.string.uni67_4));
                jobContent.setText(getString(R.string.uni67_5));
                lifeContent.setText(getString(R.string.uni67_6));
                verdict.setText(getString(R.string.uni67_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Maryland, Baltimore County (UMBC)"))) {


                 

                aboutContent.setText(getString(R.string.uni68_1));
                infrastContent.setText(getString(R.string.uni68_2));
                facultyContent.setText(getString(R.string.uni68_3));
                aidContent.setText(getString(R.string.uni68_4));
                jobContent.setText(getString(R.string.uni68_5));
                lifeContent.setText(getString(R.string.uni68_6));
                verdict.setText(getString(R.string.uni68_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("California Institute Of Technology (CalTech)"))) {


                 

                aboutContent.setText(getString(R.string.uni69_1));
                infrastContent.setText(getString(R.string.uni69_2));
                facultyContent.setText(getString(R.string.uni69_3));
                aidContent.setText(getString(R.string.uni69_4));
                jobContent.setText(getString(R.string.uni69_5));
                lifeContent.setText(getString(R.string.uni69_6));
                verdict.setText(getString(R.string.uni69_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Arizona (U.Ariz)"))) {


                 

                aboutContent.setText(getString(R.string.uni70_1));
                infrastContent.setText(getString(R.string.uni70_2));
                facultyContent.setText(getString(R.string.uni70_3));
                aidContent.setText(getString(R.string.uni70_4));
                jobContent.setText(getString(R.string.uni70_5));
                lifeContent.setText(getString(R.string.uni70_6));
                verdict.setText(getString(R.string.uni70_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Indiana University Bloomington (IUB)"))) {


                 

                aboutContent.setText(getString(R.string.uni71_1));
                infrastContent.setText(getString(R.string.uni71_2));
                facultyContent.setText(getString(R.string.uni71_3));
                aidContent.setText(getString(R.string.uni71_4));
                jobContent.setText(getString(R.string.uni71_5));
                lifeContent.setText(getString(R.string.uni71_6));
                verdict.setText(getString(R.string.uni71_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("California State University, Los Angeles (CSU LA)"))) {


                 

                aboutContent.setText(getString(R.string.uni72_1));
                infrastContent.setText(getString(R.string.uni72_2));
                facultyContent.setText(getString(R.string.uni72_3));
                aidContent.setText(getString(R.string.uni72_4));
                jobContent.setText(getString(R.string.uni72_5));
                lifeContent.setText(getString(R.string.uni72_6));
                verdict.setText(getString(R.string.uni72_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Texas A&amp;M University - Kingsville (TAMUK)"))) {


                 

                aboutContent.setText(getString(R.string.uni73_1));
                infrastContent.setText(getString(R.string.uni73_2));
                facultyContent.setText(getString(R.string.uni73_3));
                aidContent.setText(getString(R.string.uni73_4));
                jobContent.setText(getString(R.string.uni73_5));
                lifeContent.setText(getString(R.string.uni73_6));
                verdict.setText(getString(R.string.uni73_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Oklahoma State University-Stillwater (Oklahoma)"))) {


                 

                aboutContent.setText(getString(R.string.uni74_1));
                infrastContent.setText(getString(R.string.uni74_2));
                facultyContent.setText(getString(R.string.uni74_3));
                aidContent.setText(getString(R.string.uni74_4));
                jobContent.setText(getString(R.string.uni74_5));
                lifeContent.setText(getString(R.string.uni74_6));
                verdict.setText(getString(R.string.uni74_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Pittsburgh (UPitt)"))) {


                 

                aboutContent.setText(getString(R.string.uni75_1));
                infrastContent.setText(getString(R.string.uni75_2));
                facultyContent.setText(getString(R.string.uni75_3));
                aidContent.setText(getString(R.string.uni75_4));
                jobContent.setText(getString(R.string.uni75_5));
                lifeContent.setText(getString(R.string.uni75_6));
                verdict.setText(getString(R.string.uni75_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Georgia State University (GSU)"))) {


                 

                aboutContent.setText(getString(R.string.uni76_1));
                infrastContent.setText(getString(R.string.uni76_2));
                facultyContent.setText(getString(R.string.uni76_3));
                aidContent.setText(getString(R.string.uni76_4));
                jobContent.setText(getString(R.string.uni76_5));
                lifeContent.setText(getString(R.string.uni76_6));
                verdict.setText(getString(R.string.uni76_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Texas Tech University (TTU Whitcre) "))) {


                 

                aboutContent.setText(getString(R.string.uni77_1));
                infrastContent.setText(getString(R.string.uni77_2));
                facultyContent.setText(getString(R.string.uni77_3));
                aidContent.setText(getString(R.string.uni77_4));
                jobContent.setText(getString(R.string.uni77_5));
                lifeContent.setText(getString(R.string.uni77_6));
                verdict.setText(getString(R.string.uni77_7));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of California - Riverside (UC Riverside)"))) {

                 

                aboutContent.setText(getString(R.string.uni78_1));
                infrastContent.setText(getString(R.string.uni78_2));
                facultyContent.setText(getString(R.string.uni78_3));
                aidContent.setText(getString(R.string.uni78_4));
                jobContent.setText(getString(R.string.uni78_5));
                lifeContent.setText(getString(R.string.uni78_6));
                verdict.setText(getString(R.string.uni78_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Johns Hopkins University (J.Hopkins)"))) {


                 

                aboutContent.setText(getString(R.string.uni79_1));
                infrastContent.setText(getString(R.string.uni79_2));
                facultyContent.setText(getString(R.string.uni79_3));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Indiana Univ - Purdue Univ Indianapolis (IUPUI)"))) {


                 

                aboutContent.setText(getString(R.string.uni80_1));
                infrastContent.setText(getString(R.string.uni80_2));
                facultyContent.setText(getString(R.string.uni80_3));
                aidContent.setText(getString(R.string.uni80_4));
                verdict.setText(getString(R.string.uni80_5));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of North Carolina at Chapel Hill (UNC-Chapel)"))) {


                 

                aboutContent.setText(getString(R.string.uni81_1));
                infrastContent.setText(getString(R.string.uni81_2));
                facultyContent.setText(getString(R.string.uni81_3));
                aidContent.setText(getString(R.string.uni81_4));
                jobContent.setText(getString(R.string.uni81_5));
                lifeContent.setText(getString(R.string.uni81_6));
                verdict.setText(getString(R.string.uni81_7));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Michigan, Dearborn (UM Dearborn)"))) {

                 

                aboutContent.setText(getString(R.string.uni82_1));
                infrastContent.setText(getString(R.string.uni82_2));
                facultyContent.setText(getString(R.string.uni82_3));
                aidContent.setText(getString(R.string.uni82_4));
                jobContent.setText(getString(R.string.uni82_5));
                lifeContent.setText(getString(R.string.uni82_6));
                verdict.setText(getString(R.string.uni82_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("George Washington University (GWU)"))) {


                 

                aboutContent.setText(getString(R.string.uni83_1));
                infrastContent.setText(getString(R.string.uni83_2));
                facultyContent.setText(getString(R.string.uni83_3));
                aidContent.setText(getString(R.string.uni83_4));
                jobContent.setText(getString(R.string.uni83_5));
                lifeContent.setText(getString(R.string.uni83_6));
                verdict.setText(getString(R.string.uni83_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of California - Santa Cruz (UCSC)"))) {


                 

                aboutContent.setText(getString(R.string.uni84_1));
                infrastContent.setText(getString(R.string.uni84_2));
                facultyContent.setText(getString(R.string.uni84_3));
                aidContent.setText(getString(R.string.uni84_4));
                jobContent.setText(getString(R.string.uni84_5));
                lifeContent.setText(getString(R.string.uni84_6));
                verdict.setText(getString(R.string.uni84_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Oregon State University (Oregon SU)"))) {


                 

                aboutContent.setText(getString(R.string.uni85_1));
                verdict.setText(getString(R.string.uni85_2));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Kansas State University (Kansas SU)"))) {


                 

                aboutContent.setText(getString(R.string.uni86_1));
                infrastContent.setText(getString(R.string.uni86_2));
                facultyContent.setText(getString(R.string.uni86_3));
                aidContent.setText(getString(R.string.uni86_4));
                jobContent.setText(getString(R.string.uni86_5));
                lifeContent.setText(getString(R.string.uni86_6));
                verdict.setText(getString(R.string.uni86_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Duke University (Duke)"))) {


                 

                aboutContent.setText(getString(R.string.uni87_7));
                infrastContent.setText(getString(R.string.uni87_2));
                facultyContent.setText(getString(R.string.uni87_3));
                aidContent.setText(getString(R.string.uni87_4));
                jobContent.setText(getString(R.string.uni87_5));
                lifeContent.setText(getString(R.string.uni87_6));
                verdict.setText(getString(R.string.uni87_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Cleveland State University (Cleveland)"))) {


                 

                aboutContent.setText(getString(R.string.uni89_1));
                infrastContent.setText(getString(R.string.uni89_2));
                facultyContent.setText(getString(R.string.uni89_3));
                aidContent.setText(getString(R.string.uni89_4));
                jobContent.setText(getString(R.string.uni89_5));
                lifeContent.setText(getString(R.string.uni89_6));
                verdict.setText(getString(R.string.uni89_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Central Florida (UCF)"))) {


                 

                aboutContent.setText(getString(R.string.uni90_1));
                infrastContent.setText(getString(R.string.uni90_2));
                facultyContent.setText(getString(R.string.uni90_3));
                aidContent.setText(getString(R.string.uni90_4));
                jobContent.setText(getString(R.string.uni90_5));
                lifeContent.setText(getString(R.string.uni90_6));
                verdict.setText(getString(R.string.uni90_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("California State University, East Bay (CSU EB)"))) {


                 

                aboutContent.setText(getString(R.string.uni88_1));
                infrastContent.setText(getString(R.string.uni88_2));
                facultyContent.setText(getString(R.string.uni88_3));
                aidContent.setText(getString(R.string.uni88_4));
                jobContent.setText(getString(R.string.uni88_5));
                lifeContent.setText(getString(R.string.uni88_6));
                verdict.setText(getString(R.string.uni88_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Harvard University (Harvard) "))) {

                 

                aboutContent.setText(getString(R.string.uni91_1));
                infrastContent.setText(getString(R.string.uni91_2));
                facultyContent.setText(getString(R.string.uni91_3));
                verdict.setText(getString(R.string.uni91_4));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Worcester Polytechnic Institute (WPI) "))) {
                 

                aboutContent.setText(getString(R.string.uni92_1));
                infrastContent.setText(getString(R.string.uni92_2));
                facultyContent.setText(getString(R.string.uni92_3));
                aidContent.setText(getString(R.string.uni92_4));
                jobContent.setText(getString(R.string.uni92_5));
                lifeContent.setText(getString(R.string.uni92_6));
                verdict.setText(getString(R.string.uni92_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Missouri University of Science and Technology (MUST"))) {


                 

                aboutContent.setText(getString(R.string.uni93_1));
                infrastContent.setText(getString(R.string.uni93_2));
                facultyContent.setText(getString(R.string.uni93_3));
                aidContent.setText(getString(R.string.uni93_4));
                jobContent.setText(getString(R.string.uni93_5));
                lifeContent.setText(getString(R.string.uni93_6));
                verdict.setText(getString(R.string.uni93_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Lehigh University (Lehigh) "))) {

                 

                aboutContent.setText(getString(R.string.uni94_1));
                infrastContent.setText(getString(R.string.uni94_2));
                facultyContent.setText(getString(R.string.uni94_3));
                aidContent.setText(getString(R.string.uni94_4));
                jobContent.setText(getString(R.string.uni94_5));
                lifeContent.setText(getString(R.string.uni94_6));
                verdict.setText(getString(R.string.uni94_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Northern Illinois University (NIU)"))) {

                 

                aboutContent.setText(getString(R.string.uni95_1));
                infrastContent.setText(getString(R.string.uni95_2));
                facultyContent.setText(getString(R.string.uni95_3));
                aidContent.setText(getString(R.string.uni95_4));
                jobContent.setText(getString(R.string.uni95_5));
                lifeContent.setText(getString(R.string.uni95_6));
                verdict.setText(getString(R.string.uni95_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Drexel University (Drexel)"))) {

                 

                aboutContent.setText(getString(R.string.uni96_1));
                infrastContent.setText(getString(R.string.uni96_2));
                facultyContent.setText(getString(R.string.uni96_3));
                aidContent.setText(getString(R.string.uni96_4));
                jobContent.setText(getString(R.string.uni96_5));
                lifeContent.setText(getString(R.string.uni96_6));
                verdict.setText(getString(R.string.uni96_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Case Western Reserve University (CWRU"))) {

                 

                aboutContent.setText(getString(R.string.uni97_1));
                infrastContent.setText(getString(R.string.uni97_2));
                facultyContent.setText(getString(R.string.uni97_3));
                aidContent.setText(getString(R.string.uni97_4));
                jobContent.setText(getString(R.string.uni97_5));
                lifeContent.setText(getString(R.string.uni97_6));
                verdict.setText(getString(R.string.uni97_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Wayne State University (Wayne SU)"))) {

                 

                aboutContent.setText(getString(R.string.uni98_1));
                infrastContent.setText(getString(R.string.uni98_2));
                facultyContent.setText(getString(R.string.uni98_3));
                aidContent.setText(getString(R.string.uni98_4));
                jobContent.setText(getString(R.string.uni98_5));
                lifeContent.setText(getString(R.string.uni98_6));
                verdict.setText(getString(R.string.uni98_7));

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Houston - Clear Lake (UHCL) "))) {

                 

                aboutContent.setText(getString(R.string.uni99_1));
                infrastContent.setText(getString(R.string.uni99_2));
                facultyContent.setText(getString(R.string.uni99_3));
                aidContent.setText(getString(R.string.uni99_4));
                jobContent.setText(getString(R.string.uni99_5));
                lifeContent.setText(getString(R.string.uni99_6));
                verdict.setText(getString(R.string.uni99_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Virginia (U. Virginia)"))) {

                 

                aboutContent.setText(getString(R.string.uni100_1));
                infrastContent.setText(getString(R.string.uni100_2));
                facultyContent.setText(getString(R.string.uni100_3));
                aidContent.setText(getString(R.string.uni100_4));
                jobContent.setText(getString(R.string.uni100_5));
                lifeContent.setText(getString(R.string.uni100_6));
                verdict.setText(getString(R.string.uni100_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("California State University, Sacramento (Sac State)"))) {

                 

                aboutContent.setText(getString(R.string.uni101_1));
                infrastContent.setText(getString(R.string.uni101_2));
                facultyContent.setText(getString(R.string.uni101_3));
                aidContent.setText(getString(R.string.uni101_4));
                jobContent.setText(getString(R.string.uni101_5));
                lifeContent.setText(getString(R.string.uni101_6));
                verdict.setText(getString(R.string.uni101_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Southern Methodist University (SMU Dallas)"))) {

                 

                aboutContent.setText(getString(R.string.uni102_1));
                infrastContent.setText(getString(R.string.uni102_2));
                facultyContent.setText(getString(R.string.uni102_3));
                aidContent.setText(getString(R.string.uni102_4));
                jobContent.setText(getString(R.string.uni102_5));
                lifeContent.setText(getString(R.string.uni102_6));
                verdict.setText(getString(R.string.uni102_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Rochester (U.Rochester) "))) {

                 

                aboutContent.setText(getString(R.string.uni103_1));
                infrastContent.setText(getString(R.string.uni103_2));
                facultyContent.setText(getString(R.string.uni103_3));
                aidContent.setText(getString(R.string.uni103_4));
                jobContent.setText(getString(R.string.uni103_5));
                lifeContent.setText(getString(R.string.uni103_6));
                verdict.setText(getString(R.string.uni103_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("California State University, Northridge (CSUN)"))) {

                 

                aboutContent.setText(getString(R.string.uni104_1));
                infrastContent.setText(getString(R.string.uni104_2));
                facultyContent.setText(getString(R.string.uni104_3));
                aidContent.setText(getString(R.string.uni104_4));
                jobContent.setText(getString(R.string.uni104_5));
                lifeContent.setText(getString(R.string.uni104_6));
                verdict.setText(getString(R.string.uni104_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Northeastern"))) {

                 

                aboutContent.setText(getString(R.string.uni105_1));
                infrastContent.setText(getString(R.string.uni105_2));
                facultyContent.setText(getString(R.string.uni105_3));
                aidContent.setText(getString(R.string.uni105_4));
                jobContent.setText(getString(R.string.uni105_5));
                lifeContent.setText(getString(R.string.uni105_6));
                verdict.setText(getString(R.string.uni105_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Massachusetts - Lowell (UM Lowell) "))) {

                 

                aboutContent.setText(getString(R.string.uni106_1));
                infrastContent.setText(getString(R.string.uni106_2));
                facultyContent.setText(getString(R.string.uni106_3));
                aidContent.setText(getString(R.string.uni106_4));
                lifeContent.setText(getString(R.string.uni106_6));
                verdict.setText(getString(R.string.uni106_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Rice University (Rice) "))) {

                 

                aboutContent.setText(getString(R.string.uni107_1));
                infrastContent.setText(getString(R.string.uni107_2));
                facultyContent.setText(getString(R.string.uni107_3));
                aidContent.setText(getString(R.string.uni107_4));
                jobContent.setText(getString(R.string.uni107_5));
                lifeContent.setText(getString(R.string.uni107_6));
                verdict.setText(getString(R.string.uni107_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Northeastern"))) {

                 

                aboutContent.setText(getString(R.string.uni108_1));
                infrastContent.setText(getString(R.string.uni108_2));
                facultyContent.setText(getString(R.string.uni108_3));
                aidContent.setText(getString(R.string.uni108_4));
                jobContent.setText(getString(R.string.uni108_5));
                lifeContent.setText(getString(R.string.uni108_6));
                verdict.setText(getString(R.string.uni108_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Connecticut (UConn) "))) {

                 

                aboutContent.setText(getString(R.string.uni109_1));
                infrastContent.setText(getString(R.string.uni109_2));
                facultyContent.setText(getString(R.string.uni109_3));
                aidContent.setText(getString(R.string.uni109_4));
                jobContent.setText(getString(R.string.uni109_5));
                lifeContent.setText(getString(R.string.uni109_6));
                verdict.setText(getString(R.string.uni109_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("New York Institute of Technology, Manhattan (NYIT) "))) {

                 

                aboutContent.setText(getString(R.string.uni110_1));
                infrastContent.setText(getString(R.string.uni110_2));
                facultyContent.setText(getString(R.string.uni110_3));
                aidContent.setText(getString(R.string.uni110_4));
                jobContent.setText(getString(R.string.uni110_5));
                lifeContent.setText(getString(R.string.uni110_6));
                verdict.setText(getString(R.string.uni110_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("State University of New York (Albany) (SUNY Albany)"))) {

                 

                aboutContent.setText(getString(R.string.uni111_1));
                infrastContent.setText(getString(R.string.uni111_2));
                facultyContent.setText(getString(R.string.uni111_3));
                aidContent.setText(getString(R.string.uni111_4));
                jobContent.setText(getString(R.string.uni111_5));
                lifeContent.setText(getString(R.string.uni111_6));
                verdict.setText(getString(R.string.uni111_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("California State University, Fresno (Fresno State) "))) {

                 

                aboutContent.setText(getString(R.string.uni112_1));
                infrastContent.setText(getString(R.string.uni112_2));
                facultyContent.setText(getString(R.string.uni112_3));
                aidContent.setText(getString(R.string.uni112_4));
                jobContent.setText(getString(R.string.uni112_5));
                lifeContent.setText(getString(R.string.uni112_6));
                verdict.setText(getString(R.string.uni112_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Florida State University (FSU)"))) {

                 

                aboutContent.setText(getString(R.string.uni113_1));
                infrastContent.setText(getString(R.string.uni113_2));
                facultyContent.setText(getString(R.string.uni113_3));
                aidContent.setText(getString(R.string.uni113_4));
                jobContent.setText(getString(R.string.uni113_5));
                lifeContent.setText(getString(R.string.uni113_6));
                verdict.setText(getString(R.string.uni113_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Iowa (U of Iowa) "))) {

                 

                aboutContent.setText(getString(R.string.uni114_1));
                infrastContent.setText(getString(R.string.uni114_2));
                facultyContent.setText(getString(R.string.uni114_3));
                aidContent.setText(getString(R.string.uni114_4));
                jobContent.setText(getString(R.string.uni114_5));
                lifeContent.setText(getString(R.string.uni114_6));
                verdict.setText(getString(R.string.uni114_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Brown University (Brown) "))) {

                 

                aboutContent.setText(getString(R.string.uni115_1));
                infrastContent.setText(getString(R.string.uni115_2));
                facultyContent.setText(getString(R.string.uni115_3));
                aidContent.setText(getString(R.string.uni115_4));
                jobContent.setText(getString(R.string.uni115_5));
                lifeContent.setText(getString(R.string.uni115_6));
                verdict.setText(getString(R.string.uni115_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Pace University (Pace)"))) {

                 

                aboutContent.setText(getString(R.string.uni116_1));
                infrastContent.setText(getString(R.string.uni116_2));
                facultyContent.setText(getString(R.string.uni116_3));
                aidContent.setText(getString(R.string.uni116_4));
                jobContent.setText(getString(R.string.uni116_5));
                lifeContent.setText(getString(R.string.uni116_6));
                verdict.setText(getString(R.string.uni116_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Alabama, Huntsville (UA Huntsvi.)"))) {

                 

                aboutContent.setText(getString(R.string.uni117_1));
                infrastContent.setText(getString(R.string.uni117_2));
                facultyContent.setText(getString(R.string.uni117_3));
                aidContent.setText(getString(R.string.uni117_4));
                jobContent.setText(getString(R.string.uni117_5));
                lifeContent.setText(getString(R.string.uni117_6));
                verdict.setText(getString(R.string.uni117_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Princeton University (Princeton)"))) {

                 

                aboutContent.setText(getString(R.string.uni118_1));
                infrastContent.setText(getString(R.string.uni118_2));
                facultyContent.setText(getString(R.string.uni118_3));
                aidContent.setText(getString(R.string.uni118_4));
                jobContent.setText(getString(R.string.uni118_5));
                lifeContent.setText(getString(R.string.uni118_6));
                verdict.setText(getString(R.string.uni118_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Wright State University (Wright SU)"))) {

                 

                aboutContent.setText(getString(R.string.uni119_1));
                infrastContent.setText(getString(R.string.uni119_2));
                facultyContent.setText(getString(R.string.uni119_3));
                aidContent.setText(getString(R.string.uni119_4));
                jobContent.setText(getString(R.string.uni119_5));
                lifeContent.setText(getString(R.string.uni119_6));
                verdict.setText(getString(R.string.uni119_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Colorado at Denver (UC Denver) "))) {

                 

                aboutContent.setText(getString(R.string.uni120_1));
                infrastContent.setText(getString(R.string.uni120_2));
                facultyContent.setText(getString(R.string.uni120_3));
                aidContent.setText(getString(R.string.uni120_4));
                jobContent.setText(getString(R.string.uni120_5));
                lifeContent.setText(getString(R.string.uni120_6));
                verdict.setText(getString(R.string.uni120_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Wichita State University (Wichita) "))) {

                 

                aboutContent.setText(getString(R.string.uni121_1));
                infrastContent.setText(getString(R.string.uni121_2));
                facultyContent.setText(getString(R.string.uni121_3));
                aidContent.setText(getString(R.string.uni121_4));
                jobContent.setText(getString(R.string.uni121_5));
                lifeContent.setText(getString(R.string.uni121_6));
                verdict.setText(getString(R.string.uni121_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Oklahoma (U. Okhla)"))) {

                 

                aboutContent.setText(getString(R.string.uni122_1));
                infrastContent.setText(getString(R.string.uni122_2));
                facultyContent.setText(getString(R.string.uni122_3));
                aidContent.setText(getString(R.string.uni122_4));
                jobContent.setText(getString(R.string.uni122_5));
                lifeContent.setText(getString(R.string.uni122_6));
                verdict.setText(getString(R.string.uni122_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Florida Institute of Technology (FIT)"))) {

                 

                aboutContent.setText(getString(R.string.uni123_1));
                infrastContent.setText(getString(R.string.uni123_2));
                facultyContent.setText(getString(R.string.uni123_3));
                aidContent.setText(getString(R.string.uni123_4));
                jobContent.setText(getString(R.string.uni123_5));
                lifeContent.setText(getString(R.string.uni123_6));
                verdict.setText(getString(R.string.uni123_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Rensselaer Polytechnic Institute (RPI)"))) {

                 

                aboutContent.setText(getString(R.string.uni125_1));
                infrastContent.setText(getString(R.string.uni125_2));
                facultyContent.setText(getString(R.string.uni125_3));
                aidContent.setText(getString(R.string.uni125_4));
                jobContent.setText(getString(R.string.uni125_5));
                lifeContent.setText(getString(R.string.uni125_6));
                verdict.setText(getString(R.string.uni125_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Portland State University (PSU Maseeh)"))) {

                 

                aboutContent.setText(getString(R.string.uni126_1));
                infrastContent.setText(getString(R.string.uni126_2));
                facultyContent.setText(getString(R.string.uni126_3));
                aidContent.setText(getString(R.string.uni126_4));
                jobContent.setText(getString(R.string.uni126_5));
                lifeContent.setText(getString(R.string.uni126_6));
                verdict.setText(getString(R.string.uni126_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Illinois at Springfield (UIS)"))) {

                 

                aboutContent.setText(getString(R.string.uni127_1));
                infrastContent.setText(getString(R.string.uni127_2));
                facultyContent.setText(getString(R.string.uni127_3));
                aidContent.setText(getString(R.string.uni127_4));
                jobContent.setText(getString(R.string.uni127_5));
                lifeContent.setText(getString(R.string.uni127_6));
                verdict.setText(getString(R.string.uni127_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Yale University (Yale) "))) {

                 

                aboutContent.setText(getString(R.string.uni128_1));
                infrastContent.setText(getString(R.string.uni128_2));
                facultyContent.setText(getString(R.string.uni128_3));
                aidContent.setText(getString(R.string.uni128_4));
                jobContent.setText(getString(R.string.uni128_5));
                lifeContent.setText(getString(R.string.uni128_6));
                verdict.setText(getString(R.string.uni128_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Kansas (U. Kansas)"))) {

                 

                aboutContent.setText(getString(R.string.uni129_1));
                infrastContent.setText(getString(R.string.uni129_2));
                facultyContent.setText(getString(R.string.uni129_3));
                aidContent.setText(getString(R.string.uni129_4));
                jobContent.setText(getString(R.string.uni129_5));
                lifeContent.setText(getString(R.string.uni129_6));
                verdict.setText(getString(R.string.uni129_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Missouri, Columbia (UM Columb) "))) {

                 

                aboutContent.setText(getString(R.string.uni130_1));
                infrastContent.setText(getString(R.string.uni130_2));
                facultyContent.setText(getString(R.string.uni130_3));
                aidContent.setText(getString(R.string.uni130_4));
                jobContent.setText(getString(R.string.uni130_5));
                lifeContent.setText(getString(R.string.uni130_6));
                verdict.setText(getString(R.string.uni130_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Dartmouth College (Dartmouth) "))) {

                 

                aboutContent.setText(getString(R.string.uni131_1));
                infrastContent.setText(getString(R.string.uni131_2));
                facultyContent.setText(getString(R.string.uni131_3));
                aidContent.setText(getString(R.string.uni131_4));
                jobContent.setText(getString(R.string.uni131_5));
                lifeContent.setText(getString(R.string.uni131_6));
                verdict.setText(getString(R.string.uni131_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Washington State University (Wshgton SU) "))) {

                 

                aboutContent.setText(getString(R.string.uni132_1));
                infrastContent.setText(getString(R.string.uni132_2));
                facultyContent.setText(getString(R.string.uni132_3));
                aidContent.setText(getString(R.string.uni132_4));
                jobContent.setText(getString(R.string.uni132_5));
                lifeContent.setText(getString(R.string.uni132_6));
                verdict.setText(getString(R.string.uni132_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Dayton (U of Dayton)"))) {

                 

                aboutContent.setText(getString(R.string.uni133_1));
                infrastContent.setText(getString(R.string.uni133_2));
                facultyContent.setText(getString(R.string.uni133_3));
                aidContent.setText(getString(R.string.uni133_4));
                jobContent.setText(getString(R.string.uni133_5));
                lifeContent.setText(getString(R.string.uni133_6));
                verdict.setText(getString(R.string.uni133_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Western Michigan University (W Mich)"))) {

                 

                aboutContent.setText(getString(R.string.uni134_1));
                infrastContent.setText(getString(R.string.uni134_2));
                facultyContent.setText(getString(R.string.uni134_3));
                aidContent.setText(getString(R.string.uni134_4));
                jobContent.setText(getString(R.string.uni134_5));
                lifeContent.setText(getString(R.string.uni134_6));
                verdict.setText(getString(R.string.uni134_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Kent State University (Kent SU) "))) {

                 

                aboutContent.setText(getString(R.string.uni135_1));
                infrastContent.setText(getString(R.string.uni135_2));
                facultyContent.setText(getString(R.string.uni135_3));
                aidContent.setText(getString(R.string.uni135_4));
                jobContent.setText(getString(R.string.uni135_5));
                lifeContent.setText(getString(R.string.uni135_6));
                verdict.setText(getString(R.string.uni135_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of North Texas (UNT)"))) {

                 

                aboutContent.setText(getString(R.string.uni136_1));
                infrastContent.setText(getString(R.string.uni136_2));
                facultyContent.setText(getString(R.string.uni136_3));
                aidContent.setText(getString(R.string.uni136_4));
                jobContent.setText(getString(R.string.uni136_5));
                lifeContent.setText(getString(R.string.uni136_6));
                verdict.setText(getString(R.string.uni136_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Washington University in St. Louis (WUSL) "))) {

                 

                aboutContent.setText(getString(R.string.uni137_1));
                infrastContent.setText(getString(R.string.uni137_2));
                facultyContent.setText(getString(R.string.uni137_3));
                aidContent.setText(getString(R.string.uni137_4));
                jobContent.setText(getString(R.string.uni137_5));
                lifeContent.setText(getString(R.string.uni137_6));
                verdict.setText(getString(R.string.uni137_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Delaware (U.Del)"))) {

                 

                aboutContent.setText(getString(R.string.uni138_1));
                infrastContent.setText(getString(R.string.uni138_2));
                facultyContent.setText(getString(R.string.uni138_3));
                aidContent.setText(getString(R.string.uni138_4));
                jobContent.setText(getString(R.string.uni138_5));
                lifeContent.setText(getString(R.string.uni138_6));
                verdict.setText(getString(R.string.uni138_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of South Carolina (U. South Car) "))) {

                 

                aboutContent.setText(getString(R.string.uni139_1));
                infrastContent.setText(getString(R.string.uni139_2));
                facultyContent.setText(getString(R.string.uni139_3));
                aidContent.setText(getString(R.string.uni139_4));
                jobContent.setText(getString(R.string.uni139_5));
                lifeContent.setText(getString(R.string.uni139_6));
                verdict.setText(getString(R.string.uni139_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Lamar University (Lamar)"))) {

                 

                aboutContent.setText(getString(R.string.uni140_1));
                infrastContent.setText(getString(R.string.uni140_2));
                facultyContent.setText(getString(R.string.uni140_3));
                aidContent.setText(getString(R.string.uni140_4));
                jobContent.setText(getString(R.string.uni140_5));
                lifeContent.setText(getString(R.string.uni140_6));
                verdict.setText(getString(R.string.uni140_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("San Francisco State University (SFSU)"))) {

                 

                aboutContent.setText(getString(R.string.uni141_1));
                infrastContent.setText(getString(R.string.uni141_2));
                facultyContent.setText(getString(R.string.uni141_3));
                aidContent.setText(getString(R.string.uni141_4));
                jobContent.setText(getString(R.string.uni141_5));
                lifeContent.setText(getString(R.string.uni141_6));
                verdict.setText(getString(R.string.uni141_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Florida International University (FIU) "))) {

                 

                aboutContent.setText(getString(R.string.uni142_1));
                infrastContent.setText(getString(R.string.uni142_2));
                facultyContent.setText(getString(R.string.uni142_3));
                aidContent.setText(getString(R.string.uni142_4));
                jobContent.setText(getString(R.string.uni142_5));
                lifeContent.setText(getString(R.string.uni142_6));
                verdict.setText(getString(R.string.uni142_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Missouri, Kansas City (UMKC) "))) {

                 

                aboutContent.setText(getString(R.string.uni143_1));
                infrastContent.setText(getString(R.string.uni143_2));
                facultyContent.setText(getString(R.string.uni143_3));
                aidContent.setText(getString(R.string.uni143_4));
                jobContent.setText(getString(R.string.uni143_5));
                lifeContent.setText(getString(R.string.uni143_6));
                verdict.setText(getString(R.string.uni143_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Texas - San Antonio (UTSA)"))) {

                 

                aboutContent.setText(getString(R.string.uni144_1));
                infrastContent.setText(getString(R.string.uni144_2));
                facultyContent.setText(getString(R.string.uni144_3));
                aidContent.setText(getString(R.string.uni144_4));
                jobContent.setText(getString(R.string.uni144_5));
                lifeContent.setText(getString(R.string.uni144_6));
                verdict.setText(getString(R.string.uni144_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Utah State University (Utah SU) "))) {

                 

                aboutContent.setText(getString(R.string.uni145_1));
                infrastContent.setText(getString(R.string.uni145_2));
                facultyContent.setText(getString(R.string.uni145_3));
                aidContent.setText(getString(R.string.uni145_4));
                jobContent.setText(getString(R.string.uni145_5));
                lifeContent.setText(getString(R.string.uni145_6));
                verdict.setText(getString(R.string.uni145_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Tennessee at Knoxville (U. Tenn Knx)"))) {

                 

                aboutContent.setText(getString(R.string.uni146_1));
                infrastContent.setText(getString(R.string.uni146_2));
                facultyContent.setText(getString(R.string.uni146_3));
                aidContent.setText(getString(R.string.uni146_4));
                jobContent.setText(getString(R.string.uni146_5));
                lifeContent.setText(getString(R.string.uni146_6));
                verdict.setText(getString(R.string.uni146_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Nebraska, Lincoln (UN Lincoln)"))) {

                 

                aboutContent.setText(getString(R.string.uni147_1));
                infrastContent.setText(getString(R.string.uni147_2));
                facultyContent.setText(getString(R.string.uni147_3));
                aidContent.setText(getString(R.string.uni147_4));
                jobContent.setText(getString(R.string.uni147_5));
                lifeContent.setText(getString(R.string.uni147_6));
                verdict.setText(getString(R.string.uni147_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Louisiana State University and A&amp;M College (LSU AMC)"))) {

                 

                aboutContent.setText(getString(R.string.uni148_1));
                infrastContent.setText(getString(R.string.uni148_2));
                facultyContent.setText(getString(R.string.uni148_3));
                aidContent.setText(getString(R.string.uni148_4));
                jobContent.setText(getString(R.string.uni148_5));
                lifeContent.setText(getString(R.string.uni148_6));
                verdict.setText(getString(R.string.uni148_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Massachusetts - Dartmouth (UM Dartm) "))) {

                 

                aboutContent.setText(getString(R.string.uni149_1));
                infrastContent.setText(getString(R.string.uni149_2));
                facultyContent.setText(getString(R.string.uni149_3));
                aidContent.setText(getString(R.string.uni149_4));
                jobContent.setText(getString(R.string.uni149_5));
                lifeContent.setText(getString(R.string.uni149_6));
                verdict.setText(getString(R.string.uni149_7));


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Arkansas State university (A-State) "))) {

                 

                aboutContent.setText(getString(R.string.uni150_1));
                infrastContent.setText(getString(R.string.uni150_2));
                facultyContent.setText(getString(R.string.uni150_3));
                aidContent.setText(getString(R.string.uni150_4));
                jobContent.setText(getString(R.string.uni150_5));
                lifeContent.setText(getString(R.string.uni150_6));
                verdict.setText(getString(R.string.uni150_7));


            }else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Texas A&amp;M University - Commerce (TAMUC) "))) {

                 

                aboutContent.setText(getString(R.string.uni151_1));
                infrastContent.setText(getString(R.string.uni151_2));
                facultyContent.setText(getString(R.string.uni151_3));
                aidContent.setText(getString(R.string.uni151_4));
                jobContent.setText(getString(R.string.uni151_5));
                lifeContent.setText(getString(R.string.uni151_6));
                verdict.setText(getString(R.string.uni151_7));


            }else if (mToolbar.getTitle().toString().equalsIgnoreCase(("New York Institute of Technology, Old Westbury (NYIT WB)"))) {

                 

                aboutContent.setText(getString(R.string.uni152_1));
                infrastContent.setText(getString(R.string.uni152_2));
                facultyContent.setText(getString(R.string.uni152_3));
                aidContent.setText(getString(R.string.uni152_4));
                jobContent.setText(getString(R.string.uni152_5));
                lifeContent.setText(getString(R.string.uni152_6));
                verdict.setText(getString(R.string.uni152_7));


            }else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Bridgeport (Bridgeport) "))) {

                 

                aboutContent.setText(getString(R.string.uni153_1));
                infrastContent.setText(getString(R.string.uni153_2));
                facultyContent.setText(getString(R.string.uni153_3));
                aidContent.setText(getString(R.string.uni153_4));
                jobContent.setText(getString(R.string.uni153_5));
                lifeContent.setText(getString(R.string.uni153_6));
                verdict.setText(getString(R.string.uni153_7));


            }else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Mississippi State University (Missi. SU)"))) {

                 

                aboutContent.setText(getString(R.string.uni154_1));
                infrastContent.setText(getString(R.string.uni154_2));
                facultyContent.setText(getString(R.string.uni154_3));
                aidContent.setText(getString(R.string.uni154_4));
                jobContent.setText(getString(R.string.uni154_5));
                lifeContent.setText(getString(R.string.uni154_6));
                verdict.setText(getString(R.string.uni154_7));


            }else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Lawrence Technological University (LTU)"))) {

                 

                aboutContent.setText(getString(R.string.uni155_1));
                infrastContent.setText(getString(R.string.uni155_2));
                facultyContent.setText(getString(R.string.uni155_3));
                aidContent.setText(getString(R.string.uni155_4));
                jobContent.setText(getString(R.string.uni155_5));
                lifeContent.setText(getString(R.string.uni155_6));
                verdict.setText(getString(R.string.uni155_7));


            }else if (mToolbar.getTitle().toString().equalsIgnoreCase(("Alabama A&amp;M University (AAMU) "))) {

                 

                aboutContent.setText(getString(R.string.uni156_1));
                infrastContent.setText(getString(R.string.uni156_2));
                facultyContent.setText(getString(R.string.uni156_3));
                aidContent.setText(getString(R.string.uni156_4));
                jobContent.setText(getString(R.string.uni156_5));
                lifeContent.setText(getString(R.string.uni156_6));
                verdict.setText(getString(R.string.uni156_7));


            }else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of New Haven (New Haven) "))) {

                 

                aboutContent.setText(getString(R.string.uni157_1));
                infrastContent.setText(getString(R.string.uni157_2));
                facultyContent.setText(getString(R.string.uni157_3));
                aidContent.setText(getString(R.string.uni157_4));
                jobContent.setText(getString(R.string.uni157_5));
                lifeContent.setText(getString(R.string.uni157_6));
                verdict.setText(getString(R.string.uni157_7));


            }else if (mToolbar.getTitle().toString().equalsIgnoreCase(("University of Massachusetts, Boston (UMB) "))) {

                 

                aboutContent.setText(getString(R.string.uni158_1));
                infrastContent.setText(getString(R.string.uni158_2));
                facultyContent.setText(getString(R.string.uni158_3));
                aidContent.setText(getString(R.string.uni158_4));
                jobContent.setText(getString(R.string.uni158_5));
                lifeContent.setText(getString(R.string.uni158_6));
                verdict.setText(getString(R.string.uni158_7));


            }else if (mToolbar.getTitle().toString().equalsIgnoreCase(("The University of Chicago (U Chicago) "))) {

                 

                aboutContent.setText(getString(R.string.uni159_1));
                infrastContent.setText(getString(R.string.uni159_2));
                facultyContent.setText(getString(R.string.uni159_3));
                aidContent.setText(getString(R.string.uni159_4));
                jobContent.setText(getString(R.string.uni159_5));
                lifeContent.setText(getString(R.string.uni159_6));
                verdict.setText(getString(R.string.uni159_7));


            }


        }

    }
}
