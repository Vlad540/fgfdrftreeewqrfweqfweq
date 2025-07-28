package ru.ok.messages.location;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

public class FrgLocationMap extends FrgBase implements e16, d16 {
    public gy5 F1;
    public be9 G1;
    public duf H1;
    public wae I1;
    public di7 J1;
    public hm7 K1;
    public long L1;
    public int M1;
    public boolean N1;

    public final void A0() {
        super.A0();
        be9 be9 = this.G1;
        if (be9 != null) {
            ajb ajb = be9.K0;
            if (ajb != null) {
                ajb.b();
            }
            be9.L0.b();
            be9.w0.getClass();
            tic.b(be9.O0);
            tic.b(be9.X);
            tic.b(be9.N0);
            af9 af9 = (af9) ((ge9) be9.b);
            nt7 nt7 = af9.O0;
            if (nt7 != null) {
                LinkedHashMap linkedHashMap = nt7.a;
                for (sh0 sh0 : linkedHashMap.values()) {
                    sh0.a.q();
                    xi4 xi4 = sh0.c;
                    if (xi4 != null) {
                        xi4.f();
                    }
                }
                linkedHashMap.clear();
                nt7.b();
                nt7.a();
            }
            af9.G0.animate().cancel();
            ValueAnimator valueAnimator = af9.R0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            af9.o.f();
            this.G1 = null;
        }
    }

    public final void I0() {
        super.I0();
        be9 be9 = this.G1;
        if (be9 != null) {
            be9.Y.c(be9);
            ((af9) ((ge9) be9.b)).getClass();
            tic.b(be9.M0);
        }
    }

    public final void L0() {
        super.L0();
        ((k93) this.t1.b).m().f(this.N1 ? mnc.CHAT_SHARE_LOCATION : mnc.CHAT_LOCATION_VIEWER, eja.e);
        be9 be9 = this.G1;
        if (be9 != null) {
            be9.Y.b(be9);
            be9.c2();
            ((af9) ((ge9) be9.b)).getClass();
            ajb ajb = be9.K0;
            if (ajb != null && be9.G0.c == 1) {
                ajb.c(Boolean.TRUE);
            }
            tic.b(be9.M0);
            yzc yzc = ((j2b) be9.E0).b;
            yzc.getClass();
            long o = (long) ((int) yzc.o(PmsKey.f54livelocationsendtimeout, (long) 60));
            nu9 n = ms9.k(o, o, TimeUnit.SECONDS, cnc.a()).n(de.a());
            c97 c97 = new c97(new yd9(be9, 6), new dd9(12), z3d.i);
            n.a(c97);
            be9.M0 = c97;
        }
    }

    public final void M0(Bundle bundle) {
        super.M0(bundle);
        be9 be9 = this.G1;
        hm7 hm7 = be9.G0;
        kt7 E = ((af9) ((ge9) be9.b)).E();
        dm7 dm7 = be9.H0;
        boolean z = be9.J0;
        bundle.putParcelable("ru.ok.tamtam.extra.VIEW_STATE", new im7(hm7));
        bundle.putParcelable("ru.ok.tamtam.extra.MAP_CONFIG", new lt7(E));
        bundle.putSerializable("ru.ok.tamtam.extra.LAST_LOCATION", dm7);
        bundle.putBoolean("ru.ok.tamtam.extra.KEEP_CURRENT_LOCATION", z);
    }

    public final void d() {
        this.G1.c2();
    }

    public final String g1() {
        return "PICK_LOCATION";
    }

