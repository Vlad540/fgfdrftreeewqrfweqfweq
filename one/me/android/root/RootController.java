package one.me.android.root;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/android/root/RootController;", "Lone/me/sdk/arch/Widget;", "Lygc;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class RootController extends Widget implements ygc {
    public static final /* synthetic */ k77[] x0;
    public final lv1 X = new lv1(24, false);
    public final lv1 Y = new lv1(24, false);
    public final lv1 Z = new lv1(24, false);
    public final t97 a = bh1.a.c();
    public AnimatorSet b;
    public final nl0 c = binding(new ffc(this, 0));
    public final nl0 o = binding(new ffc(this, 1));
    public final u5 w0 = new u5(2, this);

    static {
        Class<RootController> cls = RootController.class;
        x0 = new k77[]{new khb(cls, "fullScreenContainer", "getFullScreenContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), m4b.g(m7c.a, cls, "topIndicatorView", "getTopIndicatorView()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hc9(cls, "fullScreenRouter", "getFullScreenRouter()Lcom/bluelinelabs/conductor/Router;"), new hc9(cls, "dialogsRouter", "getDialogsRouter()Lcom/bluelinelabs/conductor/Router;"), new hc9(cls, "topIndicatorRouter", "getTopIndicatorRouter()Lcom/bluelinelabs/conductor/Router;")};
    }

    public RootController() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public static final boolean l0(RootController rootController, az1 az1) {
        rootController.getClass();
        Object tag = az1.getTag(o1a.n);
        boolean f = hhd.f(tag, "SHOW_ANIMATION_TAG");
        boolean f2 = hhd.f(tag, "HIDE_ANIMATION_TAG");
        if (tag == null) {
            if (az1.getVisibility() != 0) {
                return false;
            }
        } else if (!f && (f2 || az1.getVisibility() != 0)) {
            return false;
        }
        return true;
    }

    public static final void m0(RootController rootController, boolean z) {
        if (z) {
            if (rootController.t0().getTranslationY() == dh4.c().getDisplayMetrics().density * 0.0f) {
                return;
            }
        } else if (rootController.t0().getTranslationY() == (-(dh4.c().getDisplayMetrics().density * 100.0f))) {
            return;
        }
        udd.p("RootController", "validateStateIsNeeded for isVisible=" + z + ".", new Object[0]);
        rootController.q0(z);
    }

    public final boolean B(boolean z) {
        if (!s0().n()) {
            udd.p("RootController", "hideTopController call indicator wasn't init", new Object[0]);
            return false;
        } else if (!l0(this, t0())) {
            m0(this, false);
            udd.p("RootController", "hideTopController call indicator already hidden force=" + z, new Object[0]);
            return false;
        } else {
            udd.p("RootController", "hideTopController hide call indicator force=" + z, new Object[0]);
            o0(false, z, (rr3) null);
            return true;
        }
    }

    public final sgc C() {
        return (sgc) this.X.T0(this, x0[2]);
    }

    public final boolean F() {
        if (!s0().n()) {
            udd.p("RootController", "hideWithScalingTopController call indicator wasn't init", new Object[0]);
            return false;
        } else if (!l0(this, t0())) {
            m0(this, false);
            udd.p("RootController", "hideWithScalingTopController call indicator already hidden force=false", new Object[0]);
            return false;
        } else {
            udd.p("RootController", "hideWithScalingTopController hide call indicator force=false", new Object[0]);
            p0(false, (rr3) null);
            return true;
        }
    }

    public final sgc S() {
        return (sgc) this.Y.T0(this, x0[3]);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [rr3, one.me.calls.ui.ui.indicator.CallIndicatorWidget] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(one.me.calls.ui.ui.indicator.CallIndicatorWidget r5, boolean r6) {
        /*
            r4 = this;
            sgc r0 = r4.s0()
            boolean r0 = r0.n()
            java.lang.String r1 = "RootController"
            r2 = 1
            if (r0 == 0) goto L_0x0021
            az1 r0 = r4.t0()
            boolean r0 = l0(r4, r0)
            if (r0 == 0) goto L_0x0021
            m0(r4, r2)
            java.lang.String r4 = "showTopController call indicator already shown."
            defpackage.udd.p(r1, r4, new java.lang.Object[0])
            r2 = 0
            goto L_0x003a
        L_0x0021:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "showTopController show call indicator force="
            r0.<init>(r3)
            r0.append(r6)
            java.lang.String r3 = "."
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            defpackage.udd.p(r1, r0, new java.lang.Object[0])
            r4.o0(r2, r6, r5)
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.root.RootController.b(one.me.calls.ui.ui.indicator.CallIndicatorWidget, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rr3, one.me.calls.ui.ui.indicator.CallIndicatorWidget] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(one.me.calls.ui.ui.indicator.CallIndicatorWidget r4) {
        /*
            r3 = this;
            sgc r0 = r3.s0()
            boolean r0 = r0.n()
            java.lang.String r1 = "RootController"
            r2 = 1
            if (r0 == 0) goto L_0x0021
            az1 r0 = r3.t0()
            boolean r0 = l0(r3, r0)
            if (r0 == 0) goto L_0x0021
            m0(r3, r2)
            java.lang.String r3 = "showWithScalingTopController call indicator already shown."
            defpackage.udd.p(r1, r3, new java.lang.Object[0])
            r2 = 0
            goto L_0x0029
        L_0x0021:
            java.lang.String r0 = "showWithScalingTopController show call indicator force=false."
            defpackage.udd.p(r1, r0, new java.lang.Object[0])
            r3.p0(r2, r4)
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.root.RootController.l(one.me.calls.ui.ui.indicator.CallIndicatorWidget):boolean");
    }

    public final void n0(boolean z, rr3 rr3) {
        String str = z ? "SHOW_ANIMATION_TAG" : "HIDE_ANIMATION_TAG";
        if (z && !s0().n() && rr3 != null) {
            s0().R(n06.f(rr3, (wr3) null, (wr3) null));
        }
        t0().setTag(o1a.n, str);
        t0().setVisibility(0);
    }

    public final void o0(boolean z, boolean z2, rr3 rr3) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.b;
        if (!(animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = this.b) == null)) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        n0(z, rr3);
        animatorSet3.setDuration(z2 ? 0 : 250);
        int i = ((ync) ((m81) ((l81) this.a.getValue())).c.getValue()).c;
        lg7 c2 = hwf.c();
        if (z) {
            c2.add(ObjectAnimator.ofFloat(t0(), View.Y, new float[]{t0().getY(), dh4.c().getDisplayMetrics().density * 0.0f}));
            az1 r0 = r0();
            float y = r0().getY();
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("topMarginProp", new float[]{y, (r0().getY() + ((float) a24.X(((float) 100) * dh4.c().getDisplayMetrics().density))) - ((float) i)})});
            ofPropertyValuesHolder.addUpdateListener(new gfc(y, r0));
            c2.add(ofPropertyValuesHolder);
        } else {
            float f = (float) 100;
            c2.add(ObjectAnimator.ofFloat(t0(), View.Y, new float[]{t0().getY(), -((float) a24.X(dh4.c().getDisplayMetrics().density * f))}));
            az1 r02 = r0();
            float y2 = r0().getY();
            ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("topMarginProp", new float[]{y2, (r0().getY() - ((float) a24.X(f * dh4.c().getDisplayMetrics().density))) + ((float) i)})});
            ofPropertyValuesHolder2.addUpdateListener(new gfc(y2, r02));
            c2.add(ofPropertyValuesHolder2);
        }
        animatorSet3.playTogether(hwf.a(c2));
        animatorSet3.addListener(new qs3(this, z, 2));
        animatorSet3.start();
        this.b = animatorSet3;
    }

    public final void onActivityResumed(Activity activity) {
        RootController.super.onActivityResumed(activity);
        y3a o2 = o2a.a.o();
        ifc ifc = new ifc(this, 0);
        o2.getClass();
        k77 k77 = y3a.f[0];
        x3a x3a = o2.d;
        x3a.getClass();
        udd.p(x3a.class.getName(), "set new router", new Object[0]);
        x3a.b = ifc;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, jfc, android.view.View, android.view.ViewGroup] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ? coordinatorLayout = new CoordinatorLayout(viewGroup.getContext(), (AttributeSet) null);
        coordinatorLayout.setId(nob.root_view_group);
        coordinatorLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        coordinatorLayout.addView(r0());
        coordinatorLayout.addView(t0());
        az1 b2 = x87.b(coordinatorLayout.getContext());
        b2.setId(nob.root_dialogs_container);
        coordinatorLayout.addView(b2, new nt3(-1, -1));
        coordinatorLayout.onThemeChanged(km4.y0.n(coordinatorLayout.getContext()).g());
        return coordinatorLayout;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rr3, one.me.android.root.RootController] */
    public final void onViewCreated(View view) {
        sgc childRouter = getChildRouter((ViewGroup) view.findViewById(nob.root_screen), "root:screen");
        childRouter.e = 1;
        childRouter.Q(true);
        k77[] k77Arr = x0;
        k77 k77 = k77Arr[2];
        this.X.b = childRouter;
        C().a(this.w0);
        sgc childRouter2 = getChildRouter((ViewGroup) view.findViewById(nob.root_dialogs_container), "root:dialog");
        childRouter2.e = 3;
        childRouter2.Q(true);
        k77 k772 = k77Arr[3];
        this.Y.b = childRouter2;
        sgc childRouter3 = getChildRouter((ViewGroup) view.findViewById(nob.root_top_indicator), "root:topindicator");
        childRouter3.e = 1;
        childRouter3.Q(false);
        k77 k773 = k77Arr[4];
        this.Z.b = childRouter3;
        y3a o2 = o2a.a.o();
        ifc ifc = new ifc(this, 1);
        o2.getClass();
        k77 k774 = y3a.f[0];
        x3a x3a = o2.d;
        x3a.getClass();
        udd.p(x3a.class.getName(), "set new router", new Object[0]);
        x3a.b = ifc;
    }

    public final void p0(boolean z, rr3 rr3) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.b;
        if (!(animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = this.b) == null)) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        n0(z, rr3);
        View findViewById = t0().findViewById(o1a.N);
        bi1 bi1 = findViewById instanceof bi1 ? (bi1) findViewById : null;
        animatorSet3.setDuration(250);
        lg7 c2 = hwf.c();
        if (bi1 != null) {
            bi1.h(c2, z, animatorSet3.getDuration());
        }
        animatorSet3.playTogether(hwf.a(c2));
        animatorSet3.addListener(new hfc(bi1, z, this));
        animatorSet3.start();
        this.b = animatorSet3;
    }

    public final void q0(boolean z) {
        View findViewById = t0().findViewById(o1a.N);
        bi1 bi1 = findViewById instanceof bi1 ? (bi1) findViewById : null;
        if (bi1 != null) {
            bi1.a(z);
        }
        t0().setTag(o1a.n, (Object) null);
        t0().setVisibility(z ? 0 : 8);
        t0().setTranslationY(z ? dh4.c().getDisplayMetrics().density * 0.0f : -(dh4.c().getDisplayMetrics().density * 100.0f));
        u0(z);
        if (!z && s0().n()) {
            s0().C();
            udd.p("RootController", "call indicator was destroyed", new Object[0]);
        }
    }

    public final az1 r0() {
        k77 k77 = x0[0];
        return (az1) this.c.getValue();
    }

    public final int s() {
        ViewGroup.LayoutParams layoutParams = r0().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public final sgc s0() {
        return (sgc) this.Z.T0(this, x0[4]);
    }

    public final az1 t0() {
        k77 k77 = x0[1];
        return (az1) this.o.getValue();
    }

    public final void u0(boolean z) {
        int i = 0;
        int X2 = z ? a24.X(((float) 100) * dh4.c().getDisplayMetrics().density) - ((ync) ((m81) ((l81) this.a.getValue())).c.getValue()).c : a24.X(((float) 0) * dh4.c().getDisplayMetrics().density);
        ViewGroup.LayoutParams layoutParams = r0().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        }
        if (i != X2) {
            az1 r0 = r0();
            ViewGroup.LayoutParams layoutParams2 = r0.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = X2;
                r0.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
