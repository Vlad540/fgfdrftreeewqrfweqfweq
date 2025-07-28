package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: rs3  reason: default package */
public final class rs3 implements ns3 {
    public final LinkedHashSet a = new LinkedHashSet();
    public AnimatorSet b;
    public View c;
    public View d;
    public final t97 e = ez3.O(3, new os3(this, 0));
    public final t97 f = ez3.O(3, new os3(this, 1));
    public boolean g = true;
    public u16 h;
    public u16 i;
    public ls3 j;
    public ls3 k;

    public rs3() {
        t13 t13 = new t13(10);
        this.h = t13;
        this.i = new t13(10);
        this.j = new ls3();
        this.k = new ls3();
        t13.invoke(true);
    }

    public final void a(boolean z) {
        View view;
        boolean z2 = z;
        boolean z3 = this.g;
        if (z3 == z2 || this.b != null) {
            this.h.invoke(Boolean.valueOf(z3));
            return;
        }
        this.j = ls3.a(this.j, 0, 0, z2, 3);
        ls3 a2 = ls3.a(this.k, 0, 0, z2, 3);
        this.k = a2;
        this.g = z2;
        View view2 = this.c;
        if (view2 != null && (view = this.d) != null) {
            boolean z4 = this.j.c;
            int i2 = z4 ? 1 : -1;
            boolean z5 = a2.c;
            int i3 = !z5 ? 1 : -1;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            int b2 = this.j.b();
            float f2 = ((float) b2) * ((float) i2);
            ks3 ks3 = r8;
            AnimatorSet animatorSet2 = animatorSet;
            ks3 ks32 = new ks3(z4, b2, i2, f2, view2.getY(), this.j.b);
            int b3 = this.k.b();
            float f3 = ((float) b3) * ((float) i3);
            ks3 ks33 = new ks3(z5, b3, i3, f3, view.getY(), this.k.b);
            Property property = View.ALPHA;
            float f4 = 0.0f;
            Float valueOf = Float.valueOf(0.0f);
            if (!z4) {
                valueOf = null;
            }
            float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
            Float valueOf2 = Float.valueOf(1.0f);
            if (!z4) {
                valueOf2 = null;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, new float[]{floatValue, valueOf2 != null ? valueOf2.floatValue() : 0.0f});
            Property property2 = View.Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property2, new float[]{view2.getY(), view2.getY() + f2});
            Float valueOf3 = Float.valueOf(0.0f);
            if (!z5) {
                valueOf3 = null;
            }
            float floatValue2 = valueOf3 != null ? valueOf3.floatValue() : 1.0f;
            Float valueOf4 = Float.valueOf(1.0f);
            if (!z5) {
                valueOf4 = null;
            }
            if (valueOf4 != null) {
                f4 = valueOf4.floatValue();
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, property, new float[]{floatValue2, f4});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, property2, new float[]{view.getY(), view.getY() + f3});
            LinkedHashSet<ms3> linkedHashSet = this.a;
            ArrayList arrayList = new ArrayList(q23.H(linkedHashSet, 10));
            for (ms3 H : linkedHashSet) {
                arrayList.add(H.H(ks3, ks33));
            }
            ArrayList I = q23.I(arrayList);
            lg7 c2 = hwf.c();
            c2.add(ofFloat);
            c2.add(ofFloat2);
            c2.add(ofFloat3);
            c2.add(ofFloat4);
            c2.addAll(I);
            AnimatorSet animatorSet3 = animatorSet2;
            animatorSet3.playTogether(hwf.a(c2));
            animatorSet3.addListener(new qs3(this, this.g, 0));
            animatorSet3.start();
            this.b = animatorSet3;
        }
    }
}
