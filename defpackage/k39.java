package defpackage;

import java.util.logging.Logger;

/* renamed from: k39  reason: default package */
public final class k39 {
    public static final Logger a = Logger.getLogger(k39.class.getName());

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b A[SYNTHETIC, Splitter:B:31:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066 A[SYNTHETIC, Splitter:B:35:0x0066] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(java.io.InputStream r8) {
        /*
            java.util.logging.Logger r0 = a
            java.lang.String r1 = "Error closing input stream (ignored)"
            if (r8 != 0) goto L_0x000b
            java.util.List r8 = java.util.Collections.emptyList()
            return r8
        L_0x000b:
            r2 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r3.<init>(r8)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0046 }
            r2.<init>()     // Catch:{ IOException -> 0x0046 }
            int r4 = r3.readInt()     // Catch:{ IOException -> 0x0046 }
            r5 = 0
        L_0x001b:
            if (r5 >= r4) goto L_0x002b
            apa r6 = new apa     // Catch:{ IOException -> 0x0046 }
            r6.<init>()     // Catch:{ IOException -> 0x0046 }
            r6.readExternal(r3)     // Catch:{ IOException -> 0x0046 }
            r2.add(r6)     // Catch:{ IOException -> 0x0046 }
            int r5 = r5 + 1
            goto L_0x001b
        L_0x002b:
            boolean r4 = r2.isEmpty()     // Catch:{ IOException -> 0x0046 }
            if (r4 != 0) goto L_0x003c
            r3.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r0.log(r3, r1, r8)
        L_0x003b:
            return r2
        L_0x003c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0046 }
            java.lang.String r4 = "Empty metadata"
            r2.<init>(r4)     // Catch:{ IOException -> 0x0046 }
            throw r2     // Catch:{ IOException -> 0x0046 }
        L_0x0044:
            r2 = move-exception
            goto L_0x0059
        L_0x0046:
            r2 = move-exception
            goto L_0x0051
        L_0x0048:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x0059
        L_0x004d:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
        L_0x0051:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "Unable to parse metadata file"
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0044 }
            throw r4     // Catch:{ all -> 0x0044 }
        L_0x0059:
            if (r3 == 0) goto L_0x0066
            r3.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x0070
        L_0x005f:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r0.log(r3, r1, r8)
            goto L_0x0070
        L_0x0066:
            r8.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x0070
        L_0x006a:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r0.log(r3, r1, r8)
        L_0x0070:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k39.a(java.io.InputStream):java.util.List");
    }
}
