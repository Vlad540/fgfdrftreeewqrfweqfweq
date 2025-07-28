package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.http.protocol.HTTP;

/* renamed from: jm6  reason: default package */
public final class jm6 {
    public ArrayList a = new ArrayList();

    public void a(String str, String str2, be5 be5) {
        this.a.add(new mm6(str, str2, (String) be5.b, be5));
    }

    public void b(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null) {
                    if (this.a == null) {
                        this.a = new ArrayList();
                    }
                    if (!this.a.contains(str)) {
                        this.a.add(str);
                    }
                } else {
                    throw new IllegalArgumentException("category must not be null");
                }
            }
        }
    }

    public void c(String str, String str2) {
        this.a.add(new mm6(str, (String) null, (String) null, mk9.h(HTTP.PLAIN_TEXT_TYPE, str2)));
    }

    public ws4 d() {
        kxb.a.getClass();
        return new ws4(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(kxb.b.h())}, 1)), o23.s0(this.a));
    }

    public qb8 e() {
        if (this.a == null) {
            return qb8.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new qb8(this.a, bundle);
    }
}
