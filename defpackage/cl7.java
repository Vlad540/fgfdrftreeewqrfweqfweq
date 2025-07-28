package defpackage;

import android.net.Uri;

/* renamed from: cl7  reason: default package */
public class cl7 implements mwc, lwc {
    public final tk7 X;
    public final pl7 a;
    public final pwc b;
    public final mbe c;
    public final n83 o = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [n83, java.lang.Object] */
    public cl7(pl7 pl7, pwc pwc, mbe mbe, tk7 tk7) {
        this.a = pl7;
        this.b = pwc;
        this.c = mbe;
        this.X = tk7;
    }

    public void a() {
        this.o.d();
    }

    public final void b() {
        pwc pwc = this.b;
        tk7 tk7 = this.X;
        kpa e = pwc.e(tk7);
        this.a.O(tk7, kpa.a(e, tk7), 0, e != null ? e.X : null);
    }

    public void c() {
        tk7 tk7 = this.X;
        udd.p("cl7", "loadThumbnail with localMediaId = %d", new Object[]{Long.valueOf(tk7.b)});
        Uri x = at7.x(tk7.c);
        long j = tk7.b;
        if (x != null) {
            udd.p("cl7", "loadThumbnail: %d, cachedUri is not empty", new Object[]{Long.valueOf(j)});
            d(0, x.toString());
            return;
        }
        this.a.O(tk7, (Uri) null, 0, (Uri) null);
        rwc h = this.b.h(tk7);
        String str = h != null ? r1g.p(h.d) ? h.a.o : h.d : tk7.o;
        mv9 mv9 = new mv9(2, new m5(8, str));
        mbe mbe = this.c;
        mbe.getClass();
        nbe nbe = (nbe) mbe;
        mhd mhd = new mhd(mv9.m(nbe.a()).i(nbe.b()), new sq1(j, str, 3), 2);
        pn1 pn1 = new pn1(new e44(this, 19, str), 2, new hy5(11, this));
        mhd.k(pn1);
        this.o.a(pn1);
    }

    public final void d(int i, String str) {
        Uri x = at7.x(str);
        pwc pwc = this.b;
        tk7 tk7 = this.X;
        kpa e = pwc.e(tk7);
        if (kpa.b(e, tk7)) {
            Uri a2 = kpa.a(e, tk7);
            if (!a2.getPath().equals(tk7.c)) {
                x = a2;
            }
            i = 0;
        }
        this.a.O(tk7, x, i, e != null ? e.X : null);
    }

    public final void j(rwc rwc) {
        tk7 tk7 = this.X;
        if (tk7 != null) {
            String str = tk7.c;
            tk7 tk72 = rwc.a;
            if (str.equals(tk72.c)) {
                d(tk72.X, r1g.p(rwc.d) ? tk72.o : rwc.d);
            }
        }
    }

    public final void s1(rwc rwc) {
        b();
    }
}
