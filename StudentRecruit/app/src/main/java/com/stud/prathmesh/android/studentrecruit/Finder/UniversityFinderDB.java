package com.stud.prathmesh.android.studentrecruit.Finder;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class UniversityFinderDB  extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION= 1;
    static final String DATABASE_NAME="universityFindings.db";
    private static final String TABLE_NAME="finderUniversity";

    public static final String COLUMN_UNIVID="univId";
    public static final String COLUMN_UNIVERSITYNAME="univName";
    private static final String COLUMN_SCORE="score";

    SQLiteDatabase db;




    private static final String TABLE_CREATE = "create table IF NOT EXISTS finderUniversity (univId integer PRIMARY KEY autoincrement, univName varchar not null, score integer not null);";

    public UniversityFinderDB(Context context) {
        super(context, DATABASE_NAME,null ,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {

        database.execSQL(TABLE_CREATE);

        add(database);

    }


    public void addUser(Universities universities) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COLUMN_UNIVID, universities.getUnivId());
        values.put(COLUMN_UNIVERSITYNAME, universities.getUnivName());
        values.put(COLUMN_SCORE, universities.getGre());



        // Inserting Row
        db.insert(TABLE_NAME, null, values);
        db.close();
    }




    public List<String> getData(int input){
        String query="select distinct univName from finderUniversity where score >="+input+" order by univName";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor =db.rawQuery(query, null);

        List<String> attrStr = new Vector<String>();

        if(cursor.moveToFirst()){
            do{
                attrStr.add(cursor.getString(cursor.getColumnIndex(COLUMN_UNIVERSITYNAME)));
                Arrays.toString(new List[]{attrStr});
            }while  (cursor.moveToNext());
        }
        while (cursor.moveToNext()){

        }
        return attrStr;
    }


    public void add (SQLiteDatabase database){
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Arizona State University ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Northeastern University ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Texas A&amp;M University, College Station ', 325)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Southern California (USC Viterbi)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Texas - Dallas (UTD) ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Texas - Arlington (UT Arlingt)  ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('State University of New York at Buffalo (SUNY Buffalo) ', 315)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('North Carolina State University, Raleigh (NCSU) ', 330)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Georgia Institute of Technology (GaTech) ', 330)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Illinois at Chicago (UIC) ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Texas - Austin (UT Austin)  ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Illinois Institute of Technology (IIT Chicago) ', 325)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of North Carolina at Charlotte (UNCC)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('San Jose State University (SJSU)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Carnegie Mellon University (CMU) ', 335)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Maryland, College Park (UMCP) ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Purdue University West Lafayette (Purdue)  ', 330)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Pennsylvania State University (Penn State)  ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of California - San Diego (UCSD ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Minnesota, Twin Cities (UM Twin)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Syracuse University (Syracuse) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of California - Irvine (UC Irvine) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Rochester Institute of Technology (RIT)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Virginia Tech (Virg. Tech) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Michigan - Ann Arbor (U Mich)  ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Illinois at Urbana-Champaign (UIUC)  ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('State University of New York at Stony Brook (SUNY-SB)  ', 315)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of California - Los Angeles (UCLA)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Iowa State University (Iowa State) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Michigan State University (Mich. SU) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Houston (U. Houston)  ', 308)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Massachusetts - Amherst (Umass Am)  ', 309)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Cincinnati (U.Cincin) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Rutgers University - New Brunswick (Rutgers NB) ', 305)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Colorado Boulder (Boulder) ', 305)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Columbia University (Columbia) ', 305)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('New Jersey Institute of Technology (NJIT)  ', 305)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Wisconsin-Madison (UW Mad)  ', 305)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Clemson University (Clemson)  ', 305)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Pennsylvania (UPenn) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State University, Fullerton (Fullerton) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Ohio State University (OSU)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Stevens Institute of Technology (Stevens IT)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Cornell University (Cornell)  ', 306)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of California - Davis (UC Davis)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('San Diego State University (SDSU)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of California – Berkeley (UC Berkeley)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of South Florida (USF)  ', 305)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Michigan Technological University (MTU) ', 307)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Rutgers University, Newark (Rutgers)  ', 306)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Utah (Utah)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('West Virginia University, Morgantown (WVU)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Washington (UW Seattle)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('George Mason University (GMU)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Massachusetts Institute of Technology (MIT) ', 340)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Northwestern University (NWU) ', 330)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Santa Clara University (Santa Clara)  ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Boston University (BU) ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Polytechnic Institute Of New York University (NYU Poly) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Stanford University (Stanford)  ', 335)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Auburn University (Auburn)  ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of California - Santa Barbara (UCSB)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Colorado State University (Col.SU)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State University, Long Beach (CSU LB) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('State University of New York at Binghamton (SUNY Bingh.)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California Institute Of Technology (CalTech)  ', 340)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Maryland, Baltimore County (UMBC) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Arizona (U.Ariz) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Indiana University Bloomington (IUB) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Texas A&amp;M University - Kingsville (TAMUK)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Oklahoma State University-Stillwater (Oklahoma)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Pittsburgh (UPitt)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Georgia State University (GSU) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Texas Tech University (TTU Whitcre)   ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of California - Riverside (UC Riverside)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Johns Hopkins University (J.Hopkins) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Indiana Univ - Purdue Univ Indianapolis (IUPUI)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of North Carolina at Chapel Hill (UNC-Chapel) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Michigan, Dearborn (UM Dearborn)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('George Washington University (GWU)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of California - Santa Cruz (UCSC)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Oregon State University (Oregon SU)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Kansas State University (Kansas SU)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Duke University (Duke) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Cleveland State University (Cleveland) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Central Florida (UCF)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State University, East Bay (CSU EB)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Harvard University (Harvard)  ', 340)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Worcester Polytechnic Institute (WPI)  ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Missouri University of Science and Technology (MUST) ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Lehigh University (Lehigh)  ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Northern Illinois University (NIU) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Drexel University (Drexel)  ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Case Western Reserve University (CWRU) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Wayne State University (Wayne SU) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Houston - Clear Lake (UHCL)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Virginia (U. Virginia) ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State University, Sacramento (Sac State) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Southern Methodist University (SMU Dallas) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Rochester (U.Rochester)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State University, Northridge (CSUN) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Massachusetts - Lowell (UM Lowell)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Rice University (Rice)  ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Connecticut (UConn)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('New York Institute of Technology, Manhattan (NYIT)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('State University of New York (Albany) (SUNY Albany) ', 298)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State University, Fresno (Fresno State)  ', 296)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Florida State University (FSU) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Iowa (U of Iowa)  ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Brown University (Brown)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Pace University (Pace) ', 295)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Alabama, Huntsville (UA Huntsvi.) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Princeton University (Princeton) ', 330)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Wright State University (Wright SU) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Colorado at Denver (UC Denver)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Wichita State University (Wichita)  ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Oklahoma (U. Okhla) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Florida Institute of Technology (FIT) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Rensselaer Polytechnic Institute (RPI) ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Portland State University (PSU Maseeh) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Illinois at Springfield (UIS) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Yale University (Yale)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Kansas (U. Kansas) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Missouri, Columbia (UM Columb)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Dartmouth College (Dartmouth)  ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Washington State University (Wshgton SU)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Dayton (U of Dayton) ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Western Michigan University (W Mich) ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Kent State University (Kent SU)  ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of North Texas (UNT) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Washington University in St. Louis (WUSL)  ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Delaware (U.Del) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of South Carolina (U. South Car)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Lamar University (Lamar) ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('San Francisco State University (SFSU) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Florida International University (FIU)  ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Missouri, Kansas City (UMKC)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Texas - San Antonio (UTSA) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Utah State University (Utah SU)  ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Tennessee at Knoxville (U. Tenn Knx) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Nebraska, Lincoln (UN Lincoln) ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Louisiana State University and A&amp;M College (LSU AMC) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Massachusetts - Dartmouth (UM Dartm)  ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Arkansas State university (A-State)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Texas A&amp;M University - Commerce (TAMUC)  ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('New York Institute of Technology, Old Westbury (NYIT WB) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Bridgeport (Bridgeport)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Mississippi State University (Missi. SU)', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Lawrence Technological University (LTU) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Alabama A&amp;M University (AAMU)  ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of New Haven (New Haven)  ', 390)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Massachusetts, Boston (UMB)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('The University of Chicago (U Chicago)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of San Francisco (USFCA) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Central Missouri (UCMO)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Alabama at Birmingham (UA Birmingh)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Temple University (Temple Uni) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Ohio University (Ohio Russ)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Colorado School of Mines (CSM Mines)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Wisconsin-Milwaukee (UWM)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Northwest Missouri State University (NW Missouri)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Central Michigan University (C Mich)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Notre Dame (Notre Dame) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Bradley University (Bradley)  ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Vanderbilt University (Vanderbilt)  ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California Polytechnic State University (Cal Poly)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Georgia, Athens (GA Athens) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Southern Illinois University, Carbondale (SIUC)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Texas State University (TX State)  ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('The City College of New York, CUNY (CCNY)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Oklahoma State University, Tulsa (OSU Tulsa) ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Tufts University (Tufts) ',290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Arkansas (U Ark) ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Penn State Harrisburg (PSU HBG) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('DePaul University (DePaul) ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Texas A&amp;M University - Corpus Christi (TAMUCC) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Texas at Tyler (UT Tyler) ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Eastern Michigan University (E Mich)  ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('North Dakota State University (NDSU)  ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Fairleigh Dickinson University (FDU)  ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Akron (U of Akron)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Chicago State University (Chicago St)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Southern Illinois University, Edwardsville (SIUE) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Brigham Young University (BYU Fulton)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Northeastern Illinois University (NEIU) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Kentucky (U. Kentucky)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Nevada, Las Vegas (UN LV)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('City University Of New York, Brooklyn College (CUNY Br)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of New Hampshire (U New Hamp)  ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('State University of New York – New Paltz (SUNY NP)  ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State Polytechnic University, Pomona (Cal Poly CPP) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Old Dominion University (ODU) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Bowling Green State University (BGSU) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('State University of New York Polytechnic Institute (SUNY Poly) ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Oakland University (Oakland) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Indiana State University (Ind State) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State University, Channel Islands (CSU CI) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('New Mexico State University (NMSU) ', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State University, San Bernardino (CSU SB) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('South Dakota State University (SD State) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Nebraska, Omaha (UN Omaha)', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('North Carolina A&amp;T State University (NCAT) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Clarkson University (Clarkson) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Kettering University, Flint (Kettering)', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Western Illinois University (WIU)', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Toledo (U. Toledo) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Idaho (Idaho) ', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Louisiana Tech University (LA Tech) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Oregon (U. Oregon) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State University, Dominguez Hills (CSU DH) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Purdue University Northwest (PNW) ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Denver (U Denver) ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Miami (U. Miami)', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Nevada, Reno (UN Reno)', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Gannon University (Gannon)', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Seattle University (Seattle U)', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Texas - El Paso (UT El Paso) ', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Minnesota State University, Mankato (MNSU) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('The University of Alabama (U Alabama)', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Montana State University at Bozeman (Montana SU) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Colorado at Colorado Springs (UCCS) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Louisiana at Lafayette (U.SW Louisi)', 280)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Baylor University (Baylor) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('West Virginia University - Montgomery (West VU)', 270)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Louisville (U Louisville)', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Missouri-St. Louis (UMSL) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Tennessee Technological University (TN Tech)', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Long Island University- Brooklyn (LIU Br) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of North Carolina at Greensboro (UNCG)', 320)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Miami University (Miami U)', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('National University (NU Cal) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Alcorn State University (Alcorn) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Florida Atlantic University (FAU) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State University, San Marcos (CSU SM) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Georgetown University (Georgetown) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Grand Valley State University (GVSU) ',290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Virginia International University (VIU)', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Arkansas at Little Rock (UALR) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Oklahoma City  University (OKCU) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Washington, Tacoma (UW Tacoma) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Marshall University (Marshall) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Dakota State University (DSU) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Minnesota Duluth (UMN Duluth)', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Florida Agricultural and Mechanical University (FAMU) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Ball State University (Ball State) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Memphis (U. Memphis)', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('California State University Chico (CSU Chico)', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Bridgewater State University (BridgeW) ', 310)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Boise State University (Boise State) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Virginia Commonwealth University (VCU) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Villanova University (Villanova) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Wyoming (U Wyoming) ', 260)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Fordham University (Fordham) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Northwestern Polytechnic University (NPU) ', 290)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Howard University (Howard) ', 340)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Mississippi (U. Mississi) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Tulsa (U. Tulsa) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Washington, Bothell (UW Bothell) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('University of Washington, Bothell (UW Bothell) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Southern Arkansas University (SAU Mag)', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Marquette University (Marquette) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Loyola University Chicago (LUC) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('City University Of New York, Queens College (QC CUNY) ', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Sacred Heart University (Sacred Heart)', 300)");
        database.execSQL("INSERT INTO " + TABLE_NAME+ "(univName, score) VALUES ('Cloud State University (SCSU) ', 310)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String query = "DROP TABLE IF EXISTS " +TABLE_NAME;
        db.execSQL(query);
        onCreate(db);
        db.close();
    }


}