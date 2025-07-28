package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ff6  reason: default package */
public final class ff6 {
    public static final ff6 a = new Object();
    public static final AtomicBoolean b = new AtomicBoolean(true);
    public static Context c;

    public static void a(File file) {
        if (file.exists()) {
            file.toString();
            file.delete();
        }
    }
}
