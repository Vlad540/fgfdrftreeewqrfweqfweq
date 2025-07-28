package defpackage;

/* renamed from: zq4  reason: default package */
public final class zq4 {
    public static final zq4 c = new zq4(0, 0);
    public static final zq4 d = new zq4(1, 8);
    public static final zq4 e = new zq4(3, 10);
    public static final zq4 f = new zq4(4, 10);
    public static final zq4 g = new zq4(5, 10);
    public static final zq4 h = new zq4(6, 10);
    public static final zq4 i = new zq4(6, 8);
    public final int a;
    public final int b;

    public zq4(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public final boolean a() {
        return b() && this.a != 1 && this.b == 10;
    }

    public final boolean b() {
        int i2 = this.a;
        return (i2 == 0 || i2 == 2 || this.b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zq4)) {
            return false;
        }
        zq4 zq4 = (zq4) obj;
        return this.a == zq4.a && this.b == zq4.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return wn6.j(sb, this.b, "}");
    }
}
