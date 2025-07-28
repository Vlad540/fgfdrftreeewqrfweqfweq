package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: od3  reason: default package */
public final class od3 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Serializable e;

    public od3(String str, String str2, boolean z, boolean z2) {
        this.a = 1;
        this.d = str;
        this.b = z;
        this.c = z2;
        this.e = str2;
    }

    public pd3 a() {
        return new pd3(this.b, this.c, (String[]) this.d, (String[]) this.e);
    }

    public void b(ky2... ky2Arr) {
        if (this.b) {
            ArrayList arrayList = new ArrayList(ky2Arr.length);
            for (ky2 ky2 : ky2Arr) {
                arrayList.add(ky2.a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                c((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public void c(String... strArr) {
        if (this.b) {
            if (!(strArr.length == 0)) {
                Object clone = strArr.clone();
                if (clone != null) {
                    this.d = (String[]) clone;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public void d() {
        if (this.b) {
            this.c = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
    }

    public void e(jle... jleArr) {
        if (this.b) {
            ArrayList arrayList = new ArrayList(jleArr.length);
            for (jle jle : jleArr) {
                arrayList.add(jle.a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                f((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.String[], java.io.Serializable] */
    public void f(String... strArr) {
        if (this.b) {
            if (!(strArr.length == 0)) {
                Object clone = strArr.clone();
                if (clone != null) {
                    this.e = (String[]) clone;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder m = hr1.m("CodecInfo{type=", (this.b ? "Video" : "Audio").concat(this.c ? "Decoder" : "Encoder"), ", configurationFormat=");
                m.append((String) this.d);
                m.append(", name=");
                return me4.l(m, (String) this.e, '}');
            default:
                return super.toString();
        }
    }

    public od3(int i) {
        this.a = i;
        switch (i) {
            case 2:
                return;
            default:
                this.b = true;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.String[], java.io.Serializable] */
    public od3(pd3 pd3) {
        this.a = 0;
        this.b = pd3.a;
        this.d = pd3.c;
        this.e = pd3.d;
        this.c = pd3.b;
    }
}
