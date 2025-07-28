package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: nmd  reason: default package */
public final class nmd extends GLSurfaceView {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final SensorManager b;
    public final Sensor c;
    public final oga o;
    public final Handler w0 = new Handler(Looper.getMainLooper());
    public final olc x0;
    public SurfaceTexture y0;
    public Surface z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nmd(Context context) {
        super(context, (AttributeSet) null);
        Sensor sensor = null;
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        sensor = mze.a >= 18 ? sensorManager.getDefaultSensor(15) : sensor;
        this.c = sensor == null ? sensorManager.getDefaultSensor(11) : sensor;
        olc olc = new olc();
        this.x0 = olc;
        mmd mmd = new mmd(this, olc);
        jne jne = new jne(context, mmd);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.o = new oga(windowManager.getDefaultDisplay(), jne, mmd);
        this.A0 = true;
        setEGLContextClientVersion(2);
        setRenderer(mmd);
        setOnTouchListener(jne);
    }

    public final void a() {
        boolean z = this.A0 && this.B0;
        Sensor sensor = this.c;
        if (sensor != null && z != this.C0) {
            oga oga = this.o;
            SensorManager sensorManager = this.b;
            if (z) {
                sensorManager.registerListener(oga, sensor, 0);
            } else {
                sensorManager.unregisterListener(oga);
            }
            this.C0 = z;
        }
    }

    public nu1 getCameraMotionListener() {
        return this.x0;
    }

    public e4f getVideoFrameMetadataListener() {
        return this.x0;
    }

    public Surface getVideoSurface() {
        return this.z0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w0.post(new pzb(18, this));
    }

    public final void onPause() {
        this.B0 = false;
        a();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.B0 = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.x0.z0 = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.A0 = z;
        a();
    }
}
