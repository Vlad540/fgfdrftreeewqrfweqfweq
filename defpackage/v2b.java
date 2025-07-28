package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: v2b  reason: default package */
public final class v2b implements i36, zhd, x4e, mp {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public v2b(Context context) {
        w4g w4g;
        this.a = 18;
        this.b = new m5g(context, na6.b);
        synchronized (w4g.class) {
            try {
                if (w4g.X == null) {
                    w4g.X = new w4g(context.getApplicationContext(), 0);
                }
                w4g = w4g.X;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.c = w4g;
    }

    public static v2b i(ma0 ma0) {
        k90 k90 = k90.c;
        e07.o(ma0, "quality cannot be null");
        e07.o(k90, "fallbackStrategy cannot be null");
        boolean contains = ma0.k.contains(ma0);
        e07.j("Invalid quality: " + ma0, contains);
        return new v2b(Collections.singletonList(ma0), k90);
    }

    public static v2b j(List list, k90 k90) {
        e07.o(list, "qualities cannot be null");
        e07.j("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ma0 ma0 = (ma0) it.next();
            boolean contains = ma0.k.contains(ma0);
            e07.j("qualities contain invalid quality: " + ma0, contains);
        }
        return new v2b(list, k90);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        e07.p("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", r9.o());
        r4 = null;
        r6 = null;
        r5 = 0;
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0113, code lost:
        if (r9.n == null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0115, code lost:
        r4 = null;
        r6 = null;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0118, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011d, code lost:
        if (r9.g0 != 3) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011f, code lost:
        r4 = r9.o;
        r9.o = null;
        r9.y();
        r6 = y5c.m0;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012a, code lost:
        r6 = null;
        r5 = 0;
        r7 = 0;
        r0 = r9.q(r9.k);
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013b, code lost:
        r4 = null;
        r6 = null;
        r10 = false;
        r5 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 3: goto L_0x0033;
                case 7: goto L_0x0016;
                default: goto L_0x0005;
            }
        L_0x0005:
            q4e r10 = (q4e) r10
            r10.getClass()
            java.lang.Object r9 = r9.c     // Catch:{ ProcessingException -> 0x0015 }
            ydc r9 = (defpackage.ydc) r9     // Catch:{ ProcessingException -> 0x0015 }
            java.lang.Object r9 = r9.b     // Catch:{ ProcessingException -> 0x0015 }
            r4e r9 = (r4e) r9     // Catch:{ ProcessingException -> 0x0015 }
            r9.c(r10)     // Catch:{ ProcessingException -> 0x0015 }
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r0 = r9.c     // Catch:{ all -> 0x002b }
            j26 r0 = (j26) r0     // Catch:{ all -> 0x002b }
            java.lang.Object r10 = r0.apply(r10)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = "The mapper function returned a null value."
            java.util.Objects.requireNonNull(r10, r0)     // Catch:{ all -> 0x002b }
            java.lang.Object r9 = r9.b
            zhd r9 = (zhd) r9
            r9.a(r10)
            goto L_0x0032
        L_0x002b:
            r10 = move-exception
            defpackage.ek8.a0(r10)
            r9.onError(r10)
        L_0x0032:
            return
        L_0x0033:
            hx4 r10 = (hx4) r10
            java.util.Objects.toString(r10)
            if (r10 != 0) goto L_0x003c
            goto L_0x017a
        L_0x003c:
            java.lang.Object r10 = r9.c
            ug4 r10 = (ug4) r10
            java.lang.Object r10 = r10.g
            y5c r10 = (y5c) r10
            vj4 r10 = r10.a0
            java.lang.Object r0 = r9.b
            vj4 r0 = (vj4) r0
            r1 = 0
            r2 = 1
            if (r10 != r0) goto L_0x0050
            r10 = r2
            goto L_0x0051
        L_0x0050:
            r10 = r1
        L_0x0051:
            r0 = 0
            e07.p(r0, r10)
            java.lang.Object r10 = r9.c
            ug4 r10 = (ug4) r10
            java.lang.Object r10 = r10.g
            y5c r10 = (y5c) r10
            hx4 r10 = r10.F
            if (r10 != 0) goto L_0x0063
            r10 = r2
            goto L_0x0064
        L_0x0063:
            r10 = r1
        L_0x0064:
            e07.p(r0, r10)
            java.lang.Object r10 = r9.c
            ug4 r10 = (ug4) r10
            java.lang.Object r10 = r10.g
            y5c r10 = (y5c) r10
            java.lang.Object r3 = r9.b
            vj4 r3 = (vj4) r3
            r10.getClass()
            java.lang.Object r4 = r3.f
            xx4 r4 = (xx4) r4
            r10.F = r4
            u2 r4 = r4.g
            q3f r4 = (q3f) r4
            r4.b1()
            hx4 r4 = r10.F
            xx4 r4 = (xx4) r4
            android.media.MediaFormat r4 = r4.d
            java.lang.String r5 = "bitrate"
            boolean r6 = r4.containsKey(r5)
            if (r6 == 0) goto L_0x0094
            r4.getInteger(r5)
        L_0x0094:
            int r4 = r3.b
            r5 = 4
            if (r4 == r5) goto L_0x009b
            r4 = r0
            goto L_0x009f
        L_0x009b:
            java.lang.Object r4 = r3.g
            android.view.Surface r4 = (android.view.Surface) r4
        L_0x009f:
            r10.B = r4
            r10.A(r4)
            ryc r4 = r10.e
            n5c r6 = new n5c
            r6.<init>(r10)
            r3.i = r4
            r3.j = r6
            java.lang.Object r6 = r3.m
            ch7 r6 = (ch7) r6
            ch7 r6 = defpackage.ct0.A(r6)
            s5c r7 = new s5c
            r8 = 0
            r7.<init>(r10, r8, r3)
            defpackage.ct0.a(r6, r7, r4)
            java.lang.Object r9 = r9.c
            ug4 r9 = (ug4) r9
            java.lang.Object r9 = r9.g
            y5c r9 = (y5c) r9
            java.lang.String r10 = "Incorrectly invoke onConfigured() in state "
            java.lang.Object r3 = r9.h
            monitor-enter(r3)
            x5c r4 = r9.k     // Catch:{ all -> 0x00e6 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x00e6 }
            switch(r4) {
                case 0: goto L_0x0136;
                case 1: goto L_0x0110;
                case 2: goto L_0x010e;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00eb;
                case 5: goto L_0x00e9;
                case 6: goto L_0x00d8;
                case 7: goto L_0x00fa;
                default: goto L_0x00d6;
            }     // Catch:{ all -> 0x00e6 }
        L_0x00d6:
            goto L_0x013b
        L_0x00d8:
            boolean r10 = r9.i     // Catch:{ all -> 0x00e6 }
            if (r10 == 0) goto L_0x00de
            goto L_0x013b
        L_0x00de:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x00e6 }
            java.lang.String r10 = "Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface."
            r9.<init>(r10)     // Catch:{ all -> 0x00e6 }
            throw r9     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r9 = move-exception
            goto L_0x017b
        L_0x00e9:
            r10 = r2
            goto L_0x00ec
        L_0x00eb:
            r10 = r1
        L_0x00ec:
            boolean r4 = r9.o()     // Catch:{ all -> 0x00e6 }
            java.lang.String r5 = "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording"
            e07.p(r5, r4)     // Catch:{ all -> 0x00e6 }
            r4 = r0
            r6 = r4
            r5 = r1
            r7 = r2
            goto L_0x0140
        L_0x00fa:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00e6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>(r10)     // Catch:{ all -> 0x00e6 }
            x5c r9 = r9.k     // Catch:{ all -> 0x00e6 }
            r1.append(r9)     // Catch:{ all -> 0x00e6 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x00e6 }
            r0.<init>(r9)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x010e:
            r10 = r2
            goto L_0x0111
        L_0x0110:
            r10 = r1
        L_0x0111:
            na0 r4 = r9.n     // Catch:{ all -> 0x00e6 }
            if (r4 == 0) goto L_0x011a
            r4 = r0
            r6 = r4
            r5 = r1
        L_0x0118:
            r7 = r5
            goto L_0x0140
        L_0x011a:
            int r4 = r9.g0     // Catch:{ all -> 0x00e6 }
            r6 = 3
            if (r4 != r6) goto L_0x012a
            na0 r4 = r9.o     // Catch:{ all -> 0x00e6 }
            r9.o = r0     // Catch:{ all -> 0x00e6 }
            r9.y()     // Catch:{ all -> 0x00e6 }
            java.lang.RuntimeException r6 = y5c.m0     // Catch:{ all -> 0x00e6 }
            r7 = r1
            goto L_0x0140
        L_0x012a:
            x5c r4 = r9.k     // Catch:{ all -> 0x00e6 }
            na0 r4 = r9.q(r4)     // Catch:{ all -> 0x00e6 }
            r6 = r0
            r5 = r1
            r7 = r5
            r0 = r4
            r4 = r6
            goto L_0x0140
        L_0x0136:
            x5c r10 = x5c.o     // Catch:{ all -> 0x00e6 }
            r9.B(r10)     // Catch:{ all -> 0x00e6 }
        L_0x013b:
            r4 = r0
            r6 = r4
            r10 = r1
            r5 = r10
            goto L_0x0118
        L_0x0140:
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            if (r7 == 0) goto L_0x016f
            na0 r0 = r9.q
            r9.G(r0, r2)
            hx4 r0 = r9.F
            xx4 r0 = (xx4) r0
            r0.k()
            boolean r0 = r9.d0
            if (r0 == 0) goto L_0x0165
            na0 r0 = r9.q
            re5 r2 = r0.w0
            oa0 r3 = r9.k()
            c8f r4 = new c8f
            r4.<init>(r2, r3)
            r0.n(r4)
            r9.d0 = r1
        L_0x0165:
            if (r10 == 0) goto L_0x017a
            hx4 r9 = r9.F
            xx4 r9 = (xx4) r9
            r9.e()
            goto L_0x017a
        L_0x016f:
            if (r0 == 0) goto L_0x0175
            r9.E(r0, r10)
            goto L_0x017a
        L_0x0175:
            if (r4 == 0) goto L_0x017a
            r9.j(r4, r5, r6)
        L_0x017a:
            return
        L_0x017b:
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v2b.a(java.lang.Object):void");
    }

