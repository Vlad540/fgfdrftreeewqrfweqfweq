package defpackage;

import android.content.Context;

/* renamed from: gld  reason: default package */
public final class gld extends hld {
    /* JADX WARNING: type inference failed for: r4v1, types: [hld, gld] */
    public static gld a(String str, Context context, ild[] ildArr) {
        StringBuilder m = hr1.m("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < ildArr.length; i++) {
            m.append("\n\t\tSoSource ");
            m.append(i);
            m.append(": ");
            m.append(ildArr[i].toString());
        }
        if (context != null) {
            m.append("\n\tNative lib dir: ");
            m.append(context.getApplicationInfo().nativeLibraryDir);
            m.append("\n");
        }
        return new hld(str, m.toString());
    }
}
