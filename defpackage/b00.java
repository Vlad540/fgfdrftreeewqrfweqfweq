package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: b00  reason: default package */
public final class b00 {
    public final mbe a;
    public final g15 b;
    public final bf5 c;
    public final q16 d;
    public final y15 e;
    public final n83 f;

    /* JADX WARNING: type inference failed for: r7v6, types: [n83, java.lang.Object] */
    public b00(bf5 bf5, mbe mbe, g15 g15) {
        this.a = mbe;
        this.b = g15;
        this.c = bf5;
        q16 q16 = new q16(200, 0);
        this.d = q16;
        mbe.getClass();
        nbe nbe = (nbe) mbe;
        ExecutorService f2 = ((x4a) nbe.a.getValue()).f(5, "preview-disk-cache");
        oid oid = cnc.a;
        this.e = new y15(f2, true);
        ? obj = new Object();
        this.f = obj;
        vx7 f3 = new nx7(new fx7(new a00(this)), new a00(this), 1).h(nbe.a()).f(nbe.b());
        bx7 bx7 = new bx7(new rgc(6, q16), new a00(this), z3d.i);
        f3.a(bx7);
        obj.a(bx7);
    }
}
