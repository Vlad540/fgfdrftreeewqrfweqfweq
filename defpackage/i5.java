package defpackage;

import android.app.SharedElementCallback;
import android.graphics.Rect;
import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: i5  reason: default package */
public final class i5 extends SharedElementCallback {
    public final /* synthetic */ Rect a;

    public i5(Rect rect) {
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
}
