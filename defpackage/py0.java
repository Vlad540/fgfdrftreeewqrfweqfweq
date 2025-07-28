package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;

/* renamed from: py0  reason: default package */
public final class py0 implements vx0 {
    public static final /* synthetic */ k77[] G0;
    public final r7e A0;
    public final r7e B0;
    public final hcd C0;
    public final hcd D0;
    public final grd E0;
    public final grd F0;
    public final r7e X = new r7e(new by0(this, 1));
    public final AtomicReference Y = new AtomicReference(new bs(0));
    public final grd Z;
    public final ro1 a;
    public final km1 b;
    public final t97 c;
    public final t97 o;
    public final grd w0;
    public final AtomicBoolean x0;
    public qod y0;
    public final e3 z0;

    static {
        hc9 hc9 = new hc9(py0.class, "usersUpdateJob", "getUsersUpdateJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        G0 = new k77[]{hc9};
    }

    public py0(t97 t97, t97 t972, t97 t973, t97 t974, ro1 ro1, t97 t975, km1 km1) {
        this.a = ro1;
        this.b = km1;
        this.c = t97;
        this.o = t975;
        grd a2 = hrd.a(iw4.a);
        this.Z = a2;
        this.w0 = a2;
        this.x0 = new AtomicBoolean(false);
        this.z0 = hwf.t();
        this.A0 = new r7e(new ey0(this, t972, t973, t974, t97));
        this.B0 = new r7e(new by0(this, 2));
        hcd a3 = icd.a(1, 1, 2);
        this.C0 = a3;
        this.D0 = a3;
        grd a4 = hrd.a(ea.h);
        this.E0 = a4;
        this.F0 = a4;
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [kgd, yr, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.py0 r20, defpackage.bs r21, kotlin.coroutines.Continuation r22) {
        /*
            r0 = r20
            r1 = r22
            r20.getClass()
            boolean r2 = r1 instanceof defpackage.ny0
            if (r2 == 0) goto L_0x001a
            r2 = r1
            ny0 r2 = (defpackage.ny0) r2
            int r3 = r2.D0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.D0 = r3
            goto L_0x001f
        L_0x001a:
            ny0 r2 = new ny0
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.B0
            pu3 r3 = defpackage.pu3.a
            int r4 = r2.D0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x006e
            if (r4 == r7) goto L_0x0059
            if (r4 != r6) goto L_0x0051
            long r8 = r2.A0
            yr r0 = r2.z0
            java.util.Iterator r4 = r2.y0
            java.lang.Object r10 = r2.x0
            bs r10 = (defpackage.bs) r10
            java.lang.Object r11 = r2.w0
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r12 = r2.Z
            mc9 r13 = r2.Y
            bs r14 = r2.X
            py0 r15 = r2.o
            defpackage.wx3.H(r1)
            r5 = r4
            r4 = r2
            r2 = r0
            r0 = r15
            r18 = r13
            r13 = r6
            r6 = r18
            goto L_0x01b3
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0059:
            java.lang.Object r0 = r2.x0
            yr r0 = (defpackage.yr) r0
            java.lang.Object r4 = r2.w0
            bs r4 = (defpackage.bs) r4
            java.lang.Object r8 = r2.Z
            mc9 r9 = r2.Y
            bs r10 = r2.X
            py0 r11 = r2.o
            defpackage.wx3.H(r1)
            goto L_0x0163
        L_0x006e:
            defpackage.wx3.H(r1)
            grd r1 = r0.Z
            r9 = r1
            r1 = r21
        L_0x0076:
            java.lang.Object r8 = r9.getValue()
            r4 = r8
            java.util.Map r4 = (java.util.Map) r4
            yr r10 = new yr
            r11 = 0
            r10.<init>(r11)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x008b:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x00c2
            java.lang.Object r12 = r4.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getValue()
            vl1 r13 = (defpackage.vl1) r13
            boolean r13 = r13.c()
            if (r13 != 0) goto L_0x008b
            java.lang.Object r13 = r12.getKey()
            le1 r13 = (defpackage.le1) r13
            long r13 = r13.a
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r13)
            boolean r13 = r1.contains(r15)
            if (r13 == 0) goto L_0x008b
            java.lang.Object r13 = r12.getKey()
            java.lang.Object r12 = r12.getValue()
            r10.put(r13, r12)
            goto L_0x008b
        L_0x00c2:
            bs r4 = new bs
            r4.<init>((int) r11)
            r1.getClass()
            ur r11 = new ur
            r11.<init>((defpackage.bs) r1)
        L_0x00cf:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x012e
            java.lang.Object r12 = r11.next()
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = r10.c
            r14.<init>(r15)
            java.util.Set r15 = r10.entrySet()
            tr r15 = (defpackage.tr) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x00f0:
            r16 = r15
            wr r16 = (defpackage.wr) r16
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0114
            r16.next()
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16
            java.lang.Object r16 = r16.getKey()
            r6 = r16
            le1 r6 = (defpackage.le1) r6
            long r5 = r6.a
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r14.add(r7)
            r6 = 2
            r7 = 1
            goto L_0x00f0
        L_0x0114:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r12)
            boolean r5 = r14.contains(r5)
            if (r5 != 0) goto L_0x0125
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r12)
            goto L_0x0126
        L_0x0125:
            r5 = 0
        L_0x0126:
            if (r5 == 0) goto L_0x012b
            r4.add(r5)
        L_0x012b:
            r6 = 2
            r7 = 1
            goto L_0x00cf
        L_0x012e:
            km1 r5 = r0.b
            r2.o = r0
            r2.X = r1
            r2.Y = r9
            r2.Z = r8
            r2.w0 = r4
            r2.x0 = r10
            r6 = 0
            r2.y0 = r6
            r2.z0 = r6
            r7 = 1
            r2.D0 = r7
            t97 r7 = r5.c
            java.lang.Object r7 = r7.getValue()
            pae r7 = (pae) r7
            n3a r7 = (defpackage.n3a) r7
            ju3 r7 = r7.b()
            hm1 r11 = new hm1
            r11.<init>(r4, r5, r6)
            java.lang.Object r5 = defpackage.xs7.U(r7, r11, r2)
            if (r5 != r3) goto L_0x015f
            goto L_0x022c
        L_0x015f:
            r11 = r0
            r0 = r10
            r10 = r1
            r1 = r5
        L_0x0163:
            java.util.Map r1 = (java.util.Map) r1
            bs r5 = new bs
            r5.<init>((defpackage.bs) r4)
            java.util.Set r4 = r1.keySet()
            java.util.Iterator r4 = r4.iterator()
            r12 = r8
            r18 = r1
            r1 = r0
            r0 = r11
            r11 = r18
        L_0x0179:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01ca
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            km1 r8 = r0.b
            r2.o = r0
            r2.X = r10
            r2.Y = r9
            r2.Z = r12
            r2.w0 = r11
            r2.x0 = r5
            r2.y0 = r4
            r2.z0 = r1
            r2.A0 = r6
            r13 = 2
            r2.D0 = r13
            java.lang.Object r8 = r8.a(r6, r2)
            if (r8 != r3) goto L_0x01a8
            goto L_0x022c
        L_0x01a8:
            r14 = r10
            r10 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r8
            r18 = r6
            r6 = r9
            r8 = r18
        L_0x01b3:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x01c3
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r8)
            r10.remove(r1)
        L_0x01c3:
            r1 = r2
            r2 = r4
            r4 = r5
            r9 = r6
            r5 = r10
            r10 = r14
            goto L_0x0179
        L_0x01ca:
            r13 = 2
            boolean r4 = r5.isEmpty()
            r6 = 1
            r4 = r4 ^ r6
            if (r4 == 0) goto L_0x01e0
            ro1 r4 = r0.a
            oy0 r7 = new oy0
            r8 = 0
            r7.<init>(r0, r5, r8)
            r5 = 3
            defpackage.xs7.E(r4, r8, r8, r7, r5)
            goto L_0x01e1
        L_0x01e0:
            r8 = 0
        L_0x01e1:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = defpackage.ju7.S(r5)
            r4.<init>(r5)
            java.util.Set r5 = r11.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x01f6:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x021c
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r11 = r7.getKey()
            java.lang.Number r11 = (java.lang.Number) r11
            long r14 = r11.longValue()
            ru.ok.android.externcalls.sdk.id.ParticipantId r11 = defpackage.xja.c(r14)
            le1 r11 = defpackage.xja.b(r11)
            java.lang.Object r7 = r7.getValue()
            r4.put(r11, r7)
            goto L_0x01f6
        L_0x021c:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            r5.putAll(r4)
            boolean r1 = r9.b(r12, r5)
            if (r1 == 0) goto L_0x022d
            jue r3 = defpackage.jue.a
        L_0x022c:
            return r3
        L_0x022d:
            r7 = r6
            r1 = r10
            r6 = r13
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.b(py0, bs, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static boolean h(k88 k88) {
        return k88 != k88.c;
    }

    public final void c(le1 le1, boolean z) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "CallAdminSettingsController", "Update user from waiting room " + le1 + " with apply state=" + z, (Throwable) null);
        }
        ParticipantId d = xja.d(le1);
        if (z) {
            Conversation a2 = d().a();
            if (a2 != null) {
                a2.promoteParticipant(d, true);
            }
        } else {
            Conversation a3 = d().a();
            if (a3 != null) {
                a3.removeParticipant(d);
            }
        }
        if (!z) {
            this.Y.getAndUpdate(new zx0(2, le1));
            j();
        }
    }

    public final bt3 d() {
        return (bt3) this.c.getValue();
    }

    public final MediaMuteManager e() {
        Conversation a2 = d().a();
        if (a2 != null) {
            return a2.getMediaMuteManager();
        }
        return null;
    }

    public final ParticipantStatesManager f() {
        Conversation a2 = d().a();
        if (a2 != null) {
            return a2.getParticipantStatesManager();
        }
        return null;
    }

    public final ConversationFeatureManager g() {
        Conversation a2 = d().a();
        if (a2 != null) {
            return a2.getFeatureManager();
        }
        return null;
    }

    public final void i(boolean z) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "CallAdminSettingsController", us8.k("Screen record change state to ", z), (Throwable) null);
        }
        e51 e51 = e51.b;
        if (z) {
            ConversationFeatureManager g = g();
            if (g != null) {
                ConversationFeatureManager.enableFeatureForAll$default(g, e51, (s16) null, (u16) null, 6, (Object) null);
                return;
            }
            return;
        }
        ConversationFeatureManager g2 = g();
        if (g2 != null) {
            ConversationFeatureManager.enableFeatureForRoles$default(g2, e51, z3d.N(je1.b, je1.a), (s16) null, (u16) null, 12, (Object) null);
        }
    }

    public final void j() {
        qod E = xs7.E(this.a, (hu3) null, (ru3) null, new my0(this, (Continuation) null), 3);
        this.z0.o1(this, G0[0], E);
    }

    public final void onParticipantsAdded(List list) {
        this.Y.getAndUpdate(new zx0(0, list));
        j();
    }

    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        grd grd;
        Object value;
        ea eaVar;
        boolean z;
        ConversationParticipant me2;
        py0.super.onRolesChanged(conversationParticipant);
        ParticipantId participantId = null;
        ParticipantId externalId = conversationParticipant != null ? conversationParticipant.getExternalId() : null;
        Conversation a2 = d().a();
        if (!(a2 == null || (me2 = a2.getMe()) == null)) {
            participantId = me2.getExternalId();
        }
        if (hhd.f(externalId, participantId)) {
            do {
                grd = this.E0;
                value = grd.getValue();
                eaVar = (ea) value;
                z = false;
                boolean isAdmin = conversationParticipant != null ? conversationParticipant.isAdmin() : false;
                boolean isCreator = conversationParticipant != null ? conversationParticipant.isCreator() : false;
                if (isAdmin || isCreator) {
                    z = true;
                }
            } while (!grd.b(value, ea.a(eaVar, z, false, false, false, false, false, 126)));
        }
    }

    public final void onWaitingRoomEnabledChanged(boolean z) {
        Object value;
        py0.super.onWaitingRoomEnabledChanged(z);
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "CallAdminSettingsController", us8.k("Waiting room change state updating ", z), (Throwable) null);
        }
        grd grd = this.E0;
        do {
            value = grd.getValue();
        } while (!grd.b(value, ea.a((ea) value, false, false, false, false, false, z, 63)));
    }

    public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        py0.super.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        this.Y.getAndUpdate(new zx0(1, waitingRoomParticipantsUpdate));
        j();
    }
}
