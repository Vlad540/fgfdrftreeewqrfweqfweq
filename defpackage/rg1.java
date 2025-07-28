package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;

/* renamed from: rg1  reason: default package */
public final class rg1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rg1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((rg1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rg1 rg1 = new rg1(continuation, this.Y);
        rg1.X = obj;
        return rg1;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [rr3, java.lang.Object, one.me.calls.ui.ui.call.panels.CallEventsWidget] */
    public final Object o(Object obj) {
        String str;
        le1 le1;
        ize ize;
        y11 y11;
        y11 y112;
        boolean z = false;
        wx3.H(obj);
        u21 u21 = (u21) this.X;
        boolean f = hhd.f(u21, t21.a);
        CallScreen callScreen = this.Y;
        if (f) {
            smc smc = CallScreen.T0;
            callScreen.p0(false);
        } else if (u21 instanceof s21) {
            bn1 bn1 = ((s21) u21).a;
            smc smc2 = CallScreen.T0;
            callScreen.getClass();
            bue bue = bn1.c;
            boolean z2 = bue != null;
            ek8.I(callScreen.w0(), callScreen.q0(), (s16) null);
            c11 q0 = callScreen.q0();
            int i = 8;
            q0.setVisibility(z2 ? 0 : 8);
            mc0 mc0 = (bue == null || (y112 = bue.c) == null) ? null : y112.c;
            oc0 oc0 = (bue == null || (y11 = bue.c) == null) ? null : y11.d;
            gm1 gm1 = q0.K0;
            if (mc0 != null) {
                gm1.getClass();
                str = mc0.b;
            } else {
                str = null;
            }
            mz9 mz9 = gm1.K0;
            mz9.setAvatarUrl(str);
            mz9.setCustomOverlay(oc0);
            mz9.g(mc0 != null ? mc0.a : null, true);
            if (q0.getVisibility() == 0) {
                q0.setName(bue != null ? bue.a : null);
                q0.setStatus(bue != null ? bue.b : null);
                gm1.R(bue != null ? bue.d : false, bue != null ? bue.e : false ? n1a.b : n1a.a, ftb.call_cancel, new a11(q0, 1));
                gm1.Q(n1a.c, ftb.call_recall, new a11(q0, 0));
                gm1.N(bue != null ? bue.f : false);
            }
            a97 a97 = bn1.d;
            boolean z3 = a97 != null;
            if (ek8.K(callScreen.y0()) || z3) {
                ek8.I(callScreen.y0(), callScreen.r0(), (s16) null);
                callScreen.r0().setActive(z3);
                zj1 r0 = callScreen.r0();
                if (z3) {
                    if (a97 == null || (le1 = a97.a) == null) {
                        le1 = le1.c;
                    }
                    r0.setParticipantId(le1);
                    if (a97 == null || (ize = a97.e) == null) {
                        ize = ize.o;
                    }
                    if (r0.W0 != ize) {
                        r0.W0 = ize;
                        AppCompatImageView appCompatImageView = r0.O0;
                        int ordinal = ize.ordinal();
                        if (ordinal == 0) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setImageResource(n1a.Z);
                            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(ftb.call_user_item_more));
                            a24.Z(appCompatImageView, 300, new ub(appCompatImageView, 5, r0));
                        } else if (ordinal == 1) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setImageResource(n1a.j0);
                            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(r1a.O1));
                            a24.Z(appCompatImageView, 300, new xj1(r0, 1));
                        } else if (ordinal == 2 || ordinal == 3) {
                            appCompatImageView.setVisibility(8);
                            appCompatImageView.setContentDescription((CharSequence) null);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    boolean z4 = a97 != null ? a97.c : false;
                    if (!hhd.f(r0.R0, Boolean.valueOf(z4))) {
                        r0.R0 = Boolean.valueOf(z4);
                        AppCompatImageView appCompatImageView2 = r0.P0;
                        if (z4) {
                            i = 0;
                        }
                        appCompatImageView2.setVisibility(i);
                    }
                    r0.setLabel(a97 != null ? a97.b : null);
                    boolean z5 = a97 != null ? a97.d : false;
                    if (!hhd.f(r0.S0, Boolean.valueOf(z5))) {
                        r0.S0 = Boolean.valueOf(z5);
                        r0.x();
                    }
                }
            }
            bue bue2 = bn1.c;
            mc0 mc02 = bn1.f;
            if (mc02 != null && bue2 == null) {
                ek8.I(callScreen.w0(), callScreen.q0(), (s16) null);
                gm1 gm12 = callScreen.q0().K0;
                gm12.getClass();
                mz9 mz92 = gm12.K0;
                mz92.setAvatarUrl(mc02.b);
                mz92.setCustomOverlay((oc0) null);
                mz92.g(mc02.a, true);
            }
            boolean z6 = bn1.e;
            n0c n0c = callScreen.A0;
            if (z6) {
                ((ax2) n0c.T0(callScreen, CallScreen.U0[2])).a.P(hw4.a, (wr3) null);
            } else {
                if (bue2 == null) {
                    z = true;
                }
                k77[] k77Arr = CallScreen.U0;
                if (((ax2) n0c.T0(callScreen, k77Arr[2])).a() == null && z) {
                    ax2 ax2 = (ax2) n0c.T0(callScreen, k77Arr[2]);
                    if (!hhd.f(ax2.b(), "call_events_widget_tag")) {
                        ? callEventsWidget = new CallEventsWidget(callScreen.w0, (x54) null);
                        callScreen.u0().a.add(callEventsWidget);
                        callEventsWidget.c.add(new kg1(callScreen));
                        vgc vgc = new vgc(callEventsWidget, (String) null, (wr3) null, (wr3) null, false, -1);
                        vgc.d("call_events_widget_tag");
                        ax2.a.R(vgc);
                    }
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
