package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: qa2  reason: default package */
public final class qa2 extends ol implements qce, tna {
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;
    public final boolean w0;
    public final boolean x0;
    public final String y0 = qa2.class.getName();

    public qa2(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
        this.w0 = z2;
        this.x0 = z3;
    }

    public final void c(lbe lbe) {
        xm8 xm8;
        ra2 ra2 = (ra2) lbe;
        i22 y = m().y(this.o);
        if (ra2.c < this.X && !this.Z) {
            udd.q(this.y0, "onSuccess, received read mark less than our read mark");
        } else if (y != null) {
            m().p0(y.a, ((j2b) r()).a.s(), ra2.c, ra2.o, true);
        }
        if (y != null && ra2.o > 0 && (xm8 = y.c) != null) {
            vo8 vo8 = xm8.a;
            if (vo8.o == ra2.c) {
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                o62 o62 = y.b;
                j92.a((j92) plVar.J.getValue(), y.a, o62.a, vo8.o, 0, md4.REGULAR);
                ((gy9) j()).j(o62.a);
            }
        }
    }

    public final void d(uae uae) {
        l().c(new jh0(this.a, uae));
        if (!iu7.F(uae.b)) {
            f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        if ((java.lang.System.currentTimeMillis() - r8) < (r0.o(ru.ok.tamtam.android.prefs.PmsKey.f106setunreadtimeout, 31536000) * 1000)) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r15 = this;
            t52 r0 = r15.m()
            long r1 = r15.o
            i22 r0 = r0.y(r1)
            java.lang.String r3 = r15.y0
            r4 = 3
            if (r0 != 0) goto L_0x0030
            boolean r15 = r15.w0
            if (r15 == 0) goto L_0x0022
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r0 = "onPreExecute: awaiting chatServerId=%d in cache"
            udd.p(r3, r0, r15)
            r15 = 2
            return r15
        L_0x0022:
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r0 = "onPreExecute: no chat by chatServerId=%d in cache"
            udd.t(r3, r0, r15)
            return r4
        L_0x0030:
            boolean r5 = r0.b0()
            if (r5 != 0) goto L_0x0044
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r0 = "onPreExecute: not participant of chat chatServerId=%d"
            udd.t(r3, r0, r15)
            return r4
        L_0x0044:
            long r5 = r15.X
            boolean r7 = r15.Z
            if (r7 == 0) goto L_0x00b3
            long r8 = r15.Y
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x006d
            to8 r12 = r15.p()
            long r13 = r0.a
            vo8 r0 = r12.j(r13, r8)
            if (r0 == 0) goto L_0x006d
            ls8 r8 = defpackage.ls8.DELETED
            ls8 r9 = r0.z0
            if (r9 != r8) goto L_0x006a
            java.lang.String r15 = "onPreExecute: message deleted, remove task"
            udd.q(r3, r15)
            return r4
        L_0x006a:
            long r8 = r0.o
            goto L_0x006e
        L_0x006d:
            r8 = r10
        L_0x006e:
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            r8 = r5
        L_0x0073:
            pl r0 = r15.c
            if (r0 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            t97 r0 = r0.I
            java.lang.Object r0 = r0.getValue()
            m0c r0 = (defpackage.m0c) r0
            r0.getClass()
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ad
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r8
            t97 r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            g2b r0 = (defpackage.g2b) r0
            j2b r0 = (defpackage.j2b) r0
            yzc r0 = r0.b
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.f106setunreadtimeout
            r12 = 31536000(0x1e13380, double:1.5580854E-316)
            long r8 = r0.o(r8, r12)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r12
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ad
            goto L_0x00b3
        L_0x00ad:
            java.lang.String r15 = "onPreExecute: timeout expired, remove task"
            udd.q(r3, r15)
            return r4
        L_0x00b3:
            jee r0 = r15.t()
            una r3 = defpackage.una.TYPE_CHAT_MARK
            long r8 = r15.a
            java.util.List r15 = r0.h(r8, r3)
            if (r7 == 0) goto L_0x00e0
            java.util.Iterator r15 = r15.iterator()
        L_0x00c5:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r15.next()
            zde r0 = (defpackage.zde) r0
            tna r0 = r0.f
            qa2 r0 = (defpackage.qa2) r0
            long r5 = r0.o
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00c5
            boolean r0 = r0.Z
            if (r0 == 0) goto L_0x00c5
            return r4
        L_0x00e0:
            java.util.Iterator r15 = r15.iterator()
        L_0x00e4:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r15.next()
            zde r0 = (defpackage.zde) r0
            tna r0 = r0.f
            qa2 r0 = (defpackage.qa2) r0
            long r7 = r0.o
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00e4
            boolean r3 = r0.Z
            if (r3 != 0) goto L_0x00e4
            long r7 = r0.X
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e4
            return r4
        L_0x0105:
            r15 = 1
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa2.e():int");
    }

    public final void f() {
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.ChatMark chatMark = new Tasks.ChatMark();
        chatMark.requestId = this.a;
        chatMark.chatId = 0;
        chatMark.chatServerId = this.o;
        chatMark.mark = this.X;
        chatMark.messageId = this.Y;
        chatMark.setAsUnread = this.Z;
        chatMark.awaitChatInCache = this.w0;
        chatMark.isReadReaction = this.x0;
        return gr8.toByteArray(chatMark);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_MARK;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 24);
        dtVar.n(this.o, ApiProtocol.PARAM_CHAT_ID);
        dtVar.n(this.X, "mark");
        long j = this.Y;
        if (j != -1) {
            dtVar.n(j, "messageId");
        }
        dtVar.s("type", this.Z ? "SET_AS_UNREAD" : this.x0 ? "READ_REACTION" : "READ_MESSAGE");
        return dtVar;
    }
}
