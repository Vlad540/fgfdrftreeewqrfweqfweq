package defpackage;

import android.os.Bundle;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.join.JoinChatWidget;
import one.me.sdk.arch.Widget;

/* renamed from: m47  reason: default package */
public final class m47 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ JoinChatWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m47(JoinChatWidget joinChatWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = joinChatWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((m47) n((s47) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m47 m47 = new m47(this.Y, continuation);
        m47.X = obj;
        return m47;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        s47 s47 = (s47) this.X;
        k77[] k77Arr = JoinChatWidget.B0;
        Widget widget = this.Y;
        if (widget.requireActivity() instanceof efc) {
            widget.getRouter().C();
            r47 r47 = r47.c;
            long longValue = ((Number) s47.a).longValue();
            d34 P1 = r47.P1();
            mn mnVar = new mn(12);
            mnVar.b = ":chats";
            mnVar.T(Long.valueOf(longValue), HasExtraData.KEY_ID);
            mnVar.T("local", "type");
            P1.c(mnVar.u(), (Bundle) null);
        } else {
            int i = MainActivity.e1;
            smc.m(widget.requireActivity(), zu2.Z1(zu2.c, ((Number) s47.a).longValue(), "local", (Long) null, (Long) null, (List) null, (String) null, (Boolean) null, false, 508), (fca) null, (uy1) null, 12);
        }
        widget.r0(false);
        return jue.a;
    }
}
