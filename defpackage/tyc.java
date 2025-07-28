package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: tyc  reason: default package */
public final class tyc implements syc, gw0 {
    public final syc a;
    public final String b;
    public final Set c;

    public tyc(syc syc) {
        this.a = syc;
        this.b = syc.a() + '?';
        this.c = ete.i(syc);
    }

    public final String a() {
        return this.b;
    }

    public final Set b() {
        return this.c;
    }

    public final boolean c() {
        return true;
    }

    public final int d(String str) {
        return this.a.d(str);
    }

    public final d8 e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyc)) {
            return false;
        }
        return hhd.f(this.a, ((tyc) obj).a);
    }

    public final int f() {
        return this.a.f();
    }

    public final String g(int i) {
        return this.a.g(i);
    }

    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final syc i(int i) {
        return this.a.i(i);
    }

    public final boolean isInline() {
        return this.a.isInline();
    }

    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
