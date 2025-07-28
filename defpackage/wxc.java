package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: wxc  reason: default package */
public final class wxc {
    public final Context a;
    public final t97 b;
    public final t97 c;
    public final r7e d;
    public final t97 e;
    public final dbc f;
    public final dbc g;

    public wxc(Context context, t97 t97, t97 t972, t97 t973, nge nge, int i) {
        this.a = context;
        this.b = t97;
        this.c = t972;
        this.d = new r7e(new jw8(i, 1));
        this.e = t973;
        this.f = new dbc(new u5b(18, this));
        this.g = new dbc(new nya(nge, 13, this));
    }

    public static /* synthetic */ Layout b(wxc wxc, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return wxc.a(0, str, z);
    }

    public final Layout a(int i, CharSequence charSequence, boolean z) {
        r7e r7e = this.d;
        Layout layout = (Layout) ((kr7) r7e.getValue()).c(charSequence);
        if (layout != null) {
            return layout;
        }
        t97 t97 = this.c;
        t97 t972 = this.b;
        dbc dbc = this.g;
        if (!z) {
            Layout b2 = ((p97) t972.getValue()).a(charSequence, (TextPaint) dbc.getValue(), ((p0a) ((jr0) t97.getValue())).a() - i, 1, false, TextUtils.TruncateAt.END);
            ((kr7) r7e.getValue()).d(charSequence, b2);
            return b2;
        }
        u1c u1c = new u1c(6);
        Layout d2 = xy6.d(this.a, (p97) t972.getValue(), charSequence, ((p0a) ((jr0) t97.getValue())).a() - i, (TextPaint) dbc.getValue(), u1c);
        ((kr7) r7e.getValue()).d(charSequence, d2);
        return d2;
    }

    public final void c() {
        r7e r7e = this.d;
        if (r7e.a()) {
            ((kr7) r7e.getValue()).i(-1);
            this.f.b();
            this.g.b();
        }
    }

    public wxc(t97 t97, t97 t972, t97 t973, Context context) {
        this(context, t97, t972, t973, jp2.i, 200);
    }
}
