package defpackage;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: lh0  reason: default package */
public abstract class lh0 implements o96 {
    public final bq0 a;
    public m96 b = new Object();
    public n96 c = new g02(7);
    public l96 d = new pv0(25);
    public Executor e = lh4.a;
    public int f = -1;
    public int g = -1;

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, m96] */
    public lh0(boolean z) {
        this.a = new bq0(z, 1);
    }

    public final void a(h96 h96, p96 p96, long j) {
        try {
            int i = this.f;
            int i2 = p96.c;
            bq0 bq0 = this.a;
            int i3 = p96.d;
            if (i == i2) {
                if (this.g == i3) {
                    if (!((w27) bq0.g()).hasNext()) {
                    }
                    p96 h = bq0.h();
                    gt0.t(h.b, h.c, h.d);
                    na4 na4 = (na4) this;
                    if (!na4.u || !na4.t) {
                        gt0.j();
                    }
                    d(p96.a, j);
                    this.b.k(p96);
                    this.c.s(h, j);
                }
            }
            int i4 = p96.c;
            this.f = i4;
            this.g = i3;
            gjd h2 = x87.h(((na4) this).i, i4, i3);
            bq0.e(h96, h2.a, h2.b);
            p96 h3 = bq0.h();
            gt0.t(h3.b, h3.c, h3.d);
            na4 na42 = (na4) this;
            gt0.j();
            d(p96.a, j);
            this.b.k(p96);
            this.c.s(h3, j);
        } catch (VideoFrameProcessingException | GlUtil$GlException e2) {
            this.e.execute(new c(this, 12, e2));
        }
    }

    public final void b(p96 p96) {
        bq0 bq0 = this.a;
        if (((ArrayDeque) bq0.e).contains(p96)) {
            ArrayDeque arrayDeque = (ArrayDeque) bq0.e;
            oyb.k(arrayDeque.contains(p96));
            arrayDeque.remove(p96);
            ((ArrayDeque) bq0.d).add(p96);
            this.b.i();
        }
    }

    public final void c() {
        this.c.m();
    }

    public abstract void d(int i, long j);

    public final void e(Executor executor, kc4 kc4) {
        this.e = executor;
        this.d = kc4;
    }

    public final void f(w4g w4g) {
        this.c = w4g;
    }

    public final void flush() {
        bq0 bq0 = this.a;
        ArrayDeque arrayDeque = (ArrayDeque) bq0.e;
        ((ArrayDeque) bq0.d).addAll(arrayDeque);
        arrayDeque.clear();
        this.b.p();
        for (int i = 0; i < bq0.b; i++) {
            this.b.i();
        }
    }

    public final void g(m96 m96) {
        this.b = m96;
        for (int i = 0; i < this.a.f(); i++) {
            m96.i();
        }
    }
}
