package defpackage;

import java.util.Locale;

/* renamed from: m75  reason: default package */
public abstract class m75 {
    public static eo7 a = n75.b;

    public static void a(Class cls, String str) {
        if (a.i(6)) {
            a.e(cls.getSimpleName(), str);
        }
    }

    public static void b(Class cls, String str, Object... objArr) {
        if (a.i(6)) {
            a.e(cls.getSimpleName(), String.format((Locale) null, str, objArr));
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (a.i(6)) {
            a.e(str, str2, th);
        }
    }

    public static void d(Class cls, Object obj, String str) {
        if (a.i(2)) {
            eo7 eo7 = a;
            String simpleName = cls.getSimpleName();
            String.format((Locale) null, str, new Object[]{obj});
            eo7.b(simpleName);
        }
    }

    public static void e(Class cls, String str, Object obj, Object obj2) {
        if (a.i(2)) {
            eo7 eo7 = a;
            String simpleName = cls.getSimpleName();
            String.format((Locale) null, str, new Object[]{obj, obj2});
            eo7.b(simpleName);
        }
    }

    public static void f(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (a.i(2)) {
            String.format((Locale) null, str, new Object[]{obj, obj2, obj3});
            if (a.i(2)) {
                a.b(cls.getSimpleName());
            }
        }
    }

    public static void g(String str, Long l, Object obj, Object obj2) {
        if (a.i(2)) {
            eo7 eo7 = a;
            String.format((Locale) null, str, new Object[]{l, obj, obj2});
            eo7.b("RequestLoggingListener");
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        if (a.i(2)) {
            eo7 eo7 = a;
            String.format((Locale) null, str2, objArr);
            eo7.b(str);
        }
    }

    public static void i(Class cls, String str, Exception exc) {
        if (a.i(5)) {
            a.w(cls.getSimpleName(), str, exc);
        }
    }

    public static void j(Class cls, String str, Object... objArr) {
        if (a.i(5)) {
            a.w(cls.getSimpleName(), String.format((Locale) null, str, objArr));
        }
    }

    public static void k(Exception exc) {
        if (a.i(5)) {
            a.w("OkHttpNetworkFetchProducer", "Exception when closing response body", exc);
        }
    }

    public static void l(Exception exc, String str, Object... objArr) {
        if (a.i(5)) {
            i(ys0.class, String.format((Locale) null, str, objArr), exc);
        }
    }

    public static void m(String str, String str2, Object... objArr) {
        if (a.i(5)) {
            a.w(str, String.format((Locale) null, str2, objArr));
        }
    }

    public static void n(String str, String str2, Object... objArr) {
        if (a.i(6)) {
            a.f(str, String.format((Locale) null, str2, objArr));
        }
    }
}
