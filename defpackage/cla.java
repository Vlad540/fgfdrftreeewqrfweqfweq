package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: cla  reason: default package */
public final class cla {
    public static final String b;
    public final Context a;

    static {
        String str = File.separator;
        b = str + "copy" + str + "media";
    }

    public cla(Context context) {
        this.a = context;
    }
}
