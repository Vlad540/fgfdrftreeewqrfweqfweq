package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.UUID;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: q58  reason: default package */
public final class q58 {
    public String a;
    public Uri b;
    public String c;
    public r58 d;
    public q44 e;
    public List f;
    public String g;
    public ws6 h;
    public p58 i;
    public Object j;
    public long k;
    public z78 l;
    public x58 m;
    public d68 n;

    public final l68 a() {
        a68 a68;
        q44 q44 = this.e;
        oyb.k(((Uri) q44.e) == null || ((UUID) q44.d) != null);
        Uri uri = this.b;
        w58 w58 = null;
        if (uri != null) {
            q44 q442 = this.e;
            if (((UUID) q442.d) != null) {
                w58 = q442.a();
            }
            a68 = new a68(uri, this.c, w58, this.i, this.f, this.g, this.h, this.j, this.k);
        } else {
            a68 = null;
        }
        String str = this.a;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String str2 = str;
        v58 c2 = this.d.c();
        z58 a2 = this.m.a();
        z78 z78 = this.l;
        if (z78 == null) {
            z78 = z78.J;
        }
        return new l68(str2, c2, a68, a2, z78, this.n);
    }

    public final void b(t58 t58) {
        this.d = t58.a();
    }
}
