package defpackage;

import java.io.File;
import java.util.Map;

/* renamed from: r1f  reason: default package */
public final class r1f extends oy {
    public final pk c;
    public final f03 d;
    public final jc5 e;
    public final tt0 f;
    public vw g;
    public long h;
    public long i;

    public r1f(o10 o10, pk pkVar, f03 f03, jc5 jc5, tt0 tt0) {
        super(o10);
        this.c = pkVar;
        this.d = f03;
        this.e = jc5;
        this.f = tt0;
    }

    public final void a() {
        this.h = 0;
        this.i = 0;
        b(this.g, new Throwable("cancelled"));
        e();
    }

    public final void c(vw vwVar, File file) {
        super.c(vwVar, file);
        e();
    }

    public final ms9 d() {
        ms9 d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        vw vwVar = this.g;
        if (vwVar != null) {
            return vwVar;
        }
        this.g = new vw();
        this.f.d(this);
        o10 o10 = this.a;
        n10 n10 = o10.d;
        this.h = ((gy9) this.c).M(false, n10.a, 0, 0, 0, o10.q, false, true, n10.m);
        return this.g;
    }

    public final void e() {
        try {
            this.f.f(this);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [tde, java.lang.Object] */
    @a1e
    public void onEvent(h7f h7f) {
        if (this.h == h7f.a) {
            Map map = h7f.b;
            if (map == null) {
                b(this.g, new Exception("uris empty"));
                e();
            } else if (am7.m(map) != null) {
                String m = am7.m(map);
                if (r1g.p(m)) {
                    b(this.g, new Exception("download url not found"));
                    e();
                    return;
                }
                this.i = ((lqc) this.d).n();
                ? obj = new Object();
                obj.b = this.a.q;
                obj.c = h7f.c;
                obj.g = m;
                obj.h = true;
                obj.n = true;
                this.e.a(new ude(obj));
            } else {
                b(this.g, new Exception("download url not found"));
                e();
            }
        }
    }

    @a1e
    public void onEvent(jh0 jh0) {
        if (this.h == jh0.a) {
            b(this.g, new Exception(jh0.b.b));
            e();
        }
    }

    @a1e
    public void onEvent(dk4 dk4) {
        if (this.i == dk4.a) {
            b(this.g, new Exception("DownloadErrorEvent"));
            e();
        }
    }

    @a1e
    public void onEvent(bk4 bk4) {
        if (this.i == bk4.a) {
            c(this.g, new File(bk4.c));
        }
    }
}
