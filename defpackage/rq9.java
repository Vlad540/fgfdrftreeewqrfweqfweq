package defpackage;

import android.os.Build;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: rq9  reason: default package */
public final class rq9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rq9(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.Y = notificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rq9 rq9 = new rq9(continuation, this.Y);
        rq9.X = obj;
        return rq9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (((Boolean) this.X).booleanValue()) {
            NotificationsSettingsScreen notificationsSettingsScreen = this.Y;
            qna qna = (qna) notificationsSettingsScreen.o.getValue();
            jrf jrf = new jrf(notificationsSettingsScreen, 1);
            if (Build.VERSION.SDK_INT >= 33) {
                qna.d(jrf, qna.k, 177, iub.permissions_post_notification_request_rationale, iub.permissions_post_notification_request_title, iub.permissions_post_notification_request_positive_button);
            } else {
                qna.getClass();
            }
        }
        return jue.a;
    }
}
