package defpackage;

import android.app.Application;
import android.content.Intent;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.calls.impl.service.CallServiceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* renamed from: ep1  reason: default package */
public final class ep1 implements so1 {
    public static final /* synthetic */ k77[] K;
    public final t97 A;
    public final t97 B;
    public final t97 C;
    public qod D;
    public final e3 E;
    public boolean F;
    public final LinkedHashSet G = new LinkedHashSet();
    public final grd H;
    public final grd I;
    public final wo1 J;
    public final ro1 a;
    public final l21 b;
    public final kp1 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final t97 i;
    public final t97 j;
    public final t97 k;
    public final t97 l;
    public final t97 m;
    public final t97 n;
    public final t97 o;
    public final t97 p;
    public final t97 q;
    public final t97 r;
    public final t97 s;
    public final t97 t;
    public final t97 u;
    public final t97 v;
    public final t97 w;
    public final t97 x;
    public final t97 y;
    public final t97 z;

    static {
        hc9 hc9 = new hc9(ep1.class, "cameraTrackerJob", "getCameraTrackerJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        K = new k77[]{hc9};
    }

    public ep1(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978, t97 t979, t97 t9710, t97 t9711, t97 t9712, t97 t9713, t97 t9714, t97 t9715, t97 t9716, t97 t9717, t97 t9718, t97 t9719, t97 t9720, t97 t9721, t97 t9722, t97 t9723, t97 t9724, t97 t9725, ro1 ro1, l21 l21, kp1 kp1, t97 t9726, t97 t9727) {
        ro1 ro12 = ro1;
        this.a = ro12;
        this.b = l21;
        this.c = kp1;
        this.d = t97;
        this.e = t973;
        this.f = t974;
        this.g = t975;
        this.h = t976;
        this.i = t978;
        this.j = t9710;
        this.k = t9712;
        this.l = t977;
        this.m = t979;
        this.n = t9711;
        this.o = t9715;
        this.p = t9713;
        this.q = t9716;
        this.r = t9717;
        this.s = t972;
        this.t = t9719;
        this.u = t9722;
        this.v = t9720;
        this.w = t9721;
        this.x = t9723;
        this.y = t9724;
        this.z = t9726;
        this.A = t9727;
        this.B = t9714;
        this.C = t9725;
        e3 t2 = hwf.t();
        this.E = t2;
        grd a2 = hrd.a(zw3.k);
        this.H = a2;
        this.I = a2;
        this.J = new wo1(this, t977, t976, t972, t97);
        ((q0a) t9718.getValue()).getClass();
        t2.o1(this, K[0], xs7.E(ro12, ((pae) t9717.getValue()).b(), (ru3) null, new vo1(this, (Continuation) null), 2));
        ez3.N(new ck5(new zi1(new zi1(((oka) t()).A0, 4), 3), new dp1(this, (Continuation) null), 5), ro12);
    }

    public static final void a(ep1 ep1, Throwable th) {
        grd grd;
        Object value;
        zw3 j2;
        int i2;
        int i3;
        String message;
        ep1 ep12 = ep1;
        Exception exc = th;
        ep1.getClass();
        udd.u("CallEngineTag", exc, "can't start call", new Object[0]);
        do {
            grd = ep12.H;
            value = grd.getValue();
            zw3 zw3 = (zw3) value;
            j2 = ep1.j();
            i2 = 4;
            String str = null;
            if (exc instanceof ApiInvocationException) {
                ete ete = ep1.j().a;
                if (ete != null && (!(ete instanceof vk1))) {
                    iq1 m2 = ep1.m();
                    String str2 = ep1.k().c;
                    int i4 = ((ApiInvocationException) exc).a;
                    m2.getClass();
                    iq1.c(m2, "GROUP_CALL_JOIN_FAILED", str2, (String) null, (Integer) null, (String) null, String.valueOf(i4), true, 28);
                }
                String message2 = ((ApiInvocationException) exc).getMessage();
                i3 = message2 == null ? 0 : (h0e.R(message2, "privacy.violation", false) || h0e.R(message2, "call.blocked", false)) ? 3 : 4;
                vp1 s2 = ep1.s();
                if (i3 != 0) {
                    switch (i3) {
                        case 1:
                            str = "UNAVAILABLE";
                            break;
                        case 2:
                            str = "BUSY";
                            break;
                        case 3:
                            str = "PRIVACY";
                            break;
                        case 4:
                            str = "FAILED";
                            break;
                        case 5:
                            str = "CONNECTION_ERROR";
                            break;
                        case 6:
                            str = "REMOVE_FROM_CALL";
                            break;
                        case 7:
                            str = "REMOVE_FROM_WAITING_ROOM";
                            break;
                        default:
                            throw null;
                    }
                }
                s2.a(str);
            } else {
                if ((exc instanceof IllegalStateException) && (message = th.getMessage()) != null && h0e.R(message, "endpoint is null", false)) {
                    ep1.s().a((String) null);
                }
                i3 = 0;
            }
            if (i3 != 0) {
                i2 = i3;
            }
        } while (!grd.b(value, zw3.a(j2, (ete) null, 0, (String) null, (String) null, false, false, false, (o3b) null, new u55(i2), 511)));
        ep1.z();
        if (exc instanceof IOException) {
            exc = new Exception(rf0.h("Can't create a call due to error: ", th.getMessage()), exc);
        }
        ((pv3) ep12.t.getValue()).a("ONEME-6833", exc);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: hw4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: hw4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: hw4} */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r12v0, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(defpackage.ep1 r30, ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r31) {
        /*
            r1 = r30
            r2 = r31
            zw3 r0 = r30.k()
            java.lang.String r5 = r0.c
            zw3 r0 = r30.k()
            boolean r0 = r0.g
            zw3 r3 = r30.k()
            ete r3 = r3.a
            r13 = 1
            if (r3 == 0) goto L_0x0021
            boolean r3 = r3.P()
            if (r3 != r13) goto L_0x0021
            r3 = 2
            goto L_0x0022
        L_0x0021:
            r3 = r13
        L_0x0022:
            boolean r14 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Hangup
            r15 = 0
            java.lang.String r4 = "ERROR"
            java.lang.String r6 = "BUSY"
            java.lang.String r7 = "REJECTED"
            if (r14 == 0) goto L_0x0031
            java.lang.String r8 = "HUNGUP"
        L_0x002f:
            r9 = r15
            goto L_0x0077
        L_0x0031:
            boolean r8 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Rejected
            if (r8 == 0) goto L_0x004e
            if (r0 == 0) goto L_0x004a
            t97 r8 = r1.y
            java.lang.Object r8 = r8.getValue()
            qna r8 = (qna) r8
            java.lang.String[] r9 = qna.h
            boolean r8 = r8.b(r9)
            if (r8 != 0) goto L_0x004a
            java.lang.String r8 = "no_permission"
            goto L_0x004b
        L_0x004a:
            r8 = r15
        L_0x004b:
            r9 = r8
            r8 = r7
            goto L_0x0077
        L_0x004e:
            boolean r8 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.RemovedFromCall
            if (r8 == 0) goto L_0x0055
            java.lang.String r8 = "KICK_BY_ADMIN"
            goto L_0x002f
        L_0x0055:
            boolean r8 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Busy
            if (r8 == 0) goto L_0x005b
            r8 = r6
            goto L_0x002f
        L_0x005b:
            boolean r8 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Canceled
            if (r8 == 0) goto L_0x0062
            java.lang.String r8 = "CANCELED"
            goto L_0x002f
        L_0x0062:
            boolean r8 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Error
            if (r8 == 0) goto L_0x0074
            r8 = r2
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Error r8 = (ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Error) r8
            java.lang.Throwable r8 = r8.getThrowable()
            java.lang.String r8 = r8.getMessage()
            r9 = r8
            r8 = r4
            goto L_0x0077
        L_0x0074:
            java.lang.String r8 = "OTHER"
            goto L_0x002f
        L_0x0077:
            r11 = 0
            if (r0 == 0) goto L_0x0080
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0090
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L_0x0090
        L_0x0088:
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r8.equals(r4)
            if (r0 == 0) goto L_0x00ae
        L_0x0090:
            iq1 r0 = r30.m()
            r0.getClass()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "INCOMING_CALL_RECEIVED"
            r16 = 80
            r10 = 0
            r17 = 0
            r3 = r0
            r6 = r8
            r8 = r10
            r10 = r17
            r12 = r11
            r11 = r16
            iq1.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00d1
        L_0x00ae:
            r12 = r11
            iq1 r3 = r30.m()
            zw3 r0 = r30.j()
            ete r0 = r0.a
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r0 instanceof defpackage.vk1
            r0 = r0 ^ r13
            if (r0 != r13) goto L_0x00c2
            r10 = r13
            goto L_0x00c3
        L_0x00c2:
            r10 = r12
        L_0x00c3:
            r3.getClass()
            java.lang.String r4 = "FINISH_CALL"
            r11 = 24
            r7 = 0
            r0 = 0
            r6 = r8
            r8 = r0
            iq1.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00d1:
            ru.ok.android.externcalls.sdk.Conversation r3 = r30.o()
            if (r3 == 0) goto L_0x0491
            t97 r4 = r1.g
            java.lang.Object r0 = r4.getValue()
            r5 = r0
            dq4 r5 = (defpackage.dq4) r5
            zw3 r0 = r30.j()
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x00ea
            goto L_0x024d
        L_0x00ea:
            t97 r0 = r1.w
            java.lang.Object r0 = r0.getValue()
            xzc r0 = (xzc) r0
            vqc r0 = (vqc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.call-rate
            java.lang.String r6 = r0.v(r6, r15)
            if (r6 != 0) goto L_0x0101
            goto L_0x024d
        L_0x0101:
            r7 = 10
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0120 }
            r0.<init>(r6)     // Catch:{ all -> 0x0120 }
            java.lang.String r8 = "limit"
            int r8 = r0.optInt(r8, r7)     // Catch:{ all -> 0x0120 }
            java.lang.String r9 = "sdk-limit"
            int r9 = r0.optInt(r9, r7)     // Catch:{ all -> 0x0120 }
            java.lang.String r10 = "duration"
            int r0 = r0.optInt(r10, r7)     // Catch:{ all -> 0x0120 }
            txb r10 = new txb     // Catch:{ all -> 0x0120 }
            r10.<init>(r8, r9, r0)     // Catch:{ all -> 0x0120 }
            goto L_0x0126
        L_0x0120:
            r0 = move-exception
            kcc r10 = new kcc
            r10.<init>(r0)
        L_0x0126:
            java.lang.Throwable r0 = defpackage.mcc.a(r10)
            if (r0 == 0) goto L_0x013c
            java.lang.String r0 = "invalid rate call params json config "
            java.lang.String r0 = r0.concat(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            java.lang.String r8 = "RateCallParams"
            defpackage.udd.s(r8, r0, r6)
        L_0x013c:
            boolean r0 = r10 instanceof defpackage.kcc
            if (r0 == 0) goto L_0x0141
            r10 = r15
        L_0x0141:
            txb r10 = (defpackage.txb) r10
            if (r10 != 0) goto L_0x0147
            goto L_0x024d
        L_0x0147:
            t97 r0 = r1.v
            java.lang.Object r6 = r0.getValue()
            ip r6 = (ip) r6
            kp r6 = (kp) r6
            x97 r6 = r6.g
            java.lang.String r8 = "call.rate.indicator"
            int r6 = r6.getInt(r8, r12)
            ru.ok.android.externcalls.sdk.rate.RateManager r9 = r3.getRateManager()
            boolean r9 = r9.getShouldRateConversation()
            if (r9 == 0) goto L_0x0166
            int r9 = r10.b
            goto L_0x0168
        L_0x0166:
            int r9 = r10.a
        L_0x0168:
            int r9 = r9 - r6
            if (r9 > r13) goto L_0x023b
            ru.ok.android.externcalls.sdk.rate.RateManager r6 = r3.getRateManager()
            boolean r6 = r6.getShouldRateConversation()
            if (r6 == 0) goto L_0x019e
            ru.ok.android.externcalls.sdk.rate.RateManager r6 = r3.getRateManager()
            java.util.List r6 = r6.getRateHints()
            java.util.ArrayList r9 = new java.util.ArrayList
            int r7 = defpackage.q23.H(r6, r7)
            r9.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x018a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01a0
            java.lang.Object r7 = r6.next()
            ru.ok.android.externcalls.sdk.rate.RateHint r7 = (ru.ok.android.externcalls.sdk.rate.RateHint) r7
            java.lang.String r7 = r7.getReason()
            r9.add(r7)
            goto L_0x018a
        L_0x019e:
            hw4 r9 = defpackage.hw4.a
        L_0x01a0:
            boolean r6 = r3.isGroupCall()
            if (r6 != 0) goto L_0x024d
            boolean r6 = r10.d
            if (r6 != 0) goto L_0x01ac
            goto L_0x024d
        L_0x01ac:
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Hangup r6 = ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Hangup.INSTANCE
            boolean r6 = defpackage.hhd.f(r2, r6)
            if (r6 == 0) goto L_0x024d
            grd r5 = r5.e
            java.lang.Object r5 = r5.getValue()
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x024d
            long r5 = r5.longValue()
            int r7 = r10.c
            long r10 = (long) r7
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x024d
            t97 r5 = r1.o
            java.lang.Object r5 = r5.getValue()
            xp1 r5 = (defpackage.xp1) r5
            java.lang.String r6 = r3.getConversationId()
            boolean r7 = r1.F
            if (r7 != 0) goto L_0x01e2
            boolean r7 = r3.isInitialVideoEnabled()
            if (r7 == 0) goto L_0x01e0
            goto L_0x01e2
        L_0x01e0:
            r11 = r12
            goto L_0x01e3
        L_0x01e2:
            r11 = r13
        L_0x01e3:
            t97 r7 = r5.c
            java.lang.Object r7 = r7.getValue()
            kdf r7 = (kdf) r7
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x024d
            t97 r5 = r5.b
            java.lang.Object r5 = r5.getValue()
            h91 r5 = (defpackage.h91) r5
            r5.getClass()
            android.content.Intent r7 = new android.content.Intent
            android.app.Application r10 = r5.c()
            java.lang.Class<one.me.android.calls.CallNotifierFixActivity> r15 = one.me.android.calls.CallNotifierFixActivity.class
            r7.<init>(r10, r15)
            java.lang.String r10 = "action-rate-call"
            r7.setAction(r10)
            java.lang.String r10 = "call_id"
            r7.putExtra(r10, r6)
            java.lang.String r6 = "is_video"
            r7.putExtra(r6, r11)
            java.lang.String[] r6 = new java.lang.String[r12]
            java.lang.Object[] r6 = r9.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            java.lang.String r9 = "sdk_reasons"
            r7.putExtra(r9, r6)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r7.setFlags(r6)
            android.app.Application r5 = r5.c()
            r5.startActivity(r7)
            java.lang.Object r0 = r0.getValue()
            ip r0 = (ip) r0
            kp r0 = (kp) r0
            r0.j(r12, r8)
            goto L_0x024d
        L_0x023b:
            java.lang.Object r0 = r0.getValue()
            ip r0 = (ip) r0
            kp r0 = (kp) r0
            x97 r5 = r0.g
            int r5 = r5.getInt(r8, r12)
            int r5 = r5 + r13
            r0.j(r5, r8)
        L_0x024d:
            java.lang.Object r0 = r4.getValue()
            dq4 r0 = (defpackage.dq4) r0
        L_0x0253:
            grd r4 = r0.d
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            java.lang.Long r6 = (java.lang.Long) r6
            r6 = 0
            boolean r4 = r4.b(r5, r6)
            if (r4 == 0) goto L_0x0253
            qod r4 = r0.b
            if (r4 == 0) goto L_0x026a
            r4.cancel((java.util.concurrent.CancellationException) r6)
        L_0x026a:
            r0.b = r6
            fdc r0 = r30.u()
            r0.c()
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Missed
            grd r4 = r1.H
            if (r0 == 0) goto L_0x02af
        L_0x0279:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            zw3 r2 = (defpackage.zw3) r2
            zw3 r14 = r30.j()
            u55 r2 = new u55
            r2.<init>(r13)
            r21 = 0
            r25 = 511(0x1ff, float:7.16E-43)
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = r2
            zw3 r2 = defpackage.zw3.a(r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x0279
            fdc r0 = r30.u()
            r0.b()
            goto L_0x0491
        L_0x02af:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Rejected
            if (r0 == 0) goto L_0x02f8
        L_0x02b3:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            zw3 r2 = (defpackage.zw3) r2
            zw3 r14 = r30.j()
            u55 r2 = new u55
            r2.<init>(r13)
            r21 = 0
            r25 = 511(0x1ff, float:7.16E-43)
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = r2
            zw3 r2 = defpackage.zw3.a(r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x02b3
            fdc r0 = r30.u()
            r0.getClass()
            edc r1 = defpackage.edc.BUSY
            r0.c = r1
            cg1 r0 = r0.a()
            bg1 r1 = r0.b
            za6 r1 = r1.f
            r0.a(r1, r12)
            goto L_0x0491
        L_0x02f8:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Busy
            if (r0 == 0) goto L_0x0343
        L_0x02fc:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            zw3 r2 = (defpackage.zw3) r2
            zw3 r18 = r30.j()
            u55 r2 = new u55
            r5 = 2
            r2.<init>(r5)
            r25 = 0
            r29 = 511(0x1ff, float:7.16E-43)
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = r2
            zw3 r2 = defpackage.zw3.a(r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x02fc
            fdc r0 = r30.u()
            r0.getClass()
            edc r1 = defpackage.edc.BUSY
            r0.c = r1
            cg1 r0 = r0.a()
            bg1 r1 = r0.b
            za6 r1 = r1.f
            r0.a(r1, r12)
            goto L_0x0491
        L_0x0343:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.RemovedFromCall
            if (r0 == 0) goto L_0x0398
        L_0x0347:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            zw3 r2 = (defpackage.zw3) r2
            zw3 r5 = r30.j()
            b65 r2 = r5.j
            boolean r2 = r2 instanceof defpackage.a65
            if (r2 == 0) goto L_0x036e
            u55 r15 = new u55
            r2 = 7
            r15.<init>(r2)
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            zw3 r2 = defpackage.zw3.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0383
        L_0x036e:
            u55 r15 = new u55
            r2 = 6
            r15.<init>(r2)
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            zw3 r2 = defpackage.zw3.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0383:
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x0347
            boolean r0 = r3.isAnswered()
            if (r0 == 0) goto L_0x0491
            fdc r0 = r30.u()
            r0.b()
            goto L_0x0491
        L_0x0398:
            v55 r17 = defpackage.v55.b
            if (r14 != 0) goto L_0x0462
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.EndedForAll
            if (r0 != 0) goto L_0x0462
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Canceled
            if (r0 != 0) goto L_0x0462
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.AcceptedOnAnotherDevice
            if (r0 == 0) goto L_0x03aa
            goto L_0x0462
        L_0x03aa:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.ConversationAlreadyEnded
            if (r0 != 0) goto L_0x041e
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.CallTimeout
            if (r0 != 0) goto L_0x041e
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Error
            if (r0 != 0) goto L_0x041e
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.ObsoleteClient
            if (r0 != 0) goto L_0x041e
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Unknown
            if (r0 == 0) goto L_0x03bf
            goto L_0x041e
        L_0x03bf:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.PeerConnectionTimeout
            if (r0 != 0) goto L_0x03ce
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.SignalingTimeout
            if (r0 == 0) goto L_0x03c8
            goto L_0x03ce
        L_0x03c8:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03ce:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            zw3 r2 = (defpackage.zw3) r2
            zw3 r5 = r30.j()
            u55 r15 = new u55
            r2 = 5
            r15.<init>(r2)
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            zw3 r2 = defpackage.zw3.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x03ce
            iq1 r5 = r30.m()
            java.lang.String r7 = r3.getConversationId()
            boolean r12 = r3.isGroupCall()
            r5.getClass()
            r10 = 0
            r11 = 0
            java.lang.String r6 = "BAD_CONNECTION_ALERT"
            java.lang.String r8 = "DISCONNECT"
            r9 = 0
            r13 = 56
            iq1.c(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r3.isAnswered()
            if (r0 == 0) goto L_0x0491
            fdc r0 = r30.u()
            r0.b()
            goto L_0x0491
        L_0x041e:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            zw3 r2 = (defpackage.zw3) r2
            zw3 r5 = r30.j()
            boolean r2 = r5.g
            if (r2 == 0) goto L_0x043f
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = r17
            zw3 r2 = defpackage.zw3.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0454
        L_0x043f:
            u55 r15 = new u55
            r2 = 4
            r15.<init>(r2)
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            zw3 r2 = defpackage.zw3.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0454:
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x041e
            fdc r0 = r30.u()
            r0.c()
            goto L_0x0491
        L_0x0462:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            zw3 r2 = (defpackage.zw3) r2
            zw3 r5 = r30.j()
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = r17
            zw3 r2 = defpackage.zw3.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x0462
            boolean r0 = r3.isAnswered()
            if (r0 == 0) goto L_0x0491
            fdc r0 = r30.u()
            r0.b()
        L_0x0491:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep1.b(ep1, ru.ok.android.externcalls.sdk.events.end.ConversationEndReason):void");
    }

    public static final void c(ep1 ep1) {
        Object value;
        zw3 j2;
        grd grd = ep1.H;
        do {
            value = grd.getValue();
            zw3 zw3 = (zw3) value;
            j2 = ep1.j();
            if (!j2.f) {
                ep1.B(true);
            }
            Conversation a2 = ep1.n().a();
            ParticipantCollection participants = a2 != null ? a2.getParticipants() : null;
            if (participants == null) {
                participants = hw4.a;
            }
            boolean z2 = j2.h;
            boolean z3 = (z2 || participants.size() <= 2) ? z2 : true;
            boolean z4 = j2.e;
            boolean z5 = (z4 || !ep1.x(participants)) ? z4 : true;
            if (!(z5 == z4 && z3 == z2)) {
                j2 = zw3.a(j2, (ete) null, 0, (String) null, (String) null, z5, false, z3, (o3b) null, (b65) null, 879);
            }
        } while (!grd.b(value, j2));
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [l7c, java.lang.Object] */
    public final void A(gpd gpd) {
        k21 k21;
        fpd fpd = gpd.a;
        if (!f(fpd)) {
            udd.p("CallEngineTag", "outgoing call can't start because call already started.", new Object[0]);
            return;
        }
        i((df1) null);
        ? obj = new Object();
        to1 to1 = new to1(gpd, obj, this, 0);
        f fVar = new f(1, this, ep1.class, "handleCallCreateError", "handleCallCreateError(Ljava/lang/Throwable;)V", 0, 5);
        l21 l21 = this.b;
        l21.getClass();
        if (fpd instanceof dpd) {
            k21 = l21.a(((dpd) fpd).a, gpd, to1, fVar);
        } else if (fpd instanceof bpd) {
            k21 = l21.b(((bpd) fpd).a, gpd, to1, fVar);
        } else if (fpd instanceof cpd) {
            cpd cpd = (cpd) fpd;
            k21 = l21.d(cpd.a, cpd.b, gpd, to1, fVar);
        } else if (fpd instanceof epd) {
            ete ete = ((epd) fpd).a;
            if (ete instanceof vk1) {
                k21 = l21.a((vk1) ete, gpd, to1, fVar);
            } else if (ete instanceof tk1) {
                k21 = l21.b((tk1) ete, gpd, to1, fVar);
            } else if (ete instanceof uk1) {
                uk1 uk1 = (uk1) ete;
                k21 = l21.d(uk1.c, uk1.d, gpd, to1, fVar);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        h(k21);
        obj.a = k21;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if ((!(r2 instanceof defpackage.vk1)) == true) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            ru.ok.android.externcalls.sdk.Conversation r1 = r18.o()
            if (r1 == 0) goto L_0x0179
            zw3 r2 = r18.j()
            ete r2 = r2.a
            if (r2 == 0) goto L_0x0017
            boolean r2 = r2 instanceof defpackage.vk1
            r4 = 1
            r2 = r2 ^ r4
            if (r2 != r4) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r4 = 0
        L_0x0018:
            zw3 r2 = r18.j()
            boolean r2 = r2.f
            y55 r17 = defpackage.y55.b
            grd r15 = r0.H
            if (r19 != 0) goto L_0x006c
            if (r2 == 0) goto L_0x006c
            fdc r2 = r18.u()
            r2.c()
        L_0x002d:
            java.lang.Object r2 = r15.getValue()
            r5 = r2
            zw3 r5 = (defpackage.zw3) r5
            zw3 r5 = r18.j()
            r13 = 0
            r14 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r16 = 479(0x1df, float:6.71E-43)
            r3 = r15
            r15 = r17
            zw3 r5 = defpackage.zw3.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = r3.b(r2, r5)
            if (r2 == 0) goto L_0x006a
            if (r4 != 0) goto L_0x006d
            fdc r2 = r18.u()
            r2.getClass()
            edc r5 = defpackage.edc.CONNECTED
            r2.c = r5
            cg1 r2 = r2.a()
            bg1 r5 = r2.b
            za6 r5 = r5.e
            r6 = 0
            r2.a(r5, r6)
            goto L_0x006d
        L_0x006a:
            r15 = r3
            goto L_0x002d
        L_0x006c:
            r3 = r15
        L_0x006d:
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection r1 = r1.getParticipants()
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x007d
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x007d
            goto L_0x0179
        L_0x007d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0081:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0179
            java.lang.Object r2 = r1.next()
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = (ru.ok.android.externcalls.sdk.ConversationParticipant) r2
            aka r5 = r18.t()
            oka r5 = (defpackage.oka) r5
            qja r5 = r5.c()
            ne1 r5 = r5.a
            le1 r5 = r5.getId()
            ru.ok.android.externcalls.sdk.id.ParticipantId r5 = defpackage.xja.d(r5)
            boolean r6 = r2.isUseable()
            if (r6 == 0) goto L_0x0176
            boolean r6 = r2.isCallAccepted()
            if (r6 == 0) goto L_0x0176
            ru.ok.android.externcalls.sdk.id.ParticipantId r2 = r2.getExternalId()
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0176
            t97 r1 = r0.s
            java.lang.Object r1 = r1.getValue()
            dj1 r1 = (defpackage.dj1) r1
            t97 r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            android.app.Application r2 = (android.app.Application) r2
            r1.getClass()
            defpackage.dj1.d(r2)
            fdc r1 = r18.u()
            r1.c()
            t97 r1 = r0.g
            java.lang.Object r1 = r1.getValue()
            dq4 r1 = (defpackage.dq4) r1
            qod r2 = r1.b
            if (r2 != 0) goto L_0x00ef
            cq4 r2 = new cq4
            r5 = 0
            r2.<init>(r1, r5)
            ro1 r6 = r1.a
            r7 = 3
            qod r2 = defpackage.xs7.E(r6, r5, r5, r2, r7)
            r1.b = r2
        L_0x00ef:
            zw3 r1 = r18.j()
            boolean r1 = r1.g
            if (r1 != 0) goto L_0x0110
            if (r4 != 0) goto L_0x0110
            fdc r1 = r18.u()
            r1.getClass()
            edc r2 = defpackage.edc.CONNECTED
            r1.c = r2
            cg1 r1 = r1.a()
            bg1 r2 = r1.b
            za6 r2 = r2.e
            r5 = 0
            r1.a(r2, r5)
        L_0x0110:
            if (r4 == 0) goto L_0x0146
            iq1 r6 = r18.m()
            zw3 r1 = r18.k()
            java.lang.String r8 = r1.c
            aka r1 = r18.t()
            oka r1 = (defpackage.oka) r1
            java.util.concurrent.atomic.AtomicReference r1 = r1.w0
            java.lang.Object r1 = r1.get()
            bka r1 = (defpackage.bka) r1
            java.util.Map r1 = r1.c
            java.util.Collection r1 = r1.values()
            int r1 = r1.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r6.getClass()
            r11 = 0
            r14 = 52
            java.lang.String r7 = "GROUP_CALL_JOIN"
            r9 = 0
            r12 = 0
            r13 = 1
            iq1.c(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0146:
            java.lang.Object r1 = r3.getValue()
            r2 = r1
            zw3 r2 = (defpackage.zw3) r2
            zw3 r5 = r18.j()
            r13 = 0
            r14 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r16 = 479(0x1df, float:6.71E-43)
            r15 = r17
            zw3 r2 = defpackage.zw3.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = r3.b(r1, r2)
            if (r1 == 0) goto L_0x0146
            t97 r0 = r0.m
            java.lang.Object r0 = r0.getValue()
            qka r0 = (defpackage.qka) r0
            rka r0 = (defpackage.rka) r0
            r0.rebindParticipantViews()
            goto L_0x0179
        L_0x0176:
            r5 = 0
            goto L_0x0081
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep1.B(boolean):void");
    }

    public final void d(vj1 vj1) {
        this.G.add(vj1);
    }

    public final void e() {
        udd.p("CallEngineTag", "call answer", new Object[0]);
        String str = k().c;
        ete ete = k().a;
        int i2 = 1;
        if (ete != null && ete.P()) {
            i2 = 2;
        }
        iq1 m2 = m();
        m2.getClass();
        iq1.c(m2, "INCOMING_CALL_RECEIVED", str, "ANSWERED", Integer.valueOf(i2), (String) null, (String) null, false, 80);
        Conversation o2 = o();
        if (o2 != null && o2.isPrepared()) {
            o2.init();
            o2.connect();
        }
    }

    public final boolean f(fpd fpd) {
        ete ete = j().a;
        if (ete == null) {
            return true;
        }
        return (!(fpd instanceof bpd) || !(ete instanceof tk1) || ((bpd) fpd).a.c != ((tk1) ete).c) && (!(fpd instanceof dpd) || !(ete instanceof vk1) || ((dpd) fpd).a.c != ((vk1) ete).c) && (!(fpd instanceof cpd) || !(ete instanceof uk1) || !hhd.f(at7.V(((cpd) fpd).a), at7.V(((uk1) ete).c)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.k21 r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            java.lang.String r2 = "CallEngineTag"
            java.lang.String r3 = "init prepared conversation"
            defpackage.udd.p(r2, r3, new java.lang.Object[0])
            zw3 r3 = r32.j()
            o3b r3 = r3.i
            if (r3 == 0) goto L_0x003d
            ru.ok.android.externcalls.sdk.Conversation r1 = r1.a
            java.lang.String r1 = r1.getConversationId()
            zw3 r3 = r32.j()
            java.lang.String r3 = r3.c
            zw3 r4 = r32.j()
            o3b r4 = r4.i
            java.lang.String r5 = "Call already destroyed, release all: prepared="
            java.lang.String r6 = " active="
            java.lang.String r7 = " previousCallState="
            java.lang.StringBuilder r1 = c3d.j(r5, r1, r6, r3, r7)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            defpackage.udd.p(r2, r1, new java.lang.Object[0])
            r32.z()
            return
        L_0x003d:
            java.util.LinkedHashSet r3 = r0.G
            java.util.Iterator r3 = r3.iterator()
        L_0x0043:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0053
            java.lang.Object r4 = r3.next()
            vj1 r4 = (defpackage.vj1) r4
            r4.h()
            goto L_0x0043
        L_0x0053:
            zw3 r3 = r32.j()
            b65 r3 = r3.j
            ru.ok.android.externcalls.sdk.Conversation r4 = r1.a
            r5 = 1
            boolean r7 = r1.d
            if (r7 == 0) goto L_0x007b
            boolean r8 = r4.isCaller()
            if (r8 == 0) goto L_0x0067
            goto L_0x007b
        L_0x0067:
            boolean r8 = r4.isAnswered()
            if (r8 != 0) goto L_0x007b
            boolean r8 = r4.isConcurrent()
            if (r8 != 0) goto L_0x007b
            boolean r8 = r4.isCaller()
            if (r8 != 0) goto L_0x007b
            r8 = r5
            goto L_0x007c
        L_0x007b:
            r8 = 0
        L_0x007c:
            n11 r9 = r32.l()
            x11 r9 = (defpackage.x11) r9
            grd r9 = r9.k
            java.lang.Object r9 = r9.getValue()
            k11 r9 = (defpackage.k11) r9
            r10 = 3
            r12 = 2
            ete r13 = r1.b
            ru.ok.android.externcalls.sdk.Conversation r1 = r1.a
            if (r8 == 0) goto L_0x01b1
            java.lang.String r14 = "doAfterCallPrepared show incoming"
            defpackage.udd.p(r2, r14, new java.lang.Object[0])
            t97 r2 = r0.o
            java.lang.Object r2 = r2.getValue()
            xp1 r2 = (defpackage.xp1) r2
            boolean r14 = r13.P()
            r2.getClass()
            java.lang.String r15 = "CallsNavigatorTag"
            java.lang.String r6 = "show showIncomingCallUi"
            defpackage.udd.p(r15, r6, new java.lang.Object[0])
            t97 r6 = r2.a
            java.lang.Object r6 = r6.getValue()
            cq1 r6 = (defpackage.cq1) r6
            ip9 r11 = r6.e()
            android.app.NotificationManager r11 = r11.b
            int r11 = defpackage.bp9.b(r11)
            if (r11 == 0) goto L_0x00ca
            if (r11 == r5) goto L_0x00ca
            if (r11 == r12) goto L_0x0160
            if (r11 == r10) goto L_0x0160
            r10 = 4
            if (r11 == r10) goto L_0x0160
        L_0x00ca:
            ip9 r10 = r6.e()
            android.app.NotificationManager r10 = r10.b
            boolean r10 = defpackage.cp9.a(r10)
            if (r10 == 0) goto L_0x0160
            ip9 r10 = r6.e()
            android.app.NotificationManager r10 = r10.b     // Catch:{ all -> 0x0160 }
            defpackage.bp9.a(r10)     // Catch:{ all -> 0x0160 }
            ip9 r10 = r6.e()
            t97 r6 = r6.c
            java.lang.Object r6 = r6.getValue()
            o54 r6 = (o54) r6
            r6.getClass()
            int r6 = android.os.Build.VERSION.SDK_INT
            android.app.NotificationManager r10 = r10.b
            java.lang.String r11 = "ru.oneme.app.new.incomingCalls."
            android.app.NotificationChannel r10 = defpackage.dp9.i(r10, r11)
            if (r10 == 0) goto L_0x0149
            ii5 r11 = new ii5
            java.lang.String r16 = defpackage.an9.i(r10)
            int r12 = defpackage.an9.j(r10)
            r5 = 8
            r11.<init>((int) r5)
            android.net.Uri r5 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            r16.getClass()
            r11.b = r12
            android.media.AudioAttributes r5 = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT
            defpackage.an9.m(r10)
            defpackage.an9.g(r10)
            defpackage.an9.h(r10)
            defpackage.an9.b(r10)
            defpackage.an9.n(r10)
            defpackage.an9.f(r10)
            defpackage.an9.v(r10)
            defpackage.an9.k(r10)
            defpackage.an9.w(r10)
            defpackage.an9.o(r10)
            r5 = 30
            if (r6 < r5) goto L_0x013a
            defpackage.cn9.b(r10)
            defpackage.cn9.a(r10)
        L_0x013a:
            defpackage.an9.a(r10)
            defpackage.an9.l(r10)
            defpackage.bn9.a(r10)
            if (r6 < r5) goto L_0x014a
            defpackage.cn9.c(r10)
            goto L_0x014a
        L_0x0149:
            r11 = 0
        L_0x014a:
            if (r11 == 0) goto L_0x0153
            int r5 = r11.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0154
        L_0x0153:
            r5 = 0
        L_0x0154:
            if (r5 != 0) goto L_0x0157
            goto L_0x015e
        L_0x0157:
            int r5 = r5.intValue()
            if (r5 != 0) goto L_0x015e
            goto L_0x0160
        L_0x015e:
            r6 = 1
            goto L_0x0161
        L_0x0160:
            r6 = 0
        L_0x0161:
            if (r6 == 0) goto L_0x0169
            java.lang.String r2 = "notification available, will show via service."
            defpackage.udd.p(r15, r2, new java.lang.Object[0])
            goto L_0x01bc
        L_0x0169:
            if (r6 != 0) goto L_0x01ab
            t97 r5 = r2.c
            java.lang.Object r5 = r5.getValue()
            kdf r5 = (kdf) r5
            boolean r5 = r5.c()
            if (r5 == 0) goto L_0x01ab
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r10 = "show call screen areIncomingNotificationsEnabled="
            r5.<init>(r10)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            defpackage.udd.p(r15, r5, new java.lang.Object[0])
            t97 r2 = r2.b
            java.lang.Object r2 = r2.getValue()
            h91 r2 = (defpackage.h91) r2
            r2.getClass()
            android.content.Intent r5 = new android.content.Intent
            android.app.Application r6 = r2.c()
            java.lang.Class<one.me.android.calls.CallNotifierFixActivity> r10 = one.me.android.calls.CallNotifierFixActivity.class
            r5.<init>(r6, r10)
            defpackage.h91.b(r5, r9, r14)
            android.app.Application r2 = r2.c()
            r2.startActivity(r5)
            goto L_0x01bc
        L_0x01ab:
            java.lang.String r0 = "can't show incoming call ui"
            defpackage.udd.p(r15, r0, new java.lang.Object[0])
            return
        L_0x01b1:
            java.lang.String r5 = "doAfterCallPrepared answer"
            defpackage.udd.p(r2, r5, new java.lang.Object[0])
            r1.init()
            r1.connect()
        L_0x01bc:
            t97 r2 = r0.s
            java.lang.Object r2 = r2.getValue()
            dj1 r2 = (defpackage.dj1) r2
            t97 r5 = r0.d
            java.lang.Object r5 = r5.getValue()
            android.app.Application r5 = (android.app.Application) r5
            r2.getClass()
            defpackage.dj1.d(r5)
            if (r8 == 0) goto L_0x0205
            fdc r2 = r32.u()
            r2.getClass()
            edc r5 = defpackage.edc.INCOMING
            r2.c = r5
            cg1 r2 = r2.a()
            r7e r5 = r2.d
            java.lang.Object r5 = r5.getValue()
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            int r5 = r5.getRingerMode()
            r6 = 1
            if (r5 == r6) goto L_0x0201
            r8 = 2
            if (r5 == r8) goto L_0x01f6
            goto L_0x0245
        L_0x01f6:
            bg1 r5 = r2.b
            za6 r5 = r5.b
            r2.a(r5, r6)
            r2.b()
            goto L_0x0245
        L_0x0201:
            r2.b()
            goto L_0x0245
        L_0x0205:
            boolean r2 = r13 instanceof defpackage.vk1
            if (r2 == 0) goto L_0x0235
            boolean r5 = r4.isCaller()
            if (r5 == 0) goto L_0x0235
            boolean r5 = r4.isDestroyed()
            if (r5 != 0) goto L_0x0235
            boolean r5 = r4.isAnswered()
            if (r5 != 0) goto L_0x0235
            z55 r3 = defpackage.z55.b
            fdc r2 = r32.u()
            r2.getClass()
            edc r5 = defpackage.edc.BEEP
            r2.c = r5
            cg1 r2 = r2.a()
            bg1 r5 = r2.b
            za6 r5 = r5.c
            r6 = 1
            r2.a(r5, r6)
            goto L_0x0245
        L_0x0235:
            if (r2 != 0) goto L_0x0245
            boolean r2 = r3 instanceof defpackage.a65
            if (r2 == 0) goto L_0x023c
            goto L_0x023e
        L_0x023c:
            y55 r3 = defpackage.y55.b
        L_0x023e:
            fdc r2 = r32.u()
            r2.c()
        L_0x0245:
            ru.ok.android.externcalls.sdk.connection.MediaConnectionManager r2 = r4.getMediaConnectionManager()
            vp1 r5 = r32.s()
            r2.addListener(r5)
            ru.ok.android.externcalls.sdk.record.RecordManager r2 = r4.getRecordManager()
            t97 r4 = r0.p
            java.lang.Object r5 = r4.getValue()
            boc r5 = (defpackage.boc) r5
            r2.addRecordListener(r5)
            java.lang.Object r2 = r4.getValue()
            boc r2 = (defpackage.boc) r2
            doc r2 = (defpackage.doc) r2
            r2.getClass()
            java.lang.String r4 = "ScreenRecordControllerTag"
            java.lang.String r5 = "prepare recoding state"
            defpackage.udd.P(r4, r5, new java.lang.Object[0])
            r2.onRecordStarted()
        L_0x0274:
            grd r2 = r0.H
            java.lang.Object r4 = r2.getValue()
            r5 = r4
            zw3 r5 = (defpackage.zw3) r5
            zw3 r17 = r32.j()
            java.lang.String r21 = r1.getConversationId()
            java.lang.String r22 = r1.getJoinLink()
            boolean r5 = r13 instanceof defpackage.vk1
            r6 = 1
            r5 = r5 ^ r6
            if (r5 != 0) goto L_0x0292
            r23 = r6
            goto L_0x029c
        L_0x0292:
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection r8 = r1.getParticipants()
            boolean r8 = r0.x(r8)
            r23 = r8
        L_0x029c:
            boolean r8 = r13 instanceof defpackage.uk1
            if (r8 == 0) goto L_0x02a4
            r8 = r13
            uk1 r8 = (defpackage.uk1) r8
            goto L_0x02a5
        L_0x02a4:
            r8 = 0
        L_0x02a5:
            if (r8 == 0) goto L_0x02b9
            java.lang.String r9 = r1.getJoinLink()
            if (r9 != 0) goto L_0x02af
            java.lang.String r9 = r8.c
        L_0x02af:
            uk1 r10 = new uk1
            boolean r8 = r8.d
            r10.<init>(r9, r8)
            r18 = r10
            goto L_0x02bb
        L_0x02b9:
            r18 = r13
        L_0x02bb:
            r25 = 0
            r26 = 0
            r19 = 0
            r24 = 0
            r28 = 482(0x1e2, float:6.75E-43)
            r27 = r3
            zw3 r8 = defpackage.zw3.a(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r2 = r2.b(r4, r8)
            if (r2 == 0) goto L_0x0274
            t97 r2 = r0.i
            java.lang.Object r2 = r2.getValue()
            wi4 r2 = (defpackage.wi4) r2
            qod r3 = r2.d
            r4 = 0
            if (r3 == 0) goto L_0x02e1
            r3.cancel((java.util.concurrent.CancellationException) r4)
        L_0x02e1:
            r2.d = r4
            vi4 r3 = new vi4
            r3.<init>(r2, r4)
            ro1 r6 = r2.a
            r8 = 3
            qod r3 = defpackage.xs7.E(r6, r4, r4, r3, r8)
            r2.d = r3
            t97 r2 = r0.y
            if (r7 == 0) goto L_0x02fb
            boolean r3 = r13.P()
            if (r3 != 0) goto L_0x02fd
        L_0x02fb:
            if (r5 == 0) goto L_0x0327
        L_0x02fd:
            java.lang.Object r3 = r2.getValue()
            qna r3 = (qna) r3
            java.lang.String[] r4 = qna.l
            boolean r3 = r3.b(r4)
            if (r3 != 0) goto L_0x0327
            iq1 r23 = r32.m()
            java.lang.String r25 = r1.getConversationId()
            r23.getClass()
            r27 = 0
            r31 = 56
            java.lang.String r24 = "REQUEST_PERMISSION_CAM"
            java.lang.String r26 = "OUT_OF_CALL"
            r28 = 0
            r29 = 0
            r30 = r5
            iq1.c(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x0327:
            if (r5 == 0) goto L_0x0353
            java.lang.Object r2 = r2.getValue()
            qna r2 = (qna) r2
            java.lang.String[] r3 = qna.h
            boolean r2 = r2.b(r3)
            if (r2 != 0) goto L_0x0353
            iq1 r23 = r32.m()
            java.lang.String r25 = r1.getConversationId()
            r23.getClass()
            r27 = 0
            r31 = 56
            java.lang.String r24 = "REQUEST_PERMISSION_MIC"
            java.lang.String r26 = "AFTER_INITIATION"
            r28 = 0
            r29 = 0
            r30 = r5
            iq1.c(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x0353:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep1.g(k21):void");
    }

    public final void h(k21 k21) {
        grd grd;
        Object value;
        Conversation conversation;
        boolean z2;
        zw3 zw3;
        boolean z3;
        ete ete;
        k21 k212 = k21;
        do {
            grd = this.H;
            value = grd.getValue();
            zw3 zw32 = (zw3) value;
            conversation = k212.a;
            String conversationId = conversation.getConversationId();
            x55 x55 = x55.b;
            String joinLink = conversation.getJoinLink();
            ete ete2 = k212.b;
            boolean z4 = ete2 instanceof vk1;
            z2 = !z4;
            zw3 = r9;
            z3 = z4;
            ete = ete2;
            zw3 zw33 = new zw3(k212.b, conversationId, joinLink, k212.d, z2, x55, 306);
        } while (!grd.b(value, zw3));
        n().a.getAndSet(conversation);
        s().d(this.J);
        s().d((qka) this.m.getValue());
        vp1 s2 = s();
        t97 t97 = this.C;
        s2.d((vx0) t97.getValue());
        this.D = xs7.E(this.a, (hu3) null, (ru3) null, new yo1(this, (Continuation) null), 3);
        if (!k212.d && !z2) {
            fdc u2 = u();
            u2.getClass();
            u2.c = edc.BEEP;
            cg1 a2 = u2.a();
            a2.a(a2.b.c, true);
        }
        if (ete instanceof tk1) {
            n11 l2 = l();
            long j2 = ((tk1) ete).c;
            x11 x11 = (x11) l2;
            x11.n.o1(x11, x11.p[1], x11.a(((bv2) x11.b.getValue()).n(j2), j2));
        } else if (z3) {
            x11 x112 = (x11) l();
            xs7.E(x112.a, ((pae) x112.f.getValue()).a(), (ru3) null, new w11(((vk1) ete).c, x112, (Continuation) null), 2);
        } else if (ete instanceof uk1) {
            uk1 uk1 = (uk1) ete;
            x11 x113 = (x11) l();
            x113.o = Long.valueOf(((pk) x113.c.getValue()).B(at7.W(uk1.c), uk1.d));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        oka oka = (oka) t();
        Conversation a3 = ((bt3) oka.o.getValue()).a();
        ParticipantStatesManager participantStatesManager = a3 != null ? a3.getParticipantStatesManager() : null;
        if (participantStatesManager != null) {
            participantStatesManager.addHandListener((ParticipantStatesManager.Listener) oka.Z.getValue());
        }
        ika ika = new ika(oka, (Continuation) null);
        ro1 ro1 = oka.a;
        xs7.E(ro1, (hu3) null, (ru3) null, ika, 3);
        oka.y0 = ez3.N(new ck5(((nnc) oka.Y.getValue()).b, new jka(oka, (Continuation) null), 5), ro1);
        u09 u09 = new u09(new u09(((rj3) oka.X.getValue()).a(), 10), 9);
        int i2 = zp4.o;
        eq4 eq4 = eq4.MILLISECONDS;
        oka.z0 = ez3.N(new ck5(new gka(vx3.h(u09, mt0.P(300, eq4), new vg0(19)), oka, 0), new kka(oka, (Continuation) null), 5), ro1);
        py0 py0 = (py0) ((vx0) t97.getValue());
        py0.y0 = ez3.N(new ck5(new bc(vx3.h(new uv(new uv(((rj3) py0.o.getValue()).a(), 8), 7), mt0.P(300, eq4), new vg0(2)), 5, py0), new jy0(py0, (Continuation) null), 5), py0.a);
        AtomicBoolean atomicBoolean = py0.x0;
        ParticipantStatesManager f2 = py0.f();
        atomicBoolean.set(f2 != null ? f2.isOwnHandRaised() : false);
        ParticipantStatesManager f3 = py0.f();
        if (f3 != null) {
            f3.addHandListener((ParticipantStatesManager.Listener) py0.X.getValue());
        }
        MediaMuteManager e2 = py0.e();
        if (e2 != null) {
            e2.addListener((ky0) py0.A0.getValue());
        }
        ConversationFeatureManager g2 = py0.g();
        if (g2 != null) {
            g2.addFeatureListener(e51.b, (ly0) py0.B0.getValue());
        }
        Conversation o2 = o();
        if (o2 != null) {
            ((rz0) ((qz0) this.h.getValue())).a(o2.isCaller() ? CallsAudioManager.State.DIALING : CallsAudioManager.State.RINGING);
            udd.p("CallEngineTag", this + " conversation is ready " + o2.getConversationId(), new Object[0]);
        }
    }

    public final void i(df1 df1) {
        Object value;
        long j2;
        Long valueOf;
        String str;
        udd.p("CallEngineTag", this + " doBeforeCreateConversation push=" + df1, new Object[0]);
        x11 x11 = (x11) l();
        if (df1 != null) {
            grd grd = x11.j;
            do {
                value = grd.getValue();
                k11 k11 = (k11) value;
                j2 = df1.b;
                valueOf = Long.valueOf(j2);
                String str2 = df1.d;
                if (str2 == null) {
                    str2 = BuildConfig.FLAVOR;
                }
                str = str2;
                long j3 = df1.a;
                Long valueOf2 = Long.valueOf(j3);
                if (j3 == 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    j2 = valueOf2.longValue();
                }
            } while (!grd.b(value, new k11(valueOf, (CharSequence) str, df1.e, Long.valueOf(j2), (CharSequence) null, 48)));
        }
        int i2 = 0;
        x11.m.o1(x11, x11.p[0], xs7.E(x11.a, (hu3) null, ru3.b, new mk5(new bc(ez3.J(new ck5(new uv(new s0c(((jp1) x11.d.getValue()).a), 14), new t11(x11, (Continuation) null), 5), (ju3) x11.l.getValue()), 17, new r11(x11, (Continuation) null, 1)), (Continuation) null), 1));
        Application application = (Application) this.d.getValue();
        ((dj1) this.s.getValue()).getClass();
        Intent intent = new Intent(application, CallServiceImpl.class);
        cj1 cj1 = cj1.a;
        dj1.b(application, intent.putExtra("ACTION", 0));
        rz0 rz0 = (rz0) ((qz0) this.h.getValue());
        CallsAudioManager callsAudioManager = (CallsAudioManager) rz0.c.updateAndGet(new zx0(3, rz0));
        if (callsAudioManager != null) {
            i2 = callsAudioManager.hashCode();
        }
        udd.p("CallAudioController", "CallAudioController prepared: " + i2, new Object[0]);
    }

    public final zw3 j() {
        return (zw3) this.H.getValue();
    }

    public final zw3 k() {
        return (zw3) this.I.getValue();
    }

    public final n11 l() {
        return (n11) this.j.getValue();
    }

    public final iq1 m() {
        return (iq1) this.x.getValue();
    }

    public final bt3 n() {
        return (bt3) this.f.getValue();
    }

    public final Conversation o() {
        return n().a();
    }

    public final boolean p() {
        b65 b65 = k().j;
        return !((b65 instanceof v55) || (b65 instanceof u55) || (b65 instanceof w55));
    }

    public final boolean q() {
        Conversation a2 = n().a();
        boolean z2 = a2 != null && a2.isAnswered();
        Conversation a3 = n().a();
        boolean z3 = a3 != null && a3.isCaller();
        b65 b65 = k().j;
        if ((b65 instanceof v55) || (b65 instanceof u55) || (b65 instanceof w55)) {
            return false;
        }
        return z2 || z3 || k().h;
    }

    public final boolean r() {
        Conversation a2 = n().a();
        boolean z2 = a2 != null && !a2.isAnswered();
        Conversation a3 = n().a();
        boolean z3 = a3 != null && !a3.isCaller();
        b65 b65 = k().j;
        return !(b65 instanceof v55) && !(b65 instanceof u55) && !(b65 instanceof w55) && z2 && z3 && !k().h;
    }

    public final vp1 s() {
        return (vp1) this.e.getValue();
    }

    public final aka t() {
        return (aka) this.k.getValue();
    }

    public final fdc u() {
        return (fdc) this.l.getValue();
    }

    public final void v() {
        w(j().j instanceof a65 ? fe6.o : null);
    }

    public final void w(fe6 fe6) {
        udd.p("CallEngineTag", "hangup " + fe6, new Object[0]);
        Conversation o2 = o();
        if (o2 != null) {
            if (fe6 == null) {
                fe6 = null;
            }
            o2.hangup(new ee6(fe6));
            z();
        }
    }

    public final boolean x(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!hhd.f(((ConversationParticipant) it.next()).getExternalId(), xja.d(((oka) t()).c().a.getId()))) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        boolean z2 = k().h;
        boolean z3 = ((bka) ((oka) t()).A0.a.getValue()).h;
        boolean isScreenCaptureEnabled = ((bka) ((oka) t()).A0.a.getValue()).a.a.isScreenCaptureEnabled();
        if (z2) {
            if (isScreenCaptureEnabled) {
                return false;
            }
        } else if (!z3 || isScreenCaptureEnabled) {
            return false;
        }
        return true;
    }

    public final void z() {
        grd grd;
        Object value;
        grd grd2;
        Object value2;
        Object value3;
        grd grd3;
        Object value4;
        grd grd4;
        Object value5;
        zw3 zw3;
        u55 u55;
        udd.p("CallEngineTag", "release call data", new Object[0]);
        k11 k11 = (k11) ((x11) l()).k.getValue();
        Application application = (Application) this.d.getValue();
        ((dj1) this.s.getValue()).getClass();
        Intent intent = new Intent(application, CallServiceImpl.class);
        cj1 cj1 = cj1.a;
        intent.putExtra("ACTION", 1);
        dj1.b(application, intent);
        s().c(this.J);
        vp1 s2 = s();
        t97 t97 = this.m;
        s2.c((qka) t97.getValue());
        vp1 s3 = s();
        t97 t972 = this.C;
        s3.c((vx0) t972.getValue());
        qod qod = this.D;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        this.D = null;
        k77[] k77Arr = K;
        k77 k77 = k77Arr[0];
        e3 e3Var = this.E;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[0], (Object) null);
        u().c();
        wi4 wi4 = (wi4) this.i.getValue();
        qod qod2 = wi4.d;
        if (qod2 != null) {
            qod2.cancel((CancellationException) null);
        }
        wi4.d = null;
        ((rka) ((qka) t97.getValue())).clear();
        ((cq1) this.n.getValue()).a();
        rz0 rz0 = (rz0) ((qz0) this.h.getValue());
        rz0.getClass();
        rz0.a(CallsAudioManager.State.IDLE);
        CallsAudioManager callsAudioManager = (CallsAudioManager) rz0.c.getAndSet((Object) null);
        Integer valueOf = callsAudioManager != null ? Integer.valueOf(callsAudioManager.hashCode()) : null;
        udd.p("CallAudioController", "CallAudioController released: " + valueOf, new Object[0]);
        dq4 dq4 = (dq4) this.g.getValue();
        do {
            grd = dq4.d;
            value = grd.getValue();
            Long l2 = (Long) value;
        } while (!grd.b(value, (Object) null));
        qod qod3 = dq4.b;
        if (qod3 != null) {
            qod3.cancel((CancellationException) null);
        }
        dq4.b = null;
        x11 x11 = (x11) l();
        x11.o = null;
        k77[] k77Arr2 = x11.p;
        k77 k772 = k77Arr2[0];
        e3 e3Var2 = x11.m;
        g37 g372 = (g37) e3Var2.T0(x11, k772);
        if (g372 != null) {
            g372.cancel((CancellationException) null);
        }
        e3Var2.o1(x11, k77Arr2[0], (Object) null);
        k77 k773 = k77Arr2[1];
        e3 e3Var3 = x11.n;
        g37 g373 = (g37) e3Var3.T0(x11, k773);
        if (g373 != null) {
            g373.cancel((CancellationException) null);
        }
        e3Var3.o1(x11, k77Arr2[1], (Object) null);
        do {
            grd2 = x11.j;
            value2 = grd2.getValue();
            k11 k112 = (k11) value2;
        } while (!grd2.b(value2, k11.g));
        grd grd5 = ((nnc) this.B.getValue()).b;
        do {
            value3 = grd5.getValue();
            ((Boolean) value3).getClass();
        } while (!grd5.b(value3, Boolean.FALSE));
        py0 py0 = (py0) ((vx0) t972.getValue());
        g37 g374 = (g37) py0.z0.T0(py0, py0.G0[0]);
        if (g374 != null) {
            g374.cancel((CancellationException) null);
        }
        qod qod4 = py0.y0;
        if (qod4 != null) {
            qod4.cancel((CancellationException) null);
        }
        py0.y0 = null;
        py0.x0.set(false);
        ParticipantStatesManager f2 = py0.f();
        if (f2 != null) {
            f2.removeHandListener((ParticipantStatesManager.Listener) py0.X.getValue());
        }
        MediaMuteManager e2 = py0.e();
        if (e2 != null) {
            e2.removeListener((ky0) py0.A0.getValue());
        }
        ConversationFeatureManager g2 = py0.g();
        if (g2 != null) {
            g2.removeFeatureListener(e51.b, (ly0) py0.B0.getValue());
        }
        py0.Y.set(new bs(0));
        do {
            grd3 = py0.Z;
            value4 = grd3.getValue();
            Map map = (Map) value4;
        } while (!grd3.b(value4, iw4.a));
        Conversation a2 = n().a();
        t97 t973 = this.p;
        if (a2 != null) {
            a2.getMediaConnectionManager().removeListener(s());
            a2.getRecordManager().removeRecordListener((boc) t973.getValue());
            try {
                a2.release();
            } catch (Throwable th) {
                Throwable th2 = th;
                udd.s("CallEngineTag", th2.getMessage(), th2);
            }
        }
        ((doc) ((boc) t973.getValue())).c(foc.o);
        n().a.set((Object) null);
        do {
            grd4 = this.H;
            value5 = grd4.getValue();
            zw3 = (zw3) value5;
            b65 b65 = zw3.j;
            u55 = b65 instanceof u55 ? (u55) b65 : null;
        } while (!grd4.b(value5, zw3.a(zw3.k, (ete) null, 0, (String) null, (String) null, false, false, false, new o3b(zw3.c, (zw3.h || ((u55 != null ? u55.b : 0) == 3)) ? null : zw3.a, zw3.j, k11), (b65) null, 767)));
    }
}
