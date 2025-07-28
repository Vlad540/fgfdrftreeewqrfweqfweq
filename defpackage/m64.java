package defpackage;

import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: m64  reason: default package */
public final class m64 implements bi4 {
    public static final long f = TimeUnit.MINUTES.toMillis(30);
    public static final /* synthetic */ int g = 0;
    public final File a;
    public final boolean b;
    public final File c;
    public final gk9 d;
    public final om3 e;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r5.getClass();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m64(java.io.File r3, int r4, defpackage.gk9 r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.a = r3
            r0 = 0
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x001d }
            java.lang.String r3 = r3.getCanonicalPath()     // Catch:{ IOException -> 0x0019 }
            boolean r0 = r3.contains(r1)     // Catch:{ IOException -> 0x0019 }
            goto L_0x0020
        L_0x0019:
            r5.getClass()     // Catch:{ Exception -> 0x001d }
            goto L_0x0020
        L_0x001d:
            r5.getClass()
        L_0x0020:
            r2.b = r0
            java.io.File r3 = new java.io.File
            java.io.File r0 = r2.a
            java.lang.String r1 = "v2.ols100."
            java.lang.String r4 = wn6.h(r4, r1)
            r3.<init>(r0, r4)
            r2.c = r3
            r2.d = r5
            java.io.File r4 = r2.a
            boolean r5 = r4.exists()
            if (r5 != 0) goto L_0x003c
            goto L_0x0045
        L_0x003c:
            boolean r5 = r3.exists()
            if (r5 != 0) goto L_0x0051
            defpackage.gwf.l(r4)
        L_0x0045:
            defpackage.d8.w(r3)     // Catch:{ FileUtils$CreateDirectoryException -> 0x0049 }
            goto L_0x0051
        L_0x0049:
            java.util.Objects.toString(r3)
            gk9 r3 = r2.d
            r3.getClass()
        L_0x0051:
            om3 r3 = om3.X
            r2.e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m64.<init>(java.io.File, int, gk9):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.k64 g(defpackage.m64 r8, java.io.File r9) {
        /*
            r8.getClass()
            java.lang.String r0 = r9.getName()
            r1 = 46
            int r2 = r0.lastIndexOf(r1)
            r3 = 0
            if (r2 > 0) goto L_0x0012
        L_0x0010:
            r1 = r3
            goto L_0x0049
        L_0x0012:
            java.lang.String r4 = r0.substring(r2)
            java.lang.String r5 = ".cnt"
            boolean r6 = r5.equals(r4)
            java.lang.String r7 = ".tmp"
            if (r6 == 0) goto L_0x0021
            goto L_0x002a
        L_0x0021:
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0029
            r5 = r7
            goto L_0x002a
        L_0x0029:
            r5 = r3
        L_0x002a:
            if (r5 != 0) goto L_0x002d
            goto L_0x0010
        L_0x002d:
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r2)
            boolean r2 = r5.equals(r7)
            if (r2 == 0) goto L_0x0043
            int r1 = r0.lastIndexOf(r1)
            if (r1 > 0) goto L_0x003f
            goto L_0x0010
        L_0x003f:
            java.lang.String r0 = r0.substring(r4, r1)
        L_0x0043:
            k64 r1 = new k64
            r2 = 0
            r1.<init>(r5, r0, r2)
        L_0x0049:
            if (r1 != 0) goto L_0x004c
            goto L_0x0062
        L_0x004c:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r1.c
            java.lang.String r8 = r8.i(r2)
            r0.<init>(r8)
            java.io.File r8 = r9.getParentFile()
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0062
            r3 = r1
        L_0x0062:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m64.g(m64, java.io.File):k64");
    }

    public final bd5 a(Object obj, String str) {
        File h = h(str);
        if (!h.exists()) {
            return null;
        }
        this.e.getClass();
        h.setLastModified(System.currentTimeMillis());
        return new bd5(h);
    }

    public final void b() {
        gwf.U(this.a, new xp0((Object) this));
    }

    public final long c(j64 j64) {
        File file = j64.b.a;
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gf5, java.lang.Object, afc] */
    public final Collection d() {
        ? obj = new Object();
        obj.b = this;
        obj.a = new ArrayList();
        gwf.U(this.c, obj);
        return Collections.unmodifiableList((ArrayList) obj.a);
    }

    public final void e() {
        File[] listFiles = this.a.listFiles();
        if (listFiles != null) {
            for (File l : listFiles) {
                gwf.l(l);
            }
        }
    }

    public final jg8 f(Object obj, String str) {
        File file = new File(i(str));
        boolean exists = file.exists();
        gk9 gk9 = this.d;
        if (!exists) {
            try {
                d8.w(file);
            } catch (FileUtils$CreateDirectoryException e2) {
                gk9.getClass();
                throw e2;
            }
        }
        try {
            return new jg8(this, str, File.createTempFile(str.concat("."), ".tmp", file));
        } catch (IOException e3) {
            gk9.getClass();
            throw e3;
        }
    }

    public final File h(String str) {
        StringBuilder l = hr1.l(i(str));
        l.append(File.separator);
        l.append(str);
        l.append(".cnt");
        return new File(l.toString());
    }

    public final String i(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        return wn6.l(sb, File.separator, valueOf);
    }

    public final boolean isExternal() {
        return this.b;
    }
}
