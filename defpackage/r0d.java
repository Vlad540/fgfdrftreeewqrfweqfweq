package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: r0d  reason: default package */
public final class r0d extends c0d implements tna, km7 {
    public final String X = r0d.class.getName();
    public long Y;
    public c97 Z;
    public final long b;
    public final long c;
    public final boolean o;

    public r0d(long j, long j2, boolean z) {
        this.b = j;
        this.c = j2;
        this.o = z;
    }

    public final void U0() {
        udd.q(this.X, "onServiceNotAvailable, fail task");
        l().c(this);
        tic.a(new q0d(this, 0), ((nbe) q()).a(), (j6) null, new lv1(29, (Object) this), (qmc) null);
        tic.b(this.Z);
        y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = defpackage.ls8.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r3 = this;
            to8 r0 = r3.n()
            long r1 = r3.c
            vo8 r3 = r0.q(r1)
            if (r3 == 0) goto L_0x001b
            ls8 r0 = defpackage.ls8.DELETED
            ls8 r1 = r3.z0
            if (r1 == r0) goto L_0x001b
            boolean r3 = r3.x()
            if (r3 != 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 1
            return r3
        L_0x001b:
            r3 = 3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0d.e():int");
    }

    public final void f() {
        udd.q(this.X, "onMaxFailCount: remove task, mark message as error");
        tic.b(this.Z);
        vo8 q = n().q(this.c);
        if (q != null) {
            n().x(q, bp8.ERROR);
            l().c(this);
            r().d(this.b);
        }
    }

    public final byte[] g() {
        Tasks.LocationRequest locationRequest = new Tasks.LocationRequest();
        locationRequest.requestId = this.b;
        locationRequest.messageId = this.c;
        locationRequest.liveLocation = this.o;
        return gr8.toByteArray(locationRequest);
    }

    public final long getId() {
        return this.b;
    }

    public final una getType() {
        return una.TYPE_LOCATION_REQUEST;
    }

    public final int h() {
        return 1000000;
    }

    public final void p1(dm7 dm7) {
        int i;
        String str = this.X;
        udd.p(str, "onLocation: %s", new Object[]{dm7});
        if (this.o) {
            z(dm7);
            return;
        }
        d0d d0d = this.a;
        if (d0d == null) {
            d0d = null;
        }
        ((rf4) d0d.d.getValue()).getClass();
        if (SystemClock.elapsedRealtime() - this.Y > ((long) 30000)) {
            udd.q(str, "onLocation: accuracy timeout reached, use minRequiredAccuracy");
            i = HttpStatus.SC_MULTIPLE_CHOICES;
        } else {
            i = 30;
        }
        float f = dm7.o;
        if (f < ((float) i)) {
            z(dm7);
        } else {
            udd.p(str, "onLocation: accuracy %f is not enough, continue listening for location updates", new Object[]{Float.valueOf(f)});
        }
    }

    public final void x() {
        udd.q(this.X, "Process request location for message: " + this.c);
        d0d d0d = this.a;
        if (d0d == null) {
            d0d = null;
        }
        ((rf4) d0d.d.getValue()).getClass();
        this.Y = SystemClock.elapsedRealtime();
        l().b(this);
        tic.b(this.Z);
        if (!this.o) {
            long j = (long) 60000;
            q0d q0d = new q0d(this, 1);
            ea6 ea6 = new ea6(26, this);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            qmc a = cnc.a();
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(a, "scheduler is null");
            rt9 rt9 = rt9.a;
            gf6 gf6 = z3d.j;
            c97 c97 = new c97(new lpa(16), ea6, z3d.i);
            Objects.requireNonNull(c97, "observer is null");
            try {
                jt9 jt9 = new jt9(c97, gf6, gf6, q0d);
                Objects.requireNonNull(jt9, "observer is null");
                rt9.a(new ft9(new zyc(jt9), j, timeUnit, a.a()));
                this.Z = c97;
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                ek8.a0(th);
                xs7.F(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
    }

    public final void y() {
        String str = this.X;
        udd.q(str, "Reach max timeout");
        l().c(this);
        r().d(this.b);
        to8 n = n();
        long j = this.c;
        vo8 q = n.q(j);
        if (q != null && q.z0 != ls8.DELETED) {
            o10 a = q.a(j10.B0);
            long j2 = q.x0;
            if (a != null) {
                n().x(q, bp8.ERROR);
                n().u(q, a.q, g10.b);
                t().c(new ove(q.x0, this.c, 0));
                t52 b2 = b();
                if (!b2.k.contains(Long.valueOf(j2))) {
                    m().d(q.x0, q.o, this.c);
                    return;
                }
                return;
            }
            udd.s(str, "Reach max timeout: WTF, no location attach in message", (Throwable) null);
            to8 n2 = n();
            n2.getClass();
            n2.c(j2, Collections.singletonList(Long.valueOf(j)));
            t().c(new l89(j2, Collections.singletonList(Long.valueOf(j)), (md4) null));
        }
    }

    public final void z(dm7 dm7) {
        udd.p(this.X, "onSuccess: %s", new Object[]{dm7});
        tic.b(this.Z);
        l().c(this);
        wwc wwc = tic.a;
        tic.a(new sz(this, 11, dm7), (qmc) wwc.b, (j6) null, new mv4(22, this), (qmc) null);
    }
}
