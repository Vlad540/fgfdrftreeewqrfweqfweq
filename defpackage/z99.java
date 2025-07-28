package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: z99  reason: default package */
public final /* synthetic */ class z99 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca9 b;

    public /* synthetic */ z99(ca9 ca9, int i) {
        this.a = i;
        this.b = ca9;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.c.a();
                return jue.a;
            default:
                Context context = this.b.a.getContext();
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, l9a.l);
                s59 s59 = km4.y0;
                s59.n(context).g();
                xs7.P(enhancedVectorDrawable, "circle_background", -16745729);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                float f = (float) 24;
                gradientDrawable.setSize(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                gradientDrawable.setColor(s59.n(context).g().b().d);
                gradientDrawable.setStroke(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), s59.n(context).g().h().a);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842912}, enhancedVectorDrawable);
                stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                return stateListDrawable;
        }
    }
}
