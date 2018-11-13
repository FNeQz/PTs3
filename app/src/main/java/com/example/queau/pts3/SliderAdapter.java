package com.example.queau.pts3;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {


    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] slide_image ={

    };

    public String[] slide_headings = {
            "Etudiants",
            "Trophées",
            "Modules",
            "Exemplaires"
    };


    //ProgressBars
    public int[] progressBars1 = {
            83,
            87,
            3,
            80
    };
    public String[] textsProgressBars1 = {
            "Sans Trophées",
            "Non Délivré",
            "Actifs avec\ntrophées",
            "Tophées !="
    };



    public int []progressBars2 = {
            10,
            60,
            90,
            20
    };
    public String[] textsProgressBars2 = {
            "Jamais connectés",
            "Inactifs",
            "Actifs avec\ntrophées",
            "Exemplaires !="
    };



    public int []progressBars3 = {
            60,
            60,
            60,
            50
    };
    public String[] textsProgressBars3 = {
            "Groupes\npeuplés",
            "Fantômes",
            "Inactifs",
            "------"
    };


    public int []progressBars4 = {
            90,
            95,
            02,
            32
    };
    public String[] textsProgressBars4 = {
            "Plus de 10\ntrophées",
            "Nettoyables",
            "Nettoyable",
            "------"
    };



    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);

        ProgressBar uneProgressBar = (ProgressBar) view.findViewById(R.id.progressBar) ;
        ProgressBar uneAutreProgressBar = (ProgressBar) view.findViewById(R.id.progressBar2) ;
        ProgressBar troisiemeProgressBar = (ProgressBar) view.findViewById(R.id.progressBar3) ;
        ProgressBar quatriemeProgressBar = (ProgressBar) view.findViewById(R.id.progressBar4) ;


        TextView unTextProgressBar = (TextView) view.findViewById(R.id.textView2);
        TextView unDeuxiemeTextProgressBar = (TextView) view.findViewById(R.id.textView3);
        TextView unTroisiemeTextProgressBar = (TextView) view.findViewById(R.id.textView5);
        TextView unQuatriemeTextProgressBar = (TextView) view.findViewById(R.id.textView6);

        slideHeading.setText(slide_headings[position]);

        uneProgressBar.setProgress(progressBars1[position]);
        uneProgressBar.setMax(100);

        uneAutreProgressBar.setProgress(progressBars2[position]);
        uneAutreProgressBar.setMax(100);

        uneAutreProgressBar.setProgress(progressBars3[position]);
        uneAutreProgressBar.setMax(100);

        uneAutreProgressBar.setProgress(progressBars4[position]);
        uneAutreProgressBar.setMax(100);

        unTextProgressBar.setText(textsProgressBars1[position]);
        unDeuxiemeTextProgressBar.setText(textsProgressBars2[position]);
        unTroisiemeTextProgressBar.setText(textsProgressBars3[position]);
        unQuatriemeTextProgressBar.setText(textsProgressBars4[position]);


        container.addView(view);

        return view;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }
}
