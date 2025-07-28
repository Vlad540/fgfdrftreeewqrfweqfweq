package defpackage;

import java.util.zip.ZipEntry;

/* renamed from: c75  reason: default package */
public final class c75 extends ibe implements Comparable {
    public final int X;
    public final ZipEntry o;

    public c75(String str, ZipEntry zipEntry, int i) {
        super(str, 12, String.valueOf(zipEntry.getCrc()));
        this.o = zipEntry;
        this.X = i;
    }

    public final int compareTo(Object obj) {
        return ((String) this.b).compareTo((String) ((c75) obj).b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c75.class != obj.getClass()) {
            return false;
        }
        c75 c75 = (c75) obj;
        return this.o.equals(c75.o) && this.X == c75.X;
    }

    public final int hashCode() {
        return this.o.hashCode() + (this.X * 31);
    }
}
