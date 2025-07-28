package defpackage;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.EglBase;

/* renamed from: pi  reason: default package */
public final class pi {
    public final bi a;
    public final HandlerThread b;
    public final Handler c;
    public final HandlerThread d;
    public final HashMap e = new HashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final LinkedHashSet g;
    public final tc1 h;
    public volatile boolean i;

    public pi(bd4 bd4, smc smc, bi biVar, EglBase eglBase, h2d h2d) {
        this.a = biVar;
        HandlerThread handlerThread = new HandlerThread("AniRDControl");
        this.b = handlerThread;
        HandlerThread handlerThread2 = new HandlerThread("AniRDOutput");
        this.d = handlerThread2;
        new HashMap();
        this.g = new LinkedHashSet();
        new Point();
        this.h = new tc1((xwb) bd4.b, eglBase.getEglBaseContext(), EglBase.CONFIG_PLAIN, "CallOpenGLAnimoji");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
        handlerThread2.start();
        new Handler(handlerThread2.getLooper());
    }
}
