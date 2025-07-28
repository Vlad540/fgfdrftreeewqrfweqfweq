package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.android.calls.CallNotifierBroadcastReceiver;
import one.me.android.calls.CallNotifierFixActivity;

/* renamed from: h91  reason: default package */
public final class h91 {
    public final t97 a;

    public h91(t97 t97) {
        this.a = t97;
    }

    public static void b(Intent intent, k11 k11, boolean z) {
        intent.setAction("action-open-incoming");
        CharSequence charSequence = k11.b;
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        intent.putExtra("incoming_param_name", charSequence);
        String str = k11.c;
        intent.putExtra("incoming_param_avatar", str != null ? Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0) : null);
        Long l = k11.a;
        intent.putExtra("incoming_param_chat_id", l != null ? l.longValue() : 0);
        intent.putExtra("incoming_param_is_video", z);
        intent.setFlags(268435456);
    }

    public final PendingIntent a(Application application, u16 u16) {
        if (d1f.a >= 31) {
            Intent intent = new Intent(application, CallNotifierFixActivity.class);
            u16.invoke(intent);
            return PendingIntent.getActivity(application, 0, intent, 201326592);
        }
        Intent intent2 = new Intent(application, CallNotifierBroadcastReceiver.class);
        u16.invoke(intent2);
        return PendingIntent.getBroadcast(application, 0, intent2, 201326592);
    }

    public final Application c() {
        return (Application) this.a.getValue();
    }

    public final PendingIntent d() {
        Application c = c();
        if (d1f.a >= 31) {
            Intent intent = new Intent(c, CallNotifierFixActivity.class);
            intent.setAction("action-microphone-state");
            return PendingIntent.getActivity(c, 0, intent, 201326592);
        }
        Intent intent2 = new Intent(c, CallNotifierBroadcastReceiver.class);
        intent2.setAction("action-microphone-state");
        return PendingIntent.getBroadcast(c, 0, intent2, 201326592);
    }
}
