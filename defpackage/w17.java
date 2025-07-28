package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: w17  reason: default package */
public final class w17 extends taf {
    public final t97 X;
    public final t97 Y;
    public final grd Z;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final t0c w0;

    public w17() {
        x07 x07 = x07.a;
        r7e d = x07.getAccessor().d(Context.class);
        r7e d2 = x07.getAccessor().d(ap3.class);
        r7e d3 = x07.getAccessor().d(mg5.class);
        r7e d4 = x07.getAccessor().d(xzc.class);
        r7e d5 = x07.getAccessor().d(pae.class);
        this.b = d;
        this.c = d2;
        this.o = d3;
        this.X = d4;
        this.Y = d5;
        grd a = hrd.a(new mjb(BuildConfig.FLAVOR, (String) null, (Bitmap) null));
        this.Z = a;
        this.w0 = new t0c(a);
        xs7.E(this.a, ((pae) d5.getValue()).b(), (ru3) null, new u17(this, (Continuation) null), 2);
    }
}
