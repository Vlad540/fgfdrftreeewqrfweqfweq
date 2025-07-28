package ru.ok.messages.views.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.dialogs.SaveToGalleryDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgProfilePhoto extends FrgSlideOut {
    public ImageView G1;
    public ZoomableDraweeView H1;
    public i6 I1;
    public vo8 J1;
    public long K1;
    public boolean L1;
    public long M1;
    public long N1;

    public final boolean H0(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (h1() == null) {
                return true;
            }
            c0().finish();
            return true;
        } else if (itemId == yqb.menu_avatar_view__save_to_gallery) {
            if (h1() == null) {
                return true;
            }
            SaveToGalleryDialog.o1(this.I1.a, false).l1(this.J0, "ru.ok.messages.views.dialogs.SaveToGalleryDialog");
            return true;
        } else if (itemId != yqb.menu_avatar_view__share || h1() == null) {
            return true;
        } else {
            long n = ((j2b) ((gy9) this.u1.c()).z()).a.n();
            this.M1 = n;
            String str = this.I1.a;
            ((xq6) ((k93) this.t1.b).getAccessor().c(xq6.class)).a(str, new y06(n, str, new WeakReference(this), 1));
            return true;
        }
    }

    public final void M0(Bundle bundle) {
        super.M0(bundle);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_UPDATE_CONTROL_MSG", this.K1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_REQ_ID", this.M1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID", this.N1);
        if (this.L1) {
            bundle.putParcelable("ru.ok.tamtam.extra.EXTRA_CHANGED_CONTENT_HOLDER", this.I1);
        }
    }

    public final String g1() {
        return "AVATAR_PHOTO";
    }

    public final void m1(int i, int i2, Intent intent) {
    }

    @a1e
    @SuppressLint({"CheckResult"})
    public void onEvent(ove ove) {
        vo8 vo8 = this.J1;
        if (vo8 != null) {
            long j = ove.c;
            if (j != vo8.b) {
                return;
            }
            if (this.s1) {
                ((k93) this.t1.b).getClass();
                sk7 m = nqc.a.m();
                m.getClass();
                sk7.b(m, j, true, 2).i(((nbe) ((k93) this.t1.b).q()).b()).m(((nbe) ((k93) this.t1.b).q()).a()).k(new pn1(new h16(this), 2, new yc5(19)));
                return;
            }
            wx3.C(this.w1, ove, true);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View] */
    public final void t1() {
        this.G1.setVisibility(4);
        yle c0 = c0();
        mif a = c0 instanceof yle ? c0.a() : null;
        if (a != null) {
            a.l(this.I1.c);
        }
        this.H1.setVisibility(0);
        this.H1.setListener(new h16(this));
        ywa a2 = a06.a.a();
        List<String> list = this.I1.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                fr6 u = a06.u();
                tr6 b = tr6.b(str);
                u.getClass();
                arrayList.add(new er6(u, b, str));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        a2.g = new nv6(arrayList, true);
        a2.i = true;
        a2.l = this.H1.getController();
        this.H1.setController(a2.a());
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle != null) {
            this.K1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_UPDATE_CONTROL_MSG");
            i6 i6Var = (i6) bundle.getParcelable("ru.ok.tamtam.extra.EXTRA_CHANGED_CONTENT_HOLDER");
            this.I1 = i6Var;
            if (i6Var != null) {
                this.L1 = true;
            }
            this.M1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_REQ_ID");
            this.N1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID");
        }
        if (!this.L1) {
            this.I1 = (i6) this.Z.getParcelable("ru.ok.tamtam.extra.CONTENT_HOLDER");
        }
        wo8 wo8 = (wo8) this.Z.getParcelable("ru.ok.tamtam.extra.EXTRA_CONTROL_MSG_DB_PARC");
        if (wo8 != null) {
            this.J1 = wo8.a;
        }
    }

    public final void x0(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(bsb.menu_avatar_view, menu);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View] */
    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(zrb.frg_profile_photo, viewGroup, false);
        ImageView imageView = (ImageView) slideOutLayout.findViewById(yqb.frg_profile_photo__progress);
        this.G1 = imageView;
        imageView.setImageDrawable(new u10(e0(), 0));
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) slideOutLayout.findViewById(yqb.frg_profile_photo__iv_photo);
        this.H1 = zoomableDraweeView;
        z66 z66 = new z66(h0());
        z66.l = jlc.j;
        z66.j = new u10(e0(), 0);
        Context e0 = e0();
        int i = zhc.v;
        z66.f = js.q(i, -1, e0);
        z66.h = js.q(i, -1, e0());
        z66.b = 0;
        zoomableDraweeView.setHierarchy(z66.a());
        this.H1.setZoomEnabled(true);
        this.H1.setOnTouchListener(new cg3(new GestureDetector(e0(), new tz(10, this)), 2));
        t1();
        slideOutLayout.setSlideOutListener(this);
        Z0(true);
        return slideOutLayout;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View] */
    @a1e
    public void onEvent(jh0 jh0) {
        if (this.K1 != jh0.a) {
            return;
        }
        if (this.s1) {
            this.G1.setVisibility(4);
            this.H1.setVisibility(0);
            this.H1.setZoomEnabled(false);
            a06.H(1, c0(), i0(cic.F));
            return;
        }
        wx3.C(this.w1, jh0, true);
    }

    @a1e
    public void onEvent(bk4 bk4) {
        long j = this.M1;
        long j2 = bk4.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.w1;
        String str = bk4.c;
        if (i == 0) {
            if (this.s1) {
                k1();
                swb.N(c0(), new File(str), ((k93) this.t1.b).h());
                return;
            }
            wx3.C(hashSet, bk4, true);
        } else if (this.N1 == j2 && !TextUtils.isEmpty(str)) {
            if (this.s1) {
                k1();
                new gqd(((k93) this.t1.b).h(), ((k93) this.t1.b).f(), ((k93) this.t1.b).n().b).a(this, str);
                return;
            }
            wx3.C(hashSet, bk4, true);
        }
    }

    @a1e
    public void onEvent(dk4 dk4) {
        long j = this.M1;
        long j2 = dk4.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.w1;
        if (i == 0) {
            if (this.s1) {
                k1();
                a06.H(0, e0(), i0(cic.S2));
                return;
            }
            wx3.C(hashSet, dk4, true);
        } else if (this.N1 != j2) {
        } else {
            if (this.s1) {
                k1();
                a06.E(e0(), cic.L2);
                return;
            }
            wx3.C(hashSet, dk4, false);
        }
    }
}
