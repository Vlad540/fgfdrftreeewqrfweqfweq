package defpackage;

import android.os.Handler;

/* renamed from: w64  reason: default package */
public final class w64 implements ko4 {
    public final eo4 a;
    public yn4 b;
    public boolean c;
    public final /* synthetic */ y64 o;

    public w64(y64 y64, eo4 eo4) {
        this.o = y64;
        this.a = eo4;
    }

    public final void release() {
        Handler handler = this.o.u;
        handler.getClass();
        mze.H(handler, new ds1(23, this));
    }
}
