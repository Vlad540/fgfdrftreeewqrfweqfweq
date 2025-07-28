package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* renamed from: caf  reason: default package */
public final class caf implements OnReceiveContentListener {
    public final rx9 a;

    public caf(rx9 rx9) {
        this.a = rx9;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        xp3 xp3 = new xp3(new lv1(contentInfo));
        xp3 a2 = this.a.a(view, xp3);
        if (a2 == null) {
            return null;
        }
        if (a2 == xp3) {
            return contentInfo;
        }
        ContentInfo i = a2.a.i();
        Objects.requireNonNull(i);
        return p20.m(i);
    }
}
