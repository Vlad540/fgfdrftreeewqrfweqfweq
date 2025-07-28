package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: c9  reason: default package */
public final class c9 implements yg7, sp3, uw9, of3, xj4, r3e, htd, l7, c1g {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public nsf M(View view, nsf nsf) {
        fq0 fq0 = (fq0) this.b;
        eq0 eq0 = fq0.C0;
        if (eq0 != null) {
            fq0.Y.W.remove(eq0);
        }
        eq0 eq02 = new eq0(fq0.x0, nsf);
        fq0.C0 = eq02;
        eq02.e(fq0.getWindow());
        BottomSheetBehavior bottomSheetBehavior = fq0.Y;
        eq0 eq03 = fq0.C0;
        ArrayList arrayList = bottomSheetBehavior.W;
        if (!arrayList.contains(eq03)) {
            arrayList.add(eq03);
        }
        return nsf;
    }

    public void a(int i, int i2) {
        ((f6c) this.b).n(i, i2);
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 6:
                wve wve = (wve) obj;
                f02 f02 = (f02) this.b;
                f02.getClass();
                if (wve.a()) {
                    String str = wve.h.a;
                    long j = f02.o;
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    String str2 = f02.Z;
                    if (i != 0) {
                        udd.p(str2, "updateChatAvatar", new Object[0]);
                        i22 B = f02.b().B(j);
                        if (B != null) {
                            f02.a().m(f02.o, B.b.a, (String) null, str, f02.X);
                        } else {
                            udd.s(str2, "updateChatAvatar: chat not found, chatId=" + j, (Throwable) null);
                        }
                    } else {
                        udd.p(str2, "updateProfileAvatar", new Object[0]);
                        pk.b(f02.a(), (String) null, (String) null, str, f02.X, (String) null, (String) null);
                    }
                    f02.s().d(f02.b);
                    return;
                }
                return;
            case 23:
                Integer num = (Integer) obj;
                udd.p(((h6e) this.b).b, "Connection restored", new Object[0]);
                return;
            default:
                ((yte) this.b).a.setValue((Float) obj);
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
        id9.o.c = 0;
        id9.Z1(id9, false, i * 10);
    }

    public void d(int i, int i2) {
        ((f6c) this.b).p(i, i2);
    }

    public void e(int i, int i2) {
        ((f6c) this.b).a.f(i, i2);
    }

    public void f(int i, int i2, Object obj) {
        ((f6c) this.b).o(i, i2, obj);
    }

    public void g(int i, boolean z) {
        ui5 ui5 = (ui5) this.b;
        if (z) {
            ui5.a(i);
        } else {
            ui5.getClass();
        }
    }

    public Object get() {
        return Boolean.valueOf(((ip) ((w4) this.b).c(ip.class)).s());
    }

