package defpackage;

/* renamed from: iff  reason: default package */
public final class iff {
    public final t97 a;
    public final t97 b;

    public iff(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [a07, java.lang.Object] */
    public final void a(int i, long j, String str, bff bff, u12 u12, String str2) {
        String str3;
        bd bdVar = (bd) this.a.getValue();
        ht7 ht7 = new ht7();
        t97 t97 = this.b;
        ht7.put("sessionId", Long.valueOf(((i03) ((f03) t97.getValue())).D()));
        ht7.put("botId", Long.valueOf(j));
        ht7.put("webAppName", str);
        ht7.put("entryPoint", Integer.valueOf(bff.b));
        ht7.put("sourceType", Integer.valueOf(u12.a));
        Long a2 = u12.a();
        if (a2 != null) {
            ht7.put("sourceId", Long.valueOf(a2.longValue()));
        }
        if (str2 != null) {
            ht7.put("label", str2);
        }
        ht7 b2 = ht7.b();
        ? obj = new Object();
        obj.c = "WEBAPP_ACTION";
        obj.b = ((lqc) ((f03) t97.getValue())).s();
        if (i == 1) {
            str3 = "OPEN";
        } else if (i == 2) {
            str3 = "CLOSE";
        } else if (i == 3) {
            str3 = "REFRESH";
        } else {
            throw null;
        }
        obj.o = str3;
        obj.a = System.currentTimeMillis();
        obj.c(b2);
        bdVar.j(obj.d());
    }
}
