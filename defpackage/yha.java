package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.fragment.app.a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: yha  reason: default package */
public final class yha implements bia {
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public final Object o;
    public Object w0;

    public yha(iw0 iw0, av3 av3) {
        iw0 iw02 = iw0;
        this.a = iw02;
        this.b = av3;
        this.c = new ft4(iw02.c, iw02.d, 1.0d);
        this.o = new ft4(iw02.f, iw02.g, 0.0d);
        this.X = new ft4(iw02.k, 0.0d, 2);
        this.Y = new ft4(iw02.j, 0.0d, 2);
        this.Z = new ft4(iw02.w, iw02.x, 4);
        this.w0 = new ft4(iw02.y, iw02.z, 4);
    }

    public double a(double d, double d2, double d3, boolean z) {
        double d4;
        ft4 ft4 = (ft4) this.o;
        ft4.a(d);
        ft4 ft42 = (ft4) this.w0;
        u16 u16 = (u16) this.b;
        ft4 ft43 = (ft4) this.X;
        ft4 ft44 = (ft4) this.Y;
        ft4 ft45 = (ft4) this.Z;
        if (z) {
            ft45.a(d3);
            u16.invoke("EMAs: rtt=" + ft4.d + " bitrateE=" + ft45.d + " bitrateR=" + ft42.d);
        } else {
            ft44.a(d2);
            ft43.a(d2);
            u16.invoke("EMAs: rtt=" + ft4.d + " lossFast=" + ft44.d + " lossSlow=" + ft43.d);
        }
        double d5 = ft4.d;
        iw0 iw0 = (iw0) this.a;
        double d6 = iw0.n;
        double d7 = 0.0d;
        int i = 0;
        double d8 = 1.0d;
        if (d6 <= 0.0d || d5 <= d6) {
            int W = a24.W((d5 - iw0.e) / iw0.h);
            if (W < 0) {
                W = 0;
            }
            d4 = Math.pow(1.0d - iw0.i, (double) W);
        } else {
            d4 = 0.0d;
        }
        if (!z) {
            double d9 = ft43.d;
            double d10 = ft44.d;
            double d11 = iw0.o;
            if (d11 <= 0.0d || d10 <= d11) {
                double d12 = iw0.p;
                if (d12 <= 0.0d || d9 <= d12) {
                    if (iw0.q) {
                        int W2 = a24.W((d9 - iw0.r) / iw0.s);
                        if (W2 >= 0) {
                            i = W2;
                        }
                        d7 = Math.pow(1.0d - iw0.t, (double) i);
                    } else if (d10 > 0.0d) {
                        d8 = (1.0d - (d10 * iw0.l)) - (d9 * iw0.m);
                    }
                }
            }
            return d4 * d7;
        } else if (iw0.u) {
            double d13 = ft42.d;
            double d14 = ft45.d;
            if (!Double.isInfinite(d13) && !Double.isNaN(d13) && !Double.isInfinite(d14) && !Double.isNaN(d14)) {
                double min = 1.0d - ((1.0d - (Math.min(d14, d13) / Math.max(d14, d13))) * iw0.v);
                if (min <= 1.0d) {
                    d8 = min;
                }
            }
        }
        d7 = d8;
        return d4 * d7;
    }

    public void b(double d) {
        ((ft4) this.w0).a(d);
    }

    public void c(int i) {
        while (!((LinkedList) this.c).isEmpty() && ((h0g) ((LinkedList) this.c).getLast()).a() >= i) {
            ((LinkedList) this.c).removeLast();
        }
    }

    public void d(Bundle bundle, h0g h0g) {
        if (((v2b) this.a) != null) {
            h0g.b();
            return;
        }
        if (((LinkedList) this.c) == null) {
            this.c = new LinkedList();
        }
        ((LinkedList) this.c).add(h0g);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.Y = (fzd) this.o;
        e();
    }

    public void e() {
        Activity activity = (Activity) this.Z;
        if (activity != null && ((fzd) this.Y) != null && ((v2b) this.a) == null) {
            try {
                int i = iu7.p;
                synchronized (iu7.class) {
                    iu7.D(activity);
                }
                s4g J0 = pfa.H((Activity) this.Z).J0(new ks9((Activity) this.Z));
                if (J0 != null) {
                    ((fzd) this.Y).b(new v2b((a) this.X, J0));
                    ArrayList arrayList = (ArrayList) this.w0;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((v2b) this.a).k((x3e) it.next());
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    public void reset() {
        ft4 ft4 = (ft4) this.c;
        ft4.d = ft4.c;
        ft4 ft42 = (ft4) this.o;
        ft42.d = ft42.c;
        ft4 ft43 = (ft4) this.X;
        ft43.d = ft43.c;
        ft4 ft44 = (ft4) this.Y;
        ft44.d = ft44.c;
        ft4 ft45 = (ft4) this.Z;
        ft45.d = ft45.c;
        ft4 ft46 = (ft4) this.w0;
        ft46.d = ft46.c;
    }

    public yha(a aVar) {
        this.o = new fzd(5, this);
        this.w0 = new ArrayList();
        this.X = aVar;
    }

    public yha(Context context) {
        this.a = context;
        this.b = ez3.O(3, new i71(this, 0));
        this.c = ez3.O(3, new i71(this, 1));
        this.o = ez3.O(3, new i71(this, 2));
        this.X = ez3.O(3, new i71(this, 3));
        this.Y = ez3.O(3, new i71(this, 4));
        this.Z = ez3.O(3, new i71(this, 5));
        this.w0 = ez3.O(3, new i71(this, 6));
    }

    public yha(n62 n62, pae pae, k3e k3e, jp3 jp3) {
        this.a = n62;
        this.b = pae;
        this.c = k3e;
        this.o = jp3;
    }
}
