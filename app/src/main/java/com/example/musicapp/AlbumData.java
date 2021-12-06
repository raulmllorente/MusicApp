package com.example.musicapp;

public class AlbumData {
    String name;
    int year;
    int image;

    public AlbumData(){
        this.name  = "";
        this.year = 0;
        this.image = 0;
    }

    public AlbumData (String name, int year, int image){
        this.name  = name;
        this.year = year;
        this.image = image;
    }

    public static final AlbumData[] AlbumList = {
            new AlbumData("Skrillex", 1, 0),
            new AlbumData("Woody Jackson", 2, 0),
            new AlbumData("Inon Zur", 3, 0)
    };

    public static final AlbumData[] SkrList = {
            new AlbumData("Kyoto", 2012, R.drawable.skrillex_cover),
            new AlbumData("Right In", 2012, R.drawable.skrillex_cover),
            new AlbumData("Bangarang", 2012, R.drawable.skrillex_cover)
    };

    public static final AlbumData[] WJList = {
            new AlbumData("American Venom", 2018, R.drawable.rdr2_cover),
            new AlbumData("Red Dead Redemption", 2018, R.drawable.rdr2_cover),
            new AlbumData("Outlaws From The West", 2018, R.drawable.rdr2_cover)
    };

    public static final AlbumData[] IZList = {
            new AlbumData("Rebuild, Renew", 2015, R.drawable.fallout4_cover),
            new AlbumData("Of the People, for the People", 2015, R.drawable.fallout4_cover),
    };
}
