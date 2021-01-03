package com.example.statestriviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TriviaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);

        EditText editText = (EditText)findViewById(R.id.trivia_text);

        // get state
        Intent senderIntent = getIntent();
        String state = senderIntent.getStringExtra("state");
        if ( state.equals("Alabama") ) {
            editText.setText(state+"\nState capital: Montgomery"+"\nState bird: Northern Flicker"+"" +
                    "\nHome of: George Washington Carver, who discovered more than 300 uses for peanuts.");
        } else if ( state.equals("Alaska") ) {
            editText.setText(state+"\nState capital: Juneau"+"\nState bird: Eastern Wild Turkey"+
                    "\nHome of: The longest coastline in the U.S., 6,640 miles, greater than that of all other states combined.");
        } else if ( state.equals("Arizona") ) {
            editText.setText(state+"\nState capital: Phoenix"+"\nState bird: Willow Ptarmigan"+
                    "\nHome of: The most telescopes in the world, in Tucson");
        } else if ( state.equals("Arkansas") ) {
            editText.setText(state+"\nState capital: Little Rock"+"\nState bird: Mockingbird"+
                    "\nHome of: The only active diamond mine in the U.S");
        } else if ( state.equals("California") ) {
            editText.setText(state+"\nState capital: Sacramento"+"\nState bird: California Quail"+
                    "\nHome of: “General Sherman,” a 3,500-year-old tree, and a stand of bristlecone " +
                    "pines 4,000 years old are the world's oldest living things");
        } else if ( state.equals("Colorado") ) {
            editText.setText(state+"\nState capital: Denver"+"\nState bird: Lark Bunting"+
                    "\nHome of: The world's largest silver nugget (1,840 pounds) found in 1894 near Aspen");
        } else if ( state.equals("Connecticut") ) {
            editText.setText(state+"\nState capital: Hartford"+"\nState bird: American Robin"+
                    "\nHome of: The first American cookbook, published in Hartford in 1796: American Cookery by Amelia Simmons");
        } else if ( state.equals("Delaware") ) {
            editText.setText(state+"\nState capital: Dover"+"\nState bird: Blue Hen Chicken"+
                    "\nHome of: The first log cabins in North America, built in 1683 by Swedish immigrants");
        } else if ( state.equals("Florida") ) {
            editText.setText(state+"\nState capital: Tallahassee"+"\nState bird: Mockingbird"+
                    "\nHome of: U.S. spacecraft launchings from Cape Canaveral, formerly Cape Kennedy");
        } else if ( state.equals("Georgia") ) {
            editText.setText(state+"\nState capital: Atlanta"+"\nState bird: Brown Thrasher and Bobwhite Quail"+
                    "\nHome of: The Girl Scouts, founded in Savannah by Juliette Gordon Low in 1912");
        } else if ( state.equals("Hawaii") ) {
            editText.setText(state+"\nState capital: Honolulu"+"\nState bird: Nene"+
                    "\nHome of: The only royal palace in the U.S. (Iolani)");
        } else if ( state.equals("Idaho") ) {
            editText.setText(state+"\nState capital: Boise"+"\nState bird: Peregrine Falcon and Mountain Bluebird"+
                    "\nHome of: The longest main street in America, 33 miles, in Island Park");
        } else if ( state.equals("Illinois") ) {
            editText.setText(state+"\nState capital: Springfield"+"\nState bird: Northern Cardinal"+
                    "\nHome of: The tallest building in the U.S., Sears Tower, in Chicago");
        } else if ( state.equals("Indiana") ) {
            editText.setText(state+"\nState capital: Indianapolis"+"\nState bird: Northern Cardinal"+
                    "\nHome of: The famous car race: the Indy 500");
        } else if ( state.equals("Iowa") ) {
            editText.setText(state+"\nState capital: Des Moines"+"\nState bird: Eastern Goldfinch"+
                    "\nHome of: The shortest and steepest railroad in the U.S., Dubuque: 60° incline, 296 feet");
        } else if ( state.equals("Kansas") ) {
            editText.setText(state+"\nState capital: Topeka"+"\nState bird: Western Meadowlark"+
                    "\nHome of: Helium discovered in 1905 at the University of Kansas");
        } else if ( state.equals("Kentucky") ) {
            editText.setText(state+"\nState capital: Frankfort"+"\nState bird: Northern Cardinal"+
                    "\nHome of: The largest underground cave in the world: 300 miles long, the Mammoth-Flint Cave system");
        } else if ( state.equals("Louisiana") ) {
            editText.setText(state+"\nState capital: Baton Rouge"+"\nState bird: Brown Pelican"+
                    "\nHome of: The most crayfish: 98% of the world's crayfish");
        } else if ( state.equals("Maine") ) {
            editText.setText(state+"\nState capital: Augusta"+"\nState bird: Black-Capped Chickadee"+
                    "\nHome of: The most easterly point in the U.S., West Quoddy Head");
        } else if ( state.equals("Maryland") ) {
            editText.setText(state+"\nState capital: Annapolis"+"\nState bird: Baltimore Oriole"+
                    "\nHome of: The first umbrella factory in the U.S., 1928, Baltimore");
        } else if ( state.equals("Massachusetts") ) {
            editText.setText(state+"\nState capital: Boston"+"\nState bird: Black-Capped Chickadee and Wild Turkey"+
                    "\nHome of: The first World Series, 1903: the Boston “Americans” (became the Red" +
                    " Sox in 1908) vs. the Pittsburg Pirates (Pittsburgh had no “h” between 1890–1911)");
        } else if ( state.equals("Michigan") ) {
            editText.setText(state+"\nState capital: Lansing"+"\nState bird: Robin Redbreast"+
                    "\nHome of: The Cereal Bowl of America, Battle Creek, produces most cereal in the U.S.");
        } else if ( state.equals("Minnesota") ) {
            editText.setText(state+"\nState capital: St. Paul"+"\nState bird: Common Loon"+
                    "\nHome of: The oldest rock in the world, 3.8 billion years old, found in Minnesota River valley");
        } else if ( state.equals("Mississippi") ) {
            editText.setText(state+"\nState capital: Jackson"+"\nState bird: Wood Duck and Mockingbird"+
                    "\nHome of: Coca-Cola, first bottled in 1894 in Vicksburg");
        } else if ( state.equals("Missouri") ) {
            editText.setText(state+"\nState capital: Jefferson City"+"\nState bird: Eastern Bluebird + Bobwhite Quail"+
                    "\nHome of: Mark Twain and some of his characters, such as Tom Sawyer and Huckleberry Finn");
        } else if ( state.equals("Montana") ) {
            editText.setText(state+"\nState capital: Helena"+"\nState bird: Western Meadowlark"+
                    "\nHome of: Grasshopper Glacier, named for the grasshoppers that can still be seen frozen in ice");
        } else if ( state.equals("Nebraska") ) {
            editText.setText(state+"\nState capital: Lincoln"+"\nState bird: Western Meadowlark"+
                    "\nHome of: The only roller skating museum in the world, in Lincoln");
        } else if ( state.equals("Nevada") ) {
            editText.setText(state+"\nState capital: Carson City"+"\nState bird: Mountain Bluebird"+
                    "\nHome of: Rare fish such as the Devils Hole pup, found only in Devils Hole, " +
                    "and other rare fish from prehistoric lakes; also the driest state");
        } else if ( state.equals("New Hampshire") ) {
            editText.setText(state+"\nState capital: Concord"+"\nState bird: Purple Finch"+
                    "\nHome of: Artificial rain, first used near Concord in 1947 to fight a forest fire");
        } else if ( state.equals("New Jersey") ) {
            editText.setText(state+"\nState capital: Trenton"+"\nState bird: Eastern Goldfinch"+
                    "\nHome of: The world's first drive-in movie theater, built in 1933 near Camden");
        } else if ( state.equals("New Mexico") ) {
            editText.setText(state+"\nState capital: Santa Fe"+"\nState bird: Greater Roadrunner"+
                    "\nHome of: “Smokey Bear,” a cub orphaned by fire in 1950, buried in Smokey Bear" +
                    " Historical State Park in 1976");
        } else if ( state.equals("New York") ) {
            editText.setText(state+"\nState capital: Albany"+"\nState bird: Eastern Bluebird"+
                    "\nHome of: The first presidential inauguration: George Washington took the oath" +
                    " of office in New York City on April 30, 1789.");
        } else if ( state.equals("North Carolina") ) {
            editText.setText(state+"\nState capital: Raleigh"+"\nState bird: Northern Cardinal"+
                    "\nHome of: Virginia Dare, the first English child born in America, on Roanoake " +
                    "Island in 1587");
        } else if ( state.equals("North Dakota") ) {
            editText.setText(state+"\nState capital: Bismarck"+"\nState bird: Western Meadowlark"+
                    "\nHome of: The geographic center of North America, in Pierce County, near Balta");
        } else if ( state.equals("Ohio") ) {
            editText.setText(state+"\nState capital: Columbus"+"\nState bird: Northern Cardinal"+
                    "\nHome of: The first electric traffic lights, invented and installed in Cleveland in 1914");
        } else if ( state.equals("Oklahoma") ) {
            editText.setText(state+"\nState capital: Oklahoma City"+"\nState bird: Scissor-Tailed " +
                    "Flycatcher and Wild Turkey"+
                    "\nHome of: The first parking meter, installed in Oklahoma City in 1935");
        } else if ( state.equals("Oregon") ) {
            editText.setText(state+"\nState capital: Salem"+"\nState bird: Western Meadowlark"+
                    "\nHome of: The world's smallest park, totaling 452 inches, created in Portland" +
                    "on St. Patrick's Day for leprechauns and snail races");
        } else if ( state.equals("Pennsylvania") ) {
            editText.setText(state+"\nState capital: Harrisburg"+"\nState bird: Ruffed Grouse"+
                    "\nHome of: The first magazine in America: the American Magazine, published in " +
                    "Philadelphia for 3 months in 1741");
        } else if ( state.equals("Rhode Island") ) {
            editText.setText(state+"\nState capital: Providence"+"\nState bird: Rhode Island Red"+
                    "\nHome of: Rhode Island Red chickens, first bred in 1854; the start of poultry " +
                    "as a major American industry");
        } else if ( state.equals("South Carolina") ) {
            editText.setText(state+"\nState capital: Columbia"+"\nState bird: Carolina Wren"+
                    "\nHome of: The first tea farm in the U.S., created in 1890 near Summerville");
        } else if ( state.equals("South Dakota") ) {
            editText.setText(state+"\nState capital: Pierre"+"\nState bird: Ring-Necked Pheasant"+
                    "\nHome of: The world's largest natural, indoor warmwater pool, Evans' Plunge in" +
                    " Hot Springs");
        } else if ( state.equals("Tennessee") ) {
            editText.setText(state+"\nState capital: Nashville"+"\nState bird: Mockingbird and Bobwhite Quail"+
                    "\nHome of: Graceland, the estate and gravesite of Elvis Presley");
        } else if ( state.equals("Texas") ) {
            editText.setText(state+"\nState capital: Austin"+"\nState bird: Mockingbird"+
                    "\nHome of: NASA, in Houston, headquarters for all piloted U.S. space projects");
        } else if ( state.equals("Utah") ) {
            editText.setText(state+"\nState capital: Salt Lake City"+"\nState bird: California Gull"+
                    "\nHome of: Rainbow Bridge, the largest natural stone bridge in the world, 290 " +
                    "feet high, 275 feet across");
        } else if ( state.equals("Vermont") ) {
            editText.setText(state+"\nState capital: Montpelier"+"\nState bird: Hermit Thrush"+
                    "\nHome of: The largest production of maple syrup in the U.S.");
        } else if ( state.equals("Virginia") ) {
            editText.setText(state+"\nState capital: Richmond"+"\nState bird: Northern Cardinal"+
                    "\nHome of: The only full-length statue of George Washington, placed in capitol in 1796");
        } else if ( state.equals("Washington") ) {
            editText.setText(state+"\nState capital: Olympia"+"\nState bird: Willow Goldfinch"+
                    "\nHome of: Lunar Rover, the vehicle used by astronauts on the moon; Boeing, in" +
                    " Seattle, makes aircraft and spacecraft");
        } else if ( state.equals("West Virginia") ) {
            editText.setText(state+"\nState capital: Charleston"+"\nState bird: Northern Cardinal"+
                    "\nHome of: Marbles; most of the country's glass marbles made around Parkersburg");
        } else if ( state.equals("Wisconsin") ) {
            editText.setText(state+"\nState capital: Madison"+"\nState bird: American Robin and Mourning Dove"+
                    "\nHome of: The typewriter, invented in Milwaukee in 1867");
        } else if ( state.equals("Wyoming") ) {
            editText.setText(state+"\nState capital: Cheyenne"+"\nState bird: Western Meadowlark"+
                    "\nHome of: The “Register of the Desert,” a huge granite boulder covering 27 " +
                    "acres with 5,000 early pioneer names carved on it");
        } else {
            editText.setText(state+"\nNever heard of that.");
        }

        // return button
        Button button = (Button) findViewById(R.id.return_button);
        button.setOnClickListener((v) -> {
            Intent intent = new Intent (TriviaActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }

}