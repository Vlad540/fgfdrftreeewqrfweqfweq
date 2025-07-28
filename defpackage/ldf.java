package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ldf  reason: default package */
public final class ldf implements vj1 {
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public boolean z0;

    public ldf(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978, t97 t979, t97 t9710) {
        this.a = t9710;
        this.b = t97;
        this.c = t972;
        this.o = t973;
        this.X = t974;
        this.Y = t975;
        this.Z = t976;
        this.w0 = t977;
        this.x0 = t978;
        this.y0 = t979;
        ((so1) t979.getValue()).d(this);
    }

    public final void a() {
        xi4 xi4;
        udd.q("ldf", "onAppGoesBackground");
        this.z0 = false;
        if (((zy9) this.b.getValue()).d()) {
            if (((so1) this.y0.getValue()).q()) {
                udd.q("ldf", "ignore onAppGoesBackground due to active call");
                return;
            }
            pva pva = (pva) this.c.getValue();
            pva.getClass();
            udd.q("pva", "stopInteractivePings");
            ((gy9) ((pk) pva.a.getValue())).H(false);
            xi4 xi42 = pva.f;
            if (!(xi42 == null || xi42.h() || (xi4 = pva.f) == null)) {
                xi4.f();
            }
            q2b q2b = (q2b) this.o.getValue();
            AtomicBoolean atomicBoolean = q2b.z0;
            if (atomicBoolean.get()) {
                q2b.g();
                atomicBoolean.set(false);
            }
            q2b.y0.o1(q2b, q2b.A0[0], (Object) null);
            ((eha) this.Y.getValue()).getClass();
            Iterator it = eha.b.entrySet().iterator();
            while (it.hasNext()) {
                cha cha = (cha) ((Map.Entry) it.next()).getValue();
                if (cha.a.isEmpty()) {
                    xi4 xi43 = cha.b;
                    if (xi43 != null && !xi43.h()) {
                        xi43.f();
                    }
                    it.remove();
                }
            }
            eha.c.clear();
            ((ybe) ((qbe) this.Z.getValue())).e(false);
            ((ed5) this.w0.getValue()).b.getClass();
        }
    }

    public final void b(boolean z) {
        int ordinal;
        udd.p("ldf", "onAppGoesForeground forceContactSync = %b", new Object[]{Boolean.valueOf(z)});
        t97 t97 = this.a;
        ((dce) t97.getValue()).f(false);
        t97 t972 = this.x0;
        ((ed3) t972.getValue()).invalidate();
        if (this.z0 || !((so1) this.y0.getValue()).r()) {
            this.z0 = true;
            ((ybe) ((qbe) this.Z.getValue())).e(true);
            if (!((ed3) t972.getValue()).a() && t97.a()) {
                ((dce) t97.getValue()).i();
            }
            ((dce) t97.getValue()).f(false);
            ((pva) this.c.getValue()).b();
            if (((zy9) this.b.getValue()).d()) {
                q2b q2b = (q2b) this.o.getValue();
                q2b.z0.set(true);
                if (((zy9) q2b.Y.getValue()).d()) {
                    long e = ((lqc) q2b.e()).e("user.presenceLastSync", 0);
                    gy9 gy9 = (gy9) ((pk) q2b.Z.getValue());
                    gy9.getClass();
                    if (e < 0 && (ordinal = gy9.y().ordinal()) != 0) {
                        if (ordinal == 1) {
                            udd.s(gy9.a, "invalid last sync time", new IllegalArgumentException("invalid last sync time"));
                            gy9.v(gy9, new sm3(((j2b) gy9.z()).a.n(), (long[]) null, e));
                        } else if (ordinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw new IllegalArgumentException("invalid last sync time");
                        }
                    }
                }
                if (z) {
                    ((voa) ((noa) this.X.getValue())).c();
                    return;
                }
                return;
            }
            return;
        }
        udd.q("ldf", "ignore onAppGoesForeground due to incoming call.");
    }

    public final void j() {
        if (!this.z0) {
            a();
            udd.q("ldf", "Call was ended. Stop ping activity state.");
        }
    }

    public final void onCallAccepted() {
        if (!this.z0) {
            b(false);
            udd.q("ldf", "Call was accepted. Start ping activity state.");
        }
    }
}
