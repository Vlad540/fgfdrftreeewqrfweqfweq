package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: a9a  reason: default package */
public final class a9a extends ty2 implements mhe {
    public static final /* synthetic */ k77[] H0;
    public final z8a F0 = new z8a(this, 0);
    public final z8a G0 = new z8a(this, 1);

    static {
        Class<a9a> cls = a9a.class;
        H0 = new k77[]{new hc9(cls, "appearance", "getAppearance()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Appearance;"), c3d.g(m7c.a, cls, "size", "getSize()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Size;")};
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [ni0, a9a, android.view.View] */
    public a9a(Context context) {
        super(context, (AttributeSet) null, wlb.circularProgressIndicatorStyle, ty2.E0);
        uy2 uy2 = this.a;
        qn4 qn4 = new qn4(uy2);
        Context context2 = getContext();
        pv6 pv6 = new pv6(context2, uy2, qn4, new qy2(uy2));
        Resources resources = context2.getResources();
        int i = bob.indeterminate_static;
        o0f o0f = new o0f();
        ThreadLocal threadLocal = ubc.a;
        o0f.a = obc.a(resources, i, (Resources.Theme) null);
        new n0f(o0f.a.getConstantState());
        pv6.C0 = o0f;
        setIndeterminateDrawable(pv6);
        setProgressDrawable(new df4(getContext(), uy2, qn4));
        setIndeterminate(true);
        setTrackCornerRadius(a24.X(((float) 20) * dh4.c().getDisplayMetrics().density));
    }

    public static int d(t8a t8a, pda pda) {
        if (hhd.f(t8a, m8a.a)) {
            return pda.d().f.a;
        }
        if (hhd.f(t8a, n8a.a)) {
            pda.d().f.getClass();
            return -1;
        } else if (hhd.f(t8a, o8a.a)) {
            return pda.d().f.c;
        } else {
            if (hhd.f(t8a, p8a.a)) {
                return pda.d().f.g;
            }
            if (hhd.f(t8a, q8a.a)) {
                pda.d().f.getClass();
                return -15921907;
            } else if (hhd.f(t8a, s8a.a)) {
                pda.d().f.getClass();
                return -16745729;
            } else if (hhd.f(t8a, r8a.a)) {
                return pda.d().f.e;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final t8a getAppearance() {
        k77 k77 = H0[0];
        return (t8a) this.F0.b;
    }

    public final y8a getSize() {
        k77 k77 = H0[1];
        return (y8a) this.G0.b;
    }

    public final void onThemeChanged(pda pda) {
        setIndicatorColor(new int[]{d(getAppearance(), pda)});
    }

    public final void setAppearance(t8a t8a) {
        this.F0.o1(this, H0[0], t8a);
    }

    public final void setSize(y8a y8a) {
        this.G0.o1(this, H0[1], y8a);
    }
}
