package defpackage;

import android.media.browse.MediaBrowser;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.service.media.MediaBrowserService;
import android.view.View;
import androidx.recyclerview.widget.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.api.core.ApiInvocationException;

/* renamed from: e3  reason: default package */
public final class e3 implements pu, h67, o51, yj1, uw9, p0c, dj7, sj4, au, of3, om7, JavaAudioDeviceModule.AudioRecordSampleHook, m9f, oye {
    public static e3 b;
    public Object a;

    public /* synthetic */ e3(Object obj) {
        this.a = obj;
    }

    public void E(gj7 gj7, long j, long j2) {
        nja nja = (nja) gj7;
        uy3 uy3 = (uy3) this.a;
        uy3.getClass();
        long j3 = nja.a;
        Uri uri = nja.o.c;
        yi7 yi7 = new yi7(j2);
        uy3.m.getClass();
        uy3.q.z(yi7, nja.c, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        uy3.L = ((Long) nja.Y).longValue() - j;
        uy3.y(true);
    }

    public jue J(long j, List list) {
        ((z63) this.a).makeCompleting$kotlinx_coroutines_core(list);
        return jue.a;
    }

    public nsf M(View view, nsf nsf) {
        n23 n23 = (n23) this.a;
        n23.getClass();
        WeakHashMap weakHashMap = eaf.a;
        nsf nsf2 = n23.getFitsSystemWindows() ? nsf : null;
        if (!Objects.equals(n23.S0, nsf2)) {
            n23.S0 = nsf2;
            n23.requestLayout();
        }
        return nsf.a.c();
    }

    public Object T0(Object obj, k77 k77) {
        return (g37) ((AtomicReference) this.a).get();
    }

    public sz0 U(gj7 gj7, long j, long j2, IOException iOException, int i) {
        nja nja = (nja) gj7;
        uy3 uy3 = (uy3) this.a;
        uy3.getClass();
        long j3 = nja.a;
        Uri uri = nja.o.c;
        uy3.q.C(new yi7(j2), nja.c, iOException, true);
        uy3.m.getClass();
        uy3.x(iOException);
        return ul7.X;
    }

    public e13 a(int i) {
        return ((rm0) ((te) this.a).b).v(i);
    }

    public void accept(Object obj) {
        um9 um9 = (um9) obj;
        zz6 zz6 = (zz6) this.a;
        zz6.d.f(zz6);
        zz6.l.compareAndSet(true, false);
    }

    public ch7 apply(Object obj) {
        return ct0.w(((t26) this.a).apply(obj));
    }

    public void b() {
        ygd ygd = (ygd) ((vj4) this.a).e;
        ygd.getClass();
        k77[] k77Arr = VideoViewerWidget.y0;
        ChatMediaViewerScreen n0 = ((VideoViewerWidget) ygd.a).n0();
        if (n0 != null) {
            n0.E0(true);
        }
    }

    public void c(int i) {
        vj4.a((vj4) this.a, false, i * 10);
    }

    public int d(View view) {
        ((a) this.a).getClass();
        return a.B(view) - view.getLayoutParams().leftMargin;
    }

    public void e(String str) {
        udd.n(((f3) this.a).e, str);
    }

    public void f(Object obj) {
        boolean z = obj instanceof List;
        ArrayList arrayList = null;
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.a;
        if (z) {
            List<Parcel> list = (List) obj;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            result.sendResult(arrayList);
        } else if (obj instanceof Parcel) {
            Parcel parcel2 = (Parcel) obj;
            parcel2.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        } else {
            result.sendResult((Object) null);
        }
    }

    public vn1 g(Object obj) {
        gt0.i();
        return hwf.f(new w48(this, 16, obj));
    }

    public int h() {
        return ((CallGridLayoutManager) this.a).M.getResources().getDisplayMetrics().heightPixels;
    }

    public int i() {
        return ((a) this.a).J();
    }

    public void j() {
        try {
            ((of3) this.a).accept(Boolean.TRUE);
        } catch (Throwable th) {
            udd.s("mm7", "checkLocationSettingsAndPermissions", th);
        }
    }

    public void k(Exception exc) {
        try {
            ((of3) this.a).accept(Boolean.FALSE);
        } catch (Throwable th) {
            udd.s("mm7", "checkLocationSettingsAndPermissions", th);
        }
    }

    public int l() {
        a aVar = (a) this.a;
        return aVar.n - aVar.K();
    }

    public View m(int i) {
        return ((a) this.a).v(i);
    }

    public int n(View view) {
        ((a) this.a).getClass();
        return a.E(view) + view.getLayoutParams().rightMargin;
    }

    public ob9 o() {
        return (fc9) this.a;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, java.util.function.BinaryOperator] */
    public void o1(Object obj, k77 k77, Object obj2) {
        g37 g37 = (g37) ((AtomicReference) this.a).accumulateAndGet((g37) obj2, new Object());
        if (g37 != null) {
            g37.start();
        }
    }

    public void onWebRtcAudioRecordSamplesReady(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        gia gia;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i == 2) {
            gia = new eia(i5 >> 1, i4, 0, bArr);
        } else if (i == 3) {
            gia = new eia(i5, i4, 1, bArr);
        } else if (i == 4) {
            gia = new fia(bArr, i4, i5);
        } else {
            throw new IllegalArgumentException(rf0.f(i, "Audio format ", " is not supported. Please, use PCM 8 bit / 16 bit / float"));
        }
        Iterator it = ((CopyOnWriteArraySet) this.a).iterator();
        while (it.hasNext()) {
            mwf mwf = (mwf) it.next();
            if (mwf.c < elapsedRealtime) {
                mwf.c = mwf.b + elapsedRealtime;
                mwf.a.onSample(i, i2, i3, gia);
            }
        }
    }

