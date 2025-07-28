package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: lec  reason: default package */
public final class lec extends l5e implements i26 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ long B0;
    public final /* synthetic */ long C0;
    public final /* synthetic */ int D0;
    public final /* synthetic */ boolean E0;
    public nec X;
    public Collection Y;
    public Iterator Z;
    public Collection w0;
    public int x0;
    public final /* synthetic */ md4 y0;
    public final /* synthetic */ nec z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lec(md4 md4, nec nec, long j, long j2, long j3, int i, boolean z, Continuation continuation) {
        super(2, continuation);
        this.y0 = md4;
        this.z0 = nec;
        this.A0 = j;
        this.B0 = j2;
        this.C0 = j3;
        this.D0 = i;
        this.E0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lec(this.y0, this.z0, this.A0, this.B0, this.C0, this.D0, this.E0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pu3 r1 = pu3.a
            int r2 = r0.x0
            nec r4 = r0.z0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r7) goto L_0x0033
            if (r2 == r6) goto L_0x002c
            if (r2 != r5) goto L_0x0024
            java.util.Collection r2 = r0.w0
            java.util.Iterator r3 = r0.Z
            java.util.Collection r4 = r0.Y
            nec r6 = r0.X
            wx3.H(r18)
            r7 = r6
            r6 = r5
            r5 = r18
            goto L_0x0158
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002c:
            wx3.H(r18)
            r2 = r18
            goto L_0x00b5
        L_0x0033:
            wx3.H(r18)
            r2 = r18
            goto L_0x0122
        L_0x003a:
            wx3.H(r18)
            md4 r2 = r0.y0
            int r2 = r2.ordinal()
            boolean r10 = r0.E0
            int r11 = r0.D0
            long r12 = r0.C0
            long r14 = r0.B0
            long r8 = r0.A0
            if (r2 == 0) goto L_0x00be
            if (r2 != r7) goto L_0x00b8
            cw8 r2 = r4.d()
            r0.x0 = r6
            aec r3 = r2.a
            if (r10 == 0) goto L_0x0087
            java.lang.String r10 = "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?"
            r5 = 5
            pec r10 = pec.a(r5, r10)
            r10.j(r7, r8)
            r10.j(r6, r14)
            r6 = 3
            defpackage.us8.n(r10, r6, r12, r2)
            r6 = 10
            long r7 = (long) r6
            r6 = 4
            r10.j(r6, r7)
            long r6 = (long) r11
            r10.j(r5, r6)
            android.os.CancellationSignal r5 = new android.os.CancellationSignal
            r5.<init>()
            aw8 r6 = new aw8
            r7 = 5
            r6.<init>(r2, r10, r7)
            java.lang.Object r2 = r1g.g(r3, r5, r6, r0)
            goto L_0x00b2
        L_0x0087:
            java.lang.String r5 = "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?"
            r10 = 5
            pec r5 = pec.a(r10, r5)
            r5.j(r7, r8)
            r5.j(r6, r14)
            r6 = 3
            defpackage.us8.n(r5, r6, r12, r2)
            r6 = 10
            long r7 = (long) r6
            r6 = 4
            r5.j(r6, r7)
            long r6 = (long) r11
            r5.j(r10, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            aw8 r7 = new aw8
            r8 = 6
            r7.<init>(r2, r5, r8)
            java.lang.Object r2 = r1g.g(r3, r6, r7, r0)
        L_0x00b2:
            if (r2 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            java.util.List r2 = (java.util.List) r2
            goto L_0x0124
        L_0x00b8:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00be:
            cw8 r2 = r4.d()
            r0.x0 = r7
            aec r3 = r2.a
            if (r10 == 0) goto L_0x00f4
            java.lang.String r5 = "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC, time_local DESC LIMIT ?"
            r10 = 5
            pec r5 = pec.a(r10, r5)
            r5.j(r7, r8)
            r5.j(r6, r14)
            r6 = 3
            defpackage.us8.n(r5, r6, r12, r2)
            r6 = 10
            long r7 = (long) r6
            r6 = 4
            r5.j(r6, r7)
            long r6 = (long) r11
            r5.j(r10, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            aw8 r7 = new aw8
            r8 = 4
            r7.<init>(r2, r5, r8)
            java.lang.Object r2 = r1g.g(r3, r6, r7, r0)
            goto L_0x011f
        L_0x00f4:
            java.lang.String r5 = "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC, time_local ASC LIMIT ?"
            r10 = 5
            pec r5 = pec.a(r10, r5)
            r5.j(r7, r8)
            r5.j(r6, r14)
            r6 = 3
            defpackage.us8.n(r5, r6, r12, r2)
            r6 = 10
            long r7 = (long) r6
            r6 = 4
            r5.j(r6, r7)
            long r6 = (long) r11
            r5.j(r10, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            aw8 r7 = new aw8
            r8 = 3
            r7.<init>(r2, r5, r8)
            java.lang.Object r2 = r1g.g(r3, r6, r7, r0)
        L_0x011f:
            if (r2 != r1) goto L_0x0122
            return r1
        L_0x0122:
            java.util.List r2 = (java.util.List) r2
        L_0x0124:
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = q23.H(r2, r5)
            r3.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
            r16 = r3
            r3 = r2
            r2 = r16
        L_0x0138:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0160
            java.lang.Object r5 = r3.next()
            jp8 r5 = (defpackage.jp8) r5
            r0.X = r4
            r0.Y = r2
            r0.Z = r3
            r0.w0 = r2
            r6 = 3
            r0.x0 = r6
            java.lang.Object r5 = r4.h(r5, r0)
            if (r5 != r1) goto L_0x0156
            return r1
        L_0x0156:
            r7 = r4
            r4 = r2
        L_0x0158:
            vo8 r5 = (defpackage.vo8) r5
            r2.add(r5)
            r2 = r4
            r4 = r7
            goto L_0x0138
        L_0x0160:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lec.o(java.lang.Object):java.lang.Object");
    }
}
