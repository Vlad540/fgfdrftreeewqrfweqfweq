package defpackage;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: rv0  reason: default package */
public final /* synthetic */ class rv0 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv0 b;
    public final /* synthetic */ Collection c;

    public /* synthetic */ rv0(uv0 uv0, HashSet hashSet, int i) {
        this.a = i;
        this.b = uv0;
        this.c = hashSet;
    }

    public final void run() {
        Collection collection;
        Iterator it;
        uv0 uv0;
        switch (this.a) {
            case 0:
                uv0 uv02 = this.b;
                Collection collection2 = this.c;
                uv02.getClass();
                if (collection2.contains(xv0.x0)) {
                    xv0 xv0 = xv0.Y;
                    if (!collection2.contains(xv0)) {
                        collection2.add(xv0);
                    }
                }
                if (uv02.k.a != null) {
                    sv0 sv0 = uv02.k;
                    if (collection2.contains(xv0.Z) || collection2.contains(xv0.c)) {
                        h30 h30 = uv02.b;
                        h30.getClass();
                        udd.q("h30", "stop");
                        h30.t();
                        h30.c.t();
                        h30.n();
                    }
                    duf duf = sv0.a;
                    duf.getClass();
                    HashMap hashMap = new HashMap(collection2.size());
                    Iterator it2 = collection2.iterator();
                    long j = 0;
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        xv0 xv02 = xv0.a;
                        if (hasNext) {
                            xv0 xv03 = (xv0) it2.next();
                            Iterator it3 = ((List) duf.a).iterator();
                            long j2 = 0;
                            long j3 = 0;
                            while (it3.hasNext()) {
                                jv0 jv0 = (jv0) it3.next();
                                if (xv03 != xv02) {
                                    try {
                                        if (jv0.d != xv03) {
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                                it3.remove();
                                if (jv0.a.delete()) {
                                    j2++;
                                    uv0 = uv02;
                                    j3 += jv0.b;
                                    udd.p("duf", "deleteEntries: delete=%s", new Object[]{jv0});
                                } else {
                                    uv0 = uv02;
                                    udd.t("duf", "deleteEntries: failed to delete=%s", new Object[]{jv0});
                                }
                                uv02 = uv0;
                            }
                            udd.p("duf", "deleteEntries: cacheType=%s removed: files=%d, bytes=%d", new Object[]{xv03, Long.valueOf(j2), Long.valueOf(j3)});
                            j += j3;
                            hashMap.put(xv03, Long.valueOf(j3));
                            uv02 = uv02;
                        } else {
                            uv0 uv03 = uv02;
                            t97 t97 = ((fd5) duf.b).a;
                            ((bd) t97.getValue()).f("ACTION_CACHE_CLEARED");
                            Set entrySet = hashMap.entrySet();
                            Iterator it4 = entrySet.iterator();
                            long j4 = 0;
                            while (it4.hasNext()) {
                                Map.Entry entry = (Map.Entry) it4.next();
                                xv0 xv04 = (xv0) entry.getKey();
                                if (xv04 == xv0.b || xv04 == xv02) {
                                    fr6 u = a06.u();
                                    it = it4;
                                    collection = collection2;
                                    yc5 yc5 = new yc5(25);
                                    u.f.m(yc5);
                                    u.g.m(yc5);
                                    zh4 zh4 = (zh4) u.c.get();
                                    zh4.a().a();
                                    ((ys0) zh4.d.getValue()).a();
                                    for (Map.Entry value : ((at6) zh4.f.getValue()).entrySet()) {
                                        ((ys0) value.getValue()).a();
                                    }
                                } else {
                                    collection = collection2;
                                    it = it4;
                                }
                                long longValue = ((Long) entry.getValue()).longValue();
                                j4 += longValue;
                                File a2 = ((gd5) duf.c).a(xv04);
                                ((bd) t97.getValue()).e(longValue, "ACTION_CACHE_CLEARED_SIZE", a2 != null ? a2.getName() : xv04.name());
                                it4 = it;
                                collection2 = collection;
                            }
                            Collection collection3 = collection2;
                            if (uv0.l.equals(hashMap.keySet()) || (entrySet.size() == 1 && ((Map.Entry) entrySet.iterator().next()).getKey() == xv02)) {
                                ((bd) t97.getValue()).e(j4, "ACTION_CACHE_CLEARED_SIZE", "ALL");
                            }
                            udd.p("duf", "clearCacheTypes: removed %d bytes", new Object[]{Long.valueOf(j)});
                            uv03.c.a(new e0d((HashSet) collection3));
                            return;
                        }
                    }
                } else {
                    udd.s("uv0", "onClearCacheTypesPicked: already cleared all", (Throwable) null);
                    return;
                }
            default:
                uv0 uv04 = this.b;
                uv04.getClass();
                if (this.c.equals(uv0.l)) {
                    uv04.i.set(true);
                    return;
                }
                return;
        }
    }
}
