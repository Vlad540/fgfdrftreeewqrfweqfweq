package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: bt2  reason: default package */
public final class bt2 extends taf implements ms7 {
    public static final /* synthetic */ k77[] U0;
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public final t97 E0;
    public final t97 F0;
    public final t97 G0;
    public final t97 H0;
    public final grd I0;
    public final t0c J0;
    public final grd K0;
    public final l05 L0 = new l05(0);
    public final l05 M0 = new l05(0);
    public final String N0 = bt2.class.getName();
    public final qj O0 = new qj(this);
    public final ju3 P0;
    public qod Q0;
    public qod R0;
    public qod S0;
    public final e3 T0;
    public final bw2 X;
    public final src Y;
    public final pae Z;
    public final i2c b;
    public final oo3 c;
    public final vs7 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        hc9 hc9 = new hc9(bt2.class, "processSearchResultJob", "getProcessSearchResultJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        U0 = new k77[]{hc9};
    }

    public bt2() {
        nqc nqc = nqc.a;
        vs7 vs7 = (vs7) nqc.getAccessor().c(vs7.class);
        tp2 tp2 = tp2.a;
        n3a s = nqc.s();
        t97 t97 = mqc.r;
        t97 t972 = mqc.w;
        t97 t973 = mqc.b;
        t97 t974 = mqc.e;
        t97 t975 = mqc.c;
        r7e d = nqc.getAccessor().d(f03.class);
        r7e d2 = nqc.getAccessor().d(xzc.class);
        t97 t976 = mqc.v;
        t97 t977 = t97;
        r7e d3 = tp2.getAccessor().d(ch3.class);
        r7e d4 = tp2.getAccessor().d(xg0.class);
        r7e d5 = tp2.getAccessor().d(rj3.class);
        r7e d6 = tp2.getAccessor().d(pv3.class);
        this.b = (i2c) nqc.getAccessor().c(i2c.class);
        this.c = (oo3) nqc.getAccessor().c(oo3.class);
        this.o = vs7;
        this.X = (bw2) tp2.getAccessor().c(bw2.class);
        this.Y = (src) tp2.getAccessor().c(src.class);
        this.Z = s;
        this.w0 = t972;
        this.x0 = d;
        this.y0 = d2;
        this.z0 = t973;
        this.A0 = t974;
        this.B0 = t975;
        this.C0 = t977;
        this.D0 = t976;
        this.E0 = d3;
        this.F0 = d4;
        this.G0 = d5;
        this.H0 = d6;
        grd a = hrd.a(js2.f);
        this.I0 = a;
        this.J0 = new t0c(a);
        grd a2 = hrd.a((Object) null);
        this.K0 = a2;
        this.P0 = s.b().limitedParallelism(1, "ChatsListSearchViewModelDispatcher");
        this.T0 = hwf.t();
        vs7.h = this;
        t(true);
        ez3.N(new ck5(ez3.x(new nl5(a2, 0), 300), new hp0(2, this, bt2.class, "loadByQuery", "loadByQuery(Ljava/lang/String;)V", 4, 10), 5), this.a);
    }

    public static final void q(bt2 bt2, long j, long j2) {
        aw2 s = bt2.s();
        long e = zp4.e(j2) + ((f03) bt2.x0.getValue()).m();
        t52 l = s.l();
        i22 B = l.B(j);
        if (B != null) {
            l.l(e, B);
            ((pk) l.p.get()).r(B.a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: hw4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: hw4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: hw4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: hw4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List r(defpackage.bt2 r15) {
        /*
            t97 r15 = r15.y0
            java.lang.Object r15 = r15.getValue()
            xzc r15 = (xzc) r15
            vqc r15 = (vqc) r15
            r15.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.search-webapps-showcase
            java.lang.String r0 = r0.name()
            x97 r15 = r15.g
            r1 = 0
            java.lang.String r15 = r15.getString(r0, r1)
            if (r15 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0023 }
            r0.<init>(r15)     // Catch:{ JSONException -> 0x0023 }
            r1 = r0
        L_0x0023:
            hw4 r15 = defpackage.hw4.a
            if (r1 != 0) goto L_0x0028
            goto L_0x006d
        L_0x0028:
            java.lang.String r0 = "items"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            if (r0 != 0) goto L_0x0031
            goto L_0x006d
        L_0x0031:
            java.util.ArrayList r15 = new java.util.ArrayList
            int r1 = r0.length()
            r15.<init>(r1)
            int r1 = r0.length()
            r2 = 0
        L_0x003f:
            if (r2 >= r1) goto L_0x006d
            org.json.JSONObject r3 = r0.getJSONObject(r2)
            java.lang.String r4 = "id"
            long r6 = r3.getLong(r4)
            java.lang.String r4 = "icon"
            java.lang.String r9 = r3.optString(r4)
            java.lang.String r4 = "title"
            java.lang.String r8 = r3.getString(r4)
            t1c r3 = new t1c
            r4 = 2
            java.lang.String r10 = defpackage.h0e.y0(r4, r8)
            r12 = 0
            r14 = 176(0xb0, float:2.47E-43)
            r11 = 0
            r13 = 1
            r5 = r3
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14)
            r15.add(r3)
            int r2 = r2 + 1
            goto L_0x003f
        L_0x006d:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt2.r(bt2):java.util.List");
    }

    public final void g(String str, List list) {
        if (!hhd.f(((js2) this.I0.getValue()).b, str)) {
            udd.H(this.N0, "chats search: query changed, skip content", (Throwable) null);
            return;
        }
        qod D = xs7.D(this.a, this.Z.a().plus(this.O0), ru3.b, new ws2(this, str, list, (Continuation) null));
        this.T0.o1(this, U0[0], D);
    }

    public final void p() {
        qod qod = this.Q0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        vs7 vs7 = this.o;
        vs7.d();
        qod qod2 = this.R0;
        if (qod2 != null) {
            qod2.cancel((CancellationException) null);
        }
        vs7.h = null;
    }

    public final bv2 s() {
        return (bv2) this.z0.getValue();
    }

    public final void t(boolean z) {
        qod qod = this.Q0;
        if (qod == null || !qod.isActive()) {
            this.o.d();
            this.K0.setValue((Object) null);
            qod qod2 = this.R0;
            if (qod2 != null) {
                qod2.cancel((CancellationException) null);
            }
            g37 g37 = (g37) this.T0.T0(this, U0[0]);
            if (g37 != null) {
                g37.cancel((CancellationException) null);
            }
            this.Q0 = xs7.E(this.a, this.P0.plus(this.O0), (ru3) null, new ms2(this, z, (Continuation) null), 2);
        }
    }

    public final void u(long j) {
        a34 a34;
        i22 q = s().q(j);
        if (q != null) {
            a34 = zu2.c.a2(q.a);
        } else {
            zu2.c.getClass();
            a34 = new a34(":profile?id=" + j + "&type=contact");
        }
        taf.o(this.L0, a34);
    }
}
