package com.example.demo.restaurant;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ServiceRestaurant extends Restaurant {

    private List<Data> data =new ArrayList<>( Arrays.asList(

            new Data("5d81a479-add9-11e7-b988-0242ac110002","3al Ahwa Cafe", "عالقهوة كافية", "PUBLISHED", null, "i3qf6gym1p833di.jpg", null, "",
                    null, "", "", "", "", null, false, false, true, true, false),
            new Data("5dc8c6e0-add9-11e7-b988-0242ac110002", "Abdo Kofta", "عبده كفتة", "PUBLISHED", null, null, null, null,
                                   null, "", "", null, null, "", true, false, true, false, false),
            new Data("5dc8c9cb-add9-11e7-b988-0242ac110002", "Abo Adel", "ابو عادل", "PUBLISHED", null, "sq48dmzw.jpg", null, "",
                                  null, "", "", "", "", null, false, false, true, true, false),
            new Data("5dc8cbba-add9-11e7-b988-0242ac110002", "Abou El Sid", "أبو السيد", "PUBLISHED", null, "j02aub2uvkv86w29.jpg", "1006.jpg", "Now Open in Concord Plaza in Tagamoa elkhames, Teseen Street",
                    " زورونا في فرعنا الجديدة كونكورد بلازا  في شارع التسعين،التجمع الخامس", "", "", "", "", null, false, false, true, true, false),
            new Data("5dc945e6-add9-11e7-b988-0242ac110002", "Abou Ghaly", "أبو غالي", "PUBLISHED", null, "ooddxqr1.jpg", null, "",
                    null, "", "", "", "", null, false, false, true, true, false),
            new Data("5dc947ed-add9-11e7-b988-0242ac110002", "Abou Shakra", "أبو شقرة", "PUBLISHED", null, "hyezwomtvab2csor.jpg", "1009.jpg", "",
                    "", "19090", "", "", "", null, false, false, true, true, false),
            new Data("5dc94996-add9-11e7-b988-0242ac110002", "Abo Ammar El Souri", "أبو عمار السورى", "PUBLISHED", null, "dn1yv5gw.jpg", "1012.jpg", "",
                    null, "", "", "", "", null, false, false, true, true, false),
            new Data("5dc94b28-add9-11e7-b988-0242ac110002", "Auntie Anne's", "أنتي أنز", "PUBLISHED", null, "wxdi18cq.jpg", "1014.jpg", "",
                    "", "16629", "", "", "", null, false, false, true, true, false),
            new Data("5dc94cbf-add9-11e7-b988-0242ac110002", "After Eight(Closed)", "أفتر ايت(مغلق)", "UNPUBLISHED", null, "ig22v040ud4h1tt9.jpg",  null, "",
                    null,  "11361", "", "", "", null, false, false, true, true, true),
            new Data("5dc94e49-add9-11e7-b988-0242ac110002", "Spago", "سباجو", "PUBLISHED", null, "e9fo4fb8.jpg",  "irotwr8uyn0l766r.jpg", "",
                    null,  "11361", "", "", "", null, false, false, true, true, false),
            new Data("5dc94fd3-add9-11e7-b988-0242ac110002", "Alain Le Notre (Closed)", "ألان لو نوتر(مغلق)", "UNPUBLISHED", null, "dmg3r20b.jpg",  null, "",
                    "",  "", "", "", "", null, false, false, true, true, true),
            new Data("5dc95164-add9-11e7-b988-0242ac110002", "Alto's Bistro (Closed)", "التوز بيسترو ( مغلق)", "UNPUBLISHED", null, "wd5zwdx4.jpg",  null, "",
                    null,  "", "", "", "", null, false, false, true, true, true),
            new Data("5dc952f9-add9-11e7-b988-0242ac110002", "Andrea Maadi", "أندريا المعادى", "PUBLISHED", null, "t1502hba.jpg",  "iros6vbd4fq4obt9.jpg", "",
                    "",  "", "", "", "", null, false, false, true, true, false),
            new Data("5dc95488-add9-11e7-b988-0242ac110002", "Aqua (Closed)", "أكوا ( مغلق)", "UNPUBLISHED", null, "0dim8mnc.jpg",   null, "",
                    null,  "", "", "", "", null, false, false, true, true, true),
            new Data("5dc956b8-add9-11e7-b988-0242ac110002", "Arabiata El Shabrawy", "أرابياتا الشبراوى", "PUBLISHED", null, "9lfqthe1.jpg",   "1054.jpg", "",
                    null,  "16919", "", "", "", null, false, false, true, true, false),
            new Data("5dc9585b-add9-11e7-b988-0242ac110002", "Arabica (Closed)", "أرابيكا (مغلق)", "UNPUBLISHED", null, "dl1308zl.jpg",   null, "",
                    null,  "", "", "", "", null, false, false, true, true,  true),
            new Data("5dc959f5-add9-11e7-b988-0242ac110002", "Arzak Al Qawther", "أأرزاق الكوثر", "PUBLISHED", null, "avijv9dx.jpg",   "irouje994l81if6r.jpg", "",
                    "تعد سلسله مطاعم ارزاق الكوثر من اقوى مطاعم الطعام الشرقى فى مصر، حيث تدمج مابين اصاله الطعام الشرقى كالفول و الفلافل و الكشرى و بين الوجبات السريعه و سندوتشات اللحوم و الدجاج الشهيه. نتميز بوجود روح العائله بمطاعمنا و توافر كل ما يلائم اى ذوق من اذواق عملائنا اللذين هم اهم ما لدينا","", "", "", "", null, false, false, true, true,  false),
            new Data("5dc95bd2-add9-11e7-b988-0242ac110002", "Asian Corner", "الركن الاسيوي", "PUBLISHED", null, "t5jyfiwb.jpg",   "1065.jpg", "",
                    "",  "", "", "", "", null, false, false, true, true,  false),
            new Data("5dc95d63-add9-11e7-b988-0242ac110002", "Ataturk", "اأتاتورك", "PUBLISHED", null, "pt552i7h.jpg",   "1067.jpg", "",
                    null,  "", "", "", "", null, false, false, true, true,  false),
            new Data("5dc95ee4-add9-11e7-b988-0242ac110002", "Beano's Cafe", "كافيه بينوس", "PUBLISHED", null, "2b873idz.jpg",   "1083.jpg", "",
                    null,  "", "", "", "", null, false, false, true, true,  false)
            )
            );

    public List<Data> findAll() {
        return data;
    }        //Get all restaurants



    public List<Data> openRestaurant(Boolean closed) {            //Get only open restaurants
        for(Data restaurant:data){
            if(restaurant.getClosed()== closed)
                return data ;
        }
        return null;
    }


    public Boolean save(Data restaurant){                //Add or Update new restaurant
        return data.add(restaurant);
    }


    public Boolean updRes( String uuid){
        for(Data restaurant:data){
            if(restaurant.getUuid()== uuid)
                return data.add(restaurant) ;
        }
        return null;

    }


}
