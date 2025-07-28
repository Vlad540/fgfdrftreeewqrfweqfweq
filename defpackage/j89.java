package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: j89  reason: default package */
public final class j89 extends ol implements qce, tna {
    public static final /* synthetic */ int A0 = 0;
    public final long X;
    public final List Y;
    public final List Z;
    public final long o;
    public final j63 w0;
    public final boolean x0;
    public final md4 y0;
    public final boolean z0;

    public j89(long j, long j2, long j3, List list, List list2, j63 j63, boolean z, md4 md4, boolean z2) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = list;
        this.Z = list2;
        this.w0 = j63;
        this.x0 = z;
        this.y0 = md4;
        this.z0 = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: pl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: pl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: pl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: android.os.CancellationSignal} */
    /* JADX WARNING: type inference failed for: r5v14, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.lbe r104) {
        /*
            r103 = this;
            r0 = r103
            r1 = r104
            k89 r1 = (defpackage.k89) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r1 = r1.o
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r3 = r1.hasNext()
            java.util.List r4 = r0.Y
            r5 = 0
            if (r3 == 0) goto L_0x0041
            java.lang.Object r3 = r1.next()
            java.lang.Number r3 = (java.lang.Number) r3
            long r6 = r3.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.util.List r6 = r0.Z
            int r3 = r6.indexOf(r3)
            if (r3 < 0) goto L_0x003b
            java.lang.Object r3 = r4.get(r3)
            r5 = r3
            java.lang.Long r5 = (java.lang.Long) r5
        L_0x003b:
            if (r5 == 0) goto L_0x0015
            r2.add(r5)
            goto L_0x0015
        L_0x0041:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            r1.removeAll(r2)
            boolean r3 = r1.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            long r6 = r0.o
            if (r3 == 0) goto L_0x0077
            r0.u(r1)
            md4 r1 = defpackage.md4.REGULAR
            md4 r3 = r0.y0
            if (r3 != r1) goto L_0x0077
            pl r1 = r0.c
            if (r1 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r1 = r5
        L_0x0062:
            to8 r1 = r1.d()
            vo8 r1 = r1.p(r6, r3)
            pl r3 = r0.c
            if (r3 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r3 = r5
        L_0x0070:
            t52 r3 = r3.c()
            r3.k0(r6, r1, r4)
        L_0x0077:
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ r4
            boolean r3 = r0.z0
            if (r1 == 0) goto L_0x04be
            pl r1 = r0.c
            if (r1 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r1 = r5
        L_0x0086:
            t52 r1 = r1.c()
            i22 r1 = r1.B(r6)
            if (r1 == 0) goto L_0x04be
            o62 r1 = r1.b
            long r8 = r1.x
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            boolean r8 = r2.contains(r8)
            r9 = 0
            r10 = 0
            if (r8 == 0) goto L_0x00b7
            pl r8 = r0.c
            if (r8 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r8 = r5
        L_0x00a7:
            t52 r8 = r8.c()
            r8.getClass()
            f00 r12 = new f00
            r13 = 4
            r12.<init>(r10, r13)
            r8.h(r6, r9, r12)
        L_0x00b7:
            if (r3 == 0) goto L_0x00bb
            goto L_0x04df
        L_0x00bb:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r12 = r2.iterator()
        L_0x00c4:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0486
            java.lang.Object r13 = r12.next()
            java.lang.Number r13 = (java.lang.Number) r13
            long r13 = r13.longValue()
            pl r15 = r0.c
            if (r15 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r15 = r5
        L_0x00da:
            to8 r15 = r15.d()
            a04 r15 = r15.a
            hz3 r15 = (defpackage.hz3) r15
            nec r15 = r15.c
            cw8 r9 = r15.d()
            r9.getClass()
            java.lang.String r10 = "SELECT * FROM messages WHERE msg_link_id = ?"
            pec r10 = pec.a(r4, r10)
            r10.j(r4, r13)
            aec r11 = r9.a
            r11.b()
            android.database.Cursor r11 = r11.o(r10, r5)
            java.lang.String r5 = "id"
            int r5 = defpackage.gp0.o(r11, r5)     // Catch:{ all -> 0x047c }
            java.lang.String r4 = "server_id"
            int r4 = defpackage.gp0.o(r11, r4)     // Catch:{ all -> 0x047c }
            r16 = r12
            java.lang.String r12 = "time"
            int r12 = defpackage.gp0.o(r11, r12)     // Catch:{ all -> 0x047c }
            r17 = r6
            java.lang.String r6 = "update_time"
            int r6 = defpackage.gp0.o(r11, r6)     // Catch:{ all -> 0x047c }
            java.lang.String r7 = "sender"
            int r7 = defpackage.gp0.o(r11, r7)     // Catch:{ all -> 0x047c }
            java.lang.String r0 = "cid"
            int r0 = defpackage.gp0.o(r11, r0)     // Catch:{ all -> 0x047c }
            r19 = r3
            java.lang.String r3 = "text"
            int r3 = defpackage.gp0.o(r11, r3)     // Catch:{ all -> 0x047c }
            r20 = r1
            java.lang.String r1 = "delivery_status"
            int r1 = defpackage.gp0.o(r11, r1)     // Catch:{ all -> 0x047c }
            r21 = r2
            java.lang.String r2 = "status"
            int r2 = defpackage.gp0.o(r11, r2)     // Catch:{ all -> 0x047c }
            r22 = r8
            java.lang.String r8 = "time_local"
            int r8 = defpackage.gp0.o(r11, r8)     // Catch:{ all -> 0x047c }
            r23 = r13
            java.lang.String r13 = "error"
            int r13 = defpackage.gp0.o(r11, r13)     // Catch:{ all -> 0x047c }
            java.lang.String r14 = "localized_error"
            int r14 = defpackage.gp0.o(r11, r14)     // Catch:{ all -> 0x047c }
            r25 = r15
            java.lang.String r15 = "attaches"
            int r15 = defpackage.gp0.o(r11, r15)     // Catch:{ all -> 0x047c }
            r26 = r10
            java.lang.String r10 = "media_type"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r27 = r10
            java.lang.String r10 = "detect_share"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r28 = r10
            java.lang.String r10 = "msg_link_type"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r29 = r10
            java.lang.String r10 = "msg_link_id"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r30 = r10
            java.lang.String r10 = "inserted_from_msg_link"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r31 = r10
            java.lang.String r10 = "msg_link_chat_id"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r32 = r10
            java.lang.String r10 = "msg_link_chat_name"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r33 = r10
            java.lang.String r10 = "msg_link_chat_link"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r34 = r10
            java.lang.String r10 = "msg_link_out_chat_id"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r35 = r10
            java.lang.String r10 = "msg_link_out_msg_id"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r36 = r10
            java.lang.String r10 = "type"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r37 = r10
            java.lang.String r10 = "chat_id"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r38 = r10
            java.lang.String r10 = "ttl"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r39 = r10
            java.lang.String r10 = "channel_views"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r40 = r10
            java.lang.String r10 = "channel_forwards"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r41 = r10
            java.lang.String r10 = "view_time"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r42 = r10
            java.lang.String r10 = "zoom"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r43 = r10
            java.lang.String r10 = "options"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r44 = r10
            java.lang.String r10 = "live_until"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r45 = r10
            java.lang.String r10 = "elements"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r46 = r10
            java.lang.String r10 = "reactions"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r47 = r10
            java.lang.String r10 = "delayed_attrs_time_to_fire"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r48 = r10
            java.lang.String r10 = "delayed_attrs_notify_sender"
            int r10 = defpackage.gp0.o(r11, r10)     // Catch:{ all -> 0x041d }
            r49 = r10
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x041d }
            r50 = r15
            int r15 = r11.getCount()     // Catch:{ all -> 0x041d }
            r10.<init>(r15)     // Catch:{ all -> 0x041d }
        L_0x0220:
            boolean r15 = r11.moveToNext()     // Catch:{ all -> 0x041d }
            if (r15 == 0) goto L_0x041f
            long r52 = r11.getLong(r5)     // Catch:{ all -> 0x041d }
            long r54 = r11.getLong(r4)     // Catch:{ all -> 0x041d }
            long r56 = r11.getLong(r12)     // Catch:{ all -> 0x041d }
            long r58 = r11.getLong(r6)     // Catch:{ all -> 0x041d }
            long r60 = r11.getLong(r7)     // Catch:{ all -> 0x041d }
            long r62 = r11.getLong(r0)     // Catch:{ all -> 0x041d }
            boolean r15 = r11.isNull(r3)     // Catch:{ all -> 0x041d }
            if (r15 == 0) goto L_0x0247
            r64 = 0
            goto L_0x024d
        L_0x0247:
            java.lang.String r15 = r11.getString(r3)     // Catch:{ all -> 0x041d }
            r64 = r15
        L_0x024d:
            int r15 = r11.getInt(r1)     // Catch:{ all -> 0x041d }
            p29 r51 = r9.a()     // Catch:{ all -> 0x041d }
            r51.getClass()     // Catch:{ all -> 0x041d }
            s59 r51 = defpackage.bp8.b     // Catch:{ all -> 0x041d }
            r51.getClass()     // Catch:{ all -> 0x041d }
            bp8 r65 = defpackage.s59.t(r15)     // Catch:{ all -> 0x041d }
            int r15 = r11.getInt(r2)     // Catch:{ all -> 0x041d }
            p29 r51 = r9.a()     // Catch:{ all -> 0x041d }
            r51.getClass()     // Catch:{ all -> 0x041d }
            ls8 r66 = defpackage.p29.b(r15)     // Catch:{ all -> 0x041d }
            long r67 = r11.getLong(r8)     // Catch:{ all -> 0x041d }
            boolean r15 = r11.isNull(r13)     // Catch:{ all -> 0x041d }
            if (r15 == 0) goto L_0x027d
            r69 = 0
            goto L_0x0283
        L_0x027d:
            java.lang.String r15 = r11.getString(r13)     // Catch:{ all -> 0x041d }
            r69 = r15
        L_0x0283:
            boolean r15 = r11.isNull(r14)     // Catch:{ all -> 0x041d }
            if (r15 == 0) goto L_0x028e
            r15 = r50
            r70 = 0
            goto L_0x0296
        L_0x028e:
            java.lang.String r15 = r11.getString(r14)     // Catch:{ all -> 0x041d }
            r70 = r15
            r15 = r50
        L_0x0296:
            boolean r50 = r11.isNull(r15)     // Catch:{ all -> 0x041d }
            if (r50 == 0) goto L_0x029f
            r50 = 0
            goto L_0x02a3
        L_0x029f:
            byte[] r50 = r11.getBlob(r15)     // Catch:{ all -> 0x041d }
        L_0x02a3:
            p29 r51 = r9.a()     // Catch:{ all -> 0x041d }
            r51.getClass()     // Catch:{ all -> 0x041d }
            jj7 r71 = defpackage.fu7.b(r50)     // Catch:{ all -> 0x041d }
            r50 = r0
            r0 = r27
            int r72 = r11.getInt(r0)     // Catch:{ all -> 0x041d }
            r27 = r0
            r0 = r28
            int r28 = r11.getInt(r0)     // Catch:{ all -> 0x041d }
            if (r28 == 0) goto L_0x02c7
            r28 = r0
            r0 = r29
            r73 = 1
            goto L_0x02cd
        L_0x02c7:
            r28 = r0
            r0 = r29
            r73 = 0
        L_0x02cd:
            int r74 = r11.getInt(r0)     // Catch:{ all -> 0x041d }
            r29 = r0
            r0 = r30
            long r75 = r11.getLong(r0)     // Catch:{ all -> 0x041d }
            r30 = r0
            r0 = r31
            int r31 = r11.getInt(r0)     // Catch:{ all -> 0x041d }
            if (r31 == 0) goto L_0x02ea
            r31 = r0
            r0 = r32
            r77 = 1
            goto L_0x02f0
        L_0x02ea:
            r31 = r0
            r0 = r32
            r77 = 0
        L_0x02f0:
            long r78 = r11.getLong(r0)     // Catch:{ all -> 0x041d }
            r32 = r0
            r0 = r33
            boolean r33 = r11.isNull(r0)     // Catch:{ all -> 0x041d }
            if (r33 == 0) goto L_0x0305
            r33 = r0
            r0 = r34
            r80 = 0
            goto L_0x030f
        L_0x0305:
            java.lang.String r33 = r11.getString(r0)     // Catch:{ all -> 0x041d }
            r80 = r33
            r33 = r0
            r0 = r34
        L_0x030f:
            boolean r34 = r11.isNull(r0)     // Catch:{ all -> 0x041d }
            if (r34 == 0) goto L_0x031c
            r34 = r0
            r0 = r35
            r81 = 0
            goto L_0x0326
        L_0x031c:
            java.lang.String r34 = r11.getString(r0)     // Catch:{ all -> 0x041d }
            r81 = r34
            r34 = r0
            r0 = r35
        L_0x0326:
            long r82 = r11.getLong(r0)     // Catch:{ all -> 0x041d }
            r35 = r0
            r0 = r36
            long r84 = r11.getLong(r0)     // Catch:{ all -> 0x041d }
            r36 = r0
            r0 = r37
            int r37 = r11.getInt(r0)     // Catch:{ all -> 0x041d }
            p29 r51 = r9.a()     // Catch:{ all -> 0x041d }
            r51.getClass()     // Catch:{ all -> 0x041d }
            int r86 = defpackage.us8.a(r37)     // Catch:{ all -> 0x041d }
            r37 = r0
            r0 = r38
            long r87 = r11.getLong(r0)     // Catch:{ all -> 0x041d }
            r38 = r0
            r0 = r39
            int r89 = r11.getInt(r0)     // Catch:{ all -> 0x041d }
            r39 = r0
            r0 = r40
            int r90 = r11.getInt(r0)     // Catch:{ all -> 0x041d }
            r40 = r0
            r0 = r41
            int r91 = r11.getInt(r0)     // Catch:{ all -> 0x041d }
            r41 = r0
            r0 = r42
            long r92 = r11.getLong(r0)     // Catch:{ all -> 0x041d }
            r42 = r0
            r0 = r43
            int r94 = r11.getInt(r0)     // Catch:{ all -> 0x041d }
            r43 = r0
            r0 = r44
            int r95 = r11.getInt(r0)     // Catch:{ all -> 0x041d }
            r44 = r0
            r0 = r45
            long r96 = r11.getLong(r0)     // Catch:{ all -> 0x041d }
            r45 = r0
            r0 = r46
            boolean r46 = r11.isNull(r0)     // Catch:{ all -> 0x041d }
            if (r46 == 0) goto L_0x0392
            r46 = 0
            goto L_0x0396
        L_0x0392:
            byte[] r46 = r11.getBlob(r0)     // Catch:{ all -> 0x041d }
        L_0x0396:
            p29 r51 = r9.a()     // Catch:{ all -> 0x041d }
            r51.getClass()     // Catch:{ all -> 0x041d }
            java.util.List r98 = defpackage.p29.a(r46)     // Catch:{ all -> 0x041d }
            r46 = r0
            r0 = r47
            boolean r47 = r11.isNull(r0)     // Catch:{ all -> 0x041d }
            if (r47 == 0) goto L_0x03b1
            r102 = r0
            r47 = r1
            r0 = 0
            goto L_0x03bb
        L_0x03b1:
            byte[] r47 = r11.getBlob(r0)     // Catch:{ all -> 0x041d }
            r102 = r0
            r0 = r47
            r47 = r1
        L_0x03bb:
            p29 r1 = r9.a()     // Catch:{ all -> 0x041d }
            yr8 r99 = r1.c(r0)     // Catch:{ all -> 0x041d }
            r0 = r48
            boolean r1 = r11.isNull(r0)     // Catch:{ all -> 0x041d }
            if (r1 == 0) goto L_0x03d0
            r1 = r49
            r100 = 0
            goto L_0x03dc
        L_0x03d0:
            long r100 = r11.getLong(r0)     // Catch:{ all -> 0x041d }
            java.lang.Long r1 = java.lang.Long.valueOf(r100)     // Catch:{ all -> 0x041d }
            r100 = r1
            r1 = r49
        L_0x03dc:
            boolean r48 = r11.isNull(r1)     // Catch:{ all -> 0x041d }
            if (r48 == 0) goto L_0x03e5
            r48 = 0
            goto L_0x03ed
        L_0x03e5:
            int r48 = r11.getInt(r1)     // Catch:{ all -> 0x041d }
            java.lang.Integer r48 = java.lang.Integer.valueOf(r48)     // Catch:{ all -> 0x041d }
        L_0x03ed:
            if (r48 != 0) goto L_0x03f4
            r48 = r0
            r101 = 0
            goto L_0x0407
        L_0x03f4:
            int r48 = r48.intValue()     // Catch:{ all -> 0x041d }
            if (r48 == 0) goto L_0x03fd
            r48 = 1
            goto L_0x03ff
        L_0x03fd:
            r48 = 0
        L_0x03ff:
            java.lang.Boolean r48 = java.lang.Boolean.valueOf(r48)     // Catch:{ all -> 0x041d }
            r101 = r48
            r48 = r0
        L_0x0407:
            jp8 r0 = new jp8     // Catch:{ all -> 0x041d }
            r51 = r0
            r51.<init>(r52, r54, r56, r58, r60, r62, r64, r65, r66, r67, r69, r70, r71, r72, r73, r74, r75, r77, r78, r80, r81, r82, r84, r86, r87, r89, r90, r91, r92, r94, r95, r96, r98, r99, r100, r101)     // Catch:{ all -> 0x041d }
            r10.add(r0)     // Catch:{ all -> 0x041d }
            r49 = r1
            r1 = r47
            r0 = r50
            r47 = r102
            r50 = r15
            goto L_0x0220
        L_0x041d:
            r0 = move-exception
            goto L_0x047f
        L_0x041f:
            r11.close()
            r26.m()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = q23.H(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r10.iterator()
        L_0x0434:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x044a
            java.lang.Object r2 = r1.next()
            jp8 r2 = (defpackage.jp8) r2
            r3 = r25
            vo8 r2 = r3.b(r2)
            r0.add(r2)
            goto L_0x0434
        L_0x044a:
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x046d
            java.lang.Long r0 = java.lang.Long.valueOf(r23)
            r1 = r22
            r1.add(r0)
            r0 = r103
            r8 = r1
            r12 = r16
            r6 = r17
            r3 = r19
            r1 = r20
            r2 = r21
        L_0x0466:
            r4 = 1
            r5 = 0
            r9 = 0
            r10 = 0
            goto L_0x00c4
        L_0x046d:
            r0 = r103
            r12 = r16
            r6 = r17
            r3 = r19
            r1 = r20
            r2 = r21
            r8 = r22
            goto L_0x0466
        L_0x047c:
            r0 = move-exception
            r26 = r10
        L_0x047f:
            r11.close()
            r26.m()
            throw r0
        L_0x0486:
            r20 = r1
            r0 = r2
            r19 = r3
            r17 = r6
            r1 = r8
            r0.removeAll(r1)
            r1 = r20
            long r1 = r1.L
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x04c3
            java.util.Iterator r3 = r0.iterator()
        L_0x049f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b5
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x049f
            goto L_0x04b6
        L_0x04b5:
            r4 = 0
        L_0x04b6:
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x04c3
            r0.remove(r4)
            goto L_0x04c3
        L_0x04be:
            r0 = r2
            r19 = r3
            r17 = r6
        L_0x04c3:
            if (r19 != 0) goto L_0x04df
            boolean r1 = r0.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x04df
            r1 = r103
            pl r1 = r1.c
            if (r1 == 0) goto L_0x04d5
            r5 = r1
            goto L_0x04d6
        L_0x04d5:
            r5 = 0
        L_0x04d6:
            to8 r1 = r5.d()
            r2 = r17
            r1.c(r2, r0)
        L_0x04df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j89.c(lbe):void");
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            plVar.b().c(new jh0(this.a, uae));
        }
    }

    public final int e() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.c().B(this.o) != null ? 1 : 3;
    }

    public final void f() {
        udd.q("j89", "onMaxFailCount");
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.e().d(this.a);
        u(this.Y);
    }

    public final byte[] g() {
        Tasks.MsgDelete msgDelete = new Tasks.MsgDelete();
        msgDelete.requestId = this.a;
        msgDelete.chatId = this.o;
        msgDelete.chatServerId = this.X;
        msgDelete.messagesId = ek8.n(this.Y);
        msgDelete.messagesServerId = ek8.n(this.Z);
        msgDelete.forMe = this.x0;
        msgDelete.itemTypeId = this.y0.a;
        msgDelete.notDeleteMessageFromDb = this.z0;
        j63 j63 = this.w0;
        if (j63 != null) {
            msgDelete.complaint = j63.a;
        }
        return gr8.toByteArray(msgDelete);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_MSG_DELETE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        pl plVar = this.c;
        pn2 pn2 = null;
        if (plVar == null) {
            plVar = null;
        }
        i22 B = plVar.c().B(this.o);
        if (B != null) {
            boolean z = !B.G() && this.x0;
            pn2 = new pn2(dfa.MSG_DELETE, 18);
            pn2.n(this.X, ApiProtocol.PARAM_CHAT_ID);
            pn2.h("messageIds", o23.s0(this.Z));
            j63 j63 = this.w0;
            if (j63 != null) {
                pn2.s("complaint", j63.a);
            }
            pn2.d("forMe", z);
            pn2.s("itemType", this.y0.name());
        }
        return pn2;
    }

    public final void u(List list) {
        int size = list.size();
        udd.q("j89", "returnToActiveMessages, messageIds = " + size);
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        to8 d = plVar.d();
        ((hz3) d.a).c.d().o(this.o, list, ls8.ACTIVE);
    }
}
