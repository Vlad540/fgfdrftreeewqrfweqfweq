package defpackage;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;

/* renamed from: b4a  reason: default package */
public final class b4a {
    public final Context a;
    public final bs b = kjd.d("ru.oneme.app.dialogs", "ru.oneme.app.chats", "ru.oneme.app.inapp.2");
    public final bs c = kjd.d("ru.oneme.app.new.incomingCalls.", "ru.oneme.app.new.activeCalls");
    public final bs d = kjd.d("ru.oneme.app.misc", "ru.oneme.app.fileUpload", "ru.oneme.app.media");
    public final r7e e = new r7e(new qk8(13, this));

    public b4a(Context context, o54 o54) {
        this.a = context;
        o54.getClass();
    }

    public final void a(int i, String str) {
        ((NotificationManager) this.e.getValue()).createNotificationChannelGroup(new NotificationChannelGroup(str, this.a.getString(i)));
    }

    public final String b(String str) {
        if (this.b.contains(str)) {
            return "ru.oneme.app.notifications.group.chats";
        }
        if (this.d.contains(str)) {
            return "ru.oneme.app.notifications.group.other";
        }
        if (this.c.contains(str)) {
            return "ru.oneme.app.notifications.group.calls";
        }
        return null;
    }
}
