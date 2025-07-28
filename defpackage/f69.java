package defpackage;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: f69  reason: default package */
public final class f69 extends BaseAdapter {
    public static final int X = ((jze.d((Calendar) null).getMaximum(7) + jze.d((Calendar) null).getMaximum(5)) - 1);
    public static final int o = jze.d((Calendar) null).getMaximum(4);
    public final e69 a;
    public afc b;
    public final kw0 c;

    public f69(e69 e69, kw0 kw0) {
        this.a = e69;
        this.c = kw0;
        throw null;
    }

    public final int a() {
        int i = this.c.X;
        e69 e69 = this.a;
        Calendar calendar = e69.a;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + e69.o : i3;
    }

    /* renamed from: b */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        Calendar b2 = jze.b(this.a.a);
        b2.set(5, (i - a()) + 1);
        return Long.valueOf(b2.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.X) - 1;
    }

    public final int getCount() {
        return X;
    }

    public final long getItemId(int i) {
        return (long) (i / this.a.o);
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            afc r1 = r4.b
            if (r1 != 0) goto L_0x0010
            afc r1 = new afc
            r2 = 6
            r1.<init>(r0, r2)
            r4.b = r1
        L_0x0010:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L_0x0027
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r0 = defpackage.wrb.mtrl_calendar_day
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L_0x005d
            e69 r7 = r4.a
            int r2 = r7.X
            if (r6 < r2) goto L_0x0036
            goto L_0x005d
        L_0x0036:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x0065
        L_0x005d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L_0x0065:
            java.lang.Long r4 = r4.getItem(r5)
            if (r4 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            if (r0 != 0) goto L_0x006f
        L_0x006e:
            return r0
        L_0x006f:
            r0.getContext()
            java.util.Calendar r4 = defpackage.jze.c()
            r4.getTimeInMillis()
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f69.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
