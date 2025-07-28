package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: i09  reason: default package */
public final class i09 extends l5e implements i26 {
    public final /* synthetic */ long X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ MotionEvent Z;
    public final /* synthetic */ MessagesListWidget w0;
    public final /* synthetic */ int x0;
    public final /* synthetic */ sf7 y0;
    public final /* synthetic */ View z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i09(long j, String str, MotionEvent motionEvent, MessagesListWidget messagesListWidget, int i, sf7 sf7, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = str;
        this.Z = motionEvent;
        this.w0 = messagesListWidget;
        this.x0 = i;
        this.y0 = sf7;
        this.z0 = viewGroup;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i09(this.X, this.Y, this.Z, this.w0, this.x0, this.y0, (ViewGroup) this.z0, continuation);
    }

    public final Object o(Object obj) {
        List list;
        wx3.H(obj);
        wia wia = new wia("messages:context_menu:message_id", new Long(this.X));
        String str = this.Y;
        Bundle j = jjd.j(new wia[]{wia, new wia("messages:context_menu:link_url", str)});
        mq3 k = pfa.a(1).k();
        MotionEvent motionEvent = this.Z;
        mq3 i = k.f(motionEvent.getRawX(), motionEvent.getRawY()).h(j).i(new lge(str));
        k77[] k77Arr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = this.w0;
        messagesListWidget.t0().getClass();
        int t = hr1.t(this.x0);
        if (t == 0) {
            list = p23.B(new pq3[]{new pq3(this.y0 == sf7.X ? vhc.h : vhc.f, (mge) new hge(whc.h), Integer.valueOf(phc.D0), (Integer) null, 20), new pq3(vhc.b, (mge) new hge(whc.e), Integer.valueOf(phc.u), (Integer) null, 20)});
        } else if (t == 1) {
            list = p23.B(new pq3[]{new pq3(vhc.f, (mge) new hge(whc.j), Integer.valueOf(phc.c0), (Integer) null, 20), new pq3(vhc.b, (mge) new hge(whc.g), Integer.valueOf(phc.u), (Integer) null, 20)});
        } else if (t == 2) {
            list = p23.B(new pq3[]{new pq3(vhc.f, (mge) new hge(whc.i), Integer.valueOf(phc.D0), (Integer) null, 20), new pq3(vhc.b, (mge) new hge(whc.f), Integer.valueOf(phc.u), (Integer) null, 20)});
        } else {
            throw new NoWhenBranchMatchedException();
        }
        i.e(list).build().q(messagesListWidget);
        lp.K(this.z0, je6.LONG_PRESS);
        return jue.a;
    }
}
