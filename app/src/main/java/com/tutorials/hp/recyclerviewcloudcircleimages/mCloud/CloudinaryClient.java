package com.tutorials.hp.recyclerviewcloudcircleimages.mCloud;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;

/**
 * Created by Oclemmy on 4/27/2016 for ProgrammingWizards Channel.
 */
public class CloudinaryClient {

    public static String getCircleImage(String imageName)
    {
        Cloudinary cloud=new Cloudinary(MyConfiguation.getMyConfigs());

        //MANIPULATION
        Transformation t=new Transformation();
        t.radius("max").crop("thumb");

        String url=cloud.url().transformation(t).generate(imageName);

        return url;
    }

}
