package defpackage;

import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: vi9  reason: default package */
public final /* synthetic */ class vi9 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ vi9(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    public final Object invoke() {
        jue jue = jue.a;
        String str = null;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = NeuroAvatarsScreen.Q0;
                rj9 q0 = neuroAvatarsScreen.q0();
                q0.c.a((hwc) null);
                q0.b.i.setValue((Object) null);
                return jue;
            case 1:
                k77[] k77Arr2 = NeuroAvatarsScreen.Q0;
                mz9 o0 = neuroAvatarsScreen.o0();
                t0c t0c = neuroAvatarsScreen.q0().y0;
                jwc jwc = ((kwc) t0c.a.getValue()).a;
                fxa fxa = ((kwc) t0c.a.getValue()).b;
                hwc hwc = jwc instanceof hwc ? (hwc) jwc : null;
                Long valueOf = hwc != null ? Long.valueOf(hwc.c) : null;
                dxa dxa = fxa instanceof dxa ? (dxa) fxa : null;
                boolean f = hhd.f(valueOf, dxa != null ? Long.valueOf(dxa.b) : null);
                boolean z = true;
                boolean z2 = !f;
                iwc iwc = jwc instanceof iwc ? (iwc) jwc : null;
                String str2 = iwc != null ? iwc.a : null;
                exa exa = fxa instanceof exa ? (exa) fxa : null;
                if (exa != null) {
                    str = exa.a;
                }
                boolean z3 = !hhd.f(str2, str);
                if (jwc == null || (!z3 && !z2)) {
                    z = false;
                }
                o0.setCloseBadgeVisibility(z);
                return jue;
            case 2:
                k77[] k77Arr3 = NeuroAvatarsScreen.Q0;
                return neuroAvatarsScreen.n0() != null ? mnc.AUTH_AVATARS : mnc.SETTINGS_PROFILE_AVATARS;
            case 3:
                k77 k77 = NeuroAvatarsScreen.Q0[11];
                z7c n0 = neuroAvatarsScreen.n0();
                r7e r7e = new r7e(new vi9(neuroAvatarsScreen, 5));
                ko7 ko7 = ko7.a;
                ko7.getClass();
                return new rj9((Long) neuroAvatarsScreen.J0.a(neuroAvatarsScreen), n0, r7e, new r7e(new ib7(7)), new r7e(new ib7(4)), ko7.getAccessor().d(pae.class), ko7.getAccessor().d(ed3.class));
            case 4:
                k77[] k77Arr4 = NeuroAvatarsScreen.Q0;
                return gq3.b(neuroAvatarsScreen.getContext(), phc.h0);
            default:
                k77 k772 = NeuroAvatarsScreen.Q0[10];
                return new qi9((y2b) neuroAvatarsScreen.I0.a(neuroAvatarsScreen));
        }
    }
}
