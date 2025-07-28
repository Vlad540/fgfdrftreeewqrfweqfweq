package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Camera;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.AndroidVideoDecoder;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.b;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* renamed from: gx0  reason: default package */
public final class gx0 implements rl1, ll7, NetworkMonitor.NetworkObserver {
    public static final ExecutorService s2 = Executors.newSingleThreadExecutor();
    public static final ExecutorService t2 = Executors.newSingleThreadExecutor();
    public boolean A0;
    public volatile cx0 A1;
    public final EglBase B0;
    public boolean B1;
    public final tc1 C0;
    public final cc9 C1;
    public final EnumSet D0 = EnumSet.noneOf(fx0.class);
    public final kp0 D1;
    public boolean E0;
    public boolean E1;
    public boolean F0;
    public final boolean F1;
    public final boolean G0;
    public final boolean G1;
    public final ct3 H0;
    public final gvf H1;
    public final boolean I0;
    public final bd4 I1;
    public String J0;
    public final eje J1;
    public long K0;
    public final onc K1;
    public long L0;
    public int L1 = 0;
    public boolean M0 = false;
    public ge1 M1;
    public final lde N0 = new lde(10, this);
    public List N1;
    public boolean O0 = false;
    public volatile boolean O1;
    public List P0;
    public final qb1 P1;
    public final ArrayList Q0 = new ArrayList();
    public final v4b Q1;
    public boolean R0;
    public final gvf R1;
    public final int S0;
    public final xw2 S1;
    public boolean T0;
    public final jg8 T1;
    public fe6 U0;
    public final dr9 U1;
    public boolean V0;
    public final pf8 V1;
    public final wjf W0;
    public final rk1 W1;
    public final kxf X = new kxf(this);
    public final wjf X0;
    public final zfd X1;
    public final ow0 Y = new ow0(this);
    public final axb Y0;
    public final km4 Y1;
    public mfd Z;
    public final xwb Z0;
    public final e3 Z1;
    public boolean a;
    public final me0 a1;
    public final ob1 a2;
    public rk9 b;
    public final boolean b1;
    public final qe4 b2;
    public final nw0 c = new nw0(this, 2);
    public boolean c1 = true;
    public final oj1 c2;
    public boolean d1 = true;
    public final wf1 d2;
    public boolean e1;
    public final kz0 e2;
    public b f1;
    public final stf f2;
    public boolean g1;
    public final sh5 g2;
    public pf3 h1;
    public final boolean h2;
    public final mv4 i1;
    public final td4 i2;
    public long j1;
    public qqd j2;
    public final rxf k1 = new rxf(this);
    public final nu7 k2;
    public final ld3 l1 = new ld3(1, this);
    public final pd l2;
    public final sbf m1 = new sbf(this);
    public volatile boolean m2;
    public final ox3 n1;
    public final w4g n2;
    public final nw0 o = new nw0(this, 0);
    public final ocd o1;
    public final qe4 o2;
    public final d p1;
    public ema p2;
    public final k40 q1;
    public ema q2;
    public final zk7 r1;
    public final kk9 r2;
    public final c2b s1;
    public final pe1 t1;
    public final CopyOnWriteArraySet u1 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet v1 = new CopyOnWriteArraySet();
    public final Handler w0 = new Handler(Looper.getMainLooper());
    public boolean w1;
    public final Context x0;
    public sl1 x1;
    public final fe1 y0;
    public sl1 y1;
    public String z0;
    public pd4 z1;

