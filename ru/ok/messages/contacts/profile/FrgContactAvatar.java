package ru.ok.messages.contacts.profile;

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
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.fragments.FrgSlideOut;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgContactAvatar extends FrgSlideOut {
    public ArrayList G1;
    public Long H1;
    public boolean I1;
    public boolean J1;
    public long K1;
    public long L1;
    public boolean M1;

    /* JADX WARNING: type inference failed for: r8v2, types: [r5] */
    /* JADX WARNING: type inference failed for: r8v11, types: [r5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H0(android.view.MenuItem r8) {
        /*
            r7 = this;
            int r8 = r8.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r8 != r0) goto L_0x0018
            r5 r8 = r7.h1()
            if (r8 == 0) goto L_0x014c
            androidx.fragment.app.b r7 = r7.c0()
            r7.finish()
            goto L_0x014c
        L_0x0018:
            int r0 = defpackage.yqb.menu_avatar_photo__save_to_gallery
            if (r8 != r0) goto L_0x003c
            r5 r8 = r7.h1()
            if (r8 == 0) goto L_0x014c
            boolean r8 = r7.s1
            if (r8 == 0) goto L_0x014c
            java.util.ArrayList r8 = r7.G1
            java.lang.Object r8 = defpackage.ek8.u(r8)
            java.lang.String r8 = (java.lang.String) r8
            r0 = 0
            ru.ok.messages.views.dialogs.SaveToGalleryDialog r8 = ru.ok.messages.views.dialogs.SaveToGalleryDialog.o1(r8, r0)
            androidx.fragment.app.c r7 = r7.J0
            java.lang.String r0 = "ru.ok.messages.views.dialogs.SaveToGalleryDialog"
            r8.l1(r7, r0)
            goto L_0x014c
        L_0x003c:
            int r0 = defpackage.yqb.menu_avatar_photo__share
            if (r8 != r0) goto L_0x008d
            nqc r8 = r7.u1
            pk r8 = r8.c()
            gy9 r8 = (defpackage.gy9) r8
            g2b r8 = r8.z()
            j2b r8 = (defpackage.j2b) r8
            i03 r8 = r8.a
            long r1 = r8.n()
            r7.K1 = r1
            v2b r8 = r7.t1
            java.lang.Object r8 = r8.b
            k93 r8 = (defpackage.k93) r8
            o2a r8 = (o2a) r8
            w4 r8 = r8.getAccessor()
            java.lang.Class<xq6> r0 = defpackage.xq6.class
            java.lang.Object r8 = r8.c(r0)
            xq6 r8 = (defpackage.xq6) r8
            java.util.ArrayList r0 = r7.G1
            java.lang.Object r0 = defpackage.ek8.u(r0)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.util.ArrayList r0 = r7.G1
            java.lang.Object r0 = defpackage.ek8.u(r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r7)
            y06 r7 = new y06
            r5 = 0
            r0 = r7
            r0.<init>(r1, r3, r4, r5)
            r8.a(r6, r7)
            goto L_0x014c
        L_0x008d:
            int r0 = defpackage.yqb.menu_avatar_photo__make_main
            r1 = 0
            if (r8 != r0) goto L_0x00f1
            r5 r8 = r7.h1()
            boolean r0 = r8 instanceof defpackage.z06
            if (r0 == 0) goto L_0x009d
            r1 = r8
            z06 r1 = (defpackage.z06) r1
        L_0x009d:
            if (r1 == 0) goto L_0x014c
            java.lang.Long r8 = r7.H1
            long r2 = r8.longValue()
            java.util.ArrayList r7 = r7.G1
            java.lang.Object r7 = defpackage.ek8.u(r7)
            java.lang.String r7 = (java.lang.String) r7
            ru.ok.messages.contacts.profile.ActContactAvatars r1 = (ru.ok.messages.contacts.profile.ActContactAvatars) r1
            pn1 r8 = r1.k1
            defpackage.tic.b(r8)
            y5 r8 = new y5
            r8.<init>((ru.ok.messages.contacts.profile.ActContactAvatars) r1, (java.lang.String) r7, (long) r2)
            v2b r7 = r1.O0
            java.lang.Object r7 = r7.b
            k93 r7 = (defpackage.k93) r7
            o2a r7 = (o2a) r7
            mbe r7 = r7.q()
            nbe r7 = (defpackage.nbe) r7
            qmc r7 = r7.a()
            x5 r0 = new x5
            r4 = 2
            r0.<init>(r1, r2, r4)
            pv0 r2 = new pv0
            r3 = 13
            r2.<init>(r3)
            v2b r3 = r1.O0
            java.lang.Object r3 = r3.b
            k93 r3 = (defpackage.k93) r3
            o2a r3 = (o2a) r3
            mbe r3 = r3.q()
            nbe r3 = (defpackage.nbe) r3
            qmc r3 = r3.b()
            pn1 r7 = defpackage.tic.a(r8, r7, r0, r2, r3)
            r1.k1 = r7
            goto L_0x014c
        L_0x00f1:
            int r0 = defpackage.yqb.menu_avatar_photo__delete
            if (r8 != r0) goto L_0x014c
            r5 r8 = r7.h1()
            boolean r0 = r8 instanceof defpackage.z06
            if (r0 == 0) goto L_0x0100
            r1 = r8
            z06 r1 = (defpackage.z06) r1
        L_0x0100:
            if (r1 == 0) goto L_0x014c
            java.lang.Long r7 = r7.H1
            long r7 = r7.longValue()
            ru.ok.messages.contacts.profile.ActContactAvatars r1 = (ru.ok.messages.contacts.profile.ActContactAvatars) r1
            pn1 r0 = r1.k1
            defpackage.tic.b(r0)
            x5 r0 = new x5
            r2 = 0
            r0.<init>(r1, r7, r2)
            v2b r2 = r1.O0
            java.lang.Object r2 = r2.b
            k93 r2 = (defpackage.k93) r2
            o2a r2 = (o2a) r2
            mbe r2 = r2.q()
            nbe r2 = (defpackage.nbe) r2
            qmc r2 = r2.a()
            x5 r3 = new x5
            r4 = 1
            r3.<init>(r1, r7, r4)
            pv0 r7 = new pv0
            r8 = 12
            r7.<init>(r8)
            v2b r8 = r1.O0
            java.lang.Object r8 = r8.b
            k93 r8 = (defpackage.k93) r8
            o2a r8 = (o2a) r8
            mbe r8 = r8.q()
            nbe r8 = (defpackage.nbe) r8
            qmc r8 = r8.b()
            pn1 r7 = defpackage.tic.a(r0, r2, r3, r7, r8)
            r1.k1 = r7
        L_0x014c:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.contacts.profile.FrgContactAvatar.H0(android.view.MenuItem):boolean");
    }

    public final void M0(Bundle bundle) {
        super.M0(bundle);
        bundle.putLong("ru.ok.tamtam.extra.DOWNLOAD_REQ_ID", this.K1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID", this.L1);
        bundle.putBoolean("ru.ok.tamtam.extra.IMAGE_LOAD_FAILED", this.M1);
    }

    public final String g1() {
        return null;
    }

    public final void m1(int i, int i2, Intent intent) {
    }

    public final void n1(r5 r5Var) {
        super.n1(r5Var);
        if (!(r5Var instanceof z06)) {
            throw new RuntimeException("Activity used with FrgContactAvatar must implement FrgContactAvatar.Listener interface");
        }
    }

    @a1e
    public void onEvent(bk4 bk4) {
        long j = this.K1;
        long j2 = bk4.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.w1;
        String str = bk4.c;
        if (i == 0) {
            if (this.s1) {
                swb.N(c0(), new File(str), ((k93) this.t1.b).h());
                k1();
                return;
            }
            wx3.C(hashSet, bk4, true);
        } else if (this.L1 == j2 && !TextUtils.isEmpty(str)) {
            if (this.s1) {
                k1();
                new gqd(((k93) this.t1.b).h(), ((k93) this.t1.b).f(), ((k93) this.t1.b).n().b).a(this, str);
                return;
            }
            wx3.C(hashSet, bk4, true);
        }
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        this.G1 = this.Z.getStringArrayList("ru.ok.tamtam.extra.AVATAR_URL");
        this.H1 = Long.valueOf(this.Z.getLong("ru.ok.tamtam.extra.AVATAR_ID"));
        this.I1 = this.Z.getBoolean("ru.ok.tamtam.extra.DELETE_OPTION");
        this.J1 = this.Z.getBoolean("ru.ok.tamtam.extra.MAKE_MAIN_OPTION");
        if (bundle != null) {
            this.K1 = bundle.getLong("ru.ok.tamtam.extra.DOWNLOAD_REQ_ID");
            this.L1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID");
            this.M1 = bundle.getBoolean("ru.ok.tamtam.extra.IMAGE_LOAD_FAILED");
        }
    }

    public final void x0(Menu menu, MenuInflater menuInflater) {
        ActContactAvatars actContactAvatars;
        int i;
        AbstractMap.SimpleEntry simpleEntry;
        long longValue = this.H1.longValue();
        r5 h1 = h1();
        mif mif = null;
        z06 z06 = h1 instanceof z06 ? (z06) h1 : null;
        long j = -1;
        if (z06 != null && (i = actContactAvatars.h1) >= 0) {
            ArrayList arrayList = (actContactAvatars = (ActContactAvatars) z06).e1;
            if (!(i >= arrayList.size() || (simpleEntry = (AbstractMap.SimpleEntry) arrayList.get(actContactAvatars.h1)) == null || simpleEntry.getValue() == null)) {
                j = ((Long) simpleEntry.getValue()).longValue();
            }
        }
        if (longValue == j) {
            menu.clear();
            menuInflater.inflate(bsb.menu_avatar_photo, menu);
            yle c0 = c0();
            if (c0 instanceof yle) {
                mif = c0.a();
            }
            if (mif != null) {
                MenuItem g = mif.g(yqb.menu_avatar_photo__make_main);
                boolean z = false;
                if (g != null) {
                    g.setVisible(this.I1 && this.J1 && this.H1.longValue() != 0);
                }
                MenuItem g2 = mif.g(yqb.menu_avatar_photo__delete);
                if (g2 != null) {
                    if (this.I1 && this.H1.longValue() != 0) {
                        z = true;
                    }
                    g2.setVisible(z);
                }
            }
        }
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(zrb.frg_profile_photo, viewGroup, false);
        on4 on4 = (ZoomableDraweeView) slideOutLayout.findViewById(yqb.frg_profile_photo__iv_photo);
        z66 z66 = new z66(h0());
        z66.l = jlc.j;
        z66.j = new u10(e0(), 0);
        Context e0 = e0();
        int i = zhc.v;
        z66.f = js.q(i, -1, e0);
        z66.h = js.q(i, -1, e0());
        z66.b = 0;
        on4.setHierarchy(z66.a());
        on4.setZoomEnabled(true);
        on4.setOnTouchListener(new cg3(new GestureDetector(e0(), new tz(9, this)), 1));
        on4.setListener(new xz((Object) this, (Object) on4, (Object) slideOutLayout, 11));
        ywa a = a06.a.a();
        ArrayList<String> arrayList = this.G1;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : arrayList) {
            try {
                fr6 u = a06.u();
                tr6 b = tr6.b(str);
                u.getClass();
                arrayList2.add(new er6(u, b, str));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        a.g = new nv6(arrayList2, false);
        a.i = true;
        a.l = on4.getController();
        on4.setController(a.a());
        slideOutLayout.setSlideOutListener(this);
        Z0(true);
        yle c0 = c0();
        mif a2 = c0 instanceof yle ? c0.a() : null;
        if (a2 != null) {
            a2.m();
        }
        return slideOutLayout;
    }

    @a1e
    public void onEvent(dk4 dk4) {
        long j = this.K1;
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
        } else if (this.L1 != j2) {
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
