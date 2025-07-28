package defpackage;

import java.util.ArrayList;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: a84  reason: default package */
public final class a84 implements xh6 {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public s1e b;
    public boolean c;

    public static void a(ArrayList arrayList, int i) {
        if (xie.v(i, 0, 7, d) != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: ny5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: v1e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: v1e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: l94} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: yw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: m1e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: ny5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: ny5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: ny5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: ny5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: ny5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: ny5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: ny5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: ny5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: ny5} */
    /* JADX WARNING: type inference failed for: r10v10, types: [ro0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.qt0 b(int r8, defpackage.xu5 r9, boolean r10, java.util.ArrayList r11, defpackage.bpe r12) {
        /*
            r7 = this;
            java.lang.String r0 = r9.m
            boolean r1 = defpackage.c49.j(r0)
            if (r1 == 0) goto L_0x001b
            boolean r10 = r7.c
            if (r10 != 0) goto L_0x000e
            r7 = 0
            return r7
        L_0x000e:
            m1e r10 = new m1e
            s1e r11 = r7.b
            u1e r11 = r11.d(r9)
            r10.<init>(r11, r9)
            goto L_0x0091
        L_0x001b:
            r1 = 1
            if (r0 != 0) goto L_0x001f
            goto L_0x0050
        L_0x001f:
            java.lang.String r2 = "video/webm"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "audio/webm"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "application/webm"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "video/x-matroska"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "audio/x-matroska"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "application/x-matroska"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x0050
            goto L_0x0085
        L_0x0050:
            java.lang.String r2 = "image/jpeg"
            boolean r2 = java.util.Objects.equals(r0, r2)
            if (r2 == 0) goto L_0x005e
            l94 r10 = new l94
            r10.<init>((int) r1)
            goto L_0x0091
        L_0x005e:
            java.lang.String r1 = "image/png"
            boolean r1 = java.util.Objects.equals(r0, r1)
            if (r1 == 0) goto L_0x006d
            ro0 r10 = new ro0
            r11 = 1
            r10.<init>(r11)
            goto L_0x0091
        L_0x006d:
            if (r10 == 0) goto L_0x0071
            r10 = 4
            goto L_0x0072
        L_0x0071:
            r10 = 0
        L_0x0072:
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x0078
            r10 = r10 | 32
        L_0x0078:
            r3 = r10
            ny5 r10 = new ny5
            s1e r2 = r7.b
            r4 = 0
            r1 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0091
        L_0x0085:
            boolean r10 = r7.c
            if (r10 != 0) goto L_0x008a
            r1 = 3
        L_0x008a:
            yw7 r10 = new yw7
            s1e r11 = r7.b
            r10.<init>(r1, r11)
        L_0x0091:
            boolean r11 = r7.c
            if (r11 == 0) goto L_0x00b3
            boolean r11 = defpackage.c49.j(r0)
            if (r11 != 0) goto L_0x00b3
            e75 r11 = r10.m()
            boolean r11 = r11 instanceof defpackage.ny5
            if (r11 != 0) goto L_0x00b3
            e75 r11 = r10.m()
            boolean r11 = r11 instanceof defpackage.yw7
            if (r11 != 0) goto L_0x00b3
            v1e r11 = new v1e
            s1e r7 = r7.b
            r11.<init>(r10, r7)
            r10 = r11
        L_0x00b3:
            qt0 r7 = new qt0
            r7.<init>(r10, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a84.b(int, xu5, boolean, java.util.ArrayList, bpe):qt0");
    }

    public xu5 c(xu5 xu5) {
        String str;
        if (!this.c || !this.b.b(xu5)) {
            return xu5;
        }
        uu5 a = xu5.a();
        a.m = c49.l("application/x-media3-cues");
        a.G = this.b.e(xu5);
        StringBuilder sb = new StringBuilder();
        sb.append(xu5.n);
        String str2 = xu5.j;
        if (str2 != null) {
            str = " " + str2;
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        a.i = sb.toString();
        a.r = Long.MAX_VALUE;
        return a.a();
    }
}
