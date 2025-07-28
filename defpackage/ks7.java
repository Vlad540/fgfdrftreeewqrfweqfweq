package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* renamed from: ks7  reason: default package */
public final /* synthetic */ class ks7 implements k26 {
    public final /* synthetic */ int a;

    public /* synthetic */ ks7(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        ImageView imageView = (ImageView) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.a) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                pda pda = (pda) obj3;
                Drawable drawable = imageView.getDrawable();
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = drawable instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable : null;
                if (enhancedAnimatedVectorDrawable != null) {
                    xs7.P(enhancedAnimatedVectorDrawable, "left_dot", pda.b().g);
                    xs7.P(enhancedAnimatedVectorDrawable, "middle_dot", pda.b().g);
                    xs7.P(enhancedAnimatedVectorDrawable, "right_dot", pda.b().g);
                    if (booleanValue) {
                        pda.getIcon().a.a.getClass();
                        i = -16745729;
                    } else {
                        i = pda.getIcon().a.a.a;
                    }
                    xs7.P(enhancedAnimatedVectorDrawable, "shape", i);
                }
                return jue.a;
            default:
                boolean booleanValue2 = bool.booleanValue();
                pda pda2 = (pda) obj3;
                Drawable drawable2 = imageView.getDrawable();
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable2 = drawable2 instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable2 : null;
                if (enhancedAnimatedVectorDrawable2 != null) {
                    xs7.P(enhancedAnimatedVectorDrawable2, "cutout", pda2.b().g);
                    if (booleanValue2) {
                        pda2.getIcon().a.a.getClass();
                        i2 = -16745729;
                    } else {
                        i2 = pda2.getIcon().a.a.a;
                    }
                    xs7.P(enhancedAnimatedVectorDrawable2, "gear", i2);
                }
                return jue.a;
        }
    }
}
