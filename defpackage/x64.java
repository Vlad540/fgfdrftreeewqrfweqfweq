package defpackage;

import android.os.Handler;

/* renamed from: x64  reason: default package */
public final class x64 implements lo4 {
    public final fo4 a;
    public zn4 b;
    public boolean c;
    public final /* synthetic */ z64 o;

    public x64(z64 z64, fo4 fo4) {
        this.o = z64;
        this.a = fo4;
    }

    public final void release() {
        Handler handler = this.o.u;
        handler.getClass();
        oze.W(handler, new ds1(24, this));
    }
}
