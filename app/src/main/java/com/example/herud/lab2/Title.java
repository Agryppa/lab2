package com.example.herud.lab2;

/**
 * Created by Herud on 2018-04-10.
 */

public class Title {
    private String title;
    private Integer picture;
    private String category;
    private int id;

    public Title(String title, Integer pic,String cat,int id)
    {
        this.title=title;
        this.picture=pic;
        this.category=cat;
        this.id=id;

    }


    public Integer getPicture()
    {
        return picture;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory()
    {
        return category;
    }

    public int getId() {
        return id;
    }
}
