package defpackage;

/* renamed from: tif  reason: default package */
public final class tif {
    public final t97 a;
    public final t97 b;

    public tif(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [a07, java.lang.Object] */
    public static void a(tif tif, String str, long j, String str2, boolean z, int i, Integer num, Integer num2, int i2) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            num2 = null;
        }
        bd bdVar = (bd) tif.a.getValue();
        ht7 ht7 = new ht7();
        t97 t97 = tif.b;
        ht7.put("sessionId", Long.valueOf(((i03) ((f03) t97.getValue())).D()));
        ht7.put("botId", Long.valueOf(j));
        ht7.put("webAppName", str2);
        ht7.put("success", Integer.valueOf(z ? 1 : 0));
        ht7.put("type", Integer.valueOf(i));
        if (num != null) {
            ht7.put("method", num);
        }
        if (num2 != null) {
            ht7.put("code", num2);
        }
        ht7 b2 = ht7.b();
        ? obj = new Object();
        obj.c = "WEBAPP_BRIDGE";
        obj.b = ((lqc) ((f03) t97.getValue())).s();
        obj.a = System.currentTimeMillis();
        obj.o = str;
        obj.c(b2);
        bdVar.j(obj.d());
    }
}
