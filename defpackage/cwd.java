package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: cwd  reason: default package */
public final class cwd extends taf {
    public static final /* synthetic */ k77[] D0;
    public final AtomicReference A0;
    public final e3 B0;
    public qod C0;
    public final t97 X;
    public final t97 Y;
    public final grd Z;
    public final long b;
    public final pae c;
    public final t97 o;
    public final t0c w0;
    public final l05 x0 = new l05(0);
    public final grd y0;
    public final AtomicReference z0;

    static {
        k77 hc9 = new hc9(cwd.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        D0 = new k77[]{hc9};
    }

    public cwd(long j, t97 t97, wed wed, t97 t972, t97 t973, pae pae) {
        this.b = j;
        this.c = pae;
        this.o = t97;
        this.X = t972;
        this.Y = t973;
        grd a = hrd.a(xrc.c);
        this.Z = a;
        this.w0 = new t0c(a);
        grd a2 = hrd.a((Object) null);
        this.y0 = a2;
        this.z0 = new AtomicReference(hw4.a);
        this.A0 = new AtomicReference(new xvd((String) null, 3));
        this.B0 = hwf.t();
        ez3.N(ez3.J(new ck5(ez3.e0(new w09(am7.c(((zsd) wed.a.getValue()).l), wed, 8), 1), new wvd(this, (Continuation) null), 5), ((n3a) pae).b()), this.a);
        ez3.N(new ck5(ez3.x(new nl5(a2, 0), 200), new kbb(2, this, cwd.class, "searchStickersByQuery", "searchStickersByQuery(Ljava/lang/String;)V", 4, 12), 5), this.a);
    }

    public static final ktd q(cwd cwd, osd osd) {
        osd osd2 = osd;
        cwd.getClass();
        long j = osd2.a;
        String str = osd2.w0;
        if (r1g.p(str)) {
            str = osd2.o;
        }
        String str2 = str;
        String str3 = ((kb5) ((jb5) cwd.Y.getValue())).v() ? osd2.D0 : null;
        long j2 = osd2.z0;
        return new ktd(j, j2, j2, str2, osd2.A0, str3, osd2.b, osd2.c, false, false, 0, 7744);
    }

    public final boolean r() {
        xvd xvd = (xvd) this.A0.get();
        String str = xvd.a;
        return (xvd.b == 0 || str == null || str.length() == 0 || !(((xrc) this.w0.a.getValue()).b.isEmpty() ^ true)) ? false : true;
    }
}
