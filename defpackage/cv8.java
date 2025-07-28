package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: cv8  reason: default package */
public final class cv8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cv8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cv8 cv8 = new cv8(continuation, this.Y);
        cv8.X = obj;
        return cv8;
    }

    public final Object o(Object obj) {
        int i;
        wx3.H(obj);
        i05 i05 = (i05) this.X;
        kt8 kt8 = i05 != null ? (kt8) i05.a : null;
        MessageWriteWidget messageWriteWidget = this.Y;
        if (kt8 != null) {
            k77[] k77Arr = MessageWriteWidget.J0;
            messageWriteWidget.getClass();
            i = kt8.a;
        } else {
            i = 0;
        }
        grd grd = messageWriteWidget.G0;
        if (i == 2) {
            messageWriteWidget.p0().setLeftIcon(phc.d1);
            grd.m((Object) null, Boolean.TRUE);
        } else {
            messageWriteWidget.p0().setEmojiExpandableState(zp8.a);
            hq8 hq8 = messageWriteWidget.p0().c;
            hq8.setShowSoftInputOnFocus(true);
            hq8.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            messageWriteWidget.p0().setLeftIcon(phc.Z0);
            grd.m((Object) null, Boolean.FALSE);
        }
        return jue.a;
    }
}
