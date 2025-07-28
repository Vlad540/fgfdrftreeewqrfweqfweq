package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.LruCache;
import java.util.ArrayList;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: uf  reason: default package */
public final class uf {
    public static final lv1 c = new lv1(28);
    public final Context a;
    public final Resources b;

    public uf(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    public static boolean c(Animator animator) {
        String str = null;
        AnimatorSet animatorSet = animator instanceof AnimatorSet ? (AnimatorSet) animator : null;
        if (animatorSet != null) {
            ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
            if (childAnimations.isEmpty()) {
                return false;
            }
            for (Animator animator2 : childAnimations) {
                ObjectAnimator objectAnimator = animator2 instanceof ObjectAnimator ? (ObjectAnimator) animator2 : null;
                if (Boolean.valueOf(hhd.f(objectAnimator != null ? objectAnimator.getPropertyName() : null, "pathData")).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        ObjectAnimator objectAnimator2 = animator instanceof ObjectAnimator ? (ObjectAnimator) animator : null;
        if (objectAnimator2 != null) {
            str = objectAnimator2.getPropertyName();
        }
        return Boolean.valueOf(hhd.f(str, "pathData")).booleanValue();
    }

    public final Animator a(int i) {
        gh ghVar = new gh(this.a);
        lv1 lv1 = gh.c;
        Animator animator = (Animator) ((LruCache) lv1.b).get(Integer.valueOf(i));
        if (animator != null) {
            return animator.clone();
        }
        Animator a2 = ghVar.a(ghVar.b.getAnimation(i), (AnimatorSet) null, 0);
        if (a2 != null) {
            ((LruCache) lv1.b).put(Integer.valueOf(i), a2.clone());
            return a2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final EnhancedVectorDrawable b(XmlResourceParser xmlResourceParser) {
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = 0;
        while (true) {
            if (i >= attributeCount) {
                break;
            } else if (hhd.f(xmlResourceParser.getAttributeName(i), "drawable")) {
                int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
                if (attributeResourceValue != 0) {
                    return new EnhancedVectorDrawable(this.b, attributeResourceValue);
                }
            } else {
                i++;
            }
        }
        throw new IllegalStateException();
    }
}
