package defpackage;

import android.webkit.WebChromeClient;

/* renamed from: slf  reason: default package */
public final class slf implements wlf {
    public final WebChromeClient.FileChooserParams a;

    public slf(WebChromeClient.FileChooserParams fileChooserParams) {
        this.a = fileChooserParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slf) && hhd.f(this.a, ((slf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowFileChooser(params=" + this.a + ")";
    }
}
