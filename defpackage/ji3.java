package defpackage;

import java.util.Objects;

/* renamed from: ji3  reason: default package */
public final class ji3 {
    public final String a;

    public ji3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ji3) {
            return Objects.equals(this.a, ((ji3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return wn6.l(new StringBuilder("MenuButton{text='"), this.a, "'}");
    }
}