    public re5 h() {
        ul7 ul7 = (ul7) this.b;
        String str = ((Long) ul7.a) == null ? " fileSizeLimit" : BuildConfig.FLAVOR;
        if (((Long) ul7.b) == null) {
            str = str.concat(" durationLimitMillis");
        }
        if (((File) ul7.c) == null) {
            str = hr1.g(str, " file");
        }
        if (str.isEmpty()) {
            return new re5(new l90(((Long) ul7.a).longValue(), ((Long) ul7.b).longValue(), (File) ul7.c));
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public wcd i() {
        wcd wcd = (wcd) this.b;
        int i = wcd.e;
        int[] iArr = wcd.b;
        iArr[0] = i;
        iArr[1] = i;
        iArr[2] = wcd.d;
        iArr[3] = i;
        iArr[4] = i;
        float[] fArr = wcd.a;
        fArr[0] = 0.0f;
        fArr[1] = 0.25f;
        fArr[2] = 0.5f;
        fArr[3] = 0.75f;
        fArr[4] = 1.0f;
        return wcd;
    }

    public void j(String str, Bitmap bitmap) {
        Integer num = (Integer) a88.c.get(str);
        if (num == null || num.intValue() == 2) {
            ((Bundle) this.b).putParcelable(str, bitmap);
            return;
        }
        throw new IllegalArgumentException(wn6.i("The ", str, " key cannot be used to put a Bitmap"));
    }

    public void k(long j, String str) {
        Integer num = (Integer) a88.c.get(str);
        if (num == null || num.intValue() == 0) {
            ((Bundle) this.b).putLong(str, j);
            return;
        }
        throw new IllegalArgumentException(wn6.i("The ", str, " key cannot be used to put a long"));
    }

    public void l(String str, dyb dyb) {
        Object obj;
        Integer num = (Integer) a88.c.get(str);
        if (num == null || num.intValue() == 3) {
            if (dyb.c == null) {
                boolean c = dyb.c();
                int i = dyb.a;
                if (c) {
                    boolean z = true;
                    boolean z2 = false;
                    float f = dyb.b;
                    switch (i) {
                        case 1:
                            if (i == 1) {
                                if (f != 1.0f) {
                                    z = false;
                                }
                                z2 = z;
                            }
                            dyb.c = Rating.newHeartRating(z2);
                            break;
                        case 2:
                            if (i == 2) {
                                if (f != 1.0f) {
                                    z = false;
                                }
                                z2 = z;
                            }
                            dyb.c = Rating.newThumbRating(z2);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            dyb.c = Rating.newStarRating(i, dyb.b());
                            break;
                        case 6:
                            if (i != 6 || !dyb.c()) {
                                f = -1.0f;
                            }
                            dyb.c = Rating.newPercentageRating(f);
                            break;
                        default:
                            obj = null;
                            break;
                    }
                } else {
                    dyb.c = Rating.newUnratedRating(i);
                }
            }
            obj = dyb.c;
            ((Bundle) this.b).putParcelable(str, (Parcelable) obj);
            return;
        }
        throw new IllegalArgumentException(wn6.i("The ", str, " key cannot be used to put a Rating"));
    }

    public void m(ktd ktd) {
    }

    public Object n() {
        Context context = (Context) ((t4g) ((c1g) this.b)).a.a;
        if (context != null) {
            rf0.g("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("AppUpdateListenerRegistry");
            new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
            Object obj = new Object();
            new HashSet();
            context.getApplicationContext();
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public void o(String str, String str2) {
        Integer num = (Integer) a88.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.b).putCharSequence(str, str2);
            return;
        }
        throw new IllegalArgumentException(wn6.i("The ", str, " key cannot be used to put a String"));
    }

    public void p(String str, CharSequence charSequence) {
        Integer num = (Integer) a88.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.b).putCharSequence(str, charSequence);
            return;
        }
        throw new IllegalArgumentException(wn6.i("The ", str, " key cannot be used to put a CharSequence"));
    }

    public void q() {
        xu7 xu7 = (xu7) this.b;
        xu7.getClass();
        try {
            d1g d1g = (d1g) xu7.a;
            d1g.H0(d1g.G0(), 1);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void r() {
        wcd wcd = (wcd) this.b;
        wcd.e = (((int) (Math.min(1.0f, Math.max(0.0f, 1.0f)) * 255.0f)) << 24) | (wcd.e & 16777215);
    }

    public void s(int i) {
        wcd wcd = (wcd) this.b;
        wcd.e = (i & 16777215) | (wcd.e & -16777216);
    }

    public void t(ktd ktd) {
        k77[] k77Arr = StickersScreen.z0;
        StickersScreen stickersScreen = (StickersScreen) this.b;
        boolean z = ((q99) stickersScreen.n0().r().e.a.getValue()).a;
        long j = ktd.a;
        if (z) {
            w99 r = stickersScreen.n0().r();
            qod D = xs7.D(r.a, r.b.a(), ru3.b, new u99(r, j, (Continuation) null));
            r.f.o1(r, w99.g[0], D);
            return;
        }
        d34 P1 = vwd.c.P1();
        P1.b(":stickers/preview?sticker_id=" + j, (Bundle) null);
    }

    public void u(long j) {
        if (j >= 0) {
            ((wcd) this.b).o = j;
            return;
        }
        throw new IllegalArgumentException(us8.i(j, "Given a negative duration: ").toString());
    }

    public void v(int i) {
        if (i >= 0) {
            ((wcd) this.b).f = i;
            return;
        }
        throw new IllegalArgumentException(wn6.h(i, "Given invalid width: ").toString());
    }

    public void w(om0 om0) {
        f1g f1g = ((xu7) this.b).a;
        lhd lhd = om0.a;
        if (lhd == null) {
            try {
                d1g d1g = (d1g) f1g;
                Parcel G0 = d1g.G0();
                u1g.c(G0, (IInterface) null);
                d1g.H0(G0, 18);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            d1g d1g2 = (d1g) f1g;
            Parcel G02 = d1g2.G0();
            u1g.c(G02, (un6) lhd.b);
            d1g2.H0(G02, 18);
        }
    }

    public void x(Long l) {
        xu7 xu7 = (xu7) this.b;
        xu7.getClass();
        try {
            f1g f1g = xu7.a;
            ks9 ks9 = new ks9(l);
            d1g d1g = (d1g) f1g;
            Parcel G0 = d1g.G0();
            u1g.c(G0, ks9);
            d1g.H0(G0, 29);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void y() {
        xu7 xu7 = (xu7) this.b;
        xu7.getClass();
        try {
            d1g d1g = (d1g) xu7.a;
            Parcel G0 = d1g.G0();
            int i = u1g.a;
            G0.writeInt(1);
            d1g.H0(G0, 14);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r3 = r3.b
            bq6 r3 = (defpackage.bq6) r3
            java.util.concurrent.atomic.AtomicReference r0 = r3.q
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r3.q     // Catch:{ all -> 0x0014 }
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ all -> 0x0014 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            goto L_0x0024
        L_0x0014:
            r3 = move-exception
            goto L_0x0025
        L_0x0016:
            int r1 = r1.intValue()     // Catch:{ all -> 0x0014 }
            int r2 = r3.H()     // Catch:{ all -> 0x0014 }
            if (r1 == r2) goto L_0x0023
            r3.K()     // Catch:{ all -> 0x0014 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
        L_0x0024:
            return
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9.z():void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ul7, java.lang.Object] */
    public c9(File file) {
        this.a = 10;
        ? obj = new Object();
        obj.a = 0L;
        obj.b = 0L;
        e07.o(file, "File can't be null.");
        this.b = obj;
        obj.c = file;
    }

    public c9(int i) {
        Object obj;
        this.a = i;
        switch (i) {
            case 11:
                this.b = null;
                return;
            case 15:
                this.b = new Bundle();
                return;
            case 19:
                this.b = new ui5(0);
                return;
            case 21:
                wcd wcd = new wcd();
                this.b = wcd;
                wcd.l = false;
                return;
            default:
                fc9 c = fc9.c();
                this.b = c;
                Object obj2 = null;
                try {
                    obj = c.h(gde.d0);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                Class<hv1> cls2 = hv1.class;
                if (cls == null || cls.equals(cls2)) {
                    z80 z80 = gde.d0;
                    fc9 fc9 = (fc9) this.b;
                    fc9.j(z80, cls2);
                    try {
                        obj2 = fc9.h(gde.c0);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (obj2 == null) {
                        fc9.j(gde.c0, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }
}
