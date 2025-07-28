package defpackage;

import android.net.Uri;

/* renamed from: mj0  reason: default package */
public final class mj0 {
    public final Uri a;
    public kl b = kl.o;
    public final el c = new el();

    public mj0(Uri uri) {
        this.a = uri;
    }

    public final nj0 a(h67 h67) {
        return new nj0(this.a, this.b, this.c, h67);
    }

    public final void b(String str, String str2) {
        this.c.a(new f0e(str, str2));
    }

    public final void c(String str, boolean z) {
        this.c.a(new uo0(str, z));
    }
}
