package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: zb8  reason: default package */
public final class zb8 implements c28, d28 {
    public final Object X;
    public Object Y;
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public long o;

    public zb8(vp6 vp6) {
        this.a = 0;
        this.X = new Handler(Looper.getMainLooper());
        this.Y = vp6;
    }

    public void a(long j) {
        switch (this.a) {
            case 2:
                this.c = j;
                if (this.b) {
                    ((y7e) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    return;
                }
                return;
            default:
                this.c = j;
                if (this.b) {
                    ((z7e) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    return;
                }
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 2:
                if (!this.b) {
                    ((y7e) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    this.b = true;
                    return;
                }
                return;
            default:
                if (!this.b) {
                    ((z7e) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    this.b = true;
                    return;
                }
                return;
        }
    }

    public vxa d() {
        return (vxa) this.Y;
    }

    public long e() {
        switch (this.a) {
            case 2:
                long j = this.c;
                if (!this.b) {
                    return j;
                }
                ((y7e) this.X).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.o;
                vxa vxa = (vxa) this.Y;
                return j + (vxa.a == 1.0f ? mze.D(elapsedRealtime) : elapsedRealtime * ((long) vxa.c));
            default:
                long j2 = this.c;
                if (!this.b) {
                    return j2;
                }
                ((z7e) this.X).getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.o;
                wxa wxa = (wxa) this.Y;
                return j2 + (wxa.a == 1.0f ? oze.S(elapsedRealtime2) : elapsedRealtime2 * ((long) wxa.c));
        }
    }

    public void f(wxa wxa) {
        if (this.b) {
            a(e());
        }
        this.Y = wxa;
    }

    public void g(vxa vxa) {
        if (this.b) {
            a(e());
        }
        this.Y = vxa;
    }

    /* renamed from: d  reason: collision with other method in class */
    public wxa m56d() {
        return (wxa) this.Y;
    }

    public zb8(y7e y7e) {
        this.a = 2;
        this.X = y7e;
        this.Y = vxa.o;
    }

    public zb8(z7e z7e) {
        this.a = 3;
        this.X = z7e;
        this.Y = wxa.d;
    }

    public zb8(boolean z, long j, long j2, u16 u16, u16 u162) {
        this.a = 1;
        this.b = z;
        this.c = j;
        this.o = j2;
        this.X = u16;
        this.Y = u162;
    }
}
