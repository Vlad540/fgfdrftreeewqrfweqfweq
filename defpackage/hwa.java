package defpackage;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import java.util.Locale;

/* renamed from: hwa  reason: default package */
public final class hwa {
    public static final void a(hwa hwa, View view, cf1 cf1, RectF rectF) {
        view.setPivotX(rectF.top);
        view.setPivotY(rectF.left);
        view.setX(rectF.top);
        view.setY(rectF.left);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        kjd.J(view, 0.0f);
        cf1.setAlpha(1.0f);
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return h0e.R(lowerCase, "huawei", false) || h0e.R(lowerCase, "honor", false);
    }
}