    public Object parse(m67 m67) {
        nu7 nu7;
        il[] ilVarArr = (il[]) this.a;
        nu7[] nu7Arr = new nu7[ilVarArr.length];
        m67.u();
        int length = ilVarArr.length;
        for (int i = 0; i < length; i++) {
            il ilVar = ilVarArr[i];
            m67.s();
            String T = m67.T();
            int hashCode = T.hashCode();
            if (hashCode != 3548) {
                if (hashCode == 3135262 && T.equals("fail")) {
                    ApiInvocationException apiInvocationException = (ApiInvocationException) ilVar.b.getFailParser().parse(m67);
                    nu7 = new nu7(ilVar, new Object());
                    m67.q();
                    nu7Arr[i] = nu7;
                }
            } else if (T.equals("ok")) {
                nu7 = new nu7(ilVar, ilVar.b.getOkParser().parse(new zw2(m67)));
                m67.q();
                nu7Arr[i] = nu7;
            }
            m67.z();
            nu7 = new nu7(ilVar, (Object) null);
            m67.q();
            nu7Arr[i] = nu7;
        }
        m67.t();
        return new xj0(nu7Arr);
    }

    public pye r() {
        return new ozd(hga.a((fc9) this.a));
    }

    public void x(gj7 gj7, long j, long j2, boolean z) {
        ((uy3) this.a).w((nja) gj7, j, j2);
    }

    public e3(int i) {
        switch (i) {
            case 23:
                this.a = new v2b(1);
                return;
            case 27:
                this.a = new Object();
                new Handler(Looper.getMainLooper(), new ald(0, this));
                return;
            default:
                this.a = new CopyOnWriteArraySet();
                return;
        }
    }

    public e3(fc9 fc9) {
        Object obj;
        this.a = fc9;
        Object obj2 = null;
        try {
            obj = fc9.h(gde.d0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        Class<nzd> cls2 = nzd.class;
        if (cls == null || cls.equals(cls2)) {
            ((fc9) this.a).j(pye.s0, rye.X);
            z80 z80 = gde.d0;
            fc9 fc92 = (fc9) this.a;
            fc92.j(z80, cls2);
            try {
                obj2 = fc92.h(gde.c0);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                fc92.j(gde.c0, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
