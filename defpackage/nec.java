package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: nec  reason: default package */
public final class nec {
    public final bec a;
    public final zpc b;
    public final t97 c;
    public final t97 d;
    public final r7e e = new r7e(new u5b(10, this));

    public nec(bec bec, zpc zpc, rw6 rw6, t97 t97) {
        this.a = bec;
        this.b = zpc;
        this.c = rw6;
        this.d = t97;
    }

    public static uo8 m(jp8 jp8) {
        uo8 uo8 = new uo8();
        uo8.a = jp8.a;
        uo8.b = jp8.b;
        uo8.c = jp8.c;
        uo8.d = jp8.d;
        uo8.e = jp8.e;
        uo8.f = jp8.f;
        uo8.g = jp8.g;
        uo8.h = jp8.x;
        uo8.i = jp8.h;
        uo8.j = jp8.i;
        uo8.k = jp8.j;
        uo8.l = jp8.k;
        uo8.m = jp8.l;
        uo8.n = jp8.m;
        uo8.o = jp8.n;
        uo8.p = jp8.p;
        uo8.q = jp8.s;
        uo8.s = jp8.t;
        uo8.t = jp8.u;
        uo8.y = jp8.w;
        uo8.x = jp8.v;
        uo8.u = jp8.o;
        uo8.v = jp8.z;
        uo8.w = jp8.A;
        uo8.I = jp8.J;
        uo8.A = jp8.y;
        uo8.B = jp8.B;
        uo8.C = jp8.C;
        uo8.D = jp8.D;
        uo8.E = jp8.E;
        uo8.F = jp8.F;
        uo8.G = jp8.G;
        return uo8;
    }

