package ru.ok.messages.settings.locations;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

public class FrgLiveLocationSettings extends FrgBase implements e16 {
    public md9 F1;
    public duf G1;

    public final void I0() {
        super.I0();
        md9 md9 = this.F1;
        ((Set) ((te9) ((ge9) md9.b)).a).remove(md9);
        md9.o.getClass();
        tic.b(md9.y0);
        tic.b(md9.z0);
        md9.X.f(md9);
    }

    public final void L0() {
        super.L0();
        md9 md9 = this.F1;
        te9 te9 = (te9) ((ge9) md9.b);
        te9.t(md9);
        te9.A(true);
        md9.o.getClass();
        md9.Z1();
        tic.b(md9.z0);
        yzc yzc = ((j2b) md9.c).b;
        yzc.getClass();
        long o = (long) ((int) yzc.o(PmsKey.f54livelocationsendtimeout, (long) 60));
        nu9 n = ms9.k(o, o, TimeUnit.SECONDS, cnc.a()).n(de.a());
        c97 c97 = new c97(new ld9(md9, 0), new dd9(2), z3d.i);
        n.a(c97);
        md9.z0 = c97;
        md9.X.d(md9);
    }

    public final void M0(Bundle bundle) {
        super.M0(bundle);
        bundle.putBoolean("MvcControllerLiveLocationSettingsImpl.permissionChecked", this.F1.A0);
    }

    public final String g1() {
        return "SETTINGS_LIVE_LOCATIONS";
    }

    public final void m1(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 301) {
            this.G1.v();
        }
    }

    public final void p1(int i, String[] strArr, int[] iArr) {
        if (i == 169 || i == 175) {
            this.G1.u(i, strArr, iArr);
        }
    }

    public final void s(long j) {
        udd.p("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "On stop now location click %d", new Object[]{Long.valueOf(j)});
        md9 md9 = this.F1;
        md9.o.getClass();
        md9.Y.g("LIVE_LOCATION_STOP", "SETTINGS");
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        Context e0 = e0();
        if (e0 == null) {
            udd.s("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "Context is null", (Throwable) null);
            return null;
        }
        ((k93) this.t1.b).p().getClass();
        j2b n = ((k93) this.t1.b).n();
        t52 e = ((k93) this.t1.b).e();
        zs7 r = ((k93) this.t1.b).r();
        mbe q = ((k93) this.t1.b).q();
        q.getClass();
        qmc a = ((nbe) q).a();
        te9 te9 = new te9(e0, viewGroup, (w6a) ((k93) this.t1.b).getAccessor().c(w6a.class));
        bd b = ((k93) this.t1.b).b();
        this.G1 = new duf(this.u1.i(), this);
        md9 md9 = r0;
        md9 md92 = new md9(te9, n, e, (di7) ((nqc) oae.b()).getAccessor().c(di7.class), r, b, this.G1, a, this.u1.h(), this);
        this.F1 = md9;
        if (bundle2 != null) {
            md9.A0 = bundle2.getBoolean("MvcControllerLiveLocationSettingsImpl.permissionChecked");
        }
        mif i1 = i1();
        if (i1 != null) {
            i1.l(i0(cic.o0));
        }
        te9.c();
        View view = (View) te9.c;
        if (view != null) {
            return view;
        }
        udd.s("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "Root view is null", (Throwable) null);
        return null;
    }
}
