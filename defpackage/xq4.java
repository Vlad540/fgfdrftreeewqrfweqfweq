package defpackage;

import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* renamed from: xq4  reason: default package */
public final class xq4 implements bi4 {
    public final int a;
    public final o3e b;
    public final String c;
    public final gk9 d;
    public volatile b2b e = new b2b((Object) null, 16, (Object) null);

    public xq4(int i, o3e o3e, String str, gk9 gk9) {
        this.a = i;
        this.d = gk9;
        this.b = o3e;
        this.c = str;
    }

    public final bd5 a(Object obj, String str) {
        return h().a(obj, str);
    }

    public final void b() {
        try {
            h().b();
        } catch (IOException e2) {
            if (m75.a.i(6)) {
                m75.a.e(xq4.class.getSimpleName(), "purgeUnexpectedResources", e2);
            }
        }
    }

    public final long c(j64 j64) {
        return h().c(j64);
    }

    public final Collection d() {
        return h().d();
    }

    public final void e() {
        h().e();
    }

    public final jg8 f(Object obj, String str) {
        return h().f(obj, str);
    }

    public final void g() {
        File file = new File((File) this.b.get(), this.c);
        try {
            d8.w(file);
            String absolutePath = file.getAbsolutePath();
            if (m75.a.i(3)) {
                eo7 eo7 = m75.a;
                String simpleName = xq4.class.getSimpleName();
                eo7.d(simpleName, "Created cache directory " + absolutePath);
            }
            this.e = new b2b((Object) file, 16, (Object) new m64(file, this.a, this.d));
        } catch (FileUtils$CreateDirectoryException e2) {
            this.d.getClass();
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[Catch:{ all -> 0x0038 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.bi4 h() {
        /*
            r2 = this;
            monitor-enter(r2)
            b2b r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r0.b     // Catch:{ all -> 0x0038 }
            bi4 r1 = (defpackage.bi4) r1     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0018
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x0038 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 == 0) goto L_0x003a
            b2b r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0038 }
            bi4 r0 = (defpackage.bi4) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0034
            b2b r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x0038 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0034
            b2b r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x0038 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0038 }
            defpackage.gwf.l(r0)     // Catch:{ all -> 0x0038 }
        L_0x0034:
            r2.g()     // Catch:{ all -> 0x0038 }
            goto L_0x003a
        L_0x0038:
            r0 = move-exception
            goto L_0x0045
        L_0x003a:
            b2b r0 = r2.e     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0038 }
            bi4 r0 = (defpackage.bi4) r0     // Catch:{ all -> 0x0038 }
            r0.getClass()     // Catch:{ all -> 0x0038 }
            monitor-exit(r2)
            return r0
        L_0x0045:
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq4.h():bi4");
    }

    public final boolean isExternal() {
        try {
            return h().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }
}
