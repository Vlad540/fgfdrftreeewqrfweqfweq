package defpackage;

import android.content.Context;
import android.graphics.Rect;

/* renamed from: cv4  reason: default package */
public final class cv4 {
    public static final Rect c = new Rect();
    public final r7e a;
    public final r7e b = new r7e(new gz3(4, this));

    public cv4(Context context) {
        this.a = new r7e(new cc3(this, context));
    }

    public final float a() {
        return ((Number) this.a.getValue()).floatValue();
    }
}
