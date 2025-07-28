package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: q94  reason: default package */
public final /* synthetic */ class q94 implements FileFilter {
    public final /* synthetic */ String a;

    public /* synthetic */ q94(String str) {
        this.a = str;
    }

    public final boolean accept(File file) {
        String name = file.getName();
        if (name == null || name.length() == 0) {
            return false;
        }
        return p0e.Q(name, this.a, false);
    }
}
