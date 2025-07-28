package defpackage;

/* renamed from: un3  reason: default package */
public final class un3 {
    public final int a;
    public final boolean b;

    public un3(int i) {
        this.a = i;
        this.b = i == 2 || i == 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r4 = ((defpackage.un3) r4).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof defpackage.un3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            un3 r4 = (defpackage.un3) r4
            int r4 = r4.a
            int r3 = r3.a
            if (r3 == r4) goto L_0x0013
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (hr1.t(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContactsBannerListItem(bannerType=");
        switch (this.a) {
            case 1:
                str = "PERMIT_PHONE_BOOK_CONTACTS_BIG";
                break;
            case 2:
                str = "PERMIT_PHONE_BOOK_CONTACTS_COMPACT";
                break;
            case 3:
                str = "PERMIT_PHONE_BOOK_CONTACTS_MIDDLE";
                break;
            case 4:
                str = "PERMIT_NOTIFICATIONS_CONTACTS_MIDDLE";
                break;
            case 5:
                str = "PERMIT_NOTIFICATIONS_CONTACTS_COMPACT";
                break;
            case 6:
                str = "PERMIT_MIC_MIDDLE";
                break;
            case 7:
                str = "PERMIT_MIC_COMPACT";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", isCloseable=false)");
        return sb.toString();
    }
}