    /* JADX WARNING: type inference failed for: r12v1, types: [kk9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v4, types: [java.lang.Object, kp0] */
    /* JADX WARNING: type inference failed for: r14v2, types: [otf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, ox3] */
    /* JADX WARNING: type inference failed for: r1v23, types: [pd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.lang.Object, kcd] */
    /* JADX WARNING: type inference failed for: r4v22, types: [jk9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v27, types: [km4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v44, types: [java.lang.Object, e3] */
    /* JADX WARNING: type inference failed for: r0v34, types: [stf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v40, types: [pd, java.lang.Object] */
    public gx0(Context context, fe1 fe1, boolean z, boolean z2, ke1 ke1, dt3 dt3, boolean z3, boolean z4, axb axb, xwb xwb, ywb ywb, cs9 cs9, boolean z5, ufc ufc, bi biVar, fje fje, CallAnalyticsSender callAnalyticsSender, c2b c2b, onc onc) {
        Context context2 = context;
        fe1 fe12 = fe1;
        boolean z6 = z;
        ke1 ke12 = ke1;
        axb axb2 = axb;
        xwb xwb2 = xwb;
        CallAnalyticsSender callAnalyticsSender2 = callAnalyticsSender;
        ob1 ob1 = new ob1();
        this.a2 = ob1;
        qe4 qe4 = new qe4(ob1);
        this.b2 = qe4;
        this.r2 = new Object();
        this.J1 = fje;
        pe1 pe1 = new pe1(ke12, ob1, qe4, xwb2);
        this.t1 = pe1;
        this.y0 = fe12;
        this.i1 = new mv4(9);
        this.F0 = z6;
        this.G0 = z2;
        cc9 cc9 = ke12.c;
        this.C1 = cc9;
        this.D1 = new Object();
        this.H0 = dt3;
        this.I0 = z4;
        this.Y0 = axb2;
        this.Z0 = xwb2;
        d4b d4b = new d4b(xwb2);
        this.s1 = c2b;
        this.F1 = z5;
        this.h2 = fe12.i;
        ob1 ob12 = ob1;
        gvf gvf = new gvf(18);
        this.H1 = gvf;
        gvf gvf2 = gvf;
        this.R1 = new gvf(5, xwb2);
        pe0 pe0 = fe12.A;
        this.a1 = new me0(pe0.a != null, pe0.c.a);
        this.S1 = new xw2(1, xwb2);
        cc9 cc92 = cc9;
        pe1 pe12 = pe1;
        qe4 qe42 = qe4;
        this.V1 = new pf8(xwb, d4b, new xw0(this, 0), new xw0(this, 1), new ow0(this), fje);
        Context applicationContext = context.getApplicationContext();
        this.x0 = applicationContext;
        NetworkMonitor.init(applicationContext);
        ? obj = new Object();
        obj.a = axb2;
        obj.b = callAnalyticsSender2;
        callAnalyticsSender2.setIdle(false);
        rk1 rk1 = new rk1(applicationContext, obj, fje, (ConnectivityManager) context2.getSystemService("connectivity"), (TelephonyManager) context2.getSystemService("phone"), xwb, new mw0(this, 1), dt3);
        this.W1 = rk1;
        rk1.m.c.getClass();
        xwb2.log("OKRTCCall", "Call<init> caller = " + z6 + " " + Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE);
        d4b d4b2 = d4b;
        gvf gvf3 = gvf2;
        ob1 ob13 = ob12;
        fje fje2 = fje;
        rk1 rk12 = rk1;
        xwb xwb3 = xwb2;
        this.x1 = new tp4(pe12, fe1, xwb, axb, ob13);
        ? obj2 = new Object();
        obj2.d = new Hashtable();
        obj2.e = new qf8();
        obj2.f = fe12;
        obj2.g = axb2;
        obj2.h = xwb3;
        obj2.i = ke12;
        this.n1 = obj2;
        v("rtc.init.sw.codec.false");
        v("rtc.abi." + Build.CPU_ABI);
        w4g w4g = new w4g(xwb3, axb2);
        this.n2 = w4g;
        f73 k = new y63(2, new m5(3, w4g)).k(cnc.a());
        bw1 bw1 = new bw1(1);
        k.i(bw1);
        ((n83) w4g.o).a(bw1);
        EglBase create = EglBase.create();
        this.B0 = create;
        xwb3.log("OKRTCCall", d59.c(create) + " was created");
        this.C0 = new tc1(xwb3, create.getEglBaseContext(), EglBase.CONFIG_PLAIN, (String) null);
        int numberOfCameras = Camera.getNumberOfCameras();
        this.S0 = numberOfCameras;
        tqd tqd = tqd.callDevices;
        u(tqd, numberOfCameras + "_1");
        this.W0 = new wjf("pc_created", xwb3);
        this.X0 = new wjf("accepted", xwb3);
        td4 td4 = new td4(xwb3);
        this.i2 = td4;
        ocd ocd = new ocd(create, xwb3, fe12, td4);
        this.o1 = ocd;
        zk7 zk7 = new zk7(context2, xwb3);
        this.r1 = zk7;
        ? obj3 = new Object();
        obj3.a = false;
        obj3.Y = context2;
        obj3.o = fe12.j;
        obj3.b = cs9;
        obj3.X = zk7;
        obj3.a = fe12.B.a;
        obj3.c = xwb3;
        if (((cs9) obj3.b) == null || ((zk7) obj3.X) == null) {
            throw new IllegalStateException();
        }
        k40 k40 = new k40((pd) obj3);
        this.q1 = k40;
        ygd ygd = new ygd(this);
        ? obj4 = new Object();
        obj4.a = ocd;
        obj4.b = k40;
        obj4.j = fe12.B.e;
        cc9 cc93 = cc92;
        obj4.c = cc93;
        obj4.i = null;
        obj4.d = context2;
        obj4.e = xwb3;
        obj4.k = fe12.c;
        obj4.l = create.getEglBaseContext();
        obj4.f = fe12;
        obj4.g = new ow0(this);
        obj4.m = zk7;
        obj4.o = ufc;
        obj4.n = fje2;
        obj4.p = new rgc(12, d4b2);
        obj4.h = ygd;
        if (obj4.a == null || obj4.b == null || obj4.m == null || obj4.d == null || obj4.c == null || obj4.e == null || obj4.f == null || obj4.g == null || obj4.o == null || obj4.h == null) {
            throw new IllegalStateException();
        }
        d dVar = new d(obj4);
        this.p1 = dVar;
        dVar.C0.add(this);
        qqe qqe = new qqe(this);
        dVar.L0 = qqe;
        if (dVar.D0 != null) {
            dVar.D0.x = qqe;
        }
        this.G1 = z3;
        cc93.a.add(new pw0(this));
        pe1 pe13 = pe12;
        cc93.a.add(new ax3(new rgc(10, pe13)));
        AndroidVideoDecoder.errorCallback = new qw0(this);
        NetworkMonitor.getInstance().addObserver(this);
        this.b1 = fe12.k;
        this.Q1 = new v4b((Object) xwb3, 5, (Object) ywb);
        this.T1 = new jg8(new k40(new vle(this), new c9(28, this), xwb3, fe12));
        this.U1 = new dr9(16);
        this.I1 = new bd4(this, ocd, xwb, gvf2, biVar, cc93, create);
        qb1 qb1 = new qb1(pe13, xwb, new bk(1, this), new Object(), new bx0(pe13, 0), zk7);
        this.P1 = qb1;
        zfd zfd = new zfd(xwb3, pe13.a, qb1);
        this.X1 = zfd;
        pe1 pe14 = pe13;
        oj1 oj1 = new oj1(xwb, pe13, qe42, qb1, ob13, new afc((Object) zfd.g, (Object) new mw0(this, 2)), new otf(zfd.o, new mw0(this, 3)), this.J1);
        this.c2 = oj1;
        bk bkVar = new bk(1, this);
        ob1 ob14 = this.a2;
        fe1 fe13 = this.y0;
        ? obj5 = new Object();
        obj5.b = new jj7(pe14, zfd.a, bkVar);
        obj5.c = new b0d(bkVar, xwb, zfd.b, zfd.d, 4);
        obj5.a = new wjf(zfd.m, zfd.n, zfd.o, oj1, fe13.t);
        obj5.o = new b0d(xwb, zfd.c, zfd.h, ob14.j, 8);
        obj5.X = new v2b(zfd.p, ob14.d, false, 15);
        obj5.Y = ob14.p;
        obj5.Z = new jg8(pe14, zfd.q, ob14.k, 5);
        obj5.w0 = new s5c(ob14.q, zfd.k, false, 8);
        obj5.x0 = new otf(ob14.r, zfd.l);
        this.Y1 = obj5;
        ? obj6 = new Object();
        ob1 ob15 = ob13;
        obj6.a = new c9(26, ob15.l);
        this.Z1 = obj6;
        this.d2 = new wf1(zfd.i, ob15);
        this.e2 = new kz0(zfd.j, ob15);
        rk1 rk13 = rk12;
        x41 x41 = rk13.j;
        ? obj7 = new Object();
        obj7.a = x41;
        obj7.b = fje2;
        obj7.c = new LinkedHashMap();
        obj7.o = new LinkedHashSet();
        this.f2 = obj7;
        xwb xwb4 = xwb3;
        this.g2 = new sh5(rk13.j, d4b2, fje, z, new mw0(this, 4), new bx0(pe14, 1), xwb);
        this.k2 = new nu7((Object) this);
        this.K1 = onc;
        mw0 mw0 = new mw0(this, 0);
        ? obj8 = new Object();
        obj8.b = xwb4;
        obj8.c = mw0;
        ajb ajb = new ajb();
        obj8.o = ajb;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qmc a3 = cnc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a3, "scheduler is null");
        obj8.X = new dt9(ajb, timeUnit, a3, 0).n(de.a()).p(new fzd(4, obj8));
        this.l2 = obj8;
        obj8.Y = new rgc(10, pe14);
        AudioLevelListener audioLevelListener = new AudioLevelListener(500, new Handler(Looper.getMainLooper()), new pfe(14, new rgc(11, obj8)));
        ocd ocd2 = this.o1;
        ocd2.getClass();
        ocd2.a.execute(new v82((Object) ocd2, (Object) audioLevelListener, 200, 6));
        this.o2 = new qe4(7, xwb4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean t(defpackage.ke1 r2) {
        /*
            java.util.List r2 = r2.e
            java.util.Iterator r2 = r2.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r2.next()
            je1 r0 = (defpackage.je1) r0
            je1 r1 = defpackage.je1.b
            if (r0 == r1) goto L_0x001a
            je1 r1 = defpackage.je1.a
            if (r0 != r1) goto L_0x0006
        L_0x001a:
            r2 = 1
            return r2
        L_0x001c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx0.t(ke1):boolean");
    }

    public final void A(sl1 sl1, PeerConnection.IceConnectionState iceConnectionState) {
        int i;
        this.Z0.log("OKRTCCall", "handleTopologyIceConnectionChange, " + sl1 + ", state=" + iceConnectionState);
        u(tqd.callIceConnectionState, iceConnectionState.toString());
        if (sl1 == this.x1) {
            boolean z = iceConnectionState == PeerConnection.IceConnectionState.CONNECTED;
            this.W1.k = z;
            if (z) {
                rk1 rk1 = this.W1;
                ok1 ok1 = rk1.h;
                ok1.i.b();
                ok1.j.c();
                afc afc = (afc) ok1.l.o;
                afc.a = null;
                afc.b = null;
                ok1.k.d();
                ydc ydc = ok1.m;
                ((wwc) ydc.b).b = null;
                ((wwc) ydc.c).b = null;
                ((k2e) rk1.g.o).a = null;
                this.O0 = true;
                if (this.c1) {
                    stf stf = this.W1.f;
                    stf.getClass();
                    long x = sl1.x();
                    if (x != -1) {
                        sl1.C(new nk1(stf, SystemClock.elapsedRealtime() - x));
                    }
                }
                this.c1 = false;
                this.L0 = SystemClock.elapsedRealtime();
                k(g41.a, (Object) null);
                this.w0.removeCallbacks(this.N0);
                if (this.b1) {
                    me0 me0 = this.a1;
                    me0.c.b = 0.0d;
                    me0.b.b = 0.0d;
                    me0.m = false;
                    me0.p = Double.NaN;
                    me0.o = Double.NaN;
                    me0.a();
                }
                this.L1 = 0;
                sl1 sl12 = this.y1;
                if (sl12 != null) {
                    sl12.L();
                    this.y1 = null;
                }
            } else if (iceConnectionState == PeerConnection.IceConnectionState.DISCONNECTED) {
                if (this.O0) {
                    this.K0 = (SystemClock.elapsedRealtime() - this.L0) + this.K0;
                }
                this.O0 = false;
                k(g41.b, (Object) null);
            } else if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                sl1 sl13 = this.x1;
                ane ane = ane.c;
                if (sl13.H(ane) && NetworkMonitor.isOnline() && (i = this.L1) < 3) {
                    this.L1 = i + 1;
                    e(ane, true);
                    c(this.x1);
                }
                this.w0.removeCallbacks(this.N0);
                boolean H = sl1.H(ane.b);
                if ((this.J0 == null && this.j1 == 0 && this.G1) || !H) {
                    Handler handler = this.w0;
                    lde lde = this.N0;
                    this.y0.b.getClass();
                    handler.postDelayed(lde, (long) 30000);
                }
            }
        } else if (sl1 != this.y1) {
            this.Z0.reportException("OKRTCCall", "topology.ice.conn.change", new Exception("unexpected.topology"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(boolean r7) {
        /*
            r6 = this;
            xwb r0 = r6.Z0
            java.lang.String r1 = "OKRTCCall"
            java.lang.String r2 = "onUserAnswered"
            r0.log(r1, r2)
            boolean r0 = r6.O1
            r1 = 1
            if (r0 == 0) goto L_0x004c
            nu7 r0 = r6.k2
            fx0 r2 = defpackage.fx0.X
            java.lang.Object r0 = r0.a
            gx0 r0 = (defpackage.gx0) r0
            java.util.EnumSet r0 = r0.D0
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x001f
            return
        L_0x001f:
            nu7 r0 = r6.k2
            java.lang.Object r2 = r0.a
            gx0 r2 = (defpackage.gx0) r2
            pe1 r3 = r2.t1
            java.util.Collection r3 = r3.i()
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x0033
            goto L_0x004c
        L_0x0033:
            java.lang.Object r6 = r0.b
            yja r6 = (defpackage.yja) r6
            if (r6 != 0) goto L_0x004b
            yja r6 = new yja
            r6.<init>(r0)
            ob1 r7 = r2.a2
            yja r7 = r7.c
            java.lang.Object r7 = r7.b
            java.util.concurrent.CopyOnWriteArraySet r7 = (java.util.concurrent.CopyOnWriteArraySet) r7
            r7.add(r6)
            r0.b = r6
        L_0x004b:
            return
        L_0x004c:
            nu7 r0 = r6.k2
            java.lang.Object r2 = r0.b
            yja r2 = (defpackage.yja) r2
            r3 = 0
            if (r2 == 0) goto L_0x0066
            java.lang.Object r4 = r0.a
            gx0 r4 = (defpackage.gx0) r4
            ob1 r4 = r4.a2
            yja r4 = r4.c
            java.lang.Object r4 = r4.b
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4
            r4.remove(r2)
            r0.b = r3
        L_0x0066:
            boolean r0 = r6.E1
            r0 = r0 ^ r1
            r6.E1 = r1
            boolean r2 = r6.i()
            if (r2 != 0) goto L_0x0072
            return
        L_0x0072:
            boolean r2 = r6.m2
            r4 = 0
            if (r2 == 0) goto L_0x008f
            if (r7 == 0) goto L_0x0090
            zk7 r2 = r6.r1
            boolean r2 = r2.d
            if (r2 != 0) goto L_0x0090
            zk7 r7 = r6.r1
            boolean r7 = r7.a()
            if (r7 == 0) goto L_0x008f
            zk7 r7 = r6.r1
            boolean r7 = r7.d
            if (r7 == 0) goto L_0x008f
            r7 = r1
            goto L_0x0090
        L_0x008f:
            r7 = r4
        L_0x0090:
            r6.w1 = r1
            tqd r2 = defpackage.tqd.callAcceptIncoming
            if (r7 == 0) goto L_0x0099
            java.lang.String r5 = "video"
            goto L_0x009b
        L_0x0099:
            java.lang.String r5 = "audio"
        L_0x009b:
            r6.u(r2, r5)
            r6.m(r7)
            pe1 r7 = r6.t1
            ke1 r7 = r7.a
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r7.b()
            if (r0 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r1 = r4
        L_0x00af:
            boolean r0 = r7.b()
            if (r0 != 0) goto L_0x00be
            wia r0 = defpackage.ke1.r
            r7.e(r0)
            r6.w()
            goto L_0x00c1
        L_0x00be:
            r6.x()
        L_0x00c1:
            if (r1 == 0) goto L_0x00cd
            sl1 r7 = r6.x1
            r6.c(r7)
            g41 r7 = defpackage.g41.y0
            r6.k(r7, r3)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx0.B(boolean):void");
    }

    public final void C() {
        if (this.M0) {
            this.Z0.log("OKRTCCall", "Can't start interaction twice. Ignore");
            return;
        }
        this.M0 = true;
        x();
        for (ke1 u : this.t1.i()) {
            this.x1.u(u, true);
        }
        boolean z = this.I0;
        m(z);
        u(tqd.callStart, z ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.i()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            sl1 r0 = r6.x1
            ane r1 = defpackage.ane.c
            boolean r0 = r0.H(r1)
            if (r0 == 0) goto L_0x0088
            r0 = 0
            if (r7 == 0) goto L_0x0039
            d r7 = r6.p1
            cc9 r1 = r6.C1
            boolean r1 = r1.c
            jl7 r7 = r7.D0
            if (r7 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x002b
            pnc r7 = r7.t
            if (r7 == 0) goto L_0x0039
            org.webrtc.ScreenCapturerAndroid r7 = r7.a
            android.media.projection.MediaProjection r7 = r7.getMediaProjection()
            goto L_0x003a
        L_0x002b:
            noc r7 = r7.u
            if (r7 != 0) goto L_0x0030
            goto L_0x0039
        L_0x0030:
            py5 r7 = r7.o
            org.webrtc.ScreenCapturerAndroid r7 = r7.Y
            android.media.projection.MediaProjection r7 = r7.getMediaProjection()
            goto L_0x003a
        L_0x0039:
            r7 = r0
        L_0x003a:
            g41 r1 = defpackage.g41.X
            if (r7 == 0) goto L_0x0063
            ocd r2 = r6.o1
            d r3 = r6.p1
            r2.getClass()
            ncd r4 = new ncd
            r5 = 1
            r4.<init>(r2, r3, r7, r5)
            java.util.concurrent.ExecutorService r7 = r2.a
            r7.execute(r4)
            cc9 r7 = r6.C1
            boolean r2 = r7.b
            if (r2 == 0) goto L_0x0088
            r2 = 1
            r7.d = r2
            r7.a()
            r6.x()
            r6.k(r1, r0)
            goto L_0x0088
        L_0x0063:
            ocd r7 = r6.o1
            d r2 = r6.p1
            r7.getClass()
            sbc r3 = new sbc
            r4 = 17
            r3.<init>(r7, r4, r2)
            java.util.concurrent.ExecutorService r7 = r7.a
            r7.execute(r3)
            cc9 r7 = r6.C1
            boolean r2 = r7.b
            if (r2 == 0) goto L_0x0088
            r2 = 0
            r7.d = r2
            r7.a()
            r6.x()
            r6.k(r1, r0)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx0.D(boolean):void");
    }

    public final void E(boolean z) {
        if (i()) {
            if (!z) {
                if (!this.r1.c && this.r1.a() && this.r1.c) {
                    ocd ocd = this.o1;
                    ocd.getClass();
                    ocd.a.execute(new mcd(ocd, 0));
                } else if (zla.A().g) {
                    ocd ocd2 = this.o1;
                    ocd2.getClass();
                    ocd2.a.execute(new mcd(ocd2, 0));
                }
            }
            qb1 qb1 = this.P1;
            if (z) {
                qb1.getClass();
            } else if (qb1.f.c) {
                if (!qb1.d(new zn1(0, 1, ac9.class, qb1.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                    return;
                }
            } else {
                return;
            }
            ocd ocd3 = this.o1;
            ocd3.getClass();
            ocd3.a.execute(new lcd(ocd3, z, 0));
            cc9 cc9 = this.C1;
            boolean z2 = !z;
            if (cc9.e != z2) {
                cc9.e = z2;
                cc9.a();
            }
            x();
        }
    }

    public final void F(rk9 rk9) {
        ocd ocd = this.o1;
        if (ocd != null) {
            boolean z = rk9.c;
            boolean z2 = this.e1;
            boolean z3 = rk9.d;
            boolean z4 = rk9.b;
            if (z2) {
                z |= z3;
                z4 |= z3;
                z3 = false;
            }
            boolean z5 = z4;
            boolean z6 = z;
            this.b = rk9;
            this.Z0.log("OKRTCCall", "new debug params " + rk9);
            boolean z7 = this.e1;
            String str = rk9.f;
            s2.execute(new ww0(this, rk9, ocd, z6, !z7 && z3 && str != null, str));
            kp0 kp0 = this.D1;
            kp0.a = rk9.a;
            kp0.b = z5;
            this.Z.i(new qfd(kp0));
        }
    }

    public final void G(boolean z) {
        if (i()) {
            v("rtc.video.switch");
            m(z);
            x();
        }
    }

    public final void H(ge1 ge1) {
        this.t1.f(new pja(ge1, new dr9(14), new dr9(14), new dr9(14), new dr9(14), new dr9(14), new dr9(14)), u2d.a);
    }

    public final void a(fx0 fx0) {
        int i = gxf.a[fx0.ordinal()];
        k(i != 1 ? i != 2 ? i != 3 ? i != 4 ? g41.T0 : g41.S0 : g41.R0 : g41.Q0 : g41.P0, (Object) null);
    }

    public final void b(jl7 jl7) {
        this.Z0.log("OKRTCCall", "onLocalMediaStreamChanged, " + d59.c(jl7));
        this.w0.post(new lw0(this, 2));
    }

    public final void c(sl1 sl1) {
        xwb xwb = this.Z0;
        xwb.log("OKRTCCall", "maybeSetTopologyState, " + sl1 + ", state=" + sl1.B(1));
        if (!this.g1) {
            xwb.log("OKRTCCall", "cant set " + sl1 + " to active state, conversation is not ready yet");
            return;
        }
        if (!this.F0) {
            if (!this.w1) {
                xwb.log("OKRTCCall", "cant set " + sl1 + " to active state, conversation is not started yet");
                return;
            } else if (!this.E1) {
                xwb.log("OKRTCCall", "cant set " + sl1 + " to active state, user is not accepted call yet");
                return;
            }
        }
        sl1.Q(this.P0);
        d59.e();
        if (true != sl1.E0) {
            sl1.E0 = true;
            sl1.F();
        }
        d59.e();
        if (1 != sl1.D0) {
            sl1.D0 = 1;
            sl1.G();
        }
        this.C1.a();
    }

    public final void d(fe6 fe6) {
        this.Z0.log("OKRTCCall", "hangup, " + d59.c(fe6) + ", unknown");
        d59.e();
        u(tqd.callHangup, fe6.toString());
        if (this.Z == null) {
            p(fe6, "hangup." + fe6 + ".unknown");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", (Object) fe6.toString());
            mfd mfd = this.Z;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("command", (Object) "hangup");
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                mfd.p = false;
                d59.e();
                pzb pzb = new pzb(14, mfd);
                mfd.c.postDelayed(pzb, 8000);
                mfd.d(new x66(jSONObject2), true, new wu0(mfd, pzb), (lfd) null);
                this.d1 = false;
                p(fe6, "hangup." + fe6 + ".unknown");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [hh4, java.lang.Object] */
    public final void e(ane ane, boolean z) {
        sl1 sl1;
        py7 py7;
        xp0 xp0;
        py7 py72;
        xp0 xp02;
        ane ane2 = ane;
        ane y = this.x1.y();
        this.i2.a(this.x1);
        sl1 sl12 = this.y1;
        if (sl12 != null) {
            sl12.L();
            this.y1 = null;
        }
        if (this.x1.H(ane2)) {
            this.x1.L();
        } else {
            this.y1 = this.x1;
        }
        ane ane3 = ane.b;
        ane ane4 = ane.c;
        boolean z2 = true;
        if (ane2 == ane3) {
            ? obj = new Object();
            obj.e = this.x0;
            obj.h = this.t1;
            obj.g = this.C1;
            obj.i = this.Z;
            obj.s = this.X;
            obj.l = this.Y0;
            xwb xwb = this.Z0;
            obj.k = xwb;
            obj.m = this.g2;
            fe1 fe1 = this.y0;
            obj.j = fe1;
            obj.a = this.o1;
            obj.d = s2;
            obj.f = this.B0;
            obj.c = this.m1;
            obj.b = this.p1;
            obj.n = this.F1;
            obj.o = this.H1;
            obj.p = this.I1;
            obj.q = this.a2;
            obj.t = this.J1;
            mn mnVar = fe1.w;
            if (mnVar == null || (xp02 = (xp0) mnVar.b) == null || !xp02.a) {
                py72 = null;
            } else {
                if (this.j2 == null) {
                    this.j2 = new qqd(this.V1, xwb, fe1.A.a != null);
                }
                py72 = new py7(this.j2, (my7) ((xp0) this.y0.w.b).b, this.Y0, this.J1, this.Z0, this.H0);
            }
            obj.r = py72;
            if (obj.a == null || obj.e == null || obj.h == null || obj.g == null || obj.i == null || obj.j == null || obj.k == null || obj.l == null || obj.f == null || obj.c == null || obj.b == null || obj.o == null || obj.q == null || obj.t == null) {
                throw new IllegalStateException();
            }
            sl1 = new ih4(obj);
        } else if (ane2 == ane4) {
            hzc hzc = new hzc();
            hzc.e = this.x0;
            hzc.h = this.t1;
            hzc.g = this.C1;
            hzc.i = this.Z;
            hzc.j.add(new ehc(this.Z0));
            hzc.k.add(this.X);
            hzc.k.add(new jhc(this.Z0));
            hzc.p = this.Y0;
            hzc.q = this.g2;
            hzc.o = this.Z0;
            hzc.m = this.y0;
            hzc.n = this.i1;
            hzc.a = this.o1;
            hzc.d = s2;
            hzc.f = this.B0;
            hzc.c = this.m1;
            hzc.b = this.p1;
            hzc.r = this.s1;
            hzc.s = z;
            hzc.t = this.H1;
            hzc.u = this.I1;
            hzc.v = this.a2;
            hzc.x = this.f2;
            hzc.l.add(this.Y);
            fe1 fe12 = this.y0;
            mn mnVar2 = fe12.w;
            if (mnVar2 == null || (xp0 = (xp0) mnVar2.c) == null || !xp0.a) {
                py7 = null;
            } else {
                if (this.j2 == null) {
                    this.j2 = new qqd(this.V1, this.Z0, fe12.A.a != null);
                }
                py7 = new py7(this.j2, (my7) ((xp0) this.y0.w.c).b, this.Y0, this.J1, this.Z0, this.H0);
            }
            hzc.w = py7;
            hzc.y = this.y0.z;
            eje eje = this.J1;
            hzc.z = eje;
            hzc.A = this.K1;
            if (hzc.e == null || hzc.h == null || hzc.g == null || hzc.i == null || hzc.m == null || hzc.o == null || hzc.p == null || hzc.f == null || hzc.c == null || hzc.b == null || hzc.t == null || hzc.v == null || eje == null) {
                throw new IllegalStateException();
            }
            sl1 = new izc(hzc);
        } else {
            throw new IllegalArgumentException("Unsupported topology: " + ane2);
        }
        sl1.Q(this.P0);
        d59.e();
        sl1.C0 = this;
        this.x1 = sl1;
        td4 td4 = this.i2;
        py7 py73 = sl1.B0;
        td4.a.log("MediaAdaptation", "Set new condition provider source. Is null = " + (py73 == null));
        mh9 mh9 = td4.b;
        if (mh9 != null) {
            mh9.a(td4.e);
        }
        td4.b = py73;
        if (py73 == null) {
            jy7 jy7 = new jy7(1, (ema) null, true);
            td4.a.log("MediaAdaptation", "Since there are no new provider, trigger state change to " + jy7);
            td4.e.q(jy7);
        } else {
            py73.d(td4.e);
        }
        this.i2.b(this.x1);
        boolean z3 = y == ane3;
        if (ane2 != ane4) {
            z2 = false;
        }
        if (z3 && z2) {
            k(g41.V0, (Object) null);
        }
        ane y2 = this.x1.y();
        Iterator it = this.v1.iterator();
        while (it.hasNext()) {
            ((bne) it.next()).onTopologyUpdated(y, y2);
        }
    }

    public final void f(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(fx0.valueOf(string));
            } catch (IllegalArgumentException unused) {
                this.Z0.log("OKRTCCall", wn6.i("got unknown conversation option '", string, "'"));
            }
        }
        EnumSet enumSet = this.D0;
        ArrayList arrayList2 = new ArrayList(enumSet);
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.removeAll(enumSet);
        enumSet.clear();
        enumSet.addAll(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a((fx0) it.next());
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            a((fx0) it2.next());
        }
    }

