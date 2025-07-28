package defpackage;

import java.util.concurrent.Executor;

/* renamed from: jk7  reason: default package */
public abstract class jk7 implements y4b {
    public final Executor a;
    public final qe4 b;

    public jk7(Executor executor, qe4 qe4) {
        this.a = executor;
        this.b = qe4;
    }

    public final void a(ah0 ah0, z4b z4b) {
        ji0 ji0 = (ji0) z4b;
        c5b c5b = ji0.c;
        ji0.h("local", "fetch");
        ik7 ik7 = new ik7(this, ah0, c5b, z4b, e(), ji0.a, c5b, z4b);
        ji0.a(new fk7(ik7, 1));
        this.a.execute(ik7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        defpackage.g13.b(r4);
        defpackage.e13.S((defpackage.e13) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x0005, B:4:0x0011, B:15:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ax4 c(java.io.InputStream r4, int r5) {
        /*
            r3 = this;
            qe4 r3 = r3.b
            r0 = 0
            if (r5 > 0) goto L_0x002c
            r3.getClass()     // Catch:{ all -> 0x0025 }
            kl8 r5 = new kl8     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r3.b     // Catch:{ all -> 0x0025 }
            il8 r1 = (defpackage.il8) r1     // Catch:{ all -> 0x0025 }
            r5.<init>(r1)     // Catch:{ all -> 0x0025 }
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x0027 }
            og0 r3 = (defpackage.og0) r3     // Catch:{ all -> 0x0027 }
            r3.j(r4, r5)     // Catch:{ all -> 0x0027 }
            jl8 r3 = r5.n()     // Catch:{ all -> 0x0027 }
            r5.close()     // Catch:{ all -> 0x0025 }
            t54 r3 = defpackage.e13.o0(r3)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            r0 = r3
            goto L_0x004b
        L_0x0025:
            r3 = move-exception
            goto L_0x005c
        L_0x0027:
            r3 = move-exception
            r5.close()     // Catch:{ all -> 0x0025 }
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x002c:
            r3.getClass()     // Catch:{ all -> 0x0025 }
            kl8 r1 = new kl8     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = r3.b     // Catch:{ all -> 0x0025 }
            il8 r2 = (defpackage.il8) r2     // Catch:{ all -> 0x0025 }
            r1.<init>(r2, r5)     // Catch:{ all -> 0x0025 }
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x0057 }
            og0 r3 = (defpackage.og0) r3     // Catch:{ all -> 0x0057 }
            r3.j(r4, r1)     // Catch:{ all -> 0x0057 }
            jl8 r3 = r1.n()     // Catch:{ all -> 0x0057 }
            r1.close()     // Catch:{ all -> 0x0025 }
            t54 r3 = defpackage.e13.o0(r3)     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x004b:
            ax4 r3 = new ax4     // Catch:{ all -> 0x0025 }
            r3.<init>(r0)     // Catch:{ all -> 0x0025 }
            defpackage.g13.b(r4)
            defpackage.e13.S(r0)
            return r3
        L_0x0057:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x0025 }
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x005c:
            defpackage.g13.b(r4)
            defpackage.e13.S(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk7.c(java.io.InputStream, int):ax4");
    }

    public abstract ax4 d(tr6 tr6);

    public abstract String e();
}
