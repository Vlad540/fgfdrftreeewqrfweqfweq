package defpackage;

import android.content.Context;
import android.view.ViewConfiguration;

/* renamed from: g76  reason: default package */
public final class g76 {
    public f76 a = null;
    public final float b;
    public boolean c = false;
    public boolean d = false;
    public long e;
    public float f;
    public float g;

    public g76(Context context) {
        this.b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
