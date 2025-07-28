package defpackage;

/* renamed from: k1d  reason: default package */
public final class k1d extends c0d {
    public final long b;

    public k1d(long j) {
        this.b = j;
    }

    public final void x() {
        t52 b2 = b();
        b2.getClass();
        StringBuilder sb = new StringBuilder("storeChatFromCache chatId = ");
        long j = this.b;
        sb.append(j);
        udd.q("t52", sb.toString());
        p62 z = b2.z(j);
        if (z == null) {
            udd.s("t52", "storeChatFromCache, chatId = " + j, (Throwable) null);
            return;
        }
        ((hz3) ((a04) b2.l.get())).b.g(j, z.c);
    }
}
