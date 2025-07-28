package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: y24  reason: default package */
public final class y24 {
    public final LinkedHashMap a = new LinkedHashMap();

    public y24(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z24 z24 = (z24) it.next();
            for (c34 put : z24.a().a) {
                this.a.put(put, z24);
            }
        }
    }

    public final wia a(Uri uri) {
        String a2 = k34.a(uri);
        for (Map.Entry entry : this.a.entrySet()) {
            c34 c34 = (c34) entry.getKey();
            z24 z24 = (z24) entry.getValue();
            if (k34.a(c34.a).equals(a2)) {
                return new wia(c34, z24);
            }
        }
        return null;
    }
}
