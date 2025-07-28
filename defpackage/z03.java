package defpackage;

import com.facebook.animated.gif.GifImage;
import java.util.ArrayList;

/* renamed from: z03  reason: default package */
public final class z03 extends s54 {
    public boolean X;
    public stf o;

    public final void close() {
        synchronized (this) {
            try {
                stf stf = this.o;
                if (stf != null) {
                    this.o = null;
                    synchronized (stf) {
                        e13.S((e13) stf.c);
                        stf.c = null;
                        e13.U((ArrayList) stf.o);
                        stf.o = null;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final synchronized int getHeight() {
        stf stf;
        stf = this.o;
        return stf == null ? 0 : ((GifImage) stf.a).h();
    }

    public final synchronized int getSizeInBytes() {
        stf stf;
        stf = this.o;
        return stf == null ? 0 : ((GifImage) stf.a).j();
    }

    public final synchronized int getWidth() {
        stf stf;
        stf = this.o;
        return stf == null ? 0 : ((GifImage) stf.a).k();
    }

    public final synchronized boolean isClosed() {
        return this.o == null;
    }

    public final boolean isStateful() {
        return this.X;
    }
}
