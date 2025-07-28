package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import java.io.File;

/* renamed from: t5c  reason: default package */
public final /* synthetic */ class t5c {
    public final /* synthetic */ re5 a;

    public /* synthetic */ t5c(re5 re5) {
        this.a = re5;
    }

    public final MediaMuxer a(int i, jv1 jv1) {
        Uri uri = Uri.EMPTY;
        re5 re5 = this.a;
        if (re5 instanceof re5) {
            File file = re5.b.c;
            File parentFile = file.getParentFile();
            if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
                file.getAbsolutePath();
            }
            MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
            ((y5c) jv1.b).J = Uri.fromFile(file);
            return mediaMuxer;
        }
        throw new AssertionError("Invalid output options type: ".concat(re5.getClass().getSimpleName()));
    }
}
