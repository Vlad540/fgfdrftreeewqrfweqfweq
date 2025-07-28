package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: udc  reason: default package */
public final class udc {
    public final aec a;
    public final sh b;
    public final sh c;
    public final yv8 d;
    public final tdc e;
    public final tdc f;
    public final tdc g;
    public final tdc h;
    public final yv8 i;
    public final yv8 j;

    public udc(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 19);
        this.c = new sh(oneMeRoomDatabase, 20);
        new f74(oneMeRoomDatabase, 5);
        new yv8(oneMeRoomDatabase, 28);
        this.d = new yv8(oneMeRoomDatabase, 29);
        this.e = new tdc(oneMeRoomDatabase, 0);
        this.f = new tdc(oneMeRoomDatabase, 1);
        this.g = new tdc(oneMeRoomDatabase, 2);
        this.h = new tdc(oneMeRoomDatabase, 3);
        new yv8(oneMeRoomDatabase, 23);
        this.i = new yv8(oneMeRoomDatabase, 24);
        new yv8(oneMeRoomDatabase, 25);
        this.j = new yv8(oneMeRoomDatabase, 26);
        new yv8(oneMeRoomDatabase, 27);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(defpackage.udc r24, java.lang.String r25, kotlin.coroutines.Continuation r26) {
        /*
            r1 = r24
            r0 = r26
            boolean r2 = r0 instanceof defpackage.idc
            if (r2 == 0) goto L_0x0017
            r2 = r0
            idc r2 = (defpackage.idc) r2
            int r3 = r2.x0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x0 = r3
            goto L_0x001c
        L_0x0017:
            idc r2 = new idc
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.Z
            pu3 r3 = pu3.a
            int r4 = r2.x0
            r5 = 0
            r6 = 0
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0057
            if (r4 == r8) goto L_0x003d
            if (r4 != r7) goto L_0x0035
            java.lang.Object r1 = r2.o
            java.lang.String r1 = (java.lang.String) r1
            wx3.H(r0)
            goto L_0x00f1
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            java.lang.CharSequence r1 = r2.Y
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r4 = r2.X
            java.lang.Object r9 = r2.o
            udc r9 = (defpackage.udc) r9
            wx3.H(r0)     // Catch:{ all -> 0x0050 }
            r23 = r9
            r9 = r1
            r1 = r23
            goto L_0x007f
        L_0x0050:
            r0 = move-exception
            r23 = r9
            r9 = r1
            r1 = r23
            goto L_0x0097
        L_0x0057:
            wx3.H(r0)
            r2.o = r1     // Catch:{ all -> 0x0093 }
            r4 = r25
            r2.X = r4     // Catch:{ all -> 0x0091 }
            r2.Y = r5     // Catch:{ all -> 0x0091 }
            r2.x0 = r8     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "SELECT MAX(`order`) FROM chat_folder"
            pec r0 = pec.a(r6, r0)     // Catch:{ all -> 0x0091 }
            android.os.CancellationSignal r9 = new android.os.CancellationSignal     // Catch:{ all -> 0x0091 }
            r9.<init>()     // Catch:{ all -> 0x0091 }
            sdc r10 = new sdc     // Catch:{ all -> 0x0091 }
            r11 = 3
            r10.<init>(r1, r0, r11)     // Catch:{ all -> 0x0091 }
            aec r0 = r1.a     // Catch:{ all -> 0x0091 }
            java.lang.Object r0 = r1g.g(r0, r9, r10, r2)     // Catch:{ all -> 0x0091 }
            if (r0 != r3) goto L_0x007e
            return r3
        L_0x007e:
            r9 = r5
        L_0x007f:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x008d }
            long r10 = r0.longValue()     // Catch:{ all -> 0x008d }
            int r0 = (int) r10     // Catch:{ all -> 0x008d }
            java.lang.Integer r10 = new java.lang.Integer     // Catch:{ all -> 0x008d }
            r10.<init>(r0)     // Catch:{ all -> 0x008d }
        L_0x008b:
            r11 = r4
            goto L_0x009d
        L_0x008d:
            r0 = move-exception
            goto L_0x0097
        L_0x008f:
            r9 = r5
            goto L_0x0097
        L_0x0091:
            r0 = move-exception
            goto L_0x008f
        L_0x0093:
            r0 = move-exception
            r4 = r25
            goto L_0x008f
        L_0x0097:
            kcc r10 = new kcc
            r10.<init>(r0)
            goto L_0x008b
        L_0x009d:
            boolean r0 = r10 instanceof kcc
            if (r0 == 0) goto L_0x00a2
            r10 = r5
        L_0x00a2:
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x00aa
            int r6 = r10.intValue()
        L_0x00aa:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            hdc r4 = new hdc
            if (r9 == 0) goto L_0x00bc
            java.lang.String r9 = r9.toString()
            r12 = r9
            goto L_0x00bd
        L_0x00bc:
            r12 = r5
        L_0x00bd:
            int r13 = r6 + 1
            qw4 r14 = qw4.a
            r20 = 0
            r21 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 8064(0x1f80, float:1.13E-41)
            r9 = r4
            r10 = r0
            r9.<init>((java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (int) r13, (java.util.Set) r14, (boolean) r15, (boolean) r16, (java.util.List) r17, (java.lang.Long) r18, (java.util.Map) r19, (java.util.List) r20, (java.util.Set) r21, (int) r22)
            r2.o = r0
            r2.X = r5
            r2.Y = r5
            r2.x0 = r7
            r1.getClass()
            uh r5 = new uh
            r6 = 21
            r5.<init>(r1, r6, r4)
            aec r1 = r1.a
            java.lang.Object r1 = r1g.h(r1, r5, r2)
            if (r1 != r3) goto L_0x00f0
            return r3
        L_0x00f0:
            r1 = r0
        L_0x00f1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udc.a(udc, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object b(defpackage.udc r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.jdc
            if (r0 == 0) goto L_0x0013
            r0 = r7
            jdc r0 = (defpackage.jdc) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            jdc r0 = new jdc
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            wx3.H(r7)
            goto L_0x006b
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            java.lang.String r6 = r0.X
            udc r5 = r0.o
            wx3.H(r7)
            goto L_0x0052
        L_0x003a:
            wx3.H(r7)
            r0.o = r5
            r0.X = r6
            r0.w0 = r4
            qdc r7 = new qdc
            r2 = 0
            r7.<init>(r5, r6, r2)
            aec r2 = r5.a
            java.lang.Object r7 = r1g.h(r2, r7, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r7 = 0
            r0.o = r7
            r0.X = r7
            r0.w0 = r3
            r5.getClass()
            qdc r7 = new qdc
            r2 = 1
            r7.<init>(r5, r6, r2)
            aec r5 = r5.a
            java.lang.Object r5 = r1g.h(r5, r7, r0)
            if (r5 != r1) goto L_0x006b
            return r1
        L_0x006b:
            jue r5 = jue.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udc.b(udc, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object c(defpackage.udc r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.kdc
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kdc r0 = (defpackage.kdc) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            kdc r0 = new kdc
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            wx3.H(r6)
            goto L_0x0068
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            udc r5 = r0.o
            wx3.H(r6)
            goto L_0x0051
        L_0x0038:
            wx3.H(r6)
            r0.o = r5
            r0.Z = r4
            r5.getClass()
            pdc r6 = new pdc
            r2 = 0
            r6.<init>(r5, r2)
            aec r2 = r5.a
            java.lang.Object r6 = r1g.h(r2, r6, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r6 = 0
            r0.o = r6
            r0.Z = r3
            r5.getClass()
            pdc r6 = new pdc
            r2 = 1
            r6.<init>(r5, r2)
            aec r5 = r5.a
            java.lang.Object r5 = r1g.h(r5, r6, r0)
            if (r5 != r1) goto L_0x0068
            return r1
        L_0x0068:
            jue r5 = jue.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udc.c(udc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0163 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object f(defpackage.udc r26, java.util.List r27, java.util.Set r28, kotlin.coroutines.Continuation r29) {
        /*
            r0 = r26
            r1 = r29
            boolean r2 = r1 instanceof defpackage.ldc
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ldc r2 = (defpackage.ldc) r2
            int r3 = r2.A0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.A0 = r3
            goto L_0x001c
        L_0x0017:
            ldc r2 = new ldc
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.y0
            pu3 r3 = pu3.a
            int r4 = r2.A0
            r5 = 1
            r6 = 3
            r7 = 2
            if (r4 == 0) goto L_0x0077
            if (r4 == r5) goto L_0x0066
            if (r4 == r7) goto L_0x0051
            if (r4 != r6) goto L_0x0049
            int r0 = r2.x0
            java.util.Iterator r4 = r2.w0
            s72 r5 = r2.Z
            java.lang.Object r8 = r2.Y
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.util.Collection r9 = r2.X
            java.util.Set r9 = (java.util.Set) r9
            udc r10 = r2.o
            wx3.H(r1)
            r7 = r3
            r1 = r5
            r5 = r8
            r8 = r9
            r3 = r0
            r9 = r6
            r0 = r10
            goto L_0x0164
        L_0x0049:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0051:
            int r0 = r2.x0
            s72 r4 = r2.Z
            java.lang.Object r5 = r2.Y
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.util.Collection r8 = r2.X
            java.util.Set r8 = (java.util.Set) r8
            udc r9 = r2.o
            wx3.H(r1)
            r6 = r7
            r7 = r3
            goto L_0x011e
        L_0x0066:
            java.lang.Object r0 = r2.Y
            java.util.Set r0 = (java.util.Set) r0
            java.util.Collection r4 = r2.X
            java.util.List r4 = (java.util.List) r4
            udc r5 = r2.o
            wx3.H(r1)
            r1 = r4
            r4 = r0
            r0 = r5
            goto L_0x0096
        L_0x0077:
            wx3.H(r1)
            r2.o = r0
            r1 = r27
            r2.X = r1
            r4 = r28
            r2.Y = r4
            r2.A0 = r5
            e98 r5 = new e98
            r8 = 27
            r5.<init>(r8, r0)
            aec r8 = r0.a
            java.lang.Object r5 = a24.m0(r8, r5, r2)
            if (r5 != r3) goto L_0x0096
            return r3
        L_0x0096:
            java.util.Iterator r1 = r1.iterator()
            r5 = 0
            r12 = r5
            r5 = r1
        L_0x009d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0172
            java.lang.Object r1 = r5.next()
            int r15 = r12 + 1
            if (r12 < 0) goto L_0x016d
            s72 r1 = (defpackage.s72) r1
            hdc r13 = new hdc
            java.lang.String r8 = r1.a
            boolean r16 = r4.contains(r8)
            java.util.List r8 = r1.w0
            java.util.ArrayList r17 = defpackage.fu7.u(r8)
            long r8 = r1.x0
            java.lang.Long r18 = java.lang.Long.valueOf(r8)
            java.util.List r11 = r1.z0
            r21 = 4096(0x1000, float:5.74E-42)
            java.lang.String r9 = r1.a
            java.lang.String r10 = r1.b
            java.lang.String r8 = r1.c
            java.util.Set r14 = r1.Y
            boolean r6 = r1.Z
            java.util.Map r7 = r1.y0
            r22 = r3
            java.util.Set r3 = r1.A0
            r19 = r8
            r8 = r13
            r20 = r11
            r11 = r19
            r23 = r13
            r13 = r14
            r14 = r16
            r24 = r15
            r15 = r6
            r16 = r17
            r17 = r18
            r18 = r7
            r19 = r20
            r20 = r3
            r8.<init>((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12, (java.util.Set) r13, (boolean) r14, (boolean) r15, (java.util.List) r16, (java.lang.Long) r17, (java.util.Map) r18, (java.util.List) r19, (java.util.Set) r20, (int) r21)
            r2.o = r0
            r2.X = r4
            r2.Y = r5
            r2.Z = r1
            r3 = 0
            r2.w0 = r3
            r12 = r24
            r2.x0 = r12
            r6 = 2
            r2.A0 = r6
            r0.getClass()
            uh r3 = new uh
            r7 = 21
            r8 = r23
            r3.<init>(r0, r7, r8)
            aec r7 = r0.a
            java.lang.Object r3 = r1g.h(r7, r3, r2)
            r7 = r22
            if (r3 != r7) goto L_0x011a
            return r7
        L_0x011a:
            r9 = r0
            r8 = r4
            r0 = r12
            r4 = r1
        L_0x011e:
            java.util.Set r1 = r4.o
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
            r0 = r9
            r25 = r4
            r4 = r1
            r1 = r25
        L_0x012b:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0166
            java.lang.Object r9 = r4.next()
            java.lang.Number r9 = (java.lang.Number) r9
            long r12 = r9.longValue()
            java.lang.String r14 = r1.a
            r2.o = r0
            r2.X = r8
            r2.Y = r5
            r2.Z = r1
            r2.w0 = r4
            r2.x0 = r3
            r9 = 3
            r2.A0 = r9
            r0.getClass()
            lm4 r15 = new lm4
            r16 = 2
            r10 = r15
            r11 = r0
            r6 = r15
            r15 = r16
            r10.<init>((java.lang.Object) r11, (long) r12, (java.lang.String) r14, (int) r15)
            aec r10 = r0.a
            java.lang.Object r6 = r1g.h(r10, r6, r2)
            if (r6 != r7) goto L_0x0164
            return r7
        L_0x0164:
            r6 = 2
            goto L_0x012b
        L_0x0166:
            r12 = r3
            r3 = r7
            r4 = r8
            r7 = r6
            r6 = 3
            goto L_0x009d
        L_0x016d:
            r3 = 0
            p23.G()
            throw r3
        L_0x0172:
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udc.f(udc, java.util.List, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object g(defpackage.udc r22, java.lang.String r23, int r24, kotlin.coroutines.Continuation r25) {
        /*
            r0 = r22
            r1 = r25
            boolean r2 = r1 instanceof defpackage.mdc
            if (r2 == 0) goto L_0x0017
            r2 = r1
            mdc r2 = (defpackage.mdc) r2
            int r3 = r2.x0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x0 = r3
            goto L_0x001c
        L_0x0017:
            mdc r2 = new mdc
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Z
            pu3 r3 = pu3.a
            int r4 = r2.x0
            r5 = 1
            if (r4 == 0) goto L_0x003d
            if (r4 != r5) goto L_0x0035
            int r0 = r2.Y
            java.lang.String r3 = r2.X
            udc r2 = r2.o
            wx3.H(r1)
            r4 = r0
            r0 = r2
            r2 = r1
            r1 = r3
            goto L_0x0053
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            wx3.H(r1)
            r2.o = r0
            r1 = r23
            r2.X = r1
            r4 = r24
            r2.Y = r4
            r2.x0 = r5
            java.lang.Object r2 = r0.d(r2)
            if (r2 != r3) goto L_0x0053
            return r3
        L_0x0053:
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            int r2 = p23.A(r3)
            jue r6 = jue.a
            if (r4 <= r2) goto L_0x0063
            return r6
        L_0x0063:
            java.util.Iterator r2 = r3.iterator()
            r7 = 0
            r8 = r7
        L_0x0069:
            boolean r9 = r2.hasNext()
            r10 = -1
            if (r9 == 0) goto L_0x0082
            java.lang.Object r9 = r2.next()
            hdc r9 = (defpackage.hdc) r9
            java.lang.String r9 = r9.a
            boolean r9 = hhd.f(r9, r1)
            if (r9 == 0) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            int r8 = r8 + 1
            goto L_0x0069
        L_0x0082:
            r8 = r10
        L_0x0083:
            if (r8 == r10) goto L_0x0087
            if (r8 != r4) goto L_0x008b
        L_0x0087:
            r24 = r6
            goto L_0x0118
        L_0x008b:
            if (r4 < r8) goto L_0x0096
            int r4 = r4 + r5
            java.util.List r1 = r3.subList(r8, r4)
            java.util.Collections.rotate(r1, r10)
            goto L_0x009e
        L_0x0096:
            int r8 = r8 + r5
            java.util.List r1 = r3.subList(r4, r8)
            java.util.Collections.rotate(r1, r5)
        L_0x009e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = q23.H(r3, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
            r12 = r7
        L_0x00ae:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00fd
            java.lang.Object r3 = r2.next()
            int r7 = r12 + 1
            if (r12 < 0) goto L_0x00f8
            hdc r3 = (defpackage.hdc) r3
            java.lang.String r9 = r3.a
            hdc r4 = new hdc
            java.lang.String r10 = r3.b
            java.lang.String r11 = r3.c
            java.util.Set r13 = r3.e
            boolean r14 = r3.f
            boolean r15 = r3.g
            java.util.List r5 = r3.h
            java.lang.Long r8 = r3.i
            r22 = r2
            java.util.Map r2 = r3.j
            r23 = r7
            java.util.List r7 = r3.k
            r24 = r6
            java.util.Set r6 = r3.l
            boolean r3 = r3.m
            r17 = r8
            r8 = r4
            r16 = r5
            r18 = r2
            r19 = r7
            r20 = r6
            r21 = r3
            r8.<init>((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12, (java.util.Set) r13, (boolean) r14, (boolean) r15, (java.util.List) r16, (java.lang.Long) r17, (java.util.Map) r18, (java.util.List) r19, (java.util.Set) r20, (boolean) r21)
            r1.add(r4)
            r2 = r22
            r12 = r23
            r6 = r24
            goto L_0x00ae
        L_0x00f8:
            p23.G()
            r0 = 0
            throw r0
        L_0x00fd:
            r24 = r6
            aec r2 = r0.a
            r2.b()
            r2.c()
            sh r0 = r0.b     // Catch:{ all -> 0x0113 }
            r0.B(r1)     // Catch:{ all -> 0x0113 }
            r2.r()     // Catch:{ all -> 0x0113 }
            r2.l()
            return r24
        L_0x0113:
            r0 = move-exception
            r2.l()
            throw r0
        L_0x0118:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udc.g(udc, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d(Continuation continuation) {
        pec a2 = pec.a(0, "SELECT * FROM chat_folder");
        return r1g.g(this.a, new CancellationSignal(), new sdc(this, a2, 1), continuation);
    }

    public final ArrayList e(String str) {
        pec a2 = pec.a(1, "SELECT chatId FROM folder_and_chats WHERE folderId = ?");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        aec aec = this.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
            }
            return arrayList;
        } finally {
            o.close();
            a2.m();
        }
    }
}
