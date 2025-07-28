package defpackage;

import java.io.File;

/* renamed from: z10  reason: default package */
public final class z10 extends oy {
    public final jc5 c;
    public final tt0 d;
    public vw e;
    public volatile long f;

    public z10(o10 o10, jc5 jc5, tt0 tt0) {
        super(o10);
        this.c = jc5;
        this.d = tt0;
    }

    public final void a() {
        this.f = 0;
        b(this.e, new Exception("cancelled"));
        try {
            this.d.f(this);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [tde, java.lang.Object] */
    public final ms9 d() {
        ms9 d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        vw vwVar = this.e;
        if (vwVar != null) {
            return vwVar;
        }
        this.e = new vw();
        this.d.d(this);
        ? obj = new Object();
        o10 o10 = this.a;
        obj.b = o10.q;
        l00 l00 = o10.e;
        obj.d = l00.a;
        obj.g = l00.b;
        obj.h = true;
        ude ude = new ude(obj);
        this.f = ude.o;
        this.c.a(ude);
        return this.e;
    }

    @a1e
    public void onEvent(dk4 dk4) {
        if (this.f == dk4.a) {
            b(this.e, new Exception("DownloadErrorEvent"));
            try {
                this.d.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @a1e
    public void onEvent(bk4 bk4) {
        if (this.f == bk4.a) {
            this.e.c(new File(bk4.c));
            this.e.b();
            try {
                this.d.f(this);
            } catch (Throwable unused) {
            }
        }
    }
}
