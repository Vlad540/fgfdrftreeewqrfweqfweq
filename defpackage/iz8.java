package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: iz8  reason: default package */
public final class iz8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ MessageModel Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iz8(zz8 zz8, MessageModel messageModel, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = messageModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iz8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            String str = this.Y.F0;
            MessageModel messageModel = this.Z;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, str, "On unreadScrollButton clicked, current messageModel=".concat(messageModel.m()), (Throwable) null);
            }
            String str2 = this.Y.F0;
            MessageModel messageModel2 = this.Z;
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                fn62.d(tn7.X, str2, "onUnreadScrollButtonClicked: current messageModel=".concat(messageModel2.m()), (Throwable) null);
            }
            i22 i22 = (i22) this.Y.r1.a.getValue();
            if (i22 == null) {
                return jue2;
            }
            long m = i22.m();
            long k = i22.c.k();
            if (m >= k || this.Z.c >= m) {
                String str3 = this.Y.F0;
                fn6 fn63 = udd.e;
                if (fn63 != null && fn63.c()) {
                    tn7 tn7 = tn7.X;
                    StringBuilder k2 = hr1.k(m, "onUnreadScrollButtonClicked: selfReadMark=", " >= lastMessageTime=");
                    k2.append(k);
                    fn63.d(tn7, str3, k2.toString(), (Throwable) null);
                }
                zz8 zz8 = this.Y;
                this.X = 1;
                zz8.F(k, true);
                if (jue2 == jue) {
                    return jue;
                }
            } else {
                tw8 tw8 = (tw8) this.Y.s1.getValue();
                List list = tw8.a;
                int f = tw8.f(m);
                if (f < 0) {
                    f = Math.abs(f) - 1;
                }
                MessageModel messageModel3 = (MessageModel) o23.Y(f, list);
                if (messageModel3 == null) {
                    String str4 = this.Y.F0;
                    fn6 fn64 = udd.e;
                    if (fn64 != null && fn64.c()) {
                        fn64.d(tn7.X, str4, "onUnreadScrollButtonClicked: message with ts=selfReadMark is not loaded, load around it", (Throwable) null);
                    }
                    ((fw) this.Y.o).r(m);
                    epc epc = this.Y.A1;
                    epc.getClass();
                    epc.a.setValue(new bpc(m, false, false, false, false));
                } else if (messageModel3.c == this.Z.c) {
                    String str5 = this.Y.F0;
                    fn6 fn65 = udd.e;
                    if (fn65 != null && fn65.c()) {
                        fn65.d(tn7.X, str5, us8.i(k, "onUnreadScrollButtonClicked: message with ts=selfReadMark is loaded and is last on screen, scroll to lastMessageTime="), (Throwable) null);
                    }
                    zz8 zz82 = this.Y;
                    this.X = 2;
                    zz82.F(k, false);
                    if (jue2 == jue) {
                        return jue;
                    }
                } else {
                    String str6 = this.Y.F0;
                    fn6 fn66 = udd.e;
                    if (fn66 != null && fn66.c()) {
                        fn66.d(tn7.X, str6, "onUnreadScrollButtonClicked: message with ts=selfReadMark is loaded, scroll to it", (Throwable) null);
                    }
                    epc epc2 = this.Y.A1;
                    long j = messageModel3.c;
                    epc2.getClass();
                    epc2.a.setValue(new bpc(j, true, true, true, false));
                }
            }
        } else if (i == 1 || i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
