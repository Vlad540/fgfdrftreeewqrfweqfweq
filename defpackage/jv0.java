package defpackage;

import java.io.File;

/* renamed from: jv0  reason: default package */
public final class jv0 {
    public final File a;
    public final long b;
    public final long c;
    public final xv0 d;

    public jv0(File file, xv0 xv0) {
        this.a = file;
        this.b = file.length();
        this.c = file.lastModified();
        this.d = xv0;
    }

    public final String toString() {
        return "CacheEntry{file=" + this.a + ", length=" + this.b + ", lastModified=" + this.c + ", cacheType=" + this.d + '}';
    }
}
