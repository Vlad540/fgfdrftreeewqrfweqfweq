package defpackage;

/* renamed from: wu5  reason: default package */
public final class wu5 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public wu5(int i, int i2, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = 30;
        this.e = -1;
        this.f = true;
        this.g = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wu5.class != obj.getClass()) {
            return false;
        }
        wu5 wu5 = (wu5) obj;
        if (this.a != wu5.a || this.c != wu5.c || this.d != wu5.d || this.e != wu5.e || this.f != wu5.f || this.g != wu5.g) {
            return false;
        }
        String str = wu5.b;
        String str2 = this.b;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        return ((((((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 29791) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }

    public final String toString() {
        return "Format{itag=" + this.a + ", ext='" + this.b + "', height=" + this.c + ", fps=" + this.d + ", vCodec=null, aCodec=null, audioBitrate=" + this.e + ", isDashContainer=" + this.f + ", isHlsContent=" + this.g + '}';
    }

    public wu5(int i, String str, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = -1;
        this.d = 30;
        this.e = i2;
        this.f = true;
        this.g = false;
    }

    public wu5(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = 30;
        this.e = i3;
        this.f = false;
        this.g = false;
    }

    public wu5(int i, int i2, int i3) {
        this.a = i;
        this.b = "mp4";
        this.c = i2;
        this.d = 30;
        this.e = i3;
        this.f = false;
        this.g = true;
    }

    public wu5(int i, int i2, Object obj, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.e = -1;
        this.d = 60;
        this.f = true;
        this.g = false;
    }
}
