package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.util.IntProperty;

/* renamed from: hg  reason: default package */
public final class hg extends IntProperty {
    public int a;

    public hg(String str, int i) {
        super(str);
        this.a = i;
    }

    public final Object get(Object obj) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) obj;
        return Integer.valueOf(this.a);
    }

    public final void setValue(Object obj, int i) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) obj;
        this.a = i;
    }
}
