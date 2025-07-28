package defpackage;

import android.content.Context;
import android.graphics.PointF;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* renamed from: m81  reason: default package */
public final class m81 implements l81, qk1 {
    public final t97 a;
    public final PointF b;
    public final t97 c;

    public m81(t97 t97, t97 t972) {
        this.a = t97;
        this.c = ez3.O(3, new xq(3, t97));
        ((vp1) t972.getValue()).d(this);
        this.b = kjd.y((Context) t97.getValue());
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        m81.super.onDestroyed(conversationDestroyedInfo);
        PointF y = kjd.y((Context) this.a.getValue());
        PointF pointF = this.b;
        pointF.x = y.x;
        pointF.y = y.y;
    }
}
