package defpackage;

import android.content.Intent;

/* renamed from: oc1  reason: default package */
public final class oc1 extends u2 {
    public static final oc1 c = new u2(8);

    public final void Z1(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        P1().b(":chats/share", jjd.j(new wia("ru.ok.tamtam.extra.DATA", intent), new wia("ru.ok.tamtam.extra.SHARE_TITLE", str2), new wia("tag", str3)));
    }
}
