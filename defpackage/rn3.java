package defpackage;

import androidx.fragment.app.a;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import ru.ok.messages.contacts.profile.FrgContactAvatar;

/* renamed from: rn3  reason: default package */
public final class rn3 extends fi5 {
    public final List i;
    public final boolean j;
    public int k;

    public rn3(vx5 vx5, ArrayList arrayList, boolean z, int i2) {
        super(vx5);
        this.i = arrayList;
        this.j = z;
        this.k = i2;
    }

    public final int b() {
        List list = this.i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int c(a aVar) {
        if (!(aVar instanceof FrgContactAvatar)) {
            return -2;
        }
        FrgContactAvatar frgContactAvatar = (FrgContactAvatar) aVar;
        int i2 = 0;
        while (true) {
            List list = this.i;
            if (i2 >= list.size()) {
                return -2;
            }
            if (((List) ((AbstractMap.SimpleEntry) list.get(i2)).getKey()).equals(frgContactAvatar.G1)) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r7 != 1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.a g(int r7) {
        /*
            r6 = this;
            java.util.List r0 = r6.i
            java.lang.Object r1 = r0.get(r7)
            java.util.AbstractMap$SimpleEntry r1 = (java.util.AbstractMap.SimpleEntry) r1
            int r2 = r6.k
            if (r2 == r7) goto L_0x001a
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L_0x001a
            int r7 = r0.size()
            r0 = 1
            if (r7 == r0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            java.lang.Object r7 = r1.getKey()
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r1 = r1.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            ru.ok.messages.contacts.profile.FrgContactAvatar r2 = new ru.ok.messages.contacts.profile.FrgContactAvatar
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r7)
            java.lang.String r7 = "ru.ok.tamtam.extra.AVATAR_URL"
            r3.putStringArrayList(r7, r4)
            java.lang.String r7 = "ru.ok.tamtam.extra.AVATAR_ID"
            long r4 = r1.longValue()
            r3.putLong(r7, r4)
            java.lang.String r7 = "ru.ok.tamtam.extra.DELETE_OPTION"
            boolean r6 = r6.j
            r3.putBoolean(r7, r6)
            java.lang.String r6 = "ru.ok.tamtam.extra.MAKE_MAIN_OPTION"
            r3.putBoolean(r6, r0)
            r2.Y0(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn3.g(int):androidx.fragment.app.a");
    }

    public final String h(int i2) {
        gw2 gw2 = new gw2(26, new j67(3));
        StringBuilder sb = new StringBuilder();
        o23.a0((Iterable) ((AbstractMap.SimpleEntry) this.i.get(i2)).getKey(), sb, ",", "[", "]", -1, "", gw2);
        return sb.toString();
    }
}
