package defpackage;

import java.util.Map;

/* renamed from: g4b  reason: default package */
public final class g4b {
    public static final /* synthetic */ k77[] d;
    public static final String e;
    public final g2b a;
    public final nj4 b;
    public final nj4 c;

    static {
        Class<g4b> cls = g4b.class;
        d = new k77[]{new khb(cls, "discardServerDraftUseCase", "getDiscardServerDraftUseCase()Lru/ok/tamtam/draft/DiscardServerDraftUseCase;", 0), wn6.e(m7c.a, cls, "downloadDraftUseCase", "getDownloadDraftUseCase()Lru/ok/tamtam/draft/DownloadDraftUseCase;", 0)};
        e = cls.getName();
    }

    public g4b(g2b g2b, nj4 nj4, nj4 nj42) {
        this.a = g2b;
        this.b = nj4;
        this.c = nj42;
    }

    public final void a(pm4 pm4, long j) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        String str = e;
        udd.q(str, "execute: draftsNews=" + pm4 + ", serverTime=" + j + "ms");
        j2b j2b = (j2b) this.a;
        j2b.a.k("user.draftsLastSync", Long.valueOf(j));
        if (!j2b.b.s()) {
            udd.q(str, "Drafts sync disabled");
        } else if (pm4 != null) {
            em4 em4 = pm4.a;
            Map map5 = em4 != null ? em4.a : null;
            nj4 nj4 = this.b;
            k77[] k77Arr = d;
            if (!(map5 == null || map5.isEmpty() || em4 == null || (map4 = em4.a) == null)) {
                for (Map.Entry entry : map4.entrySet()) {
                    k77 k77 = k77Arr[0];
                    ((ph4) nj4.get()).a(((Number) entry.getValue()).longValue(), (Long) entry.getKey(), (Long) null);
                }
            }
            em4 em42 = pm4.b;
            Map map6 = em42 != null ? em42.a : null;
            if (!(map6 == null || map6.isEmpty() || em42 == null || (map3 = em42.a) == null)) {
                for (Map.Entry entry2 : map3.entrySet()) {
                    k77 k772 = k77Arr[0];
                    ((ph4) nj4.get()).a(((Number) entry2.getValue()).longValue(), (Long) null, (Long) entry2.getKey());
                }
            }
            Map map7 = em4 != null ? em4.b : null;
            nj4 nj42 = this.c;
            if (!(map7 == null || map7.isEmpty() || em4 == null || (map2 = em4.b) == null)) {
                for (Map.Entry entry3 : map2.entrySet()) {
                    k77 k773 = k77Arr[1];
                    ((ck4) nj42.get()).a((Long) entry3.getKey(), (Long) null, (nzc) entry3.getValue());
                }
            }
            Map map8 = em42 != null ? em42.b : null;
            if (map8 != null && !map8.isEmpty() && em42 != null && (map = em42.b) != null) {
                for (Map.Entry entry4 : map.entrySet()) {
                    long longValue = ((Number) entry4.getKey()).longValue();
                    k77 k774 = k77Arr[1];
                    ((ck4) nj42.get()).a((Long) null, Long.valueOf(longValue), (nzc) entry4.getValue());
                }
            }
        }
    }
}
