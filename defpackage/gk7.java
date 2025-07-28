package defpackage;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* renamed from: gk7  reason: default package */
public final class gk7 implements wie {
    public final Executor a;
    public final qe4 b;
    public final ContentResolver c;

    public gk7(Executor executor, qe4 qe4, ContentResolver contentResolver) {
        this.a = executor;
        this.b = qe4;
        this.c = contentResolver;
    }

    public final void a(ah0 ah0, z4b z4b) {
        ji0 ji0 = (ji0) z4b;
        c5b c5b = ji0.c;
        ji0.h("local", "exif");
        ek7 ek7 = new ek7(this, ah0, c5b, z4b, ji0.a);
        ji0.a(new fk7(ek7, 0));
        this.a.execute(ek7);
    }

    public final boolean b(hbc hbc) {
        return vx3.A(512, 512, hbc);
    }
}
