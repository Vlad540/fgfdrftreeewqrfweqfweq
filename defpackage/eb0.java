package defpackage;

import androidx.camera.core.ImageCaptureException;

/* renamed from: eb0  reason: default package */
public final class eb0 {
    public final int a;
    public final ImageCaptureException b;

    public eb0(int i, ImageCaptureException imageCaptureException) {
        this.a = i;
        this.b = imageCaptureException;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eb0)) {
            return false;
        }
        eb0 eb0 = (eb0) obj;
        return this.a == eb0.a && this.b.equals(eb0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}
