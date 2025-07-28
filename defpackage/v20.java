package defpackage;

import java.util.Arrays;

/* renamed from: v20  reason: default package */
public final class v20 {
    public static final v20 c = new v20(8, new int[]{2});
    public static final v20 d = new v20(8, new int[]{2, 5, 6});
    public static final int[] e = {5, 6, 18, 17, 14, 7, 8};
    public final int[] a;
    public final int b;

    public v20(int i, int[] iArr) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20 = (v20) obj;
        return Arrays.equals(this.a, v20.a) && this.b == v20.b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(me4.e(67, arrays));
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(this.b);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
