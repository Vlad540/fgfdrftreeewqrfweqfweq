package defpackage;

import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: uq9  reason: default package */
public final class uq9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uq9(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.Y = notificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uq9 uq9 = new uq9(continuation, this.Y);
        uq9.X = obj;
        return uq9;
    }

    public final Object o(Object obj) {
        kcc kcc;
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        boolean z = a34 instanceof a34;
        kcc kcc2 = jue.a;
        if (z) {
            lp9.c.R1(a34);
        } else if (a34 instanceof oq9) {
            String str = oyb.g;
            Context context = this.Y.getContext();
            try {
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                context.startActivity(intent);
                kcc = kcc2;
            } catch (Throwable th) {
                kcc = new kcc(th);
            }
            Throwable a = mcc.a(kcc);
            if (a != null) {
                udd.s(oyb.g, "openNotificationsSettings: failed", a);
            }
        }
        return kcc2;
    }
}
