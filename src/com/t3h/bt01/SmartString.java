package com.t3h.bt01;

import java.util.ArrayList;

public class SmartString {
    String str;
    News news;
    ArrayList<News> data = new ArrayList<>();

    public SmartString(String str) {
        this.str = str;
    }
    private void filter(){
        str = str.replace("/","");
        str=str.replace("<![CDATA[","");
        str=str.replace("]]","");
        str=str.replace("\n","");
        str=str.trim();

        int i = str.indexOf("  ");
        while (i>-1){
            str =str.replace("  "," ");
            i = str.indexOf("  ");
        }

        str= str.replace("<item> <item>","<item>");

        String[] strItem = str.split("<item>");
        for (i = 0; i < strItem.length; i++) {
            if(strItem[i].length()>0){
                String[] k = strItem[i].split("<title>");
                news = new News(strItem[i].split("<title>")[1].replace(">",""),
                        strItem[i].split("<link>")[1].replace(">",""),
                        strItem[i].split("<description>")[1].split("img src=\"")[1].replace(">","").replace(" <a","").replace('"',' ').trim(),
                        strItem[i].split("<pubDate>")[1].replace(">",""));
                data.add(news);
                //news.inThongTin();
            }
        }
    }
    public void inDanhSach(){
        filter();
        for (int i = 0; i < data.size(); i++) {
            System.out.println("---Tin thứ: "+(i+1));
            System.out.println("Tiêu đề: "+data.get(i).getTitle());
            System.out.println("Link chi tiết: "+data.get(i).getLinkDetail());
            System.out.println("Linh ảnh: "+data.get(i).getImgLink());
            System.out.println("Ngày viết: "+data.get(i).getDate());
        }
    }
}
