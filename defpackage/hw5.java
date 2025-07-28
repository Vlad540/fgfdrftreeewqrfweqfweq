package defpackage;

import android.os.Bundle;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: hw5  reason: default package */
public final class hw5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForwardPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hw5(Continuation continuation, ForwardPickerScreen forwardPickerScreen) {
        super(2, continuation);
        this.Y = forwardPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((hw5) n((uv5) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hw5 hw5 = new hw5(continuation, this.Y);
        hw5.X = obj;
        return hw5;
    }

    public final Object o(Object obj) {
        tt6 tt6;
        wx3.H(obj);
        uv5 uv5 = (uv5) this.X;
        if (uv5 instanceof qv5) {
            qv5 qv5 = (qv5) uv5;
            Long l = qv5.a;
            if (l != null) {
                long longValue = l.longValue();
                kv5 kv5 = kv5.c;
                Boolean valueOf = Boolean.valueOf(qv5.d);
                kv5.P1().d();
                d34 P1 = kv5.P1();
                mn mnVar = new mn(12);
                mnVar.b = ":chats";
                mnVar.T(Long.valueOf(longValue), HasExtraData.KEY_ID);
                mnVar.T("local", "type");
                mnVar.T(Boolean.TRUE, "from_forward");
                Set set = qv5.b;
                if (set != null) {
                    mnVar.T(o23.c0(set, ",", (String) null, (String) null, (u16) null, 62), "forward_msg_ids");
                }
                Long l2 = qv5.c;
                if (l2 != null) {
                    mnVar.T(Long.valueOf(l2.longValue()), "forward_attach_id");
                }
                mnVar.T(valueOf, "is_forward_attach");
                P1.c(mnVar.u(), (Bundle) null);
            } else {
                kv5.c.P1().d();
            }
            gv5 gv5 = qv5.e;
            if (!(gv5 == null || (tt6 = (tt6) dv5.a.getAccessor().e()) == null)) {
                tt6.f(gv5.a, gv5.b);
            }
        } else {
            boolean z = uv5 instanceof tv5;
            ForwardPickerScreen forwardPickerScreen = this.Y;
            if (z) {
                forwardPickerScreen.C0 = new wv5(forwardPickerScreen, 4);
            } else if (uv5 instanceof sv5) {
                k77[] k77Arr = ForwardPickerScreen.M0;
                forwardPickerScreen.B0(true);
            } else if (uv5 instanceof rv5) {
                k77[] k77Arr2 = ForwardPickerScreen.M0;
                forwardPickerScreen.B0(false);
                wra u0 = forwardPickerScreen.u0();
                u0.c.d();
                u0.Y.m((Object) null, qw4.a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
