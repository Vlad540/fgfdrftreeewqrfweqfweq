package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.camerax.vms.processor.VideoMessageProcessorException;

/* renamed from: h6f  reason: default package */
public final class h6f implements r4e {
    public int A0;
    public boolean B0;
    public final vd6 X;
    public final CopyOnWriteArraySet Y = new CopyOnWriteArraySet();
    public final LinkedHashMap Z = new LinkedHashMap();
    public final String a;
    public final AtomicBoolean b = new AtomicBoolean();
    public final e6f c;
    public final Handler o;
    public final float[] w0 = new float[16];
    public final float[] x0 = new float[16];
    public s6f y0;
    public boolean z0;

    public h6f(Size size) {
        zq4 zq4 = zq4.d;
        String name = h6f.class.getName();
        this.a = name;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, name, "init, preview=" + size + ", dr=" + zq4 + ", stencil=" + null + ", isStencilRecyclable=" + true, (Throwable) null);
        }
        e07.r(zq4);
        e6f e6f = new e6f(this, size, zq4);
        this.c = e6f;
        e6f.start();
        Handler handler = new Handler(e6f.getLooper());
        this.o = handler;
        Throwable th = (Throwable) e6f.o.get();
        if (th != null) {
            release();
            throw (!(th instanceof VideoMessageProcessorException) ? new RuntimeException("Failed to create video message processor", th) : th);
        } else {
            this.X = new vd6(handler);
        }
    }

    public static final void d(h6f h6f, Size size, zq4 zq4) {
        String str = h6f.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "initRendererOnGl, previewSize=" + size + ", dynamicRange=" + zq4, (Throwable) null);
        }
        h6f.e();
        if (!h6f.z0) {
            s6f s6f = h6f.y0;
            if (s6f == null) {
                h6f.y0 = new s6f(size, zq4);
                return;
            }
            throw new IllegalStateException(("Renderer already created, " + s6f).toString());
        }
        throw new IllegalStateException("GL is already RELEASED!".toString());
    }

    public final void a(y4e y4e) {
        String str = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "onInputSurface, request=" + y4e, (Throwable) null);
        }
        if (this.b.get()) {
            y4e.d();
            return;
        }
        zq4 zq4 = y4e.c;
        e07.r(zq4);
        if (!this.o.post(new zbe(this, 12, new k61(y4e, this, zq4, 14)))) {
            udd.s(this.a, "postToGl, failed to post 'onInputSurface' to the GL thread!", (Throwable) null);
            y4e.d();
        }
    }

    public final void c(q4e q4e) {
        String str = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            Size size = q4e.o;
            fn6.d(tn7, str, "onOutputSurface, surfaceOutput=" + q4e + ", size=" + size, (Throwable) null);
        }
        if (this.b.get()) {
            q4e.close();
            return;
        }
        nya nya = new nya(q4e, 27, this);
        e78 e78 = new e78(0, q4e, q4e.class, "close", "close()V", 0, 15);
        if (!this.o.post(new zbe(this, 12, nya))) {
            udd.s(this.a, "postToGl, failed to post 'onOutputSurface' to the GL thread!", (Throwable) null);
            e78.invoke();
        }
    }

    public final void e() {
        Thread currentThread = Thread.currentThread();
        e6f e6f = this.c;
        if (!hhd.f(currentThread, e6f)) {
            throw new IllegalStateException(("Illegal thread=" + currentThread + ", expected=" + e6f).toString());
        }
    }

    public final void f() {
        String str = this.a;
        udd.U(str, "maybeReleaseGl");
        e();
        if (this.z0 && this.A0 == 0) {
            LinkedHashMap linkedHashMap = this.Z;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                q4e q4e = (q4e) entry.getKey();
                udd.U(str, "close surface output=" + q4e + ", surface=" + ((Surface) entry.getValue()));
                q4e.close();
            }
            linkedHashMap.clear();
            s6f s6f = this.y0;
            if (s6f != null) {
                s6f.q();
            }
            this.y0 = null;
            this.c.quitSafely();
        }
    }

    public final void g(Bitmap bitmap, boolean z) {
        String str = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            String B = fja.B(bitmap);
            fn6.d(tn7, str, "setStencil, " + B + ", recycle_after_consume=" + z, (Throwable) null);
        }
        if (!this.o.post(new zbe(this, 12, new c6f(this, bitmap, z)))) {
            udd.s(this.a, wn6.i("postToGl, failed to post '", "setStencil", "' to the GL thread!"), (Throwable) null);
        }
    }

    public final void release() {
        String str = this.a;
        udd.U(str, "release");
        this.Y.clear();
        if (!this.b.getAndSet(true)) {
            if (!this.o.post(new zbe(this, 12, new q6e(8, this)))) {
                udd.s(str, "postToGl, failed to post '" + "" + "' to the GL thread!", (Throwable) null);
            }
        }
    }
}
