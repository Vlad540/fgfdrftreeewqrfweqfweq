package defpackage;

import android.content.Context;

/* renamed from: qpc  reason: default package */
public abstract class qpc extends f3 implements ip {
    public final jk0 h = jk0.z(Float.valueOf(this.g.getFloat("app.extra.text.size.sp", 0.0f)));
    public final jk0 i = jk0.z(Integer.valueOf(d("app.extra.text.size.mode", 1)));
    public final jk0 j = jk0.z(Integer.valueOf(o()));
    public final jk0 k = jk0.z(Integer.valueOf(n()));

    public qpc(Context context, we5 we5) {
        super(context, "app.prefs", we5);
    }

    public final boolean m() {
        return this.g.getBoolean("app.media.load.roaming", false);
    }

    public final int n() {
        return d("app.notification.chats.show", 0);
    }

    public final int o() {
        return d("app.notification.dialogs.show", 0);
    }

    public final n2f p() {
        String string = this.g.getString("app.media.video.compress", (String) null);
        return string == null ? n2f.OPTIMAL : n2f.valueOf(string);
    }

    public final boolean q() {
        return this.g.getBoolean("app.privacy.safe_mode", false);
    }

    public final void r(int i2) {
        j(i2, "app.notification.chats.show");
        if (i2 != 1) {
            j(i2, "app.notification.chats.show.last");
        }
        this.k.c(Integer.valueOf(i2));
    }
}
