package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.List;
import java.util.Objects;

/* renamed from: hc0  reason: default package */
public final /* synthetic */ class hc0 implements of3, au, lh7, kh7, y48, q96, v4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hc0(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public void a(r96 r96, p96 p96, long j) {
        pqe pqe = (pqe) this.c;
        int i = this.b;
        pqe.getClass();
        b24.a();
        jc4 jc4 = pqe.E0;
        jc4.getClass();
        z23 z23 = pqe.b;
        synchronized (jc4) {
            try {
                oyb.k(oze.l(jc4.g, i));
                ic4 ic4 = (ic4) jc4.g.get(i);
                oyb.k(!ic4.b);
                z23 z232 = z23.h;
                if (jc4.l == null) {
                    jc4.l = z23;
                }
                oyb.j("Mixing different ColorInfos is not supported.", jc4.l.equals(z23));
                jc4.d.getClass();
                Float valueOf = Float.valueOf(1.0f);
                Float valueOf2 = Float.valueOf(0.0f);
                ic4.a.add(new hc4(r96, p96, j, new jj7(Pair.create(valueOf2, valueOf2), Pair.create(valueOf2, valueOf2), Pair.create(valueOf, valueOf))));
                if (i == jc4.o) {
                    jc4.c();
                } else {
                    jc4.e(ic4);
                }
                jc4.f.v(new ec4(jc4, 2));
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                int i = this.b;
                drawable.setBounds(0, 0, i, i);
                drawable.draw((Canvas) this.c);
                return;
            case 1:
                ut7 ut7 = (ut7) obj;
                nt7 nt7 = (nt7) this.c;
                nt7.c.put(Integer.valueOf(this.b), ut7);
                qe4 qe4 = (qe4) nt7.d.b;
                if (ut7 == null) {
                    qe4.G((tt7) null);
                    return;
                } else {
                    qe4.G(ut7.a);
                    return;
                }
            default:
                y52 y52 = (y52) obj;
                ((t52) this.c).getClass();
                int i2 = this.b;
                y52.m = i2;
                if (i2 == 0) {
                    y52.N = false;
                    y52.O = false;
                    return;
                }
                return;
        }
    }

    public ch7 apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        yr1 yr1 = (yr1) this.c;
        yr1.getClass();
        if (w30.g(this.b, totalCaptureResult)) {
            yr1.g = yr1.k;
        }
        return yr1.i.a(totalCaptureResult);
    }

    public void c(o48 o48) {
        if (o48.isConnected()) {
            e8c e8c = o48.p;
            List list = (List) this.c;
            o48.o = ws6.j(list);
            e8c a2 = t33.a(list, o48.q, o48.t);
            o48.p = a2;
            boolean equals = Objects.equals(a2, e8c);
            boolean z = true;
            boolean z2 = !equals;
            r38 r38 = o48.a;
            r38.getClass();
            if (Looper.myLooper() != r38.X.getLooper()) {
                z = false;
            }
            oyb.k(z);
            p38 p38 = r38.o;
            p38.getClass();
            bs6 r = p38.r();
            if (z2) {
                p38.g();
            }
            o48.c1(this.b, r);
        }
    }

    public boolean d(View view) {
        int i = SideSheetBehavior.x;
        ((SideSheetBehavior) this.c).x(this.b);
        return true;
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                ((hya) obj).f0(((uxa) this.c).a, this.b);
                return;
            case 5:
                ((gya) obj).B((j68) this.c, this.b);
                return;
            default:
                ((hya) obj).H(this.b, (l68) this.c);
                return;
        }
    }

    public /* synthetic */ hc0(int i, e8c e8c) {
        this.a = 7;
        this.b = i;
        this.c = e8c;
    }
}
