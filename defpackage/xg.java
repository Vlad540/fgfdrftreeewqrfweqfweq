package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;

/* renamed from: xg  reason: default package */
public final class xg extends ibe {
    public static final xg o = new ibe(vg.INTERPOLATOR, 1, new AccelerateDecelerateInterpolator());

    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
        if (attributeResourceValue != 0) {
            return AnimationUtils.loadInterpolator(context, attributeResourceValue);
        }
        throw new IllegalStateException("Can't parse interpolator");
    }
}
