package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/* renamed from: w1d  reason: default package */
public final class w1d {
    public static final w1d b = new w1d(new HashSet());
    public static final String c = Integer.toString(0, 36);
    public final gt6 a;

    static {
        int i = oze.a;
    }

    public w1d(Collection collection) {
        this.a = gt6.j(collection);
    }

    public static w1d b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            ez3.j0("Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(v1d.a((Bundle) parcelableArrayList.get(i)));
        }
        return new w1d(hashSet);
    }

    public final boolean a(int i) {
        oyb.c("Use contains(Command) for custom command", i != 0);
        for (v1d v1d : this.a) {
            if (v1d.a == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1d)) {
            return false;
        }
        return this.a.equals(((w1d) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }
}
