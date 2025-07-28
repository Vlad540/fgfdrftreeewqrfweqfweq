package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: d99  reason: default package */
public final class d99 extends ol implements qce, tna {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final boolean w0;
    public final long x0;

    public d99(long j, long j2, long j3, long j4, long j5, boolean z, long j6) {
        super(j);
        this.Y = j4;
        this.Z = j5;
        this.o = j3;
        this.X = j2;
        this.w0 = z;
        this.x0 = j6;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [wga, java.lang.Object] */
    public static xga v(vo8 vo8) {
        int i;
        zga zga = null;
        zy f = !vo8.o() ? fu7.f(vo8.D0) : null;
        if (vo8.G0 != null) {
            int i2 = 2;
            int i3 = vo8.E0;
            if (i3 != 1) {
                if (i3 != 2) {
                    i = 1;
                    zga = new zga(i, vo8.N0, vo8.O0);
                } else {
                    i2 = 3;
                }
            }
            i = i2;
            zga = new zga(i, vo8.N0, vo8.O0);
        }
        ArrayList v = fu7.v(vo8.V0);
        ? obj = new Object();
        obj.a = vo8.Z;
        obj.b = vo8.w0;
        obj.c = f;
        obj.d = zga;
        obj.e = vo8.K0;
        obj.f = vo8.Q0;
        obj.h = v;
        obj.i = vo8.X0;
        return obj.a();
    }

    public static d99 x(byte[] bArr) {
        try {
            Tasks.MsgSend mergeFrom = gr8.mergeFrom(new Tasks.MsgSend(), bArr);
            return new d99(mergeFrom.requestId, mergeFrom.messageId, mergeFrom.chatId, mergeFrom.chatServerId, mergeFrom.userId, mergeFrom.notify, mergeFrom.lastKnownDraftTime);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }

    public final void A(long j, long j2) {
        if (j != 0) {
            ((eha) this.c.y.getValue()).getClass();
            eha.b(j, j2);
        }
    }

    public final void c(lbe lbe) {
        ls8 ls8;
        g99 g99 = (g99) lbe;
        udd.q("MsgSendApiTask", "onSuccess");
        vo8 q = this.c.d().q(this.X);
        ym8 ym8 = g99.o;
        if (ym8 == null || q == null || ym8.H0 != null || !q.n()) {
            if (q != null && !q.n()) {
                A(g99.c, this.X);
            }
            if (q != null && q.z0 == (ls8 = ls8.DELETED) && q.c == 0) {
                to8 d = this.c.d();
                ym8 ym82 = g99.o;
                long j = this.o;
                s59 s59 = bp8.b;
                ((hz3) d.a).c.o(ym82, j, false, ls8);
                ((gy9) this.c.a()).C(this.o, this.Y, Collections.singletonList(Long.valueOf(q.b)), Collections.singletonList(Long.valueOf(g99.o.a)), (j63) null, false, q.n() ? md4.DELAYED : md4.REGULAR);
                udd.q("MsgSendApiTask", "onSuccess: sent api request for deletion locally deleted message");
            } else if (q == null || !q.v()) {
                ((i99) this.c.A.getValue()).a(this.o, g99.c, g99.o);
            } else {
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    tn7 tn7 = tn7.o;
                    fn6.d(tn7, "MsgSendApiTask", "onSuccessControlMessage, messageDb.event = " + q.f().a, (Throwable) null);
                }
                if (q.f().a.ordinal() == 1) {
                    ArrayList arrayList = q.f().c;
                    List list = ((gr3) g99.o.w0.get(0)).Y;
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    arrayList2.removeAll(list);
                    if (!arrayList2.isEmpty()) {
                        this.c.b().c(new a4b(q.x0, arrayList2));
                    }
                }
                ((i99) this.c.A.getValue()).a(this.o, g99.c, g99.o);
                ((gy9) this.c.a()).j(g99.c);
            }
        } else {
            udd.S("MsgSendApiTask", "look's like delayed attrs is not supported!", new IllegalStateException("receive message without delayed attrs but send as delayed"));
            to8 d2 = this.c.d();
            long j2 = q.b;
            d2.getClass();
            udd.p("to8", "clearDelayedAttrs %d", new Object[]{Long.valueOf(j2)});
            ((hz3) d2.a).c.q(j2, (Long) null, (Boolean) null);
            d2.f.c.remove(Long.valueOf(j2));
            ((i99) this.c.A.getValue()).a(this.o, g99.c, g99.o);
            this.c.b().c(new wt(4));
        }
    }

    public final void d(uae uae) {
        long j;
        long j2;
        long j3;
        tf3 k;
        md4 md4;
        jj7 jj7;
        long j4;
        long j5;
        uae uae2 = uae;
        udd.o("MsgSendApiTask", "onFail", uae2.X);
        to8 d = this.c.d();
        long j6 = this.X;
        vo8 q = d.q(j6);
        if (q != null) {
            t52 c = this.c.c();
            long j7 = this.o;
            i22 B = c.B(j7);
            long j8 = B != null ? B.b.a : 0;
            cw8 d2 = ((hz3) this.c.d().a).c.d();
            aec aec = d2.a;
            aec.b();
            yv8 yv8 = d2.h;
            yz5 f = yv8.f();
            String str = uae2.b;
            f.f(1, str);
            f.j(2, j6);
            try {
                aec.c();
                f.n();
                aec.r();
                aec.l();
                yv8.u(f);
                to8 d3 = this.c.d();
                String str2 = uae2.o;
                if (str2 == null) {
                    str2 = "";
                }
                cw8 d4 = ((hz3) d3.a).c.d();
                aec aec2 = d4.a;
                aec2.b();
                th thVar = d4.i;
                yz5 f2 = thVar.f();
                f2.f(1, str2);
                f2.j(2, j6);
                try {
                    aec2.c();
                    f2.n();
                    aec2.r();
                    aec2.l();
                    thVar.u(f2);
                    boolean F = iu7.F(str);
                    long j9 = this.a;
                    long j10 = q.b;
                    if (!F) {
                        boolean v = q.v();
                        md4 md42 = q.Y0;
                        j = j9;
                        long j11 = j6;
                        long j12 = this.Y;
                        if (!v) {
                            int i = 0;
                            if ("not.found".equals(str) || "user.not.found".equals(str)) {
                                j2 = j10;
                                j3 = j7;
                                long j13 = j11;
                                u(q);
                                i22 B2 = this.c.c().B(j3);
                                if (!(B2 == null || (k = B2.k()) == null)) {
                                    ((di3) this.c.k.getValue()).o(k.n());
                                    this.c.b().c(new mw2(Collections.singletonList(Long.valueOf(j3)), true));
                                }
                                A(j8, j13);
                            } else if ("privacy.restricted".equals(str)) {
                                udd.s("MsgSendApiTask", "onFailPrivacyRestricted, message send to dialog, chatId = " + q.x0, (Throwable) null);
                                u(q);
                                a4b a4b = new a4b(j7, Collections.singletonList(Long.valueOf(this.Z)));
                                this.c.b().c(a4b);
                                ((gy9) this.c.a()).j(j12);
                                this.c.b().c(new mw2(Collections.singletonList(Long.valueOf(j7)), true, false, md4.REGULAR, a4b, 96));
                                A(j8, j11);
                            } else {
                                long j14 = j11;
                                if ("error.phone.binding.required".equals(str)) {
                                    w(q);
                                    A(j8, j14);
                                } else {
                                    if (("video.not.found".equalsIgnoreCase(str) || "photo.not.found".equalsIgnoreCase(str) || "file.not.found".equalsIgnoreCase(str) || "sticker.not.found".equalsIgnoreCase(str)) && (jj7 = q.D0) != null && jj7.v() > 0 && jj7.v() != 0) {
                                        md4 = md42;
                                        while (true) {
                                            if (i >= jj7.v()) {
                                                if (y(q)) {
                                                    for (int i2 = 0; i2 < jj7.v(); i2++) {
                                                        o10 u = jj7.u(i2);
                                                        this.c.d().v(j10, u.q, new ss8(6, (Object) u));
                                                    }
                                                    ((luf) this.c.g.getValue()).a(new u0d(j7, j14));
                                                    j5 = j;
                                                    this.c.e().d(j5);
                                                    j2 = j10;
                                                    j4 = j7;
                                                } else {
                                                    j5 = j;
                                                    u(q);
                                                    j2 = j10;
                                                    j4 = j7;
                                                    this.c.b().c(new h99(this.a, uae, this.o));
                                                    A(j12, j14);
                                                }
                                                long j15 = j5;
                                                j3 = j4;
                                                j = j15;
                                            } else if (r1g.p(jj7.u(i).r)) {
                                                break;
                                            } else {
                                                i++;
                                            }
                                        }
                                    } else {
                                        md4 = md42;
                                    }
                                    j2 = j10;
                                    long j16 = j;
                                    long j17 = j7;
                                    long j18 = j14;
                                    if ("attachment.not.ready".equals(str)) {
                                        z(q, j8);
                                        ((w10) this.c.B.getValue()).b(q);
                                        j3 = j17;
                                    } else if ("android.empty.message.and.attach".equals(str)) {
                                        try {
                                            y(q);
                                        } catch (Throwable unused) {
                                        }
                                        A(j8, j18);
                                        j3 = j17;
                                        ((hz3) this.c.d().a).c.d().o(j3, Collections.singletonList(Long.valueOf(j18)), ls8.DELETED);
                                        tt0 b = this.c.b();
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(Long.valueOf(j2));
                                        b.c(new l89(this.o, arrayList, md4));
                                        this.c.e().d(j16);
                                    } else {
                                        j3 = j17;
                                        u(q);
                                        tt0 b2 = this.c.b();
                                        j = j16;
                                        h99 h99 = r1;
                                        h99 h992 = new h99(this.a, uae, this.o);
                                        b2.c(h99);
                                        A(j8, j18);
                                    }
                                    j = j16;
                                }
                            }
                        } else if ("error.phone.binding.required".equals(str)) {
                            w(q);
                        } else {
                            udd.s("MsgSendApiTask", "onFailControlMessage, in event = " + q.f().a, (Throwable) null);
                            t52 c2 = this.c.c();
                            c2.getClass();
                            udd.q("t52", "deleteAndUpdateLastMessage, chatId = " + j7);
                            nj4 nj4 = c2.s;
                            to8 to8 = (to8) nj4.get();
                            to8.getClass();
                            to8.c(j7, Collections.singletonList(Long.valueOf(j10)));
                            c2.m.c(new l89(j7, Collections.singletonList(Long.valueOf(j10)), (md4) null));
                            c2.k0(j7, ((to8) nj4.get()).p(j7, md42), true);
                            ((gy9) this.c.a()).j(j12);
                            this.c.b().c(new mw2(Collections.singletonList(Long.valueOf(j7)), false));
                        }
                        j2 = j10;
                        j3 = j7;
                    } else {
                        j3 = j7;
                        j = j9;
                        j2 = j10;
                        z(q, j8);
                    }
                    this.c.b().c(new ove(j3, j2, 0));
                    this.c.b().c(new jh0(j, uae));
                } catch (Throwable th) {
                    thVar.u(f2);
                    throw th;
                }
            } catch (Throwable th2) {
                yv8.u(f);
                throw th2;
            }
        }
    }

    public final int e() {
        udd.q("MsgSendApiTask", "onPreExecute");
        vo8 q = this.c.d().q(this.X);
        i22 B = q != null ? this.c.c().B(q.x0) : this.c.c().B(this.o);
        long j = this.Y;
        if (j == 0 && B != null) {
            j = B.b.a;
        }
        ls8 ls8 = ls8.DELETED;
        if (q != null && q.z0 == ls8 && q.c == 0) {
            to8 d = this.c.d();
            long j2 = this.o;
            long j3 = this.X;
            d.getClass();
            d.c(j2, Collections.singletonList(Long.valueOf(j3)));
            A(j, this.X);
            return 3;
        } else if (q == null || q.z0 == ls8 || q.y0 == bp8.ERROR) {
            A(j, this.X);
            return 3;
        } else if (B == null) {
            ((g15) this.c.u.getValue()).c(new Exception("chat is null"), true);
            A(j, this.X);
            return 3;
        } else {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                Locale locale = Locale.ROOT;
                long j4 = B.a;
                long j5 = q.b;
                StringBuilder k = hr1.k(j4, "onPreExecute: chat = ", ", messageId = ");
                k.append(j5);
                k.append(", serverMessageId = ");
                k.append(q.c);
                fn6.d(tn7, "MsgSendApiTask", k.toString(), (Throwable) null);
            }
            if (!B.J() && B.b.a == 0 && (!q.v() || q.f().a != s00.b)) {
                return 2;
            }
            if (!((!q.o() && q.m()) ? w10.a(q.D0) : true)) {
                udd.q("MsgSendApiTask", "onPreExecute: attaches not ready, SKIP");
                return 2;
            }
            if (q.x()) {
                g10 g10 = q.a(j10.B0).n;
                if (g10.d() || g10.a()) {
                    return 2;
                }
            }
            xga v = v(q);
            zy zyVar = v.c;
            if ((zyVar != null && !zyVar.isEmpty()) || !r1g.p(v.b) || v.d != null) {
                return 1;
            }
            udd.p("MsgSendApiTask", "createRequest: empty outgoing message chatId = %s, messageId = %s", new Object[]{Long.valueOf(this.o), Long.valueOf(this.X)});
            d(new uae("android.empty.message.and.attach", "MsgSend with empty text and attaches", (String) null));
            return 3;
        }
    }

