package defpackage;

/* renamed from: ov2  reason: default package */
public final /* synthetic */ class ov2 implements s16 {
    public final /* synthetic */ aw2 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ ov2(aw2 aw2, long j, long j2) {
        this.a = aw2;
        this.b = j;
        this.c = j2;
    }

    public final Object invoke() {
        t52 l = this.a.l();
        l.getClass();
        long j = this.b;
        Long valueOf = Long.valueOf(j);
        long j2 = this.c;
        udd.p("t52", "changeLastNotifMessageId, chatId = %d, lastNotifMessageId = %d", new Object[]{valueOf, Long.valueOf(j2)});
        l.h(j, false, new f00(j2, 8));
        return jue.a;
    }
}
