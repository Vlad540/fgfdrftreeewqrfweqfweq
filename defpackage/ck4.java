package defpackage;

/* renamed from: ck4  reason: default package */
public final class ck4 {
    public static final /* synthetic */ k77[] h;
    public static final String i;
    public final nj4 a;
    public final nj4 b;
    public final nj4 c;
    public final nj4 d;
    public final nj4 e;
    public final nj4 f;
    public final nj4 g;

    static {
        Class<ck4> cls = ck4.class;
        k77 khb = new khb(cls, "chatController", "getChatController()Lru/ok/tamtam/chats/ChatController;", 0);
        n7c n7c = m7c.a;
        h = new k77[]{khb, wn6.e(n7c, cls, "contactController", "getContactController()Lru/ok/tamtam/contacts/ContactController;", 0), wn6.f(cls, "draftSerializer", "getDraftSerializer()Lru/ok/tamtam/draft/DraftSerializer;", 0, n7c), wn6.f(cls, "messageController", "getMessageController()Lru/ok/tamtam/messages/MessageController;", 0, n7c), wn6.f(cls, "api", "getApi()Lru/ok/tamtam/api/Api;", 0, n7c), wn6.f(cls, "tamTamObservables", "getTamTamObservables()Lru/ok/tamtam/rx/TamTamObservables;", 0, n7c), wn6.f(cls, "ioNetworkScheduler", "getIoNetworkScheduler()Lio/reactivex/rxjava3/core/Scheduler;", 0, n7c)};
        i = cls.getName();
    }

    public ck4(nj4 nj4, nj4 nj42, nj4 nj43, nj4 nj44, nj4 nj45, nj4 nj46, nj4 nj47) {
        this.a = nj4;
        this.b = nj42;
        this.c = nj43;
        this.d = nj44;
        this.e = nj45;
        this.f = nj46;
        this.g = nj47;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        if (((defpackage.to8) r4.get()).e(r6, r8.longValue()) == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (((defpackage.to8) r4.get()).e(r6, r8.longValue()) == false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Long r13, java.lang.Long r14, defpackage.nzc r15) {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "execute: chatId="
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = ", contactId="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ", serverDraft="
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = i
            udd.q(r1, r0)
            r0 = 0
            r2 = 1
            k77[] r3 = h
            r4 = 0
            if (r13 == 0) goto L_0x0040
            long r6 = r13.longValue()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0040
            t52 r14 = r12.b()
            long r6 = r13.longValue()
            i22 r13 = r14.y(r6)
            goto L_0x0093
        L_0x0040:
            if (r14 == 0) goto L_0x0092
            long r6 = r14.longValue()
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0092
            r13 = r3[r2]
            nj4 r13 = r12.b
            java.lang.Object r13 = r13.get()
            di3 r13 = (defpackage.di3) r13
            long r6 = r14.longValue()
            r8 = 0
            tf3 r13 = r13.i(r6, r8)
            if (r13 == 0) goto L_0x006a
            boolean r13 = r13.s()
            if (r13 == 0) goto L_0x006a
            java.lang.String r13 = "contact is blocked"
            udd.q(r1, r13)
        L_0x006a:
            t52 r13 = r12.b()
            long r6 = r14.longValue()
            i22 r13 = r13.E(r6)
            if (r13 == 0) goto L_0x007e
            boolean r6 = r13.A()
            if (r6 != 0) goto L_0x0093
        L_0x007e:
            java.lang.String r13 = "No dialog on device. Create it"
            udd.q(r1, r13)
            t52 r13 = r12.b()
            java.util.List r14 = java.util.Collections.singletonList(r14)
            n62 r6 = defpackage.n62.a
            i22 r13 = r13.b(r6, r14, r0, r0)
            goto L_0x0093
        L_0x0092:
            r13 = r0
        L_0x0093:
            if (r13 != 0) goto L_0x009b
            java.lang.String r12 = "Chat is null. Ignore"
            udd.U(r1, r12)
            return
        L_0x009b:
            o62 r14 = r13.b
            j4a r6 = r14.f0
            if (r6 == 0) goto L_0x00ab
            java.lang.Long r6 = r6.b()
            if (r6 == 0) goto L_0x00ab
            long r4 = r6.longValue()
        L_0x00ab:
            long r6 = r15.g
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
            java.lang.String r12 = "We already have this draft. Ignore"
            udd.U(r1, r12)
            return
        L_0x00b7:
            long r4 = r14.g0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x00c7
            j4a r4 = r14.f0
            if (r4 != 0) goto L_0x00c7
            java.lang.String r12 = "draft was discarded, ignore it!"
            udd.U(r1, r12)
            return
        L_0x00c7:
            nj4 r4 = r12.d
            r5 = 3
            long r6 = r13.a
            java.lang.Long r8 = r15.f
            if (r8 == 0) goto L_0x00e4
            r9 = r3[r5]
            java.lang.Object r9 = r4.get()
            to8 r9 = (defpackage.to8) r9
            long r10 = r8.longValue()
            boolean r9 = r9.e(r6, r10)
            if (r9 != 0) goto L_0x00e4
        L_0x00e2:
            r0 = r8
            goto L_0x00fb
        L_0x00e4:
            java.lang.Long r8 = r15.e
            if (r8 == 0) goto L_0x00fb
            r5 = r3[r5]
            java.lang.Object r4 = r4.get()
            to8 r4 = (defpackage.to8) r4
            long r9 = r8.longValue()
            boolean r4 = r4.e(r6, r9)
            if (r4 != 0) goto L_0x00fb
            goto L_0x00e2
        L_0x00fb:
            if (r0 != 0) goto L_0x0101
            r12.c(r13, r15)
            return
        L_0x0101:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Don't have message "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = ". Request it"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            udd.U(r1, r4)
            r1 = 4
            r1 = r3[r1]
            nj4 r1 = r12.e
            java.lang.Object r1 = r1.get()
            pk r1 = (defpackage.pk) r1
            pn2 r4 = new pn2
            java.util.List r0 = java.util.Collections.singletonList(r0)
            long r5 = r14.a
            r4.<init>((long) r5, (java.util.List) r0)
            r14 = 6
            r14 = r3[r14]
            nj4 r14 = r12.g
            java.lang.Object r14 = r14.get()
            qmc r14 = (qmc) r14
            gy9 r1 = (defpackage.gy9) r1
            yhd r14 = r1.L(r4, r14)
            mb1 r0 = new mb1
            java.lang.Class<kt> r1 = defpackage.kt.class
            r4 = 13
            r0.<init>(r4, r1)
            phd r14 = r14.h(r0)
            r0 = 5
            r0 = r3[r0]
            nj4 r0 = r12.f
            java.lang.Object r0 = r0.get()
            lce r0 = (defpackage.lce) r0
            r0.getClass()
            ice r1 = new ice
            r3 = 0
            r1.<init>(r0, r2, r3)
            ho5 r14 = r14.j(r1)
            ul7 r0 = new ul7
            r0.<init>(r12, r13, r15)
            jg8 r1 = new jg8
            r2 = 7
            r1.<init>(r12, r13, r15, r2)
            pn1 r12 = new pn1
            r13 = 2
            r12.<init>(r0, r13, r1)
            r14.k(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck4.a(java.lang.Long, java.lang.Long, nzc):void");
    }

    public final t52 b() {
        k77 k77 = h[0];
        return (t52) this.a.get();
    }

    public final void c(i22 i22, nzc nzc) {
        udd.q(i, "Save server draft");
        k77 k77 = h[2];
        b().k(i22.a, nzc.g, ((dm4) this.c.get()).b(i22.a, nzc));
    }
}
