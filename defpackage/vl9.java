package defpackage;

/* renamed from: vl9  reason: default package */
public final class vl9 {
    public static final /* synthetic */ k77[] d;
    public static final String e;
    public final nj4 a;
    public final nj4 b;
    public final nj4 c;

    static {
        Class<vl9> cls = vl9.class;
        k77 khb = new khb(cls, "prefs", "getPrefs()Lru/ok/tamtam/Prefs;", 0);
        n7c n7c = m7c.a;
        d = new k77[]{khb, wn6.e(n7c, cls, "discardServerDraftUseCase", "getDiscardServerDraftUseCase()Lru/ok/tamtam/draft/DiscardServerDraftUseCase;", 0), wn6.f(cls, "downloadDraftUseCase", "getDownloadDraftUseCase()Lru/ok/tamtam/draft/DownloadDraftUseCase;", 0, n7c)};
        e = cls.getName();
    }

    public vl9(nj4 nj4, nj4 nj42, nj4 nj43) {
        this.a = nj4;
        this.b = nj42;
        this.c = nj43;
    }

    public final g2b a() {
        k77 k77 = d[0];
        return (g2b) this.a.get();
    }
}