    public final void m1(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 301) {
            this.H1.v();
        }
    }

    public final boolean o1() {
        be9 be9 = this.G1;
        if (be9.G0.d != 3) {
            return false;
        }
        be9.Z1();
        return true;
    }

    public final void p1(int i, String[] strArr, int[] iArr) {
        if (i == 169 || i == 175) {
            this.H1.u(i, strArr, iArr);
        }
    }

    public final void s(long j) {
        if (this.K1.c == 1) {
            this.u1.b().g("LIVE_LOCATION_STOP", "VIEWER");
        } else {
            this.u1.b().g("LIVE_LOCATION_STOP", "PICKER");
        }
        this.G1.Z1();
        this.J1.getClass();
    }

    public final void s1(av7 av7) {
        Context e0 = e0();
        if (e0 != null) {
            dm7 dm7 = av7.a;
            double d = dm7.a;
            ArrayList arrayList = swb.d;
            ((nh4) ((k93) this.t1.b).getAccessor().c(nh4.class)).getClass();
            String str = "https://maps.google.com/maps?f=d&daddr=" + d + "," + dm7.b;
            String str2 = av7.e;
            if (!(str2 == null || str2.length() == 0)) {
                try {
                    str = str + " (" + URLEncoder.encode(str2, "utf-8") + ")";
                } catch (UnsupportedEncodingException e) {
                    udd.s(ra6.class.getName(), "Can't encode name ".concat(str2), e);
                }
            }
            try {
                e0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (ActivityNotFoundException e2) {
                udd.s("swb", "openDirections: ", e2);
                int i = cic.D1;
                Handler handler = a06.h;
                a06.H(0, e0, e0.getString(i));
            }
            this.u1.b().f("LOCATION_MAP_DIRECTION_CLICK");
        }
    }

    public final void u() {
    }

    public final void x() {
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.Object, kt7] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.lang.Object, kt7] */
    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        mm7 mm7;
        long j;
        boolean z;
        dm7 dm7;
        kt7 kt7;
        lt7 lt7;
        im7 im7;
        String str2;
        Bundle bundle2 = bundle;
        Context e0 = e0();
        c cVar = this.J0;
        av7 av7 = null;
        if (e0 == null || cVar == null || this.Z == null) {
            udd.s("ru.ok.messages.location.FrgLocationMap", "Context or fragmentManager is null", (Throwable) null);
            return null;
        }
        this.H1 = new duf(this.u1.i(), this);
        ((k93) this.t1.b).p().getClass();
        this.J1 = (di7) ((nqc) oae.b()).getAccessor().c(di7.class);
        w6a o = this.u1.o();
        di3 g = this.u1.g();
        st7 st7 = (st7) ((k93) this.t1.b).getAccessor().c(st7.class);
        bd b = this.u1.b();
        mm7 mm72 = (mm7) this.u1.getAccessor().c(mm7.class);
        this.I1 = (wae) this.u1.getAccessor().c(wae.class);
        long s = ((j2b) this.u1.q()).a.s();
        int i = whc.E;
        String i0 = i0(i);
        this.L1 = this.Z.getLong("ru.ok.tamtam.extra.CHAT_ID");
        this.M1 = this.Z.getInt("ru.ok.tamtam.extra.REQUEST_CODE");
        i22 B = this.u1.f().B(this.L1);
        if (B == null) {
            udd.s("ru.ok.messages.location.FrgLocationMap", "Chat is null", (Throwable) null);
            return null;
        }
        boolean J = B.J();
        Bundle bundle3 = this.Z;
        dm7 dm72 = dm7.Z;
        if (bundle3 == null) {
            z = J;
            dm7 = dm72;
            mm7 = mm72;
            str = "ru.ok.messages.location.FrgLocationMap";
            j = 0;
        } else {
            long j2 = bundle3.getLong("ru.ok.tamtam.extra.MESSAGE_ID");
            mm7 = mm72;
            long j3 = this.Z.getLong("ru.ok.tamtam.extra.CONTACT_ID");
            dm7 dm73 = (dm7) this.Z.getSerializable("ru.ok.tamtam.extra.LOCATION");
            if (dm73 == null) {
                dm73 = dm72;
            }
            boolean z2 = this.Z.getBoolean("ru.ok.tamtam.extra.LIVE");
            str = "ru.ok.messages.location.FrgLocationMap";
            long j4 = this.Z.getLong("ru.ok.tamtam.extra.DATE");
            dm7 = dm72;
            boolean z3 = this.Z.getBoolean("ru.ok.tamtam.extra.ACTIVE");
            z = J;
            String string = this.Z.getString("ru.ok.tamtam.extra.DEVICE_ID");
            j = 0;
            if (j2 == 0) {
                av7 = null;
            } else {
                if (j3 == ((j2b) this.u1.q()).a.s()) {
                    str2 = i0(i);
                } else {
                    tf3 i2 = g.i(j3, false);
                    str2 = i2 != null ? i2.d() : null;
                }
                zu7 zu7 = new zu7(dm73);
                zu7.c = j2;
                zu7.b = j3;
                zu7.e = str2;
                zu7.h = z2;
                zu7.j = j4;
                zu7.d = ev7.c;
                zu7.k = z3;
                zu7.l = string;
                av7 = new av7(zu7);
            }
        }
        this.N1 = av7 == null;
        hm7 hm7 = (bundle2 == null || (im7 = (im7) bundle2.getParcelable("ru.ok.tamtam.extra.VIEW_STATE")) == null) ? null : im7.a;
        if (hm7 == null) {
            boolean z4 = !B.b.J.b(32);
            Bundle bundle4 = this.Z;
            if (bundle4 != null) {
                z4 &= !bundle4.getBoolean("ru.ok.tamtam.extra.DISABLE_LIVE", false);
            }
            fm7 fm7 = new fm7();
            fm7.a = z4;
            if (av7 == null) {
                fm7.c = 2;
                fm7.d = 2;
                fm7.h = -1;
            } else {
                fm7.c = 1;
                fm7.d = 1;
                fm7.h = av7.c;
            }
            fm7.i = z;
            fm7.j = ((j2b) this.u1.q()).a.g.getBoolean("app.dev.live.location.debug.view", false);
            fm7.k = ((j2b) this.u1.q()).a.g.getBoolean("app.dev.randomize.my.live.location", false);
            hm7 = new hm7(fm7);
        }
        this.K1 = hm7;
        j2b n = ((k93) this.t1.b).n();
        int i3 = n.c.g.getInt("app.location.map.type", 1);
        kt7 kt72 = (bundle2 == null || (lt7 = (lt7) bundle2.getParcelable("ru.ok.tamtam.extra.MAP_CONFIG")) == null) ? null : lt7.a;
        if (kt72 == null) {
            float f = 14.0f;
            if (av7 == null) {
                ? obj = new Object();
                obj.a = 1.401298464324817E-45d;
                obj.b = 1.401298464324817E-45d;
                obj.c = false;
                obj.d = true;
                obj.e = true;
                obj.f = i3;
                obj.g = 14.0f;
                obj.h = 0.0f;
                obj.i = 0.0f;
                kt7 = new kt7(obj);
            } else {
                Bundle bundle5 = this.Z;
                float f2 = bundle5 == null ? 14.0f : bundle5.getFloat("ru.ok.tamtam.extra.ZOOM", 14.0f);
                dm7 dm74 = av7.a;
                double d = dm74.a;
                if (f2 > 0.0f) {
                    f = f2;
                }
                ? obj2 = new Object();
                obj2.a = d;
                obj2.b = dm74.b;
                obj2.c = false;
                obj2.d = true;
                obj2.e = true;
                obj2.f = i3;
                obj2.g = f;
                obj2.h = 0.0f;
                obj2.i = 0.0f;
                kt7 = new kt7(obj2);
            }
            kt72 = kt7;
        }
        dm7 dm75 = bundle2 != null ? (dm7) bundle2.getSerializable("ru.ok.tamtam.extra.LAST_LOCATION") : null;
        dm7 dm76 = dm75 == null ? dm7 : dm75;
        boolean z5 = bundle2 != null ? bundle2.getBoolean("ru.ok.tamtam.extra.KEEP_CURRENT_LOCATION", true) : true;
        new WeakReference(this);
        new WeakReference((Object) null);
        tg c = ((k93) this.t1.b).c();
        mbe q = ((k93) this.t1.b).q();
        rf4 h = this.u1.h();
        long j5 = av7 == null ? j : av7.c;
        c cVar2 = this.J0;
        q.getClass();
        af9 af9 = new af9(e0, viewGroup, o, g, st7, b, cVar2, j5, c, n, ((nbe) q).a(), h, U0().getBoolean("ru.ok.tamtam.extra.REGULAR_SENDING", true), (ezd) ((k93) this.t1.b).getAccessor().c(ezd.class));
        be9 be9 = r0;
        af9 af92 = af9;
        String str3 = str;
        be9 be92 = new be9(this.K1, kt72, dm76, z5, af9, mm7, this.I1, this.J1, s, this.L1, i0, av7, this, g, this.H1, h, q, this.u1.q());
        this.G1 = be9;
        if (this.K1.c != 1 && bundle == null) {
            this.H1.v();
        }
        af92.c();
        View view = (View) af92.c;
        if (view != null) {
            return view;
        }
        udd.s(str3, "Root view is null", (Throwable) null);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r2.P();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z0() {
        /*
            r2 = this;
            super.z0()
            androidx.fragment.app.b r2 = r2.c0()
            if (r2 == 0) goto L_0x0026
            boolean r0 = r2 instanceof ru.ok.messages.location.ActLocationMap
            if (r0 == 0) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            vx5 r2 = r2.P()
            int r0 = defpackage.yqb.frg_location_map__map
            androidx.fragment.app.a r0 = r2.D(r0)
            if (r0 == 0) goto L_0x0026
            hd0 r1 = new hd0
            r1.<init>(r2)
            r1.h(r0)
            r2 = 1
            r1.d(r2)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.location.FrgLocationMap.z0():void");
    }
}
