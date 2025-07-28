package defpackage;

/* renamed from: q6b  reason: default package */
public final class q6b implements z24 {
    public final /* synthetic */ int a;
    public final t97 b;
    public final g34 c;

    public q6b(int i, t97 t97) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = t97;
                this.c = jb2.b;
                return;
            default:
                this.b = t97;
                this.c = s6b.b;
                return;
        }
    }

    public final g34 a() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0209  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j34 b(java.lang.String r18, c34 r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r0 = r17
            r2 = r19
            r3 = r20
            r1 = 7
            r4 = 6
            t97 r5 = r0.b
            r6 = 0
            java.lang.String r7 = "chat_id"
            r8 = 0
            g34 r9 = r0.c
            int r10 = r0.a
            switch(r10) {
                case 0: goto L_0x00a0;
                default: goto L_0x0015;
            }
        L_0x0015:
            jb2 r9 = (jb2) r9
            java.util.LinkedHashSet r0 = r9.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0021
            goto L_0x0093
        L_0x0021:
            c34 r0 = jb2.c
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0094
            long r9 = defpackage.x87.E0(r7, r3)
            java.lang.String r0 = "attach_id"
            java.lang.String r11 = defpackage.x87.G0(r0, r3)
            java.lang.String r0 = "msg_id"
            long r12 = defpackage.x87.E0(r0, r3)
            java.lang.String r0 = "single"
            java.lang.Boolean r0 = defpackage.x87.s0(r0, r3)
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.booleanValue()
            r14 = r0
            goto L_0x0048
        L_0x0047:
            r14 = r6
        L_0x0048:
            java.lang.String r0 = "desc"
            java.lang.Boolean r0 = defpackage.x87.s0(r0, r3)
            if (r0 == 0) goto L_0x0054
            boolean r6 = r0.booleanValue()
        L_0x0054:
            r15 = r6
            ib2 r6 = new ib2
            r8 = r6
            r8.<init>(r9, r11, r12, r14, r15)
            java.lang.Object r0 = r5.getValue()
            jb5 r0 = (defpackage.jb5) r0
            kb5 r0 = (defpackage.kb5) r0
            boolean r0 = r0.t()
            if (r0 == 0) goto L_0x007e
            h34 r0 = new h34
            p22 r1 = new p22
            r4 = 11
            r1.<init>(r4)
            p22 r4 = new p22
            r5 = 12
            r4.<init>(r5)
            r0.<init>(r1, r4)
        L_0x007c:
            r5 = r0
            goto L_0x0084
        L_0x007e:
            h34 r0 = new h34
            r0.<init>()
            goto L_0x007c
        L_0x0084:
            j34 r8 = new j34
            r7 = 8
            r4 = 0
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0093:
            return r8
        L_0x0094:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unknown route "
            java.lang.String r1 = hr1.f(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x00a0:
            s6b r9 = (defpackage.s6b) r9
            java.util.LinkedHashSet r9 = r9.a
            boolean r9 = r9.contains(r2)
            if (r9 != 0) goto L_0x00ac
            goto L_0x0247
        L_0x00ac:
            s6b r9 = defpackage.s6b.b
            r9.getClass()
            c34 r9 = defpackage.s6b.c
            boolean r9 = r2.equals(r9)
            java.lang.String r10 = "type"
            java.lang.String r11 = "id"
            if (r9 == 0) goto L_0x00ec
            y76 r7 = defpackage.r6b.b
            java.lang.String r8 = defpackage.x87.G0(r10, r3)
            r7.getClass()
            r6b r7 = defpackage.y76.p(r8)
            long r8 = defpackage.x87.E0(r11, r3)
            r6b r10 = defpackage.r6b.CONTACT
            if (r7 != r10) goto L_0x00e3
            java.lang.Object r10 = r5.getValue()
            jb5 r10 = (defpackage.jb5) r10
            kb5 r10 = (defpackage.kb5) r10
            r10.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r11 = ru.ok.tamtam.android.prefs.PmsKey.f7avatarsscreenenabled
            boolean r6 = r10.m(r11, r6)
        L_0x00e3:
            m6b r10 = new m6b
            r10.<init>((defpackage.r6b) r7, (defpackage.q6b) r0, (long) r8)
        L_0x00e8:
            r0 = r6
            r6 = r10
            goto L_0x01e8
        L_0x00ec:
            c34 r0 = defpackage.s6b.d
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0149
            long r7 = defpackage.x87.E0(r11, r3)
            java.lang.String r0 = defpackage.x87.G0(r10, r3)
            int r9 = r0.hashCode()
            r10 = -759091500(0xffffffffd2c12ed4, float:-4.14857167E11)
            if (r9 == r10) goto L_0x0128
            r10 = 951526432(0x38b72420, float:8.732849E-5)
            if (r9 == r10) goto L_0x011c
            r10 = 1303205804(0x4dad57ac, float:3.63525504E8)
            if (r9 == r10) goto L_0x0110
            goto L_0x0130
        L_0x0110:
            java.lang.String r9 = "local_chat"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0119
            goto L_0x0130
        L_0x0119:
            r6b r0 = defpackage.r6b.LOCAL_CHAT
            goto L_0x0135
        L_0x011c:
            java.lang.String r9 = "contact"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0125
            goto L_0x0130
        L_0x0125:
            r6b r0 = defpackage.r6b.CONTACT
            goto L_0x0135
        L_0x0128:
            java.lang.String r9 = "server_chat"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0133
        L_0x0130:
            r6b r0 = defpackage.r6b.LOCAL_CHAT
            goto L_0x0135
        L_0x0133:
            r6b r0 = defpackage.r6b.SERVER_CHAT
        L_0x0135:
            java.lang.String r9 = "is_opened_from_dialog"
            java.lang.Boolean r9 = defpackage.x87.s0(r9, r3)
            if (r9 == 0) goto L_0x0142
            boolean r9 = r9.booleanValue()
            goto L_0x0143
        L_0x0142:
            r9 = r6
        L_0x0143:
            n6b r10 = new n6b
            r10.<init>(r7, r0, r9)
            goto L_0x00e8
        L_0x0149:
            c34 r0 = defpackage.s6b.e
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0162
            long r7 = defpackage.x87.E0(r11, r3)
            q63 r0 = new q63
            r9 = 4
            r0.<init>(r7, r9)
        L_0x015b:
            r16 = r6
            r6 = r0
            r0 = r16
            goto L_0x01e8
        L_0x0162:
            c34 r0 = defpackage.s6b.f
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0190
            long r7 = defpackage.x87.E0(r11, r3)
            java.lang.String r0 = defpackage.x87.G0(r10, r3)
            ch2 r9 = defpackage.ch2.MEMBER
            java.lang.String r10 = "BLOCKED_MEMBER"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L_0x0188
            java.lang.String r10 = "ADMIN"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0185
            goto L_0x018a
        L_0x0185:
            ch2 r9 = defpackage.ch2.ADMIN
            goto L_0x018a
        L_0x0188:
            ch2 r9 = defpackage.ch2.BLOCKED_MEMBER
        L_0x018a:
            o6b r0 = new o6b
            r0.<init>(r7, r9)
            goto L_0x015b
        L_0x0190:
            c34 r0 = defpackage.s6b.g
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01a3
            long r7 = defpackage.x87.E0(r11, r3)
            q63 r0 = new q63
            r9 = 5
            r0.<init>(r7, r9)
            goto L_0x015b
        L_0x01a3:
            c34 r0 = defpackage.s6b.h
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01b5
            long r7 = defpackage.x87.E0(r7, r3)
            q63 r0 = new q63
            r0.<init>(r7, r4)
            goto L_0x015b
        L_0x01b5:
            c34 r0 = defpackage.s6b.i
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01c7
            long r7 = defpackage.x87.E0(r7, r3)
            q63 r0 = new q63
            r0.<init>(r7, r1)
            goto L_0x015b
        L_0x01c7:
            c34 r0 = defpackage.s6b.j
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x021f
            long r7 = defpackage.x87.E0(r7, r3)
            java.lang.String r0 = "leave_chat"
            java.lang.Boolean r0 = defpackage.x87.s0(r0, r3)
            if (r0 == 0) goto L_0x01e0
            boolean r0 = r0.booleanValue()
            goto L_0x01e1
        L_0x01e0:
            r0 = r6
        L_0x01e1:
            p6b r9 = new p6b
            r9.<init>(r7, r0)
            r0 = r6
            r6 = r9
        L_0x01e8:
            if (r0 == 0) goto L_0x0209
            java.lang.Object r0 = r5.getValue()
            jb5 r0 = (defpackage.jb5) r0
            kb5 r0 = (defpackage.kb5) r0
            boolean r0 = r0.t()
            if (r0 == 0) goto L_0x0209
            h34 r0 = new h34
            k6b r5 = new k6b
            r5.<init>(r4)
            k6b r4 = new k6b
            r4.<init>(r1)
            r0.<init>(r5, r4)
        L_0x0207:
            r5 = r0
            goto L_0x020f
        L_0x0209:
            h34 r0 = new h34
            r0.<init>()
            goto L_0x0207
        L_0x020f:
            j34 r8 = new j34
            r7 = 8
            r4 = 0
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0247
        L_0x021f:
            java.lang.Class<q6b> r0 = defpackage.q6b.class
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "invalid route "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            udd.s(r0, r1, r4)
        L_0x0247:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q6b.b(java.lang.String, c34, android.os.Bundle):j34");
    }
}
