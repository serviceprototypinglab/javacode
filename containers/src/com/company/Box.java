package com.company;


public class Box {
    private int h;
    private int w;
    private int l;
    private String overview;

    public Box(){
        this.h = 0;
        this.w = 0;
        this.l = 0;
        this.overview = "This is 'zero' box.";
    }

    public Box(int h, int w, int l) {
        this.h = h;
        this.w = w;
        this.l = l;
        this.overview = "This is " + h + "x" + w +"x" + l + " box.";
    }

    int volume(){
        int volume = h*w*l;
        overview = overview + " P.S.: Someone already counted the volume.";
        System.out.println(volume);
        return volume;
    }
    void oneLineMethod(){
	System.out.println("line");	
	}

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public int getL() {
        return l;
    }

    public String getOverview() {
        return overview;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
