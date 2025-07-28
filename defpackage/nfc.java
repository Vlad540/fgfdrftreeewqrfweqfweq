package defpackage;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Window;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.Size;

/* renamed from: nfc  reason: default package */
public final class nfc implements gm8, CameraVideoCapturer.CaptureFormatHelper, ek2, d13, up3, cj7, dja, i36, htd {
    public static final Object X = new Object();
    public static volatile nfc Y;
    public static nfc c;
    public static final ofc o = new ofc(0, false, false, 0, 0);
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ nfc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static synchronized nfc o() {
        nfc nfc;
        synchronized (nfc.class) {
            try {
                if (c == null) {
                    c = new nfc(0, false);
                }
                nfc = c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return nfc;
    }

    public static nfc p() {
        if (Y == null) {
            synchronized (X) {
                try {
                    if (Y == null) {
                        Y = new nfc(1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        nfc nfc = Y;
        a24.o(nfc);
        return nfc;
    }

    public void a(Object obj) {
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                List list = (List) obj;
                y5c y5c = (y5c) this.b;
                y5c.i(y5c.T, y5c.S);
                return;
            default:
                Void voidR = (Void) obj;
                return;
        }
    }

    public Object b() {
        return this.b;
    }

    public xp3 build() {
        return new xp3(new lv1(((ContentInfo.Builder) this.b).build()));
    }

    public void c(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    public boolean d() {
        return true;
    }

    public void e(Throwable th) {
        p7e p7e;
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                y5c y5c = (y5c) this.b;
                e07.p("In-progress recording shouldn't be null", y5c.q != null);
                if (!y5c.q.A0) {
                    Objects.toString(th);
                    y5c.i(th, y5c.C == null ? 8 : 6);
                    return;
                }
                return;
            default:
                p7e p7e2 = (p7e) this.b;
                q7e q7e = (q7e) p7e2;
                synchronized (q7e.a) {
                    try {
                        List<xc4> list = q7e.j;
                        if (list != null) {
                            for (xc4 b2 : list) {
                                b2.b();
                            }
                            q7e.j = null;
                        }
                    } finally {
                        while (true) {
                            break;
                        }
                    }
                }
                q7e.t.d();
                s30 s30 = p7e2.b;
                Iterator it = s30.l().iterator();
                while (it.hasNext() && (p7e = (p7e) it.next()) != p7e2) {
                    q7e q7e2 = (q7e) p7e;
                    synchronized (q7e2.a) {
                        try {
                            List<xc4> list2 = q7e2.j;
                            if (list2 != null) {
                                for (xc4 b3 : list2) {
                                    b3.b();
                                }
                                q7e2.j = null;
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                                break;
                            }
                        }
                    }
                    q7e2.t.d();
                }
                synchronized (s30.b) {
                    ((LinkedHashSet) s30.X).remove(p7e2);
                }
                return;
        }
    }

    public void f(pl8 pl8, boolean z) {
        cn cnVar;
        pl8 k = pl8.k();
        int i = 0;
        boolean z2 = k != pl8;
        if (z2) {
            pl8 = k;
        }
        dn dnVar = (dn) this.b;
        cn[] cnVarArr = dnVar.a1;
        int length = cnVarArr != null ? cnVarArr.length : 0;
        while (true) {
            if (i < length) {
                cnVar = cnVarArr[i];
                if (cnVar != null && cnVar.h == pl8) {
                    break;
                }
                i++;
            } else {
                cnVar = null;
                break;
            }
        }
        if (cnVar == null) {
            return;
        }
        if (z2) {
            dnVar.o(cnVar.a, cnVar, k);
            dnVar.q(cnVar, true);
            return;
        }
        dnVar.q(cnVar, z);
    }

    public void g(fj7 fj7, long j, long j2, boolean z) {
        ((ty3) this.b).r((mja) fj7, j, j2);
    }

    public CameraEnumerationAndroid.CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List list, int i) {
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = nfc.super.getClosestSupportedFramerateRange(list, i);
        String concat = "available fps ranges are ".concat(o23.c0(list, ", ", (String) null, (String) null, (u16) null, 62));
        xwb xwb = (xwb) this.b;
        xwb.log("CaptureFormatHelper", concat);
        xwb.log("CaptureFormatHelper", "closest frame rate range for requested " + i + " is " + closestSupportedFramerateRange);
        return closestSupportedFramerateRange;
    }

    public Size getClosestSupportedSize(List list, int i, int i2) {
        Size closestSupportedSize = nfc.super.getClosestSupportedSize(list, i, i2);
        String concat = "available frame sizes are ".concat(o23.c0(list, ", ", (String) null, (String) null, (u16) null, 62));
        xwb xwb = (xwb) this.b;
        xwb.log("CaptureFormatHelper", concat);
        xwb.log("CaptureFormatHelper", "closest frame size range for requested " + i + "x" + i2 + " is " + closestSupportedSize);
        return closestSupportedSize;
    }

    public void h(ClipData clipData) {
        ((ContentInfo.Builder) this.b).setClip(clipData);
    }

    public Object i() {
        return this.b;
    }

    public void j() {
        ((zl3) this.b).getClass();
    }

    public Object k(Long l) {
        return (i22) ((bv2) ((t97) this.b).getValue()).m(l.longValue()).a.getValue();
    }

    public void l(rcd rcd, Throwable th) {
        ((zl3) this.b).getClass();
        Object b2 = rcd.b();
        m75.m("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(rcd)), b2 != null ? b2.getClass().getName() : "<value is null>", th == null ? BuildConfig.FLAVOR : Log.getStackTraceString(th));
    }

    public void m(ktd ktd) {
        ((fwd) this.b).m(ktd);
    }

    public ci4 n(sh4 sh4) {
        ((zl3) this.b).getClass();
        int i = sh4.a;
        o3e o3e = sh4.c;
        String str = sh4.b;
        gk9 gk9 = sh4.h;
        xq4 xq4 = new xq4(i, o3e, str, gk9);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new ci4(xq4, sh4.g, new p7(sh4.f, sh4.e, sh4.d), sh4.i, gk9, newSingleThreadExecutor);
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [kja, java.lang.Object] */
    public void q(fj7 fj7, long j, long j2) {
        long j3 = j;
        mja mja = (mja) fj7;
        ty3 ty3 = (ty3) this.b;
        ty3.getClass();
        long j4 = mja.a;
        xz3 xz3 = mja.b;
        esd esd = mja.o;
        xi7 xi7 = new xi7(j4, xz3, esd.c, esd.o, j, j2, esd.b);
        ty3.n.getClass();
        ty3.q.f(xi7, mja.c, -1, (vu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        dy3 dy3 = (dy3) mja.Y;
        dy3 dy32 = ty3.H;
        int size = dy32 == null ? 0 : dy32.m.size();
        long j5 = dy3.b(0).b;
        int i = 0;
        while (i < size && ty3.H.b(i).b < j5) {
            i++;
        }
        if (dy3.d) {
            if (size - i <= dy3.m.size()) {
                long j6 = ty3.N;
                if (j6 == -9223372036854775807L || dy3.h * 1000 > j6) {
                    ty3.M = 0;
                }
            }
            int i2 = ty3.M;
            ty3.M = i2 + 1;
            if (i2 < ty3.n.h(mja.c)) {
                ty3.D.postDelayed(ty3.v, (long) Math.min((ty3.M - 1) * 1000, 5000));
                return;
            } else {
                ty3.C = new DashManifestStaleException();
                return;
            }
        }
        ty3.H = dy3;
        ty3.I = dy3.d & ty3.I;
        ty3.J = j3 - j2;
        ty3.K = j3;
        synchronized (ty3.t) {
            try {
                if (mja.b.a == ty3.F) {
                    Uri uri = ty3.H.k;
                    if (uri == null) {
                        uri = mja.o.c;
                    }
                    ty3.F = uri;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (size == 0) {
            dy3 dy33 = ty3.H;
            if (dy33.d) {
                v4b v4b = dy33.i;
                if (v4b != null) {
                    String str = (String) v4b.b;
                    if (mze.a(str, "urn:mpeg:dash:utc:direct:2014") || mze.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        try {
                            ty3.L = mze.G((String) v4b.c) - ty3.K;
                            ty3.s(true);
                        } catch (ParserException e) {
                            oyb.b("Failed to resolve time offset.", e);
                            ty3.s(true);
                        }
                    } else if (mze.a(str, "urn:mpeg:dash:utc:http-iso:2014") || mze.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        mja mja2 = new mja(ty3.z, Uri.parse((String) v4b.c), 5, new Object());
                        ty3.q.k(new xi7(mja2.a, mja2.b, ty3.A.G(mja2, new za6((Object) ty3), 1)), mja2.c, -1, (vu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                    } else if (mze.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || mze.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                        mja mja3 = new mja(ty3.z, Uri.parse((String) v4b.c), 5, new qr4(9));
                        ty3.q.k(new xi7(mja3.a, mja3.b, ty3.A.G(mja3, new za6((Object) ty3), 1)), mja3.c, -1, (vu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                    } else if (mze.a(str, "urn:mpeg:dash:utc:ntp:2014") || mze.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                        ty3.q();
                    } else {
                        oyb.b("Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                        ty3.s(true);
                    }
                } else {
                    ty3.q();
                }
            } else {
                ty3.s(true);
            }
        } else {
            ty3.O += i;
            ty3.s(true);
        }
    }

    public void r(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof l5g)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public boolean s(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((((Context) suf.a(context).b).getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof l5g)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
                String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()});
            }
            if (executor == null) {
                executor = null;
            }
            if (executor != null) {
                try {
                    z = context.bindService(intent, i, executor, serviceConnection);
                } catch (Throwable th) {
                    concurrentHashMap.remove(serviceConnection, serviceConnection);
                    throw th;
                }
            } else {
                z = context.bindService(intent, serviceConnection, i);
            }
            if (z) {
                return z;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        }
        if (executor == null) {
            executor = null;
        }
        return executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
    }

    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public void setFlags(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    public void t(ktd ktd) {
        ((fwd) this.b).t(ktd);
    }

    public boolean x(pl8 pl8) {
        Window.Callback callback;
        if (pl8 != pl8.k()) {
            return true;
        }
        dn dnVar = (dn) this.b;
        if (!dnVar.U0 || (callback = dnVar.A0.getCallback()) == null || dnVar.f1) {
            return true;
        }
        callback.onMenuOpened(108, pl8);
        return true;
    }

    public sz0 y(fj7 fj7, long j, long j2, IOException iOException, int i) {
        long j3;
        IOException iOException2 = iOException;
        mja mja = (mja) fj7;
        ty3 ty3 = (ty3) this.b;
        ty3.getClass();
        long j4 = mja.a;
        esd esd = mja.o;
        xi7 xi7 = new xi7(j4, mja.b, esd.c, esd.o, j, j2, esd.b);
        ty3.n.getClass();
        if (!(iOException2 instanceof ParserException) && !(iOException2 instanceof FileNotFoundException) && !(iOException2 instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException2 instanceof Loader$UnexpectedLoaderException)) {
            int i2 = DataSourceException.b;
            Throwable th = iOException2;
            while (true) {
                if (th != null) {
                    if ((th instanceof DataSourceException) && ((DataSourceException) th).a == 2008) {
                        break;
                    }
                    th = th.getCause();
                } else {
                    j3 = (long) Math.min((i - 1) * 1000, 5000);
                    break;
                }
            }
        }
        j3 = -9223372036854775807L;
        sz0 q = j3 == -9223372036854775807L ? jj7.Y : jj7.q(j3, false);
        ty3.q.i(xi7, mja.c, iOException2, !q.a());
        return q;
    }

    public /* synthetic */ nfc(int i, boolean z) {
        this.a = i;
    }

    public nfc(int i) {
        this.a = i;
        switch (i) {
            case 16:
                this.b = new q16(5, 0, (byte) 0);
                return;
            case 25:
                this.b = (ExtraCroppingQuirk) zf4.a.j(ExtraCroppingQuirk.class);
                return;
            case 26:
                this.b = new Object();
                return;
            default:
                this.b = new ConcurrentHashMap();
                return;
        }
    }

    public nfc(xe6 xe6) {
        this.a = 2;
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) xe6.j(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.b = null;
        } else {
            this.b = aeFpsRangeLegacyQuirk.a;
        }
    }

    public nfc(TextView textView) {
        this.a = 15;
        e07.o(textView, "textView cannot be null");
        this.b = new hv4(textView);
    }

    public nfc(ClipData clipData, int i) {
        this.a = 11;
        this.b = p20.k(clipData, i);
    }

    public nfc(xp3 xp3) {
        this.a = 11;
        tp3.m();
        ContentInfo i = xp3.a.i();
        Objects.requireNonNull(i);
        this.b = tp3.j(p20.m(i));
    }
}
