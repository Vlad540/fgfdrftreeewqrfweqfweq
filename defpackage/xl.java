package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: xl  reason: default package */
public final /* synthetic */ class xl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Integer X;
    public final /* synthetic */ fm a;
    public final /* synthetic */ ColorStateList b;
    public final /* synthetic */ ColorStateList c;
    public final /* synthetic */ lw7 o;

    public /* synthetic */ xl(fm fmVar, ColorStateList colorStateList, ColorStateList colorStateList2, lw7 lw7, Integer num) {
        this.a = fmVar;
        this.b = colorStateList;
        this.c = colorStateList2;
        this.o = lw7;
        this.X = num;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num;
        fm fmVar = this.a;
        fmVar.getClass();
        int C = vx3.C(this.b.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c.getDefaultColor());
        ColorStateList valueOf = ColorStateList.valueOf(C);
        lw7 lw7 = this.o;
        lw7.l(valueOf);
        if (!(fmVar.N0 == null || (num = fmVar.O0) == null || !num.equals(this.X))) {
            um4.g(fmVar.N0, C);
        }
        ArrayList arrayList = fmVar.J0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hr1.r(it.next());
                if (lw7.a.c != null) {
                    throw null;
                }
            }
        }
    }
}
