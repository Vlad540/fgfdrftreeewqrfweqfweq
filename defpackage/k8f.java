package defpackage;

import java.util.Map;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: k8f  reason: default package */
public final /* synthetic */ class k8f implements yx7, of3 {
    public final /* synthetic */ l8f a;
    public final /* synthetic */ o10 b;
    public final /* synthetic */ n10 c;

    public /* synthetic */ k8f(l8f l8f, n10 n10, o10 o10) {
        this.a = l8f;
        this.c = n10;
        this.b = o10;
    }

    public void accept(Object obj) {
        l8f l8f = this.a;
        l8f.getClass();
        String str = this.b.q;
        l8f.a.getClass();
        x3f.a.put(str, new w3f((xb5) obj, System.currentTimeMillis()));
        bd bdVar = (bd) l8f.c.get();
        if (bdVar != null) {
            n10 n10 = this.c;
            if (r1g.p(n10.i)) {
                bdVar.f("ACTION_VIDEO_FETCH_OK");
            } else {
                bdVar.g("ACTION_VIDEO_FETCH_OK", n10.i);
            }
        }
    }

    public void c(ex7 ex7) {
        l8f l8f = this.a;
        l8f.getClass();
        n10 n10 = this.c;
        String str = n10.h;
        if (r1g.p(str) || pvf.b(str) || !r1g.p(xcf.b(str)) || !r1g.p(vy6.b(str))) {
            if (n10.g) {
                if (n10.k > l8f.g.a.m()) {
                    if (!ex7.h()) {
                        ex7.onError(new FetcherException(7, "live stream not started"));
                        return;
                    }
                    return;
                }
            }
            o10 o10 = this.b;
            String b2 = l8f.b(o10);
            if (r1g.p(b2)) {
                l8f.a.getClass();
                Map map = x3f.a;
                String str2 = o10.q;
                w3f w3f = (w3f) map.get(str2);
                xb5 xb5 = null;
                if (w3f != null) {
                    if (w3f.b + 3600000 > System.currentTimeMillis()) {
                        xb5 = w3f.a;
                    } else {
                        map.remove(str2);
                    }
                }
                if (xb5 == null) {
                    if (!ex7.h()) {
                        ex7.b();
                    }
                } else if (!ex7.h()) {
                    ex7.a(xb5);
                }
            } else {
                udd.p("VideoRipper", "getVideoContent: local path = %s", new Object[]{b2});
                if (!ex7.h()) {
                    ex7.b();
                }
            }
        } else if (!ex7.h()) {
            ex7.onError(new FetcherException(5, "Video hosting in black list"));
        }
    }

    public /* synthetic */ k8f(l8f l8f, o10 o10, n10 n10) {
        this.a = l8f;
        this.b = o10;
        this.c = n10;
    }
}
