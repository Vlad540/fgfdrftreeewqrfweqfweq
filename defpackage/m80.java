package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: m80  reason: default package */
public final class m80 {
    public static final List e = Collections.unmodifiableList(Arrays.asList(new Integer[]{48000, 44100, 22050, 11025, 8000, 4800}));
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public m80(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        int i = this.c;
        boolean z = i > 0;
        e07.j("Invalid channel count: " + i, z);
        int i2 = this.d;
        if (i2 == 2) {
            return i * 2;
        }
        if (i2 == 3) {
            return i;
        }
        if (i2 != 4) {
            if (i2 == 21) {
                return i * 3;
            }
            if (i2 != 22) {
                throw new IllegalArgumentException(wn6.h(i2, "Invalid audio encoding: "));
            }
        }
        return i * 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m80)) {
            return false;
        }
        m80 m80 = (m80) obj;
        return this.a == m80.a && this.b == m80.b && this.c == m80.c && this.d == m80.d;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(this.a);
        sb.append(", sampleRate=");
        sb.append(this.b);
        sb.append(", channelCount=");
        sb.append(this.c);
        sb.append(", audioFormat=");
        return wn6.j(sb, this.d, "}");
    }
}
