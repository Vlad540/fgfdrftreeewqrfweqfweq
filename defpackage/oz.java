package defpackage;

import android.net.Uri;

/* renamed from: oz  reason: default package */
public final class oz extends cl7 {
    public j8e Y;

    public final void a() {
        super.a();
        j8e j8e = this.Y;
        if (j8e != null) {
            tic.b((c97) j8e.o);
        }
        this.Y = null;
    }

    public final void c() {
        Uri uri;
        pwc pwc = this.b;
        tk7 tk7 = this.X;
        kpa e = pwc.e(tk7);
        if (e == null) {
            uri = Uri.parse(tk7.o);
        } else {
            uri = e.Y;
            if (uri == null && (uri = e.b) == null && (uri = e.a) == null) {
                uri = Uri.parse(tk7.o);
            }
        }
        this.a.O(tk7, uri, 0, e != null ? e.X : null);
    }
}
