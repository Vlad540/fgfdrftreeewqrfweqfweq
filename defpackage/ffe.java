package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: ffe  reason: default package */
public final class ffe extends u2 {
    public static final ffe c = new u2(12, (Object) null);

    public final boolean N1() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
