package defpackage;

import java.io.File;

/* renamed from: ic5  reason: default package */
public final class ic5 extends oy {
    public final pk c;
    public final jc5 d;
    public final tt0 e;
    public vw f;
    public long g;
    public long h;

    public ic5(o10 o10, pk pkVar, jc5 jc5, tt0 tt0) {
        super(o10);
        this.c = pkVar;
        this.d = jc5;
        this.e = tt0;
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        b(this.f, new Exception("cancelled"));
        try {
            this.e.f(this);
        } catch (Throwable unused) {
        }
    }

    public final void c(vw vwVar, File file) {
        super.c(vwVar, file);
        try {
            this.e.f(this);
        } catch (Throwable unused) {
        }
    }

    public final ms9 d() {
        ms9 d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        vw vwVar = this.f;
        if (vwVar != null) {
            return vwVar;
        }
        this.f = new vw();
        this.e.d(this);
        o10 o10 = this.a;
        v00 v00 = o10.j;
        this.g = ((gy9) this.c).x(v00.c, o10.q, v00.a, 0);
        return this.f;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [tde, java.lang.Object] */
    @a1e
    public void onEvent(rd5 rd5) {
        if (this.g == rd5.a) {
            ? obj = new Object();
            o10 o10 = this.a;
            obj.b = o10.q;
            v00 v00 = o10.j;
            obj.j = v00.a;
            obj.k = v00.c;
            obj.g = rd5.b;
            obj.h = true;
            ude ude = new ude(obj);
            this.h = ude.o;
            this.d.a(ude);
        }
    }

    @a1e
    public void onEvent(jh0 jh0) {
        if (this.g == jh0.a) {
            b(this.f, new Exception(jh0.b.b));
            try {
                this.e.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @a1e
    public void onEvent(dk4 dk4) {
        if (this.h == dk4.a) {
            b(this.f, new Exception("DownloadErrorEvent"));
            try {
                this.e.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @a1e
    public void onEvent(bk4 bk4) {
        if (this.h == bk4.a) {
            c(this.f, new File(bk4.c));
        }
    }
}
