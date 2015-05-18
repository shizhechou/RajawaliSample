package com.eyehouse.vrhomecardboard;

import android.content.Context;
import android.util.Log;

import org.rajawali3d.materials.Material;
import org.rajawali3d.materials.methods.DiffuseMethod;
import org.rajawali3d.materials.textures.ATexture;
import org.rajawali3d.materials.textures.Texture;
import org.rajawali3d.primitives.Sphere;

/**
 * Created by shizhe on 15/5/16.
 */
public class SphereViewRenderer extends VRRenderer {

    private String TAG = "SphereViewRender";
    private Sphere earthSphere;
    public SphereViewRenderer(Context context) {
        super(context);
    }

    @Override
    public void initScene() {

        try{

            Material material = new Material();
            material.enableLighting(true);
            material.setDiffuseMethod(new DiffuseMethod.Lambert());
            material.setColor(0);

            Texture earthTexture = new Texture("Earth", R.drawable.pano_1);

            try{
                material.addTexture(earthTexture);

            } catch (ATexture.TextureException error){
                Log.d("DEBUG", "TEXTURE ERROR");
            }

            earthSphere = new Sphere(1, 24, 24);
            earthSphere.setMaterial(material);
            //earthSphere.setBackSided(false);
            //earthSphere.setRotX(180);

            getCurrentScene().addChild(earthSphere);
            getCurrentCamera().setZ(4.2f);

        }catch(Exception e){
            e.printStackTrace();
        }
        super.initScene();

    }
}