    public final void g(JSONObject jSONObject) {
        boolean z = true;
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        km4 km4 = this.Y1;
        ((b0d) km4.c).x(jSONObject);
        ((b0d) km4.c).y(jSONObject);
        if (optJSONArray != null) {
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    break;
                } else if ("ADD_PARTICIPANT".equalsIgnoreCase(optJSONArray.optString(i))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        z = false;
        StringBuilder sb = new StringBuilder("setFeatureAddParticipantEnabled, ");
        boolean z2 = d59.a;
        sb.append(z ? "yes" : "no");
        this.Z0.log("OKRTCCall", sb.toString());
        if (this.B1 != z) {
            this.B1 = z;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v3, types: [ge1, java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v37 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x06d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x06f7 A[Catch:{ JSONException -> 0x0700 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0711  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0734 A[Catch:{ JSONException -> 0x0759 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x076c  */
    /* JADX WARNING: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(org.json.JSONObject r43, boolean r44, boolean r45) {
        /*
            r42 = this;
            r1 = r42
            r2 = r43
            java.lang.String r3 = "RecordInfoParser"
            java.lang.String r4 = "Can't parse record info from parent"
            r42.g(r43)
            pe1 r0 = r1.t1
            ke1 r0 = r0.a
            boolean r5 = r1.A0
            g41 r6 = defpackage.g41.c
            g41 r7 = defpackage.g41.o
            u2d r15 = defpackage.u2d.a
            java.lang.String r12 = "topology"
            java.lang.String r11 = "CALLED"
            java.lang.String r10 = "hangup.in.connection.notification"
            java.lang.String r9 = "HUNGUP"
            java.lang.String r8 = "accepted.on.other.device.con"
            java.lang.String r13 = "state"
            java.lang.String r14 = "participants"
            r18 = r4
            java.lang.String r4 = "ACCEPTED"
            r19 = r3
            java.lang.String r3 = "OKRTCCall"
            r20 = r0
            if (r5 == 0) goto L_0x0166
            if (r45 != 0) goto L_0x0166
            java.lang.String r5 = "connection already handled"
            xwb r0 = r1.Z0
            r0.log(r3, r5)
            pe1 r0 = r1.t1
            ke1 r0 = r0.a
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            org.json.JSONArray r14 = r2.getJSONArray(r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r22 = r3
            r21 = r12
            r12 = 0
            r18 = 0
        L_0x0053:
            int r3 = r14.length()
            if (r12 >= r3) goto L_0x00ca
            org.json.JSONObject r3 = r14.getJSONObject(r12)
            r44 = r14
            ge1 r14 = defpackage.x87.K(r3)
            r19 = r12
            java.lang.String r12 = r3.getString(r13)
            r23 = r13
            ge1 r13 = r0.a
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x009a
            boolean r3 = r0.b()
            if (r3 == 0) goto L_0x007c
            r18 = 1
            goto L_0x00c3
        L_0x007c:
            boolean r3 = r4.equals(r12)
            if (r3 == 0) goto L_0x008b
            r3 = 0
            r1.k(r7, r3)
            r1.p(r3, r8)
            goto L_0x0165
        L_0x008b:
            r3 = 0
            boolean r12 = r9.equals(r12)
            if (r12 == 0) goto L_0x00c3
            r1.k(r6, r3)
            r1.p(r3, r10)
            goto L_0x0165
        L_0x009a:
            boolean r13 = r4.equals(r12)
            if (r13 == 0) goto L_0x00af
            r5.add(r14)
            zfd r12 = r1.X1
            stf r12 = r12.f
            pja r3 = r12.e(r14, r3, r15)
            r2.add(r3)
            goto L_0x00c3
        L_0x00af:
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c3
            r5.add(r14)
            zfd r12 = r1.X1
            stf r12 = r12.f
            pja r3 = r12.j(r14, r3, r15)
            r2.add(r3)
        L_0x00c3:
            int r12 = r19 + 1
            r14 = r44
            r13 = r23
            goto L_0x0053
        L_0x00ca:
            pe1 r0 = r1.t1
            r3 = 0
            r0.g(r3, r2)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00fe
            if (r18 != 0) goto L_0x00fe
            java.lang.String r0 = "Conversation has no participants"
            xwb r2 = r1.Z0
            r3 = r22
            r2.log(r3, r0)
            qe4 r0 = r1.o2
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Error r2 = new ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Error
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Conversation without participants and current user"
            r3.<init>(r4)
            r2.<init>(r3)
            r0.J(r2)
            g41 r0 = defpackage.g41.A0
            r2 = 0
            r1.k(r0, r2)
            java.lang.String r0 = "conversation.without.participants"
            r1.p(r2, r0)
            goto L_0x0165
        L_0x00fe:
            r3 = r22
            pe1 r0 = r1.t1
            w2d r2 = r0.k
            java.util.Map r0 = r0.d(r2)
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0115:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x012b
            java.lang.Object r4 = r0.next()
            ge1 r4 = (defpackage.ge1) r4
            boolean r6 = r5.contains(r4)
            if (r6 != 0) goto L_0x0115
            r2.add(r4)
            goto L_0x0115
        L_0x012b:
            pe1 r0 = r1.t1
            r4 = 0
            r0.m(r4, r2)
            dr9 r0 = r1.U1
            cc9 r2 = r1.C1
            r0.getClass()
            yfd r0 = defpackage.dr9.h(r2)
            jg8 r2 = r1.T1
            r2.c(r0)
            java.lang.String r0 = "handleNewTopology"
            xwb r2 = r1.Z0
            r2.log(r3, r0)
            r2 = r43
            r0 = r21
            java.lang.String r0 = r2.getString(r0)
            ane r0 = defpackage.ane.a(r0)
            sl1 r2 = r1.x1
            boolean r2 = r2.H(r0)
            if (r2 != 0) goto L_0x0160
            r2 = 0
            r1.e(r0, r2)
        L_0x0160:
            sl1 r0 = r1.x1
            r1.c(r0)
        L_0x0165:
            return
        L_0x0166:
            r0 = r12
            r23 = r13
            r5 = 1
            r1.A0 = r5
            java.lang.String r5 = "connected"
            xwb r12 = r1.Z0
            r12.log(r3, r5)
            java.lang.String r5 = "id"
            java.lang.String r5 = r2.getString(r5)
            ct3 r12 = r1.H0
            boolean r13 = r12 instanceof defpackage.dt3
            if (r13 == 0) goto L_0x0183
            dt3 r12 = (defpackage.dt3) r12
            r12.a = r5
        L_0x0183:
            java.lang.String r5 = "joinLink"
            boolean r12 = r2.has(r5)
            if (r12 == 0) goto L_0x0191
            java.lang.String r5 = r2.getString(r5)
            r1.J0 = r5
        L_0x0191:
            if (r44 == 0) goto L_0x0197
            r5 = 1
            r1.V0 = r5
            goto L_0x01a2
        L_0x0197:
            boolean r5 = r1.V0
            if (r5 == 0) goto L_0x01a2
            java.lang.String r5 = "onConnected isConcurrent from api"
            xwb r12 = r1.Z0
            r12.log(r3, r5)
        L_0x01a2:
            org.json.JSONArray r5 = r2.getJSONArray(r14)
            pe1 r12 = r1.t1
            ke1 r14 = r12.a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r21 = r0
            r22 = r3
            r24 = r11
            r44 = r13
            r0 = 0
            r2 = 0
            r3 = 0
            r11 = 0
        L_0x01c0:
            int r13 = r5.length()
            if (r3 >= r13) goto L_0x0412
            org.json.JSONObject r13 = r5.getJSONObject(r3)
            r25 = r5
            r5 = r23
            r23 = r0
            java.lang.String r0 = r13.getString(r5)
            r34 = r5
            ge1 r5 = defpackage.x87.K(r13)
            r35 = r2
            if (r3 != 0) goto L_0x01e6
            fe1 r2 = r1.y0
            de1 r2 = r2.B
            boolean r2 = r2.j
            if (r2 != 0) goto L_0x01ee
        L_0x01e6:
            ge1 r2 = r14.a
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x038d
        L_0x01ee:
            fe1 r2 = r1.y0
            de1 r2 = r2.B
            boolean r2 = r2.j
            if (r2 == 0) goto L_0x0251
            y41 r2 = r14.p
            if (r2 != 0) goto L_0x0200
            y41 r2 = defpackage.x87.m(r13)
            r14.p = r2
        L_0x0200:
            ge1 r2 = r14.a
            if (r2 != 0) goto L_0x0251
            r14.a = r5
            dr9 r2 = new dr9
            r11 = 14
            r2.<init>(r11)
            dr9 r11 = new dr9
            r36 = r3
            r3 = 14
            r11.<init>(r3)
            dr9 r3 = new dr9
            r37 = r15
            r15 = 14
            r3.<init>(r15)
            dr9 r15 = new dr9
            r38 = r10
            r10 = 14
            r15.<init>(r10)
            dr9 r10 = new dr9
            r39 = r6
            r6 = 14
            r10.<init>(r6)
            dr9 r6 = new dr9
            r40 = r9
            r9 = 14
            r6.<init>(r9)
            pja r9 = new pja
            r26 = r9
            r27 = r5
            r28 = r2
            r29 = r11
            r30 = r3
            r31 = r15
            r32 = r10
            r33 = r6
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r3 = r9
            goto L_0x025c
        L_0x0251:
            r36 = r3
            r39 = r6
            r40 = r9
            r38 = r10
            r37 = r15
            r3 = 0
        L_0x025c:
            if (r3 == 0) goto L_0x0261
            r12.add(r3)
        L_0x0261:
            java.lang.String r2 = "restricted"
            r3 = 0
            boolean r2 = r13.optBoolean(r2, r3)
            boolean r3 = r14.b()
            if (r3 != 0) goto L_0x029c
            boolean r3 = r4.equals(r0)
            if (r3 == 0) goto L_0x0283
            r3 = 0
            r1.k(r7, r3)
            r1.p(r3, r8)
        L_0x027b:
            r7 = r3
            r14 = r7
            r2 = r21
            r15 = r37
            goto L_0x0480
        L_0x0283:
            r5 = r40
            r3 = 0
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0297
            r6 = r39
            r1.k(r6, r3)
            r0 = r38
            r1.p(r3, r0)
            goto L_0x027b
        L_0x0297:
            r0 = r38
            r6 = r39
            goto L_0x02a3
        L_0x029c:
            r0 = r38
            r6 = r39
            r5 = r40
            r3 = 0
        L_0x02a3:
            java.lang.String r9 = "permissions"
            org.json.JSONArray r9 = r13.optJSONArray(r9)
            zfd r10 = r1.X1
            b79 r10 = r10.a
            r15 = r37
            java.util.List r10 = r10.h(r13, r15)
            r14.q = r10
            if (r9 == 0) goto L_0x02d3
            r10 = 0
        L_0x02b8:
            int r11 = r9.length()
            if (r10 >= r11) goto L_0x02d3
            java.lang.String r11 = r9.optString(r10)
            java.lang.String r3 = "MUTE_PARTICIPANTS"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x02ce
            r3 = 1
            r1.a = r3
            goto L_0x02d4
        L_0x02ce:
            r3 = 1
            int r10 = r10 + 1
            r3 = 0
            goto L_0x02b8
        L_0x02d3:
            r3 = 1
        L_0x02d4:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r9 = "offerTo"
            org.json.JSONArray r9 = r13.optJSONArray(r9)
            java.lang.String r10 = "offerToTypes"
            org.json.JSONArray r10 = r13.optJSONArray(r10)
            java.lang.String r3 = "offerToDeviceIdxs"
            org.json.JSONArray r3 = r13.optJSONArray(r3)
            r38 = r0
            r23 = r2
            if (r9 == 0) goto L_0x0346
            r0 = 0
        L_0x02f2:
            int r2 = r9.length()
            if (r0 >= r2) goto L_0x0346
            if (r10 == 0) goto L_0x030d
            int r2 = r10.length()
            if (r0 >= r2) goto L_0x030d
            java.lang.String r2 = r10.optString(r0)
            r40 = r5
            java.lang.String r5 = "GROUP"
            boolean r2 = r5.equals(r2)
            goto L_0x0310
        L_0x030d:
            r40 = r5
            r2 = 0
        L_0x0310:
            if (r3 == 0) goto L_0x031f
            int r5 = r3.length()
            if (r0 >= r5) goto L_0x031f
            int r5 = r3.optInt(r0)
            r26 = r3
            goto L_0x0322
        L_0x031f:
            r26 = r3
            r5 = 0
        L_0x0322:
            ge1 r3 = new ge1
            java.lang.String r27 = r9.optString(r0)
            r39 = r6
            r28 = r7
            long r6 = java.lang.Long.parseLong(r27)
            if (r2 == 0) goto L_0x0334
            r2 = 2
            goto L_0x0335
        L_0x0334:
            r2 = 1
        L_0x0335:
            r3.<init>(r2, r5, r6)
            r11.add(r3)
            int r0 = r0 + 1
            r3 = r26
            r7 = r28
            r6 = r39
            r5 = r40
            goto L_0x02f2
        L_0x0346:
            r40 = r5
            r39 = r6
            r28 = r7
            java.util.ArrayList r0 = defpackage.x87.B(r13)
            java.util.ArrayList r2 = r14.d
            r2.clear()
            r2.addAll(r0)
            g41 r0 = defpackage.g41.K0
            r1.k(r0, r14)
            qb1 r0 = r1.P1
            r2 = 2
            java.util.Map r2 = r0.g(r15, r2)
            java.lang.String r10 = "handleConversationParticipants"
            r3 = 1
            r6 = r8
            r8 = r0
            r7 = r40
            r9 = r13
            r26 = r38
            r5 = r11
            r0 = r24
            r11 = r2
            r2 = r21
            r21 = r6
            r6 = r12
            r12 = r3
            r3 = r44
            r41 = r13
            r16 = r34
            r13 = r15
            r17 = r14
            r7 = 0
            r14 = r15
            r8.n(r9, r10, r11, r12, r13, r14)
            r8 = r0
            r0 = r5
            r11 = r23
            r9 = r41
            goto L_0x03e1
        L_0x038d:
            r36 = r3
            r39 = r6
            r28 = r7
            r40 = r9
            r26 = r10
            r6 = r12
            r41 = r13
            r17 = r14
            r2 = r21
            r16 = r34
            r7 = 0
            r3 = r44
            r21 = r8
            r8 = r24
            boolean r9 = r4.equals(r0)
            if (r9 == 0) goto L_0x03bb
            zfd r0 = r1.X1
            stf r0 = r0.f
            r9 = r41
            pja r0 = r0.e(r5, r9, r15)
            r6.add(r0)
            goto L_0x03df
        L_0x03bb:
            r9 = r41
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x03dc
            zfd r0 = r1.X1
            stf r0 = r0.f
            pja r0 = r0.j(r5, r9, r15)
            r6.add(r0)
            int r0 = r5.b
            r5 = 2
            boolean r0 = hr1.c(r0, r5)
            if (r0 == 0) goto L_0x03df
            r0 = r23
            r35 = 1
            goto L_0x03e1
        L_0x03dc:
            r3.add(r5)
        L_0x03df:
            r0 = r23
        L_0x03e1:
            zfd r5 = r1.X1
            lv1 r5 = r5.e
            ie1 r5 = r5.D(r9)
            if (r5 == 0) goto L_0x03f4
            ob1 r9 = r1.a2
            sja r9 = r9.n
            ge1 r10 = r5.b
            r9.onStateChanged(r10, r5)
        L_0x03f4:
            int r5 = r36 + 1
            r44 = r3
            r3 = r5
            r12 = r6
            r24 = r8
            r23 = r16
            r14 = r17
            r8 = r21
            r5 = r25
            r10 = r26
            r7 = r28
            r6 = r39
            r9 = r40
            r21 = r2
            r2 = r35
            goto L_0x01c0
        L_0x0412:
            r3 = r44
            r23 = r0
            r35 = r2
            r6 = r12
            r2 = r21
            r7 = 0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r4 = r6.iterator()
        L_0x0425:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0437
            java.lang.Object r5 = r4.next()
            pja r5 = (defpackage.pja) r5
            ge1 r5 = r5.a
            r0.add(r5)
            goto L_0x0425
        L_0x0437:
            pe1 r4 = r1.t1
            w2d r5 = r4.k
            java.util.Map r4 = r4.d(r5)
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0447:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x045d
            java.lang.Object r5 = r4.next()
            ge1 r5 = (defpackage.ge1) r5
            boolean r8 = r0.contains(r5)
            if (r8 != 0) goto L_0x0447
            r3.add(r5)
            goto L_0x0447
        L_0x045d:
            pe1 r0 = r1.t1
            r0.m(r7, r3)
            pe1 r0 = r1.t1
            r0.g(r7, r6)
            dr9 r0 = r1.U1
            cc9 r3 = r1.C1
            r0.getClass()
            yfd r0 = defpackage.dr9.h(r3)
            jg8 r3 = r1.T1
            r3.c(r0)
            iyf r14 = new iyf
            r0 = r23
            r3 = r35
            r14.<init>(r0, r11, r3)
        L_0x0480:
            if (r14 != 0) goto L_0x0483
            return
        L_0x0483:
            r3 = r43
            java.lang.String r0 = r3.optString(r2)
            ane r0 = defpackage.ane.a(r0)
            ane r2 = defpackage.ane.a
            ane r4 = defpackage.ane.b
            if (r0 != r2) goto L_0x04d9
            xwb r2 = r1.Z0
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "invalid.topology.identity."
            r6.<init>(r8)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            java.lang.String r6 = "conn.notify.topology"
            r8 = r22
            r2.logException(r8, r6, r5)
            pe1 r2 = r1.t1
            int r2 = r2.r()
            r5 = 1
            if (r2 <= r5) goto L_0x04bb
            ane r2 = defpackage.ane.c
            goto L_0x04bc
        L_0x04bb:
            r2 = r4
        L_0x04bc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unknown topology specified ("
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ") , use "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            xwb r5 = r1.Z0
            r5.log(r8, r0)
            r0 = r2
            goto L_0x04db
        L_0x04d9:
            r8 = r22
        L_0x04db:
            boolean r2 = r1.V0
            if (r2 == 0) goto L_0x04f3
            java.lang.String r2 = "   isConcurrent"
            xwb r5 = r1.Z0
            r5.log(r8, r2)
            boolean r2 = r1.F0
            if (r2 == 0) goto L_0x04ef
            r2 = 0
            r1.e(r0, r2)
            goto L_0x04f0
        L_0x04ef:
            r2 = 0
        L_0x04f0:
            r1.F0 = r2
            goto L_0x04f4
        L_0x04f3:
            r2 = 0
        L_0x04f4:
            sl1 r5 = r1.x1
            boolean r5 = r5.H(r0)
            if (r5 == 0) goto L_0x04fe
            if (r45 == 0) goto L_0x0501
        L_0x04fe:
            r1.e(r0, r2)
        L_0x0501:
            java.util.List r0 = r14.b
            if (r0 == 0) goto L_0x0535
            sl1 r2 = r1.x1
            boolean r2 = r2.H(r4)
            if (r2 == 0) goto L_0x0535
            java.util.Iterator r0 = r0.iterator()
        L_0x0511:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0535
            java.lang.Object r2 = r0.next()
            ge1 r2 = (defpackage.ge1) r2
            pe1 r4 = r1.t1     // Catch:{ NumberFormatException -> 0x0524 }
            ke1 r2 = r4.j(r2)     // Catch:{ NumberFormatException -> 0x0524 }
            goto L_0x052c
        L_0x0524:
            java.lang.String r2 = "Cant get participant id from responders"
            xwb r4 = r1.Z0
            r4.log(r8, r2)
            r2 = r7
        L_0x052c:
            if (r2 == 0) goto L_0x0511
            sl1 r4 = r1.x1
            r5 = 0
            r4.u(r2, r5)
            goto L_0x0511
        L_0x0535:
            java.lang.String r0 = "options"
            org.json.JSONArray r0 = r3.optJSONArray(r0)
            if (r0 == 0) goto L_0x0540
            r1.f(r0)
        L_0x0540:
            boolean r0 = r1.F0
            if (r0 != 0) goto L_0x054f
            boolean r0 = r1.G0
            if (r0 == 0) goto L_0x0549
            goto L_0x054f
        L_0x0549:
            sl1 r0 = r1.x1
            r1.c(r0)
            goto L_0x057c
        L_0x054f:
            boolean r0 = r14.a
            r1.O1 = r0
            boolean r0 = r14.a
            if (r0 == 0) goto L_0x0560
            ob1 r0 = r1.a2
            hef r0 = r0.d
            r2 = 1
            r0.onMeInWaitingRoomChanged(r2)
            goto L_0x057c
        L_0x0560:
            ob1 r0 = r1.a2
            hef r0 = r0.d
            r2 = 0
            r0.onMeInWaitingRoomChanged(r2)
            sl1 r0 = r1.x1
            r1.c(r0)
            fx0 r0 = defpackage.fx0.b
            java.util.EnumSet r2 = r1.D0
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x057c
            g41 r0 = defpackage.g41.T0
            r1.k(r0, r7)
        L_0x057c:
            boolean r0 = r1.V0
            if (r0 == 0) goto L_0x0599
            boolean r0 = r14.a
            if (r0 != 0) goto L_0x0599
            tqd r0 = defpackage.tqd.callAcceptConcurrent
            r1.u(r0, r7)
            boolean r0 = r20.b()
            cc9 r2 = r1.C1
            boolean r2 = r2.f
            r1.B(r2)
            if (r0 == 0) goto L_0x0599
            r42.w()
        L_0x0599:
            pf8 r0 = r1.V1
            rxf r2 = r1.k1
            java.lang.Object r4 = r0.k
            android.os.Handler r4 = (android.os.Handler) r4
            android.os.Looper r5 = r4.getLooper()
            java.lang.Thread r5 = r5.getThread()
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            boolean r5 = hhd.f(r5, r6)
            if (r5 == 0) goto L_0x05bb
            java.lang.Object r0 = r0.f
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            r0.remove(r2)
            goto L_0x05c4
        L_0x05bb:
            uqd r5 = new uqd
            r6 = 1
            r5.<init>(r0, r2, r6)
            r4.post(r5)
        L_0x05c4:
            pf8 r0 = r1.V1
            rxf r2 = r1.k1
            r0.m(r2)
            pf8 r0 = r1.V1
            ld3 r2 = r1.l1
            java.lang.Object r0 = r0.d
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.remove(r2)
            pf8 r0 = r1.V1
            ld3 r2 = r1.l1
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 5
            r0.c(r2, r5, r4)
            pf8 r0 = r1.V1
            sh5 r2 = r1.g2
            r8 = 1
            r0.c(r2, r8, r4)
            pf8 r0 = r1.V1
            java.lang.Object r2 = r0.k
            android.os.Handler r2 = (android.os.Handler) r2
            java.lang.Object r10 = r0.m
            xqd r10 = (defpackage.xqd) r10
            r2.removeCallbacks(r10)
            r11 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r10, r11)
            java.lang.Object r2 = r0.l
            c97 r2 = (c97) r2
            if (r2 == 0) goto L_0x0605
            bj4.a(r2)
        L_0x0605:
            r0.l = r7
            ku9 r2 = ms9.l(r8, r4)
            qmc r8 = de.a()
            nu9 r2 = r2.n(r8)
            mb1 r8 = new mb1
            r9 = 24
            r8.<init>(r9, r0)
            au9 r9 = new au9
            r10 = 1
            r9.<init>(r2, r8, r10)
            qmc r2 = cnc.a()
            nu9 r2 = r9.n(r2)
            mb1 r8 = new mb1
            java.lang.Object r9 = r0.b
            d4b r9 = (d4b) r9
            r10 = 25
            r8.<init>(r10, r9)
            au9 r9 = new au9
            r10 = 3
            r9.<init>(r2, r8, r10)
            qmc r2 = de.a()
            nu9 r2 = r9.n(r2)
            rbf r8 = new rbf
            r8.<init>(r0)
            c97 r2 = r2.p(r8)
            r0.l = r2
            ld3 r2 = new ld3
            java.lang.Object r8 = r0.h
            xwb r8 = (defpackage.xwb) r8
            r9 = 0
            r2.<init>(r9, r8)
            r0.c(r2, r5, r4)
            boolean r0 = r14.c
            if (r0 == 0) goto L_0x0662
            g41 r0 = defpackage.g41.z0
            r1.k(r0, r7)
        L_0x0662:
            java.lang.String r0 = "tamtamMultichatId"
            long r4 = r3.optLong(r0)
            long r4 = -r4
            r1.j1 = r4
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x067a
            g41 r0 = defpackage.g41.E0
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r1.k(r0, r2)
        L_0x067a:
            wf1 r2 = r1.d2
            java.lang.String r0 = "recordInfo"
            v4b r4 = r2.a
            r4.getClass()
            boolean r5 = r3.has(r0)     // Catch:{ JSONException -> 0x06a5 }
            if (r5 == 0) goto L_0x06a9
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x06a5 }
            bgd r14 = defpackage.v4b.i(r0)     // Catch:{ JSONException -> 0x0692 }
            goto L_0x06a0
        L_0x0692:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = "Can't parse record info"
            java.lang.Object r6 = r4.b     // Catch:{ JSONException -> 0x06a5 }
            xwb r6 = (defpackage.xwb) r6     // Catch:{ JSONException -> 0x06a5 }
            r8 = r19
            r6.logException(r8, r0, r5)     // Catch:{ JSONException -> 0x06a3 }
            goto L_0x06a9
        L_0x06a0:
            r5 = r18
            goto L_0x06b5
        L_0x06a3:
            r0 = move-exception
            goto L_0x06ab
        L_0x06a5:
            r0 = move-exception
            r8 = r19
            goto L_0x06ab
        L_0x06a9:
            r14 = r7
            goto L_0x06a0
        L_0x06ab:
            java.lang.Object r4 = r4.b
            xwb r4 = (defpackage.xwb) r4
            r5 = r18
            r4.logException(r8, r5, r0)
            r14 = r7
        L_0x06b5:
            if (r14 != 0) goto L_0x06b8
            goto L_0x06c8
        L_0x06b8:
            ob1 r0 = r2.b
            k5c r0 = r0.i
            tf1 r2 = new tf1
            rf1 r4 = urd.M(r14)
            r2.<init>(r15, r4)
            r0.onRecordStarted(r2)
        L_0x06c8:
            java.lang.String r0 = "pinnedParticipantId"
            boolean r2 = r3.isNull(r0)
            java.lang.String r0 = r3.optString(r0, r7)
            if (r2 != 0) goto L_0x06dd
            if (r0 == 0) goto L_0x06dd
            ge1 r0 = defpackage.ge1.a(r0)
            r1.M1 = r0
            goto L_0x06df
        L_0x06dd:
            r1.M1 = r7
        L_0x06df:
            km4 r0 = r1.Y1
            java.lang.Object r0 = r0.o
            b0d r0 = (b0d) r0
            r0.u(r3)
            kz0 r2 = r1.e2
            java.lang.String r0 = "asrInfo"
            otf r4 = r2.a
            r4.getClass()
            boolean r6 = r3.has(r0)     // Catch:{ JSONException -> 0x0700 }
            if (r6 == 0) goto L_0x0702
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0700 }
            fz0 r14 = otf.M(r0)     // Catch:{ JSONException -> 0x0700 }
            goto L_0x070e
        L_0x0700:
            r0 = move-exception
            goto L_0x0704
        L_0x0702:
            r14 = r7
            goto L_0x070e
        L_0x0704:
            java.lang.Object r4 = r4.a
            xwb r4 = (defpackage.xwb) r4
            java.lang.String r6 = "AsrParser"
            r4.logException(r6, r5, r0)
            goto L_0x0702
        L_0x070e:
            if (r14 != 0) goto L_0x0711
            goto L_0x071d
        L_0x0711:
            ob1 r0 = r2.b
            rs r0 = r0.m
            gz0 r2 = new gz0
            r2.<init>(r15, r14)
            r0.onAsrRecordStarted(r2)
        L_0x071d:
            km4 r0 = r1.Y1
            java.lang.Object r0 = r0.w0
            r1 = r0
            s5c r1 = (s5c) r1
            java.lang.Object r0 = r1.c
            r2 = r0
            f2b r2 = (defpackage.f2b) r2
            r2.getClass()
            java.lang.String r0 = "urlSharingInfo"
            boolean r4 = r3.has(r0)     // Catch:{ JSONException -> 0x0759 }
            if (r4 == 0) goto L_0x075b
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0759 }
            java.lang.String r3 = "initiatorId"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ JSONException -> 0x0759 }
            ge1 r3 = defpackage.ge1.a(r3)     // Catch:{ JSONException -> 0x0759 }
            java.lang.String r4 = "sharedUrl"
            java.lang.String r4 = r1g.x(r0, r4)     // Catch:{ JSONException -> 0x0759 }
            java.lang.Object r5 = r2.c     // Catch:{ JSONException -> 0x0759 }
            jk9 r5 = (jk9) r5     // Catch:{ JSONException -> 0x0759 }
            r5.getClass()     // Catch:{ JSONException -> 0x0759 }
            w2d r0 = jk9.q(r0)     // Catch:{ JSONException -> 0x0759 }
            qec r14 = new qec     // Catch:{ JSONException -> 0x0759 }
            r14.<init>(r3, r4, r0)     // Catch:{ JSONException -> 0x0759 }
            goto L_0x0769
        L_0x0759:
            r0 = move-exception
            goto L_0x075d
        L_0x075b:
            r14 = r7
            goto L_0x0769
        L_0x075d:
            java.lang.Object r2 = r2.b
            xwb r2 = (defpackage.xwb) r2
            java.lang.String r3 = "UrlSharingParser"
            java.lang.String r4 = "Can't parse url sharing"
            r2.logException(r3, r4, r0)
            goto L_0x075b
        L_0x0769:
            if (r14 != 0) goto L_0x076c
            goto L_0x0787
        L_0x076c:
            java.lang.String r0 = r14.b
            if (r0 == 0) goto L_0x0778
            egd r2 = new egd
            ge1 r3 = r14.a
            r2.<init>(r3, r0)
            goto L_0x0779
        L_0x0778:
            r2 = r7
        L_0x0779:
            tl1 r0 = new tl1
            w2d r3 = r14.c
            r0.<init>(r3, r2)
            java.lang.Object r1 = r1.b
            kye r1 = (defpackage.kye) r1
            r1.onUrlSharingInfoUpdated(r0)
        L_0x0787:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx0.h(org.json.JSONObject, boolean, boolean):void");
    }

    public final boolean i() {
        if (!this.E0) {
            return true;
        }
        this.Z0.log("OKRTCCall", "Call is already destroyed, reason=" + this.z0);
        return false;
    }

    public final void j(ge1 ge1, Boolean bool, Boolean bool2, lfd lfd) {
        xwb xwb = this.Z0;
        xwb.log("OKRTCCall", "addParticipant, participant=" + ge1);
        if (i()) {
            ke1 j = this.t1.j(ge1);
            j8e j8e = this.W1.g;
            Long g = ((k2e) j8e.o).g();
            if (g != null) {
                long longValue = g.longValue();
                HashMap hashMap = new HashMap();
                otf otf = (otf) j8e.a;
                hashMap.put("vcid", ((axb) otf.a).conversationId);
                hashMap.put("stat_time_delta", String.valueOf(longValue));
                hashMap.put("network_type", d59.b((ConnectivityManager) j8e.b, (TelephonyManager) j8e.c));
                j8e.k(ge1, j, hashMap);
                ((axb) otf.a).log(axb.COLLECTOR_WEBRTC, "callAddParticipant", (Map) hashMap);
            }
            try {
                this.Z.d(x87.v(ge1, bool, bool2.booleanValue()), false, new uw0(this, ge1, lfd), lfd);
            } catch (JSONException e) {
                xwb.reportException("OKRTCCall", "add.participant", e);
            }
        }
    }

    public final void k(g41 g41, Object obj) {
        xwb xwb = this.Z0;
        xwb.log("OKRTCCall", "dispatch [ " + g41 + " ]");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Iterator it = this.Q0.iterator();
            while (it.hasNext()) {
                try {
                    ((dx0) it.next()).onEvent(this, g41, obj);
                } catch (Throwable th) {
                    xwb.logException("OKRTCCall", "Error on dispatch event " + g41, th);
                }
            }
            return;
        }
        this.w0.post(new g5((Object) this, (Object) g41, obj, 7));
    }

    public final void l(JSONObject jSONObject) {
        try {
            if (jSONObject.has("rooms")) {
                wjf wjf = (wjf) this.Y1.a;
                JSONObject jSONObject2 = jSONObject.getJSONObject("rooms");
                if (wjf.b) {
                    dgd C = ((ul7) wjf.o).C(jSONObject2);
                    if (C != null) {
                        ((oj1) wjf.X).e(C);
                    }
                }
            }
        } catch (JSONException e) {
            this.Z0.logException("OKRTCCall", "Can't parse rooms from connection", e);
        }
    }

    public final void m(boolean z) {
        if (i()) {
            if (z) {
                this.r1.a();
            }
            qb1 qb1 = this.P1;
            if (!z) {
                qb1.getClass();
            } else if (qb1.f.d) {
                if (!qb1.d(new zn1(0, 3, ac9.class, qb1.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                    return;
                }
            } else {
                return;
            }
            if (z && this.C1.g) {
                this.I1.getClass();
            }
            xwb xwb = this.Z0;
            xwb.log("OKRTCCall", "Update my settings with video enabled=" + z);
            cc9 cc9 = this.C1;
            if (cc9.f != z) {
                cc9.f = z;
                cc9.a();
            }
            k(g41.X, (Object) null);
        }
    }

    public final void n(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            return;
        }
        if (optJSONObject.opt("sdk") != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("sdk");
            if (optJSONObject2 != null && optJSONObject2.optString("type").equals("bad-net") && this.b1) {
                me0 me0 = this.a1;
                me0.getClass();
                if ("bad-net".equals(optJSONObject2.optString("type"))) {
                    me0.m = optJSONObject2.optBoolean("value");
                    me0.n = optJSONObject2.has("value");
                    me0.o = optJSONObject2.optDouble("rtt");
                    me0.p = optJSONObject2.optDouble("loss");
                    me0.a();
                    return;
                }
                return;
            }
            return;
        }
        this.w0.post(new g5((Object) this, (Object) x87.J(jSONObject), (Object) optJSONObject, 8));
    }

    public final void o(String str) {
        k(g41.c, (Object) null);
        mfd mfd = this.Z;
        if (mfd != null) {
            mfd.g();
        }
        p((fe6) null, "conversation_ended." + str);
    }

    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        this.w0.post(new lw0(this, connectionType != NetworkChangeDetector.ConnectionType.CONNECTION_NONE));
    }

    public final void p(fe6 fe6, String str) {
        ConversationEndReason conversationEndReason;
        long j;
        int i;
        this.Z0.log("OKRTCCall", rf0.h("destroy.reason=", str));
        d59.e();
        if (this.E0) {
            this.Z0.log("OKRTCCall", "   already destroyed, reason=" + this.z0);
            return;
        }
        this.E0 = true;
        qe4 qe4 = this.o2;
        switch (fe6 == null ? -1 : ge6.$EnumSwitchMapping$0[fe6.ordinal()]) {
            case -1:
                conversationEndReason = null;
                break;
            case 1:
                conversationEndReason = ConversationEndReason.SignalingTimeout.INSTANCE;
                break;
            case 2:
                conversationEndReason = ConversationEndReason.Busy.INSTANCE;
                break;
            case 3:
                conversationEndReason = ConversationEndReason.Missed.INSTANCE;
                break;
            case 4:
                conversationEndReason = ConversationEndReason.Rejected.INSTANCE;
                break;
            case 5:
                conversationEndReason = new ConversationEndReason.Error(new RuntimeException("Call error"));
                break;
            case 6:
                conversationEndReason = ConversationEndReason.Hangup.INSTANCE;
                break;
            case 7:
                conversationEndReason = ConversationEndReason.Canceled.INSTANCE;
                break;
            case 8:
                conversationEndReason = ConversationEndReason.CallTimeout.INSTANCE;
                break;
            case 9:
                conversationEndReason = ConversationEndReason.RemovedFromCall.INSTANCE;
                break;
            case 10:
                conversationEndReason = new ConversationEndReason.ObsoleteClient((String) null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        qe4.J(conversationEndReason);
        tz0 tz0 = this.W1.l;
        ez2 ez2 = (ez2) tz0.c;
        ez2.o = null;
        try {
            ((Context) ez2.a).unregisterReceiver((an) ez2.X);
        } catch (Exception e) {
            ((xwb) ez2.b).log("CallBatteryRetriever", rf0.h("Can't unregister BroadcastReceiver: ", e.getMessage()));
        }
        sz0 sz0 = (sz0) tz0.e;
        if (sz0 != null && tz0.a) {
            sz0 sz02 = (sz0) tz0.f;
            sz0 sz03 = (sz0) tz0.g;
            eje eje = (eje) tz0.d;
            if (sz02 == null || sz03 == null) {
                ((fje) eje).getClass();
                j = SystemClock.elapsedRealtime() - sz0.c;
                i = 0;
            } else {
                i = sz03.b - sz02.b;
                j = sz03.c - sz02.c;
            }
            Long a3 = ((fje) eje).a();
            if (a3 != null) {
                Map T = ju7.T(new wia[]{new wia("battery_level_change", EventItemValueKt.toEventItemValue(Math.abs(i))), new wia("stat_time_delta", EventItemValueKt.toEventItemValue(j)), new wia("timestamp", EventItemValueKt.toEventItemValue(a3.longValue()))});
                EventItemsMap eventItemsMap = (EventItemsMap) tz0.i;
                if (eventItemsMap != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(eventItemsMap.getItems());
                    linkedHashMap.putAll(T);
                    ((CallAnalyticsSender) tz0.b).send(new SdkIntervalStatEvent.Builder().addAll(new EventItemsMap(linkedHashMap)).build());
                }
            }
        }
        u7 u7Var = this.W1.m;
        u7Var.b.a();
        u7Var.c.b = null;
        tc1 tc1 = this.C0;
        if (tc1 != null) {
            tc1.a();
        }
        bd4 bd4 = this.I1;
        ((bi) ((nu7) bd4.X).a).getClass();
        pi piVar = (pi) bd4.Y;
        if (!piVar.i) {
            piVar.i = true;
            piVar.c.removeCallbacksAndMessages((Object) null);
            piVar.c.postAtFrontOfQueue(new b(8, (Object) piVar));
            piVar.h.a();
            piVar.b.quitSafely();
            piVar.f.clear();
            piVar.d.quitSafely();
            piVar.a.getClass();
        }
        NetworkMonitor.getInstance().removeObserver(this);
        this.u1.clear();
        this.v1.clear();
        pf8 pf8 = this.V1;
        pf8.g = true;
        ((Handler) pf8.k).removeCallbacks((xqd) pf8.m);
        ((LinkedHashSet) pf8.f).clear();
        c97 c97 = (c97) pf8.l;
        if (c97 != null) {
            bj4.a(c97);
        }
        pf8.l = null;
        this.w0.removeCallbacks(this.N0);
        this.x1.L();
        td4 td4 = this.i2;
        if (td4 != null) {
            td4.a(this.x1);
        }
        this.x1 = new tp4(this.t1, this.y0, this.Z0, this.Y0, this.a2);
        sl1 sl1 = this.y1;
        if (sl1 != null) {
            sl1.L();
            this.y1 = null;
        }
        qqd qqd = this.j2;
        if (qqd != null) {
            ((HashMap) qqd.a.d).remove(qqd);
        }
        v("rtc.destroy." + str);
        this.z0 = str;
        if (this.O0) {
            this.K0 = (SystemClock.elapsedRealtime() - this.L0) + this.K0;
            this.O0 = false;
        }
        long j3 = this.K0;
        if (j3 == 0) {
            v("rtc.connected.time2.-1");
        } else {
            long j4 = j3 / 60000;
            this.K0 = j4;
            this.K0 = Math.min(j4, 10);
            v("rtc.connected.time2." + this.K0);
        }
        mfd mfd = this.Z;
        if (mfd != null && this.d1) {
            mfd.k.remove(this.c);
            this.Z.l.remove(this.o);
            this.Z.g();
            this.Z = null;
        }
        this.t1.h();
        pe1 pe1 = this.t1;
        pe1.e.b = qw4.a;
        pe1.i = null;
        pe1.f.clear();
        pe1.g.clear();
        pe1.h.clear();
        pe1.c.t();
        d dVar = this.p1;
        dVar.E0 = null;
        jl7 jl7 = dVar.D0;
        if (jl7 != null) {
            jl7.k((VideoSink) null);
        }
        d dVar2 = this.p1;
        dVar2.z0.log("SlmsSource", "release");
        dVar2.C0.clear();
        dVar2.X.a.remove(dVar2);
        dVar2.c.a.execute(new b(0, (Object) dVar2));
        this.q1.w0 = null;
        ocd ocd = this.o1;
        ocd.b.log("SharedPeerConnectionFac", "release");
        ocd.a.execute(new mcd(ocd, 1));
        this.y0.getClass();
        s2.execute(new lw0(this, 1));
        k(g41.w0, (Object) null);
        this.M1 = null;
        this.P1.getClass();
        c97 c972 = (c97) this.T1.o;
        c972.getClass();
        bj4.a(c972);
        rk1 rk1 = this.W1;
        ((CallAnalyticsSender) rk1.a.b).setIdle(true);
        c97 c973 = (c97) rk1.i.c;
        if (c973 != null) {
            bj4.a(c973);
        }
        c97 c974 = (c97) this.l2.X;
        c974.getClass();
        bj4.a(c974);
        AndroidVideoDecoder.errorCallback = null;
        ((n83) this.n2.o).f();
    }

    public final ge1 q() {
        pe1 pe1 = this.t1;
        pe1.getClass();
        ArrayList arrayList = new ArrayList(pe1.d(pe1.k).keySet());
        if (arrayList.size() == 1) {
            return (ge1) arrayList.get(0);
        }
        return null;
    }

    public final void r(eef eef, List list, boolean z) {
        Intent intent;
        xwb xwb = this.Z0;
        xwb.log("OKRTCCall", "init");
        d59.e();
        if (!this.R0) {
            boolean z2 = true;
            this.R0 = true;
            fe1 fe1 = this.y0;
            fe1.b.getClass();
            de1 de1 = fe1.B;
            eef eef2 = eef;
            mfd mfd = new mfd(eef2, (dt3) this.H0, this.Z0, this.Y0, fe1.l, de1.i);
            this.Z = mfd;
            mfd.k.add(this.c);
            this.Z.l.add(this.o);
            this.P0 = list;
            StringBuilder sb = new StringBuilder();
            pe1 pe1 = this.t1;
            sb.append(pe1.r());
            sb.append(" participants");
            xwb.log("OKRTCCall", sb.toString());
            if (pe1.r() > 1) {
                e(ane.c, false);
            } else if (pe1.r() == 1) {
                e(ane.b, false);
                if (z) {
                    sl1 sl1 = this.x1;
                    sl1.getClass();
                    d59.e();
                    if (1 != sl1.D0) {
                        sl1.D0 = 1;
                        sl1.G();
                    }
                }
            }
            if (this.F0 && !de1.j) {
                C();
            }
            if (this.b1) {
                this.a1.k.add(new jyf(this));
            }
            tz0 tz0 = this.W1.l;
            ez2 ez2 = (ez2) tz0.c;
            ez2.o = (nfc) tz0.h;
            sz0 sz0 = null;
            try {
                intent = ((Context) ez2.a).registerReceiver((an) ez2.X, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            } catch (Exception e) {
                ((xwb) ez2.b).log("CallBatteryRetriever", rf0.h("Can't register BroadcastReceiver: ", e.getMessage()));
                intent = null;
            }
            if (intent != null) {
                int intExtra = intent.getIntExtra("level", 0);
                ((fje) ((eje) ez2.c)).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int intExtra2 = intent.getIntExtra("status", -1);
                if (!(intExtra2 == 2 || intExtra2 == 5)) {
                    z2 = false;
                }
                sz0 = new sz0(intExtra, elapsedRealtime, z2);
            }
            tz0.e = sz0;
            return;
        }
        throw new IllegalStateException("Is already initialized");
    }

    public final boolean s() {
        return this.F0 ? this.X0.b : this.E1;
    }

    public final void u(tqd tqd, String str) {
        this.Y0.log(tqd, str, (String) null);
    }

    public final void v(String str) {
        u(tqd.app_event, str);
    }

    public final void w() {
        this.U1.getClass();
        yfd h = dr9.h(this.C1);
        this.T1.c(h);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "accept-call");
            jSONObject.put("mediaSettings", (Object) x87.s(h, false, false));
            this.Z.h(new x66(jSONObject), new nw0(this, 1));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void x() {
        this.Z0.log("OKRTCCall", "sendMediaSettingsChange");
        this.U1.getClass();
        this.T1.a(dr9.h(this.C1));
    }

    public final int y(ge1 ge1, JSONObject jSONObject) {
        ke1 ke1;
        JSONObject jSONObject2 = jSONObject;
        u2d u2d = u2d.a;
        pe1 pe1 = this.t1;
        if (jSONObject2 == null) {
            ke1 = pe1.f(new pja(ge1, new dr9(14), new dr9(14), new dr9(14), new dr9(14), new dr9(14), new dr9(14)), u2d);
        } else if ("ACCEPTED".equals(jSONObject2.optString("state"))) {
            return 2;
        } else {
            qb1 qb1 = this.P1;
            ac9 f = qb1.f(jSONObject, ge1, "onParticipantAddedToCall", qb1.h(u2d).a(), true);
            nfc dr9 = new dr9(14);
            nfc dr92 = new dr9(14);
            nfc nfc = new nfc(22, x87.t(jSONObject));
            nfc nfc2 = new nfc(22, f);
            cc9 r = x87.r(jSONObject);
            if (r != null) {
                dr9 = new nfc(22, r);
            }
            nfc nfc3 = dr9;
            nfc nfc4 = new nfc(22, x87.B(jSONObject));
            y41 m = x87.m(jSONObject);
            if (m != null) {
                dr92 = new nfc(22, m);
            }
            ke1 = pe1.f(new pja(ge1, nfc, nfc2, nfc3, nfc4, dr92, new nfc(22, this.X1.a.h(jSONObject2, u2d))), u2d);
        }
        this.x1.u(ke1, true);
        return 1;
    }

    public final void z(sl1 sl1) {
        this.Z0.log("OKRTCCall", "handleTopologyCreated, " + sl1);
        wjf wjf = this.W0;
        if (!wjf.b) {
            wjf.c();
        }
    }
}
