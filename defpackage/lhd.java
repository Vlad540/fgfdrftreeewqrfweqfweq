package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import javax.inject.Provider;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: lhd  reason: default package */
public class lhd implements gm8, ta9, dd1, gl1, of3, hw7, vc9, i8, i36, rpa, hib {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ lhd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static chd o(lhd lhd, Context context, int i) {
        lhd.getClass();
        int i2 = gaa.j;
        htd htd = (htd) lhd.b;
        return i == i2 ? new hr7(context, htd, 81, 2) : i == gaa.i ? new hr7(context, htd, 81, 0) : new hr7(context, htd, 81, 1);
    }

    public void A(raf raf) {
        k77[] k77Arr = CallTopPanelWidget.o;
        taf.o(((CallTopPanelWidget) this.b).m0().b.Q0, new dh1(raf));
    }

    public void B() {
        View view;
        View view2 = (View) this.b;
        if (view2 != null) {
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                view = view2;
            } else {
                view = view2.getRootView().findFocus();
            }
            if (view == null) {
                view = view2.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new mg(view, 6));
            }
        }
    }

    public void G(le1 le1) {
        pg1 pg1;
        wwc wwc = ((w51) this.b).N0;
        if (wwc != null && (pg1 = ((r51) wwc.b).S0) != null) {
            smc smc = CallScreen.T0;
            CallScreen callScreen = pg1.a;
            if (callScreen.z0().q(callScreen.u0().g)) {
                CallScreen.o0(callScreen);
            }
        }
    }

    public void H() {
    }

    public void I() {
        ((k40) this.b).h();
    }

    public void K() {
        k40 k40 = (k40) this.b;
        Long l = (Long) k40.Z;
        va9 va9 = (va9) k40.c;
        long l2 = ((nb9) va9).l();
        if (l == null || l.longValue() != l2) {
            if (((Long) k40.Z) == null) {
                k40.Z = Long.valueOf(((nb9) va9).l());
            }
            if (!k40.b) {
                ((hcd) k40.o).g(new i40(new hge(b8a.a)));
                k40.h();
            }
        }
    }

    public void N() {
        k40 k40 = (k40) this.b;
        k40.h();
        ((hcd) k40.o).g(h40.a);
    }

    public void P() {
        pg1 pg1;
        wwc wwc = ((w51) this.b).N0;
        if (wwc != null && (pg1 = ((r51) wwc.b).S0) != null) {
            smc smc = CallScreen.T0;
            pg1.a.z0().Z.c();
        }
    }

    public void S(le1 le1) {
        pg1 pg1;
        wwc wwc = ((w51) this.b).N0;
        if (wwc != null && (pg1 = ((r51) wwc.b).S0) != null) {
            smc smc = CallScreen.T0;
            pg1.a.z0().v(le1);
        }
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                Throwable th = (Throwable) obj;
                wy1 wy1 = (wy1) this.b;
                udd.s(wy1.Z, "onUploadFailed: failed", th);
                jee s = wy1.s();
                long j = wy1.b;
                s.d(j);
                wy1.z();
                wy1.y();
                wy1.t().c(new jh0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new uae("internal-error", th.toString(), (String) null)));
                return;
            default:
                Integer num = (Integer) obj;
                p14 p14 = (p14) this.b;
                p14.getClass();
                p14.b.run();
                return;
        }
    }

    public ws6 b(int i) {
        return ((le4) this.b).b(i);
    }

    public void c() {
        pg1 pg1;
        wwc wwc = ((w51) this.b).N0;
        if (wwc != null && (pg1 = ((r51) wwc.b).S0) != null) {
            smc smc = CallScreen.T0;
            CallScreen callScreen = pg1.a;
            callScreen.t0().d(3, 2);
            String str = oyb.g;
            oyb.R(callScreen.getContext(), at7.W(callScreen.z0().s().k));
        }
    }

    public void d() {
        pg1 pg1;
        wwc wwc = ((w51) this.b).N0;
        if (wwc != null && (pg1 = ((r51) wwc.b).S0) != null) {
            smc smc = CallScreen.T0;
            CallScreen callScreen = pg1.a;
            callScreen.t0().d(1, 2);
            hhd.q(callScreen.getContext(), at7.W(callScreen.z0().s().k));
            if (hhd.y()) {
                String string = callScreen.getContext().getString(ftb.call_link_share_dialog_share_link_copy);
                hba hba = new hba((Widget) callScreen);
                hba.i(string);
                hba.d(new bm1(3, (s16) null));
                hba.c(new pba(0, 0, 3));
                hba.j();
            }
        }
    }

    public void e(Throwable th) {
        ((pp6) this.b).close();
    }

    public void f(pl8 pl8, boolean z) {
        if (pl8 instanceof w0e) {
            ((w0e) pl8).O0.k().c(false);
        }
        gm8 gm8 = ((i7) this.b).X;
        if (gm8 != null) {
            gm8.f(pl8, z);
        }
    }

    public void g() {
        k77[] k77Arr = PhotoViewerWidget.X;
        PhotoViewerWidget photoViewerWidget = (PhotoViewerWidget) this.b;
        photoViewerWidget.o0().B(photoViewerWidget.m0(), photoViewerWidget.l0());
    }

    public Object get() {
        return ((Provider) this.b).get();
    }

    public void h() {
        pg1 pg1;
        wwc wwc = ((w51) this.b).N0;
        if (wwc != null && (pg1 = ((r51) wwc.b).S0) != null) {
            smc smc = CallScreen.T0;
            pg1.a.z0().r();
        }
    }

    public void i() {
        tpa targetController = ((PhotoViewerWidget) this.b).getTargetController();
        tpa tpa = targetController instanceof tpa ? targetController : null;
        if (tpa != null) {
            ((ChatMediaViewerScreen) tpa).E0(false);
        }
    }

    public void j() {
        wwc wwc = ((w51) this.b).N0;
        if (wwc != null && ((r51) wwc.b).S0 != null) {
            oc1.c.getClass();
        }
    }

    public yc9 k(String str) {
        return new mod(13, ((le4) this.b).k(str));
    }

    public void l() {
        pg1 pg1;
        wwc wwc = ((w51) this.b).N0;
        if (wwc != null && (pg1 = ((r51) wwc.b).S0) != null) {
            smc smc = CallScreen.T0;
            CallScreen callScreen = pg1.a;
            callScreen.t0().d(2, 2);
            aj1 z0 = callScreen.z0();
            z0.getClass();
            taf.o(z0.Q0, new qh1(at7.W(z0.s().k)));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, ay3] */
    /* JADX WARNING: type inference failed for: r9v0, types: [j8e, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [km4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v6, types: [nxc, java.lang.Object] */
    public ay3 m() {
        Context context = (Context) this.b;
        if (context != null) {
            ? obj = new Object();
            obj.a = oj4.a(urd.b);
            ea6 ea6 = new ea6(17, context);
            obj.b = ea6;
            obj.c = oj4.a(new afc((Object) ea6, (Object) new w4g(ea6)));
            ea6 ea62 = obj.b;
            obj.o = new jj7(ea62);
            Provider a2 = oj4.a(new x3a(12, ea62));
            obj.X = a2;
            Provider a3 = oj4.a(new ez2(obj.o, a2));
            obj.Y = a3;
            gvf gvf = new gvf(24);
            ea6 ea63 = obj.b;
            ns7 ns7 = n06.d;
            ? obj2 = new Object();
            obj2.a = ea63;
            obj2.b = a3;
            obj2.c = gvf;
            obj2.o = ns7;
            Provider provider = obj.a;
            Provider provider2 = obj.c;
            ja4 ja4 = new ja4(provider, provider2, obj2, a3, a3);
            gf6 gf6 = a06.g;
            ns7 ns72 = n06.d;
            ? obj3 = new Object();
            obj3.b = ea63;
            obj3.c = provider2;
            obj3.a = a3;
            obj3.o = obj2;
            obj3.X = provider;
            obj3.Y = a3;
            obj3.Z = gf6;
            obj3.w0 = ns72;
            obj3.x0 = a3;
            ? obj4 = new Object();
            obj4.a = provider;
            obj4.b = a3;
            obj4.c = obj2;
            obj4.o = a3;
            obj.Z = oj4.a(new ja4(ja4, obj3, obj4));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public void n() {
        ((k40) this.b).h();
    }

    public void p() {
        k77[] k77Arr = PhotoViewerWidget.X;
        PhotoViewerWidget photoViewerWidget = (PhotoViewerWidget) this.b;
        photoViewerWidget.o0().z(photoViewerWidget.m0(), photoViewerWidget.l0());
    }

    public void q() {
    }

    public void r(oq6 oq6, long j) {
        Bitmap underlyingBitmap;
        CloseableStaticBitmap closeableStaticBitmap = oq6 instanceof CloseableStaticBitmap ? (CloseableStaticBitmap) oq6 : null;
        if (closeableStaticBitmap != null && (underlyingBitmap = closeableStaticBitmap.getUnderlyingBitmap()) != null) {
            kn0 kn0 = new kn0(underlyingBitmap, 0);
            ((zd) ((knc) this.b)).c(kn0, j + ".jpg");
        }
    }

    public Pattern s(String str) {
        Object obj;
        og0 og0 = (og0) this.b;
        synchronized (og0) {
            obj = ((q7c) og0.c).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            og0 og02 = (og0) this.b;
            synchronized (og02) {
                ((q7c) og02.c).put(str, pattern);
            }
        }
        return pattern;
    }

    public void t() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void u(Exception exc) {
        ez3.B("Audio sink error", exc);
        qe4 qe4 = ((m28) this.b).V1;
        Handler handler = (Handler) qe4.b;
        if (handler != null) {
            handler.post(new v50(qe4, exc, 1));
        }
    }

    public void v(le1 le1, Point point) {
        pg1 pg1;
        wwc wwc = ((w51) this.b).N0;
        if (wwc != null && (pg1 = ((r51) wwc.b).S0) != null) {
            smc smc = CallScreen.T0;
            pg1.a.z0().x(le1, point);
        }
    }

    public void w(Object obj) {
        a c;
        h8 h8Var = (h8) obj;
        c cVar = (c) this.b;
        qx5 qx5 = (qx5) cVar.F.pollLast();
        if (qx5 != null && (c = cVar.c.c(qx5.a)) != null) {
            c.t0(qx5.b, h8Var.a, h8Var.b);
        }
    }

    public boolean x(pl8 pl8) {
        i7 i7Var = (i7) this.b;
        if (pl8 == i7Var.c) {
            return false;
        }
        ((w0e) pl8).P0.getClass();
        i7Var.getClass();
        gm8 gm8 = i7Var.X;
        if (gm8 != null) {
            return gm8.x(pl8);
        }
        return false;
    }

    public void y(le1 le1) {
        pg1 pg1;
        wwc wwc = ((w51) this.b).N0;
        if (wwc != null && (pg1 = ((r51) wwc.b).S0) != null) {
            smc smc = CallScreen.T0;
            yl1 yl1 = pg1.a.z0().Z;
            yl1.getClass();
            if (!le1.equals(le1.c)) {
                po1 po1 = yl1.b;
                if (((zw3) po1.b().getValue()).h) {
                    po1.h(le1, false);
                }
            }
        }
    }

    public void z() {
        ((k40) this.b).h();
    }

    public lhd(un6 un6) {
        this.a = 4;
        a24.o(un6);
        this.b = un6;
    }

    public lhd(int i, byte b2) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new le4(4);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                this.b = zf4.a.j(ExtraSupportedSurfaceCombinationsQuirk.class);
                return;
            case 19:
                this.b = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                return;
        }
    }

    public lhd(int i) {
        this.a = 25;
        og0 og0 = new og0(0, 16);
        og0.b = i;
        og0.c = new q7c(og0, ((i * 4) / 3) + 1);
        this.b = og0;
    }

    public lhd(xe6 xe6) {
        this.a = 18;
        this.b = xe6.j(IncorrectJpegMetadataQuirk.class);
    }
}
