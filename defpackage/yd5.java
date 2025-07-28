package defpackage;

import android.content.Context;
import android.graphics.drawable.DrawableWrapper;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* renamed from: yd5  reason: default package */
public final class yd5 extends DrawableWrapper {
    public final t97 a = ez3.O(3, new xd5(this, 0));
    public final t97 b = ez3.O(3, new xd5(this, 1));
    public final t97 c = ez3.O(3, new xd5(this, 2));

    public yd5(Context context) {
        super(new EnhancedVectorDrawable(context, snb.ic_file_extension));
    }

    public final void a(int i, int i2, int i3) {
        VectorPath vectorPath = (VectorPath) this.a.getValue();
        if (vectorPath != null) {
            vectorPath.setFillColor(i);
        }
        VectorPath vectorPath2 = (VectorPath) this.b.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setFillColor(i2);
        }
        VectorPath vectorPath3 = (VectorPath) this.c.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setFillColor(i3);
        }
    }
}
