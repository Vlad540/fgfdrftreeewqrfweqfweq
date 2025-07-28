package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: qze  reason: default package */
public final class qze {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static qze d;
    public final dr9 a;

    public qze(dr9 dr9) {
        this.a = dr9;
    }

    public final boolean a(ha0 ha0) {
        if (TextUtils.isEmpty(ha0.c)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return ha0.f + ha0.e < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
