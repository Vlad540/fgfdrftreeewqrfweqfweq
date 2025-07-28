package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: a1c  reason: default package */
public final class a1c extends b97 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1c(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public List a() {
        Proxy proxy = (Proxy) this.c;
        if (proxy != null) {
            return Collections.singletonList(proxy);
        }
        URI h = ((sm6) this.o).h();
        if (h.getHost() == null) {
            return nze.k(Proxy.NO_PROXY);
        }
        List<Proxy> select = ((ca) ((ga0) this.b).e).k.select(h);
        return (select == null || select.isEmpty()) ? nze.k(Proxy.NO_PROXY) : nze.w(select);
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((iy1) this.b).b.k(((ca) this.o).a.e, ((be6) this.c).a());
            default:
                return a();
        }
    }
}
