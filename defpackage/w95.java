package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: w95  reason: default package */
public final class w95 {
    public static final /* synthetic */ int h = 0;
    public final pk a;
    public final lce b;
    public final qmc c;
    public final qmc d;
    public final jee e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final n83 g = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [n83, java.lang.Object] */
    public w95(pk pkVar, lce lce, qmc qmc, qmc qmc2, tt0 tt0, jee jee) {
        this.a = pkVar;
        this.b = lce;
        this.c = qmc;
        this.d = qmc2;
        this.e = jee;
        tt0.d(this);
    }

    public final sid a(Callable callable) {
        sid sid = new sid();
        this.f.put((Long) callable.call(), sid);
        return sid;
    }

    @a1e
    public void onEvent(ft ftVar) {
        sid sid = (sid) this.f.get(Long.valueOf(ftVar.a));
        if (sid != null) {
            sid.a(ftVar);
        }
    }

    @a1e
    public void onEvent(tt ttVar) {
        sid sid = (sid) this.f.get(Long.valueOf(ttVar.a));
        if (sid != null) {
            sid.a(ttVar);
        }
    }

    @a1e
    public void onEvent(nt ntVar) {
        sid sid = (sid) this.f.get(Long.valueOf(ntVar.a));
        if (sid != null) {
            sid.a(ntVar);
        }
    }

    @a1e
    public void onEvent(qt qtVar) {
        sid sid = (sid) this.f.get(Long.valueOf(qtVar.a));
        if (sid != null) {
            sid.a(qtVar);
        }
    }

    @a1e
    public void onEvent(jh0 jh0) {
        sid sid = (sid) this.f.get(Long.valueOf(jh0.a));
        if (sid != null) {
            sid.onError(new TamErrorException(jh0.b));
        }
    }
}