    public final int a(long j, long j2, md4 md4) {
        int i;
        int ordinal = md4.ordinal();
        if (ordinal == 0) {
            cw8 d2 = d();
            aec aec = d2.a;
            aec.b();
            yv8 yv8 = d2.q;
            yz5 f = yv8.f();
            f.j(1, j);
            f.j(2, j2);
            try {
                aec.c();
                i = f.n();
                aec.r();
                aec.l();
                yv8.u(f);
            } catch (Throwable th) {
                yv8.u(f);
                throw th;
            }
        } else if (ordinal == 1) {
            cw8 d3 = d();
            aec aec2 = d3.a;
            aec2.b();
            yv8 yv82 = d3.r;
            yz5 f2 = yv82.f();
            f2.j(1, j);
            f2.j(2, j2);
            try {
                aec2.c();
                i = f2.n();
                aec2.r();
                aec2.l();
                yv82.u(f2);
            } catch (Throwable th2) {
                yv82.u(f2);
                throw th2;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return i;
    }

    public final vo8 b(jp8 jp8) {
        Boolean bool;
        o10 x;
        t00 t00;
        uo8 m = m(jp8);
        long j = jp8.q;
        nd4 nd4 = null;
        if (j > 0) {
            jp8 c2 = d().c(j);
            m.r = c2 != null ? b(c2) : null;
        }
        jj7 jj7 = jp8.m;
        long j2 = (jj7 == null || (x = jj7.x(j10.b)) == null || (t00 = x.c) == null) ? 0 : t00.m;
        if (j2 > 0) {
            jp8 c3 = d().c(j2);
            m.z = c3 != null ? b(c3) : null;
        }
        Long l = jp8.H;
        if (!(l == null || (bool = jp8.I) == null)) {
            nd4 = new nd4(l.longValue(), bool.booleanValue());
        }
        m.H = nd4;
        return m.a();
    }

    public final pae c() {
        return (pae) this.c.getValue();
    }

    public final cw8 d() {
        return (cw8) this.e.getValue();
    }

    public final long e(long j, long j2, ym8 ym8) {
        return ((Number) this.a.m().p(new eec(this, j, ym8, j2))).longValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long f(long r90, long r92, defpackage.ym8 r94, boolean r95) {
        /*
            r89 = this;
            r0 = r89
            r14 = r90
            r11 = r94
            cw8 r1 = r89.d()
            long r2 = r11.a
            java.lang.Long r1 = r1.i(r14, r2)
            r8 = 1
            r12 = 0
            if (r1 == 0) goto L_0x0016
            r9 = r8
            goto L_0x0017
        L_0x0016:
            r9 = r12
        L_0x0017:
            long r1 = r11.Y
            r16 = 0
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            r10 = 0
            if (r3 == 0) goto L_0x0066
            long r3 = r11.o
            int r3 = (r92 > r3 ? 1 : (r92 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0066
            cw8 r3 = r89.d()
            r3.getClass()
            java.lang.String r4 = "SELECT id FROM messages WHERE chat_id = ? AND cid = ?"
            r5 = 2
            pec r4 = pec.a(r5, r4)
            r4.j(r8, r14)
            r4.j(r5, r1)
            aec r1 = r3.a
            r1.b()
            android.database.Cursor r1 = r1.o(r4, r10)
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x004f
            boolean r2 = r1.isNull(r12)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0051
        L_0x004f:
            r2 = r10
            goto L_0x005c
        L_0x0051:
            long r2 = r1.getLong(r12)     // Catch:{ all -> 0x005a }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r0 = move-exception
            goto L_0x0068
        L_0x005c:
            r1.close()
            r4.m()
            if (r2 == 0) goto L_0x0066
            r13 = r8
            goto L_0x006f
        L_0x0066:
            r13 = r12
            goto L_0x006f
        L_0x0068:
            r1.close()
            r4.m()
            throw r0
        L_0x006f:
            rq8 r7 = r11.x0
            if (r7 == 0) goto L_0x0087
            ym8 r6 = r7.c
            r18 = 1
            r1 = r89
            r2 = r90
            r4 = r92
            r10 = r7
            r7 = r18
            long r1 = r1.f(r2, r4, r6, r7)
            r20 = r1
            goto L_0x008a
        L_0x0087:
            r10 = r7
            r20 = r16
        L_0x008a:
            zy r1 = r11.w0
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x00a4
            java.lang.Object r2 = r1.get(r12)
            boolean r2 = r2 instanceof defpackage.gr3
            if (r2 == 0) goto L_0x00a4
            java.lang.Object r1 = r1.get(r12)
            gr3 r1 = (defpackage.gr3) r1
            ym8 r1 = r1.E0
            r7 = r1
            goto L_0x00a5
        L_0x00a4:
            r7 = 0
        L_0x00a5:
            if (r7 == 0) goto L_0x00be
            r18 = 1
            r1 = r89
            r2 = r90
            r4 = r92
            r6 = r7
            r12 = r7
            r7 = r18
            long r1 = r1.f(r2, r4, r6, r7)
            long r3 = r12.a
            r25 = r1
            r27 = r3
            goto L_0x00c2
        L_0x00be:
            r25 = r16
            r27 = r25
        L_0x00c2:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            if (r9 != 0) goto L_0x01d0
            if (r13 != 0) goto L_0x01d0
            bp8 r37 = defpackage.bp8.SENT
            a6 r1 = new a6
            r2 = 5
            r1.<init>(r2, r12)
            if (r10 == 0) goto L_0x00f0
            int r2 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f0
            r2 = 3
            int r3 = r10.a
            if (r3 != r2) goto L_0x00f0
            ym8 r1 = r10.c
            zy r2 = r1.w0
            zpc r3 = r0.b
            r4 = 0
            r6 = 0
            r8 = 0
            jj7 r1 = defpackage.fu7.h(r2, r3, r4, r6, r8)
        L_0x00ed:
            r38 = r1
            goto L_0x00ff
        L_0x00f0:
            zy r2 = r11.w0
            zpc r3 = r0.b
            r23 = r2
            r24 = r3
            r29 = r1
            jj7 r1 = defpackage.fu7.h(r23, r24, r25, r27, r29)
            goto L_0x00ed
        L_0x00ff:
            ms8 r1 = r11.X
            ls8 r10 = defpackage.fu7.q(r1)
            r8 = 0
            r1 = r89
            r2 = r90
            r4 = r94
            r5 = r20
            r7 = r95
            or8 r13 = r1.i(r2, r4, r5, r7, r8, r10)
            int r40 = defpackage.fu7.c(r38)
            ks8 r1 = r11.z0
            if (r1 == 0) goto L_0x0122
            int r2 = r1.a
            r41 = r2
            goto L_0x0124
        L_0x0122:
            r41 = 0
        L_0x0124:
            if (r1 == 0) goto L_0x012b
            int r1 = r1.b
            r52 = r1
            goto L_0x012d
        L_0x012b:
            r52 = 0
        L_0x012d:
            jp8 r10 = new jp8
            r1 = r10
            java.lang.Long r2 = r13.x
            r50 = r2
            java.lang.Boolean r2 = r13.y
            r51 = r2
            long r2 = r13.a
            long r4 = r13.b
            long r6 = r13.c
            long r8 = r13.e
            r92 = r10
            long r10 = r13.f
            r0 = r92
            long r14 = r13.g
            r53 = r12
            r0 = r13
            r12 = r14
            java.lang.String r14 = r0.h
            ls8 r15 = r0.q
            r16 = r15
            r17 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            int r15 = r0.k
            r24 = r15
            r93 = r1
            r94 = r2
            long r1 = r0.l
            r25 = r1
            boolean r1 = r0.m
            r27 = r1
            long r1 = r0.n
            r28 = r1
            java.lang.String r1 = r0.o
            r30 = r1
            java.lang.String r1 = r0.p
            r31 = r1
            r32 = 0
            r34 = 0
            int r1 = r0.r
            r36 = r1
            int r1 = r0.s
            r39 = r1
            long r1 = r0.t
            r42 = r1
            int r1 = r0.u
            r44 = r1
            int r1 = r0.v
            r45 = r1
            long r1 = r0.w
            r46 = r1
            java.util.List r1 = r0.i
            r48 = r1
            yr8 r0 = r0.j
            r49 = r0
            r15 = r37
            r21 = r38
            r22 = r40
            r37 = r90
            r40 = r41
            r41 = r52
            r1 = r93
            r2 = r94
            r1.<init>(r2, r4, r6, r8, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r27, r28, r30, r31, r32, r34, r36, r37, r39, r40, r41, r42, r44, r45, r46, r48, r49, r50, r51)
            cw8 r0 = r89.d()
            r1 = r92
            long r0 = r0.f(r1)
            java.util.Iterator r2 = r53.iterator()
        L_0x01bb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01cf
            java.lang.Object r3 = r2.next()
            xga r3 = (defpackage.xga) r3
            r10 = r89
            r14 = r90
            r10.g(r3, r14)
            goto L_0x01bb
        L_0x01cf:
            return r0
        L_0x01d0:
            r10 = r0
            if (r9 == 0) goto L_0x01e1
            r1 = r89
            r2 = r90
            r4 = r20
            r6 = r94
            r7 = r95
            r1.p(r2, r4, r6, r7)
            goto L_0x01f1
        L_0x01e1:
            if (r13 == 0) goto L_0x01f1
            s59 r0 = defpackage.bp8.b
            r6 = 0
            r1 = r89
            r2 = r94
            r3 = r90
            r5 = r95
            r1.o(r2, r3, r5, r6)
        L_0x01f1:
            cw8 r0 = r89.d()
            long r1 = r11.a
            jp8 r0 = r0.b(r14, r1)
            if (r0 == 0) goto L_0x0202
            vo8 r0 = r10.b(r0)
            goto L_0x0203
        L_0x0202:
            r0 = 0
        L_0x0203:
            if (r0 == 0) goto L_0x0225
            k92 r1 = new k92
            r1.<init>(r10, r14, r8)
            zy r2 = r11.w0
            zpc r3 = r10.b
            r23 = r2
            r24 = r3
            r29 = r1
            jj7 r1 = defpackage.fu7.h(r23, r24, r25, r27, r29)
            ro8 r2 = new ro8
            r3 = r95
            r2.<init>((defpackage.vo8) r0, (jj7) r1, (boolean) r3)
            long r0 = r0.b
            r10.n(r0, r2)
            return r0
        L_0x0225:
            cw8 r0 = r89.d()
            r0.getClass()
            java.lang.String r3 = "SELECT * FROM messages WHERE server_id = ?"
            pec r3 = pec.a(r8, r3)
            r3.j(r8, r1)
            aec r1 = r0.a
            r1.b()
            r2 = 0
            android.database.Cursor r1 = r1.o(r3, r2)
            java.lang.String r4 = "id"
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x04f7 }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x04f7 }
            java.lang.String r6 = "time"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x04f7 }
            java.lang.String r7 = "update_time"
            int r7 = defpackage.gp0.o(r1, r7)     // Catch:{ all -> 0x04f7 }
            java.lang.String r9 = "sender"
            int r9 = defpackage.gp0.o(r1, r9)     // Catch:{ all -> 0x04f7 }
            java.lang.String r10 = "cid"
            int r10 = defpackage.gp0.o(r1, r10)     // Catch:{ all -> 0x04f7 }
            java.lang.String r11 = "text"
            int r11 = defpackage.gp0.o(r1, r11)     // Catch:{ all -> 0x04f7 }
            java.lang.String r12 = "delivery_status"
            int r12 = defpackage.gp0.o(r1, r12)     // Catch:{ all -> 0x04f7 }
            java.lang.String r13 = "status"
            int r13 = defpackage.gp0.o(r1, r13)     // Catch:{ all -> 0x04f7 }
            java.lang.String r14 = "time_local"
            int r14 = defpackage.gp0.o(r1, r14)     // Catch:{ all -> 0x04f7 }
            java.lang.String r15 = "error"
            int r15 = defpackage.gp0.o(r1, r15)     // Catch:{ all -> 0x04f7 }
            java.lang.String r2 = "localized_error"
            int r2 = defpackage.gp0.o(r1, r2)     // Catch:{ all -> 0x04f7 }
            java.lang.String r8 = "attaches"
            int r8 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x04f7 }
            r89 = r3
            java.lang.String r3 = "media_type"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r90 = r3
            java.lang.String r3 = "detect_share"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r91 = r3
            java.lang.String r3 = "msg_link_type"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r92 = r3
            java.lang.String r3 = "msg_link_id"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r93 = r3
            java.lang.String r3 = "inserted_from_msg_link"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r94 = r3
            java.lang.String r3 = "msg_link_chat_id"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r95 = r3
            java.lang.String r3 = "msg_link_chat_name"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r20 = r3
            java.lang.String r3 = "msg_link_chat_link"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r21 = r3
            java.lang.String r3 = "msg_link_out_chat_id"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r23 = r3
            java.lang.String r3 = "msg_link_out_msg_id"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r24 = r3
            java.lang.String r3 = "type"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r25 = r3
            java.lang.String r3 = "chat_id"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r26 = r3
            java.lang.String r3 = "ttl"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r27 = r3
            java.lang.String r3 = "channel_views"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r28 = r3
            java.lang.String r3 = "channel_forwards"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r29 = r3
            java.lang.String r3 = "view_time"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r30 = r3
            java.lang.String r3 = "zoom"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r31 = r3
            java.lang.String r3 = "options"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r32 = r3
            java.lang.String r3 = "live_until"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r33 = r3
            java.lang.String r3 = "elements"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r34 = r3
            java.lang.String r3 = "reactions"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r35 = r3
            java.lang.String r3 = "delayed_attrs_time_to_fire"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            r36 = r3
            java.lang.String r3 = "delayed_attrs_notify_sender"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x04e7 }
            boolean r37 = r1.moveToFirst()     // Catch:{ all -> 0x04e7 }
            if (r37 == 0) goto L_0x04e9
            long r39 = r1.getLong(r4)     // Catch:{ all -> 0x04e7 }
            long r41 = r1.getLong(r5)     // Catch:{ all -> 0x04e7 }
            long r43 = r1.getLong(r6)     // Catch:{ all -> 0x04e7 }
            long r45 = r1.getLong(r7)     // Catch:{ all -> 0x04e7 }
            long r47 = r1.getLong(r9)     // Catch:{ all -> 0x04e7 }
            long r49 = r1.getLong(r10)     // Catch:{ all -> 0x04e7 }
            boolean r4 = r1.isNull(r11)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x036c
            r51 = 0
            goto L_0x0372
        L_0x036c:
            java.lang.String r4 = r1.getString(r11)     // Catch:{ all -> 0x04e7 }
            r51 = r4
        L_0x0372:
            int r4 = r1.getInt(r12)     // Catch:{ all -> 0x04e7 }
            p29 r5 = r0.a()     // Catch:{ all -> 0x04e7 }
            r5.getClass()     // Catch:{ all -> 0x04e7 }
            s59 r5 = defpackage.bp8.b     // Catch:{ all -> 0x04e7 }
            r5.getClass()     // Catch:{ all -> 0x04e7 }
            bp8 r52 = defpackage.s59.t(r4)     // Catch:{ all -> 0x04e7 }
            int r4 = r1.getInt(r13)     // Catch:{ all -> 0x04e7 }
            p29 r5 = r0.a()     // Catch:{ all -> 0x04e7 }
            r5.getClass()     // Catch:{ all -> 0x04e7 }
            ls8 r53 = defpackage.p29.b(r4)     // Catch:{ all -> 0x04e7 }
            long r54 = r1.getLong(r14)     // Catch:{ all -> 0x04e7 }
            boolean r4 = r1.isNull(r15)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x03a2
            r56 = 0
            goto L_0x03a8
        L_0x03a2:
            java.lang.String r4 = r1.getString(r15)     // Catch:{ all -> 0x04e7 }
            r56 = r4
        L_0x03a8:
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x03b1
            r57 = 0
            goto L_0x03b7
        L_0x03b1:
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x04e7 }
            r57 = r2
        L_0x03b7:
            boolean r2 = r1.isNull(r8)     // Catch:{ all -> 0x04e7 }
            if (r2 == 0) goto L_0x03bf
            r2 = 0
            goto L_0x03c3
        L_0x03bf:
            byte[] r2 = r1.getBlob(r8)     // Catch:{ all -> 0x04e7 }
        L_0x03c3:
            p29 r4 = r0.a()     // Catch:{ all -> 0x04e7 }
            r4.getClass()     // Catch:{ all -> 0x04e7 }
            jj7 r58 = defpackage.fu7.b(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r90
            int r59 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r91
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            if (r2 == 0) goto L_0x03e1
            r2 = r92
            r60 = 1
            goto L_0x03e5
        L_0x03e1:
            r2 = r92
            r60 = 0
        L_0x03e5:
            int r61 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r93
            long r62 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r94
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            if (r2 == 0) goto L_0x03fc
            r2 = r95
            r64 = 1
            goto L_0x0400
        L_0x03fc:
            r2 = r95
            r64 = 0
        L_0x0400:
            long r65 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r20
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x0411
            r2 = r21
            r67 = 0
            goto L_0x0419
        L_0x0411:
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x04e7 }
            r67 = r2
            r2 = r21
        L_0x0419:
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x0424
            r2 = r23
            r68 = 0
            goto L_0x042c
        L_0x0424:
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x04e7 }
            r68 = r2
            r2 = r23
        L_0x042c:
            long r69 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r24
            long r71 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r25
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            p29 r4 = r0.a()     // Catch:{ all -> 0x04e7 }
            r4.getClass()     // Catch:{ all -> 0x04e7 }
            int r73 = defpackage.us8.a(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r26
            long r74 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r27
            int r76 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r28
            int r77 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r29
            int r78 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r30
            long r79 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r31
            int r81 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r32
            int r82 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r33
            long r83 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r34
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x0481
            r2 = 0
            goto L_0x0485
        L_0x0481:
            byte[] r2 = r1.getBlob(r2)     // Catch:{ all -> 0x04e7 }
        L_0x0485:
            p29 r4 = r0.a()     // Catch:{ all -> 0x04e7 }
            r4.getClass()     // Catch:{ all -> 0x04e7 }
            java.util.List r85 = defpackage.p29.a(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r35
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x049a
            r2 = 0
            goto L_0x049e
        L_0x049a:
            byte[] r2 = r1.getBlob(r2)     // Catch:{ all -> 0x04e7 }
        L_0x049e:
            p29 r0 = r0.a()     // Catch:{ all -> 0x04e7 }
            yr8 r86 = r0.c(r2)     // Catch:{ all -> 0x04e7 }
            r0 = r36
            boolean r2 = r1.isNull(r0)     // Catch:{ all -> 0x04e7 }
            if (r2 == 0) goto L_0x04b1
            r87 = 0
            goto L_0x04bb
        L_0x04b1:
            long r4 = r1.getLong(r0)     // Catch:{ all -> 0x04e7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x04e7 }
            r87 = r0
        L_0x04bb:
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x04e7 }
            if (r0 == 0) goto L_0x04c3
            r0 = 0
            goto L_0x04cb
        L_0x04c3:
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x04e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04e7 }
        L_0x04cb:
            if (r0 != 0) goto L_0x04d0
            r88 = 0
            goto L_0x04df
        L_0x04d0:
            int r0 = r0.intValue()     // Catch:{ all -> 0x04e7 }
            if (r0 == 0) goto L_0x04d8
            r8 = 1
            goto L_0x04d9
        L_0x04d8:
            r8 = 0
        L_0x04d9:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04e7 }
            r88 = r10
        L_0x04df:
            jp8 r10 = new jp8     // Catch:{ all -> 0x04e7 }
            r38 = r10
            r38.<init>(r39, r41, r43, r45, r47, r49, r51, r52, r53, r54, r56, r57, r58, r59, r60, r61, r62, r64, r65, r67, r68, r69, r71, r73, r74, r76, r77, r78, r79, r81, r82, r83, r85, r86, r87, r88)     // Catch:{ all -> 0x04e7 }
            goto L_0x04ea
        L_0x04e7:
            r0 = move-exception
            goto L_0x04fa
        L_0x04e9:
            r10 = 0
        L_0x04ea:
            r1.close()
            r89.m()
            if (r10 == 0) goto L_0x04f6
            long r0 = r10.a
            r16 = r0
        L_0x04f6:
            return r16
        L_0x04f7:
            r0 = move-exception
            r89 = r3
        L_0x04fa:
            r1.close()
            r89.m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nec.f(long, long, ym8, boolean):long");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, p10] */
    public final void g(xga xga, long j) {
        xga xga2 = xga;
        long j2 = xga2.a;
        jj7 c2 = new Object().c();
        xhd xhd = md4.o;
        hw4 hw4 = hw4.a;
        int c3 = fu7.c(c2);
        jp8 jp8 = new jp8(0, 0, 0, 0, 0, j2, xga2.b, bp8.SENDING, ls8.ACTIVE, 0, (String) null, (String) null, c2, c3, xga2.e, 0, 0, false, 0, (String) null, (String) null, 0, 0, 1, j, xga2.f, 0, 0, 0, 0, 0, 0, hw4, (yr8) null, (Long) null, (Boolean) null);
        d().f(jp8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        r11 = r11.I;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.jp8 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.hec
            if (r0 == 0) goto L_0x0013
            r0 = r12
            hec r0 = (defpackage.hec) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            hec r0 = new hec
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.w0
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r6) goto L_0x0041
            if (r2 != r5) goto L_0x0039
            uo8 r10 = r0.Z
            uo8 r11 = r0.Y
            java.lang.Object r1 = r0.X
            uo8 r1 = (defpackage.uo8) r1
            java.lang.Object r0 = r0.o
            jp8 r0 = (defpackage.jp8) r0
            wx3.H(r12)
            goto L_0x00af
        L_0x0039:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0041:
            uo8 r10 = r0.Z
            uo8 r11 = r0.Y
            java.lang.Object r2 = r0.X
            jp8 r2 = (defpackage.jp8) r2
            java.lang.Object r6 = r0.o
            nec r6 = (defpackage.nec) r6
            wx3.H(r12)
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r9
            goto L_0x0075
        L_0x0055:
            wx3.H(r12)
            uo8 r12 = m(r11)
            long r7 = r11.q
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x007d
            r0.o = r10
            r0.X = r11
            r0.Y = r12
            r0.Z = r12
            r0.y0 = r6
            java.lang.Object r2 = r10.k(r7, r0)
            if (r2 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r6 = r10
            r10 = r12
        L_0x0075:
            vo8 r2 = (defpackage.vo8) r2
            r10.r = r2
            r2 = r12
            r12 = r10
            r10 = r6
            goto L_0x007e
        L_0x007d:
            r2 = r12
        L_0x007e:
            r10.getClass()
            jj7 r6 = r11.m
            if (r6 == 0) goto L_0x0094
            j10 r7 = defpackage.j10.b
            o10 r6 = r6.x(r7)
            if (r6 == 0) goto L_0x0094
            t00 r6 = r6.c
            if (r6 == 0) goto L_0x0094
            long r6 = r6.m
            goto L_0x0095
        L_0x0094:
            r6 = r3
        L_0x0095:
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b6
            r0.o = r11
            r0.X = r2
            r0.Y = r12
            r0.Z = r12
            r0.y0 = r5
            java.lang.Object r10 = r10.k(r6, r0)
            if (r10 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            r0 = r11
            r11 = r12
            r1 = r2
            r12 = r10
            r10 = r11
        L_0x00af:
            vo8 r12 = (defpackage.vo8) r12
            r10.z = r12
            r12 = r11
            r11 = r0
            r2 = r1
        L_0x00b6:
            java.lang.Long r10 = r11.H
            if (r10 == 0) goto L_0x00cc
            java.lang.Boolean r11 = r11.I
            if (r11 == 0) goto L_0x00cc
            nd4 r0 = new nd4
            long r3 = r10.longValue()
            boolean r10 = r11.booleanValue()
            r0.<init>(r3, r10)
            goto L_0x00cd
        L_0x00cc:
            r0 = 0
        L_0x00cd:
            r12.H = r0
            vo8 r10 = r2.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nec.h(jp8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.or8 i(long r44, defpackage.ym8 r46, long r47, boolean r49, long r50, defpackage.ls8 r52) {
        /*
            r43 = this;
            r0 = r46
            rq8 r1 = r0.x0
            r2 = 3
            r3 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0021
            int r6 = (r47 > r3 ? 1 : (r47 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0021
            int r6 = r1.a
            if (r6 != r2) goto L_0x0021
            ym8 r6 = r1.c
            java.lang.String r7 = r6.Z
            java.util.List r6 = r6.G0
            java.util.ArrayList r6 = defpackage.fu7.u(r6)
            r22 = r6
            r21 = r7
            goto L_0x0039
        L_0x0021:
            java.lang.String r6 = r0.Z
            if (r6 == 0) goto L_0x002e
            java.lang.CharSequence r6 = h0e.B0(r6)
            java.lang.String r6 = r6.toString()
            goto L_0x002f
        L_0x002e:
            r6 = r5
        L_0x002f:
            java.util.List r7 = r0.G0
            java.util.ArrayList r7 = defpackage.fu7.u(r7)
            r21 = r6
            r22 = r7
        L_0x0039:
            r6 = 2
            r7 = 1
            vs8 r8 = r0.y0
            if (r8 != 0) goto L_0x0042
        L_0x003f:
            r33 = r6
            goto L_0x0058
        L_0x0042:
            int r8 = r8.ordinal()
            if (r8 == r7) goto L_0x003f
            if (r8 == r6) goto L_0x0053
            r9 = 4
            if (r8 == r2) goto L_0x0056
            if (r8 == r9) goto L_0x0052
            r33 = r7
            goto L_0x0058
        L_0x0052:
            r2 = 5
        L_0x0053:
            r33 = r2
            goto L_0x0058
        L_0x0056:
            r33 = r9
        L_0x0058:
            if (r52 != 0) goto L_0x0063
            ms8 r2 = r0.X
            ls8 r2 = defpackage.fu7.q(r2)
            r32 = r2
            goto L_0x0065
        L_0x0063:
            r32 = r52
        L_0x0065:
            vr8 r8 = r0.I0
            if (r8 == 0) goto L_0x00ba
            r9 = r43
            t97 r9 = r9.d
            java.lang.Object r9 = r9.getValue()
            zr8 r9 = (defpackage.zr8) r9
            java.util.List r10 = r8.a
            int r11 = r10.size()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            if (r11 <= 0) goto L_0x00b6
            r13 = 0
        L_0x0081:
            if (r13 >= r11) goto L_0x00a4
            java.lang.Object r14 = r10.get(r13)
            sr8 r14 = (defpackage.sr8) r14
            rr8 r14 = r14.a
            xr8 r15 = new xr8
            yyb r14 = r9.d(r14)
            java.lang.Object r16 = r10.get(r13)
            r2 = r16
            sr8 r2 = (defpackage.sr8) r2
            int r2 = r2.b
            r15.<init>(r14, r2)
            r12.add(r15)
            int r13 = r13 + 1
            goto L_0x0081
        L_0x00a4:
            yr8 r2 = new yr8
            rr8 r10 = r8.c
            if (r10 != 0) goto L_0x00ac
            r9 = r5
            goto L_0x00b0
        L_0x00ac:
            yyb r9 = r9.d(r10)
        L_0x00b0:
            int r8 = r8.b
            r2.<init>(r12, r8, r9)
            goto L_0x00b7
        L_0x00b6:
            r2 = r5
        L_0x00b7:
            r23 = r2
            goto L_0x00bc
        L_0x00ba:
            r23 = r5
        L_0x00bc:
            if (r1 == 0) goto L_0x00c1
            int r2 = r1.a
            goto L_0x00c2
        L_0x00c1:
            r2 = 0
        L_0x00c2:
            if (r2 != 0) goto L_0x00c7
        L_0x00c4:
            r24 = 0
            goto L_0x00d5
        L_0x00c7:
            int r2 = hr1.t(r2)
            if (r2 == r7) goto L_0x00d3
            if (r2 == r6) goto L_0x00d0
            goto L_0x00c4
        L_0x00d0:
            r24 = r6
            goto L_0x00d5
        L_0x00d3:
            r24 = r7
        L_0x00d5:
            if (r1 == 0) goto L_0x00d9
            long r3 = r1.b
        L_0x00d9:
            r28 = r3
            if (r1 == 0) goto L_0x00e2
            java.lang.String r2 = r1.o
            r30 = r2
            goto L_0x00e4
        L_0x00e2:
            r30 = r5
        L_0x00e4:
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = r1.X
            r31 = r1
            goto L_0x00ed
        L_0x00eb:
            r31 = r5
        L_0x00ed:
            nd4 r1 = r0.H0
            if (r1 == 0) goto L_0x00fa
            long r2 = r1.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r41 = r2
            goto L_0x00fc
        L_0x00fa:
            r41 = r5
        L_0x00fc:
            if (r1 == 0) goto L_0x0104
            boolean r1 = r1.b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
        L_0x0104:
            r42 = r5
            or8 r1 = new or8
            r6 = r1
            int r2 = r0.D0
            r38 = r2
            long r2 = r0.E0
            r39 = r2
            long r9 = r0.a
            long r11 = r0.b
            long r2 = r0.c
            r15 = r2
            long r2 = r0.o
            r17 = r2
            long r2 = r0.Y
            r19 = r2
            int r2 = r0.A0
            r34 = r2
            long r2 = r0.B0
            r35 = r2
            int r0 = r0.C0
            r37 = r0
            r7 = r50
            r13 = r44
            r25 = r47
            r27 = r49
            r6.<init>(r7, r9, r11, r13, r15, r17, r19, r21, r22, r23, r24, r25, r27, r28, r30, r31, r32, r33, r34, r35, r37, r38, r39, r41, r42)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nec.i(long, ym8, long, boolean, long, ls8):or8");
    }

    public final Object j(long j, long j2, Continuation continuation) {
        return xs7.U(c().b(), new kec(this, j, j2, (Continuation) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.mec
            if (r0 == 0) goto L_0x0013
            r0 = r8
            mec r0 = (defpackage.mec) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            mec r0 = new mec
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0038
            if (r2 == r3) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            wx3.H(r8)
            goto L_0x0073
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            nec r5 = r0.o
            wx3.H(r8)
            goto L_0x0063
        L_0x0038:
            wx3.H(r8)
            cw8 r8 = r5.d()
            r0.o = r5
            r0.Z = r3
            r8.getClass()
            java.lang.String r2 = "SELECT * FROM messages WHERE id = ?"
            pec r2 = pec.a(r3, r2)
            r2.j(r3, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            aw8 r7 = new aw8
            r3 = 0
            r7.<init>(r8, r2, r3)
            aec r8 = r8.a
            java.lang.Object r8 = r1g.g(r8, r6, r7, r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            jp8 r8 = (defpackage.jp8) r8
            r6 = 0
            if (r8 == 0) goto L_0x0076
            r0.o = r6
            r0.Z = r4
            java.lang.Object r8 = r5.h(r8, r0)
            if (r8 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r6 = r8
            vo8 r6 = (defpackage.vo8) r6
        L_0x0076:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nec.k(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ArrayList l(long j, long j2, Set set, Integer num, boolean z) {
        ArrayList<jp8> arrayList;
        pec pec;
        String str;
        int i;
        boolean z2;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l;
        int i7;
        Boolean bool;
        String str4;
        String str5;
        pec pec2;
        String str6;
        int i8;
        boolean z3;
        int i9;
        String str7;
        int i10;
        String str8;
        int i11;
        int i12;
        int i13;
        byte[] bArr2;
        Long l2;
        int i14;
        Boolean bool2;
        String str9;
        String str10;
        long j3 = j2;
        List singletonList = Collections.singletonList(Long.valueOf(j));
        cw8 d2 = d();
        List<Long> s0 = o23.s0(singletonList);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        aec aec = d2.a;
        String str11 = "delayed_attrs_notify_sender";
        String str12 = "delayed_attrs_time_to_fire";
        String str13 = "reactions";
        String str14 = "elements";
        String str15 = "live_until";
        String str16 = "options";
        String str17 = "zoom";
        String str18 = "view_time";
        String str19 = "channel_forwards";
        String str20 = "channel_views";
        String str21 = "ttl";
        String str22 = "chat_id";
        String str23 = "type";
        String str24 = "msg_link_out_msg_id";
        String str25 = "msg_link_out_chat_id";
        String str26 = "msg_link_chat_link";
        String str27 = "msg_link_chat_name";
        String str28 = "msg_link_chat_id";
        String str29 = "inserted_from_msg_link";
        String str30 = "msg_link_id";
        String str31 = "msg_link_type";
        String str32 = "detect_share";
        String str33 = "media_type";
        String str34 = "update_time";
        String str35 = "attaches";
        String str36 = "time";
        String str37 = "localized_error";
        String str38 = "error";
        String str39 = "time_local";
        String str40 = "status";
        String str41 = "delivery_status";
        if (z) {
            String str42 = "text";
            StringBuilder l3 = hr1.l("SELECT * FROM messages WHERE chat_id in (");
            String str43 = "cid";
            int size = s0.size();
            a06.e(l3, size);
            l3.append(") AND media_type in (");
            int size2 = set.size();
            a06.e(l3, size2);
            String str44 = "sender";
            l3.append(") AND time <= ");
            l3.append("?");
            l3.append(" AND inserted_from_msg_link = 0 AND status <> ");
            l3.append("?");
            l3.append(" ORDER BY time DESC LIMIT ");
            l3.append("?");
            int i15 = size + 3 + size2;
            pec a2 = pec.a(i15, l3.toString());
            int i16 = 1;
            for (Long l4 : s0) {
                if (l4 == null) {
                    a2.W(i16);
                    str10 = str34;
                    str9 = str36;
                } else {
                    str10 = str34;
                    str9 = str36;
                    a2.j(i16, l4.longValue());
                }
                i16++;
                str34 = str10;
                str36 = str9;
            }
            String str45 = str34;
            String str46 = str36;
            int i17 = size + 1;
            Iterator it = set.iterator();
            int i18 = i17;
            while (it.hasNext()) {
                Integer num2 = (Integer) it.next();
                if (num2 == null) {
                    a2.W(i18);
                } else {
                    a2.j(i18, (long) num2.intValue());
                }
                i18++;
            }
            a2.j(i17 + size2, j3);
            d2.a().getClass();
            a2.j(size + 2 + size2, (long) 10);
            a2.j(i15, (long) intValue);
            aec.b();
            Cursor o = aec.o(a2, (CancellationSignal) null);
            try {
                int o2 = gp0.o(o, ApiProtocol.KEY_ID);
                int o3 = gp0.o(o, "server_id");
                int o4 = gp0.o(o, str46);
                int o5 = gp0.o(o, str45);
                int o6 = gp0.o(o, str44);
                int o7 = gp0.o(o, str43);
                int o8 = gp0.o(o, str42);
                int o9 = gp0.o(o, str41);
                int o10 = gp0.o(o, str40);
                int o11 = gp0.o(o, str39);
                int o12 = gp0.o(o, str38);
                int o13 = gp0.o(o, str37);
                int o14 = gp0.o(o, str35);
                pec2 = a2;
                try {
                    int o15 = gp0.o(o, str33);
                    int o16 = gp0.o(o, str32);
                    int o17 = gp0.o(o, str31);
                    int o18 = gp0.o(o, str30);
                    int o19 = gp0.o(o, str29);
                    int o20 = gp0.o(o, str28);
                    int o21 = gp0.o(o, str27);
                    int o22 = gp0.o(o, str26);
                    int o23 = gp0.o(o, str25);
                    int o24 = gp0.o(o, str24);
                    int o25 = gp0.o(o, str23);
                    int o26 = gp0.o(o, str22);
                    int o27 = gp0.o(o, str21);
                    int o28 = gp0.o(o, str20);
                    int o29 = gp0.o(o, str19);
                    int o30 = gp0.o(o, str18);
                    int o31 = gp0.o(o, str17);
                    int o32 = gp0.o(o, str16);
                    int o33 = gp0.o(o, str15);
                    int o34 = gp0.o(o, str14);
                    int o35 = gp0.o(o, str13);
                    int o36 = gp0.o(o, str12);
                    int o37 = gp0.o(o, str11);
                    int i19 = o14;
                    arrayList = new ArrayList<>(o.getCount());
                    while (o.moveToNext()) {
                        long j4 = o.getLong(o2);
                        long j5 = o.getLong(o3);
                        long j6 = o.getLong(o4);
                        long j7 = o.getLong(o5);
                        long j8 = o.getLong(o6);
                        long j9 = o.getLong(o7);
                        String string = o.isNull(o8) ? null : o.getString(o8);
                        int i20 = o.getInt(o9);
                        d2.a().getClass();
                        bp8.b.getClass();
                        bp8 t = s59.t(i20);
                        int i21 = o.getInt(o10);
                        d2.a().getClass();
                        ls8 b2 = p29.b(i21);
                        long j10 = o.getLong(o11);
                        String string2 = o.isNull(o12) ? null : o.getString(o12);
                        if (o.isNull(o13)) {
                            i8 = i19;
                            str6 = null;
                        } else {
                            str6 = o.getString(o13);
                            i8 = i19;
                        }
                        byte[] blob = o.isNull(i8) ? null : o.getBlob(i8);
                        d2.a().getClass();
                        jj7 b3 = fu7.b(blob);
                        int i22 = o2;
                        int i23 = o15;
                        int i24 = o.getInt(i23);
                        o15 = i23;
                        int i25 = o16;
                        o16 = i25;
                        boolean z4 = o.getInt(i25) != 0;
                        int i26 = o17;
                        int i27 = o.getInt(i26);
                        o17 = i26;
                        int i28 = o18;
                        long j11 = o.getLong(i28);
                        o18 = i28;
                        int i29 = o19;
                        if (o.getInt(i29) != 0) {
                            o19 = i29;
                            i9 = o20;
                            z3 = true;
                        } else {
                            o19 = i29;
                            i9 = o20;
                            z3 = false;
                        }
                        long j12 = o.getLong(i9);
                        o20 = i9;
                        int i30 = o21;
                        if (o.isNull(i30)) {
                            o21 = i30;
                            i10 = o22;
                            str7 = null;
                        } else {
                            str7 = o.getString(i30);
                            o21 = i30;
                            i10 = o22;
                        }
                        if (o.isNull(i10)) {
                            o22 = i10;
                            i11 = o23;
                            str8 = null;
                        } else {
                            str8 = o.getString(i10);
                            o22 = i10;
                            i11 = o23;
                        }
                        long j13 = o.getLong(i11);
                        o23 = i11;
                        int i31 = o24;
                        long j14 = o.getLong(i31);
                        o24 = i31;
                        int i32 = o25;
                        int i33 = o.getInt(i32);
                        d2.a().getClass();
                        int a3 = us8.a(i33);
                        o25 = i32;
                        int i34 = o26;
                        long j15 = o.getLong(i34);
                        o26 = i34;
                        int i35 = o27;
                        int i36 = o.getInt(i35);
                        o27 = i35;
                        int i37 = o28;
                        int i38 = o.getInt(i37);
                        o28 = i37;
                        int i39 = o29;
                        int i40 = o.getInt(i39);
                        o29 = i39;
                        int i41 = o30;
                        long j16 = o.getLong(i41);
                        o30 = i41;
                        int i42 = o31;
                        int i43 = o.getInt(i42);
                        o31 = i42;
                        int i44 = o32;
                        int i45 = o.getInt(i44);
                        o32 = i44;
                        int i46 = o33;
                        long j17 = o.getLong(i46);
                        o33 = i46;
                        int i47 = o34;
                        byte[] blob2 = o.isNull(i47) ? null : o.getBlob(i47);
                        d2.a().getClass();
                        List a4 = p29.a(blob2);
                        o34 = i47;
                        int i48 = o35;
                        if (o.isNull(i48)) {
                            i12 = i48;
                            i13 = o3;
                            bArr2 = null;
                        } else {
                            i12 = i48;
                            bArr2 = o.getBlob(i48);
                            i13 = o3;
                        }
                        yr8 c2 = d2.a().c(bArr2);
                        int i49 = o36;
                        if (o.isNull(i49)) {
                            i14 = o37;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o.getLong(i49));
                            i14 = o37;
                        }
                        Integer valueOf = o.isNull(i14) ? null : Integer.valueOf(o.getInt(i14));
                        if (valueOf == null) {
                            o36 = i49;
                            bool2 = null;
                        } else {
                            bool2 = Boolean.valueOf(valueOf.intValue() != 0);
                            o36 = i49;
                        }
                        arrayList.add(new jp8(j4, j5, j6, j7, j8, j9, string, t, b2, j10, string2, str6, b3, i24, z4, i27, j11, z3, j12, str7, str8, j13, j14, a3, j15, i36, i38, i40, j16, i43, i45, j17, a4, c2, l2, bool2));
                        o37 = i14;
                        o3 = i13;
                        o2 = i22;
                        o35 = i12;
                        i19 = i8;
                    }
                    o.close();
                    pec2.m();
                } catch (Throwable th) {
                    th = th;
                    o.close();
                    pec2.m();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                pec2 = a2;
                o.close();
                pec2.m();
                throw th;
            }
        } else {
            String str47 = "text";
            String str48 = str36;
            String str49 = str34;
            StringBuilder l5 = hr1.l("SELECT * FROM messages WHERE chat_id in (");
            String str50 = "cid";
            int size3 = s0.size();
            a06.e(l5, size3);
            l5.append(") AND media_type in (");
            int size4 = set.size();
            a06.e(l5, size4);
            String str51 = "sender";
            l5.append(") AND time >= ");
            l5.append("?");
            l5.append(" AND inserted_from_msg_link = 0 AND status <> ");
            l5.append("?");
            l5.append(" ORDER BY time ASC LIMIT ");
            l5.append("?");
            int i50 = size3 + 3 + size4;
            pec a5 = pec.a(i50, l5.toString());
            int i51 = 1;
            for (Long l6 : s0) {
                if (l6 == null) {
                    a5.W(i51);
                    str4 = str48;
                    str5 = str49;
                } else {
                    str4 = str48;
                    str5 = str49;
                    a5.j(i51, l6.longValue());
                }
                i51++;
                str49 = str5;
                str48 = str4;
            }
            String str52 = str48;
            String str53 = str49;
            int i52 = size3 + 1;
            Iterator it2 = set.iterator();
            int i53 = i52;
            while (it2.hasNext()) {
                Integer num3 = (Integer) it2.next();
                if (num3 == null) {
                    a5.W(i53);
                } else {
                    a5.j(i53, (long) num3.intValue());
                }
                i53++;
            }
            a5.j(i52 + size4, j3);
            d2.a().getClass();
            a5.j(size3 + 2 + size4, (long) 10);
            a5.j(i50, (long) intValue);
            aec.b();
            Cursor o38 = aec.o(a5, (CancellationSignal) null);
            try {
                int o39 = gp0.o(o38, ApiProtocol.KEY_ID);
                int o40 = gp0.o(o38, "server_id");
                int o41 = gp0.o(o38, str52);
                int o42 = gp0.o(o38, str53);
                int o43 = gp0.o(o38, str51);
                int o44 = gp0.o(o38, str50);
                int o45 = gp0.o(o38, str47);
                int o46 = gp0.o(o38, str41);
                int o47 = gp0.o(o38, str40);
                int o48 = gp0.o(o38, str39);
                int o49 = gp0.o(o38, str38);
                int o50 = gp0.o(o38, str37);
                int o51 = gp0.o(o38, str35);
                pec = a5;
                try {
                    int o52 = gp0.o(o38, str33);
                    int o53 = gp0.o(o38, str32);
                    int o54 = gp0.o(o38, str31);
                    int o55 = gp0.o(o38, str30);
                    int o56 = gp0.o(o38, str29);
                    int o57 = gp0.o(o38, str28);
                    int o58 = gp0.o(o38, str27);
                    int o59 = gp0.o(o38, str26);
                    int o60 = gp0.o(o38, str25);
                    int o61 = gp0.o(o38, str24);
                    int o62 = gp0.o(o38, str23);
                    int o63 = gp0.o(o38, str22);
                    int o64 = gp0.o(o38, str21);
                    int o65 = gp0.o(o38, str20);
                    int o66 = gp0.o(o38, str19);
                    int o67 = gp0.o(o38, str18);
                    int o68 = gp0.o(o38, str17);
                    int o69 = gp0.o(o38, str16);
                    int o70 = gp0.o(o38, str15);
                    int o71 = gp0.o(o38, str14);
                    int o72 = gp0.o(o38, str13);
                    int o73 = gp0.o(o38, str12);
                    int o74 = gp0.o(o38, str11);
                    int i54 = o51;
                    arrayList = new ArrayList<>(o38.getCount());
                    while (o38.moveToNext()) {
                        long j18 = o38.getLong(o39);
                        long j19 = o38.getLong(o40);
                        long j20 = o38.getLong(o41);
                        long j21 = o38.getLong(o42);
                        long j22 = o38.getLong(o43);
                        long j23 = o38.getLong(o44);
                        String string3 = o38.isNull(o45) ? null : o38.getString(o45);
                        int i55 = o38.getInt(o46);
                        d2.a().getClass();
                        bp8.b.getClass();
                        bp8 t2 = s59.t(i55);
                        int i56 = o38.getInt(o47);
                        d2.a().getClass();
                        ls8 b4 = p29.b(i56);
                        long j24 = o38.getLong(o48);
                        String string4 = o38.isNull(o49) ? null : o38.getString(o49);
                        if (o38.isNull(o50)) {
                            i = i54;
                            str = null;
                        } else {
                            str = o38.getString(o50);
                            i = i54;
                        }
                        byte[] blob3 = o38.isNull(i) ? null : o38.getBlob(i);
                        d2.a().getClass();
                        jj7 b5 = fu7.b(blob3);
                        i54 = i;
                        int i57 = o52;
                        int i58 = o38.getInt(i57);
                        o52 = i57;
                        int i59 = o53;
                        o53 = i59;
                        boolean z5 = o38.getInt(i59) != 0;
                        int i60 = o54;
                        int i61 = o38.getInt(i60);
                        o54 = i60;
                        int i62 = o55;
                        long j25 = o38.getLong(i62);
                        o55 = i62;
                        int i63 = o56;
                        if (o38.getInt(i63) != 0) {
                            o56 = i63;
                            i2 = o57;
                            z2 = true;
                        } else {
                            o56 = i63;
                            i2 = o57;
                            z2 = false;
                        }
                        long j26 = o38.getLong(i2);
                        o57 = i2;
                        int i64 = o58;
                        if (o38.isNull(i64)) {
                            o58 = i64;
                            i3 = o59;
                            str2 = null;
                        } else {
                            str2 = o38.getString(i64);
                            o58 = i64;
                            i3 = o59;
                        }
                        if (o38.isNull(i3)) {
                            o59 = i3;
                            i4 = o60;
                            str3 = null;
                        } else {
                            str3 = o38.getString(i3);
                            o59 = i3;
                            i4 = o60;
                        }
                        long j27 = o38.getLong(i4);
                        o60 = i4;
                        int i65 = o61;
                        long j28 = o38.getLong(i65);
                        o61 = i65;
                        int i66 = o62;
                        int i67 = o38.getInt(i66);
                        d2.a().getClass();
                        int a6 = us8.a(i67);
                        o62 = i66;
                        int i68 = o63;
                        long j29 = o38.getLong(i68);
                        o63 = i68;
                        int i69 = o64;
                        int i70 = o38.getInt(i69);
                        o64 = i69;
                        int i71 = o65;
                        int i72 = o38.getInt(i71);
                        o65 = i71;
                        int i73 = o66;
                        int i74 = o38.getInt(i73);
                        o66 = i73;
                        int i75 = o67;
                        long j30 = o38.getLong(i75);
                        o67 = i75;
                        int i76 = o68;
                        int i77 = o38.getInt(i76);
                        o68 = i76;
                        int i78 = o69;
                        int i79 = o38.getInt(i78);
                        o69 = i78;
                        int i80 = o70;
                        long j31 = o38.getLong(i80);
                        o70 = i80;
                        int i81 = o71;
                        byte[] blob4 = o38.isNull(i81) ? null : o38.getBlob(i81);
                        d2.a().getClass();
                        List a7 = p29.a(blob4);
                        o71 = i81;
                        int i82 = o72;
                        if (o38.isNull(i82)) {
                            i5 = i82;
                            i6 = o39;
                            bArr = null;
                        } else {
                            i5 = i82;
                            bArr = o38.getBlob(i82);
                            i6 = o39;
                        }
                        yr8 c3 = d2.a().c(bArr);
                        int i83 = o73;
                        if (o38.isNull(i83)) {
                            i7 = o74;
                            l = null;
                        } else {
                            l = Long.valueOf(o38.getLong(i83));
                            i7 = o74;
                        }
                        Integer valueOf2 = o38.isNull(i7) ? null : Integer.valueOf(o38.getInt(i7));
                        if (valueOf2 == null) {
                            o73 = i83;
                            bool = null;
                        } else {
                            bool = Boolean.valueOf(valueOf2.intValue() != 0);
                            o73 = i83;
                        }
                        arrayList.add(new jp8(j18, j19, j20, j21, j22, j23, string3, t2, b4, j24, string4, str, b5, i58, z5, i61, j25, z2, j26, str2, str3, j27, j28, a6, j29, i70, i72, i74, j30, i77, i79, j31, a7, c3, l, bool));
                        o74 = i7;
                        o39 = i6;
                        o72 = i5;
                    }
                    o38.close();
                    pec.m();
                } catch (Throwable th3) {
                    th = th3;
                    o38.close();
                    pec.m();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                pec = a5;
                o38.close();
                pec.m();
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        for (jp8 b6 : arrayList) {
            arrayList2.add(b(b6));
        }
        return arrayList2;
    }

    public final void n(long j, of3 of3) {
        try {
            ((Number) this.a.m().p(new l36(this, j, of3))).intValue();
        } catch (Throwable th) {
            udd.s("RoomMessagesDatabase", "Can't update attach", th);
        }
    }

    public final int o(ym8 ym8, long j, boolean z, ls8 ls8) {
        int i;
        bp8 bp8 = bp8.SENT;
        or8 i2 = i(j, ym8, 0, z, 0, ls8);
        cw8 d2 = d();
        long j2 = ym8.Y;
        aec aec = d2.a;
        aec.c();
        try {
            jp8 h = d2.h(j, j2);
            if (h == null) {
                i = 0;
            } else {
                or8 g = cw8.g(d2, h, i2, j, (Long) null, Long.valueOf(j2), 8);
                d2.n(h.a, bp8);
                i = d2.l(g);
            }
            aec.r();
            return i;
        } finally {
            aec.l();
        }
    }

    public final int p(long j, long j2, ym8 ym8, boolean z) {
        int i;
        or8 i2 = i(j, ym8, j2, z, 0, (ls8) null);
        cw8 d2 = d();
        long j3 = ym8.a;
        aec aec = d2.a;
        aec.c();
        try {
            jp8 b2 = d2.b(j, j3);
            if (b2 == null) {
                i = 0;
            } else {
                i = d2.l(cw8.g(d2, b2, i2, j, Long.valueOf(j3), (Long) null, 16));
            }
            aec.r();
            return i;
        } finally {
            aec.l();
        }
    }

    public final void q(long j, Long l, Boolean bool) {
        cw8 d2 = d();
        aec aec = d2.a;
        aec.b();
        yv8 yv8 = d2.n;
        yz5 f = yv8.f();
        if (l == null) {
            f.W(1);
        } else {
            f.j(1, l.longValue());
        }
        Integer valueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
        if (valueOf == null) {
            f.W(2);
        } else {
            f.j(2, (long) valueOf.intValue());
        }
        f.j(3, j);
        try {
            aec.c();
            f.n();
            aec.r();
            aec.l();
            yv8.u(f);
        } catch (Throwable th) {
            yv8.u(f);
            throw th;
        }
    }
}
