package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ou2  reason: default package */
public final class ou2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ou2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ou2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ou2 ou2 = new ou2(continuation, this.Y);
        ou2.X = obj;
        return ou2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        k77[] k77Arr = ChatsListWidget.O0;
        ChatsListWidget chatsListWidget = this.Y;
        if (booleanValue) {
            OneMeButton oneMeButton = chatsListWidget.m0().N0;
            oneMeButton.setText((CharSequence) null);
            oneMeButton.setOnClickListener((View.OnClickListener) null);
            oneMeButton.setVisibility(8);
        } else {
            chatsListWidget.m0().x(chatsListWidget.getContext().getString(jtb.chats_list_empty_state_action), new d5(18, chatsListWidget));
        }
        return jue.a;
    }
}
