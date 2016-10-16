package com.tutorials.hp.recyclerviewcloudcircleimages.mData;

import java.util.ArrayList;

/**
 * Created by Oclemmy on 4/27/2016 for ProgrammingWizards Channel.
 */
public class TVShowsCollection {


    public static ArrayList<TVShow> getTVShows()
    {
        ArrayList<TVShow> tvshows=new ArrayList<>();
        TVShow tv=new TVShow();


        //ADD DATA
        tv.setName("BlackList");
        tv.setUrl("red_s9jrzj.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Breaking Bad");
        tv.setUrl("breaking_wbxtzb.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Fruits");
        tv.setUrl("fruits_xapn76.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Crisis");
        tv.setUrl("crisis_m1btcv.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Ghost Rider");
        tv.setUrl("rider_ehhjol.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Game of Thrones");
        tv.setUrl("thrones_noxbhq.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Shuttle Carrier");
        tv.setUrl("");
        tvshows.add(tv);


        return tvshows;
    }

}
