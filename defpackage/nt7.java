package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: nt7  reason: default package */
public final class nt7 {
    public static final /* synthetic */ int t = 0;
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashMap c = new HashMap();
    public final mod d;
    public final st7 e;
    public final qmc f;
    public final g02 g;
    public final qr4 h;
    public final zl3 i;
    public final j67 j;
    public final j67 k;
    public final j67 l;
    public final j67 m;
    public pn1 n;
    public nfc o;
    public pn1 p;
    public long q;
    public pn1 r;
    public gvf s;

    public nt7(mod mod, st7 st7, qmc qmc, g02 g02, qr4 qr4, zl3 zl3, j67 j67, j67 j672, j67 j673, j67 j674) {
        this.d = mod;
        this.e = st7;
        this.f = qmc;
        this.g = g02;
        this.h = qr4;
        this.i = zl3;
        this.j = j67;
        this.k = j672;
        this.l = j673;
        this.m = j674;
    }

    public final void a() {
        gvf gvf = this.s;
        if (gvf != null) {
            ly2 ly2 = (ly2) gvf.b;
            ly2.getClass();
            try {
                z4g z4g = ly2.a;
                z4g.H0(z4g.G0(), 1);
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void b() {
        c();
        nfc nfc = this.o;
        if (nfc != null) {
            a0b a0b = (a0b) nfc.b;
            a0b.getClass();
            try {
                i1g i1g = a0b.a;
                i1g.H0(i1g.G0(), 1);
                this.o = null;
                this.q = 0;
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void c() {
        tic.b(this.p);
        tic.b(this.r);
        LinkedHashMap linkedHashMap = this.b;
        for (sh0 sh0 : linkedHashMap.values()) {
            sh0.a.q();
        }
        linkedHashMap.clear();
    }

    public final void d(double d2, double d3, Float f2, Float f3, Float f4) {
        LatLng latLng = new LatLng(d2, d3);
        ru1 ru1 = ((su1) this.k.b()).a;
        ru1.c = latLng;
        ru1.a = f2.floatValue();
        ru1.b = f3.floatValue();
        float floatValue = f4.floatValue();
        ru1.getClass();
        CameraPosition cameraPosition = new CameraPosition((LatLng) ru1.c, ru1.a, ru1.b, floatValue);
        this.g.getClass();
        try {
            m1g m1g = mt0.i;
            a24.p(m1g, "CameraUpdateFactory is not initialized");
            Parcel G0 = m1g.G0();
            u1g.b(G0, cameraPosition);
            Parcel R = m1g.R(G0, 7);
            un6 K0 = ks9.K0(R.readStrongBinder());
            R.recycle();
            e(new gvf(6, new mod(K0)), false);
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void e(gvf gvf, boolean z) {
        mod mod = (mod) gvf.b;
        mod mod2 = this.d;
        if (z) {
            mod2.getClass();
            qe4 qe4 = (qe4) mod2.b;
            qe4.getClass();
            try {
                a24.p(mod, "CameraUpdate must not be null.");
                x3g x3g = (x3g) qe4.b;
                Parcel G0 = x3g.G0();
                u1g.c(G0, (un6) mod.b);
                G0.writeInt(800);
                G0.writeStrongBinder((IBinder) null);
                x3g.H0(G0, 7);
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            mod2.getClass();
            qe4 qe42 = (qe4) mod2.b;
            qe42.getClass();
            try {
                a24.p(mod, "CameraUpdate must not be null.");
                x3g x3g2 = (x3g) qe42.b;
                Parcel G02 = x3g2.G0();
                u1g.c(G02, (un6) mod.b);
                x3g2.H0(G02, 4);
            } catch (RemoteException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final void f(int i2) {
        int i3;
        mod mod = this.d;
        mod.getClass();
        if (i2 != 0) {
            i3 = 1;
            if (i2 != 1) {
                int i4 = 2;
                if (i2 != 2) {
                    i4 = 3;
                    if (i2 != 3) {
                        i4 = 4;
                        if (i2 != 4) {
                            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unknown tam map type = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
                        }
                    }
                }
                i3 = i4;
            }
        } else {
            i3 = 0;
        }
        qe4 qe4 = (qe4) mod.b;
        qe4.getClass();
        try {
            x3g x3g = (x3g) qe4.b;
            Parcel G0 = x3g.G0();
            G0.writeInt(i3);
            x3g.H0(G0, 16);
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void g(Context context, boolean z) {
        boolean z2 = false;
        mod mod = this.d;
        if (!z) {
            mod.R(false);
            return;
        }
        int d2 = d8.d(context, "android.permission.ACCESS_FINE_LOCATION");
        int d3 = d8.d(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (d2 == 0 && d3 == 0) {
            z2 = true;
        }
        mod.R(z2);
    }
}
