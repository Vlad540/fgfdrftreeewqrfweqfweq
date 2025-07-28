package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;

/* renamed from: bo0  reason: default package */
public abstract class bo0 {
    public static ColorFilter a(int i, Object obj) {
        return new BlendModeColorFilter(i, (BlendMode) obj);
    }
}
