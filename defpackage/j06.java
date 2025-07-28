package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.CamcorderProfile;
import android.os.Parcel;
import android.view.View;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.google.android.material.tabs.TabLayout;
import java.util.Iterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: j06  reason: default package */
public class j06 implements bi, i13, v1b, oq1, vze, gg9, p8f, n8c {
    public static final j06 X = new Object();
    public static final lpa Y = new lpa(22);
    public static final j06 Z = new Object();
    public static final j06 a = new Object();
    public static final j06 b = new Object();
    public static final j06 c = new Object();
    public static final j06 o = new Object();

    public static RectF c(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.W0 || !(view instanceof l9e)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        l9e l9e = (l9e) view;
        int contentWidth = l9e.getContentWidth();
        int contentHeight = l9e.getContentHeight();
        int m = (int) gwf.m(l9e.getContext(), 24);
        if (contentWidth < m) {
            contentWidth = m;
        }
        int right = (l9e.getRight() + l9e.getLeft()) / 2;
        int bottom = (l9e.getBottom() + l9e.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF((float) (right - i), (float) (bottom - (contentHeight / 2)), (float) (i + right), (float) ((right / 2) + bottom));
    }

    public static zyb d(int i) {
        Object obj;
        pz4 pz4 = zyb.X;
        pz4.getClass();
        u1 u1Var = new u1(0, pz4);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((zyb) obj).a == i) {
                break;
            }
        }
        zyb zyb = (zyb) obj;
        if (zyb != null) {
            return zyb;
        }
        throw new IllegalArgumentException(wn6.h(i, "Unknown reactionType = "));
    }

    public static kc5 f(String str) {
        Object obj;
        if (str == null || h0e.c0(str)) {
            return kc5.c;
        }
        String upperCase = h0e.B0(str).toString().toUpperCase(Locale.US);
        if (upperCase.length() > 4) {
            return kc5.c;
        }
        pz4 pz4 = kc5.X;
        int size = pz4.getSize();
        pz4.getClass();
        u1 u1Var = new u1(0, new w1(pz4, 1, size));
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (hhd.f(((kc5) obj).name(), upperCase)) {
                break;
            }
        }
        kc5 kc5 = (kc5) obj;
        return kc5 == null ? kc5.c : kc5;
    }

    public CamcorderProfile a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    public void accept(Object obj, Object obj2) {
        w3g w3g = (w3g) ((p2g) obj).o();
        x4g x4g = new x4g((vde) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = c2g.a;
        obtain.writeInt(1);
        ek8.o0(obtain, ek8.n0(obtain, 20293));
        obtain.writeStrongBinder(x4g);
        Parcel obtain2 = Parcel.obtain();
        try {
            w3g.c.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public boolean b(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    public void e(String str) {
    }

    public void g(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF c2 = c(tabLayout, view);
        RectF c3 = c(tabLayout, view2);
        drawable.setBounds(og.c((int) c2.left, f, (int) c3.left), drawable.getBounds().top, og.c((int) c2.right, f, (int) c3.right), drawable.getBounds().bottom);
    }

    public int i(Object obj) {
        return ((b13) obj).getSizeInBytes();
    }

    public void j(String str, Throwable th) {
    }

    public void k(VideoSink$VideoSinkException videoSink$VideoSinkException) {
    }

    public void l() {
    }

    public void o(Throwable th) {
        if (th != null) {
            th.getMessage();
        }
    }

    public void onFirstFrameRendered() {
    }

    public lbe q(ws8 ws8) {
        int i;
        String str;
        if (!ws8.m()) {
            return new vj3((uj3) null);
        }
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return new vj3((uj3) null);
        }
        uj3 uj3 = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th2) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th2);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 == 0) {
                    str = null;
                } else if (t2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("contact")) {
                    try {
                        uj3 = uj3.e(ws8);
                    } catch (Throwable th3) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = uzc.a.iterator();
                        while (it3.hasNext()) {
                            ((ny9) it3.next()).getClass();
                            ny9.a(th3);
                        }
                        int t3 = hr1.t(m4b.a);
                        if (t3 == 0) {
                            uj3 = null;
                        } else if (t3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                } else {
                    try {
                        ws8.z();
                    } catch (Throwable th4) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = uzc.a.iterator();
                        while (it4.hasNext()) {
                            ((ny9) it4.next()).getClass();
                            ny9.a(th4);
                        }
                        int t4 = hr1.t(m4b.a);
                        if (t4 != 0) {
                            if (t4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new vj3(uj3);
    }

    public boolean test(Object obj) {
        return ((Boolean) obj).booleanValue();
    }
}
