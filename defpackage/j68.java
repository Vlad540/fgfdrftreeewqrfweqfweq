package defpackage;

import android.net.Uri;
import java.util.Collections;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: j68  reason: default package */
public final class j68 implements lt0 {
    public static final x48 Y = new x48(1);
    public final u58 X;
    public final String a;
    public final c68 b;
    public final y58 c;
    public final y78 o;

    static {
        r58 r58 = new r58();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        Collections.emptyList();
        e8c e8c2 = e8c.X;
        r58.b();
        y78 y78 = y78.W0;
    }

    public j68(String str, u58 u58, c68 c68, y58 y58, y78 y78) {
        this.a = str;
        this.b = c68;
        this.c = y58;
        this.o = y78;
        this.X = u58;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [s58, u58] */
    public static j68 a(Uri uri) {
        Uri uri2 = uri;
        r58 r58 = new r58();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        return new j68(BuildConfig.FLAVOR, new s58(r58), uri2 != null ? new c68(uri2, (jjd) null, Collections.emptyList(), e8c.X) : null, new y58(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), y78.W0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j68)) {
            return false;
        }
        j68 j68 = (j68) obj;
        return mze.a(this.a, j68.a) && this.X.equals(j68.X) && mze.a(this.b, j68.b) && mze.a(this.c, j68.c) && mze.a(this.o, j68.o);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c68 c68 = this.b;
        int hashCode2 = c68 != null ? c68.hashCode() : 0;
        int hashCode3 = this.c.hashCode();
        return this.o.hashCode() + ((this.X.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }
}
