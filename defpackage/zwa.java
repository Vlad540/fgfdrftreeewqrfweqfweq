package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* renamed from: zwa  reason: default package */
public final class zwa implements o3e {
    public final Context a;
    public final fr6 b;
    public final kv2 c;

    /* JADX WARNING: type inference failed for: r2v3, types: [kv2, java.lang.Object] */
    public zwa(Context context, duf duf) {
        ir6 g = ir6.g();
        this.a = context;
        fr6 f = g.f();
        this.b = f;
        kv2 kv2 = (kv2) duf.b;
        if (kv2 != null) {
            this.c = kv2;
        } else {
            this.c = new Object();
        }
        kv2 kv22 = this.c;
        Resources resources = context.getResources();
        bd4 d = bd4.d();
        h54 a2 = g.a();
        g.b.v.getClass();
        if (aue.b == null) {
            aue.b = new aue(new Handler(Looper.getMainLooper()));
        }
        aue aue = aue.b;
        kv22.a = resources;
        kv22.b = d;
        kv22.c = a2;
        kv22.getClass();
        kv22.o = aue;
        kv22.X = (qe4) f.f;
        kv22.Y = (zy) duf.a;
        kv22.Z = (o3e) duf.c;
    }

    /* renamed from: a */
    public final ywa get() {
        ywa ywa = new ywa(this.a, this.c, this.b, (Set) null, (Set) null);
        ywa.r = null;
        return ywa;
    }
}
