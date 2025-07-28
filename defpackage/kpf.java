package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.security.KeyStore;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: kpf  reason: default package */
public final class kpf implements qpf {
    public final long a;
    public final long b;
    public final Context c;
    public final wjf d;
    public final int e;
    public final String f = kpf.class.getName();

    public kpf(long j, long j2, Context context, xzc xzc) {
        StringBuilder k = hr1.k(j2, "webapp_s_key_", "_");
        k.append(j);
        wjf wjf = new wjf(k.toString(), false);
        this.a = j;
        this.b = j2;
        this.c = context;
        this.d = wjf;
        this.e = (int) ((vqc) xzc).o(PmsKey.f124webappsskeyscount, (long) 10);
    }

    public final Boolean a(String str, String str2) {
        String str3;
        SharedPreferences c2 = c();
        try {
            str3 = this.d.b(str2);
        } catch (Throwable th) {
            str3 = new kcc(th);
        }
        if (str3 instanceof kcc) {
            udd.S(this.f, "Can't encrypt value", mcc.a(str3));
            return Boolean.FALSE;
        }
        wx3.H(str3);
        String str4 = str3;
        if (c2.contains(str)) {
            c2.edit().putString(str, str4).apply();
        } else if (c2.getAll().size() == this.e) {
            return Boolean.FALSE;
        } else {
            c2.edit().putString(str, str4).apply();
        }
        return Boolean.TRUE;
    }

    public final String b(String str) {
        String str2;
        String str3 = null;
        String string = c().getString(str, (String) null);
        if (string == null) {
            return null;
        }
        try {
            str2 = wjf.a(this.d, string);
        } catch (Throwable th) {
            str2 = new kcc(th);
        }
        if (!(str2 instanceof kcc)) {
            str3 = str2;
        }
        return str3;
    }

    public final SharedPreferences c() {
        return this.c.getApplicationContext().getSharedPreferences("webapp_ss_" + this.b + "_" + this.a, 0);
    }

    public final Boolean clear() {
        jue jue;
        SharedPreferences c2 = c();
        if (c2.getAll().isEmpty()) {
            return Boolean.FALSE;
        }
        wjf wjf = this.d;
        wjf.getClass();
        try {
            ((KeyStore) ((r7e) wjf.o).getValue()).deleteEntry((String) wjf.a);
            jue = jue.a;
        } catch (Throwable th) {
            jue = new kcc(th);
        }
        if (mcc.a(jue) != null) {
            udd.U((String) wjf.c, "Can't remove secret key");
        }
        c2.edit().clear().apply();
        return Boolean.TRUE;
    }

    public final Boolean remove(String str) {
        SharedPreferences c2 = c();
        if (!c2.contains(str)) {
            return Boolean.FALSE;
        }
        c2.edit().remove(str).apply();
        return Boolean.TRUE;
    }
}