    public final void f() {
        vo8 q = this.c.d().q(this.X);
        if (q != null) {
            this.c.d().x(q, bp8.ERROR);
            this.c.b().c(new ove(q.x0, q.b));
        }
    }

    public final byte[] g() {
        Tasks.MsgSend msgSend = new Tasks.MsgSend();
        msgSend.requestId = this.a;
        msgSend.messageId = this.X;
        msgSend.chatId = this.o;
        long j = this.Y;
        if (j != 0) {
            msgSend.chatServerId = j;
        }
        long j2 = this.Z;
        if (j2 != 0) {
            msgSend.userId = j2;
        }
        msgSend.notify = this.w0;
        msgSend.lastKnownDraftTime = this.x0;
        return gr8.toByteArray(msgSend);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_MSG_SEND;
    }

    public final int h() {
        return 1000000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ibe i() {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = "MsgSendApiTask"
            java.lang.String r2 = "createRequest"
            udd.q(r1, r2)
            pl r2 = r0.c
            to8 r2 = r2.d()
            long r3 = r0.X
            vo8 r2 = r2.q(r3)
            r5 = 0
            if (r2 != 0) goto L_0x0022
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "messageDb is null"
            udd.I(r1, r2, r0)
            goto L_0x00ac
        L_0x0022:
            pl r6 = r0.c
            t52 r6 = r6.c()
            long r7 = r2.x0
            i22 r6 = r6.B(r7)
            long r7 = r0.Y
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0048
            if (r6 == 0) goto L_0x0048
            boolean r11 = r6.J()
            if (r11 != 0) goto L_0x0048
            o62 r11 = r6.b
            long r11 = r11.a
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0048
            r14 = r11
            goto L_0x0049
        L_0x0048:
            r14 = r7
        L_0x0049:
            if (r6 == 0) goto L_0x005a
            boolean r6 = r6.G()
            if (r6 == 0) goto L_0x005a
            boolean r6 = r0.w0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r19 = r6
            goto L_0x005c
        L_0x005a:
            r19 = r5
        L_0x005c:
            xga r2 = v(r2)
            zy r6 = r2.c
            if (r6 == 0) goto L_0x006a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x009c
        L_0x006a:
            java.lang.String r6 = r2.b
            boolean r6 = r1g.p(r6)
            if (r6 == 0) goto L_0x009c
            zga r6 = r2.d
            if (r6 == 0) goto L_0x0077
            goto L_0x009c
        L_0x0077:
            long r6 = r0.o
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "createRequest: empty outgoing message chatId = %s, messageId = %s"
            udd.p(r1, r3, r2)
            uae r1 = new uae
            java.lang.String r2 = "android.empty.message.and.attach"
            java.lang.String r3 = "MsgSend with empty text and attaches"
            r1.<init>(r2, r3, r5)
            r0.d(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x009c:
            pn2 r5 = new pn2
            long r3 = r0.Z
            long r0 = r0.x0
            r13 = r5
            r16 = r3
            r18 = r2
            r20 = r0
            r13.<init>(r14, r16, r18, r19, r20)
        L_0x00ac:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d99.i():ibe");
    }

    public final void u(vo8 vo8) {
        this.c.d().x(vo8, bp8.ERROR);
        this.c.c().k0(this.o, vo8, false);
        this.c.e().d(this.a);
    }

    public final void w(vo8 vo8) {
        udd.s("MsgSendApiTask", "onFailPhoneBindingRequired, message send to dialog, chatId = " + vo8.x0, (Throwable) null);
        u(vo8);
        this.c.b().c(new jh0(foa.c));
        ((gy9) this.c.a()).j(this.Y);
        this.c.b().c(new mw2(Collections.singletonList(Long.valueOf(this.o)), true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x000b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y(defpackage.vo8 r8) {
        /*
            r7 = this;
            jj7 r8 = r8.D0
            java.lang.Object r8 = r8.a
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
        L_0x000b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0082
            java.lang.Object r1 = r8.next()
            o10 r1 = (defpackage.o10) r1
            j10 r2 = r1.a
            int r2 = r2.ordinal()
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L_0x0042
            r3 = 3
            if (r2 == r3) goto L_0x003b
            r3 = 5
            r6 = 0
            if (r2 == r3) goto L_0x0036
            r3 = 9
            if (r2 == r3) goto L_0x002f
        L_0x002d:
            r2 = r4
            goto L_0x0047
        L_0x002f:
            v00 r1 = r1.j
            long r2 = r1.a
            java.lang.String r6 = r1.e
            goto L_0x0047
        L_0x0036:
            i10 r1 = r1.f
            long r2 = r1.a
            goto L_0x0047
        L_0x003b:
            n10 r1 = r1.d
            long r2 = r1.a
            java.lang.String r6 = r1.m
            goto L_0x0047
        L_0x0042:
            a10 r1 = r1.b
            java.lang.String r6 = r1.Z
            goto L_0x002d
        L_0x0047:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0051
            boolean r4 = r1g.p(r6)
            if (r4 != 0) goto L_0x000b
        L_0x0051:
            if (r1 == 0) goto L_0x0067
            pl r0 = r7.c     // Catch:{ all -> 0x0065 }
            t97 r0 = r0.z     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0065 }
            zxe r0 = (defpackage.zxe) r0     // Catch:{ all -> 0x0065 }
            v63 r0 = r0.b(r2)     // Catch:{ all -> 0x0065 }
            r0.a()     // Catch:{ all -> 0x0065 }
            goto L_0x0080
        L_0x0065:
            r0 = move-exception
            goto L_0x0079
        L_0x0067:
            pl r0 = r7.c     // Catch:{ all -> 0x0065 }
            t97 r0 = r0.z     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0065 }
            zxe r0 = (defpackage.zxe) r0     // Catch:{ all -> 0x0065 }
            v63 r0 = r0.e(r6)     // Catch:{ all -> 0x0065 }
            r0.a()     // Catch:{ all -> 0x0065 }
            goto L_0x0080
        L_0x0079:
            java.lang.String r1 = "MsgSendApiTask"
            java.lang.String r2 = "onAttachNotFound: failed"
            udd.s(r1, r2, r0)
        L_0x0080:
            r0 = 1
            goto L_0x000b
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d99.y(vo8):boolean");
    }

    public final void z(vo8 vo8, long j) {
        e00 e00;
        e00 e002;
        this.c.d().x(vo8, bp8.SENDING);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i != 0) {
            eha eha = (eha) this.c.y.getValue();
            eha.getClass();
            if (i != 0) {
                if (vo8.y()) {
                    e002 = e00.PHOTO;
                } else if (vo8.s()) {
                    e002 = e00.AUDIO;
                } else {
                    j10 j10 = j10.o;
                    if (vo8.l(j10)) {
                        e002 = e00.VIDEO;
                    } else {
                        if (vo8.l(j10)) {
                            if ((vo8.C() ? vo8.D0.x(j10).d : null).b == 2) {
                                e002 = e00.VIDEO_MSG;
                            }
                        }
                        if (vo8.l(j10.y0)) {
                            e002 = e00.FILE;
                        } else if (vo8.B()) {
                            e002 = e00.STICKER;
                        } else {
                            e00 = null;
                            eha.f(j, e00, vo8.b);
                        }
                    }
                }
                e00 = e002;
                eha.f(j, e00, vo8.b);
            }
        }
    }
}
