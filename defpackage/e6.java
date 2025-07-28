package defpackage;

import android.app.SharedElementCallback;
import android.graphics.Rect;
import android.view.View;
import java.util.List;
import java.util.Map;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: e6  reason: default package */
public final class e6 extends SharedElementCallback {
    public final /* synthetic */ Rect a;
    public final /* synthetic */ ActLocalMedias b;

    public e6(ActLocalMedias actLocalMedias, Rect rect) {
        this.b = actLocalMedias;
        this.a = rect;
    }

    public final void onMapSharedElements(List list, Map map) {
        Rect rect;
        if (map != null && (rect = this.a) != null) {
            for (View j : map.values()) {
                at7.j(rect, j);
            }
        }
    }

    public final void onRejectSharedElements(List list) {
        if (list != null && !list.isEmpty()) {
            this.b.g1.postDelayed(new b(4, (Object) this), 100);
        }
    }
}
