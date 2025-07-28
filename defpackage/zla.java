package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.webrtc.AudioTrack;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLibraryLoader;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpSender;
import org.webrtc.SessionDescription;
import org.webrtc.VideoFrame;
import org.webrtc.VideoTrack;

/* renamed from: zla  reason: default package */
public final class zla implements ll7, kl7, dh5, myf, rja {
    public static final Pattern A1 = Pattern.compile("^a=rtpmap:(\\d+) H264(/\\d+)+[\r]?$", 8);
    public static final Pattern B1 = Pattern.compile("^a=animoji:(\\d+)", 8);
    public static volatile afc C1 = null;
    public static final za6 D1 = new Object();
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public final boolean E0;
    public final b79 F0;
    public final Handler G0 = new Handler(Looper.getMainLooper());
    public final ocd H0;
    public final d I0;
    public final ExecutorService J0;
    public final dia K0;
    public final int L0;
    public final Context M0;
    public final axb N0;
    public final xwb O0;
    public final fe1 P0;
    public final stf Q0;
    public final vn6 R0;
    public final dhc S0;
    public final km4 T0;
    public final eh5 U0;
    public final boolean V0;
    public final String[] W0;
    public final boolean X;
    public final String[] X0;
    public final boolean Y;
    public long Y0 = -1;
    public final Integer Z;
    public volatile PeerConnection Z0;
    public final boolean a;
    public boolean a1;
    public final koc b;
    public MediaConstraints b1;
    public final b0d c;
    public MediaConstraints c1;
    public yla d1;
    public RtpSender e1;
    public RtpSender f1;
    public RtpSender g1;
    public List h1;
    public RtpSender i1;
    public final ArrayList j1 = new ArrayList();
    public jl7 k1;
    public boolean l1 = true;
    public volatile boolean m1;
    public volatile boolean n1;
    public final boolean o;
    public boolean o1;
    public volatile boolean p1;
    public volatile boolean q1 = true;
    public ema r1;
    public final nw3 s1;
    public final cf3 t1;
    public final onc u1;
    public final boolean v1;
    public final Integer w0;
    public final float w1;
    public final kj x0;
    public final float x1;
    public boolean y0;
    public final boolean y1;
    public final ni z0;
    public final int z1;

    /* JADX WARNING: type inference failed for: r1v12, types: [km4, java.lang.Object] */
    public zla(xla xla) {
        dia dia;
        wka wka;
        xla xla2 = xla;
        int i = xla2.q;
        this.L0 = i;
        Context applicationContext = xla2.e.getApplicationContext();
        this.M0 = applicationContext;
        axb axb = xla2.f;
        this.N0 = axb;
        xwb xwb = xla2.g;
        this.O0 = xwb;
        fe1 fe1 = xla2.d;
        this.P0 = fe1;
        this.F0 = new b79(xwb);
        ocd ocd = xla2.a;
        this.H0 = ocd;
        ExecutorService executorService = ocd != null ? ocd.a : xla2.c;
        this.J0 = executorService;
        this.V0 = xla2.n;
        this.W0 = xla2.o;
        this.X0 = xla2.p;
        this.E0 = xla2.B;
        if (executorService == null) {
            fe1.getClass();
            dia = new dia(axb);
        } else {
            dia = null;
        }
        this.K0 = dia;
        this.I0 = xla2.b;
        fe1.getClass();
        this.R0 = new vn6(axb, xwb, i);
        gvf gvf = xla2.w;
        if (xla2.h) {
            za6 za6 = fe1.A.c.b ? new za6(gvf) : new y76(16);
            v4b v4b = new v4b(3);
            v4b.c = za6;
            v4b.b = xwb;
            this.S0 = new dhc(v4b);
        } else {
            this.S0 = null;
        }
        if (xla2.i) {
            s5c s5c = new s5c(1, false);
            s5c.b = null;
            s5c.c = null;
            s5c.b = new duf(gvf, xwb);
            s5c.c = xwb;
            ? obj = new Object();
            obj.a = new CopyOnWriteArrayList();
            obj.Y = new Handler(Looper.getMainLooper());
            obj.Z = new AtomicBoolean(false);
            obj.w0 = new AtomicReference((Object) null);
            obj.x0 = new owf(0, obj);
            duf duf = (duf) s5c.b;
            if (duf != null) {
                xwb xwb2 = (xwb) s5c.c;
                if (xwb2 != null) {
                    obj.b = duf;
                    obj.c = xwb2;
                    HandlerThread handlerThread = new HandlerThread("RtcNotifRecv");
                    obj.o = handlerThread;
                    handlerThread.start();
                    obj.X = new Handler(handlerThread.getLooper());
                    this.T0 = obj;
                } else {
                    throw new IllegalArgumentException("Illegal 'log' value: null");
                }
            } else {
                throw new IllegalArgumentException("Illegal 'serializer' value: null");
            }
        } else {
            this.T0 = null;
        }
        de1 de1 = fe1.B;
        this.v1 = de1.b;
        this.w1 = de1.c;
        this.x1 = de1.d;
        Future submit = (executorService == null || ocd == null) ? null : executorService.submit(new m5(11, ocd));
        if (!xla2.j || submit == null) {
            this.b = null;
        } else {
            this.b = new koc(xla2.g, gvf, submit, this, xla2.C);
        }
        if (xla2.k) {
            this.c = new b0d(gvf);
        } else {
            this.c = null;
        }
        this.y0 = xla2.l;
        this.U0 = new eh5(this);
        this.a = xla2.r;
        this.o = xla2.t;
        this.Y = xla2.u;
        this.X = xla2.v;
        bma bma = A().j;
        if (bma != null) {
            this.Z = bma.g;
            this.w0 = bma.h;
        } else {
            this.Z = null;
            this.w0 = null;
        }
        if (xla2.s) {
            this.t1 = new vja(new ula(this), xwb, new qla(this), gvf);
        } else {
            this.t1 = new da4(new ula(this), xwb, new qla(this), gvf);
        }
        this.x0 = xla2.x;
        this.z0 = xla2.y;
        this.z1 = xla2.z;
        this.Q0 = xla2.A;
        if (!(ocd == null || (wka = ocd.j) == null)) {
            wka.Y.add(this);
        }
        this.s1 = new nw3(ocd, applicationContext, fe1, xwb);
        this.u1 = xla2.D;
        this.y1 = xla2.m;
    }

    public static cma A() {
        if (C1 != null) {
            return (cma) C1.a;
        }
        Boolean bool = Boolean.FALSE;
        return new cma(true, true, (String) null, (String) null, (Integer) null, false, false, false, false, new bma(false, (Integer) null, (Integer) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null), false, (String) null);
    }

