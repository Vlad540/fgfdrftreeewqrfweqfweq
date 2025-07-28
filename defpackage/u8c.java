package defpackage;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: u8c  reason: default package */
public final class u8c {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public u8c(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = hashSet;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(u8c u8c) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(u8c.a).setLabel(u8c.b).setChoices(u8c.c).setAllowFreeFormInput(u8c.d).addExtras(u8c.f);
        Set<String> set = u8c.g;
        if (set != null) {
            for (String d2 : set) {
                s8c.d(addExtras, d2, true);
            }
        }
        t8c.b(addExtras, u8c.e);
        return addExtras.build();
    }
}
