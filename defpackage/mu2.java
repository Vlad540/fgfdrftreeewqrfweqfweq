package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* renamed from: mu2  reason: default package */
public final class mu2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mu2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((mu2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mu2 mu2 = new mu2(continuation, this.Y);
        mu2.X = obj;
        return mu2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        gfa gfa = (sg9) this.X;
        if (gfa instanceof gfa) {
            zu2 zu2 = zu2.c;
            long longValue = ((Number) gfa.a).longValue();
            d34 P1 = zu2.P1();
            P1.b(":settings/folder/by-chat?id=" + longValue, (Bundle) null);
        } else if (gfa instanceof s69) {
            zu2.c.P1().b(us8.j(((Number) ((s69) gfa).a).longValue(), ":profile/change-owner?chat_id=", "&leave_chat=true"), (Bundle) null);
        } else if (gfa instanceof a34) {
            zu2.c.R1((a34) gfa);
        } else {
            boolean z = gfa instanceof efa;
            ChatsListWidget chatsListWidget = this.Y;
            if (z) {
                Context context = chatsListWidget.getContext();
                Uri uri = (Uri) ((efa) gfa).a;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setData(uri);
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    e.getMessage();
                    uri.toString();
                }
            } else if (gfa instanceof vz6) {
                zu2 zu22 = zu2.c;
                zu22.P1().c(((k34) ((vz6) gfa).a).a, (Bundle) null);
            } else if (gfa instanceof x17) {
                k77[] k77Arr = ChatsListWidget.O0;
                ((ak3) chatsListWidget.B0.getValue()).a(chatsListWidget.requireActivity());
            }
        }
        return jue.a;
    }
}
