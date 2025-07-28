package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: dh4  reason: default package */
public abstract class dh4 {
    public static final t97 a = ez3.O(2, new xd3(17));

    public static final int a(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16843499, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static final int b(int i) {
        return a24.X(((float) i) * c().getDisplayMetrics().density);
    }

    public static final Resources c() {
        return (Resources) a.getValue();
    }

    public static final float d(float f) {
        return TypedValue.applyDimension(2, f, c().getDisplayMetrics());
    }
}
