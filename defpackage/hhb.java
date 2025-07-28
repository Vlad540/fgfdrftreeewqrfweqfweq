package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.util.FloatProperty;

/* renamed from: hhb  reason: default package */
public final class hhb extends FloatProperty {
    public float a;

    public /* synthetic */ hhb(String str) {
        this(str, 0.0f);
    }

    public final Object get(Object obj) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) obj;
        return Float.valueOf(this.a);
    }

    public final void setValue(Object obj, float f) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) obj;
        this.a = f;
    }

    public hhb(String str, float f) {
        super(str);
        this.a = f;
    }
}
