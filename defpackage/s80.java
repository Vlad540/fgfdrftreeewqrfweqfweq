package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* renamed from: s80  reason: default package */
public final class s80 {
    public final String a;
    public final Class b;
    public final c2d c;
    public final pye d;
    public final Size e;
    public final va0 f;
    public final List g;

    public s80(String str, Class cls, c2d c2d, pye pye, Size size, va0 va0, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = cls;
            if (c2d != null) {
                this.c = c2d;
                if (pye != null) {
                    this.d = pye;
                    this.e = size;
                    this.f = va0;
                    this.g = arrayList;
                    return;
                }
                throw new NullPointerException("Null useCaseConfig");
            }
            throw new NullPointerException("Null sessionConfig");
        }
        throw new NullPointerException("Null useCaseId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s80)) {
            return false;
        }
        s80 s80 = (s80) obj;
        if (this.a.equals(s80.a) && this.b.equals(s80.b) && this.c.equals(s80.c) && this.d.equals(s80.d)) {
            Size size = s80.e;
            Size size2 = this.e;
            if (size2 != null ? size2.equals(size) : size == null) {
                va0 va0 = s80.f;
                va0 va02 = this.f;
                if (va02 != null ? va02.equals(va0) : va0 == null) {
                    List list = s80.g;
                    List list2 = this.g;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                    } else if (list2.equals(list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i = 0;
        Size size = this.e;
        int hashCode2 = (hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        va0 va0 = this.f;
        int hashCode3 = (hashCode2 ^ (va0 == null ? 0 : va0.hashCode())) * 1000003;
        List list = this.g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseInfo{useCaseId=");
        sb.append(this.a);
        sb.append(", useCaseType=");
        sb.append(this.b);
        sb.append(", sessionConfig=");
        sb.append(this.c);
        sb.append(", useCaseConfig=");
        sb.append(this.d);
        sb.append(", surfaceResolution=");
        sb.append(this.e);
        sb.append(", streamSpec=");
        sb.append(this.f);
        sb.append(", captureTypes=");
        return hr1.i(sb, this.g, "}");
    }
}
