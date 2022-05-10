package com.example.quiz;
import java.util.Random;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class topic1quiz extends AppCompatActivity {
    String topic = "1";
    String playerName;
    MediaPlayer wansa;
    MediaPlayer cansa;
    MediaPlayer clock;
    String[] q = new String[10];
    String[] a = {"D","A","C","B","C","C","A","D","A","D"};
    public void assign_topic(){
        if(topic.equals("1")){
            q[0] = "Which of the following geographical term related to the ''piece of sub-continental land that is surrounded by water''?\n" +
                    "A. Peninsula\n" +
                    "\n" +
                    "B. Gulf\n" +
                    "\n" +
                    "C. Strait\n" +
                    "\n" +
                    "D. Island";
            a[0] = "D";
            q[1] = "Which of the following geographical term related to a body of land surrounded by water on three sides?\n" +
                    "A. Peninsula\n" +
                    "\n" +
                    "B. Gulf\n" +
                    "\n" +
                    "C. Strait\n" +
                    "\n" +
                    "D. Island";
            a[1] = "A";q[2] = "Which of the following geographical term related to a naturally formed, narrow, typically navigable waterway that connects two larger bodies of water?\n" +
                    "A. Peninsula\n" +
                    "\n" +
                    "B. Gulf\n" +
                    "\n" +
                    "C. Strait\n" +
                    "\n" +
                    "D. Island";
            a[2] = "C";q[3] = "Which of the following is a suitable definition of ‘Archipelago’?\n" +
                    "A. A circular coral reef that encloses a shallow lagoon.\n" +
                    "\n" +
                    "B. A chain or set of islands grouped together.\n" +
                    "\n" +
                    "C. The plant and animal life on the earth.\n" +
                    "\n" +
                    "D. None of the above";
            a[3] = "B";q[4] = "Which of the following is the largest Archipelago in the world?\n" +
                    "A. Andaman & Nicobar Island\n" +
                    "\n" +
                    "B. Malaysia\n" +
                    "\n" +
                    "C. Indonesia\n" +
                    "\n" +
                    "D. Maldives";
            a[4] = "C";q[5] = "Which of the following is the world’s largest peninsula?\n" +
                    "A. India\n" +
                    "\n" +
                    "B. South Africa\n" +
                    "\n" +
                    "C. Arabia\n" +
                    "\n" +
                    "D. Both A & B";
            a[5] = "C";q[6] = "Which of the following passes cuts through the Pir Panjal range and links Manali and Leh by road?\n" +
                    "A. Rohtas Pass\n" +
                    "\n" +
                    "B. Mana Pass\n" +
                    "\n" +
                    "C. Niti Pass\n" +
                    "\n" +
                    "D. Nathula Pass";
            a[6] = "A";q[7] = "Which of the following pass has been created by the Indus River?\n" +
                    "A. Rohtas Pass\n" +
                    "\n" +
                    "B. Nathula Pass\n" +
                    "\n" +
                    "C. Baralachala Pass\n" +
                    "\n" +
                    "D. Banihal Pass";
            a[7] = "D";q[8] = "Which passes make way to the land route between Kailash and the Manasarovar?\n" +
                    "A. Mana Pass\n" +
                    "\n" +
                    "B. Rohtas Pass\n" +
                    "\n" +
                    "C. Nathula Pass\n" +
                    "\n" +
                    "D. Baralachala Pass";
            a[8] = "A";q[9] = "Which of the following passes link Srinagar to Leh?\n" +
                    "A. Mana Pass\n" +
                    "\n" +
                    "B. Rohtas Pass\n" +
                    "\n" +
                    "C. Nathula Pass\n" +
                    "\n" +
                    "D. Zoji La Pass";
            a[9] = "D";
        }
        else if(topic.equals("2")){
            q[0] = "Which of the following countries are divided by the Radcliffe Line?\n" +
                    "A. India and Pakistan\n" +
                    "\n" +
                    "B. India and China\n" +
                    "\n" +
                    "C. India and Bangladesh\n" +
                    "\n" +
                    "D.  India and Nepal";
            a[0] = "A";
            q[1] = "Which of the following place has never got the vertical rays of the Sun?\n" +
                    "A. Srinagar\n" +
                    "\n" +
                    "B. Mumbai\n" +
                    "\n" +
                    "C. Chennai\n" +
                    "\n" +
                    "D. Thiruvananthapuram";
            a[1] = "A";q[2] = "Which of the following countries are divided by the Durand Line?\n" +
                    "A. Afghanistan and Pakistan\n" +
                    "\n" +
                    "B. India and Pakistan\n" +
                    "\n" +
                    "C. India and China\n" +
                    "\n" +
                    "D. India and Burma";
            a[2] = "A";q[3] = "Where is the India's permanent research station Dakshin Gangotri?\n" +
                    "A. Great Himalayas\n" +
                    "\n" +
                    "B. Indian Ocean\n" +
                    "\n" +
                    "C. Antarctica\n" +
                    "\n" +
                    "D. Arabian Sea";
            a[3] = "C";q[4] = "Which of the following Indian state touches the boundaries of the maximum number of other States?\n" +
                    "A. Andhra Pradesh\n" +
                    "\n" +
                    "B. Bihar\n" +
                    "\n" +
                    "C. Madhya Pradesh\n" +
                    "\n" +
                    "D. Uttar Pradesh";
            a[4] = "D";q[5] = "Where is the Duncan Pass located?\n" +
                    "A. South and Little Andaman\n" +
                    "\n" +
                    "B. North and South Andaman\n" +
                    "\n" +
                    "C. North and Middle Andaman\n" +
                    "\n" +
                    "D. Andaman and Nicobar";
            a[5] = "A";q[6] = "Which of the following cities are called the twin cities?\n" +
                    "A. Delhi and Faridabad\n" +
                    "\n" +
                    "B. Mumbai and Pune\n" +
                    "\n" +
                    "C. Hyderabad and Secunderabad\n" +
                    "\n" +
                    "D. Bangalore and Mysore";
            a[6] = "C";q[7] = "Which State is called the sugar bowl of India?\n" +
                    "A. Uttar Pradesh\n" +
                    "\n" +
                    "B. Chhattisgarh\n" +
                    "\n" +
                    "C. Andhra Pradesh\n" +
                    "\n" +
                    "D. Bihar";
            a[7] = "A";q[8] = "Which of the following countries are divided by McMohan line?\n" +
                    "A. India and Pakistan\n" +
                    "\n" +
                    "B. India and China\n" +
                    "\n" +
                    "C. India and Bangladesh\n" +
                    "\n" +
                    "D. Pakistan and China";
            a[8] = "B";q[9] = "Which is the highest dam in India?\n" +
                    "A. Bhakra dam\n" +
                    "\n" +
                    "B. Nagarjuna Sagar dam\n" +
                    "\n" +
                    "C. Hirakud dam\n" +
                    "\n" +
                    "D. Tehri dam";
            a[9] = "D";
        }
        else if(topic.equals("3")){
            q[0] = "Consider the following statement(s) related to alluvial soils. I. The soil covers 40 percent part of total geographical area of India. II. They are formed due to depositional work done by rivers in plains .valleys, flood plain and deltas\n" +
                    "Which of the above statement(s) is/are correct? Code:\n" +
                    "A. Only I\n" +
                    "\n" +
                    "B. Only II\n" +
                    "\n" +
                    "C. Both I and II\n" +
                    "\n" +
                    "D. Neither I nor II";
            a[0] = "C";
            q[1] = "Consider the following statement(s) related to Regur soils or Black cotton soils. I. It is formed by solidification of lava spread over large area of Deccan plateau. II. They are very rich in minerals contents because these soils were formed due to volcanic activities. III. They are found in Karnataka, Maharashtra, MP, Gujarat, AP and Tamil Nadu. Which of the above statement(s) is/are correct? Code:\n" +
                    "A. Only I\n" +
                    "\n" +
                    "B. Only II\n" +
                    "\n" +
                    "C. Both I and II\n" +
                    "\n" +
                    "D. I, II, III";
            a[1] = "D";q[2] = "Consider the following statement(s) related to Red and yellow Soils. I. They are formed by decomposition of Granite (igneous) and Gneiss (metamorphic rocks). II. They are Reddish in colour because presence of iron oxide in it. III. These soils lack in Nitrogen, Phosphorous Acid and organic matter and are less fertile. Which of the above statement(s) is/are correct? Code:\n" +
                    "A. Only I\n" +
                    "\n" +
                    "B. Only II\n" +
                    "\n" +
                    "C. Both I and II\n" +
                    "\n" +
                    "D. I, II, III";
            a[2] = "D";q[3] = "Which of the following rivers system form a part of the Koyna River?\n" +
                    "A. The Cauvery\n" +
                    "\n" +
                    "B. The Krishna\n" +
                    "\n" +
                    "C. The Godavari\n" +
                    "\n" +
                    "D. The Mahanadi";
            a[3] = "B";q[4] = "Which of the following river system created  the Jog waterfalls?\n" +
                    "A. Tunga bhadra\n" +
                    "\n" +
                    "B. Sharavathi\n" +
                    "\n" +
                    "C. Koyna\n" +
                    "\n" +
                    "D. None of the above";
            a[4] = "B";q[5] = "Which of the following factor  is support the non perennial features of peninsular India rivers?\n" +
                    "A. Rainfall is seasonal\n" +
                    "\n" +
                    "B. Rainfall is low\n" +
                    "\n" +
                    "C. Rainfall varies from year to year\n" +
                    "\n" +
                    "D. None of the above";
            a[5] = "A";q[6] = "Which of the following  is the largest river basin of  Indian peninsular region ?\n" +
                    "A. Godavari\n" +
                    "\n" +
                    "B. Mahanadi\n" +
                    "\n" +
                    "C. Krishna\n" +
                    "\n" +
                    "D. Koyna";
            a[6] = "A";q[7] = "What factor responsible  for directing the Indian peninsular river the Narmada and Tapti rivers to flow westwards?\n" +
                    "A. Old river courses\n" +
                    "\n" +
                    "B. Valleys carved by erosion\n" +
                    "\n" +
                    "C. Faults Boundness\n" +
                    "\n" +
                    "D. Rift Valley";
            a[7] = "C";q[8] = "The Luni River is flowing from which of the following region? \n" +
                    "A. Punjab\n" +
                    "\n" +
                    "B. Rajasthan\n" +
                    "\n" +
                    "C. Himachal Pradesh\n" +
                    "\n" +
                    "D. Madhya Pradesh";
            a[8] = "B";q[9] = "The Tapti River is flowing from which of the following region?\n" +
                    "A. Satpura range\n" +
                    "\n" +
                    "B. Vindhyachal range\n" +
                    "\n" +
                    "C. Western Ghats\n" +
                    "\n" +
                    "D. Eastern Ghats";
            a[9] = "A";
        }
        else if(topic.equals("4")){
            q[0] = "Which of the following statements concerning spatial systems is not correct?\n" +
                    "\n" +
                    "A. Maps cannot be used to measure and analyze systems, only models can.\n" +
                    "\n" +
                    "B. The analysis of the role of each component helps reveal the operation of the entire system.\n" +
                    "\n" +
                    "C. They function as units because their component parts are interdependent.\n" +
                    "\n" +
                    "D. Spatial systems may be the basis for regional identification.";
            a[0] = "A";
            q[1] = "The essential perspective used by geographers in forming their concepts is:\n" +
                    "\n" +
                    "A. Absolute.\n" +
                    "\n" +
                    "B. Human.\n" +
                    "\n" +
                    "C. Relative.\n" +
                    "\n" +
                    "D. Spatial.";
            a[1] = "D";q[2] = "Arithmetic density:\n" +
                    "\n" +
                    "A. cannot be used to compare regions.\n" +
                    "\n" +
                    "B. is an absolute relationship such as population per square kilometre\n" +
                    "\n" +
                    "C. is more meaningful than physiological density.\n" +
                    "\n" +
                    "D. refers to the number of persons per unit of arable land.";
            a[2] = "B";q[3] = "Site refers to the:\n" +
                    "\n" +
                    "A. External features of a place.\n" +
                    "\n" +
                    "B. Precise location of the centre of a city.\n" +
                    "\n" +
                    "C. Proximity to natural resources or transportation routes.\n" +
                    "\n" +
                    "D. Internal locational attributes of a place.";
            a[3] = "D";q[4] = "Regional boundaries are marked by:\n" +
                    "\n" +
                    "A. Precise decisions based upon the scale of the map.\n" +
                    "\n" +
                    "B. Dramatic changes in the region's unifying characteristic.\n" +
                    "\n" +
                    "C. Spatial reality.\n" +
                    "\n" +
                    "D. The boundaries of a city or incorporated political unit.";
            a[4] = "B";q[5] = "The statement that \"the journey to work is 15 minutes by bus\" is an example of:\n" +
                    "\n" +
                    "A. Absolute direction.\n" +
                    "\n" +
                    "B. Absolute distance.\n" +
                    "\n" +
                    "C. Relative direction.\n" +
                    "\n" +
                    "D. Relative distance.";
            a[5] = "D";q[6] = "Which of the following is related to the ''Perceptual regions'' ?\n" +
                    "\n" +
                    "A.  It only states about the vigorously structured than formal or functional regions.\n" +
                    "\n" +
                    "B.  Considered only the understandings of geographers.\n" +
                    "\n" +
                    "C. Define areas only as far as the eye can see.\n" +
                    "\n" +
                    "D. It reflect human feelings and attitudes about areas.";
            a[6] = "D";q[7] = "Which of the following attributes supplementes when the geographer defines patterns and processes of spatial interaction ?\n" +
                    "\n" +
                    "A. Accessibility and connectivity.\n" +
                    "\n" +
                    "B. Density and dispersion.\n" +
                    "\n" +
                    "C. Diffusion and pattern.\n" +
                    "\n" +
                    "D. Pedestrian cities.";
            a[7] = "D";q[8] = "The map type best used to record not only the presence of a phenomenon but to suggest its spatial pattern, distribution, or dispersion is:\n" +
                    "\n" +
                    "A. dot.\n" +
                    "\n" +
                    "B. choropleth.\n" +
                    "\n" +
                    "C. isoline.\n" +
                    "\n" +
                    "D. statistical.";
            a[8] = "A";q[9] = "Which of the following statements concerning the globe grid is not correct?\n" +
                    "\n" +
                    "A. Lines of latitude are always parallel to the equator.\n" +
                    "\n" +
                    "B. Meridians and parallels intersect at right angles.\n" +
                    "\n" +
                    "C. The equator is one-half the length of a meridian.\n" +
                    "\n" +
                    "D. The scale on the surface of the globe is everywhere the same in every direction.";
            a[9] = "C";
        }
        else if(topic.equals("5")){
            q[0] = "Which one of the following rivers has the highest replenishable ground water resource in the country?\n" +
                    "\n" +
                    "A. The Yamuna\n" +
                    "\n" +
                    "B. The Ganga\n" +
                    "\n" +
                    "C. Tsangpo-Brahmaputra\n" +
                    "\n" +
                    "D. Dakshina Ganga";
            a[0] = "B";
            q[1] = "Which one of the following sectors has the greater proportion of the total water used in India?\n" +
                    "\n" +
                    "A. Irrigation\n" +
                    "\n" +
                    "B. Domestic use\n" +
                    "\n" +
                    "C. Industries\n" +
                    "\n" +
                    "D. Mining and coal field";
            a[1] = "A";q[2] = "Which one of the following States has the majority and the major oil fields in India?\n" +
                    "\n" +
                    "A. Assam\n" +
                    "\n" +
                    "B. Gujarat\n" +
                    "\n" +
                    "C. Jharkhand\n" +
                    "\n" +
                    "D. Tamil Nadu";
            a[2] = "A";q[3] = "Which of the following is/are the key part of India's three stage nuclear power programme?\n" +
                    "\n" +
                    "A. Thorium-based fuels\n" +
                    "\n" +
                    "B. To design for an atomic reactor using thorium and low-enriched uranium\n" +
                    "\n" +
                    "C. To develop a prototype atomic reactor using thorium and low-enriched uranium\n" +
                    "\n" +
                    "D. All of the above";
            a[3] = "D";q[4] = "Which one of the following minerals has another name called ‘brown diamond’?\n" +
                    "\n" +
                    "A. Iron\n" +
                    "\n" +
                    "B. Manganese\n" +
                    "\n" +
                    "C. Lignite\n" +
                    "\n" +
                    "D. Mica";
            a[4] = "C";q[5] = "Select the correct non-renewable source of energy?\n" +
                    "\n" +
                    "A. Hydel\n" +
                    "\n" +
                    "B. Thermal\n" +
                    "\n" +
                    "C. Solar\n" +
                    "\n" +
                    "D. Wind power";
            a[5] = "B";q[6] = "Which of the following is not one of the factors for industrial location and development?\n" +
                    "\n" +
                    "A. Market\n" +
                    "\n" +
                    "B. Population Density\n" +
                    "\n" +
                    "C. Capital\n" +
                    "\n" +
                    "D. Power";
            a[6] = "B";q[7] = "Which of the following is the India’s earliest Iron and Steel Company?\n" +
                    "\n" +
                    "A. IISCO\n" +
                    "\n" +
                    "B. TISCO\n" +
                    "\n" +
                    "C. Visvesvaraiya Iron and Steel Works\n" +
                    "\n" +
                    "D. Mysore Iron and Steel Works.";
            a[7] = "B";q[8] = "What was the reason for development of the first modern cotton mill in Mumbai?\n" +
                    "\n" +
                    "A. Mumbai is a port\n" +
                    "\n" +
                    "B. It is located near cotton growing area\n" +
                    "\n" +
                    "C. Mumbai was the financial centre\n" +
                    "\n" +
                    "D. All of the above.";
            a[8] = "B";q[9] = "Which of the following is the nucleus of the Hugli Industrial Region?\n" +
                    "\n" +
                    "A. Kolkata-Haora\n" +
                    "\n" +
                    "B. Kolkata-Medinipur\n" +
                    "\n" +
                    "C. Kolkata-Rishra\n" +
                    "\n" +
                    "D. Kolkata-Konnagars";
            a[9] = "A";
        }
        else{
            q[0] = "India's population, as on 1 March 2011\n" +
                    "(A) 1,010,193,422 Billion\n" +
                    "\n" +
                    "(B) 9,10,193,422 Billion\n" +
                    "\n" +
                    "(C) 1,210,193,422 Billion\n" +
                    "\n" +
                    "(D) 1,910,193,422 Billion";
            a[0] = "C";
            q[1] = " India's largest city by population\n" +
                    "(A) Delhi\n" +
                    "\n" +
                    "(B) Mumbai\n" +
                    "\n" +
                    "(C) Chennai\n" +
                    "\n" +
                    "(D) Pune";
            a[1] = "B";q[2] = "Number of State and Union Territories in India\n" +
                    "(A) 27 States and 8 Union Territories\n" +
                    "\n" +
                    "(B) 29 States and 7 Union Territories\n" +
                    "\n" +
                    "(C) 27 States and 6 Union Territories\n" +
                    "\n" +
                    "(D) 23 States and 10 Union Territories\n";
            a[2] = "B";q[3] = "India's population density\n" +
                    "(A) 382/km2\n" +
                    "\n" +
                    "(B) 290/km2\n" +
                    "\n" +
                    "(C) 375/km2\n" +
                    "\n" +
                    "(D) 423/km2";
            a[3] = "A";q[4] = "India's total area\n" +
                    "(A) 3.7 Million sq. km\n" +
                    "\n" +
                    "(B) 3.0 Million sq. km\n" +
                    "\n" +
                    "(C) 4.2 Million sq. km\n" +
                    "\n" +
                    "(D) 3.3 Million sq. km\n";
            a[4] = "D";q[5] = "Sex ratio of India according to the 2011 census\n" +
                    "(A) 940\n" +
                    "\n" +
                    "(B) 972\n" +
                    "\n" +
                    "(C) 845\n" +
                    "\n" +
                    "(D) 774";
            a[5] = "A";q[6] = "What is the name of India's National Aquatic Animal?\n" +
                    "(A) River Dolphin\n" +
                    "\n" +
                    "(B) Crocodile\n" +
                    "\n" +
                    "(C) Katla Fish\n" +
                    "\n" +
                    "(D) Green Frog";
            a[6] = "A";q[7] = "In which century did Portuguese merchants first land in Goa?\n" +
                    "(A) 17th Century\n" +
                    "\n" +
                    "(B) 15th Century\n" +
                    "\n" +
                    "(C) 14th Century\n" +
                    "\n" +
                    "(D) 16th Century";
            a[7] = "D";q[8] = "Who designed the Indian Parliament in New Delhi?\n" +
                    "(A) Gustave Eiffel\n" +
                    "\n" +
                    "(B) Le Corbusier\n" +
                    "\n" +
                    "(C) Edwin Landseer Lutyens\n" +
                    "\n" +
                    "(D) Bonanno Pisano";
            a[8] = "C";q[9] = "Which monument was built to commemorate the visit of King George V and Queen Mary to Bombay?\n" +
                    "(A) India Gate\n" +
                    "\n" +
                    "(B) Gateway of India\n" +
                    "\n" +
                    "(C) Victoria Terminus\n" +
                    "\n" +
                    "(D) Elephanta Caves";
            a[9] = "B";
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (clock.isPlaying()) {
            clock.stop(); // or mp.pause();
            clock.release();
        }
    }

    public final static String Extra_Name = "com.example.quiz.extra.NAME";
    TextView tp1q;
    TextView qno;
    TextView timer;
    Random rand = new Random();
    Integer index;
    boolean [] used_index = {false,false,false,false,false,false,false,false,false,false};
    int random_num;
    private Button Option1;
    private Button Option2;
    private Button Option3;
    private Button Option4;
    int score=0;
    int i=0;
    public void question(){
        tp1q = findViewById(R.id.tp1q);
        qno = findViewById(R.id.qno);
        if(i<10){
            random_num = rand.nextInt(10);
            while(used_index[random_num]){
                random_num = rand.nextInt(10);
            };
            index = random_num;
            used_index[index] = true;
            tp1q.setText(q[index]);
            qno.setText("Question "+(i+1));
        }
        else{
            Intent intent = new Intent(topic1quiz.this,resultscreen.class);
            String Score = ""+score;
            intent.putExtra(Extra_Name,Score);
            intent.putExtra(Extra_Name+"playerName",playerName);
            startActivity(intent);
            clock.stop();
            finish();
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic1quiz);
        Option1 = findViewById(R.id.Option1);
        Option2 = findViewById(R.id.Option2);
        Option3 = findViewById(R.id.Option3);
        Option4 = findViewById(R.id.Option4);
        timer = findViewById(R.id.timer);
        wansa = MediaPlayer.create(topic1quiz.this, R.raw.wansa);
        cansa = MediaPlayer.create(topic1quiz.this, R.raw.cansa);
        clock = MediaPlayer.create(topic1quiz.this, R.raw.clock);
        clock.setLooping(true);
        clock.start();
        Intent intent_main = getIntent();
        topic = intent_main.getStringExtra(MainActivity.Extra_Topic);
        playerName = intent_main.getStringExtra((MainActivity.Extra_Topic+"playerName"));
        assign_topic();
        question();
        new CountDownTimer(58000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText("Time remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                timer.setText("TIME OVER!");
                i = 11;
                question();
            }
        }.start();
        Option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[index].equals("A")){
                    score+=1;
                    cansa.start();
                    Toast.makeText(topic1quiz.this, "Correct!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    wansa.start();
                    Toast.makeText(topic1quiz.this, "Incorrect!!", Toast.LENGTH_SHORT).show();
                }
                i++;
                question();
            }
        });

        Option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[index].equals("B")){
                    score+=1;
                    cansa.start();
                    Toast.makeText(topic1quiz.this, "Correct!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    wansa.start();
                    Toast.makeText(topic1quiz.this, "Incorrect!!", Toast.LENGTH_SHORT).show();
                }
                i++;
                question();
            }
        });

        Option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[index].equals("C")){
                    score+=1;
                    cansa.start();
                    Toast.makeText(topic1quiz.this, "Correct!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    wansa.start();
                    Toast.makeText(topic1quiz.this, "Incorrect!!", Toast.LENGTH_SHORT).show();
                }
                i++;
                question();
            }
        });

        Option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[index].equals("D")){
                    score+=1;
                    cansa.start();
                    Toast.makeText(topic1quiz.this, "Correct!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    wansa.start();
                    Toast.makeText(topic1quiz.this, "Incorrect!!", Toast.LENGTH_SHORT).show();
                }
                i++;
                question();
            }
        });
    }
}