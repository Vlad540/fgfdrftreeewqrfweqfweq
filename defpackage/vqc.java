package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: vqc  reason: default package */
public abstract class vqc extends f3 implements xzc {
    public static final hw4 o = hw4.a;
    public static final r7e p = new r7e(new vfc(6));
    public final bs h = new bs(1);
    public final r7e i = new r7e(new tqc(this, 0));
    public final dbc j = new dbc(new tqc(this, 1));
    public final dbc k = new dbc(new tqc(this, 2));
    public final r7e l;
    public final CopyOnWriteArraySet m;
    public final r7e n;

    static {
        p23.B(new String[]{"TOP", "NEW"});
        p23.B(new String[]{"RECENT", "NEW", "TOP"});
    }

    public vqc(Context context, we5 we5) {
        super(context, "settings.prefs", we5);
        this.l = new r7e(new t2a(context, 27));
        this.m = new CopyOnWriteArraySet();
        this.n = new r7e(new tqc(this, 3));
    }

    public final void b() {
        super.b();
        this.k.b();
    }

    public final boolean m(Enum enumR, boolean z) {
        return this.g.getBoolean(enumR.name(), z);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List n(java.lang.Enum r3, java.util.List r4) {
        /*
            r2 = this;
            java.lang.String r3 = r3.name()
            r0 = 0
            java.lang.String r2 = r2.f(r3, r0)
            if (r2 != 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0012 }
            r3.<init>((java.lang.String) r2)     // Catch:{ JSONException -> 0x0012 }
            r0 = r3
        L_0x0012:
            if (r0 != 0) goto L_0x0015
            goto L_0x0033
        L_0x0015:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r2 = r0.length()
            r4.<init>(r2)
            int r2 = r0.length()
            r3 = 0
        L_0x0023:
            if (r3 >= r2) goto L_0x0033
            int r1 = r0.getInt(r3)     // Catch:{ all -> 0x0030 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0030 }
            r4.add(r1)     // Catch:{ all -> 0x0030 }
        L_0x0030:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0033:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqc.n(java.lang.Enum, java.util.List):java.util.List");
    }

    public final long o(Enum enumR, long j2) {
        Number number;
        try {
            number = Long.valueOf(e(enumR.name(), j2));
        } catch (ClassCastException unused) {
            number = Integer.valueOf(d(enumR.name(), (int) j2));
        }
        return number.longValue();
    }

    public final int p() {
        return (int) o(PmsKey.f60maxdescriptionlength, (long) HttpStatus.SC_BAD_REQUEST);
    }

    public final String q(Enum enumR, String str) {
        String v = v(enumR, str);
        if (v != null) {
            return v;
        }
        throw new IllegalArgumentException(("got null string value for " + enumR).toString());
    }

    public final List r(Enum enumR, List list) {
        List g = g(enumR.name(), list);
        if (g != null) {
            return g;
        }
        throw new IllegalArgumentException(("got null stringlist value for " + enumR).toString());
    }

    public final boolean s() {
        return m(PmsKey.f29draftssyncenabled, false);
    }

    public final boolean t() {
        return m(PmsKey.f98safemodeenabled, false);
    }

    public final boolean u() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final String v(Enum enumR, String str) {
        return f(enumR.name(), str);
    }
}
