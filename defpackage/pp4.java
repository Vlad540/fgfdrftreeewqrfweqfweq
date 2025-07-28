package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pp4  reason: default package */
public final class pp4 implements r4e, SurfaceTexture.OnFrameAvailableListener {
    public int X = 0;
    public boolean Y = false;
    public final AtomicBoolean Z = new AtomicBoolean(false);
    public final np4 a;
    public final HandlerThread b;
    public final vd6 c;
    public final Handler o;
    public final LinkedHashMap w0 = new LinkedHashMap();
    public SurfaceTexture x0;
    public SurfaceTexture y0;

    public pp4(zq4 zq4, q97 q97, q97 q972) {
        Map emptyMap = Collections.emptyMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.o = handler;
        this.c = new vd6(handler);
        this.a = new np4(q97, q972);
        try {
            hwf.f(new xz(this, zq4, emptyMap, 8)).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            e = e instanceof ExecutionException ? e.getCause() : e;
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    public final void a(y4e y4e) {
        if (this.Z.get()) {
            y4e.d();
        } else {
            e(new ii4(this, 3, y4e), new za4(y4e, 0));
        }
    }

    public final void c(q4e q4e) {
        if (this.Z.get()) {
            q4e.close();
            return;
        }
        ii4 ii4 = new ii4(this, 4, q4e);
        Objects.requireNonNull(q4e);
        e(ii4, new ds1(28, q4e));
    }

    public final void d() {
        if (this.Y && this.X == 0) {
            LinkedHashMap linkedHashMap = this.w0;
            for (q4e close : linkedHashMap.keySet()) {
                close.close();
            }
            linkedHashMap.clear();
            this.a.q();
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new g5(this, runnable2, runnable, 24));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (!this.Z.get() && (surfaceTexture2 = this.x0) != null && this.y0 != null) {
            surfaceTexture2.updateTexImage();
            this.y0.updateTexImage();
            for (Map.Entry entry : this.w0.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                q4e q4e = (q4e) entry.getKey();
                if (q4e.c == 34) {
                    try {
                        this.a.w(surfaceTexture.getTimestamp(), surface, q4e, this.x0, this.y0);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    public final void release() {
        if (!this.Z.getAndSet(true)) {
            e(new oc4(5, this), new lc(5));
        }
    }
}
