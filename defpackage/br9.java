package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: br9  reason: default package */
public final class br9 extends l5e implements i26 {
    public final /* synthetic */ cr9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public br9(cr9 cr9, Continuation continuation) {
        super(2, continuation);
        this.X = cr9;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new br9(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = cr9.G0;
        cr9 cr9 = this.X;
        kp kpVar = (kp) cr9.q();
        kpVar.k("app.notification.dontDisturbUntil", 0L);
        kpVar.i("app.notification.show.text", true);
        kpVar.l("app.notification.ringtone", (String) null);
        kpVar.i("app.notification.vibrate", true);
        kpVar.j(kpVar.t(), "app.notification.led.color");
        kpVar.j(0, "app.notification.dialogs.show");
        kpVar.j.c(0);
        kpVar.l("app.notification.dialogs.ringtone", (String) null);
        kpVar.i("app.notification.dialogs.vibrate", true);
        kpVar.j(kpVar.t(), "app.notification.dialogs.led.color");
        kpVar.r(0);
        kpVar.l("app.notification.chats.ringtone", (String) null);
        kpVar.i("app.notification.chats.vibrate", true);
        kpVar.j(kpVar.t(), "app.notification.chats.led.color");
        kpVar.l("app.group.chat.call.notification.status", "ON");
        kpVar.i("app.notification.in.app.sound", true);
        kpVar.i("app.notification.in.app.vibrate", true);
        kpVar.i("app.notification.show.new.users", true);
        kpVar.i("app.notification.show.drafts", true);
        pk pkVar = (pk) cr9.o.getValue();
        pkVar.getClass();
        ((gy9) pkVar).t((gze) null, true);
        grd grd = cr9.B0;
        grd.m((Object) null, new Integer(((Number) grd.getValue()).intValue() + 1));
        return jue.a;
    }
}
