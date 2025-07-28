package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: c84  reason: default package */
public final class c84 implements dj6 {
    public final /* synthetic */ f84 a;

    public c84(f84 f84) {
        this.a = f84;
    }

    public final void a() {
        this.a.c.remove(this);
    }

    public final boolean c(Uri uri, wi7 wi7, boolean z) {
        HashMap hashMap;
        e84 e84;
        f84 f84 = this.a;
        if (((ni6) f84.D0) == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = oze.a;
            List list = ((vi6) f84.C0).e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                hashMap = f84.b;
                if (i2 >= size) {
                    break;
                }
                e84 e842 = (e84) hashMap.get(((ti6) list.get(i2)).a);
                if (e842 != null && elapsedRealtime < e842.w0) {
                    i3++;
                }
                i2++;
            }
            nv4 nv4 = new nv4(1, 0, ((vi6) f84.C0).e.size(), i3, 2);
            ((mk9) f84.y0).getClass();
            sz0 i4 = mk9.i(nv4, wi7);
            if (!(i4 == null || i4.b != 2 || (e84 = (e84) hashMap.get(uri)) == null)) {
                e84.a(e84, i4.c);
            }
        }
        return false;
    }
}
