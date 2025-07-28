package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;

/* renamed from: sd3  reason: default package */
public final class sd3 {
    public static final String l = Integer.toString(0, 36);
    public static final String m = Integer.toString(1, 36);
    public static final String n = Integer.toString(2, 36);
    public static final String o = Integer.toString(9, 36);
    public static final String p = Integer.toString(3, 36);
    public static final String q = Integer.toString(4, 36);
    public static final String r = Integer.toString(5, 36);
    public static final String s = Integer.toString(6, 36);
    public static final String t = Integer.toString(11, 36);
    public static final String u = Integer.toString(7, 36);
    public static final String v = Integer.toString(8, 36);
    public static final String w = Integer.toString(10, 36);
    public final int a;
    public final int b;
    public final nn6 c;
    public final PendingIntent d;
    public final w1d e;
    public final eya f;
    public final eya g;
    public final Bundle h;
    public final Bundle i;
    public final fza j;
    public final ws6 k;

    static {
        int i2 = oze.a;
    }

    public sd3(int i2, int i3, nn6 nn6, PendingIntent pendingIntent, ws6 ws6, w1d w1d, eya eya, eya eya2, Bundle bundle, Bundle bundle2, fza fza) {
        this.a = i2;
        this.b = i3;
        this.c = nn6;
        this.d = pendingIntent;
        this.k = ws6;
        this.e = w1d;
        this.f = eya;
        this.g = eya2;
        this.h = bundle;
        this.i = bundle2;
        this.j = fza;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [ln6, java.lang.Object] */
    public static sd3 a(Bundle bundle) {
        e8c e8c;
        nn6 nn6;
        IBinder binder = bundle.getBinder(w);
        if (binder instanceof rd3) {
            return ((rd3) binder).c;
        }
        int i2 = bundle.getInt(l, 0);
        int i3 = bundle.getInt(v, 0);
        IBinder binder2 = bundle.getBinder(m);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(n);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(o);
        if (parcelableArrayList != null) {
            ts6 i4 = ws6.i();
            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i5);
                bundle2.getClass();
                i4.a(t33.b(i3, bundle2));
            }
            e8c = i4.j();
        } else {
            po5 po5 = ws6.b;
            e8c = e8c.X;
        }
        e8c e8c2 = e8c;
        Bundle bundle3 = bundle.getBundle(p);
        w1d b2 = bundle3 == null ? w1d.b : w1d.b(bundle3);
        Bundle bundle4 = bundle.getBundle(r);
        eya c2 = bundle4 == null ? eya.b : eya.c(bundle4);
        Bundle bundle5 = bundle.getBundle(q);
        eya c3 = bundle5 == null ? eya.b : eya.c(bundle5);
        Bundle bundle6 = bundle.getBundle(s);
        Bundle bundle7 = bundle.getBundle(t);
        Bundle bundle8 = bundle.getBundle(u);
        fza r2 = bundle8 == null ? fza.F : fza.r(i3, bundle8);
        int i6 = me8.i;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof nn6)) {
            ? obj = new Object();
            obj.c = iBinder;
            nn6 = obj;
        } else {
            nn6 = (nn6) queryLocalInterface;
        }
        return new sd3(i2, i3, nn6, pendingIntent, e8c2, b2, c3, c2, bundle6 == null ? Bundle.EMPTY : bundle6, bundle7 == null ? Bundle.EMPTY : bundle7, r2);
    }

    public final Bundle b(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, this.a);
        bundle.putBinder(m, this.c.asBinder());
        bundle.putParcelable(n, this.d);
        ws6 ws6 = this.k;
        if (!ws6.isEmpty()) {
            bundle.putParcelableArrayList(o, gt0.M(ws6, new ak0(25)));
        }
        w1d w1d = this.e;
        w1d.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        rue g2 = w1d.a.iterator();
        while (g2.hasNext()) {
            arrayList.add(((v1d) g2.next()).b());
        }
        bundle2.putParcelableArrayList(w1d.c, arrayList);
        bundle.putBundle(p, bundle2);
        eya eya = this.f;
        bundle.putBundle(q, eya.f());
        eya eya2 = this.g;
        bundle.putBundle(r, eya2.f());
        bundle.putBundle(s, this.h);
        bundle.putBundle(t, this.i);
        bundle.putBundle(u, this.j.q(am7.s(eya, eya2), false, false).t(i2));
        bundle.putInt(v, this.b);
        return bundle;
    }
}
