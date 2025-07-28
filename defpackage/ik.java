package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* renamed from: ik  reason: default package */
public final class ik {
    public static final p7c b = new p7c("main-([0-9]+)\\.txt");
    public final Context a;

    public ik(Context context, int i) {
        this.a = context;
        gwf.j(i, 1, 100);
    }

    public final File a() {
        String str;
        String B = xs7.B();
        Context context = this.a;
        if (B.equals(context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(B.replace(':', '-'));
        }
        return ng5.N(new File(context.getCacheDir(), str), "main_snapshots");
    }
}
