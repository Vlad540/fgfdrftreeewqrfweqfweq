package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: cq1  reason: default package */
public final class cq1 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final r7e e;
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final t97 i;
    public final t97 j = ez3.O(3, new di1(24));
    public final t97 k = ez3.O(3, new di1(25));

    public cq1(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.a = t974;
        this.b = t975;
        this.c = t973;
        this.d = t972;
        this.e = new r7e(new xq(4, t972));
        this.f = ez3.O(3, new xq(5, t97));
        this.g = ez3.O(3, new xq(6, t97));
        this.h = ez3.O(3, new xq(7, t97));
        this.i = ez3.O(3, new xq(8, t97));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, wna] */
    public static wna b(String str, String str2, Bitmap bitmap) {
        IconCompat iconCompat;
        if (!(!h0e.c0(str))) {
            str = h0e.c0(str2) ^ true ? str2 : "...";
        }
        if (bitmap != null) {
            iconCompat = new IconCompat(5);
            iconCompat.b = bitmap;
        } else {
            iconCompat = null;
        }
        ? obj = new Object();
        obj.a = str;
        obj.b = iconCompat;
        obj.c = null;
        obj.d = null;
        obj.e = false;
        obj.f = true;
        return obj;
    }

    public final void a() {
        udd.p("CallsNotification", "cancel call notification", new Object[0]);
        e().b.cancel((String) null, 239);
        e().b.cancel((String) null, 240);
    }

    public final Notification c(Context context, k11 k11, boolean z, boolean z2) {
        udd.p("CallsNotification", "createTempNotification", new Object[0]);
        CharSequence charSequence = k11.b;
        if (charSequence == null) {
            charSequence = (String) this.f.getValue();
        }
        String str = !z2 ? (String) this.i.getValue() : z ? (String) this.h.getValue() : (String) this.g.getValue();
        int intValue = z ? ((Number) this.k.getValue()).intValue() : ((Number) this.j.getValue()).intValue();
        ((o7a) this.d.getValue()).m();
        ((o54) this.c.getValue()).getClass();
        un9 un9 = new un9(context, "ru.oneme.app.new.activeCalls");
        un9.k = -1;
        un9.v = "call";
        un9.F.icon = intValue;
        un9.e = un9.c(charSequence);
        un9.f = un9.c(str);
        return un9.b();
    }

    public final h91 d() {
        return (h91) this.b.getValue();
    }

    public final ip9 e() {
        return (ip9) this.e.getValue();
    }
}
