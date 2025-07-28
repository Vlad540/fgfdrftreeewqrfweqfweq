package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

/* renamed from: hb5  reason: default package */
public final class hb5 {
    public final String a = "mc";
    public final String b = "msgid";
    public final String c = "type";
    public final String d = "ConversationReadOnOtherDevice";
    public final String e = "trid";
    public final String f = "ctime";
    public final String g = "ttime";
    public final String h = "eKey";
    public final String i = "suid";
    public final String j = "largeImageUrl";
    public final String k = "fireM";
    public final String l = "err";
    public final u16 m;

    public hb5() {
        t13 t13 = new t13(19);
        this.m = t13;
    }

    public final oa5 a(yr yrVar, long j2, long j3) {
        yr yrVar2 = yrVar;
        String str = (String) yrVar2.get(this.e);
        long parseLong = str != null ? Long.parseLong(str) : 0;
        long parseLong2 = Long.parseLong((String) ju7.Q(yrVar2, this.a));
        long parseLong3 = Long.parseLong((String) ju7.Q(yrVar2, this.b));
        String str2 = (String) yrVar2.get(this.i);
        Long l2 = str2 != null ? (Long) this.m.invoke(Long.valueOf(Long.parseLong(str2))) : null;
        Iterator it = yrVar.entrySet().iterator();
        long j4 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Charset charset = e22.a;
            j4 = ((long) ((String) entry.getKey()).getBytes(charset).length) + ((long) ((String) entry.getValue()).getBytes(charset).length) + j4;
        }
        String str3 = (String) yrVar2.get(this.g);
        Long valueOf = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
        String str4 = (String) yrVar2.get(this.h);
        String str5 = (String) yrVar2.get(this.c);
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str5;
        long c2 = c(yrVar2, Long.MAX_VALUE);
        String str7 = (String) yrVar2.get(this.f);
        return new oa5(parseLong, parseLong2, parseLong3, 2, l2, j4, valueOf, str4, j2, j3, str6, c2, str7 != null ? Long.parseLong(str7) : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.cb5 b(yr r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.lang.String r2 = "gc"
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0011
            gb5 r2 = defpackage.gb5.GROUP_CHAT
        L_0x000f:
            r9 = r2
            goto L_0x002c
        L_0x0011:
            gb5[] r2 = defpackage.gb5.b
            java.lang.String r2 = r0.c
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0026
            java.lang.CharSequence r2 = h0e.B0(r2)
            java.lang.String r2 = r2.toString()
            goto L_0x0027
        L_0x0026:
            r2 = r3
        L_0x0027:
            gb5 r2 = udd.x(r2)
            goto L_0x000f
        L_0x002c:
            gb5 r2 = defpackage.gb5.GROUP_CHAT
            r4 = 1
            r5 = 0
            if (r9 != r2) goto L_0x0034
            r2 = r4
            goto L_0x0035
        L_0x0034:
            r2 = r5
        L_0x0035:
            r2 = r2 ^ r4
            java.lang.String r4 = r0.a
            java.lang.Object r4 = ju7.Q(r1, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0139
            long r6 = java.lang.Long.parseLong(r4)
            cb5 r23 = new cb5
            java.lang.String r4 = r0.b
            java.lang.Object r4 = ju7.Q(r1, r4)
            java.lang.String r4 = (java.lang.String) r4
            long r10 = java.lang.Long.parseLong(r4)
            java.lang.String r4 = "title"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r8 = ""
            if (r4 == 0) goto L_0x006b
            java.lang.CharSequence r4 = h0e.B0(r4)
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r12 = r4
            goto L_0x006c
        L_0x006b:
            r12 = r8
        L_0x006c:
            if (r2 == 0) goto L_0x0087
            java.lang.String r4 = "userName"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0085
            java.lang.CharSequence r4 = h0e.B0(r4)
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r13 = r4
            goto L_0x0088
        L_0x0085:
            r13 = r8
            goto L_0x0088
        L_0x0087:
            r13 = r3
        L_0x0088:
            r14 = 0
            if (r2 == 0) goto L_0x00ae
            java.lang.String r2 = r0.i
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00a7
            long r2 = java.lang.Long.parseLong(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            u16 r3 = r0.m
            java.lang.Object r2 = r3.invoke(r2)
            r3 = r2
            java.lang.Long r3 = (java.lang.Long) r3
        L_0x00a7:
            if (r3 == 0) goto L_0x00ae
            long r2 = r3.longValue()
            goto L_0x00af
        L_0x00ae:
            r2 = r14
        L_0x00af:
            long r16 = r0.c(r1, r14)
            java.lang.String r4 = "msg"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00cb
            java.lang.CharSequence r4 = h0e.B0(r4)
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x00c8
            goto L_0x00cb
        L_0x00c8:
            r18 = r4
            goto L_0x00cd
        L_0x00cb:
            r18 = r8
        L_0x00cd:
            java.lang.String r4 = r0.e
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00db
            long r14 = java.lang.Long.parseLong(r4)
        L_0x00db:
            r19 = r14
            java.lang.String r4 = r0.h
            java.lang.Object r4 = r1.get(r4)
            r21 = r4
            java.lang.String r21 = (java.lang.String) r21
            java.lang.String r4 = r0.j
            java.lang.Object r4 = r1.get(r4)
            r22 = r4
            java.lang.String r22 = (java.lang.String) r22
            java.lang.String r4 = r0.k
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0108
            java.lang.Boolean r4 = h0e.A0(r4)
            if (r4 == 0) goto L_0x0108
            boolean r4 = r4.booleanValue()
            r24 = r4
            goto L_0x010a
        L_0x0108:
            r24 = r5
        L_0x010a:
            java.lang.String r0 = r0.l
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x011f
            java.lang.Boolean r0 = h0e.A0(r0)
            if (r0 == 0) goto L_0x011f
            boolean r0 = r0.booleanValue()
            goto L_0x0120
        L_0x011f:
            r0 = r5
        L_0x0120:
            r4 = r23
            r5 = r6
            r7 = r10
            r10 = r12
            r11 = r13
            r12 = r2
            r14 = r16
            r16 = r18
            r17 = r19
            r19 = r21
            r20 = r22
            r21 = r24
            r22 = r0
            r4.<init>(r5, r7, r9, r10, r11, r12, r14, r16, r17, r19, r20, r21, r22)
            return r23
        L_0x0139:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb5.b(yr):cb5");
    }

    public final long c(yr yrVar, long j2) {
        if (yrVar.containsKey("ectime")) {
            String str = (String) yrVar.get("ectime");
            if (str != null) {
                return Long.parseLong(str);
            }
            return 0;
        }
        String str2 = this.f;
        if (!yrVar.containsKey(str2)) {
            return j2;
        }
        String str3 = (String) yrVar.get(str2);
        return (str3 != null ? Long.parseLong(str3) : 500) - ((long) 500);
    }
}
