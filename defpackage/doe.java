package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import ru.ok.tracer.minidump.Minidump;

/* renamed from: doe  reason: default package */
public abstract class doe {
    public static boolean a() {
        if (hhd.f((Object) null, Boolean.FALSE)) {
            return false;
        }
        try {
            Minidump.getInstance();
            return true;
        } catch (Throwable unused) {
            hhd.f((Object) null, Boolean.TRUE);
            return false;
        }
    }

    public static void b(Context context) {
        String str;
        try {
            String B = xs7.B();
            if (B.equals(context.getPackageName())) {
                str = "tracer";
            } else {
                str = "tracer-" + Uri.encode(B.replace(':', '-'));
            }
            File N = ng5.N(new File(context.getCacheDir(), str), "minidump");
            h2g.t(N);
            Minidump.getInstance().installMinidumpWriter(N.getPath());
        } catch (Throwable unused) {
        }
    }
}
