package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: wn8  reason: default package */
public final class wn8 {
    public final r7e A;
    public final r7e B;
    public final r7e C;
    public final Context a;
    public final String b = wn8.class.getName();
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final dbc h;
    public final r7e i;
    public final r7e j;
    public final r7e k;
    public final r7e l;
    public final r7e m;
    public final r7e n;
    public final r7e o;
    public final r7e p;
    public final r7e q;
    public final r7e r;
    public final r7e s;
    public final r7e t;
    public final r7e u;
    public final r7e v;
    public final r7e w;
    public final r7e x;
    public final r7e y;
    public final r7e z;

    public wn8(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, Context context) {
        this.a = context;
        this.c = t97;
        this.d = t972;
        this.e = t973;
        this.f = t974;
        this.g = t975;
        this.h = new dbc(new tn8(this, 0));
        this.i = new r7e(new tn8(this, 2));
        this.j = new r7e(new tn8(this, 5));
        this.k = new r7e(new tn8(this, 6));
        this.l = new r7e(new tn8(this, 7));
        this.m = new r7e(new tn8(this, 8));
        this.n = new r7e(new tn8(this, 9));
        this.o = new r7e(new tn8(this, 10));
        this.p = new r7e(new tn8(this, 12));
        this.q = new r7e(new tn8(this, 13));
        this.r = new r7e(new tn8(this, 11));
        this.s = new r7e(new tn8(this, 14));
        this.t = new r7e(new tn8(this, 15));
        this.u = new r7e(new tn8(this, 16));
        this.v = new r7e(new tn8(this, 17));
        this.w = new r7e(new tn8(this, 18));
        this.x = new r7e(new tn8(this, 19));
        this.y = new r7e(new tn8(this, 20));
        this.z = new r7e(new tn8(this, 21));
        this.A = new r7e(new tn8(this, 1));
        this.B = new r7e(new tn8(this, 3));
        this.C = new r7e(new tn8(this, 4));
    }

    public final Layout a(wy wyVar) {
        e();
        return f().a(hr1.g((String) this.s.getValue(), ":"), (TextPaint) this.k.getValue(), b(wyVar, 0), 1, false, TextUtils.TruncateAt.END);
    }

    public final int b(wy wyVar, int i2) {
        int a2;
        rz rzVar = wyVar.d;
        if (rzVar instanceof gtd) {
            a2 = a24.X(((float) ((gtd) rzVar).a.w0) * dh4.c().getDisplayMetrics().density) - (a24.X(((float) 10) * dh4.c().getDisplayMetrics().density) * 2);
        } else {
            boolean z2 = rzVar instanceof m40;
            t97 t97 = this.e;
            if (z2) {
                int intValue = ((Number) ((p0a) ((jr0) t97.getValue())).d.getValue()).intValue();
                float f2 = (float) 192;
                return (((int) ((((float) me4.p(f2, dh4.c().getDisplayMetrics().density, intValue)) * (((float) (gwf.k(((m40) rzVar).j, 1000, 30000) - 1000)) / ((float) 29000))) + ((float) a24.X(dh4.c().getDisplayMetrics().density * f2)))) - (a24.X(((float) 10) * dh4.c().getDisplayMetrics().density) * 2)) - i2;
            }
            a2 = ((p0a) ((jr0) t97.getValue())).a();
        }
        return a2 - i2;
    }

    public final Layout c(CharSequence charSequence, wy wyVar, boolean z2, boolean z3, boolean z4) {
        e();
        int b2 = b(wyVar, a24.X(((float) (z2 ? 52 : 8)) * dh4.c().getDisplayMetrics().density));
        if (!z3) {
            return f().a(charSequence, g(), b2, 1, false, TextUtils.TruncateAt.END);
        }
        return xy6.d(this.a, f(), charSequence, b2, g(), new un8(z4, 0));
    }

    public final Layout d(Drawable drawable, String str, wy wyVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        udd.d(spannableStringBuilder, "​", new Object[]{new vn8(drawable)});
        udd.d(spannableStringBuilder, "​", new Object[]{new wld(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density))});
        spannableStringBuilder.append(str);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        e();
        return f().a(spannedString, (TextPaint) this.j.getValue(), b(wyVar, a24.X(((float) 8) * dh4.c().getDisplayMetrics().density)), 1, false, TextUtils.TruncateAt.END);
    }

    public final void e() {
        dbc dbc = this.h;
        if (dbc.getValue() != ((o4a) this.g.getValue()).a.getValue()) {
            dbc.b();
            boolean a2 = this.i.a();
            Context context = this.a;
            if (a2) {
                jp2.j.a(g(), context.getResources().getDisplayMetrics(), (yq4) dbc.getValue());
            }
            r7e r7e = this.j;
            if (r7e.a()) {
                jp2.f.a((TextPaint) r7e.getValue(), context.getResources().getDisplayMetrics(), (yq4) dbc.getValue());
            }
            r7e r7e2 = this.k;
            if (r7e2.a()) {
                jp2.g.a((TextPaint) r7e2.getValue(), context.getResources().getDisplayMetrics(), (yq4) dbc.getValue());
            }
            r7e r7e3 = this.l;
            if (r7e3.a()) {
                jp2.c.a((TextPaint) r7e3.getValue(), context.getResources().getDisplayMetrics(), (yq4) dbc.getValue());
            }
            r7e r7e4 = this.m;
            if (r7e4.a()) {
                jp2.i.a((TextPaint) r7e4.getValue(), context.getResources().getDisplayMetrics(), (yq4) dbc.getValue());
            }
        }
    }

    public final p97 f() {
        return (p97) this.d.getValue();
    }

    public final TextPaint g() {
        return (TextPaint) this.i.getValue();
    }
}
