package com.eyehouse.vrhomecardboard;

import android.content.Context;
import android.view.MotionEvent;

import org.rajawali3d.renderer.RajawaliSideBySideRenderer;

/**
 * Created by shizhe on 15/5/16.
 */
public class VRRenderer extends RajawaliSideBySideRenderer {

    public VRRenderer(Context context) {
        super(context);
        setFrameRate(60);

    }

    @Override
    public void initScene() {
        super.initScene();
    }

    @Override
    protected void onRender(long ellapsedTime, double deltaTime) {
        super.onRender(ellapsedTime, deltaTime);
    }

    /**
     * NOTE: Only relevant when rendering a live wallpaper.
     * <p/>
     * Called to inform you of the wallpaper's offsets changing within its contain, corresponding to the container's
     * call to WallpaperManager.setWallpaperOffsets().
     *
     * @param xOffset
     * @param yOffset
     * @param xOffsetStep
     * @param yOffsetStep
     * @param xPixelOffset
     * @param yPixelOffset
     */
    @Override
    public void onOffsetsChanged(float xOffset, float yOffset, float xOffsetStep, float yOffsetStep, int xPixelOffset, int yPixelOffset) {

    }

    /**
     * Called as the user performs touch-screen interaction with the window that is currently showing this wallpaper.
     * Note that the events you receive here are driven by the actual application the user is interacting with,
     * so if it is slow you will get fewer move events.
     *
     * @param event {@link android.view.MotionEvent} The touch event.
     */
    @Override
    public void onTouchEvent(MotionEvent event) {

    }
}
