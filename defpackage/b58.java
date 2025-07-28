package defpackage;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: b58  reason: default package */
public abstract class b58 {
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
