package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: h46  reason: default package */
public abstract class h46 {
    public static final List e = p23.B(new h46[]{f46.f, g46.f});
    public final String a = "_size > 0";
    public final String[] b = null;
    public final String c = hr1.g(d(), " DESC");
    public final String[] d = ((String[]) cs.X(new String[]{f(), b(), a(), c(), d(), g(), h(), e()}).toArray(new String[0]));

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public String e() {
        return null;
    }

    public abstract String f();

    public abstract String g();

    public String h() {
        return null;
    }

    public abstract Uri i();

    public abstract String j();

    public final String toString() {
        return "QueryParams(name='" + '*' + "')";
    }
}
