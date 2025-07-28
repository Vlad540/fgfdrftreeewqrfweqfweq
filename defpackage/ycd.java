package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ycd  reason: default package */
public final class ycd extends FrameLayout implements mhe {
    public static final /* synthetic */ k77[] x0;
    public final FrameLayout a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final add o;
    public final yj w0 = new yj(this);

    static {
        k77 hc9 = new hc9(ycd.class, "shimmerBackground", "getShimmerBackground()Lone/me/sdk/uikit/common/shimmers/ShimmerContactCell$Companion$Background;");
        m7c.a.getClass();
        x0 = new k77[]{hc9};
    }

    public ycd(Context context) {
        super(context, (AttributeSet) null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(qhc.G);
        float f = (float) 40;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        this.a = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(qhc.K);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(a24.X(((float) 169) * dh4.c().getDisplayMetrics().density), a24.X(((float) 20) * dh4.c().getDisplayMetrics().density)));
        this.b = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(qhc.J);
        float f2 = (float) 12;
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(a24.X(((float) 90) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f2)));
        this.c = frameLayout3;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(qhc.I);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        add add = new add(context);
        add.setId(qhc.H);
        add.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.o = add;
        setId(qhc.F);
        setLayoutParams(new FrameLayout.LayoutParams(-1, a24.X(((float) 62) * dh4.c().getDisplayMetrics().density)));
        constraintLayout.addView(frameLayout);
        constraintLayout.addView(frameLayout2);
        constraintLayout.addView(frameLayout3);
        add.addView(constraintLayout);
        addView(add);
        onThemeChanged(km4.y0.r(this));
        bf3 p = a06.p(constraintLayout);
        int id = frameLayout.getId();
        p.d(id, 3, 0, 3);
        p.d(id, 4, 0, 4);
        p.d(id, 6, 0, 6);
        new hw9(p, 6, id, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        int id2 = frameLayout2.getId();
        p.d(id2, 3, frameLayout.getId(), 3);
        p.d(id2, 6, frameLayout.getId(), 7);
        new hw9(p, 6, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        int id3 = frameLayout3.getId();
        p.d(id3, 4, frameLayout.getId(), 4);
        p.d(id3, 6, frameLayout.getId(), 7);
        new hw9(p, 6, id3, 4).e(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        p.a(constraintLayout);
    }

    public final void a(pda pda) {
        int ordinal = getShimmerBackground().ordinal();
        if (ordinal == 0) {
            pda.b();
            setBackgroundColor(0);
        } else if (ordinal == 1) {
            setBackgroundColor(pda.b().i);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final xcd getShimmerBackground() {
        k77 k77 = x0[0];
        return (xcd) this.w0.b;
    }

    public final void onThemeChanged(pda pda) {
        a(pda);
        this.a.setBackground(swb.H(Integer.valueOf(pda.c().a.c), (Integer) null, (Integer) null));
        float f = (float) 4;
        this.b.setBackground(swb.L(Integer.valueOf(pda.c().a.c), (Integer) null, (Integer) null, a24.X(dh4.c().getDisplayMetrics().density * f)));
        this.c.setBackground(swb.L(Integer.valueOf(pda.c().a.c), (Integer) null, (Integer) null, a24.X(f * dh4.c().getDisplayMetrics().density)));
        c9 c9Var = new c9(21);
        wcd wcd = (wcd) c9Var.b;
        wcd.k = false;
        wcd.i = 0.0f;
        c9Var.u(1200);
        c9Var.s(pda.c().a.c);
        wcd.d = pda.b().i;
        c9Var.r();
        this.o.a(c9Var.i());
    }

    public final void setShimmerBackground(xcd xcd) {
        this.w0.o1(this, x0[0], xcd);
    }
}
