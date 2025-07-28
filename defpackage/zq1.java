package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: zq1  reason: default package */
public final class zq1 implements ot1 {
    public final xq1 b;
    public final Executor c;
    public final Object d = new Object();
    public final et1 e;
    public final nfc f;
    public final y1d g;
    public final bp5 h;
    public final pd i;
    public final ene j;
    public final ud k;
    public final ewf l;
    public final ew0 m;
    public final w30 n;
    public final s5c o;
    public int p;
    public aq6 q;
    public volatile boolean r;
    public volatile int s;
    public final nfc t;
    public final kp0 u;
    public final AtomicLong v;
    public volatile ch7 w;
    public int x;
    public long y;
    public final wq1 z;

    /* JADX WARNING: type inference failed for: r0v1, types: [x1d, y1d] */
    /* JADX WARNING: type inference failed for: r10v7, types: [pd, java.lang.Object] */
    public zq1(et1 et1, vd6 vd6, ryc ryc, nfc nfc, xe6 xe6) {
        ? x1d = new x1d();
        this.g = x1d;
        this.p = 0;
        this.r = false;
        this.s = 2;
        this.v = new AtomicLong(0);
        this.w = as6.c;
        this.x = 1;
        this.y = 0;
        wq1 wq1 = new wq1();
        wq1.b = new HashSet();
        wq1.c = new ArrayMap();
        this.z = wq1;
        this.e = et1;
        this.f = nfc;
        this.c = ryc;
        this.o = new s5c(ryc);
        xq1 xq1 = new xq1(ryc);
        this.b = xq1;
        x1d.b.c = this.x;
        x1d.b.b(new ow1(xq1));
        x1d.b.b(wq1);
        this.k = new ud(this, ryc);
        this.h = new bp5(this, vd6, ryc, xe6);
        ? obj = new Object();
        obj.a = false;
        tvf tvf = new tvf(obj);
        obj.b = this;
        obj.c = ryc;
        uvf b2 = pd.b(et1);
        obj.Y = b2;
        zvf zvf = new zvf(b2.b(), b2.c());
        obj.o = zvf;
        zvf.f(1.0f);
        obj.X = new yh7(r90.e(zvf));
        p(tvf);
        this.i = obj;
        this.j = new ene(this, et1, ryc);
        this.l = new ewf(et1);
        this.t = new nfc(xe6);
        this.u = new kp0(xe6, 2);
        this.m = new ew0(this, ryc);
        this.n = new w30(this, et1, xe6, ryc, vd6);
    }

    public static int t(et1 et1, int i2) {
        int[] iArr = (int[]) et1.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return w(i2, iArr) ? i2 : w(1, iArr) ? 1 : 0;
    }

