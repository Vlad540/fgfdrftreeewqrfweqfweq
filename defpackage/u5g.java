package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Range;
import android.view.View;
import android.view.Window;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.stickerssearch.StickersSearchScreen;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.messages.media.crop.FrgTamCropImage;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: u5g  reason: default package */
public final class u5g implements gm8, s3e, of3, zm3, tm0, xv7, xj4, ta9, i36, v37, otc, htd, v4 {
    public static u5g c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u5g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static synchronized u5g l(Context context) {
        u5g u5g;
        synchronized (u5g.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (u5g.class) {
                u5g = c;
                if (u5g == null) {
                    u5g = new u5g(0, false);
                    vyd a2 = vyd.a(applicationContext);
                    u5g.b = a2;
                    a2.b();
                    a2.c();
                    c = u5g;
                }
            }
        }
        return u5g;
    }

    public void B() {
        ((FrgTamCropImage) this.b).s1();
    }

    public void H() {
        ((sya) this.b).b();
    }

    public void I() {
        ((sya) this.b).b();
    }

    public void K() {
        ((sya) this.b).b();
    }

    public void N() {
        ((sya) this.b).b();
    }

    public void O(String str, Bitmap bitmap) {
        FrgTamCropImage frgTamCropImage = (FrgTamCropImage) this.b;
        frgTamCropImage.getClass();
        new y63(1, new sz(frgTamCropImage, 5, bitmap)).k(cnc.a()).h(de.a()).i(new pn1(new k16(frgTamCropImage, 0), 0, new j16(frgTamCropImage, 7)));
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        String.format("Released audio source successfully: 0x%x", new Object[]{Integer.valueOf(((d60) this.b).hashCode())});
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [long[], java.io.Serializable] */
    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                TamErrorException tamErrorException = (Throwable) obj;
                f02 f02 = (f02) this.b;
                udd.s(f02.Z, "onUploadFailed: failed", tamErrorException);
                jee s = f02.s();
                long j = f02.b;
                s.d(j);
                long j2 = f02.o;
                if (j2 != 0) {
                    i22 B = f02.b().B(j2);
                    if (B != null) {
                        f02.b().W(j2, z52.b);
                        f02.a().j(B.b.a);
                    }
                } else {
                    d0d d0d = f02.a;
                    if (d0d == null) {
                        d0d = null;
                    }
                    ((di3) d0d.i.getValue()).d(0, (String) null, (String) null);
                    long s2 = f02.i().s();
                    if (s2 > 0) {
                        gy9 a2 = f02.a();
                        gy9.v(a2, new q92(a2.z().a.n(), new long[]{s2}, 1));
                    }
                }
                f02.t().c(new jh0(j, tamErrorException instanceof TamErrorException ? tamErrorException.a : new uae("internal-error", tamErrorException.toString(), (String) null)));
                return;
            default:
                udd.s(((sw8) this.b).b, "postProcessText: failed", (Throwable) obj);
                return;
        }
    }

    public void b() {
        se9 se9 = ((id9) this.b).y0;
        if (se9 != null) {
            se9.o(new ai0(18));
        }
    }

    public void c(int i) {
        id9 id9 = (id9) this.b;
        id9.c.c = 0;
        id9.Z1(id9, true, i * 10);
    }

    public boolean d(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.b;
        boolean z = false;
        if (!swipeDismissBehavior.x(view)) {
            return false;
        }
        WeakHashMap weakHashMap = eaf.a;
        if (view.getLayoutDirection() == 1) {
            z = true;
        }
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight(((i != 0 || !z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    public void e(Throwable th) {
        String.format("An error occurred while attempting to release audio source: 0x%x", new Object[]{Integer.valueOf(((d60) this.b).hashCode())});
    }

    public void f(pl8 pl8, boolean z) {
        ((dn) this.b).p(pl8);
    }

    public void g(ax4 ax4, int i) {
        t54 o0;
        ax4 ax42;
        at6 at6 = null;
        fbc fbc = (fbc) this.b;
        if (ax4 != null) {
            wr6 wr6 = fbc.d;
            ax4.n0();
            vr6 createImageTranscoder = wr6.createImageTranscoder(ax4.c, fbc.c);
            createImageTranscoder.getClass();
            ah0 ah0 = fbc.b;
            z4b z4b = fbc.e;
            ji0 ji0 = (ji0) z4b;
            ji0.c.j(z4b, "ResizeAndRotateProducer");
            tr6 tr6 = ji0.a;
            qe4 qe4 = fbc.h.b;
            qe4.getClass();
            kl8 kl8 = new kl8((il8) qe4.b);
            try {
                rfc rfc = tr6.j;
                hbc hbc = tr6.i;
                ax4.n0();
                ii5 b2 = createImageTranscoder.b(ax4, kl8, rfc, hbc, ax4.y0);
                int i2 = b2.b;
                if (i2 != 2) {
                    at6 = fbc.m(ax4, tr6.i, b2, createImageTranscoder.a());
                    o0 = e13.o0(kl8.n());
                    ax42 = new ax4(o0);
                    ax42.c = o84.a;
                    ax42.S();
                    ((ji0) z4b).c.a(z4b, "ResizeAndRotateProducer", at6);
                    if (i2 != 1) {
                        i |= 16;
                    }
                    ah0.g(i, ax42);
                    ax4.d(ax42);
                    e13.S(o0);
                    kl8.close();
                    return;
                }
                throw new RuntimeException("Error while transcoding the image");
            } catch (Exception e) {
                ((ji0) z4b).c.d(z4b, "ResizeAndRotateProducer", e, at6);
                if (ah0.a(i)) {
                    ah0.e(e);
                }
            } catch (Throwable th) {
                kl8.close();
                throw th;
            }
        } else {
            fbc.b.g(i, (Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [stf, java.lang.Object] */
    public Object get() {
        n80 n80 = (n80) this.b;
        int i = n80.c;
        if (i == -1) {
            i = 5;
        }
        int i2 = n80.b;
        if (i2 == -1) {
            i2 = 2;
        }
        int i3 = n80.e;
        if (i3 == -1) {
            i3 = 1;
        }
        Range range = n80.g;
        Range range2 = n80.d;
        int M = range.equals(range2) ? 44100 : gwf.M(range2, i3, i2, ((Integer) range2.getUpper()).intValue());
        List list = m80.e;
        ? obj = new Object();
        obj.a = -1;
        obj.b = -1;
        obj.c = -1;
        obj.o = -1;
        obj.a = Integer.valueOf(i);
        obj.o = Integer.valueOf(i2);
        obj.c = Integer.valueOf(i3);
        obj.b = Integer.valueOf(M);
        return obj.b();
    }

    public synchronized void h() {
        vyd vyd = (vyd) this.b;
        ReentrantLock reentrantLock = vyd.a;
        reentrantLock.lock();
        try {
            vyd.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int i(int r7) {
        /*
            r6 = this;
            java.lang.Object r6 = r6.b
            one.me.sdk.sections.SectionRecyclerWidget r6 = (one.me.sdk.sections.SectionRecyclerWidget) r6
            r6.getClass()
            k77[] r0 = one.me.sdk.sections.SectionRecyclerWidget.c
            r1 = 0
            r0 = r0[r1]
            n0c r2 = r6.a
            java.lang.Object r0 = r2.T0(r6, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            f6c r0 = r0.getAdapter()
            if (r0 != 0) goto L_0x001b
            return r1
        L_0x001b:
            int r2 = r0.j()
            if (r7 < r2) goto L_0x0022
            return r1
        L_0x0022:
            if (r7 >= 0) goto L_0x0025
            return r1
        L_0x0025:
            boolean r2 = r0 instanceof defpackage.t93
            r3 = 0
            if (r2 == 0) goto L_0x002e
            r2 = r0
            t93 r2 = (defpackage.t93) r2
            goto L_0x002f
        L_0x002e:
            r2 = r3
        L_0x002f:
            if (r2 == 0) goto L_0x0050
            android.util.Pair r2 = r2.E(r7)
            java.lang.Object r4 = r2.first
            g7d r5 = r6.m0()
            boolean r4 = defpackage.hhd.f(r4, r5)
            if (r4 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r2 = r3
        L_0x0043:
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0050
            int r7 = r2.intValue()
            goto L_0x005a
        L_0x0050:
            g7d r2 = r6.m0()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00db
        L_0x005a:
            if (r7 > 0) goto L_0x005e
            r0 = r3
            goto L_0x0076
        L_0x005e:
            g7d r0 = r6.m0()
            mu r0 = r0.o
            java.util.List r0 = r0.f
            int r1 = r7 + -1
            java.lang.Object r0 = r0.get(r1)
            e7d r0 = (e7d) r0
            int r0 = r0.u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0076:
            g7d r1 = r6.m0()
            mu r1 = r1.o
            java.util.List r1 = r1.f
            java.lang.Object r1 = r1.get(r7)
            e7d r1 = (e7d) r1
            int r1 = r1.u()
            g7d r2 = r6.m0()
            mu r2 = r2.o
            java.util.List r2 = r2.f
            int r2 = r2.size()
            r4 = 1
            int r2 = r2 - r4
            if (r7 != r2) goto L_0x0099
            goto L_0x00b0
        L_0x0099:
            g7d r6 = r6.m0()
            mu r6 = r6.o
            java.util.List r6 = r6.f
            int r7 = r7 + r4
            java.lang.Object r6 = r6.get(r7)
            e7d r6 = (e7d) r6
            int r6 = r6.u()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
        L_0x00b0:
            if (r0 != 0) goto L_0x00b3
            goto L_0x00b9
        L_0x00b3:
            int r6 = r0.intValue()
            if (r6 == r1) goto L_0x00c4
        L_0x00b9:
            if (r3 != 0) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r6 = r3.intValue()
            if (r1 == r6) goto L_0x00c4
        L_0x00c2:
            r4 = 4
            goto L_0x00da
        L_0x00c4:
            if (r0 != 0) goto L_0x00c7
            goto L_0x00da
        L_0x00c7:
            int r6 = r0.intValue()
            if (r6 == r1) goto L_0x00ce
            goto L_0x00da
        L_0x00ce:
            if (r3 != 0) goto L_0x00d1
            goto L_0x00d7
        L_0x00d1:
            int r6 = r3.intValue()
            if (r1 == r6) goto L_0x00d9
        L_0x00d7:
            r4 = 3
            goto L_0x00da
        L_0x00d9:
            r4 = 2
        L_0x00da:
            return r4
        L_0x00db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u5g.i(int):int");
    }

    public void j(long j) {
        k77[] k77Arr = CallMoreBottomSheet.B0;
        CallMoreBottomSheet callMoreBottomSheet = (CallMoreBottomSheet) this.b;
        nc1 nc1 = (nc1) callMoreBottomSheet.x0.getValue();
        nc1.getClass();
        int i = (j > ((long) o1a.w) ? 1 : (j == ((long) o1a.w) ? 0 : -1));
        aj1 aj1 = nc1.c;
        if (i == 0) {
            taf.o(aj1.Q0, new rh1(true));
        } else if (j == ((long) o1a.y)) {
            taf.o(aj1.Q0, new rh1(false));
        } else if (j == ((long) o1a.r)) {
            taf.o(aj1.Q0, nh1.C);
        } else if (j == ((long) o1a.t)) {
            taf.o(aj1.Q0, ph1.C);
        } else if (j == ((long) o1a.q)) {
            taf.o(aj1.Q0, jh1.C);
        } else if (j == ((long) o1a.F)) {
            taf.o(aj1.Q0, ih1.C);
        } else if (j == ((long) o1a.R0)) {
            taf.o(aj1.Q0, new dh1(raf.c));
        } else if (j == ((long) o1a.S0)) {
            taf.o(aj1.Q0, new dh1(raf.a));
        } else if (j == ((long) o1a.v)) {
            l05 l05 = aj1.Q0;
            oc1.c.getClass();
            taf.o(l05, new a34(":call-admin-settings"));
        }
        callMoreBottomSheet.r0(true);
    }

    public void k(long j, boolean z) {
        k77[] k77Arr = CallAdminSettingsScreen.x0;
        bz0 l0 = ((CallAdminSettingsScreen) this.b).l0();
        int i = (int) j;
        l0.getClass();
        int i2 = o1a.a;
        k88 k88 = k88.c;
        k88 k882 = k88.a;
        if (i == i2) {
            py0 py0 = (py0) l0.q();
            MediaMuteManager e = py0.e();
            if (e != null) {
                ht7 ht7 = new ht7();
                j88 j88 = j88.b;
                if (z) {
                    k88 = k882;
                }
                ht7.put(j88, k88);
                MediaMuteManager.updateMediaOptionsForAll$default(e, ht7.b(), (w2d) null, new xx0(py0, z, 1), new yx0(py0, z, 1), 2, (Object) null);
            }
        } else if (i == o1a.h) {
            py0 py02 = (py0) l0.q();
            MediaMuteManager e2 = py02.e();
            if (e2 != null) {
                ht7 ht72 = new ht7();
                j88 j882 = j88.a;
                if (z) {
                    k88 = k882;
                }
                ht72.put(j882, k88);
                MediaMuteManager.updateMediaOptionsForAll$default(e2, ht72.b(), (w2d) null, new xx0(py02, z, 0), new yx0(py02, z, 0), 2, (Object) null);
            }
        } else if (i == o1a.j) {
            py0 py03 = (py0) l0.q();
            MediaMuteManager e3 = py03.e();
            if (e3 != null) {
                ht7 ht73 = new ht7();
                j88 j883 = j88.c;
                if (z) {
                    k88 = k882;
                }
                ht73.put(j883, k88);
                MediaMuteManager.updateMediaOptionsForAll$default(e3, ht73.b(), (w2d) null, new xx0(py03, z, 2), new yx0(py03, z, 2), 2, (Object) null);
            }
        } else if (i == o1a.i) {
            if (!z) {
                boc boc = l0.b.i;
                boc.getClass();
                if (((eoc) ((doc) boc).Z.getValue()).a == foc.a) {
                    taf.o(l0.x0, ph1.C);
                    return;
                }
            }
            ((py0) l0.q()).i(z);
        } else if (i == o1a.k) {
            py0 py04 = (py0) l0.q();
            fn6 fn6 = udd.e;
            if (fn6 != null) {
                py04.getClass();
                if (fn6.c()) {
                    fn6.d(tn7.X, "CallAdminSettingsController", us8.k("Waiting room change state to ", z), (Throwable) null);
                }
            }
            Conversation a2 = py04.d().a();
            if (a2 != null) {
                Conversation.setWaitingRoomEnabled$default(a2, z, (pf3) null, 2, (Object) null);
            }
        }
    }

    public void m(ktd ktd) {
        rvd rvd = rvd.c;
        k77[] k77Arr = StickersSearchScreen.y0;
        StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.b;
        stickersSearchScreen.getClass();
        k77 k77 = StickersSearchScreen.y0[0];
        long longValue = ((Number) stickersSearchScreen.a.a(stickersSearchScreen)).longValue();
        d34 P1 = rvd.P1();
        P1.b(":stickers/preview?sticker_id=" + ktd.a + "&chat_id=" + longValue, (Bundle) null);
    }

    public void n() {
        ((sya) this.b).b();
    }

    public void q() {
        ((sya) this.b).b();
    }

    public void t(ktd ktd) {
        k77[] k77Arr = StickersSearchScreen.y0;
        cwd m0 = ((StickersSearchScreen) this.b).m0();
        long j = m0.b;
        if (j > 0) {
            ((luf) m0.X.getValue()).a(new u0d(new t0d(j, ktd.a, 1)));
            taf.o(m0.x0, v03.b);
        }
        tt6 tt6 = (tt6) qvd.a.getAccessor().e();
        if (tt6 != null) {
            tt6.f(z3d.N(new st6(qt6.SEND_5_MESSAGES, 1), new st6(qt6.SEND_3_STICKERS, 1)), mnc.Q0);
        }
    }

    public boolean x(pl8 pl8) {
        Window.Callback callback = ((dn) this.b).A0.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, pl8);
        return true;
    }

    public void z() {
        ((sya) this.b).b();
    }

    public /* synthetic */ u5g(int i, boolean z) {
        this.a = i;
    }

    public u5g(int i) {
        this.a = i;
        switch (i) {
            case 18:
                this.b = new CopyOnWriteArraySet();
                return;
            default:
                this.b = new ConcurrentHashMap(16);
                return;
        }
    }
}
