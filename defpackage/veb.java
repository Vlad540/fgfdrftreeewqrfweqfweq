package defpackage;

import android.content.Intent;

/* renamed from: veb  reason: default package */
public final class veb extends cfb {
    public final Intent a;

    public veb(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof veb) && hhd.f(this.a, ((veb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.a + ")";
    }
}