    public static boolean w(int i2, int[] iArr) {
        for (int i3 : iArr) {
            if (i2 == i3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r4 = (java.lang.Long) ((defpackage.s9e) r4).a.get("CameraControlSessionUpdateId");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean x(android.hardware.camera2.TotalCaptureResult r4, long r5) {
        /*
            android.hardware.camera2.CaptureRequest r0 = r4.getRequest()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
            java.lang.Object r4 = r4.getTag()
            boolean r0 = r4 instanceof defpackage.s9e
            if (r0 == 0) goto L_0x002d
            s9e r4 = (defpackage.s9e) r4
            java.util.Map r4 = r4.a
            java.lang.String r0 = "CameraControlSessionUpdateId"
            java.lang.Object r4 = r4.get(r0)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x0023
            return r1
        L_0x0023:
            long r2 = r4.longValue()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x002d
            r4 = 1
            return r4
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq1.x(android.hardware.camera2.TotalCaptureResult, long):boolean");
    }

    public final long A() {
        this.y = this.v.getAndIncrement();
        ((lr1) this.f.b).K();
        return this.y;
    }

    public final void a() {
        s5c s5c = this.o;
        s5c.getClass();
        ((Executor) s5c.b).execute(new z8f(s5c, 0));
    }

    public final ch7 b(float f2) {
        ch7 ch7;
        r90 e2;
        if (!v()) {
            return new as6(1, new Exception("Camera is not active."));
        }
        pd pdVar = this.i;
        synchronized (((zvf) pdVar.o)) {
            try {
                ((zvf) pdVar.o).e(f2);
                e2 = r90.e((zvf) pdVar.o);
            } catch (IllegalArgumentException e3) {
                ch7 = new as6(1, e3);
            }
        }
        pdVar.h(e2);
        ch7 = hwf.f(new rvf(pdVar, e2, 1));
        return ct0.A(ch7);
    }

    public final void c(ia3 ia3) {
        ew0 ew0 = this.m;
        mv4 p2 = lv1.q(ia3).p();
        synchronized (ew0.X) {
            mv4 mv4 = (mv4) ew0.Z;
            mv4.getClass();
            ha3 ha3 = ha3.o;
            for (z80 z80 : p2.f()) {
                ((fc9) mv4.b).g(z80, ha3, p2.h(z80));
            }
        }
        ct0.A(hwf.f(new rq1(ew0, 0))).c(new lc(5), pa2.j());
    }

    public final ch7 d(float f2) {
        ch7 ch7;
        r90 e2;
        if (!v()) {
            return new as6(1, new Exception("Camera is not active."));
        }
        pd pdVar = this.i;
        synchronized (((zvf) pdVar.o)) {
            try {
                ((zvf) pdVar.o).f(f2);
                e2 = r90.e((zvf) pdVar.o);
            } catch (IllegalArgumentException e3) {
                ch7 = new as6(1, e3);
            }
        }
        pdVar.h(e2);
        ch7 = hwf.f(new rvf(pdVar, e2, 0));
        return ct0.A(ch7);
    }

    public final Rect e() {
        Rect rect = (Rect) this.e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    public final void f(int i2) {
        if (v()) {
            this.s = i2;
            ewf ewf = this.l;
            boolean z2 = true;
            if (!(this.s == 1 || this.s == 0)) {
                z2 = false;
            }
            ewf.d = z2;
            this.w = ct0.A(hwf.f(new rgc(22, this)));
        }
    }

    public final void g(aq6 aq6) {
        this.q = aq6;
    }

    public final ch7 h(ws4 ws4) {
        if (!v()) {
            return new as6(1, new Exception("Camera is not active."));
        }
        bp5 bp5 = this.h;
        bp5.getClass();
        return ct0.A(hwf.f(new b52(bp5, ws4)));
    }

    public final ch7 i(ArrayList arrayList, int i2, int i3) {
        if (!v()) {
            return new as6(1, new Exception("Camera is not active."));
        }
        int i4 = this.s;
        j36 a = j36.a(ct0.A(this.w));
        uq1 uq1 = new uq1(this, arrayList, i2, i4, i3);
        Executor executor = this.c;
        a.getClass();
        return ct0.N(a, uq1, executor);
    }

    public final void j(y1d y1d) {
        HashMap hashMap;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        ewf ewf = this.l;
        et1 et1 = ewf.a;
        while (true) {
            fwf fwf = ewf.b;
            if (fwf.g()) {
                break;
            }
            ((lr6) fwf.d()).close();
        }
        cs6 cs6 = ewf.i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (cs6 != null) {
            yic yic = ewf.g;
            if (yic != null) {
                ct0.A(cs6.e).c(new rw1(yic, 2), pa2.A());
                ewf.g = null;
            }
            cs6.a();
            ewf.i = null;
        }
        ImageWriter imageWriter = ewf.j;
        if (imageWriter != null) {
            imageWriter.close();
            ewf.j = null;
        }
        boolean z2 = ewf.c;
        w30 w30 = y1d.b;
        if (z2) {
            w30.c = 1;
        } else if (ewf.f) {
            w30.c = 1;
        } else {
            try {
                streamConfigurationMap2 = (StreamConfigurationMap) et1.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            } catch (AssertionError e2) {
                e2.getMessage();
            }
            if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
                hashMap = new HashMap();
            } else {
                hashMap = new HashMap();
                for (int i2 : streamConfigurationMap2.getInputFormats()) {
                    Size[] inputSizes = streamConfigurationMap2.getInputSizes(i2);
                    if (inputSizes != null) {
                        Arrays.sort(inputSizes, new d63(true));
                        hashMap.put(Integer.valueOf(i2), inputSizes[0]);
                    }
                }
            }
            if (ewf.e && !hashMap.isEmpty() && hashMap.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) et1.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
                for (int i3 : validOutputFormatsForInput) {
                    if (i3 == 256) {
                        Size size = (Size) hashMap.get(34);
                        d39 d39 = new d39(size.getWidth(), size.getHeight(), 34, 9);
                        ewf.h = d39.b;
                        ewf.g = new yic(d39);
                        d39.j(new xle(22, ewf), pa2.u());
                        cs6 cs62 = new cs6(ewf.g.getSurface(), new Size(ewf.g.getWidth(), ewf.g.getHeight()), 34);
                        ewf.i = cs62;
                        yic yic2 = ewf.g;
                        ch7 A = ct0.A(cs62.e);
                        Objects.requireNonNull(yic2);
                        A.c(new rw1(yic2, 2), pa2.A());
                        y1d.b(ewf.i, zq4.d, -1);
                        sw1 sw1 = ewf.h;
                        w30.b(sw1);
                        ArrayList arrayList = y1d.e;
                        if (!arrayList.contains(sw1)) {
                            arrayList.add(sw1);
                        }
                        ys1 ys1 = new ys1(2, ewf);
                        ArrayList arrayList2 = y1d.d;
                        if (!arrayList2.contains(ys1)) {
                            arrayList2.add(ys1);
                        }
                        y1d.g = new InputConfiguration(ewf.g.getWidth(), ewf.g.getHeight(), ewf.g.f());
                        return;
                    }
                }
            }
            w30.c = 1;
        }
    }

    public final ch7 k(boolean z2) {
        ch7 ch7;
        if (!v()) {
            return new as6(1, new Exception("Camera is not active."));
        }
        ene ene = this.j;
        if (!ene.c) {
            ch7 = new as6(1, new IllegalStateException("No flash unit"));
        } else {
            ene.b(ene.b, Integer.valueOf(z2 ? 1 : 0));
            ch7 = hwf.f(new eb4(ene, z2, 5));
        }
        return ct0.A(ch7);
    }

    public final ch7 l(int i2, int i3) {
        if (!v()) {
            return new as6(1, new Exception("Camera is not active."));
        }
        int i4 = this.s;
        j36 a = j36.a(ct0.A(this.w));
        vq1 vq1 = new vq1(this, i2, i4, i3);
        Executor executor = this.c;
        a.getClass();
        return ct0.N(a, vq1, executor);
    }

    public final ia3 m() {
        mv4 mv4;
        ew0 ew0 = this.m;
        synchronized (ew0.X) {
            mv4 mv42 = (mv4) ew0.Z;
            mv42.getClass();
            mv4 = new mv4(7, hga.a((fc9) mv42.b));
        }
        return mv4;
    }

    public final void n() {
        ew0 ew0 = this.m;
        synchronized (ew0.X) {
            ew0.Z = new mv4(6);
        }
        ct0.A(hwf.f(new rq1(ew0, 1))).c(new lc(5), pa2.j());
    }

    public final void o() {
        s5c s5c = this.o;
        s5c.getClass();
        ((Executor) s5c.b).execute(new z8f(s5c, 1));
    }

    public final void p(yq1 yq1) {
        ((HashSet) this.b.b).add(yq1);
    }

    public final void q() {
        synchronized (this.d) {
            try {
                int i2 = this.p;
                if (i2 != 0) {
                    this.p = i2 - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(boolean z2) {
        this.r = z2;
        if (!z2) {
            w30 w30 = new w30();
            w30.c = this.x;
            w30.b = true;
            fc9 c2 = fc9.c();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            c2.j(js1.Q(key), Integer.valueOf(t(this.e, 1)));
            c2.j(js1.Q(CaptureRequest.FLASH_MODE), 0);
            w30.c(new mv4(7, hga.a(c2)));
            z(Collections.singletonList(w30.d()));
        }
        A();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final defpackage.c2d s() {
        /*
            r9 = this;
            y1d r0 = r9.g
            int r1 = r9.x
            w30 r2 = r0.b
            r2.c = r1
            mv4 r1 = new mv4
            r2 = 6
            r1.<init>(r2)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.P(r2, r4)
            bp5 r2 = r9.h
            boolean r4 = r2.g
            r5 = 3
            if (r4 == 0) goto L_0x0021
            r4 = r3
            goto L_0x0028
        L_0x0021:
            int r4 = r2.n
            if (r4 == r5) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = r5
        L_0x0028:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            zq1 r7 = r2.a
            int r4 = r7.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.P(r6, r4)
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.q
            int r6 = r4.length
            if (r6 == 0) goto L_0x0041
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            r1.P(r6, r4)
        L_0x0041:
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.r
            int r6 = r4.length
            if (r6 == 0) goto L_0x004b
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            r1.P(r6, r4)
        L_0x004b:
            android.hardware.camera2.params.MeteringRectangle[] r2 = r2.s
            int r4 = r2.length
            if (r4 == 0) goto L_0x0055
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS
            r1.P(r4, r2)
        L_0x0055:
            nfc r2 = r9.t
            java.lang.Object r2 = r2.b
            android.util.Range r2 = (android.util.Range) r2
            if (r2 == 0) goto L_0x0062
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r1.P(r4, r2)
        L_0x0062:
            pd r2 = r9.i
            java.lang.Object r2 = r2.Y
            uvf r2 = (defpackage.uvf) r2
            r2.e(r1)
            bp5 r2 = r9.h
            boolean r2 = r2.v
            if (r2 == 0) goto L_0x0073
            r2 = 5
            goto L_0x0074
        L_0x0073:
            r2 = r3
        L_0x0074:
            boolean r4 = r9.r
            r6 = 2
            if (r4 == 0) goto L_0x0083
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r1.P(r4, r5)
            goto L_0x008b
        L_0x0083:
            int r4 = r9.s
            if (r4 == 0) goto L_0x008f
            if (r4 == r3) goto L_0x009b
            if (r4 == r6) goto L_0x008d
        L_0x008b:
            r5 = r2
            goto L_0x009b
        L_0x008d:
            r5 = r3
            goto L_0x009b
        L_0x008f:
            kp0 r2 = r9.u
            boolean r4 = r2.a
            if (r4 != 0) goto L_0x008d
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x009a
            goto L_0x008d
        L_0x009a:
            r5 = r6
        L_0x009b:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            et1 r4 = r9.e
            int r4 = t(r4, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.P(r2, r4)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            et1 r4 = r9.e
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES
            java.lang.Object r4 = r4.a(r5)
            int[] r4 = (int[]) r4
            r5 = 0
            if (r4 != 0) goto L_0x00bb
        L_0x00b9:
            r3 = r5
            goto L_0x00c8
        L_0x00bb:
            boolean r6 = w(r3, r4)
            if (r6 == 0) goto L_0x00c2
            goto L_0x00c8
        L_0x00c2:
            boolean r4 = w(r3, r4)
            if (r4 == 0) goto L_0x00b9
        L_0x00c8:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.P(r2, r3)
            ud r2 = r9.k
            r2.getClass()
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            java.lang.Object r2 = r2.c
            og0 r2 = (defpackage.og0) r2
            java.lang.Object r4 = r2.c
            monitor-enter(r4)
            int r2 = r2.b     // Catch:{ all -> 0x014f }
            monitor-exit(r4)     // Catch:{ all -> 0x014f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.P(r3, r2)
            ew0 r2 = r9.m
            java.lang.Object r3 = r2.X
            monitor-enter(r3)
            java.lang.Object r2 = r2.Z     // Catch:{ all -> 0x014c }
            mv4 r2 = (mv4) r2     // Catch:{ all -> 0x014c }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x014c }
            fc9 r2 = (defpackage.fc9) r2     // Catch:{ all -> 0x014c }
            ha3 r4 = defpackage.ha3.a     // Catch:{ all -> 0x014c }
            java.util.Set r5 = r2.f()     // Catch:{ all -> 0x014c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x014c }
        L_0x00fe:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x014c }
            if (r6 == 0) goto L_0x0116
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x014c }
            z80 r6 = (defpackage.z80) r6     // Catch:{ all -> 0x014c }
            java.lang.Object r7 = r1.b     // Catch:{ all -> 0x014c }
            fc9 r7 = (defpackage.fc9) r7     // Catch:{ all -> 0x014c }
            java.lang.Object r8 = r2.h(r6)     // Catch:{ all -> 0x014c }
            r7.g(r6, r4, r8)     // Catch:{ all -> 0x014c }
            goto L_0x00fe
        L_0x0116:
            monitor-exit(r3)     // Catch:{ all -> 0x014c }
            js1 r2 = new js1
            java.lang.Object r1 = r1.b
            fc9 r1 = (defpackage.fc9) r1
            hga r1 = defpackage.hga.a(r1)
            r3 = 7
            r2.<init>(r3, r1)
            w30 r0 = r0.b
            r0.getClass()
            fc9 r1 = defpackage.fc9.e(r2)
            r0.f = r1
            y1d r0 = r9.g
            java.lang.String r1 = "CameraControlSessionUpdateId"
            long r2 = r9.y
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            w30 r0 = r0.b
            java.lang.Object r0 = r0.g
            nc9 r0 = (defpackage.nc9) r0
            java.util.Map r0 = r0.a
            r0.put(r1, r2)
            y1d r9 = r9.g
            c2d r9 = r9.c()
            return r9
        L_0x014c:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x014c }
            throw r9
        L_0x014f:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x014f }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq1.s():c2d");
    }

    public final int u(int i2) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (w(i2, iArr)) {
            return i2;
        }
        if (w(4, iArr)) {
            return 4;
        }
        return w(1, iArr) ? 1 : 0;
    }

    public final boolean v() {
        int i2;
        synchronized (this.d) {
            i2 = this.p;
        }
        return i2 > 0;
    }

    public final void y(boolean z2) {
        r90 e2;
        bp5 bp5 = this.h;
        if (z2 != bp5.d) {
            bp5.d = z2;
            if (!bp5.d) {
                bp5.b();
            }
        }
        pd pdVar = this.i;
        if (pdVar.a != z2) {
            pdVar.a = z2;
            if (!z2) {
                synchronized (((zvf) pdVar.o)) {
                    ((zvf) pdVar.o).f(1.0f);
                    e2 = r90.e((zvf) pdVar.o);
                }
                pdVar.h(e2);
                ((uvf) pdVar.Y).l();
                ((zq1) pdVar.b).A();
            }
        }
        ene ene = this.j;
        if (ene.e != z2) {
            ene.e = z2;
            if (!z2) {
                if (ene.g) {
                    ene.g = false;
                    ene.a.r(false);
                    ene.b(ene.b, 0);
                }
                sn1 sn1 = ene.f;
                if (sn1 != null) {
                    sn1.d(new Exception("Camera is not active."));
                    ene.f = null;
                }
            }
        }
        ud udVar = this.k;
        if (z2 != udVar.b) {
            udVar.b = z2;
            if (!z2) {
                og0 og0 = (og0) udVar.c;
                synchronized (og0.c) {
                    og0.b = 0;
                }
            }
        }
        ew0 ew0 = this.m;
        ew0.getClass();
        ((Executor) ew0.o).execute(new t50((Object) ew0, z2, 6));
        if (!z2) {
            this.q = null;
            ((AtomicInteger) this.o.c).set(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0078, code lost:
        r7 = r3.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(java.util.List r21) {
        /*
            r20 = this;
            r0 = r20
            nfc r0 = r0.f
            r0.getClass()
            r21.getClass()
            java.lang.Object r0 = r0.b
            lr1 r0 = (defpackage.lr1) r0
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r21.iterator()
        L_0x001a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x018b
            java.lang.Object r3 = r2.next()
            pw1 r3 = (defpackage.pw1) r3
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            defpackage.fc9.c()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            defpackage.nc9.a()
            java.util.List r6 = r3.a
            r4.addAll(r6)
            ia3 r6 = r3.b
            fc9 r6 = defpackage.fc9.e(r6)
            java.util.List r7 = r3.e
            r5.addAll(r7)
            android.util.ArrayMap r7 = new android.util.ArrayMap
            r7.<init>()
            s9e r8 = r3.g
            java.util.Map r9 = r8.a
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0057:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x006d
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.util.Map r11 = r8.a
            java.lang.Object r11 = r11.get(r10)
            r7.put(r10, r11)
            goto L_0x0057
        L_0x006d:
            nc9 r8 = new nc9
            r8.<init>(r7)
            r7 = 5
            int r9 = r3.c
            r10 = 0
            if (r9 != r7) goto L_0x007f
            ws1 r7 = r3.h
            if (r7 == 0) goto L_0x007f
            r19 = r7
            goto L_0x0081
        L_0x007f:
            r19 = r10
        L_0x0081:
            java.util.List r7 = r3.a
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x013c
            boolean r7 = r3.f
            if (r7 == 0) goto L_0x013c
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x0098
            goto L_0x001a
        L_0x0098:
            x3a r7 = r0.a
            r7.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r7 = r7.b
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00ae:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00d4
            java.lang.Object r10 = r7.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getValue()
            nye r11 = (defpackage.nye) r11
            boolean r12 = r11.f
            if (r12 == 0) goto L_0x00ae
            boolean r11 = r11.e
            if (r11 == 0) goto L_0x00ae
            java.lang.Object r10 = r10.getValue()
            nye r10 = (defpackage.nye) r10
            c2d r10 = r10.a
            r9.add(r10)
            goto L_0x00ae
        L_0x00d4:
            java.util.Collection r7 = java.util.Collections.unmodifiableCollection(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x00dc:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0134
            java.lang.Object r9 = r7.next()
            c2d r9 = (defpackage.c2d) r9
            pw1 r9 = r9.g
            java.util.List r10 = r9.a
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00dc
            int r11 = r9.b()
            if (r11 == 0) goto L_0x010b
            int r11 = r9.b()
            if (r11 == 0) goto L_0x010b
            z80 r12 = defpackage.pye.t0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6.j(r12, r11)
        L_0x010b:
            int r11 = r9.c()
            if (r11 == 0) goto L_0x0120
            int r9 = r9.c()
            if (r9 == 0) goto L_0x0120
            z80 r11 = defpackage.pye.u0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.j(r11, r9)
        L_0x0120:
            java.util.Iterator r9 = r10.iterator()
        L_0x0124:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00dc
            java.lang.Object r10 = r9.next()
            xc4 r10 = (defpackage.xc4) r10
            r4.add(r10)
            goto L_0x0124
        L_0x0134:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x013c
            goto L_0x001a
        L_0x013c:
            pw1 r7 = new pw1
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r4)
            hga r13 = defpackage.hga.a(r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
            s9e r5 = defpackage.s9e.b
            android.util.ArrayMap r5 = new android.util.ArrayMap
            r5.<init>()
            java.util.Map r6 = r8.a
            java.util.Set r8 = r6.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x015d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0171
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r6.get(r9)
            r5.put(r9, r10)
            goto L_0x015d
        L_0x0171:
            s9e r6 = new s9e
            r6.<init>(r5)
            int r14 = r3.c
            boolean r15 = r3.d
            boolean r3 = r3.f
            r11 = r7
            r16 = r4
            r17 = r3
            r18 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r1.add(r7)
            goto L_0x001a
        L_0x018b:
            r0.toString()
            ww1 r0 = r0.A0
            r0.j(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq1.z(java.util.List):void");
    }
}
