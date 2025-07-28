package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: p0a  reason: default package */
public final class p0a implements jr0 {
    public final Context a;
    public final t97 b;
    public final r7e c = new r7e(new o0a(this, 0));
    public final dbc d = new dbc(new o0a(this, 1));

    public p0a(ua3 ua3, Context context, t97 t97) {
        this.a = context;
        this.b = t97;
        ua3.a(ua3.c | ua3.d, new kw8(1, this));
    }

    public final int a() {
        return this.a.getResources().getConfiguration().orientation == 1 ? b() : b();
    }

    public final int b() {
        return rf0.l((float) 10, dh4.c().getDisplayMetrics().density, 2, ((Number) this.d.getValue()).intValue());
    }

    public final float c() {
        return TypedValue.applyDimension(2, ((Number) ((yte) this.c.getValue()).a.getValue()).floatValue(), dh4.c().getDisplayMetrics()) + ah4.c(jp2.e.g((yq4) ((o4a) this.b.getValue()).a.getValue()), this.a);
    }
}
