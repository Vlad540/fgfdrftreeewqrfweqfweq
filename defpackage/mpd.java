package defpackage;

import android.os.Bundle;

/* renamed from: mpd  reason: default package */
public final class mpd extends u2 {
    public static final mpd c = new u2(8);

    public final a34 Z1(long j) {
        return new a34(us8.j(j, ":chats?id=", "&type=local"));
    }

    public final void a2() {
        P1().b(":chat-list", (Bundle) null);
    }

    public final void b2(u16 u16) {
        P1().e(new r8b(4, u16));
    }
}
