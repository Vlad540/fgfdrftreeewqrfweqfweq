package defpackage;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import androidx.media3.transformer.ExportException;
import com.google.android.gms.maps.model.CameraPosition;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import ru.ok.android.api.http.NoHttpApiEndpointException;

/* renamed from: mod  reason: default package */
public final class mod implements nl8, uw9, s60, hq6, of3, rl6, yc9, lwa, i8, rpa, h36, p8f, l4f, ta9, fwd, i36 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ mod(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void E(Throwable th) {
    }

    public static mod y(et1 et1) {
        DynamicRangeProfiles h;
        int i = Build.VERSION.SDK_INT;
        mod mod = null;
        if (i >= 33 && (h = f4.h(et1.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            e07.p("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            mod = new mod(14, new er4(h));
        }
        return mod == null ? fr4.a : mod;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.ax4 A(defpackage.ngd r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5.b     // Catch:{ all -> 0x0047 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0047 }
            ax4 r0 = (defpackage.ax4) r0     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0049
            monitor-enter(r0)     // Catch:{ all -> 0x0047 }
            boolean r1 = defpackage.ax4.m0(r0)     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x003e
            java.lang.Object r1 = r5.b     // Catch:{ all -> 0x003c }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x003c }
            r1.remove(r6)     // Catch:{ all -> 0x003c }
            java.lang.Class<mod> r1 = defpackage.mod.class
            java.lang.String r2 = "Found closed reference %d for key %s (%d)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x003c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r4 = r6.a     // Catch:{ all -> 0x003c }
            int r6 = java.lang.System.identityHashCode(r6)     // Catch:{ all -> 0x003c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x003c }
            java.lang.Object[] r6 = new java.lang.Object[]{r3, r4, r6}     // Catch:{ all -> 0x003c }
            defpackage.m75.j(r1, r2, r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r5)
            r5 = 0
            return r5
        L_0x003c:
            r6 = move-exception
            goto L_0x0045
        L_0x003e:
            ax4 r6 = defpackage.ax4.a(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            r0 = r6
            goto L_0x0049
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r6     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r6 = move-exception
            goto L_0x004b
        L_0x0049:
            monitor-exit(r5)
            return r0
        L_0x004b:
            monitor-exit(r5)     // Catch:{ all -> 0x0047 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mod.A(ngd):ax4");
    }

    public lhd B() {
        qe4 qe4 = (qe4) this.b;
        qe4.getClass();
        try {
            x3g x3g = (x3g) qe4.b;
            Parcel R = x3g.R(x3g.G0(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i = u1g.a;
            CameraPosition cameraPosition = (CameraPosition) (R.readInt() == 0 ? null : creator.createFromParcel(R));
            R.recycle();
            return new lhd(7, cameraPosition);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public int C() {
        qe4 qe4 = (qe4) this.b;
        qe4.getClass();
        try {
            x3g x3g = (x3g) qe4.b;
            Parcel R = x3g.R(x3g.G0(), 15);
            int readInt = R.readInt();
            R.recycle();
            if (readInt == 0) {
                return 0;
            }
            if (readInt == 1) {
                return 1;
            }
            int i = 2;
            if (readInt != 2) {
                i = 3;
                if (readInt != 3) {
                    i = 4;
                    if (readInt != 4) {
                        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unknown google map type = %d", Arrays.copyOf(new Object[]{Integer.valueOf(readInt)}, 1)));
                    }
                }
            }
            return i;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void D() {
        m75.d(mod.class, Integer.valueOf(((HashMap) this.b).size()), "Count = %d");
    }

    public void F(long j) {
        if (j == 0) {
            ((pqe) this.b).K0 = true;
        }
        ((pqe) this.b).J0 = j;
    }

    public void G() {
        long j;
        ty3 ty3 = (ty3) this.b;
        synchronized (bm3.X) {
            try {
                j = bm3.Y ? bm3.Z : -9223372036854775807L;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ty3.L = j;
        ty3.s(true);
    }

    public void H() {
        ((s16) this.b).invoke();
    }

    public void I() {
        ((s16) this.b).invoke();
    }

    public void J() {
        pqe pqe = (pqe) this.b;
        pqe.G0 = true;
        pqe.b();
    }

    public void K() {
        ((s16) this.b).invoke();
    }

    public void L() {
        ((pqe) this.b).Y.execute(new eq6(14, this));
    }

    public nsf M(View view, nsf nsf) {
        fm fmVar = (fm) this.b;
        fmVar.getClass();
        WeakHashMap weakHashMap = eaf.a;
        nsf nsf2 = fmVar.getFitsSystemWindows() ? nsf : null;
        if (!Objects.equals(fmVar.y0, nsf2)) {
            fmVar.y0 = nsf2;
            fmVar.setWillNotDraw(!(fmVar.N0 != null && fmVar.getTopInset() > 0));
            fmVar.requestLayout();
        }
        return nsf;
    }

    public void N() {
        ((s16) this.b).invoke();
    }

    public void O(long j, boolean z) {
        kk9 kk9 = CallHistoryPageScreen.y0;
        w61 o0 = ((CallHistoryPageScreen) this.b).o0();
        wg6 q = o0.q(j);
        if (q != null) {
            boolean z2 = q instanceof ug6;
            gq1 gq1 = gq1.X;
            t97 t97 = o0.x0;
            we1 we1 = o0.c;
            if (z2) {
                we1.l(((ug6) q).a, z, new u61(q, z, 0));
                ((iq1) t97.getValue()).e(gq1, z);
                return;
            }
            if (q instanceof sg6) {
                sg6 sg6 = (sg6) q;
                if (sg6.c) {
                    we1.j(sg6.e, true, z, false, new v61(q, 0));
                    iq1 iq1 = (iq1) t97.getValue();
                    String valueOf = String.valueOf(j);
                    iq1.getClass();
                    iq1.c(iq1, "GROUP_CALL_JOIN", valueOf, (String) null, (Integer) null, (String) null, (String) null, true, 52);
                    return;
                }
            }
            if (q instanceof tg6) {
                we1.j(((tg6) q).a, true, z, false, new v61(q, 1));
                ((iq1) t97.getValue()).e(gq1, z);
            }
        }
    }

    public synchronized void P(ov0 ov0, ax4 ax4) {
        ov0.getClass();
        if (ax4.m0(ax4)) {
            ax4.d((ax4) ((HashMap) this.b).put(ov0, ax4.a(ax4)));
            D();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: finally extract failed */
    public synchronized void Q(ov0 ov0, ax4 ax4) {
        ov0.getClass();
        ax4.getClass();
        if (ax4.m0(ax4)) {
            ax4 ax42 = (ax4) ((HashMap) this.b).get(ov0);
            if (ax42 != null) {
                e13 o = e13.o(ax42.a);
                e13 o2 = e13.o(ax4.a);
                if (!(o == null || o2 == null)) {
                    try {
                        if (o.e0() == o2.e0()) {
                            ((HashMap) this.b).remove(ov0);
                            e13.S(o2);
                            e13.S(o);
                            ax4.d(ax42);
                            D();
                            return;
                        }
                    } catch (Throwable th) {
                        e13.S(o2);
                        e13.S(o);
                        ax4.d(ax42);
                        throw th;
                    }
                }
                e13.S(o2);
                e13.S(o);
                ax4.d(ax42);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void R(boolean z) {
        qe4 qe4 = (qe4) this.b;
        qe4.getClass();
        try {
            x3g x3g = (x3g) qe4.b;
            Parcel G0 = x3g.G0();
            int i = u1g.a;
            G0.writeInt(z ? 1 : 0);
            x3g.H0(G0, 22);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public int S(xu5 xu5) {
        String str = xu5.n;
        return (str == null || !c49.i(str)) ? qi0.b(0, 0, 0, 0) : oze.K(xu5.n) ? qi0.b(4, 0, 0, 0) : qi0.b(1, 0, 0, 0);
    }

    public void a(Object obj) {
        xu5 xu5;
        switch (this.a) {
            case 18:
                Bitmap bitmap = (Bitmap) obj;
                ((sp6) this.b).h = 50;
                uu5 uu5 = new uu5();
                uu5.t = bitmap.getHeight();
                uu5.s = bitmap.getWidth();
                uu5.m = c49.l("image/raw");
                uu5.z = z23.i;
                xu5 xu52 = new xu5(uu5);
                if (!((sp6) this.b).a || oze.a < 34 || !bitmap.hasGainmap()) {
                    xu5 = xu52;
                } else {
                    uu5 a2 = xu52.a();
                    a2.m = c49.l("image/jpeg_r");
                    xu5 = new xu5(a2);
                }
                try {
                    ((sp6) this.b).d.g(2, xu52);
                    ((sp6) this.b).e.submit(new px4((Object) this, (Object) bitmap, (Object) xu5, 8));
                    return;
                } catch (RuntimeException e) {
                    ((sp6) this.b).d.d(ExportException.a(e, 1000));
                    return;
                }
            default:
                Void voidR = (Void) obj;
                ((Runnable) this.b).run();
                return;
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                np2 np2 = (np2) obj;
                wy1 wy1 = (wy1) this.b;
                wy1.getClass();
                if (np2.c != null) {
                    wy1.b().W(wy1.o, z52.b);
                    d0d d0d = wy1.a;
                    if (d0d == null) {
                        d0d = null;
                    }
                    ((bv2) d0d.J.getValue()).l().c0(Collections.singletonList(np2.c));
                }
                tt0 t = wy1.t();
                long j = wy1.b;
                t.c(new kh0(j));
                wy1.s().d(j);
                return;
            case 12:
                Throwable th = (Throwable) obj;
                u16 u16 = ((p14) this.b).c;
                if (u16 != null) {
                    u16.invoke(th);
                    return;
                }
                return;
            default:
                for (ys8 d : (List) obj) {
                    ((uc5) ((zs8) this.b).c.getValue()).d(d);
                }
                return;
        }
    }

    public void b() {
        ((v75) this.b).c(50);
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        pqe pqe = (pqe) this.b;
        pqe.getClass();
        pqe.Y.execute(new zo5(pqe, 29, videoFrameProcessingException));
    }

    public void close() {
        ((yc9) this.b).close();
    }

    public boolean d(pl8 pl8, MenuItem menuItem) {
        boolean z;
        boolean z2;
        l7 l7Var = ((ActionMenuView) this.b).D0;
        if (l7Var == null) {
            return false;
        }
        Toolbar toolbar = (Toolbar) ((c9) l7Var).b;
        Iterator it = ((CopyOnWriteArrayList) toolbar.Y0.b).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((mx5) it.next()).a.p(menuItem)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            z2 = true;
        } else {
            tle tle = toolbar.a1;
            z2 = tle != null ? tle.onMenuItemClick(menuItem) : false;
        }
        return z2;
    }

    public void e(Throwable th) {
        switch (this.a) {
            case 18:
                ((sp6) this.b).d.d(ExportException.a(th, 2000));
                return;
            default:
                return;
        }
    }

    public void f(hud hud) {
        k87 k87 = ((xud) this.b).Y;
        k87.getClass();
        k77[] k77Arr = KeyboardStickersWidget.x0;
        lyd n0 = k87.a.n0();
        qod D = xs7.D(n0.a, n0.b.b(), ru3.b, new iyd(n0, hud, (Continuation) null));
        n0.D0.o1(n0, lyd.F0[1], D);
    }

    public void g() {
        k77[] k77Arr = GifViewerWidget.y0;
        GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
        gifViewerWidget.q0().B(gifViewerWidget.m0(), gifViewerWidget.l0());
    }

    public void h(x29 x29) {
        ((yc9) this.b).h(x29);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [rr3, one.me.chatmedia.viewer.photo.GifViewerWidget] */
    public void i() {
        k77[] k77Arr = GifViewerWidget.y0;
        rr3 targetController = ((GifViewerWidget) this.b).getTargetController();
        tpa tpa = targetController instanceof tpa ? (tpa) targetController : null;
        if (tpa != null) {
            ((ChatMediaViewerScreen) tpa).E0(false);
        }
    }

    public void j(oz5 oz5, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((yc9) this.b).j(oz5, byteBuffer, bufferInfo);
    }

    public void k(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        k38 k38 = (k38) this.b;
        k38.O1 = k38.g(videoSink$VideoSinkException, videoSink$VideoSinkException.a, false, 7001);
    }

    public void l() {
        ((k38) this.b).L0(0, 1);
    }

    public void m(ktd ktd) {
        ((xud) this.b).Y.a(ktd);
    }

    public void n() {
        ((s16) this.b).invoke();
    }

    public void o(int i, int i2) {
        ((pqe) this.b).Y.execute(new as0(this, i, i2, 2));
    }

    public void onFirstFrameRendered() {
        k38 k38 = (k38) this.b;
        oyb.l(k38.h2);
        Surface surface = k38.h2;
        v4b v4b = k38.W1;
        Handler handler = (Handler) v4b.b;
        if (handler != null) {
            handler.post(new v82(v4b, surface, SystemClock.elapsedRealtime(), 8));
        }
        k38.k2 = true;
    }

    public void p() {
        k77[] k77Arr = GifViewerWidget.y0;
        GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
        gifViewerWidget.q0().z(gifViewerWidget.m0(), gifViewerWidget.l0());
    }

    public void q() {
        ((s16) this.b).invoke();
    }

    public void r(pl8 pl8) {
        nl8 nl8 = ((ActionMenuView) this.b).y0;
        if (nl8 != null) {
            nl8.r(pl8);
        }
    }

    public oz5 s(xu5 xu5) {
        return ((yc9) this.b).s(xu5);
    }

    public void t(ktd ktd) {
        u68 u68 = (u68) ((xud) this.b).Y.a.b.getValue();
        u68.getClass();
        r68 r68 = new r68(ktd.a);
        l05 l05 = u68.X;
        taf.o(l05, r68);
        taf.o(l05, q68.a);
    }

    public Uri u(String str) {
        str.getClass();
        if (str.equals("api")) {
            return ((t55) this.b).f().a();
        }
        throw new NoHttpApiEndpointException(str);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [vyf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.c9 v(dv7 r6) {
        /*
            r5 = this;
            cv7 r6 = r6.a
            java.lang.Object r5 = r5.b
            qe4 r5 = (defpackage.qe4) r5
            r5.getClass()
            java.lang.String r0 = "MarkerOptions must not be null."
            defpackage.a24.p(r6, r0)     // Catch:{ RemoteException -> 0x004e }
            java.lang.Object r5 = r5.b     // Catch:{ RemoteException -> 0x004e }
            x3g r5 = (defpackage.x3g) r5     // Catch:{ RemoteException -> 0x004e }
            android.os.Parcel r0 = r5.G0()     // Catch:{ RemoteException -> 0x004e }
            defpackage.u1g.b(r0, r6)     // Catch:{ RemoteException -> 0x004e }
            r1 = 11
            android.os.Parcel r5 = r5.R(r0, r1)     // Catch:{ RemoteException -> 0x004e }
            android.os.IBinder r0 = r5.readStrongBinder()     // Catch:{ RemoteException -> 0x004e }
            int r1 = defpackage.e1g.d     // Catch:{ RemoteException -> 0x004e }
            r1 = 0
            if (r0 != 0) goto L_0x002a
            r3 = r1
            goto L_0x003d
        L_0x002a:
            java.lang.String r2 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
            android.os.IInterface r3 = r0.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x004e }
            boolean r4 = r3 instanceof defpackage.f1g     // Catch:{ RemoteException -> 0x004e }
            if (r4 == 0) goto L_0x0037
            f1g r3 = (defpackage.f1g) r3     // Catch:{ RemoteException -> 0x004e }
            goto L_0x003d
        L_0x0037:
            d1g r3 = new d1g     // Catch:{ RemoteException -> 0x004e }
            r4 = 3
            r3.<init>(r0, r2, r4)     // Catch:{ RemoteException -> 0x004e }
        L_0x003d:
            r5.recycle()     // Catch:{ RemoteException -> 0x004e }
            if (r3 == 0) goto L_0x0056
            int r5 = r6.F0     // Catch:{ RemoteException -> 0x004e }
            r6 = 1
            if (r5 != r6) goto L_0x0050
            ic r5 = new ic     // Catch:{ RemoteException -> 0x004e }
            r5.<init>(r3)     // Catch:{ RemoteException -> 0x004e }
        L_0x004c:
            r1 = r5
            goto L_0x0056
        L_0x004e:
            r5 = move-exception
            goto L_0x005e
        L_0x0050:
            xu7 r5 = new xu7     // Catch:{ RemoteException -> 0x004e }
            r5.<init>(r3)     // Catch:{ RemoteException -> 0x004e }
            goto L_0x004c
        L_0x0056:
            c9 r5 = new c9
            r6 = 14
            r5.<init>(r6, r1)
            return r5
        L_0x005e:
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mod.v(dv7):c9");
    }

    public void w(Object obj) {
        a c;
        h8 h8Var = (h8) obj;
        c cVar = (c) this.b;
        qx5 qx5 = (qx5) cVar.F.pollFirst();
        if (qx5 != null && (c = cVar.c.c(qx5.a)) != null) {
            c.t0(qx5.b, h8Var.a, h8Var.b);
        }
    }

    public void x() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(((HashMap) this.b).values());
            ((HashMap) this.b).clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ax4 ax4 = (ax4) arrayList.get(i);
            if (ax4 != null) {
                ax4.close();
            }
        }
    }

    public void z() {
        ((s16) this.b).invoke();
    }

    public mod(un6 un6) {
        this.a = 7;
        a24.o(un6);
        this.b = un6;
    }

    public mod(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = new ak0(1);
                return;
            case 29:
                this.b = new SparseArray();
                return;
            default:
                return;
        }
    }

    public mod(View view) {
        this.a = 26;
        if (Build.VERSION.SDK_INT >= 30) {
            lhd lhd = new lhd(28, view);
            lhd.c = view;
            this.b = lhd;
            return;
        }
        this.b = new lhd(28, view);
    }

    public mod(WindowInsetsController windowInsetsController) {
        this.a = 26;
        lhd lhd = new lhd(28, (Object) null);
        lhd.o = windowInsetsController;
        this.b = lhd;
    }
}
