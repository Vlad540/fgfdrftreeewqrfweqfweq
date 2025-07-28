package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: d6g  reason: default package */
public final class d6g {
    public final Context a;

    public d6g(Context context) {
        this.a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File a2 : listFiles) {
                j += a(a2);
            }
        }
        return j;
    }
}
