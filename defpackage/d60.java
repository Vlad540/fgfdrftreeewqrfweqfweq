package defpackage;

import android.content.Context;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d60  reason: default package */
public final class d60 {
    public final ryc a;
    public final AtomicReference b = new AtomicReference((Object) null);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ls0 d;
    public final hgd e;
    public final long f;
    public int g = 1;
    public gs0 h = gs0.b;
    public boolean i;
    public Executor j;
    public f2b k;
    public tx4 l;
    public mn m;
    public c60 n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public byte[] s;
    public double t;
    public long u = 0;
    public final int v;

    public d60(m80 m80, ryc ryc, Context context) {
        ryc ryc2 = new ryc(ryc);
        this.a = ryc2;
        this.f = TimeUnit.MILLISECONDS.toNanos(3000);
        try {
            ls0 ls0 = new ls0(new g60(m80, context), m80);
            this.d = ls0;
            ls0.a(new nfc(4, (Object) this), ryc2);
            this.e = new hgd(m80);
            this.v = m80.d;
        } catch (AudioStream$AudioStreamException | IllegalArgumentException e2) {
            throw new Exception("Unable to create AudioStream", e2);
        }
    }

    public final void a() {
        Executor executor = this.j;
        f2b f2b = this.k;
        if (executor != null && f2b != null) {
            boolean z = this.r || this.o || this.q;
            if (!Objects.equals(this.b.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
                executor.execute(new t50((Object) f2b, z, 2));
            }
        }
    }

    public final void b(tx4 tx4) {
        tx4 tx42 = this.l;
        gs0 gs0 = null;
        if (tx42 != null) {
            c60 c60 = this.n;
            Objects.requireNonNull(c60);
            tx42.r(c60);
            this.l = null;
            this.n = null;
            this.m = null;
            this.h = gs0.b;
            d();
        }
        if (tx4 != null) {
            this.l = tx4;
            this.n = new c60(this, tx4);
            this.m = new mn((Object) this, 3, (Object) tx4);
            try {
                ch7 m2 = tx4.m();
                if (((vn1) m2).b.isDone()) {
                    gs0 = (gs0) ((vn1) m2).b.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (gs0 != null) {
                this.h = gs0;
                d();
            }
            this.l.g(this.a, this.n);
        }
    }

    public final void c() {
        tx4 tx4 = this.l;
        Objects.requireNonNull(tx4);
        vn1 f2 = hwf.f(new qx4(tx4, 1));
        mn mnVar = this.m;
        Objects.requireNonNull(mnVar);
        ct0.a(f2, mnVar, this.a);
    }

    public final void d() {
        int i2 = this.g;
        ls0 ls0 = this.d;
        if (i2 == 2) {
            boolean z = this.h == gs0.a;
            boolean z2 = !z;
            Executor executor = this.j;
            f2b f2b = this.k;
            if (!(executor == null || f2b == null || this.c.getAndSet(z2) == z2)) {
                executor.execute(new b(f2b, z2));
            }
            if (z) {
                if (!this.i) {
                    try {
                        ls0.start();
                        this.o = false;
                    } catch (AudioStream$AudioStreamException unused) {
                        this.o = true;
                        this.e.start();
                        this.p = System.nanoTime();
                        a();
                    }
                    this.i = true;
                    c();
                }
            } else if (this.i) {
                this.i = false;
                ls0.stop();
            }
        } else if (this.i) {
            this.i = false;
            ls0.stop();
        }
    }
}