    public static void D(Context context, afc afc, NativeLibraryLoader nativeLibraryLoader) {
        if (C1 == null) {
            C1 = afc;
            xwb xwb = (xwb) C1.b;
            if (xwb != null) {
                za6 za6 = D1;
                za6.getClass();
                za6.a = new WeakReference(xwb);
            }
            PeerConnectionFactory.InitializationOptions.Builder injectableLogger = PeerConnectionFactory.InitializationOptions.builder(context.getApplicationContext()).setInjectableLogger(D1, Logging.Severity.LS_VERBOSE);
            if (nativeLibraryLoader != null) {
                injectableLogger.setNativeLibraryLoader(nativeLibraryLoader);
            }
            PeerConnectionFactory.initialize(injectableLogger.createInitializationOptions());
        }
    }

    public static LinkedList e(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                int length = str.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    int codePointAt = str.codePointAt(i);
                    if (!Character.isWhitespace(codePointAt)) {
                        linkedList.add(str);
                        break;
                    }
                    i += Character.charCount(codePointAt);
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    public final dhc B() {
        dhc dhc = this.S0;
        if (dhc != null) {
            return dhc;
        }
        throw new IllegalStateException("Command executor is not enabled");
    }

    public final PeerConnection.IceConnectionState C() {
        PeerConnection peerConnection = this.Z0;
        if (peerConnection == null) {
            return null;
        }
        try {
            return peerConnection.iceConnectionState();
        } catch (Exception e) {
            this.O0.reportException("PCRTCClient", "pc.conn.state", e);
            return null;
        }
    }

    public final boolean E() {
        return !this.m1 && !this.n1 && this.Z0 != null;
    }

    public final void F() {
        jl7 jl7 = this.k1;
        if (jl7 != null) {
            xwb xwb = this.O0;
            xwb.log("PCRTCClient", "maybeUpdateSenders, " + this + ", " + d59.c(jl7));
            if (G() != null) {
                RtpSender rtpSender = this.f1;
                RtpSender rtpSender2 = this.e1;
                jl7.n.log("OKRTCLmsAdapter", "bindTracksWith, " + jl7 + ", audio sender=" + d59.c(rtpSender) + " & video sender= " + d59.c(rtpSender2));
                jl7.i.t(rtpSender);
                if (jl7.f.d) {
                    jl7.y.t(rtpSender2);
                }
            }
        }
    }

    public final PeerConnection G() {
        if (this.Z0 != null && !this.m1 && !this.a1) {
            return this.Z0;
        }
        StringBuilder sb = new StringBuilder();
        if (this.Z0 == null) {
            sb.append("No web-rtc peer connection");
        }
        if (this.a1) {
            if (sb.length() > 0) {
                sb.append(", fatal error occurred");
            } else {
                sb.append("Fatal error occurred");
            }
        }
        if (this.m1) {
            xwb xwb = this.O0;
            xwb.log("PCRTCClient", this + ": (closed) " + sb);
            return null;
        }
        xwb xwb2 = this.O0;
        xwb2.log("PCRTCClient", this + ": (unclosed null peer connection) " + sb);
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [tyf, java.lang.Runnable] */
    public final void H(IceCandidate[] iceCandidateArr) {
        this.O0.log("PCRTCClient", "removeRemoteIceCandidates, " + this);
        i("removeRemoteIceCandidates", new tyf(this, new mf3(2, iceCandidateArr), 1));
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [tyf, java.lang.Runnable] */
    public final void I(ema ema) {
        if (ema != null && !ema.equals(this.r1)) {
            ema ema2 = this.r1;
            boolean z = ema2 != null && !Objects.equals(ema2.i, ema.i);
            this.r1 = ema;
            this.s1.j = ema;
            this.O0.log("PCRTCClient", "setPeerVideoSettings, " + this + " settings=" + ema.toString());
            i("setPeerVideoSettings", new tyf(this, new jla(this, z, 1), 1));
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [tyf, java.lang.Runnable] */
    public final void J(SessionDescription sessionDescription) {
        xwb xwb = this.O0;
        xwb.log("PCRTCClient", "setRemoteDescription, " + this + ", sdp=" + sessionDescription.type);
        this.q1 = false;
        this.p1 = false;
        vn6 vn6 = this.R0;
        if (vn6.f == 0) {
            vn6.f = SystemClock.elapsedRealtime();
        }
        i("setRemoteDescription", new tyf(this, new mla(this, sessionDescription, 1), 1));
    }

    public final void a(ge1 ge1, VideoFrame videoFrame) {
        stf stf = this.Q0;
        if (stf != null) {
            ((fje) ((eje) stf.b)).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            cnc.a().b(new wo5(stf, ge1, new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight()), elapsedRealtime, 1));
        }
        this.t1.a(ge1, videoFrame);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [tyf, java.lang.Runnable] */
    public final void b(jl7 jl7) {
        this.O0.log("PCRTCClient", "onLocalMediaStreamChanged, " + this + " ms=" + d59.c(jl7));
        org.webrtc.Size h = jl7.h();
        pnc pnc = jl7.t;
        int i = 0;
        int i2 = pnc != null ? pnc.g : 0;
        pnc pnc2 = jl7.t;
        if (pnc2 != null) {
            i = pnc2.f;
        }
        i("maybeUpdateSenders", new tyf(this, new lla(this, h, i2, i), 1));
    }

    public final az3 c(String str, DataChannel.Init init) {
        init.ordered = true;
        init.maxRetransmitTimeMs = 10000000;
        DataChannel createDataChannel = this.Z0.createDataChannel(str, init);
        xwb xwb = this.O0;
        StringBuilder m = hr1.m("DATACH create data channel: name: ", str, ", id: ");
        m.append(createDataChannel.id());
        xwb.log("PCRTCClient", m.toString());
        return new az3(createDataChannel, this.O0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        r13 = xie.b(false, r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0102, code lost:
        if (r15.a.contains(java.lang.Integer.valueOf(r14)) != false) goto L_0x0107;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014a A[SYNTHETIC, Splitter:B:70:0x014a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String d(java.lang.String r23, boolean r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "\\r\\n"
            java.lang.String[] r4 = r0.W0
            java.util.LinkedList r4 = e(r4)
            java.lang.String[] r5 = r0.X0
            java.util.LinkedList r5 = e(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "applyPreferCodec, local="
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r8 = ", filter="
            r6.append(r8)
            boolean r8 = r0.V0
            r6.append(r8)
            java.lang.String r9 = ", video=["
            r6.append(r9)
            java.lang.String r9 = ", "
            java.lang.String r10 = "null"
            if (r5 != 0) goto L_0x0035
            r11 = r10
            goto L_0x005b
        L_0x0035:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.util.Iterator r12 = r5.iterator()
        L_0x003e:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0057
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            int r14 = r11.length()
            if (r14 <= 0) goto L_0x0053
            r11.append(r9)
        L_0x0053:
            r11.append(r13)
            goto L_0x003e
        L_0x0057:
            java.lang.String r11 = r11.toString()
        L_0x005b:
            r6.append(r11)
            java.lang.String r11 = "], audio=["
            r6.append(r11)
            if (r4 != 0) goto L_0x0066
            goto L_0x008c
        L_0x0066:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.util.Iterator r11 = r4.iterator()
        L_0x006f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0088
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            int r13 = r10.length()
            if (r13 <= 0) goto L_0x0084
            r10.append(r9)
        L_0x0084:
            r10.append(r12)
            goto L_0x006f
        L_0x0088:
            java.lang.String r10 = r10.toString()
        L_0x008c:
            java.lang.String r9 = "]"
            java.lang.String r6 = defpackage.wn6.l(r6, r10, r9)
            xwb r10 = r0.O0
            java.lang.String r11 = "PCRTCClient"
            r10.log(r11, r6)
            java.lang.String r0 = "\r\n"
            java.lang.String[] r6 = r1.split(r0)
            r12 = 1
            r13 = 0
            r14 = 0
            if (r4 == 0) goto L_0x00b8
            vxf r15 = xie.b(r12, r6, r10)
            if (r15 == 0) goto L_0x00b5
            boolean r16 = r15.d(r4)
            if (r16 != 0) goto L_0x00b2
            if (r8 == 0) goto L_0x00b5
        L_0x00b2:
            r16 = r12
            goto L_0x00ba
        L_0x00b5:
            r16 = r14
            goto L_0x00ba
        L_0x00b8:
            r15 = r13
            goto L_0x00b5
        L_0x00ba:
            if (r5 == 0) goto L_0x00cd
            vxf r13 = xie.b(r14, r6, r10)
            if (r13 == 0) goto L_0x00cd
            boolean r17 = r13.d(r5)
            if (r17 != 0) goto L_0x00ca
            if (r8 == 0) goto L_0x00cd
        L_0x00ca:
            r17 = r12
            goto L_0x00cf
        L_0x00cd:
            r17 = r14
        L_0x00cf:
            if (r16 != 0) goto L_0x00da
            if (r17 != 0) goto L_0x00da
            r4 = r1
            r20 = r10
            r21 = r11
            goto L_0x0144
        L_0x00da:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r20 = r10
            r18 = r14
            r19 = r18
        L_0x00e5:
            int r10 = r6.length
            if (r14 >= r10) goto L_0x013e
            if (r16 == 0) goto L_0x010f
            int r10 = r15.c
            if (r14 != r10) goto L_0x00f4
            r15.f(r12, r4, r8)
            r21 = r11
            goto L_0x0139
        L_0x00f4:
            if (r14 == r10) goto L_0x0105
            java.util.HashSet r10 = r15.a
            r21 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x0111
            goto L_0x0107
        L_0x0105:
            r21 = r11
        L_0x0107:
            if (r18 != 0) goto L_0x0139
            r15.c(r12, r4, r8)
            r18 = 1
            goto L_0x0139
        L_0x010f:
            r21 = r11
        L_0x0111:
            if (r17 == 0) goto L_0x0131
            int r10 = r13.c
            if (r14 != r10) goto L_0x011b
            r13.f(r12, r5, r8)
            goto L_0x0139
        L_0x011b:
            if (r14 == r10) goto L_0x0129
            java.util.HashSet r10 = r13.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x0131
        L_0x0129:
            if (r19 != 0) goto L_0x0139
            r13.c(r12, r5, r8)
            r19 = 1
            goto L_0x0139
        L_0x0131:
            r10 = r6[r14]
            r12.append(r10)
            r12.append(r0)
        L_0x0139:
            int r14 = r14 + 1
            r11 = r21
            goto L_0x00e5
        L_0x013e:
            r21 = r11
            java.lang.String r4 = r12.toString()
        L_0x0144:
            boolean r5 = r1.equals(r4)
            if (r5 != 0) goto L_0x0197
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x018d }
            r5.<init>(r7)     // Catch:{ all -> 0x018d }
            r5.append(r2)     // Catch:{ all -> 0x018d }
            java.lang.String r6 = ", description before=["
            r5.append(r6)     // Catch:{ all -> 0x018d }
            java.lang.String r1 = r1.replace(r0, r3)     // Catch:{ all -> 0x018d }
            r5.append(r1)     // Catch:{ all -> 0x018d }
            r5.append(r9)     // Catch:{ all -> 0x018d }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x018d }
            r5 = r20
            r6 = r21
            r5.log(r6, r1)     // Catch:{ all -> 0x018b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018b }
            r1.<init>(r7)     // Catch:{ all -> 0x018b }
            r1.append(r2)     // Catch:{ all -> 0x018b }
            java.lang.String r2 = ", description after=["
            r1.append(r2)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = r4.replace(r0, r3)     // Catch:{ all -> 0x018b }
            r1.append(r0)     // Catch:{ all -> 0x018b }
            r1.append(r9)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018b }
            r5.log(r6, r0)     // Catch:{ all -> 0x018b }
            goto L_0x0197
        L_0x018b:
            r0 = move-exception
            goto L_0x0192
        L_0x018d:
            r0 = move-exception
            r5 = r20
            r6 = r21
        L_0x0192:
            java.lang.String r1 = "applyPreferCodec, failed to log sdp difference"
            r5.reportException(r6, r1, r0)
        L_0x0197:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zla.d(java.lang.String, boolean):java.lang.String");
    }

    public final void f(long j) {
        yla yla = this.d1;
        if (yla != null) {
            yla.p(this, j);
        }
    }

    public final PeerConnection.RTCConfiguration g(List list) {
        ArrayList arrayList = new ArrayList();
        this.P0.getClass();
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (it.hasNext()) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) it.next();
            String str = iceServer.uri;
            if (str == null || iceServer.password == null || iceServer.username == null) {
                throw new NullPointerException(iceServer.toString());
            } else if (str.startsWith("turn")) {
                if (!iceServer.username.isEmpty() && !iceServer.password.isEmpty()) {
                    arrayList.add(iceServer);
                    if (i > 0) {
                        arrayList.add(PeerConnection.IceServer.builder(iceServer.uri.concat("?transport=tcp")).setUsername(iceServer.username).setPassword(iceServer.password).setTlsCertPolicy(iceServer.tlsCertPolicy).setHostname(iceServer.hostname).createIceServer());
                        i--;
                    }
                    z = true;
                }
            } else if (iceServer.uri.startsWith("stun")) {
                arrayList.add(iceServer);
                z2 = true;
            }
        }
        xwb xwb = this.O0;
        if (!z || !z2) {
            xwb.log("PCRTCClient", this + ": stun or turn servers are absent");
        }
        xwb.log("PCRTCClient", this + ": iceServers=" + arrayList);
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(arrayList);
        rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
        rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
        rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
        rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
        rTCConfiguration.iceTransportsType = this.a ? PeerConnection.IceTransportsType.RELAY : PeerConnection.IceTransportsType.ALL;
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        rTCConfiguration.suspendBelowMinBitrate = this.E0;
        return rTCConfiguration;
    }

    public final void h(String str) {
        this.O0.log("PCRTCClient", "handleSdpCreateFailure, " + this + ", error=" + str);
        i("handleSdpCreateFailure", new kla(this, str, 1));
    }

    public final void i(String str, Runnable runnable) {
        ExecutorService executorService = this.J0;
        if (executorService != null) {
            executorService.execute(runnable);
            return;
        }
        dia dia = this.K0;
        dia.getClass();
        dia.a.execute(new eyf(dia, str, runnable));
    }

    public final void j(String str, String str2) {
        this.O0.reportException("PCRTCClient", me4.j("reportError, ", str, " ", str2), new Exception(rf0.h("peer.connection.error.", str)));
        i("reportError", new ola(this, 6));
    }

    public final void k(PeerConnection peerConnection, boolean z) {
        xwb xwb = this.O0;
        try {
            l(peerConnection, z, true, this.i1);
        } catch (IllegalStateException e) {
            xwb.log("PCRTCClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            xwb.log("PCRTCClient", "Exception, " + this + " ex=" + e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: hw4} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(org.webrtc.PeerConnection r25, boolean r26, boolean r27, org.webrtc.RtpSender r28) {
        /*
            r24 = this;
            r1 = r24
            r0 = 0
            r2 = 1
            ema r3 = r1.r1
            if (r3 != 0) goto L_0x0012
            xwb r0 = r1.O0
            java.lang.String r1 = "PCRTCClient"
            java.lang.String r2 = "updatePVS(), no video settings, ignore this update"
            r0.log(r1, r2)
            return
        L_0x0012:
            java.lang.String r4 = "x"
            java.lang.String r5 = "VideoSettingCalculator"
            if (r27 == 0) goto L_0x00d9
            nw3 r7 = r1.s1
            jl7 r8 = r1.k1
            r7.getClass()
            int r9 = r3.a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer[] r9 = new java.lang.Integer[]{r9}
            java.util.ArrayList r9 = p23.C(r9)
            int r10 = r7.g
            int r11 = r7.h
            int r12 = java.lang.Math.max(r10, r11)
            int r10 = java.lang.Math.min(r10, r11)
            java.lang.Object r11 = r7.i
            zzc r11 = (defpackage.zzc) r11
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            java.util.Map r11 = r11.b
            java.lang.Object r11 = r11.get(r13)
            x7f r11 = (defpackage.x7f) r11
            if (r11 == 0) goto L_0x004e
            int r11 = r11.b
            goto L_0x004f
        L_0x004e:
            r11 = r0
        L_0x004f:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9.add(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x005f:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x0076
            java.lang.Object r13 = r9.next()
            r14 = r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            if (r14 <= 0) goto L_0x005f
            r11.add(r13)
            goto L_0x005f
        L_0x0076:
            java.lang.Comparable r9 = o23.g0(r11)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r8 == 0) goto L_0x0081
            goc r8 = r8.z
            goto L_0x0082
        L_0x0081:
            r8 = 0
        L_0x0082:
            if (r8 != 0) goto L_0x0085
            goto L_0x00d9
        L_0x0085:
            java.lang.Object r7 = r7.e
            xwb r7 = (defpackage.xwb) r7
            int r11 = r3.d
            if (r9 == 0) goto L_0x00bf
            int r13 = r9.intValue()
            if (r13 >= r12) goto L_0x00bf
            float r10 = (float) r10
            float r12 = (float) r12
            float r10 = r10 / r12
            int r12 = r9.intValue()
            float r12 = (float) r12
            float r12 = r12 * r10
            int r10 = java.lang.Math.round(r12)
            int r12 = r9.intValue()
            r8.u(r12, r10, r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r11 = "select screenshare dimension compressed: "
            r8.<init>(r11)
            r8.append(r9)
            r8.append(r4)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.log(r5, r8)
            goto L_0x00d9
        L_0x00bf:
            r8.u(r12, r10, r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "select screenshare dimension: "
            r8.<init>(r9)
            r8.append(r12)
            r8.append(r4)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.log(r5, r8)
        L_0x00d9:
            int r7 = r3.h
            int r8 = r3.d
            int r9 = r3.a
            if (r27 != 0) goto L_0x0187
            nw3 r10 = r1.s1
            jl7 r11 = r1.k1
            r10.getClass()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer[] r9 = new java.lang.Integer[]{r9}
            java.util.ArrayList r9 = p23.C(r9)
            if (r11 == 0) goto L_0x00f9
            z7f r11 = r11.y
            goto L_0x00fa
        L_0x00f9:
            r11 = 0
        L_0x00fa:
            if (r11 != 0) goto L_0x00fe
            goto L_0x0187
        L_0x00fe:
            java.lang.Object r10 = r10.i
            zzc r10 = (defpackage.zzc) r10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.util.Map r10 = r10.b
            java.lang.Object r10 = r10.get(r12)
            x7f r10 = (defpackage.x7f) r10
            if (r10 == 0) goto L_0x0113
            int r10 = r10.b
            goto L_0x0114
        L_0x0113:
            r10 = r0
        L_0x0114:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.add(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0124:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x013b
            java.lang.Object r12 = r9.next()
            r13 = r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            if (r13 <= 0) goto L_0x0124
            r10.add(r12)
            goto L_0x0124
        L_0x013b:
            java.lang.Comparable r9 = o23.g0(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r11.c
            xwb r10 = (defpackage.xwb) r10
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Set restriction to video frame max dimension: "
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "VideoRecord"
            r10.log(r13, r12)
            y4f r10 = r11.y0
            if (r9 == 0) goto L_0x0181
            r10.getClass()
            int r12 = r9.intValue()
            if (r12 <= 0) goto L_0x0181
            int r12 = r9.intValue()
            int r13 = r10.c
            if (r12 >= r13) goto L_0x0181
            int r9 = r9.intValue()
            int r12 = r9 % 16
            int r9 = r9 - r12
            r12 = 320(0x140, float:4.48E-43)
            r13 = 4096(0x1000, float:5.74E-42)
            int r9 = gwf.j(r9, r12, r13)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0182
        L_0x0181:
            r9 = 0
        L_0x0182:
            r10.d = r9
            r11.u()
        L_0x0187:
            nw3 r9 = r1.s1
            java.lang.Object r10 = r9.j
            ema r10 = (defpackage.ema) r10
            java.lang.Object r11 = r9.a
            ocd r11 = (defpackage.ocd) r11
            if (r11 == 0) goto L_0x019d
            wka r11 = r11.j
            org.webrtc.VideoCodecInfo r11 = r11.X
            if (r11 != 0) goto L_0x019a
            goto L_0x019d
        L_0x019a:
            java.lang.String r11 = r11.name
            goto L_0x019e
        L_0x019d:
            r11 = 0
        L_0x019e:
            if (r11 != 0) goto L_0x01a2
            java.lang.String r11 = "unknown"
        L_0x01a2:
            java.lang.Object r12 = r9.b
            android.content.Context r12 = (android.content.Context) r12
            java.lang.String r13 = "connectivity"
            java.lang.Object r13 = r12.getSystemService(r13)
            android.net.ConnectivityManager r13 = (android.net.ConnectivityManager) r13
            java.lang.String r14 = "phone"
            java.lang.Object r14 = r12.getSystemService(r14)
            android.telephony.TelephonyManager r14 = (android.telephony.TelephonyManager) r14
            java.lang.Object r15 = r9.d
            fe1 r15 = (defpackage.fe1) r15
            ce1 r15 = r15.a
            boolean r16 = defpackage.d59.a
            android.net.NetworkInfo r13 = r13.getNetworkInfo(r2)
            if (r13 == 0) goto L_0x01cf
            boolean r13 = r13.isConnected()
            if (r13 == 0) goto L_0x01cf
            int r12 = r15.d
            int r13 = r15.h
            goto L_0x01f9
        L_0x01cf:
            int r13 = android.os.Process.myPid()
            int r6 = android.os.Process.myUid()
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r12.checkPermission(r0, r13, r6)
            if (r0 == 0) goto L_0x01e4
            int r12 = r15.c
            int r13 = r15.g
            goto L_0x01f9
        L_0x01e4:
            int r0 = r14.getNetworkType()
            switch(r0) {
                case 1: goto L_0x01f5;
                case 2: goto L_0x01f5;
                case 3: goto L_0x01f0;
                case 4: goto L_0x01f5;
                case 5: goto L_0x01f0;
                case 6: goto L_0x01f0;
                case 7: goto L_0x01f5;
                case 8: goto L_0x01f0;
                case 9: goto L_0x01f0;
                case 10: goto L_0x01f0;
                case 11: goto L_0x01f5;
                case 12: goto L_0x01f0;
                case 13: goto L_0x01eb;
                case 14: goto L_0x01f0;
                case 15: goto L_0x01f0;
                default: goto L_0x01eb;
            }
        L_0x01eb:
            int r12 = r15.c
            int r13 = r15.g
            goto L_0x01f9
        L_0x01f0:
            int r12 = r15.b
            int r13 = r15.f
            goto L_0x01f9
        L_0x01f5:
            int r12 = r15.a
            int r13 = r15.e
        L_0x01f9:
            java.lang.String r0 = "; network maxBitrate="
            java.lang.String r0 = defpackage.wn6.h(r12, r0)
            java.lang.Object r6 = r9.e
            xwb r6 = (defpackage.xwb) r6
            if (r10 == 0) goto L_0x03bd
            if (r27 == 0) goto L_0x020a
            java.lang.String r14 = "for screenshare"
            goto L_0x020c
        L_0x020a:
            java.lang.String r14 = "for camera"
        L_0x020c:
            java.lang.String r15 = "select bitrate "
            java.lang.String r2 = " by videoSettings="
            java.lang.String r2 = defpackage.wn6.i(r15, r14, r2)
            if (r27 == 0) goto L_0x0219
            int r14 = r9.g
            goto L_0x021b
        L_0x0219:
            int r14 = r9.c
        L_0x021b:
            if (r27 == 0) goto L_0x0222
            int r15 = r9.h
        L_0x021f:
            r17 = r3
            goto L_0x0225
        L_0x0222:
            int r15 = r9.f
            goto L_0x021f
        L_0x0225:
            int r3 = java.lang.Math.max(r14, r15)
            r18 = r8
            int r8 = r10.c
            r19 = r7
            int r7 = r8 * 1000
            gma r1 = r10.f
            if (r1 == 0) goto L_0x0310
            if (r3 <= 0) goto L_0x0310
            r20 = r13
            int r13 = r10.b
            r21 = r9
            int r9 = r10.g
            int r13 = r13 / r9
            int r9 = java.lang.Math.min(r13, r3)
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r13 = r11.toLowerCase(r13)
            java.util.Map r1 = r1.a
            java.lang.Object r13 = r1.get(r13)
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x0261
            java.lang.String r13 = "generic"
            java.lang.Object r1 = r1.get(r13)
            r13 = r1
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x0261
            hw4 r13 = hw4.a
        L_0x0261:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L_0x026d
            r22 = r0
            r23 = r12
            goto L_0x030e
        L_0x026d:
            java.util.Iterator r1 = r13.iterator()
        L_0x0271:
            boolean r22 = r1.hasNext()
            if (r22 == 0) goto L_0x0289
            java.lang.Object r22 = r1.next()
            r23 = r1
            r1 = r22
            fma r1 = (defpackage.fma) r1
            int r1 = r1.a
            if (r1 != r9) goto L_0x0286
            goto L_0x028b
        L_0x0286:
            r1 = r23
            goto L_0x0271
        L_0x0289:
            r22 = 0
        L_0x028b:
            r1 = r22
            fma r1 = (defpackage.fma) r1
            if (r1 == 0) goto L_0x0299
            int r1 = r1.b
            r22 = r0
            r23 = r12
            goto L_0x031a
        L_0x0299:
            gu6 r1 = new gu6
            r22 = r0
            r0 = 8
            r1.<init>(r0)
            java.util.List r0 = o23.m0(r13, r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x02aa:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x02c1
            java.lang.Object r13 = r1.next()
            r23 = r1
            r1 = r13
            fma r1 = (defpackage.fma) r1
            int r1 = r1.a
            if (r1 <= r9) goto L_0x02be
            goto L_0x02c2
        L_0x02be:
            r1 = r23
            goto L_0x02aa
        L_0x02c1:
            r13 = 0
        L_0x02c2:
            fma r13 = (defpackage.fma) r13
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L_0x02cc:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x02e3
            java.lang.Object r1 = r0.previous()
            r23 = r0
            r0 = r1
            fma r0 = (defpackage.fma) r0
            int r0 = r0.a
            if (r0 >= r9) goto L_0x02e0
            goto L_0x02e4
        L_0x02e0:
            r0 = r23
            goto L_0x02cc
        L_0x02e3:
            r1 = 0
        L_0x02e4:
            fma r1 = (defpackage.fma) r1
            if (r1 == 0) goto L_0x02fd
            if (r13 == 0) goto L_0x02fd
            int r0 = r13.a
            r23 = r12
            int r12 = r1.a
            int r0 = r0 - r12
            int r13 = r13.b
            int r1 = r1.b
            int r13 = r13 - r1
            int r12 = r9 - r12
            int r12 = r12 * r13
            int r12 = r12 / r0
            int r12 = r12 + r1
            r1 = r12
            goto L_0x031a
        L_0x02fd:
            r23 = r12
            if (r13 == 0) goto L_0x0309
            int r0 = r13.b
            int r0 = r0 * r9
            int r1 = r13.a
            int r0 = r0 / r1
        L_0x0307:
            r1 = r0
            goto L_0x031a
        L_0x0309:
            if (r1 == 0) goto L_0x030e
            int r0 = r1.b
            goto L_0x0307
        L_0x030e:
            r1 = 0
            goto L_0x031a
        L_0x0310:
            r22 = r0
            r21 = r9
            r23 = r12
            r20 = r13
            r1 = 0
            r9 = 0
        L_0x031a:
            if (r1 <= 0) goto L_0x034d
            int r0 = java.lang.Math.min(r7, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = " by table; encoder="
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = " maxDimensionForTable="
            r3.append(r2)
            java.lang.String r2 = " tableBitrate="
            java.lang.String r4 = " maxBitrateSetting="
            defpackage.th2.l(r3, r9, r2, r1, r4)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            r6.log(r5, r1)
            r7 = r0
        L_0x034a:
            r12 = r23
            goto L_0x03a0
        L_0x034d:
            if (r3 <= 0) goto L_0x0388
            int r0 = r10.a
            if (r3 >= r0) goto L_0x0388
            int r0 = r14 * r15
            int r0 = r0 / 256
            int r0 = r0 * 533
            double r0 = (double) r0
            r3 = 1024(0x400, float:1.435E-42)
            int r8 = r8 * r3
            double r7 = (double) r8
            double r0 = java.lang.Math.min(r0, r7)
            double r7 = (double) r3
            double r0 = r0 / r7
            int r0 = (int) r0
            int r7 = r0 * 1024
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r7)
            java.lang.String r1 = " by videoSize="
            r0.append(r1)
            r0.append(r14)
            r0.append(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r6.log(r5, r0)
            goto L_0x034a
        L_0x0388:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r7)
            java.lang.String r1 = " by maxBitrateSetting"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.log(r5, r0)
            goto L_0x034a
        L_0x03a0:
            int r12 = java.lang.Math.min(r12, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r22
            r0.append(r1)
            java.lang.String r1 = "; videoSettings maxBitrate="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1 = r21
            goto L_0x03c7
        L_0x03bd:
            r1 = r0
            r17 = r3
            r19 = r7
            r18 = r8
            r20 = r13
            r1 = r9
        L_0x03c7:
            java.lang.Object r1 = r1.i
            zzc r1 = (defpackage.zzc) r1
            if (r27 == 0) goto L_0x03dc
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.util.Map r1 = r1.b
            java.lang.Object r1 = r1.get(r3)
            x7f r1 = (defpackage.x7f) r1
            r3 = 0
            goto L_0x03ea
        L_0x03dc:
            r2 = 1
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.util.Map r1 = r1.b
            java.lang.Object r1 = r1.get(r4)
            x7f r1 = (defpackage.x7f) r1
        L_0x03ea:
            if (r1 == 0) goto L_0x0408
            int r1 = r1.a
            if (r1 <= 0) goto L_0x0408
            int r12 = java.lang.Math.min(r12, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "; videoQualityUpdate b="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
        L_0x0408:
            java.lang.String r1 = "getMaxBitrates() AudioBitrate="
            java.lang.String r4 = " VideoBitrate="
            r13 = r20
            java.lang.String r0 = defpackage.rf0.g(r1, r13, r4, r12, r0)
            r6.log(r5, r0)
            r1 = r24
            b79 r13 = r1.F0
            if (r12 <= 0) goto L_0x0421
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r8 = r0
            goto L_0x0422
        L_0x0421:
            r8 = 0
        L_0x0422:
            if (r19 <= 0) goto L_0x042a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r9 = r0
            goto L_0x042b
        L_0x042a:
            r9 = 0
        L_0x042b:
            if (r18 <= 0) goto L_0x0435
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            r10 = r6
            r0 = r17
            goto L_0x0438
        L_0x0435:
            r0 = r17
            r10 = 0
        L_0x0438:
            java.lang.String r0 = r0.e
            if (r27 == 0) goto L_0x0440
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE
        L_0x043e:
            r11 = r0
            goto L_0x0487
        L_0x0440:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0484
            java.lang.String r0 = r0.toLowerCase()
            r0.getClass()
            r4 = -1
            int r5 = r0.hashCode()
            switch(r5) {
                case 270940796: goto L_0x046d;
                case 1250482734: goto L_0x0462;
                case 1330699787: goto L_0x0457;
                default: goto L_0x0455;
            }
        L_0x0455:
            r0 = r4
            goto L_0x0477
        L_0x0457:
            java.lang.String r2 = "maintain-framerate"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0460
            goto L_0x0455
        L_0x0460:
            r0 = 2
            goto L_0x0477
        L_0x0462:
            java.lang.String r3 = "maintain-resolution"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x046b
            goto L_0x0455
        L_0x046b:
            r0 = r2
            goto L_0x0477
        L_0x046d:
            java.lang.String r2 = "disabled"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0476
            goto L_0x0455
        L_0x0476:
            r0 = r3
        L_0x0477:
            switch(r0) {
                case 0: goto L_0x0481;
                case 1: goto L_0x047e;
                case 2: goto L_0x047b;
                default: goto L_0x047a;
            }
        L_0x047a:
            goto L_0x0484
        L_0x047b:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE
            goto L_0x043e
        L_0x047e:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_RESOLUTION
            goto L_0x043e
        L_0x0481:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.DISABLED
            goto L_0x043e
        L_0x0484:
            org.webrtc.RtpParameters$DegradationPreference r0 = org.webrtc.RtpParameters.DegradationPreference.BALANCED
            goto L_0x043e
        L_0x0487:
            r13.getClass()
            if (r27 == 0) goto L_0x0490
            java.lang.String r0 = "screen-share"
        L_0x048e:
            r2 = r0
            goto L_0x0493
        L_0x0490:
            java.lang.String r0 = "video"
            goto L_0x048e
        L_0x0493:
            r4 = r13
            r5 = r28
            r6 = r2
            r7 = r26
            r4.f(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x049d }
            goto L_0x04ac
        L_0x049d:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "Error on update of sender "
            java.lang.String r0 = r0.concat(r2)
            java.lang.String r2 = "RtpSenderHelper"
            xwb r4 = r13.a
            r4.reportException(r2, r0, r3)
        L_0x04ac:
            r24.v(r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zla.l(org.webrtc.PeerConnection, boolean, boolean, org.webrtc.RtpSender):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [tyf, java.lang.Runnable] */
    public final void m(SessionDescription sessionDescription) {
        this.O0.log("PCRTCClient", "handleSdpCreateSuccess, " + this + ", sdp=" + sessionDescription.type);
        i("handleSdpCreateSuccess", new tyf(this, new mla(this, sessionDescription, 0), 1));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [tyf, java.lang.Runnable] */
    public final void n(SessionDescription sessionDescription, boolean z) {
        this.O0.log("PCRTCClient", "handleSdpSetSuccess, " + this + ", sdp=" + sessionDescription.type + ", local ? " + z);
        i("handleSdpSetSuccess", new tyf(this, new pla(this, z, sessionDescription), 1));
    }

    public final void o(SessionDescription sessionDescription, boolean z, String str) {
        xwb xwb = this.O0;
        xwb.log("PCRTCClient", "handleSdpSetFailure " + sessionDescription.type + " " + z + " " + sessionDescription.description);
        xwb.reportException("PCRTCClient", wn6.l(new StringBuilder("set."), z ? "local" : "remote", ".sdp.failed"), new Exception(str));
        i("onSetFailure", new kla(this, str, 0));
    }

    public final void p(boolean z) {
        wka wka;
        this.m1 = true;
        this.q1 = false;
        this.p1 = false;
        this.d1 = null;
        this.t1.f();
        ocd ocd = this.H0;
        if (!(ocd == null || (wka = ocd.j) == null)) {
            wka.Y.remove(this);
        }
        this.G0.removeCallbacksAndMessages((Object) null);
        if (z) {
            i("releaseInternal", new ola(this, 7));
        } else {
            i("closeInternal", new ola(this, 8));
        }
    }

    public final void q() {
        az3 az3;
        xwb xwb = this.O0;
        xwb.log("PCRTCClient", "closeInternal, " + this);
        this.f1 = null;
        this.e1 = null;
        this.g1 = null;
        this.i1 = null;
        jl7 jl7 = this.k1;
        if (jl7 != null) {
            if (jl7.v == this) {
                jl7.v = null;
                noc noc = jl7.u;
                if (noc != null) {
                    noc.b.c(new sbc(noc, 10, (Object) null));
                }
            }
            this.k1.c.remove(this);
            this.k1 = null;
        }
        dhc dhc = this.S0;
        if (dhc != null && dhc.j.compareAndSet(false, true)) {
            dhc.g.removeCallbacksAndMessages((Object) null);
            Handler handler = dhc.f;
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(new t50(12, dhc));
            dhc.e.quitSafely();
        }
        km4 km4 = this.T0;
        if (km4 != null && ((AtomicBoolean) km4.Z).compareAndSet(false, true)) {
            Handler handler2 = (Handler) km4.X;
            handler2.removeCallbacksAndMessages((Object) null);
            handler2.post(new t50(13, km4));
            ((HandlerThread) km4.o).quitSafely();
        }
        b0d b0d = this.c;
        if (!(b0d == null || (az3 = (az3) b0d.b) == null)) {
            owf owf = (owf) b0d.c;
            if (owf != null) {
                az3.c(owf);
            }
            b0d.b = null;
            b0d.c = null;
        }
        dhc dhc2 = this.S0;
        if (dhc2 != null) {
            try {
                dhc2.e.join(500);
            } catch (InterruptedException e) {
                this.O0.reportException("PCRTCClient", "command.exec.shutdown", e);
            }
        }
        km4 km42 = this.T0;
        if (km42 != null) {
            try {
                ((HandlerThread) km42.o).join((long) 500);
            } catch (InterruptedException e2) {
                this.O0.reportException("PCRTCClient", "notif.recv.shutdown", e2);
            }
        }
        koc koc = this.b;
        if (koc != null) {
            koc.f = true;
            for (nxf nxf : koc.a.values()) {
                if (nxf != null) {
                    nxf.a();
                }
            }
            az3 az32 = koc.d;
            if (az32 != null) {
                owf owf2 = koc.g;
                if (owf2 != null) {
                    az32.c(owf2);
                }
                koc.d = null;
                koc.g = null;
            }
        }
        ni niVar = this.z0;
        if (niVar != null) {
            az3 az33 = niVar.c;
            if (az33 != null) {
                az33.c(niVar);
            }
            niVar.c = null;
        }
        kj kjVar = this.x0;
        if (kjVar != null) {
            kjVar.b();
        }
        kj kjVar2 = this.x0;
        if (kjVar2 != null) {
            kjVar2.b();
        }
        ni niVar2 = this.z0;
        if (niVar2 != null) {
            az3 az34 = niVar2.c;
            if (az34 != null) {
                az34.c(niVar2);
            }
            niVar2.c = null;
        }
        if (this.Z0 != null) {
            this.Z0.dispose();
            xwb xwb2 = this.O0;
            xwb2.log("PCRTCClient", this + ": " + d59.c(this.Z0) + " was disposed");
            this.Z0 = null;
        }
        xwb xwb3 = this.O0;
        xwb3.log("PCRTCClient", this + ": " + d59.c(this) + " was closed");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [tyf, java.lang.Runnable] */
    public final void r(IceCandidate iceCandidate) {
        this.O0.log("PCRTCClient", "addRemoteIceCandidate, " + this);
        i("addRemoteIceCandidate", new tyf(this, new nla(this, iceCandidate, 0), 1));
    }

    public final void s(cc9 cc9) {
        onc onc = this.u1;
        if (onc != null) {
            boolean z = cc9.b;
            if (z != this.o1) {
                this.o1 = z;
                i("screenCaptureEnable", new px4(this, cc9, onc, 21));
                return;
            }
            return;
        }
        this.O0.reportException("PCRTCClient", "No permission provider passed", new IllegalStateException("No permission provider passed"));
    }

    public final void t() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        this.b1 = mediaConstraints;
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("DtlsSrtpKeyAgreement", "true"));
        if (this.L0 == 2) {
            this.O0.log("PCRTCClient", this + ": video capture is disabled.");
        }
        this.c1 = new MediaConstraints();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        boolean z = d59.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append('@');
        int i = this.L0;
        sb.append(i != 0 ? i != 1 ? i != 2 ? "?" : "Receive" : "Send" : "SendReceive");
        sb.append("PeerConnection@");
        PeerConnection peerConnection = this.Z0;
        sb.append(peerConnection != null ? Integer.toString(System.identityHashCode(peerConnection)) : "Ø");
        return sb.toString();
    }

    public final void u(PeerConnection peerConnection, boolean z) {
        xwb xwb = this.O0;
        try {
            l(peerConnection, z, false, this.e1);
        } catch (IllegalStateException e) {
            xwb.log("PCRTCClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            xwb.log("PCRTCClient", "Exception, " + this + " ex=" + e2);
        }
    }

    public final void v(PeerConnection peerConnection) {
        b79 b79 = this.F0;
        b79.getClass();
        int g = b79.g(this.i1) + b79.g(this.e1) + b79.g(this.g1) + b79.g(this.f1);
        peerConnection.setBitrate(6000, (Integer) null, Integer.valueOf(g));
        this.O0.log("PCRTCClient", "Bitrate constraints were set to [6000:" + g + "]");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [tyf, java.lang.Runnable] */
    public final void w() {
        xwb xwb = this.O0;
        xwb.log("PCRTCClient", "createAnswer, " + this);
        this.q1 = false;
        i("createAnswer", new tyf(this, new rla(this, 1), 1));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [tyf, java.lang.Runnable] */
    public final void x(boolean z) {
        xwb xwb = this.O0;
        xwb.log("PCRTCClient", "createOffer, " + this + " iceRestart=" + z);
        this.q1 = false;
        i("createOffer", new tyf(this, new jla(this, z, 0), 1));
    }

    public final void y(List list) {
        if (C1 == null) {
            this.O0.log("PCRTCClient", "Creating peer connection without initializing factory.");
        } else if (this.n1) {
            xwb xwb = this.O0;
            xwb.log("PCRTCClient", this + ": creation of a peer connection is already scheduled");
        } else {
            this.n1 = true;
            i("createPeerConnection", new hg9(this, 11, list));
        }
    }

    public final void z() {
        xwb xwb = this.O0;
        xwb.log("PCRTCClient", "createPeerConnectionInternal, " + this);
        if (this.a1) {
            xwb xwb2 = this.O0;
            xwb2.log("PCRTCClient", this + ": fatal error occurred");
            return;
        }
        PeerConnectionFactory peerConnectionFactory = this.H0.d;
        if (peerConnectionFactory == null) {
            xwb xwb3 = this.O0;
            xwb3.log("PCRTCClient", this + ": no peer connection factory");
            return;
        }
        xwb xwb4 = this.O0;
        xwb4.log("PCRTCClient", this + ": peer connection constraints: " + this.b1.toString());
        PeerConnection.RTCConfiguration g = g(this.h1);
        if ((this.K0 == null || dia.X.get() != dia.o) && this.J0 == null) {
            this.G0.post(new eq6(23, new RuntimeException()));
        }
        this.Z0 = peerConnectionFactory.createPeerConnection(g, this.b1, (PeerConnection.Observer) new ula(this));
        if (this.Z0 != null) {
            if (this.L0 != 2) {
                jl7 jl7 = (jl7) this.I0.a().b;
                this.k1 = jl7;
                if (jl7 != null) {
                    xwb xwb5 = this.O0;
                    xwb5.log("PCRTCClient", this + ": has " + d59.c(this.k1));
                    org.webrtc.Size h = this.k1.h();
                    this.C0 = h.width;
                    this.D0 = h.height;
                    pnc pnc = this.k1.t;
                    this.B0 = pnc != null ? pnc.f : 0;
                    pnc pnc2 = this.k1.t;
                    this.A0 = pnc2 != null ? pnc2.g : 0;
                    nw3 nw3 = this.s1;
                    nw3.f = this.D0;
                    nw3.c = this.C0;
                    pnc pnc3 = this.k1.t;
                    nw3.h = pnc3 != null ? pnc3.f : 0;
                    nw3 nw32 = this.s1;
                    pnc pnc4 = this.k1.t;
                    nw32.g = pnc4 != null ? pnc4.g : 0;
                    PeerConnection peerConnection = this.Z0;
                    jl7 jl72 = this.k1;
                    List singletonList = Collections.singletonList(jl72.m);
                    l50 l50 = jl72.i;
                    AudioTrack audioTrack = l50 != null ? (AudioTrack) ((MediaStreamTrack) l50.X) : null;
                    if (audioTrack != null) {
                        b79 b79 = this.F0;
                        RtpSender addTrack = peerConnection.addTrack(audioTrack, singletonList);
                        b79.c(addTrack, MediaStreamTrack.AUDIO_TRACK_KIND);
                        this.f1 = addTrack;
                    }
                    VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) jl72.y.X);
                    if (videoTrack != null) {
                        b79 b792 = this.F0;
                        RtpSender addTrack2 = peerConnection.addTrack(videoTrack, singletonList);
                        b792.d(addTrack2, MediaStreamTrack.VIDEO_TRACK_KIND, 30000, 2048000, (Double) null, false);
                        this.e1 = addTrack2;
                    }
                    v(peerConnection);
                    RtpSender rtpSender = this.e1;
                    if (this.v1 && rtpSender != null) {
                        rtpSender.setVideoEncoderObserver(new xp0(this, true));
                    }
                    xwb xwb6 = this.O0;
                    xwb6.log("PCRTCClient", this + ": " + d59.c(this.f1) + "(audio) created");
                    xwb xwb7 = this.O0;
                    xwb7.log("PCRTCClient", this + ": " + d59.c(this.e1) + "(video) created");
                    F();
                    this.k1.c.add(this);
                    if (this.y1) {
                        jl7 jl73 = this.k1;
                        az3 c2 = c("consumerScreenShare", new DataChannel.Init());
                        kl7 kl7 = jl73.v;
                        if (kl7 != null) {
                            zla zla = (zla) kl7;
                            zla.O0.log("PCRTCClient", "Data channel screen capturer unbound from " + zla);
                        }
                        jl73.v = this;
                        this.O0.log("PCRTCClient", "Data channel screen capturer bound to " + this);
                        noc noc = jl73.u;
                        if (noc == null) {
                            noc = new noc(jl73.a, jl73.d.getApplicationContext(), jl73.n, jl73.E, jl73.C);
                            jl73.u = noc;
                        }
                        noc.b.c(new sbc(noc, 10, c2));
                    }
                }
            }
            if (this.S0 != null) {
                az3 c3 = c("producerCommand", new DataChannel.Init());
                dhc dhc = this.S0;
                if (!dhc.j.get()) {
                    dhc.f.post(new sbc(dhc, 6, c3));
                } else {
                    throw new IllegalStateException("Instance is disposed");
                }
            }
            if (this.T0 != null) {
                az3 c4 = c("producerNotification", new DataChannel.Init());
                km4 km4 = this.T0;
                if (!((AtomicBoolean) km4.Z).get()) {
                    ((Handler) km4.X).post(new sbc(km4, 7, c4));
                } else {
                    throw new IllegalStateException("Instance is disposed");
                }
            }
            koc koc = this.b;
            if (koc != null) {
                az3 c5 = c("producerScreenShare", new DataChannel.Init());
                az3 az3 = koc.d;
                if (az3 != null) {
                    owf owf = koc.g;
                    if (owf != null) {
                        az3.c(owf);
                    }
                    koc.d = null;
                    koc.g = null;
                }
                koc.d = c5;
                owf owf2 = new owf(3, koc);
                koc.g = owf2;
                c5.a(owf2);
            }
            if (this.c != null) {
                az3 c6 = c("asr", new DataChannel.Init());
                b0d b0d = this.c;
                az3 az32 = (az3) b0d.b;
                if (az32 != null) {
                    owf owf3 = (owf) b0d.c;
                    if (owf3 != null) {
                        az32.c(owf3);
                    }
                    b0d.b = null;
                    b0d.c = null;
                }
                b0d.b = c6;
                owf owf4 = new owf(1, b0d);
                b0d.c = owf4;
                c6.a(owf4);
            }
            int i = this.z1;
            if (i == 1 || i == 3) {
                DataChannel.Init init = new DataChannel.Init();
                if (this.z1 == 3) {
                    init.id = 1;
                    init.negotiated = true;
                }
                az3 c7 = c("animoji", init);
                kj kjVar = this.x0;
                if (kjVar != null) {
                    kjVar.d(c7);
                }
                ni niVar = this.z0;
                if (niVar != null) {
                    az3 az33 = niVar.c;
                    if (az33 != null) {
                        az33.c(niVar);
                    }
                    niVar.c = c7;
                    h2d h2d = niVar.b;
                    ((AtomicInteger) h2d.X).set(0);
                    ((AtomicInteger) h2d.Y).set(0);
                    c7.a(niVar);
                }
            }
            xwb xwb8 = this.O0;
            xwb8.log("PCRTCClient", this + ": peer connection created");
            return;
        }
        throw new IllegalStateException("peerconnection is null");
    }
}
