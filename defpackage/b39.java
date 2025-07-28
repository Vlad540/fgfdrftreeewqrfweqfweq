package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* renamed from: b39  reason: default package */
public final class b39 {
    public final b2b a;
    public final ew3 b;
    public final HashMap c = new HashMap();

    public b39(Context context, ew3 ew3) {
        b2b b2b = new b2b(context);
        this.a = b2b;
        this.b = ew3;
    }

    public final synchronized qre a(String str) {
        if (this.c.containsKey(str)) {
            return (qre) this.c.get(str);
        }
        CctBackendFactory w = this.a.w(str);
        if (w == null) {
            return null;
        }
        ew3 ew3 = this.b;
        qre create = w.create(new a90(ew3.a, ew3.b, ew3.c, str));
        this.c.put(str, create);
        return create;
    }
}
