package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: gq3  reason: default package */
public abstract class gq3 {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i) {
        return context.getDrawable(i);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
