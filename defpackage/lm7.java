package defpackage;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpStatus;

/* renamed from: lm7  reason: default package */
public final /* synthetic */ class lm7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf6 b;

    public /* synthetic */ lm7(wf6 wf6, int i) {
        this.a = i;
        this.b = wf6;
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Object, i6g] */
    public final void run() {
        Class<ta6> cls = ta6.class;
        boolean z = false;
        int i = this.a;
        wf6 wf6 = this.b;
        wf6.getClass();
        switch (i) {
            case 0:
                udd.q("wf6", "stop");
                AtomicBoolean atomicBoolean = wf6.a;
                if (!atomicBoolean.get()) {
                    udd.q("wf6", "stop: not started, return");
                }
                atomicBoolean.set(false);
                ua6 ua6 = wf6.b;
                HashMap hashMap = ua6.b;
                ta6 ta6 = (ta6) hashMap.get(wf6);
                if (ta6 != null) {
                    l0g l0g = ua6.a;
                    l0g.getClass();
                    String simpleName = cls.getSimpleName();
                    a24.l(simpleName, "Listener type must not be empty");
                    l0g.b(new ih7(ta6, simpleName), 2418).j(mh4.X, mk9.Z);
                    hashMap.remove(wf6);
                    return;
                }
                return;
            default:
                udd.q("wf6", "start");
                if (wf6.a.get()) {
                    udd.q("wf6", "start: already started, return");
                }
                if (!urd.j(wf6.d, urd.e)) {
                    udd.q("wf6", "start: no permissions");
                    wf6.c.U0();
                    return;
                }
                ua6 ua62 = wf6.b;
                jm7 a2 = wf6.a();
                ua62.getClass();
                LocationRequest locationRequest = new LocationRequest();
                int i2 = a2.b;
                if (i2 != 0) {
                    int t = hr1.t(i2);
                    int i3 = 105;
                    if (t != 0) {
                        if (t == 1) {
                            i3 = HttpStatus.SC_PROCESSING;
                        } else if (t != 2) {
                            Locale locale = Locale.ENGLISH;
                            int i4 = a2.b;
                            udd.s("ua6", "Unknown priority " + wn6.r(i4) + " set to PRIORITY_NO_POWER", (Throwable) null);
                        } else {
                            i3 = 100;
                        }
                    }
                    kjd.W(i3);
                    locationRequest.a = i3;
                }
                Long l = a2.c;
                if (l != null) {
                    long longValue = l.longValue();
                    a24.h("intervalMillis must be greater than or equal to 0", longValue >= 0);
                    long j = locationRequest.c;
                    long j2 = locationRequest.b;
                    if (j == j2 / 6) {
                        locationRequest.c = longValue / 6;
                    }
                    if (locationRequest.x0 == j2) {
                        locationRequest.x0 = longValue;
                    }
                    locationRequest.b = longValue;
                }
                Long l2 = a2.d;
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    Object[] objArr = {l2};
                    if (longValue2 >= 0) {
                        z = true;
                    }
                    a24.i(z, "illegal fastest interval: %d", objArr);
                    locationRequest.c = longValue2;
                }
                ta6 ta62 = new ta6(wf6);
                l0g l0g2 = ua62.a;
                l0g2.getClass();
                Looper myLooper = Looper.myLooper();
                a24.p(myLooper, "invalid null looper");
                lt4 lt4 = new lt4(myLooper, ta62, cls.getSimpleName());
                ud udVar = new ud(l0g2, lt4);
                j1c j1c = new j1c(udVar, 15, locationRequest);
                ? obj = new Object();
                obj.a = j1c;
                obj.c = udVar;
                obj.o = lt4;
                obj.b = 2436;
                ih7 ih7 = (ih7) lt4.c;
                a24.p(ih7, "Key must not be null");
                lt4 lt42 = (lt4) obj.o;
                int i5 = obj.b;
                v4b v4b = new v4b((i6g) obj, lt42, i5);
                rbf rbf = new rbf(obj, ih7);
                a24.p((ih7) lt42.c, "Listener has already been released.");
                qa6 qa6 = l0g2.y0;
                qa6.getClass();
                vde vde = new vde();
                qa6.e(vde, i5, l0g2);
                ozf ozf = new ozf(new c0g(new pzf(v4b, rbf), vde), qa6.x0.get(), l0g2);
                z59 z59 = qa6.B0;
                z59.sendMessage(z59.obtainMessage(8, ozf));
                ua62.b.put(wf6, ta62);
                wf6.a.set(true);
                return;
        }
    }
}
