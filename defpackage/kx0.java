package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.MainActivity;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* renamed from: kx0  reason: default package */
public final class kx0 {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public kx0(t97 t97, t97 t972, t97 t973) {
        this.a = t972;
        this.b = t973;
        this.c = t97;
    }

    public final boolean a(Context context, Intent intent, String str) {
        Context context2 = context;
        udd.p("CallActionsProcessor", "handleCallNotificationActionIntent action=" + intent.getAction() + " from=" + str, new Object[0]);
        String action = intent.getAction();
        if (action == null) {
            return false;
        }
        qz0 qz0 = (qz0) z11.a.getAccessor().c(qz0.class);
        f91 a2 = lu7.a(action);
        Class<MainActivity> cls = MainActivity.class;
        if (a2.equals(b91.a)) {
            Intent intent2 = new Intent(context2, cls);
            intent2.setAction("action-open-call");
            intent2.setFlags(268435456);
            context2.startActivity(intent2);
        } else {
            boolean equals = a2.equals(w81.a);
            t97 t97 = this.c;
            if (equals) {
                if (((qna) this.a.getValue()).b(qna.h)) {
                    ((ep1) ((so1) t97.getValue())).e();
                    Intent intent3 = new Intent(context2, cls);
                    intent3.setAction("action-open-call");
                    intent3.setFlags(268435456);
                    context2.startActivity(intent3);
                } else {
                    Bundle extras = intent.getExtras();
                    Intent intent4 = new Intent(context2, cls);
                    intent4.setAction("action-open-incoming");
                    if (extras != null) {
                        intent4.putExtras(extras);
                    }
                    intent4.setFlags(268435456);
                    context2.startActivity(intent4);
                }
            } else if (a2.equals(z81.a)) {
                ((ep1) ((so1) t97.getValue())).v();
            } else if (a2.equals(x81.a)) {
                iq1 iq1 = (iq1) this.b.getValue();
                String str2 = ((ep1) ((so1) t97.getValue())).k().c;
                rz0 rz0 = (rz0) qz0;
                boolean z = ((ep1) ((so1) t97.getValue())).k().h;
                iq1.getClass();
                iq1.c(iq1, "AUDIO_ENABLED", str2, (String) null, Integer.valueOf(rz0.d() ^ true ? 1 : 0), (String) null, (String) null, z, 52);
                boolean z2 = !rz0.d();
                MicrophoneManager c2 = rz0.c();
                if (c2 != null) {
                    c2.setMicEnabled(z2);
                }
            } else if (a2.equals(y81.a)) {
                ((ep1) ((so1) t97.getValue())).w(fe6.c);
            } else if (a2.equals(c91.a)) {
                Bundle extras2 = intent.getExtras();
                Intent intent5 = new Intent(context2, cls);
                intent5.setAction("action-open-incoming");
                if (extras2 != null) {
                    intent5.putExtras(extras2);
                }
                intent5.setFlags(268435456);
                context2.startActivity(intent5);
            } else if (a2.equals(a91.a)) {
                Bundle extras3 = intent.getExtras();
                Intent intent6 = new Intent(context2, cls);
                intent6.setAction("action-join-link");
                if (extras3 != null) {
                    intent6.putExtras(extras3);
                }
                intent6.setFlags(268435456);
                context2.startActivity(intent6);
            } else if (a2.equals(d91.a)) {
                Bundle extras4 = intent.getExtras();
                Intent intent7 = new Intent(context2, cls);
                intent7.setAction("action-rate-call");
                if (extras4 != null) {
                    intent7.putExtras(extras4);
                }
                intent7.setFlags(268435456);
                context2.startActivity(intent7);
            } else if (a2.equals(e91.a)) {
                return false;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
