package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: f35  reason: default package */
public final class f35 {
    public final t97 a;
    public final r7e b;
    public final r7e c;
    public final r7e d;
    public final r7e e;
    public final r7e f;

    public f35(Context context, t97 t97, t97 t972) {
        this.a = t97;
        this.b = new r7e(new cc3(context, 5));
        this.c = new r7e(new zu4((Object) context, 2, (Object) this));
        this.d = new r7e(new e35(t972, this, 0));
        this.e = new r7e(new e35(t97, this, 1));
        this.f = new r7e(new e35(t972, this, 2));
    }

    public final mz3 a(Uri uri, boolean z) {
        yae yae = (yae) this.a.getValue();
        boolean d2 = !yae.c ? false : yae.d(uri.getHost());
        return z ? d2 ? (mz3) this.f.getValue() : (mz3) this.d.getValue() : d2 ? (mz3) this.e.getValue() : (mz3) this.c.getValue();
    }
}
