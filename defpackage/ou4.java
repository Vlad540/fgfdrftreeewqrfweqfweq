package defpackage;

/* renamed from: ou4  reason: default package */
public final class ou4 {
    public final mv4 a;

    public ou4(mv4 mv4) {
        this.a = mv4;
    }

    public final nv4 a(CharSequence charSequence, int i, int i2) {
        int i3;
        mv4 mv4 = this.a;
        if (mv4 != null) {
            int i4 = i;
            int i5 = 0;
            int i6 = 0;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = 0;
            while (i5 >= 0) {
                long[] jArr = (long[]) mv4.b;
                if (i5 >= jArr.length || i4 >= i2) {
                    break;
                }
                char charAt = charSequence.charAt(i4);
                int i11 = i5 + 1;
                mv4 mv42 = mv4;
                int i12 = (((int) jArr[i5]) + i11) - 1;
                while (true) {
                    if (i11 > i12) {
                        i3 = -(i11 + 1);
                        break;
                    }
                    i3 = ((i12 - i11) >>> 1) + i11;
                    char c = (char) ((int) (jArr[i3] & 65535));
                    if (c >= charAt) {
                        if (c <= charAt) {
                            break;
                        }
                        i12 = i3 - 1;
                    } else {
                        i11 = i3 + 1;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                i6++;
                long j = jArr[i3];
                int i13 = (int) ((j >>> 48) & 65535);
                if (i13 == 65535) {
                    i13 = -1;
                }
                int i14 = (int) ((j >>> 40) & 255);
                if (i14 == 255) {
                    i14 = -1;
                }
                int i15 = (int) ((j >>> 32) & 255);
                if (i15 == 255) {
                    i15 = -1;
                }
                int i16 = (int) ((j >>> 24) & 255);
                if (i16 == 255) {
                    i16 = -1;
                }
                if (!(i14 == -1 || i15 == -1 || i16 == -1)) {
                    i10 += i6;
                    i9 = i16;
                    i7 = i14;
                    i8 = i15;
                    i6 = 0;
                }
                i4++;
                mv4 = mv42;
                i5 = i13;
            }
            if (!(i7 == -1 || i8 == -1 || i9 == -1)) {
                return new nv4(i7, i8, i9, i10, 0);
            }
        }
        return null;
    }
}
