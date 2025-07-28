package one.me.sdk.vendor.push;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/sdk/vendor/push/FcmMessagingService;", "", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "google_release"}, k = 1, mv = {2, 0, 0})
public final class FcmMessagingService extends FirebaseMessagingService {
    public final String w0 = "FCM";

    public final void c() {
        udd.q(this.w0, "onDeletedMessages");
        ebe ebe = (ebe) ((v29) y0f.a.getAccessor().c(v29.class));
        udd.q(ebe.i, "onDeletedMessages");
        ebe.a().a().f(false, true);
        ((bd) ebe.c.getValue()).f("FCM_ON_DELETED_MESSAGES");
    }

    public final void d(v8c v8c) {
        long j;
        udd.q(this.w0, "onMessageReceived");
        v29 v29 = (v29) y0f.a.getAccessor().c(v29.class);
        yr yrVar = v8c.b;
        Bundle bundle = v8c.a;
        if (yrVar == null) {
            kgd kgd = new kgd(0);
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        kgd.put(next, str);
                    }
                }
            }
            v8c.b = kgd;
        }
        yr yrVar2 = v8c.b;
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            j = ((Long) obj2).longValue();
        } else {
            if (obj2 instanceof String) {
                try {
                    j = Long.parseLong((String) obj2);
                } catch (NumberFormatException unused) {
                    Objects.toString(obj2);
                }
            }
            j = 0;
        }
        ebe ebe = (ebe) v29;
        xs7.E(ebe.h, (hu3) null, (ru3) null, new dbe(yrVar2, ebe, j, (Continuation) null), 3);
    }

    public final void e(String str) {
        udd.q(this.w0, "onNewToken");
        ebe ebe = (ebe) ((v29) y0f.a.getAccessor().c(v29.class));
        ((lqc) ((f03) ebe.d.getValue())).l("user.fcmToken", str);
        if (str.length() > 0 && ((zy9) ebe.e.getValue()).d()) {
            ((gy9) ((pk) ebe.f.getValue())).s();
        }
    }
}
