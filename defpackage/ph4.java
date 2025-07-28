package defpackage;

/* renamed from: ph4  reason: default package */
public final class ph4 {
    public final t97 a;

    public ph4(t97 t97) {
        this.a = t97;
    }

    public final void a(long j, Long l, Long l2) {
        udd.q("ph4", "execute: chatId=" + l + ", contactId=" + l2 + ", serverTime=" + j);
        t97 t97 = this.a;
        long j2 = 0;
        i22 E = (l == null || l.longValue() == 0) ? (l2 == null || l2.longValue() == 0) ? null : ((t52) t97.getValue()).E(l2.longValue()) : ((t52) t97.getValue()).y(l.longValue());
        if (E == null) {
            udd.U("ph4", "Chat is null. Ignore");
            return;
        }
        j4a j4a = E.b.f0;
        if (j4a == null) {
            udd.H("ph4", "draft is null, ignore", (Throwable) null);
            return;
        }
        Long b = j4a.b();
        if (b != null) {
            j2 = b.longValue();
        }
        if (j2 > j) {
            udd.U("ph4", "try to rewrite draft by old, ignore it!");
            return;
        }
        udd.q("ph4", "Discard server draft");
        ((t52) t97.getValue()).p(E.a);
    }
}
