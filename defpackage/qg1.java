package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: qg1  reason: default package */
public final class qg1 extends ConstraintLayout implements bi1, zh1 {
    public final /* synthetic */ CallScreen K0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qg1(CallScreen callScreen, Context context) {
        super(context);
        this.K0 = callScreen;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(-15263716);
        setId(uob.call_screen_container_id);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(uob.call_bottom_control_container);
        re3 re3 = new re3(-2, -2);
        re3.P = a24.X(((float) 348) * dh4.c().getDisplayMetrics().density);
        frameLayout.setLayoutParams(re3);
        float f = (float) 12;
        frameLayout.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(((float) 0) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(((float) 24) * dh4.c().getDisplayMetrics().density));
        ek8.g(frameLayout, new sy6(0, new up0(5, 1, false), 1), (u16) null);
        dwa dwa = callScreen.B0;
        cwa cwa = cwa.b;
        dwa.a(frameLayout, cwa);
        boolean isLaidOut = frameLayout.isLaidOut();
        dwa dwa2 = callScreen.B0;
        if (!isLaidOut || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new ng1(callScreen, 1));
        } else {
            dwa2.c();
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(uob.call_top_control_container);
        ek8.g(frameLayout2, new sy6(5, (up0) null, 2), (u16) null);
        dwa2.a(frameLayout2, cwa.a);
        if (!frameLayout2.isLaidOut() || frameLayout2.isLayoutRequested()) {
            frameLayout2.addOnLayoutChangeListener(new ng1(callScreen, 2));
        } else {
            dwa2.c();
        }
        rs3 u0 = callScreen.u0();
        frameLayout2.addOnLayoutChangeListener((View.OnLayoutChangeListener) u0.e.getValue());
        u0.c = frameLayout2;
        frameLayout.addOnLayoutChangeListener((View.OnLayoutChangeListener) u0.f.getValue());
        u0.d = frameLayout;
        FrameLayout frameLayout3 = new FrameLayout(getContext());
        frameLayout3.setId(uob.call_events_view);
        frameLayout3.setLayoutParams(new re3(-2, -2));
        frameLayout3.setPadding(frameLayout3.getPaddingLeft(), frameLayout3.getPaddingTop(), frameLayout3.getPaddingRight(), a24.X(((float) 16) * dh4.c().getDisplayMetrics().density));
        dwa2.a(frameLayout3, cwa);
        addView(callScreen.A0());
        addView(callScreen.y0());
        addView(callScreen.x0());
        addView(frameLayout);
        addView(callScreen.w0());
        addView(frameLayout2, 0, -2);
        addView(frameLayout3, -1, -2);
        bf3 p = a06.p(this);
        int id = callScreen.A0().getId();
        p.d(id, 6, 0, 6);
        p.d(id, 3, 0, 3);
        p.d(id, 7, 0, 7);
        p.d(id, 4, 0, 4);
        int id2 = frameLayout2.getId();
        p.d(id2, 3, 0, 3);
        p.d(id2, 6, 0, 6);
        p.d(id2, 7, 0, 7);
        int id3 = callScreen.y0().getId();
        p.d(id3, 3, frameLayout2.getId(), 4);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id3, 4));
        p.d(id3, 6, 0, 6);
        p.d(id3, 7, 0, 7);
        int id4 = callScreen.x0().getId();
        p.d(id4, 3, 0, 3);
        p.d(id4, 6, 0, 6);
        p.d(id4, 7, 0, 7);
        int id5 = frameLayout.getId();
        p.d(id5, 4, 0, 4);
        p.d(id5, 6, 0, 6);
        p.d(id5, 7, 0, 7);
        int id6 = callScreen.w0().getId();
        p.d(id6, 3, 0, 3);
        p.d(id6, 4, 0, 4);
        p.d(id6, 6, 0, 6);
        p.d(id6, 7, 0, 7);
        int id7 = frameLayout3.getId();
        p.d(id7, 4, frameLayout.getId(), 3);
        p.d(id7, 6, 0, 6);
        p.d(id7, 7, 0, 7);
        p.a(this);
    }

    public final void a(boolean z) {
        if (z) {
            CallScreen callScreen = this.K0;
            ik1 m0 = CallScreen.m0(callScreen);
            if (m0 != null) {
                m0.a(true);
            }
            callScreen.n0(true);
        }
    }

    public final void b(boolean z) {
        if (!z) {
            smc smc = CallScreen.T0;
            this.K0.n0(false);
        }
    }

    public final void d(RectF rectF, boolean z) {
        ik1 m0 = CallScreen.m0(this.K0);
        if (m0 != null) {
            m0.d(rectF, z);
        }
    }

    public final void e(boolean z) {
        smc smc = CallScreen.T0;
        CallScreen callScreen = this.K0;
        callScreen.n0(false);
        ik1 m0 = CallScreen.m0(callScreen);
        if (m0 != null) {
            m0.e(z);
        }
    }

    public final void f(lg7 lg7, boolean z, long j) {
        CallScreen callScreen = this.K0;
        ik1 m0 = CallScreen.m0(callScreen);
        if (m0 != null) {
            m0.f(lg7, z, j);
        }
        if (ek8.K(callScreen.y0())) {
            callScreen.r0().f(lg7, z, j);
        }
    }

    public boolean getShouldScaleMainOpponent() {
        ik1 m0 = CallScreen.m0(this.K0);
        if (m0 != null) {
            return m0.getShouldScaleMainOpponent();
        }
        return false;
    }

    public final void h(lg7 lg7, boolean z, long j) {
        ik1 m0 = CallScreen.m0(this.K0);
        if (m0 != null) {
            m0.h(lg7, z, j);
        }
    }

    public final void o(boolean z) {
        if (z) {
            smc smc = CallScreen.T0;
            CallScreen callScreen = this.K0;
            if (ek8.K(callScreen.y0())) {
                zj1 r0 = callScreen.r0();
                r0.getClass();
                r0.setAlpha(1.0f);
            }
            callScreen.n0(true);
            ik1 m0 = CallScreen.m0(callScreen);
            if (m0 != null) {
                m0.o(true);
            }
        }
    }
}