    public boolean b(String str, String str2, axb axb, xwb xwb) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        boolean containsKey = linkedHashMap.containsKey(str);
        String str3 = (String) linkedHashMap.put(str, str2);
        if (!containsKey || !Objects.equals(str3, str2)) {
            return true;
        }
        xwb.log("CodecPrefUtil", "parameter " + str + " value did not change");
        return false;
    }

    public void c(b7c b7c, ms msVar) {
        kgd kgd = (kgd) this.b;
        maf maf = (maf) kgd.get(b7c);
        if (maf == null) {
            maf = maf.a();
            kgd.put(b7c, maf);
        }
        maf.c = msVar;
        maf.a |= 8;
    }

    public void d(xi4 xi4) {
        ((zhd) this.b).d(xi4);
    }

    public void e(Throwable th) {
        na0 na0;
        switch (this.a) {
            case 3:
                Objects.toString(th);
                ug4 ug4 = (ug4) this.c;
                int i = ug4.c;
                if (i < ug4.a) {
                    ug4.c = i + 1;
                    pzb pzb = new pzb(3, this);
                    ryc ryc = ((y5c) ug4.g).e;
                    ug4.f = pa2.A().schedule(new hg9(ryc, 28, pzb), y5c.q0, TimeUnit.MILLISECONDS);
                    return;
                }
                y5c y5c = (y5c) ug4.g;
                synchronized (y5c.h) {
                    try {
                        na0 = null;
                        switch (y5c.k.ordinal()) {
                            case 0:
                                break;
                            case 1:
                            case 2:
                                na0 na02 = y5c.o;
                                y5c.o = null;
                                na0 = na02;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                throw new AssertionError("Encountered encoder setup error while in unexpected state " + y5c.k + ": " + th);
                        }
                        if (y5c.m != -1) {
                            y5c.m = -1;
                            y5c.a.v(new ua0(-1, y5c.m(y5c.k), y5c.s));
                        }
                        y5c.B(x5c.x0);
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                if (na0 != null) {
                    y5c.j(na0, 7, th);
                    return;
                }
                return;
            default:
                int i2 = ((o4e) this.b).f;
                if (i2 != 2 || !(th instanceof CancellationException)) {
                    hhd.A(i2);
                    return;
                }
                return;
        }
    }

    public void f(long j, yze yze) {
        if (yze.c() >= 9) {
            int h = yze.h();
            int h2 = yze.h();
            int v = yze.v();
            if (h == 434 && h2 == 1195456820 && v == 3) {
                a24.s(j, yze, (ape[]) this.c);
            }
        }
    }

    public void g(cb0 cb0) {
        ((h6f) this.c).e();
        t36 t36 = (!((zq4) this.b).a() || !cb0.d) ? t36.b : t36.c;
        String str = ((h6f) this.c).a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "onTransformationInfoUpdate, transformationInfo=" + cb0 + ", input format=" + t36, (Throwable) null);
        }
        s6f s6f = ((h6f) this.c).y0;
        if (s6f != null) {
            w36.d((AtomicBoolean) s6f.c, true);
            w36.c((Thread) s6f.e);
            if (((t36) s6f.n) != t36) {
                s6f.n = t36;
                s6f.v(s6f.b);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public void h(h75 h75, pse pse) {
        int i = 0;
        while (true) {
            ape[] apeArr = (ape[]) this.c;
            if (i < apeArr.length) {
                pse.a();
                pse.b();
                ape B = h75.B(pse.e, 3);
                vu5 vu5 = (vu5) ((List) this.b).get(i);
                String str = vu5.A0;
                boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
                String valueOf = String.valueOf(str);
                swb.d(valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "), z);
                tu5 tu5 = new tu5();
                pse.b();
                tu5.a = pse.f;
                tu5.k = str;
                tu5.d = vu5.o;
                tu5.c = vu5.c;
                tu5.C = vu5.S0;
                tu5.m = vu5.C0;
                B.d(new vu5(tu5));
                apeArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public void k(x3e x3e) {
        try {
            s4g s4g = (s4g) this.c;
            r0g r0g = new r0g(x3e);
            Parcel G0 = s4g.G0();
            u1g.c(G0, r0g);
            s4g.H0(G0, 12);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public SharedPreferences l() {
        return ((Context) this.b).getSharedPreferences("tracer-" + ((String) this.c), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            jj7 r0 = (jj7) r0
            r0.getClass()
            java.lang.String r1 = "feedback"
            r2 = 0
            java.lang.String r3 = "eventType"
            java.lang.String r3 = r11.getString(r3)     // Catch:{ JSONException -> 0x0048 }
            int r3 = defpackage.sxe.w(r3)     // Catch:{ JSONException -> 0x0048 }
            int r3 = hr1.t(r3)     // Catch:{ JSONException -> 0x0048 }
            hw4 r4 = hw4.a
            java.lang.String r5 = "removedParticipantIds"
            java.lang.String r6 = "addedParticipantIds"
            java.lang.String r7 = "totalCount"
            java.lang.Object r8 = r0.c
            zja r8 = (defpackage.zja) r8
            if (r3 == 0) goto L_0x0071
            r9 = 1
            if (r3 == r9) goto L_0x0050
            r4 = 2
            if (r3 != r4) goto L_0x004a
            boolean r3 = r11.has(r1)     // Catch:{ JSONException -> 0x0048 }
            if (r3 == 0) goto L_0x009c
            fn1 r3 = new fn1     // Catch:{ JSONException -> 0x0048 }
            java.lang.Object r4 = r0.b     // Catch:{ JSONException -> 0x0048 }
            xhd r4 = (defpackage.xhd) r4     // Catch:{ JSONException -> 0x0048 }
            org.json.JSONObject r11 = r11.getJSONObject(r1)     // Catch:{ JSONException -> 0x0048 }
            r4.getClass()     // Catch:{ JSONException -> 0x0048 }
            j51 r11 = defpackage.xhd.j(r11)     // Catch:{ JSONException -> 0x0048 }
            r3.<init>(r11)     // Catch:{ JSONException -> 0x0048 }
            r2 = r3
            goto L_0x009c
        L_0x0048:
            r11 = move-exception
            goto L_0x0091
        L_0x004a:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException     // Catch:{ JSONException -> 0x0048 }
            r11.<init>()     // Catch:{ JSONException -> 0x0048 }
            throw r11     // Catch:{ JSONException -> 0x0048 }
        L_0x0050:
            int r1 = r11.getInt(r7)     // Catch:{ JSONException -> 0x0048 }
            org.json.JSONArray r3 = r11.optJSONArray(r6)     // Catch:{ JSONException -> 0x0048 }
            if (r3 == 0) goto L_0x005f
            java.util.ArrayList r3 = r8.a(r3)     // Catch:{ JSONException -> 0x0048 }
            goto L_0x0060
        L_0x005f:
            r3 = r4
        L_0x0060:
            org.json.JSONArray r11 = r11.optJSONArray(r5)     // Catch:{ JSONException -> 0x0048 }
            if (r11 == 0) goto L_0x006a
            java.util.ArrayList r4 = r8.a(r11)     // Catch:{ JSONException -> 0x0048 }
        L_0x006a:
            gn1 r11 = new gn1     // Catch:{ JSONException -> 0x0048 }
            r11.<init>(r1, r3, r4)     // Catch:{ JSONException -> 0x0048 }
        L_0x006f:
            r2 = r11
            goto L_0x009c
        L_0x0071:
            int r1 = r11.optInt(r7)     // Catch:{ JSONException -> 0x0048 }
            org.json.JSONArray r3 = r11.optJSONArray(r6)     // Catch:{ JSONException -> 0x0048 }
            if (r3 == 0) goto L_0x0080
            java.util.ArrayList r3 = r8.a(r3)     // Catch:{ JSONException -> 0x0048 }
            goto L_0x0081
        L_0x0080:
            r3 = r4
        L_0x0081:
            org.json.JSONArray r11 = r11.optJSONArray(r5)     // Catch:{ JSONException -> 0x0048 }
            if (r11 == 0) goto L_0x008b
            java.util.ArrayList r4 = r8.a(r11)     // Catch:{ JSONException -> 0x0048 }
        L_0x008b:
            en1 r11 = new en1     // Catch:{ JSONException -> 0x0048 }
            r11.<init>(r1, r3, r4)     // Catch:{ JSONException -> 0x0048 }
            goto L_0x006f
        L_0x0091:
            java.lang.Object r0 = r0.a
            xwb r0 = (defpackage.xwb) r0
            java.lang.String r1 = "WaitingRoomNotificationParser"
            java.lang.String r3 = "Can't parse chat room notification"
            r0.logException(r1, r3, r11)
        L_0x009c:
            if (r2 == 0) goto L_0x00bf
            boolean r11 = r2 instanceof defpackage.en1
            java.lang.Object r10 = r10.c
            jn1 r10 = (defpackage.jn1) r10
            if (r11 == 0) goto L_0x00ac
            en1 r2 = (defpackage.en1) r2
            r10.onAttendee(r2)
            goto L_0x00bf
        L_0x00ac:
            boolean r11 = r2 instanceof defpackage.fn1
            if (r11 == 0) goto L_0x00b6
            fn1 r2 = (defpackage.fn1) r2
            r10.onFeedback(r2)
            goto L_0x00bf
        L_0x00b6:
            boolean r11 = r2 instanceof defpackage.gn1
            if (r11 == 0) goto L_0x00bf
            gn1 r2 = (defpackage.gn1) r2
            r10.onHandUp(r2)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v2b.m(org.json.JSONObject):void");
    }

    public void n(JSONObject jSONObject) {
        hn1 hn1;
        jj7 jj7 = (jj7) this.b;
        jj7.getClass();
        try {
            hn1 = new hn1(!jSONObject.optBoolean("disprove", false));
        } catch (JSONException e) {
            ((xwb) jj7.a).logException("WaitingRoomNotificationParser", "Can't parse promotion approved", e);
            hn1 = null;
        }
        if (hn1 != null) {
            ((jn1) this.c).onPromotionUpdated(hn1);
        }
    }

    public ms o(b7c b7c, int i) {
        maf maf;
        ms msVar;
        kgd kgd = (kgd) this.b;
        int d = kgd.d(b7c);
        if (d >= 0 && (maf = (maf) kgd.i(d)) != null) {
            int i2 = maf.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                maf.a = i3;
                if (i == 4) {
                    msVar = maf.b;
                } else if (i == 8) {
                    msVar = maf.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    kgd.g(d);
                    maf.a = 0;
                    maf.b = null;
                    maf.c = null;
                    maf.d.g(maf);
                }
                return msVar;
            }
        }
        return null;
    }

    public void onError(Throwable th) {
        ((zhd) this.b).onError(th);
    }

    public void p(Object obj, String str) {
        AtomicReference atomicReference = (AtomicReference) ((r7e) this.c).getValue();
        while (true) {
            Map map = (Map) atomicReference.get();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (obj == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, obj);
            }
            while (true) {
                if (!atomicReference.compareAndSet(map, linkedHashMap)) {
                    if (atomicReference.get() != map) {
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void q(b7c b7c) {
        maf maf = (maf) ((kgd) this.b).get(b7c);
        if (maf != null) {
            maf.a &= -2;
        }
    }

    public void r(b7c b7c) {
        uq7 uq7 = (uq7) this.c;
        int h = uq7.h() - 1;
        while (true) {
            if (h < 0) {
                break;
            } else if (b7c == uq7.i(h)) {
                Object[] objArr = uq7.c;
                Object obj = objArr[h];
                Object obj2 = n06.c;
                if (obj != obj2) {
                    objArr[h] = obj2;
                    uq7.a = true;
                }
            } else {
                h--;
            }
        }
        maf maf = (maf) ((kgd) this.b).remove(b7c);
        if (maf != null) {
            maf.a = 0;
            maf.b = null;
            maf.c = null;
            maf.d.g(maf);
        }
    }

    public void s() {
        koe.a(new pzb(16, this));
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "QualitySelector{preferredQualities=" + ((List) this.b) + ", fallbackStrategy=" + ((k90) this.c) + "}";
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.b);
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                if (linkedHashMap.isEmpty()) {
                    return sb.toString();
                }
                sb.append(' ');
                boolean z = true;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(';');
                    }
                    sb.append((String) entry.getKey());
                    String str = (String) entry.getValue();
                    if (str != null) {
                        sb.append('=');
                        sb.append(str);
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v2b(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ v2b(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public v2b(a aVar, s4g s4g) {
        this.a = 17;
        this.c = s4g;
        a24.o(aVar);
        this.b = aVar;
    }

    public v2b(String str, LinkedHashMap linkedHashMap) {
        this.a = 16;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.c = linkedHashMap2;
        this.b = str;
        if (linkedHashMap != null) {
            linkedHashMap2.putAll(linkedHashMap);
        }
    }

    public v2b(s16 s16) {
        this.a = 6;
        this.b = s16;
        this.c = new r7e(new ke(9, this));
    }

    public v2b(k93 k93) {
        this.a = 0;
        this.b = k93;
        this.c = zg4.b();
    }

    public v2b(List list) {
        this.a = 12;
        this.b = list;
        this.c = new ape[list.size()];
    }

    public v2b(int i) {
        this.a = i;
        switch (i) {
            case 8:
                return;
            case Protos.Attaches.Attach.LOCATION:
                this.b = new kgd();
                this.c = new uq7();
                return;
            default:
                this.b = new pq3(vhc.h, (mge) new hge(l8a.p1), Integer.valueOf(zhc.P), (Integer) null, 20);
                this.c = new pq3(vhc.d, (mge) new hge(l8a.o1), Integer.valueOf(zhc.t), (Integer) null, 20);
                return;
        }
    }

    public v2b(List list, k90 k90) {
        this.a = 2;
        e07.j("No preferred quality and fallback strategy.", !list.isEmpty() || k90 != k90.c);
        this.b = Collections.unmodifiableList(new ArrayList(list));
        this.c = k90;
    }
}
