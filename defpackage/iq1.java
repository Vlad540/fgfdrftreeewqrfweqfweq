package defpackage;

import java.util.LinkedHashMap;

/* renamed from: iq1  reason: default package */
public final class iq1 {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public iq1(t97 t97, t97 t972, t97 t973) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [a07, java.lang.Object] */
    public static void c(iq1 iq1, String str, String str2, String str3, Integer num, String str4, String str5, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            z = false;
        }
        bd bdVar = (bd) iq1.b.getValue();
        ht7 ht7 = new ht7();
        Integer d = ((xg9) iq1.c.getValue()).d();
        if (d != null) {
            ht7.put("screen", Integer.valueOf(d.intValue()));
        }
        if (str2 != null) {
            ht7.put("call_id", str2);
        }
        if (str3 != null) {
            ht7.put("event_label_str", str3);
        }
        if (num != null) {
            ht7.put("event_label_int", Integer.valueOf(num.intValue()));
        }
        if (str4 != null) {
            ht7.put("custom_feedback", str4);
        }
        if (str5 != null) {
            ht7.put("error_type", str5);
        }
        ht7.put("is_group", Integer.valueOf(z ? 1 : 0));
        ht7 b2 = ht7.b();
        ? obj = new Object();
        obj.c = "CALL";
        t97 t97 = iq1.a;
        obj.b = ((lqc) ((f03) t97.getValue())).s();
        obj.X = ((i03) ((f03) t97.getValue())).D();
        obj.o = str;
        obj.a = System.currentTimeMillis();
        obj.c(b2);
        bdVar.j(obj.d());
    }

    public final void a(long j, LinkedHashMap linkedHashMap) {
        ht7 ht7 = new ht7();
        Integer d = ((xg9) this.c.getValue()).d();
        if (d != null) {
            ht7.put("screen", Integer.valueOf(d.intValue()));
        }
        ht7.put("user_id2", Long.valueOf(j));
        ht7.putAll(linkedHashMap);
        b("ADMIN_CALL_SETTINGS_TO_USER", ht7.b());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [a07, java.lang.Object] */
    public final void b(String str, ht7 ht7) {
        ? obj = new Object();
        obj.c = "CALL";
        t97 t97 = this.a;
        obj.b = ((lqc) ((f03) t97.getValue())).s();
        obj.X = ((i03) ((f03) t97.getValue())).D();
        obj.o = str;
        obj.a = System.currentTimeMillis();
        obj.c(ht7);
        ((bd) this.b.getValue()).j(obj.d());
    }

    public final void d(int i, int i2) {
        String str;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                throw null;
            }
        }
        Integer valueOf = Integer.valueOf(i3);
        if (i == 1) {
            str = "COPY_LINK";
        } else if (i == 2) {
            str = "INSIDE_SHARE";
        } else if (i == 3) {
            str = "OUTSIDE_SHARE";
        } else {
            throw null;
        }
        c(this, "SHARE_CALL_LINK", (String) null, str, valueOf, (String) null, (String) null, true, 50);
    }

    public final void e(hq1 hq1, boolean z) {
        c(this, "START_CALL", (String) null, hq1.a(), Integer.valueOf(z ? 2 : 1), (String) null, (String) null, hq1 instanceof fq1, 50);
    }
}
