package defpackage;

import android.net.Uri;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: ppc  reason: default package */
public final class ppc {
    public static final ppc c;
    public final wk a;
    public final zgd b;

    static {
        ppc ppc = new ppc(zgd.d, wk.f);
        c = ppc;
        ppc.d(Uri.parse("https://api.odnoklassniki.ru"));
    }

    public ppc(zgd zgd, wk wkVar) {
        this.b = zgd;
        this.a = wkVar;
    }

    public final Uri a() {
        zgd zgd = this.b;
        int binarySearch = Arrays.binarySearch(zgd.a, "api");
        return (Uri) (binarySearch < 0 ? null : zgd.b[binarySearch]);
    }

    public final ppc b(String str) {
        wk wkVar = this.a;
        if (Objects.equals(str, wkVar.a)) {
            return this;
        }
        String str2 = wkVar.d;
        if (str2 != null) {
            throw new IllegalStateException("Some session key");
        } else if (wkVar.c == null) {
            if (!str.equals(wkVar.a)) {
                wkVar = new wk(str, str2, wkVar.e);
            }
            return new ppc(this.b, wkVar);
        } else {
            throw new IllegalStateException("Some auth token");
        }
    }

    public final ppc c(String str, String str2) {
        wk wkVar = this.a;
        boolean equals = Objects.equals(str, wkVar.d);
        String str3 = wkVar.e;
        if (equals && Objects.equals(str2, str3)) {
            return this;
        }
        String str4 = wkVar.a;
        if (str4 != null) {
            if (!str.equals(wkVar.d) || !str2.equals(str3)) {
                wkVar = new wk(str4, str, str2);
            }
            return new ppc(this.b, wkVar);
        }
        throw new IllegalStateException("No app key");
    }

    public final ppc d(Uri uri) {
        zgd zgd;
        zgd zgd2 = this.b;
        Comparable[] comparableArr = zgd2.a;
        int binarySearch = Arrays.binarySearch(comparableArr, "api");
        Object[] objArr = zgd2.b;
        if (binarySearch < 0) {
            int i = -binarySearch;
            int i2 = i - 1;
            Class<?> componentType = comparableArr.getClass().getComponentType();
            int i3 = zgd2.c + 1;
            Comparable[] comparableArr2 = (Comparable[]) Array.newInstance(componentType, i3);
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
            System.arraycopy(comparableArr, 0, comparableArr2, 0, i2);
            comparableArr2[i2] = "api";
            System.arraycopy(comparableArr, i2, comparableArr2, i, comparableArr.length - i2);
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            objArr2[i2] = uri;
            System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
            zgd = new zgd(comparableArr2, objArr2);
        } else if (Objects.equals(objArr[binarySearch], uri)) {
            zgd = zgd2;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[binarySearch] = uri;
            zgd = new zgd(comparableArr, copyOf);
        }
        return zgd == zgd2 ? this : new ppc(zgd, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ppc.class != obj.getClass()) {
            return false;
        }
        ppc ppc = (ppc) obj;
        return this.a.equals(ppc.a) && this.b.equals(ppc.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SdkApiConfig{apiConfig=" + this.a + ", uris=" + this.b + '}';
    }
}
