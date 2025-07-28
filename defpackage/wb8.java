package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* renamed from: wb8  reason: default package */
public final class wb8 {
    public final ob8 a;
    public final ArrayList b = new ArrayList();
    public final lv1 c;
    public pb8 d;

    public wb8(ob8 ob8) {
        this.a = ob8;
        this.c = ob8.b;
    }

    public final xb8 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((xb8) arrayList.get(i)).b.equals(str)) {
                return (xb8) arrayList.get(i);
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.c.b).getPackageName() + " }";
    }
}
