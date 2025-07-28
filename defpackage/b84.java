package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: b84  reason: default package */
public final class b84 implements cj6 {
    public final /* synthetic */ f84 a;

    public b84(f84 f84) {
        this.a = f84;
    }

    public final void a() {
        this.a.c.remove(this);
    }

    public final boolean e(Uri uri, wi7 wi7, boolean z) {
        HashMap hashMap;
        d84 d84;
        f84 f84 = this.a;
        if (((mi6) f84.D0) == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = mze.a;
            List list = ((ui6) f84.C0).e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                hashMap = f84.b;
                if (i2 >= size) {
                    break;
                }
                d84 d842 = (d84) hashMap.get(((si6) list.get(i2)).a);
                if (d842 != null && elapsedRealtime < d842.w0) {
                    i3++;
                }
                i2++;
            }
            nv4 nv4 = new nv4(1, 0, ((ui6) f84.C0).e.size(), i3, 1);
            ((lk9) f84.y0).getClass();
            sz0 f = lk9.f(nv4, wi7);
            if (!(f == null || f.b != 2 || (d84 = (d84) hashMap.get(uri)) == null)) {
                d84.a(d84, f.c);
            }
        }
        return false;
    }
}
