package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.calls.ui.ui.pip.PipScreen;

/* renamed from: s71  reason: default package */
public final class s71 implements vr3 {
    public final /* synthetic */ w71 a;

    public s71(w71 w71) {
        this.a = w71;
    }

    public final void a(rr3 rr3, rr3 rr32, boolean z) {
        rr3 rr33 = rr3;
        rr3 rr34 = rr32;
        boolean z2 = false;
        w71 w71 = this.a;
        if (rr33 != null) {
            xh1 xh1 = (xh1) w71.Y.getValue();
            boolean z3 = rr33 instanceof dk9;
            boolean a2 = xh1.a();
            w71 w712 = xh1.a;
            if (z3) {
                w71.e(w712);
                if (a2) {
                    w712.f(true);
                } else {
                    Activity activity = w712.Z;
                    if (activity != null) {
                        boolean F = o2a.a.o().f().F();
                        udd.p("PipAppController", "try to hide call indicator hasCall=" + w712.b(), new Object[0]);
                        if (F) {
                            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                            View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
                            kjd.l(activity, childAt != null && km4.y0.r(childAt).getName().equals("one.me.sdk.design.OneMeThemeDark"));
                        }
                    }
                }
            } else if (a2) {
                Activity activity2 = w712.Z;
                if (activity2 != null) {
                    ((v75) w712.b).d(activity2, w71.c());
                }
            } else {
                Activity activity3 = w712.Z;
                if (activity3 != null) {
                    boolean b = w712.b();
                    vgc vgc = (vgc) o23.f0(w71.c().e());
                    rr3 rr35 = vgc != null ? vgc.a : null;
                    boolean z4 = !((rr35 instanceof dk9) || rr35 == null);
                    udd.p("PipAppController", "try to show call indicator hasCall=" + b + " canShow=" + z4 + ".", new Object[0]);
                    if (z4 && b && o2a.a.o().f().l(new CallIndicatorWidget())) {
                        kjd.l(activity3, true);
                    }
                    if (!b) {
                        udd.p("PipAppController", "can't show indicator due to call is absent, try to force close indicator.", new Object[0]);
                        w712.f(true);
                    }
                }
            }
        }
        boolean z5 = rr33 instanceof PipScreen;
        gsd gsd = gsd.b;
        if (z5 && !(rr34 instanceof PipScreen)) {
            String str = ((ep1) w71.a).k().c;
            hsd hsd = (ye1) w71.w0.getValue();
            grd grd = hsd.a;
            if (grd.getValue() != gsd) {
                iq1 iq1 = (iq1) hsd.c.getValue();
                iq1.getClass();
                iq1.c(iq1, "PIP_ENABLED", str, (String) null, 1, (String) null, (String) null, false, 116);
            }
            grd.m((Object) null, gsd);
        }
        boolean z6 = rr34 instanceof PipScreen;
        if (z6 && !z5) {
            String str2 = ((ep1) w71.a).k().c;
            hsd hsd2 = (ye1) w71.w0.getValue();
            grd grd2 = hsd2.a;
            if (grd2.getValue() == gsd) {
                iq1 iq12 = (iq1) hsd2.c.getValue();
                iq12.getClass();
                iq1.c(iq12, "PIP_ENABLED", str2, (String) null, 0, (String) null, (String) null, false, 116);
            }
            grd2.m((Object) null, gsd.a);
        }
        if (!z6 || rr33 != null) {
            w71.getClass();
            if ((rr34 instanceof dk9) || rr34 == null) {
                if (((ep1) w71.a).q() && ((xh1) w71.Y.getValue()).a()) {
                    z2 = true;
                }
                w71.z0 = z2;
                return;
            }
            return;
        }
        udd.p("PipAppController", "pip screen was hidden quietly, skip hide fake pip.", new Object[0]);
    }

    public final void b(rr3 rr3, rr3 rr32, boolean z) {
        rr3 rr33 = rr3;
        w71 w71 = this.a;
        if (rr33 != null) {
            xh1 xh1 = (xh1) w71.Y.getValue();
            boolean z2 = rr33 instanceof dk9;
            boolean a2 = xh1.a();
            boolean z3 = true;
            w71 w712 = xh1.a;
            if (z2) {
                w712.f(true);
                w71.e(w712);
            } else {
                w712.g(false);
                if (a2) {
                    Activity activity = w712.Z;
                    g85 g85 = w712.b;
                    if (activity != null) {
                        ((v75) g85).d(activity, w71.c());
                    }
                    Activity activity2 = w712.Z;
                    if (activity2 != null && w712.z0) {
                        sgc c = w71.c();
                        v75 v75 = (v75) g85;
                        v75.getClass();
                        udd.p("FakePipController", "try to show local pip", new Object[0]);
                        cf1 cf1 = v75.g;
                        Float valueOf = cf1 != null ? Float.valueOf(cf1.getAlpha()) : null;
                        if (valueOf == null || valueOf.floatValue() != 1.0f || !mt0.s(cf1)) {
                            v75.d(activity2, c);
                            if (cf1 != null) {
                                cf1.setVisibility(8);
                            }
                            String str = ((ep1) ((so1) v75.e.getValue())).k().c;
                            hsd hsd = (ye1) v75.a.getValue();
                            grd grd = hsd.a;
                            Object value = grd.getValue();
                            gsd gsd = gsd.b;
                            if (value != gsd) {
                                iq1 iq1 = (iq1) hsd.c.getValue();
                                iq1.getClass();
                                iq1.c(iq1, "PIP_ENABLED", str, (String) null, 1, (String) null, (String) null, false, 116);
                            }
                            grd.m((Object) null, gsd);
                            if (cf1 != null) {
                                mt0.k(cf1, true, 0, (u16) null, 4);
                            }
                        } else {
                            udd.p("FakePipController", "local pip already in show progress", new Object[0]);
                        }
                        if (w71.c().e().size() >= 2) {
                            z3 = false;
                        }
                        w712.C0.f(z3);
                    }
                } else {
                    w71.e(w712);
                }
            }
        }
        w71.j();
    }
}
