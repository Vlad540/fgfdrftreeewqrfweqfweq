package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.hardware.fingerprint.FingerprintManager;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import me.leolin.shortcutbadger.BuildConfig;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* renamed from: qe4  reason: default package */
public final class qe4 implements k7d, i36, pg6, bj6, nm6, el8, nbc, nr6 {
    public static final qe4 o = new qe4(1);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ qe4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void A(long j, boolean z) {
        ((i26) this.b).invoke(Long.valueOf(j), Boolean.valueOf(z));
    }

    public void B(String str) {
        v2b v2b;
        boolean z;
        if (str != null && !h0e.c0(str)) {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject("commands");
                if (optJSONObject != null && (v2b = (v2b) this.c) != null) {
                    long optLong = optJSONObject.optLong("globalShutdownMs");
                    Long valueOf = Long.valueOf(optJSONObject.optLong("featureShutdownMs"));
                    String str2 = (String) this.b;
                    if (str2 == null) {
                        valueOf = null;
                    }
                    optJSONObject.optLong("tagShutdownMs");
                    SharedPreferences.Editor edit = v2b.l().edit();
                    boolean z2 = true;
                    if (optLong > 0) {
                        edit.putLong("system.shutdown.until.ts", System.currentTimeMillis() + optLong);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (str2 == null || valueOf == null || valueOf.longValue() <= 0) {
                        z2 = z;
                    } else {
                        edit.putLong(wn6.i("system.", str2, ".shutdown.until.ts"), valueOf.longValue() + System.currentTimeMillis());
                    }
                    if (z2) {
                        edit.apply();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean C(String str) {
        boolean z = true;
        pec a2 = pec.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        aec aec = (aec) this.b;
        aec.b();
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            boolean z2 = false;
            if (o2.moveToFirst()) {
                if (o2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            o2.close();
            a2.m();
        }
    }

    public void D(Exception exc, boolean z) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        ws6 j = ws6.j(hashSet);
        hashSet.clear();
        po5 l = j.listIterator(0);
        while (l.hasNext()) {
            u64 u64 = (u64) l.next();
            u64.getClass();
            u64.j(exc, z ? 1 : 3);
        }
    }

    public void E(int i, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 1;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        obtain.replyTo = messenger;
        ((Messenger) this.b).send(obtain);
    }

    public void F(gt0 gt0) {
        if (this == o) {
            gt0.E();
            gt0.D();
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.withStartAction(new kg(gt0, 0));
            viewPropertyAnimator.withEndAction(new kg(gt0, 1));
            return;
        }
        Animation animation = (Animation) this.c;
        if (animation != null) {
            animation.setAnimationListener(new ng(4, gt0));
        }
    }

    public void G(tt7 tt7) {
        try {
            x3g x3g = (x3g) this.b;
            Parcel G0 = x3g.G0();
            u1g.b(G0, tt7);
            Parcel R = x3g.R(G0, 91);
            R.readInt();
            R.recycle();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void H(hy5 hy5) {
        x3g x3g = (x3g) this.b;
        if (hy5 == null) {
            try {
                Parcel G0 = x3g.G0();
                u1g.c(G0, (IInterface) null);
                x3g.H0(G0, 28);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            r0g r0g = new r0g(hy5, (byte) 0);
            Parcel G02 = x3g.G0();
            u1g.c(G02, r0g);
            x3g.H0(G02, 28);
        }
    }

    public void I(hy5 hy5) {
        x3g x3g = (x3g) this.b;
        if (hy5 == null) {
            try {
                Parcel G0 = x3g.G0();
                u1g.c(G0, (IInterface) null);
                x3g.H0(G0, 30);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            r0g r0g = new r0g(hy5);
            Parcel G02 = x3g.G0();
            u1g.c(G02, r0g);
            x3g.H0(G02, 30);
        }
    }

    public void J(ConversationEndReason conversationEndReason) {
        if (conversationEndReason != null) {
            ConversationEndReason conversationEndReason2 = (ConversationEndReason) this.c;
            xwb xwb = (xwb) this.b;
            if (conversationEndReason2 == null) {
                this.c = conversationEndReason;
                xwb.log("CallEndInfoHolder", "set end reason " + conversationEndReason);
                return;
            }
            xwb.log("CallEndInfoHolder", "warning: trying to replace end reason from " + conversationEndReason2 + " to " + conversationEndReason);
        }
    }

    public void K(int i) {
        grd grd = (grd) this.b;
        kt8 kt8 = (kt8) grd.getValue();
        int i2 = 0;
        if (i == 4) {
            if ((kt8 != null ? kt8.a : 0) != 2) {
                return;
            }
        }
        if (i == 0) {
            if (kt8 != null) {
                i2 = kt8.a;
            }
            i = i2 == 2 ? 3 : 2;
        }
        grd.m((Object) null, new kt8(i));
    }

    public void T(long j) {
        ((u16) this.c).invoke(Long.valueOf(j));
    }

    public void a(Object obj) {
        switch (this.a) {
            case 9:
                Void voidR = (Void) obj;
                lr1 lr1 = (lr1) this.c;
                if (lr1.E0.b == 2 && lr1.W0 == 9) {
                    ((lr1) this.c).F(10);
                    return;
                }
                return;
            default:
                Void voidR2 = (Void) obj;
                ((Surface) this.b).release();
                ((SurfaceTexture) this.c).release();
                return;
        }
    }

    public lja b() {
        return new mn(((bj6) this.b).b(), (List) this.c, false, 16);
    }

    public lr6 c() {
        return u(((nr6) this.b).c());
    }

    public void close() {
        ((nr6) this.b).close();
    }

    public e13 d(Object obj, e13 e13) {
        ((gl8) this.c).u(obj);
        return ((el8) this.b).d(obj, e13);
    }

    public void e(Throwable th) {
        c2d c2d;
        switch (this.a) {
            case 9:
                if (th instanceof DeferrableSurface$SurfaceClosedException) {
                    xc4 xc4 = ((DeferrableSurface$SurfaceClosedException) th).a;
                    Iterator it = ((lr1) this.c).a.t().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c2d = (c2d) it.next();
                            if (c2d.b().contains(xc4)) {
                            }
                        } else {
                            c2d = null;
                        }
                    }
                    if (c2d != null) {
                        lr1 lr1 = (lr1) this.c;
                        lr1.getClass();
                        vd6 A = pa2.A();
                        a2d a2d = c2d.f;
                        if (a2d != null) {
                            new Throwable();
                            lr1.toString();
                            A.execute(new dr1(a2d, 3, c2d));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (th instanceof CancellationException) {
                    ((lr1) this.c).toString();
                    return;
                } else {
                    if (((lr1) this.c).W0 == 9) {
                        ((lr1) this.c).E(9, new u80(th, 4), true);
                    }
                    Objects.toString((lr1) this.c);
                    lr1 lr12 = (lr1) this.c;
                    if (lr12.A0 == ((ww1) this.b)) {
                        lr12.D();
                        return;
                    }
                    return;
                }
            default:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }
    }

    public int f() {
        return ((nr6) this.b).f();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void g(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.c
            lr7 r4 = (defpackage.lr7) r4
            java.lang.Object r3 = r3.b
            ev3 r3 = (defpackage.ev3) r3
            r4.getClass()
            r3.getClass()
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x0056 }
            int r0 = r3.c     // Catch:{ all -> 0x005a }
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0018
            r0 = r2
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            defpackage.ez3.o(r0)     // Catch:{ all -> 0x005a }
            int r0 = r3.c     // Catch:{ all -> 0x005a }
            int r0 = r0 - r2
            r3.c = r0     // Catch:{ all -> 0x005a }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            monitor-enter(r4)     // Catch:{ all -> 0x0056 }
            boolean r0 = r3.d     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0037
            int r0 = r3.c     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0037
            jn r0 = r4.b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r3.a     // Catch:{ all -> 0x0035 }
            r0.J(r1, r3)     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            r1 = r2
            goto L_0x0038
        L_0x0035:
            r3 = move-exception
            goto L_0x0058
        L_0x0037:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
        L_0x0038:
            e13 r0 = r4.h(r3)     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            defpackage.e13.S(r0)
            if (r1 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r3 == 0) goto L_0x004f
            wwc r0 = r3.e
            if (r0 == 0) goto L_0x004f
            java.lang.Object r3 = r3.a
            r0.Y(r3, r2)
        L_0x004f:
            r4.f()
            r4.c()
            return
        L_0x0056:
            r3 = move-exception
            goto L_0x005d
        L_0x0058:
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r3     // Catch:{ all -> 0x0056 }
        L_0x005a:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005a }
            throw r3     // Catch:{ all -> 0x0056 }
        L_0x005d:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe4.g(java.lang.Object):void");
    }

    public e13 get(Object obj) {
        e13 e13 = ((el8) this.b).get(obj);
        gl8 gl8 = (gl8) this.c;
        if (e13 == null) {
            gl8.m(obj);
        } else {
            gl8.k(obj);
        }
        return e13;
    }

    public long getContentLength() {
        return ((File) this.c).length();
    }

    public String getContentType() {
        return (String) this.b;
    }

    public int getHeight() {
        return ((nr6) this.b).getHeight();
    }

    public int getSizeInBytes() {
        return ((el8) this.b).getSizeInBytes();
    }

    public Surface getSurface() {
        return ((nr6) this.b).getSurface();
    }

    public int getWidth() {
        return ((nr6) this.b).getWidth();
    }

    public void h() {
        ((nr6) this.b).h();
    }

    public lja i(vi6 vi6, ni6 ni6) {
        return new mn(((bj6) this.b).i(vi6, ni6), (List) this.c, false, 16);
    }

    public void j(mr6 mr6, Executor executor) {
        ((nr6) this.b).j(new w48((Object) this, 13, (Object) mr6), executor);
    }

    public og6 k() {
        return new gq2((r7e) ((t97) this.b), ((w4) this.c).d(tr2.class));
    }

    public int l() {
        return ((nr6) this.b).l();
    }

    public int m(x1b x1b) {
        return ((el8) this.b).m(x1b);
    }

    public lr6 n() {
        return u(((nr6) this.b).n());
    }

    public gj1 o(a30 a30) {
        gj1 gj1;
        Object obj;
        List list;
        HashMap hashMap = (HashMap) this.c;
        gj1 gj12 = (gj1) hashMap.get((v2d) a30.b);
        if (gj12 != null || !a30.a) {
            if (gj12 == null || (obj = gj12.b) == null) {
                obj = BuildConfig.FLAVOR;
            }
            dja dja = (dja) a30.c;
            if (dja.d()) {
                obj = dja.b();
            }
            String str = (String) obj;
            int i = 0;
            Object valueOf = Boolean.valueOf(gj12 != null ? gj12.c : false);
            dja dja2 = (dja) a30.o;
            if (dja2.d()) {
                valueOf = dja2.b();
            }
            boolean booleanValue = ((Boolean) valueOf).booleanValue();
            List list2 = gj12 != null ? gj12.d : null;
            List list3 = (List) ((dja) a30.X).i();
            Iterable iterable = (List) ((dja) a30.Y).i();
            List list4 = (List) ((dja) a30.Z).i();
            if (list3 != null) {
                list = list3;
            } else {
                Set w0 = list4 != null ? o23.w0(list4) : qw4.a;
                if (iterable == null) {
                    iterable = hw4.a;
                }
                list = list2 != null ? o23.i0(o23.h0(list2, w0), iterable) : o23.h0(iterable, w0);
            }
            if (gj12 != null) {
                i = gj12.e;
            }
            Object valueOf2 = Integer.valueOf(i);
            dja dja3 = (dja) a30.w0;
            if (dja3.d()) {
                valueOf2 = dja3.b();
            }
            int intValue = ((Number) valueOf2).intValue();
            Object obj2 = gj12 != null ? gj12.f : null;
            dja dja4 = (dja) a30.x0;
            if (dja4.d()) {
                obj2 = dja4.b();
            }
            ge1 ge1 = (ge1) obj2;
            Object obj3 = gj12 != null ? gj12.g : null;
            dja dja5 = (dja) a30.y0;
            if (dja5.d()) {
                obj3 = dja5.b();
            }
            v2d v2d = (v2d) a30.b;
            gj1 = new gj1(intValue, ge1, v2d, (Long) obj3, str, list, booleanValue);
            hashMap.put(v2d, gj1);
        } else {
            gj1 = null;
        }
        if (gj1 == null) {
            return null;
        }
        ((ob1) this.b).f.onRoomUpdated(new mj1(gj1.a, xie.I(gj1)));
        return gj1;
    }

    public Size[] p(Size[] sizeArr, int i) {
        List list;
        ArrayList arrayList;
        int i2 = i;
        ArrayList arrayList2 = new ArrayList(Arrays.asList(sizeArr));
        if (((ExtraSupportedOutputSizeQuirk) this.b) != null) {
            Size[] sizeArr2 = (i2 != 34 || !"motorola".equalsIgnoreCase(Build.BRAND) || !"moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[0] : new Size[]{new Size(1440, 1080), new Size(960, 720)};
            if (sizeArr2.length > 0) {
                arrayList2.addAll(Arrays.asList(sizeArr2));
            }
        }
        o15 o15 = (o15) this.c;
        o15.getClass();
        if (((ExcludedSupportedSizesQuirk) zf4.a.j(ExcludedSupportedSizesQuirk.class)) == null) {
            list = new ArrayList();
        } else {
            String str = o15.a;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals("0") && i2 == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            } else if (!"OnePlus".equalsIgnoreCase(str2) || !"OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && (i2 == 34 || i2 == 35)) {
                        arrayList.add(new Size(720, 720));
                        arrayList.add(new Size(400, 400));
                    }
                } else {
                    if ("SAMSUNG".equalsIgnoreCase(str2) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                        arrayList = new ArrayList();
                        if (str.equals("0")) {
                            if (i2 == 34) {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            } else if (i2 == 35) {
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str.equals("1") && (i2 == 34 || i2 == 35)) {
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2448, 2448));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if ("SAMSUNG".equalsIgnoreCase(str2) && "J7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                        arrayList = new ArrayList();
                        if (str.equals("0")) {
                            if (i2 == 34) {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            } else if (i2 == 35) {
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str.equals("1") && (i2 == 34 || i2 == 35)) {
                            arrayList.add(new Size(2576, 1932));
                            arrayList.add(new Size(2560, 1440));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (!"REDMI".equalsIgnoreCase(str2) || !"joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                        list = Collections.emptyList();
                    } else {
                        arrayList = new ArrayList();
                        if (str.equals("0") && i2 == 256) {
                            arrayList.add(new Size(9280, 6944));
                        }
                    }
                }
            } else {
                arrayList = new ArrayList();
                if (str.equals("0") && i2 == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            }
            list = arrayList;
        }
        if (!list.isEmpty()) {
            arrayList2.removeAll(list);
        }
        arrayList2.isEmpty();
        return (Size[]) arrayList2.toArray(new Size[0]);
    }

    public int q() {
        ch5 ch5 = (ch5) this.c;
        if (ch5 == null) {
            return 1;
        }
        Context context = ch5.a;
        FingerprintManager c2 = ah5.c(context);
        if (c2 == null || !ah5.e(c2)) {
            return 12;
        }
        FingerprintManager c3 = ah5.c(context);
        return (c3 == null || !ah5.d(c3)) ? 11 : 0;
    }

    public void r() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            return;
        }
        Animation animation = (Animation) this.c;
        if (animation != null) {
            animation.cancel();
        }
    }

    public void s(Object obj, String str) {
        obj.getClass();
        ((HashMap) this.b).put(str, obj);
        ((ArrayList) this.c).remove(str);
    }

    public void t() {
        switch (this.a) {
            case 8:
                HashMap hashMap = (HashMap) this.c;
                List<v2d> s0 = o23.s0(hashMap.keySet());
                hashMap.clear();
                for (v2d lj1 : s0) {
                    ((ob1) this.b).f.onRoomRemoved(new lj1(lj1));
                }
                return;
            default:
                this.b = null;
                this.c = null;
                return;
        }
    }

    public c4d u(lr6 lr6) {
        s9e s9e;
        if (lr6 == null) {
            return null;
        }
        if (((s4b) this.c) == null) {
            s9e = s9e.b;
        } else {
            s4b s4b = (s4b) this.c;
            Pair pair = new Pair(s4b.g, s4b.h.get(0));
            s9e s9e2 = s9e.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            s9e = new s9e(arrayMap);
        }
        this.c = null;
        return new c4d(lr6, new Size(lr6.getWidth(), lr6.getHeight()), new xs1(new kg5((ws1) null, s9e, lr6.getImageInfo().getTimestamp())));
    }

    public void v(l24 l24) {
        synchronized (l24) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new p50(this, l24, 1));
        }
    }

    public og0 w() {
        Object obj = new Object();
        Context context = (Context) this.b;
        og0 og0 = (og0) this.c;
        return new og0(3, (Object) new c6c[]{obj, new jn(context, og0), new Object(), new qr4(16), new Object(), new mn(context, og0, false, 9)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        defpackage.urd.l(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeTo(java.io.OutputStream r2) {
        /*
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.lang.Object r1 = r1.c
            java.io.File r1 = (java.io.File) r1
            r0.<init>(r1)
            defpackage.oyb.p(r0, r2, 8192)     // Catch:{ all -> 0x0011 }
            r1 = 0
            defpackage.urd.l(r0, r1)
            return
        L_0x0011:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r2 = move-exception
            defpackage.urd.l(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe4.writeTo(java.io.OutputStream):void");
    }

    public ArrayList x(String str) {
        pec a2 = pec.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        aec aec = (aec) this.b;
        aec.b();
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                arrayList.add(o2.isNull(0) ? null : o2.getString(0));
            }
            return arrayList;
        } finally {
            o2.close();
            a2.m();
        }
    }

    public q2d y(v2d v2d) {
        gj1 gj1 = (gj1) ((HashMap) this.c).get(v2d);
        if (gj1 != null) {
            return xie.I(gj1);
        }
        return null;
    }

    public ple z() {
        vyf vyf;
        try {
            if (((ple) this.c) == null) {
                x3g x3g = (x3g) this.b;
                Parcel R = x3g.R(x3g.G0(), 25);
                IBinder readStrongBinder = R.readStrongBinder();
                if (readStrongBinder == null) {
                    vyf = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    vyf = queryLocalInterface instanceof g2g ? (g2g) queryLocalInterface : new vyf(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 3);
                }
                R.recycle();
                this.c = new ple(vyf);
            }
            return (ple) this.c;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public /* synthetic */ qe4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ qe4(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public qe4(ob1 ob1) {
        this.a = 8;
        this.b = ob1;
        this.c = new HashMap();
    }

    public qe4(String str, n06 n06, s59 s59) {
        this.a = 3;
        this.c = str;
        this.b = n06;
    }

    public qe4(x3g x3g) {
        this.a = 20;
        new HashMap();
        new HashMap();
        a24.o(x3g);
        this.b = x3g;
    }

    public qe4(File file) {
        this.a = 21;
        this.b = "application/octet-stream";
        this.c = file;
    }

    public qe4(otf otf) {
        this.a = 12;
        this.b = (String) otf.a;
        this.c = (v2b) otf.b;
    }

    public qe4(ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 1;
        this.b = viewPropertyAnimator;
        this.c = null;
    }

    public qe4(aec aec) {
        this.a = 0;
        this.b = aec;
        this.c = new sh(aec, 5);
    }

    public qe4(TranslateAnimation translateAnimation) {
        this.a = 1;
        this.b = null;
        this.c = translateAnimation;
    }

    public qe4(Context context) {
        this.a = 16;
        this.b = context;
        og0 og0 = new og0(0, (byte) 0);
        this.c = og0;
        og0.z(context.getApplicationInfo().sourceDir);
    }

    public qe4(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new HashMap();
                this.c = new ArrayList();
                return;
            case 15:
                this.b = new HashSet();
                return;
            case 17:
                grd a2 = hrd.a((Object) null);
                this.b = a2;
                this.c = new t0c(a2);
                return;
            case 19:
                return;
            case 29:
                this.b = new char[256];
                this.c = new byte[256];
                return;
            default:
                this.b = null;
                this.c = null;
                return;
        }
    }

    public qe4(String str) {
        this.a = 28;
        this.b = (ExtraSupportedOutputSizeQuirk) zf4.a.j(ExtraSupportedOutputSizeQuirk.class);
        this.c = new o15(str, 0);
    }

    public qe4(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = 14;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public qe4(x3a x3a) {
        this.a = 6;
        int i = Build.VERSION.SDK_INT;
        Context context = (Context) x3a.b;
        this.b = wl0.b(context);
        this.c = i <= 29 ? new ch5(context) : null;
    }

    public qe4(IBinder iBinder, Bundle bundle) {
        this.a = 24;
        this.b = new Messenger(iBinder);
        this.c = bundle;
    }
}
