package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationFactory;

/* renamed from: ap1  reason: default package */
public final class ap1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ df1 Y;
    public final /* synthetic */ ep1 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ap1(df1 df1, ep1 ep1, Continuation continuation) {
        super(2, continuation);
        this.Y = df1;
        this.Z = ep1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ap1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ap1 ap1 = new ap1(this.Y, this.Z, continuation);
        ap1.X = obj;
        return ap1;
    }

    /* JADX WARNING: type inference failed for: r3v13, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, lk] */
    public final Object o(Object obj) {
        boolean z;
        Long l;
        Conversation a;
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        df1 df1 = this.Y;
        int i = (df1.b > 0 ? 1 : (df1.b == 0 ? 0 : -1));
        jue jue = jue.a;
        ep1 ep1 = this.Z;
        if (i == 0 || ((jb5) ep1.u.getValue()).q()) {
            udd.p("CallEngineTag", ou3 + " showIncomingCall " + df1, new Object[0]);
            long j = df1.a;
            if (((di3) ep1.A.getValue()).m(j)) {
                xs7.E(ou3, ((pae) ep1.r.getValue()).a(), (ru3) null, new zo1(ep1, j, (Continuation) null), 2);
            }
            Conversation a2 = ep1.n().a();
            boolean z2 = false;
            boolean z3 = a2 == null || !a2.isDestroyed();
            Conversation a3 = ep1.n().a();
            if (a3 != null) {
                z2 = a3.isAnswered();
            }
            zw3 j2 = ep1.j();
            String str = j2.c;
            ete ete = j2.a;
            vk1 vk1 = ete instanceof vk1 ? (vk1) ete : null;
            if (vk1 != null) {
                z = z2;
                l = new Long(vk1.c);
            } else {
                z = z2;
                l = null;
            }
            String str2 = df1.c;
            String str3 = j2.c;
            if (str3 != null && !h0e.c0(str3)) {
                if (hhd.f(str, str2) && z3) {
                    udd.p("CallEngineTag", ou3 + " ignore repetitive push " + str2 + " current id " + str, new Object[0]);
                    return jue;
                } else if (z3 && l != null && j == l.longValue() && (a = ep1.n().a()) != null && a.isCaller()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ou3);
                    sb.append(" same incoming call userId=");
                    sb.append(j);
                    sb.append(" answered=");
                    boolean z4 = z;
                    sb.append(z4);
                    udd.p("CallEngineTag", sb.toString(), new Object[0]);
                    if (!z4) {
                        ep1.e();
                    }
                    return jue;
                } else if (!hhd.f(str, str2)) {
                    udd.p("CallEngineTag", ou3 + " ignore incoming conversation " + str2 + " we have an active one=" + str + " " + df1, new Object[0]);
                    kp1.a(ep1.c).hangup(fe6.b, str2);
                    return jue;
                }
            }
            udd.p("CallEngineTag", ou3 + " create conversation for answer " + df1, new Object[0]);
            ep1.i(df1);
            ? obj2 = new Object();
            if (str2 == null) {
                str2 = null;
            }
            if (str2 != null) {
                long j3 = df1.a;
                boolean z5 = df1.f;
                String str4 = df1.g;
                ? obj3 = new Object();
                obj3.a = j3;
                obj3.b = str2;
                obj3.c = str4;
                to1 to1 = new to1(ou3, obj2, ep1, 1);
                f fVar = new f(1, this.Z, ep1.class, "handleCallCreateError", "handleCallCreateError(Ljava/lang/Throwable;)V", 0, 4);
                l21 l21 = ep1.b;
                long c = l21.c();
                ConversationFactory a4 = kp1.a(l21.a);
                j21 j21 = r12;
                j21 j212 = new j21(obj3, c, l21, to1, fVar);
                k21 k21 = new k21(a4.answer(j21), new vk1(j3, z5), true, true);
                ep1.h(k21);
                obj2.a = k21;
                return jue;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        udd.p("CallEngineTag", "ignore group call push=" + df1, new Object[0]);
        return jue;
    }
}
