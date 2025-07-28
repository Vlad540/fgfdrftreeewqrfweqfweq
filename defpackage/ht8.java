package defpackage;

/* renamed from: ht8  reason: default package */
public final class ht8 {
    public final int a;

    public /* synthetic */ ht8(int i) {
        this.a = i;
    }

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public static final boolean b(int i) {
        return (i & 8192) != 0;
    }

    public static final boolean c(int i) {
        return (i & 1) != 0;
    }

    public static final boolean d(int i) {
        return ((i & 2) == 0 && (i & 4) == 0 && (i & 32) == 0 && (i & 8) == 0 && (65536 & i) == 0 && !b(i)) ? false : true;
    }

    public static String e(int i) {
        StringBuilder sb = new StringBuilder("MessageViewType(bubbleType=");
        sb.append(new ir0(2080374784 & i));
        if (c(i)) {
            sb.append(',');
            if ((-2080374786 & i) == 0) {
                sb.append("text_only");
            } else {
                sb.append("text");
            }
        }
        if ((i & 2) != 0) {
            sb.append(",photo");
        }
        if ((i & 4) != 0) {
            sb.append(",video");
        }
        if ((i & 8) != 0) {
            sb.append(",voice");
        }
        if ((i & 16) != 0) {
            sb.append(",contact");
        }
        if ((i & 32) != 0) {
            sb.append(",file");
        }
        if ((i & 64) != 0) {
            sb.append(",geo");
        }
        if ((i & 128) != 0) {
            sb.append(",sticker");
        }
        if ((i & 256) != 0) {
            sb.append(",call");
        }
        if ((i & 512) != 0) {
            sb.append(",share");
        }
        if ((i & 4096) != 0) {
            sb.append(",big_emoji");
        }
        if (a(i, 0)) {
            sb.append(",control");
        }
        if ((i & 1024) != 0) {
            sb.append(",reply");
        }
        if ((i & 2048) != 0) {
            sb.append(",forward");
        }
        if (b(i)) {
            sb.append(",collage");
        }
        if ((i & 16384) != 0) {
            sb.append(",lottie_sticker");
        }
        if ((i & 32768) != 0) {
            sb.append(",webm_sticker");
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = ((defpackage.ht8) r3).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.ht8
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0010
        L_0x0006:
            ht8 r3 = (defpackage.ht8) r3
            int r3 = r3.a
            int r2 = r2.a
            if (r2 == r3) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
